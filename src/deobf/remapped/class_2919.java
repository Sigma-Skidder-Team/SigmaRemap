package remapped;

import java.util.HashMap;
import java.util.Map;

public class class_2919 {
   private static String[] field_14245;
   private static final Map<String, class_4382> field_14246 = new HashMap<String, class_4382>();

   public static class_4382 method_13357(String var0) {
      class_4382 var3 = field_14246.get(var0);
      if (var3 == null) {
         Identifier var4 = new Identifier(var0);
         if (class_8669.field_44445.method_39814(var4)) {
            var3 = class_8669.field_44445.method_39806(var4);
         }

         field_14246.put(var0, var3);
      }

      return var3;
   }

   public static class_4382 method_13358(Identifier var0) {
      return class_8669.field_44445.method_39814(var0) ? class_8669.field_44445.method_39806(var0) : null;
   }
}
