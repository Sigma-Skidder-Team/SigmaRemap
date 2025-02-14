package mapped;

public class Class1395 implements Runnable {
   private static String[] field7454;
   public final int field7455;
   public final int field7456;
   public final int field7457;
   public final int field7458;
   public final float[][][] field7459;
   public final boolean field7460;
   public final Class8162 field7461;

   public Class1395(Class8162 var1, int var2, int var3, int var4, int var5, float[][][] var6, boolean var7) {
      this.field7461 = var1;
      this.field7455 = var2;
      this.field7456 = var3;
      this.field7457 = var4;
      this.field7458 = var5;
      this.field7459 = var6;
      this.field7460 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field7455];
      if (this.field7456 != -1) {
         if (Class8162.method28396(this.field7461) <= 2) {
            if (Class8162.method28396(this.field7461) == 2) {
               for (int var4 = this.field7457; var4 < Class8162.method28393(this.field7461); var4 += this.field7458) {
                  for (int var5 = 0; var5 < Class8162.method28398(this.field7461); var5++) {
                     var3[var5] = this.field7459[var5][var4][0];
                     var3[Class8162.method28398(this.field7461) + var5] = this.field7459[var5][var4][1];
                  }

                  Class8162.method28399(this.field7461).method28461(var3, 0, this.field7460);
                  Class8162.method28399(this.field7461).method28461(var3, Class8162.method28398(this.field7461), this.field7460);

                  for (int var11 = 0; var11 < Class8162.method28398(this.field7461); var11++) {
                     this.field7459[var11][var4][0] = var3[var11];
                     this.field7459[var11][var4][1] = var3[Class8162.method28398(this.field7461) + var11];
                  }
               }
            }
         } else {
            for (int var8 = this.field7457; var8 < Class8162.method28393(this.field7461); var8 += this.field7458) {
               for (int var12 = 0; var12 < Class8162.method28396(this.field7461); var12 += 4) {
                  for (int var6 = 0; var6 < Class8162.method28398(this.field7461); var6++) {
                     int var7 = Class8162.method28398(this.field7461) + var6;
                     var3[var6] = this.field7459[var6][var8][var12];
                     var3[var7] = this.field7459[var6][var8][var12 + 1];
                     var3[var7 + Class8162.method28398(this.field7461)] = this.field7459[var6][var8][var12 + 2];
                     var3[var7 + 2 * Class8162.method28398(this.field7461)] = this.field7459[var6][var8][var12 + 3];
                  }

                  Class8162.method28399(this.field7461).method28461(var3, 0, this.field7460);
                  Class8162.method28399(this.field7461).method28461(var3, Class8162.method28398(this.field7461), this.field7460);
                  Class8162.method28399(this.field7461).method28461(var3, 2 * Class8162.method28398(this.field7461), this.field7460);
                  Class8162.method28399(this.field7461).method28461(var3, 3 * Class8162.method28398(this.field7461), this.field7460);

                  for (int var16 = 0; var16 < Class8162.method28398(this.field7461); var16++) {
                     int var19 = Class8162.method28398(this.field7461) + var16;
                     this.field7459[var16][var8][var12] = var3[var16];
                     this.field7459[var16][var8][var12 + 1] = var3[var19];
                     this.field7459[var16][var8][var12 + 2] = var3[var19 + Class8162.method28398(this.field7461)];
                     this.field7459[var16][var8][var12 + 3] = var3[var19 + 2 * Class8162.method28398(this.field7461)];
                  }
               }
            }
         }
      } else if (Class8162.method28396(this.field7461) <= 2) {
         if (Class8162.method28396(this.field7461) == 2) {
            for (int var9 = this.field7457; var9 < Class8162.method28393(this.field7461); var9 += this.field7458) {
               for (int var13 = 0; var13 < Class8162.method28398(this.field7461); var13++) {
                  var3[var13] = this.field7459[var13][var9][0];
                  var3[Class8162.method28398(this.field7461) + var13] = this.field7459[var13][var9][1];
               }

               Class8162.method28399(this.field7461).method28457(var3, 0);
               Class8162.method28399(this.field7461).method28457(var3, Class8162.method28398(this.field7461));

               for (int var14 = 0; var14 < Class8162.method28398(this.field7461); var14++) {
                  this.field7459[var14][var9][0] = var3[var14];
                  this.field7459[var14][var9][1] = var3[Class8162.method28398(this.field7461) + var14];
               }
            }
         }
      } else {
         for (int var10 = this.field7457; var10 < Class8162.method28393(this.field7461); var10 += this.field7458) {
            for (int var15 = 0; var15 < Class8162.method28396(this.field7461); var15 += 4) {
               for (int var17 = 0; var17 < Class8162.method28398(this.field7461); var17++) {
                  int var20 = Class8162.method28398(this.field7461) + var17;
                  var3[var17] = this.field7459[var17][var10][var15];
                  var3[var20] = this.field7459[var17][var10][var15 + 1];
                  var3[var20 + Class8162.method28398(this.field7461)] = this.field7459[var17][var10][var15 + 2];
                  var3[var20 + 2 * Class8162.method28398(this.field7461)] = this.field7459[var17][var10][var15 + 3];
               }

               Class8162.method28399(this.field7461).method28457(var3, 0);
               Class8162.method28399(this.field7461).method28457(var3, Class8162.method28398(this.field7461));
               Class8162.method28399(this.field7461).method28457(var3, 2 * Class8162.method28398(this.field7461));
               Class8162.method28399(this.field7461).method28457(var3, 3 * Class8162.method28398(this.field7461));

               for (int var18 = 0; var18 < Class8162.method28398(this.field7461); var18++) {
                  int var21 = Class8162.method28398(this.field7461) + var18;
                  this.field7459[var18][var10][var15] = var3[var18];
                  this.field7459[var18][var10][var15 + 1] = var3[var21];
                  this.field7459[var18][var10][var15 + 2] = var3[var21 + Class8162.method28398(this.field7461)];
                  this.field7459[var18][var10][var15 + 3] = var3[var21 + 2 * Class8162.method28398(this.field7461)];
               }
            }
         }
      }
   }
}
