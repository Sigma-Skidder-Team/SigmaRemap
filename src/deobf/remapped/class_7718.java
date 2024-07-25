package remapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class class_7718 {
   private class_7718() {
   }

   public static String method_34911(Map<String, String> var0) {
      StringBuilder var3 = new StringBuilder();

      for (Entry var5 : var0.entrySet()) {
         if (var3.length() > 0) {
            var3.append("&");
         }

         var3.append(class_8964.method_41123((String)var5.getKey())).append("=").append(class_8964.method_41123((String)var5.getValue()));
      }

      return var3.toString();
   }

   public static Map<String, String> method_34913(String var0) {
      HashMap var3 = new HashMap();
      String[] var4 = var0.split("&");

      for (String var8 : var4) {
         String[] var9 = var8.split("=");
         var3.put(class_8964.method_41124(var9[0]), var9.length <= 1 ? "" : class_8964.method_41124(var9[1]));
      }

      return var3;
   }
}
