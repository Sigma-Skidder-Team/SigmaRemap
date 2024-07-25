package remapped;

public class class_7504 implements Runnable {
   private static String[] field_38310;

   public class_7504(class_84 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_38313 = var1;
      this.field_38309 = var2;
      this.field_38308 = var3;
      this.field_38311 = var4;
      this.field_38312 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_38309; var3 < this.field_38308; var3++) {
         int var4 = var3 * class_84.method_180(this.field_38313);

         for (int var5 = 0; var5 < class_84.method_200(this.field_38313); var5++) {
            class_84.method_187(this.field_38313).method_31288(this.field_38311, var4 + var5 * class_84.method_188(this.field_38313), this.field_38312);
         }
      }
   }
}
