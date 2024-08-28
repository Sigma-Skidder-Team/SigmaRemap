package mapped;

public class Class693 implements Runnable {
   private static String[] field3533;
   public final long field3534;
   public final long field3535;
   public final Class2381 field3536;
   public final boolean field3537;
   public final Class9330 field3538;

   public Class693(Class9330 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field3538 = var1;
      this.field3534 = var2;
      this.field3535 = var4;
      this.field3536 = var6;
      this.field3537 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field3534; var3 < this.field3535; var3++) {
         Class9330.method35278(this.field3538).method38583(this.field3536, var3 * Class9330.method35281(this.field3538), this.field3537);
      }
   }
}
