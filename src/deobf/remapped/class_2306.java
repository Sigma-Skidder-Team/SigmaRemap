package remapped;

public class class_2306 implements Runnable {
   private static String[] field_11510;

   public class_2306(class_6056 var1, long var2, int var4, long var5, int var7, class_1702 var8, boolean var9) {
      this.field_11509 = var1;
      this.field_11507 = var2;
      this.field_11505 = var4;
      this.field_11508 = var5;
      this.field_11503 = var7;
      this.field_11504 = var8;
      this.field_11506 = var9;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(this.field_11507);
      if (this.field_11505 != -1) {
         if (class_6056.method_27670(this.field_11509) <= 2L) {
            if (class_6056.method_27670(this.field_11509) == 2L) {
               for (long var4 = this.field_11508; var4 < class_6056.method_27677(this.field_11509); var4 += (long)this.field_11503) {
                  long var6 = var4 * class_6056.method_27672(this.field_11509);

                  for (long var8 = 0L; var8 < class_6056.method_27678(this.field_11509); var8++) {
                     long var12 = var8 * class_6056.method_27679(this.field_11509) + var6;
                     var3.method_36114(var8, this.field_11504.method_36107(var12));
                     var3.method_36114(class_6056.method_27678(this.field_11509) + var8, this.field_11504.method_36107(var12 + 1L));
                  }

                  class_6056.method_27659(this.field_11509).method_31280(var3, 0L, this.field_11506);
                  class_6056.method_27659(this.field_11509).method_31280(var3, class_6056.method_27678(this.field_11509), this.field_11506);

                  for (long var22 = 0L; var22 < class_6056.method_27678(this.field_11509); var22++) {
                     long var30 = var22 * class_6056.method_27679(this.field_11509) + var6;
                     this.field_11504.method_36114(var30, var3.method_36107(var22));
                     this.field_11504.method_36114(var30 + 1L, var3.method_36107(class_6056.method_27678(this.field_11509) + var22));
                  }
               }
            }
         } else {
            for (long var16 = this.field_11508; var16 < class_6056.method_27677(this.field_11509); var16 += (long)this.field_11503) {
               long var19 = var16 * class_6056.method_27672(this.field_11509);

               for (long var23 = 0L; var23 < class_6056.method_27670(this.field_11509); var23 += 4L) {
                  for (long var10 = 0L; var10 < class_6056.method_27678(this.field_11509); var10++) {
                     long var31 = var10 * class_6056.method_27679(this.field_11509) + var19 + var23;
                     long var14 = class_6056.method_27678(this.field_11509) + var10;
                     var3.method_36114(var10, this.field_11504.method_36107(var31));
                     var3.method_36114(var14, this.field_11504.method_36107(var31 + 1L));
                     var3.method_36114(var14 + class_6056.method_27678(this.field_11509), this.field_11504.method_36107(var31 + 2L));
                     var3.method_36114(var14 + 2L * class_6056.method_27678(this.field_11509), this.field_11504.method_36107(var31 + 3L));
                  }

                  class_6056.method_27659(this.field_11509).method_31280(var3, 0L, this.field_11506);
                  class_6056.method_27659(this.field_11509).method_31280(var3, class_6056.method_27678(this.field_11509), this.field_11506);
                  class_6056.method_27659(this.field_11509).method_31280(var3, 2L * class_6056.method_27678(this.field_11509), this.field_11506);
                  class_6056.method_27659(this.field_11509).method_31280(var3, 3L * class_6056.method_27678(this.field_11509), this.field_11506);

                  for (long var27 = 0L; var27 < class_6056.method_27678(this.field_11509); var27++) {
                     long var32 = var27 * class_6056.method_27679(this.field_11509) + var19 + var23;
                     long var37 = class_6056.method_27678(this.field_11509) + var27;
                     this.field_11504.method_36114(var32, var3.method_36107(var27));
                     this.field_11504.method_36114(var32 + 1L, var3.method_36107(var37));
                     this.field_11504.method_36114(var32 + 2L, var3.method_36107(var37 + class_6056.method_27678(this.field_11509)));
                     this.field_11504.method_36114(var32 + 3L, var3.method_36107(var37 + 2L * class_6056.method_27678(this.field_11509)));
                  }
               }
            }
         }
      } else if (class_6056.method_27670(this.field_11509) <= 2L) {
         if (class_6056.method_27670(this.field_11509) == 2L) {
            for (long var17 = this.field_11508; var17 < class_6056.method_27677(this.field_11509); var17 += (long)this.field_11503) {
               long var20 = var17 * class_6056.method_27672(this.field_11509);

               for (long var24 = 0L; var24 < class_6056.method_27678(this.field_11509); var24++) {
                  long var33 = var24 * class_6056.method_27679(this.field_11509) + var20;
                  var3.method_36114(var24, this.field_11504.method_36107(var33));
                  var3.method_36114(class_6056.method_27678(this.field_11509) + var24, this.field_11504.method_36107(var33 + 1L));
               }

               class_6056.method_27659(this.field_11509).method_31274(var3, 0L);
               class_6056.method_27659(this.field_11509).method_31274(var3, class_6056.method_27678(this.field_11509));

               for (long var25 = 0L; var25 < class_6056.method_27678(this.field_11509); var25++) {
                  long var34 = var25 * class_6056.method_27679(this.field_11509) + var20;
                  this.field_11504.method_36114(var34, var3.method_36107(var25));
                  this.field_11504.method_36114(var34 + 1L, var3.method_36107(class_6056.method_27678(this.field_11509) + var25));
               }
            }
         }
      } else {
         for (long var18 = this.field_11508; var18 < class_6056.method_27677(this.field_11509); var18 += (long)this.field_11503) {
            long var21 = var18 * class_6056.method_27672(this.field_11509);

            for (long var26 = 0L; var26 < class_6056.method_27670(this.field_11509); var26 += 4L) {
               for (long var28 = 0L; var28 < class_6056.method_27678(this.field_11509); var28++) {
                  long var35 = var28 * class_6056.method_27679(this.field_11509) + var21 + var26;
                  long var38 = class_6056.method_27678(this.field_11509) + var28;
                  var3.method_36114(var28, this.field_11504.method_36107(var35));
                  var3.method_36114(var38, this.field_11504.method_36107(var35 + 1L));
                  var3.method_36114(var38 + class_6056.method_27678(this.field_11509), this.field_11504.method_36107(var35 + 2L));
                  var3.method_36114(var38 + 2L * class_6056.method_27678(this.field_11509), this.field_11504.method_36107(var35 + 3L));
               }

               class_6056.method_27659(this.field_11509).method_31274(var3, 0L);
               class_6056.method_27659(this.field_11509).method_31274(var3, class_6056.method_27678(this.field_11509));
               class_6056.method_27659(this.field_11509).method_31274(var3, 2L * class_6056.method_27678(this.field_11509));
               class_6056.method_27659(this.field_11509).method_31274(var3, 3L * class_6056.method_27678(this.field_11509));

               for (long var29 = 0L; var29 < class_6056.method_27678(this.field_11509); var29++) {
                  long var36 = var29 * class_6056.method_27679(this.field_11509) + var21 + var26;
                  long var39 = class_6056.method_27678(this.field_11509) + var29;
                  this.field_11504.method_36114(var36, var3.method_36107(var29));
                  this.field_11504.method_36114(var36 + 1L, var3.method_36107(var39));
                  this.field_11504.method_36114(var36 + 2L, var3.method_36107(var39 + class_6056.method_27678(this.field_11509)));
                  this.field_11504.method_36114(var36 + 3L, var3.method_36107(var39 + 2L * class_6056.method_27678(this.field_11509)));
               }
            }
         }
      }
   }
}
