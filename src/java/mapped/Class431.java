package mapped;

public class Class431 implements Runnable {
   private static String[] field1920;
   public final int field1921;
   public final int field1922;
   public final int field1923;
   public final int field1924;
   public final float[] field1925;
   public final boolean field1926;
   public final Class8162 field1927;

   public Class431(Class8162 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field1927 = var1;
      this.field1921 = var2;
      this.field1922 = var3;
      this.field1923 = var4;
      this.field1924 = var5;
      this.field1925 = var6;
      this.field1926 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field1921];
      if (this.field1922 != -1) {
         if (Class8162.method28396(this.field1927) <= 2) {
            if (Class8162.method28396(this.field1927) == 2) {
               for (int var4 = this.field1923; var4 < Class8162.method28393(this.field1927); var4 += this.field1924) {
                  int var5 = var4 * Class8162.method28394(this.field1927);

                  for (int var6 = 0; var6 < Class8162.method28398(this.field1927); var6++) {
                     int var8 = var6 * Class8162.method28392(this.field1927) + var5;
                     var3[var6] = this.field1925[var8];
                     var3[Class8162.method28398(this.field1927) + var6] = this.field1925[var8 + 1];
                  }

                  Class8162.method28399(this.field1927).method28461(var3, 0, this.field1926);
                  Class8162.method28399(this.field1927).method28461(var3, Class8162.method28398(this.field1927), this.field1926);

                  for (int var16 = 0; var16 < Class8162.method28398(this.field1927); var16++) {
                     int var24 = var16 * Class8162.method28392(this.field1927) + var5;
                     this.field1925[var24] = var3[var16];
                     this.field1925[var24 + 1] = var3[Class8162.method28398(this.field1927) + var16];
                  }
               }
            }
         } else {
            for (int var10 = this.field1923; var10 < Class8162.method28393(this.field1927); var10 += this.field1924) {
               int var13 = var10 * Class8162.method28394(this.field1927);

               for (int var17 = 0; var17 < Class8162.method28396(this.field1927); var17 += 4) {
                  for (int var7 = 0; var7 < Class8162.method28398(this.field1927); var7++) {
                     int var25 = var7 * Class8162.method28392(this.field1927) + var13 + var17;
                     int var9 = Class8162.method28398(this.field1927) + var7;
                     var3[var7] = this.field1925[var25];
                     var3[var9] = this.field1925[var25 + 1];
                     var3[var9 + Class8162.method28398(this.field1927)] = this.field1925[var25 + 2];
                     var3[var9 + 2 * Class8162.method28398(this.field1927)] = this.field1925[var25 + 3];
                  }

                  Class8162.method28399(this.field1927).method28461(var3, 0, this.field1926);
                  Class8162.method28399(this.field1927).method28461(var3, Class8162.method28398(this.field1927), this.field1926);
                  Class8162.method28399(this.field1927).method28461(var3, 2 * Class8162.method28398(this.field1927), this.field1926);
                  Class8162.method28399(this.field1927).method28461(var3, 3 * Class8162.method28398(this.field1927), this.field1926);

                  for (int var21 = 0; var21 < Class8162.method28398(this.field1927); var21++) {
                     int var26 = var21 * Class8162.method28392(this.field1927) + var13 + var17;
                     int var31 = Class8162.method28398(this.field1927) + var21;
                     this.field1925[var26] = var3[var21];
                     this.field1925[var26 + 1] = var3[var31];
                     this.field1925[var26 + 2] = var3[var31 + Class8162.method28398(this.field1927)];
                     this.field1925[var26 + 3] = var3[var31 + 2 * Class8162.method28398(this.field1927)];
                  }
               }
            }
         }
      } else if (Class8162.method28396(this.field1927) <= 2) {
         if (Class8162.method28396(this.field1927) == 2) {
            for (int var11 = this.field1923; var11 < Class8162.method28393(this.field1927); var11 += this.field1924) {
               int var14 = var11 * Class8162.method28394(this.field1927);

               for (int var18 = 0; var18 < Class8162.method28398(this.field1927); var18++) {
                  int var27 = var18 * Class8162.method28392(this.field1927) + var14;
                  var3[var18] = this.field1925[var27];
                  var3[Class8162.method28398(this.field1927) + var18] = this.field1925[var27 + 1];
               }

               Class8162.method28399(this.field1927).method28457(var3, 0);
               Class8162.method28399(this.field1927).method28457(var3, Class8162.method28398(this.field1927));

               for (int var19 = 0; var19 < Class8162.method28398(this.field1927); var19++) {
                  int var28 = var19 * Class8162.method28392(this.field1927) + var14;
                  this.field1925[var28] = var3[var19];
                  this.field1925[var28 + 1] = var3[Class8162.method28398(this.field1927) + var19];
               }
            }
         }
      } else {
         for (int var12 = this.field1923; var12 < Class8162.method28393(this.field1927); var12 += this.field1924) {
            int var15 = var12 * Class8162.method28394(this.field1927);

            for (int var20 = 0; var20 < Class8162.method28396(this.field1927); var20 += 4) {
               for (int var22 = 0; var22 < Class8162.method28398(this.field1927); var22++) {
                  int var29 = var22 * Class8162.method28392(this.field1927) + var15 + var20;
                  int var32 = Class8162.method28398(this.field1927) + var22;
                  var3[var22] = this.field1925[var29];
                  var3[var32] = this.field1925[var29 + 1];
                  var3[var32 + Class8162.method28398(this.field1927)] = this.field1925[var29 + 2];
                  var3[var32 + 2 * Class8162.method28398(this.field1927)] = this.field1925[var29 + 3];
               }

               Class8162.method28399(this.field1927).method28457(var3, 0);
               Class8162.method28399(this.field1927).method28457(var3, Class8162.method28398(this.field1927));
               Class8162.method28399(this.field1927).method28457(var3, 2 * Class8162.method28398(this.field1927));
               Class8162.method28399(this.field1927).method28457(var3, 3 * Class8162.method28398(this.field1927));

               for (int var23 = 0; var23 < Class8162.method28398(this.field1927); var23++) {
                  int var30 = var23 * Class8162.method28392(this.field1927) + var15 + var20;
                  int var33 = Class8162.method28398(this.field1927) + var23;
                  this.field1925[var30] = var3[var23];
                  this.field1925[var30 + 1] = var3[var33];
                  this.field1925[var30 + 2] = var3[var33 + Class8162.method28398(this.field1927)];
                  this.field1925[var30 + 3] = var3[var33 + 2 * Class8162.method28398(this.field1927)];
               }
            }
         }
      }
   }
}
