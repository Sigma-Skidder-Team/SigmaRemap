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
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public abstract class Class1035 extends MonsterEntity {
   public static final DataParameter<Boolean> field5750 = EntityDataManager.<Boolean>createKey(Class1035.class, DataSerializers.field33398);
   public int field5751 = 0;

   public Class1035(EntityType<? extends Class1035> var1, World var2) {
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
      this.getDataManager().method35446(field5750, var1);
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
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      if (this.method4633()) {
         var1.putBoolean("IsImmuneToZombification", true);
      }

      var1.putInt("TimeInOverworld", this.field5751);
   }

   @Override
   public double getYOffset() {
      return !this.isChild() ? -0.45 : -0.05;
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.method4632(var1.getBoolean("IsImmuneToZombification"));
      this.field5751 = var1.getInt("TimeInOverworld");
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
         this.method4630();
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

   public boolean method4635() {
      return !this.isChild();
   }

   public abstract Class2172 method4622();

   @Nullable
   @Override
   public LivingEntity method4232() {
      return this.field5011.<LivingEntity>method21410(Class8830.field39826).orElse((LivingEntity)null);
   }

   public boolean method4636() {
      return this.getHeldItemMainhand().getItem() instanceof TieredItem;
   }

   @Override
   public void method4237() {
      if (Class4388.method13865(this)) {
         super.method4237();
      }
   }

   @Override
   public void method4257() {
      super.method4257();
      DebugPacketSender.method23622(this);
   }

   public abstract void method4630();
}
