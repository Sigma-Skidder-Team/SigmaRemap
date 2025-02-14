package mapped;

public class Class8293 implements Class8289, Class8294 {
   private static String[] field35632;
   private final float[] field35633 = new float[4];
   private final float[][] field35634 = new float[2][24];
   private final float[][] field35635 = new float[2][24];

   public void method28986(float[][] var1, int var2, int var3, float[] var4) {
      for (int var7 = 0; var7 < var2; var7++) {
         var4[var7] = 0.0F;
      }

      for (int var9 = 0; var9 < var2 / 4; var9++) {
         for (int var8 = 0; var8 < 4; var8++) {
            this.field35633[var8] = var1[var8][var9];
         }

         this.method28987(this.field35633, var4, var9 * 4);
      }
   }

   private void method28987(float[] var1, float[] var2, int var3) {
      byte var6 = 12;

      for (int var7 = 0; var7 < 2; var7++) {
         for (int var8 = 0; var8 < 23; var8++) {
            this.field35634[var7][var8] = this.field35634[var7][var8 + 1];
            this.field35635[var7][var8] = this.field35635[var7][var8 + 1];
         }
      }

      for (int var11 = 0; var11 < 2; var11++) {
         float var9 = 0.0F;

         for (int var10 = 0; var10 < 4; var10++) {
            var9 += field35637[var11][var10] * var1[var10];
         }

         this.field35634[var11][23] = var9;
         var9 = 0.0F;

         for (int var20 = 0; var20 < 4; var20++) {
            var9 += field35638[var11][var20] * var1[var20];
         }

         this.field35635[var11][23] = var9;
      }

      for (int var12 = 0; var12 < 2; var12++) {
         float var18 = 0.0F;

         for (int var13 = 0; var13 < 12; var13++) {
            var18 += field35639[var12][var13] * this.field35634[var12][23 - 2 * var13];
         }

         for (int var14 = 0; var14 < 12; var14++) {
            var18 += field35640[var12][var14] * this.field35635[var12][22 - 2 * var14];
         }

         var2[var3 + var12] = var18;
         var18 = 0.0F;

         for (int var15 = 0; var15 < 12; var15++) {
            var18 += field35639[3 - var12][var15] * this.field35634[var12][23 - 2 * var15];
         }

         for (int var16 = 0; var16 < 12; var16++) {
            var18 -= field35640[3 - var12][var16] * this.field35635[var12][22 - 2 * var16];
         }

         var2[var3 + 4 - 1 - var12] = var18;
      }
   }
}
