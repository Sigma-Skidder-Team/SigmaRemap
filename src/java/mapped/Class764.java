package mapped;

public class Class764 implements Runnable {
   private static String[] field3966;
   public final long field3967;
   public final int field3968;
   public final long field3969;
   public final int field3970;
   public final Class2378 field3971;
   public final boolean field3972;
   public final Class7824 field3973;

   public Class764(Class7824 var1, long var2, int var4, long var5, int var7, Class2378 var8, boolean var9) {
      this.field3973 = var1;
      this.field3967 = var2;
      this.field3968 = var4;
      this.field3969 = var5;
      this.field3970 = var7;
      this.field3971 = var8;
      this.field3972 = var9;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(this.field3967);
      if (this.field3968 != -1) {
         for (long var4 = this.field3969; var4 < Class7824.method26191(this.field3973); var4 += (long)this.field3970) {
            long var6 = var4 * Class7824.method26187(this.field3973);

            for (long var8 = 0L; var8 < Class7824.method26188(this.field3973); var8++) {
               Class7824.method26182(this.field3973).method29634(this.field3971, var6 + var8 * Class7824.method26189(this.field3973), this.field3972);
            }

            if (Class7824.method26190(this.field3973) <= 2L) {
               if (Class7824.method26190(this.field3973) == 2L) {
                  for (long var19 = 0L; var19 < Class7824.method26188(this.field3973); var19++) {
                     long var29 = var6 + var19 * Class7824.method26189(this.field3973);
                     var3.method9685(var19, this.field3971.method9651(var29));
                     var3.method9685(Class7824.method26188(this.field3973) + var19, this.field3971.method9651(var29 + 1L));
                  }

                  Class7824.method26184(this.field3973).method29634(var3, 0L, this.field3972);
                  Class7824.method26184(this.field3973).method29634(var3, Class7824.method26188(this.field3973), this.field3972);

                  for (long var20 = 0L; var20 < Class7824.method26188(this.field3973); var20++) {
                     long var30 = var6 + var20 * Class7824.method26189(this.field3973);
                     this.field3971.method9685(var30, var3.method9651(var20));
                     this.field3971.method9685(var30 + 1L, var3.method9651(Class7824.method26188(this.field3973) + var20));
                  }
               }
            } else {
               for (long var18 = 0L; var18 < Class7824.method26190(this.field3973); var18 += 4L) {
                  for (long var10 = 0L; var10 < Class7824.method26188(this.field3973); var10++) {
                     long var12 = var6 + var10 * Class7824.method26189(this.field3973) + var18;
                     long var14 = Class7824.method26188(this.field3973) + var10;
                     var3.method9685(var10, this.field3971.method9651(var12));
                     var3.method9685(var14, this.field3971.method9651(var12 + 1L));
                     var3.method9685(var14 + Class7824.method26188(this.field3973), this.field3971.method9651(var12 + 2L));
                     var3.method9685(var14 + 2L * Class7824.method26188(this.field3973), this.field3971.method9651(var12 + 3L));
                  }

                  Class7824.method26184(this.field3973).method29634(var3, 0L, this.field3972);
                  Class7824.method26184(this.field3973).method29634(var3, Class7824.method26188(this.field3973), this.field3972);
                  Class7824.method26184(this.field3973).method29634(var3, 2L * Class7824.method26188(this.field3973), this.field3972);
                  Class7824.method26184(this.field3973).method29634(var3, 3L * Class7824.method26188(this.field3973), this.field3972);

                  for (long var25 = 0L; var25 < Class7824.method26188(this.field3973); var25++) {
                     long var28 = var6 + var25 * Class7824.method26189(this.field3973) + var18;
                     long var35 = Class7824.method26188(this.field3973) + var25;
                     this.field3971.method9685(var28, var3.method9651(var25));
                     this.field3971.method9685(var28 + 1L, var3.method9651(var35));
                     this.field3971.method9685(var28 + 2L, var3.method9651(var35 + Class7824.method26188(this.field3973)));
                     this.field3971.method9685(var28 + 3L, var3.method9651(var35 + 2L * Class7824.method26188(this.field3973)));
                  }
               }
            }
         }
      } else {
         for (long var16 = this.field3969; var16 < Class7824.method26191(this.field3973); var16 += (long)this.field3970) {
            long var17 = var16 * Class7824.method26187(this.field3973);

            for (long var21 = 0L; var21 < Class7824.method26188(this.field3973); var21++) {
               Class7824.method26182(this.field3973).method29630(this.field3971, var17 + var21 * Class7824.method26189(this.field3973), this.field3972);
            }

            if (Class7824.method26190(this.field3973) <= 2L) {
               if (Class7824.method26190(this.field3973) == 2L) {
                  for (long var23 = 0L; var23 < Class7824.method26188(this.field3973); var23++) {
                     long var33 = var17 + var23 * Class7824.method26189(this.field3973);
                     var3.method9685(var23, this.field3971.method9651(var33));
                     var3.method9685(Class7824.method26188(this.field3973) + var23, this.field3971.method9651(var33 + 1L));
                  }

                  Class7824.method26184(this.field3973).method29630(var3, 0L, this.field3972);
                  Class7824.method26184(this.field3973).method29630(var3, Class7824.method26188(this.field3973), this.field3972);

                  for (long var24 = 0L; var24 < Class7824.method26188(this.field3973); var24++) {
                     long var34 = var17 + var24 * Class7824.method26189(this.field3973);
                     this.field3971.method9685(var34, var3.method9651(var24));
                     this.field3971.method9685(var34 + 1L, var3.method9651(Class7824.method26188(this.field3973) + var24));
                  }
               }
            } else {
               for (long var22 = 0L; var22 < Class7824.method26190(this.field3973); var22 += 4L) {
                  for (long var26 = 0L; var26 < Class7824.method26188(this.field3973); var26++) {
                     long var31 = var17 + var26 * Class7824.method26189(this.field3973) + var22;
                     long var36 = Class7824.method26188(this.field3973) + var26;
                     var3.method9685(var26, this.field3971.method9651(var31));
                     var3.method9685(var36, this.field3971.method9651(var31 + 1L));
                     var3.method9685(var36 + Class7824.method26188(this.field3973), this.field3971.method9651(var31 + 2L));
                     var3.method9685(var36 + 2L * Class7824.method26188(this.field3973), this.field3971.method9651(var31 + 3L));
                  }

                  Class7824.method26184(this.field3973).method29630(var3, 0L, this.field3972);
                  Class7824.method26184(this.field3973).method29630(var3, Class7824.method26188(this.field3973), this.field3972);
                  Class7824.method26184(this.field3973).method29630(var3, 2L * Class7824.method26188(this.field3973), this.field3972);
                  Class7824.method26184(this.field3973).method29630(var3, 3L * Class7824.method26188(this.field3973), this.field3972);

                  for (long var27 = 0L; var27 < Class7824.method26188(this.field3973); var27++) {
                     long var32 = var17 + var27 * Class7824.method26189(this.field3973) + var22;
                     long var37 = Class7824.method26188(this.field3973) + var27;
                     this.field3971.method9685(var32, var3.method9651(var27));
                     this.field3971.method9685(var32 + 1L, var3.method9651(var37));
                     this.field3971.method9685(var32 + 2L, var3.method9651(var37 + Class7824.method26188(this.field3973)));
                     this.field3971.method9685(var32 + 3L, var3.method9651(var37 + 2L * Class7824.method26188(this.field3973)));
                  }
               }
            }
         }
      }
   }
}
