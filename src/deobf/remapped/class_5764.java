package remapped;

import java.util.Optional;

public class class_5764 {
   public static class_4630 method_26066(int var0, boolean var1) {
      Optional var4;
      if (!var1) {
         var4 = class_4630.method_21424(var0);
      } else {
         var4 = class_54.method_7(var0);
      }

      if (var4.isPresent()) {
         return (class_4630)var4.get();
      } else {
         class_3446.method_15886().method_34617().severe("Could not find 1.13 type id " + var0 + " isObject=" + var1);
         return class_4630.field_22548;
      }
   }
}
