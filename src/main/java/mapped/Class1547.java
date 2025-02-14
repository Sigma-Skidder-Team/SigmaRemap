package mapped;

public class Class1547 implements Runnable {
   private static String[] field8390;
   public final long field8391;
   public final long field8392;
   public final Class2378 field8393;
   public final long field8394;
   public final Class2378 field8395;
   public final Class8630 field8396;

   public Class1547(Class8630 var1, long var2, long var4, Class2378 var6, long var7, Class2378 var9) {
      this.field8396 = var1;
      this.field8391 = var2;
      this.field8392 = var4;
      this.field8393 = var6;
      this.field8394 = var7;
      this.field8395 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field8391; var3 < this.field8392; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         this.field8393
            .method9685(
               this.field8394 + var3,
               Class8630.method31010(this.field8396).method9651(var5) * this.field8395.method9651(var5)
                  - Class8630.method31010(this.field8396).method9651(var7) * this.field8395.method9651(var7)
            );
      }
   }
}
