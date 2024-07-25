package remapped;

public class class_6677 extends class_9037 {
   private static String[] field_34511;

   public class_6677(class_9668 var1) {
      super(var1, 1.25, true);
      this.field_34512 = var1;
   }

   @Override
   public void method_41489(class_5834 var1, double var2) {
      double var6 = this.method_41492(var1);
      if (var2 <= var6 && this.method_41493()) {
         this.method_41491();
         this.field_46244.method_26442(var1);
         this.field_34512.method_44712(false);
      } else if (!(var2 <= var6 * 2.0)) {
         this.method_41491();
         this.field_34512.method_44712(false);
      } else {
         if (this.method_41493()) {
            this.field_34512.method_44712(false);
            this.method_41491();
         }

         if (this.method_41494() <= 10) {
            this.field_34512.method_44712(true);
            this.field_34512.method_44708();
         }
      }
   }

   @Override
   public void method_16793() {
      this.field_34512.method_44712(false);
      super.method_16793();
   }

   @Override
   public double method_41492(class_5834 var1) {
      return (double)(4.0F + var1.method_37086());
   }
}
