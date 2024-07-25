package remapped;

public class class_7521 extends class_8715 {
   private static String[] field_38392;
   private final double field_38393;
   private final double field_38391;
   private final double field_38390;

   private class_7521(class_174 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6);
      this.field_49481 = var8;
      this.field_49486 = var10;
      this.field_49471 = var12;
      this.field_38393 = var2;
      this.field_38391 = var4;
      this.field_38390 = var6;
      this.field_49459 = var2 + var8;
      this.field_49480 = var4 + var10;
      this.field_49479 = var6 + var12;
      this.field_49462 = this.field_49459;
      this.field_49473 = this.field_49480;
      this.field_49465 = this.field_49479;
      this.field_10503 = 0.1F * (this.field_49466.nextFloat() * 0.5F + 0.2F);
      float var16 = this.field_49466.nextFloat() * 0.6F + 0.4F;
      this.field_49485 = 0.9F * var16;
      this.field_49468 = 0.9F * var16;
      this.field_49487 = var16;
      this.field_49474 = false;
      this.field_49476 = (int)(Math.random() * 10.0) + 30;
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
         var3 = 1.0F - var3;
         float var4 = 1.0F - var3;
         var4 *= var4;
         var4 *= var4;
         this.field_49462 = this.field_38393 + this.field_49481 * (double)var3;
         this.field_49473 = this.field_38391 + this.field_49486 * (double)var3 - (double)(var4 * 1.2F);
         this.field_49465 = this.field_38390 + this.field_49471 * (double)var3;
      } else {
         this.method_44948();
      }
   }
}
