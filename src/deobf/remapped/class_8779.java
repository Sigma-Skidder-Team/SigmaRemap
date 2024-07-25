package remapped;

public final class class_8779 implements Runnable {
   private static String[] field_44935;

   public class_8779(long var1, long var3, long var5, class_1702 var7, class_1702 var8, long var9) {
      this.field_44931 = var1;
      this.field_44930 = var3;
      this.field_44933 = var5;
      this.field_44932 = var7;
      this.field_44934 = var8;
      this.field_44929 = var9;
   }

   @Override
   public void run() {
      long var3 = this.field_44931 + this.field_44930;
      long var5 = 1L;
      long var7 = this.field_44933;

      while (var7 > 512L) {
         var7 >>= 2;
         var5 <<= 2;
         class_2751.method_12487(var7, this.field_44932, var3 - var7, this.field_44934, this.field_44929 - var7);
      }

      class_2751.method_12540(var7, 0L, this.field_44932, var3 - var7, this.field_44929, this.field_44934);
      var5 >>= 1;
      long var9 = this.field_44931 - var7;

      for (long var11 = this.field_44930 - var7; var11 > 0L; var11 -= var7) {
         long var13 = class_2751.method_12412(var7, var11, ++var5, this.field_44932, this.field_44931, this.field_44929, this.field_44934);
         class_2751.method_12540(var7, var13, this.field_44932, var9 + var11, this.field_44929, this.field_44934);
      }
   }
}
