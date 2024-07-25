package remapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_548 implements class_2017 {
   private static final Logger field_3283 = LogManager.getLogger();

   @Override
   public class_5734 method_9366(String var1, class_5734 var2) {
      return !var1.startsWith("data/minecraft/structures/") ? var2 : method_2647(var1, method_2645(var2));
   }

   private static class_5734 method_2645(class_5734 var0) {
      if (!var0.method_25939("DataVersion", 99)) {
         var0.method_25931("DataVersion", 500);
      }

      return var0;
   }

   private static class_5734 method_2647(String var0, class_5734 var1) {
      class_6561 var4 = new class_6561();
      int var5 = var1.method_25947("DataVersion");
      short var6 = 2532;
      if (var5 < 2532) {
         field_3283.warn("SNBT Too old, do not forget to update: " + var5 + " < " + 2532 + ": " + var0);
      }

      class_5734 var7 = class_4338.method_20179(class_148.method_580(), class_5397.field_27546, var1, var5);
      var4.method_29990(var7);
      return var4.method_29993(new class_5734());
   }
}
