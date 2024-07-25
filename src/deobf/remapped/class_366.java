package remapped;

import java.util.Random;

public class class_366 extends class_1279 {
   private static String[] field_1417;

   public class_366(Direction var1, class_7914 var2) {
      super(class_2746.field_13414, 1, var1, var2, 2, 2, 2);
   }

   public class_366(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13414, var2);
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, BlockPos var7) {
      this.method_5720(var1, var5, 1, 8, 0, 14, 8, 14, field_7037);
      byte var10 = 7;
      class_2522 var11 = field_7039;
      this.method_32500(var1, var5, 0, 7, 0, 0, 7, 15, var11, var11, false);
      this.method_32500(var1, var5, 15, 7, 0, 15, 7, 15, var11, var11, false);
      this.method_32500(var1, var5, 1, 7, 0, 15, 7, 0, var11, var11, false);
      this.method_32500(var1, var5, 1, 7, 15, 14, 7, 15, var11, var11, false);

      for (int var12 = 1; var12 <= 6; var12++) {
         var11 = field_7039;
         if (var12 == 2 || var12 == 6) {
            var11 = field_7037;
         }

         for (byte var13 = 0; var13 <= 15; var13 += 15) {
            this.method_32500(var1, var5, var13, var12, 0, var13, var12, 1, var11, var11, false);
            this.method_32500(var1, var5, var13, var12, 6, var13, var12, 9, var11, var11, false);
            this.method_32500(var1, var5, var13, var12, 14, var13, var12, 15, var11, var11, false);
         }

         this.method_32500(var1, var5, 1, var12, 0, 1, var12, 0, var11, var11, false);
         this.method_32500(var1, var5, 6, var12, 0, 9, var12, 0, var11, var11, false);
         this.method_32500(var1, var5, 14, var12, 0, 14, var12, 0, var11, var11, false);
         this.method_32500(var1, var5, 1, var12, 15, 14, var12, 15, var11, var11, false);
      }

      this.method_32500(var1, var5, 6, 3, 6, 9, 6, 9, field_7040, field_7040, false);
      this.method_32500(var1, var5, 7, 4, 7, 8, 5, 8, class_4783.field_23692.method_29260(), class_4783.field_23692.method_29260(), false);

      for (byte var15 = 3; var15 <= 6; var15 += 3) {
         for (byte var16 = 6; var16 <= 9; var16 += 3) {
            this.method_32529(var1, field_7032, var16, var15, 6, var5);
            this.method_32529(var1, field_7032, var16, var15, 9, var5);
         }
      }

      this.method_32500(var1, var5, 5, 1, 6, 5, 2, 6, field_7039, field_7039, false);
      this.method_32500(var1, var5, 5, 1, 9, 5, 2, 9, field_7039, field_7039, false);
      this.method_32500(var1, var5, 10, 1, 6, 10, 2, 6, field_7039, field_7039, false);
      this.method_32500(var1, var5, 10, 1, 9, 10, 2, 9, field_7039, field_7039, false);
      this.method_32500(var1, var5, 6, 1, 5, 6, 2, 5, field_7039, field_7039, false);
      this.method_32500(var1, var5, 9, 1, 5, 9, 2, 5, field_7039, field_7039, false);
      this.method_32500(var1, var5, 6, 1, 10, 6, 2, 10, field_7039, field_7039, false);
      this.method_32500(var1, var5, 9, 1, 10, 9, 2, 10, field_7039, field_7039, false);
      this.method_32500(var1, var5, 5, 2, 5, 5, 6, 5, field_7039, field_7039, false);
      this.method_32500(var1, var5, 5, 2, 10, 5, 6, 10, field_7039, field_7039, false);
      this.method_32500(var1, var5, 10, 2, 5, 10, 6, 5, field_7039, field_7039, false);
      this.method_32500(var1, var5, 10, 2, 10, 10, 6, 10, field_7039, field_7039, false);
      this.method_32500(var1, var5, 5, 7, 1, 5, 7, 6, field_7039, field_7039, false);
      this.method_32500(var1, var5, 10, 7, 1, 10, 7, 6, field_7039, field_7039, false);
      this.method_32500(var1, var5, 5, 7, 9, 5, 7, 14, field_7039, field_7039, false);
      this.method_32500(var1, var5, 10, 7, 9, 10, 7, 14, field_7039, field_7039, false);
      this.method_32500(var1, var5, 1, 7, 5, 6, 7, 5, field_7039, field_7039, false);
      this.method_32500(var1, var5, 1, 7, 10, 6, 7, 10, field_7039, field_7039, false);
      this.method_32500(var1, var5, 9, 7, 5, 14, 7, 5, field_7039, field_7039, false);
      this.method_32500(var1, var5, 9, 7, 10, 14, 7, 10, field_7039, field_7039, false);
      this.method_32500(var1, var5, 2, 1, 2, 2, 1, 3, field_7039, field_7039, false);
      this.method_32500(var1, var5, 3, 1, 2, 3, 1, 2, field_7039, field_7039, false);
      this.method_32500(var1, var5, 13, 1, 2, 13, 1, 3, field_7039, field_7039, false);
      this.method_32500(var1, var5, 12, 1, 2, 12, 1, 2, field_7039, field_7039, false);
      this.method_32500(var1, var5, 2, 1, 12, 2, 1, 13, field_7039, field_7039, false);
      this.method_32500(var1, var5, 3, 1, 13, 3, 1, 13, field_7039, field_7039, false);
      this.method_32500(var1, var5, 13, 1, 12, 13, 1, 13, field_7039, field_7039, false);
      this.method_32500(var1, var5, 12, 1, 13, 12, 1, 13, field_7039, field_7039, false);
      return true;
   }
}
