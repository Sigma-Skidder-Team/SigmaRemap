package remapped;

public class class_6202 extends class_8715 {
   private static String[] field_31705;

   private class_6202(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6);
      this.method_44955(0.02F, 0.02F);
      this.field_10503 = this.field_10503 * (this.field_49466.nextFloat() * 0.6F + 0.2F);
      this.field_49481 = var8 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.field_49486 = var10 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.field_49471 = var12 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.field_49476 = (int)(40.0 / (Math.random() * 0.8 + 0.2));
   }

   @Override
   public void method_44949() {
      this.field_49459 = this.field_49462;
      this.field_49480 = this.field_49473;
      this.field_49479 = this.field_49465;
      this.field_49486 += 0.005;
      if (this.field_49476-- > 0) {
         this.method_44962(this.field_49481, this.field_49486, this.field_49471);
         this.field_49481 *= 0.85F;
         this.field_49486 *= 0.85F;
         this.field_49471 *= 0.85F;
         if (!this.field_49469.method_28258(new class_1331(this.field_49462, this.field_49473, this.field_49465)).method_22007(class_6503.field_33094)) {
            this.method_44948();
         }
      } else {
         this.method_44948();
      }
   }

   @Override
   public class_7154 method_44957() {
      return class_7154.field_36843;
   }
}
