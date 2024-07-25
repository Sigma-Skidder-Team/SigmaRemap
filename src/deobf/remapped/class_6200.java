package remapped;

public class class_6200 implements Runnable {
   private static String[] field_31701;

   public class_6200(class_4993 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field_31702 = var1;
      this.field_31695 = var2;
      this.field_31697 = var3;
      this.field_31699 = var4;
      this.field_31700 = var5;
      this.field_31698 = var6;
      this.field_31696 = var7;
   }

   @Override
   public void run() {
      if (this.field_31695 != 0) {
         if (this.field_31697 != 1) {
            for (int var3 = this.field_31699; var3 < class_4993.method_22973(this.field_31702); var3 += this.field_31700) {
               class_4993.method_22998(this.field_31702).method_24155(this.field_31698, var3 * class_4993.method_22972(this.field_31702), this.field_31696);
            }
         } else {
            for (int var4 = this.field_31699; var4 < class_4993.method_22973(this.field_31702); var4 += this.field_31700) {
               class_4993.method_22998(this.field_31702).method_24205(this.field_31698, var4 * class_4993.method_22972(this.field_31702));
            }
         }
      } else if (this.field_31697 != -1) {
         for (int var5 = this.field_31699; var5 < class_4993.method_22973(this.field_31702); var5 += this.field_31700) {
            class_4993.method_22998(this.field_31702).method_24215(this.field_31698, var5 * class_4993.method_22972(this.field_31702), this.field_31696);
         }
      } else {
         for (int var6 = this.field_31699; var6 < class_4993.method_22973(this.field_31702); var6 += this.field_31700) {
            class_4993.method_22998(this.field_31702).method_24186(this.field_31698, var6 * class_4993.method_22972(this.field_31702));
         }
      }
   }
}
