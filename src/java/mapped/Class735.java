package mapped;

public final class Class735 implements Runnable {
   private static String[] field3804;
   public final int field3805;
   public final int field3806;
   public final int field3807;
   public final float[] field3808;
   public final float[] field3809;
   public final int field3810;

   public Class735(int var1, int var2, int var3, float[] var4, float[] var5, int var6) {
      this.field3805 = var1;
      this.field3806 = var2;
      this.field3807 = var3;
      this.field3808 = var4;
      this.field3809 = var5;
      this.field3810 = var6;
   }

   @Override
   public void run() {
      int var3 = this.field3805 + this.field3806;
      int var4 = this.field3807;

      while (var4 > 512) {
         var4 >>= 2;
         Class7796.method26006(var4, this.field3808, var3 - var4, this.field3809, this.field3810 - (var4 >> 1));
      }

      Class7796.method26004(var4, 1, this.field3808, var3 - var4, this.field3810, this.field3809);
      int var5 = 0;
      int var6 = this.field3805 - var4;

      for (int var7 = this.field3806 - var4; var7 > 0; var7 -= var4) {
         int var8 = Class7796.method26002(var4, var7, ++var5, this.field3808, this.field3805, this.field3810, this.field3809);
         Class7796.method26004(var4, var8, this.field3808, var6 + var7, this.field3810, this.field3809);
      }
   }
}
