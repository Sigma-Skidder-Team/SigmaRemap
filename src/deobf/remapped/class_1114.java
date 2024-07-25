package remapped;

import java.util.Iterator;
import org.json.JSONException;

public class class_1114 {
   public static final String field_6387 = "\r\n";

   public static JSONObjectImpl method_4932(String var0) throws JSONException {
      JSONObjectImpl var3 = new JSONObjectImpl();
      class_9895 var4 = new class_9895(var0);
      String var5 = var4.method_45581();
      if (!var5.toUpperCase().startsWith("HTTP")) {
         var3.method_5820("Method", var5);
         var3.method_5820("Request-URI", var4.method_45581());
         var3.method_5820("HTTP-Version", var4.method_45581());
      } else {
         var3.method_5820("HTTP-Version", var5);
         var3.method_5820("Status-Code", var4.method_45581());
         var3.method_5820("Reason-Phrase", var4.method_17297('\u0000'));
         var4.method_17289();
      }

      while (var4.method_17294()) {
         String var6 = var4.method_17297(':');
         var4.method_17290(':');
         var3.method_5820(var6, var4.method_17297('\u0000'));
         var4.method_17289();
      }

      return var3;
   }

   public static String toString(JSONObjectImpl var0) throws JSONException {
      Iterator var3 = var0.method_5841();
      StringBuilder var4 = new StringBuilder();
      if (var0.method_5850("Status-Code") && var0.method_5850("Reason-Phrase")) {
         var4.append(var0.method_5861("HTTP-Version"));
         var4.append(' ');
         var4.append(var0.method_5861("Status-Code"));
         var4.append(' ');
         var4.append(var0.method_5861("Reason-Phrase"));
      } else {
         if (!var0.method_5850("Method") || !var0.method_5850("Request-URI")) {
            throw new class_7584("Not enough material for an HTTP header.");
         }

         var4.append(var0.method_5861("Method"));
         var4.append(' ');
         var4.append('"');
         var4.append(var0.method_5861("Request-URI"));
         var4.append('"');
         var4.append(' ');
         var4.append(var0.method_5861("HTTP-Version"));
      }

      var4.append("\r\n");

      while (var3.hasNext()) {
         String var5 = (String)var3.next();
         if (!"HTTP-Version".equals(var5)
            && !"Status-Code".equals(var5)
            && !"Reason-Phrase".equals(var5)
            && !"Method".equals(var5)
            && !"Request-URI".equals(var5)
            && !var0.method_5855(var5)) {
            var4.append(var5);
            var4.append(": ");
            var4.append(var0.method_5861(var5));
            var4.append("\r\n");
         }
      }

      var4.append("\r\n");
      return var4.toString();
   }
}
