package remapped;

import net.sourceforge.jaad.aac.AACException;

public class class_8809 implements class_7623, class_7329, class_5168 {
   private static final float[][] field_45086 = new float[][]{field_26607, field_26610};
   private static final float[][] field_45089 = new float[][]{field_26608, field_26609};
   private final int field_45093;
   private final int field_45091;
   private final int field_45088;
   private final int field_45087;
   private final int field_45092;

   public class_8809(int var1) {
      this.field_45093 = var1;
      this.field_45088 = var1 / 4;
      this.field_45091 = var1 / 8;
      this.field_45087 = this.field_45091 / 4;
      this.field_45092 = (this.field_45088 - this.field_45087) / 2;
   }

   public void method_40484(float[] var1, float[] var2, int var3, int var4, class_6954 var5) throws AACException {
      float[] var8 = new float[this.field_45093];
      if (!var5.equals(class_6954.field_35756)) {
         for (int var9 = 0; var9 < 4; var9++) {
            for (int var11 = 0; var11 < this.field_45088; var11++) {
               if (var9 % 2 != 0) {
                  var8[this.field_45088 * var9 + var11] = var1[this.field_45088 * var9 + this.field_45088 - 1 - var11];
               } else {
                  var8[this.field_45088 * var9 + var11] = var1[this.field_45088 * var9 + var11];
               }
            }
         }
      } else {
         for (int var12 = 0; var12 < 4; var12++) {
            for (int var10 = 0; var10 < 8; var10++) {
               for (int var14 = 0; var14 < this.field_45087; var14++) {
                  if (var12 % 2 != 0) {
                     var8[this.field_45088 * var12 + this.field_45087 * var10 + var14] = var1[this.field_45091 * var10
                        + this.field_45087 * var12
                        + this.field_45087
                        - 1
                        - var14];
                  } else {
                     var8[this.field_45088 * var12 + this.field_45087 * var10 + var14] = var1[this.field_45091 * var10 + this.field_45087 * var12 + var14];
                  }
               }
            }
         }
      }

      for (int var13 = 0; var13 < 4; var13++) {
         this.method_40483(var8, var2, var5, var3, var4, var13);
      }
   }

   private void method_40483(float[] var1, float[] var2, class_6954 var3, int var4, int var5, int var6) throws AACException {
      float[] var9 = new float[this.field_45088];
      float[] var10 = new float[this.field_45088 * 2];
      float[] var11 = new float[this.field_45088 * 2];
      float[] var12 = new float[this.field_45087 * 2];
      float[] var13 = new float[this.field_45087 * 2];
      switch (var3) {
         case field_35755:
            for (int var25 = 0; var25 < this.field_45088; var25++) {
               var11[var25] = field_45086[var5][var25];
               var11[this.field_45088 * 2 - 1 - var25] = field_45086[var4][var25];
            }
            break;
         case field_35756:
            for (int var24 = 0; var24 < this.field_45087; var24++) {
               var12[var24] = field_45089[var5][var24];
               var12[this.field_45087 * 2 - 1 - var24] = field_45089[var4][var24];
               var13[var24] = field_45089[var4][var24];
               var13[this.field_45087 * 2 - 1 - var24] = field_45089[var4][var24];
            }
            break;
         case field_35757:
            for (int var20 = 0; var20 < this.field_45088; var20++) {
               var11[var20] = field_45086[var5][var20];
            }

            for (int var21 = 0; var21 < this.field_45092; var21++) {
               var11[var21 + this.field_45088] = 1.0F;
            }

            for (int var22 = 0; var22 < this.field_45087; var22++) {
               var11[var22 + this.field_45092 + this.field_45088] = field_45089[var4][this.field_45087 - 1 - var22];
            }

            for (int var23 = 0; var23 < this.field_45092; var23++) {
               var11[var23 + this.field_45092 + this.field_45088 + this.field_45087] = 0.0F;
            }
            break;
         case field_35758:
            for (int var14 = 0; var14 < this.field_45092; var14++) {
               var11[var14] = 0.0F;
            }

            for (int var17 = 0; var17 < this.field_45087; var17++) {
               var11[var17 + this.field_45092] = field_45089[var5][var17];
            }

            for (int var18 = 0; var18 < this.field_45092; var18++) {
               var11[var18 + this.field_45092 + this.field_45087] = 1.0F;
            }

            for (int var19 = 0; var19 < this.field_45088; var19++) {
               var11[var19 + this.field_45092 + this.field_45087 + this.field_45092] = field_45086[var4][this.field_45088 - 1 - var19];
            }
      }

      if (var3.equals(class_6954.field_35756)) {
         for (int var15 = 0; var15 < 8; var15++) {
            for (int var16 = 0; var16 < this.field_45087; var16++) {
               var9[var16] = var1[var6 * this.field_45088 + var15 * this.field_45087 + var16];
            }

            if (var15 == 0) {
               System.arraycopy(var12, 0, var11, 0, this.field_45087 * 2);
            } else {
               System.arraycopy(var13, 0, var11, 0, this.field_45087 * 2);
            }

            this.method_40482(var9, var10, var11, this.field_45087);

            for (int var28 = 0; var28 < this.field_45087 * 2; var28++) {
               var2[var6 * this.field_45088 * 2 + var15 * this.field_45087 * 2 + var28] = var10[var28] / 32.0F;
            }
         }
      } else {
         for (int var26 = 0; var26 < this.field_45088; var26++) {
            var9[var26] = var1[var6 * this.field_45088 + var26];
         }

         this.method_40482(var9, var10, var11, this.field_45088);

         for (int var27 = 0; var27 < this.field_45088 * 2; var27++) {
            var2[var6 * this.field_45088 * 2 + var27] = var10[var27] / 256.0F;
         }
      }
   }

   private void method_40482(float[] var1, float[] var2, float[] var3, int var4) throws AACException {
      int var7 = var4 / 2;
      float[][] var8;
      float[][] var9;
      if (var4 != 256) {
         if (var4 != 32) {
            throw new class_5060("gain control: unexpected IMDCT length");
         }

         var8 = field_37454;
         var9 = field_37455;
      } else {
         var8 = field_37453;
         var9 = field_37452;
      }

      float[] var10 = new float[var4];

      for (int var11 = 0; var11 < var7; var11++) {
         var10[var11] = var1[2 * var11];
      }

      for (int var13 = var7; var13 < var4; var13++) {
         var10[var13] = -var1[2 * var4 - 1 - 2 * var13];
      }

      float[][] var12 = new float[var7][2];

      for (int var14 = 0; var14 < var7; var14++) {
         var12[var14][0] = var8[var14][0] * var10[2 * var14] - var8[var14][1] * var10[2 * var14 + 1];
         var12[var14][1] = var8[var14][0] * var10[2 * var14 + 1] + var8[var14][1] * var10[2 * var14];
      }

      class_8335.method_38383(var12, var7);

      for (int var15 = 0; var15 < var7; var15++) {
         var10[var15] = var9[var15][0] * var12[var15][0]
            + var9[var15][1] * var12[var7 - 1 - var15][0]
            + var9[var15][2] * var12[var15][1]
            + var9[var15][3] * var12[var7 - 1 - var15][1];
         var10[var4 - 1 - var15] = var9[var15][2] * var12[var15][0]
            - var9[var15][3] * var12[var7 - 1 - var15][0]
            - var9[var15][0] * var12[var15][1]
            + var9[var15][1] * var12[var7 - 1 - var15][1];
      }

      System.arraycopy(var10, var7, var2, 0, var7);

      for (int var16 = var7; var16 < var4 * 3 / 2; var16++) {
         var2[var16] = -var10[var4 * 3 / 2 - 1 - var16];
      }

      for (int var17 = var4 * 3 / 2; var17 < var4 * 2; var17++) {
         var2[var17] = -var10[var17 - var4 * 3 / 2];
      }

      for (int var18 = 0; var18 < var4; var18++) {
         var2[var18] *= var3[var18];
      }
   }
}
