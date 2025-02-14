package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.MutableAttribute;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class EvokerEntity extends Class1031 {
   private static String[] field5736;
   private SheepEntity field5737;

   public EvokerEntity(EntityType<? extends EvokerEntity> var1, World var2) {
      super(var1, var2);
      this.field5594 = 10;
   }

   @Override
   public void method4219() {
      super.method4219();
      this.goalSelector.addGoal(0, new SwimGoal(this));
      this.goalSelector.addGoal(1, new Class2697(this));
      this.goalSelector.addGoal(2, new Class2770<PlayerEntity>(this, PlayerEntity.class, 8.0F, 0.6, 1.0));
      this.goalSelector.addGoal(4, new Class2675(this));
      this.goalSelector.addGoal(5, new Class2674(this));
      this.goalSelector.addGoal(6, new Class2676(this));
      this.goalSelector.addGoal(8, new Class2736(this, 0.6));
      this.goalSelector.addGoal(9, new LookAtGoal(this, PlayerEntity.class, 3.0F, 1.0F));
      this.goalSelector.addGoal(10, new LookAtGoal(this, MobEntity.class, 8.0F));
      this.targetSelector.addGoal(1, new HurtByTargetGoal(this, AbstractRaiderEntity.class).method10918());
      this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, true).method10917(300));
      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<Class1043>(this, Class1043.class, false).method10917(300));
      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<IronGolemEntity>(this, IronGolemEntity.class, false));
   }

   public static MutableAttribute method4600() {
      return MonsterEntity.method4343().method21849(Attributes.MOVEMENT_SPEED, 0.5).method21849(Attributes.FOLLOW_RANGE, 12.0).method21849(Attributes.MAX_HEALTH, 24.0);
   }

   @Override
   public void registerData() {
      super.registerData();
   }

   @Override
   public void readAdditional(CompoundNBT compound) {
      super.readAdditional(compound);
   }

   @Override
   public SoundEvent method4546() {
      return SoundEvents.field26561;
   }

   @Override
   public void writeAdditional(CompoundNBT compound) {
      super.writeAdditional(compound);
   }

   @Override
   public void updateAITasks() {
      super.updateAITasks();
   }

   @Override
   public boolean isOnSameTeam(Entity var1) {
      if (var1 != null) {
         if (var1 == this) {
            return true;
         } else if (!super.isOnSameTeam(var1)) {
            if (var1 instanceof VexEntity) {
               return this.isOnSameTeam(((VexEntity)var1).method5270());
            } else {
               return var1 instanceof LivingEntity && ((LivingEntity)var1).getCreatureAttribute() == CreatureAttribute.field33508
                  ? this.getTeam() == null && var1.getTeam() == null
                  : false;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public SoundEvent getAmbientSound() {
      return SoundEvents.field26559;
   }

   @Override
   public SoundEvent getDeathSound() {
      return SoundEvents.field26562;
   }

   @Override
   public SoundEvent getHurtSound(DamageSource var1) {
      return SoundEvents.field26564;
   }

   private void method4601(SheepEntity var1) {
      this.field5737 = var1;
   }

   @Nullable
   private SheepEntity method4602() {
      return this.field5737;
   }

   @Override
   public SoundEvent method4598() {
      return SoundEvents.field26560;
   }

   @Override
   public void method4545(int var1, boolean var2) {
   }

   // $VF: synthetic method
   public static SheepEntity method4603(EvokerEntity var0) {
      return var0.method4602();
   }

   // $VF: synthetic method
   public static Random method4604(EvokerEntity var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method4605(EvokerEntity var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method4606(EvokerEntity var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method4607(EvokerEntity var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static Random method4608(EvokerEntity var0) {
      return var0.rand;
   }

   // $VF: synthetic method
   public static void method4609(EvokerEntity var0, SheepEntity var1) {
      var0.method4601(var1);
   }
}
