package remapped;

public final class class_4254 implements Runnable {
   private static String[] field_20622;

   public class_4254(int var1, int var2, int var3, float[] var4, float[] var5, int var6) {
      this.field_20618 = var1;
      this.field_20624 = var2;
      this.field_20619 = var3;
      this.field_20621 = var4;
      this.field_20620 = var5;
      this.field_20623 = var6;
   }

   @Override
   public void run() {
      int var3 = this.field_20618 + this.field_20624;
      int var4 = this.field_20619;

      while (var4 > 512) {
         var4 >>= 2;
         class_2751.method_12521(var4, this.field_20621, var3 - var4, this.field_20620, this.field_20623 - (var4 >> 1));
      }

      class_2751.method_12539(var4, 1, this.field_20621, var3 - var4, this.field_20623, this.field_20620);
      int var5 = 0;
      int var6 = this.field_20618 - var4;

      for (int var7 = this.field_20624 - var4; var7 > 0; var7 -= var4) {
         int var8 = class_2751.method_12411(var4, var7, ++var5, this.field_20621, this.field_20618, this.field_20623, this.field_20620);
         class_2751.method_12539(var4, var8, this.field_20621, var6 + var7, this.field_20623, this.field_20620);
      }
   }
}
