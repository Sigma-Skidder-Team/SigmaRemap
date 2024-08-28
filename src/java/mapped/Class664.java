package mapped;

public class Class664 implements Runnable {
   private static String[] field3345;
   public final long field3346;
   public final int field3347;
   public final long field3348;
   public final int field3349;
   public final Class2381 field3350;
   public final boolean field3351;
   public final Class9615 field3352;

   public Class664(Class9615 var1, long var2, int var4, long var5, int var7, Class2381 var8, boolean var9) {
      this.field3352 = var1;
      this.field3346 = var2;
      this.field3347 = var4;
      this.field3348 = var5;
      this.field3349 = var7;
      this.field3350 = var8;
      this.field3351 = var9;
   }

   @Override
   public void run() {
      if (this.field3346 != 0L) {
         if (this.field3347 != 1) {
            for (long var3 = this.field3348; var3 < Class9615.method37426(this.field3352); var3 += (long)this.field3349) {
               Class9615.method37423(this.field3352).method27187(this.field3350, var3 * Class9615.method37428(this.field3352), this.field3351);
            }
         } else {
            for (long var5 = this.field3348; var5 < Class9615.method37426(this.field3352); var5 += (long)this.field3349) {
               Class9615.method37423(this.field3352).method27173(this.field3350, var5 * Class9615.method37428(this.field3352));
            }
         }
      } else if (this.field3347 != -1) {
         for (long var6 = this.field3348; var6 < Class9615.method37426(this.field3352); var6 += (long)this.field3349) {
            Class9615.method37423(this.field3352).method27169(this.field3350, var6 * Class9615.method37428(this.field3352), this.field3351);
         }
      } else {
         for (long var7 = this.field3348; var7 < Class9615.method37426(this.field3352); var7 += (long)this.field3349) {
            Class9615.method37423(this.field3352).method27165(this.field3350, var7 * Class9615.method37428(this.field3352));
         }
      }
   }
}
