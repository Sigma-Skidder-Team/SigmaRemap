package remapped;

public class class_576 implements Runnable {
   private static String[] field_3384;

   public class_576(class_2841 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field_3381 = var1;
      this.field_3383 = var2;
      this.field_3380 = var3;
      this.field_3385 = var4;
      this.field_3382 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_3383; var3 < this.field_3380; var3++) {
         for (int var4 = 0; var4 < class_2841.method_12928(this.field_3381); var4++) {
            class_2841.method_12923(this.field_3381).method_21140(this.field_3385[var3][var4], this.field_3382);
         }
      }
   }
}
