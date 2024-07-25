package remapped;

public class class_9160 extends class_8715 {
   private static String[] field_46871;
   private float field_46870;

   private class_9160(ClientWorld var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
      this.field_49476 = (int)(Math.random() * 60.0) + 30;
      this.field_49474 = false;
      this.field_49481 = 0.0;
      this.field_49486 = -0.05;
      this.field_49471 = 0.0;
      this.method_44955(0.02F, 0.02F);
      this.field_10503 = this.field_10503 * (this.field_49466.nextFloat() * 0.6F + 0.2F);
      this.field_49477 = 0.002F;
   }

   @Override
   public class_7154 method_44957() {
      return class_7154.field_36843;
   }

   @Override
   public void method_44949() {
      this.field_49459 = this.field_49462;
      this.field_49480 = this.field_49473;
      this.field_49479 = this.field_49465;
      if (this.field_49475++ < this.field_49476) {
         float var3 = 0.6F;
         this.field_49481 = this.field_49481 + (double)(0.6F * class_9299.method_42840(this.field_46870));
         this.field_49471 = this.field_49471 + (double)(0.6F * class_9299.method_42818(this.field_46870));
         this.field_49481 *= 0.07;
         this.field_49471 *= 0.07;
         this.method_44962(this.field_49481, this.field_49486, this.field_49471);
         if (!this.field_49469.method_28258(new BlockPos(this.field_49462, this.field_49473, this.field_49465)).method_22007(class_6503.field_33094)
            || this.field_49482) {
            this.method_44948();
         }

         this.field_46870 = (float)((double)this.field_46870 + 0.08);
      } else {
         this.method_44948();
      }
   }
}
