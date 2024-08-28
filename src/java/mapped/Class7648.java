package mapped;

public class Class7648 extends Class7647 {
   private static String[] field32823;
   private static Class7648 field32829 = new Class7648();
   public float[] field32830 = new float[6];
   public float[][] field32831 = new float[10][4];
   public int field32832;
   public float[] field32833 = new float[16];
   public float[] field32834 = new float[4];
   public float[][] field32835;

   @Override
   public boolean method25125(double var1, double var3, double var5, double var7, double var9, double var11) {
      for (int var15 = 0; var15 < this.field32832; var15++) {
         float[] var16 = this.field32831[var15];
         if (this.method25127(var16, var1, var3, var5) <= 0.0
                 && this.method25127(var16, var7, var3, var5) <= 0.0
                 && this.method25127(var16, var1, var9, var5) <= 0.0
                 && this.method25127(var16, var7, var9, var5) <= 0.0
                 && this.method25127(var16, var1, var3, var11) <= 0.0
                 && this.method25127(var16, var7, var3, var11) <= 0.0
                 && this.method25127(var16, var1, var9, var11) <= 0.0
                 && this.method25127(var16, var7, var9, var11) <= 0.0) {
            return false;
         }
      }

      return true;
   }

   public Class7648() {
      super((Class9367)null, (Class9367)null);
   }

   private double method25127(float[] var1, double var2, double var4, double var6) {
      return (double)var1[0] * var2 + (double)var1[1] * var4 + (double)var1[2] * var6 + (double)var1[3];
   }

   private double method25128(float[] var1, float[] var2) {
      return (double)var1[0] * (double)var2[0] + (double)var1[1] * (double)var2[1] + (double)var1[2] * (double)var2[2];
   }

   public static Class7647 method25129() {
      field32829.method25139();
      return field32829;
   }

   private void method25130(float[] var1) {
      float var4 = Class9679.method37765(var1[0] * var1[0] + var1[1] * var1[1] + var1[2] * var1[2]);
      var1[0] /= var4;
      var1[1] /= var4;
      var1[2] /= var4;
      var1[3] /= var4;
   }

   private void method25131(float[] var1) {
      float var4 = Class9679.method37765(var1[0] * var1[0] + var1[1] * var1[1] + var1[2] * var1[2]);
      if (var4 == 0.0F) {
         var4 = 1.0F;
      }

      var1[0] /= var4;
      var1[1] /= var4;
      var1[2] /= var4;
   }

   private void method25132(float[] var1, float var2, float var3, float var4, float var5) {
      float var8 = (float)Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = var2 / var8;
      var1[1] = var3 / var8;
      var1[2] = var4 / var8;
      var1[3] = var5 / var8;
   }

   private void method25133(float[] var1, float[] var2) {
      var1[0] = var2[0];
      var1[1] = var2[1];
      var1[2] = var2[2];
      var1[3] = var2[3];
   }

   private void method25134(float[] var1, float[] var2, float[] var3) {
      var1[0] = var2[1] * var3[2] - var2[2] * var3[1];
      var1[1] = var2[2] * var3[0] - var2[0] * var3[2];
      var1[2] = var2[0] * var3[1] - var2[1] * var3[0];
   }

   private void method25135(float[] var1) {
      this.method25133(this.field32831[this.field32832++], var1);
   }

   private float method25136(float var1, float var2, float var3) {
      return (float)Math.sqrt((double)(var1 * var1 + var2 * var2 + var3 * var3));
   }

   private float method25137(float var1, float var2, float var3, float var4, float var5, float var6) {
      return this.method25136(var1 - var4, var2 - var5, var3 - var6);
   }

   private void method25138(float[] var1, float[] var2, float[] var3, float[] var4) {
      this.method25134(this.field32834, var2, var3);
      this.method25134(var1, this.field32834, var4);
      this.method25131(var1);
      float var7 = (float)this.method25128(var2, var3);
      float var8 = (float)this.method25128(var1, var3);
      float var9 = this.method25137(var1[0], var1[1], var1[2], var3[0] * var8, var3[1] * var8, var3[2] * var8);
      float var10 = this.method25137(var2[0], var2[1], var2[2], var3[0] * var7, var3[1] * var7, var3[2] * var7);
      float var11 = var9 / var10;
      float var12 = (float)this.method25128(var1, var2);
      float var13 = this.method25137(var1[0], var1[1], var1[2], var2[0] * var12, var2[1] * var12, var2[2] * var12);
      float var14 = this.method25137(var3[0], var3[1], var3[2], var2[0] * var7, var2[1] * var7, var2[2] * var7);
      float var15 = var13 / var14;
      var1[3] = var2[3] * var11 + var3[3] * var15;
   }

   public void method25139() {
   }
}
