package mapped;

public final class Class461 implements Runnable {
   private static String[] field2121;
   public final int field2122;
   public final int field2123;
   public final int field2124;
   public final double[] field2125;
   public final double[] field2126;
   public final int field2127;

   public Class461(int var1, int var2, int var3, double[] var4, double[] var5, int var6) {
      this.field2122 = var1;
      this.field2123 = var2;
      this.field2124 = var3;
      this.field2125 = var4;
      this.field2126 = var5;
      this.field2127 = var6;
   }

   @Override
   public void run() {
      int var3 = this.field2122 + this.field2123;
      int var4 = this.field2124;

      while (var4 > 512) {
         var4 >>= 2;
         Class7796.method25948(var4, this.field2125, var3 - var4, this.field2126, this.field2127 - (var4 >> 1));
      }

      Class7796.method25946(var4, 1, this.field2125, var3 - var4, this.field2127, this.field2126);
      int var5 = 0;
      int var6 = this.field2122 - var4;

      for (int var7 = this.field2123 - var4; var7 > 0; var7 -= var4) {
         int var8 = Class7796.method25944(var4, var7, ++var5, this.field2125, this.field2122, this.field2127, this.field2126);
         Class7796.method25946(var4, var8, this.field2125, var6 + var7, this.field2127, this.field2126);
      }
   }
}
