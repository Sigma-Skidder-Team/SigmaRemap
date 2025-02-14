package mapped;

public class Class447 implements Runnable {
   private static String[] field2028;
   public final int field2029;
   public final long field2030;
   public final long field2031;
   public final Class2381 field2032;
   public final Class7990 field2033;

   public Class447(Class7990 var1, int var2, long var3, long var5, Class2381 var7) {
      this.field2033 = var1;
      this.field2029 = var2;
      this.field2030 = var3;
      this.field2031 = var5;
      this.field2032 = var7;
   }

   @Override
   public void run() {
      if (this.field2029 <= 0) {
         for (long var3 = this.field2030; var3 < this.field2031; var3++) {
            long var5 = 2L * var3;
            long var7 = var5 + 1L;
            double var9 = this.field2032.method9653(var5) * Class7990.method27244(this.field2033).method9653(var7)
               + this.field2032.method9653(var7) * Class7990.method27244(this.field2033).method9653(var5);
            this.field2032
               .method9687(
                  var5,
                  this.field2032.method9653(var5) * Class7990.method27244(this.field2033).method9653(var5)
                     - this.field2032.method9653(var7) * Class7990.method27244(this.field2033).method9653(var7)
               );
            this.field2032.method9687(var7, var9);
         }
      } else {
         for (long var11 = this.field2030; var11 < this.field2031; var11++) {
            long var12 = 2L * var11;
            long var13 = var12 + 1L;
            double var14 = -this.field2032.method9653(var12) * Class7990.method27244(this.field2033).method9653(var13)
               + this.field2032.method9653(var13) * Class7990.method27244(this.field2033).method9653(var12);
            this.field2032
               .method9687(
                  var12,
                  this.field2032.method9653(var12) * Class7990.method27244(this.field2033).method9653(var12)
                     + this.field2032.method9653(var13) * Class7990.method27244(this.field2033).method9653(var13)
               );
            this.field2032.method9687(var13, var14);
         }
      }
   }
}
