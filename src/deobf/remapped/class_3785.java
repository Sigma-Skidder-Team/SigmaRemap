package remapped;

import java.util.Random;

public class class_3785 extends class_1279 {
   private static String[] field_18471;

   public class_3785(class_240 var1, class_7914 var2) {
      super(class_2746.field_13399, 1, var1, var2, 1, 1, 1);
   }

   public class_3785(class_5799 var1, class_5734 var2) {
      super(class_2746.field_13399, var2);
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      if (class_7914.method_35808(this.field_7031) / 25 > 0) {
         this.method_5722(var1, var5, 0, 0, class_7914.method_35806(this.field_7031)[class_240.field_802.method_1050()]);
      }

      if (class_7914.method_35807(this.field_7031)[class_240.field_817.method_1050()] == null) {
         this.method_5720(var1, var5, 1, 4, 1, 6, 4, 6, field_7037);
      }

      for (int var10 = 1; var10 <= 6; var10++) {
         for (int var11 = 1; var11 <= 6; var11++) {
            if (var4.nextInt(3) != 0) {
               int var12 = 2 + (var4.nextInt(4) != 0 ? 1 : 0);
               class_2522 var13 = class_4783.field_23172.method_29260();
               this.method_32500(var1, var5, var10, var12, var11, var10, 3, var11, var13, var13, false);
            }
         }
      }

      this.method_32500(var1, var5, 0, 1, 0, 0, 1, 7, field_7039, field_7039, false);
      this.method_32500(var1, var5, 7, 1, 0, 7, 1, 7, field_7039, field_7039, false);
      this.method_32500(var1, var5, 1, 1, 0, 6, 1, 0, field_7039, field_7039, false);
      this.method_32500(var1, var5, 1, 1, 7, 6, 1, 7, field_7039, field_7039, false);
      this.method_32500(var1, var5, 0, 2, 0, 0, 2, 7, field_7040, field_7040, false);
      this.method_32500(var1, var5, 7, 2, 0, 7, 2, 7, field_7040, field_7040, false);
      this.method_32500(var1, var5, 1, 2, 0, 6, 2, 0, field_7040, field_7040, false);
      this.method_32500(var1, var5, 1, 2, 7, 6, 2, 7, field_7040, field_7040, false);
      this.method_32500(var1, var5, 0, 3, 0, 0, 3, 7, field_7039, field_7039, false);
      this.method_32500(var1, var5, 7, 3, 0, 7, 3, 7, field_7039, field_7039, false);
      this.method_32500(var1, var5, 1, 3, 0, 6, 3, 0, field_7039, field_7039, false);
      this.method_32500(var1, var5, 1, 3, 7, 6, 3, 7, field_7039, field_7039, false);
      this.method_32500(var1, var5, 0, 1, 3, 0, 2, 4, field_7040, field_7040, false);
      this.method_32500(var1, var5, 7, 1, 3, 7, 2, 4, field_7040, field_7040, false);
      this.method_32500(var1, var5, 3, 1, 0, 4, 2, 0, field_7040, field_7040, false);
      this.method_32500(var1, var5, 3, 1, 7, 4, 2, 7, field_7040, field_7040, false);
      if (class_7914.method_35806(this.field_7031)[class_240.field_800.method_1050()]) {
         this.method_5718(var1, var5, 3, 1, 0, 4, 2, 0);
      }

      return true;
   }
}
