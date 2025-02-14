package mapped;

public class Class472 implements Runnable {
   private static String[] field2197;
   public final long field2198;
   public final long field2199;
   public final long field2200;
   public final Class2381 field2201;
   public final Class2381 field2202;
   public final Class7990 field2203;

   public Class472(Class7990 var1, long var2, long var4, long var6, Class2381 var8, Class2381 var9) {
      this.field2203 = var1;
      this.field2198 = var2;
      this.field2199 = var4;
      this.field2200 = var6;
      this.field2201 = var8;
      this.field2202 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field2198; var3 < this.field2199; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         long var9 = this.field2200 + var3;
         this.field2201.method9687(var5, this.field2202.method9653(var9) * Class7990.method27243(this.field2203).method9653(var5));
         this.field2201.method9687(var7, this.field2202.method9653(var9) * Class7990.method27243(this.field2203).method9653(var7));
      }
   }
}
