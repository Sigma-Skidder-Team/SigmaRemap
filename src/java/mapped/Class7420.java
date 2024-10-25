package mapped;

public class Class7420 implements Class7422, Class7419, Class7421 {
   private static String[] field31825;
   public boolean field31826;
   public boolean field31827;
   public boolean field31828;
   public int field31829;
   public int field31830;
   public int field31831;
   public int field31832;
   public int field31833;
   public int field31834;
   public int field31835;
   public int[] field31836 = new int[6];
   public boolean[] field31837 = new boolean[5];
   public boolean[] field31838 = new boolean[5];
   public boolean field31839;
   public int field31840;
   public boolean[] field31841 = new boolean[5];
   public boolean[] field31842 = new boolean[5];
   public int[] field31843 = new int[34];
   public int[] field31844 = new int[34];
   public int[] field31845 = new int[17];
   public int[] field31846 = new int[17];
   public int[][] field31847 = new int[5][34];
   public int[][] field31848 = new int[5][34];
   public int[][] field31849 = new int[5][17];
   public int[][] field31850 = new int[5][17];
   public int[] field31851 = new int[17];
   public int[] field31852 = new int[17];
   public int[] field31853 = new int[17];
   public int[] field31854 = new int[17];
   public int field31855;
   public boolean field31856;
   public Class7418 field31857;
   public boolean field31858;
   public int field31859;
   public int field31860;
   public int field31861;
   public int field31862;
   public int field31863;
   public int field31864;
   public int[] field31865;
   public int[] field31866;
   public int field31867;
   public int[] field31868 = new int[3];
   public int[] field31869 = new int[3];
   public int[] field31870 = new int[64];
   public int[] field31871 = new int[64];
   public float[][][] field31872 = new float[14][64][2];
   public float[][][] field31873 = new float[2][32][2];
   public float[][][][] field31874 = new float[3][5][64][2];
   public float[][][][] field31875 = new float[3][5][32][2];
   public float field31876;
   public float field31877;
   public float[] field31878 = new float[34];
   public float[] field31879 = new float[34];
   public float[] field31880 = new float[34];
   public float[][] field31881 = new float[50][2];
   public float[][] field31882 = new float[50][2];
   public float[][] field31883 = new float[50][2];
   public float[][] field31884 = new float[50][2];
   public int field31885;
   public float[][][] field31886 = new float[20][2][2];
   public float[][][] field31887 = new float[20][2][2];

   public Class7420(Class2288 var1, int var2) {
      this.field31857 = new Class7418(var2);
      this.field31859 = var2;
      this.field31855 = 0;
      this.field31867 = 0;

      for (int var5 = 0; var5 < 64; var5++) {
         this.field31871[var5] = 0;
      }

      for (int var7 = 0; var7 < 3; var7++) {
         this.field31868[var7] = 0;
         this.field31869[var7] = field31797[var7];
      }

      byte var6 = 35;
      this.field31863 = 22;
      this.field31876 = 0.7659283F;
      this.field31877 = 0.25F;

      for (int var8 = 0; var8 < var6; var8++) {
         this.field31870[var8] = 14;
      }

      for (int var9 = var6; var9 < 64; var9++) {
         this.field31870[var9] = 1;
      }

      for (int var10 = 0; var10 < 50; var10++) {
         this.field31881[var10][0] = 1.0F;
         this.field31882[var10][1] = 1.0F;
         this.field31881[var10][0] = 1.0F;
         this.field31882[var10][1] = 1.0F;
      }

      this.field31885 = 0;

      for (int var11 = 0; var11 < 20; var11++) {
         this.field31886[var11][0][0] = 0.0F;
         this.field31886[var11][0][1] = 0.0F;
         this.field31886[var11][1][0] = 0.0F;
         this.field31886[var11][1][1] = 0.0F;
         this.field31887[var11][0][0] = 0.0F;
         this.field31887[var11][0][1] = 0.0F;
         this.field31887[var11][1][0] = 0.0F;
         this.field31887[var11][1][1] = 0.0F;
      }
   }

   public int method23918(Class9189 var1) throws AACException {
      long var4 = (long)var1.method34394();
      if (var1.method34399()) {
         this.field31856 = true;
         this.field31858 = false;
         this.field31826 = var1.method34399();
         if (this.field31826) {
            this.field31829 = var1.method34397(3);
            this.field31831 = field31788[this.field31829];
            this.field31832 = field31790[this.field31829];
            if (this.field31829 == 2 || this.field31829 == 5) {
               this.field31858 = true;
            }

            this.field31840 = this.field31829;
         }

         this.field31827 = var1.method34399();
         if (this.field31827) {
            this.field31830 = var1.method34397(3);
            this.field31833 = field31789[this.field31830];
            if (this.field31830 == 2 || this.field31830 == 5) {
               this.field31858 = true;
            }
         }

         this.field31828 = var1.method34399();
      }

      if (!this.field31856) {
         this.field31855 = 0;
         return 1;
      } else {
         this.field31834 = var1.method34398();
         int var6 = var1.method34397(2);
         this.field31835 = field31791[this.field31834][var6];
         if (this.field31834 != 0) {
            for (int var8 = 1; var8 < this.field31835 + 1; var8++) {
               this.field31836[var8] = var1.method34397(5) + 1;
            }
         }

         if (this.field31826) {
            for (int var13 = 0; var13 < this.field31835; var13++) {
               this.field31837[var13] = var1.method34399();
               if (this.field31829 >= 3) {
                  this.method23920(var1, this.field31837[var13], this.field31831, field31891, field31890, this.field31847[var13]);
               } else {
                  this.method23920(var1, this.field31837[var13], this.field31831, field31889, field31888, this.field31847[var13]);
               }
            }
         }

         if (this.field31827) {
            for (int var14 = 0; var14 < this.field31835; var14++) {
               this.field31838[var14] = var1.method34399();
               this.method23920(var1, this.field31838[var14], this.field31833, field31893, field31892, this.field31848[var14]);
            }
         }

         if (this.field31828) {
            int var9 = var1.method34397(4);
            if (var9 == 15) {
               var9 += var1.method34397(8);
            }

            int var7 = 8 * var9;

            while (var7 > 7) {
               int var10 = var1.method34397(2);
               var7 -= 2;
               var7 -= this.method23919(var1, var10, var7);
            }

            var1.method34402(var7);
         }

         int var12 = (int)((long)var1.method34394() - var4);
         this.field31855 = 1;
         return var12;
      }
   }

   private int method23919(Class9189 var1, int var2, int var3) throws AACException {
      long var6 = (long)var1.method34394();
      if (var2 == 0) {
         this.field31839 = var1.method34399();
         if (this.field31839) {
            for (int var9 = 0; var9 < this.field31835; var9++) {
               this.field31841[var9] = var1.method34399();
               this.method23920(var1, this.field31841[var9], this.field31832, field31895, field31894, this.field31849[var9]);
               this.field31842[var9] = var1.method34399();
               this.method23920(var1, this.field31842[var9], this.field31832, field31897, field31896, this.field31850[var9]);
            }
         }

         var1.method34398();
      }

      return (int)((long)var1.method34394() - var6);
   }

   private void method23920(Class9189 var1, boolean var2, int var3, int[][] var4, int[][] var5, int[] var6) throws AACException {
      if (!var2) {
         var6[0] = this.method23921(var1, var5);

         for (int var9 = 1; var9 < var3; var9++) {
            var6[var9] = this.method23921(var1, var5);
         }
      } else {
         for (int var10 = 0; var10 < var3; var10++) {
            var6[var10] = this.method23921(var1, var4);
         }
      }
   }

   private int method23921(Class9189 var1, int[][] var2) throws AACException {
      int var5 = 0;

      while (var5 >= 0) {
         int var6 = var1.method34398();
         var5 = var2[var5][var6];
      }

      return var5 + 31;
   }

   private int method23922(int var1, int var2, int var3) {
      if (var1 >= var2) {
         return var1 <= var3 ? var1 : var3;
      } else {
         return var2;
      }
   }

   private void method23923(boolean var1, int[] var2, int[] var3, boolean var4, int var5, int var6, int var7, int var8) {
      if (!var1) {
         for (int var11 = 0; var11 < var5; var11++) {
            var2[var11] = 0;
         }
      } else if (var4) {
         for (int var12 = 0; var12 < var5; var12++) {
            var2[var12] += var3[var12 * var6];
            var2[var12] = this.method23922(var2[var12], var7, var8);
         }
      } else {
         var2[0] += 0;
         var2[0] = this.method23922(var2[0], var7, var8);

         for (int var13 = 1; var13 < var5; var13++) {
            var2[var13] += var2[var13 - 1];
            var2[var13] = this.method23922(var2[var13], var7, var8);
         }
      }

      if (var6 == 2) {
         for (int var14 = (var5 << 1) - 1; var14 > 0; var14--) {
            var2[var14] = var2[var14 >> 1];
         }
      }
   }

   private void method23924(boolean var1, int[] var2, int[] var3, boolean var4, int var5, int var6, int var7) {
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

   private void method23925(int[] var1, int var2) {
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

   private void method23926() {
      if (this.field31855 == 0) {
         this.field31835 = 0;
      }

      for (int var3 = 0; var3 < this.field31835; var3++) {
         int var5 = this.field31829 >= 3 ? 15 : 7;
         int[] var6;
         int[] var7;
         int[] var8;
         int[] var9;
         if (var3 != 0) {
            var6 = this.field31847[var3 - 1];
            var7 = this.field31848[var3 - 1];
            var8 = this.field31849[var3 - 1];
            var9 = this.field31850[var3 - 1];
         } else {
            var6 = this.field31843;
            var7 = this.field31844;
            var8 = this.field31845;
            var9 = this.field31846;
         }

         this.method23923(
            this.field31826,
            this.field31847[var3],
            var6,
            this.field31837[var3],
            this.field31831,
            this.field31829 != 0 && this.field31829 != 3 ? 1 : 2,
            -var5,
            var5
         );
         this.method23923(
            this.field31827, this.field31848[var3], var7, this.field31838[var3], this.field31833, this.field31830 != 0 && this.field31830 != 3 ? 1 : 2, 0, 7
         );
         this.method23924(this.field31839, this.field31849[var3], var8, this.field31841[var3], this.field31832, 1, 7);
         this.method23924(this.field31839, this.field31850[var3], var9, this.field31842[var3], this.field31832, 1, 7);
      }

      if (this.field31835 == 0) {
         this.field31835 = 1;
         if (!this.field31826) {
            for (int var13 = 0; var13 < 34; var13++) {
               this.field31847[0][var13] = 0;
            }
         } else {
            for (int var4 = 0; var4 < 34; var4++) {
               this.field31847[0][var4] = this.field31843[var4];
            }
         }

         if (!this.field31827) {
            for (int var15 = 0; var15 < 34; var15++) {
               this.field31848[0][var15] = 0;
            }
         } else {
            for (int var14 = 0; var14 < 34; var14++) {
               this.field31848[0][var14] = this.field31844[var14];
            }
         }

         if (!this.field31839) {
            for (int var16 = 0; var16 < 17; var16++) {
               this.field31849[0][var16] = 0;
               this.field31850[0][var16] = 0;
            }
         } else {
            for (int var17 = 0; var17 < 17; var17++) {
               this.field31849[0][var17] = this.field31845[var17];
               this.field31850[0][var17] = this.field31846[var17];
            }
         }
      }

      for (int var18 = 0; var18 < 34; var18++) {
         this.field31843[var18] = this.field31847[this.field31835 - 1][var18];
      }

      for (int var19 = 0; var19 < 34; var19++) {
         this.field31844[var19] = this.field31848[this.field31835 - 1][var19];
      }

      for (int var20 = 0; var20 < 17; var20++) {
         this.field31845[var20] = this.field31849[this.field31835 - 1][var20];
         this.field31846[var20] = this.field31850[this.field31835 - 1][var20];
      }

      this.field31855 = 0;
      if (this.field31834 != 0) {
         this.field31836[0] = 0;
         if (this.field31836[this.field31835] < this.field31859) {
            for (int var21 = 0; var21 < 34; var21++) {
               this.field31847[this.field31835][var21] = this.field31847[this.field31835 - 1][var21];
               this.field31848[this.field31835][var21] = this.field31848[this.field31835 - 1][var21];
            }

            for (int var22 = 0; var22 < 17; var22++) {
               this.field31849[this.field31835][var22] = this.field31849[this.field31835 - 1][var22];
               this.field31850[this.field31835][var22] = this.field31850[this.field31835 - 1][var22];
            }

            this.field31835++;
            this.field31836[this.field31835] = this.field31859;
         }

         for (int var10 = 1; var10 < this.field31835; var10++) {
            int var23 = this.field31859 - (this.field31835 - var10);
            if (this.field31836[var10] <= var23) {
               var23 = this.field31836[var10 - 1] + 1;
               if (this.field31836[var10] < var23) {
                  this.field31836[var10] = var23;
               }
            } else {
               this.field31836[var10] = var23;
            }
         }
      } else {
         this.field31836[0] = 0;

         for (int var11 = 1; var11 < this.field31835; var11++) {
            this.field31836[var11] = var11 * this.field31859 / this.field31835;
         }

         this.field31836[this.field31835] = this.field31859;
      }

      if (this.field31858) {
         for (int var12 = 0; var12 < this.field31835; var12++) {
            if (this.field31829 != 2 && this.field31829 != 5) {
               this.method23925(this.field31847[var12], 34);
            }

            if (this.field31830 != 2 && this.field31830 != 5) {
               this.method23925(this.field31848[var12], 34);
            }

            if (this.field31840 != 2 && this.field31840 != 5) {
               this.method23925(this.field31849[var12], 17);
               this.method23925(this.field31850[var12], 17);
            }
         }
      }
   }

   private void method23927(float[][][] var1, float[][][] var2, float[][][] var3, float[][][] var4) {
      int var7 = 0;
      int[] var8 = new int[3];
      float[][] var9 = new float[32][34];
      float[][] var10 = new float[32][34];
      float[] var11 = new float[2];
      float[][] var12;
      if (!this.field31858) {
         var12 = field31804;
      } else {
         var12 = field31805;
      }

      for (int var13 = 0; var13 < 32; var13++) {
         for (int var15 = 0; var15 < 34; var15++) {
            var9[var13][var15] = 0.0F;
         }
      }

      for (int var14 = 0; var14 < this.field31860; var14++) {
         int var34 = -4097 & this.field31866[var14];
         int var16 = var14 >= this.field31861 ? this.field31865[var14 + 1] : this.field31865[var14] + 1;

         for (int var17 = this.field31865[var14]; var17 < var16; var17++) {
            for (int var29 = this.field31836[0]; var29 < this.field31836[this.field31835]; var29++) {
               if (var14 >= this.field31861) {
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

      for (int var35 = 0; var35 < this.field31862; var35++) {
         for (int var30 = this.field31836[0]; var30 < this.field31836[this.field31835]; var30++) {
            float var18 = 1.5F;
            this.field31878[var35] = this.field31878[var35] * this.field31876;
            if (this.field31878[var35] < var9[var30][var35]) {
               this.field31878[var35] = var9[var30][var35];
            }

            float var19 = this.field31880[var35];
            var19 += (this.field31878[var35] - var9[var30][var35] - this.field31880[var35]) * this.field31877;
            this.field31880[var35] = var19;
            float var20 = this.field31879[var35];
            var20 += (var9[var30][var35] - this.field31879[var35]) * this.field31877;
            this.field31879[var35] = var20;
            if (!(var19 * var18 <= var20)) {
               var10[var30][var35] = var20 / (var19 * var18);
            } else {
               var10[var30][var35] = 1.0F;
            }
         }
      }

      for (int var33 = 0; var33 < this.field31860; var33++) {
         int var37;
         if (var33 >= this.field31861) {
            var37 = this.field31865[var33 + 1];
         } else {
            var37 = this.field31865[var33] + 1;
         }

         for (int var38 = this.field31865[var33]; var38 < var37; var38++) {
            float[] var22 = new float[3];
            float var39;
            if (var33 >= this.field31861 && var38 > this.field31864) {
               int var23 = this.field31864 - var38;
               if (var23 > -20) {
                  var39 = 1.0F + 0.05F * (float)var23;
               } else {
                  var39 = 0.0F;
               }
            } else {
               var39 = 1.0F;
            }

            for (int var21 = 0; var21 < 3; var21++) {
               var22[var21] = var39 * field31792[var21];
            }

            var7 = this.field31867;

            for (int var31 = 0; var31 < 3; var31++) {
               var8[var31] = this.field31868[var31];
            }

            for (int var32 = this.field31836[0]; var32 < this.field31836[this.field31835]; var32++) {
               float[] var45 = new float[2];
               float[] var24 = new float[2];
               float[] var25 = new float[2];
               if (var33 >= this.field31861) {
                  var11[0] = var1[var32][var38][0];
                  var11[1] = var1[var32][var38][1];
               } else {
                  var11[0] = var3[var32][var38][0];
                  var11[1] = var3[var32][var38][1];
               }

               if (var38 > this.field31863 && var33 >= this.field31861) {
                  var45[0] = this.field31872[this.field31871[var38]][var38][0];
                  var45[1] = this.field31872[this.field31871[var38]][var38][1];
                  var25[0] = var45[0];
                  var25[1] = var45[1];
                  this.field31872[this.field31871[var38]][var38][0] = var11[0];
                  this.field31872[this.field31871[var38]][var38][1] = var11[1];
               } else {
                  float[] var26 = new float[2];
                  if (var33 >= this.field31861) {
                     var24[0] = this.field31872[var7][var38][0];
                     var24[1] = this.field31872[var7][var38][1];
                     this.field31872[var7][var38][0] = var11[0];
                     this.field31872[var7][var38][1] = var11[1];
                     var26[0] = field31803[var38][0];
                     var26[1] = field31803[var38][1];
                  } else {
                     var24[0] = this.field31873[var7][var38][0];
                     var24[1] = this.field31873[var7][var38][1];
                     this.field31873[var7][var38][0] = var11[0];
                     this.field31873[var7][var38][1] = var11[1];
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
                     if (var33 >= this.field31861) {
                        var24[0] = this.field31874[var42][var8[var42]][var38][0];
                        var24[1] = this.field31874[var42][var8[var42]][var38][1];
                        var27[0] = field31806[var38][var42][0];
                        var27[1] = field31806[var38][var42][1];
                     } else {
                        var24[0] = this.field31875[var42][var8[var42]][var38][0];
                        var24[1] = this.field31875[var42][var8[var42]][var38][1];
                        if (!this.field31858) {
                           var27[0] = field31807[var38][var42][0];
                           var27[1] = field31807[var38][var42][1];
                        } else {
                           var27[0] = field31808[var38][var42][0];
                           var27[1] = field31808[var38][var42][1];
                        }
                     }

                     var45[0] = var24[0] * var27[0] + var24[1] * var27[1];
                     var45[1] = var24[1] * var27[0] - var24[0] * var27[1];
                     var45[0] += -(var22[var42] * var25[0]);
                     var45[1] += -(var22[var42] * var25[1]);
                     var28[0] = var25[0] + var22[var42] * var45[0];
                     var28[1] = var25[1] + var22[var42] * var45[1];
                     if (var33 >= this.field31861) {
                        this.field31874[var42][var8[var42]][var38][0] = var28[0];
                        this.field31874[var42][var8[var42]][var38][1] = var28[1];
                     } else {
                        this.field31875[var42][var8[var42]][var38][0] = var28[0];
                        this.field31875[var42][var8[var42]][var38][1] = var28[1];
                     }

                     var25[0] = var45[0];
                     var25[1] = var45[1];
                  }
               }

               int var36 = -4097 & this.field31866[var33];
               var25[0] = var10[var32][var36] * var25[0];
               var25[1] = var10[var32][var36] * var25[1];
               if (var33 >= this.field31861) {
                  var2[var32][var38][0] = var25[0];
                  var2[var32][var38][1] = var25[1];
               } else {
                  var4[var32][var38][0] = var25[0];
                  var4[var32][var38][1] = var25[1];
               }

               if (++var7 >= 2) {
                  var7 = 0;
               }

               if (var38 > this.field31863 && var33 >= this.field31861 && ++this.field31871[var38] >= this.field31870[var38]) {
                  this.field31871[var38] = 0;
               }

               for (int var43 = 0; var43 < 3; var43++) {
                  if (++var8[var43] >= this.field31869[var43]) {
                     var8[var43] = 0;
                  }
               }
            }
         }
      }

      this.field31867 = var7;

      for (int var44 = 0; var44 < 3; var44++) {
         this.field31868[var44] = var8[var44];
      }
   }

   private float method23928(float[] var1) {
      return (float)Math.sqrt((double)(var1[0] * var1[0] + var1[1] * var1[1]));
   }

   private void method23929(float[][][] var1, float[][][] var2, float[][][] var3, float[][][] var4) {
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
      if (this.field31829 < 3) {
         var24 = 7;
         var25 = field31821;
      } else {
         var24 = 15;
         var25 = field31822;
      }

      int var26;
      if (this.field31840 != 0 && this.field31840 != 3) {
         var26 = this.field31832;
      } else {
         var26 = 11;
      }

      for (int var27 = 0; var27 < this.field31860; var27++) {
         var7 = -4097 & this.field31866[var27];
         int var28 = var27 >= this.field31861 ? this.field31865[var27 + 1] : this.field31865[var27] + 1;

         for (int var29 = 0; var29 < this.field31835; var29++) {
            if (this.field31830 >= 3) {
               float var31;
               float var32;
               float var33;
               float var34;
               if (this.field31829 < 3) {
                  int var30 = Math.abs(this.field31847[var29][var7]);
                  var31 = field31815[var24 + this.field31847[var29][var7]][this.field31848[var29][var7]];
                  var32 = field31815[14 - (var24 + this.field31847[var29][var7])][this.field31848[var29][var7]];
                  var33 = field31817[var30][this.field31848[var29][var7]];
                  var34 = field31819[var30][this.field31848[var29][var7]];
               } else {
                  int var44 = Math.abs(this.field31847[var29][var7]);
                  var31 = field31816[var24 + this.field31847[var29][var7]][this.field31848[var29][var7]];
                  var32 = field31816[30 - (var24 + this.field31847[var29][var7])][this.field31848[var29][var7]];
                  var33 = field31818[var44][this.field31848[var29][var7]];
                  var34 = field31820[var44][this.field31848[var29][var7]];
               }

               var8[0] = 1.4142135F * var31 * var33;
               var9[0] = 1.4142135F * var32 * var33;
               var10[0] = 1.4142135F * -var31 * var34;
               var11[0] = 1.4142135F * var32 * var34;
            } else {
               float var50 = var25[var24 + this.field31847[var29][var7]];
               float var47 = var25[var24 - this.field31847[var29][var7]];
               float var53 = field31809[this.field31848[var29][var7]];
               float var55 = field31810[this.field31848[var29][var7]];
               float var35;
               float var45;
               if (this.field31829 < 3) {
                  if (this.field31847[var29][var7] >= 0) {
                     var45 = field31811[this.field31847[var29][var7]][this.field31848[var29][var7]];
                     var35 = field31812[this.field31847[var29][var7]][this.field31848[var29][var7]];
                  } else {
                     var45 = field31811[-this.field31847[var29][var7]][this.field31848[var29][var7]];
                     var35 = -field31812[-this.field31847[var29][var7]][this.field31848[var29][var7]];
                  }
               } else if (this.field31847[var29][var7] >= 0) {
                  var45 = field31813[this.field31847[var29][var7]][this.field31848[var29][var7]];
                  var35 = field31814[this.field31847[var29][var7]][this.field31848[var29][var7]];
               } else {
                  var45 = field31813[-this.field31847[var29][var7]][this.field31848[var29][var7]];
                  var35 = -field31814[-this.field31847[var29][var7]][this.field31848[var29][var7]];
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

            if (this.field31839 && var7 < var26) {
               int var56 = this.field31885;
               var20[0] = this.field31886[var7][var56][0] * 0.25F;
               var20[1] = this.field31886[var7][var56][1] * 0.25F;
               var21[0] = this.field31887[var7][var56][0] * 0.25F;
               var21[1] = this.field31887[var7][var56][1] * 0.25F;
               this.field31886[var7][var56][0] = field31823[Math.abs(this.field31849[var29][var7])];
               this.field31886[var7][var56][1] = field31824[Math.abs(this.field31849[var29][var7])];
               this.field31887[var7][var56][0] = field31823[Math.abs(this.field31850[var29][var7])];
               this.field31887[var7][var56][1] = field31824[Math.abs(this.field31850[var29][var7])];
               var20[0] += this.field31886[var7][var56][0];
               var20[1] += this.field31886[var7][var56][1];
               var21[0] += this.field31887[var7][var56][0];
               var21[1] += this.field31887[var7][var56][1];
               if (var56 == 0) {
                  var56 = 2;
               }

               var20[0] += this.field31886[var7][--var56][0] * 0.5F;
               var20[1] += this.field31886[var7][var56][1] * 0.5F;
               var21[0] += this.field31887[var7][var56][0] * 0.5F;
               var21[1] += this.field31887[var7][var56][1] * 0.5F;
               float var51 = this.method23928(var21);
               float var48 = this.method23928(var20);
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

            float var40 = (float)(this.field31836[var29 + 1] - this.field31836[var29]);
            var16[0] = (var8[0] - this.field31881[var27][0]) / var40;
            var17[0] = (var9[0] - this.field31882[var27][0]) / var40;
            var18[0] = (var10[0] - this.field31883[var27][0]) / var40;
            var19[0] = (var11[0] - this.field31884[var27][0]) / var40;
            var12[0] = this.field31881[var27][0];
            var13[0] = this.field31882[var27][0];
            var14[0] = this.field31883[var27][0];
            var15[0] = this.field31884[var27][0];
            this.field31881[var27][0] = var8[0];
            this.field31882[var27][0] = var9[0];
            this.field31883[var27][0] = var10[0];
            this.field31884[var27][0] = var11[0];
            if (this.field31839 && var7 < var26) {
               var16[1] = (var8[1] - this.field31881[var27][1]) / var40;
               var17[1] = (var9[1] - this.field31882[var27][1]) / var40;
               var18[1] = (var10[1] - this.field31883[var27][1]) / var40;
               var19[1] = (var11[1] - this.field31884[var27][1]) / var40;
               var12[1] = this.field31881[var27][1];
               var13[1] = this.field31882[var27][1];
               var14[1] = this.field31883[var27][1];
               var15[1] = this.field31884[var27][1];
               if ((4096 & this.field31866[var27]) != 0) {
                  var16[1] = -var16[1];
                  var17[1] = -var17[1];
                  var18[1] = -var18[1];
                  var19[1] = -var19[1];
                  var12[1] = -var12[1];
                  var13[1] = -var13[1];
                  var14[1] = -var14[1];
                  var15[1] = -var15[1];
               }

               this.field31881[var27][1] = var8[1];
               this.field31882[var27][1] = var9[1];
               this.field31883[var27][1] = var10[1];
               this.field31884[var27][1] = var11[1];
            }

            for (int var41 = this.field31836[var29]; var41 < this.field31836[var29 + 1]; var41++) {
               var12[0] += var16[0];
               var13[0] += var17[0];
               var14[0] += var18[0];
               var15[0] += var19[0];
               if (this.field31839 && var7 < var26) {
                  var12[1] += var16[1];
                  var13[1] += var17[1];
                  var14[1] += var18[1];
                  var15[1] += var19[1];
               }

               for (int var42 = this.field31865[var27]; var42 < var28; var42++) {
                  float[] var52 = new float[2];
                  float[] var49 = new float[2];
                  if (var27 >= this.field31861) {
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
                  if (this.field31839 && var7 < var26) {
                     var20[0] -= var12[1] * var52[1] + var14[1] * var49[1];
                     var20[1] += var12[1] * var52[0] + var14[1] * var49[0];
                     var21[0] -= var13[1] * var52[1] + var15[1] * var49[1];
                     var21[1] += var13[1] * var52[0] + var15[1] * var49[0];
                  }

                  if (var27 >= this.field31861) {
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

            this.field31885++;
            if (this.field31885 == 2) {
               this.field31885 = 0;
            }
         }
      }
   }

   public int method23930(float[][][] var1, float[][][] var2) {
      float[][][] var5 = new float[32][32][2];
      float[][][] var6 = new float[32][32][2];
      this.method23926();
      if (!this.field31858) {
         this.field31865 = field31793;
         this.field31866 = field31795;
         this.field31860 = 22;
         this.field31861 = 10;
         this.field31862 = 20;
         this.field31864 = 3;
      } else {
         this.field31865 = field31794;
         this.field31866 = field31796;
         this.field31860 = 50;
         this.field31861 = 32;
         this.field31862 = 34;
         this.field31864 = 5;
      }

      this.field31857.method23910(var1, var5, this.field31858, this.field31859);
      this.method23927(var1, var2, var5, var6);
      this.method23929(var1, var2, var5, var6);
      this.field31857.method23917(var1, var5, this.field31858, this.field31859);
      this.field31857.method23917(var2, var6, this.field31858, this.field31859);
      return 0;
   }
}
