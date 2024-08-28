package mapped;

public class Class1456 implements Runnable {
   private static String[] field7828;
   public final int field7829;
   public final int field7830;
   public final double[][][] field7831;
   public final boolean field7832;
   public final Class7274 field7833;

   public Class1456(Class7274 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field7833 = var1;
      this.field7829 = var2;
      this.field7830 = var3;
      this.field7831 = var4;
      this.field7832 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[2 * Class7274.method22895(this.field7833)];

      for (int var4 = this.field7829; var4 < this.field7830; var4++) {
         for (int var5 = 0; var5 < Class7274.method22898(this.field7833); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < Class7274.method22895(this.field7833); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field7831[var4][var7][var6];
               var3[var8 + 1] = this.field7831[var4][var7][var6 + 1];
            }

            Class7274.method22899(this.field7833).method27166(var3, this.field7832);

            for (int var9 = 0; var9 < Class7274.method22895(this.field7833); var9++) {
               int var10 = 2 * var9;
               this.field7831[var4][var9][var6] = var3[var10];
               this.field7831[var4][var9][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}
