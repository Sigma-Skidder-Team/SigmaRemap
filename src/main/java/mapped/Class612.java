package mapped;

public class Class612 implements Runnable {
   private static String[] field3032;
   public final long field3033;
   public final long field3034;
   public final long field3035;
   public final Class2381 field3036;
   public final Class2381 field3037;
   public final Class7990 field3038;

   public Class612(Class7990 var1, long var2, long var4, long var6, Class2381 var8, Class2381 var9) {
      this.field3038 = var1;
      this.field3033 = var2;
      this.field3034 = var4;
      this.field3035 = var6;
      this.field3036 = var8;
      this.field3037 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field3033; var3 < this.field3034; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         long var9 = this.field3035 + var3;
         this.field3036.method9687(var5, this.field3037.method9653(var9) * Class7990.method27243(this.field3038).method9653(var5));
         this.field3036.method9687(var7, -this.field3037.method9653(var9) * Class7990.method27243(this.field3038).method9653(var7));
      }
   }
}
