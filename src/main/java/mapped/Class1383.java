package mapped;

public class Class1383 implements Runnable {
   private static String[] field7389;
   public final int field7390;
   public final int field7391;
   public final int field7392;
   public final double[][] field7393;
   public final Class9615 field7394;

   public Class1383(Class9615 var1, int var2, int var3, int var4, double[][] var5) {
      this.field7394 = var1;
      this.field7390 = var2;
      this.field7391 = var3;
      this.field7392 = var4;
      this.field7393 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field7390; var3 < this.field7391; var3++) {
         int var4 = Class9615.method37424(this.field7394) - var3;

         for (int var5 = this.field7392; var5 < Class9615.method37427(this.field7394); var5++) {
            int var6 = 2 * var5;
            int var7 = 2 * (Class9615.method37427(this.field7394) - var5);
            this.field7393[0][var6] = this.field7393[0][var7];
            this.field7393[0][var6 + 1] = -this.field7393[0][var7 + 1];
            this.field7393[var3][var6] = this.field7393[var4][var7];
            this.field7393[var3][var6 + 1] = -this.field7393[var4][var7 + 1];
         }
      }
   }
}
