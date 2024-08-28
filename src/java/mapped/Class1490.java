package mapped;

public class Class1490 implements Runnable {
   private static String[] field8024;
   public final int field8025;
   public final int field8026;
   public final int field8027;
   public final int field8028;
   public final double[][][] field8029;
   public final Class7274 field8030;

   public Class1490(Class7274 var1, int var2, int var3, int var4, int var5, double[][][] var6) {
      this.field8030 = var1;
      this.field8025 = var2;
      this.field8026 = var3;
      this.field8027 = var4;
      this.field8028 = var5;
      this.field8029 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field8025; var3 < this.field8026; var3++) {
         int var4 = (Class7274.method22900(this.field8030) - var3) % Class7274.method22900(this.field8030);

         for (int var5 = 1; var5 < this.field8027; var5++) {
            int var6 = Class7274.method22895(this.field8030) - var5;

            for (int var7 = 0; var7 < Class7274.method22898(this.field8030); var7++) {
               int var8 = 2 * var7;
               int var9 = this.field8028 - var8;
               this.field8029[var4][var6][var9 % this.field8028] = this.field8029[var3][var5][var8];
               this.field8029[var4][var6][(var9 + 1) % this.field8028] = -this.field8029[var3][var5][var8 + 1];
            }
         }
      }
   }
}
