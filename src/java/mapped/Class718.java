package mapped;

public class Class718 implements Runnable {
   private static String[] field3691;
   public final int field3692;
   public final int field3693;
   public final int field3694;
   public final int field3695;
   public final float[] field3696;
   public final boolean field3697;
   public final Class8682 field3698;

   public Class718(Class8682 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field3698 = var1;
      this.field3692 = var2;
      this.field3693 = var3;
      this.field3694 = var4;
      this.field3695 = var5;
      this.field3696 = var6;
      this.field3697 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field3692];
      if (Class8682.method31245(this.field3698) <= 2) {
         if (Class8682.method31245(this.field3698) == 2) {
            for (int var4 = 0; var4 < Class8682.method31247(this.field3698); var4++) {
               int var6 = var4 * Class8682.method31245(this.field3698) + 2 * this.field3694;
               var3[var4] = this.field3696[var6];
               var3[var4 + Class8682.method31247(this.field3698)] = this.field3696[var6 + 1];
            }

            if (this.field3693 != -1) {
               Class8682.method31248(this.field3698).method28930(var3, 0, this.field3697);
               Class8682.method31248(this.field3698).method28930(var3, Class8682.method31247(this.field3698), this.field3697);
            } else {
               Class8682.method31248(this.field3698).method28926(var3, 0, this.field3697);
               Class8682.method31248(this.field3698).method28926(var3, Class8682.method31247(this.field3698), this.field3697);
            }

            for (int var8 = 0; var8 < Class8682.method31247(this.field3698); var8++) {
               int var14 = var8 * Class8682.method31245(this.field3698) + 2 * this.field3694;
               this.field3696[var14] = var3[var8];
               this.field3696[var14 + 1] = var3[var8 + Class8682.method31247(this.field3698)];
            }
         }
      } else if (this.field3693 != -1) {
         for (int var9 = 4 * this.field3694; var9 < Class8682.method31245(this.field3698); var9 += 4 * this.field3695) {
            for (int var5 = 0; var5 < Class8682.method31247(this.field3698); var5++) {
               int var15 = var5 * Class8682.method31245(this.field3698) + var9;
               int var7 = Class8682.method31247(this.field3698) + var5;
               var3[var5] = this.field3696[var15];
               var3[var7] = this.field3696[var15 + 1];
               var3[var7 + Class8682.method31247(this.field3698)] = this.field3696[var15 + 2];
               var3[var7 + 2 * Class8682.method31247(this.field3698)] = this.field3696[var15 + 3];
            }

            Class8682.method31248(this.field3698).method28930(var3, 0, this.field3697);
            Class8682.method31248(this.field3698).method28930(var3, Class8682.method31247(this.field3698), this.field3697);
            Class8682.method31248(this.field3698).method28930(var3, 2 * Class8682.method31247(this.field3698), this.field3697);
            Class8682.method31248(this.field3698).method28930(var3, 3 * Class8682.method31247(this.field3698), this.field3697);

            for (int var11 = 0; var11 < Class8682.method31247(this.field3698); var11++) {
               int var16 = var11 * Class8682.method31245(this.field3698) + var9;
               int var19 = Class8682.method31247(this.field3698) + var11;
               this.field3696[var16] = var3[var11];
               this.field3696[var16 + 1] = var3[var19];
               this.field3696[var16 + 2] = var3[var19 + Class8682.method31247(this.field3698)];
               this.field3696[var16 + 3] = var3[var19 + 2 * Class8682.method31247(this.field3698)];
            }
         }
      } else {
         for (int var10 = 4 * this.field3694; var10 < Class8682.method31245(this.field3698); var10 += 4 * this.field3695) {
            for (int var12 = 0; var12 < Class8682.method31247(this.field3698); var12++) {
               int var17 = var12 * Class8682.method31245(this.field3698) + var10;
               int var20 = Class8682.method31247(this.field3698) + var12;
               var3[var12] = this.field3696[var17];
               var3[var20] = this.field3696[var17 + 1];
               var3[var20 + Class8682.method31247(this.field3698)] = this.field3696[var17 + 2];
               var3[var20 + 2 * Class8682.method31247(this.field3698)] = this.field3696[var17 + 3];
            }

            Class8682.method31248(this.field3698).method28926(var3, 0, this.field3697);
            Class8682.method31248(this.field3698).method28926(var3, Class8682.method31247(this.field3698), this.field3697);
            Class8682.method31248(this.field3698).method28926(var3, 2 * Class8682.method31247(this.field3698), this.field3697);
            Class8682.method31248(this.field3698).method28926(var3, 3 * Class8682.method31247(this.field3698), this.field3697);

            for (int var13 = 0; var13 < Class8682.method31247(this.field3698); var13++) {
               int var18 = var13 * Class8682.method31245(this.field3698) + var10;
               int var21 = Class8682.method31247(this.field3698) + var13;
               this.field3696[var18] = var3[var13];
               this.field3696[var18 + 1] = var3[var21];
               this.field3696[var18 + 2] = var3[var21 + Class8682.method31247(this.field3698)];
               this.field3696[var18 + 3] = var3[var21 + 2 * Class8682.method31247(this.field3698)];
            }
         }
      }
   }
}
