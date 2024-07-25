package remapped;

public class class_3830 implements Runnable {
   private static String[] field_18711;

   public class_3830(class_7963 var1, int var2, int var3, int var4, double[] var5, boolean var6) {
      this.field_18716 = var1;
      this.field_18712 = var2;
      this.field_18717 = var3;
      this.field_18713 = var4;
      this.field_18714 = var5;
      this.field_18715 = var6;
   }

   @Override
   public void run() {
      if (this.field_18712 != -1) {
         for (int var3 = this.field_18717; var3 < class_7963.method_36040(this.field_18716); var3 += this.field_18713) {
            class_7963.method_36036(this.field_18716).method_44820(this.field_18714, var3 * class_7963.method_36038(this.field_18716), this.field_18715);
         }
      } else {
         for (int var4 = this.field_18717; var4 < class_7963.method_36040(this.field_18716); var4 += this.field_18713) {
            class_7963.method_36036(this.field_18716).method_44815(this.field_18714, var4 * class_7963.method_36038(this.field_18716), this.field_18715);
         }
      }
   }
}
