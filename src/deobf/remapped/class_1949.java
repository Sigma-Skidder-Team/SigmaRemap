package remapped;

public class class_1949 implements Runnable {
   private static String[] field_9942;

   public class_1949(class_6056 var1, int var2, int var3, double[][][] var4) {
      this.field_9939 = var1;
      this.field_9943 = var2;
      this.field_9941 = var3;
      this.field_9940 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_9943; var3 < this.field_9941; var3++) {
         for (int var4 = 0; var4 < class_6056.method_27660(this.field_9939); var4++) {
            class_6056.method_27665(this.field_9939).method_31275(this.field_9940[var3][var4]);
         }
      }
   }
}
