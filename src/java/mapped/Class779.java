package mapped;

public class Class779 implements Runnable {
   private static String[] field4064;
   public final int field4065;
   public final int field4066;
   public final int field4067;
   public final int field4068;
   public final float[] field4069;
   public final boolean field4070;
   public final Class7824 field4071;

   public Class779(Class7824 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field4071 = var1;
      this.field4065 = var2;
      this.field4066 = var3;
      this.field4067 = var4;
      this.field4068 = var5;
      this.field4069 = var6;
      this.field4070 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field4065];
      if (this.field4066 != -1) {
         for (int var4 = this.field4067; var4 < Class7824.method26185(this.field4071); var4 += this.field4068) {
            int var5 = var4 * Class7824.method26179(this.field4071);

            for (int var6 = 0; var6 < Class7824.method26180(this.field4071); var6++) {
               Class7824.method26182(this.field4071).method29633(this.field4069, var5 + var6 * Class7824.method26181(this.field4071), this.field4070);
            }

            if (Class7824.method26183(this.field4071) <= 2) {
               if (Class7824.method26183(this.field4071) == 2) {
                  for (int var13 = 0; var13 < Class7824.method26180(this.field4071); var13++) {
                     int var23 = var5 + var13 * Class7824.method26181(this.field4071);
                     var3[var13] = this.field4069[var23];
                     var3[Class7824.method26180(this.field4071) + var13] = this.field4069[var23 + 1];
                  }

                  Class7824.method26184(this.field4071).method29633(var3, 0, this.field4070);
                  Class7824.method26184(this.field4071).method29633(var3, Class7824.method26180(this.field4071), this.field4070);

                  for (int var14 = 0; var14 < Class7824.method26180(this.field4071); var14++) {
                     int var24 = var5 + var14 * Class7824.method26181(this.field4071);
                     this.field4069[var24] = var3[var14];
                     this.field4069[var24 + 1] = var3[Class7824.method26180(this.field4071) + var14];
                  }
               }
            } else {
               for (int var12 = 0; var12 < Class7824.method26183(this.field4071); var12 += 4) {
                  for (int var7 = 0; var7 < Class7824.method26180(this.field4071); var7++) {
                     int var8 = var5 + var7 * Class7824.method26181(this.field4071) + var12;
                     int var9 = Class7824.method26180(this.field4071) + var7;
                     var3[var7] = this.field4069[var8];
                     var3[var9] = this.field4069[var8 + 1];
                     var3[var9 + Class7824.method26180(this.field4071)] = this.field4069[var8 + 2];
                     var3[var9 + 2 * Class7824.method26180(this.field4071)] = this.field4069[var8 + 3];
                  }

                  Class7824.method26184(this.field4071).method29633(var3, 0, this.field4070);
                  Class7824.method26184(this.field4071).method29633(var3, Class7824.method26180(this.field4071), this.field4070);
                  Class7824.method26184(this.field4071).method29633(var3, 2 * Class7824.method26180(this.field4071), this.field4070);
                  Class7824.method26184(this.field4071).method29633(var3, 3 * Class7824.method26180(this.field4071), this.field4070);

                  for (int var19 = 0; var19 < Class7824.method26180(this.field4071); var19++) {
                     int var22 = var5 + var19 * Class7824.method26181(this.field4071) + var12;
                     int var29 = Class7824.method26180(this.field4071) + var19;
                     this.field4069[var22] = var3[var19];
                     this.field4069[var22 + 1] = var3[var29];
                     this.field4069[var22 + 2] = var3[var29 + Class7824.method26180(this.field4071)];
                     this.field4069[var22 + 3] = var3[var29 + 2 * Class7824.method26180(this.field4071)];
                  }
               }
            }
         }
      } else {
         for (int var10 = this.field4067; var10 < Class7824.method26185(this.field4071); var10 += this.field4068) {
            int var11 = var10 * Class7824.method26179(this.field4071);

            for (int var15 = 0; var15 < Class7824.method26180(this.field4071); var15++) {
               Class7824.method26182(this.field4071).method29629(this.field4069, var11 + var15 * Class7824.method26181(this.field4071), this.field4070);
            }

            if (Class7824.method26183(this.field4071) <= 2) {
               if (Class7824.method26183(this.field4071) == 2) {
                  for (int var17 = 0; var17 < Class7824.method26180(this.field4071); var17++) {
                     int var27 = var11 + var17 * Class7824.method26181(this.field4071);
                     var3[var17] = this.field4069[var27];
                     var3[Class7824.method26180(this.field4071) + var17] = this.field4069[var27 + 1];
                  }

                  Class7824.method26184(this.field4071).method29629(var3, 0, this.field4070);
                  Class7824.method26184(this.field4071).method29629(var3, Class7824.method26180(this.field4071), this.field4070);

                  for (int var18 = 0; var18 < Class7824.method26180(this.field4071); var18++) {
                     int var28 = var11 + var18 * Class7824.method26181(this.field4071);
                     this.field4069[var28] = var3[var18];
                     this.field4069[var28 + 1] = var3[Class7824.method26180(this.field4071) + var18];
                  }
               }
            } else {
               for (int var16 = 0; var16 < Class7824.method26183(this.field4071); var16 += 4) {
                  for (int var20 = 0; var20 < Class7824.method26180(this.field4071); var20++) {
                     int var25 = var11 + var20 * Class7824.method26181(this.field4071) + var16;
                     int var30 = Class7824.method26180(this.field4071) + var20;
                     var3[var20] = this.field4069[var25];
                     var3[var30] = this.field4069[var25 + 1];
                     var3[var30 + Class7824.method26180(this.field4071)] = this.field4069[var25 + 2];
                     var3[var30 + 2 * Class7824.method26180(this.field4071)] = this.field4069[var25 + 3];
                  }

                  Class7824.method26184(this.field4071).method29629(var3, 0, this.field4070);
                  Class7824.method26184(this.field4071).method29629(var3, Class7824.method26180(this.field4071), this.field4070);
                  Class7824.method26184(this.field4071).method29629(var3, 2 * Class7824.method26180(this.field4071), this.field4070);
                  Class7824.method26184(this.field4071).method29629(var3, 3 * Class7824.method26180(this.field4071), this.field4070);

                  for (int var21 = 0; var21 < Class7824.method26180(this.field4071); var21++) {
                     int var26 = var11 + var21 * Class7824.method26181(this.field4071) + var16;
                     int var31 = Class7824.method26180(this.field4071) + var21;
                     this.field4069[var26] = var3[var21];
                     this.field4069[var26 + 1] = var3[var31];
                     this.field4069[var26 + 2] = var3[var31 + Class7824.method26180(this.field4071)];
                     this.field4069[var26 + 3] = var3[var31 + 2 * Class7824.method26180(this.field4071)];
                  }
               }
            }
         }
      }
   }
}
