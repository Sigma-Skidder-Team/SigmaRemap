package mapped;

public class Class533 implements Runnable {
   private static String[] field2546;
   public final long field2547;
   public final long field2548;
   public final Class2381 field2549;
   public final Class7990 field2550;

   public Class533(Class7990 var1, long var2, long var4, Class2381 var6) {
      this.field2550 = var1;
      this.field2547 = var2;
      this.field2548 = var4;
      this.field2549 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field2547; var3 < this.field2548; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         double var9 = this.field2549.method9653(var5) * Class7990.method27244(this.field2550).method9653(var7)
            + this.field2549.method9653(var7) * Class7990.method27244(this.field2550).method9653(var5);
         this.field2549
            .method9687(
               var5,
               this.field2549.method9653(var5) * Class7990.method27244(this.field2550).method9653(var5)
                  - this.field2549.method9653(var7) * Class7990.method27244(this.field2550).method9653(var7)
            );
         this.field2549.method9687(var7, var9);
      }
   }
}
