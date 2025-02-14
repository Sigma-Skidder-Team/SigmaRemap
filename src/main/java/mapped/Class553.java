package mapped;

public class Class553 implements Runnable {
   private static String[] field2657;
   public final long field2658;
   public final long field2659;
   public final Class2378 field2660;
   public final boolean field2661;
   public final Class8162 field2662;

   public Class553(Class8162 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field2662 = var1;
      this.field2658 = var2;
      this.field2659 = var4;
      this.field2660 = var6;
      this.field2661 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field2658; var3 < this.field2659; var3++) {
         long var5 = var3 * Class8162.method28403(this.field2662);

         for (long var7 = 0L; var7 < Class8162.method28400(this.field2662); var7++) {
            Class8162.method28395(this.field2662).method28462(this.field2660, var5 + var7 * Class8162.method28404(this.field2662), this.field2661);
         }
      }
   }
}
