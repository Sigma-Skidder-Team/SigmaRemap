package mapped;

public class Class565 implements Runnable {
   private static String[] field2740;
   public final long field2741;
   public final int field2742;
   public final long field2743;
   public final int field2744;
   public final Class2378 field2745;
   public final boolean field2746;
   public final Class7941 field2747;

   public Class565(Class7941 var1, long var2, int var4, long var5, int var7, Class2378 var8, boolean var9) {
      this.field2747 = var1;
      this.field2741 = var2;
      this.field2742 = var4;
      this.field2743 = var5;
      this.field2744 = var7;
      this.field2745 = var8;
      this.field2746 = var9;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(this.field2741);
      if (this.field2742 != -1) {
         for (long var4 = this.field2743; var4 < Class7941.method26775(this.field2747); var4 += (long)this.field2744) {
            long var6 = var4 * Class7941.method26771(this.field2747);

            for (long var8 = 0L; var8 < Class7941.method26772(this.field2747); var8++) {
               Class7941.method26766(this.field2747).method28931(this.field2745, var6 + var8 * Class7941.method26773(this.field2747), this.field2746);
            }

            if (Class7941.method26774(this.field2747) <= 2L) {
               if (Class7941.method26774(this.field2747) == 2L) {
                  for (long var19 = 0L; var19 < Class7941.method26772(this.field2747); var19++) {
                     long var29 = var6 + var19 * Class7941.method26773(this.field2747);
                     var3.method9685(var19, this.field2745.method9651(var29));
                     var3.method9685(Class7941.method26772(this.field2747) + var19, this.field2745.method9651(var29 + 1L));
                  }

                  Class7941.method26768(this.field2747).method28931(var3, 0L, this.field2746);
                  Class7941.method26768(this.field2747).method28931(var3, Class7941.method26772(this.field2747), this.field2746);

                  for (long var20 = 0L; var20 < Class7941.method26772(this.field2747); var20++) {
                     long var30 = var6 + var20 * Class7941.method26773(this.field2747);
                     this.field2745.method9685(var30, var3.method9651(var20));
                     this.field2745.method9685(var30 + 1L, var3.method9651(Class7941.method26772(this.field2747) + var20));
                  }
               }
            } else {
               for (long var18 = 0L; var18 < Class7941.method26774(this.field2747); var18 += 4L) {
                  for (long var10 = 0L; var10 < Class7941.method26772(this.field2747); var10++) {
                     long var12 = var6 + var10 * Class7941.method26773(this.field2747) + var18;
                     long var14 = Class7941.method26772(this.field2747) + var10;
                     var3.method9685(var10, this.field2745.method9651(var12));
                     var3.method9685(var14, this.field2745.method9651(var12 + 1L));
                     var3.method9685(var14 + Class7941.method26772(this.field2747), this.field2745.method9651(var12 + 2L));
                     var3.method9685(var14 + 2L * Class7941.method26772(this.field2747), this.field2745.method9651(var12 + 3L));
                  }

                  Class7941.method26768(this.field2747).method28931(var3, 0L, this.field2746);
                  Class7941.method26768(this.field2747).method28931(var3, Class7941.method26772(this.field2747), this.field2746);
                  Class7941.method26768(this.field2747).method28931(var3, 2L * Class7941.method26772(this.field2747), this.field2746);
                  Class7941.method26768(this.field2747).method28931(var3, 3L * Class7941.method26772(this.field2747), this.field2746);

                  for (long var25 = 0L; var25 < Class7941.method26772(this.field2747); var25++) {
                     long var28 = var6 + var25 * Class7941.method26773(this.field2747) + var18;
                     long var35 = Class7941.method26772(this.field2747) + var25;
                     this.field2745.method9685(var28, var3.method9651(var25));
                     this.field2745.method9685(var28 + 1L, var3.method9651(var35));
                     this.field2745.method9685(var28 + 2L, var3.method9651(var35 + Class7941.method26772(this.field2747)));
                     this.field2745.method9685(var28 + 3L, var3.method9651(var35 + 2L * Class7941.method26772(this.field2747)));
                  }
               }
            }
         }
      } else {
         for (long var16 = this.field2743; var16 < Class7941.method26775(this.field2747); var16 += (long)this.field2744) {
            long var17 = var16 * Class7941.method26771(this.field2747);

            for (long var21 = 0L; var21 < Class7941.method26772(this.field2747); var21++) {
               Class7941.method26766(this.field2747).method28927(this.field2745, var17 + var21 * Class7941.method26773(this.field2747), this.field2746);
            }

            if (Class7941.method26774(this.field2747) <= 2L) {
               if (Class7941.method26774(this.field2747) == 2L) {
                  for (long var23 = 0L; var23 < Class7941.method26772(this.field2747); var23++) {
                     long var33 = var17 + var23 * Class7941.method26773(this.field2747);
                     var3.method9685(var23, this.field2745.method9651(var33));
                     var3.method9685(Class7941.method26772(this.field2747) + var23, this.field2745.method9651(var33 + 1L));
                  }

                  Class7941.method26768(this.field2747).method28927(var3, 0L, this.field2746);
                  Class7941.method26768(this.field2747).method28927(var3, Class7941.method26772(this.field2747), this.field2746);

                  for (long var24 = 0L; var24 < Class7941.method26772(this.field2747); var24++) {
                     long var34 = var17 + var24 * Class7941.method26773(this.field2747);
                     this.field2745.method9685(var34, var3.method9651(var24));
                     this.field2745.method9685(var34 + 1L, var3.method9651(Class7941.method26772(this.field2747) + var24));
                  }
               }
            } else {
               for (long var22 = 0L; var22 < Class7941.method26774(this.field2747); var22 += 4L) {
                  for (long var26 = 0L; var26 < Class7941.method26772(this.field2747); var26++) {
                     long var31 = var17 + var26 * Class7941.method26773(this.field2747) + var22;
                     long var36 = Class7941.method26772(this.field2747) + var26;
                     var3.method9685(var26, this.field2745.method9651(var31));
                     var3.method9685(var36, this.field2745.method9651(var31 + 1L));
                     var3.method9685(var36 + Class7941.method26772(this.field2747), this.field2745.method9651(var31 + 2L));
                     var3.method9685(var36 + 2L * Class7941.method26772(this.field2747), this.field2745.method9651(var31 + 3L));
                  }

                  Class7941.method26768(this.field2747).method28927(var3, 0L, this.field2746);
                  Class7941.method26768(this.field2747).method28927(var3, Class7941.method26772(this.field2747), this.field2746);
                  Class7941.method26768(this.field2747).method28927(var3, 2L * Class7941.method26772(this.field2747), this.field2746);
                  Class7941.method26768(this.field2747).method28927(var3, 3L * Class7941.method26772(this.field2747), this.field2746);

                  for (long var27 = 0L; var27 < Class7941.method26772(this.field2747); var27++) {
                     long var32 = var17 + var27 * Class7941.method26773(this.field2747) + var22;
                     long var37 = Class7941.method26772(this.field2747) + var27;
                     this.field2745.method9685(var32, var3.method9651(var27));
                     this.field2745.method9685(var32 + 1L, var3.method9651(var37));
                     this.field2745.method9685(var32 + 2L, var3.method9651(var37 + Class7941.method26772(this.field2747)));
                     this.field2745.method9685(var32 + 3L, var3.method9651(var37 + 2L * Class7941.method26772(this.field2747)));
                  }
               }
            }
         }
      }
   }
}
