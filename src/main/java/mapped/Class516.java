package mapped;

public class Class516 implements Runnable {
   private static String[] field2450;
   public final int field2451;
   public final long field2452;
   public final int field2453;
   public final Class2381 field2454;
   public final boolean field2455;
   public final Class9186 field2456;

   public Class516(Class9186 var1, int var2, long var3, int var5, Class2381 var6, boolean var7) {
      this.field2456 = var1;
      this.field2451 = var2;
      this.field2452 = var3;
      this.field2453 = var5;
      this.field2454 = var6;
      this.field2455 = var7;
   }

   @Override
   public void run() {
      if (this.field2451 != -1) {
         for (long var3 = this.field2452; var3 < Class9186.method34386(this.field2456); var3 += (long)this.field2453) {
            Class9186.method34382(this.field2456).method33653(this.field2454, var3 * Class9186.method34385(this.field2456), this.field2455);
         }
      } else {
         for (long var5 = this.field2452; var5 < Class9186.method34386(this.field2456); var5 += (long)this.field2453) {
            Class9186.method34382(this.field2456).method33649(this.field2454, var5 * Class9186.method34385(this.field2456));
         }
      }
   }
}
