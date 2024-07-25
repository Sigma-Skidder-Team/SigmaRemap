package remapped;

public class class_9041 implements Runnable {
   private static String[] field_46261;

   public class_9041(class_4993 var1, int var2, int var3, int var4, float[][] var5) {
      this.field_46266 = var1;
      this.field_46265 = var2;
      this.field_46262 = var3;
      this.field_46264 = var4;
      this.field_46263 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_46265; var3 < this.field_46262; var3++) {
         int var4 = class_4993.method_22973(this.field_46266) - var3;

         for (int var5 = this.field_46264; var5 < class_4993.method_22972(this.field_46266); var5++) {
            int var6 = 2 * var5;
            int var7 = 2 * (class_4993.method_22972(this.field_46266) - var5);
            this.field_46263[0][var6] = this.field_46263[0][var7];
            this.field_46263[0][var6 + 1] = -this.field_46263[0][var7 + 1];
            this.field_46263[var3][var6] = this.field_46263[var4][var7];
            this.field_46263[var3][var6 + 1] = -this.field_46263[var4][var7 + 1];
         }
      }
   }
}
