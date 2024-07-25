package remapped;

public class class_2455 implements Runnable {
   private static String[] field_12214;

   public class_2455(class_9035 var1, int var2, int var3, double[] var4, int var5, boolean var6) {
      this.field_12208 = var1;
      this.field_12212 = var2;
      this.field_12211 = var3;
      this.field_12213 = var4;
      this.field_12210 = var5;
      this.field_12209 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_12212; var3 < this.field_12211; var3++) {
         class_9035.method_41463(this.field_12208).method_15035(this.field_12213, var3 * this.field_12210, this.field_12209);
      }
   }
}
