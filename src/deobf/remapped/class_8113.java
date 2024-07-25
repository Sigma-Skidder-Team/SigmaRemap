package remapped;

import net.sourceforge.jaad.aac.AACException;

public class class_8113 implements class_7987 {
   private final int field_41578;
   private final float[][] field_41575;
   private final float[][] field_41577;
   private float[] field_41582;
   private float[] field_41583;
   private float[] field_41579;
   private float[] field_41576;
   private float[] field_41581;
   private float[] field_41580;

   public class_8113(int var1) throws AACException {
      this.field_41578 = var1;
      switch (var1) {
         case 60:
            this.field_41575 = field_40922;
            break;
         case 64:
            this.field_41575 = field_40925;
            break;
         case 480:
            this.field_41575 = field_40924;
            break;
         case 512:
            this.field_41575 = field_40923;
            break;
         default:
            throw new class_5060("unexpected FFT length: " + var1);
      }

      this.field_41577 = new float[var1][2];
      this.field_41582 = new float[2];
      this.field_41583 = new float[2];
      this.field_41579 = new float[2];
      this.field_41576 = new float[2];
      this.field_41581 = new float[2];
      this.field_41580 = new float[2];
   }

   public void method_36906(float[][] var1, boolean var2) {
      int var5 = !var2 ? 1 : 2;
      int var6 = !var2 ? 1 : this.field_41578;
      int var7 = 0;

      for (int var8 = 0; var8 < this.field_41578; var8++) {
         this.field_41577[var8][0] = var1[var7][0];
         this.field_41577[var8][1] = var1[var7][1];

         int var9;
         for (var9 = this.field_41578 >> 1; var7 >= var9 && var9 > 0; var9 >>= 1) {
            var7 -= var9;
         }

         var7 += var9;
      }

      for (int var18 = 0; var18 < this.field_41578; var18++) {
         var1[var18][0] = this.field_41577[var18][0];
         var1[var18][1] = this.field_41577[var18][1];
      }

      for (byte var19 = 0; var19 < this.field_41578; var19 += 4) {
         this.field_41582[0] = var1[var19][0] + var1[var19 + 1][0];
         this.field_41582[1] = var1[var19][1] + var1[var19 + 1][1];
         this.field_41583[0] = var1[var19 + 2][0] + var1[var19 + 3][0];
         this.field_41583[1] = var1[var19 + 2][1] + var1[var19 + 3][1];
         this.field_41579[0] = var1[var19][0] - var1[var19 + 1][0];
         this.field_41579[1] = var1[var19][1] - var1[var19 + 1][1];
         this.field_41576[0] = var1[var19 + 2][0] - var1[var19 + 3][0];
         this.field_41576[1] = var1[var19 + 2][1] - var1[var19 + 3][1];
         var1[var19][0] = this.field_41582[0] + this.field_41583[0];
         var1[var19][1] = this.field_41582[1] + this.field_41583[1];
         var1[var19 + 2][0] = this.field_41582[0] - this.field_41583[0];
         var1[var19 + 2][1] = this.field_41582[1] - this.field_41583[1];
         this.field_41581[0] = this.field_41579[0] - this.field_41576[1];
         this.field_41581[1] = this.field_41579[1] + this.field_41576[0];
         this.field_41580[0] = this.field_41579[0] + this.field_41576[1];
         this.field_41580[1] = this.field_41579[1] - this.field_41576[0];
         if (!var2) {
            var1[var19 + 1][0] = this.field_41581[0];
            var1[var19 + 1][1] = this.field_41581[1];
            var1[var19 + 3][0] = this.field_41580[0];
            var1[var19 + 3][1] = this.field_41580[1];
         } else {
            var1[var19 + 1][0] = this.field_41580[0];
            var1[var19 + 1][1] = this.field_41580[1];
            var1[var19 + 3][0] = this.field_41581[0];
            var1[var19 + 3][1] = this.field_41581[1];
         }
      }

      for (byte var10 = 4; var10 < this.field_41578; var10 <<= 1) {
         int var20 = var10 << 1;
         int var21 = this.field_41578 / var20;

         for (int var11 = 0; var11 < this.field_41578; var11 += var20) {
            for (int var12 = 0; var12 < var10; var12++) {
               int var13 = var12 * var21;
               float var14 = this.field_41575[var13][0];
               float var15 = this.field_41575[var13][var5];
               float var16 = var1[var10 + var11 + var12][0] * var14 - var1[var10 + var11 + var12][1] * var15;
               float var17 = var1[var10 + var11 + var12][0] * var15 + var1[var10 + var11 + var12][1] * var14;
               var1[var10 + var11 + var12][0] = (var1[var11 + var12][0] - var16) * (float)var6;
               var1[var10 + var11 + var12][1] = (var1[var11 + var12][1] - var17) * (float)var6;
               var1[var11 + var12][0] = (var1[var11 + var12][0] + var16) * (float)var6;
               var1[var11 + var12][1] = (var1[var11 + var12][1] + var17) * (float)var6;
            }
         }
      }
   }
}
