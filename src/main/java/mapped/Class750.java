package mapped;

public class Class750 implements Runnable {
   private static String[] field3887;
   public final long field3888;
   public final int field3889;
   public final long field3890;
   public final int field3891;
   public final Class2378 field3892;
   public final boolean field3893;
   public final Class8162 field3894;

   public Class750(Class8162 var1, long var2, int var4, long var5, int var7, Class2378 var8, boolean var9) {
      this.field3894 = var1;
      this.field3888 = var2;
      this.field3889 = var4;
      this.field3890 = var5;
      this.field3891 = var7;
      this.field3892 = var8;
      this.field3893 = var9;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(this.field3888);
      if (this.field3889 != -1) {
         if (Class8162.method28401(this.field3894) <= 2L) {
            if (Class8162.method28401(this.field3894) == 2L) {
               for (long var4 = this.field3890; var4 < Class8162.method28400(this.field3894); var4 += (long)this.field3891) {
                  long var6 = var4 * Class8162.method28404(this.field3894);

                  for (long var8 = 0L; var8 < Class8162.method28402(this.field3894); var8++) {
                     long var12 = var8 * Class8162.method28403(this.field3894) + var6;
                     var3.method9685(var8, this.field3892.method9651(var12));
                     var3.method9685(Class8162.method28402(this.field3894) + var8, this.field3892.method9651(var12 + 1L));
                  }

                  Class8162.method28399(this.field3894).method28462(var3, 0L, this.field3893);
                  Class8162.method28399(this.field3894).method28462(var3, Class8162.method28402(this.field3894), this.field3893);

                  for (long var22 = 0L; var22 < Class8162.method28402(this.field3894); var22++) {
                     long var30 = var22 * Class8162.method28403(this.field3894) + var6;
                     this.field3892.method9685(var30, var3.method9651(var22));
                     this.field3892.method9685(var30 + 1L, var3.method9651(Class8162.method28402(this.field3894) + var22));
                  }
               }
            }
         } else {
            for (long var16 = this.field3890; var16 < Class8162.method28400(this.field3894); var16 += (long)this.field3891) {
               long var19 = var16 * Class8162.method28404(this.field3894);

               for (long var23 = 0L; var23 < Class8162.method28401(this.field3894); var23 += 4L) {
                  for (long var10 = 0L; var10 < Class8162.method28402(this.field3894); var10++) {
                     long var31 = var10 * Class8162.method28403(this.field3894) + var19 + var23;
                     long var14 = Class8162.method28402(this.field3894) + var10;
                     var3.method9685(var10, this.field3892.method9651(var31));
                     var3.method9685(var14, this.field3892.method9651(var31 + 1L));
                     var3.method9685(var14 + Class8162.method28402(this.field3894), this.field3892.method9651(var31 + 2L));
                     var3.method9685(var14 + 2L * Class8162.method28402(this.field3894), this.field3892.method9651(var31 + 3L));
                  }

                  Class8162.method28399(this.field3894).method28462(var3, 0L, this.field3893);
                  Class8162.method28399(this.field3894).method28462(var3, Class8162.method28402(this.field3894), this.field3893);
                  Class8162.method28399(this.field3894).method28462(var3, 2L * Class8162.method28402(this.field3894), this.field3893);
                  Class8162.method28399(this.field3894).method28462(var3, 3L * Class8162.method28402(this.field3894), this.field3893);

                  for (long var27 = 0L; var27 < Class8162.method28402(this.field3894); var27++) {
                     long var32 = var27 * Class8162.method28403(this.field3894) + var19 + var23;
                     long var37 = Class8162.method28402(this.field3894) + var27;
                     this.field3892.method9685(var32, var3.method9651(var27));
                     this.field3892.method9685(var32 + 1L, var3.method9651(var37));
                     this.field3892.method9685(var32 + 2L, var3.method9651(var37 + Class8162.method28402(this.field3894)));
                     this.field3892.method9685(var32 + 3L, var3.method9651(var37 + 2L * Class8162.method28402(this.field3894)));
                  }
               }
            }
         }
      } else if (Class8162.method28401(this.field3894) <= 2L) {
         if (Class8162.method28401(this.field3894) == 2L) {
            for (long var17 = this.field3890; var17 < Class8162.method28400(this.field3894); var17 += (long)this.field3891) {
               long var20 = var17 * Class8162.method28404(this.field3894);

               for (long var24 = 0L; var24 < Class8162.method28402(this.field3894); var24++) {
                  long var33 = var24 * Class8162.method28403(this.field3894) + var20;
                  var3.method9685(var24, this.field3892.method9651(var33));
                  var3.method9685(Class8162.method28402(this.field3894) + var24, this.field3892.method9651(var33 + 1L));
               }

               Class8162.method28399(this.field3894).method28458(var3, 0L);
               Class8162.method28399(this.field3894).method28458(var3, Class8162.method28402(this.field3894));

               for (long var25 = 0L; var25 < Class8162.method28402(this.field3894); var25++) {
                  long var34 = var25 * Class8162.method28403(this.field3894) + var20;
                  this.field3892.method9685(var34, var3.method9651(var25));
                  this.field3892.method9685(var34 + 1L, var3.method9651(Class8162.method28402(this.field3894) + var25));
               }
            }
         }
      } else {
         for (long var18 = this.field3890; var18 < Class8162.method28400(this.field3894); var18 += (long)this.field3891) {
            long var21 = var18 * Class8162.method28404(this.field3894);

            for (long var26 = 0L; var26 < Class8162.method28401(this.field3894); var26 += 4L) {
               for (long var28 = 0L; var28 < Class8162.method28402(this.field3894); var28++) {
                  long var35 = var28 * Class8162.method28403(this.field3894) + var21 + var26;
                  long var38 = Class8162.method28402(this.field3894) + var28;
                  var3.method9685(var28, this.field3892.method9651(var35));
                  var3.method9685(var38, this.field3892.method9651(var35 + 1L));
                  var3.method9685(var38 + Class8162.method28402(this.field3894), this.field3892.method9651(var35 + 2L));
                  var3.method9685(var38 + 2L * Class8162.method28402(this.field3894), this.field3892.method9651(var35 + 3L));
               }

               Class8162.method28399(this.field3894).method28458(var3, 0L);
               Class8162.method28399(this.field3894).method28458(var3, Class8162.method28402(this.field3894));
               Class8162.method28399(this.field3894).method28458(var3, 2L * Class8162.method28402(this.field3894));
               Class8162.method28399(this.field3894).method28458(var3, 3L * Class8162.method28402(this.field3894));

               for (long var29 = 0L; var29 < Class8162.method28402(this.field3894); var29++) {
                  long var36 = var29 * Class8162.method28403(this.field3894) + var21 + var26;
                  long var39 = Class8162.method28402(this.field3894) + var29;
                  this.field3892.method9685(var36, var3.method9651(var29));
                  this.field3892.method9685(var36 + 1L, var3.method9651(var39));
                  this.field3892.method9685(var36 + 2L, var3.method9651(var39 + Class8162.method28402(this.field3894)));
                  this.field3892.method9685(var36 + 3L, var3.method9651(var39 + 2L * Class8162.method28402(this.field3894)));
               }
            }
         }
      }
   }
}
