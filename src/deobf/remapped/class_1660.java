package remapped;

public class class_1660 implements Runnable {
   private static String[] field_8608;

   public class_1660(class_2841 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field_8609 = var1;
      this.field_8606 = var2;
      this.field_8604 = var3;
      this.field_8607 = var4;
      this.field_8605 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_8606; var3 < this.field_8604; var3++) {
         for (int var4 = 0; var4 < class_2841.method_12928(this.field_8609); var4++) {
            class_2841.method_12923(this.field_8609).method_21132(this.field_8607[var3][var4], this.field_8605);
         }
      }
   }
}
