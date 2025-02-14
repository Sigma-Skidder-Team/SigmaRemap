package mapped;

public class Class657 implements Runnable {
   private static String[] field3294;
   public final int field3295;
   public final int field3296;
   public final int field3297;
   public final int field3298;
   public final float[][][] field3299;
   public final boolean field3300;
   public final Class7941 field3301;

   public Class657(Class7941 var1, int var2, int var3, int var4, int var5, float[][][] var6, boolean var7) {
      this.field3301 = var1;
      this.field3295 = var2;
      this.field3296 = var3;
      this.field3297 = var4;
      this.field3298 = var5;
      this.field3299 = var6;
      this.field3300 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field3295];
      if (this.field3296 != -1) {
         if (Class7941.method26767(this.field3301) <= 2) {
            if (Class7941.method26767(this.field3301) == 2) {
               for (int var4 = this.field3297; var4 < Class7941.method26764(this.field3301); var4 += this.field3298) {
                  for (int var5 = 0; var5 < Class7941.method26769(this.field3301); var5++) {
                     var3[var5] = this.field3299[var5][var4][0];
                     var3[Class7941.method26769(this.field3301) + var5] = this.field3299[var5][var4][1];
                  }

                  Class7941.method26770(this.field3301).method28930(var3, 0, this.field3300);
                  Class7941.method26770(this.field3301).method28930(var3, Class7941.method26769(this.field3301), this.field3300);

                  for (int var11 = 0; var11 < Class7941.method26769(this.field3301); var11++) {
                     this.field3299[var11][var4][0] = var3[var11];
                     this.field3299[var11][var4][1] = var3[Class7941.method26769(this.field3301) + var11];
                  }
               }
            }
         } else {
            for (int var8 = this.field3297; var8 < Class7941.method26764(this.field3301); var8 += this.field3298) {
               for (int var12 = 0; var12 < Class7941.method26767(this.field3301); var12 += 4) {
                  for (int var6 = 0; var6 < Class7941.method26769(this.field3301); var6++) {
                     int var7 = Class7941.method26769(this.field3301) + var6;
                     var3[var6] = this.field3299[var6][var8][var12];
                     var3[var7] = this.field3299[var6][var8][var12 + 1];
                     var3[var7 + Class7941.method26769(this.field3301)] = this.field3299[var6][var8][var12 + 2];
                     var3[var7 + 2 * Class7941.method26769(this.field3301)] = this.field3299[var6][var8][var12 + 3];
                  }

                  Class7941.method26770(this.field3301).method28930(var3, 0, this.field3300);
                  Class7941.method26770(this.field3301).method28930(var3, Class7941.method26769(this.field3301), this.field3300);
                  Class7941.method26770(this.field3301).method28930(var3, 2 * Class7941.method26769(this.field3301), this.field3300);
                  Class7941.method26770(this.field3301).method28930(var3, 3 * Class7941.method26769(this.field3301), this.field3300);

                  for (int var16 = 0; var16 < Class7941.method26769(this.field3301); var16++) {
                     int var19 = Class7941.method26769(this.field3301) + var16;
                     this.field3299[var16][var8][var12] = var3[var16];
                     this.field3299[var16][var8][var12 + 1] = var3[var19];
                     this.field3299[var16][var8][var12 + 2] = var3[var19 + Class7941.method26769(this.field3301)];
                     this.field3299[var16][var8][var12 + 3] = var3[var19 + 2 * Class7941.method26769(this.field3301)];
                  }
               }
            }
         }
      } else if (Class7941.method26767(this.field3301) <= 2) {
         if (Class7941.method26767(this.field3301) == 2) {
            for (int var9 = this.field3297; var9 < Class7941.method26764(this.field3301); var9 += this.field3298) {
               for (int var13 = 0; var13 < Class7941.method26769(this.field3301); var13++) {
                  var3[var13] = this.field3299[var13][var9][0];
                  var3[Class7941.method26769(this.field3301) + var13] = this.field3299[var13][var9][1];
               }

               Class7941.method26770(this.field3301).method28926(var3, 0, this.field3300);
               Class7941.method26770(this.field3301).method28926(var3, Class7941.method26769(this.field3301), this.field3300);

               for (int var14 = 0; var14 < Class7941.method26769(this.field3301); var14++) {
                  this.field3299[var14][var9][0] = var3[var14];
                  this.field3299[var14][var9][1] = var3[Class7941.method26769(this.field3301) + var14];
               }
            }
         }
      } else {
         for (int var10 = this.field3297; var10 < Class7941.method26764(this.field3301); var10 += this.field3298) {
            for (int var15 = 0; var15 < Class7941.method26767(this.field3301); var15 += 4) {
               for (int var17 = 0; var17 < Class7941.method26769(this.field3301); var17++) {
                  int var20 = Class7941.method26769(this.field3301) + var17;
                  var3[var17] = this.field3299[var17][var10][var15];
                  var3[var20] = this.field3299[var17][var10][var15 + 1];
                  var3[var20 + Class7941.method26769(this.field3301)] = this.field3299[var17][var10][var15 + 2];
                  var3[var20 + 2 * Class7941.method26769(this.field3301)] = this.field3299[var17][var10][var15 + 3];
               }

               Class7941.method26770(this.field3301).method28926(var3, 0, this.field3300);
               Class7941.method26770(this.field3301).method28926(var3, Class7941.method26769(this.field3301), this.field3300);
               Class7941.method26770(this.field3301).method28926(var3, 2 * Class7941.method26769(this.field3301), this.field3300);
               Class7941.method26770(this.field3301).method28926(var3, 3 * Class7941.method26769(this.field3301), this.field3300);

               for (int var18 = 0; var18 < Class7941.method26769(this.field3301); var18++) {
                  int var21 = Class7941.method26769(this.field3301) + var18;
                  this.field3299[var18][var10][var15] = var3[var18];
                  this.field3299[var18][var10][var15 + 1] = var3[var21];
                  this.field3299[var18][var10][var15 + 2] = var3[var21 + Class7941.method26769(this.field3301)];
                  this.field3299[var18][var10][var15 + 3] = var3[var21 + 2 * Class7941.method26769(this.field3301)];
               }
            }
         }
      }
   }
}
