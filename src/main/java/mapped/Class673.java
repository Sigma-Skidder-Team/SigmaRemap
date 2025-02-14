package mapped;

public class Class673 implements Runnable {
   private static String[] field3407;
   public final int field3408;
   public final int field3409;
   public final int field3410;
   public final double[][][] field3411;
   public final double[] field3412;
   public final int field3413;
   public final int field3414;
   public final Class7274 field3415;

   public Class673(Class7274 var1, int var2, int var3, int var4, double[][][] var5, double[] var6, int var7, int var8) {
      this.field3415 = var1;
      this.field3408 = var2;
      this.field3409 = var3;
      this.field3410 = var4;
      this.field3411 = var5;
      this.field3412 = var6;
      this.field3413 = var7;
      this.field3414 = var8;
   }

   @Override
   public void run() {
      for (int var3 = this.field3408; var3 < this.field3409; var3++) {
         int var4 = var3 * this.field3410;

         for (int var5 = 0; var5 < Class7274.method22895(this.field3415); var5++) {
            System.arraycopy(this.field3411[var3][var5], 0, this.field3412, var4 + var5 * this.field3413, this.field3414);
         }
      }
   }
}
