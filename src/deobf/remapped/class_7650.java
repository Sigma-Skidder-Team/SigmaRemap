package remapped;

import java.util.Random;

public class class_7650 extends class_1279 {
   private static String[] field_38875;

   public class_7650(class_240 var1, class_7914 var2) {
      super(class_2746.field_13422, 1, var1, var2, 1, 2, 2);
   }

   public class_7650(class_5799 var1, class_5734 var2) {
      super(class_2746.field_13422, var2);
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      class_7914 var10 = class_7914.method_35807(this.field_7031)[class_240.field_818.method_1050()];
      class_7914 var11 = this.field_7031;
      class_7914 var12 = class_7914.method_35807(var10)[class_240.field_817.method_1050()];
      class_7914 var13 = class_7914.method_35807(var11)[class_240.field_817.method_1050()];
      if (class_7914.method_35808(this.field_7031) / 25 > 0) {
         this.method_5722(var1, var5, 0, 8, class_7914.method_35806(var10)[class_240.field_802.method_1050()]);
         this.method_5722(var1, var5, 0, 0, class_7914.method_35806(var11)[class_240.field_802.method_1050()]);
      }

      if (class_7914.method_35807(var13)[class_240.field_817.method_1050()] == null) {
         this.method_5720(var1, var5, 1, 8, 1, 6, 8, 7, field_7037);
      }

      if (class_7914.method_35807(var12)[class_240.field_817.method_1050()] == null) {
         this.method_5720(var1, var5, 1, 8, 8, 6, 8, 14, field_7037);
      }

      for (int var14 = 1; var14 <= 7; var14++) {
         class_2522 var15 = field_7039;
         if (var14 == 2 || var14 == 6) {
            var15 = field_7037;
         }

         this.method_32500(var1, var5, 0, var14, 0, 0, var14, 15, var15, var15, false);
         this.method_32500(var1, var5, 7, var14, 0, 7, var14, 15, var15, var15, false);
         this.method_32500(var1, var5, 1, var14, 0, 6, var14, 0, var15, var15, false);
         this.method_32500(var1, var5, 1, var14, 15, 6, var14, 15, var15, var15, false);
      }

      for (int var16 = 1; var16 <= 7; var16++) {
         class_2522 var17 = field_7040;
         if (var16 == 2 || var16 == 6) {
            var17 = field_7032;
         }

         this.method_32500(var1, var5, 3, var16, 7, 4, var16, 8, var17, var17, false);
      }

      if (class_7914.method_35806(var11)[class_240.field_800.method_1050()]) {
         this.method_5718(var1, var5, 3, 1, 0, 4, 2, 0);
      }

      if (class_7914.method_35806(var11)[class_240.field_804.method_1050()]) {
         this.method_5718(var1, var5, 7, 1, 3, 7, 2, 4);
      }

      if (class_7914.method_35806(var11)[class_240.field_809.method_1050()]) {
         this.method_5718(var1, var5, 0, 1, 3, 0, 2, 4);
      }

      if (class_7914.method_35806(var10)[class_240.field_818.method_1050()]) {
         this.method_5718(var1, var5, 3, 1, 15, 4, 2, 15);
      }

      if (class_7914.method_35806(var10)[class_240.field_809.method_1050()]) {
         this.method_5718(var1, var5, 0, 1, 11, 0, 2, 12);
      }

      if (class_7914.method_35806(var10)[class_240.field_804.method_1050()]) {
         this.method_5718(var1, var5, 7, 1, 11, 7, 2, 12);
      }

      if (class_7914.method_35806(var13)[class_240.field_800.method_1050()]) {
         this.method_5718(var1, var5, 3, 5, 0, 4, 6, 0);
      }

      if (class_7914.method_35806(var13)[class_240.field_804.method_1050()]) {
         this.method_5718(var1, var5, 7, 5, 3, 7, 6, 4);
         this.method_32500(var1, var5, 5, 4, 2, 6, 4, 5, field_7039, field_7039, false);
         this.method_32500(var1, var5, 6, 1, 2, 6, 3, 2, field_7039, field_7039, false);
         this.method_32500(var1, var5, 6, 1, 5, 6, 3, 5, field_7039, field_7039, false);
      }

      if (class_7914.method_35806(var13)[class_240.field_809.method_1050()]) {
         this.method_5718(var1, var5, 0, 5, 3, 0, 6, 4);
         this.method_32500(var1, var5, 1, 4, 2, 2, 4, 5, field_7039, field_7039, false);
         this.method_32500(var1, var5, 1, 1, 2, 1, 3, 2, field_7039, field_7039, false);
         this.method_32500(var1, var5, 1, 1, 5, 1, 3, 5, field_7039, field_7039, false);
      }

      if (class_7914.method_35806(var12)[class_240.field_818.method_1050()]) {
         this.method_5718(var1, var5, 3, 5, 15, 4, 6, 15);
      }

      if (class_7914.method_35806(var12)[class_240.field_809.method_1050()]) {
         this.method_5718(var1, var5, 0, 5, 11, 0, 6, 12);
         this.method_32500(var1, var5, 1, 4, 10, 2, 4, 13, field_7039, field_7039, false);
         this.method_32500(var1, var5, 1, 1, 10, 1, 3, 10, field_7039, field_7039, false);
         this.method_32500(var1, var5, 1, 1, 13, 1, 3, 13, field_7039, field_7039, false);
      }

      if (class_7914.method_35806(var12)[class_240.field_804.method_1050()]) {
         this.method_5718(var1, var5, 7, 5, 11, 7, 6, 12);
         this.method_32500(var1, var5, 5, 4, 10, 6, 4, 13, field_7039, field_7039, false);
         this.method_32500(var1, var5, 6, 1, 10, 6, 3, 10, field_7039, field_7039, false);
         this.method_32500(var1, var5, 6, 1, 13, 6, 3, 13, field_7039, field_7039, false);
      }

      return true;
   }
}
