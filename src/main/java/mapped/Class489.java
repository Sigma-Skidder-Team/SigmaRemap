package mapped;

public class Class489 implements Runnable {
   private static String[] field2303;
   public final long field2304;
   public final long field2305;
   public final long field2306;
   public final long field2307;
   public final Class2378 field2308;
   public final Class8630 field2309;

   public Class489(Class8630 var1, long var2, long var4, long var6, long var8, Class2378 var10) {
      this.field2309 = var1;
      this.field2304 = var2;
      this.field2305 = var4;
      this.field2306 = var6;
      this.field2307 = var8;
      this.field2308 = var10;
   }

   @Override
   public void run() {
      for (long var3 = this.field2304; var3 < this.field2305; var3++) {
         long var5 = 2L * var3;
         long var7 = this.field2306 + (this.field2307 - var5) % this.field2307;
         this.field2308.method9685(var7, this.field2308.method9651(this.field2306 + var5));
         this.field2308.method9685(var7 + 1L, -this.field2308.method9651(this.field2306 + var5 + 1L));
      }
   }
}
