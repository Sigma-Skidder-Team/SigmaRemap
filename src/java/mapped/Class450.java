package mapped;

public class Class450 implements Runnable {
   private static String[] field2049;
   public final long field2050;
   public final long field2051;
   public final long field2052;
   public final Class2381 field2053;
   public final Class7990 field2054;

   public Class450(Class7990 var1, long var2, long var4, long var6, Class2381 var8) {
      this.field2054 = var1;
      this.field2050 = var2;
      this.field2051 = var4;
      this.field2052 = var6;
      this.field2053 = var8;
   }

   @Override
   public void run() {
      if (this.field2050 <= 0L) {
         for (long var3 = this.field2051; var3 < this.field2052; var3++) {
            long var5 = 2L * var3;
            long var7 = var5 + 1L;
            double var9 = this.field2053.method9653(var5) * Class7990.method27244(this.field2054).method9653(var7)
               + this.field2053.method9653(var7) * Class7990.method27244(this.field2054).method9653(var5);
            this.field2053
               .method9687(
                  var5,
                  this.field2053.method9653(var5) * Class7990.method27244(this.field2054).method9653(var5)
                     - this.field2053.method9653(var7) * Class7990.method27244(this.field2054).method9653(var7)
               );
            this.field2053.method9687(var7, var9);
         }
      } else {
         for (long var11 = this.field2051; var11 < this.field2052; var11++) {
            long var12 = 2L * var11;
            long var13 = var12 + 1L;
            double var14 = -this.field2053.method9653(var12) * Class7990.method27244(this.field2054).method9653(var13)
               + this.field2053.method9653(var13) * Class7990.method27244(this.field2054).method9653(var12);
            this.field2053
               .method9687(
                  var12,
                  this.field2053.method9653(var12) * Class7990.method27244(this.field2054).method9653(var12)
                     + this.field2053.method9653(var13) * Class7990.method27244(this.field2054).method9653(var13)
               );
            this.field2053.method9687(var13, var14);
         }
      }
   }
}
