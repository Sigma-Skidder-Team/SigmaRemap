package remapped;

public class class_3067 implements Runnable {
   private static String[] field_15077;

   public class_3067(class_3381 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_15079 = var1;
      this.field_15080 = var2;
      this.field_15078 = var3;
      this.field_15076 = var4;
      this.field_15075 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * class_3381.method_15623(this.field_15079)];

      for (int var4 = this.field_15080; var4 < this.field_15078; var4++) {
         int var5 = var4 * class_3381.method_15616(this.field_15079);

         for (int var6 = 0; var6 < class_3381.method_15629(this.field_15079); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < class_3381.method_15623(this.field_15079); var8++) {
               int var9 = var8 * class_3381.method_15637(this.field_15079) + var5 + var7;
               int var10 = 2 * var8;
               var3[var10] = this.field_15076[var9];
               var3[var10 + 1] = this.field_15076[var9 + 1];
            }

            class_3381.method_15603(this.field_15079).method_24216(var3, this.field_15075);

            for (int var11 = 0; var11 < class_3381.method_15623(this.field_15079); var11++) {
               int var12 = var11 * class_3381.method_15637(this.field_15079) + var5 + var7;
               int var13 = 2 * var11;
               this.field_15076[var12] = var3[var13];
               this.field_15076[var12 + 1] = var3[var13 + 1];
            }
         }
      }
   }
}
