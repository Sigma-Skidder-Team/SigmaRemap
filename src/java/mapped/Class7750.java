package mapped;

import java.util.Optional;

public class Class7750 {
   public static Class1871 method25671(int var0, boolean var1) {
      Optional var4;
      if (!var1) {
         var4 = Class1871.method8132(var0);
      } else {
         var4 = Class1859.method8112(var0);
      }

      if (var4.isPresent()) {
         return (Class1871)var4.get();
      } else {
         ViaVersion3.method27613().method27366().severe("Could not find 1.12 type id " + var0 + " isObject=" + var1);
         return Class1871.field10550;
      }
   }
}
