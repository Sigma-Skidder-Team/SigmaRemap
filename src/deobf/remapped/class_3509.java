package remapped;

public class class_3509 implements Runnable {
   private static String[] field_17191;

   public class_3509(class_2841 var1, long var2, int var4, long var5, int var7, class_4330 var8, boolean var9) {
      this.field_17194 = var1;
      this.field_17193 = var2;
      this.field_17189 = var4;
      this.field_17195 = var5;
      this.field_17190 = var7;
      this.field_17196 = var8;
      this.field_17192 = var9;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(this.field_17193);
      if (this.field_17189 != -1) {
         if (class_2841.method_12932(this.field_17194) <= 2L) {
            if (class_2841.method_12932(this.field_17194) == 2L) {
               for (long var4 = this.field_17195; var4 < class_2841.method_12912(this.field_17194); var4 += (long)this.field_17190) {
                  long var6 = var4 * class_2841.method_12927(this.field_17194);

                  for (long var8 = 0L; var8 < class_2841.method_12907(this.field_17194); var8++) {
                     long var12 = var8 * class_2841.method_12906(this.field_17194) + var6;
                     var3.method_36123(var8, this.field_17196.method_36133(var12));
                     var3.method_36123(class_2841.method_12907(this.field_17194) + var8, this.field_17196.method_36133(var12 + 1L));
                  }

                  class_2841.method_12933(this.field_17194).method_21129(var3, 0L, this.field_17192);
                  class_2841.method_12933(this.field_17194).method_21129(var3, class_2841.method_12907(this.field_17194), this.field_17192);

                  for (long var22 = 0L; var22 < class_2841.method_12907(this.field_17194); var22++) {
                     long var30 = var22 * class_2841.method_12906(this.field_17194) + var6;
                     this.field_17196.method_36123(var30, var3.method_36133(var22));
                     this.field_17196.method_36123(var30 + 1L, var3.method_36133(class_2841.method_12907(this.field_17194) + var22));
                  }
               }
            }
         } else {
            for (long var16 = this.field_17195; var16 < class_2841.method_12912(this.field_17194); var16 += (long)this.field_17190) {
               long var19 = var16 * class_2841.method_12927(this.field_17194);

               for (long var23 = 0L; var23 < class_2841.method_12932(this.field_17194); var23 += 4L) {
                  for (long var10 = 0L; var10 < class_2841.method_12907(this.field_17194); var10++) {
                     long var31 = var10 * class_2841.method_12906(this.field_17194) + var19 + var23;
                     long var14 = class_2841.method_12907(this.field_17194) + var10;
                     var3.method_36123(var10, this.field_17196.method_36133(var31));
                     var3.method_36123(var14, this.field_17196.method_36133(var31 + 1L));
                     var3.method_36123(var14 + class_2841.method_12907(this.field_17194), this.field_17196.method_36133(var31 + 2L));
                     var3.method_36123(var14 + 2L * class_2841.method_12907(this.field_17194), this.field_17196.method_36133(var31 + 3L));
                  }

                  class_2841.method_12933(this.field_17194).method_21129(var3, 0L, this.field_17192);
                  class_2841.method_12933(this.field_17194).method_21129(var3, class_2841.method_12907(this.field_17194), this.field_17192);
                  class_2841.method_12933(this.field_17194).method_21129(var3, 2L * class_2841.method_12907(this.field_17194), this.field_17192);
                  class_2841.method_12933(this.field_17194).method_21129(var3, 3L * class_2841.method_12907(this.field_17194), this.field_17192);

                  for (long var27 = 0L; var27 < class_2841.method_12907(this.field_17194); var27++) {
                     long var32 = var27 * class_2841.method_12906(this.field_17194) + var19 + var23;
                     long var37 = class_2841.method_12907(this.field_17194) + var27;
                     this.field_17196.method_36123(var32, var3.method_36133(var27));
                     this.field_17196.method_36123(var32 + 1L, var3.method_36133(var37));
                     this.field_17196.method_36123(var32 + 2L, var3.method_36133(var37 + class_2841.method_12907(this.field_17194)));
                     this.field_17196.method_36123(var32 + 3L, var3.method_36133(var37 + 2L * class_2841.method_12907(this.field_17194)));
                  }
               }
            }
         }
      } else if (class_2841.method_12932(this.field_17194) <= 2L) {
         if (class_2841.method_12932(this.field_17194) == 2L) {
            for (long var17 = this.field_17195; var17 < class_2841.method_12912(this.field_17194); var17 += (long)this.field_17190) {
               long var20 = var17 * class_2841.method_12927(this.field_17194);

               for (long var24 = 0L; var24 < class_2841.method_12907(this.field_17194); var24++) {
                  long var33 = var24 * class_2841.method_12906(this.field_17194) + var20;
                  var3.method_36123(var24, this.field_17196.method_36133(var33));
                  var3.method_36123(class_2841.method_12907(this.field_17194) + var24, this.field_17196.method_36133(var33 + 1L));
               }

               class_2841.method_12933(this.field_17194).method_21137(var3, 0L, this.field_17192);
               class_2841.method_12933(this.field_17194).method_21137(var3, class_2841.method_12907(this.field_17194), this.field_17192);

               for (long var25 = 0L; var25 < class_2841.method_12907(this.field_17194); var25++) {
                  long var34 = var25 * class_2841.method_12906(this.field_17194) + var20;
                  this.field_17196.method_36123(var34, var3.method_36133(var25));
                  this.field_17196.method_36123(var34 + 1L, var3.method_36133(class_2841.method_12907(this.field_17194) + var25));
               }
            }
         }
      } else {
         for (long var18 = this.field_17195; var18 < class_2841.method_12912(this.field_17194); var18 += (long)this.field_17190) {
            long var21 = var18 * class_2841.method_12927(this.field_17194);

            for (long var26 = 0L; var26 < class_2841.method_12932(this.field_17194); var26 += 4L) {
               for (long var28 = 0L; var28 < class_2841.method_12907(this.field_17194); var28++) {
                  long var35 = var28 * class_2841.method_12906(this.field_17194) + var21 + var26;
                  long var38 = class_2841.method_12907(this.field_17194) + var28;
                  var3.method_36123(var28, this.field_17196.method_36133(var35));
                  var3.method_36123(var38, this.field_17196.method_36133(var35 + 1L));
                  var3.method_36123(var38 + class_2841.method_12907(this.field_17194), this.field_17196.method_36133(var35 + 2L));
                  var3.method_36123(var38 + 2L * class_2841.method_12907(this.field_17194), this.field_17196.method_36133(var35 + 3L));
               }

               class_2841.method_12933(this.field_17194).method_21137(var3, 0L, this.field_17192);
               class_2841.method_12933(this.field_17194).method_21137(var3, class_2841.method_12907(this.field_17194), this.field_17192);
               class_2841.method_12933(this.field_17194).method_21137(var3, 2L * class_2841.method_12907(this.field_17194), this.field_17192);
               class_2841.method_12933(this.field_17194).method_21137(var3, 3L * class_2841.method_12907(this.field_17194), this.field_17192);

               for (long var29 = 0L; var29 < class_2841.method_12907(this.field_17194); var29++) {
                  long var36 = var29 * class_2841.method_12906(this.field_17194) + var21 + var26;
                  long var39 = class_2841.method_12907(this.field_17194) + var29;
                  this.field_17196.method_36123(var36, var3.method_36133(var29));
                  this.field_17196.method_36123(var36 + 1L, var3.method_36133(var39));
                  this.field_17196.method_36123(var36 + 2L, var3.method_36133(var39 + class_2841.method_12907(this.field_17194)));
                  this.field_17196.method_36123(var36 + 3L, var3.method_36133(var39 + 2L * class_2841.method_12907(this.field_17194)));
               }
            }
         }
      }
   }
}
