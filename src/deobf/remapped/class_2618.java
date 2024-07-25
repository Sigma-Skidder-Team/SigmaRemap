package remapped;

import java.util.Optional;

public class class_2618 {
   public static class_5935 method_11866(int var0, boolean var1) {
      Optional var4;
      if (!var1) {
         var4 = class_5935.method_27135(var0);
      } else {
         var4 = class_6421.method_29345(var0);
      }

      if (var4.isPresent()) {
         return (class_5935)var4.get();
      } else {
         class_3446.method_15886().method_34617().severe("Could not find 1.12 type id " + var0 + " isObject=" + var1);
         return class_5935.field_30172;
      }
   }
}
