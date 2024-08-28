package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6252 implements Class6253 {
   private static final Logger field27741 = LogManager.getLogger();

   @Override
   public Class39 method19217(String var1, Class39 var2) {
      return !var1.startsWith("data/minecraft/structures/") ? var2 : method19219(var1, method19218(var2));
   }

   private static Class39 method19218(Class39 var0) {
      if (!var0.method119("DataVersion", 99)) {
         var0.method102("DataVersion", 500);
      }

      return var0;
   }

   private static Class39 method19219(String var0, Class39 var1) {
      Class8969 var4 = new Class8969();
      int var5 = var1.method122("DataVersion");
      short var6 = 2532;
      if (var5 < 2532) {
         field27741.warn("SNBT Too old, do not forget to update: " + var5 + " < " + 2532 + ": " + var0);
      }

      Class39 var7 = Class8354.method29289(Class4497.method14181(), Class2108.field13753, var1, var5);
      var4.method32913(var7);
      return var4.method32912(new Class39());
   }
}
