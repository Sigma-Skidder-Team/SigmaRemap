package mapped;

public class Class1504 implements Runnable {
   private static String[] field8116;
   public final int field8117;
   public final int field8118;
   public final int field8119;
   public final int field8120;
   public final float[] field8121;
   public final boolean field8122;
   public final Class8162 field8123;

   public Class1504(Class8162 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field8123 = var1;
      this.field8117 = var2;
      this.field8118 = var3;
      this.field8119 = var4;
      this.field8120 = var5;
      this.field8121 = var6;
      this.field8122 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field8117];
      if (this.field8118 != -1) {
         for (int var4 = this.field8119; var4 < Class8162.method28398(this.field8123); var4 += this.field8120) {
            int var5 = var4 * Class8162.method28392(this.field8123);

            for (int var6 = 0; var6 < Class8162.method28393(this.field8123); var6++) {
               Class8162.method28395(this.field8123).method28461(this.field8121, var5 + var6 * Class8162.method28394(this.field8123), this.field8122);
            }

            if (Class8162.method28396(this.field8123) <= 2) {
               if (Class8162.method28396(this.field8123) == 2) {
                  for (int var13 = 0; var13 < Class8162.method28393(this.field8123); var13++) {
                     int var23 = var5 + var13 * Class8162.method28394(this.field8123);
                     var3[var13] = this.field8121[var23];
                     var3[Class8162.method28393(this.field8123) + var13] = this.field8121[var23 + 1];
                  }

                  Class8162.method28397(this.field8123).method28461(var3, 0, this.field8122);
                  Class8162.method28397(this.field8123).method28461(var3, Class8162.method28393(this.field8123), this.field8122);

                  for (int var14 = 0; var14 < Class8162.method28393(this.field8123); var14++) {
                     int var24 = var5 + var14 * Class8162.method28394(this.field8123);
                     this.field8121[var24] = var3[var14];
                     this.field8121[var24 + 1] = var3[Class8162.method28393(this.field8123) + var14];
                  }
               }
            } else {
               for (int var12 = 0; var12 < Class8162.method28396(this.field8123); var12 += 4) {
                  for (int var7 = 0; var7 < Class8162.method28393(this.field8123); var7++) {
                     int var8 = var5 + var7 * Class8162.method28394(this.field8123) + var12;
                     int var9 = Class8162.method28393(this.field8123) + var7;
                     var3[var7] = this.field8121[var8];
                     var3[var9] = this.field8121[var8 + 1];
                     var3[var9 + Class8162.method28393(this.field8123)] = this.field8121[var8 + 2];
                     var3[var9 + 2 * Class8162.method28393(this.field8123)] = this.field8121[var8 + 3];
                  }

                  Class8162.method28397(this.field8123).method28461(var3, 0, this.field8122);
                  Class8162.method28397(this.field8123).method28461(var3, Class8162.method28393(this.field8123), this.field8122);
                  Class8162.method28397(this.field8123).method28461(var3, 2 * Class8162.method28393(this.field8123), this.field8122);
                  Class8162.method28397(this.field8123).method28461(var3, 3 * Class8162.method28393(this.field8123), this.field8122);

                  for (int var19 = 0; var19 < Class8162.method28393(this.field8123); var19++) {
                     int var22 = var5 + var19 * Class8162.method28394(this.field8123) + var12;
                     int var29 = Class8162.method28393(this.field8123) + var19;
                     this.field8121[var22] = var3[var19];
                     this.field8121[var22 + 1] = var3[var29];
                     this.field8121[var22 + 2] = var3[var29 + Class8162.method28393(this.field8123)];
                     this.field8121[var22 + 3] = var3[var29 + 2 * Class8162.method28393(this.field8123)];
                  }
               }
            }
         }
      } else {
         for (int var10 = this.field8119; var10 < Class8162.method28398(this.field8123); var10 += this.field8120) {
            int var11 = var10 * Class8162.method28392(this.field8123);

            for (int var15 = 0; var15 < Class8162.method28393(this.field8123); var15++) {
               Class8162.method28395(this.field8123).method28457(this.field8121, var11 + var15 * Class8162.method28394(this.field8123));
            }

            if (Class8162.method28396(this.field8123) <= 2) {
               if (Class8162.method28396(this.field8123) == 2) {
                  for (int var17 = 0; var17 < Class8162.method28393(this.field8123); var17++) {
                     int var27 = var11 + var17 * Class8162.method28394(this.field8123);
                     var3[var17] = this.field8121[var27];
                     var3[Class8162.method28393(this.field8123) + var17] = this.field8121[var27 + 1];
                  }

                  Class8162.method28397(this.field8123).method28457(var3, 0);
                  Class8162.method28397(this.field8123).method28457(var3, Class8162.method28393(this.field8123));

                  for (int var18 = 0; var18 < Class8162.method28393(this.field8123); var18++) {
                     int var28 = var11 + var18 * Class8162.method28394(this.field8123);
                     this.field8121[var28] = var3[var18];
                     this.field8121[var28 + 1] = var3[Class8162.method28393(this.field8123) + var18];
                  }
               }
            } else {
               for (int var16 = 0; var16 < Class8162.method28396(this.field8123); var16 += 4) {
                  for (int var20 = 0; var20 < Class8162.method28393(this.field8123); var20++) {
                     int var25 = var11 + var20 * Class8162.method28394(this.field8123) + var16;
                     int var30 = Class8162.method28393(this.field8123) + var20;
                     var3[var20] = this.field8121[var25];
                     var3[var30] = this.field8121[var25 + 1];
                     var3[var30 + Class8162.method28393(this.field8123)] = this.field8121[var25 + 2];
                     var3[var30 + 2 * Class8162.method28393(this.field8123)] = this.field8121[var25 + 3];
                  }

                  Class8162.method28397(this.field8123).method28457(var3, 0);
                  Class8162.method28397(this.field8123).method28457(var3, Class8162.method28393(this.field8123));
                  Class8162.method28397(this.field8123).method28457(var3, 2 * Class8162.method28393(this.field8123));
                  Class8162.method28397(this.field8123).method28457(var3, 3 * Class8162.method28393(this.field8123));

                  for (int var21 = 0; var21 < Class8162.method28393(this.field8123); var21++) {
                     int var26 = var11 + var21 * Class8162.method28394(this.field8123) + var16;
                     int var31 = Class8162.method28393(this.field8123) + var21;
                     this.field8121[var26] = var3[var21];
                     this.field8121[var26 + 1] = var3[var31];
                     this.field8121[var26 + 2] = var3[var31 + Class8162.method28393(this.field8123)];
                     this.field8121[var26 + 3] = var3[var31 + 2 * Class8162.method28393(this.field8123)];
                  }
               }
            }
         }
      }
   }
}
