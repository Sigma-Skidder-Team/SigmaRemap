package mapped;

import java.util.Optional;

public class Class8991 {
   public static Class1872 method33196(int var0, boolean var1) {
      Optional var4;
      if (!var1) {
         var4 = Class1872.method8133(var0);
      } else {
         var4 = Class1862.method8118(var0);
      }

      if (var4.isPresent()) {
         return (Class1872)var4.get();
      } else {
         ViaVersion3.method27613().method27366().severe("Could not find 1.10 type id " + var0 + " isObject=" + var1);
         return Class1872.field10655;
      }
   }
}
