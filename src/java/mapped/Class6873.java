package mapped;

import totalcross.json.JSONException;
import totalcross.json.JSONObject;
import totalcross.json.JSONTokener;

public class Class6873 {
   public static String method20928(String var0) {
      String var3 = var0.trim();
      int var4 = var3.length();
      StringBuilder var5 = new StringBuilder(var4);

      for (int var6 = 0; var6 < var4; var6++) {
         char var7 = var3.charAt(var6);
         if (var7 >= ' ' && var7 != '+' && var7 != '%' && var7 != '=' && var7 != ';') {
            var5.append(var7);
         } else {
            var5.append('%');
            var5.append(Character.forDigit((char)(var7 >>> 4 & 15), 16));
            var5.append(Character.forDigit((char)(var7 & 15), 16));
         }
      }

      return var5.toString();
   }

   public static JSONObject method20929(String var0) throws JSONException {
      JSONObject var3 = new JSONObject();
      JSONTokener var4 = new JSONTokener(var0);
      var3.put("name", var4.method24226('='));
      var4.method24222('=');
      var3.put("value", var4.method24226(';'));
      var4.method24221();

      while (var4.method24220()) {
         String var5 = method20930(var4.method24227("=;"));
         Object var6;
         if (var4.method24221() == '=') {
            var6 = method20930(var4.method24226(';'));
            var4.method24221();
         } else {
            if (!var5.equals("secure")) {
               throw var4.syntaxError("Missing '=' in cookie parameter.");
            }

            var6 = Boolean.TRUE;
         }

         var3.put(var5, var6);
      }

      return var3;
   }

   public static String toString(JSONObject var0) throws JSONException {
      StringBuilder var3 = new StringBuilder();
      var3.append(method20928(var0.getString("name")));
      var3.append("=");
      var3.append(method20928(var0.getString("value")));
      if (var0.has("expires")) {
         var3.append(";expires=");
         var3.append(var0.getString("expires"));
      }

      if (var0.has("domain")) {
         var3.append(";domain=");
         var3.append(method20928(var0.getString("domain")));
      }

      if (var0.has("path")) {
         var3.append(";path=");
         var3.append(method20928(var0.getString("path")));
      }

      if (var0.method21785("secure")) {
         var3.append(";secure");
      }

      return var3.toString();
   }

   public static String method20930(String var0) {
      int var3 = var0.length();
      StringBuilder var4 = new StringBuilder(var3);

      for (int var5 = 0; var5 < var3; var5++) {
         char var6 = var0.charAt(var5);
         if (var6 != '+') {
            if (var6 == '%' && var5 + 2 < var3) {
               int var7 = JSONTokener.method24218(var0.charAt(var5 + 1));
               int var8 = JSONTokener.method24218(var0.charAt(var5 + 2));
               if (var7 >= 0 && var8 >= 0) {
                  var6 = (char)(var7 * 16 + var8);
                  var5 += 2;
               }
            }
         } else {
            var6 = ' ';
         }

         var4.append(var6);
      }

      return var4.toString();
   }
}
