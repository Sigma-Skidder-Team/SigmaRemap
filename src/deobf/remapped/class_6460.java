package remapped;

public final class class_6460 implements Runnable {
   private static String[] field_32929;

   public class_6460(long var1, long var3, long var5, class_4330 var7, class_4330 var8, long var9) {
      this.field_32932 = var1;
      this.field_32931 = var3;
      this.field_32930 = var5;
      this.field_32935 = var7;
      this.field_32933 = var8;
      this.field_32934 = var9;
   }

   @Override
   public void run() {
      long var3 = this.field_32932 + this.field_32931;
      long var5 = 1L;
      long var7 = this.field_32930;

      while (var7 > 512L) {
         var7 >>= 2;
         var5 <<= 2;
         class_2751.method_12488(var7, this.field_32935, var3 - var7, this.field_32933, this.field_32934 - var7);
      }

      class_2751.method_12541(var7, 0L, this.field_32935, var3 - var7, this.field_32934, this.field_32933);
      var5 >>= 1;
      long var9 = this.field_32932 - var7;

      for (long var11 = this.field_32931 - var7; var11 > 0L; var11 -= var7) {
         long var13 = class_2751.method_12413(var7, var11, ++var5, this.field_32935, this.field_32932, this.field_32934, this.field_32933);
         class_2751.method_12541(var7, var13, this.field_32935, var9 + var11, this.field_32934, this.field_32933);
      }
   }
}
