package mapped;

public class Class716 implements Runnable {
   private static String[] field3677;
   public final long field3678;
   public final int field3679;
   public final long field3680;
   public final int field3681;
   public final Class2378 field3682;
   public final boolean field3683;
   public final Class8162 field3684;

   public Class716(Class8162 var1, long var2, int var4, long var5, int var7, Class2378 var8, boolean var9) {
      this.field3684 = var1;
      this.field3678 = var2;
      this.field3679 = var4;
      this.field3680 = var5;
      this.field3681 = var7;
      this.field3682 = var8;
      this.field3683 = var9;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(this.field3678);
      if (this.field3679 != -1) {
         for (long var4 = this.field3680; var4 < Class8162.method28402(this.field3684); var4 += (long)this.field3681) {
            long var6 = var4 * (long)Class8162.method28392(this.field3684);

            for (long var8 = 0L; var8 < Class8162.method28400(this.field3684); var8++) {
               Class8162.method28395(this.field3684).method28462(this.field3682, var6 + var8 * (long)Class8162.method28394(this.field3684), this.field3683);
            }

            if (Class8162.method28401(this.field3684) <= 2L) {
               if (Class8162.method28401(this.field3684) == 2L) {
                  for (long var19 = 0L; var19 < Class8162.method28400(this.field3684); var19++) {
                     long var29 = var6 + var19 * (long)Class8162.method28394(this.field3684);
                     var3.method9685(var19, this.field3682.method9651(var29));
                     var3.method9685(Class8162.method28400(this.field3684) + var19, this.field3682.method9651(var29 + 1L));
                  }

                  Class8162.method28397(this.field3684).method28462(var3, 0L, this.field3683);
                  Class8162.method28397(this.field3684).method28462(var3, Class8162.method28400(this.field3684), this.field3683);

                  for (long var20 = 0L; var20 < Class8162.method28400(this.field3684); var20++) {
                     long var30 = var6 + var20 * (long)Class8162.method28394(this.field3684);
                     this.field3682.method9685(var30, var3.method9651(var20));
                     this.field3682.method9685(var30 + 1L, var3.method9651(Class8162.method28400(this.field3684) + var20));
                  }
               }
            } else {
               for (long var18 = 0L; var18 < Class8162.method28401(this.field3684); var18 += 4L) {
                  for (long var10 = 0L; var10 < Class8162.method28400(this.field3684); var10++) {
                     long var12 = var6 + var10 * (long)Class8162.method28394(this.field3684) + var18;
                     long var14 = Class8162.method28400(this.field3684) + var10;
                     var3.method9685(var10, this.field3682.method9651(var12));
                     var3.method9685(var14, this.field3682.method9651(var12 + 1L));
                     var3.method9685(var14 + Class8162.method28400(this.field3684), this.field3682.method9651(var12 + 2L));
                     var3.method9685(var14 + 2L * Class8162.method28400(this.field3684), this.field3682.method9651(var12 + 3L));
                  }

                  Class8162.method28397(this.field3684).method28462(var3, 0L, this.field3683);
                  Class8162.method28397(this.field3684).method28462(var3, Class8162.method28400(this.field3684), this.field3683);
                  Class8162.method28397(this.field3684).method28462(var3, 2L * Class8162.method28400(this.field3684), this.field3683);
                  Class8162.method28397(this.field3684).method28462(var3, 3L * Class8162.method28400(this.field3684), this.field3683);

                  for (long var25 = 0L; var25 < Class8162.method28400(this.field3684); var25++) {
                     long var28 = var6 + var25 * (long)Class8162.method28394(this.field3684) + var18;
                     long var35 = Class8162.method28400(this.field3684) + var25;
                     this.field3682.method9685(var28, var3.method9651(var25));
                     this.field3682.method9685(var28 + 1L, var3.method9651(var35));
                     this.field3682.method9685(var28 + 2L, var3.method9651(var35 + Class8162.method28400(this.field3684)));
                     this.field3682.method9685(var28 + 3L, var3.method9651(var35 + 2L * Class8162.method28400(this.field3684)));
                  }
               }
            }
         }
      } else {
         for (long var16 = this.field3680; var16 < Class8162.method28402(this.field3684); var16 += (long)this.field3681) {
            long var17 = var16 * (long)Class8162.method28392(this.field3684);

            for (long var21 = 0L; var21 < Class8162.method28400(this.field3684); var21++) {
               Class8162.method28395(this.field3684).method28458(this.field3682, var17 + var21 * (long)Class8162.method28394(this.field3684));
            }

            if (Class8162.method28401(this.field3684) <= 2L) {
               if (Class8162.method28401(this.field3684) == 2L) {
                  for (long var23 = 0L; var23 < Class8162.method28400(this.field3684); var23++) {
                     long var33 = var17 + var23 * (long)Class8162.method28394(this.field3684);
                     var3.method9685(var23, this.field3682.method9651(var33));
                     var3.method9685(Class8162.method28400(this.field3684) + var23, this.field3682.method9651(var33 + 1L));
                  }

                  Class8162.method28397(this.field3684).method28458(var3, 0L);
                  Class8162.method28397(this.field3684).method28458(var3, Class8162.method28400(this.field3684));

                  for (long var24 = 0L; var24 < Class8162.method28400(this.field3684); var24++) {
                     long var34 = var17 + var24 * (long)Class8162.method28394(this.field3684);
                     this.field3682.method9685(var34, var3.method9651(var24));
                     this.field3682.method9685(var34 + 1L, var3.method9651(Class8162.method28400(this.field3684) + var24));
                  }
               }
            } else {
               for (long var22 = 0L; var22 < Class8162.method28401(this.field3684); var22 += 4L) {
                  for (long var26 = 0L; var26 < Class8162.method28400(this.field3684); var26++) {
                     long var31 = var17 + var26 * (long)Class8162.method28394(this.field3684) + var22;
                     long var36 = Class8162.method28400(this.field3684) + var26;
                     var3.method9685(var26, this.field3682.method9651(var31));
                     var3.method9685(var36, this.field3682.method9651(var31 + 1L));
                     var3.method9685(var36 + Class8162.method28400(this.field3684), this.field3682.method9651(var31 + 2L));
                     var3.method9685(var36 + 2L * Class8162.method28400(this.field3684), this.field3682.method9651(var31 + 3L));
                  }

                  Class8162.method28397(this.field3684).method28458(var3, 0L);
                  Class8162.method28397(this.field3684).method28458(var3, Class8162.method28400(this.field3684));
                  Class8162.method28397(this.field3684).method28458(var3, 2L * Class8162.method28400(this.field3684));
                  Class8162.method28397(this.field3684).method28458(var3, 3L * Class8162.method28400(this.field3684));

                  for (long var27 = 0L; var27 < Class8162.method28400(this.field3684); var27++) {
                     long var32 = var17 + var27 * (long)Class8162.method28394(this.field3684) + var22;
                     long var37 = Class8162.method28400(this.field3684) + var27;
                     this.field3682.method9685(var32, var3.method9651(var27));
                     this.field3682.method9685(var32 + 1L, var3.method9651(var37));
                     this.field3682.method9685(var32 + 2L, var3.method9651(var37 + Class8162.method28400(this.field3684)));
                     this.field3682.method9685(var32 + 3L, var3.method9651(var37 + 2L * Class8162.method28400(this.field3684)));
                  }
               }
            }
         }
      }
   }
}
