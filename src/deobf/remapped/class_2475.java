package remapped;

public class class_2475 implements Runnable {
   private static String[] field_12352;

   public class_2475(class_2817 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field_12356 = var1;
      this.field_12354 = var2;
      this.field_12351 = var3;
      this.field_12353 = var4;
      this.field_12355 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_2817.method_12821(this.field_12356)];

      for (int var4 = this.field_12354; var4 < this.field_12351; var4++) {
         for (int var5 = 0; var5 < class_2817.method_12821(this.field_12356); var5++) {
            var3[var5] = this.field_12353[var5][var4];
         }

         class_2817.method_12837(this.field_12356).method_17790(var3, this.field_12355);

         for (int var6 = 0; var6 < class_2817.method_12821(this.field_12356); var6++) {
            this.field_12353[var6][var4] = var3[var6];
         }
      }
   }
}
