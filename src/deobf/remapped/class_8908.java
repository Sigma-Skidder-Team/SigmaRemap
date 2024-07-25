package remapped;

public class class_8908 implements Runnable {
   private static String[] field_45678;

   public class_8908(class_4993 var1, int var2, int var3, int var4, int var5, float[][] var6, boolean var7) {
      this.field_45680 = var1;
      this.field_45677 = var2;
      this.field_45681 = var3;
      this.field_45682 = var4;
      this.field_45679 = var5;
      this.field_45675 = var6;
      this.field_45676 = var7;
   }

   @Override
   public void run() {
      if (this.field_45677 != 0) {
         if (this.field_45681 != 1) {
            for (int var3 = this.field_45682; var3 < class_4993.method_22973(this.field_45680); var3 += this.field_45679) {
               class_4993.method_22998(this.field_45680).method_24207(this.field_45675[var3], 0, this.field_45676);
            }
         } else {
            for (int var4 = this.field_45682; var4 < class_4993.method_22973(this.field_45680); var4 += this.field_45679) {
               class_4993.method_22998(this.field_45680).method_24204(this.field_45675[var4]);
            }
         }
      } else if (this.field_45681 != -1) {
         for (int var5 = this.field_45682; var5 < class_4993.method_22973(this.field_45680); var5 += this.field_45679) {
            class_4993.method_22998(this.field_45680).method_24216(this.field_45675[var5], this.field_45676);
         }
      } else {
         for (int var6 = this.field_45682; var6 < class_4993.method_22973(this.field_45680); var6 += this.field_45679) {
            class_4993.method_22998(this.field_45680).method_24185(this.field_45675[var6]);
         }
      }
   }
}
