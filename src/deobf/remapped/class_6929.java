package remapped;

public class class_6929 implements Runnable {
   private static String[] field_35597;

   public class_6929(class_6056 var1, long var2, int var4, long var5, int var7, class_1702 var8, boolean var9) {
      this.field_35599 = var1;
      this.field_35602 = var2;
      this.field_35600 = var4;
      this.field_35596 = var5;
      this.field_35595 = var7;
      this.field_35598 = var8;
      this.field_35601 = var9;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(this.field_35602);
      if (this.field_35600 != -1) {
         for (long var4 = this.field_35596; var4 < class_6056.method_27678(this.field_35599); var4 += (long)this.field_35595) {
            long var6 = var4 * (long)class_6056.method_27649(this.field_35599);

            for (long var8 = 0L; var8 < class_6056.method_27677(this.field_35599); var8++) {
               class_6056.method_27665(this.field_35599)
                  .method_31280(this.field_35598, var6 + var8 * (long)class_6056.method_27661(this.field_35599), this.field_35601);
            }

            if (class_6056.method_27670(this.field_35599) <= 2L) {
               if (class_6056.method_27670(this.field_35599) == 2L) {
                  for (long var19 = 0L; var19 < class_6056.method_27677(this.field_35599); var19++) {
                     long var29 = var6 + var19 * (long)class_6056.method_27661(this.field_35599);
                     var3.method_36114(var19, this.field_35598.method_36107(var29));
                     var3.method_36114(class_6056.method_27677(this.field_35599) + var19, this.field_35598.method_36107(var29 + 1L));
                  }

                  class_6056.method_27680(this.field_35599).method_31280(var3, 0L, this.field_35601);
                  class_6056.method_27680(this.field_35599).method_31280(var3, class_6056.method_27677(this.field_35599), this.field_35601);

                  for (long var20 = 0L; var20 < class_6056.method_27677(this.field_35599); var20++) {
                     long var30 = var6 + var20 * (long)class_6056.method_27661(this.field_35599);
                     this.field_35598.method_36114(var30, var3.method_36107(var20));
                     this.field_35598.method_36114(var30 + 1L, var3.method_36107(class_6056.method_27677(this.field_35599) + var20));
                  }
               }
            } else {
               for (long var18 = 0L; var18 < class_6056.method_27670(this.field_35599); var18 += 4L) {
                  for (long var10 = 0L; var10 < class_6056.method_27677(this.field_35599); var10++) {
                     long var12 = var6 + var10 * (long)class_6056.method_27661(this.field_35599) + var18;
                     long var14 = class_6056.method_27677(this.field_35599) + var10;
                     var3.method_36114(var10, this.field_35598.method_36107(var12));
                     var3.method_36114(var14, this.field_35598.method_36107(var12 + 1L));
                     var3.method_36114(var14 + class_6056.method_27677(this.field_35599), this.field_35598.method_36107(var12 + 2L));
                     var3.method_36114(var14 + 2L * class_6056.method_27677(this.field_35599), this.field_35598.method_36107(var12 + 3L));
                  }

                  class_6056.method_27680(this.field_35599).method_31280(var3, 0L, this.field_35601);
                  class_6056.method_27680(this.field_35599).method_31280(var3, class_6056.method_27677(this.field_35599), this.field_35601);
                  class_6056.method_27680(this.field_35599).method_31280(var3, 2L * class_6056.method_27677(this.field_35599), this.field_35601);
                  class_6056.method_27680(this.field_35599).method_31280(var3, 3L * class_6056.method_27677(this.field_35599), this.field_35601);

                  for (long var25 = 0L; var25 < class_6056.method_27677(this.field_35599); var25++) {
                     long var28 = var6 + var25 * (long)class_6056.method_27661(this.field_35599) + var18;
                     long var35 = class_6056.method_27677(this.field_35599) + var25;
                     this.field_35598.method_36114(var28, var3.method_36107(var25));
                     this.field_35598.method_36114(var28 + 1L, var3.method_36107(var35));
                     this.field_35598.method_36114(var28 + 2L, var3.method_36107(var35 + class_6056.method_27677(this.field_35599)));
                     this.field_35598.method_36114(var28 + 3L, var3.method_36107(var35 + 2L * class_6056.method_27677(this.field_35599)));
                  }
               }
            }
         }
      } else {
         for (long var16 = this.field_35596; var16 < class_6056.method_27678(this.field_35599); var16 += (long)this.field_35595) {
            long var17 = var16 * (long)class_6056.method_27649(this.field_35599);

            for (long var21 = 0L; var21 < class_6056.method_27677(this.field_35599); var21++) {
               class_6056.method_27665(this.field_35599).method_31274(this.field_35598, var17 + var21 * (long)class_6056.method_27661(this.field_35599));
            }

            if (class_6056.method_27670(this.field_35599) <= 2L) {
               if (class_6056.method_27670(this.field_35599) == 2L) {
                  for (long var23 = 0L; var23 < class_6056.method_27677(this.field_35599); var23++) {
                     long var33 = var17 + var23 * (long)class_6056.method_27661(this.field_35599);
                     var3.method_36114(var23, this.field_35598.method_36107(var33));
                     var3.method_36114(class_6056.method_27677(this.field_35599) + var23, this.field_35598.method_36107(var33 + 1L));
                  }

                  class_6056.method_27680(this.field_35599).method_31274(var3, 0L);
                  class_6056.method_27680(this.field_35599).method_31274(var3, class_6056.method_27677(this.field_35599));

                  for (long var24 = 0L; var24 < class_6056.method_27677(this.field_35599); var24++) {
                     long var34 = var17 + var24 * (long)class_6056.method_27661(this.field_35599);
                     this.field_35598.method_36114(var34, var3.method_36107(var24));
                     this.field_35598.method_36114(var34 + 1L, var3.method_36107(class_6056.method_27677(this.field_35599) + var24));
                  }
               }
            } else {
               for (long var22 = 0L; var22 < class_6056.method_27670(this.field_35599); var22 += 4L) {
                  for (long var26 = 0L; var26 < class_6056.method_27677(this.field_35599); var26++) {
                     long var31 = var17 + var26 * (long)class_6056.method_27661(this.field_35599) + var22;
                     long var36 = class_6056.method_27677(this.field_35599) + var26;
                     var3.method_36114(var26, this.field_35598.method_36107(var31));
                     var3.method_36114(var36, this.field_35598.method_36107(var31 + 1L));
                     var3.method_36114(var36 + class_6056.method_27677(this.field_35599), this.field_35598.method_36107(var31 + 2L));
                     var3.method_36114(var36 + 2L * class_6056.method_27677(this.field_35599), this.field_35598.method_36107(var31 + 3L));
                  }

                  class_6056.method_27680(this.field_35599).method_31274(var3, 0L);
                  class_6056.method_27680(this.field_35599).method_31274(var3, class_6056.method_27677(this.field_35599));
                  class_6056.method_27680(this.field_35599).method_31274(var3, 2L * class_6056.method_27677(this.field_35599));
                  class_6056.method_27680(this.field_35599).method_31274(var3, 3L * class_6056.method_27677(this.field_35599));

                  for (long var27 = 0L; var27 < class_6056.method_27677(this.field_35599); var27++) {
                     long var32 = var17 + var27 * (long)class_6056.method_27661(this.field_35599) + var22;
                     long var37 = class_6056.method_27677(this.field_35599) + var27;
                     this.field_35598.method_36114(var32, var3.method_36107(var27));
                     this.field_35598.method_36114(var32 + 1L, var3.method_36107(var37));
                     this.field_35598.method_36114(var32 + 2L, var3.method_36107(var37 + class_6056.method_27677(this.field_35599)));
                     this.field_35598.method_36114(var32 + 3L, var3.method_36107(var37 + 2L * class_6056.method_27677(this.field_35599)));
                  }
               }
            }
         }
      }
   }
}
