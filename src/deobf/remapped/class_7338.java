package remapped;

import java.util.Optional;

public class class_7338 {
   public static class_8221 method_33466(int var0) {
      Optional var3 = class_8221.method_37627(var0);
      if (var3.isPresent()) {
         return (class_8221)var3.get();
      } else {
         class_3446.method_15886().method_34617().severe("Could not find 1.16 type id " + var0);
         return class_8221.field_42158;
      }
   }
}
