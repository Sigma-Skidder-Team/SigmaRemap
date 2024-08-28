package mapped;

public class Class622 implements Runnable {
   private static String[] field3093;
   public final int field3094;
   public final int field3095;
   public final int field3096;
   public final int field3097;
   public final float[] field3098;
   public final boolean field3099;
   public final Class9533 field3100;

   public Class622(Class9533 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field3100 = var1;
      this.field3094 = var2;
      this.field3095 = var3;
      this.field3096 = var4;
      this.field3097 = var5;
      this.field3098 = var6;
      this.field3099 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field3094];
      if (Class9533.method36856(this.field3100) <= 2) {
         if (Class9533.method36856(this.field3100) == 2) {
            for (int var4 = 0; var4 < Class9533.method36858(this.field3100); var4++) {
               int var6 = var4 * Class9533.method36856(this.field3100) + 2 * this.field3096;
               var3[var4] = this.field3098[var6];
               var3[var4 + Class9533.method36858(this.field3100)] = this.field3098[var6 + 1];
            }

            if (this.field3095 != -1) {
               Class9533.method36859(this.field3100).method29633(var3, 0, this.field3099);
               Class9533.method36859(this.field3100).method29633(var3, Class9533.method36858(this.field3100), this.field3099);
            } else {
               Class9533.method36859(this.field3100).method29629(var3, 0, this.field3099);
               Class9533.method36859(this.field3100).method29629(var3, Class9533.method36858(this.field3100), this.field3099);
            }

            for (int var8 = 0; var8 < Class9533.method36858(this.field3100); var8++) {
               int var14 = var8 * Class9533.method36856(this.field3100) + 2 * this.field3096;
               this.field3098[var14] = var3[var8];
               this.field3098[var14 + 1] = var3[var8 + Class9533.method36858(this.field3100)];
            }
         }
      } else if (this.field3095 != -1) {
         for (int var9 = 4 * this.field3096; var9 < Class9533.method36856(this.field3100); var9 += 4 * this.field3097) {
            for (int var5 = 0; var5 < Class9533.method36858(this.field3100); var5++) {
               int var15 = var5 * Class9533.method36856(this.field3100) + var9;
               int var7 = Class9533.method36858(this.field3100) + var5;
               var3[var5] = this.field3098[var15];
               var3[var7] = this.field3098[var15 + 1];
               var3[var7 + Class9533.method36858(this.field3100)] = this.field3098[var15 + 2];
               var3[var7 + 2 * Class9533.method36858(this.field3100)] = this.field3098[var15 + 3];
            }

            Class9533.method36859(this.field3100).method29631(var3, this.field3099);
            Class9533.method36859(this.field3100).method29633(var3, Class9533.method36858(this.field3100), this.field3099);
            Class9533.method36859(this.field3100).method29633(var3, 2 * Class9533.method36858(this.field3100), this.field3099);
            Class9533.method36859(this.field3100).method29633(var3, 3 * Class9533.method36858(this.field3100), this.field3099);

            for (int var11 = 0; var11 < Class9533.method36858(this.field3100); var11++) {
               int var16 = var11 * Class9533.method36856(this.field3100) + var9;
               int var19 = Class9533.method36858(this.field3100) + var11;
               this.field3098[var16] = var3[var11];
               this.field3098[var16 + 1] = var3[var19];
               this.field3098[var16 + 2] = var3[var19 + Class9533.method36858(this.field3100)];
               this.field3098[var16 + 3] = var3[var19 + 2 * Class9533.method36858(this.field3100)];
            }
         }
      } else {
         for (int var10 = 4 * this.field3096; var10 < Class9533.method36856(this.field3100); var10 += 4 * this.field3097) {
            for (int var12 = 0; var12 < Class9533.method36858(this.field3100); var12++) {
               int var17 = var12 * Class9533.method36856(this.field3100) + var10;
               int var20 = Class9533.method36858(this.field3100) + var12;
               var3[var12] = this.field3098[var17];
               var3[var20] = this.field3098[var17 + 1];
               var3[var20 + Class9533.method36858(this.field3100)] = this.field3098[var17 + 2];
               var3[var20 + 2 * Class9533.method36858(this.field3100)] = this.field3098[var17 + 3];
            }

            Class9533.method36859(this.field3100).method29629(var3, 0, this.field3099);
            Class9533.method36859(this.field3100).method29629(var3, Class9533.method36858(this.field3100), this.field3099);
            Class9533.method36859(this.field3100).method29629(var3, 2 * Class9533.method36858(this.field3100), this.field3099);
            Class9533.method36859(this.field3100).method29629(var3, 3 * Class9533.method36858(this.field3100), this.field3099);

            for (int var13 = 0; var13 < Class9533.method36858(this.field3100); var13++) {
               int var18 = var13 * Class9533.method36856(this.field3100) + var10;
               int var21 = Class9533.method36858(this.field3100) + var13;
               this.field3098[var18] = var3[var13];
               this.field3098[var18 + 1] = var3[var21];
               this.field3098[var18 + 2] = var3[var21 + Class9533.method36858(this.field3100)];
               this.field3098[var18 + 3] = var3[var21 + 2 * Class9533.method36858(this.field3100)];
            }
         }
      }
   }
}
