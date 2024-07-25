package remapped;

import java.util.HashMap;
import java.util.Map;

public class class_8213 {
   private static String[] field_42020;
   private static Map<String, Integer> field_42019 = new HashMap<String, Integer>();

   public static boolean method_37616(String var0, int var1) {
      synchronized (field_42019) {
         int var5 = MinecraftClient.method_8510().field_9657.method_20022();
         if (var5 <= 0) {
            return false;
         } else {
            Integer var6 = field_42019.get(var0);
            if (var6 == null) {
               var6 = new Integer(var5);
               field_42019.put(var0, var6);
            }

            int var7 = var6;
            if (var5 > var7 && var5 < var7 + var1) {
               return false;
            } else {
               field_42019.put(var0, new Integer(var5));
               return true;
            }
         }
      }
   }
}
