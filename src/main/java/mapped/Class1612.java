package mapped;

public class Class1612 implements Runnable {
   private static String[] field8734;
   public final long field8735;
   public final int field8736;
   public final long field8737;
   public final int field8738;
   public final Class2378 field8739;
   public final boolean field8740;
   public final Class8682 field8741;

   public Class1612(Class8682 var1, long var2, int var4, long var5, int var7, Class2378 var8, boolean var9) {
      this.field8741 = var1;
      this.field8735 = var2;
      this.field8736 = var4;
      this.field8737 = var5;
      this.field8738 = var7;
      this.field8739 = var8;
      this.field8740 = var9;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(this.field8735);
      if (Class8682.method31249(this.field8741) <= 2L) {
         if (Class8682.method31249(this.field8741) == 2L) {
            for (long var4 = 0L; var4 < Class8682.method31250(this.field8741); var4++) {
               long var8 = var4 * Class8682.method31249(this.field8741) + 2L * this.field8737;
               var3.method9685(var4, this.field8739.method9651(var8));
               var3.method9685(var4 + Class8682.method31250(this.field8741), this.field8739.method9651(var8 + 1L));
            }

            if (this.field8736 != -1) {
               Class8682.method31248(this.field8741).method28931(var3, 0L, this.field8740);
               Class8682.method31248(this.field8741).method28931(var3, Class8682.method31250(this.field8741), this.field8740);
            } else {
               Class8682.method31248(this.field8741).method28927(var3, 0L, this.field8740);
               Class8682.method31248(this.field8741).method28927(var3, Class8682.method31250(this.field8741), this.field8740);
            }

            for (long var12 = 0L; var12 < Class8682.method31250(this.field8741); var12++) {
               long var18 = var12 * Class8682.method31249(this.field8741) + 2L * this.field8737;
               this.field8739.method9685(var18, var3.method9651(var12));
               this.field8739.method9685(var18 + 1L, var3.method9651(var12 + Class8682.method31250(this.field8741)));
            }
         }
      } else if (this.field8736 != -1) {
         for (long var13 = 4L * this.field8737; var13 < Class8682.method31249(this.field8741); var13 += (long)(4 * this.field8738)) {
            for (long var6 = 0L; var6 < Class8682.method31250(this.field8741); var6++) {
               long var19 = var6 * Class8682.method31249(this.field8741) + var13;
               long var10 = Class8682.method31250(this.field8741) + var6;
               var3.method9685(var6, this.field8739.method9651(var19));
               var3.method9685(var10, this.field8739.method9651(var19 + 1L));
               var3.method9685(var10 + Class8682.method31250(this.field8741), this.field8739.method9651(var19 + 2L));
               var3.method9685(var10 + 2L * Class8682.method31250(this.field8741), this.field8739.method9651(var19 + 3L));
            }

            Class8682.method31248(this.field8741).method28931(var3, 0L, this.field8740);
            Class8682.method31248(this.field8741).method28931(var3, Class8682.method31250(this.field8741), this.field8740);
            Class8682.method31248(this.field8741).method28931(var3, 2L * Class8682.method31250(this.field8741), this.field8740);
            Class8682.method31248(this.field8741).method28931(var3, 3L * Class8682.method31250(this.field8741), this.field8740);

            for (long var15 = 0L; var15 < Class8682.method31250(this.field8741); var15++) {
               long var20 = var15 * Class8682.method31249(this.field8741) + var13;
               long var23 = Class8682.method31250(this.field8741) + var15;
               this.field8739.method9685(var20, var3.method9651(var15));
               this.field8739.method9685(var20 + 1L, var3.method9651(var23));
               this.field8739.method9685(var20 + 2L, var3.method9651(var23 + Class8682.method31250(this.field8741)));
               this.field8739.method9685(var20 + 3L, var3.method9651(var23 + 2L * Class8682.method31250(this.field8741)));
            }
         }
      } else {
         for (long var14 = 4L * this.field8737; var14 < Class8682.method31249(this.field8741); var14 += (long)(4 * this.field8738)) {
            for (long var16 = 0L; var16 < Class8682.method31250(this.field8741); var16++) {
               long var21 = var16 * Class8682.method31249(this.field8741) + var14;
               long var24 = Class8682.method31250(this.field8741) + var16;
               var3.method9685(var16, this.field8739.method9651(var21));
               var3.method9685(var24, this.field8739.method9651(var21 + 1L));
               var3.method9685(var24 + Class8682.method31250(this.field8741), this.field8739.method9651(var21 + 2L));
               var3.method9685(var24 + 2L * Class8682.method31250(this.field8741), this.field8739.method9651(var21 + 3L));
            }

            Class8682.method31248(this.field8741).method28927(var3, 0L, this.field8740);
            Class8682.method31248(this.field8741).method28927(var3, Class8682.method31250(this.field8741), this.field8740);
            Class8682.method31248(this.field8741).method28927(var3, 2L * Class8682.method31250(this.field8741), this.field8740);
            Class8682.method31248(this.field8741).method28927(var3, 3L * Class8682.method31250(this.field8741), this.field8740);

            for (long var17 = 0L; var17 < Class8682.method31250(this.field8741); var17++) {
               long var22 = var17 * Class8682.method31249(this.field8741) + var14;
               long var25 = Class8682.method31250(this.field8741) + var17;
               this.field8739.method9685(var22, var3.method9651(var17));
               this.field8739.method9685(var22 + 1L, var3.method9651(var25));
               this.field8739.method9685(var22 + 2L, var3.method9651(var25 + Class8682.method31250(this.field8741)));
               this.field8739.method9685(var22 + 3L, var3.method9651(var25 + 2L * Class8682.method31250(this.field8741)));
            }
         }
      }
   }
}
