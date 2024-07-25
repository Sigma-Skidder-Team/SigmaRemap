package remapped;

public class class_1112 implements Runnable {
   private static String[] field_6377;

   public class_1112(class_9035 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field_6380 = var1;
      this.field_6378 = var2;
      this.field_6379 = var3;
      this.field_6381 = var4;
      this.field_6376 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_6378; var3 < this.field_6379; var3++) {
         class_9035.method_41463(this.field_6380).method_15036(this.field_6381[var3], this.field_6376);
      }
   }
}
