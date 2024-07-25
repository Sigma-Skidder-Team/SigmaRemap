package remapped;

public class class_8432 implements Runnable {
   private static String[] field_43151;

   public class_8432(class_84 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_43153 = var1;
      this.field_43152 = var2;
      this.field_43154 = var3;
      this.field_43150 = var4;
      this.field_43149 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_43152; var3 < this.field_43154; var3++) {
         int var4 = var3 * class_84.method_180(this.field_43153);

         for (int var5 = 0; var5 < class_84.method_200(this.field_43153); var5++) {
            class_84.method_187(this.field_43153).method_31294(this.field_43150, var4 + var5 * class_84.method_188(this.field_43153), this.field_43149);
         }
      }
   }
}
