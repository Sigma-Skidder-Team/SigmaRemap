package remapped;

public class class_2803 extends class_5467 {
   private static String[] field_13765;

   public class_2803(EntityType<? extends class_2803> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void registerGoals() {
      this.goalSelector.addGoal(0, new class_787(this));
      this.goalSelector.addGoal(1, new class_518(this, 2.0));
      this.goalSelector.addGoal(2, new class_9513(this, 1.0));
      this.goalSelector.addGoal(3, new class_7228(this, 1.25, class_8137.method_37019(class_4897.field_24813), false));
      this.goalSelector.addGoal(4, new class_8676(this, 1.25));
      this.goalSelector.addGoal(5, new class_2889(this, 1.0));
      this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 6.0F));
      this.goalSelector.addGoal(7, new class_9691(this));
   }

   public static class_1313 method_12747() {
      return MobEntity.method_26846().method_5984(class_7331.field_37468, 10.0).method_5984(class_7331.field_37465, 0.2F);
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2112;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2013;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2500;
   }

   @Override
   public void method_37207(BlockPos var1, class_2522 var2) {
      this.method_37155(class_463.field_2266, 0.15F, 1.0F);
   }

   @Override
   public float method_26439() {
      return 0.4F;
   }

   @Override
   public class_6910 method_26857(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.method_26617(var2);
      if (var5.method_27960() == class_4897.field_24548 && !this.method_26449()) {
         var1.method_37155(class_463.field_2828, 1.0F, 1.0F);
         ItemStack var6 = class_4754.method_21940(var5, var1, class_4897.field_24579.method_11207());
         var1.method_26615(var2, var6);
         return class_6910.method_31659(this.world.field_33055);
      } else {
         return super.method_26857(var1, var2);
      }
   }

   public class_2803 method_12748(class_6331 var1, class_1899 var2) {
      return EntityType.field_34325.method_30484(var1);
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return !this.method_26449() ? 1.3F : var2.field_31200 * 0.95F;
   }
}
