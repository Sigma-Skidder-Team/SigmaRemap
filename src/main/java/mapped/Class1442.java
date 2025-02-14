package mapped;

public class Class1442 implements Runnable {
   private static String[] field7742;
   public final int field7743;
   public final int field7744;
   public final int field7745;
   public final int field7746;
   public final float[][] field7747;
   public final boolean field7748;
   public final Class7821 field7749;

   public Class1442(Class7821 var1, int var2, int var3, int var4, int var5, float[][] var6, boolean var7) {
      this.field7749 = var1;
      this.field7743 = var2;
      this.field7744 = var3;
      this.field7745 = var4;
      this.field7746 = var5;
      this.field7747 = var6;
      this.field7748 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field7743];
      if (Class7821.method26149(this.field7749) <= 2) {
         if (Class7821.method26149(this.field7749) == 2) {
            for (int var4 = 0; var4 < Class7821.method26151(this.field7749); var4++) {
               var3[var4] = this.field7747[var4][2 * this.field7745];
               var3[var4 + Class7821.method26151(this.field7749)] = this.field7747[var4][2 * this.field7745 + 1];
            }

            if (this.field7744 != -1) {
               Class7821.method26152(this.field7749).method28461(var3, 0, this.field7748);
               Class7821.method26152(this.field7749).method28461(var3, Class7821.method26151(this.field7749), this.field7748);
            } else {
               Class7821.method26152(this.field7749).method28457(var3, 0);
               Class7821.method26152(this.field7749).method28457(var3, Class7821.method26151(this.field7749));
            }

            for (int var7 = 0; var7 < Class7821.method26151(this.field7749); var7++) {
               this.field7747[var7][2 * this.field7745] = var3[var7];
               this.field7747[var7][2 * this.field7745 + 1] = var3[var7 + Class7821.method26151(this.field7749)];
            }
         }
      } else if (this.field7744 != -1) {
         for (int var8 = 4 * this.field7745; var8 < Class7821.method26149(this.field7749); var8 += 4 * this.field7746) {
            for (int var5 = 0; var5 < Class7821.method26151(this.field7749); var5++) {
               int var6 = Class7821.method26151(this.field7749) + var5;
               var3[var5] = this.field7747[var5][var8];
               var3[var6] = this.field7747[var5][var8 + 1];
               var3[var6 + Class7821.method26151(this.field7749)] = this.field7747[var5][var8 + 2];
               var3[var6 + 2 * Class7821.method26151(this.field7749)] = this.field7747[var5][var8 + 3];
            }

            Class7821.method26152(this.field7749).method28461(var3, 0, this.field7748);
            Class7821.method26152(this.field7749).method28461(var3, Class7821.method26151(this.field7749), this.field7748);
            Class7821.method26152(this.field7749).method28461(var3, 2 * Class7821.method26151(this.field7749), this.field7748);
            Class7821.method26152(this.field7749).method28461(var3, 3 * Class7821.method26151(this.field7749), this.field7748);

            for (int var10 = 0; var10 < Class7821.method26151(this.field7749); var10++) {
               int var13 = Class7821.method26151(this.field7749) + var10;
               this.field7747[var10][var8] = var3[var10];
               this.field7747[var10][var8 + 1] = var3[var13];
               this.field7747[var10][var8 + 2] = var3[var13 + Class7821.method26151(this.field7749)];
               this.field7747[var10][var8 + 3] = var3[var13 + 2 * Class7821.method26151(this.field7749)];
            }
         }
      } else {
         for (int var9 = 4 * this.field7745; var9 < Class7821.method26149(this.field7749); var9 += 4 * this.field7746) {
            for (int var11 = 0; var11 < Class7821.method26151(this.field7749); var11++) {
               int var14 = Class7821.method26151(this.field7749) + var11;
               var3[var11] = this.field7747[var11][var9];
               var3[var14] = this.field7747[var11][var9 + 1];
               var3[var14 + Class7821.method26151(this.field7749)] = this.field7747[var11][var9 + 2];
               var3[var14 + 2 * Class7821.method26151(this.field7749)] = this.field7747[var11][var9 + 3];
            }

            Class7821.method26152(this.field7749).method28457(var3, 0);
            Class7821.method26152(this.field7749).method28457(var3, Class7821.method26151(this.field7749));
            Class7821.method26152(this.field7749).method28457(var3, 2 * Class7821.method26151(this.field7749));
            Class7821.method26152(this.field7749).method28457(var3, 3 * Class7821.method26151(this.field7749));

            for (int var12 = 0; var12 < Class7821.method26151(this.field7749); var12++) {
               int var15 = Class7821.method26151(this.field7749) + var12;
               this.field7747[var12][var9] = var3[var12];
               this.field7747[var12][var9 + 1] = var3[var15];
               this.field7747[var12][var9 + 2] = var3[var15 + Class7821.method26151(this.field7749)];
               this.field7747[var12][var9 + 3] = var3[var15 + 2 * Class7821.method26151(this.field7749)];
            }
         }
      }
   }
}
