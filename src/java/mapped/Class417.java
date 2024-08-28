package mapped;

public class Class417 implements Runnable {
   private static String[] field1831;
   public final long field1832;
   public final long field1833;
   public final Class2378 field1834;
   public final Class8630 field1835;

   public Class417(Class8630 var1, long var2, long var4, Class2378 var6) {
      this.field1835 = var1;
      this.field1832 = var2;
      this.field1833 = var4;
      this.field1834 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field1832; var3 < this.field1833; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         float var9 = -this.field1834.method9651(var5) * Class8630.method31011(this.field1835).method9651(var7)
            + this.field1834.method9651(var7) * Class8630.method31011(this.field1835).method9651(var5);
         this.field1834
            .method9685(
               var5,
               this.field1834.method9651(var5) * Class8630.method31011(this.field1835).method9651(var5)
                  + this.field1834.method9651(var7) * Class8630.method31011(this.field1835).method9651(var7)
            );
         this.field1834.method9685(var7, var9);
      }
   }
}
