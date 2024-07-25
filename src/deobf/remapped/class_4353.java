package remapped;

public class class_4353 implements Runnable {
   private static String[] field_21329;

   public class_4353(class_3381 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field_21328 = var1;
      this.field_21331 = var2;
      this.field_21324 = var3;
      this.field_21325 = var4;
      this.field_21327 = var5;
      this.field_21326 = var6;
      this.field_21330 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * class_3381.method_15581(this.field_21328)];

      for (int var4 = this.field_21331; var4 < this.field_21324; var4++) {
         int var5 = var4 * this.field_21325;

         for (int var6 = 0; var6 < class_3381.method_15629(this.field_21328); var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < class_3381.method_15581(this.field_21328); var8++) {
               int var9 = var5 + var8 * this.field_21327 + var7;
               int var10 = 2 * var8;
               var3[var10] = this.field_21326[var9];
               var3[var10 + 1] = this.field_21326[var9 + 1];
            }

            class_3381.method_15639(this.field_21328).method_24216(var3, this.field_21330);

            for (int var11 = 0; var11 < class_3381.method_15581(this.field_21328); var11++) {
               int var12 = var5 + var11 * this.field_21327 + var7;
               int var13 = 2 * var11;
               this.field_21326[var12] = var3[var13];
               this.field_21326[var12 + 1] = var3[var13 + 1];
            }
         }
      }
   }
}
