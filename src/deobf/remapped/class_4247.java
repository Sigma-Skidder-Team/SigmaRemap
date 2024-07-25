package remapped;

public class class_4247 implements Runnable {
   private static String[] field_20595;

   public class_4247(class_4993 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field_20592 = var1;
      this.field_20594 = var2;
      this.field_20593 = var3;
      this.field_20596 = var4;
      this.field_20591 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_20594; var3 < this.field_20593; var3++) {
         class_4993.method_22998(this.field_20592).method_24207(this.field_20596[var3], 0, this.field_20591);
      }
   }
}
