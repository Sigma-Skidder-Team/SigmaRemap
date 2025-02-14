package mapped;

public class Class1576 implements Runnable {
   private static String[] field8530;
   public final long field8531;
   public final int field8532;
   public final long field8533;
   public final int field8534;
   public final Class2381 field8535;
   public final boolean field8536;
   public final Class7274 field8537;

   public Class1576(Class7274 var1, long var2, int var4, long var5, int var7, Class2381 var8, boolean var9) {
      this.field8537 = var1;
      this.field8531 = var2;
      this.field8532 = var4;
      this.field8533 = var5;
      this.field8534 = var7;
      this.field8535 = var8;
      this.field8536 = var9;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(this.field8531);
      if (this.field8532 != -1) {
         if (Class7274.method22905(this.field8537) <= 4L) {
            if (Class7274.method22905(this.field8537) != 4L) {
               if (Class7274.method22905(this.field8537) == 2L) {
                  for (long var4 = this.field8533; var4 < Class7274.method22903(this.field8537); var4 += (long)this.field8534) {
                     long var6 = var4 * Class7274.method22904(this.field8537);

                     for (long var8 = 0L; var8 < Class7274.method22906(this.field8537); var8++) {
                        long var12 = var8 * Class7274.method22902(this.field8537) + var6;
                        long var14 = 2L * var8;
                        var3.method9687(var14, this.field8535.method9653(var12));
                        var3.method9687(var14 + 1L, this.field8535.method9653(var12 + 1L));
                     }

                     Class7274.method22901(this.field8537).method27169(var3, 0L, this.field8536);

                     for (long var32 = 0L; var32 < Class7274.method22906(this.field8537); var32++) {
                        long var44 = var32 * Class7274.method22902(this.field8537) + var6;
                        long var55 = 2L * var32;
                        this.field8535.method9687(var44, var3.method9653(var55));
                        this.field8535.method9687(var44 + 1L, var3.method9653(var55 + 1L));
                     }
                  }
               }
            } else {
               for (long var22 = this.field8533; var22 < Class7274.method22903(this.field8537); var22 += (long)this.field8534) {
                  long var27 = var22 * Class7274.method22904(this.field8537);

                  for (long var33 = 0L; var33 < Class7274.method22906(this.field8537); var33++) {
                     long var45 = var33 * Class7274.method22902(this.field8537) + var27;
                     long var56 = 2L * var33;
                     long var16 = 2L * Class7274.method22906(this.field8537) + 2L * var33;
                     var3.method9687(var56, this.field8535.method9653(var45));
                     var3.method9687(var56 + 1L, this.field8535.method9653(var45 + 1L));
                     var3.method9687(var16, this.field8535.method9653(var45 + 2L));
                     var3.method9687(var16 + 1L, this.field8535.method9653(var45 + 3L));
                  }

                  Class7274.method22901(this.field8537).method27169(var3, 0L, this.field8536);
                  Class7274.method22901(this.field8537).method27169(var3, 2L * Class7274.method22906(this.field8537), this.field8536);

                  for (long var34 = 0L; var34 < Class7274.method22906(this.field8537); var34++) {
                     long var46 = var34 * Class7274.method22902(this.field8537) + var27;
                     long var57 = 2L * var34;
                     long var66 = 2L * Class7274.method22906(this.field8537) + 2L * var34;
                     this.field8535.method9687(var46, var3.method9653(var57));
                     this.field8535.method9687(var46 + 1L, var3.method9653(var57 + 1L));
                     this.field8535.method9687(var46 + 2L, var3.method9653(var66));
                     this.field8535.method9687(var46 + 3L, var3.method9653(var66 + 1L));
                  }
               }
            }
         } else {
            for (long var23 = this.field8533; var23 < Class7274.method22903(this.field8537); var23 += (long)this.field8534) {
               long var28 = var23 * Class7274.method22904(this.field8537);

               for (long var35 = 0L; var35 < Class7274.method22905(this.field8537); var35 += 8L) {
                  for (long var10 = 0L; var10 < Class7274.method22906(this.field8537); var10++) {
                     long var47 = var10 * Class7274.method22902(this.field8537) + var28 + var35;
                     long var58 = 2L * var10;
                     long var67 = 2L * Class7274.method22906(this.field8537) + 2L * var10;
                     long var18 = var67 + 2L * Class7274.method22906(this.field8537);
                     long var20 = var18 + 2L * Class7274.method22906(this.field8537);
                     var3.method9687(var58, this.field8535.method9653(var47));
                     var3.method9687(var58 + 1L, this.field8535.method9653(var47 + 1L));
                     var3.method9687(var67, this.field8535.method9653(var47 + 2L));
                     var3.method9687(var67 + 1L, this.field8535.method9653(var47 + 3L));
                     var3.method9687(var18, this.field8535.method9653(var47 + 4L));
                     var3.method9687(var18 + 1L, this.field8535.method9653(var47 + 5L));
                     var3.method9687(var20, this.field8535.method9653(var47 + 6L));
                     var3.method9687(var20 + 1L, this.field8535.method9653(var47 + 7L));
                  }

                  Class7274.method22901(this.field8537).method27169(var3, 0L, this.field8536);
                  Class7274.method22901(this.field8537).method27169(var3, 2L * Class7274.method22906(this.field8537), this.field8536);
                  Class7274.method22901(this.field8537).method27169(var3, 4L * Class7274.method22906(this.field8537), this.field8536);
                  Class7274.method22901(this.field8537).method27169(var3, 6L * Class7274.method22906(this.field8537), this.field8536);

                  for (long var41 = 0L; var41 < Class7274.method22906(this.field8537); var41++) {
                     long var48 = var41 * Class7274.method22902(this.field8537) + var28 + var35;
                     long var59 = 2L * var41;
                     long var68 = 2L * Class7274.method22906(this.field8537) + 2L * var41;
                     long var73 = var68 + 2L * Class7274.method22906(this.field8537);
                     long var76 = var73 + 2L * Class7274.method22906(this.field8537);
                     this.field8535.method9687(var48, var3.method9653(var59));
                     this.field8535.method9687(var48 + 1L, var3.method9653(var59 + 1L));
                     this.field8535.method9687(var48 + 2L, var3.method9653(var68));
                     this.field8535.method9687(var48 + 3L, var3.method9653(var68 + 1L));
                     this.field8535.method9687(var48 + 4L, var3.method9653(var73));
                     this.field8535.method9687(var48 + 5L, var3.method9653(var73 + 1L));
                     this.field8535.method9687(var48 + 6L, var3.method9653(var76));
                     this.field8535.method9687(var48 + 7L, var3.method9653(var76 + 1L));
                  }
               }
            }
         }
      } else if (Class7274.method22905(this.field8537) <= 4L) {
         if (Class7274.method22905(this.field8537) != 4L) {
            if (Class7274.method22905(this.field8537) == 2L) {
               for (long var24 = this.field8533; var24 < Class7274.method22903(this.field8537); var24 += (long)this.field8534) {
                  long var29 = var24 * Class7274.method22904(this.field8537);

                  for (long var36 = 0L; var36 < Class7274.method22906(this.field8537); var36++) {
                     long var49 = var36 * Class7274.method22902(this.field8537) + var29;
                     long var60 = 2L * var36;
                     var3.method9687(var60, this.field8535.method9653(var49));
                     var3.method9687(var60 + 1L, this.field8535.method9653(var49 + 1L));
                  }

                  Class7274.method22901(this.field8537).method27165(var3, 0L);

                  for (long var37 = 0L; var37 < Class7274.method22906(this.field8537); var37++) {
                     long var50 = var37 * Class7274.method22902(this.field8537) + var29;
                     long var61 = 2L * var37;
                     this.field8535.method9687(var50, var3.method9653(var61));
                     this.field8535.method9687(var50 + 1L, var3.method9653(var61 + 1L));
                  }
               }
            }
         } else {
            for (long var25 = this.field8533; var25 < Class7274.method22903(this.field8537); var25 += (long)this.field8534) {
               long var30 = var25 * Class7274.method22904(this.field8537);

               for (long var38 = 0L; var38 < Class7274.method22906(this.field8537); var38++) {
                  long var51 = var38 * Class7274.method22902(this.field8537) + var30;
                  long var62 = 2L * var38;
                  long var69 = 2L * Class7274.method22906(this.field8537) + 2L * var38;
                  var3.method9687(var62, this.field8535.method9653(var51));
                  var3.method9687(var62 + 1L, this.field8535.method9653(var51 + 1L));
                  var3.method9687(var69, this.field8535.method9653(var51 + 2L));
                  var3.method9687(var69 + 1L, this.field8535.method9653(var51 + 3L));
               }

               Class7274.method22901(this.field8537).method27165(var3, 0L);
               Class7274.method22901(this.field8537).method27165(var3, 2L * Class7274.method22906(this.field8537));

               for (long var39 = 0L; var39 < Class7274.method22906(this.field8537); var39++) {
                  long var52 = var39 * Class7274.method22902(this.field8537) + var30;
                  long var63 = 2L * var39;
                  long var70 = 2L * Class7274.method22906(this.field8537) + 2L * var39;
                  this.field8535.method9687(var52, var3.method9653(var63));
                  this.field8535.method9687(var52 + 1L, var3.method9653(var63 + 1L));
                  this.field8535.method9687(var52 + 2L, var3.method9653(var70));
                  this.field8535.method9687(var52 + 3L, var3.method9653(var70 + 1L));
               }
            }
         }
      } else {
         for (long var26 = this.field8533; var26 < Class7274.method22903(this.field8537); var26 += (long)this.field8534) {
            long var31 = var26 * Class7274.method22904(this.field8537);

            for (long var40 = 0L; var40 < Class7274.method22905(this.field8537); var40 += 8L) {
               for (long var42 = 0L; var42 < Class7274.method22906(this.field8537); var42++) {
                  long var53 = var42 * Class7274.method22902(this.field8537) + var31 + var40;
                  long var64 = 2L * var42;
                  long var71 = 2L * Class7274.method22906(this.field8537) + 2L * var42;
                  long var74 = var71 + 2L * Class7274.method22906(this.field8537);
                  long var77 = var74 + 2L * Class7274.method22906(this.field8537);
                  var3.method9687(var64, this.field8535.method9653(var53));
                  var3.method9687(var64 + 1L, this.field8535.method9653(var53 + 1L));
                  var3.method9687(var71, this.field8535.method9653(var53 + 2L));
                  var3.method9687(var71 + 1L, this.field8535.method9653(var53 + 3L));
                  var3.method9687(var74, this.field8535.method9653(var53 + 4L));
                  var3.method9687(var74 + 1L, this.field8535.method9653(var53 + 5L));
                  var3.method9687(var77, this.field8535.method9653(var53 + 6L));
                  var3.method9687(var77 + 1L, this.field8535.method9653(var53 + 7L));
               }

               Class7274.method22901(this.field8537).method27165(var3, 0L);
               Class7274.method22901(this.field8537).method27165(var3, 2L * Class7274.method22906(this.field8537));
               Class7274.method22901(this.field8537).method27165(var3, 4L * Class7274.method22906(this.field8537));
               Class7274.method22901(this.field8537).method27165(var3, 6L * Class7274.method22906(this.field8537));

               for (long var43 = 0L; var43 < Class7274.method22906(this.field8537); var43++) {
                  long var54 = var43 * Class7274.method22902(this.field8537) + var31 + var40;
                  long var65 = 2L * var43;
                  long var72 = 2L * Class7274.method22906(this.field8537) + 2L * var43;
                  long var75 = var72 + 2L * Class7274.method22906(this.field8537);
                  long var78 = var75 + 2L * Class7274.method22906(this.field8537);
                  this.field8535.method9687(var54, var3.method9653(var65));
                  this.field8535.method9687(var54 + 1L, var3.method9653(var65 + 1L));
                  this.field8535.method9687(var54 + 2L, var3.method9653(var72));
                  this.field8535.method9687(var54 + 3L, var3.method9653(var72 + 1L));
                  this.field8535.method9687(var54 + 4L, var3.method9653(var75));
                  this.field8535.method9687(var54 + 5L, var3.method9653(var75 + 1L));
                  this.field8535.method9687(var54 + 6L, var3.method9653(var78));
                  this.field8535.method9687(var54 + 7L, var3.method9653(var78 + 1L));
               }
            }
         }
      }
   }
}
