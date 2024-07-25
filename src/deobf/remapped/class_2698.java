package remapped;

public class class_2698 implements Runnable {
   private static String[] field_13219;

   public class_2698(class_4993 var1, int var2, int var3, int var4, float[][] var5, float[][] var6) {
      this.field_13222 = var1;
      this.field_13221 = var2;
      this.field_13223 = var3;
      this.field_13218 = var4;
      this.field_13224 = var5;
      this.field_13220 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_13221; var3 < this.field_13223; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < this.field_13218; var5++) {
            int var6 = 2 * var5;
            this.field_13224[var3][var6] = this.field_13220[var5][var4];
            this.field_13224[var3][var6 + 1] = this.field_13220[var5][var4 + 1];
         }
      }
   }
}
