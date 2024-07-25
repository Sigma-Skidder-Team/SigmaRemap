package remapped;

public class class_310 implements Runnable {
   private static String[] field_1139;

   public class_310(class_1637 var1, long var2, int var4, long var5, int var7, long var8, class_1702 var10, boolean var11) {
      this.field_1142 = var1;
      this.field_1138 = var2;
      this.field_1143 = var4;
      this.field_1140 = var5;
      this.field_1141 = var7;
      this.field_1144 = var8;
      this.field_1146 = var10;
      this.field_1145 = var11;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(this.field_1138);
      if (this.field_1143 != -1) {
         for (long var4 = this.field_1140; var4 < class_1637.method_7293(this.field_1142); var4 += (long)this.field_1141) {
            long var6 = var4 * class_1637.method_7342(this.field_1142);
            if (this.field_1144 == 0L) {
               for (long var8 = 0L; var8 < class_1637.method_7327(this.field_1142); var8++) {
                  class_1637.method_7310(this.field_1142).method_15033(this.field_1146, var6 + var8 * class_1637.method_7303(this.field_1142), this.field_1145);
               }
            }

            if (class_1637.method_7343(this.field_1142) <= 4L) {
               if (class_1637.method_7343(this.field_1142) != 4L) {
                  if (class_1637.method_7343(this.field_1142) == 2L) {
                     for (long var27 = 0L; var27 < class_1637.method_7327(this.field_1142); var27++) {
                        long var43 = var6 + var27 * class_1637.method_7303(this.field_1142);
                        long var54 = 2L * var27;
                        var3.method_36114(var54, this.field_1146.method_36107(var43));
                        var3.method_36114(var54 + 1L, this.field_1146.method_36107(var43 + 1L));
                     }

                     class_1637.method_7323(this.field_1142).method_15033(var3, 0L, this.field_1145);

                     for (long var28 = 0L; var28 < class_1637.method_7327(this.field_1142); var28++) {
                        long var44 = var6 + var28 * class_1637.method_7303(this.field_1142);
                        long var55 = 2L * var28;
                        this.field_1146.method_36114(var44, var3.method_36107(var55));
                        this.field_1146.method_36114(var44 + 1L, var3.method_36107(var55 + 1L));
                     }
                  }
               } else {
                  for (long var25 = 0L; var25 < class_1637.method_7327(this.field_1142); var25++) {
                     long var41 = var6 + var25 * class_1637.method_7303(this.field_1142);
                     long var52 = 2L * var25;
                     long var63 = 2L * class_1637.method_7327(this.field_1142) + 2L * var25;
                     var3.method_36114(var52, this.field_1146.method_36107(var41));
                     var3.method_36114(var52 + 1L, this.field_1146.method_36107(var41 + 1L));
                     var3.method_36114(var63, this.field_1146.method_36107(var41 + 2L));
                     var3.method_36114(var63 + 1L, this.field_1146.method_36107(var41 + 3L));
                  }

                  class_1637.method_7323(this.field_1142).method_15033(var3, 0L, this.field_1145);
                  class_1637.method_7323(this.field_1142).method_15033(var3, 2L * class_1637.method_7327(this.field_1142), this.field_1145);

                  for (long var26 = 0L; var26 < class_1637.method_7327(this.field_1142); var26++) {
                     long var42 = var6 + var26 * class_1637.method_7303(this.field_1142);
                     long var53 = 2L * var26;
                     long var64 = 2L * class_1637.method_7327(this.field_1142) + 2L * var26;
                     this.field_1146.method_36114(var42, var3.method_36107(var53));
                     this.field_1146.method_36114(var42 + 1L, var3.method_36107(var53 + 1L));
                     this.field_1146.method_36114(var42 + 2L, var3.method_36107(var64));
                     this.field_1146.method_36114(var42 + 3L, var3.method_36107(var64 + 1L));
                  }
               }
            } else {
               for (long var24 = 0L; var24 < class_1637.method_7343(this.field_1142); var24 += 8L) {
                  for (long var10 = 0L; var10 < class_1637.method_7327(this.field_1142); var10++) {
                     long var12 = var6 + var10 * class_1637.method_7303(this.field_1142) + var24;
                     long var14 = 2L * var10;
                     long var16 = 2L * class_1637.method_7327(this.field_1142) + 2L * var10;
                     long var18 = var16 + 2L * class_1637.method_7327(this.field_1142);
                     long var20 = var18 + 2L * class_1637.method_7327(this.field_1142);
                     var3.method_36114(var14, this.field_1146.method_36107(var12));
                     var3.method_36114(var14 + 1L, this.field_1146.method_36107(var12 + 1L));
                     var3.method_36114(var16, this.field_1146.method_36107(var12 + 2L));
                     var3.method_36114(var16 + 1L, this.field_1146.method_36107(var12 + 3L));
                     var3.method_36114(var18, this.field_1146.method_36107(var12 + 4L));
                     var3.method_36114(var18 + 1L, this.field_1146.method_36107(var12 + 5L));
                     var3.method_36114(var20, this.field_1146.method_36107(var12 + 6L));
                     var3.method_36114(var20 + 1L, this.field_1146.method_36107(var12 + 7L));
                  }

                  class_1637.method_7323(this.field_1142).method_15033(var3, 0L, this.field_1145);
                  class_1637.method_7323(this.field_1142).method_15033(var3, 2L * class_1637.method_7327(this.field_1142), this.field_1145);
                  class_1637.method_7323(this.field_1142).method_15033(var3, 4L * class_1637.method_7327(this.field_1142), this.field_1145);
                  class_1637.method_7323(this.field_1142).method_15033(var3, 6L * class_1637.method_7327(this.field_1142), this.field_1145);

                  for (long var37 = 0L; var37 < class_1637.method_7327(this.field_1142); var37++) {
                     long var40 = var6 + var37 * class_1637.method_7303(this.field_1142) + var24;
                     long var51 = 2L * var37;
                     long var62 = 2L * class_1637.method_7327(this.field_1142) + 2L * var37;
                     long var69 = var62 + 2L * class_1637.method_7327(this.field_1142);
                     long var72 = var69 + 2L * class_1637.method_7327(this.field_1142);
                     this.field_1146.method_36114(var40, var3.method_36107(var51));
                     this.field_1146.method_36114(var40 + 1L, var3.method_36107(var51 + 1L));
                     this.field_1146.method_36114(var40 + 2L, var3.method_36107(var62));
                     this.field_1146.method_36114(var40 + 3L, var3.method_36107(var62 + 1L));
                     this.field_1146.method_36114(var40 + 4L, var3.method_36107(var69));
                     this.field_1146.method_36114(var40 + 5L, var3.method_36107(var69 + 1L));
                     this.field_1146.method_36114(var40 + 6L, var3.method_36107(var72));
                     this.field_1146.method_36114(var40 + 7L, var3.method_36107(var72 + 1L));
                  }
               }
            }

            if (this.field_1144 != 0L) {
               for (long var29 = 0L; var29 < class_1637.method_7327(this.field_1142); var29++) {
                  class_1637.method_7310(this.field_1142)
                     .method_15020(this.field_1146, var6 + var29 * class_1637.method_7303(this.field_1142), this.field_1145);
               }
            }
         }
      } else {
         for (long var22 = this.field_1140; var22 < class_1637.method_7293(this.field_1142); var22 += (long)this.field_1141) {
            long var23 = var22 * class_1637.method_7342(this.field_1142);
            if (this.field_1144 != 0L) {
               for (long var31 = 0L; var31 < class_1637.method_7327(this.field_1142); var31++) {
                  class_1637.method_7310(this.field_1142).method_15043(this.field_1146, var23 + var31 * class_1637.method_7303(this.field_1142));
               }
            } else {
               for (long var30 = 0L; var30 < class_1637.method_7327(this.field_1142); var30++) {
                  class_1637.method_7310(this.field_1142).method_15027(this.field_1146, var23 + var30 * class_1637.method_7303(this.field_1142));
               }
            }

            if (class_1637.method_7343(this.field_1142) <= 4L) {
               if (class_1637.method_7343(this.field_1142) != 4L) {
                  if (class_1637.method_7343(this.field_1142) == 2L) {
                     for (long var35 = 0L; var35 < class_1637.method_7327(this.field_1142); var35++) {
                        long var49 = var23 + var35 * class_1637.method_7303(this.field_1142);
                        long var60 = 2L * var35;
                        var3.method_36114(var60, this.field_1146.method_36107(var49));
                        var3.method_36114(var60 + 1L, this.field_1146.method_36107(var49 + 1L));
                     }

                     class_1637.method_7323(this.field_1142).method_15027(var3, 0L);

                     for (long var36 = 0L; var36 < class_1637.method_7327(this.field_1142); var36++) {
                        long var50 = var23 + var36 * class_1637.method_7303(this.field_1142);
                        long var61 = 2L * var36;
                        this.field_1146.method_36114(var50, var3.method_36107(var61));
                        this.field_1146.method_36114(var50 + 1L, var3.method_36107(var61 + 1L));
                     }
                  }
               } else {
                  for (long var33 = 0L; var33 < class_1637.method_7327(this.field_1142); var33++) {
                     long var47 = var23 + var33 * class_1637.method_7303(this.field_1142);
                     long var58 = 2L * var33;
                     long var67 = 2L * class_1637.method_7327(this.field_1142) + 2L * var33;
                     var3.method_36114(var58, this.field_1146.method_36107(var47));
                     var3.method_36114(var58 + 1L, this.field_1146.method_36107(var47 + 1L));
                     var3.method_36114(var67, this.field_1146.method_36107(var47 + 2L));
                     var3.method_36114(var67 + 1L, this.field_1146.method_36107(var47 + 3L));
                  }

                  class_1637.method_7323(this.field_1142).method_15027(var3, 0L);
                  class_1637.method_7323(this.field_1142).method_15027(var3, 2L * class_1637.method_7327(this.field_1142));

                  for (long var34 = 0L; var34 < class_1637.method_7327(this.field_1142); var34++) {
                     long var48 = var23 + var34 * class_1637.method_7303(this.field_1142);
                     long var59 = 2L * var34;
                     long var68 = 2L * class_1637.method_7327(this.field_1142) + 2L * var34;
                     this.field_1146.method_36114(var48, var3.method_36107(var59));
                     this.field_1146.method_36114(var48 + 1L, var3.method_36107(var59 + 1L));
                     this.field_1146.method_36114(var48 + 2L, var3.method_36107(var68));
                     this.field_1146.method_36114(var48 + 3L, var3.method_36107(var68 + 1L));
                  }
               }
            } else {
               for (long var32 = 0L; var32 < class_1637.method_7343(this.field_1142); var32 += 8L) {
                  for (long var38 = 0L; var38 < class_1637.method_7327(this.field_1142); var38++) {
                     long var45 = var23 + var38 * class_1637.method_7303(this.field_1142) + var32;
                     long var56 = 2L * var38;
                     long var65 = 2L * class_1637.method_7327(this.field_1142) + 2L * var38;
                     long var70 = var65 + 2L * class_1637.method_7327(this.field_1142);
                     long var73 = var70 + 2L * class_1637.method_7327(this.field_1142);
                     var3.method_36114(var56, this.field_1146.method_36107(var45));
                     var3.method_36114(var56 + 1L, this.field_1146.method_36107(var45 + 1L));
                     var3.method_36114(var65, this.field_1146.method_36107(var45 + 2L));
                     var3.method_36114(var65 + 1L, this.field_1146.method_36107(var45 + 3L));
                     var3.method_36114(var70, this.field_1146.method_36107(var45 + 4L));
                     var3.method_36114(var70 + 1L, this.field_1146.method_36107(var45 + 5L));
                     var3.method_36114(var73, this.field_1146.method_36107(var45 + 6L));
                     var3.method_36114(var73 + 1L, this.field_1146.method_36107(var45 + 7L));
                  }

                  class_1637.method_7323(this.field_1142).method_15027(var3, 0L);
                  class_1637.method_7323(this.field_1142).method_15027(var3, 2L * class_1637.method_7327(this.field_1142));
                  class_1637.method_7323(this.field_1142).method_15027(var3, 4L * class_1637.method_7327(this.field_1142));
                  class_1637.method_7323(this.field_1142).method_15027(var3, 6L * class_1637.method_7327(this.field_1142));

                  for (long var39 = 0L; var39 < class_1637.method_7327(this.field_1142); var39++) {
                     long var46 = var23 + var39 * class_1637.method_7303(this.field_1142) + var32;
                     long var57 = 2L * var39;
                     long var66 = 2L * class_1637.method_7327(this.field_1142) + 2L * var39;
                     long var71 = var66 + 2L * class_1637.method_7327(this.field_1142);
                     long var74 = var71 + 2L * class_1637.method_7327(this.field_1142);
                     this.field_1146.method_36114(var46, var3.method_36107(var57));
                     this.field_1146.method_36114(var46 + 1L, var3.method_36107(var57 + 1L));
                     this.field_1146.method_36114(var46 + 2L, var3.method_36107(var66));
                     this.field_1146.method_36114(var46 + 3L, var3.method_36107(var66 + 1L));
                     this.field_1146.method_36114(var46 + 4L, var3.method_36107(var71));
                     this.field_1146.method_36114(var46 + 5L, var3.method_36107(var71 + 1L));
                     this.field_1146.method_36114(var46 + 6L, var3.method_36107(var74));
                     this.field_1146.method_36114(var46 + 7L, var3.method_36107(var74 + 1L));
                  }
               }
            }
         }
      }
   }
}
