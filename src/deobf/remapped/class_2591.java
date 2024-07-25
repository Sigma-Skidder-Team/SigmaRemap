package remapped;

public class class_2591 extends HurtByTargetGoal {
   private static String[] field_12815;

   public class_2591(class_8829 var1, class_8829 var2) {
      super(var2);
      this.field_12816 = var1;
   }

   @Override
   public boolean method_16799() {
      return this.field_12816.method_28537() && super.method_16799();
   }

   @Override
   public void method_38756(MobEntity var1, LivingEntity var2) {
      if (var1 instanceof class_8829 && this.field_4915.method_26420(var2)) {
         var1.method_26860(var2);
      }
   }
}
