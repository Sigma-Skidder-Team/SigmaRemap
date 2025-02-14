package mapped;

public class Class1509 implements Runnable {
   private static String[] field8155;
   public final int field8156;
   public final int field8157;
   public final int field8158;
   public final double[][][] field8159;
   public final Class7274 field8160;

   public Class1509(Class7274 var1, int var2, int var3, int var4, double[][][] var5) {
      this.field8160 = var1;
      this.field8156 = var2;
      this.field8157 = var3;
      this.field8158 = var4;
      this.field8159 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field8156; var3 < this.field8157; var3++) {
         int var4 = (Class7274.method22900(this.field8160) - var3) % Class7274.method22900(this.field8160);

         for (int var5 = 0; var5 < Class7274.method22895(this.field8160); var5++) {
            int var6 = (Class7274.method22895(this.field8160) - var5) % Class7274.method22895(this.field8160);

            for (int var7 = 1; var7 < Class7274.method22898(this.field8160); var7 += 2) {
               int var8 = this.field8158 - var7;
               this.field8159[var4][var6][var8] = -this.field8159[var3][var5][var7 + 2];
               this.field8159[var4][var6][var8 - 1] = this.field8159[var3][var5][var7 + 1];
            }
         }
      }
   }
}
