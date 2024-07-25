package remapped;

public class class_2199 extends HurtByTargetGoal {
   private static String[] field_10915;
   private final class_496 field_10914;

   public class_2199(class_496 var1, Class<?>... var2) {
      super(var1, var2);
      this.field_10914 = var1;
   }

   @Override
   public boolean method_16799() {
      if (!class_496.method_2465(this.field_10914) && !class_496.method_2429(this.field_10914)) {
         return super.method_16799();
      } else {
         this.field_10914.method_26860((class_5834)null);
         return false;
      }
   }

   @Override
   public void method_38756(class_5886 var1, class_5834 var2) {
      if (var1 instanceof class_496 && ((class_496)var1).method_26892()) {
         var1.method_26860(var2);
      }
   }
}
