package remapped;

public class class_1760 implements Runnable {
   private static String[] field_9035;

   public class_1760(class_6056 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field_9038 = var1;
      this.field_9036 = var2;
      this.field_9033 = var3;
      this.field_9037 = var4;
      this.field_9034 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_9036; var3 < this.field_9033; var3++) {
         for (int var4 = 0; var4 < class_6056.method_27660(this.field_9038); var4++) {
            class_6056.method_27665(this.field_9038).method_31283(this.field_9037[var3][var4], this.field_9034);
         }
      }
   }
}
