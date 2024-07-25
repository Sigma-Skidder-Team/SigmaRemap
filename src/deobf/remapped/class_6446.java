package remapped;

public class class_6446 extends class_8715 {
   private static String[] field_32888;

   private class_6446(class_174 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      float var16 = this.field_49466.nextFloat() * 0.1F + 0.2F;
      this.field_49485 = var16;
      this.field_49468 = var16;
      this.field_49487 = var16;
      this.method_44955(0.02F, 0.02F);
      this.field_10503 = this.field_10503 * (this.field_49466.nextFloat() * 0.6F + 0.5F);
      this.field_49481 *= 0.02F;
      this.field_49486 *= 0.02F;
      this.field_49471 *= 0.02F;
      this.field_49476 = (int)(20.0 / (Math.random() * 0.8 + 0.2));
   }

   @Override
   public class_7154 method_44957() {
      return class_7154.field_36843;
   }

   @Override
   public void method_44962(double var1, double var3, double var5) {
      this.method_44961(this.method_44945().method_18918(var1, var3, var5));
      this.method_44944();
   }

   @Override
   public void method_44949() {
      this.field_49459 = this.field_49462;
      this.field_49480 = this.field_49473;
      this.field_49479 = this.field_49465;
      if (this.field_49476-- > 0) {
         this.method_44962(this.field_49481, this.field_49486, this.field_49471);
         this.field_49481 *= 0.99;
         this.field_49486 *= 0.99;
         this.field_49471 *= 0.99;
      } else {
         this.method_44948();
      }
   }
}
