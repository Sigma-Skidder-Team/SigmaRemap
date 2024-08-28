package mapped;

import java.util.Optional;

public class Class9185 {
   public static Class1868 method34362(int var0, boolean var1) {
      Optional var4;
      if (!var1) {
         var4 = Class1868.method8129(var0);
      } else {
         var4 = Class1863.method8120(var0);
      }

      if (var4.isPresent()) {
         return (Class1868)var4.get();
      } else {
         Class8042.method27613().method27366().severe("Could not find 1.11 type id " + var0 + " isObject=" + var1);
         return Class1868.field10176;
      }
   }
}
