package remapped;

import javax.annotation.Nullable;

public class class_1799 extends class_7429 {
   private static String[] field_9169;
   private class_8031 field_9170;

   public class_1799(EntityType<? extends class_1799> var1, World var2) {
      super(var1, var2);
      this.field_29915 = 10;
   }

   @Override
   public void registerGoals() {
      super.registerGoals();
      this.goalSelector.addGoal(0, new SwimGoal(this));
      this.goalSelector.addGoal(1, new class_1273(this, null));
      this.goalSelector.addGoal(2, new class_6837<PlayerEntity>(this, PlayerEntity.class, 8.0F, 0.6, 1.0));
      this.goalSelector.addGoal(4, new class_8801(this, null));
      this.goalSelector.addGoal(5, new class_532(this, null));
      this.goalSelector.addGoal(6, new class_3096(this));
      this.goalSelector.addGoal(8, new class_8285(this, 0.6));
      this.goalSelector.addGoal(9, new LookAtGoal(this, PlayerEntity.class, 3.0F, 1.0F));
      this.goalSelector.addGoal(10, new LookAtGoal(this, MobEntity.class, 8.0F));
      this.targetSelector.addGoal(1, new HurtByTargetGoal(this, AbstractRaiderEntity.class).setCallsForHelp());
      this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, true).method_4209(300));
      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<AbstractVillagerEntity>(this, AbstractVillagerEntity.class, false).method_4209(300));
      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<IronGolemEntity>(this, IronGolemEntity.class, false));
   }

   public static MutableAttribute method_8001() {
      return MonsterEntity.func_234295_eP_()
         .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.5)
         .createMutableAttribute(Attributes.FOLLOW_RANGE, 12.0)
         .createMutableAttribute(Attributes.MAX_HEALTH, 24.0);
   }

   @Override
   public void method_37329() {
      super.method_37329();
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
   }

   @Override
   public SoundEvent getRaidLossSound() {
      return SoundEvents.field_2550;
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
   }

   @Override
   public void method_26919() {
      super.method_26919();
   }

   @Override
   public boolean method_37344(Entity var1) {
      if (var1 != null) {
         if (var1 == this) {
            return true;
         } else if (!super.method_37344(var1)) {
            if (var1 instanceof class_2519) {
               return this.method_37344(((class_2519)var1).method_11454());
            } else {
               return var1 instanceof LivingEntity && ((LivingEntity)var1).method_26550() == class_2780.field_13576
                  ? this.method_37095() == null && var1.method_37095() == null
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
   public SoundEvent method_26918() {
      return SoundEvents.field_2299;
   }

   @Override
   public SoundEvent method_26599() {
      return SoundEvents.field_2871;
   }

   @Override
   public SoundEvent method_26541(DamageSource var1) {
      return SoundEvents.field_2336;
   }

   private void method_8000(class_8031 var1) {
      this.field_9170 = var1;
   }

   @Nullable
   private class_8031 method_8004() {
      return this.field_9170;
   }

   @Override
   public SoundEvent method_33826() {
      return SoundEvents.field_1973;
   }

   @Override
   public void method_18602(int var1, boolean var2) {
   }
}
