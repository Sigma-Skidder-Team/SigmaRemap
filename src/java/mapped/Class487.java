package mapped;

public class Class487 implements Runnable {
   private static String[] field2291;
   public final int field2292;
   public final int field2293;
   public final int field2294;
   public final int field2295;
   public final double[] field2296;
   public final Class7990 field2297;

   public Class487(Class7990 var1, int var2, int var3, int var4, int var5, double[] var6) {
      this.field2297 = var1;
      this.field2292 = var2;
      this.field2293 = var3;
      this.field2294 = var4;
      this.field2295 = var5;
      this.field2296 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field2292; var3 < this.field2293; var3++) {
         int var4 = 2 * var3;
         int var5 = this.field2294 + (this.field2295 - var4) % this.field2295;
         this.field2296[var5] = this.field2296[this.field2294 + var4];
         this.field2296[var5 + 1] = -this.field2296[this.field2294 + var4 + 1];
      }
   }
}
