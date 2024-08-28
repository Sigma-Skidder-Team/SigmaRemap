package mapped;

public class Class721 implements Runnable {
   private static String[] field3707;
   public final int field3708;
   public final int field3709;
   public final int field3710;
   public final int field3711;
   public final double[][] field3712;
   public final boolean field3713;
   public final Class9615 field3714;

   public Class721(Class9615 var1, int var2, int var3, int var4, int var5, double[][] var6, boolean var7) {
      this.field3714 = var1;
      this.field3708 = var2;
      this.field3709 = var3;
      this.field3710 = var4;
      this.field3711 = var5;
      this.field3712 = var6;
      this.field3713 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field3708];
      if (this.field3709 != -1) {
         if (Class9615.method37427(this.field3714) <= 4 * this.field3710) {
            if (Class9615.method37427(this.field3714) != 4 * this.field3710) {
               if (Class9615.method37427(this.field3714) == 2 * this.field3710) {
                  for (int var4 = 0; var4 < Class9615.method37424(this.field3714); var4++) {
                     int var6 = 2 * var4;
                     var3[var6] = this.field3712[var4][2 * this.field3711];
                     var3[var6 + 1] = this.field3712[var4][2 * this.field3711 + 1];
                  }

                  Class9615.method37425(this.field3714).method27168(var3, 0, this.field3713);

                  for (int var10 = 0; var10 < Class9615.method37424(this.field3714); var10++) {
                     int var22 = 2 * var10;
                     this.field3712[var10][2 * this.field3711] = var3[var22];
                     this.field3712[var10][2 * this.field3711 + 1] = var3[var22 + 1];
                  }
               }
            } else {
               for (int var11 = 0; var11 < Class9615.method37424(this.field3714); var11++) {
                  int var23 = 2 * var11;
                  int var7 = 2 * Class9615.method37424(this.field3714) + 2 * var11;
                  var3[var23] = this.field3712[var11][4 * this.field3711];
                  var3[var23 + 1] = this.field3712[var11][4 * this.field3711 + 1];
                  var3[var7] = this.field3712[var11][4 * this.field3711 + 2];
                  var3[var7 + 1] = this.field3712[var11][4 * this.field3711 + 3];
               }

               Class9615.method37425(this.field3714).method27168(var3, 0, this.field3713);
               Class9615.method37425(this.field3714).method27168(var3, 2 * Class9615.method37424(this.field3714), this.field3713);

               for (int var12 = 0; var12 < Class9615.method37424(this.field3714); var12++) {
                  int var24 = 2 * var12;
                  int var33 = 2 * Class9615.method37424(this.field3714) + 2 * var12;
                  this.field3712[var12][4 * this.field3711] = var3[var24];
                  this.field3712[var12][4 * this.field3711 + 1] = var3[var24 + 1];
                  this.field3712[var12][4 * this.field3711 + 2] = var3[var33];
                  this.field3712[var12][4 * this.field3711 + 3] = var3[var33 + 1];
               }
            }
         } else {
            for (int var13 = 8 * this.field3711; var13 < Class9615.method37427(this.field3714); var13 += 8 * this.field3710) {
               for (int var5 = 0; var5 < Class9615.method37424(this.field3714); var5++) {
                  int var25 = 2 * var5;
                  int var34 = 2 * Class9615.method37424(this.field3714) + 2 * var5;
                  int var8 = var34 + 2 * Class9615.method37424(this.field3714);
                  int var9 = var8 + 2 * Class9615.method37424(this.field3714);
                  var3[var25] = this.field3712[var5][var13];
                  var3[var25 + 1] = this.field3712[var5][var13 + 1];
                  var3[var34] = this.field3712[var5][var13 + 2];
                  var3[var34 + 1] = this.field3712[var5][var13 + 3];
                  var3[var8] = this.field3712[var5][var13 + 4];
                  var3[var8 + 1] = this.field3712[var5][var13 + 5];
                  var3[var9] = this.field3712[var5][var13 + 6];
                  var3[var9 + 1] = this.field3712[var5][var13 + 7];
               }

               Class9615.method37425(this.field3714).method27168(var3, 0, this.field3713);
               Class9615.method37425(this.field3714).method27168(var3, 2 * Class9615.method37424(this.field3714), this.field3713);
               Class9615.method37425(this.field3714).method27168(var3, 4 * Class9615.method37424(this.field3714), this.field3713);
               Class9615.method37425(this.field3714).method27168(var3, 6 * Class9615.method37424(this.field3714), this.field3713);

               for (int var19 = 0; var19 < Class9615.method37424(this.field3714); var19++) {
                  int var26 = 2 * var19;
                  int var35 = 2 * Class9615.method37424(this.field3714) + 2 * var19;
                  int var40 = var35 + 2 * Class9615.method37424(this.field3714);
                  int var43 = var40 + 2 * Class9615.method37424(this.field3714);
                  this.field3712[var19][var13] = var3[var26];
                  this.field3712[var19][var13 + 1] = var3[var26 + 1];
                  this.field3712[var19][var13 + 2] = var3[var35];
                  this.field3712[var19][var13 + 3] = var3[var35 + 1];
                  this.field3712[var19][var13 + 4] = var3[var40];
                  this.field3712[var19][var13 + 5] = var3[var40 + 1];
                  this.field3712[var19][var13 + 6] = var3[var43];
                  this.field3712[var19][var13 + 7] = var3[var43 + 1];
               }
            }
         }
      } else if (Class9615.method37427(this.field3714) <= 4 * this.field3710) {
         if (Class9615.method37427(this.field3714) != 4 * this.field3710) {
            if (Class9615.method37427(this.field3714) == 2 * this.field3710) {
               for (int var14 = 0; var14 < Class9615.method37424(this.field3714); var14++) {
                  int var27 = 2 * var14;
                  var3[var27] = this.field3712[var14][2 * this.field3711];
                  var3[var27 + 1] = this.field3712[var14][2 * this.field3711 + 1];
               }

               Class9615.method37425(this.field3714).method27164(var3, 0);

               for (int var15 = 0; var15 < Class9615.method37424(this.field3714); var15++) {
                  int var28 = 2 * var15;
                  this.field3712[var15][2 * this.field3711] = var3[var28];
                  this.field3712[var15][2 * this.field3711 + 1] = var3[var28 + 1];
               }
            }
         } else {
            for (int var16 = 0; var16 < Class9615.method37424(this.field3714); var16++) {
               int var29 = 2 * var16;
               int var36 = 2 * Class9615.method37424(this.field3714) + 2 * var16;
               var3[var29] = this.field3712[var16][4 * this.field3711];
               var3[var29 + 1] = this.field3712[var16][4 * this.field3711 + 1];
               var3[var36] = this.field3712[var16][4 * this.field3711 + 2];
               var3[var36 + 1] = this.field3712[var16][4 * this.field3711 + 3];
            }

            Class9615.method37425(this.field3714).method27164(var3, 0);
            Class9615.method37425(this.field3714).method27164(var3, 2 * Class9615.method37424(this.field3714));

            for (int var17 = 0; var17 < Class9615.method37424(this.field3714); var17++) {
               int var30 = 2 * var17;
               int var37 = 2 * Class9615.method37424(this.field3714) + 2 * var17;
               this.field3712[var17][4 * this.field3711] = var3[var30];
               this.field3712[var17][4 * this.field3711 + 1] = var3[var30 + 1];
               this.field3712[var17][4 * this.field3711 + 2] = var3[var37];
               this.field3712[var17][4 * this.field3711 + 3] = var3[var37 + 1];
            }
         }
      } else {
         for (int var18 = 8 * this.field3711; var18 < Class9615.method37427(this.field3714); var18 += 8 * this.field3710) {
            for (int var20 = 0; var20 < Class9615.method37424(this.field3714); var20++) {
               int var31 = 2 * var20;
               int var38 = 2 * Class9615.method37424(this.field3714) + 2 * var20;
               int var41 = var38 + 2 * Class9615.method37424(this.field3714);
               int var44 = var41 + 2 * Class9615.method37424(this.field3714);
               var3[var31] = this.field3712[var20][var18];
               var3[var31 + 1] = this.field3712[var20][var18 + 1];
               var3[var38] = this.field3712[var20][var18 + 2];
               var3[var38 + 1] = this.field3712[var20][var18 + 3];
               var3[var41] = this.field3712[var20][var18 + 4];
               var3[var41 + 1] = this.field3712[var20][var18 + 5];
               var3[var44] = this.field3712[var20][var18 + 6];
               var3[var44 + 1] = this.field3712[var20][var18 + 7];
            }

            Class9615.method37425(this.field3714).method27164(var3, 0);
            Class9615.method37425(this.field3714).method27164(var3, 2 * Class9615.method37424(this.field3714));
            Class9615.method37425(this.field3714).method27164(var3, 4 * Class9615.method37424(this.field3714));
            Class9615.method37425(this.field3714).method27164(var3, 6 * Class9615.method37424(this.field3714));

            for (int var21 = 0; var21 < Class9615.method37424(this.field3714); var21++) {
               int var32 = 2 * var21;
               int var39 = 2 * Class9615.method37424(this.field3714) + 2 * var21;
               int var42 = var39 + 2 * Class9615.method37424(this.field3714);
               int var45 = var42 + 2 * Class9615.method37424(this.field3714);
               this.field3712[var21][var18] = var3[var32];
               this.field3712[var21][var18 + 1] = var3[var32 + 1];
               this.field3712[var21][var18 + 2] = var3[var39];
               this.field3712[var21][var18 + 3] = var3[var39 + 1];
               this.field3712[var21][var18 + 4] = var3[var42];
               this.field3712[var21][var18 + 5] = var3[var42 + 1];
               this.field3712[var21][var18 + 6] = var3[var45];
               this.field3712[var21][var18 + 7] = var3[var45 + 1];
            }
         }
      }
   }
}
