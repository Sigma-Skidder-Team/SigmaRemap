package remapped;

public class class_6156 implements Runnable {
   private static String[] field_31534;

   public class_6156(class_8751 var1, long var2, int var4, long var5, long var7, class_4330 var9, boolean var10) {
      this.field_31536 = var1;
      this.field_31535 = var2;
      this.field_31537 = var4;
      this.field_31539 = var5;
      this.field_31533 = var7;
      this.field_31532 = var9;
      this.field_31538 = var10;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(this.field_31535);
      if (class_8751.method_40171(this.field_31536) <= 2L) {
         if (class_8751.method_40171(this.field_31536) == 2L) {
            for (long var4 = 0L; var4 < class_8751.method_40166(this.field_31536); var4++) {
               long var8 = var4 * class_8751.method_40171(this.field_31536) + 2L * this.field_31539;
               var3.method_36123(var4, this.field_31532.method_36133(var8));
               var3.method_36123(var4 + class_8751.method_40166(this.field_31536), this.field_31532.method_36133(var8 + 1L));
            }

            if (this.field_31537 != -1) {
               class_8751.method_40180(this.field_31536).method_21129(var3, 0L, this.field_31538);
               class_8751.method_40180(this.field_31536).method_21129(var3, class_8751.method_40166(this.field_31536), this.field_31538);
            } else {
               class_8751.method_40180(this.field_31536).method_21137(var3, 0L, this.field_31538);
               class_8751.method_40180(this.field_31536).method_21137(var3, class_8751.method_40166(this.field_31536), this.field_31538);
            }

            for (long var12 = 0L; var12 < class_8751.method_40166(this.field_31536); var12++) {
               long var18 = var12 * class_8751.method_40171(this.field_31536) + 2L * this.field_31539;
               this.field_31532.method_36123(var18, var3.method_36133(var12));
               this.field_31532.method_36123(var18 + 1L, var3.method_36133(var12 + class_8751.method_40166(this.field_31536)));
            }
         }
      } else if (this.field_31537 != -1) {
         for (long var13 = 4L * this.field_31539; var13 < class_8751.method_40171(this.field_31536); var13 += 4L * this.field_31533) {
            for (long var6 = 0L; var6 < class_8751.method_40166(this.field_31536); var6++) {
               long var19 = var6 * class_8751.method_40171(this.field_31536) + var13;
               long var10 = class_8751.method_40166(this.field_31536) + var6;
               var3.method_36123(var6, this.field_31532.method_36133(var19));
               var3.method_36123(var10, this.field_31532.method_36133(var19 + 1L));
               var3.method_36123(var10 + class_8751.method_40166(this.field_31536), this.field_31532.method_36133(var19 + 2L));
               var3.method_36123(var10 + 2L * class_8751.method_40166(this.field_31536), this.field_31532.method_36133(var19 + 3L));
            }

            class_8751.method_40180(this.field_31536).method_21130(var3, this.field_31538);
            class_8751.method_40180(this.field_31536).method_21129(var3, class_8751.method_40166(this.field_31536), this.field_31538);
            class_8751.method_40180(this.field_31536).method_21129(var3, 2L * class_8751.method_40166(this.field_31536), this.field_31538);
            class_8751.method_40180(this.field_31536).method_21129(var3, 3L * class_8751.method_40166(this.field_31536), this.field_31538);

            for (long var15 = 0L; var15 < class_8751.method_40166(this.field_31536); var15++) {
               long var20 = var15 * class_8751.method_40171(this.field_31536) + var13;
               long var23 = class_8751.method_40166(this.field_31536) + var15;
               this.field_31532.method_36123(var20, var3.method_36133(var15));
               this.field_31532.method_36123(var20 + 1L, var3.method_36133(var23));
               this.field_31532.method_36123(var20 + 2L, var3.method_36133(var23 + class_8751.method_40166(this.field_31536)));
               this.field_31532.method_36123(var20 + 3L, var3.method_36133(var23 + 2L * class_8751.method_40166(this.field_31536)));
            }
         }
      } else {
         for (long var14 = 4L * this.field_31539; var14 < class_8751.method_40171(this.field_31536); var14 += 4L * this.field_31533) {
            for (long var16 = 0L; var16 < class_8751.method_40166(this.field_31536); var16++) {
               long var21 = var16 * class_8751.method_40171(this.field_31536) + var14;
               long var24 = class_8751.method_40166(this.field_31536) + var16;
               var3.method_36123(var16, this.field_31532.method_36133(var21));
               var3.method_36123(var24, this.field_31532.method_36133(var21 + 1L));
               var3.method_36123(var24 + class_8751.method_40166(this.field_31536), this.field_31532.method_36133(var21 + 2L));
               var3.method_36123(var24 + 2L * class_8751.method_40166(this.field_31536), this.field_31532.method_36133(var21 + 3L));
            }

            class_8751.method_40180(this.field_31536).method_21137(var3, 0L, this.field_31538);
            class_8751.method_40180(this.field_31536).method_21137(var3, class_8751.method_40166(this.field_31536), this.field_31538);
            class_8751.method_40180(this.field_31536).method_21137(var3, 2L * class_8751.method_40166(this.field_31536), this.field_31538);
            class_8751.method_40180(this.field_31536).method_21137(var3, 3L * class_8751.method_40166(this.field_31536), this.field_31538);

            for (long var17 = 0L; var17 < class_8751.method_40166(this.field_31536); var17++) {
               long var22 = var17 * class_8751.method_40171(this.field_31536) + var14;
               long var25 = class_8751.method_40166(this.field_31536) + var17;
               this.field_31532.method_36123(var22, var3.method_36133(var17));
               this.field_31532.method_36123(var22 + 1L, var3.method_36133(var25));
               this.field_31532.method_36123(var22 + 2L, var3.method_36133(var25 + class_8751.method_40166(this.field_31536)));
               this.field_31532.method_36123(var22 + 3L, var3.method_36133(var25 + 2L * class_8751.method_40166(this.field_31536)));
            }
         }
      }
   }
}
