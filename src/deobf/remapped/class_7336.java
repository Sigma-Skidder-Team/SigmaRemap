package remapped;

public class class_7336 implements Runnable {
   private static String[] field_37521;

   public class_7336(class_3381 var1, long var2, int var4, long var5, int var7, class_4330 var8, boolean var9) {
      this.field_37518 = var1;
      this.field_37524 = var2;
      this.field_37523 = var4;
      this.field_37517 = var5;
      this.field_37522 = var7;
      this.field_37519 = var8;
      this.field_37520 = var9;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(this.field_37524);
      if (this.field_37523 != -1) {
         if (class_3381.method_15582(this.field_37518) <= 4L) {
            if (class_3381.method_15582(this.field_37518) != 4L) {
               if (class_3381.method_15582(this.field_37518) == 2L) {
                  for (long var4 = this.field_37517; var4 < class_3381.method_15624(this.field_37518); var4 += (long)this.field_37522) {
                     long var6 = var4 * class_3381.method_15638(this.field_37518);

                     for (long var8 = 0L; var8 < class_3381.method_15636(this.field_37518); var8++) {
                        long var12 = var8 * class_3381.method_15598(this.field_37518) + var6;
                        long var14 = 2L * var8;
                        var3.method_36123(var14, this.field_37519.method_36133(var12));
                        var3.method_36123(var14 + 1L, this.field_37519.method_36133(var12 + 1L));
                     }

                     class_3381.method_15603(this.field_37518).method_24213(var3, 0L, this.field_37520);

                     for (long var32 = 0L; var32 < class_3381.method_15636(this.field_37518); var32++) {
                        long var44 = var32 * class_3381.method_15598(this.field_37518) + var6;
                        long var55 = 2L * var32;
                        this.field_37519.method_36123(var44, var3.method_36133(var55));
                        this.field_37519.method_36123(var44 + 1L, var3.method_36133(var55 + 1L));
                     }
                  }
               }
            } else {
               for (long var22 = this.field_37517; var22 < class_3381.method_15624(this.field_37518); var22 += (long)this.field_37522) {
                  long var27 = var22 * class_3381.method_15638(this.field_37518);

                  for (long var33 = 0L; var33 < class_3381.method_15636(this.field_37518); var33++) {
                     long var45 = var33 * class_3381.method_15598(this.field_37518) + var27;
                     long var56 = 2L * var33;
                     long var16 = 2L * class_3381.method_15636(this.field_37518) + 2L * var33;
                     var3.method_36123(var56, this.field_37519.method_36133(var45));
                     var3.method_36123(var56 + 1L, this.field_37519.method_36133(var45 + 1L));
                     var3.method_36123(var16, this.field_37519.method_36133(var45 + 2L));
                     var3.method_36123(var16 + 1L, this.field_37519.method_36133(var45 + 3L));
                  }

                  class_3381.method_15603(this.field_37518).method_24213(var3, 0L, this.field_37520);
                  class_3381.method_15603(this.field_37518).method_24213(var3, 2L * class_3381.method_15636(this.field_37518), this.field_37520);

                  for (long var34 = 0L; var34 < class_3381.method_15636(this.field_37518); var34++) {
                     long var46 = var34 * class_3381.method_15598(this.field_37518) + var27;
                     long var57 = 2L * var34;
                     long var66 = 2L * class_3381.method_15636(this.field_37518) + 2L * var34;
                     this.field_37519.method_36123(var46, var3.method_36133(var57));
                     this.field_37519.method_36123(var46 + 1L, var3.method_36133(var57 + 1L));
                     this.field_37519.method_36123(var46 + 2L, var3.method_36133(var66));
                     this.field_37519.method_36123(var46 + 3L, var3.method_36133(var66 + 1L));
                  }
               }
            }
         } else {
            for (long var23 = this.field_37517; var23 < class_3381.method_15624(this.field_37518); var23 += (long)this.field_37522) {
               long var28 = var23 * class_3381.method_15638(this.field_37518);

               for (long var35 = 0L; var35 < class_3381.method_15582(this.field_37518); var35 += 8L) {
                  for (long var10 = 0L; var10 < class_3381.method_15636(this.field_37518); var10++) {
                     long var47 = var10 * class_3381.method_15598(this.field_37518) + var28 + var35;
                     long var58 = 2L * var10;
                     long var67 = 2L * class_3381.method_15636(this.field_37518) + 2L * var10;
                     long var18 = var67 + 2L * class_3381.method_15636(this.field_37518);
                     long var20 = var18 + 2L * class_3381.method_15636(this.field_37518);
                     var3.method_36123(var58, this.field_37519.method_36133(var47));
                     var3.method_36123(var58 + 1L, this.field_37519.method_36133(var47 + 1L));
                     var3.method_36123(var67, this.field_37519.method_36133(var47 + 2L));
                     var3.method_36123(var67 + 1L, this.field_37519.method_36133(var47 + 3L));
                     var3.method_36123(var18, this.field_37519.method_36133(var47 + 4L));
                     var3.method_36123(var18 + 1L, this.field_37519.method_36133(var47 + 5L));
                     var3.method_36123(var20, this.field_37519.method_36133(var47 + 6L));
                     var3.method_36123(var20 + 1L, this.field_37519.method_36133(var47 + 7L));
                  }

                  class_3381.method_15603(this.field_37518).method_24213(var3, 0L, this.field_37520);
                  class_3381.method_15603(this.field_37518).method_24213(var3, 2L * class_3381.method_15636(this.field_37518), this.field_37520);
                  class_3381.method_15603(this.field_37518).method_24213(var3, 4L * class_3381.method_15636(this.field_37518), this.field_37520);
                  class_3381.method_15603(this.field_37518).method_24213(var3, 6L * class_3381.method_15636(this.field_37518), this.field_37520);

                  for (long var41 = 0L; var41 < class_3381.method_15636(this.field_37518); var41++) {
                     long var48 = var41 * class_3381.method_15598(this.field_37518) + var28 + var35;
                     long var59 = 2L * var41;
                     long var68 = 2L * class_3381.method_15636(this.field_37518) + 2L * var41;
                     long var73 = var68 + 2L * class_3381.method_15636(this.field_37518);
                     long var76 = var73 + 2L * class_3381.method_15636(this.field_37518);
                     this.field_37519.method_36123(var48, var3.method_36133(var59));
                     this.field_37519.method_36123(var48 + 1L, var3.method_36133(var59 + 1L));
                     this.field_37519.method_36123(var48 + 2L, var3.method_36133(var68));
                     this.field_37519.method_36123(var48 + 3L, var3.method_36133(var68 + 1L));
                     this.field_37519.method_36123(var48 + 4L, var3.method_36133(var73));
                     this.field_37519.method_36123(var48 + 5L, var3.method_36133(var73 + 1L));
                     this.field_37519.method_36123(var48 + 6L, var3.method_36133(var76));
                     this.field_37519.method_36123(var48 + 7L, var3.method_36133(var76 + 1L));
                  }
               }
            }
         }
      } else if (class_3381.method_15582(this.field_37518) <= 4L) {
         if (class_3381.method_15582(this.field_37518) != 4L) {
            if (class_3381.method_15582(this.field_37518) == 2L) {
               for (long var24 = this.field_37517; var24 < class_3381.method_15624(this.field_37518); var24 += (long)this.field_37522) {
                  long var29 = var24 * class_3381.method_15638(this.field_37518);

                  for (long var36 = 0L; var36 < class_3381.method_15636(this.field_37518); var36++) {
                     long var49 = var36 * class_3381.method_15598(this.field_37518) + var29;
                     long var60 = 2L * var36;
                     var3.method_36123(var60, this.field_37519.method_36133(var49));
                     var3.method_36123(var60 + 1L, this.field_37519.method_36133(var49 + 1L));
                  }

                  class_3381.method_15603(this.field_37518).method_24184(var3, 0L);

                  for (long var37 = 0L; var37 < class_3381.method_15636(this.field_37518); var37++) {
                     long var50 = var37 * class_3381.method_15598(this.field_37518) + var29;
                     long var61 = 2L * var37;
                     this.field_37519.method_36123(var50, var3.method_36133(var61));
                     this.field_37519.method_36123(var50 + 1L, var3.method_36133(var61 + 1L));
                  }
               }
            }
         } else {
            for (long var25 = this.field_37517; var25 < class_3381.method_15624(this.field_37518); var25 += (long)this.field_37522) {
               long var30 = var25 * class_3381.method_15638(this.field_37518);

               for (long var38 = 0L; var38 < class_3381.method_15636(this.field_37518); var38++) {
                  long var51 = var38 * class_3381.method_15598(this.field_37518) + var30;
                  long var62 = 2L * var38;
                  long var69 = 2L * class_3381.method_15636(this.field_37518) + 2L * var38;
                  var3.method_36123(var62, this.field_37519.method_36133(var51));
                  var3.method_36123(var62 + 1L, this.field_37519.method_36133(var51 + 1L));
                  var3.method_36123(var69, this.field_37519.method_36133(var51 + 2L));
                  var3.method_36123(var69 + 1L, this.field_37519.method_36133(var51 + 3L));
               }

               class_3381.method_15603(this.field_37518).method_24184(var3, 0L);
               class_3381.method_15603(this.field_37518).method_24184(var3, 2L * class_3381.method_15636(this.field_37518));

               for (long var39 = 0L; var39 < class_3381.method_15636(this.field_37518); var39++) {
                  long var52 = var39 * class_3381.method_15598(this.field_37518) + var30;
                  long var63 = 2L * var39;
                  long var70 = 2L * class_3381.method_15636(this.field_37518) + 2L * var39;
                  this.field_37519.method_36123(var52, var3.method_36133(var63));
                  this.field_37519.method_36123(var52 + 1L, var3.method_36133(var63 + 1L));
                  this.field_37519.method_36123(var52 + 2L, var3.method_36133(var70));
                  this.field_37519.method_36123(var52 + 3L, var3.method_36133(var70 + 1L));
               }
            }
         }
      } else {
         for (long var26 = this.field_37517; var26 < class_3381.method_15624(this.field_37518); var26 += (long)this.field_37522) {
            long var31 = var26 * class_3381.method_15638(this.field_37518);

            for (long var40 = 0L; var40 < class_3381.method_15582(this.field_37518); var40 += 8L) {
               for (long var42 = 0L; var42 < class_3381.method_15636(this.field_37518); var42++) {
                  long var53 = var42 * class_3381.method_15598(this.field_37518) + var31 + var40;
                  long var64 = 2L * var42;
                  long var71 = 2L * class_3381.method_15636(this.field_37518) + 2L * var42;
                  long var74 = var71 + 2L * class_3381.method_15636(this.field_37518);
                  long var77 = var74 + 2L * class_3381.method_15636(this.field_37518);
                  var3.method_36123(var64, this.field_37519.method_36133(var53));
                  var3.method_36123(var64 + 1L, this.field_37519.method_36133(var53 + 1L));
                  var3.method_36123(var71, this.field_37519.method_36133(var53 + 2L));
                  var3.method_36123(var71 + 1L, this.field_37519.method_36133(var53 + 3L));
                  var3.method_36123(var74, this.field_37519.method_36133(var53 + 4L));
                  var3.method_36123(var74 + 1L, this.field_37519.method_36133(var53 + 5L));
                  var3.method_36123(var77, this.field_37519.method_36133(var53 + 6L));
                  var3.method_36123(var77 + 1L, this.field_37519.method_36133(var53 + 7L));
               }

               class_3381.method_15603(this.field_37518).method_24184(var3, 0L);
               class_3381.method_15603(this.field_37518).method_24184(var3, 2L * class_3381.method_15636(this.field_37518));
               class_3381.method_15603(this.field_37518).method_24184(var3, 4L * class_3381.method_15636(this.field_37518));
               class_3381.method_15603(this.field_37518).method_24184(var3, 6L * class_3381.method_15636(this.field_37518));

               for (long var43 = 0L; var43 < class_3381.method_15636(this.field_37518); var43++) {
                  long var54 = var43 * class_3381.method_15598(this.field_37518) + var31 + var40;
                  long var65 = 2L * var43;
                  long var72 = 2L * class_3381.method_15636(this.field_37518) + 2L * var43;
                  long var75 = var72 + 2L * class_3381.method_15636(this.field_37518);
                  long var78 = var75 + 2L * class_3381.method_15636(this.field_37518);
                  this.field_37519.method_36123(var54, var3.method_36133(var65));
                  this.field_37519.method_36123(var54 + 1L, var3.method_36133(var65 + 1L));
                  this.field_37519.method_36123(var54 + 2L, var3.method_36133(var72));
                  this.field_37519.method_36123(var54 + 3L, var3.method_36133(var72 + 1L));
                  this.field_37519.method_36123(var54 + 4L, var3.method_36133(var75));
                  this.field_37519.method_36123(var54 + 5L, var3.method_36133(var75 + 1L));
                  this.field_37519.method_36123(var54 + 6L, var3.method_36133(var78));
                  this.field_37519.method_36123(var54 + 7L, var3.method_36133(var78 + 1L));
               }
            }
         }
      }
   }
}
