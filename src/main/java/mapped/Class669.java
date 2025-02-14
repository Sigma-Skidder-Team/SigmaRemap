package mapped;

public class Class669 implements Runnable {
   private static String[] field3378;
   public final int field3379;
   public final int field3380;
   public final double[][][] field3381;
   public final boolean field3382;
   public final Class6352 field3383;

   public Class669(Class6352 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field3383 = var1;
      this.field3379 = var2;
      this.field3380 = var3;
      this.field3381 = var4;
      this.field3382 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field3379; var3 < this.field3380; var3++) {
         for (int var4 = 0; var4 < Class6352.method19328(this.field3383); var4++) {
            Class6352.method19330(this.field3383).method38576(this.field3381[var3][var4], this.field3382);
         }
      }
   }
}
