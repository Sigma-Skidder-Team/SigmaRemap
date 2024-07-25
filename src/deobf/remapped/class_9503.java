package remapped;

public class class_9503 implements Runnable {
   private static String[] field_48393;

   public class_9503(class_3101 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_48394 = var1;
      this.field_48397 = var2;
      this.field_48395 = var3;
      this.field_48398 = var4;
      this.field_48396 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_48397; var3 < this.field_48395; var3++) {
         int var4 = var3 * class_3101.method_14211(this.field_48394);

         for (int var5 = 0; var5 < class_3101.method_14204(this.field_48394); var5++) {
            class_3101.method_14195(this.field_48394).method_19203(this.field_48398, var4 + var5 * class_3101.method_14196(this.field_48394), this.field_48396);
         }
      }
   }
}
