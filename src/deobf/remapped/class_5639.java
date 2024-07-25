package remapped;

public final class class_5639 implements Runnable {
   private static String[] field_28602;

   public class_5639(int var1, int var2, int var3, double[] var4, double[] var5, int var6) {
      this.field_28599 = var1;
      this.field_28598 = var2;
      this.field_28601 = var3;
      this.field_28600 = var4;
      this.field_28596 = var5;
      this.field_28597 = var6;
   }

   @Override
   public void run() {
      int var3 = this.field_28599 + this.field_28598;
      int var4 = 1;
      int var5 = this.field_28601;

      while (var5 > 512) {
         var5 >>= 2;
         var4 <<= 2;
         class_2751.method_12485(var5, this.field_28600, var3 - var5, this.field_28596, this.field_28597 - var5);
      }

      class_2751.method_12538(var5, 0, this.field_28600, var3 - var5, this.field_28597, this.field_28596);
      var4 >>= 1;
      int var6 = this.field_28599 - var5;

      for (int var7 = this.field_28598 - var5; var7 > 0; var7 -= var5) {
         int var8 = class_2751.method_12410(var5, var7, ++var4, this.field_28600, this.field_28599, this.field_28597, this.field_28596);
         class_2751.method_12538(var5, var8, this.field_28600, var6 + var7, this.field_28597, this.field_28596);
      }
   }
}
