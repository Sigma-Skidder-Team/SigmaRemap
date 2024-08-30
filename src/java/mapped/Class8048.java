package mapped;

import totalcross.json.JSONException;
import totalcross.json.JSONObject;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;

public class Class8048 {
   private static String[] field34568;

   public static JSONObject method27642(Properties var0) throws JSONException {
      JSONObject var3 = new JSONObject();
      if (var0 != null && !var0.isEmpty()) {
         Enumeration var4 = var0.propertyNames();

         while (var4.hasMoreElements()) {
            String var5 = (String)var4.nextElement();
            var3.put(var5, var0.getProperty(var5));
         }
      }

      return var3;
   }

   public static Properties method27643(JSONObject var0) throws JSONException {
      Properties var3 = new Properties();
      if (var0 != null) {
         Iterator var4 = var0.method21777();

         while (var4.hasNext()) {
            String var5 = (String)var4.next();
            var3.put(var5, var0.getString(var5));
         }
      }

      return var3;
   }
}
