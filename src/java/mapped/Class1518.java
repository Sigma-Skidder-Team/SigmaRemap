package mapped;

public class Class1518 implements Runnable {
   private static String[] field8214;
   public final long field8215;
   public final long field8216;
   public final long field8217;
   public final Class2381 field8218;
   public final long field8219;
   public final Class2381 field8220;
   public final Class7990 field8221;

   public Class1518(Class7990 var1, long var2, long var4, long var6, Class2381 var8, long var9, Class2381 var11) {
      this.field8221 = var1;
      this.field8215 = var2;
      this.field8216 = var4;
      this.field8217 = var6;
      this.field8218 = var8;
      this.field8219 = var9;
      this.field8220 = var11;
   }

   @Override
   public void run() {
      if (this.field8215 <= 0L) {
         for (long var3 = this.field8216; var3 < this.field8217; var3++) {
            long var5 = 2L * var3;
            long var7 = var5 + 1L;
            this.field8218
               .method9687(
                  this.field8219 + var5,
                  Class7990.method27243(this.field8221).method9653(var5) * this.field8220.method9653(var5)
                     + Class7990.method27243(this.field8221).method9653(var7) * this.field8220.method9653(var7)
               );
            this.field8218
               .method9687(
                  this.field8219 + var7,
                  -Class7990.method27243(this.field8221).method9653(var7) * this.field8220.method9653(var5)
                     + Class7990.method27243(this.field8221).method9653(var5) * this.field8220.method9653(var7)
               );
         }
      } else {
         for (long var9 = this.field8216; var9 < this.field8217; var9++) {
            long var10 = 2L * var9;
            long var11 = var10 + 1L;
            this.field8218
               .method9687(
                  this.field8219 + var10,
                  Class7990.method27243(this.field8221).method9653(var10) * this.field8220.method9653(var10)
                     - Class7990.method27243(this.field8221).method9653(var11) * this.field8220.method9653(var11)
               );
            this.field8218
               .method9687(
                  this.field8219 + var11,
                  Class7990.method27243(this.field8221).method9653(var11) * this.field8220.method9653(var10)
                     + Class7990.method27243(this.field8221).method9653(var10) * this.field8220.method9653(var11)
               );
         }
      }
   }
}
