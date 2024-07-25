package remapped;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import org.json.JSONException;

public class class_3466 {
   private static String[] field_16976;

   public static JSONObjectImpl method_15939(Properties var0) throws JSONException {
      JSONObjectImpl var3 = new JSONObjectImpl();
      if (var0 != null && !var0.isEmpty()) {
         Enumeration var4 = var0.propertyNames();

         while (var4.hasMoreElements()) {
            String var5 = (String)var4.nextElement();
            var3.method_5820(var5, var0.getProperty(var5));
         }
      }

      return var3;
   }

   public static Properties method_15940(JSONObjectImpl var0) throws JSONException {
      Properties var3 = new Properties();
      if (var0 != null) {
         Iterator var4 = var0.method_5841();

         while (var4.hasNext()) {
            String var5 = (String)var4.next();
            var3.put(var5, var0.method_5861(var5));
         }
      }

      return var3;
   }
}
