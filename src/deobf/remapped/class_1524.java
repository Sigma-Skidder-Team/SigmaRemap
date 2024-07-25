package remapped;

public class class_1524 implements Runnable {
   private static String[] field_8108;

   public class_1524(class_3381 var1, long var2, int var4, long var5, int var7, long var8, class_4330 var10, boolean var11) {
      this.field_8111 = var1;
      this.field_8110 = var2;
      this.field_8104 = var4;
      this.field_8105 = var5;
      this.field_8107 = var7;
      this.field_8106 = var8;
      this.field_8109 = var10;
      this.field_8112 = var11;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(this.field_8110);
      if (this.field_8104 != -1) {
         for (long var4 = this.field_8105; var4 < class_3381.method_15636(this.field_8111); var4 += (long)this.field_8107) {
            long var6 = var4 * class_3381.method_15598(this.field_8111);
            if (this.field_8106 != 0L) {
               for (long var24 = 0L; var24 < class_3381.method_15624(this.field_8111); var24++) {
                  class_3381.method_15625(this.field_8111)
                     .method_24206(this.field_8109, var6 + var24 * class_3381.method_15638(this.field_8111), this.field_8112);
               }
            } else {
               for (long var8 = 0L; var8 < class_3381.method_15624(this.field_8111); var8++) {
                  class_3381.method_15625(this.field_8111)
                     .method_24213(this.field_8109, var6 + var8 * class_3381.method_15638(this.field_8111), this.field_8112);
               }
            }

            if (class_3381.method_15582(this.field_8111) <= 4L) {
               if (class_3381.method_15582(this.field_8111) != 4L) {
                  if (class_3381.method_15582(this.field_8111) == 2L) {
                     for (long var28 = 0L; var28 < class_3381.method_15624(this.field_8111); var28++) {
                        long var43 = var6 + var28 * class_3381.method_15638(this.field_8111);
                        long var54 = 2L * var28;
                        var3.method_36123(var54, this.field_8109.method_36133(var43));
                        var3.method_36123(var54 + 1L, this.field_8109.method_36133(var43 + 1L));
                     }

                     class_3381.method_15639(this.field_8111).method_24213(var3, 0L, this.field_8112);

                     for (long var29 = 0L; var29 < class_3381.method_15624(this.field_8111); var29++) {
                        long var44 = var6 + var29 * class_3381.method_15638(this.field_8111);
                        long var55 = 2L * var29;
                        this.field_8109.method_36123(var44, var3.method_36133(var55));
                        this.field_8109.method_36123(var44 + 1L, var3.method_36133(var55 + 1L));
                     }
                  }
               } else {
                  for (long var26 = 0L; var26 < class_3381.method_15624(this.field_8111); var26++) {
                     long var41 = var6 + var26 * class_3381.method_15638(this.field_8111);
                     long var52 = 2L * var26;
                     long var63 = 2L * class_3381.method_15624(this.field_8111) + 2L * var26;
                     var3.method_36123(var52, this.field_8109.method_36133(var41));
                     var3.method_36123(var52 + 1L, this.field_8109.method_36133(var41 + 1L));
                     var3.method_36123(var63, this.field_8109.method_36133(var41 + 2L));
                     var3.method_36123(var63 + 1L, this.field_8109.method_36133(var41 + 3L));
                  }

                  class_3381.method_15639(this.field_8111).method_24213(var3, 0L, this.field_8112);
                  class_3381.method_15639(this.field_8111).method_24213(var3, 2L * class_3381.method_15624(this.field_8111), this.field_8112);

                  for (long var27 = 0L; var27 < class_3381.method_15624(this.field_8111); var27++) {
                     long var42 = var6 + var27 * class_3381.method_15638(this.field_8111);
                     long var53 = 2L * var27;
                     long var64 = 2L * class_3381.method_15624(this.field_8111) + 2L * var27;
                     this.field_8109.method_36123(var42, var3.method_36133(var53));
                     this.field_8109.method_36123(var42 + 1L, var3.method_36133(var53 + 1L));
                     this.field_8109.method_36123(var42 + 2L, var3.method_36133(var64));
                     this.field_8109.method_36123(var42 + 3L, var3.method_36133(var64 + 1L));
                  }
               }
            } else {
               for (long var25 = 0L; var25 < class_3381.method_15582(this.field_8111); var25 += 8L) {
                  for (long var10 = 0L; var10 < class_3381.method_15624(this.field_8111); var10++) {
                     long var12 = var6 + var10 * class_3381.method_15638(this.field_8111) + var25;
                     long var14 = 2L * var10;
                     long var16 = 2L * class_3381.method_15624(this.field_8111) + 2L * var10;
                     long var18 = var16 + 2L * class_3381.method_15624(this.field_8111);
                     long var20 = var18 + 2L * class_3381.method_15624(this.field_8111);
                     var3.method_36123(var14, this.field_8109.method_36133(var12));
                     var3.method_36123(var14 + 1L, this.field_8109.method_36133(var12 + 1L));
                     var3.method_36123(var16, this.field_8109.method_36133(var12 + 2L));
                     var3.method_36123(var16 + 1L, this.field_8109.method_36133(var12 + 3L));
                     var3.method_36123(var18, this.field_8109.method_36133(var12 + 4L));
                     var3.method_36123(var18 + 1L, this.field_8109.method_36133(var12 + 5L));
                     var3.method_36123(var20, this.field_8109.method_36133(var12 + 6L));
                     var3.method_36123(var20 + 1L, this.field_8109.method_36133(var12 + 7L));
                  }

                  class_3381.method_15639(this.field_8111).method_24213(var3, 0L, this.field_8112);
                  class_3381.method_15639(this.field_8111).method_24213(var3, 2L * class_3381.method_15624(this.field_8111), this.field_8112);
                  class_3381.method_15639(this.field_8111).method_24213(var3, 4L * class_3381.method_15624(this.field_8111), this.field_8112);
                  class_3381.method_15639(this.field_8111).method_24213(var3, 6L * class_3381.method_15624(this.field_8111), this.field_8112);

                  for (long var37 = 0L; var37 < class_3381.method_15624(this.field_8111); var37++) {
                     long var40 = var6 + var37 * class_3381.method_15638(this.field_8111) + var25;
                     long var51 = 2L * var37;
                     long var62 = 2L * class_3381.method_15624(this.field_8111) + 2L * var37;
                     long var69 = var62 + 2L * class_3381.method_15624(this.field_8111);
                     long var72 = var69 + 2L * class_3381.method_15624(this.field_8111);
                     this.field_8109.method_36123(var40, var3.method_36133(var51));
                     this.field_8109.method_36123(var40 + 1L, var3.method_36133(var51 + 1L));
                     this.field_8109.method_36123(var40 + 2L, var3.method_36133(var62));
                     this.field_8109.method_36123(var40 + 3L, var3.method_36133(var62 + 1L));
                     this.field_8109.method_36123(var40 + 4L, var3.method_36133(var69));
                     this.field_8109.method_36123(var40 + 5L, var3.method_36133(var69 + 1L));
                     this.field_8109.method_36123(var40 + 6L, var3.method_36133(var72));
                     this.field_8109.method_36123(var40 + 7L, var3.method_36133(var72 + 1L));
                  }
               }
            }
         }
      } else {
         for (long var22 = this.field_8105; var22 < class_3381.method_15636(this.field_8111); var22 += (long)this.field_8107) {
            long var23 = var22 * class_3381.method_15598(this.field_8111);
            if (this.field_8106 != 0L) {
               for (long var31 = 0L; var31 < class_3381.method_15624(this.field_8111); var31++) {
                  class_3381.method_15625(this.field_8111).method_24203(this.field_8109, var23 + var31 * class_3381.method_15638(this.field_8111));
               }
            } else {
               for (long var30 = 0L; var30 < class_3381.method_15624(this.field_8111); var30++) {
                  class_3381.method_15625(this.field_8111).method_24184(this.field_8109, var23 + var30 * class_3381.method_15638(this.field_8111));
               }
            }

            if (class_3381.method_15582(this.field_8111) <= 4L) {
               if (class_3381.method_15582(this.field_8111) != 4L) {
                  if (class_3381.method_15582(this.field_8111) == 2L) {
                     for (long var35 = 0L; var35 < class_3381.method_15624(this.field_8111); var35++) {
                        long var49 = var23 + var35 * class_3381.method_15638(this.field_8111);
                        long var60 = 2L * var35;
                        var3.method_36123(var60, this.field_8109.method_36133(var49));
                        var3.method_36123(var60 + 1L, this.field_8109.method_36133(var49 + 1L));
                     }

                     class_3381.method_15639(this.field_8111).method_24184(var3, 0L);

                     for (long var36 = 0L; var36 < class_3381.method_15624(this.field_8111); var36++) {
                        long var50 = var23 + var36 * class_3381.method_15638(this.field_8111);
                        long var61 = 2L * var36;
                        this.field_8109.method_36123(var50, var3.method_36133(var61));
                        this.field_8109.method_36123(var50 + 1L, var3.method_36133(var61 + 1L));
                     }
                  }
               } else {
                  for (long var33 = 0L; var33 < class_3381.method_15624(this.field_8111); var33++) {
                     long var47 = var23 + var33 * class_3381.method_15638(this.field_8111);
                     long var58 = 2L * var33;
                     long var67 = 2L * class_3381.method_15624(this.field_8111) + 2L * var33;
                     var3.method_36123(var58, this.field_8109.method_36133(var47));
                     var3.method_36123(var58 + 1L, this.field_8109.method_36133(var47 + 1L));
                     var3.method_36123(var67, this.field_8109.method_36133(var47 + 2L));
                     var3.method_36123(var67 + 1L, this.field_8109.method_36133(var47 + 3L));
                  }

                  class_3381.method_15639(this.field_8111).method_24184(var3, 0L);
                  class_3381.method_15639(this.field_8111).method_24184(var3, 2L * class_3381.method_15624(this.field_8111));

                  for (long var34 = 0L; var34 < class_3381.method_15624(this.field_8111); var34++) {
                     long var48 = var23 + var34 * class_3381.method_15638(this.field_8111);
                     long var59 = 2L * var34;
                     long var68 = 2L * class_3381.method_15624(this.field_8111) + 2L * var34;
                     this.field_8109.method_36123(var48, var3.method_36133(var59));
                     this.field_8109.method_36123(var48 + 1L, var3.method_36133(var59 + 1L));
                     this.field_8109.method_36123(var48 + 2L, var3.method_36133(var68));
                     this.field_8109.method_36123(var48 + 3L, var3.method_36133(var68 + 1L));
                  }
               }
            } else {
               for (long var32 = 0L; var32 < class_3381.method_15582(this.field_8111); var32 += 8L) {
                  for (long var38 = 0L; var38 < class_3381.method_15624(this.field_8111); var38++) {
                     long var45 = var23 + var38 * class_3381.method_15638(this.field_8111) + var32;
                     long var56 = 2L * var38;
                     long var65 = 2L * class_3381.method_15624(this.field_8111) + 2L * var38;
                     long var70 = var65 + 2L * class_3381.method_15624(this.field_8111);
                     long var73 = var70 + 2L * class_3381.method_15624(this.field_8111);
                     var3.method_36123(var56, this.field_8109.method_36133(var45));
                     var3.method_36123(var56 + 1L, this.field_8109.method_36133(var45 + 1L));
                     var3.method_36123(var65, this.field_8109.method_36133(var45 + 2L));
                     var3.method_36123(var65 + 1L, this.field_8109.method_36133(var45 + 3L));
                     var3.method_36123(var70, this.field_8109.method_36133(var45 + 4L));
                     var3.method_36123(var70 + 1L, this.field_8109.method_36133(var45 + 5L));
                     var3.method_36123(var73, this.field_8109.method_36133(var45 + 6L));
                     var3.method_36123(var73 + 1L, this.field_8109.method_36133(var45 + 7L));
                  }

                  class_3381.method_15639(this.field_8111).method_24184(var3, 0L);
                  class_3381.method_15639(this.field_8111).method_24184(var3, 2L * class_3381.method_15624(this.field_8111));
                  class_3381.method_15639(this.field_8111).method_24184(var3, 4L * class_3381.method_15624(this.field_8111));
                  class_3381.method_15639(this.field_8111).method_24184(var3, 6L * class_3381.method_15624(this.field_8111));

                  for (long var39 = 0L; var39 < class_3381.method_15624(this.field_8111); var39++) {
                     long var46 = var23 + var39 * class_3381.method_15638(this.field_8111) + var32;
                     long var57 = 2L * var39;
                     long var66 = 2L * class_3381.method_15624(this.field_8111) + 2L * var39;
                     long var71 = var66 + 2L * class_3381.method_15624(this.field_8111);
                     long var74 = var71 + 2L * class_3381.method_15624(this.field_8111);
                     this.field_8109.method_36123(var46, var3.method_36133(var57));
                     this.field_8109.method_36123(var46 + 1L, var3.method_36133(var57 + 1L));
                     this.field_8109.method_36123(var46 + 2L, var3.method_36133(var66));
                     this.field_8109.method_36123(var46 + 3L, var3.method_36133(var66 + 1L));
                     this.field_8109.method_36123(var46 + 4L, var3.method_36133(var71));
                     this.field_8109.method_36123(var46 + 5L, var3.method_36133(var71 + 1L));
                     this.field_8109.method_36123(var46 + 6L, var3.method_36133(var74));
                     this.field_8109.method_36123(var46 + 7L, var3.method_36133(var74 + 1L));
                  }
               }
            }
         }
      }
   }
}
