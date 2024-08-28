package mapped;

public class Class1577 implements Runnable {
   private static String[] field8538;
   public final int field8539;
   public final int field8540;
   public final int field8541;
   public final int field8542;
   public final double[][][] field8543;
   public final boolean field8544;
   public final Class3612 field8545;

   public Class1577(Class3612 var1, int var2, int var3, int var4, int var5, double[][][] var6, boolean var7) {
      this.field8545 = var1;
      this.field8539 = var2;
      this.field8540 = var3;
      this.field8541 = var4;
      this.field8542 = var5;
      this.field8543 = var6;
      this.field8544 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field8539];
      if (this.field8540 != -1) {
         if (Class3612.method12224(this.field8545) <= 2) {
            if (Class3612.method12224(this.field8545) == 2) {
               for (int var4 = this.field8541; var4 < Class3612.method12221(this.field8545); var4 += this.field8542) {
                  for (int var5 = 0; var5 < Class3612.method12226(this.field8545); var5++) {
                     var3[var5] = this.field8543[var5][var4][0];
                     var3[Class3612.method12226(this.field8545) + var5] = this.field8543[var5][var4][1];
                  }

                  Class3612.method12227(this.field8545).method33662(var3, 0, this.field8544);
                  Class3612.method12227(this.field8545).method33662(var3, Class3612.method12226(this.field8545), this.field8544);

                  for (int var11 = 0; var11 < Class3612.method12226(this.field8545); var11++) {
                     this.field8543[var11][var4][0] = var3[var11];
                     this.field8543[var11][var4][1] = var3[Class3612.method12226(this.field8545) + var11];
                  }
               }
            }
         } else {
            for (int var8 = this.field8541; var8 < Class3612.method12221(this.field8545); var8 += this.field8542) {
               for (int var12 = 0; var12 < Class3612.method12224(this.field8545); var12 += 4) {
                  for (int var6 = 0; var6 < Class3612.method12226(this.field8545); var6++) {
                     int var7 = Class3612.method12226(this.field8545) + var6;
                     var3[var6] = this.field8543[var6][var8][var12];
                     var3[var7] = this.field8543[var6][var8][var12 + 1];
                     var3[var7 + Class3612.method12226(this.field8545)] = this.field8543[var6][var8][var12 + 2];
                     var3[var7 + 2 * Class3612.method12226(this.field8545)] = this.field8543[var6][var8][var12 + 3];
                  }

                  Class3612.method12227(this.field8545).method33662(var3, 0, this.field8544);
                  Class3612.method12227(this.field8545).method33662(var3, Class3612.method12226(this.field8545), this.field8544);
                  Class3612.method12227(this.field8545).method33662(var3, 2 * Class3612.method12226(this.field8545), this.field8544);
                  Class3612.method12227(this.field8545).method33662(var3, 3 * Class3612.method12226(this.field8545), this.field8544);

                  for (int var16 = 0; var16 < Class3612.method12226(this.field8545); var16++) {
                     int var19 = Class3612.method12226(this.field8545) + var16;
                     this.field8543[var16][var8][var12] = var3[var16];
                     this.field8543[var16][var8][var12 + 1] = var3[var19];
                     this.field8543[var16][var8][var12 + 2] = var3[var19 + Class3612.method12226(this.field8545)];
                     this.field8543[var16][var8][var12 + 3] = var3[var19 + 2 * Class3612.method12226(this.field8545)];
                  }
               }
            }
         }
      } else if (Class3612.method12224(this.field8545) <= 2) {
         if (Class3612.method12224(this.field8545) == 2) {
            for (int var9 = this.field8541; var9 < Class3612.method12221(this.field8545); var9 += this.field8542) {
               for (int var13 = 0; var13 < Class3612.method12226(this.field8545); var13++) {
                  var3[var13] = this.field8543[var13][var9][0];
                  var3[Class3612.method12226(this.field8545) + var13] = this.field8543[var13][var9][1];
               }

               Class3612.method12227(this.field8545).method33658(var3, 0, this.field8544);
               Class3612.method12227(this.field8545).method33658(var3, Class3612.method12226(this.field8545), this.field8544);

               for (int var14 = 0; var14 < Class3612.method12226(this.field8545); var14++) {
                  this.field8543[var14][var9][0] = var3[var14];
                  this.field8543[var14][var9][1] = var3[Class3612.method12226(this.field8545) + var14];
               }
            }
         }
      } else {
         for (int var10 = this.field8541; var10 < Class3612.method12221(this.field8545); var10 += this.field8542) {
            for (int var15 = 0; var15 < Class3612.method12224(this.field8545); var15 += 4) {
               for (int var17 = 0; var17 < Class3612.method12226(this.field8545); var17++) {
                  int var20 = Class3612.method12226(this.field8545) + var17;
                  var3[var17] = this.field8543[var17][var10][var15];
                  var3[var20] = this.field8543[var17][var10][var15 + 1];
                  var3[var20 + Class3612.method12226(this.field8545)] = this.field8543[var17][var10][var15 + 2];
                  var3[var20 + 2 * Class3612.method12226(this.field8545)] = this.field8543[var17][var10][var15 + 3];
               }

               Class3612.method12227(this.field8545).method33658(var3, 0, this.field8544);
               Class3612.method12227(this.field8545).method33658(var3, Class3612.method12226(this.field8545), this.field8544);
               Class3612.method12227(this.field8545).method33658(var3, 2 * Class3612.method12226(this.field8545), this.field8544);
               Class3612.method12227(this.field8545).method33658(var3, 3 * Class3612.method12226(this.field8545), this.field8544);

               for (int var18 = 0; var18 < Class3612.method12226(this.field8545); var18++) {
                  int var21 = Class3612.method12226(this.field8545) + var18;
                  this.field8543[var18][var10][var15] = var3[var18];
                  this.field8543[var18][var10][var15 + 1] = var3[var21];
                  this.field8543[var18][var10][var15 + 2] = var3[var21 + Class3612.method12226(this.field8545)];
                  this.field8543[var18][var10][var15 + 3] = var3[var21 + 2 * Class3612.method12226(this.field8545)];
               }
            }
         }
      }
   }
}
