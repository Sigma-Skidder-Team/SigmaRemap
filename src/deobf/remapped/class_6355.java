package remapped;

public class class_6355 implements Runnable {
   private static String[] field_32498;

   public class_6355(class_7380 var1, long var2, int var4, long var5, int var7, class_1702 var8, boolean var9) {
      this.field_32496 = var1;
      this.field_32502 = var2;
      this.field_32499 = var4;
      this.field_32501 = var5;
      this.field_32500 = var7;
      this.field_32497 = var8;
      this.field_32495 = var9;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(this.field_32502);
      if (class_7380.method_33608(this.field_32496) <= 2L) {
         if (class_7380.method_33608(this.field_32496) == 2L) {
            for (long var4 = 0L; var4 < class_7380.method_33604(this.field_32496); var4++) {
               long var8 = var4 * class_7380.method_33608(this.field_32496) + 2L * this.field_32501;
               var3.method_36114(var4, this.field_32497.method_36107(var8));
               var3.method_36114(var4 + class_7380.method_33604(this.field_32496), this.field_32497.method_36107(var8 + 1L));
            }

            if (this.field_32499 != -1) {
               class_7380.method_33616(this.field_32496).method_31280(var3, 0L, this.field_32495);
               class_7380.method_33616(this.field_32496).method_31280(var3, class_7380.method_33604(this.field_32496), this.field_32495);
            } else {
               class_7380.method_33616(this.field_32496).method_31274(var3, 0L);
               class_7380.method_33616(this.field_32496).method_31274(var3, class_7380.method_33604(this.field_32496));
            }

            for (long var12 = 0L; var12 < class_7380.method_33604(this.field_32496); var12++) {
               long var18 = var12 * class_7380.method_33608(this.field_32496) + 2L * this.field_32501;
               this.field_32497.method_36114(var18, var3.method_36107(var12));
               this.field_32497.method_36114(var18 + 1L, var3.method_36107(var12 + class_7380.method_33604(this.field_32496)));
            }
         }
      } else if (this.field_32499 != -1) {
         for (long var13 = 4L * this.field_32501; var13 < class_7380.method_33608(this.field_32496); var13 += (long)(4 * this.field_32500)) {
            for (long var6 = 0L; var6 < class_7380.method_33604(this.field_32496); var6++) {
               long var19 = var6 * class_7380.method_33608(this.field_32496) + var13;
               long var10 = class_7380.method_33604(this.field_32496) + var6;
               var3.method_36114(var6, this.field_32497.method_36107(var19));
               var3.method_36114(var10, this.field_32497.method_36107(var19 + 1L));
               var3.method_36114(var10 + class_7380.method_33604(this.field_32496), this.field_32497.method_36107(var19 + 2L));
               var3.method_36114(var10 + 2L * class_7380.method_33604(this.field_32496), this.field_32497.method_36107(var19 + 3L));
            }

            class_7380.method_33616(this.field_32496).method_31280(var3, 0L, this.field_32495);
            class_7380.method_33616(this.field_32496).method_31280(var3, class_7380.method_33604(this.field_32496), this.field_32495);
            class_7380.method_33616(this.field_32496).method_31280(var3, 2L * class_7380.method_33604(this.field_32496), this.field_32495);
            class_7380.method_33616(this.field_32496).method_31280(var3, 3L * class_7380.method_33604(this.field_32496), this.field_32495);

            for (long var15 = 0L; var15 < class_7380.method_33604(this.field_32496); var15++) {
               long var20 = var15 * class_7380.method_33608(this.field_32496) + var13;
               long var23 = class_7380.method_33604(this.field_32496) + var15;
               this.field_32497.method_36114(var20, var3.method_36107(var15));
               this.field_32497.method_36114(var20 + 1L, var3.method_36107(var23));
               this.field_32497.method_36114(var20 + 2L, var3.method_36107(var23 + class_7380.method_33604(this.field_32496)));
               this.field_32497.method_36114(var20 + 3L, var3.method_36107(var23 + 2L * class_7380.method_33604(this.field_32496)));
            }
         }
      } else {
         for (long var14 = 4L * this.field_32501; var14 < class_7380.method_33608(this.field_32496); var14 += (long)(4 * this.field_32500)) {
            for (long var16 = 0L; var16 < class_7380.method_33604(this.field_32496); var16++) {
               long var21 = var16 * class_7380.method_33608(this.field_32496) + var14;
               long var24 = class_7380.method_33604(this.field_32496) + var16;
               var3.method_36114(var16, this.field_32497.method_36107(var21));
               var3.method_36114(var24, this.field_32497.method_36107(var21 + 1L));
               var3.method_36114(var24 + class_7380.method_33604(this.field_32496), this.field_32497.method_36107(var21 + 2L));
               var3.method_36114(var24 + 2L * class_7380.method_33604(this.field_32496), this.field_32497.method_36107(var21 + 3L));
            }

            class_7380.method_33616(this.field_32496).method_31274(var3, 0L);
            class_7380.method_33616(this.field_32496).method_31274(var3, class_7380.method_33604(this.field_32496));
            class_7380.method_33616(this.field_32496).method_31274(var3, 2L * class_7380.method_33604(this.field_32496));
            class_7380.method_33616(this.field_32496).method_31274(var3, 3L * class_7380.method_33604(this.field_32496));

            for (long var17 = 0L; var17 < class_7380.method_33604(this.field_32496); var17++) {
               long var22 = var17 * class_7380.method_33608(this.field_32496) + var14;
               long var25 = class_7380.method_33604(this.field_32496) + var17;
               this.field_32497.method_36114(var22, var3.method_36107(var17));
               this.field_32497.method_36114(var22 + 1L, var3.method_36107(var25));
               this.field_32497.method_36114(var22 + 2L, var3.method_36107(var25 + class_7380.method_33604(this.field_32496)));
               this.field_32497.method_36114(var22 + 3L, var3.method_36107(var25 + 2L * class_7380.method_33604(this.field_32496)));
            }
         }
      }
   }
}
