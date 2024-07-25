package remapped;

import java.util.Random;

public class class_5551 extends class_1279 {
   private static String[] field_28262;

   public class_5551(Direction var1, class_7914 var2) {
      super(class_2746.field_13434, 1, var1, var2, 2, 2, 1);
   }

   public class_5551(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13434, var2);
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, BlockPos var7) {
      class_7914 var10 = class_7914.method_35807(this.field_7031)[Direction.field_804.method_1050()];
      class_7914 var11 = this.field_7031;
      class_7914 var12 = class_7914.method_35807(var11)[Direction.field_817.method_1050()];
      class_7914 var13 = class_7914.method_35807(var10)[Direction.field_817.method_1050()];
      if (class_7914.method_35808(this.field_7031) / 25 > 0) {
         this.method_5722(var1, var5, 8, 0, class_7914.method_35806(var10)[Direction.field_802.method_1050()]);
         this.method_5722(var1, var5, 0, 0, class_7914.method_35806(var11)[Direction.field_802.method_1050()]);
      }

      if (class_7914.method_35807(var12)[Direction.field_817.method_1050()] == null) {
         this.method_5720(var1, var5, 1, 8, 1, 7, 8, 6, field_7037);
      }

      if (class_7914.method_35807(var13)[Direction.field_817.method_1050()] == null) {
         this.method_5720(var1, var5, 8, 8, 1, 14, 8, 6, field_7037);
      }

      for (int var14 = 1; var14 <= 7; var14++) {
         class_2522 var15 = field_7039;
         if (var14 == 2 || var14 == 6) {
            var15 = field_7037;
         }

         this.method_32500(var1, var5, 0, var14, 0, 0, var14, 7, var15, var15, false);
         this.method_32500(var1, var5, 15, var14, 0, 15, var14, 7, var15, var15, false);
         this.method_32500(var1, var5, 1, var14, 0, 15, var14, 0, var15, var15, false);
         this.method_32500(var1, var5, 1, var14, 7, 14, var14, 7, var15, var15, false);
      }

      this.method_32500(var1, var5, 2, 1, 3, 2, 7, 4, field_7039, field_7039, false);
      this.method_32500(var1, var5, 3, 1, 2, 4, 7, 2, field_7039, field_7039, false);
      this.method_32500(var1, var5, 3, 1, 5, 4, 7, 5, field_7039, field_7039, false);
      this.method_32500(var1, var5, 13, 1, 3, 13, 7, 4, field_7039, field_7039, false);
      this.method_32500(var1, var5, 11, 1, 2, 12, 7, 2, field_7039, field_7039, false);
      this.method_32500(var1, var5, 11, 1, 5, 12, 7, 5, field_7039, field_7039, false);
      this.method_32500(var1, var5, 5, 1, 3, 5, 3, 4, field_7039, field_7039, false);
      this.method_32500(var1, var5, 10, 1, 3, 10, 3, 4, field_7039, field_7039, false);
      this.method_32500(var1, var5, 5, 7, 2, 10, 7, 5, field_7039, field_7039, false);
      this.method_32500(var1, var5, 5, 5, 2, 5, 7, 2, field_7039, field_7039, false);
      this.method_32500(var1, var5, 10, 5, 2, 10, 7, 2, field_7039, field_7039, false);
      this.method_32500(var1, var5, 5, 5, 5, 5, 7, 5, field_7039, field_7039, false);
      this.method_32500(var1, var5, 10, 5, 5, 10, 7, 5, field_7039, field_7039, false);
      this.method_32529(var1, field_7039, 6, 6, 2, var5);
      this.method_32529(var1, field_7039, 9, 6, 2, var5);
      this.method_32529(var1, field_7039, 6, 6, 5, var5);
      this.method_32529(var1, field_7039, 9, 6, 5, var5);
      this.method_32500(var1, var5, 5, 4, 3, 6, 4, 4, field_7039, field_7039, false);
      this.method_32500(var1, var5, 9, 4, 3, 10, 4, 4, field_7039, field_7039, false);
      this.method_32529(var1, field_7032, 5, 4, 2, var5);
      this.method_32529(var1, field_7032, 5, 4, 5, var5);
      this.method_32529(var1, field_7032, 10, 4, 2, var5);
      this.method_32529(var1, field_7032, 10, 4, 5, var5);
      if (class_7914.method_35806(var11)[Direction.field_800.method_1050()]) {
         this.method_5718(var1, var5, 3, 1, 0, 4, 2, 0);
      }

      if (class_7914.method_35806(var11)[Direction.field_818.method_1050()]) {
         this.method_5718(var1, var5, 3, 1, 7, 4, 2, 7);
      }

      if (class_7914.method_35806(var11)[Direction.field_809.method_1050()]) {
         this.method_5718(var1, var5, 0, 1, 3, 0, 2, 4);
      }

      if (class_7914.method_35806(var10)[Direction.field_800.method_1050()]) {
         this.method_5718(var1, var5, 11, 1, 0, 12, 2, 0);
      }

      if (class_7914.method_35806(var10)[Direction.field_818.method_1050()]) {
         this.method_5718(var1, var5, 11, 1, 7, 12, 2, 7);
      }

      if (class_7914.method_35806(var10)[Direction.field_804.method_1050()]) {
         this.method_5718(var1, var5, 15, 1, 3, 15, 2, 4);
      }

      if (class_7914.method_35806(var12)[Direction.field_800.method_1050()]) {
         this.method_5718(var1, var5, 3, 5, 0, 4, 6, 0);
      }

      if (class_7914.method_35806(var12)[Direction.field_818.method_1050()]) {
         this.method_5718(var1, var5, 3, 5, 7, 4, 6, 7);
      }

      if (class_7914.method_35806(var12)[Direction.field_809.method_1050()]) {
         this.method_5718(var1, var5, 0, 5, 3, 0, 6, 4);
      }

      if (class_7914.method_35806(var13)[Direction.field_800.method_1050()]) {
         this.method_5718(var1, var5, 11, 5, 0, 12, 6, 0);
      }

      if (class_7914.method_35806(var13)[Direction.field_818.method_1050()]) {
         this.method_5718(var1, var5, 11, 5, 7, 12, 6, 7);
      }

      if (class_7914.method_35806(var13)[Direction.field_804.method_1050()]) {
         this.method_5718(var1, var5, 15, 5, 3, 15, 6, 4);
      }

      return true;
   }
}
