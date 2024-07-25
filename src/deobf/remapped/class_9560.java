package remapped;

public final class class_9560 implements Runnable {
   private static String[] field_48637;

   public class_9560(int var1, int var2, int var3, double[] var4, double[] var5, int var6) {
      this.field_48640 = var1;
      this.field_48641 = var2;
      this.field_48638 = var3;
      this.field_48639 = var4;
      this.field_48636 = var5;
      this.field_48642 = var6;
   }

   @Override
   public void run() {
      int var3 = this.field_48640 + this.field_48641;
      int var4 = this.field_48638;

      while (var4 > 512) {
         var4 >>= 2;
         class_2751.method_12520(var4, this.field_48639, var3 - var4, this.field_48636, this.field_48642 - (var4 >> 1));
      }

      class_2751.method_12538(var4, 1, this.field_48639, var3 - var4, this.field_48642, this.field_48636);
      int var5 = 0;
      int var6 = this.field_48640 - var4;

      for (int var7 = this.field_48641 - var4; var7 > 0; var7 -= var4) {
         int var8 = class_2751.method_12410(var4, var7, ++var5, this.field_48639, this.field_48640, this.field_48642, this.field_48636);
         class_2751.method_12538(var4, var8, this.field_48639, var6 + var7, this.field_48642, this.field_48636);
      }
   }
}
