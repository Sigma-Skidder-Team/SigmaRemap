package remapped;

public class class_2881 implements Runnable {
   private static String[] field_14107;

   public class_2881(class_3381 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_14106 = var1;
      this.field_14104 = var2;
      this.field_14108 = var3;
      this.field_14109 = var4;
      this.field_14105 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * class_3381.method_15581(this.field_14106)];

      for (int var4 = this.field_14104; var4 < this.field_14108; var4++) {
         int var5 = var4 * class_3381.method_15637(this.field_14106);

         for (int var6 = 0; var6 < class_3381.method_15629(this.field_14106); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < class_3381.method_15581(this.field_14106); var8++) {
               int var9 = var5 + var7 + var8 * class_3381.method_15616(this.field_14106);
               int var10 = 2 * var8;
               var3[var10] = this.field_14109[var9];
               var3[var10 + 1] = this.field_14109[var9 + 1];
            }

            class_3381.method_15639(this.field_14106).method_24216(var3, this.field_14105);

            for (int var11 = 0; var11 < class_3381.method_15581(this.field_14106); var11++) {
               int var12 = var5 + var7 + var11 * class_3381.method_15616(this.field_14106);
               int var13 = 2 * var11;
               this.field_14109[var12] = var3[var13];
               this.field_14109[var12 + 1] = var3[var13 + 1];
            }
         }
      }
   }
}
