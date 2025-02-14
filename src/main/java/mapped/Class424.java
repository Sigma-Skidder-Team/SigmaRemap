package mapped;

public class Class424 implements Runnable {
   private static String[] field1874;
   public final long field1875;
   public final long field1876;
   public final Class2378 field1877;
   public final Class8630 field1878;

   public Class424(Class8630 var1, long var2, long var4, Class2378 var6) {
      this.field1878 = var1;
      this.field1875 = var2;
      this.field1876 = var4;
      this.field1877 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field1875; var3 < this.field1876; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         float var9 = this.field1877.method9651(var5) * Class8630.method31011(this.field1878).method9651(var7)
            + this.field1877.method9651(var7) * Class8630.method31011(this.field1878).method9651(var5);
         this.field1877
            .method9685(
               var5,
               this.field1877.method9651(var5) * Class8630.method31011(this.field1878).method9651(var5)
                  - this.field1877.method9651(var7) * Class8630.method31011(this.field1878).method9651(var7)
            );
         this.field1877.method9685(var7, var9);
      }
   }
}
