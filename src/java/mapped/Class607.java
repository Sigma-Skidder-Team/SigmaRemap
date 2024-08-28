package mapped;

public class Class607 implements Runnable {
   private static String[] field2998;
   public final int field2999;
   public final int field3000;
   public final int field3001;
   public final int field3002;
   public final double[] field3003;
   public final boolean field3004;
   public final Class9615 field3005;

   public Class607(Class9615 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field3005 = var1;
      this.field2999 = var2;
      this.field3000 = var3;
      this.field3001 = var4;
      this.field3002 = var5;
      this.field3003 = var6;
      this.field3004 = var7;
   }

   @Override
   public void run() {
      if (this.field2999 != 0) {
         if (this.field3000 != 1) {
            for (int var3 = this.field3001; var3 < Class9615.method37424(this.field3005); var3 += this.field3002) {
               Class9615.method37423(this.field3005).method27186(this.field3003, var3 * Class9615.method37427(this.field3005), this.field3004);
            }
         } else {
            for (int var4 = this.field3001; var4 < Class9615.method37424(this.field3005); var4 += this.field3002) {
               Class9615.method37423(this.field3005).method27172(this.field3003, var4 * Class9615.method37427(this.field3005));
            }
         }
      } else if (this.field3000 != -1) {
         for (int var5 = this.field3001; var5 < Class9615.method37424(this.field3005); var5 += this.field3002) {
            Class9615.method37423(this.field3005).method27168(this.field3003, var5 * Class9615.method37427(this.field3005), this.field3004);
         }
      } else {
         for (int var6 = this.field3001; var6 < Class9615.method37424(this.field3005); var6 += this.field3002) {
            Class9615.method37423(this.field3005).method27164(this.field3003, var6 * Class9615.method37427(this.field3005));
         }
      }
   }
}
