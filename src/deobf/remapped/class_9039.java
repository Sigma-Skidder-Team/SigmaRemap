package remapped;

public class class_9039 implements Runnable {
   private static String[] field_46255;

   public class_9039(class_1637 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field_46252 = var1;
      this.field_46254 = var2;
      this.field_46251 = var3;
      this.field_46250 = var4;
      this.field_46253 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_46254; var3 < this.field_46251; var3++) {
         for (int var4 = 0; var4 < class_1637.method_7321(this.field_46252); var4++) {
            class_1637.method_7310(this.field_46252).method_15036(this.field_46250[var3][var4], this.field_46253);
         }
      }
   }
}
