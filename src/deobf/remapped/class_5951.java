package remapped;

public class class_5951 implements Runnable {
   private static String[] field_30341;

   public class_5951(class_2841 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_30345 = var1;
      this.field_30343 = var2;
      this.field_30342 = var3;
      this.field_30340 = var4;
      this.field_30344 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_30343; var3 < this.field_30342; var3++) {
         int var4 = var3 * class_2841.method_12913(this.field_30345);

         for (int var5 = 0; var5 < class_2841.method_12928(this.field_30345); var5++) {
            class_2841.method_12923(this.field_30345).method_21139(this.field_30340, var4 + var5 * class_2841.method_12922(this.field_30345), this.field_30344);
         }
      }
   }
}
