package remapped;

import java.util.Random;

public class class_6063 implements class_5225 {
   private static String[] field_31016;

   private class_6063() {
   }

   @Override
   public boolean method_23912(class_7914 var1) {
      return !class_7914.method_35806(var1)[Direction.field_809.method_1050()]
         && !class_7914.method_35806(var1)[Direction.field_804.method_1050()]
         && !class_7914.method_35806(var1)[Direction.field_818.method_1050()]
         && !class_7914.method_35806(var1)[Direction.field_800.method_1050()]
         && !class_7914.method_35806(var1)[Direction.field_817.method_1050()];
   }

   @Override
   public class_1279 method_23913(Direction var1, class_7914 var2, Random var3) {
      class_7914.method_35804(var2, true);
      return new class_3785(var1, var2);
   }
}
