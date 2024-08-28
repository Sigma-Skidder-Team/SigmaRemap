package mapped;

public class Class772 implements Runnable {
   private static String[] field4023;
   public final long field4024;
   public final int field4025;
   public final long field4026;
   public final int field4027;
   public final Class2378 field4028;
   public final boolean field4029;
   public final Class7824 field4030;

   public Class772(Class7824 var1, long var2, int var4, long var5, int var7, Class2378 var8, boolean var9) {
      this.field4030 = var1;
      this.field4024 = var2;
      this.field4025 = var4;
      this.field4026 = var5;
      this.field4027 = var7;
      this.field4028 = var8;
      this.field4029 = var9;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(this.field4024);
      if (this.field4025 != -1) {
         if (Class7824.method26190(this.field4030) <= 2L) {
            if (Class7824.method26190(this.field4030) == 2L) {
               for (long var4 = this.field4026; var4 < Class7824.method26188(this.field4030); var4 += (long)this.field4027) {
                  long var6 = var4 * Class7824.method26189(this.field4030);

                  for (long var8 = 0L; var8 < Class7824.method26191(this.field4030); var8++) {
                     long var12 = var8 * Class7824.method26187(this.field4030) + var6;
                     var3.method9685(var8, this.field4028.method9651(var12));
                     var3.method9685(Class7824.method26191(this.field4030) + var8, this.field4028.method9651(var12 + 1L));
                  }

                  Class7824.method26186(this.field4030).method29634(var3, 0L, this.field4029);
                  Class7824.method26186(this.field4030).method29634(var3, Class7824.method26191(this.field4030), this.field4029);

                  for (long var22 = 0L; var22 < Class7824.method26191(this.field4030); var22++) {
                     long var30 = var22 * Class7824.method26187(this.field4030) + var6;
                     this.field4028.method9685(var30, var3.method9651(var22));
                     this.field4028.method9685(var30 + 1L, var3.method9651(Class7824.method26191(this.field4030) + var22));
                  }
               }
            }
         } else {
            for (long var16 = this.field4026; var16 < Class7824.method26188(this.field4030); var16 += (long)this.field4027) {
               long var19 = var16 * Class7824.method26189(this.field4030);

               for (long var23 = 0L; var23 < Class7824.method26190(this.field4030); var23 += 4L) {
                  for (long var10 = 0L; var10 < Class7824.method26191(this.field4030); var10++) {
                     long var31 = var10 * Class7824.method26187(this.field4030) + var19 + var23;
                     long var14 = Class7824.method26191(this.field4030) + var10;
                     var3.method9685(var10, this.field4028.method9651(var31));
                     var3.method9685(var14, this.field4028.method9651(var31 + 1L));
                     var3.method9685(var14 + Class7824.method26191(this.field4030), this.field4028.method9651(var31 + 2L));
                     var3.method9685(var14 + 2L * Class7824.method26191(this.field4030), this.field4028.method9651(var31 + 3L));
                  }

                  Class7824.method26186(this.field4030).method29634(var3, 0L, this.field4029);
                  Class7824.method26186(this.field4030).method29634(var3, Class7824.method26191(this.field4030), this.field4029);
                  Class7824.method26186(this.field4030).method29634(var3, 2L * Class7824.method26191(this.field4030), this.field4029);
                  Class7824.method26186(this.field4030).method29634(var3, 3L * Class7824.method26191(this.field4030), this.field4029);

                  for (long var27 = 0L; var27 < Class7824.method26191(this.field4030); var27++) {
                     long var32 = var27 * Class7824.method26187(this.field4030) + var19 + var23;
                     long var37 = Class7824.method26191(this.field4030) + var27;
                     this.field4028.method9685(var32, var3.method9651(var27));
                     this.field4028.method9685(var32 + 1L, var3.method9651(var37));
                     this.field4028.method9685(var32 + 2L, var3.method9651(var37 + Class7824.method26191(this.field4030)));
                     this.field4028.method9685(var32 + 3L, var3.method9651(var37 + 2L * Class7824.method26191(this.field4030)));
                  }
               }
            }
         }
      } else if (Class7824.method26190(this.field4030) <= 2L) {
         if (Class7824.method26190(this.field4030) == 2L) {
            for (long var17 = this.field4026; var17 < Class7824.method26188(this.field4030); var17 += (long)this.field4027) {
               long var20 = var17 * Class7824.method26189(this.field4030);

               for (long var24 = 0L; var24 < Class7824.method26191(this.field4030); var24++) {
                  long var33 = var24 * Class7824.method26187(this.field4030) + var20;
                  var3.method9685(var24, this.field4028.method9651(var33));
                  var3.method9685(Class7824.method26191(this.field4030) + var24, this.field4028.method9651(var33 + 1L));
               }

               Class7824.method26186(this.field4030).method29630(var3, 0L, this.field4029);
               Class7824.method26186(this.field4030).method29630(var3, Class7824.method26191(this.field4030), this.field4029);

               for (long var25 = 0L; var25 < Class7824.method26191(this.field4030); var25++) {
                  long var34 = var25 * Class7824.method26187(this.field4030) + var20;
                  this.field4028.method9685(var34, var3.method9651(var25));
                  this.field4028.method9685(var34 + 1L, var3.method9651(Class7824.method26191(this.field4030) + var25));
               }
            }
         }
      } else {
         for (long var18 = this.field4026; var18 < Class7824.method26188(this.field4030); var18 += (long)this.field4027) {
            long var21 = var18 * Class7824.method26189(this.field4030);

            for (long var26 = 0L; var26 < Class7824.method26190(this.field4030); var26 += 4L) {
               for (long var28 = 0L; var28 < Class7824.method26191(this.field4030); var28++) {
                  long var35 = var28 * Class7824.method26187(this.field4030) + var21 + var26;
                  long var38 = Class7824.method26191(this.field4030) + var28;
                  var3.method9685(var28, this.field4028.method9651(var35));
                  var3.method9685(var38, this.field4028.method9651(var35 + 1L));
                  var3.method9685(var38 + Class7824.method26191(this.field4030), this.field4028.method9651(var35 + 2L));
                  var3.method9685(var38 + 2L * Class7824.method26191(this.field4030), this.field4028.method9651(var35 + 3L));
               }

               Class7824.method26186(this.field4030).method29630(var3, 0L, this.field4029);
               Class7824.method26186(this.field4030).method29630(var3, Class7824.method26191(this.field4030), this.field4029);
               Class7824.method26186(this.field4030).method29630(var3, 2L * Class7824.method26191(this.field4030), this.field4029);
               Class7824.method26186(this.field4030).method29630(var3, 3L * Class7824.method26191(this.field4030), this.field4029);

               for (long var29 = 0L; var29 < Class7824.method26191(this.field4030); var29++) {
                  long var36 = var29 * Class7824.method26187(this.field4030) + var21 + var26;
                  long var39 = Class7824.method26191(this.field4030) + var29;
                  this.field4028.method9685(var36, var3.method9651(var29));
                  this.field4028.method9685(var36 + 1L, var3.method9651(var39));
                  this.field4028.method9685(var36 + 2L, var3.method9651(var39 + Class7824.method26191(this.field4030)));
                  this.field4028.method9685(var36 + 3L, var3.method9651(var39 + 2L * Class7824.method26191(this.field4030)));
               }
            }
         }
      }
   }
}
