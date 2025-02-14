package mapped;

public class Class596 implements Runnable {
   private static String[] field2932;
   public final int field2933;
   public final long field2934;
   public final long field2935;
   public final long field2936;
   public final Class2381 field2937;
   public final Class2381 field2938;
   public final Class7990 field2939;

   public Class596(Class7990 var1, int var2, long var3, long var5, long var7, Class2381 var9, Class2381 var10) {
      this.field2939 = var1;
      this.field2933 = var2;
      this.field2934 = var3;
      this.field2935 = var5;
      this.field2936 = var7;
      this.field2937 = var9;
      this.field2938 = var10;
   }

   @Override
   public void run() {
      if (this.field2933 <= 0) {
         for (long var3 = this.field2934; var3 < this.field2935; var3++) {
            long var5 = 2L * var3;
            long var7 = var5 + 1L;
            long var9 = this.field2936 + var5;
            long var11 = this.field2936 + var7;
            this.field2937
               .method9687(
                  var5,
                  this.field2938.method9653(var9) * Class7990.method27243(this.field2939).method9653(var5)
                     + this.field2938.method9653(var11) * Class7990.method27243(this.field2939).method9653(var7)
               );
            this.field2937
               .method9687(
                  var7,
                  -this.field2938.method9653(var9) * Class7990.method27243(this.field2939).method9653(var7)
                     + this.field2938.method9653(var11) * Class7990.method27243(this.field2939).method9653(var5)
               );
         }
      } else {
         for (long var13 = this.field2934; var13 < this.field2935; var13++) {
            long var14 = 2L * var13;
            long var15 = var14 + 1L;
            long var16 = this.field2936 + var14;
            long var17 = this.field2936 + var15;
            this.field2937
               .method9687(
                  var14,
                  this.field2938.method9653(var16) * Class7990.method27243(this.field2939).method9653(var14)
                     - this.field2938.method9653(var17) * Class7990.method27243(this.field2939).method9653(var15)
               );
            this.field2937
               .method9687(
                  var15,
                  this.field2938.method9653(var16) * Class7990.method27243(this.field2939).method9653(var15)
                     + this.field2938.method9653(var17) * Class7990.method27243(this.field2939).method9653(var14)
               );
         }
      }
   }
}
