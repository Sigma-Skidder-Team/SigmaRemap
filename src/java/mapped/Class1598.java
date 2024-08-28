package mapped;

public class Class1598 implements Runnable {
   private static String[] field8660;
   public final int field8661;
   public final int field8662;
   public final int field8663;
   public final int field8664;
   public final float[] field8665;
   public final boolean field8666;
   public final Class8543 field8667;

   public Class1598(Class8543 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field8667 = var1;
      this.field8661 = var2;
      this.field8662 = var3;
      this.field8663 = var4;
      this.field8664 = var5;
      this.field8665 = var6;
      this.field8666 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field8661];
      if (this.field8662 != -1) {
         if (Class8543.method30438(this.field8667) <= 4 * this.field8663) {
            if (Class8543.method30438(this.field8667) != 4 * this.field8663) {
               if (Class8543.method30438(this.field8667) == 2 * this.field8663) {
                  for (int var4 = 0; var4 < Class8543.method30435(this.field8667); var4++) {
                     int var6 = var4 * Class8543.method30438(this.field8667) + 2 * this.field8664;
                     int var7 = 2 * var4;
                     var3[var7] = this.field8665[var6];
                     var3[var7 + 1] = this.field8665[var6 + 1];
                  }

                  Class8543.method30436(this.field8667).method30935(var3, 0, this.field8666);

                  for (int var11 = 0; var11 < Class8543.method30435(this.field8667); var11++) {
                     int var23 = var11 * Class8543.method30438(this.field8667) + 2 * this.field8664;
                     int var34 = 2 * var11;
                     this.field8665[var23] = var3[var34];
                     this.field8665[var23 + 1] = var3[var34 + 1];
                  }
               }
            } else {
               for (int var12 = 0; var12 < Class8543.method30435(this.field8667); var12++) {
                  int var24 = var12 * Class8543.method30438(this.field8667) + 4 * this.field8664;
                  int var35 = 2 * var12;
                  int var8 = 2 * Class8543.method30435(this.field8667) + 2 * var12;
                  var3[var35] = this.field8665[var24];
                  var3[var35 + 1] = this.field8665[var24 + 1];
                  var3[var8] = this.field8665[var24 + 2];
                  var3[var8 + 1] = this.field8665[var24 + 3];
               }

               Class8543.method30436(this.field8667).method30935(var3, 0, this.field8666);
               Class8543.method30436(this.field8667).method30935(var3, 2 * Class8543.method30435(this.field8667), this.field8666);

               for (int var13 = 0; var13 < Class8543.method30435(this.field8667); var13++) {
                  int var25 = var13 * Class8543.method30438(this.field8667) + 4 * this.field8664;
                  int var36 = 2 * var13;
                  int var45 = 2 * Class8543.method30435(this.field8667) + 2 * var13;
                  this.field8665[var25] = var3[var36];
                  this.field8665[var25 + 1] = var3[var36 + 1];
                  this.field8665[var25 + 2] = var3[var45];
                  this.field8665[var25 + 3] = var3[var45 + 1];
               }
            }
         } else {
            for (int var14 = 8 * this.field8664; var14 < Class8543.method30438(this.field8667); var14 += 8 * this.field8663) {
               for (int var5 = 0; var5 < Class8543.method30435(this.field8667); var5++) {
                  int var26 = var5 * Class8543.method30438(this.field8667) + var14;
                  int var37 = 2 * var5;
                  int var46 = 2 * Class8543.method30435(this.field8667) + 2 * var5;
                  int var9 = var46 + 2 * Class8543.method30435(this.field8667);
                  int var10 = var9 + 2 * Class8543.method30435(this.field8667);
                  var3[var37] = this.field8665[var26];
                  var3[var37 + 1] = this.field8665[var26 + 1];
                  var3[var46] = this.field8665[var26 + 2];
                  var3[var46 + 1] = this.field8665[var26 + 3];
                  var3[var9] = this.field8665[var26 + 4];
                  var3[var9 + 1] = this.field8665[var26 + 5];
                  var3[var10] = this.field8665[var26 + 6];
                  var3[var10 + 1] = this.field8665[var26 + 7];
               }

               Class8543.method30436(this.field8667).method30935(var3, 0, this.field8666);
               Class8543.method30436(this.field8667).method30935(var3, 2 * Class8543.method30435(this.field8667), this.field8666);
               Class8543.method30436(this.field8667).method30935(var3, 4 * Class8543.method30435(this.field8667), this.field8666);
               Class8543.method30436(this.field8667).method30935(var3, 6 * Class8543.method30435(this.field8667), this.field8666);

               for (int var20 = 0; var20 < Class8543.method30435(this.field8667); var20++) {
                  int var27 = var20 * Class8543.method30438(this.field8667) + var14;
                  int var38 = 2 * var20;
                  int var47 = 2 * Class8543.method30435(this.field8667) + 2 * var20;
                  int var52 = var47 + 2 * Class8543.method30435(this.field8667);
                  int var55 = var52 + 2 * Class8543.method30435(this.field8667);
                  this.field8665[var27] = var3[var38];
                  this.field8665[var27 + 1] = var3[var38 + 1];
                  this.field8665[var27 + 2] = var3[var47];
                  this.field8665[var27 + 3] = var3[var47 + 1];
                  this.field8665[var27 + 4] = var3[var52];
                  this.field8665[var27 + 5] = var3[var52 + 1];
                  this.field8665[var27 + 6] = var3[var55];
                  this.field8665[var27 + 7] = var3[var55 + 1];
               }
            }
         }
      } else if (Class8543.method30438(this.field8667) <= 4 * this.field8663) {
         if (Class8543.method30438(this.field8667) != 4 * this.field8663) {
            if (Class8543.method30438(this.field8667) == 2 * this.field8663) {
               for (int var15 = 0; var15 < Class8543.method30435(this.field8667); var15++) {
                  int var28 = var15 * Class8543.method30438(this.field8667) + 2 * this.field8664;
                  int var39 = 2 * var15;
                  var3[var39] = this.field8665[var28];
                  var3[var39 + 1] = this.field8665[var28 + 1];
               }

               Class8543.method30436(this.field8667).method30931(var3, 0);

               for (int var16 = 0; var16 < Class8543.method30435(this.field8667); var16++) {
                  int var29 = var16 * Class8543.method30438(this.field8667) + 2 * this.field8664;
                  int var40 = 2 * var16;
                  this.field8665[var29] = var3[var40];
                  this.field8665[var29 + 1] = var3[var40 + 1];
               }
            }
         } else {
            for (int var17 = 0; var17 < Class8543.method30435(this.field8667); var17++) {
               int var30 = var17 * Class8543.method30438(this.field8667) + 4 * this.field8664;
               int var41 = 2 * var17;
               int var48 = 2 * Class8543.method30435(this.field8667) + 2 * var17;
               var3[var41] = this.field8665[var30];
               var3[var41 + 1] = this.field8665[var30 + 1];
               var3[var48] = this.field8665[var30 + 2];
               var3[var48 + 1] = this.field8665[var30 + 3];
            }

            Class8543.method30436(this.field8667).method30931(var3, 0);
            Class8543.method30436(this.field8667).method30931(var3, 2 * Class8543.method30435(this.field8667));

            for (int var18 = 0; var18 < Class8543.method30435(this.field8667); var18++) {
               int var31 = var18 * Class8543.method30438(this.field8667) + 4 * this.field8664;
               int var42 = 2 * var18;
               int var49 = 2 * Class8543.method30435(this.field8667) + 2 * var18;
               this.field8665[var31] = var3[var42];
               this.field8665[var31 + 1] = var3[var42 + 1];
               this.field8665[var31 + 2] = var3[var49];
               this.field8665[var31 + 3] = var3[var49 + 1];
            }
         }
      } else {
         for (int var19 = 8 * this.field8664; var19 < Class8543.method30438(this.field8667); var19 += 8 * this.field8663) {
            for (int var21 = 0; var21 < Class8543.method30435(this.field8667); var21++) {
               int var32 = var21 * Class8543.method30438(this.field8667) + var19;
               int var43 = 2 * var21;
               int var50 = 2 * Class8543.method30435(this.field8667) + 2 * var21;
               int var53 = var50 + 2 * Class8543.method30435(this.field8667);
               int var56 = var53 + 2 * Class8543.method30435(this.field8667);
               var3[var43] = this.field8665[var32];
               var3[var43 + 1] = this.field8665[var32 + 1];
               var3[var50] = this.field8665[var32 + 2];
               var3[var50 + 1] = this.field8665[var32 + 3];
               var3[var53] = this.field8665[var32 + 4];
               var3[var53 + 1] = this.field8665[var32 + 5];
               var3[var56] = this.field8665[var32 + 6];
               var3[var56 + 1] = this.field8665[var32 + 7];
            }

            Class8543.method30436(this.field8667).method30931(var3, 0);
            Class8543.method30436(this.field8667).method30931(var3, 2 * Class8543.method30435(this.field8667));
            Class8543.method30436(this.field8667).method30931(var3, 4 * Class8543.method30435(this.field8667));
            Class8543.method30436(this.field8667).method30931(var3, 6 * Class8543.method30435(this.field8667));

            for (int var22 = 0; var22 < Class8543.method30435(this.field8667); var22++) {
               int var33 = var22 * Class8543.method30438(this.field8667) + var19;
               int var44 = 2 * var22;
               int var51 = 2 * Class8543.method30435(this.field8667) + 2 * var22;
               int var54 = var51 + 2 * Class8543.method30435(this.field8667);
               int var57 = var54 + 2 * Class8543.method30435(this.field8667);
               this.field8665[var33] = var3[var44];
               this.field8665[var33 + 1] = var3[var44 + 1];
               this.field8665[var33 + 2] = var3[var51];
               this.field8665[var33 + 3] = var3[var51 + 1];
               this.field8665[var33 + 4] = var3[var54];
               this.field8665[var33 + 5] = var3[var54 + 1];
               this.field8665[var33 + 6] = var3[var57];
               this.field8665[var33 + 7] = var3[var57 + 1];
            }
         }
      }
   }
}
