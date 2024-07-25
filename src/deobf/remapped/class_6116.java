package remapped;

public class class_6116 implements Runnable {
   private static String[] field_31266;

   public class_6116(class_6056 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_31267 = var1;
      this.field_31268 = var2;
      this.field_31264 = var3;
      this.field_31265 = var4;
      this.field_31269 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_31268; var3 < this.field_31264; var3++) {
         int var4 = var3 * class_6056.method_27649(this.field_31267);

         for (int var5 = 0; var5 < class_6056.method_27660(this.field_31267); var5++) {
            class_6056.method_27665(this.field_31267).method_31282(this.field_31265, var4 + var5 * class_6056.method_27661(this.field_31267), this.field_31269);
         }
      }
   }
}
