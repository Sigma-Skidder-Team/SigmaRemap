package remapped;

import java.util.Optional;

public class class_5828 {
   public static class_9880 method_26382(int var0) {
      Optional var3 = class_9880.method_45526(var0);
      if (var3.isPresent()) {
         return (class_9880)var3.get();
      } else {
         class_3446.method_15886().method_34617().severe("Could not find 1.16.2 type id " + var0);
         return class_9880.field_49950;
      }
   }
}
