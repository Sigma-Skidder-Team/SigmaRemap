package mapped;

public class Class477 implements Runnable {
   private static String[] field2231;
   public final long field2232;
   public final long field2233;
   public final Class2378 field2234;
   public final Class8026 field2235;

   public Class477(Class8026 var1, long var2, long var4, Class2378 var6) {
      this.field2235 = var1;
      this.field2232 = var2;
      this.field2233 = var4;
      this.field2234 = var6;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(2L * Class8026.method27521(this.field2235), false);

      for (long var4 = this.field2232; var4 < this.field2233; var4++) {
         long var6 = var4 * Class8026.method27520(this.field2235);

         for (long var8 = 0L; var8 < Class8026.method27523(this.field2235); var8++) {
            long var10 = 2L * var8;

            for (long var12 = 0L; var12 < Class8026.method27521(this.field2235); var12++) {
               long var14 = var6 + var10 + var12 * Class8026.method27522(this.field2235);
               long var16 = 2L * var12;
               var3.method9685(var16, this.field2234.method9651(var14));
               var3.method9685(var16 + 1L, this.field2234.method9651(var14 + 1L));
            }

            Class8026.method27517(this.field2235).method30930(var3);

            for (long var18 = 0L; var18 < Class8026.method27521(this.field2235); var18++) {
               long var19 = var6 + var10 + var18 * Class8026.method27522(this.field2235);
               long var20 = 2L * var18;
               this.field2234.method9685(var19, var3.method9651(var20));
               this.field2234.method9685(var19 + 1L, var3.method9651(var20 + 1L));
            }
         }
      }
   }
}
