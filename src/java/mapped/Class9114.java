package mapped;

import java.util.Optional;

public class Class9114 {
   public static Class1870 method33997(int var0) {
      Optional var3 = Class1870.method8131(var0);
      if (var3.isPresent()) {
         return (Class1870)var3.get();
      } else {
         ViaVersion3.method27613().method27366().severe("Could not find 1.15 type id " + var0);
         return Class1870.field10416;
      }
   }
}
