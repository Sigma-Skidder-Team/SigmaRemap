package remapped;

import java.util.Random;

public class class_2361 extends class_1279 {
   private static String[] field_11844;

   public class_2361(Direction var1, class_7914 var2) {
      super(class_2746.field_13412, 1, var1, var2, 2, 1, 1);
   }

   public class_2361(class_5799 var1, class_5734 var2) {
      super(class_2746.field_13412, var2);
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      class_7914 var10 = class_7914.method_35807(this.field_7031)[Direction.field_804.method_1050()];
      class_7914 var11 = this.field_7031;
      if (class_7914.method_35808(this.field_7031) / 25 > 0) {
         this.method_5722(var1, var5, 8, 0, class_7914.method_35806(var10)[Direction.field_802.method_1050()]);
         this.method_5722(var1, var5, 0, 0, class_7914.method_35806(var11)[Direction.field_802.method_1050()]);
      }

      if (class_7914.method_35807(var11)[Direction.field_817.method_1050()] == null) {
         this.method_5720(var1, var5, 1, 4, 1, 7, 4, 6, field_7037);
      }

      if (class_7914.method_35807(var10)[Direction.field_817.method_1050()] == null) {
         this.method_5720(var1, var5, 8, 4, 1, 14, 4, 6, field_7037);
      }

      this.method_32500(var1, var5, 0, 3, 0, 0, 3, 7, field_7039, field_7039, false);
      this.method_32500(var1, var5, 15, 3, 0, 15, 3, 7, field_7039, field_7039, false);
      this.method_32500(var1, var5, 1, 3, 0, 15, 3, 0, field_7039, field_7039, false);
      this.method_32500(var1, var5, 1, 3, 7, 14, 3, 7, field_7039, field_7039, false);
      this.method_32500(var1, var5, 0, 2, 0, 0, 2, 7, field_7037, field_7037, false);
      this.method_32500(var1, var5, 15, 2, 0, 15, 2, 7, field_7037, field_7037, false);
      this.method_32500(var1, var5, 1, 2, 0, 15, 2, 0, field_7037, field_7037, false);
      this.method_32500(var1, var5, 1, 2, 7, 14, 2, 7, field_7037, field_7037, false);
      this.method_32500(var1, var5, 0, 1, 0, 0, 1, 7, field_7039, field_7039, false);
      this.method_32500(var1, var5, 15, 1, 0, 15, 1, 7, field_7039, field_7039, false);
      this.method_32500(var1, var5, 1, 1, 0, 15, 1, 0, field_7039, field_7039, false);
      this.method_32500(var1, var5, 1, 1, 7, 14, 1, 7, field_7039, field_7039, false);
      this.method_32500(var1, var5, 5, 1, 0, 10, 1, 4, field_7039, field_7039, false);
      this.method_32500(var1, var5, 6, 2, 0, 9, 2, 3, field_7037, field_7037, false);
      this.method_32500(var1, var5, 5, 3, 0, 10, 3, 4, field_7039, field_7039, false);
      this.method_32529(var1, field_7032, 6, 2, 3, var5);
      this.method_32529(var1, field_7032, 9, 2, 3, var5);
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

      return true;
   }
}
