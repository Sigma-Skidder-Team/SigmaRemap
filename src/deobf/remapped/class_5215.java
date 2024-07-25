package remapped;

public class class_5215 extends class_9037 {
   private static String[] field_26778;

   public class_5215(class_7937 var1) {
      super(var1, 1.0, true);
   }

   @Override
   public boolean method_16795() {
      return super.method_16795() && !this.field_46244.method_37151();
   }

   @Override
   public boolean method_16799() {
      float var3 = this.field_46244.method_37193();
      if (var3 >= 0.5F && this.field_46244.method_26594().nextInt(100) == 0) {
         this.field_46244.method_26860((class_5834)null);
         return false;
      } else {
         return super.method_16799();
      }
   }

   @Override
   public double method_41492(class_5834 var1) {
      return (double)(4.0F + var1.method_37086());
   }
}
