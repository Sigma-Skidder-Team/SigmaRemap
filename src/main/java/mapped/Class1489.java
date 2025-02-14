package mapped;

public class Class1489 implements Runnable {
   private static String[] field8015;
   public final long field8016;
   public final int field8017;
   public final long field8018;
   public final int field8019;
   public final long field8020;
   public final Class2378 field8021;
   public final boolean field8022;
   public final Class8026 field8023;

   public Class1489(Class8026 var1, long var2, int var4, long var5, int var7, long var8, Class2378 var10, boolean var11) {
      this.field8023 = var1;
      this.field8016 = var2;
      this.field8017 = var4;
      this.field8018 = var5;
      this.field8019 = var7;
      this.field8020 = var8;
      this.field8021 = var10;
      this.field8022 = var11;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(this.field8016);
      if (this.field8017 != -1) {
         for (long var4 = this.field8018; var4 < Class8026.method27524(this.field8023); var4 += (long)this.field8019) {
            long var6 = var4 * Class8026.method27520(this.field8023);
            if (this.field8020 == 0L) {
               for (long var8 = 0L; var8 < Class8026.method27521(this.field8023); var8++) {
                  Class8026.method27515(this.field8023).method30936(this.field8021, var6 + var8 * Class8026.method27522(this.field8023), this.field8022);
               }
            }

            if (Class8026.method27523(this.field8023) <= 4L) {
               if (Class8026.method27523(this.field8023) != 4L) {
                  if (Class8026.method27523(this.field8023) == 2L) {
                     for (long var27 = 0L; var27 < Class8026.method27521(this.field8023); var27++) {
                        long var43 = var6 + var27 * Class8026.method27522(this.field8023);
                        long var54 = 2L * var27;
                        var3.method9685(var54, this.field8021.method9651(var43));
                        var3.method9685(var54 + 1L, this.field8021.method9651(var43 + 1L));
                     }

                     Class8026.method27517(this.field8023).method30936(var3, 0L, this.field8022);

                     for (long var28 = 0L; var28 < Class8026.method27521(this.field8023); var28++) {
                        long var44 = var6 + var28 * Class8026.method27522(this.field8023);
                        long var55 = 2L * var28;
                        this.field8021.method9685(var44, var3.method9651(var55));
                        this.field8021.method9685(var44 + 1L, var3.method9651(var55 + 1L));
                     }
                  }
               } else {
                  for (long var25 = 0L; var25 < Class8026.method27521(this.field8023); var25++) {
                     long var41 = var6 + var25 * Class8026.method27522(this.field8023);
                     long var52 = 2L * var25;
                     long var63 = 2L * Class8026.method27521(this.field8023) + 2L * var25;
                     var3.method9685(var52, this.field8021.method9651(var41));
                     var3.method9685(var52 + 1L, this.field8021.method9651(var41 + 1L));
                     var3.method9685(var63, this.field8021.method9651(var41 + 2L));
                     var3.method9685(var63 + 1L, this.field8021.method9651(var41 + 3L));
                  }

                  Class8026.method27517(this.field8023).method30936(var3, 0L, this.field8022);
                  Class8026.method27517(this.field8023).method30936(var3, 2L * Class8026.method27521(this.field8023), this.field8022);

                  for (long var26 = 0L; var26 < Class8026.method27521(this.field8023); var26++) {
                     long var42 = var6 + var26 * Class8026.method27522(this.field8023);
                     long var53 = 2L * var26;
                     long var64 = 2L * Class8026.method27521(this.field8023) + 2L * var26;
                     this.field8021.method9685(var42, var3.method9651(var53));
                     this.field8021.method9685(var42 + 1L, var3.method9651(var53 + 1L));
                     this.field8021.method9685(var42 + 2L, var3.method9651(var64));
                     this.field8021.method9685(var42 + 3L, var3.method9651(var64 + 1L));
                  }
               }
            } else {
               for (long var24 = 0L; var24 < Class8026.method27523(this.field8023); var24 += 8L) {
                  for (long var10 = 0L; var10 < Class8026.method27521(this.field8023); var10++) {
                     long var12 = var6 + var10 * Class8026.method27522(this.field8023) + var24;
                     long var14 = 2L * var10;
                     long var16 = 2L * Class8026.method27521(this.field8023) + 2L * var10;
                     long var18 = var16 + 2L * Class8026.method27521(this.field8023);
                     long var20 = var18 + 2L * Class8026.method27521(this.field8023);
                     var3.method9685(var14, this.field8021.method9651(var12));
                     var3.method9685(var14 + 1L, this.field8021.method9651(var12 + 1L));
                     var3.method9685(var16, this.field8021.method9651(var12 + 2L));
                     var3.method9685(var16 + 1L, this.field8021.method9651(var12 + 3L));
                     var3.method9685(var18, this.field8021.method9651(var12 + 4L));
                     var3.method9685(var18 + 1L, this.field8021.method9651(var12 + 5L));
                     var3.method9685(var20, this.field8021.method9651(var12 + 6L));
                     var3.method9685(var20 + 1L, this.field8021.method9651(var12 + 7L));
                  }

                  Class8026.method27517(this.field8023).method30936(var3, 0L, this.field8022);
                  Class8026.method27517(this.field8023).method30936(var3, 2L * Class8026.method27521(this.field8023), this.field8022);
                  Class8026.method27517(this.field8023).method30936(var3, 4L * Class8026.method27521(this.field8023), this.field8022);
                  Class8026.method27517(this.field8023).method30936(var3, 6L * Class8026.method27521(this.field8023), this.field8022);

                  for (long var37 = 0L; var37 < Class8026.method27521(this.field8023); var37++) {
                     long var40 = var6 + var37 * Class8026.method27522(this.field8023) + var24;
                     long var51 = 2L * var37;
                     long var62 = 2L * Class8026.method27521(this.field8023) + 2L * var37;
                     long var69 = var62 + 2L * Class8026.method27521(this.field8023);
                     long var72 = var69 + 2L * Class8026.method27521(this.field8023);
                     this.field8021.method9685(var40, var3.method9651(var51));
                     this.field8021.method9685(var40 + 1L, var3.method9651(var51 + 1L));
                     this.field8021.method9685(var40 + 2L, var3.method9651(var62));
                     this.field8021.method9685(var40 + 3L, var3.method9651(var62 + 1L));
                     this.field8021.method9685(var40 + 4L, var3.method9651(var69));
                     this.field8021.method9685(var40 + 5L, var3.method9651(var69 + 1L));
                     this.field8021.method9685(var40 + 6L, var3.method9651(var72));
                     this.field8021.method9685(var40 + 7L, var3.method9651(var72 + 1L));
                  }
               }
            }

            if (this.field8020 != 0L) {
               for (long var29 = 0L; var29 < Class8026.method27521(this.field8023); var29++) {
                  Class8026.method27515(this.field8023).method30948(this.field8021, var6 + var29 * Class8026.method27522(this.field8023), this.field8022);
               }
            }
         }
      } else {
         for (long var22 = this.field8018; var22 < Class8026.method27524(this.field8023); var22 += (long)this.field8019) {
            long var23 = var22 * Class8026.method27520(this.field8023);
            if (this.field8020 != 0L) {
               for (long var31 = 0L; var31 < Class8026.method27521(this.field8023); var31++) {
                  Class8026.method27515(this.field8023).method30940(this.field8021, var23 + var31 * Class8026.method27522(this.field8023));
               }
            } else {
               for (long var30 = 0L; var30 < Class8026.method27521(this.field8023); var30++) {
                  Class8026.method27515(this.field8023).method30932(this.field8021, var23 + var30 * Class8026.method27522(this.field8023));
               }
            }

            if (Class8026.method27523(this.field8023) <= 4L) {
               if (Class8026.method27523(this.field8023) != 4L) {
                  if (Class8026.method27523(this.field8023) == 2L) {
                     for (long var35 = 0L; var35 < Class8026.method27521(this.field8023); var35++) {
                        long var49 = var23 + var35 * Class8026.method27522(this.field8023);
                        long var60 = 2L * var35;
                        var3.method9685(var60, this.field8021.method9651(var49));
                        var3.method9685(var60 + 1L, this.field8021.method9651(var49 + 1L));
                     }

                     Class8026.method27517(this.field8023).method30932(var3, 0L);

                     for (long var36 = 0L; var36 < Class8026.method27521(this.field8023); var36++) {
                        long var50 = var23 + var36 * Class8026.method27522(this.field8023);
                        long var61 = 2L * var36;
                        this.field8021.method9685(var50, var3.method9651(var61));
                        this.field8021.method9685(var50 + 1L, var3.method9651(var61 + 1L));
                     }
                  }
               } else {
                  for (long var33 = 0L; var33 < Class8026.method27521(this.field8023); var33++) {
                     long var47 = var23 + var33 * Class8026.method27522(this.field8023);
                     long var58 = 2L * var33;
                     long var67 = 2L * Class8026.method27521(this.field8023) + 2L * var33;
                     var3.method9685(var58, this.field8021.method9651(var47));
                     var3.method9685(var58 + 1L, this.field8021.method9651(var47 + 1L));
                     var3.method9685(var67, this.field8021.method9651(var47 + 2L));
                     var3.method9685(var67 + 1L, this.field8021.method9651(var47 + 3L));
                  }

                  Class8026.method27517(this.field8023).method30932(var3, 0L);
                  Class8026.method27517(this.field8023).method30932(var3, 2L * Class8026.method27521(this.field8023));

                  for (long var34 = 0L; var34 < Class8026.method27521(this.field8023); var34++) {
                     long var48 = var23 + var34 * Class8026.method27522(this.field8023);
                     long var59 = 2L * var34;
                     long var68 = 2L * Class8026.method27521(this.field8023) + 2L * var34;
                     this.field8021.method9685(var48, var3.method9651(var59));
                     this.field8021.method9685(var48 + 1L, var3.method9651(var59 + 1L));
                     this.field8021.method9685(var48 + 2L, var3.method9651(var68));
                     this.field8021.method9685(var48 + 3L, var3.method9651(var68 + 1L));
                  }
               }
            } else {
               for (long var32 = 0L; var32 < Class8026.method27523(this.field8023); var32 += 8L) {
                  for (long var38 = 0L; var38 < Class8026.method27521(this.field8023); var38++) {
                     long var45 = var23 + var38 * Class8026.method27522(this.field8023) + var32;
                     long var56 = 2L * var38;
                     long var65 = 2L * Class8026.method27521(this.field8023) + 2L * var38;
                     long var70 = var65 + 2L * Class8026.method27521(this.field8023);
                     long var73 = var70 + 2L * Class8026.method27521(this.field8023);
                     var3.method9685(var56, this.field8021.method9651(var45));
                     var3.method9685(var56 + 1L, this.field8021.method9651(var45 + 1L));
                     var3.method9685(var65, this.field8021.method9651(var45 + 2L));
                     var3.method9685(var65 + 1L, this.field8021.method9651(var45 + 3L));
                     var3.method9685(var70, this.field8021.method9651(var45 + 4L));
                     var3.method9685(var70 + 1L, this.field8021.method9651(var45 + 5L));
                     var3.method9685(var73, this.field8021.method9651(var45 + 6L));
                     var3.method9685(var73 + 1L, this.field8021.method9651(var45 + 7L));
                  }

                  Class8026.method27517(this.field8023).method30932(var3, 0L);
                  Class8026.method27517(this.field8023).method30932(var3, 2L * Class8026.method27521(this.field8023));
                  Class8026.method27517(this.field8023).method30932(var3, 4L * Class8026.method27521(this.field8023));
                  Class8026.method27517(this.field8023).method30932(var3, 6L * Class8026.method27521(this.field8023));

                  for (long var39 = 0L; var39 < Class8026.method27521(this.field8023); var39++) {
                     long var46 = var23 + var39 * Class8026.method27522(this.field8023) + var32;
                     long var57 = 2L * var39;
                     long var66 = 2L * Class8026.method27521(this.field8023) + 2L * var39;
                     long var71 = var66 + 2L * Class8026.method27521(this.field8023);
                     long var74 = var71 + 2L * Class8026.method27521(this.field8023);
                     this.field8021.method9685(var46, var3.method9651(var57));
                     this.field8021.method9685(var46 + 1L, var3.method9651(var57 + 1L));
                     this.field8021.method9685(var46 + 2L, var3.method9651(var66));
                     this.field8021.method9685(var46 + 3L, var3.method9651(var66 + 1L));
                     this.field8021.method9685(var46 + 4L, var3.method9651(var71));
                     this.field8021.method9685(var46 + 5L, var3.method9651(var71 + 1L));
                     this.field8021.method9685(var46 + 6L, var3.method9651(var74));
                     this.field8021.method9685(var46 + 7L, var3.method9651(var74 + 1L));
                  }
               }
            }
         }
      }
   }
}
