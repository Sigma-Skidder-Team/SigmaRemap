package mapped;

public class Class572 implements Runnable {
   private static String[] field2786;
   public final int field2787;
   public final int field2788;
   public final int field2789;
   public final int field2790;
   public final float[][] field2791;
   public final boolean field2792;
   public final Class8543 field2793;

   public Class572(Class8543 var1, int var2, int var3, int var4, int var5, float[][] var6, boolean var7) {
      this.field2793 = var1;
      this.field2787 = var2;
      this.field2788 = var3;
      this.field2789 = var4;
      this.field2790 = var5;
      this.field2791 = var6;
      this.field2792 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field2787];
      if (this.field2788 != -1) {
         if (Class8543.method30438(this.field2793) <= 4 * this.field2789) {
            if (Class8543.method30438(this.field2793) != 4 * this.field2789) {
               if (Class8543.method30438(this.field2793) == 2 * this.field2789) {
                  for (int var4 = 0; var4 < Class8543.method30435(this.field2793); var4++) {
                     int var6 = 2 * var4;
                     var3[var6] = this.field2791[var4][2 * this.field2790];
                     var3[var6 + 1] = this.field2791[var4][2 * this.field2790 + 1];
                  }

                  Class8543.method30436(this.field2793).method30935(var3, 0, this.field2792);

                  for (int var10 = 0; var10 < Class8543.method30435(this.field2793); var10++) {
                     int var22 = 2 * var10;
                     this.field2791[var10][2 * this.field2790] = var3[var22];
                     this.field2791[var10][2 * this.field2790 + 1] = var3[var22 + 1];
                  }
               }
            } else {
               for (int var11 = 0; var11 < Class8543.method30435(this.field2793); var11++) {
                  int var23 = 2 * var11;
                  int var7 = 2 * Class8543.method30435(this.field2793) + 2 * var11;
                  var3[var23] = this.field2791[var11][4 * this.field2790];
                  var3[var23 + 1] = this.field2791[var11][4 * this.field2790 + 1];
                  var3[var7] = this.field2791[var11][4 * this.field2790 + 2];
                  var3[var7 + 1] = this.field2791[var11][4 * this.field2790 + 3];
               }

               Class8543.method30436(this.field2793).method30935(var3, 0, this.field2792);
               Class8543.method30436(this.field2793).method30935(var3, 2 * Class8543.method30435(this.field2793), this.field2792);

               for (int var12 = 0; var12 < Class8543.method30435(this.field2793); var12++) {
                  int var24 = 2 * var12;
                  int var33 = 2 * Class8543.method30435(this.field2793) + 2 * var12;
                  this.field2791[var12][4 * this.field2790] = var3[var24];
                  this.field2791[var12][4 * this.field2790 + 1] = var3[var24 + 1];
                  this.field2791[var12][4 * this.field2790 + 2] = var3[var33];
                  this.field2791[var12][4 * this.field2790 + 3] = var3[var33 + 1];
               }
            }
         } else {
            for (int var13 = 8 * this.field2790; var13 < Class8543.method30438(this.field2793); var13 += 8 * this.field2789) {
               for (int var5 = 0; var5 < Class8543.method30435(this.field2793); var5++) {
                  int var25 = 2 * var5;
                  int var34 = 2 * Class8543.method30435(this.field2793) + 2 * var5;
                  int var8 = var34 + 2 * Class8543.method30435(this.field2793);
                  int var9 = var8 + 2 * Class8543.method30435(this.field2793);
                  var3[var25] = this.field2791[var5][var13];
                  var3[var25 + 1] = this.field2791[var5][var13 + 1];
                  var3[var34] = this.field2791[var5][var13 + 2];
                  var3[var34 + 1] = this.field2791[var5][var13 + 3];
                  var3[var8] = this.field2791[var5][var13 + 4];
                  var3[var8 + 1] = this.field2791[var5][var13 + 5];
                  var3[var9] = this.field2791[var5][var13 + 6];
                  var3[var9 + 1] = this.field2791[var5][var13 + 7];
               }

               Class8543.method30436(this.field2793).method30935(var3, 0, this.field2792);
               Class8543.method30436(this.field2793).method30935(var3, 2 * Class8543.method30435(this.field2793), this.field2792);
               Class8543.method30436(this.field2793).method30935(var3, 4 * Class8543.method30435(this.field2793), this.field2792);
               Class8543.method30436(this.field2793).method30935(var3, 6 * Class8543.method30435(this.field2793), this.field2792);

               for (int var19 = 0; var19 < Class8543.method30435(this.field2793); var19++) {
                  int var26 = 2 * var19;
                  int var35 = 2 * Class8543.method30435(this.field2793) + 2 * var19;
                  int var40 = var35 + 2 * Class8543.method30435(this.field2793);
                  int var43 = var40 + 2 * Class8543.method30435(this.field2793);
                  this.field2791[var19][var13] = var3[var26];
                  this.field2791[var19][var13 + 1] = var3[var26 + 1];
                  this.field2791[var19][var13 + 2] = var3[var35];
                  this.field2791[var19][var13 + 3] = var3[var35 + 1];
                  this.field2791[var19][var13 + 4] = var3[var40];
                  this.field2791[var19][var13 + 5] = var3[var40 + 1];
                  this.field2791[var19][var13 + 6] = var3[var43];
                  this.field2791[var19][var13 + 7] = var3[var43 + 1];
               }
            }
         }
      } else if (Class8543.method30438(this.field2793) <= 4 * this.field2789) {
         if (Class8543.method30438(this.field2793) != 4 * this.field2789) {
            if (Class8543.method30438(this.field2793) == 2 * this.field2789) {
               for (int var14 = 0; var14 < Class8543.method30435(this.field2793); var14++) {
                  int var27 = 2 * var14;
                  var3[var27] = this.field2791[var14][2 * this.field2790];
                  var3[var27 + 1] = this.field2791[var14][2 * this.field2790 + 1];
               }

               Class8543.method30436(this.field2793).method30931(var3, 0);

               for (int var15 = 0; var15 < Class8543.method30435(this.field2793); var15++) {
                  int var28 = 2 * var15;
                  this.field2791[var15][2 * this.field2790] = var3[var28];
                  this.field2791[var15][2 * this.field2790 + 1] = var3[var28 + 1];
               }
            }
         } else {
            for (int var16 = 0; var16 < Class8543.method30435(this.field2793); var16++) {
               int var29 = 2 * var16;
               int var36 = 2 * Class8543.method30435(this.field2793) + 2 * var16;
               var3[var29] = this.field2791[var16][4 * this.field2790];
               var3[var29 + 1] = this.field2791[var16][4 * this.field2790 + 1];
               var3[var36] = this.field2791[var16][4 * this.field2790 + 2];
               var3[var36 + 1] = this.field2791[var16][4 * this.field2790 + 3];
            }

            Class8543.method30436(this.field2793).method30931(var3, 0);
            Class8543.method30436(this.field2793).method30931(var3, 2 * Class8543.method30435(this.field2793));

            for (int var17 = 0; var17 < Class8543.method30435(this.field2793); var17++) {
               int var30 = 2 * var17;
               int var37 = 2 * Class8543.method30435(this.field2793) + 2 * var17;
               this.field2791[var17][4 * this.field2790] = var3[var30];
               this.field2791[var17][4 * this.field2790 + 1] = var3[var30 + 1];
               this.field2791[var17][4 * this.field2790 + 2] = var3[var37];
               this.field2791[var17][4 * this.field2790 + 3] = var3[var37 + 1];
            }
         }
      } else {
         for (int var18 = 8 * this.field2790; var18 < Class8543.method30438(this.field2793); var18 += 8 * this.field2789) {
            for (int var20 = 0; var20 < Class8543.method30435(this.field2793); var20++) {
               int var31 = 2 * var20;
               int var38 = 2 * Class8543.method30435(this.field2793) + 2 * var20;
               int var41 = var38 + 2 * Class8543.method30435(this.field2793);
               int var44 = var41 + 2 * Class8543.method30435(this.field2793);
               var3[var31] = this.field2791[var20][var18];
               var3[var31 + 1] = this.field2791[var20][var18 + 1];
               var3[var38] = this.field2791[var20][var18 + 2];
               var3[var38 + 1] = this.field2791[var20][var18 + 3];
               var3[var41] = this.field2791[var20][var18 + 4];
               var3[var41 + 1] = this.field2791[var20][var18 + 5];
               var3[var44] = this.field2791[var20][var18 + 6];
               var3[var44 + 1] = this.field2791[var20][var18 + 7];
            }

            Class8543.method30436(this.field2793).method30931(var3, 0);
            Class8543.method30436(this.field2793).method30931(var3, 2 * Class8543.method30435(this.field2793));
            Class8543.method30436(this.field2793).method30931(var3, 4 * Class8543.method30435(this.field2793));
            Class8543.method30436(this.field2793).method30931(var3, 6 * Class8543.method30435(this.field2793));

            for (int var21 = 0; var21 < Class8543.method30435(this.field2793); var21++) {
               int var32 = 2 * var21;
               int var39 = 2 * Class8543.method30435(this.field2793) + 2 * var21;
               int var42 = var39 + 2 * Class8543.method30435(this.field2793);
               int var45 = var42 + 2 * Class8543.method30435(this.field2793);
               this.field2791[var21][var18] = var3[var32];
               this.field2791[var21][var18 + 1] = var3[var32 + 1];
               this.field2791[var21][var18 + 2] = var3[var39];
               this.field2791[var21][var18 + 3] = var3[var39 + 1];
               this.field2791[var21][var18 + 4] = var3[var42];
               this.field2791[var21][var18 + 5] = var3[var42 + 1];
               this.field2791[var21][var18 + 6] = var3[var45];
               this.field2791[var21][var18 + 7] = var3[var45 + 1];
            }
         }
      }
   }
}
