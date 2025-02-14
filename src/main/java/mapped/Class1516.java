package mapped;

public class Class1516 implements Runnable {
   private static String[] field8202;
   public final int field8203;
   public final int field8204;
   public final double[][][] field8205;
   public final boolean field8206;
   public final Class3612 field8207;

   public Class1516(Class3612 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field8207 = var1;
      this.field8203 = var2;
      this.field8204 = var3;
      this.field8205 = var4;
      this.field8206 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class3612.method12226(this.field8207)];

      for (int var4 = this.field8203; var4 < this.field8204; var4++) {
         for (int var5 = 0; var5 < Class3612.method12224(this.field8207); var5++) {
            for (int var6 = 0; var6 < Class3612.method12226(this.field8207); var6++) {
               var3[var6] = this.field8205[var6][var4][var5];
            }

            Class3612.method12227(this.field8207).method33660(var3, this.field8206);

            for (int var7 = 0; var7 < Class3612.method12226(this.field8207); var7++) {
               this.field8205[var7][var4][var5] = var3[var7];
            }
         }
      }
   }
}
