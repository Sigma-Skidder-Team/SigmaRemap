package remapped;

public class class_2587 extends class_5127 {
   private static String[] field_12810;

   private class_2587(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
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
      return this.field_10503 * (1.0F - var4 * var4 * 0.5F);
   }

   @Override
   public int method_44952(float var1) {
      float var4 = ((float)this.field_49475 + var1) / (float)this.field_49476;
      var4 = MathHelper.clamp(var4, 0.0F, 1.0F);
      int var5 = super.method_44952(var1);
      int var6 = var5 & 0xFF;
      int var7 = var5 >> 16 & 0xFF;
      var6 += (int)(var4 * 15.0F * 16.0F);
      if (var6 > 240) {
         var6 = 240;
      }

      return var6 | var7 << 16;
   }
}
