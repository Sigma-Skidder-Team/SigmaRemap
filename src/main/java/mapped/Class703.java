package mapped;

public class Class703 implements Runnable {
   private static String[] field3595;
   public final long field3596;
   public final long field3597;
   public final Class2381 field3598;
   public final long field3599;
   public final Class2381 field3600;
   public final Class7990 field3601;

   public Class703(Class7990 var1, long var2, long var4, Class2381 var6, long var7, Class2381 var9) {
      this.field3601 = var1;
      this.field3596 = var2;
      this.field3597 = var4;
      this.field3598 = var6;
      this.field3599 = var7;
      this.field3600 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field3596; var3 < this.field3597; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         this.field3598
            .method9687(
               this.field3599 + var3,
               Class7990.method27243(this.field3601).method9653(var5) * this.field3600.method9653(var5)
                  - Class7990.method27243(this.field3601).method9653(var7) * this.field3600.method9653(var7)
            );
      }
   }
}
