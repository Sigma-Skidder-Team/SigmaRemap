package remapped;

import java.util.HashMap;
import java.util.Map;

public class class_124 {
   private static String[] field_303;
   private static Map<String, Long> field_302 = new HashMap<String, Long>();

   public static boolean method_386(String var0, long var1) {
      synchronized (field_302) {
         long var6 = System.currentTimeMillis();
         Long var8 = field_302.get(var0);
         if (var8 == null) {
            var8 = new Long(var6);
            field_302.put(var0, var8);
         }

         long var9 = var8;
         if (var6 < var9 + var1) {
            return false;
         } else {
            field_302.put(var0, new Long(var6));
            return true;
         }
      }
   }
}
