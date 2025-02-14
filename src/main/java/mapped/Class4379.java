package mapped;

import java.util.HashMap;
import java.util.Map;

public class Class4379 {
   private static String[] field21390;
   private static Map<String, Long> field21391 = new HashMap<String, Long>();

   public static boolean method13743(String var0, long var1) {
      synchronized (field21391) {
         long var6 = System.currentTimeMillis();
         Long var8 = field21391.get(var0);
         if (var8 == null) {
            var8 = new Long(var6);
            field21391.put(var0, var8);
         }

         long var9 = var8;
         if (var6 < var9 + var1) {
            return false;
         } else {
            field21391.put(var0, new Long(var6));
            return true;
         }
      }
   }
}
