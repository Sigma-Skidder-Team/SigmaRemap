package remapped;

public class class_6259 implements Runnable {
   private static String[] field_31995;

   public class_6259(class_4993 var1, long var2, int var4, long var5, int var7, class_4330 var8, boolean var9) {
      this.field_31993 = var1;
      this.field_31991 = var2;
      this.field_31994 = var4;
      this.field_31992 = var5;
      this.field_31990 = var7;
      this.field_31989 = var8;
      this.field_31996 = var9;
   }

   @Override
   public void run() {
      if (this.field_31991 != 0L) {
         if (this.field_31994 != 1) {
            for (long var3 = this.field_31992; var3 < class_4993.method_22978(this.field_31993); var3 += (long)this.field_31990) {
               class_4993.method_22998(this.field_31993).method_24206(this.field_31989, var3 * class_4993.method_23002(this.field_31993), this.field_31996);
            }
         } else {
            for (long var5 = this.field_31992; var5 < class_4993.method_22978(this.field_31993); var5 += (long)this.field_31990) {
               class_4993.method_22998(this.field_31993).method_24203(this.field_31989, var5 * class_4993.method_23002(this.field_31993));
            }
         }
      } else if (this.field_31994 != -1) {
         for (long var6 = this.field_31992; var6 < class_4993.method_22978(this.field_31993); var6 += (long)this.field_31990) {
            class_4993.method_22998(this.field_31993).method_24213(this.field_31989, var6 * class_4993.method_23002(this.field_31993), this.field_31996);
         }
      } else {
         for (long var7 = this.field_31992; var7 < class_4993.method_22978(this.field_31993); var7 += (long)this.field_31990) {
            class_4993.method_22998(this.field_31993).method_24184(this.field_31989, var7 * class_4993.method_23002(this.field_31993));
         }
      }
   }
}
