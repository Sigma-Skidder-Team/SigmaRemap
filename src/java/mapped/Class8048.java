package mapped;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import org.json.JSONException;

public class Class8048 {
   private static String[] field34568;

   public static JSONObject method27642(Properties var0) throws Class2455 {
      JSONObject var3 = new JSONObject();
      if (var0 != null && !var0.isEmpty()) {
         Enumeration var4 = var0.propertyNames();

         while (var4.hasMoreElements()) {
            String var5 = (String)var4.nextElement();
            var3.method21806(var5, var0.getProperty(var5));
         }
      }

      return var3;
   }

   public static Properties method27643(JSONObject var0) throws Class2455 {
      Properties var3 = new Properties();
      if (var0 != null) {
         Iterator var4 = var0.method21777();

         while (var4.hasNext()) {
            String var5 = (String)var4.next();
            var3.put(var5, var0.method21773(var5));
         }
      }

      return var3;
   }
}
