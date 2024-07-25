package remapped;

public class class_752 implements Runnable {
   private static String[] field_4079;

   public class_752(class_1637 var1, int var2, int var3, double[][][] var4) {
      this.field_4078 = var1;
      this.field_4081 = var2;
      this.field_4082 = var3;
      this.field_4080 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_4081; var3 < this.field_4082; var3++) {
         for (int var4 = 0; var4 < class_1637.method_7321(this.field_4078); var4++) {
            class_1637.method_7310(this.field_4078).method_14981(this.field_4080[var3][var4]);
         }
      }
   }
}
