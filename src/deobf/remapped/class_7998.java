package remapped;

public class class_7998 implements Runnable {
   private static String[] field_40974;

   public class_7998(class_573 var1, long var2, int var4, long var5, int var7, class_1702 var8, boolean var9) {
      this.field_40972 = var1;
      this.field_40978 = var2;
      this.field_40973 = var4;
      this.field_40979 = var5;
      this.field_40975 = var7;
      this.field_40977 = var8;
      this.field_40976 = var9;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(this.field_40978);
      if (this.field_40973 != -1) {
         if (class_573.method_2735(this.field_40972) <= 2L) {
            if (class_573.method_2735(this.field_40972) == 2L) {
               for (long var4 = this.field_40979; var4 < class_573.method_2715(this.field_40972); var4 += (long)this.field_40975) {
                  long var6 = var4 * class_573.method_2726(this.field_40972);

                  for (long var8 = 0L; var8 < class_573.method_2725(this.field_40972); var8++) {
                     long var12 = var8 * class_573.method_2731(this.field_40972) + var6;
                     var3.method_36114(var8, this.field_40977.method_36107(var12));
                     var3.method_36114(class_573.method_2725(this.field_40972) + var8, this.field_40977.method_36107(var12 + 1L));
                  }

                  class_573.method_2710(this.field_40972).method_44818(var3, 0L, this.field_40976);
                  class_573.method_2710(this.field_40972).method_44818(var3, class_573.method_2725(this.field_40972), this.field_40976);

                  for (long var22 = 0L; var22 < class_573.method_2725(this.field_40972); var22++) {
                     long var30 = var22 * class_573.method_2731(this.field_40972) + var6;
                     this.field_40977.method_36114(var30, var3.method_36107(var22));
                     this.field_40977.method_36114(var30 + 1L, var3.method_36107(class_573.method_2725(this.field_40972) + var22));
                  }
               }
            }
         } else {
            for (long var16 = this.field_40979; var16 < class_573.method_2715(this.field_40972); var16 += (long)this.field_40975) {
               long var19 = var16 * class_573.method_2726(this.field_40972);

               for (long var23 = 0L; var23 < class_573.method_2735(this.field_40972); var23 += 4L) {
                  for (long var10 = 0L; var10 < class_573.method_2725(this.field_40972); var10++) {
                     long var31 = var10 * class_573.method_2731(this.field_40972) + var19 + var23;
                     long var14 = class_573.method_2725(this.field_40972) + var10;
                     var3.method_36114(var10, this.field_40977.method_36107(var31));
                     var3.method_36114(var14, this.field_40977.method_36107(var31 + 1L));
                     var3.method_36114(var14 + class_573.method_2725(this.field_40972), this.field_40977.method_36107(var31 + 2L));
                     var3.method_36114(var14 + 2L * class_573.method_2725(this.field_40972), this.field_40977.method_36107(var31 + 3L));
                  }

                  class_573.method_2710(this.field_40972).method_44818(var3, 0L, this.field_40976);
                  class_573.method_2710(this.field_40972).method_44818(var3, class_573.method_2725(this.field_40972), this.field_40976);
                  class_573.method_2710(this.field_40972).method_44818(var3, 2L * class_573.method_2725(this.field_40972), this.field_40976);
                  class_573.method_2710(this.field_40972).method_44818(var3, 3L * class_573.method_2725(this.field_40972), this.field_40976);

                  for (long var27 = 0L; var27 < class_573.method_2725(this.field_40972); var27++) {
                     long var32 = var27 * class_573.method_2731(this.field_40972) + var19 + var23;
                     long var37 = class_573.method_2725(this.field_40972) + var27;
                     this.field_40977.method_36114(var32, var3.method_36107(var27));
                     this.field_40977.method_36114(var32 + 1L, var3.method_36107(var37));
                     this.field_40977.method_36114(var32 + 2L, var3.method_36107(var37 + class_573.method_2725(this.field_40972)));
                     this.field_40977.method_36114(var32 + 3L, var3.method_36107(var37 + 2L * class_573.method_2725(this.field_40972)));
                  }
               }
            }
         }
      } else if (class_573.method_2735(this.field_40972) <= 2L) {
         if (class_573.method_2735(this.field_40972) == 2L) {
            for (long var17 = this.field_40979; var17 < class_573.method_2715(this.field_40972); var17 += (long)this.field_40975) {
               long var20 = var17 * class_573.method_2726(this.field_40972);

               for (long var24 = 0L; var24 < class_573.method_2725(this.field_40972); var24++) {
                  long var33 = var24 * class_573.method_2731(this.field_40972) + var20;
                  var3.method_36114(var24, this.field_40977.method_36107(var33));
                  var3.method_36114(class_573.method_2725(this.field_40972) + var24, this.field_40977.method_36107(var33 + 1L));
               }

               class_573.method_2710(this.field_40972).method_44813(var3, 0L, this.field_40976);
               class_573.method_2710(this.field_40972).method_44813(var3, class_573.method_2725(this.field_40972), this.field_40976);

               for (long var25 = 0L; var25 < class_573.method_2725(this.field_40972); var25++) {
                  long var34 = var25 * class_573.method_2731(this.field_40972) + var20;
                  this.field_40977.method_36114(var34, var3.method_36107(var25));
                  this.field_40977.method_36114(var34 + 1L, var3.method_36107(class_573.method_2725(this.field_40972) + var25));
               }
            }
         }
      } else {
         for (long var18 = this.field_40979; var18 < class_573.method_2715(this.field_40972); var18 += (long)this.field_40975) {
            long var21 = var18 * class_573.method_2726(this.field_40972);

            for (long var26 = 0L; var26 < class_573.method_2735(this.field_40972); var26 += 4L) {
               for (long var28 = 0L; var28 < class_573.method_2725(this.field_40972); var28++) {
                  long var35 = var28 * class_573.method_2731(this.field_40972) + var21 + var26;
                  long var38 = class_573.method_2725(this.field_40972) + var28;
                  var3.method_36114(var28, this.field_40977.method_36107(var35));
                  var3.method_36114(var38, this.field_40977.method_36107(var35 + 1L));
                  var3.method_36114(var38 + class_573.method_2725(this.field_40972), this.field_40977.method_36107(var35 + 2L));
                  var3.method_36114(var38 + 2L * class_573.method_2725(this.field_40972), this.field_40977.method_36107(var35 + 3L));
               }

               class_573.method_2710(this.field_40972).method_44813(var3, 0L, this.field_40976);
               class_573.method_2710(this.field_40972).method_44813(var3, class_573.method_2725(this.field_40972), this.field_40976);
               class_573.method_2710(this.field_40972).method_44813(var3, 2L * class_573.method_2725(this.field_40972), this.field_40976);
               class_573.method_2710(this.field_40972).method_44813(var3, 3L * class_573.method_2725(this.field_40972), this.field_40976);

               for (long var29 = 0L; var29 < class_573.method_2725(this.field_40972); var29++) {
                  long var36 = var29 * class_573.method_2731(this.field_40972) + var21 + var26;
                  long var39 = class_573.method_2725(this.field_40972) + var29;
                  this.field_40977.method_36114(var36, var3.method_36107(var29));
                  this.field_40977.method_36114(var36 + 1L, var3.method_36107(var39));
                  this.field_40977.method_36114(var36 + 2L, var3.method_36107(var39 + class_573.method_2725(this.field_40972)));
                  this.field_40977.method_36114(var36 + 3L, var3.method_36107(var39 + 2L * class_573.method_2725(this.field_40972)));
               }
            }
         }
      }
   }
}
