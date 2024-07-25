package remapped;

public class class_4777 implements class_8554 {
   private static String[] field_23145;
   private float[][] field_23146;

   public class_4777(class_8554 var1) {
      this.field_23146 = new float[var1.method_39349() * 6 * 3][2];
      int var4 = 0;

      for (int var5 = 0; var5 < var1.method_39349(); var5++) {
         float var6 = 0.0F;
         float var7 = 0.0F;

         for (int var8 = 0; var8 < 3; var8++) {
            float[] var9 = var1.method_39351(var5, var8);
            var6 += var9[0];
            var7 += var9[1];
         }

         var6 /= 3.0F;
         var7 /= 3.0F;

         for (int var14 = 0; var14 < 3; var14++) {
            int var16 = var14 + 1;
            if (var16 > 2) {
               var16 = 0;
            }

            float[] var10 = var1.method_39351(var5, var14);
            float[] var11 = var1.method_39351(var5, var16);
            var10[0] = (var10[0] + var11[0]) / 2.0F;
            var10[1] = (var10[1] + var11[1]) / 2.0F;
            this.field_23146[var4 * 3 + 0][0] = var6;
            this.field_23146[var4 * 3 + 0][1] = var7;
            this.field_23146[var4 * 3 + 1][0] = var10[0];
            this.field_23146[var4 * 3 + 1][1] = var10[1];
            this.field_23146[var4 * 3 + 2][0] = var11[0];
            this.field_23146[var4 * 3 + 2][1] = var11[1];
            var4++;
         }

         for (int var15 = 0; var15 < 3; var15++) {
            int var17 = var15 + 1;
            if (var17 > 2) {
               var17 = 0;
            }

            float[] var18 = var1.method_39351(var5, var15);
            float[] var19 = var1.method_39351(var5, var17);
            var19[0] = (var18[0] + var19[0]) / 2.0F;
            var19[1] = (var18[1] + var19[1]) / 2.0F;
            this.field_23146[var4 * 3 + 0][0] = var6;
            this.field_23146[var4 * 3 + 0][1] = var7;
            this.field_23146[var4 * 3 + 1][0] = var18[0];
            this.field_23146[var4 * 3 + 1][1] = var18[1];
            this.field_23146[var4 * 3 + 2][0] = var19[0];
            this.field_23146[var4 * 3 + 2][1] = var19[1];
            var4++;
         }
      }
   }

   @Override
   public void method_39348(float var1, float var2) {
   }

   @Override
   public int method_39349() {
      return this.field_23146.length / 3;
   }

   @Override
   public float[] method_39351(int var1, int var2) {
      float[] var5 = this.field_23146[var1 * 3 + var2];
      return new float[]{var5[0], var5[1]};
   }

   @Override
   public void method_39350() {
   }

   @Override
   public boolean method_39352() {
      return true;
   }
}
