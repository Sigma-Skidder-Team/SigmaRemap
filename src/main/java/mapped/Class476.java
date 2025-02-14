package mapped;

public class Class476 implements Runnable {
   private static String[] field2223;
   public final int field2224;
   public final int field2225;
   public final int field2226;
   public final int field2227;
   public final double[][] field2228;
   public final boolean field2229;
   public final Class9330 field2230;

   public Class476(Class9330 var1, int var2, int var3, int var4, int var5, double[][] var6, boolean var7) {
      this.field2230 = var1;
      this.field2224 = var2;
      this.field2225 = var3;
      this.field2226 = var4;
      this.field2227 = var5;
      this.field2228 = var6;
      this.field2229 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field2224];
      if (Class9330.method35277(this.field2230) <= 2) {
         if (Class9330.method35277(this.field2230) == 2) {
            for (int var4 = 0; var4 < Class9330.method35279(this.field2230); var4++) {
               var3[var4] = this.field2228[var4][2 * this.field2226];
               var3[var4 + Class9330.method35279(this.field2230)] = this.field2228[var4][2 * this.field2226 + 1];
            }

            if (this.field2225 != -1) {
               Class9330.method35280(this.field2230).method38582(var3, 0, this.field2229);
               Class9330.method35280(this.field2230).method38582(var3, Class9330.method35279(this.field2230), this.field2229);
            } else {
               Class9330.method35280(this.field2230).method38578(var3, 0, this.field2229);
               Class9330.method35280(this.field2230).method38578(var3, Class9330.method35279(this.field2230), this.field2229);
            }

            for (int var7 = 0; var7 < Class9330.method35279(this.field2230); var7++) {
               this.field2228[var7][2 * this.field2226] = var3[var7];
               this.field2228[var7][2 * this.field2226 + 1] = var3[var7 + Class9330.method35279(this.field2230)];
            }
         }
      } else if (this.field2225 != -1) {
         for (int var8 = 4 * this.field2226; var8 < Class9330.method35277(this.field2230); var8 += 4 * this.field2227) {
            for (int var5 = 0; var5 < Class9330.method35279(this.field2230); var5++) {
               int var6 = Class9330.method35279(this.field2230) + var5;
               var3[var5] = this.field2228[var5][var8];
               var3[var6] = this.field2228[var5][var8 + 1];
               var3[var6 + Class9330.method35279(this.field2230)] = this.field2228[var5][var8 + 2];
               var3[var6 + 2 * Class9330.method35279(this.field2230)] = this.field2228[var5][var8 + 3];
            }

            Class9330.method35280(this.field2230).method38582(var3, 0, this.field2229);
            Class9330.method35280(this.field2230).method38582(var3, Class9330.method35279(this.field2230), this.field2229);
            Class9330.method35280(this.field2230).method38582(var3, 2 * Class9330.method35279(this.field2230), this.field2229);
            Class9330.method35280(this.field2230).method38582(var3, 3 * Class9330.method35279(this.field2230), this.field2229);

            for (int var10 = 0; var10 < Class9330.method35279(this.field2230); var10++) {
               int var13 = Class9330.method35279(this.field2230) + var10;
               this.field2228[var10][var8] = var3[var10];
               this.field2228[var10][var8 + 1] = var3[var13];
               this.field2228[var10][var8 + 2] = var3[var13 + Class9330.method35279(this.field2230)];
               this.field2228[var10][var8 + 3] = var3[var13 + 2 * Class9330.method35279(this.field2230)];
            }
         }
      } else {
         for (int var9 = 4 * this.field2226; var9 < Class9330.method35277(this.field2230); var9 += 4 * this.field2227) {
            for (int var11 = 0; var11 < Class9330.method35279(this.field2230); var11++) {
               int var14 = Class9330.method35279(this.field2230) + var11;
               var3[var11] = this.field2228[var11][var9];
               var3[var14] = this.field2228[var11][var9 + 1];
               var3[var14 + Class9330.method35279(this.field2230)] = this.field2228[var11][var9 + 2];
               var3[var14 + 2 * Class9330.method35279(this.field2230)] = this.field2228[var11][var9 + 3];
            }

            Class9330.method35280(this.field2230).method38578(var3, 0, this.field2229);
            Class9330.method35280(this.field2230).method38578(var3, Class9330.method35279(this.field2230), this.field2229);
            Class9330.method35280(this.field2230).method38578(var3, 2 * Class9330.method35279(this.field2230), this.field2229);
            Class9330.method35280(this.field2230).method38578(var3, 3 * Class9330.method35279(this.field2230), this.field2229);

            for (int var12 = 0; var12 < Class9330.method35279(this.field2230); var12++) {
               int var15 = Class9330.method35279(this.field2230) + var12;
               this.field2228[var12][var9] = var3[var12];
               this.field2228[var12][var9 + 1] = var3[var15];
               this.field2228[var12][var9 + 2] = var3[var15 + Class9330.method35279(this.field2230)];
               this.field2228[var12][var9 + 3] = var3[var15 + 2 * Class9330.method35279(this.field2230)];
            }
         }
      }
   }
}
