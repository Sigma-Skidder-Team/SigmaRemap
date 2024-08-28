package mapped;

public class Class514 implements Runnable {
   private static String[] field2438;
   public final int field2439;
   public final int field2440;
   public final int field2441;
   public final double[] field2442;
   public final boolean field2443;
   public final Class9055 field2444;

   public Class514(Class9055 var1, int var2, int var3, int var4, double[] var5, boolean var6) {
      this.field2444 = var1;
      this.field2439 = var2;
      this.field2440 = var3;
      this.field2441 = var4;
      this.field2442 = var5;
      this.field2443 = var6;
   }

   @Override
   public void run() {
      if (this.field2439 != -1) {
         for (int var3 = this.field2440; var3 < Class9055.method33699(this.field2444); var3 += this.field2441) {
            Class9055.method33698(this.field2444).method33662(this.field2442, var3 * Class9055.method33697(this.field2444), this.field2443);
         }
      } else {
         for (int var4 = this.field2440; var4 < Class9055.method33699(this.field2444); var4 += this.field2441) {
            Class9055.method33698(this.field2444).method33658(this.field2442, var4 * Class9055.method33697(this.field2444), this.field2443);
         }
      }
   }
}
