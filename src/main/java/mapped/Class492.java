package mapped;

public class Class492 implements Runnable {
   private static String[] field2327;
   public final long field2328;
   public final long field2329;
   public final Class2378 field2330;
   public final boolean field2331;
   public final Class7824 field2332;

   public Class492(Class7824 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field2332 = var1;
      this.field2328 = var2;
      this.field2329 = var4;
      this.field2330 = var6;
      this.field2331 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field2328; var3 < this.field2329; var3++) {
         long var5 = var3 * Class7824.method26187(this.field2332);

         for (long var7 = 0L; var7 < Class7824.method26188(this.field2332); var7++) {
            Class7824.method26182(this.field2332).method29630(this.field2330, var5 + var7 * Class7824.method26189(this.field2332), this.field2331);
         }
      }
   }
}
