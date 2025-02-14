package mapped;

public class Class760 implements Runnable {
   private static String[] field3945;
   public final long field3946;
   public final long field3947;
   public final long field3948;
   public final long field3949;
   public final Class2381 field3950;
   public final Class2381 field3951;
   public final Class7990 field3952;

   public Class760(Class7990 var1, long var2, long var4, long var6, long var8, Class2381 var10, Class2381 var11) {
      this.field3952 = var1;
      this.field3946 = var2;
      this.field3947 = var4;
      this.field3948 = var6;
      this.field3949 = var8;
      this.field3950 = var10;
      this.field3951 = var11;
   }

   @Override
   public void run() {
      if (this.field3946 <= 0L) {
         for (long var3 = this.field3947; var3 < this.field3948; var3++) {
            long var5 = 2L * var3;
            long var7 = var5 + 1L;
            long var9 = this.field3949 + var3;
            this.field3950.method9687(var5, this.field3951.method9653(var9) * Class7990.method27243(this.field3952).method9653(var5));
            this.field3950.method9687(var7, -this.field3951.method9653(var9) * Class7990.method27243(this.field3952).method9653(var7));
         }
      } else {
         for (long var11 = this.field3947; var11 < this.field3948; var11++) {
            long var12 = 2L * var11;
            long var13 = var12 + 1L;
            long var14 = this.field3949 + var11;
            this.field3950.method9687(var12, this.field3951.method9653(var14) * Class7990.method27243(this.field3952).method9653(var12));
            this.field3950.method9687(var13, this.field3951.method9653(var14) * Class7990.method27243(this.field3952).method9653(var13));
         }
      }
   }
}
