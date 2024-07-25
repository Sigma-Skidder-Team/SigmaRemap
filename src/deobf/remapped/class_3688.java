package remapped;

public class class_3688 implements Runnable {
   private static String[] field_18071;

   public class_3688(class_6842 var1, long var2, int var4, long var5, int var7, class_1702 var8, boolean var9) {
      this.field_18075 = var1;
      this.field_18076 = var2;
      this.field_18074 = var4;
      this.field_18072 = var5;
      this.field_18078 = var7;
      this.field_18073 = var8;
      this.field_18077 = var9;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(this.field_18076);
      if (class_6842.method_31357(this.field_18075) <= 2L) {
         if (class_6842.method_31357(this.field_18075) == 2L) {
            for (long var4 = 0L; var4 < class_6842.method_31374(this.field_18075); var4++) {
               long var8 = var4 * class_6842.method_31357(this.field_18075) + 2L * this.field_18072;
               var3.method_36114(var4, this.field_18073.method_36107(var8));
               var3.method_36114(var4 + class_6842.method_31374(this.field_18075), this.field_18073.method_36107(var8 + 1L));
            }

            if (this.field_18074 != -1) {
               class_6842.method_31368(this.field_18075).method_31286(var3, 0L, this.field_18077);
               class_6842.method_31368(this.field_18075).method_31286(var3, class_6842.method_31374(this.field_18075), this.field_18077);
            } else {
               class_6842.method_31368(this.field_18075).method_31292(var3, 0L, this.field_18077);
               class_6842.method_31368(this.field_18075).method_31292(var3, class_6842.method_31374(this.field_18075), this.field_18077);
            }

            for (long var12 = 0L; var12 < class_6842.method_31374(this.field_18075); var12++) {
               long var18 = var12 * class_6842.method_31357(this.field_18075) + 2L * this.field_18072;
               this.field_18073.method_36114(var18, var3.method_36107(var12));
               this.field_18073.method_36114(var18 + 1L, var3.method_36107(var12 + class_6842.method_31374(this.field_18075)));
            }
         }
      } else if (this.field_18074 != -1) {
         for (long var13 = 4L * this.field_18072; var13 < class_6842.method_31357(this.field_18075); var13 += (long)(4 * this.field_18078)) {
            for (long var6 = 0L; var6 < class_6842.method_31374(this.field_18075); var6++) {
               long var19 = var6 * class_6842.method_31357(this.field_18075) + var13;
               long var10 = class_6842.method_31374(this.field_18075) + var6;
               var3.method_36114(var6, this.field_18073.method_36107(var19));
               var3.method_36114(var10, this.field_18073.method_36107(var19 + 1L));
               var3.method_36114(var10 + class_6842.method_31374(this.field_18075), this.field_18073.method_36107(var19 + 2L));
               var3.method_36114(var10 + 2L * class_6842.method_31374(this.field_18075), this.field_18073.method_36107(var19 + 3L));
            }

            class_6842.method_31368(this.field_18075).method_31286(var3, 0L, this.field_18077);
            class_6842.method_31368(this.field_18075).method_31286(var3, class_6842.method_31374(this.field_18075), this.field_18077);
            class_6842.method_31368(this.field_18075).method_31286(var3, 2L * class_6842.method_31374(this.field_18075), this.field_18077);
            class_6842.method_31368(this.field_18075).method_31286(var3, 3L * class_6842.method_31374(this.field_18075), this.field_18077);

            for (long var15 = 0L; var15 < class_6842.method_31374(this.field_18075); var15++) {
               long var20 = var15 * class_6842.method_31357(this.field_18075) + var13;
               long var23 = class_6842.method_31374(this.field_18075) + var15;
               this.field_18073.method_36114(var20, var3.method_36107(var15));
               this.field_18073.method_36114(var20 + 1L, var3.method_36107(var23));
               this.field_18073.method_36114(var20 + 2L, var3.method_36107(var23 + class_6842.method_31374(this.field_18075)));
               this.field_18073.method_36114(var20 + 3L, var3.method_36107(var23 + 2L * class_6842.method_31374(this.field_18075)));
            }
         }
      } else {
         for (long var14 = 4L * this.field_18072; var14 < class_6842.method_31357(this.field_18075); var14 += (long)(4 * this.field_18078)) {
            for (long var16 = 0L; var16 < class_6842.method_31374(this.field_18075); var16++) {
               long var21 = var16 * class_6842.method_31357(this.field_18075) + var14;
               long var24 = class_6842.method_31374(this.field_18075) + var16;
               var3.method_36114(var16, this.field_18073.method_36107(var21));
               var3.method_36114(var24, this.field_18073.method_36107(var21 + 1L));
               var3.method_36114(var24 + class_6842.method_31374(this.field_18075), this.field_18073.method_36107(var21 + 2L));
               var3.method_36114(var24 + 2L * class_6842.method_31374(this.field_18075), this.field_18073.method_36107(var21 + 3L));
            }

            class_6842.method_31368(this.field_18075).method_31292(var3, 0L, this.field_18077);
            class_6842.method_31368(this.field_18075).method_31292(var3, class_6842.method_31374(this.field_18075), this.field_18077);
            class_6842.method_31368(this.field_18075).method_31292(var3, 2L * class_6842.method_31374(this.field_18075), this.field_18077);
            class_6842.method_31368(this.field_18075).method_31292(var3, 3L * class_6842.method_31374(this.field_18075), this.field_18077);

            for (long var17 = 0L; var17 < class_6842.method_31374(this.field_18075); var17++) {
               long var22 = var17 * class_6842.method_31357(this.field_18075) + var14;
               long var25 = class_6842.method_31374(this.field_18075) + var17;
               this.field_18073.method_36114(var22, var3.method_36107(var17));
               this.field_18073.method_36114(var22 + 1L, var3.method_36107(var25));
               this.field_18073.method_36114(var22 + 2L, var3.method_36107(var25 + class_6842.method_31374(this.field_18075)));
               this.field_18073.method_36114(var22 + 3L, var3.method_36107(var25 + 2L * class_6842.method_31374(this.field_18075)));
            }
         }
      }
   }
}
