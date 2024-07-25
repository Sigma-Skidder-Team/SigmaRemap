package remapped;

public class class_8802 implements Runnable {
   private static String[] field_45026;

   public class_8802(class_573 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_45025 = var1;
      this.field_45030 = var2;
      this.field_45029 = var3;
      this.field_45028 = var4;
      this.field_45027 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_45030; var3 < this.field_45029; var3++) {
         int var4 = var3 * class_573.method_2737(this.field_45025);

         for (int var5 = 0; var5 < class_573.method_2721(this.field_45025); var5++) {
            class_573.method_2736(this.field_45025).method_44815(this.field_45028, var4 + var5 * class_573.method_2717(this.field_45025), this.field_45027);
         }
      }
   }
}
