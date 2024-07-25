package remapped;

public class class_2959 extends class_9037 {
   private static String[] field_14449;

   public class_2959(class_298 var1, class_298 var2) {
      super(var2, 1.0, false);
      this.field_14448 = var1;
   }

   @Override
   public double method_41492(class_5834 var1) {
      if (!(this.field_46244.getRidingEntity() instanceof RavagerEntity)) {
         return super.method_41492(var1);
      } else {
         float var4 = this.field_46244.getRidingEntity().method_37086() - 0.1F;
         return (double)(var4 * 2.0F * var4 * 2.0F + var1.method_37086());
      }
   }
}
