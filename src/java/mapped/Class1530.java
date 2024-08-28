package mapped;

public class Class1530 implements Runnable {
   private static String[] field8299;
   public final int field8300;
   public final int field8301;
   public final double[][] field8302;
   public final double[][] field8303;
   public final Class9615 field8304;

   public Class1530(Class9615 var1, int var2, int var3, double[][] var4, double[][] var5) {
      this.field8304 = var1;
      this.field8300 = var2;
      this.field8301 = var3;
      this.field8302 = var4;
      this.field8303 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field8300; var3 < this.field8301; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < Class9615.method37424(this.field8304); var5++) {
            int var6 = 2 * var5;
            this.field8302[var3][var6] = this.field8303[var5][var4];
            this.field8302[var3][var6 + 1] = this.field8303[var5][var4 + 1];
         }

         Class9615.method37425(this.field8304).method27162(this.field8302[var3]);
      }
   }
}
