package remapped;

public class class_8684 implements Runnable {
   private static String[] field_44555;

   public class_8684(class_6056 var1, int var2, int var3, double[] var4) {
      this.field_44558 = var1;
      this.field_44559 = var2;
      this.field_44556 = var3;
      this.field_44557 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_44559; var3 < this.field_44556; var3++) {
         int var4 = var3 * class_6056.method_27649(this.field_44558);

         for (int var5 = 0; var5 < class_6056.method_27660(this.field_44558); var5++) {
            class_6056.method_27665(this.field_44558).method_31276(this.field_44557, var4 + var5 * class_6056.method_27661(this.field_44558));
         }
      }
   }
}
