package mapped;

public class Class589 implements Runnable {
   private static String[] field2888;
   public final int field2889;
   public final int field2890;
   public final int field2891;
   public final int field2892;
   public final float[][][] field2893;
   public final boolean field2894;
   public final Class8162 field2895;

   public Class589(Class8162 var1, int var2, int var3, int var4, int var5, float[][][] var6, boolean var7) {
      this.field2895 = var1;
      this.field2889 = var2;
      this.field2890 = var3;
      this.field2891 = var4;
      this.field2892 = var5;
      this.field2893 = var6;
      this.field2894 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field2889];
      if (this.field2890 != -1) {
         for (int var4 = this.field2891; var4 < Class8162.method28398(this.field2895); var4 += this.field2892) {
            for (int var5 = 0; var5 < Class8162.method28393(this.field2895); var5++) {
               Class8162.method28395(this.field2895).method28459(this.field2893[var4][var5], this.field2894);
            }

            if (Class8162.method28396(this.field2895) <= 2) {
               if (Class8162.method28396(this.field2895) == 2) {
                  for (int var10 = 0; var10 < Class8162.method28393(this.field2895); var10++) {
                     var3[var10] = this.field2893[var4][var10][0];
                     var3[Class8162.method28393(this.field2895) + var10] = this.field2893[var4][var10][1];
                  }

                  Class8162.method28397(this.field2895).method28461(var3, 0, this.field2894);
                  Class8162.method28397(this.field2895).method28461(var3, Class8162.method28393(this.field2895), this.field2894);

                  for (int var11 = 0; var11 < Class8162.method28393(this.field2895); var11++) {
                     this.field2893[var4][var11][0] = var3[var11];
                     this.field2893[var4][var11][1] = var3[Class8162.method28393(this.field2895) + var11];
                  }
               }
            } else {
               for (int var9 = 0; var9 < Class8162.method28396(this.field2895); var9 += 4) {
                  for (int var6 = 0; var6 < Class8162.method28393(this.field2895); var6++) {
                     int var7 = Class8162.method28393(this.field2895) + var6;
                     var3[var6] = this.field2893[var4][var6][var9];
                     var3[var7] = this.field2893[var4][var6][var9 + 1];
                     var3[var7 + Class8162.method28393(this.field2895)] = this.field2893[var4][var6][var9 + 2];
                     var3[var7 + 2 * Class8162.method28393(this.field2895)] = this.field2893[var4][var6][var9 + 3];
                  }

                  Class8162.method28397(this.field2895).method28461(var3, 0, this.field2894);
                  Class8162.method28397(this.field2895).method28461(var3, Class8162.method28393(this.field2895), this.field2894);
                  Class8162.method28397(this.field2895).method28461(var3, 2 * Class8162.method28393(this.field2895), this.field2894);
                  Class8162.method28397(this.field2895).method28461(var3, 3 * Class8162.method28393(this.field2895), this.field2894);

                  for (int var16 = 0; var16 < Class8162.method28393(this.field2895); var16++) {
                     int var19 = Class8162.method28393(this.field2895) + var16;
                     this.field2893[var4][var16][var9] = var3[var16];
                     this.field2893[var4][var16][var9 + 1] = var3[var19];
                     this.field2893[var4][var16][var9 + 2] = var3[var19 + Class8162.method28393(this.field2895)];
                     this.field2893[var4][var16][var9 + 3] = var3[var19 + 2 * Class8162.method28393(this.field2895)];
                  }
               }
            }
         }
      } else {
         for (int var8 = this.field2891; var8 < Class8162.method28398(this.field2895); var8 += this.field2892) {
            for (int var12 = 0; var12 < Class8162.method28393(this.field2895); var12++) {
               Class8162.method28395(this.field2895).method28455(this.field2893[var8][var12]);
            }

            if (Class8162.method28396(this.field2895) <= 2) {
               if (Class8162.method28396(this.field2895) == 2) {
                  for (int var14 = 0; var14 < Class8162.method28393(this.field2895); var14++) {
                     var3[var14] = this.field2893[var8][var14][0];
                     var3[Class8162.method28393(this.field2895) + var14] = this.field2893[var8][var14][1];
                  }

                  Class8162.method28397(this.field2895).method28457(var3, 0);
                  Class8162.method28397(this.field2895).method28457(var3, Class8162.method28393(this.field2895));

                  for (int var15 = 0; var15 < Class8162.method28393(this.field2895); var15++) {
                     this.field2893[var8][var15][0] = var3[var15];
                     this.field2893[var8][var15][1] = var3[Class8162.method28393(this.field2895) + var15];
                  }
               }
            } else {
               for (int var13 = 0; var13 < Class8162.method28396(this.field2895); var13 += 4) {
                  for (int var17 = 0; var17 < Class8162.method28393(this.field2895); var17++) {
                     int var20 = Class8162.method28393(this.field2895) + var17;
                     var3[var17] = this.field2893[var8][var17][var13];
                     var3[var20] = this.field2893[var8][var17][var13 + 1];
                     var3[var20 + Class8162.method28393(this.field2895)] = this.field2893[var8][var17][var13 + 2];
                     var3[var20 + 2 * Class8162.method28393(this.field2895)] = this.field2893[var8][var17][var13 + 3];
                  }

                  Class8162.method28397(this.field2895).method28457(var3, 0);
                  Class8162.method28397(this.field2895).method28457(var3, Class8162.method28393(this.field2895));
                  Class8162.method28397(this.field2895).method28457(var3, 2 * Class8162.method28393(this.field2895));
                  Class8162.method28397(this.field2895).method28457(var3, 3 * Class8162.method28393(this.field2895));

                  for (int var18 = 0; var18 < Class8162.method28393(this.field2895); var18++) {
                     int var21 = Class8162.method28393(this.field2895) + var18;
                     this.field2893[var8][var18][var13] = var3[var18];
                     this.field2893[var8][var18][var13 + 1] = var3[var21];
                     this.field2893[var8][var18][var13 + 2] = var3[var21 + Class8162.method28393(this.field2895)];
                     this.field2893[var8][var18][var13 + 3] = var3[var21 + 2 * Class8162.method28393(this.field2895)];
                  }
               }
            }
         }
      }
   }
}
