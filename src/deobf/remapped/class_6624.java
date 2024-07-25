package remapped;

import java.util.Optional;

public class class_6624 {
   public static class_5813 method_30444(int var0, boolean var1) {
      Optional var4;
      if (!var1) {
         var4 = class_5813.method_26323(var0);
      } else {
         var4 = class_96.method_283(var0);
      }

      if (var4.isPresent()) {
         return (class_5813)var4.get();
      } else {
         class_3446.method_15886().method_34617().severe("Could not find 1.10 type id " + var0 + " isObject=" + var1);
         return class_5813.field_29426;
      }
   }
}
