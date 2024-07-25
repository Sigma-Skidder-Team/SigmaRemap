package remapped;

import java.util.Random;

public class class_311 extends class_1279 {
   private static String[] field_1147;

   public class_311(Direction var1, class_7914 var2) {
      super(class_2746.field_13446, 1, var1, var2, 1, 1, 1);
   }

   public class_311(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13446, var2);
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      this.method_32500(var1, var5, 0, 3, 0, 2, 3, 7, field_7039, field_7039, false);
      this.method_32500(var1, var5, 5, 3, 0, 7, 3, 7, field_7039, field_7039, false);
      this.method_32500(var1, var5, 0, 2, 0, 1, 2, 7, field_7039, field_7039, false);
      this.method_32500(var1, var5, 6, 2, 0, 7, 2, 7, field_7039, field_7039, false);
      this.method_32500(var1, var5, 0, 1, 0, 0, 1, 7, field_7039, field_7039, false);
      this.method_32500(var1, var5, 7, 1, 0, 7, 1, 7, field_7039, field_7039, false);
      this.method_32500(var1, var5, 0, 1, 7, 7, 3, 7, field_7039, field_7039, false);
      this.method_32500(var1, var5, 1, 1, 0, 2, 3, 0, field_7039, field_7039, false);
      this.method_32500(var1, var5, 5, 1, 0, 6, 3, 0, field_7039, field_7039, false);
      if (class_7914.method_35806(this.field_7031)[Direction.field_818.method_1050()]) {
         this.method_5718(var1, var5, 3, 1, 7, 4, 2, 7);
      }

      if (class_7914.method_35806(this.field_7031)[Direction.field_809.method_1050()]) {
         this.method_5718(var1, var5, 0, 1, 3, 1, 2, 4);
      }

      if (class_7914.method_35806(this.field_7031)[Direction.field_804.method_1050()]) {
         this.method_5718(var1, var5, 6, 1, 3, 7, 2, 4);
      }

      return true;
   }
}
