package remapped;

public class class_2273 implements Runnable {
   private static String[] field_11291;

   public class_2273(class_7963 var1, int var2, int var3, int var4, class_1702 var5, boolean var6) {
      this.field_11289 = var1;
      this.field_11290 = var2;
      this.field_11288 = var3;
      this.field_11294 = var4;
      this.field_11292 = var5;
      this.field_11293 = var6;
   }

   @Override
   public void run() {
      if (this.field_11290 != -1) {
         for (long var3 = (long)this.field_11288; var3 < class_7963.method_36039(this.field_11289); var3 += (long)this.field_11294) {
            class_7963.method_36036(this.field_11289).method_44818(this.field_11292, var3 * class_7963.method_36037(this.field_11289), this.field_11293);
         }
      } else {
         for (long var5 = (long)this.field_11288; var5 < class_7963.method_36039(this.field_11289); var5 += (long)this.field_11294) {
            class_7963.method_36036(this.field_11289).method_44813(this.field_11292, var5 * class_7963.method_36037(this.field_11289), this.field_11293);
         }
      }
   }
}
