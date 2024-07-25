package remapped;

public class class_3015 implements Runnable {
   private static String[] field_14802;

   public class_3015(class_2817 var1, int var2, long var3, int var5, class_4330 var6, boolean var7) {
      this.field_14801 = var1;
      this.field_14800 = var2;
      this.field_14804 = var3;
      this.field_14799 = var5;
      this.field_14803 = var6;
      this.field_14798 = var7;
   }

   @Override
   public void run() {
      if (this.field_14800 != -1) {
         for (long var3 = this.field_14804; var3 < class_2817.method_12835(this.field_14801); var3 += (long)this.field_14799) {
            class_2817.method_12831(this.field_14801).method_17787(this.field_14803, var3 * class_2817.method_12816(this.field_14801), this.field_14798);
         }
      } else {
         for (long var5 = this.field_14804; var5 < class_2817.method_12835(this.field_14801); var5 += (long)this.field_14799) {
            class_2817.method_12831(this.field_14801).method_17784(this.field_14803, var5 * class_2817.method_12816(this.field_14801));
         }
      }
   }
}
