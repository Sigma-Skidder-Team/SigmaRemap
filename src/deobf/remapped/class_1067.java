package remapped;

import org.json.JSONException;

public class class_1067 {
   public static String method_4682(String var0) {
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

   public static JSONObjectImpl method_4685(String var0) throws JSONException {
      JSONObjectImpl var3 = new JSONObjectImpl();
      class_3734 var4 = new class_3734(var0);
      var3.method_5820("name", var4.method_17297('='));
      var4.method_17290('=');
      var3.method_5820("value", var4.method_17297(';'));
      var4.method_17289();

      while (var4.method_17294()) {
         String var5 = method_4684(var4.method_17298("=;"));
         Object var6;
         if (var4.method_17289() == '=') {
            var6 = method_4684(var4.method_17297(';'));
            var4.method_17289();
         } else {
            if (!var5.equals("secure")) {
               throw var4.method_17292("Missing '=' in cookie parameter.");
            }

            var6 = Boolean.TRUE;
         }

         var3.method_5820(var5, var6);
      }

      return var3;
   }

   public static String toString(JSONObjectImpl var0) throws JSONException {
      StringBuilder var3 = new StringBuilder();
      var3.append(method_4682(var0.method_5861("name")));
      var3.append("=");
      var3.append(method_4682(var0.method_5861("value")));
      if (var0.method_5850("expires")) {
         var3.append(";expires=");
         var3.append(var0.method_5861("expires"));
      }

      if (var0.method_5850("domain")) {
         var3.append(";domain=");
         var3.append(method_4682(var0.method_5861("domain")));
      }

      if (var0.method_5850("path")) {
         var3.append(";path=");
         var3.append(method_4682(var0.method_5861("path")));
      }

      if (var0.method_5867("secure")) {
         var3.append(";secure");
      }

      return var3.toString();
   }

   public static String method_4684(String var0) {
      int var3 = var0.length();
      StringBuilder var4 = new StringBuilder(var3);

      for (int var5 = 0; var5 < var3; var5++) {
         char var6 = var0.charAt(var5);
         if (var6 != '+') {
            if (var6 == '%' && var5 + 2 < var3) {
               int var7 = class_3734.method_17300(var0.charAt(var5 + 1));
               int var8 = class_3734.method_17300(var0.charAt(var5 + 2));
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
