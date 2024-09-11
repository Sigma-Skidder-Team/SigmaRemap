package mapped;

import java.util.Optional;

public class Class9177 {
   public static Class1869 method34324(int var0) {
      Optional var3 = Class1869.method8130(var0);
      if (var3.isPresent()) {
         return (Class1869)var3.get();
      } else {
         ViaVersion3.method27613().getLogger().severe("Could not find 1.16 type id " + var0);
         return Class1869.field10278;
      }
   }
}
