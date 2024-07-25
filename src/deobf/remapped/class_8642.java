package remapped;

public class class_8642 extends NearestAttackableTargetGoal<LivingEntity> {
   private static String[] field_44292;

   public class_8642(class_298 var1) {
      super(var1, LivingEntity.class, 0, true, true, LivingEntity::method_26556);
   }

   @Override
   public boolean method_16795() {
      return class_298.method_1338((class_298)this.field_4915) && super.method_16795();
   }

   @Override
   public void method_16796() {
      super.method_16796();
      this.field_4915.method_26441(0);
   }
}
