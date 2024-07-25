package remapped;

public class class_8503 implements Runnable {
   private static String[] field_43540;

   public class_8503(class_2817 var1, int var2, int var3, float[][] var4) {
      this.field_43538 = var1;
      this.field_43541 = var2;
      this.field_43539 = var3;
      this.field_43537 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_43541; var3 < this.field_43539; var3++) {
         class_2817.method_12831(this.field_43538).method_17785(this.field_43537[var3]);
      }
   }
}
