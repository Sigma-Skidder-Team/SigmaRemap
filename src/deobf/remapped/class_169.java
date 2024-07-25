package remapped;

public final class class_169 implements Runnable {
   private static String[] field_527;

   public class_169(int var1, int var2, int var3, float[] var4, float[] var5, int var6) {
      this.field_528 = var1;
      this.field_529 = var2;
      this.field_531 = var3;
      this.field_533 = var4;
      this.field_532 = var5;
      this.field_530 = var6;
   }

   @Override
   public void run() {
      int var3 = this.field_528 + this.field_529;
      int var4 = 1;
      int var5 = this.field_531;

      while (var5 > 512) {
         var5 >>= 2;
         var4 <<= 2;
         class_2751.method_12486(var5, this.field_533, var3 - var5, this.field_532, this.field_530 - var5);
      }

      class_2751.method_12539(var5, 0, this.field_533, var3 - var5, this.field_530, this.field_532);
      var4 >>= 1;
      int var6 = this.field_528 - var5;

      for (int var7 = this.field_529 - var5; var7 > 0; var7 -= var5) {
         int var8 = class_2751.method_12411(var5, var7, ++var4, this.field_533, this.field_528, this.field_530, this.field_532);
         class_2751.method_12539(var5, var8, this.field_533, var6 + var7, this.field_530, this.field_532);
      }
   }
}
