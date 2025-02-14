package mapped;

public class Class480 implements Runnable {
   private static String[] field2244;
   public final long field2245;
   public final int field2246;
   public final long field2247;
   public final long field2248;
   public final Class2378 field2249;
   public final boolean field2250;
   public final Class9533 field2251;

   public Class480(Class9533 var1, long var2, int var4, long var5, long var7, Class2378 var9, boolean var10) {
      this.field2251 = var1;
      this.field2245 = var2;
      this.field2246 = var4;
      this.field2247 = var5;
      this.field2248 = var7;
      this.field2249 = var9;
      this.field2250 = var10;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(this.field2245);
      if (Class9533.method36860(this.field2251) <= 2L) {
         if (Class9533.method36860(this.field2251) == 2L) {
            for (long var4 = 0L; var4 < Class9533.method36861(this.field2251); var4++) {
               long var8 = var4 * Class9533.method36860(this.field2251) + 2L * this.field2247;
               var3.method9685(var4, this.field2249.method9651(var8));
               var3.method9685(var4 + Class9533.method36861(this.field2251), this.field2249.method9651(var8 + 1L));
            }

            if (this.field2246 != -1) {
               Class9533.method36859(this.field2251).method29634(var3, 0L, this.field2250);
               Class9533.method36859(this.field2251).method29634(var3, Class9533.method36861(this.field2251), this.field2250);
            } else {
               Class9533.method36859(this.field2251).method29630(var3, 0L, this.field2250);
               Class9533.method36859(this.field2251).method29630(var3, Class9533.method36861(this.field2251), this.field2250);
            }

            for (long var12 = 0L; var12 < Class9533.method36861(this.field2251); var12++) {
               long var18 = var12 * Class9533.method36860(this.field2251) + 2L * this.field2247;
               this.field2249.method9685(var18, var3.method9651(var12));
               this.field2249.method9685(var18 + 1L, var3.method9651(var12 + Class9533.method36861(this.field2251)));
            }
         }
      } else if (this.field2246 != -1) {
         for (long var13 = 4L * this.field2247; var13 < Class9533.method36860(this.field2251); var13 += 4L * this.field2248) {
            for (long var6 = 0L; var6 < Class9533.method36861(this.field2251); var6++) {
               long var19 = var6 * Class9533.method36860(this.field2251) + var13;
               long var10 = Class9533.method36861(this.field2251) + var6;
               var3.method9685(var6, this.field2249.method9651(var19));
               var3.method9685(var10, this.field2249.method9651(var19 + 1L));
               var3.method9685(var10 + Class9533.method36861(this.field2251), this.field2249.method9651(var19 + 2L));
               var3.method9685(var10 + 2L * Class9533.method36861(this.field2251), this.field2249.method9651(var19 + 3L));
            }

            Class9533.method36859(this.field2251).method29632(var3, this.field2250);
            Class9533.method36859(this.field2251).method29634(var3, Class9533.method36861(this.field2251), this.field2250);
            Class9533.method36859(this.field2251).method29634(var3, 2L * Class9533.method36861(this.field2251), this.field2250);
            Class9533.method36859(this.field2251).method29634(var3, 3L * Class9533.method36861(this.field2251), this.field2250);

            for (long var15 = 0L; var15 < Class9533.method36861(this.field2251); var15++) {
               long var20 = var15 * Class9533.method36860(this.field2251) + var13;
               long var23 = Class9533.method36861(this.field2251) + var15;
               this.field2249.method9685(var20, var3.method9651(var15));
               this.field2249.method9685(var20 + 1L, var3.method9651(var23));
               this.field2249.method9685(var20 + 2L, var3.method9651(var23 + Class9533.method36861(this.field2251)));
               this.field2249.method9685(var20 + 3L, var3.method9651(var23 + 2L * Class9533.method36861(this.field2251)));
            }
         }
      } else {
         for (long var14 = 4L * this.field2247; var14 < Class9533.method36860(this.field2251); var14 += 4L * this.field2248) {
            for (long var16 = 0L; var16 < Class9533.method36861(this.field2251); var16++) {
               long var21 = var16 * Class9533.method36860(this.field2251) + var14;
               long var24 = Class9533.method36861(this.field2251) + var16;
               var3.method9685(var16, this.field2249.method9651(var21));
               var3.method9685(var24, this.field2249.method9651(var21 + 1L));
               var3.method9685(var24 + Class9533.method36861(this.field2251), this.field2249.method9651(var21 + 2L));
               var3.method9685(var24 + 2L * Class9533.method36861(this.field2251), this.field2249.method9651(var21 + 3L));
            }

            Class9533.method36859(this.field2251).method29630(var3, 0L, this.field2250);
            Class9533.method36859(this.field2251).method29630(var3, Class9533.method36861(this.field2251), this.field2250);
            Class9533.method36859(this.field2251).method29630(var3, 2L * Class9533.method36861(this.field2251), this.field2250);
            Class9533.method36859(this.field2251).method29630(var3, 3L * Class9533.method36861(this.field2251), this.field2250);

            for (long var17 = 0L; var17 < Class9533.method36861(this.field2251); var17++) {
               long var22 = var17 * Class9533.method36860(this.field2251) + var14;
               long var25 = Class9533.method36861(this.field2251) + var17;
               this.field2249.method9685(var22, var3.method9651(var17));
               this.field2249.method9685(var22 + 1L, var3.method9651(var25));
               this.field2249.method9685(var22 + 2L, var3.method9651(var25 + Class9533.method36861(this.field2251)));
               this.field2249.method9685(var22 + 3L, var3.method9651(var25 + 2L * Class9533.method36861(this.field2251)));
            }
         }
      }
   }
}
