package remapped;

public class class_2548 implements Runnable {
   private static String[] field_12626;

   public class_2548(class_2817 var1, long var2, int var4, long var5, int var7, class_4330 var8, boolean var9) {
      this.field_12622 = var1;
      this.field_12627 = var2;
      this.field_12624 = var4;
      this.field_12628 = var5;
      this.field_12621 = var7;
      this.field_12623 = var8;
      this.field_12625 = var9;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(this.field_12627);
      if (class_2817.method_12816(this.field_12622) <= 2L) {
         if (class_2817.method_12816(this.field_12622) == 2L) {
            for (long var4 = 0L; var4 < class_2817.method_12835(this.field_12622); var4++) {
               long var8 = var4 * class_2817.method_12816(this.field_12622) + 2L * this.field_12628;
               var3.method_36123(var4, this.field_12623.method_36133(var8));
               var3.method_36123(var4 + class_2817.method_12835(this.field_12622), this.field_12623.method_36133(var8 + 1L));
            }

            if (this.field_12624 != -1) {
               class_2817.method_12837(this.field_12622).method_17787(var3, 0L, this.field_12625);
               class_2817.method_12837(this.field_12622).method_17787(var3, class_2817.method_12835(this.field_12622), this.field_12625);
            } else {
               class_2817.method_12837(this.field_12622).method_17784(var3, 0L);
               class_2817.method_12837(this.field_12622).method_17784(var3, class_2817.method_12835(this.field_12622));
            }

            for (long var12 = 0L; var12 < class_2817.method_12835(this.field_12622); var12++) {
               long var18 = var12 * class_2817.method_12816(this.field_12622) + 2L * this.field_12628;
               this.field_12623.method_36123(var18, var3.method_36133(var12));
               this.field_12623.method_36123(var18 + 1L, var3.method_36133(var12 + class_2817.method_12835(this.field_12622)));
            }
         }
      } else if (this.field_12624 != -1) {
         for (long var13 = 4L * this.field_12628; var13 < class_2817.method_12816(this.field_12622); var13 += (long)(4 * this.field_12621)) {
            for (long var6 = 0L; var6 < class_2817.method_12835(this.field_12622); var6++) {
               long var19 = var6 * class_2817.method_12816(this.field_12622) + var13;
               long var10 = class_2817.method_12835(this.field_12622) + var6;
               var3.method_36123(var6, this.field_12623.method_36133(var19));
               var3.method_36123(var10, this.field_12623.method_36133(var19 + 1L));
               var3.method_36123(var10 + class_2817.method_12835(this.field_12622), this.field_12623.method_36133(var19 + 2L));
               var3.method_36123(var10 + 2L * class_2817.method_12835(this.field_12622), this.field_12623.method_36133(var19 + 3L));
            }

            class_2817.method_12837(this.field_12622).method_17787(var3, 0L, this.field_12625);
            class_2817.method_12837(this.field_12622).method_17787(var3, class_2817.method_12835(this.field_12622), this.field_12625);
            class_2817.method_12837(this.field_12622).method_17787(var3, 2L * class_2817.method_12835(this.field_12622), this.field_12625);
            class_2817.method_12837(this.field_12622).method_17787(var3, 3L * class_2817.method_12835(this.field_12622), this.field_12625);

            for (long var15 = 0L; var15 < class_2817.method_12835(this.field_12622); var15++) {
               long var20 = var15 * class_2817.method_12816(this.field_12622) + var13;
               long var23 = class_2817.method_12835(this.field_12622) + var15;
               this.field_12623.method_36123(var20, var3.method_36133(var15));
               this.field_12623.method_36123(var20 + 1L, var3.method_36133(var23));
               this.field_12623.method_36123(var20 + 2L, var3.method_36133(var23 + class_2817.method_12835(this.field_12622)));
               this.field_12623.method_36123(var20 + 3L, var3.method_36133(var23 + 2L * class_2817.method_12835(this.field_12622)));
            }
         }
      } else {
         for (long var14 = 4L * this.field_12628; var14 < class_2817.method_12816(this.field_12622); var14 += (long)(4 * this.field_12621)) {
            for (long var16 = 0L; var16 < class_2817.method_12835(this.field_12622); var16++) {
               long var21 = var16 * class_2817.method_12816(this.field_12622) + var14;
               long var24 = class_2817.method_12835(this.field_12622) + var16;
               var3.method_36123(var16, this.field_12623.method_36133(var21));
               var3.method_36123(var24, this.field_12623.method_36133(var21 + 1L));
               var3.method_36123(var24 + class_2817.method_12835(this.field_12622), this.field_12623.method_36133(var21 + 2L));
               var3.method_36123(var24 + 2L * class_2817.method_12835(this.field_12622), this.field_12623.method_36133(var21 + 3L));
            }

            class_2817.method_12837(this.field_12622).method_17784(var3, 0L);
            class_2817.method_12837(this.field_12622).method_17784(var3, class_2817.method_12835(this.field_12622));
            class_2817.method_12837(this.field_12622).method_17784(var3, 2L * class_2817.method_12835(this.field_12622));
            class_2817.method_12837(this.field_12622).method_17784(var3, 3L * class_2817.method_12835(this.field_12622));

            for (long var17 = 0L; var17 < class_2817.method_12835(this.field_12622); var17++) {
               long var22 = var17 * class_2817.method_12816(this.field_12622) + var14;
               long var25 = class_2817.method_12835(this.field_12622) + var17;
               this.field_12623.method_36123(var22, var3.method_36133(var17));
               this.field_12623.method_36123(var22 + 1L, var3.method_36133(var25));
               this.field_12623.method_36123(var22 + 2L, var3.method_36133(var25 + class_2817.method_12835(this.field_12622)));
               this.field_12623.method_36123(var22 + 3L, var3.method_36133(var25 + 2L * class_2817.method_12835(this.field_12622)));
            }
         }
      }
   }
}
