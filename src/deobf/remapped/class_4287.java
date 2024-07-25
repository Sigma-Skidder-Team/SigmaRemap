package remapped;

public class class_4287 extends class_8715 {
   private static String[] field_20806;
   private final double field_20805;
   private final double field_20807;
   private final double field_20804;

   public class_4287(class_174 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6);
      this.field_49481 = var8;
      this.field_49486 = var10;
      this.field_49471 = var12;
      this.field_49462 = var2;
      this.field_49473 = var4;
      this.field_49465 = var6;
      this.field_20805 = this.field_49462;
      this.field_20807 = this.field_49473;
      this.field_20804 = this.field_49465;
      this.field_10503 = 0.1F * (this.field_49466.nextFloat() * 0.2F + 0.5F);
      float var16 = this.field_49466.nextFloat() * 0.6F + 0.4F;
      this.field_49485 = var16 * 0.9F;
      this.field_49468 = var16 * 0.3F;
      this.field_49487 = var16;
      this.field_49476 = (int)(Math.random() * 10.0) + 40;
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
   public float method_9766(float var1) {
      float var4 = ((float)this.field_49475 + var1) / (float)this.field_49476;
      var4 = 1.0F - var4;
      var4 *= var4;
      var4 = 1.0F - var4;
      return this.field_10503 * var4;
   }

   @Override
   public int method_44952(float var1) {
      int var4 = super.method_44952(var1);
      float var5 = (float)this.field_49475 / (float)this.field_49476;
      var5 *= var5;
      var5 *= var5;
      int var6 = var4 & 0xFF;
      int var7 = var4 >> 16 & 0xFF;
      var7 += (int)(var5 * 15.0F * 16.0F);
      if (var7 > 240) {
         var7 = 240;
      }

      return var6 | var7 << 16;
   }

   @Override
   public void method_44949() {
      this.field_49459 = this.field_49462;
      this.field_49480 = this.field_49473;
      this.field_49479 = this.field_49465;
      if (this.field_49475++ < this.field_49476) {
         float var3 = (float)this.field_49475 / (float)this.field_49476;
         float var4 = -var3 + var3 * var3 * 2.0F;
         float var5 = 1.0F - var4;
         this.field_49462 = this.field_20805 + this.field_49481 * (double)var5;
         this.field_49473 = this.field_20807 + this.field_49486 * (double)var5 + (double)(1.0F - var3);
         this.field_49465 = this.field_20804 + this.field_49471 * (double)var5;
      } else {
         this.method_44948();
      }
   }
}
