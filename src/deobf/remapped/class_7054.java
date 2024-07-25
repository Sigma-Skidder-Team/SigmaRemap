package remapped;

public class class_7054 extends class_2359 {
   private static String[] field_36424;
   private static class_7054 field_36422 = new class_7054();
   public float[] field_36417 = new float[6];
   public float[][] field_36420 = new float[10][4];
   public int field_36423;
   public float[] field_36418 = new float[16];
   public float[] field_36419 = new float[4];
   public float[][] field_36421;

   public class_7054() {
      super((class_8107)null, (class_8107)null);
   }

   public boolean method_32438(double var1, double var3, double var5, double var7, double var9, double var11) {
      for (int var15 = 0; var15 < this.field_36423; var15++) {
         float[] var16 = this.field_36420[var15];
         if (this.method_32444(var16, var1, var3, var5) <= 0.0
            && this.method_32444(var16, var7, var3, var5) <= 0.0
            && this.method_32444(var16, var1, var9, var5) <= 0.0
            && this.method_32444(var16, var7, var9, var5) <= 0.0
            && this.method_32444(var16, var1, var3, var11) <= 0.0
            && this.method_32444(var16, var7, var3, var11) <= 0.0
            && this.method_32444(var16, var1, var9, var11) <= 0.0
            && this.method_32444(var16, var7, var9, var11) <= 0.0) {
            return false;
         }
      }

      return true;
   }

   private double method_32444(float[] var1, double var2, double var4, double var6) {
      return (double)var1[0] * var2 + (double)var1[1] * var4 + (double)var1[2] * var6 + (double)var1[3];
   }

   private double method_32439(float[] var1, float[] var2) {
      return (double)var1[0] * (double)var2[0] + (double)var1[1] * (double)var2[1] + (double)var1[2] * (double)var2[2];
   }

   public static class_2359 method_32436() {
      field_36422.method_32432();
      return field_36422;
   }

   private void method_32437(float[] var1) {
      float var4 = class_9299.method_42843(var1[0] * var1[0] + var1[1] * var1[1] + var1[2] * var1[2]);
      var1[0] /= var4;
      var1[1] /= var4;
      var1[2] /= var4;
      var1[3] /= var4;
   }

   private void method_32441(float[] var1) {
      float var4 = class_9299.method_42843(var1[0] * var1[0] + var1[1] * var1[1] + var1[2] * var1[2]);
      if (var4 == 0.0F) {
         var4 = 1.0F;
      }

      var1[0] /= var4;
      var1[1] /= var4;
      var1[2] /= var4;
   }

   private void method_32443(float[] var1, float var2, float var3, float var4, float var5) {
      float var8 = (float)Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = var2 / var8;
      var1[1] = var3 / var8;
      var1[2] = var4 / var8;
      var1[3] = var5 / var8;
   }

   private void method_32435(float[] var1, float[] var2) {
      var1[0] = var2[0];
      var1[1] = var2[1];
      var1[2] = var2[2];
      var1[3] = var2[3];
   }

   private void method_32434(float[] var1, float[] var2, float[] var3) {
      var1[0] = var2[1] * var3[2] - var2[2] * var3[1];
      var1[1] = var2[2] * var3[0] - var2[0] * var3[2];
      var1[2] = var2[0] * var3[1] - var2[1] * var3[0];
   }

   private void method_32433(float[] var1) {
      this.method_32435(this.field_36420[this.field_36423++], var1);
   }

   private float method_32442(float var1, float var2, float var3) {
      return (float)Math.sqrt((double)(var1 * var1 + var2 * var2 + var3 * var3));
   }

   private float method_32440(float var1, float var2, float var3, float var4, float var5, float var6) {
      return this.method_32442(var1 - var4, var2 - var5, var3 - var6);
   }

   private void method_32431(float[] var1, float[] var2, float[] var3, float[] var4) {
      this.method_32434(this.field_36419, var2, var3);
      this.method_32434(var1, this.field_36419, var4);
      this.method_32441(var1);
      float var7 = (float)this.method_32439(var2, var3);
      float var8 = (float)this.method_32439(var1, var3);
      float var9 = this.method_32440(var1[0], var1[1], var1[2], var3[0] * var8, var3[1] * var8, var3[2] * var8);
      float var10 = this.method_32440(var2[0], var2[1], var2[2], var3[0] * var7, var3[1] * var7, var3[2] * var7);
      float var11 = var9 / var10;
      float var12 = (float)this.method_32439(var1, var2);
      float var13 = this.method_32440(var1[0], var1[1], var1[2], var2[0] * var12, var2[1] * var12, var2[2] * var12);
      float var14 = this.method_32440(var3[0], var3[1], var3[2], var2[0] * var7, var2[1] * var7, var2[2] * var7);
      float var15 = var13 / var14;
      var1[3] = var2[3] * var11 + var3[3] * var15;
   }

   public void method_32432() {
   }
}
