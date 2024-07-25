package remapped;

public class class_1913 implements Runnable {
   private static String[] field_9736;

   public class_1913(class_4993 var1, int var2, int var3, float[] var4, int var5) {
      this.field_9737 = var1;
      this.field_9738 = var2;
      this.field_9739 = var3;
      this.field_9740 = var4;
      this.field_9735 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_9738; var3 < this.field_9739; var3++) {
         class_4993.method_22998(this.field_9737).method_24186(this.field_9740, var3 * this.field_9735);
      }
   }
}
