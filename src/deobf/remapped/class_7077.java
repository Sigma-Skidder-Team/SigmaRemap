package remapped;

public class class_7077 implements Runnable {
   private static String[] field_36551;

   public class_7077(class_9035 var1, int var2, int var3, double[] var4, int var5) {
      this.field_36552 = var1;
      this.field_36550 = var2;
      this.field_36547 = var3;
      this.field_36549 = var4;
      this.field_36548 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_36550; var3 < this.field_36547; var3++) {
         class_9035.method_41463(this.field_36552).method_15029(this.field_36549, var3 * this.field_36548);
      }
   }
}
