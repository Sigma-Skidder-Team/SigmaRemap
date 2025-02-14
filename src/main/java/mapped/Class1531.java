package mapped;

public class Class1531 implements Runnable {
   private static String[] field8305;
   public final long field8306;
   public final long field8307;
   public final Class2381 field8308;
   public final long field8309;
   public final boolean field8310;
   public final Class9615 field8311;

   public Class1531(Class9615 var1, long var2, long var4, Class2381 var6, long var7, boolean var9) {
      this.field8311 = var1;
      this.field8306 = var2;
      this.field8307 = var4;
      this.field8308 = var6;
      this.field8309 = var7;
      this.field8310 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field8306; var3 < this.field8307; var3++) {
         Class9615.method37423(this.field8311).method27169(this.field8308, var3 * this.field8309, this.field8310);
      }
   }
}
