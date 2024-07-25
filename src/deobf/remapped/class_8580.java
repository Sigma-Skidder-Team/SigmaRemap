package remapped;

import java.util.Random;

public class class_8580 extends class_1279 {
   private static String[] field_43968;

   public class_8580(Direction var1, class_7914 var2) {
      super(class_2746.field_13393, 1, var1, var2, 1, 2, 1);
   }

   public class_8580(class_5799 var1, class_5734 var2) {
      super(class_2746.field_13393, var2);
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      if (class_7914.method_35808(this.field_7031) / 25 > 0) {
         this.method_5722(var1, var5, 0, 0, class_7914.method_35806(this.field_7031)[Direction.field_802.method_1050()]);
      }

      class_7914 var10 = class_7914.method_35807(this.field_7031)[Direction.field_817.method_1050()];
      if (class_7914.method_35807(var10)[Direction.field_817.method_1050()] == null) {
         this.method_5720(var1, var5, 1, 8, 1, 6, 8, 6, field_7037);
      }

      this.method_32500(var1, var5, 0, 4, 0, 0, 4, 7, field_7039, field_7039, false);
      this.method_32500(var1, var5, 7, 4, 0, 7, 4, 7, field_7039, field_7039, false);
      this.method_32500(var1, var5, 1, 4, 0, 6, 4, 0, field_7039, field_7039, false);
      this.method_32500(var1, var5, 1, 4, 7, 6, 4, 7, field_7039, field_7039, false);
      this.method_32500(var1, var5, 2, 4, 1, 2, 4, 2, field_7039, field_7039, false);
      this.method_32500(var1, var5, 1, 4, 2, 1, 4, 2, field_7039, field_7039, false);
      this.method_32500(var1, var5, 5, 4, 1, 5, 4, 2, field_7039, field_7039, false);
      this.method_32500(var1, var5, 6, 4, 2, 6, 4, 2, field_7039, field_7039, false);
      this.method_32500(var1, var5, 2, 4, 5, 2, 4, 6, field_7039, field_7039, false);
      this.method_32500(var1, var5, 1, 4, 5, 1, 4, 5, field_7039, field_7039, false);
      this.method_32500(var1, var5, 5, 4, 5, 5, 4, 6, field_7039, field_7039, false);
      this.method_32500(var1, var5, 6, 4, 5, 6, 4, 5, field_7039, field_7039, false);
      class_7914 var11 = this.field_7031;

      for (byte var12 = 1; var12 <= 5; var12 += 4) {
         byte var13 = 0;
         if (!class_7914.method_35806(var11)[Direction.field_800.method_1050()]) {
            this.method_32500(var1, var5, 0, var12, var13, 7, var12 + 2, var13, field_7039, field_7039, false);
            this.method_32500(var1, var5, 0, var12 + 1, var13, 7, var12 + 1, var13, field_7037, field_7037, false);
         } else {
            this.method_32500(var1, var5, 2, var12, var13, 2, var12 + 2, var13, field_7039, field_7039, false);
            this.method_32500(var1, var5, 5, var12, var13, 5, var12 + 2, var13, field_7039, field_7039, false);
            this.method_32500(var1, var5, 3, var12 + 2, var13, 4, var12 + 2, var13, field_7039, field_7039, false);
         }

         var13 = 7;
         if (!class_7914.method_35806(var11)[Direction.field_818.method_1050()]) {
            this.method_32500(var1, var5, 0, var12, var13, 7, var12 + 2, var13, field_7039, field_7039, false);
            this.method_32500(var1, var5, 0, var12 + 1, var13, 7, var12 + 1, var13, field_7037, field_7037, false);
         } else {
            this.method_32500(var1, var5, 2, var12, var13, 2, var12 + 2, var13, field_7039, field_7039, false);
            this.method_32500(var1, var5, 5, var12, var13, 5, var12 + 2, var13, field_7039, field_7039, false);
            this.method_32500(var1, var5, 3, var12 + 2, var13, 4, var12 + 2, var13, field_7039, field_7039, false);
         }

         byte var14 = 0;
         if (!class_7914.method_35806(var11)[Direction.field_809.method_1050()]) {
            this.method_32500(var1, var5, var14, var12, 0, var14, var12 + 2, 7, field_7039, field_7039, false);
            this.method_32500(var1, var5, var14, var12 + 1, 0, var14, var12 + 1, 7, field_7037, field_7037, false);
         } else {
            this.method_32500(var1, var5, var14, var12, 2, var14, var12 + 2, 2, field_7039, field_7039, false);
            this.method_32500(var1, var5, var14, var12, 5, var14, var12 + 2, 5, field_7039, field_7039, false);
            this.method_32500(var1, var5, var14, var12 + 2, 3, var14, var12 + 2, 4, field_7039, field_7039, false);
         }

         var14 = 7;
         if (!class_7914.method_35806(var11)[Direction.field_804.method_1050()]) {
            this.method_32500(var1, var5, var14, var12, 0, var14, var12 + 2, 7, field_7039, field_7039, false);
            this.method_32500(var1, var5, var14, var12 + 1, 0, var14, var12 + 1, 7, field_7037, field_7037, false);
         } else {
            this.method_32500(var1, var5, var14, var12, 2, var14, var12 + 2, 2, field_7039, field_7039, false);
            this.method_32500(var1, var5, var14, var12, 5, var14, var12 + 2, 5, field_7039, field_7039, false);
            this.method_32500(var1, var5, var14, var12 + 2, 3, var14, var12 + 2, 4, field_7039, field_7039, false);
         }

         var11 = var10;
      }

      return true;
   }
}
