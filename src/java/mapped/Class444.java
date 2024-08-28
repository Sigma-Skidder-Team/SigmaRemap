package mapped;

public class Class444 implements Runnable {
   private static String[] field2011;
   public final long field2012;
   public final long field2013;
   public final Class2381 field2014;
   public final boolean field2015;
   public final Class9615 field2016;

   public Class444(Class9615 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field2016 = var1;
      this.field2012 = var2;
      this.field2013 = var4;
      this.field2014 = var6;
      this.field2015 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field2012; var3 < this.field2013; var3++) {
         Class9615.method37423(this.field2016).method27187(this.field2014, var3 * Class9615.method37428(this.field2016), this.field2015);
      }
   }
}
