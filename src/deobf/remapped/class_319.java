package remapped;

public class class_319 implements Runnable {
   private static String[] field_1179;

   public class_319(class_1637 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field_1178 = var1;
      this.field_1174 = var2;
      this.field_1176 = var3;
      this.field_1177 = var4;
      this.field_1175 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_1174; var3 < this.field_1176; var3++) {
         for (int var4 = 0; var4 < class_1637.method_7321(this.field_1178); var4++) {
            class_1637.method_7310(this.field_1178).method_14999(this.field_1177[var3][var4], this.field_1175);
         }
      }
   }
}
