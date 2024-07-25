package remapped;

public class class_2343 implements Runnable {
   private static String[] field_11692;

   public class_2343(class_7380 var1, int var2, int var3, int var4, double[] var5, boolean var6) {
      this.field_11691 = var1;
      this.field_11689 = var2;
      this.field_11688 = var3;
      this.field_11694 = var4;
      this.field_11693 = var5;
      this.field_11690 = var6;
   }

   @Override
   public void run() {
      if (this.field_11689 != -1) {
         for (int var3 = this.field_11688; var3 < class_7380.method_33612(this.field_11691); var3 += this.field_11694) {
            class_7380.method_33625(this.field_11691).method_31282(this.field_11693, var3 * class_7380.method_33621(this.field_11691), this.field_11690);
         }
      } else {
         for (int var4 = this.field_11688; var4 < class_7380.method_33612(this.field_11691); var4 += this.field_11694) {
            class_7380.method_33625(this.field_11691).method_31276(this.field_11693, var4 * class_7380.method_33621(this.field_11691));
         }
      }
   }
}
