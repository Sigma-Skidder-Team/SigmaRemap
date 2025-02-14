package mapped;

public class Class469 implements Runnable {
   private static String[] field2179;
   public final int field2180;
   public final int field2181;
   public final double[] field2182;
   public final Class8832 field2183;

   public Class469(Class8832 var1, int var2, int var3, double[] var4) {
      this.field2183 = var1;
      this.field2180 = var2;
      this.field2181 = var3;
      this.field2182 = var4;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class8832.method31961(this.field2183)];

      for (int var4 = this.field2180; var4 < this.field2181; var4++) {
         int var5 = var4 * Class8832.method31957(this.field2183);

         for (int var6 = 0; var6 < Class8832.method31959(this.field2183); var6++) {
            for (int var7 = 0; var7 < Class8832.method31961(this.field2183); var7++) {
               int var8 = var7 * Class8832.method31955(this.field2183) + var5 + var6;
               var3[var7] = this.field2182[var8];
            }

            Class8832.method31962(this.field2183).method33646(var3);

            for (int var9 = 0; var9 < Class8832.method31961(this.field2183); var9++) {
               int var10 = var9 * Class8832.method31955(this.field2183) + var5 + var6;
               this.field2182[var10] = var3[var9];
            }
         }
      }
   }
}
