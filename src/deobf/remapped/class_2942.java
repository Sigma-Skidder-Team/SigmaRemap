package remapped;

import net.sourceforge.jaad.aac.AACException;

public class class_2942 implements class_5513, class_4086, class_5016 {
   private static String[] field_14346;
   public boolean field_14319;
   public boolean field_14341;
   public boolean field_14348;
   public int field_14321;
   public int field_14349;
   public int field_14353;
   public int field_14330;
   public int field_14312;
   public int field_14305;
   public int field_14344;
   public int[] field_14350 = new int[6];
   public boolean[] field_14317 = new boolean[5];
   public boolean[] field_14326 = new boolean[5];
   public boolean field_14331;
   public int field_14308;
   public boolean[] field_14337 = new boolean[5];
   public boolean[] field_14355 = new boolean[5];
   public int[] field_14357 = new int[34];
   public int[] field_14309 = new int[34];
   public int[] field_14311 = new int[17];
   public int[] field_14316 = new int[17];
   public int[][] field_14323 = new int[5][34];
   public int[][] field_14351 = new int[5][34];
   public int[][] field_14314 = new int[5][17];
   public int[][] field_14347 = new int[5][17];
   public int[] field_14336 = new int[17];
   public int[] field_14306 = new int[17];
   public int[] field_14345 = new int[17];
   public int[] field_14338 = new int[17];
   public int field_14324;
   public boolean field_14342;
   public class_1933 field_14328;
   public boolean field_14325;
   public int field_14318;
   public int field_14302;
   public int field_14310;
   public int field_14322;
   public int field_14352;
   public int field_14358;
   public int[] field_14320;
   public int[] field_14301;
   public int field_14334;
   public int[] field_14360 = new int[3];
   public int[] field_14363 = new int[3];
   public int[] field_14303 = new int[64];
   public int[] field_14332 = new int[64];
   public float[][][] field_14354 = new float[14][64][2];
   public float[][][] field_14361 = new float[2][32][2];
   public float[][][][] field_14362 = new float[3][5][64][2];
   public float[][][][] field_14304 = new float[3][5][32][2];
   public float field_14339;
   public float field_14307;
   public float[] field_14340 = new float[34];
   public float[] field_14343 = new float[34];
   public float[] field_14335 = new float[34];
   public float[][] field_14359 = new float[50][2];
   public float[][] field_14313 = new float[50][2];
   public float[][] field_14356 = new float[50][2];
   public float[][] field_14327 = new float[50][2];
   public int field_14315;
   public float[][][] field_14329 = new float[20][2][2];
   public float[][][] field_14333 = new float[20][2][2];

   public class_2942(class_8965 var1, int var2) {
      this.field_14328 = new class_1933(var2);
      this.field_14318 = var2;
      this.field_14324 = 0;
      this.field_14334 = 0;

      for (int var5 = 0; var5 < 64; var5++) {
         this.field_14332[var5] = 0;
      }

      for (int var7 = 0; var7 < 3; var7++) {
         this.field_14360[var7] = 0;
         this.field_14363[var7] = field_19899[var7];
      }

      byte var6 = 35;
      this.field_14352 = 22;
      this.field_14339 = 0.7659283F;
      this.field_14307 = 0.25F;

      for (int var8 = 0; var8 < var6; var8++) {
         this.field_14303[var8] = 14;
      }

      for (int var9 = var6; var9 < 64; var9++) {
         this.field_14303[var9] = 1;
      }

      for (int var10 = 0; var10 < 50; var10++) {
         this.field_14359[var10][0] = 1.0F;
         this.field_14313[var10][1] = 1.0F;
         this.field_14359[var10][0] = 1.0F;
         this.field_14313[var10][1] = 1.0F;
      }

      this.field_14315 = 0;

      for (int var11 = 0; var11 < 20; var11++) {
         this.field_14329[var11][0][0] = 0.0F;
         this.field_14329[var11][0][1] = 0.0F;
         this.field_14329[var11][1][0] = 0.0F;
         this.field_14329[var11][1][1] = 0.0F;
         this.field_14333[var11][0][0] = 0.0F;
         this.field_14333[var11][0][1] = 0.0F;
         this.field_14333[var11][1][0] = 0.0F;
         this.field_14333[var11][1][1] = 0.0F;
      }
   }

   public int method_13464(class_7390 var1) throws AACException {
      long var4 = (long)var1.method_33665();
      if (var1.method_33660()) {
         this.field_14342 = true;
         this.field_14325 = false;
         this.field_14319 = var1.method_33660();
         if (this.field_14319) {
            this.field_14321 = var1.method_33662(3);
            this.field_14353 = field_19901[this.field_14321];
            this.field_14330 = field_19914[this.field_14321];
            if (this.field_14321 == 2 || this.field_14321 == 5) {
               this.field_14325 = true;
            }

            this.field_14308 = this.field_14321;
         }

         this.field_14341 = var1.method_33660();
         if (this.field_14341) {
            this.field_14349 = var1.method_33662(3);
            this.field_14312 = field_19889[this.field_14349];
            if (this.field_14349 == 2 || this.field_14349 == 5) {
               this.field_14325 = true;
            }
         }

         this.field_14348 = var1.method_33660();
      }

      if (!this.field_14342) {
         this.field_14324 = 0;
         return 1;
      } else {
         this.field_14305 = var1.method_33655();
         int var6 = var1.method_33662(2);
         this.field_14344 = field_19918[this.field_14305][var6];
         if (this.field_14305 != 0) {
            for (int var8 = 1; var8 < this.field_14344 + 1; var8++) {
               this.field_14350[var8] = var1.method_33662(5) + 1;
            }
         }

         if (this.field_14319) {
            for (int var13 = 0; var13 < this.field_14344; var13++) {
               this.field_14317[var13] = var1.method_33660();
               if (this.field_14321 >= 3) {
                  this.method_13467(var1, this.field_14317[var13], this.field_14353, field_25947, field_25953, this.field_14323[var13]);
               } else {
                  this.method_13467(var1, this.field_14317[var13], this.field_14353, field_25954, field_25948, this.field_14323[var13]);
               }
            }
         }

         if (this.field_14341) {
            for (int var14 = 0; var14 < this.field_14344; var14++) {
               this.field_14326[var14] = var1.method_33660();
               this.method_13467(var1, this.field_14326[var14], this.field_14312, field_25951, field_25950, this.field_14351[var14]);
            }
         }

         if (this.field_14348) {
            int var9 = var1.method_33662(4);
            if (var9 == 15) {
               var9 += var1.method_33662(8);
            }

            int var7 = 8 * var9;

            while (var7 > 7) {
               int var10 = var1.method_33662(2);
               var7 -= 2;
               var7 -= this.method_13457(var1, var10, var7);
            }

            var1.method_33652(var7);
         }

         int var12 = (int)((long)var1.method_33665() - var4);
         this.field_14324 = 1;
         return var12;
      }
   }

   private int method_13457(class_7390 var1, int var2, int var3) throws AACException {
      long var6 = (long)var1.method_33665();
      if (var2 == 0) {
         this.field_14331 = var1.method_33660();
         if (this.field_14331) {
            for (int var9 = 0; var9 < this.field_14344; var9++) {
               this.field_14337[var9] = var1.method_33660();
               this.method_13467(var1, this.field_14337[var9], this.field_14330, field_25946, field_25945, this.field_14314[var9]);
               this.field_14355[var9] = var1.method_33660();
               this.method_13467(var1, this.field_14355[var9], this.field_14330, field_25952, field_25949, this.field_14347[var9]);
            }
         }

         var1.method_33655();
      }

      return (int)((long)var1.method_33665() - var6);
   }

   private void method_13467(class_7390 var1, boolean var2, int var3, int[][] var4, int[][] var5, int[] var6) throws AACException {
      if (!var2) {
         var6[0] = this.method_13462(var1, var5);

         for (int var9 = 1; var9 < var3; var9++) {
            var6[var9] = this.method_13462(var1, var5);
         }
      } else {
         for (int var10 = 0; var10 < var3; var10++) {
            var6[var10] = this.method_13462(var1, var4);
         }
      }
   }

   private int method_13462(class_7390 var1, int[][] var2) throws AACException {
      int var5 = 0;

      while (var5 >= 0) {
         int var6 = var1.method_33655();
         var5 = var2[var5][var6];
      }

      return var5 + 31;
   }

   private int method_13466(int var1, int var2, int var3) {
      if (var1 >= var2) {
         return var1 <= var3 ? var1 : var3;
      } else {
         return var2;
      }
   }

   private void method_13461(boolean var1, int[] var2, int[] var3, boolean var4, int var5, int var6, int var7, int var8) {
      if (!var1) {
         for (int var11 = 0; var11 < var5; var11++) {
            var2[var11] = 0;
         }
      } else if (var4) {
         for (int var12 = 0; var12 < var5; var12++) {
            var2[var12] += var3[var12 * var6];
            var2[var12] = this.method_13466(var2[var12], var7, var8);
         }
      } else {
         var2[0] += 0;
         var2[0] = this.method_13466(var2[0], var7, var8);

         for (int var13 = 1; var13 < var5; var13++) {
            var2[var13] += var2[var13 - 1];
            var2[var13] = this.method_13466(var2[var13], var7, var8);
         }
      }

      if (var6 == 2) {
         for (int var14 = (var5 << 1) - 1; var14 > 0; var14--) {
            var2[var14] = var2[var14 >> 1];
         }
      }
   }

   private void method_13460(boolean var1, int[] var2, int[] var3, boolean var4, int var5, int var6, int var7) {
      if (!var1) {
         for (int var10 = 0; var10 < var5; var10++) {
            var2[var10] = 0;
         }
      } else if (var4) {
         for (int var11 = 0; var11 < var5; var11++) {
            var2[var11] += var3[var11 * var6];
            var2[var11] &= var7;
         }
      } else {
         var2[0] += 0;
         var2[0] &= var7;

         for (int var12 = 1; var12 < var5; var12++) {
            var2[var12] += var2[var12 - 1];
            var2[var12] &= var7;
         }
      }

      if (var6 == 2) {
         var2[0] = 0;

         for (int var13 = (var5 << 1) - 1; var13 > 0; var13--) {
            var2[var13] = var2[var13 >> 1];
         }
      }
   }

   private void method_13463(int[] var1, int var2) {
      var1[1] = (var1[0] + var1[1]) / 2;
      var1[2] = var1[1];
      var1[3] = var1[2];
      var1[4] = (var1[2] + var1[3]) / 2;
      var1[5] = var1[3];
      var1[6] = var1[4];
      var1[7] = var1[4];
      var1[8] = var1[5];
      var1[9] = var1[5];
      var1[10] = var1[6];
      var1[11] = var1[7];
      var1[12] = var1[8];
      var1[13] = var1[8];
      var1[14] = var1[9];
      var1[15] = var1[9];
      var1[16] = var1[10];
      if (var2 == 34) {
         var1[17] = var1[11];
         var1[18] = var1[12];
         var1[19] = var1[13];
         var1[20] = var1[14];
         var1[21] = var1[14];
         var1[22] = var1[15];
         var1[23] = var1[15];
         var1[24] = var1[16];
         var1[25] = var1[16];
         var1[26] = var1[17];
         var1[27] = var1[17];
         var1[28] = var1[18];
         var1[29] = var1[18];
         var1[30] = var1[18];
         var1[31] = var1[18];
         var1[32] = var1[19];
         var1[33] = var1[19];
      }
   }

   private void method_13470() {
      if (this.field_14324 == 0) {
         this.field_14344 = 0;
      }

      for (int var3 = 0; var3 < this.field_14344; var3++) {
         int var5 = this.field_14321 >= 3 ? 15 : 7;
         int[] var6;
         int[] var7;
         int[] var8;
         int[] var9;
         if (var3 != 0) {
            var6 = this.field_14323[var3 - 1];
            var7 = this.field_14351[var3 - 1];
            var8 = this.field_14314[var3 - 1];
            var9 = this.field_14347[var3 - 1];
         } else {
            var6 = this.field_14357;
            var7 = this.field_14309;
            var8 = this.field_14311;
            var9 = this.field_14316;
         }

         this.method_13461(
            this.field_14319,
            this.field_14323[var3],
            var6,
            this.field_14317[var3],
            this.field_14353,
            this.field_14321 != 0 && this.field_14321 != 3 ? 1 : 2,
            -var5,
            var5
         );
         this.method_13461(
            this.field_14341,
            this.field_14351[var3],
            var7,
            this.field_14326[var3],
            this.field_14312,
            this.field_14349 != 0 && this.field_14349 != 3 ? 1 : 2,
            0,
            7
         );
         this.method_13460(this.field_14331, this.field_14314[var3], var8, this.field_14337[var3], this.field_14330, 1, 7);
         this.method_13460(this.field_14331, this.field_14347[var3], var9, this.field_14355[var3], this.field_14330, 1, 7);
      }

      if (this.field_14344 == 0) {
         this.field_14344 = 1;
         if (!this.field_14319) {
            for (int var13 = 0; var13 < 34; var13++) {
               this.field_14323[0][var13] = 0;
            }
         } else {
            for (int var4 = 0; var4 < 34; var4++) {
               this.field_14323[0][var4] = this.field_14357[var4];
            }
         }

         if (!this.field_14341) {
            for (int var15 = 0; var15 < 34; var15++) {
               this.field_14351[0][var15] = 0;
            }
         } else {
            for (int var14 = 0; var14 < 34; var14++) {
               this.field_14351[0][var14] = this.field_14309[var14];
            }
         }

         if (!this.field_14331) {
            for (int var16 = 0; var16 < 17; var16++) {
               this.field_14314[0][var16] = 0;
               this.field_14347[0][var16] = 0;
            }
         } else {
            for (int var17 = 0; var17 < 17; var17++) {
               this.field_14314[0][var17] = this.field_14311[var17];
               this.field_14347[0][var17] = this.field_14316[var17];
            }
         }
      }

      for (int var18 = 0; var18 < 34; var18++) {
         this.field_14357[var18] = this.field_14323[this.field_14344 - 1][var18];
      }

      for (int var19 = 0; var19 < 34; var19++) {
         this.field_14309[var19] = this.field_14351[this.field_14344 - 1][var19];
      }

      for (int var20 = 0; var20 < 17; var20++) {
         this.field_14311[var20] = this.field_14314[this.field_14344 - 1][var20];
         this.field_14316[var20] = this.field_14347[this.field_14344 - 1][var20];
      }

      this.field_14324 = 0;
      if (this.field_14305 != 0) {
         this.field_14350[0] = 0;
         if (this.field_14350[this.field_14344] < this.field_14318) {
            for (int var21 = 0; var21 < 34; var21++) {
               this.field_14323[this.field_14344][var21] = this.field_14323[this.field_14344 - 1][var21];
               this.field_14351[this.field_14344][var21] = this.field_14351[this.field_14344 - 1][var21];
            }

            for (int var22 = 0; var22 < 17; var22++) {
               this.field_14314[this.field_14344][var22] = this.field_14314[this.field_14344 - 1][var22];
               this.field_14347[this.field_14344][var22] = this.field_14347[this.field_14344 - 1][var22];
            }

            this.field_14344++;
            this.field_14350[this.field_14344] = this.field_14318;
         }

         for (int var10 = 1; var10 < this.field_14344; var10++) {
            int var23 = this.field_14318 - (this.field_14344 - var10);
            if (this.field_14350[var10] <= var23) {
               var23 = this.field_14350[var10 - 1] + 1;
               if (this.field_14350[var10] < var23) {
                  this.field_14350[var10] = var23;
               }
            } else {
               this.field_14350[var10] = var23;
            }
         }
      } else {
         this.field_14350[0] = 0;

         for (int var11 = 1; var11 < this.field_14344; var11++) {
            this.field_14350[var11] = var11 * this.field_14318 / this.field_14344;
         }

         this.field_14350[this.field_14344] = this.field_14318;
      }

      if (this.field_14325) {
         for (int var12 = 0; var12 < this.field_14344; var12++) {
            if (this.field_14321 != 2 && this.field_14321 != 5) {
               this.method_13463(this.field_14323[var12], 34);
            }

            if (this.field_14349 != 2 && this.field_14349 != 5) {
               this.method_13463(this.field_14351[var12], 34);
            }

            if (this.field_14308 != 2 && this.field_14308 != 5) {
               this.method_13463(this.field_14314[var12], 17);
               this.method_13463(this.field_14347[var12], 17);
            }
         }
      }
   }

   private void method_13468(float[][][] var1, float[][][] var2, float[][][] var3, float[][][] var4) {
      int var7 = 0;
      int[] var8 = new int[3];
      float[][] var9 = new float[32][34];
      float[][] var10 = new float[32][34];
      float[] var11 = new float[2];
      float[][] var12;
      if (!this.field_14325) {
         var12 = field_19917;
      } else {
         var12 = field_19885;
      }

      for (int var13 = 0; var13 < 32; var13++) {
         for (int var15 = 0; var15 < 34; var15++) {
            var9[var13][var15] = 0.0F;
         }
      }

      for (int var14 = 0; var14 < this.field_14302; var14++) {
         int var34 = -4097 & this.field_14301[var14];
         int var16 = var14 >= this.field_14310 ? this.field_14320[var14 + 1] : this.field_14320[var14] + 1;

         for (int var17 = this.field_14320[var14]; var17 < var16; var17++) {
            for (int var29 = this.field_14350[0]; var29 < this.field_14350[this.field_14344]; var29++) {
               if (var14 >= this.field_14310) {
                  var11[0] = var1[var29][var17][0];
                  var11[1] = var1[var29][var17][1];
               } else {
                  var11[0] = var3[var29][var17][0];
                  var11[1] = var3[var29][var17][1];
               }

               var9[var29][var34] = var9[var29][var34] + var11[0] * var11[0] + var11[1] * var11[1];
            }
         }
      }

      for (int var35 = 0; var35 < this.field_14322; var35++) {
         for (int var30 = this.field_14350[0]; var30 < this.field_14350[this.field_14344]; var30++) {
            float var18 = 1.5F;
            this.field_14340[var35] = this.field_14340[var35] * this.field_14339;
            if (this.field_14340[var35] < var9[var30][var35]) {
               this.field_14340[var35] = var9[var30][var35];
            }

            float var19 = this.field_14335[var35];
            var19 += (this.field_14340[var35] - var9[var30][var35] - this.field_14335[var35]) * this.field_14307;
            this.field_14335[var35] = var19;
            float var20 = this.field_14343[var35];
            var20 += (var9[var30][var35] - this.field_14343[var35]) * this.field_14307;
            this.field_14343[var35] = var20;
            if (!(var19 * var18 <= var20)) {
               var10[var30][var35] = var20 / (var19 * var18);
            } else {
               var10[var30][var35] = 1.0F;
            }
         }
      }

      for (int var33 = 0; var33 < this.field_14302; var33++) {
         int var37;
         if (var33 >= this.field_14310) {
            var37 = this.field_14320[var33 + 1];
         } else {
            var37 = this.field_14320[var33] + 1;
         }

         for (int var38 = this.field_14320[var33]; var38 < var37; var38++) {
            float[] var22 = new float[3];
            float var39;
            if (var33 >= this.field_14310 && var38 > this.field_14358) {
               int var23 = this.field_14358 - var38;
               if (var23 > -20) {
                  var39 = 1.0F + 0.05F * (float)var23;
               } else {
                  var39 = 0.0F;
               }
            } else {
               var39 = 1.0F;
            }

            for (int var21 = 0; var21 < 3; var21++) {
               var22[var21] = var39 * field_19902[var21];
            }

            var7 = this.field_14334;

            for (int var31 = 0; var31 < 3; var31++) {
               var8[var31] = this.field_14360[var31];
            }

            for (int var32 = this.field_14350[0]; var32 < this.field_14350[this.field_14344]; var32++) {
               float[] var45 = new float[2];
               float[] var24 = new float[2];
               float[] var25 = new float[2];
               if (var33 >= this.field_14310) {
                  var11[0] = var1[var32][var38][0];
                  var11[1] = var1[var32][var38][1];
               } else {
                  var11[0] = var3[var32][var38][0];
                  var11[1] = var3[var32][var38][1];
               }

               if (var38 > this.field_14352 && var33 >= this.field_14310) {
                  var45[0] = this.field_14354[this.field_14332[var38]][var38][0];
                  var45[1] = this.field_14354[this.field_14332[var38]][var38][1];
                  var25[0] = var45[0];
                  var25[1] = var45[1];
                  this.field_14354[this.field_14332[var38]][var38][0] = var11[0];
                  this.field_14354[this.field_14332[var38]][var38][1] = var11[1];
               } else {
                  float[] var26 = new float[2];
                  if (var33 >= this.field_14310) {
                     var24[0] = this.field_14354[var7][var38][0];
                     var24[1] = this.field_14354[var7][var38][1];
                     this.field_14354[var7][var38][0] = var11[0];
                     this.field_14354[var7][var38][1] = var11[1];
                     var26[0] = field_19913[var38][0];
                     var26[1] = field_19913[var38][1];
                  } else {
                     var24[0] = this.field_14361[var7][var38][0];
                     var24[1] = this.field_14361[var7][var38][1];
                     this.field_14361[var7][var38][0] = var11[0];
                     this.field_14361[var7][var38][1] = var11[1];
                     var26[0] = var12[var38][0];
                     var26[1] = var12[var38][1];
                  }

                  var45[0] = var45[0] * var26[0] + var24[1] * var26[1];
                  var45[1] = var24[1] * var26[0] - var24[0] * var26[1];
                  var25[0] = var45[0];
                  var25[1] = var45[1];

                  for (int var42 = 0; var42 < 3; var42++) {
                     float[] var27 = new float[2];
                     float[] var28 = new float[2];
                     if (var33 >= this.field_14310) {
                        var24[0] = this.field_14362[var42][var8[var42]][var38][0];
                        var24[1] = this.field_14362[var42][var8[var42]][var38][1];
                        var27[0] = field_19907[var38][var42][0];
                        var27[1] = field_19907[var38][var42][1];
                     } else {
                        var24[0] = this.field_14304[var42][var8[var42]][var38][0];
                        var24[1] = this.field_14304[var42][var8[var42]][var38][1];
                        if (!this.field_14325) {
                           var27[0] = field_19897[var38][var42][0];
                           var27[1] = field_19897[var38][var42][1];
                        } else {
                           var27[0] = field_19898[var38][var42][0];
                           var27[1] = field_19898[var38][var42][1];
                        }
                     }

                     var45[0] = var24[0] * var27[0] + var24[1] * var27[1];
                     var45[1] = var24[1] * var27[0] - var24[0] * var27[1];
                     var45[0] += -(var22[var42] * var25[0]);
                     var45[1] += -(var22[var42] * var25[1]);
                     var28[0] = var25[0] + var22[var42] * var45[0];
                     var28[1] = var25[1] + var22[var42] * var45[1];
                     if (var33 >= this.field_14310) {
                        this.field_14362[var42][var8[var42]][var38][0] = var28[0];
                        this.field_14362[var42][var8[var42]][var38][1] = var28[1];
                     } else {
                        this.field_14304[var42][var8[var42]][var38][0] = var28[0];
                        this.field_14304[var42][var8[var42]][var38][1] = var28[1];
                     }

                     var25[0] = var45[0];
                     var25[1] = var45[1];
                  }
               }

               int var36 = -4097 & this.field_14301[var33];
               var25[0] = var10[var32][var36] * var25[0];
               var25[1] = var10[var32][var36] * var25[1];
               if (var33 >= this.field_14310) {
                  var2[var32][var38][0] = var25[0];
                  var2[var32][var38][1] = var25[1];
               } else {
                  var4[var32][var38][0] = var25[0];
                  var4[var32][var38][1] = var25[1];
               }

               if (++var7 >= 2) {
                  var7 = 0;
               }

               if (var38 > this.field_14352 && var33 >= this.field_14310 && ++this.field_14332[var38] >= this.field_14303[var38]) {
                  this.field_14332[var38] = 0;
               }

               for (int var43 = 0; var43 < 3; var43++) {
                  if (++var8[var43] >= this.field_14363[var43]) {
                     var8[var43] = 0;
                  }
               }
            }
         }
      }

      this.field_14334 = var7;

      for (int var44 = 0; var44 < 3; var44++) {
         this.field_14360[var44] = var8[var44];
      }
   }

   private float method_13459(float[] var1) {
      return (float)Math.sqrt((double)(var1[0] * var1[0] + var1[1] * var1[1]));
   }

   private void method_13465(float[][][] var1, float[][][] var2, float[][][] var3, float[][][] var4) {
      int var7 = 0;
      float[] var8 = new float[2];
      float[] var9 = new float[2];
      float[] var10 = new float[2];
      float[] var11 = new float[2];
      float[] var12 = new float[2];
      float[] var13 = new float[2];
      float[] var14 = new float[2];
      float[] var15 = new float[2];
      float[] var16 = new float[2];
      float[] var17 = new float[2];
      float[] var18 = new float[2];
      float[] var19 = new float[2];
      float[] var20 = new float[2];
      float[] var21 = new float[2];
      float[] var22 = new float[2];
      float[] var23 = new float[2];
      byte var24;
      float[] var25;
      if (this.field_14321 < 3) {
         var24 = 7;
         var25 = field_19916;
      } else {
         var24 = 15;
         var25 = field_19894;
      }

      int var26;
      if (this.field_14308 != 0 && this.field_14308 != 3) {
         var26 = this.field_14330;
      } else {
         var26 = 11;
      }

      for (int var27 = 0; var27 < this.field_14302; var27++) {
         var7 = -4097 & this.field_14301[var27];
         int var28 = var27 >= this.field_14310 ? this.field_14320[var27 + 1] : this.field_14320[var27] + 1;

         for (int var29 = 0; var29 < this.field_14344; var29++) {
            if (this.field_14349 >= 3) {
               float var31;
               float var32;
               float var33;
               float var34;
               if (this.field_14321 < 3) {
                  int var30 = Math.abs(this.field_14323[var29][var7]);
                  var31 = field_19895[var24 + this.field_14323[var29][var7]][this.field_14351[var29][var7]];
                  var32 = field_19895[14 - (var24 + this.field_14323[var29][var7])][this.field_14351[var29][var7]];
                  var33 = field_19911[var30][this.field_14351[var29][var7]];
                  var34 = field_19908[var30][this.field_14351[var29][var7]];
               } else {
                  int var44 = Math.abs(this.field_14323[var29][var7]);
                  var31 = field_19887[var24 + this.field_14323[var29][var7]][this.field_14351[var29][var7]];
                  var32 = field_19887[30 - (var24 + this.field_14323[var29][var7])][this.field_14351[var29][var7]];
                  var33 = field_19909[var44][this.field_14351[var29][var7]];
                  var34 = field_19892[var44][this.field_14351[var29][var7]];
               }

               var8[0] = 1.4142135F * var31 * var33;
               var9[0] = 1.4142135F * var32 * var33;
               var10[0] = 1.4142135F * -var31 * var34;
               var11[0] = 1.4142135F * var32 * var34;
            } else {
               float var50 = var25[var24 + this.field_14323[var29][var7]];
               float var47 = var25[var24 - this.field_14323[var29][var7]];
               float var53 = field_19912[this.field_14351[var29][var7]];
               float var55 = field_19921[this.field_14351[var29][var7]];
               float var35;
               float var45;
               if (this.field_14321 < 3) {
                  if (this.field_14323[var29][var7] >= 0) {
                     var45 = field_19906[this.field_14323[var29][var7]][this.field_14351[var29][var7]];
                     var35 = field_19915[this.field_14323[var29][var7]][this.field_14351[var29][var7]];
                  } else {
                     var45 = field_19906[-this.field_14323[var29][var7]][this.field_14351[var29][var7]];
                     var35 = -field_19915[-this.field_14323[var29][var7]][this.field_14351[var29][var7]];
                  }
               } else if (this.field_14323[var29][var7] >= 0) {
                  var45 = field_19888[this.field_14323[var29][var7]][this.field_14351[var29][var7]];
                  var35 = field_19904[this.field_14323[var29][var7]][this.field_14351[var29][var7]];
               } else {
                  var45 = field_19888[-this.field_14323[var29][var7]][this.field_14351[var29][var7]];
                  var35 = -field_19904[-this.field_14323[var29][var7]][this.field_14351[var29][var7]];
               }

               float var36 = var45 * var53;
               float var37 = var35 * var55;
               float var38 = var35 * var53;
               float var39 = var45 * var55;
               var8[0] = var47 * (var36 - var37);
               var9[0] = var50 * (var36 + var37);
               var10[0] = var47 * (var38 + var39);
               var11[0] = var50 * (var38 - var39);
            }

            if (this.field_14331 && var7 < var26) {
               int var56 = this.field_14315;
               var20[0] = this.field_14329[var7][var56][0] * 0.25F;
               var20[1] = this.field_14329[var7][var56][1] * 0.25F;
               var21[0] = this.field_14333[var7][var56][0] * 0.25F;
               var21[1] = this.field_14333[var7][var56][1] * 0.25F;
               this.field_14329[var7][var56][0] = field_19919[Math.abs(this.field_14314[var29][var7])];
               this.field_14329[var7][var56][1] = field_19910[Math.abs(this.field_14314[var29][var7])];
               this.field_14333[var7][var56][0] = field_19919[Math.abs(this.field_14347[var29][var7])];
               this.field_14333[var7][var56][1] = field_19910[Math.abs(this.field_14347[var29][var7])];
               var20[0] += this.field_14329[var7][var56][0];
               var20[1] += this.field_14329[var7][var56][1];
               var21[0] += this.field_14333[var7][var56][0];
               var21[1] += this.field_14333[var7][var56][1];
               if (var56 == 0) {
                  var56 = 2;
               }

               var20[0] += this.field_14329[var7][--var56][0] * 0.5F;
               var20[1] += this.field_14329[var7][var56][1] * 0.5F;
               var21[0] += this.field_14333[var7][var56][0] * 0.5F;
               var21[1] += this.field_14333[var7][var56][1] * 0.5F;
               float var51 = this.method_13459(var21);
               float var48 = this.method_13459(var20);
               if (var51 == 0.0F) {
                  var22[0] = 0.0F;
                  var22[1] = 0.0F;
               } else {
                  var22[0] = var21[0] / var51;
                  var22[1] = var21[1] / var51;
               }

               float var54 = var51 * var48;
               if (var54 == 0.0F) {
                  var23[0] = 0.0F;
                  var23[1] = 0.0F;
               } else {
                  float var46 = var21[0] * var20[0] + var21[1] * var20[1];
                  float var58 = var21[1] * var20[0] - var21[0] * var20[1];
                  var23[0] = var46 / var54;
                  var23[1] = var58 / var54;
               }

               var8[1] = var8[0] * var22[1];
               var9[1] = var9[0] * var23[1];
               var10[1] = var10[0] * var22[1];
               var11[1] = var11[0] * var23[1];
               var8[0] *= var22[0];
               var9[0] *= var23[0];
               var10[0] *= var22[0];
               var11[0] *= var23[0];
            }

            float var40 = (float)(this.field_14350[var29 + 1] - this.field_14350[var29]);
            var16[0] = (var8[0] - this.field_14359[var27][0]) / var40;
            var17[0] = (var9[0] - this.field_14313[var27][0]) / var40;
            var18[0] = (var10[0] - this.field_14356[var27][0]) / var40;
            var19[0] = (var11[0] - this.field_14327[var27][0]) / var40;
            var12[0] = this.field_14359[var27][0];
            var13[0] = this.field_14313[var27][0];
            var14[0] = this.field_14356[var27][0];
            var15[0] = this.field_14327[var27][0];
            this.field_14359[var27][0] = var8[0];
            this.field_14313[var27][0] = var9[0];
            this.field_14356[var27][0] = var10[0];
            this.field_14327[var27][0] = var11[0];
            if (this.field_14331 && var7 < var26) {
               var16[1] = (var8[1] - this.field_14359[var27][1]) / var40;
               var17[1] = (var9[1] - this.field_14313[var27][1]) / var40;
               var18[1] = (var10[1] - this.field_14356[var27][1]) / var40;
               var19[1] = (var11[1] - this.field_14327[var27][1]) / var40;
               var12[1] = this.field_14359[var27][1];
               var13[1] = this.field_14313[var27][1];
               var14[1] = this.field_14356[var27][1];
               var15[1] = this.field_14327[var27][1];
               if ((4096 & this.field_14301[var27]) != 0) {
                  var16[1] = -var16[1];
                  var17[1] = -var17[1];
                  var18[1] = -var18[1];
                  var19[1] = -var19[1];
                  var12[1] = -var12[1];
                  var13[1] = -var13[1];
                  var14[1] = -var14[1];
                  var15[1] = -var15[1];
               }

               this.field_14359[var27][1] = var8[1];
               this.field_14313[var27][1] = var9[1];
               this.field_14356[var27][1] = var10[1];
               this.field_14327[var27][1] = var11[1];
            }

            for (int var41 = this.field_14350[var29]; var41 < this.field_14350[var29 + 1]; var41++) {
               var12[0] += var16[0];
               var13[0] += var17[0];
               var14[0] += var18[0];
               var15[0] += var19[0];
               if (this.field_14331 && var7 < var26) {
                  var12[1] += var16[1];
                  var13[1] += var17[1];
                  var14[1] += var18[1];
                  var15[1] += var19[1];
               }

               for (int var42 = this.field_14320[var27]; var42 < var28; var42++) {
                  float[] var52 = new float[2];
                  float[] var49 = new float[2];
                  if (var27 >= this.field_14310) {
                     var52[0] = var1[var41][var42][0];
                     var52[1] = var1[var41][var42][1];
                     var49[0] = var2[var41][var42][0];
                     var49[1] = var2[var41][var42][1];
                  } else {
                     var52[0] = var3[var41][var42][0];
                     var52[1] = var3[var41][var42][1];
                     var49[0] = var4[var41][var42][0];
                     var49[1] = var4[var41][var42][1];
                  }

                  var20[0] = var12[0] * var52[0] + var14[0] * var49[0];
                  var20[1] = var12[0] * var52[1] + var14[0] * var49[1];
                  var21[0] = var13[0] * var52[0] + var15[0] * var49[0];
                  var21[1] = var13[0] * var52[1] + var15[0] * var49[1];
                  if (this.field_14331 && var7 < var26) {
                     var20[0] -= var12[1] * var52[1] + var14[1] * var49[1];
                     var20[1] += var12[1] * var52[0] + var14[1] * var49[0];
                     var21[0] -= var13[1] * var52[1] + var15[1] * var49[1];
                     var21[1] += var13[1] * var52[0] + var15[1] * var49[0];
                  }

                  if (var27 >= this.field_14310) {
                     var1[var41][var42][0] = var20[0];
                     var1[var41][var42][1] = var20[1];
                     var2[var41][var42][0] = var21[0];
                     var2[var41][var42][1] = var21[1];
                  } else {
                     var3[var41][var42][0] = var20[0];
                     var3[var41][var42][1] = var20[1];
                     var4[var41][var42][0] = var21[0];
                     var4[var41][var42][1] = var21[1];
                  }
               }
            }

            this.field_14315++;
            if (this.field_14315 == 2) {
               this.field_14315 = 0;
            }
         }
      }
   }

   public int method_13458(float[][][] var1, float[][][] var2) {
      float[][][] var5 = new float[32][32][2];
      float[][][] var6 = new float[32][32][2];
      this.method_13470();
      if (!this.field_14325) {
         this.field_14320 = field_19896;
         this.field_14301 = field_19890;
         this.field_14302 = 22;
         this.field_14310 = 10;
         this.field_14322 = 20;
         this.field_14358 = 3;
      } else {
         this.field_14320 = field_19920;
         this.field_14301 = field_19905;
         this.field_14302 = 50;
         this.field_14310 = 32;
         this.field_14322 = 34;
         this.field_14358 = 5;
      }

      this.field_14328.method_8973(var1, var5, this.field_14325, this.field_14318);
      this.method_13468(var1, var2, var5, var6);
      this.method_13465(var1, var2, var5, var6);
      this.field_14328.method_8975(var1, var5, this.field_14325, this.field_14318);
      this.field_14328.method_8975(var2, var6, this.field_14325, this.field_14318);
      return 0;
   }
}
