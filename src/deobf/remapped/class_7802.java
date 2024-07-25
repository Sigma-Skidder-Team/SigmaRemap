package remapped;

import java.util.Random;

public class class_7802 implements class_5225 {
   private static String[] field_39511;

   private class_7802() {
   }

   @Override
   public boolean method_23912(class_7914 var1) {
      if (class_7914.method_35806(var1)[Direction.field_818.method_1050()]
         && !class_7914.method_35813(class_7914.method_35807(var1)[Direction.field_818.method_1050()])
         && class_7914.method_35806(var1)[Direction.field_817.method_1050()]
         && !class_7914.method_35813(class_7914.method_35807(var1)[Direction.field_817.method_1050()])) {
         class_7914 var4 = class_7914.method_35807(var1)[Direction.field_818.method_1050()];
         return class_7914.method_35806(var4)[Direction.field_817.method_1050()]
            && !class_7914.method_35813(class_7914.method_35807(var4)[Direction.field_817.method_1050()]);
      } else {
         return false;
      }
   }

   @Override
   public class_1279 method_23913(Direction var1, class_7914 var2, Random var3) {
      class_7914.method_35804(var2, true);
      class_7914.method_35804(class_7914.method_35807(var2)[Direction.field_818.method_1050()], true);
      class_7914.method_35804(class_7914.method_35807(var2)[Direction.field_817.method_1050()], true);
      class_7914.method_35804(
         class_7914.method_35807(class_7914.method_35807(var2)[Direction.field_818.method_1050()])[Direction.field_817.method_1050()], true
      );
      return new class_7650(var1, var2);
   }
}
