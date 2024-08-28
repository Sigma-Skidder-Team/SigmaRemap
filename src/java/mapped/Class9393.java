package mapped;

import java.util.HashMap;
import java.util.Map;

public class Class9393 {
   private static String[] field43586;
   private static Map<String, Integer> field43587 = new HashMap<String, Integer>();

   public static boolean method35660(String var0, int var1) {
      synchronized (field43587) {
         int var5 = Minecraft.getInstance().worldRenderer.method935();
         if (var5 <= 0) {
            return false;
         } else {
            Integer var6 = field43587.get(var0);
            if (var6 == null) {
               var6 = new Integer(var5);
               field43587.put(var0, var6);
            }

            int var7 = var6;
            if (var5 > var7 && var5 < var7 + var1) {
               return false;
            } else {
               field43587.put(var0, new Integer(var5));
               return true;
            }
         }
      }
   }
}
