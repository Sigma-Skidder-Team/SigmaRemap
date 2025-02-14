package mapped;

public class Class1356 implements Runnable {
   private static String[] field7231;
   public final int field7232;
   public final int field7233;
   public final double[] field7234;
   public final Class8832 field7235;

   public Class1356(Class8832 var1, int var2, int var3, double[] var4) {
      this.field7235 = var1;
      this.field7232 = var2;
      this.field7233 = var3;
      this.field7234 = var4;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class8832.method31956(this.field7235)];

      for (int var4 = this.field7232; var4 < this.field7233; var4++) {
         int var5 = var4 * Class8832.method31955(this.field7235);

         for (int var6 = 0; var6 < Class8832.method31959(this.field7235); var6++) {
            for (int var7 = 0; var7 < Class8832.method31956(this.field7235); var7++) {
               int var8 = var5 + var7 * Class8832.method31957(this.field7235) + var6;
               var3[var7] = this.field7234[var8];
            }

            Class8832.method31960(this.field7235).method33646(var3);

            for (int var9 = 0; var9 < Class8832.method31956(this.field7235); var9++) {
               int var10 = var5 + var9 * Class8832.method31957(this.field7235) + var6;
               this.field7234[var10] = var3[var9];
            }
         }
      }
   }
}
