package mapped;

public class Class1611 implements Runnable {
   private static String[] field8728;
   public final int field8729;
   public final int field8730;
   public final int field8731;
   public final double[][] field8732;
   public final Class9615 field8733;

   public Class1611(Class9615 var1, int var2, int var3, int var4, double[][] var5) {
      this.field8733 = var1;
      this.field8729 = var2;
      this.field8730 = var3;
      this.field8731 = var4;
      this.field8732 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field8729; var3 < this.field8730; var3++) {
         int var4 = Class9615.method37424(this.field8733) - var3;

         for (int var5 = this.field8731; var5 < Class9615.method37427(this.field8733); var5++) {
            int var6 = 2 * var5;
            int var7 = 2 * (Class9615.method37427(this.field8733) - var5);
            this.field8732[0][var6] = this.field8732[0][var7];
            this.field8732[0][var6 + 1] = -this.field8732[0][var7 + 1];
            this.field8732[var3][var6] = this.field8732[var4][var7];
            this.field8732[var3][var6 + 1] = -this.field8732[var4][var7 + 1];
         }
      }
   }
}
