package mapped;

public class Class1398 implements Runnable {
   private static String[] field7476;
   public final long field7477;
   public final long field7478;
   public final Class2381 field7479;
   public final Class7990 field7480;

   public Class1398(Class7990 var1, long var2, long var4, Class2381 var6) {
      this.field7480 = var1;
      this.field7477 = var2;
      this.field7478 = var4;
      this.field7479 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field7477; var3 < this.field7478; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         double var9 = -this.field7479.method9653(var5) * Class7990.method27244(this.field7480).method9653(var7)
            + this.field7479.method9653(var7) * Class7990.method27244(this.field7480).method9653(var5);
         this.field7479
            .method9687(
               var5,
               this.field7479.method9653(var5) * Class7990.method27244(this.field7480).method9653(var5)
                  + this.field7479.method9653(var7) * Class7990.method27244(this.field7480).method9653(var7)
            );
         this.field7479.method9687(var7, var9);
      }
   }
}
