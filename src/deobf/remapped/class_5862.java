package remapped;

public class class_5862 implements Runnable {
   private static String[] field_29783;

   public class_5862(class_6842 var1, int var2, int var3, int var4, double[] var5, boolean var6) {
      this.field_29789 = var1;
      this.field_29787 = var2;
      this.field_29788 = var3;
      this.field_29784 = var4;
      this.field_29785 = var5;
      this.field_29786 = var6;
   }

   @Override
   public void run() {
      if (this.field_29787 != -1) {
         for (int var3 = this.field_29788; var3 < class_6842.method_31358(this.field_29789); var3 += this.field_29784) {
            class_6842.method_31356(this.field_29789).method_31288(this.field_29785, var3 * class_6842.method_31373(this.field_29789), this.field_29786);
         }
      } else {
         for (int var4 = this.field_29788; var4 < class_6842.method_31358(this.field_29789); var4 += this.field_29784) {
            class_6842.method_31356(this.field_29789).method_31294(this.field_29785, var4 * class_6842.method_31373(this.field_29789), this.field_29786);
         }
      }
   }
}
