package mapped;

public final class Class1385 implements Runnable {
   private static String[] field7398;
   public final int field7399;
   public final int field7400;
   public final int field7401;
   public final double[] field7402;
   public final double[] field7403;
   public final int field7404;

   public Class1385(int var1, int var2, int var3, double[] var4, double[] var5, int var6) {
      this.field7399 = var1;
      this.field7400 = var2;
      this.field7401 = var3;
      this.field7402 = var4;
      this.field7403 = var5;
      this.field7404 = var6;
   }

   @Override
   public void run() {
      int var3 = this.field7399 + this.field7400;
      int var4 = 1;
      int var5 = this.field7401;

      while (var5 > 512) {
         var5 >>= 2;
         var4 <<= 2;
         Class7796.method25950(var5, this.field7402, var3 - var5, this.field7403, this.field7404 - var5);
      }

      Class7796.method25946(var5, 0, this.field7402, var3 - var5, this.field7404, this.field7403);
      var4 >>= 1;
      int var6 = this.field7399 - var5;

      for (int var7 = this.field7400 - var5; var7 > 0; var7 -= var5) {
         int var8 = Class7796.method25944(var5, var7, ++var4, this.field7402, this.field7399, this.field7404, this.field7403);
         Class7796.method25946(var5, var8, this.field7402, var6 + var7, this.field7404, this.field7403);
      }
   }
}
