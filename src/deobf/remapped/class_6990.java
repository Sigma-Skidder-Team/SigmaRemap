package remapped;

public class class_6990 implements Runnable {
   private static String[] field_35895;

   public class_6990(class_9035 var1, int var2, int var3, double[][] var4) {
      this.field_35897 = var1;
      this.field_35898 = var2;
      this.field_35894 = var3;
      this.field_35896 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_35898; var3 < this.field_35894; var3++) {
         class_9035.method_41463(this.field_35897).method_15044(this.field_35896[var3]);
      }
   }
}
