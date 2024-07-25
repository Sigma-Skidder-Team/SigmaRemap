package remapped;

public class class_1151 implements Runnable {
   private static String[] field_6551;

   public class_1151(class_4993 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field_6552 = var1;
      this.field_6554 = var2;
      this.field_6553 = var3;
      this.field_6555 = var4;
      this.field_6556 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_6554; var3 < this.field_6553; var3++) {
         class_4993.method_22998(this.field_6552).method_24216(this.field_6555[var3], this.field_6556);
      }
   }
}
