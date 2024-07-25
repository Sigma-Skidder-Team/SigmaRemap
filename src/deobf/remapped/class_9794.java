package remapped;

import java.util.Random;

public class class_9794 extends class_1279 {
   private static String[] field_49684;
   private int field_49683;

   public class_9794(Direction var1, class_9616 var2, int var3) {
      super(class_2746.field_13420, var1, var2);
      this.field_49683 = var3 & 1;
   }

   public class_9794(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13420, var2);
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      if (this.field_49683 != 0) {
         if (this.field_49683 == 1) {
            this.method_32500(var1, var5, 9, 3, 18, 13, 3, 20, field_7039, field_7039, false);
            this.method_32500(var1, var5, 9, 0, 18, 9, 2, 18, field_7039, field_7039, false);
            this.method_32500(var1, var5, 13, 0, 18, 13, 2, 18, field_7039, field_7039, false);
            byte var10 = 9;
            byte var11 = 20;
            byte var12 = 5;

            for (int var13 = 0; var13 < 2; var13++) {
               this.method_32529(var1, field_7039, var10, 6, 20, var5);
               this.method_32529(var1, field_7032, var10, 5, 20, var5);
               this.method_32529(var1, field_7039, var10, 4, 20, var5);
               var10 = 13;
            }

            this.method_32500(var1, var5, 7, 3, 7, 15, 3, 14, field_7039, field_7039, false);
            var10 = 10;

            for (int var18 = 0; var18 < 2; var18++) {
               this.method_32500(var1, var5, var10, 0, 10, var10, 6, 10, field_7039, field_7039, false);
               this.method_32500(var1, var5, var10, 0, 12, var10, 6, 12, field_7039, field_7039, false);
               this.method_32529(var1, field_7032, var10, 0, 10, var5);
               this.method_32529(var1, field_7032, var10, 0, 12, var5);
               this.method_32529(var1, field_7032, var10, 4, 10, var5);
               this.method_32529(var1, field_7032, var10, 4, 12, var5);
               var10 = 12;
            }

            var10 = 8;

            for (int var19 = 0; var19 < 2; var19++) {
               this.method_32500(var1, var5, var10, 0, 7, var10, 2, 7, field_7039, field_7039, false);
               this.method_32500(var1, var5, var10, 0, 14, var10, 2, 14, field_7039, field_7039, false);
               var10 = 14;
            }

            this.method_32500(var1, var5, 8, 3, 8, 8, 3, 13, field_7040, field_7040, false);
            this.method_32500(var1, var5, 14, 3, 8, 14, 3, 13, field_7040, field_7040, false);
            this.method_5719(var1, var5, 11, 5, 13);
         }
      } else {
         for (int var16 = 0; var16 < 4; var16++) {
            this.method_32500(var1, var5, 10 - var16, 3 - var16, 20 - var16, 12 + var16, 3 - var16, 20, field_7039, field_7039, false);
         }

         this.method_32500(var1, var5, 7, 0, 6, 15, 0, 16, field_7039, field_7039, false);
         this.method_32500(var1, var5, 6, 0, 6, 6, 3, 20, field_7039, field_7039, false);
         this.method_32500(var1, var5, 16, 0, 6, 16, 3, 20, field_7039, field_7039, false);
         this.method_32500(var1, var5, 7, 1, 7, 7, 1, 20, field_7039, field_7039, false);
         this.method_32500(var1, var5, 15, 1, 7, 15, 1, 20, field_7039, field_7039, false);
         this.method_32500(var1, var5, 7, 1, 6, 9, 3, 6, field_7039, field_7039, false);
         this.method_32500(var1, var5, 13, 1, 6, 15, 3, 6, field_7039, field_7039, false);
         this.method_32500(var1, var5, 8, 1, 7, 9, 1, 7, field_7039, field_7039, false);
         this.method_32500(var1, var5, 13, 1, 7, 14, 1, 7, field_7039, field_7039, false);
         this.method_32500(var1, var5, 9, 0, 5, 13, 0, 5, field_7039, field_7039, false);
         this.method_32500(var1, var5, 10, 0, 7, 12, 0, 7, field_7040, field_7040, false);
         this.method_32500(var1, var5, 8, 0, 10, 8, 0, 12, field_7040, field_7040, false);
         this.method_32500(var1, var5, 14, 0, 10, 14, 0, 12, field_7040, field_7040, false);

         for (byte var17 = 18; var17 >= 7; var17 -= 3) {
            this.method_32529(var1, field_7032, 6, 3, var17, var5);
            this.method_32529(var1, field_7032, 16, 3, var17, var5);
         }

         this.method_32529(var1, field_7032, 10, 0, 10, var5);
         this.method_32529(var1, field_7032, 12, 0, 10, var5);
         this.method_32529(var1, field_7032, 10, 0, 12, var5);
         this.method_32529(var1, field_7032, 12, 0, 12, var5);
         this.method_32529(var1, field_7032, 8, 3, 6, var5);
         this.method_32529(var1, field_7032, 14, 3, 6, var5);
         this.method_32529(var1, field_7039, 4, 2, 4, var5);
         this.method_32529(var1, field_7032, 4, 1, 4, var5);
         this.method_32529(var1, field_7039, 4, 0, 4, var5);
         this.method_32529(var1, field_7039, 18, 2, 4, var5);
         this.method_32529(var1, field_7032, 18, 1, 4, var5);
         this.method_32529(var1, field_7039, 18, 0, 4, var5);
         this.method_32529(var1, field_7039, 4, 2, 18, var5);
         this.method_32529(var1, field_7032, 4, 1, 18, var5);
         this.method_32529(var1, field_7039, 4, 0, 18, var5);
         this.method_32529(var1, field_7039, 18, 2, 18, var5);
         this.method_32529(var1, field_7032, 18, 1, 18, var5);
         this.method_32529(var1, field_7039, 18, 0, 18, var5);
         this.method_32529(var1, field_7039, 9, 7, 20, var5);
         this.method_32529(var1, field_7039, 13, 7, 20, var5);
         this.method_32500(var1, var5, 6, 0, 21, 7, 4, 21, field_7039, field_7039, false);
         this.method_32500(var1, var5, 15, 0, 21, 16, 4, 21, field_7039, field_7039, false);
         this.method_5719(var1, var5, 11, 2, 16);
      }

      return true;
   }
}
