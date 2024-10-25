package mapped;



public class Class8290 implements Class8289, Class8291, Class8292 {
   private static final float[][] field35617 = new float[][]{field35628, field35630};
   private static final float[][] field35618 = new float[][]{field35629, field35631};
   private final int field35619;
   private final int field35620;
   private final int field35621;
   private final int field35622;
   private final int field35623;

   public Class8290(int var1) {
      this.field35619 = var1;
      this.field35621 = var1 / 4;
      this.field35620 = var1 / 8;
      this.field35622 = this.field35620 / 4;
      this.field35623 = (this.field35621 - this.field35622) / 2;
   }

   public void method28983(float[] var1, float[] var2, int var3, int var4, Class1973 var5) throws AACException {
      float[] var8 = new float[this.field35619];
      if (!var5.equals(Class1973.field12845)) {
         for (int var9 = 0; var9 < 4; var9++) {
            for (int var11 = 0; var11 < this.field35621; var11++) {
               if (var9 % 2 != 0) {
                  var8[this.field35621 * var9 + var11] = var1[this.field35621 * var9 + this.field35621 - 1 - var11];
               } else {
                  var8[this.field35621 * var9 + var11] = var1[this.field35621 * var9 + var11];
               }
            }
         }
      } else {
         for (int var12 = 0; var12 < 4; var12++) {
            for (int var10 = 0; var10 < 8; var10++) {
               for (int var14 = 0; var14 < this.field35622; var14++) {
                  if (var12 % 2 != 0) {
                     var8[this.field35621 * var12 + this.field35622 * var10 + var14] = var1[this.field35620 * var10
                        + this.field35622 * var12
                        + this.field35622
                        - 1
                        - var14];
                  } else {
                     var8[this.field35621 * var12 + this.field35622 * var10 + var14] = var1[this.field35620 * var10 + this.field35622 * var12 + var14];
                  }
               }
            }
         }
      }

      for (int var13 = 0; var13 < 4; var13++) {
         this.method28984(var8, var2, var5, var3, var4, var13);
      }
   }

   private void method28984(float[] var1, float[] var2, Class1973 var3, int var4, int var5, int var6) throws AACException {
      float[] var9 = new float[this.field35621];
      float[] var10 = new float[this.field35621 * 2];
      float[] var11 = new float[this.field35621 * 2];
      float[] var12 = new float[this.field35622 * 2];
      float[] var13 = new float[this.field35622 * 2];
      switch (Class9549.field44462[var3.ordinal()]) {
         case 1:
            for (int var25 = 0; var25 < this.field35621; var25++) {
               var11[var25] = field35617[var5][var25];
               var11[this.field35621 * 2 - 1 - var25] = field35617[var4][var25];
            }
            break;
         case 2:
            for (int var24 = 0; var24 < this.field35622; var24++) {
               var12[var24] = field35618[var5][var24];
               var12[this.field35622 * 2 - 1 - var24] = field35618[var4][var24];
               var13[var24] = field35618[var4][var24];
               var13[this.field35622 * 2 - 1 - var24] = field35618[var4][var24];
            }
            break;
         case 3:
            for (int var20 = 0; var20 < this.field35621; var20++) {
               var11[var20] = field35617[var5][var20];
            }

            for (int var21 = 0; var21 < this.field35623; var21++) {
               var11[var21 + this.field35621] = 1.0F;
            }

            for (int var22 = 0; var22 < this.field35622; var22++) {
               var11[var22 + this.field35623 + this.field35621] = field35618[var4][this.field35622 - 1 - var22];
            }

            for (int var23 = 0; var23 < this.field35623; var23++) {
               var11[var23 + this.field35623 + this.field35621 + this.field35622] = 0.0F;
            }
            break;
         case 4:
            for (int var14 = 0; var14 < this.field35623; var14++) {
               var11[var14] = 0.0F;
            }

            for (int var17 = 0; var17 < this.field35622; var17++) {
               var11[var17 + this.field35623] = field35618[var5][var17];
            }

            for (int var18 = 0; var18 < this.field35623; var18++) {
               var11[var18 + this.field35623 + this.field35622] = 1.0F;
            }

            for (int var19 = 0; var19 < this.field35621; var19++) {
               var11[var19 + this.field35623 + this.field35622 + this.field35623] = field35617[var4][this.field35621 - 1 - var19];
            }
      }

      if (var3.equals(Class1973.field12845)) {
         for (int var15 = 0; var15 < 8; var15++) {
            for (int var16 = 0; var16 < this.field35622; var16++) {
               var9[var16] = var1[var6 * this.field35621 + var15 * this.field35622 + var16];
            }

            if (var15 == 0) {
               System.arraycopy(var12, 0, var11, 0, this.field35622 * 2);
            } else {
               System.arraycopy(var13, 0, var11, 0, this.field35622 * 2);
            }

            this.method28985(var9, var10, var11, this.field35622);

            for (int var28 = 0; var28 < this.field35622 * 2; var28++) {
               var2[var6 * this.field35621 * 2 + var15 * this.field35622 * 2 + var28] = var10[var28] / 32.0F;
            }
         }
      } else {
         for (int var26 = 0; var26 < this.field35621; var26++) {
            var9[var26] = var1[var6 * this.field35621 + var26];
         }

         this.method28985(var9, var10, var11, this.field35621);

         for (int var27 = 0; var27 < this.field35621 * 2; var27++) {
            var2[var6 * this.field35621 * 2 + var27] = var10[var27] / 256.0F;
         }
      }
   }

   private void method28985(float[] var1, float[] var2, float[] var3, int var4) throws AACException {
      int var7 = var4 / 2;
      float[][] var8;
      float[][] var9;
      if (var4 != 256) {
         if (var4 != 32) {
            throw new AACException("gain control: unexpected IMDCT length");
         }

         var8 = field35625;
         var9 = field35627;
      } else {
         var8 = field35624;
         var9 = field35626;
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

      Class9426.method36156(var12, var7);

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
