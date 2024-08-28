package mapped;

public class Class1510 implements Runnable {
   private static String[] field8161;
   public final int field8162;
   public final long field8163;
   public final long field8164;
   public final long field8165;
   public final Class2381 field8166;
   public final Class2381 field8167;
   public final Class7990 field8168;

   public Class1510(Class7990 var1, int var2, long var3, long var5, long var7, Class2381 var9, Class2381 var10) {
      this.field8168 = var1;
      this.field8162 = var2;
      this.field8163 = var3;
      this.field8164 = var5;
      this.field8165 = var7;
      this.field8166 = var9;
      this.field8167 = var10;
   }

   @Override
   public void run() {
      if (this.field8162 <= 0) {
         for (long var3 = this.field8163; var3 < this.field8164; var3++) {
            long var5 = 2L * var3;
            long var7 = var5 + 1L;
            long var9 = this.field8165 + var5;
            long var11 = this.field8165 + var7;
            this.field8166
               .method9687(
                  var9,
                  Class7990.method27243(this.field8168).method9653(var5) * this.field8167.method9653(var5)
                     + Class7990.method27243(this.field8168).method9653(var7) * this.field8167.method9653(var7)
               );
            this.field8166
               .method9687(
                  var11,
                  -Class7990.method27243(this.field8168).method9653(var7) * this.field8167.method9653(var5)
                     + Class7990.method27243(this.field8168).method9653(var5) * this.field8167.method9653(var7)
               );
         }
      } else {
         for (long var13 = this.field8163; var13 < this.field8164; var13++) {
            long var14 = 2L * var13;
            long var15 = var14 + 1L;
            long var16 = this.field8165 + var14;
            long var17 = this.field8165 + var15;
            this.field8166
               .method9687(
                  var16,
                  Class7990.method27243(this.field8168).method9653(var14) * this.field8167.method9653(var14)
                     - Class7990.method27243(this.field8168).method9653(var15) * this.field8167.method9653(var15)
               );
            this.field8166
               .method9687(
                  var17,
                  Class7990.method27243(this.field8168).method9653(var15) * this.field8167.method9653(var14)
                     + Class7990.method27243(this.field8168).method9653(var14) * this.field8167.method9653(var15)
               );
         }
      }
   }
}
