package remapped;

import java.util.Random;

public class class_7785 implements class_5225 {
   private static String[] field_39452;

   private class_7785() {
   }

   @Override
   public boolean method_23912(class_7914 var1) {
      return class_7914.method_35806(var1)[Direction.field_804.method_1050()]
         && !class_7914.method_35813(class_7914.method_35807(var1)[Direction.field_804.method_1050()]);
   }

   @Override
   public class_1279 method_23913(Direction var1, class_7914 var2, Random var3) {
      class_7914.method_35804(var2, true);
      class_7914.method_35804(class_7914.method_35807(var2)[Direction.field_804.method_1050()], true);
      return new class_2361(var1, var2);
   }
}
