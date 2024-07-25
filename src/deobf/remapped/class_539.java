package remapped;

public class class_539 implements Runnable {
   private static String[] field_3252;

   public class_539(class_3803 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field_3253 = var1;
      this.field_3256 = var2;
      this.field_3254 = var3;
      this.field_3251 = var4;
      this.field_3255 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_3803.method_17681(this.field_3253)];

      for (int var4 = this.field_3256; var4 < this.field_3254; var4++) {
         for (int var5 = 0; var5 < class_3803.method_17715(this.field_3253); var5++) {
            for (int var6 = 0; var6 < class_3803.method_17681(this.field_3253); var6++) {
               var3[var6] = this.field_3251[var4][var6][var5];
            }

            class_3803.method_17714(this.field_3253).method_17790(var3, this.field_3255);

            for (int var7 = 0; var7 < class_3803.method_17681(this.field_3253); var7++) {
               this.field_3251[var4][var7][var5] = var3[var7];
            }
         }
      }
   }
}
