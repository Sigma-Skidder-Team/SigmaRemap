package remapped;

public class class_6552 implements Runnable {
   private static String[] field_33395;

   public class_6552(class_3381 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field_33398 = var1;
      this.field_33396 = var2;
      this.field_33397 = var3;
      this.field_33391 = var4;
      this.field_33394 = var5;
      this.field_33393 = var6;
      this.field_33392 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * class_3381.method_15623(this.field_33398)];

      for (int var4 = this.field_33396; var4 < this.field_33397; var4++) {
         int var5 = var4 * this.field_33391;

         for (int var6 = 0; var6 < class_3381.method_15629(this.field_33398); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < class_3381.method_15623(this.field_33398); var8++) {
               int var9 = 2 * var8;
               int var10 = var8 * this.field_33394 + var5 + var7;
               var3[var9] = this.field_33393[var10];
               var3[var9 + 1] = this.field_33393[var10 + 1];
            }

            class_3381.method_15603(this.field_33398).method_24216(var3, this.field_33392);

            for (int var11 = 0; var11 < class_3381.method_15623(this.field_33398); var11++) {
               int var12 = 2 * var11;
               int var13 = var11 * this.field_33394 + var5 + var7;
               this.field_33393[var13] = var3[var12];
               this.field_33393[var13 + 1] = var3[var12 + 1];
            }
         }
      }
   }
}
