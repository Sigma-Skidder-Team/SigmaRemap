package remapped;

public class class_7433 implements Runnable {
   private static String[] field_37911;

   public class_7433(class_9035 var1, int var2, int var3, double[] var4) {
      this.field_37909 = var1;
      this.field_37913 = var2;
      this.field_37910 = var3;
      this.field_37912 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_37913; var3 < this.field_37910; var3++) {
         class_9035.method_41463(this.field_37909).method_15045(this.field_37912, var3 * class_9035.method_41431(this.field_37909));
      }
   }
}
