package remapped;

public class class_829 extends class_9037 {
   private static String[] field_4366;

   public class_829(class_7885 var1) {
      super(var1, 1.0, true);
      this.field_4367 = var1;
   }

   @Override
   public double method_41492(class_5834 var1) {
      float var4 = this.field_4367.method_37086() - 0.1F;
      return (double)(var4 * 2.0F * var4 * 2.0F + var1.method_37086());
   }
}
