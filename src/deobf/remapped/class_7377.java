package remapped;

import java.util.Optional;

public class class_7377 {
   public static class_6548 method_33597(int var0, boolean var1) {
      Optional var4;
      if (!var1) {
         var4 = class_6548.method_29873(var0);
      } else {
         var4 = class_6070.method_27803(var0);
      }

      if (var4.isPresent()) {
         return (class_6548)var4.get();
      } else {
         class_3446.method_15886().method_34617().severe("Could not find 1.11 type id " + var0 + " isObject=" + var1);
         return class_6548.field_33340;
      }
   }
}
