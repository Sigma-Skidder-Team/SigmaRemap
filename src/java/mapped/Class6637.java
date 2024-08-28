package mapped;

import java.util.Iterator;
import org.json.JSONException;

public class Class6637 {
   public static JSONObject method20251(String var0) throws Class2455 {
      JSONObject var3 = new JSONObject();
      Class7475 var4 = new Class7475(var0);

      while (var4.method24220()) {
         String var5 = Class6873.method20930(var4.method24226('='));
         var4.method24222('=');
         var3.method21806(var5, Class6873.method20930(var4.method24226(';')));
         var4.method24221();
      }

      return var3;
   }

   public static String toString(JSONObject var0) throws Class2455 {
      boolean var3 = false;
      Iterator var4 = var0.method21777();
      StringBuilder var5 = new StringBuilder();

      while (var4.hasNext()) {
         String var6 = (String)var4.next();
         if (!var0.method21776(var6)) {
            if (var3) {
               var5.append(';');
            }

            var5.append(Class6873.method20928(var6));
            var5.append("=");
            var5.append(Class6873.method20928(var0.method21773(var6)));
            var3 = true;
         }
      }

      return var5.toString();
   }
}
