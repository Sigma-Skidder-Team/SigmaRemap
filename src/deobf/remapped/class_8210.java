package remapped;

public class class_8210 implements Runnable {
   private static String[] field_41995;

   public class_8210(class_84 var1, long var2, int var4, long var5, int var7, class_1702 var8, boolean var9) {
      this.field_41997 = var1;
      this.field_41998 = var2;
      this.field_41994 = var4;
      this.field_41996 = var5;
      this.field_41999 = var7;
      this.field_41993 = var8;
      this.field_41992 = var9;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(this.field_41998);
      if (this.field_41994 != -1) {
         if (class_84.method_199(this.field_41997) <= 2L) {
            if (class_84.method_199(this.field_41997) == 2L) {
               for (long var4 = this.field_41996; var4 < class_84.method_190(this.field_41997); var4 += (long)this.field_41999) {
                  long var6 = var4 * class_84.method_197(this.field_41997);

                  for (long var8 = 0L; var8 < class_84.method_183(this.field_41997); var8++) {
                     long var12 = var8 * class_84.method_182(this.field_41997) + var6;
                     var3.method_36114(var8, this.field_41993.method_36107(var12));
                     var3.method_36114(class_84.method_183(this.field_41997) + var8, this.field_41993.method_36107(var12 + 1L));
                  }

                  class_84.method_181(this.field_41997).method_31286(var3, 0L, this.field_41992);
                  class_84.method_181(this.field_41997).method_31286(var3, class_84.method_183(this.field_41997), this.field_41992);

                  for (long var22 = 0L; var22 < class_84.method_183(this.field_41997); var22++) {
                     long var30 = var22 * class_84.method_182(this.field_41997) + var6;
                     this.field_41993.method_36114(var30, var3.method_36107(var22));
                     this.field_41993.method_36114(var30 + 1L, var3.method_36107(class_84.method_183(this.field_41997) + var22));
                  }
               }
            }
         } else {
            for (long var16 = this.field_41996; var16 < class_84.method_190(this.field_41997); var16 += (long)this.field_41999) {
               long var19 = var16 * class_84.method_197(this.field_41997);

               for (long var23 = 0L; var23 < class_84.method_199(this.field_41997); var23 += 4L) {
                  for (long var10 = 0L; var10 < class_84.method_183(this.field_41997); var10++) {
                     long var31 = var10 * class_84.method_182(this.field_41997) + var19 + var23;
                     long var14 = class_84.method_183(this.field_41997) + var10;
                     var3.method_36114(var10, this.field_41993.method_36107(var31));
                     var3.method_36114(var14, this.field_41993.method_36107(var31 + 1L));
                     var3.method_36114(var14 + class_84.method_183(this.field_41997), this.field_41993.method_36107(var31 + 2L));
                     var3.method_36114(var14 + 2L * class_84.method_183(this.field_41997), this.field_41993.method_36107(var31 + 3L));
                  }

                  class_84.method_181(this.field_41997).method_31286(var3, 0L, this.field_41992);
                  class_84.method_181(this.field_41997).method_31286(var3, class_84.method_183(this.field_41997), this.field_41992);
                  class_84.method_181(this.field_41997).method_31286(var3, 2L * class_84.method_183(this.field_41997), this.field_41992);
                  class_84.method_181(this.field_41997).method_31286(var3, 3L * class_84.method_183(this.field_41997), this.field_41992);

                  for (long var27 = 0L; var27 < class_84.method_183(this.field_41997); var27++) {
                     long var32 = var27 * class_84.method_182(this.field_41997) + var19 + var23;
                     long var37 = class_84.method_183(this.field_41997) + var27;
                     this.field_41993.method_36114(var32, var3.method_36107(var27));
                     this.field_41993.method_36114(var32 + 1L, var3.method_36107(var37));
                     this.field_41993.method_36114(var32 + 2L, var3.method_36107(var37 + class_84.method_183(this.field_41997)));
                     this.field_41993.method_36114(var32 + 3L, var3.method_36107(var37 + 2L * class_84.method_183(this.field_41997)));
                  }
               }
            }
         }
      } else if (class_84.method_199(this.field_41997) <= 2L) {
         if (class_84.method_199(this.field_41997) == 2L) {
            for (long var17 = this.field_41996; var17 < class_84.method_190(this.field_41997); var17 += (long)this.field_41999) {
               long var20 = var17 * class_84.method_197(this.field_41997);

               for (long var24 = 0L; var24 < class_84.method_183(this.field_41997); var24++) {
                  long var33 = var24 * class_84.method_182(this.field_41997) + var20;
                  var3.method_36114(var24, this.field_41993.method_36107(var33));
                  var3.method_36114(class_84.method_183(this.field_41997) + var24, this.field_41993.method_36107(var33 + 1L));
               }

               class_84.method_181(this.field_41997).method_31292(var3, 0L, this.field_41992);
               class_84.method_181(this.field_41997).method_31292(var3, class_84.method_183(this.field_41997), this.field_41992);

               for (long var25 = 0L; var25 < class_84.method_183(this.field_41997); var25++) {
                  long var34 = var25 * class_84.method_182(this.field_41997) + var20;
                  this.field_41993.method_36114(var34, var3.method_36107(var25));
                  this.field_41993.method_36114(var34 + 1L, var3.method_36107(class_84.method_183(this.field_41997) + var25));
               }
            }
         }
      } else {
         for (long var18 = this.field_41996; var18 < class_84.method_190(this.field_41997); var18 += (long)this.field_41999) {
            long var21 = var18 * class_84.method_197(this.field_41997);

            for (long var26 = 0L; var26 < class_84.method_199(this.field_41997); var26 += 4L) {
               for (long var28 = 0L; var28 < class_84.method_183(this.field_41997); var28++) {
                  long var35 = var28 * class_84.method_182(this.field_41997) + var21 + var26;
                  long var38 = class_84.method_183(this.field_41997) + var28;
                  var3.method_36114(var28, this.field_41993.method_36107(var35));
                  var3.method_36114(var38, this.field_41993.method_36107(var35 + 1L));
                  var3.method_36114(var38 + class_84.method_183(this.field_41997), this.field_41993.method_36107(var35 + 2L));
                  var3.method_36114(var38 + 2L * class_84.method_183(this.field_41997), this.field_41993.method_36107(var35 + 3L));
               }

               class_84.method_181(this.field_41997).method_31292(var3, 0L, this.field_41992);
               class_84.method_181(this.field_41997).method_31292(var3, class_84.method_183(this.field_41997), this.field_41992);
               class_84.method_181(this.field_41997).method_31292(var3, 2L * class_84.method_183(this.field_41997), this.field_41992);
               class_84.method_181(this.field_41997).method_31292(var3, 3L * class_84.method_183(this.field_41997), this.field_41992);

               for (long var29 = 0L; var29 < class_84.method_183(this.field_41997); var29++) {
                  long var36 = var29 * class_84.method_182(this.field_41997) + var21 + var26;
                  long var39 = class_84.method_183(this.field_41997) + var29;
                  this.field_41993.method_36114(var36, var3.method_36107(var29));
                  this.field_41993.method_36114(var36 + 1L, var3.method_36107(var39));
                  this.field_41993.method_36114(var36 + 2L, var3.method_36107(var39 + class_84.method_183(this.field_41997)));
                  this.field_41993.method_36114(var36 + 3L, var3.method_36107(var39 + 2L * class_84.method_183(this.field_41997)));
               }
            }
         }
      }
   }
}
