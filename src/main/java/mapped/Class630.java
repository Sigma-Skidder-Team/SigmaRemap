package mapped;

public class Class630 implements Runnable {
   private static String[] field3137;
   public final long field3138;
   public final long field3139;
   public final long field3140;
   public final Class2378 field3141;
   public final Class8630 field3142;

   public Class630(Class8630 var1, long var2, long var4, long var6, Class2378 var8) {
      this.field3142 = var1;
      this.field3138 = var2;
      this.field3139 = var4;
      this.field3140 = var6;
      this.field3141 = var8;
   }

   @Override
   public void run() {
      if (this.field3138 <= 0L) {
         for (long var3 = this.field3139; var3 < this.field3140; var3++) {
            long var5 = 2L * var3;
            long var7 = var5 + 1L;
            float var9 = this.field3141.method9651(var5) * Class8630.method31011(this.field3142).method9651(var7)
               + this.field3141.method9651(var7) * Class8630.method31011(this.field3142).method9651(var5);
            this.field3141
               .method9685(
                  var5,
                  this.field3141.method9651(var5) * Class8630.method31011(this.field3142).method9651(var5)
                     - this.field3141.method9651(var7) * Class8630.method31011(this.field3142).method9651(var7)
               );
            this.field3141.method9685(var7, var9);
         }
      } else {
         for (long var10 = this.field3139; var10 < this.field3140; var10++) {
            long var11 = 2L * var10;
            long var12 = var11 + 1L;
            float var13 = -this.field3141.method9651(var11) * Class8630.method31011(this.field3142).method9651(var12)
               + this.field3141.method9651(var12) * Class8630.method31011(this.field3142).method9651(var11);
            this.field3141
               .method9685(
                  var11,
                  this.field3141.method9651(var11) * Class8630.method31011(this.field3142).method9651(var11)
                     + this.field3141.method9651(var12) * Class8630.method31011(this.field3142).method9651(var12)
               );
            this.field3141.method9685(var12, var13);
         }
      }
   }
}
