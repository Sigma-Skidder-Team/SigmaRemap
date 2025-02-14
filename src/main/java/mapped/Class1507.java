package mapped;

public class Class1507 implements Runnable {
   private static String[] field8140;
   public final int field8141;
   public final int field8142;
   public final int field8143;
   public final int field8144;
   public final float[][] field8145;
   public final boolean field8146;
   public final Class8682 field8147;

   public Class1507(Class8682 var1, int var2, int var3, int var4, int var5, float[][] var6, boolean var7) {
      this.field8147 = var1;
      this.field8141 = var2;
      this.field8142 = var3;
      this.field8143 = var4;
      this.field8144 = var5;
      this.field8145 = var6;
      this.field8146 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field8141];
      if (Class8682.method31245(this.field8147) <= 2) {
         if (Class8682.method31245(this.field8147) == 2) {
            for (int var4 = 0; var4 < Class8682.method31247(this.field8147); var4++) {
               var3[var4] = this.field8145[var4][2 * this.field8143];
               var3[var4 + Class8682.method31247(this.field8147)] = this.field8145[var4][2 * this.field8143 + 1];
            }

            if (this.field8142 != -1) {
               Class8682.method31248(this.field8147).method28930(var3, 0, this.field8146);
               Class8682.method31248(this.field8147).method28930(var3, Class8682.method31247(this.field8147), this.field8146);
            } else {
               Class8682.method31248(this.field8147).method28926(var3, 0, this.field8146);
               Class8682.method31248(this.field8147).method28926(var3, Class8682.method31247(this.field8147), this.field8146);
            }

            for (int var7 = 0; var7 < Class8682.method31247(this.field8147); var7++) {
               this.field8145[var7][2 * this.field8143] = var3[var7];
               this.field8145[var7][2 * this.field8143 + 1] = var3[var7 + Class8682.method31247(this.field8147)];
            }
         }
      } else if (this.field8142 != -1) {
         for (int var8 = 4 * this.field8143; var8 < Class8682.method31245(this.field8147); var8 += 4 * this.field8144) {
            for (int var5 = 0; var5 < Class8682.method31247(this.field8147); var5++) {
               int var6 = Class8682.method31247(this.field8147) + var5;
               var3[var5] = this.field8145[var5][var8];
               var3[var6] = this.field8145[var5][var8 + 1];
               var3[var6 + Class8682.method31247(this.field8147)] = this.field8145[var5][var8 + 2];
               var3[var6 + 2 * Class8682.method31247(this.field8147)] = this.field8145[var5][var8 + 3];
            }

            Class8682.method31248(this.field8147).method28930(var3, 0, this.field8146);
            Class8682.method31248(this.field8147).method28930(var3, Class8682.method31247(this.field8147), this.field8146);
            Class8682.method31248(this.field8147).method28930(var3, 2 * Class8682.method31247(this.field8147), this.field8146);
            Class8682.method31248(this.field8147).method28930(var3, 3 * Class8682.method31247(this.field8147), this.field8146);

            for (int var10 = 0; var10 < Class8682.method31247(this.field8147); var10++) {
               int var13 = Class8682.method31247(this.field8147) + var10;
               this.field8145[var10][var8] = var3[var10];
               this.field8145[var10][var8 + 1] = var3[var13];
               this.field8145[var10][var8 + 2] = var3[var13 + Class8682.method31247(this.field8147)];
               this.field8145[var10][var8 + 3] = var3[var13 + 2 * Class8682.method31247(this.field8147)];
            }
         }
      } else {
         for (int var9 = 4 * this.field8143; var9 < Class8682.method31245(this.field8147); var9 += 4 * this.field8144) {
            for (int var11 = 0; var11 < Class8682.method31247(this.field8147); var11++) {
               int var14 = Class8682.method31247(this.field8147) + var11;
               var3[var11] = this.field8145[var11][var9];
               var3[var14] = this.field8145[var11][var9 + 1];
               var3[var14 + Class8682.method31247(this.field8147)] = this.field8145[var11][var9 + 2];
               var3[var14 + 2 * Class8682.method31247(this.field8147)] = this.field8145[var11][var9 + 3];
            }

            Class8682.method31248(this.field8147).method28926(var3, 0, this.field8146);
            Class8682.method31248(this.field8147).method28926(var3, Class8682.method31247(this.field8147), this.field8146);
            Class8682.method31248(this.field8147).method28926(var3, 2 * Class8682.method31247(this.field8147), this.field8146);
            Class8682.method31248(this.field8147).method28926(var3, 3 * Class8682.method31247(this.field8147), this.field8146);

            for (int var12 = 0; var12 < Class8682.method31247(this.field8147); var12++) {
               int var15 = Class8682.method31247(this.field8147) + var12;
               this.field8145[var12][var9] = var3[var12];
               this.field8145[var12][var9 + 1] = var3[var15];
               this.field8145[var12][var9 + 2] = var3[var15 + Class8682.method31247(this.field8147)];
               this.field8145[var12][var9 + 3] = var3[var15 + 2 * Class8682.method31247(this.field8147)];
            }
         }
      }
   }
}
