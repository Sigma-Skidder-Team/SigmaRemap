package mapped;

public class Class534 implements Runnable {
   private static String[] field2551;
   public final long field2552;
   public final long field2553;
   public final Class2378 field2554;
   public final long field2555;
   public final Class8543 field2556;

   public Class534(Class8543 var1, long var2, long var4, Class2378 var6, long var7) {
      this.field2556 = var1;
      this.field2552 = var2;
      this.field2553 = var4;
      this.field2554 = var6;
      this.field2555 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field2552; var3 < this.field2553; var3++) {
         Class8543.method30434(this.field2556).method30932(this.field2554, var3 * this.field2555);
      }
   }
}
