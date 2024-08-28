package mapped;

public class Class783 implements Runnable {
   private static String[] field4095;
   public final long field4096;
   public final long field4097;
   public final Class2378 field4098;
   public final boolean field4099;
   public final Class9533 field4100;

   public Class783(Class9533 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field4100 = var1;
      this.field4096 = var2;
      this.field4097 = var4;
      this.field4098 = var6;
      this.field4099 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field4096; var3 < this.field4097; var3++) {
         Class9533.method36857(this.field4100).method29634(this.field4098, var3 * Class9533.method36860(this.field4100), this.field4099);
      }
   }
}
