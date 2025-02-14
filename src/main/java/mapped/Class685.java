package mapped;

public class Class685 implements Runnable {
   private static String[] field3494;
   public final long field3495;
   public final long field3496;
   public final long field3497;
   public final long field3498;
   public final Class2381 field3499;
   public final Class7990 field3500;

   public Class685(Class7990 var1, long var2, long var4, long var6, long var8, Class2381 var10) {
      this.field3500 = var1;
      this.field3495 = var2;
      this.field3496 = var4;
      this.field3497 = var6;
      this.field3498 = var8;
      this.field3499 = var10;
   }

   @Override
   public void run() {
      for (long var3 = this.field3495; var3 < this.field3496; var3++) {
         long var5 = 2L * var3;
         long var7 = this.field3497 + (this.field3498 - var5) % this.field3498;
         this.field3499.method9687(var7, this.field3499.method9653(this.field3497 + var5));
         this.field3499.method9687(var7 + 1L, -this.field3499.method9653(this.field3497 + var5 + 1L));
      }
   }
}
