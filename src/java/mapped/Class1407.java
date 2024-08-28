package mapped;

public class Class1407 implements Runnable {
   private static String[] field7534;
   public final int field7535;
   public final int field7536;
   public final double[] field7537;
   public final boolean field7538;
   public final Class8832 field7539;

   public Class1407(Class8832 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field7539 = var1;
      this.field7535 = var2;
      this.field7536 = var3;
      this.field7537 = var4;
      this.field7538 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class8832.method31956(this.field7539)];

      for (int var4 = this.field7535; var4 < this.field7536; var4++) {
         int var5 = var4 * Class8832.method31955(this.field7539);

         for (int var6 = 0; var6 < Class8832.method31959(this.field7539); var6++) {
            for (int var7 = 0; var7 < Class8832.method31956(this.field7539); var7++) {
               int var8 = var5 + var7 * Class8832.method31957(this.field7539) + var6;
               var3[var7] = this.field7537[var8];
            }

            Class8832.method31960(this.field7539).method33650(var3, this.field7538);

            for (int var9 = 0; var9 < Class8832.method31956(this.field7539); var9++) {
               int var10 = var5 + var9 * Class8832.method31957(this.field7539) + var6;
               this.field7537[var10] = var3[var9];
            }
         }
      }
   }
}
