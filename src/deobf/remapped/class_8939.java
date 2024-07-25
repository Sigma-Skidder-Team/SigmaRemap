package remapped;

public class class_8939 implements Runnable {
   private static String[] field_45807;

   public class_8939(class_4993 var1, int var2, int var3, int var4, int var5, float[][] var6, boolean var7) {
      this.field_45803 = var1;
      this.field_45800 = var2;
      this.field_45805 = var3;
      this.field_45802 = var4;
      this.field_45804 = var5;
      this.field_45806 = var6;
      this.field_45801 = var7;
   }

   @Override
   public void run() {
      if (this.field_45800 != 0) {
         if (this.field_45805 != 1) {
            for (int var3 = this.field_45802; var3 < class_4993.method_22973(this.field_45803); var3 += this.field_45804) {
               class_4993.method_22998(this.field_45803).method_24156(this.field_45806[var3], this.field_45801);
            }
         } else {
            for (int var4 = this.field_45802; var4 < class_4993.method_22973(this.field_45803); var4 += this.field_45804) {
               class_4993.method_22998(this.field_45803).method_24204(this.field_45806[var4]);
            }
         }
      } else if (this.field_45805 != -1) {
         for (int var5 = this.field_45802; var5 < class_4993.method_22973(this.field_45803); var5 += this.field_45804) {
            class_4993.method_22998(this.field_45803).method_24216(this.field_45806[var5], this.field_45801);
         }
      } else {
         for (int var6 = this.field_45802; var6 < class_4993.method_22973(this.field_45803); var6 += this.field_45804) {
            class_4993.method_22998(this.field_45803).method_24185(this.field_45806[var6]);
         }
      }
   }
}
