package remapped;

public final class class_6583 implements Runnable {
   private static String[] field_33568;

   public class_6583(long var1, long var3, long var5, class_1702 var7, class_1702 var8, long var9) {
      this.field_33569 = var1;
      this.field_33567 = var3;
      this.field_33566 = var5;
      this.field_33564 = var7;
      this.field_33570 = var8;
      this.field_33565 = var9;
   }

   @Override
   public void run() {
      long var3 = this.field_33569 + this.field_33567;
      long var5 = this.field_33566;

      while (var5 > 512L) {
         var5 >>= 2;
         class_2751.method_12522(var5, this.field_33564, var3 - var5, this.field_33570, this.field_33565 - (var5 >> 1));
      }

      class_2751.method_12540(var5, 1L, this.field_33564, var3 - var5, this.field_33565, this.field_33570);
      long var7 = 0L;
      long var9 = this.field_33569 - var5;

      for (long var11 = this.field_33567 - var5; var11 > 0L; var11 -= var5) {
         long var13 = class_2751.method_12412(var5, var11, ++var7, this.field_33564, this.field_33569, this.field_33565, this.field_33570);
         class_2751.method_12540(var5, var13, this.field_33564, var9 + var11, this.field_33565, this.field_33570);
      }
   }
}
