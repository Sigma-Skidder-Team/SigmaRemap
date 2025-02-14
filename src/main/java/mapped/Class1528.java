package mapped;

public class Class1528 implements Runnable {
   private static String[] field8282;
   public final int field8283;
   public final int field8284;
   public final int field8285;
   public final int field8286;
   public final double[] field8287;
   public final boolean field8288;
   public final Class9615 field8289;

   public Class1528(Class9615 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field8289 = var1;
      this.field8283 = var2;
      this.field8284 = var3;
      this.field8285 = var4;
      this.field8286 = var5;
      this.field8287 = var6;
      this.field8288 = var7;
   }

   @Override
   public void run() {
      if (this.field8283 != 0) {
         if (this.field8284 != 1) {
            for (int var3 = this.field8285; var3 < Class9615.method37424(this.field8289); var3 += this.field8286) {
               Class9615.method37423(this.field8289).method27180(this.field8287, var3 * Class9615.method37427(this.field8289), this.field8288);
            }
         } else {
            for (int var4 = this.field8285; var4 < Class9615.method37424(this.field8289); var4 += this.field8286) {
               Class9615.method37423(this.field8289).method27172(this.field8287, var4 * Class9615.method37427(this.field8289));
            }
         }
      } else if (this.field8284 != -1) {
         for (int var5 = this.field8285; var5 < Class9615.method37424(this.field8289); var5 += this.field8286) {
            Class9615.method37423(this.field8289).method27168(this.field8287, var5 * Class9615.method37427(this.field8289), this.field8288);
         }
      } else {
         for (int var6 = this.field8285; var6 < Class9615.method37424(this.field8289); var6 += this.field8286) {
            Class9615.method37423(this.field8289).method27164(this.field8287, var6 * Class9615.method37427(this.field8289));
         }
      }
   }
}
