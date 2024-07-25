package remapped;

public class class_8397 implements Runnable {
   private static String[] field_42967;

   public class_8397(class_3101 var1, long var2, int var4, long var5, int var7, class_4330 var8, boolean var9) {
      this.field_42962 = var1;
      this.field_42969 = var2;
      this.field_42966 = var4;
      this.field_42963 = var5;
      this.field_42968 = var7;
      this.field_42964 = var8;
      this.field_42965 = var9;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(this.field_42969);
      if (this.field_42966 != -1) {
         if (class_3101.method_14197(this.field_42962) <= 2L) {
            if (class_3101.method_14197(this.field_42962) == 2L) {
               for (long var4 = this.field_42963; var4 < class_3101.method_14198(this.field_42962); var4 += (long)this.field_42968) {
                  long var6 = var4 * class_3101.method_14194(this.field_42962);

                  for (long var8 = 0L; var8 < class_3101.method_14212(this.field_42962); var8++) {
                     long var12 = var8 * class_3101.method_14193(this.field_42962) + var6;
                     var3.method_36123(var8, this.field_42964.method_36133(var12));
                     var3.method_36123(class_3101.method_14212(this.field_42962) + var8, this.field_42964.method_36133(var12 + 1L));
                  }

                  class_3101.method_14200(this.field_42962).method_19201(var3, 0L, this.field_42965);
                  class_3101.method_14200(this.field_42962).method_19201(var3, class_3101.method_14212(this.field_42962), this.field_42965);

                  for (long var22 = 0L; var22 < class_3101.method_14212(this.field_42962); var22++) {
                     long var30 = var22 * class_3101.method_14193(this.field_42962) + var6;
                     this.field_42964.method_36123(var30, var3.method_36133(var22));
                     this.field_42964.method_36123(var30 + 1L, var3.method_36133(class_3101.method_14212(this.field_42962) + var22));
                  }
               }
            }
         } else {
            for (long var16 = this.field_42963; var16 < class_3101.method_14198(this.field_42962); var16 += (long)this.field_42968) {
               long var19 = var16 * class_3101.method_14194(this.field_42962);

               for (long var23 = 0L; var23 < class_3101.method_14197(this.field_42962); var23 += 4L) {
                  for (long var10 = 0L; var10 < class_3101.method_14212(this.field_42962); var10++) {
                     long var31 = var10 * class_3101.method_14193(this.field_42962) + var19 + var23;
                     long var14 = class_3101.method_14212(this.field_42962) + var10;
                     var3.method_36123(var10, this.field_42964.method_36133(var31));
                     var3.method_36123(var14, this.field_42964.method_36133(var31 + 1L));
                     var3.method_36123(var14 + class_3101.method_14212(this.field_42962), this.field_42964.method_36133(var31 + 2L));
                     var3.method_36123(var14 + 2L * class_3101.method_14212(this.field_42962), this.field_42964.method_36133(var31 + 3L));
                  }

                  class_3101.method_14200(this.field_42962).method_19201(var3, 0L, this.field_42965);
                  class_3101.method_14200(this.field_42962).method_19201(var3, class_3101.method_14212(this.field_42962), this.field_42965);
                  class_3101.method_14200(this.field_42962).method_19201(var3, 2L * class_3101.method_14212(this.field_42962), this.field_42965);
                  class_3101.method_14200(this.field_42962).method_19201(var3, 3L * class_3101.method_14212(this.field_42962), this.field_42965);

                  for (long var27 = 0L; var27 < class_3101.method_14212(this.field_42962); var27++) {
                     long var32 = var27 * class_3101.method_14193(this.field_42962) + var19 + var23;
                     long var37 = class_3101.method_14212(this.field_42962) + var27;
                     this.field_42964.method_36123(var32, var3.method_36133(var27));
                     this.field_42964.method_36123(var32 + 1L, var3.method_36133(var37));
                     this.field_42964.method_36123(var32 + 2L, var3.method_36133(var37 + class_3101.method_14212(this.field_42962)));
                     this.field_42964.method_36123(var32 + 3L, var3.method_36133(var37 + 2L * class_3101.method_14212(this.field_42962)));
                  }
               }
            }
         }
      } else if (class_3101.method_14197(this.field_42962) <= 2L) {
         if (class_3101.method_14197(this.field_42962) == 2L) {
            for (long var17 = this.field_42963; var17 < class_3101.method_14198(this.field_42962); var17 += (long)this.field_42968) {
               long var20 = var17 * class_3101.method_14194(this.field_42962);

               for (long var24 = 0L; var24 < class_3101.method_14212(this.field_42962); var24++) {
                  long var33 = var24 * class_3101.method_14193(this.field_42962) + var20;
                  var3.method_36123(var24, this.field_42964.method_36133(var33));
                  var3.method_36123(class_3101.method_14212(this.field_42962) + var24, this.field_42964.method_36133(var33 + 1L));
               }

               class_3101.method_14200(this.field_42962).method_19194(var3, 0L, this.field_42965);
               class_3101.method_14200(this.field_42962).method_19194(var3, class_3101.method_14212(this.field_42962), this.field_42965);

               for (long var25 = 0L; var25 < class_3101.method_14212(this.field_42962); var25++) {
                  long var34 = var25 * class_3101.method_14193(this.field_42962) + var20;
                  this.field_42964.method_36123(var34, var3.method_36133(var25));
                  this.field_42964.method_36123(var34 + 1L, var3.method_36133(class_3101.method_14212(this.field_42962) + var25));
               }
            }
         }
      } else {
         for (long var18 = this.field_42963; var18 < class_3101.method_14198(this.field_42962); var18 += (long)this.field_42968) {
            long var21 = var18 * class_3101.method_14194(this.field_42962);

            for (long var26 = 0L; var26 < class_3101.method_14197(this.field_42962); var26 += 4L) {
               for (long var28 = 0L; var28 < class_3101.method_14212(this.field_42962); var28++) {
                  long var35 = var28 * class_3101.method_14193(this.field_42962) + var21 + var26;
                  long var38 = class_3101.method_14212(this.field_42962) + var28;
                  var3.method_36123(var28, this.field_42964.method_36133(var35));
                  var3.method_36123(var38, this.field_42964.method_36133(var35 + 1L));
                  var3.method_36123(var38 + class_3101.method_14212(this.field_42962), this.field_42964.method_36133(var35 + 2L));
                  var3.method_36123(var38 + 2L * class_3101.method_14212(this.field_42962), this.field_42964.method_36133(var35 + 3L));
               }

               class_3101.method_14200(this.field_42962).method_19194(var3, 0L, this.field_42965);
               class_3101.method_14200(this.field_42962).method_19194(var3, class_3101.method_14212(this.field_42962), this.field_42965);
               class_3101.method_14200(this.field_42962).method_19194(var3, 2L * class_3101.method_14212(this.field_42962), this.field_42965);
               class_3101.method_14200(this.field_42962).method_19194(var3, 3L * class_3101.method_14212(this.field_42962), this.field_42965);

               for (long var29 = 0L; var29 < class_3101.method_14212(this.field_42962); var29++) {
                  long var36 = var29 * class_3101.method_14193(this.field_42962) + var21 + var26;
                  long var39 = class_3101.method_14212(this.field_42962) + var29;
                  this.field_42964.method_36123(var36, var3.method_36133(var29));
                  this.field_42964.method_36123(var36 + 1L, var3.method_36133(var39));
                  this.field_42964.method_36123(var36 + 2L, var3.method_36133(var39 + class_3101.method_14212(this.field_42962)));
                  this.field_42964.method_36123(var36 + 3L, var3.method_36133(var39 + 2L * class_3101.method_14212(this.field_42962)));
               }
            }
         }
      }
   }
}
