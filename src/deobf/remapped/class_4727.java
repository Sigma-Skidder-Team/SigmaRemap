package remapped;

public class class_4727 implements Runnable {
   private static String[] field_22912;

   public class_4727(class_2817 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_22914 = var1;
      this.field_22916 = var2;
      this.field_22915 = var3;
      this.field_22911 = var4;
      this.field_22913 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[class_2817.method_12821(this.field_22914)];

      for (int var4 = this.field_22916; var4 < this.field_22915; var4++) {
         for (int var5 = 0; var5 < class_2817.method_12821(this.field_22914); var5++) {
            var3[var5] = this.field_22911[var5 * class_2817.method_12836(this.field_22914) + var4];
         }

         class_2817.method_12837(this.field_22914).method_17790(var3, this.field_22913);

         for (int var6 = 0; var6 < class_2817.method_12821(this.field_22914); var6++) {
            this.field_22911[var6 * class_2817.method_12836(this.field_22914) + var4] = var3[var6];
         }
      }
   }
}
