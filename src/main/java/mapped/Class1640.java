package mapped;

public class Class1640 implements Runnable {
   private static String[] field8904;
   public final int field8905;
   public final int field8906;
   public final double[] field8907;
   public final boolean field8908;
   public final Class8832 field8909;

   public Class1640(Class8832 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field8909 = var1;
      this.field8905 = var2;
      this.field8906 = var3;
      this.field8907 = var4;
      this.field8908 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class8832.method31961(this.field8909)];

      for (int var4 = this.field8905; var4 < this.field8906; var4++) {
         int var5 = var4 * Class8832.method31957(this.field8909);

         for (int var6 = 0; var6 < Class8832.method31959(this.field8909); var6++) {
            for (int var7 = 0; var7 < Class8832.method31961(this.field8909); var7++) {
               int var8 = var7 * Class8832.method31955(this.field8909) + var5 + var6;
               var3[var7] = this.field8907[var8];
            }

            Class8832.method31962(this.field8909).method33650(var3, this.field8908);

            for (int var9 = 0; var9 < Class8832.method31961(this.field8909); var9++) {
               int var10 = var9 * Class8832.method31955(this.field8909) + var5 + var6;
               this.field8907[var10] = var3[var9];
            }
         }
      }
   }
}
