package mapped;

public class Class780 implements Runnable {
   private static String[] field4072;
   public final long field4073;
   public final int field4074;
   public final long field4075;
   public final int field4076;
   public final long field4077;
   public final Class2381 field4078;
   public final boolean field4079;
   public final Class7274 field4080;

   public Class780(Class7274 var1, long var2, int var4, long var5, int var7, long var8, Class2381 var10, boolean var11) {
      this.field4080 = var1;
      this.field4073 = var2;
      this.field4074 = var4;
      this.field4075 = var5;
      this.field4076 = var7;
      this.field4077 = var8;
      this.field4078 = var10;
      this.field4079 = var11;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(this.field4073);
      if (this.field4074 != -1) {
         for (long var4 = this.field4075; var4 < Class7274.method22906(this.field4080); var4 += (long)this.field4076) {
            long var6 = var4 * Class7274.method22902(this.field4080);
            if (this.field4077 == 0L) {
               for (long var8 = 0L; var8 < Class7274.method22903(this.field4080); var8++) {
                  Class7274.method22897(this.field4080).method27169(this.field4078, var6 + var8 * Class7274.method22904(this.field4080), this.field4079);
               }
            }

            if (Class7274.method22905(this.field4080) <= 4L) {
               if (Class7274.method22905(this.field4080) != 4L) {
                  if (Class7274.method22905(this.field4080) == 2L) {
                     for (long var27 = 0L; var27 < Class7274.method22903(this.field4080); var27++) {
                        long var43 = var6 + var27 * Class7274.method22904(this.field4080);
                        long var54 = 2L * var27;
                        var3.method9687(var54, this.field4078.method9653(var43));
                        var3.method9687(var54 + 1L, this.field4078.method9653(var43 + 1L));
                     }

                     Class7274.method22899(this.field4080).method27169(var3, 0L, this.field4079);

                     for (long var28 = 0L; var28 < Class7274.method22903(this.field4080); var28++) {
                        long var44 = var6 + var28 * Class7274.method22904(this.field4080);
                        long var55 = 2L * var28;
                        this.field4078.method9687(var44, var3.method9653(var55));
                        this.field4078.method9687(var44 + 1L, var3.method9653(var55 + 1L));
                     }
                  }
               } else {
                  for (long var25 = 0L; var25 < Class7274.method22903(this.field4080); var25++) {
                     long var41 = var6 + var25 * Class7274.method22904(this.field4080);
                     long var52 = 2L * var25;
                     long var63 = 2L * Class7274.method22903(this.field4080) + 2L * var25;
                     var3.method9687(var52, this.field4078.method9653(var41));
                     var3.method9687(var52 + 1L, this.field4078.method9653(var41 + 1L));
                     var3.method9687(var63, this.field4078.method9653(var41 + 2L));
                     var3.method9687(var63 + 1L, this.field4078.method9653(var41 + 3L));
                  }

                  Class7274.method22899(this.field4080).method27169(var3, 0L, this.field4079);
                  Class7274.method22899(this.field4080).method27169(var3, 2L * Class7274.method22903(this.field4080), this.field4079);

                  for (long var26 = 0L; var26 < Class7274.method22903(this.field4080); var26++) {
                     long var42 = var6 + var26 * Class7274.method22904(this.field4080);
                     long var53 = 2L * var26;
                     long var64 = 2L * Class7274.method22903(this.field4080) + 2L * var26;
                     this.field4078.method9687(var42, var3.method9653(var53));
                     this.field4078.method9687(var42 + 1L, var3.method9653(var53 + 1L));
                     this.field4078.method9687(var42 + 2L, var3.method9653(var64));
                     this.field4078.method9687(var42 + 3L, var3.method9653(var64 + 1L));
                  }
               }
            } else {
               for (long var24 = 0L; var24 < Class7274.method22905(this.field4080); var24 += 8L) {
                  for (long var10 = 0L; var10 < Class7274.method22903(this.field4080); var10++) {
                     long var12 = var6 + var10 * Class7274.method22904(this.field4080) + var24;
                     long var14 = 2L * var10;
                     long var16 = 2L * Class7274.method22903(this.field4080) + 2L * var10;
                     long var18 = var16 + 2L * Class7274.method22903(this.field4080);
                     long var20 = var18 + 2L * Class7274.method22903(this.field4080);
                     var3.method9687(var14, this.field4078.method9653(var12));
                     var3.method9687(var14 + 1L, this.field4078.method9653(var12 + 1L));
                     var3.method9687(var16, this.field4078.method9653(var12 + 2L));
                     var3.method9687(var16 + 1L, this.field4078.method9653(var12 + 3L));
                     var3.method9687(var18, this.field4078.method9653(var12 + 4L));
                     var3.method9687(var18 + 1L, this.field4078.method9653(var12 + 5L));
                     var3.method9687(var20, this.field4078.method9653(var12 + 6L));
                     var3.method9687(var20 + 1L, this.field4078.method9653(var12 + 7L));
                  }

                  Class7274.method22899(this.field4080).method27169(var3, 0L, this.field4079);
                  Class7274.method22899(this.field4080).method27169(var3, 2L * Class7274.method22903(this.field4080), this.field4079);
                  Class7274.method22899(this.field4080).method27169(var3, 4L * Class7274.method22903(this.field4080), this.field4079);
                  Class7274.method22899(this.field4080).method27169(var3, 6L * Class7274.method22903(this.field4080), this.field4079);

                  for (long var37 = 0L; var37 < Class7274.method22903(this.field4080); var37++) {
                     long var40 = var6 + var37 * Class7274.method22904(this.field4080) + var24;
                     long var51 = 2L * var37;
                     long var62 = 2L * Class7274.method22903(this.field4080) + 2L * var37;
                     long var69 = var62 + 2L * Class7274.method22903(this.field4080);
                     long var72 = var69 + 2L * Class7274.method22903(this.field4080);
                     this.field4078.method9687(var40, var3.method9653(var51));
                     this.field4078.method9687(var40 + 1L, var3.method9653(var51 + 1L));
                     this.field4078.method9687(var40 + 2L, var3.method9653(var62));
                     this.field4078.method9687(var40 + 3L, var3.method9653(var62 + 1L));
                     this.field4078.method9687(var40 + 4L, var3.method9653(var69));
                     this.field4078.method9687(var40 + 5L, var3.method9653(var69 + 1L));
                     this.field4078.method9687(var40 + 6L, var3.method9653(var72));
                     this.field4078.method9687(var40 + 7L, var3.method9653(var72 + 1L));
                  }
               }
            }

            if (this.field4077 != 0L) {
               for (long var29 = 0L; var29 < Class7274.method22903(this.field4080); var29++) {
                  Class7274.method22897(this.field4080).method27181(this.field4078, var6 + var29 * Class7274.method22904(this.field4080), this.field4079);
               }
            }
         }
      } else {
         for (long var22 = this.field4075; var22 < Class7274.method22906(this.field4080); var22 += (long)this.field4076) {
            long var23 = var22 * Class7274.method22902(this.field4080);
            if (this.field4077 != 0L) {
               for (long var31 = 0L; var31 < Class7274.method22903(this.field4080); var31++) {
                  Class7274.method22897(this.field4080).method27173(this.field4078, var23 + var31 * Class7274.method22904(this.field4080));
               }
            } else {
               for (long var30 = 0L; var30 < Class7274.method22903(this.field4080); var30++) {
                  Class7274.method22897(this.field4080).method27165(this.field4078, var23 + var30 * Class7274.method22904(this.field4080));
               }
            }

            if (Class7274.method22905(this.field4080) <= 4L) {
               if (Class7274.method22905(this.field4080) != 4L) {
                  if (Class7274.method22905(this.field4080) == 2L) {
                     for (long var35 = 0L; var35 < Class7274.method22903(this.field4080); var35++) {
                        long var49 = var23 + var35 * Class7274.method22904(this.field4080);
                        long var60 = 2L * var35;
                        var3.method9687(var60, this.field4078.method9653(var49));
                        var3.method9687(var60 + 1L, this.field4078.method9653(var49 + 1L));
                     }

                     Class7274.method22899(this.field4080).method27165(var3, 0L);

                     for (long var36 = 0L; var36 < Class7274.method22903(this.field4080); var36++) {
                        long var50 = var23 + var36 * Class7274.method22904(this.field4080);
                        long var61 = 2L * var36;
                        this.field4078.method9687(var50, var3.method9653(var61));
                        this.field4078.method9687(var50 + 1L, var3.method9653(var61 + 1L));
                     }
                  }
               } else {
                  for (long var33 = 0L; var33 < Class7274.method22903(this.field4080); var33++) {
                     long var47 = var23 + var33 * Class7274.method22904(this.field4080);
                     long var58 = 2L * var33;
                     long var67 = 2L * Class7274.method22903(this.field4080) + 2L * var33;
                     var3.method9687(var58, this.field4078.method9653(var47));
                     var3.method9687(var58 + 1L, this.field4078.method9653(var47 + 1L));
                     var3.method9687(var67, this.field4078.method9653(var47 + 2L));
                     var3.method9687(var67 + 1L, this.field4078.method9653(var47 + 3L));
                  }

                  Class7274.method22899(this.field4080).method27165(var3, 0L);
                  Class7274.method22899(this.field4080).method27165(var3, 2L * Class7274.method22903(this.field4080));

                  for (long var34 = 0L; var34 < Class7274.method22903(this.field4080); var34++) {
                     long var48 = var23 + var34 * Class7274.method22904(this.field4080);
                     long var59 = 2L * var34;
                     long var68 = 2L * Class7274.method22903(this.field4080) + 2L * var34;
                     this.field4078.method9687(var48, var3.method9653(var59));
                     this.field4078.method9687(var48 + 1L, var3.method9653(var59 + 1L));
                     this.field4078.method9687(var48 + 2L, var3.method9653(var68));
                     this.field4078.method9687(var48 + 3L, var3.method9653(var68 + 1L));
                  }
               }
            } else {
               for (long var32 = 0L; var32 < Class7274.method22905(this.field4080); var32 += 8L) {
                  for (long var38 = 0L; var38 < Class7274.method22903(this.field4080); var38++) {
                     long var45 = var23 + var38 * Class7274.method22904(this.field4080) + var32;
                     long var56 = 2L * var38;
                     long var65 = 2L * Class7274.method22903(this.field4080) + 2L * var38;
                     long var70 = var65 + 2L * Class7274.method22903(this.field4080);
                     long var73 = var70 + 2L * Class7274.method22903(this.field4080);
                     var3.method9687(var56, this.field4078.method9653(var45));
                     var3.method9687(var56 + 1L, this.field4078.method9653(var45 + 1L));
                     var3.method9687(var65, this.field4078.method9653(var45 + 2L));
                     var3.method9687(var65 + 1L, this.field4078.method9653(var45 + 3L));
                     var3.method9687(var70, this.field4078.method9653(var45 + 4L));
                     var3.method9687(var70 + 1L, this.field4078.method9653(var45 + 5L));
                     var3.method9687(var73, this.field4078.method9653(var45 + 6L));
                     var3.method9687(var73 + 1L, this.field4078.method9653(var45 + 7L));
                  }

                  Class7274.method22899(this.field4080).method27165(var3, 0L);
                  Class7274.method22899(this.field4080).method27165(var3, 2L * Class7274.method22903(this.field4080));
                  Class7274.method22899(this.field4080).method27165(var3, 4L * Class7274.method22903(this.field4080));
                  Class7274.method22899(this.field4080).method27165(var3, 6L * Class7274.method22903(this.field4080));

                  for (long var39 = 0L; var39 < Class7274.method22903(this.field4080); var39++) {
                     long var46 = var23 + var39 * Class7274.method22904(this.field4080) + var32;
                     long var57 = 2L * var39;
                     long var66 = 2L * Class7274.method22903(this.field4080) + 2L * var39;
                     long var71 = var66 + 2L * Class7274.method22903(this.field4080);
                     long var74 = var71 + 2L * Class7274.method22903(this.field4080);
                     this.field4078.method9687(var46, var3.method9653(var57));
                     this.field4078.method9687(var46 + 1L, var3.method9653(var57 + 1L));
                     this.field4078.method9687(var46 + 2L, var3.method9653(var66));
                     this.field4078.method9687(var46 + 3L, var3.method9653(var66 + 1L));
                     this.field4078.method9687(var46 + 4L, var3.method9653(var71));
                     this.field4078.method9687(var46 + 5L, var3.method9653(var71 + 1L));
                     this.field4078.method9687(var46 + 6L, var3.method9653(var74));
                     this.field4078.method9687(var46 + 7L, var3.method9653(var74 + 1L));
                  }
               }
            }
         }
      }
   }
}
