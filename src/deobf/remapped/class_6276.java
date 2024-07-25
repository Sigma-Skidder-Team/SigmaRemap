package remapped;

public class class_6276 implements Runnable {
   private static String[] field_32083;

   public class_6276(class_7963 var1, long var2, int var4, long var5, long var7, class_1702 var9, boolean var10) {
      this.field_32084 = var1;
      this.field_32085 = var2;
      this.field_32087 = var4;
      this.field_32080 = var5;
      this.field_32086 = var7;
      this.field_32081 = var9;
      this.field_32082 = var10;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(this.field_32085);
      if (class_7963.method_36037(this.field_32084) <= 2L) {
         if (class_7963.method_36037(this.field_32084) == 2L) {
            for (long var4 = 0L; var4 < class_7963.method_36039(this.field_32084); var4++) {
               long var8 = var4 * class_7963.method_36037(this.field_32084) + 2L * this.field_32080;
               var3.method_36114(var4, this.field_32081.method_36107(var8));
               var3.method_36114(var4 + class_7963.method_36039(this.field_32084), this.field_32081.method_36107(var8 + 1L));
            }

            if (this.field_32087 != -1) {
               class_7963.method_36041(this.field_32084).method_44818(var3, 0L, this.field_32082);
               class_7963.method_36041(this.field_32084).method_44818(var3, class_7963.method_36039(this.field_32084), this.field_32082);
            } else {
               class_7963.method_36041(this.field_32084).method_44813(var3, 0L, this.field_32082);
               class_7963.method_36041(this.field_32084).method_44813(var3, class_7963.method_36039(this.field_32084), this.field_32082);
            }

            for (long var12 = 0L; var12 < class_7963.method_36039(this.field_32084); var12++) {
               long var18 = var12 * class_7963.method_36037(this.field_32084) + 2L * this.field_32080;
               this.field_32081.method_36114(var18, var3.method_36107(var12));
               this.field_32081.method_36114(var18 + 1L, var3.method_36107(var12 + class_7963.method_36039(this.field_32084)));
            }
         }
      } else if (this.field_32087 != -1) {
         for (long var13 = 4L * this.field_32080; var13 < class_7963.method_36037(this.field_32084); var13 += 4L * this.field_32086) {
            for (long var6 = 0L; var6 < class_7963.method_36039(this.field_32084); var6++) {
               long var19 = var6 * class_7963.method_36037(this.field_32084) + var13;
               long var10 = class_7963.method_36039(this.field_32084) + var6;
               var3.method_36114(var6, this.field_32081.method_36107(var19));
               var3.method_36114(var10, this.field_32081.method_36107(var19 + 1L));
               var3.method_36114(var10 + class_7963.method_36039(this.field_32084), this.field_32081.method_36107(var19 + 2L));
               var3.method_36114(var10 + 2L * class_7963.method_36039(this.field_32084), this.field_32081.method_36107(var19 + 3L));
            }

            class_7963.method_36041(this.field_32084).method_44819(var3, this.field_32082);
            class_7963.method_36041(this.field_32084).method_44818(var3, class_7963.method_36039(this.field_32084), this.field_32082);
            class_7963.method_36041(this.field_32084).method_44818(var3, 2L * class_7963.method_36039(this.field_32084), this.field_32082);
            class_7963.method_36041(this.field_32084).method_44818(var3, 3L * class_7963.method_36039(this.field_32084), this.field_32082);

            for (long var15 = 0L; var15 < class_7963.method_36039(this.field_32084); var15++) {
               long var20 = var15 * class_7963.method_36037(this.field_32084) + var13;
               long var23 = class_7963.method_36039(this.field_32084) + var15;
               this.field_32081.method_36114(var20, var3.method_36107(var15));
               this.field_32081.method_36114(var20 + 1L, var3.method_36107(var23));
               this.field_32081.method_36114(var20 + 2L, var3.method_36107(var23 + class_7963.method_36039(this.field_32084)));
               this.field_32081.method_36114(var20 + 3L, var3.method_36107(var23 + 2L * class_7963.method_36039(this.field_32084)));
            }
         }
      } else {
         for (long var14 = 4L * this.field_32080; var14 < class_7963.method_36037(this.field_32084); var14 += 4L * this.field_32086) {
            for (long var16 = 0L; var16 < class_7963.method_36039(this.field_32084); var16++) {
               long var21 = var16 * class_7963.method_36037(this.field_32084) + var14;
               long var24 = class_7963.method_36039(this.field_32084) + var16;
               var3.method_36114(var16, this.field_32081.method_36107(var21));
               var3.method_36114(var24, this.field_32081.method_36107(var21 + 1L));
               var3.method_36114(var24 + class_7963.method_36039(this.field_32084), this.field_32081.method_36107(var21 + 2L));
               var3.method_36114(var24 + 2L * class_7963.method_36039(this.field_32084), this.field_32081.method_36107(var21 + 3L));
            }

            class_7963.method_36041(this.field_32084).method_44813(var3, 0L, this.field_32082);
            class_7963.method_36041(this.field_32084).method_44813(var3, class_7963.method_36039(this.field_32084), this.field_32082);
            class_7963.method_36041(this.field_32084).method_44813(var3, 2L * class_7963.method_36039(this.field_32084), this.field_32082);
            class_7963.method_36041(this.field_32084).method_44813(var3, 3L * class_7963.method_36039(this.field_32084), this.field_32082);

            for (long var17 = 0L; var17 < class_7963.method_36039(this.field_32084); var17++) {
               long var22 = var17 * class_7963.method_36037(this.field_32084) + var14;
               long var25 = class_7963.method_36039(this.field_32084) + var17;
               this.field_32081.method_36114(var22, var3.method_36107(var17));
               this.field_32081.method_36114(var22 + 1L, var3.method_36107(var25));
               this.field_32081.method_36114(var22 + 2L, var3.method_36107(var25 + class_7963.method_36039(this.field_32084)));
               this.field_32081.method_36114(var22 + 3L, var3.method_36107(var25 + 2L * class_7963.method_36039(this.field_32084)));
            }
         }
      }
   }
}
