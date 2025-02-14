package mapped;

public class Class571 implements Runnable {
   private static String[] field2778;
   public final int field2779;
   public final int field2780;
   public final int field2781;
   public final int field2782;
   public final float[] field2783;
   public final boolean field2784;
   public final Class7941 field2785;

   public Class571(Class7941 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field2785 = var1;
      this.field2779 = var2;
      this.field2780 = var3;
      this.field2781 = var4;
      this.field2782 = var5;
      this.field2783 = var6;
      this.field2784 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field2779];
      if (this.field2780 != -1) {
         if (Class7941.method26767(this.field2785) <= 2) {
            if (Class7941.method26767(this.field2785) == 2) {
               for (int var4 = this.field2781; var4 < Class7941.method26764(this.field2785); var4 += this.field2782) {
                  int var5 = var4 * Class7941.method26765(this.field2785);

                  for (int var6 = 0; var6 < Class7941.method26769(this.field2785); var6++) {
                     int var8 = var6 * Class7941.method26763(this.field2785) + var5;
                     var3[var6] = this.field2783[var8];
                     var3[Class7941.method26769(this.field2785) + var6] = this.field2783[var8 + 1];
                  }

                  Class7941.method26770(this.field2785).method28930(var3, 0, this.field2784);
                  Class7941.method26770(this.field2785).method28930(var3, Class7941.method26769(this.field2785), this.field2784);

                  for (int var16 = 0; var16 < Class7941.method26769(this.field2785); var16++) {
                     int var24 = var16 * Class7941.method26763(this.field2785) + var5;
                     this.field2783[var24] = var3[var16];
                     this.field2783[var24 + 1] = var3[Class7941.method26769(this.field2785) + var16];
                  }
               }
            }
         } else {
            for (int var10 = this.field2781; var10 < Class7941.method26764(this.field2785); var10 += this.field2782) {
               int var13 = var10 * Class7941.method26765(this.field2785);

               for (int var17 = 0; var17 < Class7941.method26767(this.field2785); var17 += 4) {
                  for (int var7 = 0; var7 < Class7941.method26769(this.field2785); var7++) {
                     int var25 = var7 * Class7941.method26763(this.field2785) + var13 + var17;
                     int var9 = Class7941.method26769(this.field2785) + var7;
                     var3[var7] = this.field2783[var25];
                     var3[var9] = this.field2783[var25 + 1];
                     var3[var9 + Class7941.method26769(this.field2785)] = this.field2783[var25 + 2];
                     var3[var9 + 2 * Class7941.method26769(this.field2785)] = this.field2783[var25 + 3];
                  }

                  Class7941.method26770(this.field2785).method28930(var3, 0, this.field2784);
                  Class7941.method26770(this.field2785).method28930(var3, Class7941.method26769(this.field2785), this.field2784);
                  Class7941.method26770(this.field2785).method28930(var3, 2 * Class7941.method26769(this.field2785), this.field2784);
                  Class7941.method26770(this.field2785).method28930(var3, 3 * Class7941.method26769(this.field2785), this.field2784);

                  for (int var21 = 0; var21 < Class7941.method26769(this.field2785); var21++) {
                     int var26 = var21 * Class7941.method26763(this.field2785) + var13 + var17;
                     int var31 = Class7941.method26769(this.field2785) + var21;
                     this.field2783[var26] = var3[var21];
                     this.field2783[var26 + 1] = var3[var31];
                     this.field2783[var26 + 2] = var3[var31 + Class7941.method26769(this.field2785)];
                     this.field2783[var26 + 3] = var3[var31 + 2 * Class7941.method26769(this.field2785)];
                  }
               }
            }
         }
      } else if (Class7941.method26767(this.field2785) <= 2) {
         if (Class7941.method26767(this.field2785) == 2) {
            for (int var11 = this.field2781; var11 < Class7941.method26764(this.field2785); var11 += this.field2782) {
               int var14 = var11 * Class7941.method26765(this.field2785);

               for (int var18 = 0; var18 < Class7941.method26769(this.field2785); var18++) {
                  int var27 = var18 * Class7941.method26763(this.field2785) + var14;
                  var3[var18] = this.field2783[var27];
                  var3[Class7941.method26769(this.field2785) + var18] = this.field2783[var27 + 1];
               }

               Class7941.method26770(this.field2785).method28926(var3, 0, this.field2784);
               Class7941.method26770(this.field2785).method28926(var3, Class7941.method26769(this.field2785), this.field2784);

               for (int var19 = 0; var19 < Class7941.method26769(this.field2785); var19++) {
                  int var28 = var19 * Class7941.method26763(this.field2785) + var14;
                  this.field2783[var28] = var3[var19];
                  this.field2783[var28 + 1] = var3[Class7941.method26769(this.field2785) + var19];
               }
            }
         }
      } else {
         for (int var12 = this.field2781; var12 < Class7941.method26764(this.field2785); var12 += this.field2782) {
            int var15 = var12 * Class7941.method26765(this.field2785);

            for (int var20 = 0; var20 < Class7941.method26767(this.field2785); var20 += 4) {
               for (int var22 = 0; var22 < Class7941.method26769(this.field2785); var22++) {
                  int var29 = var22 * Class7941.method26763(this.field2785) + var15 + var20;
                  int var32 = Class7941.method26769(this.field2785) + var22;
                  var3[var22] = this.field2783[var29];
                  var3[var32] = this.field2783[var29 + 1];
                  var3[var32 + Class7941.method26769(this.field2785)] = this.field2783[var29 + 2];
                  var3[var32 + 2 * Class7941.method26769(this.field2785)] = this.field2783[var29 + 3];
               }

               Class7941.method26770(this.field2785).method28926(var3, 0, this.field2784);
               Class7941.method26770(this.field2785).method28926(var3, Class7941.method26769(this.field2785), this.field2784);
               Class7941.method26770(this.field2785).method28926(var3, 2 * Class7941.method26769(this.field2785), this.field2784);
               Class7941.method26770(this.field2785).method28926(var3, 3 * Class7941.method26769(this.field2785), this.field2784);

               for (int var23 = 0; var23 < Class7941.method26769(this.field2785); var23++) {
                  int var30 = var23 * Class7941.method26763(this.field2785) + var15 + var20;
                  int var33 = Class7941.method26769(this.field2785) + var23;
                  this.field2783[var30] = var3[var23];
                  this.field2783[var30 + 1] = var3[var33];
                  this.field2783[var30 + 2] = var3[var33 + Class7941.method26769(this.field2785)];
                  this.field2783[var30 + 3] = var3[var33 + 2 * Class7941.method26769(this.field2785)];
               }
            }
         }
      }
   }
}
