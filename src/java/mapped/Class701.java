package mapped;

public class Class701 implements Runnable {
   private static String[] field3582;
   public final long field3583;
   public final int field3584;
   public final long field3585;
   public final int field3586;
   public final Class2381 field3587;
   public final boolean field3588;
   public final Class8832 field3589;

   public Class701(Class8832 var1, long var2, int var4, long var5, int var7, Class2381 var8, boolean var9) {
      this.field3589 = var1;
      this.field3583 = var2;
      this.field3584 = var4;
      this.field3585 = var5;
      this.field3586 = var7;
      this.field3587 = var8;
      this.field3588 = var9;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(this.field3583);
      if (this.field3584 != -1) {
         for (long var4 = this.field3585; var4 < Class8832.method31965(this.field3589); var4 += (long)this.field3586) {
            long var6 = var4 * (long)Class8832.method31955(this.field3589);

            for (long var8 = 0L; var8 < Class8832.method31963(this.field3589); var8++) {
               Class8832.method31958(this.field3589).method33653(this.field3587, var6 + var8 * (long)Class8832.method31957(this.field3589), this.field3588);
            }

            if (Class8832.method31964(this.field3589) <= 2L) {
               if (Class8832.method31964(this.field3589) == 2L) {
                  for (long var19 = 0L; var19 < Class8832.method31963(this.field3589); var19++) {
                     long var29 = var6 + var19 * (long)Class8832.method31957(this.field3589);
                     var3.method9687(var19, this.field3587.method9653(var29));
                     var3.method9687(Class8832.method31963(this.field3589) + var19, this.field3587.method9653(var29 + 1L));
                  }

                  Class8832.method31960(this.field3589).method33653(var3, 0L, this.field3588);
                  Class8832.method31960(this.field3589).method33653(var3, Class8832.method31963(this.field3589), this.field3588);

                  for (long var20 = 0L; var20 < Class8832.method31963(this.field3589); var20++) {
                     long var30 = var6 + var20 * (long)Class8832.method31957(this.field3589);
                     this.field3587.method9687(var30, var3.method9653(var20));
                     this.field3587.method9687(var30 + 1L, var3.method9653(Class8832.method31963(this.field3589) + var20));
                  }
               }
            } else {
               for (long var18 = 0L; var18 < Class8832.method31964(this.field3589); var18 += 4L) {
                  for (long var10 = 0L; var10 < Class8832.method31963(this.field3589); var10++) {
                     long var12 = var6 + var10 * (long)Class8832.method31957(this.field3589) + var18;
                     long var14 = Class8832.method31963(this.field3589) + var10;
                     var3.method9687(var10, this.field3587.method9653(var12));
                     var3.method9687(var14, this.field3587.method9653(var12 + 1L));
                     var3.method9687(var14 + Class8832.method31963(this.field3589), this.field3587.method9653(var12 + 2L));
                     var3.method9687(var14 + 2L * Class8832.method31963(this.field3589), this.field3587.method9653(var12 + 3L));
                  }

                  Class8832.method31960(this.field3589).method33653(var3, 0L, this.field3588);
                  Class8832.method31960(this.field3589).method33653(var3, Class8832.method31963(this.field3589), this.field3588);
                  Class8832.method31960(this.field3589).method33653(var3, 2L * Class8832.method31963(this.field3589), this.field3588);
                  Class8832.method31960(this.field3589).method33653(var3, 3L * Class8832.method31963(this.field3589), this.field3588);

                  for (long var25 = 0L; var25 < Class8832.method31963(this.field3589); var25++) {
                     long var28 = var6 + var25 * (long)Class8832.method31957(this.field3589) + var18;
                     long var35 = Class8832.method31963(this.field3589) + var25;
                     this.field3587.method9687(var28, var3.method9653(var25));
                     this.field3587.method9687(var28 + 1L, var3.method9653(var35));
                     this.field3587.method9687(var28 + 2L, var3.method9653(var35 + Class8832.method31963(this.field3589)));
                     this.field3587.method9687(var28 + 3L, var3.method9653(var35 + 2L * Class8832.method31963(this.field3589)));
                  }
               }
            }
         }
      } else {
         for (long var16 = this.field3585; var16 < Class8832.method31965(this.field3589); var16 += (long)this.field3586) {
            long var17 = var16 * (long)Class8832.method31955(this.field3589);

            for (long var21 = 0L; var21 < Class8832.method31963(this.field3589); var21++) {
               Class8832.method31958(this.field3589).method33649(this.field3587, var17 + var21 * (long)Class8832.method31957(this.field3589));
            }

            if (Class8832.method31964(this.field3589) <= 2L) {
               if (Class8832.method31964(this.field3589) == 2L) {
                  for (long var23 = 0L; var23 < Class8832.method31963(this.field3589); var23++) {
                     long var33 = var17 + var23 * (long)Class8832.method31957(this.field3589);
                     var3.method9687(var23, this.field3587.method9653(var33));
                     var3.method9687(Class8832.method31963(this.field3589) + var23, this.field3587.method9653(var33 + 1L));
                  }

                  Class8832.method31960(this.field3589).method33649(var3, 0L);
                  Class8832.method31960(this.field3589).method33649(var3, Class8832.method31963(this.field3589));

                  for (long var24 = 0L; var24 < Class8832.method31963(this.field3589); var24++) {
                     long var34 = var17 + var24 * (long)Class8832.method31957(this.field3589);
                     this.field3587.method9687(var34, var3.method9653(var24));
                     this.field3587.method9687(var34 + 1L, var3.method9653(Class8832.method31963(this.field3589) + var24));
                  }
               }
            } else {
               for (long var22 = 0L; var22 < Class8832.method31964(this.field3589); var22 += 4L) {
                  for (long var26 = 0L; var26 < Class8832.method31963(this.field3589); var26++) {
                     long var31 = var17 + var26 * (long)Class8832.method31957(this.field3589) + var22;
                     long var36 = Class8832.method31963(this.field3589) + var26;
                     var3.method9687(var26, this.field3587.method9653(var31));
                     var3.method9687(var36, this.field3587.method9653(var31 + 1L));
                     var3.method9687(var36 + Class8832.method31963(this.field3589), this.field3587.method9653(var31 + 2L));
                     var3.method9687(var36 + 2L * Class8832.method31963(this.field3589), this.field3587.method9653(var31 + 3L));
                  }

                  Class8832.method31960(this.field3589).method33649(var3, 0L);
                  Class8832.method31960(this.field3589).method33649(var3, Class8832.method31963(this.field3589));
                  Class8832.method31960(this.field3589).method33649(var3, 2L * Class8832.method31963(this.field3589));
                  Class8832.method31960(this.field3589).method33649(var3, 3L * Class8832.method31963(this.field3589));

                  for (long var27 = 0L; var27 < Class8832.method31963(this.field3589); var27++) {
                     long var32 = var17 + var27 * (long)Class8832.method31957(this.field3589) + var22;
                     long var37 = Class8832.method31963(this.field3589) + var27;
                     this.field3587.method9687(var32, var3.method9653(var27));
                     this.field3587.method9687(var32 + 1L, var3.method9653(var37));
                     this.field3587.method9687(var32 + 2L, var3.method9653(var37 + Class8832.method31963(this.field3589)));
                     this.field3587.method9687(var32 + 3L, var3.method9653(var37 + 2L * Class8832.method31963(this.field3589)));
                  }
               }
            }
         }
      }
   }
}
