package remapped;

public class class_1771 implements Runnable {
   private static String[] field_9074;

   public class_1771(class_8751 var1, int var2, int var3, int var4, float[] var5, boolean var6) {
      this.field_9079 = var1;
      this.field_9077 = var2;
      this.field_9073 = var3;
      this.field_9075 = var4;
      this.field_9076 = var5;
      this.field_9078 = var6;
   }

   @Override
   public void run() {
      if (this.field_9077 != -1) {
         for (int var3 = this.field_9073; var3 < class_8751.method_40170(this.field_9079); var3 += this.field_9075) {
            class_8751.method_40165(this.field_9079).method_21131(this.field_9076, var3 * class_8751.method_40179(this.field_9079), this.field_9078);
         }
      } else {
         for (int var4 = this.field_9073; var4 < class_8751.method_40170(this.field_9079); var4 += this.field_9075) {
            class_8751.method_40165(this.field_9079).method_21139(this.field_9076, var4 * class_8751.method_40179(this.field_9079), this.field_9078);
         }
      }
   }
}
