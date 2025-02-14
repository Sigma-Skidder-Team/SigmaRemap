package mapped;

public class Class460 implements Runnable {
   private static String[] field2113;
   public final long field2114;
   public final int field2115;
   public final long field2116;
   public final int field2117;
   public final Class2381 field2118;
   public final boolean field2119;
   public final Class9186 field2120;

   public Class460(Class9186 var1, long var2, int var4, long var5, int var7, Class2381 var8, boolean var9) {
      this.field2120 = var1;
      this.field2114 = var2;
      this.field2115 = var4;
      this.field2116 = var5;
      this.field2117 = var7;
      this.field2118 = var8;
      this.field2119 = var9;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(this.field2114);
      if (Class9186.method34385(this.field2120) <= 2L) {
         if (Class9186.method34385(this.field2120) == 2L) {
            for (long var4 = 0L; var4 < Class9186.method34386(this.field2120); var4++) {
               long var8 = var4 * Class9186.method34385(this.field2120) + 2L * this.field2116;
               var3.method9687(var4, this.field2118.method9653(var8));
               var3.method9687(var4 + Class9186.method34386(this.field2120), this.field2118.method9653(var8 + 1L));
            }

            if (this.field2115 != -1) {
               Class9186.method34384(this.field2120).method33653(var3, 0L, this.field2119);
               Class9186.method34384(this.field2120).method33653(var3, Class9186.method34386(this.field2120), this.field2119);
            } else {
               Class9186.method34384(this.field2120).method33649(var3, 0L);
               Class9186.method34384(this.field2120).method33649(var3, Class9186.method34386(this.field2120));
            }

            for (long var12 = 0L; var12 < Class9186.method34386(this.field2120); var12++) {
               long var18 = var12 * Class9186.method34385(this.field2120) + 2L * this.field2116;
               this.field2118.method9687(var18, var3.method9653(var12));
               this.field2118.method9687(var18 + 1L, var3.method9653(var12 + Class9186.method34386(this.field2120)));
            }
         }
      } else if (this.field2115 != -1) {
         for (long var13 = 4L * this.field2116; var13 < Class9186.method34385(this.field2120); var13 += (long)(4 * this.field2117)) {
            for (long var6 = 0L; var6 < Class9186.method34386(this.field2120); var6++) {
               long var19 = var6 * Class9186.method34385(this.field2120) + var13;
               long var10 = Class9186.method34386(this.field2120) + var6;
               var3.method9687(var6, this.field2118.method9653(var19));
               var3.method9687(var10, this.field2118.method9653(var19 + 1L));
               var3.method9687(var10 + Class9186.method34386(this.field2120), this.field2118.method9653(var19 + 2L));
               var3.method9687(var10 + 2L * Class9186.method34386(this.field2120), this.field2118.method9653(var19 + 3L));
            }

            Class9186.method34384(this.field2120).method33653(var3, 0L, this.field2119);
            Class9186.method34384(this.field2120).method33653(var3, Class9186.method34386(this.field2120), this.field2119);
            Class9186.method34384(this.field2120).method33653(var3, 2L * Class9186.method34386(this.field2120), this.field2119);
            Class9186.method34384(this.field2120).method33653(var3, 3L * Class9186.method34386(this.field2120), this.field2119);

            for (long var15 = 0L; var15 < Class9186.method34386(this.field2120); var15++) {
               long var20 = var15 * Class9186.method34385(this.field2120) + var13;
               long var23 = Class9186.method34386(this.field2120) + var15;
               this.field2118.method9687(var20, var3.method9653(var15));
               this.field2118.method9687(var20 + 1L, var3.method9653(var23));
               this.field2118.method9687(var20 + 2L, var3.method9653(var23 + Class9186.method34386(this.field2120)));
               this.field2118.method9687(var20 + 3L, var3.method9653(var23 + 2L * Class9186.method34386(this.field2120)));
            }
         }
      } else {
         for (long var14 = 4L * this.field2116; var14 < Class9186.method34385(this.field2120); var14 += (long)(4 * this.field2117)) {
            for (long var16 = 0L; var16 < Class9186.method34386(this.field2120); var16++) {
               long var21 = var16 * Class9186.method34385(this.field2120) + var14;
               long var24 = Class9186.method34386(this.field2120) + var16;
               var3.method9687(var16, this.field2118.method9653(var21));
               var3.method9687(var24, this.field2118.method9653(var21 + 1L));
               var3.method9687(var24 + Class9186.method34386(this.field2120), this.field2118.method9653(var21 + 2L));
               var3.method9687(var24 + 2L * Class9186.method34386(this.field2120), this.field2118.method9653(var21 + 3L));
            }

            Class9186.method34384(this.field2120).method33649(var3, 0L);
            Class9186.method34384(this.field2120).method33649(var3, Class9186.method34386(this.field2120));
            Class9186.method34384(this.field2120).method33649(var3, 2L * Class9186.method34386(this.field2120));
            Class9186.method34384(this.field2120).method33649(var3, 3L * Class9186.method34386(this.field2120));

            for (long var17 = 0L; var17 < Class9186.method34386(this.field2120); var17++) {
               long var22 = var17 * Class9186.method34385(this.field2120) + var14;
               long var25 = Class9186.method34386(this.field2120) + var17;
               this.field2118.method9687(var22, var3.method9653(var17));
               this.field2118.method9687(var22 + 1L, var3.method9653(var25));
               this.field2118.method9687(var22 + 2L, var3.method9653(var25 + Class9186.method34386(this.field2120)));
               this.field2118.method9687(var22 + 3L, var3.method9653(var25 + 2L * Class9186.method34386(this.field2120)));
            }
         }
      }
   }
}
