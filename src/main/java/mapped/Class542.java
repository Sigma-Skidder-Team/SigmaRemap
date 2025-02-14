package mapped;

public class Class542 implements Runnable {
   private static String[] field2597;
   public final long field2598;
   public final long field2599;
   public final Class2378 field2600;
   public final Class8543 field2601;

   public Class542(Class8543 var1, long var2, long var4, Class2378 var6) {
      this.field2601 = var1;
      this.field2598 = var2;
      this.field2599 = var4;
      this.field2600 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field2598; var3 < this.field2599; var3++) {
         Class8543.method30434(this.field2601).method30940(this.field2600, var3 * Class8543.method30439(this.field2601));
      }
   }
}
