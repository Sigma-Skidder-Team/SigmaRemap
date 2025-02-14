package mapped;

public class Class1372 implements Runnable {
   private static String[] field7327;
   public final int field7328;
   public final int field7329;
   public final int field7330;
   public final int field7331;
   public final float[] field7332;
   public final boolean field7333;
   public final Class7824 field7334;

   public Class1372(Class7824 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field7334 = var1;
      this.field7328 = var2;
      this.field7329 = var3;
      this.field7330 = var4;
      this.field7331 = var5;
      this.field7332 = var6;
      this.field7333 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field7328];
      if (this.field7329 != -1) {
         if (Class7824.method26183(this.field7334) <= 2) {
            if (Class7824.method26183(this.field7334) == 2) {
               for (int var4 = this.field7330; var4 < Class7824.method26180(this.field7334); var4 += this.field7331) {
                  int var5 = var4 * Class7824.method26181(this.field7334);

                  for (int var6 = 0; var6 < Class7824.method26185(this.field7334); var6++) {
                     int var8 = var6 * Class7824.method26179(this.field7334) + var5;
                     var3[var6] = this.field7332[var8];
                     var3[Class7824.method26185(this.field7334) + var6] = this.field7332[var8 + 1];
                  }

                  Class7824.method26186(this.field7334).method29633(var3, 0, this.field7333);
                  Class7824.method26186(this.field7334).method29633(var3, Class7824.method26185(this.field7334), this.field7333);

                  for (int var16 = 0; var16 < Class7824.method26185(this.field7334); var16++) {
                     int var24 = var16 * Class7824.method26179(this.field7334) + var5;
                     this.field7332[var24] = var3[var16];
                     this.field7332[var24 + 1] = var3[Class7824.method26185(this.field7334) + var16];
                  }
               }
            }
         } else {
            for (int var10 = this.field7330; var10 < Class7824.method26180(this.field7334); var10 += this.field7331) {
               int var13 = var10 * Class7824.method26181(this.field7334);

               for (int var17 = 0; var17 < Class7824.method26183(this.field7334); var17 += 4) {
                  for (int var7 = 0; var7 < Class7824.method26185(this.field7334); var7++) {
                     int var25 = var7 * Class7824.method26179(this.field7334) + var13 + var17;
                     int var9 = Class7824.method26185(this.field7334) + var7;
                     var3[var7] = this.field7332[var25];
                     var3[var9] = this.field7332[var25 + 1];
                     var3[var9 + Class7824.method26185(this.field7334)] = this.field7332[var25 + 2];
                     var3[var9 + 2 * Class7824.method26185(this.field7334)] = this.field7332[var25 + 3];
                  }

                  Class7824.method26186(this.field7334).method29633(var3, 0, this.field7333);
                  Class7824.method26186(this.field7334).method29633(var3, Class7824.method26185(this.field7334), this.field7333);
                  Class7824.method26186(this.field7334).method29633(var3, 2 * Class7824.method26185(this.field7334), this.field7333);
                  Class7824.method26186(this.field7334).method29633(var3, 3 * Class7824.method26185(this.field7334), this.field7333);

                  for (int var21 = 0; var21 < Class7824.method26185(this.field7334); var21++) {
                     int var26 = var21 * Class7824.method26179(this.field7334) + var13 + var17;
                     int var31 = Class7824.method26185(this.field7334) + var21;
                     this.field7332[var26] = var3[var21];
                     this.field7332[var26 + 1] = var3[var31];
                     this.field7332[var26 + 2] = var3[var31 + Class7824.method26185(this.field7334)];
                     this.field7332[var26 + 3] = var3[var31 + 2 * Class7824.method26185(this.field7334)];
                  }
               }
            }
         }
      } else if (Class7824.method26183(this.field7334) <= 2) {
         if (Class7824.method26183(this.field7334) == 2) {
            for (int var11 = this.field7330; var11 < Class7824.method26180(this.field7334); var11 += this.field7331) {
               int var14 = var11 * Class7824.method26181(this.field7334);

               for (int var18 = 0; var18 < Class7824.method26185(this.field7334); var18++) {
                  int var27 = var18 * Class7824.method26179(this.field7334) + var14;
                  var3[var18] = this.field7332[var27];
                  var3[Class7824.method26185(this.field7334) + var18] = this.field7332[var27 + 1];
               }

               Class7824.method26186(this.field7334).method29629(var3, 0, this.field7333);
               Class7824.method26186(this.field7334).method29629(var3, Class7824.method26185(this.field7334), this.field7333);

               for (int var19 = 0; var19 < Class7824.method26185(this.field7334); var19++) {
                  int var28 = var19 * Class7824.method26179(this.field7334) + var14;
                  this.field7332[var28] = var3[var19];
                  this.field7332[var28 + 1] = var3[Class7824.method26185(this.field7334) + var19];
               }
            }
         }
      } else {
         for (int var12 = this.field7330; var12 < Class7824.method26180(this.field7334); var12 += this.field7331) {
            int var15 = var12 * Class7824.method26181(this.field7334);

            for (int var20 = 0; var20 < Class7824.method26183(this.field7334); var20 += 4) {
               for (int var22 = 0; var22 < Class7824.method26185(this.field7334); var22++) {
                  int var29 = var22 * Class7824.method26179(this.field7334) + var15 + var20;
                  int var32 = Class7824.method26185(this.field7334) + var22;
                  var3[var22] = this.field7332[var29];
                  var3[var32] = this.field7332[var29 + 1];
                  var3[var32 + Class7824.method26185(this.field7334)] = this.field7332[var29 + 2];
                  var3[var32 + 2 * Class7824.method26185(this.field7334)] = this.field7332[var29 + 3];
               }

               Class7824.method26186(this.field7334).method29629(var3, 0, this.field7333);
               Class7824.method26186(this.field7334).method29629(var3, Class7824.method26185(this.field7334), this.field7333);
               Class7824.method26186(this.field7334).method29629(var3, 2 * Class7824.method26185(this.field7334), this.field7333);
               Class7824.method26186(this.field7334).method29629(var3, 3 * Class7824.method26185(this.field7334), this.field7333);

               for (int var23 = 0; var23 < Class7824.method26185(this.field7334); var23++) {
                  int var30 = var23 * Class7824.method26179(this.field7334) + var15 + var20;
                  int var33 = Class7824.method26185(this.field7334) + var23;
                  this.field7332[var30] = var3[var23];
                  this.field7332[var30 + 1] = var3[var33];
                  this.field7332[var30 + 2] = var3[var33 + Class7824.method26185(this.field7334)];
                  this.field7332[var30 + 3] = var3[var33 + 2 * Class7824.method26185(this.field7334)];
               }
            }
         }
      }
   }
}
