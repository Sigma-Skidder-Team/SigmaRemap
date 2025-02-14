package mapped;

public class Class1500 implements Runnable {
   private static String[] field8091;
   public final int field8092;
   public final int field8093;
   public final int field8094;
   public final int field8095;
   public final float[] field8096;
   public final boolean field8097;
   public final Class7821 field8098;

   public Class1500(Class7821 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field8098 = var1;
      this.field8092 = var2;
      this.field8093 = var3;
      this.field8094 = var4;
      this.field8095 = var5;
      this.field8096 = var6;
      this.field8097 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field8092];
      if (Class7821.method26149(this.field8098) <= 2) {
         if (Class7821.method26149(this.field8098) == 2) {
            for (int var4 = 0; var4 < Class7821.method26151(this.field8098); var4++) {
               int var6 = var4 * Class7821.method26149(this.field8098) + 2 * this.field8094;
               var3[var4] = this.field8096[var6];
               var3[var4 + Class7821.method26151(this.field8098)] = this.field8096[var6 + 1];
            }

            if (this.field8093 != -1) {
               Class7821.method26152(this.field8098).method28461(var3, 0, this.field8097);
               Class7821.method26152(this.field8098).method28461(var3, Class7821.method26151(this.field8098), this.field8097);
            } else {
               Class7821.method26152(this.field8098).method28457(var3, 0);
               Class7821.method26152(this.field8098).method28457(var3, Class7821.method26151(this.field8098));
            }

            for (int var8 = 0; var8 < Class7821.method26151(this.field8098); var8++) {
               int var14 = var8 * Class7821.method26149(this.field8098) + 2 * this.field8094;
               this.field8096[var14] = var3[var8];
               this.field8096[var14 + 1] = var3[var8 + Class7821.method26151(this.field8098)];
            }
         }
      } else if (this.field8093 != -1) {
         for (int var9 = 4 * this.field8094; var9 < Class7821.method26149(this.field8098); var9 += 4 * this.field8095) {
            for (int var5 = 0; var5 < Class7821.method26151(this.field8098); var5++) {
               int var15 = var5 * Class7821.method26149(this.field8098) + var9;
               int var7 = Class7821.method26151(this.field8098) + var5;
               var3[var5] = this.field8096[var15];
               var3[var7] = this.field8096[var15 + 1];
               var3[var7 + Class7821.method26151(this.field8098)] = this.field8096[var15 + 2];
               var3[var7 + 2 * Class7821.method26151(this.field8098)] = this.field8096[var15 + 3];
            }

            Class7821.method26152(this.field8098).method28461(var3, 0, this.field8097);
            Class7821.method26152(this.field8098).method28461(var3, Class7821.method26151(this.field8098), this.field8097);
            Class7821.method26152(this.field8098).method28461(var3, 2 * Class7821.method26151(this.field8098), this.field8097);
            Class7821.method26152(this.field8098).method28461(var3, 3 * Class7821.method26151(this.field8098), this.field8097);

            for (int var11 = 0; var11 < Class7821.method26151(this.field8098); var11++) {
               int var16 = var11 * Class7821.method26149(this.field8098) + var9;
               int var19 = Class7821.method26151(this.field8098) + var11;
               this.field8096[var16] = var3[var11];
               this.field8096[var16 + 1] = var3[var19];
               this.field8096[var16 + 2] = var3[var19 + Class7821.method26151(this.field8098)];
               this.field8096[var16 + 3] = var3[var19 + 2 * Class7821.method26151(this.field8098)];
            }
         }
      } else {
         for (int var10 = 4 * this.field8094; var10 < Class7821.method26149(this.field8098); var10 += 4 * this.field8095) {
            for (int var12 = 0; var12 < Class7821.method26151(this.field8098); var12++) {
               int var17 = var12 * Class7821.method26149(this.field8098) + var10;
               int var20 = Class7821.method26151(this.field8098) + var12;
               var3[var12] = this.field8096[var17];
               var3[var20] = this.field8096[var17 + 1];
               var3[var20 + Class7821.method26151(this.field8098)] = this.field8096[var17 + 2];
               var3[var20 + 2 * Class7821.method26151(this.field8098)] = this.field8096[var17 + 3];
            }

            Class7821.method26152(this.field8098).method28457(var3, 0);
            Class7821.method26152(this.field8098).method28457(var3, Class7821.method26151(this.field8098));
            Class7821.method26152(this.field8098).method28457(var3, 2 * Class7821.method26151(this.field8098));
            Class7821.method26152(this.field8098).method28457(var3, 3 * Class7821.method26151(this.field8098));

            for (int var13 = 0; var13 < Class7821.method26151(this.field8098); var13++) {
               int var18 = var13 * Class7821.method26149(this.field8098) + var10;
               int var21 = Class7821.method26151(this.field8098) + var13;
               this.field8096[var18] = var3[var13];
               this.field8096[var18 + 1] = var3[var21];
               this.field8096[var18 + 2] = var3[var21 + Class7821.method26151(this.field8098)];
               this.field8096[var18 + 3] = var3[var21 + 2 * Class7821.method26151(this.field8098)];
            }
         }
      }
   }
}
