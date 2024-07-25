package remapped;

public class class_6519 implements Runnable {
   private static String[] field_33193;

   public class_6519(class_5519 var1, long var2, int var4, long var5, int var7, class_4330 var8, boolean var9) {
      this.field_33192 = var1;
      this.field_33196 = var2;
      this.field_33194 = var4;
      this.field_33197 = var5;
      this.field_33199 = var7;
      this.field_33198 = var8;
      this.field_33195 = var9;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(this.field_33196);
      if (class_5519.method_25007(this.field_33192) <= 2L) {
         if (class_5519.method_25007(this.field_33192) == 2L) {
            for (long var4 = 0L; var4 < class_5519.method_24996(this.field_33192); var4++) {
               long var8 = var4 * class_5519.method_25007(this.field_33192) + 2L * this.field_33197;
               var3.method_36123(var4, this.field_33198.method_36133(var8));
               var3.method_36123(var4 + class_5519.method_24996(this.field_33192), this.field_33198.method_36133(var8 + 1L));
            }

            if (this.field_33194 != -1) {
               class_5519.method_24990(this.field_33192).method_19201(var3, 0L, this.field_33195);
               class_5519.method_24990(this.field_33192).method_19201(var3, class_5519.method_24996(this.field_33192), this.field_33195);
            } else {
               class_5519.method_24990(this.field_33192).method_19194(var3, 0L, this.field_33195);
               class_5519.method_24990(this.field_33192).method_19194(var3, class_5519.method_24996(this.field_33192), this.field_33195);
            }

            for (long var12 = 0L; var12 < class_5519.method_24996(this.field_33192); var12++) {
               long var18 = var12 * class_5519.method_25007(this.field_33192) + 2L * this.field_33197;
               this.field_33198.method_36123(var18, var3.method_36133(var12));
               this.field_33198.method_36123(var18 + 1L, var3.method_36133(var12 + class_5519.method_24996(this.field_33192)));
            }
         }
      } else if (this.field_33194 != -1) {
         for (long var13 = 4L * this.field_33197; var13 < class_5519.method_25007(this.field_33192); var13 += (long)(4 * this.field_33199)) {
            for (long var6 = 0L; var6 < class_5519.method_24996(this.field_33192); var6++) {
               long var19 = var6 * class_5519.method_25007(this.field_33192) + var13;
               long var10 = class_5519.method_24996(this.field_33192) + var6;
               var3.method_36123(var6, this.field_33198.method_36133(var19));
               var3.method_36123(var10, this.field_33198.method_36133(var19 + 1L));
               var3.method_36123(var10 + class_5519.method_24996(this.field_33192), this.field_33198.method_36133(var19 + 2L));
               var3.method_36123(var10 + 2L * class_5519.method_24996(this.field_33192), this.field_33198.method_36133(var19 + 3L));
            }

            class_5519.method_24990(this.field_33192).method_19201(var3, 0L, this.field_33195);
            class_5519.method_24990(this.field_33192).method_19201(var3, class_5519.method_24996(this.field_33192), this.field_33195);
            class_5519.method_24990(this.field_33192).method_19201(var3, 2L * class_5519.method_24996(this.field_33192), this.field_33195);
            class_5519.method_24990(this.field_33192).method_19201(var3, 3L * class_5519.method_24996(this.field_33192), this.field_33195);

            for (long var15 = 0L; var15 < class_5519.method_24996(this.field_33192); var15++) {
               long var20 = var15 * class_5519.method_25007(this.field_33192) + var13;
               long var23 = class_5519.method_24996(this.field_33192) + var15;
               this.field_33198.method_36123(var20, var3.method_36133(var15));
               this.field_33198.method_36123(var20 + 1L, var3.method_36133(var23));
               this.field_33198.method_36123(var20 + 2L, var3.method_36133(var23 + class_5519.method_24996(this.field_33192)));
               this.field_33198.method_36123(var20 + 3L, var3.method_36133(var23 + 2L * class_5519.method_24996(this.field_33192)));
            }
         }
      } else {
         for (long var14 = 4L * this.field_33197; var14 < class_5519.method_25007(this.field_33192); var14 += (long)(4 * this.field_33199)) {
            for (long var16 = 0L; var16 < class_5519.method_24996(this.field_33192); var16++) {
               long var21 = var16 * class_5519.method_25007(this.field_33192) + var14;
               long var24 = class_5519.method_24996(this.field_33192) + var16;
               var3.method_36123(var16, this.field_33198.method_36133(var21));
               var3.method_36123(var24, this.field_33198.method_36133(var21 + 1L));
               var3.method_36123(var24 + class_5519.method_24996(this.field_33192), this.field_33198.method_36133(var21 + 2L));
               var3.method_36123(var24 + 2L * class_5519.method_24996(this.field_33192), this.field_33198.method_36133(var21 + 3L));
            }

            class_5519.method_24990(this.field_33192).method_19194(var3, 0L, this.field_33195);
            class_5519.method_24990(this.field_33192).method_19194(var3, class_5519.method_24996(this.field_33192), this.field_33195);
            class_5519.method_24990(this.field_33192).method_19194(var3, 2L * class_5519.method_24996(this.field_33192), this.field_33195);
            class_5519.method_24990(this.field_33192).method_19194(var3, 3L * class_5519.method_24996(this.field_33192), this.field_33195);

            for (long var17 = 0L; var17 < class_5519.method_24996(this.field_33192); var17++) {
               long var22 = var17 * class_5519.method_25007(this.field_33192) + var14;
               long var25 = class_5519.method_24996(this.field_33192) + var17;
               this.field_33198.method_36123(var22, var3.method_36133(var17));
               this.field_33198.method_36123(var22 + 1L, var3.method_36133(var25));
               this.field_33198.method_36123(var22 + 2L, var3.method_36133(var25 + class_5519.method_24996(this.field_33192)));
               this.field_33198.method_36123(var22 + 3L, var3.method_36133(var25 + 2L * class_5519.method_24996(this.field_33192)));
            }
         }
      }
   }
}
