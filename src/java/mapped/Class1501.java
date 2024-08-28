package mapped;

public class Class1501 implements Runnable {
   private static String[] field8099;
   public final int field8100;
   public final long field8101;
   public final long field8102;
   public final long field8103;
   public final Class2378 field8104;
   public final Class2378 field8105;
   public final Class8630 field8106;

   public Class1501(Class8630 var1, int var2, long var3, long var5, long var7, Class2378 var9, Class2378 var10) {
      this.field8106 = var1;
      this.field8100 = var2;
      this.field8101 = var3;
      this.field8102 = var5;
      this.field8103 = var7;
      this.field8104 = var9;
      this.field8105 = var10;
   }

   @Override
   public void run() {
      if (this.field8100 <= 0) {
         for (long var3 = this.field8101; var3 < this.field8102; var3++) {
            long var5 = 2L * var3;
            long var7 = var5 + 1L;
            long var9 = this.field8103 + var5;
            long var11 = this.field8103 + var7;
            this.field8104
               .method9685(
                  var9,
                  Class8630.method31010(this.field8106).method9651(var5) * this.field8105.method9651(var5)
                     + Class8630.method31010(this.field8106).method9651(var7) * this.field8105.method9651(var7)
               );
            this.field8104
               .method9685(
                  var11,
                  -Class8630.method31010(this.field8106).method9651(var7) * this.field8105.method9651(var5)
                     + Class8630.method31010(this.field8106).method9651(var5) * this.field8105.method9651(var7)
               );
         }
      } else {
         for (long var13 = this.field8101; var13 < this.field8102; var13++) {
            long var14 = 2L * var13;
            long var15 = var14 + 1L;
            long var16 = this.field8103 + var14;
            long var17 = this.field8103 + var15;
            this.field8104
               .method9685(
                  var16,
                  Class8630.method31010(this.field8106).method9651(var14) * this.field8105.method9651(var14)
                     - Class8630.method31010(this.field8106).method9651(var15) * this.field8105.method9651(var15)
               );
            this.field8104
               .method9685(
                  var17,
                  Class8630.method31010(this.field8106).method9651(var15) * this.field8105.method9651(var14)
                     + Class8630.method31010(this.field8106).method9651(var14) * this.field8105.method9651(var15)
               );
         }
      }
   }
}
