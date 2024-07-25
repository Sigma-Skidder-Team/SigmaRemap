package remapped;

import java.util.Optional;

public class class_7065 {
   public static class_3085 method_32542(int var0) {
      Optional var3 = class_3085.method_14156(var0);
      if (var3.isPresent()) {
         return (class_3085)var3.get();
      } else {
         class_3446.method_15886().method_34617().severe("Could not find 1.15 type id " + var0);
         return class_3085.field_15175;
      }
   }
}
