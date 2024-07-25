package remapped;

public class class_4307 implements Runnable {
   private static String[] field_20891;

   public class_4307(class_3803 var1, long var2, int var4, long var5, int var7, class_4330 var8, boolean var9) {
      this.field_20894 = var1;
      this.field_20896 = var2;
      this.field_20895 = var4;
      this.field_20893 = var5;
      this.field_20897 = var7;
      this.field_20892 = var8;
      this.field_20890 = var9;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(this.field_20896);
      if (this.field_20895 != -1) {
         if (class_3803.method_17712(this.field_20894) <= 2L) {
            if (class_3803.method_17712(this.field_20894) == 2L) {
               for (long var4 = this.field_20893; var4 < class_3803.method_17686(this.field_20894); var4 += (long)this.field_20897) {
                  long var6 = var4 * class_3803.method_17705(this.field_20894);

                  for (long var8 = 0L; var8 < class_3803.method_17703(this.field_20894); var8++) {
                     long var12 = var8 * class_3803.method_17713(this.field_20894) + var6;
                     var3.method_36123(var8, this.field_20892.method_36133(var12));
                     var3.method_36123(class_3803.method_17703(this.field_20894) + var8, this.field_20892.method_36133(var12 + 1L));
                  }

                  class_3803.method_17699(this.field_20894).method_17787(var3, 0L, this.field_20890);
                  class_3803.method_17699(this.field_20894).method_17787(var3, class_3803.method_17703(this.field_20894), this.field_20890);

                  for (long var22 = 0L; var22 < class_3803.method_17703(this.field_20894); var22++) {
                     long var30 = var22 * class_3803.method_17713(this.field_20894) + var6;
                     this.field_20892.method_36123(var30, var3.method_36133(var22));
                     this.field_20892.method_36123(var30 + 1L, var3.method_36133(class_3803.method_17703(this.field_20894) + var22));
                  }
               }
            }
         } else {
            for (long var16 = this.field_20893; var16 < class_3803.method_17686(this.field_20894); var16 += (long)this.field_20897) {
               long var19 = var16 * class_3803.method_17705(this.field_20894);

               for (long var23 = 0L; var23 < class_3803.method_17712(this.field_20894); var23 += 4L) {
                  for (long var10 = 0L; var10 < class_3803.method_17703(this.field_20894); var10++) {
                     long var31 = var10 * class_3803.method_17713(this.field_20894) + var19 + var23;
                     long var14 = class_3803.method_17703(this.field_20894) + var10;
                     var3.method_36123(var10, this.field_20892.method_36133(var31));
                     var3.method_36123(var14, this.field_20892.method_36133(var31 + 1L));
                     var3.method_36123(var14 + class_3803.method_17703(this.field_20894), this.field_20892.method_36133(var31 + 2L));
                     var3.method_36123(var14 + 2L * class_3803.method_17703(this.field_20894), this.field_20892.method_36133(var31 + 3L));
                  }

                  class_3803.method_17699(this.field_20894).method_17787(var3, 0L, this.field_20890);
                  class_3803.method_17699(this.field_20894).method_17787(var3, class_3803.method_17703(this.field_20894), this.field_20890);
                  class_3803.method_17699(this.field_20894).method_17787(var3, 2L * class_3803.method_17703(this.field_20894), this.field_20890);
                  class_3803.method_17699(this.field_20894).method_17787(var3, 3L * class_3803.method_17703(this.field_20894), this.field_20890);

                  for (long var27 = 0L; var27 < class_3803.method_17703(this.field_20894); var27++) {
                     long var32 = var27 * class_3803.method_17713(this.field_20894) + var19 + var23;
                     long var37 = class_3803.method_17703(this.field_20894) + var27;
                     this.field_20892.method_36123(var32, var3.method_36133(var27));
                     this.field_20892.method_36123(var32 + 1L, var3.method_36133(var37));
                     this.field_20892.method_36123(var32 + 2L, var3.method_36133(var37 + class_3803.method_17703(this.field_20894)));
                     this.field_20892.method_36123(var32 + 3L, var3.method_36133(var37 + 2L * class_3803.method_17703(this.field_20894)));
                  }
               }
            }
         }
      } else if (class_3803.method_17712(this.field_20894) <= 2L) {
         if (class_3803.method_17712(this.field_20894) == 2L) {
            for (long var17 = this.field_20893; var17 < class_3803.method_17686(this.field_20894); var17 += (long)this.field_20897) {
               long var20 = var17 * class_3803.method_17705(this.field_20894);

               for (long var24 = 0L; var24 < class_3803.method_17703(this.field_20894); var24++) {
                  long var33 = var24 * class_3803.method_17713(this.field_20894) + var20;
                  var3.method_36123(var24, this.field_20892.method_36133(var33));
                  var3.method_36123(class_3803.method_17703(this.field_20894) + var24, this.field_20892.method_36133(var33 + 1L));
               }

               class_3803.method_17699(this.field_20894).method_17784(var3, 0L);
               class_3803.method_17699(this.field_20894).method_17784(var3, class_3803.method_17703(this.field_20894));

               for (long var25 = 0L; var25 < class_3803.method_17703(this.field_20894); var25++) {
                  long var34 = var25 * class_3803.method_17713(this.field_20894) + var20;
                  this.field_20892.method_36123(var34, var3.method_36133(var25));
                  this.field_20892.method_36123(var34 + 1L, var3.method_36133(class_3803.method_17703(this.field_20894) + var25));
               }
            }
         }
      } else {
         for (long var18 = this.field_20893; var18 < class_3803.method_17686(this.field_20894); var18 += (long)this.field_20897) {
            long var21 = var18 * class_3803.method_17705(this.field_20894);

            for (long var26 = 0L; var26 < class_3803.method_17712(this.field_20894); var26 += 4L) {
               for (long var28 = 0L; var28 < class_3803.method_17703(this.field_20894); var28++) {
                  long var35 = var28 * class_3803.method_17713(this.field_20894) + var21 + var26;
                  long var38 = class_3803.method_17703(this.field_20894) + var28;
                  var3.method_36123(var28, this.field_20892.method_36133(var35));
                  var3.method_36123(var38, this.field_20892.method_36133(var35 + 1L));
                  var3.method_36123(var38 + class_3803.method_17703(this.field_20894), this.field_20892.method_36133(var35 + 2L));
                  var3.method_36123(var38 + 2L * class_3803.method_17703(this.field_20894), this.field_20892.method_36133(var35 + 3L));
               }

               class_3803.method_17699(this.field_20894).method_17784(var3, 0L);
               class_3803.method_17699(this.field_20894).method_17784(var3, class_3803.method_17703(this.field_20894));
               class_3803.method_17699(this.field_20894).method_17784(var3, 2L * class_3803.method_17703(this.field_20894));
               class_3803.method_17699(this.field_20894).method_17784(var3, 3L * class_3803.method_17703(this.field_20894));

               for (long var29 = 0L; var29 < class_3803.method_17703(this.field_20894); var29++) {
                  long var36 = var29 * class_3803.method_17713(this.field_20894) + var21 + var26;
                  long var39 = class_3803.method_17703(this.field_20894) + var29;
                  this.field_20892.method_36123(var36, var3.method_36133(var29));
                  this.field_20892.method_36123(var36 + 1L, var3.method_36133(var39));
                  this.field_20892.method_36123(var36 + 2L, var3.method_36133(var39 + class_3803.method_17703(this.field_20894)));
                  this.field_20892.method_36123(var36 + 3L, var3.method_36133(var39 + 2L * class_3803.method_17703(this.field_20894)));
               }
            }
         }
      }
   }
}
