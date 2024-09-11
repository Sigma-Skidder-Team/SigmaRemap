package mapped;

import java.util.Optional;

public class Class8753 {
   public static Class1866 method31579(int var0, boolean var1) {
      Optional var4;
      if (!var1) {
         var4 = Class1866.method8123(var0);
      } else {
         var4 = Class1861.method8115(var0);
      }

      if (var4.isPresent()) {
         return (Class1866)var4.get();
      } else {
         ViaVersion3.method27613().getLogger().severe("Could not find 1.13 type id " + var0 + " isObject=" + var1);
         return Class1866.field10050;
      }
   }
}
