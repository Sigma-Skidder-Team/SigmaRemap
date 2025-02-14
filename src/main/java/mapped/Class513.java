package mapped;

public class Class513 implements Runnable {
   private static String[] field2430;
   public final long field2431;
   public final int field2432;
   public final long field2433;
   public final long field2434;
   public final Class2381 field2435;
   public final boolean field2436;
   public final Class9330 field2437;

   public Class513(Class9330 var1, long var2, int var4, long var5, long var7, Class2381 var9, boolean var10) {
      this.field2437 = var1;
      this.field2431 = var2;
      this.field2432 = var4;
      this.field2433 = var5;
      this.field2434 = var7;
      this.field2435 = var9;
      this.field2436 = var10;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(this.field2431);
      if (Class9330.method35281(this.field2437) <= 2L) {
         if (Class9330.method35281(this.field2437) == 2L) {
            for (long var4 = 0L; var4 < Class9330.method35282(this.field2437); var4++) {
               long var8 = var4 * Class9330.method35281(this.field2437) + 2L * this.field2433;
               var3.method9687(var4, this.field2435.method9653(var8));
               var3.method9687(var4 + Class9330.method35282(this.field2437), this.field2435.method9653(var8 + 1L));
            }

            if (this.field2432 != -1) {
               Class9330.method35280(this.field2437).method38583(var3, 0L, this.field2436);
               Class9330.method35280(this.field2437).method38583(var3, Class9330.method35282(this.field2437), this.field2436);
            } else {
               Class9330.method35280(this.field2437).method38579(var3, 0L, this.field2436);
               Class9330.method35280(this.field2437).method38579(var3, Class9330.method35282(this.field2437), this.field2436);
            }

            for (long var12 = 0L; var12 < Class9330.method35282(this.field2437); var12++) {
               long var18 = var12 * Class9330.method35281(this.field2437) + 2L * this.field2433;
               this.field2435.method9687(var18, var3.method9653(var12));
               this.field2435.method9687(var18 + 1L, var3.method9653(var12 + Class9330.method35282(this.field2437)));
            }
         }
      } else if (this.field2432 != -1) {
         for (long var13 = 4L * this.field2433; var13 < Class9330.method35281(this.field2437); var13 += 4L * this.field2434) {
            for (long var6 = 0L; var6 < Class9330.method35282(this.field2437); var6++) {
               long var19 = var6 * Class9330.method35281(this.field2437) + var13;
               long var10 = Class9330.method35282(this.field2437) + var6;
               var3.method9687(var6, this.field2435.method9653(var19));
               var3.method9687(var10, this.field2435.method9653(var19 + 1L));
               var3.method9687(var10 + Class9330.method35282(this.field2437), this.field2435.method9653(var19 + 2L));
               var3.method9687(var10 + 2L * Class9330.method35282(this.field2437), this.field2435.method9653(var19 + 3L));
            }

            Class9330.method35280(this.field2437).method38581(var3, this.field2436);
            Class9330.method35280(this.field2437).method38583(var3, Class9330.method35282(this.field2437), this.field2436);
            Class9330.method35280(this.field2437).method38583(var3, 2L * Class9330.method35282(this.field2437), this.field2436);
            Class9330.method35280(this.field2437).method38583(var3, 3L * Class9330.method35282(this.field2437), this.field2436);

            for (long var15 = 0L; var15 < Class9330.method35282(this.field2437); var15++) {
               long var20 = var15 * Class9330.method35281(this.field2437) + var13;
               long var23 = Class9330.method35282(this.field2437) + var15;
               this.field2435.method9687(var20, var3.method9653(var15));
               this.field2435.method9687(var20 + 1L, var3.method9653(var23));
               this.field2435.method9687(var20 + 2L, var3.method9653(var23 + Class9330.method35282(this.field2437)));
               this.field2435.method9687(var20 + 3L, var3.method9653(var23 + 2L * Class9330.method35282(this.field2437)));
            }
         }
      } else {
         for (long var14 = 4L * this.field2433; var14 < Class9330.method35281(this.field2437); var14 += 4L * this.field2434) {
            for (long var16 = 0L; var16 < Class9330.method35282(this.field2437); var16++) {
               long var21 = var16 * Class9330.method35281(this.field2437) + var14;
               long var24 = Class9330.method35282(this.field2437) + var16;
               var3.method9687(var16, this.field2435.method9653(var21));
               var3.method9687(var24, this.field2435.method9653(var21 + 1L));
               var3.method9687(var24 + Class9330.method35282(this.field2437), this.field2435.method9653(var21 + 2L));
               var3.method9687(var24 + 2L * Class9330.method35282(this.field2437), this.field2435.method9653(var21 + 3L));
            }

            Class9330.method35280(this.field2437).method38579(var3, 0L, this.field2436);
            Class9330.method35280(this.field2437).method38579(var3, Class9330.method35282(this.field2437), this.field2436);
            Class9330.method35280(this.field2437).method38579(var3, 2L * Class9330.method35282(this.field2437), this.field2436);
            Class9330.method35280(this.field2437).method38579(var3, 3L * Class9330.method35282(this.field2437), this.field2436);

            for (long var17 = 0L; var17 < Class9330.method35282(this.field2437); var17++) {
               long var22 = var17 * Class9330.method35281(this.field2437) + var14;
               long var25 = Class9330.method35282(this.field2437) + var17;
               this.field2435.method9687(var22, var3.method9653(var17));
               this.field2435.method9687(var22 + 1L, var3.method9653(var25));
               this.field2435.method9687(var22 + 2L, var3.method9653(var25 + Class9330.method35282(this.field2437)));
               this.field2435.method9687(var22 + 3L, var3.method9653(var25 + 2L * Class9330.method35282(this.field2437)));
            }
         }
      }
   }
}
