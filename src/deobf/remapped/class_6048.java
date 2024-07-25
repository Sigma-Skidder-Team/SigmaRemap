package remapped;

public class class_6048 implements Runnable {
   private static String[] field_30929;

   public class_6048(class_9035 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field_30927 = var1;
      this.field_30926 = var2;
      this.field_30930 = var3;
      this.field_30928 = var4;
      this.field_30925 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_30926; var3 < this.field_30930; var3++) {
         class_9035.method_41463(this.field_30927).method_14991(this.field_30928, var3 * class_9035.method_41431(this.field_30927), this.field_30925);
      }
   }
}
