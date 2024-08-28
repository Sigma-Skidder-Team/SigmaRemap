package mapped;

public class Class1371 implements Runnable {
   private static String[] field7321;
   public final int field7322;
   public final long field7323;
   public final long field7324;
   public final Class2378 field7325;
   public final Class8630 field7326;

   public Class1371(Class8630 var1, int var2, long var3, long var5, Class2378 var7) {
      this.field7326 = var1;
      this.field7322 = var2;
      this.field7323 = var3;
      this.field7324 = var5;
      this.field7325 = var7;
   }

   @Override
   public void run() {
      if (this.field7322 <= 0) {
         for (long var3 = this.field7323; var3 < this.field7324; var3++) {
            long var5 = 2L * var3;
            long var7 = var5 + 1L;
            float var9 = this.field7325.method9651(var5) * Class8630.method31011(this.field7326).method9651(var7)
               + this.field7325.method9651(var7) * Class8630.method31011(this.field7326).method9651(var5);
            this.field7325
               .method9685(
                  var5,
                  this.field7325.method9651(var5) * Class8630.method31011(this.field7326).method9651(var5)
                     - this.field7325.method9651(var7) * Class8630.method31011(this.field7326).method9651(var7)
               );
            this.field7325.method9685(var7, var9);
         }
      } else {
         for (long var10 = this.field7323; var10 < this.field7324; var10++) {
            long var11 = 2L * var10;
            long var12 = var11 + 1L;
            float var13 = -this.field7325.method9651(var11) * Class8630.method31011(this.field7326).method9651(var12)
               + this.field7325.method9651(var12) * Class8630.method31011(this.field7326).method9651(var11);
            this.field7325
               .method9685(
                  var11,
                  this.field7325.method9651(var11) * Class8630.method31011(this.field7326).method9651(var11)
                     + this.field7325.method9651(var12) * Class8630.method31011(this.field7326).method9651(var12)
               );
            this.field7325.method9685(var12, var13);
         }
      }
   }
}
