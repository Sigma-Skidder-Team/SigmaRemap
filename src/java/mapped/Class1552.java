package mapped;

public class Class1552 implements Runnable {
   private static String[] field8418;
   public final int field8419;
   public final long field8420;
   public final long field8421;
   public final long field8422;
   public final Class2378 field8423;
   public final Class2378 field8424;
   public final Class8630 field8425;

   public Class1552(Class8630 var1, int var2, long var3, long var5, long var7, Class2378 var9, Class2378 var10) {
      this.field8425 = var1;
      this.field8419 = var2;
      this.field8420 = var3;
      this.field8421 = var5;
      this.field8422 = var7;
      this.field8423 = var9;
      this.field8424 = var10;
   }

   @Override
   public void run() {
      if (this.field8419 <= 0) {
         for (long var3 = this.field8420; var3 < this.field8421; var3++) {
            long var5 = 2L * var3;
            long var7 = var5 + 1L;
            long var9 = this.field8422 + var5;
            long var11 = this.field8422 + var7;
            this.field8423
               .method9685(
                  var5,
                  this.field8424.method9651(var9) * Class8630.method31010(this.field8425).method9651(var5)
                     + this.field8424.method9651(var11) * Class8630.method31010(this.field8425).method9651(var7)
               );
            this.field8423
               .method9685(
                  var7,
                  -this.field8424.method9651(var9) * Class8630.method31010(this.field8425).method9651(var7)
                     + this.field8424.method9651(var11) * Class8630.method31010(this.field8425).method9651(var5)
               );
         }
      } else {
         for (long var13 = this.field8420; var13 < this.field8421; var13++) {
            long var14 = 2L * var13;
            long var15 = var14 + 1L;
            long var16 = this.field8422 + var14;
            long var17 = this.field8422 + var15;
            this.field8423
               .method9685(
                  var14,
                  this.field8424.method9651(var16) * Class8630.method31010(this.field8425).method9651(var14)
                     - this.field8424.method9651(var17) * Class8630.method31010(this.field8425).method9651(var15)
               );
            this.field8423
               .method9685(
                  var15,
                  this.field8424.method9651(var16) * Class8630.method31010(this.field8425).method9651(var15)
                     + this.field8424.method9651(var17) * Class8630.method31010(this.field8425).method9651(var14)
               );
         }
      }
   }
}
