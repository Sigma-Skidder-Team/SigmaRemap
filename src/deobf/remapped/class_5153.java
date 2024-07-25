package remapped;

public class class_5153 implements Runnable {
   private static String[] field_26527;

   public class_5153(class_5519 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field_26524 = var1;
      this.field_26525 = var2;
      this.field_26526 = var3;
      this.field_26522 = var4;
      this.field_26523 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_26525; var3 < this.field_26526; var3++) {
         class_5519.method_24991(this.field_26524).method_19197(this.field_26522[var3], this.field_26523);
      }
   }
}
