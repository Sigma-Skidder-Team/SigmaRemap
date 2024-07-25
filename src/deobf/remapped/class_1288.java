package remapped;

public class class_1288 implements Runnable {
   private static String[] field_7065;

   public class_1288(class_2817 var1, int var2, int var3, float[] var4) {
      this.field_7061 = var1;
      this.field_7064 = var2;
      this.field_7063 = var3;
      this.field_7062 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_7064; var3 < this.field_7063; var3++) {
         class_2817.method_12831(this.field_7061).method_17786(this.field_7062, var3 * class_2817.method_12836(this.field_7061));
      }
   }
}
