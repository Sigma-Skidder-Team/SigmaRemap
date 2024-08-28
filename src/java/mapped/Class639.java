package mapped;

public class Class639 implements Runnable {
   private static String[] field3192;
   public final int field3193;
   public final int field3194;
   public final int field3195;
   public final int field3196;
   public final double[] field3197;
   public final boolean field3198;
   public final Class6352 field3199;

   public Class639(Class6352 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field3199 = var1;
      this.field3193 = var2;
      this.field3194 = var3;
      this.field3195 = var4;
      this.field3196 = var5;
      this.field3197 = var6;
      this.field3198 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field3193];
      if (this.field3194 != -1) {
         for (int var4 = this.field3195; var4 < Class6352.method19333(this.field3199); var4 += this.field3196) {
            int var5 = var4 * Class6352.method19327(this.field3199);

            for (int var6 = 0; var6 < Class6352.method19328(this.field3199); var6++) {
               Class6352.method19330(this.field3199).method38582(this.field3197, var5 + var6 * Class6352.method19329(this.field3199), this.field3198);
            }

            if (Class6352.method19331(this.field3199) <= 2) {
               if (Class6352.method19331(this.field3199) == 2) {
                  for (int var13 = 0; var13 < Class6352.method19328(this.field3199); var13++) {
                     int var23 = var5 + var13 * Class6352.method19329(this.field3199);
                     var3[var13] = this.field3197[var23];
                     var3[Class6352.method19328(this.field3199) + var13] = this.field3197[var23 + 1];
                  }

                  Class6352.method19332(this.field3199).method38582(var3, 0, this.field3198);
                  Class6352.method19332(this.field3199).method38582(var3, Class6352.method19328(this.field3199), this.field3198);

                  for (int var14 = 0; var14 < Class6352.method19328(this.field3199); var14++) {
                     int var24 = var5 + var14 * Class6352.method19329(this.field3199);
                     this.field3197[var24] = var3[var14];
                     this.field3197[var24 + 1] = var3[Class6352.method19328(this.field3199) + var14];
                  }
               }
            } else {
               for (int var12 = 0; var12 < Class6352.method19331(this.field3199); var12 += 4) {
                  for (int var7 = 0; var7 < Class6352.method19328(this.field3199); var7++) {
                     int var8 = var5 + var7 * Class6352.method19329(this.field3199) + var12;
                     int var9 = Class6352.method19328(this.field3199) + var7;
                     var3[var7] = this.field3197[var8];
                     var3[var9] = this.field3197[var8 + 1];
                     var3[var9 + Class6352.method19328(this.field3199)] = this.field3197[var8 + 2];
                     var3[var9 + 2 * Class6352.method19328(this.field3199)] = this.field3197[var8 + 3];
                  }

                  Class6352.method19332(this.field3199).method38582(var3, 0, this.field3198);
                  Class6352.method19332(this.field3199).method38582(var3, Class6352.method19328(this.field3199), this.field3198);
                  Class6352.method19332(this.field3199).method38582(var3, 2 * Class6352.method19328(this.field3199), this.field3198);
                  Class6352.method19332(this.field3199).method38582(var3, 3 * Class6352.method19328(this.field3199), this.field3198);

                  for (int var19 = 0; var19 < Class6352.method19328(this.field3199); var19++) {
                     int var22 = var5 + var19 * Class6352.method19329(this.field3199) + var12;
                     int var29 = Class6352.method19328(this.field3199) + var19;
                     this.field3197[var22] = var3[var19];
                     this.field3197[var22 + 1] = var3[var29];
                     this.field3197[var22 + 2] = var3[var29 + Class6352.method19328(this.field3199)];
                     this.field3197[var22 + 3] = var3[var29 + 2 * Class6352.method19328(this.field3199)];
                  }
               }
            }
         }
      } else {
         for (int var10 = this.field3195; var10 < Class6352.method19333(this.field3199); var10 += this.field3196) {
            int var11 = var10 * Class6352.method19327(this.field3199);

            for (int var15 = 0; var15 < Class6352.method19328(this.field3199); var15++) {
               Class6352.method19330(this.field3199).method38578(this.field3197, var11 + var15 * Class6352.method19329(this.field3199), this.field3198);
            }

            if (Class6352.method19331(this.field3199) <= 2) {
               if (Class6352.method19331(this.field3199) == 2) {
                  for (int var17 = 0; var17 < Class6352.method19328(this.field3199); var17++) {
                     int var27 = var11 + var17 * Class6352.method19329(this.field3199);
                     var3[var17] = this.field3197[var27];
                     var3[Class6352.method19328(this.field3199) + var17] = this.field3197[var27 + 1];
                  }

                  Class6352.method19332(this.field3199).method38578(var3, 0, this.field3198);
                  Class6352.method19332(this.field3199).method38578(var3, Class6352.method19328(this.field3199), this.field3198);

                  for (int var18 = 0; var18 < Class6352.method19328(this.field3199); var18++) {
                     int var28 = var11 + var18 * Class6352.method19329(this.field3199);
                     this.field3197[var28] = var3[var18];
                     this.field3197[var28 + 1] = var3[Class6352.method19328(this.field3199) + var18];
                  }
               }
            } else {
               for (int var16 = 0; var16 < Class6352.method19331(this.field3199); var16 += 4) {
                  for (int var20 = 0; var20 < Class6352.method19328(this.field3199); var20++) {
                     int var25 = var11 + var20 * Class6352.method19329(this.field3199) + var16;
                     int var30 = Class6352.method19328(this.field3199) + var20;
                     var3[var20] = this.field3197[var25];
                     var3[var30] = this.field3197[var25 + 1];
                     var3[var30 + Class6352.method19328(this.field3199)] = this.field3197[var25 + 2];
                     var3[var30 + 2 * Class6352.method19328(this.field3199)] = this.field3197[var25 + 3];
                  }

                  Class6352.method19332(this.field3199).method38578(var3, 0, this.field3198);
                  Class6352.method19332(this.field3199).method38578(var3, Class6352.method19328(this.field3199), this.field3198);
                  Class6352.method19332(this.field3199).method38578(var3, 2 * Class6352.method19328(this.field3199), this.field3198);
                  Class6352.method19332(this.field3199).method38578(var3, 3 * Class6352.method19328(this.field3199), this.field3198);

                  for (int var21 = 0; var21 < Class6352.method19328(this.field3199); var21++) {
                     int var26 = var11 + var21 * Class6352.method19329(this.field3199) + var16;
                     int var31 = Class6352.method19328(this.field3199) + var21;
                     this.field3197[var26] = var3[var21];
                     this.field3197[var26 + 1] = var3[var31];
                     this.field3197[var26 + 2] = var3[var31 + Class6352.method19328(this.field3199)];
                     this.field3197[var26 + 3] = var3[var31 + 2 * Class6352.method19328(this.field3199)];
                  }
               }
            }
         }
      }
   }
}
