package mapped;

public class Class548 implements Runnable {
   private static String[] field2628;
   public final long field2629;
   public final long field2630;
   public final Class2378 field2631;
   public final boolean field2632;
   public final Class7824 field2633;

   public Class548(Class7824 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field2633 = var1;
      this.field2629 = var2;
      this.field2630 = var4;
      this.field2631 = var6;
      this.field2632 = var7;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(Class7824.method26188(this.field2633), false);

      for (long var4 = this.field2629; var4 < this.field2630; var4++) {
         long var6 = var4 * Class7824.method26187(this.field2633);

         for (long var8 = 0L; var8 < Class7824.method26190(this.field2633); var8++) {
            for (long var10 = 0L; var10 < Class7824.method26188(this.field2633); var10++) {
               long var12 = var6 + var10 * Class7824.method26189(this.field2633) + var8;
               var3.method9685(var10, this.field2631.method9651(var12));
            }

            Class7824.method26184(this.field2633).method29632(var3, this.field2632);

            for (long var14 = 0L; var14 < Class7824.method26188(this.field2633); var14++) {
               long var15 = var6 + var14 * Class7824.method26189(this.field2633) + var8;
               this.field2631.method9685(var15, var3.method9651(var14));
            }
         }
      }
   }
}
