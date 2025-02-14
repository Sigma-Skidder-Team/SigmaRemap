package mapped;

public class Class446 implements Runnable {
   private static String[] field2023;
   public final int field2024;
   public final int field2025;
   public final double[][] field2026;
   public final Class9186 field2027;

   public Class446(Class9186 var1, int var2, int var3, double[][] var4) {
      this.field2027 = var1;
      this.field2024 = var2;
      this.field2025 = var3;
      this.field2026 = var4;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class9186.method34383(this.field2027)];

      for (int var4 = this.field2024; var4 < this.field2025; var4++) {
         for (int var5 = 0; var5 < Class9186.method34383(this.field2027); var5++) {
            var3[var5] = this.field2026[var5][var4];
         }

         Class9186.method34384(this.field2027).method33646(var3);

         for (int var6 = 0; var6 < Class9186.method34383(this.field2027); var6++) {
            this.field2026[var6][var4] = var3[var6];
         }
      }
   }
}
