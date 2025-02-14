package mapped;

public class Class604 implements Runnable {
   private static String[] field2979;
   public final int field2980;
   public final int field2981;
   public final int field2982;
   public final float[] field2983;
   public final float[] field2984;
   public final Class8431 field2985;

   public Class604(Class8431 var1, int var2, int var3, int var4, float[] var5, float[] var6) {
      this.field2985 = var1;
      this.field2980 = var2;
      this.field2981 = var3;
      this.field2982 = var4;
      this.field2983 = var5;
      this.field2984 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field2980; var3 < this.field2981; var3++) {
         int var4 = 2 * var3;
         int var5 = this.field2982 + var3;
         this.field2983[var5] = Class8431.method29641(this.field2985)[var4] * this.field2984[var4]
            - Class8431.method29641(this.field2985)[var4 + 1] * this.field2984[var4 + 1];
      }
   }
}
