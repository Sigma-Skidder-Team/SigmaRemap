package mapped;

public final class Class599 implements Runnable {
   private static String[] field2953;
   public final int field2954;
   public final int field2955;
   public final int field2956;
   public final float[] field2957;
   public final float[] field2958;
   public final int field2959;

   public Class599(int var1, int var2, int var3, float[] var4, float[] var5, int var6) {
      this.field2954 = var1;
      this.field2955 = var2;
      this.field2956 = var3;
      this.field2957 = var4;
      this.field2958 = var5;
      this.field2959 = var6;
   }

   @Override
   public void run() {
      int var3 = this.field2954 + this.field2955;
      int var4 = 1;
      int var5 = this.field2956;

      while (var5 > 512) {
         var5 >>= 2;
         var4 <<= 2;
         Class7796.method26008(var5, this.field2957, var3 - var5, this.field2958, this.field2959 - var5);
      }

      Class7796.method26004(var5, 0, this.field2957, var3 - var5, this.field2959, this.field2958);
      var4 >>= 1;
      int var6 = this.field2954 - var5;

      for (int var7 = this.field2955 - var5; var7 > 0; var7 -= var5) {
         int var8 = Class7796.method26002(var5, var7, ++var4, this.field2957, this.field2954, this.field2959, this.field2958);
         Class7796.method26004(var5, var8, this.field2957, var6 + var7, this.field2959, this.field2958);
      }
   }
}
