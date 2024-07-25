package remapped;

public class class_3379 implements Runnable {
   private static String[] field_16648;

   public class_3379(class_4993 var1, int var2, int var3, int var4, int var5, float[] var6) {
      this.field_16650 = var1;
      this.field_16652 = var2;
      this.field_16649 = var3;
      this.field_16651 = var4;
      this.field_16653 = var5;
      this.field_16654 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_16652; var3 < this.field_16649; var3++) {
         int var4 = var3 * this.field_16651;
         int var5 = (class_4993.method_22973(this.field_16650) - var3 + 1) * this.field_16651;

         for (int var6 = this.field_16653; var6 < class_4993.method_22972(this.field_16650); var6++) {
            int var7 = 2 * var6;
            int var8 = 2 * (class_4993.method_22972(this.field_16650) - var6);
            this.field_16654[var7] = this.field_16654[var8];
            this.field_16654[var7 + 1] = -this.field_16654[var8 + 1];
            int var9 = var4 + var7;
            int var10 = var5 - var7;
            this.field_16654[var9] = this.field_16654[var10];
            this.field_16654[var9 + 1] = -this.field_16654[var10 + 1];
         }
      }
   }
}
