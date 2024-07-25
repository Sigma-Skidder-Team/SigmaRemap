package remapped;

public class class_1610 implements Runnable {
   private static String[] field_8356;

   public class_1610(class_2841 var1, long var2, int var4, long var5, int var7, class_4330 var8, boolean var9) {
      this.field_8361 = var1;
      this.field_8360 = var2;
      this.field_8355 = var4;
      this.field_8358 = var5;
      this.field_8359 = var7;
      this.field_8357 = var8;
      this.field_8354 = var9;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(this.field_8360);
      if (this.field_8355 != -1) {
         for (long var4 = this.field_8358; var4 < class_2841.method_12907(this.field_8361); var4 += (long)this.field_8359) {
            long var6 = var4 * class_2841.method_12906(this.field_8361);

            for (long var8 = 0L; var8 < class_2841.method_12912(this.field_8361); var8++) {
               class_2841.method_12923(this.field_8361).method_21129(this.field_8357, var6 + var8 * class_2841.method_12927(this.field_8361), this.field_8354);
            }

            if (class_2841.method_12932(this.field_8361) <= 2L) {
               if (class_2841.method_12932(this.field_8361) == 2L) {
                  for (long var19 = 0L; var19 < class_2841.method_12912(this.field_8361); var19++) {
                     long var29 = var6 + var19 * class_2841.method_12927(this.field_8361);
                     var3.method_36123(var19, this.field_8357.method_36133(var29));
                     var3.method_36123(class_2841.method_12912(this.field_8361) + var19, this.field_8357.method_36133(var29 + 1L));
                  }

                  class_2841.method_12921(this.field_8361).method_21129(var3, 0L, this.field_8354);
                  class_2841.method_12921(this.field_8361).method_21129(var3, class_2841.method_12912(this.field_8361), this.field_8354);

                  for (long var20 = 0L; var20 < class_2841.method_12912(this.field_8361); var20++) {
                     long var30 = var6 + var20 * class_2841.method_12927(this.field_8361);
                     this.field_8357.method_36123(var30, var3.method_36133(var20));
                     this.field_8357.method_36123(var30 + 1L, var3.method_36133(class_2841.method_12912(this.field_8361) + var20));
                  }
               }
            } else {
               for (long var18 = 0L; var18 < class_2841.method_12932(this.field_8361); var18 += 4L) {
                  for (long var10 = 0L; var10 < class_2841.method_12912(this.field_8361); var10++) {
                     long var12 = var6 + var10 * class_2841.method_12927(this.field_8361) + var18;
                     long var14 = class_2841.method_12912(this.field_8361) + var10;
                     var3.method_36123(var10, this.field_8357.method_36133(var12));
                     var3.method_36123(var14, this.field_8357.method_36133(var12 + 1L));
                     var3.method_36123(var14 + class_2841.method_12912(this.field_8361), this.field_8357.method_36133(var12 + 2L));
                     var3.method_36123(var14 + 2L * class_2841.method_12912(this.field_8361), this.field_8357.method_36133(var12 + 3L));
                  }

                  class_2841.method_12921(this.field_8361).method_21129(var3, 0L, this.field_8354);
                  class_2841.method_12921(this.field_8361).method_21129(var3, class_2841.method_12912(this.field_8361), this.field_8354);
                  class_2841.method_12921(this.field_8361).method_21129(var3, 2L * class_2841.method_12912(this.field_8361), this.field_8354);
                  class_2841.method_12921(this.field_8361).method_21129(var3, 3L * class_2841.method_12912(this.field_8361), this.field_8354);

                  for (long var25 = 0L; var25 < class_2841.method_12912(this.field_8361); var25++) {
                     long var28 = var6 + var25 * class_2841.method_12927(this.field_8361) + var18;
                     long var35 = class_2841.method_12912(this.field_8361) + var25;
                     this.field_8357.method_36123(var28, var3.method_36133(var25));
                     this.field_8357.method_36123(var28 + 1L, var3.method_36133(var35));
                     this.field_8357.method_36123(var28 + 2L, var3.method_36133(var35 + class_2841.method_12912(this.field_8361)));
                     this.field_8357.method_36123(var28 + 3L, var3.method_36133(var35 + 2L * class_2841.method_12912(this.field_8361)));
                  }
               }
            }
         }
      } else {
         for (long var16 = this.field_8358; var16 < class_2841.method_12907(this.field_8361); var16 += (long)this.field_8359) {
            long var17 = var16 * class_2841.method_12906(this.field_8361);

            for (long var21 = 0L; var21 < class_2841.method_12912(this.field_8361); var21++) {
               class_2841.method_12923(this.field_8361)
                  .method_21137(this.field_8357, var17 + var21 * class_2841.method_12927(this.field_8361), this.field_8354);
            }

            if (class_2841.method_12932(this.field_8361) <= 2L) {
               if (class_2841.method_12932(this.field_8361) == 2L) {
                  for (long var23 = 0L; var23 < class_2841.method_12912(this.field_8361); var23++) {
                     long var33 = var17 + var23 * class_2841.method_12927(this.field_8361);
                     var3.method_36123(var23, this.field_8357.method_36133(var33));
                     var3.method_36123(class_2841.method_12912(this.field_8361) + var23, this.field_8357.method_36133(var33 + 1L));
                  }

                  class_2841.method_12921(this.field_8361).method_21137(var3, 0L, this.field_8354);
                  class_2841.method_12921(this.field_8361).method_21137(var3, class_2841.method_12912(this.field_8361), this.field_8354);

                  for (long var24 = 0L; var24 < class_2841.method_12912(this.field_8361); var24++) {
                     long var34 = var17 + var24 * class_2841.method_12927(this.field_8361);
                     this.field_8357.method_36123(var34, var3.method_36133(var24));
                     this.field_8357.method_36123(var34 + 1L, var3.method_36133(class_2841.method_12912(this.field_8361) + var24));
                  }
               }
            } else {
               for (long var22 = 0L; var22 < class_2841.method_12932(this.field_8361); var22 += 4L) {
                  for (long var26 = 0L; var26 < class_2841.method_12912(this.field_8361); var26++) {
                     long var31 = var17 + var26 * class_2841.method_12927(this.field_8361) + var22;
                     long var36 = class_2841.method_12912(this.field_8361) + var26;
                     var3.method_36123(var26, this.field_8357.method_36133(var31));
                     var3.method_36123(var36, this.field_8357.method_36133(var31 + 1L));
                     var3.method_36123(var36 + class_2841.method_12912(this.field_8361), this.field_8357.method_36133(var31 + 2L));
                     var3.method_36123(var36 + 2L * class_2841.method_12912(this.field_8361), this.field_8357.method_36133(var31 + 3L));
                  }

                  class_2841.method_12921(this.field_8361).method_21137(var3, 0L, this.field_8354);
                  class_2841.method_12921(this.field_8361).method_21137(var3, class_2841.method_12912(this.field_8361), this.field_8354);
                  class_2841.method_12921(this.field_8361).method_21137(var3, 2L * class_2841.method_12912(this.field_8361), this.field_8354);
                  class_2841.method_12921(this.field_8361).method_21137(var3, 3L * class_2841.method_12912(this.field_8361), this.field_8354);

                  for (long var27 = 0L; var27 < class_2841.method_12912(this.field_8361); var27++) {
                     long var32 = var17 + var27 * class_2841.method_12927(this.field_8361) + var22;
                     long var37 = class_2841.method_12912(this.field_8361) + var27;
                     this.field_8357.method_36123(var32, var3.method_36133(var27));
                     this.field_8357.method_36123(var32 + 1L, var3.method_36133(var37));
                     this.field_8357.method_36123(var32 + 2L, var3.method_36133(var37 + class_2841.method_12912(this.field_8361)));
                     this.field_8357.method_36123(var32 + 3L, var3.method_36133(var37 + 2L * class_2841.method_12912(this.field_8361)));
                  }
               }
            }
         }
      }
   }
}
