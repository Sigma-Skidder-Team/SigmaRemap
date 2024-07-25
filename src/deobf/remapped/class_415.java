package remapped;

import java.util.Optional;

public class class_415 {
   public static class_6124 method_2063(int var0) {
      Optional var3 = class_6124.method_28146(var0);
      if (var3.isPresent()) {
         return (class_6124)var3.get();
      } else {
         class_3446.method_15886().method_34617().severe("Could not find 1.14 type id " + var0);
         return class_6124.field_31326;
      }
   }
}
