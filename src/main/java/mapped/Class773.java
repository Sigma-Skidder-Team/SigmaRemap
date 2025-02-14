package mapped;

public class Class773 implements Runnable {
   private static String[] field4031;
   public final int field4032;
   public final int field4033;
   public final int field4034;
   public final int field4035;
   public final double[] field4036;
   public final boolean field4037;
   public final Class7274 field4038;

   public Class773(Class7274 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field4038 = var1;
      this.field4032 = var2;
      this.field4033 = var3;
      this.field4034 = var4;
      this.field4035 = var5;
      this.field4036 = var6;
      this.field4037 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field4032];
      if (this.field4033 != -1) {
         if (Class7274.method22898(this.field4038) <= 4) {
            if (Class7274.method22898(this.field4038) != 4) {
               if (Class7274.method22898(this.field4038) == 2) {
                  for (int var4 = this.field4034; var4 < Class7274.method22895(this.field4038); var4 += this.field4035) {
                     int var5 = var4 * Class7274.method22896(this.field4038);

                     for (int var6 = 0; var6 < Class7274.method22900(this.field4038); var6++) {
                        int var8 = var6 * Class7274.method22894(this.field4038) + var5;
                        int var9 = 2 * var6;
                        var3[var9] = this.field4036[var8];
                        var3[var9 + 1] = this.field4036[var8 + 1];
                     }

                     Class7274.method22901(this.field4038).method27168(var3, 0, this.field4037);

                     for (int var23 = 0; var23 < Class7274.method22900(this.field4038); var23++) {
                        int var35 = var23 * Class7274.method22894(this.field4038) + var5;
                        int var46 = 2 * var23;
                        this.field4036[var35] = var3[var46];
                        this.field4036[var35 + 1] = var3[var46 + 1];
                     }
                  }
               }
            } else {
               for (int var13 = this.field4034; var13 < Class7274.method22895(this.field4038); var13 += this.field4035) {
                  int var18 = var13 * Class7274.method22896(this.field4038);

                  for (int var24 = 0; var24 < Class7274.method22900(this.field4038); var24++) {
                     int var36 = var24 * Class7274.method22894(this.field4038) + var18;
                     int var47 = 2 * var24;
                     int var10 = 2 * Class7274.method22900(this.field4038) + 2 * var24;
                     var3[var47] = this.field4036[var36];
                     var3[var47 + 1] = this.field4036[var36 + 1];
                     var3[var10] = this.field4036[var36 + 2];
                     var3[var10 + 1] = this.field4036[var36 + 3];
                  }

                  Class7274.method22901(this.field4038).method27168(var3, 0, this.field4037);
                  Class7274.method22901(this.field4038).method27168(var3, 2 * Class7274.method22900(this.field4038), this.field4037);

                  for (int var25 = 0; var25 < Class7274.method22900(this.field4038); var25++) {
                     int var37 = var25 * Class7274.method22894(this.field4038) + var18;
                     int var48 = 2 * var25;
                     int var57 = 2 * Class7274.method22900(this.field4038) + 2 * var25;
                     this.field4036[var37] = var3[var48];
                     this.field4036[var37 + 1] = var3[var48 + 1];
                     this.field4036[var37 + 2] = var3[var57];
                     this.field4036[var37 + 3] = var3[var57 + 1];
                  }
               }
            }
         } else {
            for (int var14 = this.field4034; var14 < Class7274.method22895(this.field4038); var14 += this.field4035) {
               int var19 = var14 * Class7274.method22896(this.field4038);

               for (int var26 = 0; var26 < Class7274.method22898(this.field4038); var26 += 8) {
                  for (int var7 = 0; var7 < Class7274.method22900(this.field4038); var7++) {
                     int var38 = var7 * Class7274.method22894(this.field4038) + var19 + var26;
                     int var49 = 2 * var7;
                     int var58 = 2 * Class7274.method22900(this.field4038) + 2 * var7;
                     int var11 = var58 + 2 * Class7274.method22900(this.field4038);
                     int var12 = var11 + 2 * Class7274.method22900(this.field4038);
                     var3[var49] = this.field4036[var38];
                     var3[var49 + 1] = this.field4036[var38 + 1];
                     var3[var58] = this.field4036[var38 + 2];
                     var3[var58 + 1] = this.field4036[var38 + 3];
                     var3[var11] = this.field4036[var38 + 4];
                     var3[var11 + 1] = this.field4036[var38 + 5];
                     var3[var12] = this.field4036[var38 + 6];
                     var3[var12 + 1] = this.field4036[var38 + 7];
                  }

                  Class7274.method22901(this.field4038).method27168(var3, 0, this.field4037);
                  Class7274.method22901(this.field4038).method27168(var3, 2 * Class7274.method22900(this.field4038), this.field4037);
                  Class7274.method22901(this.field4038).method27168(var3, 4 * Class7274.method22900(this.field4038), this.field4037);
                  Class7274.method22901(this.field4038).method27168(var3, 6 * Class7274.method22900(this.field4038), this.field4037);

                  for (int var32 = 0; var32 < Class7274.method22900(this.field4038); var32++) {
                     int var39 = var32 * Class7274.method22894(this.field4038) + var19 + var26;
                     int var50 = 2 * var32;
                     int var59 = 2 * Class7274.method22900(this.field4038) + 2 * var32;
                     int var64 = var59 + 2 * Class7274.method22900(this.field4038);
                     int var67 = var64 + 2 * Class7274.method22900(this.field4038);
                     this.field4036[var39] = var3[var50];
                     this.field4036[var39 + 1] = var3[var50 + 1];
                     this.field4036[var39 + 2] = var3[var59];
                     this.field4036[var39 + 3] = var3[var59 + 1];
                     this.field4036[var39 + 4] = var3[var64];
                     this.field4036[var39 + 5] = var3[var64 + 1];
                     this.field4036[var39 + 6] = var3[var67];
                     this.field4036[var39 + 7] = var3[var67 + 1];
                  }
               }
            }
         }
      } else if (Class7274.method22898(this.field4038) <= 4) {
         if (Class7274.method22898(this.field4038) != 4) {
            if (Class7274.method22898(this.field4038) == 2) {
               for (int var15 = this.field4034; var15 < Class7274.method22895(this.field4038); var15 += this.field4035) {
                  int var20 = var15 * Class7274.method22896(this.field4038);

                  for (int var27 = 0; var27 < Class7274.method22900(this.field4038); var27++) {
                     int var40 = var27 * Class7274.method22894(this.field4038) + var20;
                     int var51 = 2 * var27;
                     var3[var51] = this.field4036[var40];
                     var3[var51 + 1] = this.field4036[var40 + 1];
                  }

                  Class7274.method22901(this.field4038).method27164(var3, 0);

                  for (int var28 = 0; var28 < Class7274.method22900(this.field4038); var28++) {
                     int var41 = var28 * Class7274.method22894(this.field4038) + var20;
                     int var52 = 2 * var28;
                     this.field4036[var41] = var3[var52];
                     this.field4036[var41 + 1] = var3[var52 + 1];
                  }
               }
            }
         } else {
            for (int var16 = this.field4034; var16 < Class7274.method22895(this.field4038); var16 += this.field4035) {
               int var21 = var16 * Class7274.method22896(this.field4038);

               for (int var29 = 0; var29 < Class7274.method22900(this.field4038); var29++) {
                  int var42 = var29 * Class7274.method22894(this.field4038) + var21;
                  int var53 = 2 * var29;
                  int var60 = 2 * Class7274.method22900(this.field4038) + 2 * var29;
                  var3[var53] = this.field4036[var42];
                  var3[var53 + 1] = this.field4036[var42 + 1];
                  var3[var60] = this.field4036[var42 + 2];
                  var3[var60 + 1] = this.field4036[var42 + 3];
               }

               Class7274.method22901(this.field4038).method27164(var3, 0);
               Class7274.method22901(this.field4038).method27164(var3, 2 * Class7274.method22900(this.field4038));

               for (int var30 = 0; var30 < Class7274.method22900(this.field4038); var30++) {
                  int var43 = var30 * Class7274.method22894(this.field4038) + var21;
                  int var54 = 2 * var30;
                  int var61 = 2 * Class7274.method22900(this.field4038) + 2 * var30;
                  this.field4036[var43] = var3[var54];
                  this.field4036[var43 + 1] = var3[var54 + 1];
                  this.field4036[var43 + 2] = var3[var61];
                  this.field4036[var43 + 3] = var3[var61 + 1];
               }
            }
         }
      } else {
         for (int var17 = this.field4034; var17 < Class7274.method22895(this.field4038); var17 += this.field4035) {
            int var22 = var17 * Class7274.method22896(this.field4038);

            for (int var31 = 0; var31 < Class7274.method22898(this.field4038); var31 += 8) {
               for (int var33 = 0; var33 < Class7274.method22900(this.field4038); var33++) {
                  int var44 = var33 * Class7274.method22894(this.field4038) + var22 + var31;
                  int var55 = 2 * var33;
                  int var62 = 2 * Class7274.method22900(this.field4038) + 2 * var33;
                  int var65 = var62 + 2 * Class7274.method22900(this.field4038);
                  int var68 = var65 + 2 * Class7274.method22900(this.field4038);
                  var3[var55] = this.field4036[var44];
                  var3[var55 + 1] = this.field4036[var44 + 1];
                  var3[var62] = this.field4036[var44 + 2];
                  var3[var62 + 1] = this.field4036[var44 + 3];
                  var3[var65] = this.field4036[var44 + 4];
                  var3[var65 + 1] = this.field4036[var44 + 5];
                  var3[var68] = this.field4036[var44 + 6];
                  var3[var68 + 1] = this.field4036[var44 + 7];
               }

               Class7274.method22901(this.field4038).method27164(var3, 0);
               Class7274.method22901(this.field4038).method27164(var3, 2 * Class7274.method22900(this.field4038));
               Class7274.method22901(this.field4038).method27164(var3, 4 * Class7274.method22900(this.field4038));
               Class7274.method22901(this.field4038).method27164(var3, 6 * Class7274.method22900(this.field4038));

               for (int var34 = 0; var34 < Class7274.method22900(this.field4038); var34++) {
                  int var45 = var34 * Class7274.method22894(this.field4038) + var22 + var31;
                  int var56 = 2 * var34;
                  int var63 = 2 * Class7274.method22900(this.field4038) + 2 * var34;
                  int var66 = var63 + 2 * Class7274.method22900(this.field4038);
                  int var69 = var66 + 2 * Class7274.method22900(this.field4038);
                  this.field4036[var45] = var3[var56];
                  this.field4036[var45 + 1] = var3[var56 + 1];
                  this.field4036[var45 + 2] = var3[var63];
                  this.field4036[var45 + 3] = var3[var63 + 1];
                  this.field4036[var45 + 4] = var3[var66];
                  this.field4036[var45 + 5] = var3[var66 + 1];
                  this.field4036[var45 + 6] = var3[var69];
                  this.field4036[var45 + 7] = var3[var69 + 1];
               }
            }
         }
      }
   }
}
