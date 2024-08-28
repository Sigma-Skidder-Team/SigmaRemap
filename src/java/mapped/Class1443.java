package mapped;

public class Class1443 implements Runnable {
   private static String[] field7750;
   public final int field7751;
   public final int field7752;
   public final int field7753;
   public final int field7754;
   public final double[][][] field7755;
   public final Class7274 field7756;

   public Class1443(Class7274 var1, int var2, int var3, int var4, int var5, double[][][] var6) {
      this.field7756 = var1;
      this.field7751 = var2;
      this.field7752 = var3;
      this.field7753 = var4;
      this.field7754 = var5;
      this.field7755 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field7751; var3 < this.field7752; var3++) {
         int var4 = (Class7274.method22900(this.field7756) - var3) % Class7274.method22900(this.field7756);

         for (int var5 = 1; var5 < this.field7753; var5++) {
            int var6 = Class7274.method22895(this.field7756) - var5;

            for (int var7 = 0; var7 < Class7274.method22898(this.field7756); var7++) {
               int var8 = 2 * var7;
               int var9 = this.field7754 - var8;
               this.field7755[var4][var6][var9 % this.field7754] = this.field7755[var3][var5][var8];
               this.field7755[var4][var6][(var9 + 1) % this.field7754] = -this.field7755[var3][var5][var8 + 1];
            }
         }
      }
   }
}
