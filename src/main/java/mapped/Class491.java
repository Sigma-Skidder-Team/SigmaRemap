package mapped;

public class Class491 implements Runnable {
   private static String[] field2318;
   public final int field2319;
   public final int field2320;
   public final int field2321;
   public final int field2322;
   public final int field2323;
   public final float[] field2324;
   public final boolean field2325;
   public final Class8026 field2326;

   public Class491(Class8026 var1, int var2, int var3, int var4, int var5, int var6, float[] var7, boolean var8) {
      this.field2326 = var1;
      this.field2319 = var2;
      this.field2320 = var3;
      this.field2321 = var4;
      this.field2322 = var5;
      this.field2323 = var6;
      this.field2324 = var7;
      this.field2325 = var8;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field2319];
      if (this.field2320 != -1) {
         for (int var4 = this.field2321; var4 < Class8026.method27518(this.field2326); var4 += this.field2322) {
            int var5 = var4 * Class8026.method27512(this.field2326);
            if (this.field2323 == 0) {
               for (int var6 = 0; var6 < Class8026.method27513(this.field2326); var6++) {
                  Class8026.method27515(this.field2326).method30935(this.field2324, var5 + var6 * Class8026.method27514(this.field2326), this.field2325);
               }
            }

            if (Class8026.method27516(this.field2326) <= 4) {
               if (Class8026.method27516(this.field2326) != 4) {
                  if (Class8026.method27516(this.field2326) == 2) {
                     for (int var18 = 0; var18 < Class8026.method27513(this.field2326); var18++) {
                        int var34 = var5 + var18 * Class8026.method27514(this.field2326);
                        int var45 = 2 * var18;
                        var3[var45] = this.field2324[var34];
                        var3[var45 + 1] = this.field2324[var34 + 1];
                     }

                     Class8026.method27517(this.field2326).method30935(var3, 0, this.field2325);

                     for (int var19 = 0; var19 < Class8026.method27513(this.field2326); var19++) {
                        int var35 = var5 + var19 * Class8026.method27514(this.field2326);
                        int var46 = 2 * var19;
                        this.field2324[var35] = var3[var46];
                        this.field2324[var35 + 1] = var3[var46 + 1];
                     }
                  }
               } else {
                  for (int var16 = 0; var16 < Class8026.method27513(this.field2326); var16++) {
                     int var32 = var5 + var16 * Class8026.method27514(this.field2326);
                     int var43 = 2 * var16;
                     int var54 = 2 * Class8026.method27513(this.field2326) + 2 * var16;
                     var3[var43] = this.field2324[var32];
                     var3[var43 + 1] = this.field2324[var32 + 1];
                     var3[var54] = this.field2324[var32 + 2];
                     var3[var54 + 1] = this.field2324[var32 + 3];
                  }

                  Class8026.method27517(this.field2326).method30935(var3, 0, this.field2325);
                  Class8026.method27517(this.field2326).method30935(var3, 2 * Class8026.method27513(this.field2326), this.field2325);

                  for (int var17 = 0; var17 < Class8026.method27513(this.field2326); var17++) {
                     int var33 = var5 + var17 * Class8026.method27514(this.field2326);
                     int var44 = 2 * var17;
                     int var55 = 2 * Class8026.method27513(this.field2326) + 2 * var17;
                     this.field2324[var33] = var3[var44];
                     this.field2324[var33 + 1] = var3[var44 + 1];
                     this.field2324[var33 + 2] = var3[var55];
                     this.field2324[var33 + 3] = var3[var55 + 1];
                  }
               }
            } else {
               for (int var15 = 0; var15 < Class8026.method27516(this.field2326); var15 += 8) {
                  for (int var7 = 0; var7 < Class8026.method27513(this.field2326); var7++) {
                     int var8 = var5 + var7 * Class8026.method27514(this.field2326) + var15;
                     int var9 = 2 * var7;
                     int var10 = 2 * Class8026.method27513(this.field2326) + 2 * var7;
                     int var11 = var10 + 2 * Class8026.method27513(this.field2326);
                     int var12 = var11 + 2 * Class8026.method27513(this.field2326);
                     var3[var9] = this.field2324[var8];
                     var3[var9 + 1] = this.field2324[var8 + 1];
                     var3[var10] = this.field2324[var8 + 2];
                     var3[var10 + 1] = this.field2324[var8 + 3];
                     var3[var11] = this.field2324[var8 + 4];
                     var3[var11 + 1] = this.field2324[var8 + 5];
                     var3[var12] = this.field2324[var8 + 6];
                     var3[var12 + 1] = this.field2324[var8 + 7];
                  }

                  Class8026.method27517(this.field2326).method30935(var3, 0, this.field2325);
                  Class8026.method27517(this.field2326).method30935(var3, 2 * Class8026.method27513(this.field2326), this.field2325);
                  Class8026.method27517(this.field2326).method30935(var3, 4 * Class8026.method27513(this.field2326), this.field2325);
                  Class8026.method27517(this.field2326).method30935(var3, 6 * Class8026.method27513(this.field2326), this.field2325);

                  for (int var28 = 0; var28 < Class8026.method27513(this.field2326); var28++) {
                     int var31 = var5 + var28 * Class8026.method27514(this.field2326) + var15;
                     int var42 = 2 * var28;
                     int var53 = 2 * Class8026.method27513(this.field2326) + 2 * var28;
                     int var60 = var53 + 2 * Class8026.method27513(this.field2326);
                     int var63 = var60 + 2 * Class8026.method27513(this.field2326);
                     this.field2324[var31] = var3[var42];
                     this.field2324[var31 + 1] = var3[var42 + 1];
                     this.field2324[var31 + 2] = var3[var53];
                     this.field2324[var31 + 3] = var3[var53 + 1];
                     this.field2324[var31 + 4] = var3[var60];
                     this.field2324[var31 + 5] = var3[var60 + 1];
                     this.field2324[var31 + 6] = var3[var63];
                     this.field2324[var31 + 7] = var3[var63 + 1];
                  }
               }
            }

            if (this.field2323 != 0) {
               for (int var20 = 0; var20 < Class8026.method27513(this.field2326); var20++) {
                  Class8026.method27515(this.field2326).method30947(this.field2324, var5 + var20 * Class8026.method27514(this.field2326), this.field2325);
               }
            }
         }
      } else {
         for (int var13 = this.field2321; var13 < Class8026.method27518(this.field2326); var13 += this.field2322) {
            int var14 = var13 * Class8026.method27512(this.field2326);
            if (this.field2323 != 0) {
               for (int var22 = 0; var22 < Class8026.method27513(this.field2326); var22++) {
                  Class8026.method27515(this.field2326).method30939(this.field2324, var14 + var22 * Class8026.method27514(this.field2326));
               }
            } else {
               for (int var21 = 0; var21 < Class8026.method27513(this.field2326); var21++) {
                  Class8026.method27515(this.field2326).method30931(this.field2324, var14 + var21 * Class8026.method27514(this.field2326));
               }
            }

            if (Class8026.method27516(this.field2326) <= 4) {
               if (Class8026.method27516(this.field2326) != 4) {
                  if (Class8026.method27516(this.field2326) == 2) {
                     for (int var26 = 0; var26 < Class8026.method27513(this.field2326); var26++) {
                        int var40 = var14 + var26 * Class8026.method27514(this.field2326);
                        int var51 = 2 * var26;
                        var3[var51] = this.field2324[var40];
                        var3[var51 + 1] = this.field2324[var40 + 1];
                     }

                     Class8026.method27517(this.field2326).method30931(var3, 0);

                     for (int var27 = 0; var27 < Class8026.method27513(this.field2326); var27++) {
                        int var41 = var14 + var27 * Class8026.method27514(this.field2326);
                        int var52 = 2 * var27;
                        this.field2324[var41] = var3[var52];
                        this.field2324[var41 + 1] = var3[var52 + 1];
                     }
                  }
               } else {
                  for (int var24 = 0; var24 < Class8026.method27513(this.field2326); var24++) {
                     int var38 = var14 + var24 * Class8026.method27514(this.field2326);
                     int var49 = 2 * var24;
                     int var58 = 2 * Class8026.method27513(this.field2326) + 2 * var24;
                     var3[var49] = this.field2324[var38];
                     var3[var49 + 1] = this.field2324[var38 + 1];
                     var3[var58] = this.field2324[var38 + 2];
                     var3[var58 + 1] = this.field2324[var38 + 3];
                  }

                  Class8026.method27517(this.field2326).method30931(var3, 0);
                  Class8026.method27517(this.field2326).method30931(var3, 2 * Class8026.method27513(this.field2326));

                  for (int var25 = 0; var25 < Class8026.method27513(this.field2326); var25++) {
                     int var39 = var14 + var25 * Class8026.method27514(this.field2326);
                     int var50 = 2 * var25;
                     int var59 = 2 * Class8026.method27513(this.field2326) + 2 * var25;
                     this.field2324[var39] = var3[var50];
                     this.field2324[var39 + 1] = var3[var50 + 1];
                     this.field2324[var39 + 2] = var3[var59];
                     this.field2324[var39 + 3] = var3[var59 + 1];
                  }
               }
            } else {
               for (int var23 = 0; var23 < Class8026.method27516(this.field2326); var23 += 8) {
                  for (int var29 = 0; var29 < Class8026.method27513(this.field2326); var29++) {
                     int var36 = var14 + var29 * Class8026.method27514(this.field2326) + var23;
                     int var47 = 2 * var29;
                     int var56 = 2 * Class8026.method27513(this.field2326) + 2 * var29;
                     int var61 = var56 + 2 * Class8026.method27513(this.field2326);
                     int var64 = var61 + 2 * Class8026.method27513(this.field2326);
                     var3[var47] = this.field2324[var36];
                     var3[var47 + 1] = this.field2324[var36 + 1];
                     var3[var56] = this.field2324[var36 + 2];
                     var3[var56 + 1] = this.field2324[var36 + 3];
                     var3[var61] = this.field2324[var36 + 4];
                     var3[var61 + 1] = this.field2324[var36 + 5];
                     var3[var64] = this.field2324[var36 + 6];
                     var3[var64 + 1] = this.field2324[var36 + 7];
                  }

                  Class8026.method27517(this.field2326).method30931(var3, 0);
                  Class8026.method27517(this.field2326).method30931(var3, 2 * Class8026.method27513(this.field2326));
                  Class8026.method27517(this.field2326).method30931(var3, 4 * Class8026.method27513(this.field2326));
                  Class8026.method27517(this.field2326).method30931(var3, 6 * Class8026.method27513(this.field2326));

                  for (int var30 = 0; var30 < Class8026.method27513(this.field2326); var30++) {
                     int var37 = var14 + var30 * Class8026.method27514(this.field2326) + var23;
                     int var48 = 2 * var30;
                     int var57 = 2 * Class8026.method27513(this.field2326) + 2 * var30;
                     int var62 = var57 + 2 * Class8026.method27513(this.field2326);
                     int var65 = var62 + 2 * Class8026.method27513(this.field2326);
                     this.field2324[var37] = var3[var48];
                     this.field2324[var37 + 1] = var3[var48 + 1];
                     this.field2324[var37 + 2] = var3[var57];
                     this.field2324[var37 + 3] = var3[var57 + 1];
                     this.field2324[var37 + 4] = var3[var62];
                     this.field2324[var37 + 5] = var3[var62 + 1];
                     this.field2324[var37 + 6] = var3[var65];
                     this.field2324[var37 + 7] = var3[var65 + 1];
                  }
               }
            }
         }
      }
   }
}
