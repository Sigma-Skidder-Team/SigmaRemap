package remapped;

public class class_7052 implements Runnable {
   private static String[] field_36410;

   public class_7052(class_3381 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field_36414 = var1;
      this.field_36415 = var2;
      this.field_36411 = var3;
      this.field_36412 = var4;
      this.field_36413 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * class_3381.method_15581(this.field_36414)];

      for (int var4 = this.field_36415; var4 < this.field_36411; var4++) {
         for (int var5 = 0; var5 < class_3381.method_15629(this.field_36414); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < class_3381.method_15581(this.field_36414); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field_36412[var4][var7][var6];
               var3[var8 + 1] = this.field_36412[var4][var7][var6 + 1];
            }

            class_3381.method_15639(this.field_36414).method_24216(var3, this.field_36413);

            for (int var9 = 0; var9 < class_3381.method_15581(this.field_36414); var9++) {
               int var10 = 2 * var9;
               this.field_36412[var4][var9][var6] = var3[var10];
               this.field_36412[var4][var9][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}
