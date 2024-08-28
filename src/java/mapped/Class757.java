package mapped;

public class Class757 implements Runnable {
   private static String[] field3923;
   public final long field3924;
   public final int field3925;
   public final int field3926;
   public final int field3927;
   public final Class2381 field3928;
   public final boolean field3929;
   public final Class9615 field3930;

   public Class757(Class9615 var1, long var2, int var4, int var5, int var6, Class2381 var7, boolean var8) {
      this.field3930 = var1;
      this.field3924 = var2;
      this.field3925 = var4;
      this.field3926 = var5;
      this.field3927 = var6;
      this.field3928 = var7;
      this.field3929 = var8;
   }

   @Override
   public void run() {
      if (this.field3924 != 0L) {
         if (this.field3925 != 1) {
            for (long var3 = (long)this.field3926; var3 < Class9615.method37426(this.field3930); var3 += (long)this.field3927) {
               Class9615.method37423(this.field3930).method27181(this.field3928, var3 * Class9615.method37428(this.field3930), this.field3929);
            }
         } else {
            for (long var5 = (long)this.field3926; var5 < Class9615.method37426(this.field3930); var5 += (long)this.field3927) {
               Class9615.method37423(this.field3930).method27173(this.field3928, var5 * Class9615.method37428(this.field3930));
            }
         }
      } else if (this.field3925 != -1) {
         for (long var6 = (long)this.field3926; var6 < Class9615.method37426(this.field3930); var6 += (long)this.field3927) {
            Class9615.method37423(this.field3930).method27169(this.field3928, var6 * Class9615.method37428(this.field3930), this.field3929);
         }
      } else {
         for (long var7 = (long)this.field3926; var7 < Class9615.method37426(this.field3930); var7 += (long)this.field3927) {
            Class9615.method37423(this.field3930).method27165(this.field3928, var7 * Class9615.method37428(this.field3930));
         }
      }
   }
}
