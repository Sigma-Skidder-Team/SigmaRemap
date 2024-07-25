package remapped;

public class class_3244 implements Runnable {
   private static String[] field_16122;

   public class_3244(class_4993 var1, int var2, int var3, int var4, float[] var5) {
      this.field_16126 = var1;
      this.field_16121 = var2;
      this.field_16125 = var3;
      this.field_16124 = var4;
      this.field_16123 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * class_4993.method_22973(this.field_16126)];

      for (int var4 = this.field_16121; var4 < this.field_16125; var4++) {
         int var5 = 2 * var4;

         for (int var6 = 0; var6 < class_4993.method_22973(this.field_16126); var6++) {
            int var7 = 2 * var6;
            int var8 = var6 * this.field_16124 + var5;
            var3[var7] = this.field_16123[var8];
            var3[var7 + 1] = this.field_16123[var8 + 1];
         }

         class_4993.method_22985(this.field_16126).method_24185(var3);

         for (int var9 = 0; var9 < class_4993.method_22973(this.field_16126); var9++) {
            int var10 = 2 * var9;
            int var11 = var9 * this.field_16124 + var5;
            this.field_16123[var11] = var3[var10];
            this.field_16123[var11 + 1] = var3[var10 + 1];
         }
      }
   }
}
