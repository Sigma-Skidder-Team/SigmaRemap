package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.item.TieredItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.DebugPacketSender;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public abstract class AbstractPiglinEntity extends MonsterEntity {
   public static final DataParameter<Boolean> field5750 = EntityDataManager.<Boolean>createKey(AbstractPiglinEntity.class, DataSerializers.BOOLEAN);
   public int field5751 = 0;

   public AbstractPiglinEntity(EntityType<? extends AbstractPiglinEntity> var1, World var2) {
      super(var1, var2);
      this.method4281(true);
      this.method4631();
      this.method4224(PathNodeType.DANGER_FIRE, 16.0F);
      this.method4224(PathNodeType.DAMAGE_FIRE, -1.0F);
   }

   private void method4631() {
      if (Class8100.method28053(this)) {
         ((Class6991)this.method4230()).method21682(true);
      }
   }

   public abstract boolean method4618();

   public void method4632(boolean var1) {
      this.getDataManager().set(field5750, var1);
   }

   public boolean method4633() {
      return this.getDataManager().<Boolean>method35445(field5750);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5750, false);
   }

   @Override
   public void writeAdditional(CompoundNBT compound) {
      super.writeAdditional(compound);
      if (this.method4633()) {
         compound.putBoolean("IsImmuneToZombification", true);
      }

      compound.putInt("TimeInOverworld", this.field5751);
   }

   @Override
   public double getYOffset() {
      return !this.isChild() ? -0.45 : -0.05;
   }

   @Override
   public void readAdditional(CompoundNBT compound) {
      super.readAdditional(compound);
      this.method4632(compound.getBoolean("IsImmuneToZombification"));
      this.field5751 = compound.getInt("TimeInOverworld");
   }

   @Override
   public void updateAITasks() {
      super.updateAITasks();
      if (!this.method4634()) {
         this.field5751 = 0;
      } else {
         this.field5751++;
      }

      if (this.field5751 > 300) {
         this.func_241848_eP();
         this.method4619((ServerWorld)this.world);
      }
   }

   public boolean method4634() {
      return !this.world.getDimensionType().isPiglinSafe() && !this.method4633() && !this.method4305();
   }

   public void method4619(ServerWorld var1) {
      ZombifiedPiglinEntity var4 = this.<ZombifiedPiglinEntity>method4292(EntityType.ZOMBIFIED_PIGLIN, true);
      if (var4 != null) {
         var4.addPotionEffect(new EffectInstance(Effects.NAUSEA, 200, 0));
      }
   }

   public boolean func_242337_eM() {
      return !this.isChild();
   }

   public abstract PiglinAction func_234424_eM_();

   @Nullable
   @Override
   public LivingEntity getAttackTarget() {
      return this.brain.getMemory(MemoryModuleType.ATTACK_TARGET).orElse(null);
   }

   public boolean func_242338_eO() {
      return this.getHeldItemMainhand().getItem() instanceof TieredItem;
   }

   @Override
   public void playAmbientSound() {
      if (Class4388.func_234520_i_(this)) {
         super.playAmbientSound();
      }
   }

   @Override
   public void sendDebugPackets() {
      super.sendDebugPackets();
      DebugPacketSender.sendLivingEntity(this);
   }

   public abstract void func_241848_eP();
}
