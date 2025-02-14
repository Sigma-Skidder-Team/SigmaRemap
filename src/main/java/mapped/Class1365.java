package mapped;

public class Class1365 implements Runnable {
   private static String[] field7286;
   public final int field7287;
   public final int field7288;
   public final int field7289;
   public final int field7290;
   public final float[] field7291;
   public final boolean field7292;
   public final Class7941 field7293;

   public Class1365(Class7941 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field7293 = var1;
      this.field7287 = var2;
      this.field7288 = var3;
      this.field7289 = var4;
      this.field7290 = var5;
      this.field7291 = var6;
      this.field7292 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field7287];
      if (this.field7288 != -1) {
         for (int var4 = this.field7289; var4 < Class7941.method26769(this.field7293); var4 += this.field7290) {
            int var5 = var4 * Class7941.method26763(this.field7293);

            for (int var6 = 0; var6 < Class7941.method26764(this.field7293); var6++) {
               Class7941.method26766(this.field7293).method28930(this.field7291, var5 + var6 * Class7941.method26765(this.field7293), this.field7292);
            }

            if (Class7941.method26767(this.field7293) <= 2) {
               if (Class7941.method26767(this.field7293) == 2) {
                  for (int var13 = 0; var13 < Class7941.method26764(this.field7293); var13++) {
                     int var23 = var5 + var13 * Class7941.method26765(this.field7293);
                     var3[var13] = this.field7291[var23];
                     var3[Class7941.method26764(this.field7293) + var13] = this.field7291[var23 + 1];
                  }

                  Class7941.method26768(this.field7293).method28930(var3, 0, this.field7292);
                  Class7941.method26768(this.field7293).method28930(var3, Class7941.method26764(this.field7293), this.field7292);

                  for (int var14 = 0; var14 < Class7941.method26764(this.field7293); var14++) {
                     int var24 = var5 + var14 * Class7941.method26765(this.field7293);
                     this.field7291[var24] = var3[var14];
                     this.field7291[var24 + 1] = var3[Class7941.method26764(this.field7293) + var14];
                  }
               }
            } else {
               for (int var12 = 0; var12 < Class7941.method26767(this.field7293); var12 += 4) {
                  for (int var7 = 0; var7 < Class7941.method26764(this.field7293); var7++) {
                     int var8 = var5 + var7 * Class7941.method26765(this.field7293) + var12;
                     int var9 = Class7941.method26764(this.field7293) + var7;
                     var3[var7] = this.field7291[var8];
                     var3[var9] = this.field7291[var8 + 1];
                     var3[var9 + Class7941.method26764(this.field7293)] = this.field7291[var8 + 2];
                     var3[var9 + 2 * Class7941.method26764(this.field7293)] = this.field7291[var8 + 3];
                  }

                  Class7941.method26768(this.field7293).method28930(var3, 0, this.field7292);
                  Class7941.method26768(this.field7293).method28930(var3, Class7941.method26764(this.field7293), this.field7292);
                  Class7941.method26768(this.field7293).method28930(var3, 2 * Class7941.method26764(this.field7293), this.field7292);
                  Class7941.method26768(this.field7293).method28930(var3, 3 * Class7941.method26764(this.field7293), this.field7292);

                  for (int var19 = 0; var19 < Class7941.method26764(this.field7293); var19++) {
                     int var22 = var5 + var19 * Class7941.method26765(this.field7293) + var12;
                     int var29 = Class7941.method26764(this.field7293) + var19;
                     this.field7291[var22] = var3[var19];
                     this.field7291[var22 + 1] = var3[var29];
                     this.field7291[var22 + 2] = var3[var29 + Class7941.method26764(this.field7293)];
                     this.field7291[var22 + 3] = var3[var29 + 2 * Class7941.method26764(this.field7293)];
                  }
               }
            }
         }
      } else {
         for (int var10 = this.field7289; var10 < Class7941.method26769(this.field7293); var10 += this.field7290) {
            int var11 = var10 * Class7941.method26763(this.field7293);

            for (int var15 = 0; var15 < Class7941.method26764(this.field7293); var15++) {
               Class7941.method26766(this.field7293).method28926(this.field7291, var11 + var15 * Class7941.method26765(this.field7293), this.field7292);
            }

            if (Class7941.method26767(this.field7293) <= 2) {
               if (Class7941.method26767(this.field7293) == 2) {
                  for (int var17 = 0; var17 < Class7941.method26764(this.field7293); var17++) {
                     int var27 = var11 + var17 * Class7941.method26765(this.field7293);
                     var3[var17] = this.field7291[var27];
                     var3[Class7941.method26764(this.field7293) + var17] = this.field7291[var27 + 1];
                  }

                  Class7941.method26768(this.field7293).method28926(var3, 0, this.field7292);
                  Class7941.method26768(this.field7293).method28926(var3, Class7941.method26764(this.field7293), this.field7292);

                  for (int var18 = 0; var18 < Class7941.method26764(this.field7293); var18++) {
                     int var28 = var11 + var18 * Class7941.method26765(this.field7293);
                     this.field7291[var28] = var3[var18];
                     this.field7291[var28 + 1] = var3[Class7941.method26764(this.field7293) + var18];
                  }
               }
            } else {
               for (int var16 = 0; var16 < Class7941.method26767(this.field7293); var16 += 4) {
                  for (int var20 = 0; var20 < Class7941.method26764(this.field7293); var20++) {
                     int var25 = var11 + var20 * Class7941.method26765(this.field7293) + var16;
                     int var30 = Class7941.method26764(this.field7293) + var20;
                     var3[var20] = this.field7291[var25];
                     var3[var30] = this.field7291[var25 + 1];
                     var3[var30 + Class7941.method26764(this.field7293)] = this.field7291[var25 + 2];
                     var3[var30 + 2 * Class7941.method26764(this.field7293)] = this.field7291[var25 + 3];
                  }

                  Class7941.method26768(this.field7293).method28926(var3, 0, this.field7292);
                  Class7941.method26768(this.field7293).method28926(var3, Class7941.method26764(this.field7293), this.field7292);
                  Class7941.method26768(this.field7293).method28926(var3, 2 * Class7941.method26764(this.field7293), this.field7292);
                  Class7941.method26768(this.field7293).method28926(var3, 3 * Class7941.method26764(this.field7293), this.field7292);

                  for (int var21 = 0; var21 < Class7941.method26764(this.field7293); var21++) {
                     int var26 = var11 + var21 * Class7941.method26765(this.field7293) + var16;
                     int var31 = Class7941.method26764(this.field7293) + var21;
                     this.field7291[var26] = var3[var21];
                     this.field7291[var26 + 1] = var3[var31];
                     this.field7291[var26 + 2] = var3[var31 + Class7941.method26764(this.field7293)];
                     this.field7291[var26 + 3] = var3[var31 + 2 * Class7941.method26764(this.field7293)];
                  }
               }
            }
         }
      }
   }
}
