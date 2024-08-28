package mapped;

public class Class734 implements Runnable {
   private static String[] field3799;
   public final int field3800;
   public final int field3801;
   public final double[] field3802;
   public final Class8832 field3803;

   public Class734(Class8832 var1, int var2, int var3, double[] var4) {
      this.field3803 = var1;
      this.field3800 = var2;
      this.field3801 = var3;
      this.field3802 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field3800; var3 < this.field3801; var3++) {
         int var4 = var3 * Class8832.method31955(this.field3803);

         for (int var5 = 0; var5 < Class8832.method31956(this.field3803); var5++) {
            Class8832.method31958(this.field3803).method33648(this.field3802, var4 + var5 * Class8832.method31957(this.field3803));
         }
      }
   }
}
