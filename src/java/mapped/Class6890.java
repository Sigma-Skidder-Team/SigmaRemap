package mapped;

import java.util.Iterator;
import org.json.JSONException;

public class Class6890 {
   public static final String field29861 = "\r\n";

   public static JSONObject method21049(String var0) throws Class2455 {
      JSONObject var3 = new JSONObject();
      Class7476 var4 = new Class7476(var0);
      String var5 = var4.method24231();
      if (!var5.toUpperCase().startsWith("HTTP")) {
         var3.method21806("Method", var5);
         var3.method21806("Request-URI", var4.method24231());
         var3.method21806("HTTP-Version", var4.method24231());
      } else {
         var3.method21806("HTTP-Version", var5);
         var3.method21806("Status-Code", var4.method24231());
         var3.method21806("Reason-Phrase", var4.method24226('\u0000'));
         var4.method24221();
      }

      while (var4.method24220()) {
         String var6 = var4.method24226(':');
         var4.method24222(':');
         var3.method21806(var6, var4.method24226('\u0000'));
         var4.method24221();
      }

      return var3;
   }

   public static String toString(JSONObject var0) throws Class2455 {
      Iterator var3 = var0.method21777();
      StringBuilder var4 = new StringBuilder();
      if (var0.has("Status-Code") && var0.has("Reason-Phrase")) {
         var4.append(var0.method21773("HTTP-Version"));
         var4.append(' ');
         var4.append(var0.method21773("Status-Code"));
         var4.append(' ');
         var4.append(var0.method21773("Reason-Phrase"));
      } else {
         if (!var0.has("Method") || !var0.has("Request-URI")) {
            throw new Class2499("Not enough material for an HTTP header.");
         }

         var4.append(var0.method21773("Method"));
         var4.append(' ');
         var4.append('"');
         var4.append(var0.method21773("Request-URI"));
         var4.append('"');
         var4.append(' ');
         var4.append(var0.method21773("HTTP-Version"));
      }

      var4.append("\r\n");

      while (var3.hasNext()) {
         String var5 = (String)var3.next();
         if (!"HTTP-Version".equals(var5)
            && !"Status-Code".equals(var5)
            && !"Reason-Phrase".equals(var5)
            && !"Method".equals(var5)
            && !"Request-URI".equals(var5)
            && !var0.method21776(var5)) {
            var4.append(var5);
            var4.append(": ");
            var4.append(var0.method21773(var5));
            var4.append("\r\n");
         }
      }

      var4.append("\r\n");
      return var4.toString();
   }
}
