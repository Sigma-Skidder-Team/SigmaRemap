package mapped;

import java.util.Optional;

public class Class5990 {
   public static Class1873 method18583(int var0) {
      Optional var3 = Class1873.method8134(var0);
      if (var3.isPresent()) {
         return (Class1873)var3.get();
      } else {
         ViaVersion3.method27613().getLogger().severe("Could not find 1.14 type id " + var0);
         return Class1873.field10740;
      }
   }
}
