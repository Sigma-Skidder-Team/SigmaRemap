package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.DebugPacketSender;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.RangedInteger;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.List;
import java.util.Optional;

public class ZoglinEntity extends MonsterEntity implements IMob, Class1092 {
   private static final DataParameter<Boolean> field5982 = EntityDataManager.<Boolean>createKey(ZoglinEntity.class, DataSerializers.field33398);
   private int field5983;
   public static final ImmutableList<? extends Class7963<? extends Class7882<? super ZoglinEntity>>> field5984 = ImmutableList.of(
      Class7963.field34239, Class7963.field34240
   );
   public static final ImmutableList<? extends Class8830<?>> field5985 = ImmutableList.of(
      Class8830.field39818,
      Class8830.field39819,
      Class8830.field39822,
      Class8830.field39823,
      Class8830.field39825,
      Class8830.field39824,
      Class8830.field39841,
      Class8830.field39831,
      Class8830.field39826,
      Class8830.field39827
   );

   public ZoglinEntity(EntityType<? extends ZoglinEntity> var1, World var2) {
      super(var1, var2);
      this.field5594 = 5;
   }

   @Override
   public Class6971<ZoglinEntity> getBrainCodec() {
      return Brain.<ZoglinEntity>createCodec(field5985, field5984);
   }

   @Override
   public Brain<?> createBrain(Dynamic<?> var1) {
      Brain var4 = this.getBrainCodec().deserialize(var1);
      method5093(var4);
      method5094(var4);
      method5095(var4);
      var4.method21415(ImmutableSet.of(Activity.field40219));
      var4.method21424(Activity.field40220);
      var4.method21417();
      return var4;
   }

   private static void method5093(Brain<ZoglinEntity> var0) {
      var0.method21425(Activity.field40219, 0, ImmutableList.of(new Class3681(45, 90), new Class3735()));
   }

   private static void method5094(Brain<ZoglinEntity> var0) {
      var0.method21425(
         Activity.field40220,
         10,
         ImmutableList.<Class3676<? super ZoglinEntity>>of(
                 new Class3733<>(ZoglinEntity::method5096),
            new Class3702<>(new Class3738(8.0F), RangedInteger.method29318(30, 60)),
            new Class3693<>(ImmutableList.of(Pair.of(new Class3718(0.4F), 2),
                    Pair.of(new Class3694(0.4F, 3), 2), Pair.of(new Class3675(30, 60), 1)))
         )
      );
   }

   private static void method5095(Brain<ZoglinEntity> var0) {
      var0.method21426(
         Activity.field40229,
         10,
              ImmutableList.<Class3676<? super ZoglinEntity>>of(
            new Class3720(1.0F),
            new Class3740<>(ZoglinEntity::method5099, new Class3684(40)),
            new Class3740<>(ZoglinEntity::isChild, new Class3684(15)),
            new Class3685()
         ),
         Class8830.field39826
      );
   }

   private Optional<? extends LivingEntity> method5096() {
      return this.getBrain().<List<LivingEntity>>method21410(Class8830.field39819).orElse(ImmutableList.of()).stream().filter(ZoglinEntity::method5097).findFirst();
   }

   private static boolean method5097(LivingEntity var0) {
      EntityType var3 = var0.getType();
      return var3 != EntityType.ZOGLIN && var3 != EntityType.CREEPER && EntityPredicates.field34762.test(var0);
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5982, false);
   }

   @Override
   public void notifyDataManagerChange(DataParameter<?> var1) {
      super.notifyDataManagerChange(var1);
      if (field5982.equals(var1)) {
         this.recalculateSize();
      }
   }

   public static MutableAttribute method5098() {
      return MonsterEntity.method4343()
         .method21849(Attributes.MAX_HEALTH, 40.0)
         .method21849(Attributes.MOVEMENT_SPEED, 0.3F)
         .method21849(Attributes.KNOCKBACK_RESISTANCE, 0.6F)
         .method21849(Attributes.ATTACK_KNOCKBACK, 1.0)
         .method21849(Attributes.ATTACK_DAMAGE, 6.0);
   }

   public boolean method5099() {
      return !this.isChild();
   }

   @Override
   public boolean attackEntityAsMob(Entity var1) {
      if (var1 instanceof LivingEntity) {
         this.field5983 = 10;
         this.world.setEntityState(this, (byte)4);
         this.playSound(SoundEvents.field27278, 1.0F, this.getSoundPitch());
         return Class1092.method5091(this, (LivingEntity)var1);
      } else {
         return false;
      }
   }

   @Override
   public boolean method4295(PlayerEntity var1) {
      return !this.method4296();
   }

   @Override
   public void constructKnockBackVector(LivingEntity var1) {
      if (!this.isChild()) {
         Class1092.method5092(this, var1);
      }
   }

   @Override
   public double method3310() {
      return (double)this.getHeight() - (!this.isChild() ? 0.15 : 0.2);
   }

   @Override
   public boolean attackEntityFrom(DamageSource source, float var2) {
      boolean var5 = super.attackEntityFrom(source, var2);
      if (!this.world.isRemote) {
         if (var5 && source.getTrueSource() instanceof LivingEntity) {
            LivingEntity var6 = (LivingEntity) source.getTrueSource();
            if (EntityPredicates.field34762.test(var6) && !Class6983.method21582(this, var6, 4.0)) {
               this.method5100(var6);
            }

            return var5;
         } else {
            return var5;
         }
      } else {
         return false;
      }
   }

   private void method5100(LivingEntity var1) {
      this.brain.method21405(Class8830.field39841);
      this.brain.method21407(Class8830.field39826, var1, 200L);
   }

   @Override
   public Brain<ZoglinEntity> getBrain() {
      return (Brain<ZoglinEntity>)super.getBrain();
   }

   public void method5101() {
      Activity var3 = this.brain.method21418().orElse((Activity)null);
      this.brain.method21423(ImmutableList.of(Activity.field40229, Activity.field40220));
      Activity var4 = this.brain.method21418().orElse((Activity)null);
      if (var4 == Activity.field40229 && var3 != Activity.field40229) {
         this.method5102();
      }

      this.method4304(this.brain.method21404(Class8830.field39826));
   }

   @Override
   public void updateAITasks() {
      this.world.getProfiler().startSection("zoglinBrain");
      this.getBrain().method21432((ServerWorld)this.world, this);
      this.world.getProfiler().endSection();
      this.method5101();
   }

   @Override
   public void method4308(boolean var1) {
      this.getDataManager().set(field5982, var1);
      if (!this.world.isRemote && var1) {
         this.getAttribute(Attributes.ATTACK_DAMAGE).method38661(0.5);
      }
   }

   @Override
   public boolean isChild() {
      return this.getDataManager().<Boolean>method35445(field5982);
   }

   @Override
   public void livingTick() {
      if (this.field5983 > 0) {
         this.field5983--;
      }

      super.livingTick();
   }

   @Override
   public void handleStatusUpdate(byte var1) {
      if (var1 != 4) {
         super.handleStatusUpdate(var1);
      } else {
         this.field5983 = 10;
         this.playSound(SoundEvents.field27278, 1.0F, this.getSoundPitch());
      }
   }

   @Override
   public int method5082() {
      return this.field5983;
   }

   @Override
   public SoundEvent getAmbientSound() {
      if (!this.world.isRemote) {
         return !this.brain.method21404(Class8830.field39826) ? SoundEvents.field27276 : SoundEvents.field27277;
      } else {
         return null;
      }
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field27280;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field27279;
   }

   @Override
   public void playStepSound(BlockPos var1, BlockState var2) {
      this.playSound(SoundEvents.field27281, 0.15F, 1.0F);
   }

   public void method5102() {
      this.playSound(SoundEvents.field27277, 1.0F, this.getSoundPitch());
   }

   @Override
   public void method4257() {
      super.method4257();
      DebugPacketSender.method23622(this);
   }

   @Override
   public CreatureAttribute getCreatureAttribute() {
      return CreatureAttribute.UNDEAD;
   }

   @Override
   public void writeAdditional(CompoundNBT compound) {
      super.writeAdditional(compound);
      if (this.isChild()) {
         compound.putBoolean("IsBaby", true);
      }
   }

   @Override
   public void readAdditional(CompoundNBT compound) {
      super.readAdditional(compound);
      if (compound.getBoolean("IsBaby")) {
         this.method4308(true);
      }
   }
}
