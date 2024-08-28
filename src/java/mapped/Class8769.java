package mapped;

import java.util.Optional;

public class Class8769 {
   public static Class1874 method31633(int var0) {
      Optional var3 = Class1874.method8135(var0);
      if (var3.isPresent()) {
         return (Class1874)var3.get();
      } else {
         Class8042.method27613().method27366().severe("Could not find 1.16.2 type id " + var0);
         return Class1874.field10873;
      }
   }
}
