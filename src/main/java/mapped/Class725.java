package mapped;

public class Class725 implements Runnable {
   private static String[] field3737;
   public final int field3738;
   public final int field3739;
   public final int field3740;
   public final double[][] field3741;
   public final double[][] field3742;
   public final Class9615 field3743;

   public Class725(Class9615 var1, int var2, int var3, int var4, double[][] var5, double[][] var6) {
      this.field3743 = var1;
      this.field3738 = var2;
      this.field3739 = var3;
      this.field3740 = var4;
      this.field3741 = var5;
      this.field3742 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field3738; var3 < this.field3739; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < this.field3740; var5++) {
            int var6 = 2 * var5;
            this.field3741[var3][var6] = this.field3742[var5][var4];
            this.field3741[var3][var6 + 1] = this.field3742[var5][var4 + 1];
         }
      }
   }
}
