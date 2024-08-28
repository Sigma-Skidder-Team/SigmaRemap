package mapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Class9258 {
   private Class9258() {
   }

   public static String method34814(Map<String, String> var0) {
      StringBuilder var3 = new StringBuilder();

      for (Entry var5 : var0.entrySet()) {
         if (var3.length() > 0) {
            var3.append("&");
         }

         var3.append(Class9593.method37242((String)var5.getKey())).append("=").append(Class9593.method37242((String)var5.getValue()));
      }

      return var3.toString();
   }

   public static Map<String, String> method34815(String var0) {
      HashMap var3 = new HashMap();
      String[] var4 = var0.split("&");

      for (String var8 : var4) {
         String[] var9 = var8.split("=");
         var3.put(Class9593.method37243(var9[0]), var9.length <= 1 ? "" : Class9593.method37243(var9[1]));
      }

      return var3;
   }
}
