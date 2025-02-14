package mapped;

public class Class528 implements Runnable {
   private static String[] field2516;
   public final int field2517;
   public final int field2518;
   public final int field2519;
   public final int field2520;
   public final double[] field2521;
   public final boolean field2522;
   public final Class9330 field2523;

   public Class528(Class9330 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field2523 = var1;
      this.field2517 = var2;
      this.field2518 = var3;
      this.field2519 = var4;
      this.field2520 = var5;
      this.field2521 = var6;
      this.field2522 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field2517];
      if (Class9330.method35277(this.field2523) <= 2) {
         if (Class9330.method35277(this.field2523) == 2) {
            for (int var4 = 0; var4 < Class9330.method35279(this.field2523); var4++) {
               int var6 = var4 * Class9330.method35277(this.field2523) + 2 * this.field2519;
               var3[var4] = this.field2521[var6];
               var3[var4 + Class9330.method35279(this.field2523)] = this.field2521[var6 + 1];
            }

            if (this.field2518 != -1) {
               Class9330.method35280(this.field2523).method38582(var3, 0, this.field2522);
               Class9330.method35280(this.field2523).method38582(var3, Class9330.method35279(this.field2523), this.field2522);
            } else {
               Class9330.method35280(this.field2523).method38578(var3, 0, this.field2522);
               Class9330.method35280(this.field2523).method38578(var3, Class9330.method35279(this.field2523), this.field2522);
            }

            for (int var8 = 0; var8 < Class9330.method35279(this.field2523); var8++) {
               int var14 = var8 * Class9330.method35277(this.field2523) + 2 * this.field2519;
               this.field2521[var14] = var3[var8];
               this.field2521[var14 + 1] = var3[var8 + Class9330.method35279(this.field2523)];
            }
         }
      } else if (this.field2518 != -1) {
         for (int var9 = 4 * this.field2519; var9 < Class9330.method35277(this.field2523); var9 += 4 * this.field2520) {
            for (int var5 = 0; var5 < Class9330.method35279(this.field2523); var5++) {
               int var15 = var5 * Class9330.method35277(this.field2523) + var9;
               int var7 = Class9330.method35279(this.field2523) + var5;
               var3[var5] = this.field2521[var15];
               var3[var7] = this.field2521[var15 + 1];
               var3[var7 + Class9330.method35279(this.field2523)] = this.field2521[var15 + 2];
               var3[var7 + 2 * Class9330.method35279(this.field2523)] = this.field2521[var15 + 3];
            }

            Class9330.method35280(this.field2523).method38580(var3, this.field2522);
            Class9330.method35280(this.field2523).method38582(var3, Class9330.method35279(this.field2523), this.field2522);
            Class9330.method35280(this.field2523).method38582(var3, 2 * Class9330.method35279(this.field2523), this.field2522);
            Class9330.method35280(this.field2523).method38582(var3, 3 * Class9330.method35279(this.field2523), this.field2522);

            for (int var11 = 0; var11 < Class9330.method35279(this.field2523); var11++) {
               int var16 = var11 * Class9330.method35277(this.field2523) + var9;
               int var19 = Class9330.method35279(this.field2523) + var11;
               this.field2521[var16] = var3[var11];
               this.field2521[var16 + 1] = var3[var19];
               this.field2521[var16 + 2] = var3[var19 + Class9330.method35279(this.field2523)];
               this.field2521[var16 + 3] = var3[var19 + 2 * Class9330.method35279(this.field2523)];
            }
         }
      } else {
         for (int var10 = 4 * this.field2519; var10 < Class9330.method35277(this.field2523); var10 += 4 * this.field2520) {
            for (int var12 = 0; var12 < Class9330.method35279(this.field2523); var12++) {
               int var17 = var12 * Class9330.method35277(this.field2523) + var10;
               int var20 = Class9330.method35279(this.field2523) + var12;
               var3[var12] = this.field2521[var17];
               var3[var20] = this.field2521[var17 + 1];
               var3[var20 + Class9330.method35279(this.field2523)] = this.field2521[var17 + 2];
               var3[var20 + 2 * Class9330.method35279(this.field2523)] = this.field2521[var17 + 3];
            }

            Class9330.method35280(this.field2523).method38578(var3, 0, this.field2522);
            Class9330.method35280(this.field2523).method38578(var3, Class9330.method35279(this.field2523), this.field2522);
            Class9330.method35280(this.field2523).method38578(var3, 2 * Class9330.method35279(this.field2523), this.field2522);
            Class9330.method35280(this.field2523).method38578(var3, 3 * Class9330.method35279(this.field2523), this.field2522);

            for (int var13 = 0; var13 < Class9330.method35279(this.field2523); var13++) {
               int var18 = var13 * Class9330.method35277(this.field2523) + var10;
               int var21 = Class9330.method35279(this.field2523) + var13;
               this.field2521[var18] = var3[var13];
               this.field2521[var18 + 1] = var3[var21];
               this.field2521[var18 + 2] = var3[var21 + Class9330.method35279(this.field2523)];
               this.field2521[var18 + 3] = var3[var21 + 2 * Class9330.method35279(this.field2523)];
            }
         }
      }
   }
}
