package mapped;

public class Class1549 implements Runnable {
   private static String[] field8403;
   public final long field8404;
   public final long field8405;
   public final Class2381 field8406;
   public final boolean field8407;
   public final Class9330 field8408;

   public Class1549(Class9330 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field8408 = var1;
      this.field8404 = var2;
      this.field8405 = var4;
      this.field8406 = var6;
      this.field8407 = var7;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(Class9330.method35282(this.field8408), false);

      for (long var4 = this.field8404; var4 < this.field8405; var4++) {
         for (long var6 = 0L; var6 < Class9330.method35282(this.field8408); var6++) {
            var3.method9687(var6, this.field8406.method9653(var6 * Class9330.method35281(this.field8408) + var4));
         }

         Class9330.method35280(this.field8408).method38581(var3, this.field8407);

         for (long var8 = 0L; var8 < Class9330.method35282(this.field8408); var8++) {
            this.field8406.method9687(var8 * Class9330.method35281(this.field8408) + var4, var3.method9653(var8));
         }
      }
   }
}
