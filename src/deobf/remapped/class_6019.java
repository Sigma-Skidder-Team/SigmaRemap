package remapped;

public class class_6019 extends class_8715 {
   private static String[] field_30651;

   private class_6019(ClientWorld var1, double var2, double var4, double var6) {
      super(var1, var2, var4 - 0.125, var6);
      this.field_49485 = 0.4F;
      this.field_49468 = 0.4F;
      this.field_49487 = 0.7F;
      this.method_44955(0.01F, 0.01F);
      this.field_10503 = this.field_10503 * (this.field_49466.nextFloat() * 0.6F + 0.2F);
      this.field_49476 = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      this.field_49474 = false;
   }

   private class_6019(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4 - 0.125, var6, var8, var10, var12);
      this.method_44955(0.01F, 0.01F);
      this.field_10503 = this.field_10503 * (this.field_49466.nextFloat() * 0.6F + 0.6F);
      this.field_49476 = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      this.field_49474 = false;
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
      if (this.field_49476-- > 0) {
         this.method_44962(this.field_49481, this.field_49486, this.field_49471);
      } else {
         this.method_44948();
      }
   }
}
