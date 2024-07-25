package remapped;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.regex.Pattern;

public class class_824 {
   private static Pattern field_4351 = Pattern.compile("^http|ws$");
   private static Pattern field_4352 = Pattern.compile("^(http|ws)s$");

   private class_824() {
   }

   public static URL method_3605(String var0) throws URISyntaxException {
      return method_3606(new URI(var0));
   }

   public static URL method_3606(URI var0) {
      String var3 = var0.getScheme();
      if (var3 == null || !var3.matches("^https?|wss?$")) {
         var3 = "https";
      }

      int var4 = var0.getPort();
      if (var4 == -1) {
         if (field_4351.matcher(var3).matches()) {
            var4 = 80;
         } else if (field_4352.matcher(var3).matches()) {
            var4 = 443;
         }
      }

      String var5 = var0.getRawPath();
      if (var5 == null || var5.length() == 0) {
         var5 = "/";
      }

      String var6 = var0.getRawUserInfo();
      String var7 = var0.getRawQuery();
      String var8 = var0.getRawFragment();

      try {
         return new URL(
            var3
               + "://"
               + (var6 != null ? var6 + "@" : "")
               + var0.getHost()
               + (var4 != -1 ? ":" + var4 : "")
               + var5
               + (var7 != null ? "?" + var7 : "")
               + (var8 != null ? "#" + var8 : "")
         );
      } catch (MalformedURLException var10) {
         throw new RuntimeException(var10);
      }
   }

   public static String method_3603(String var0) throws MalformedURLException {
      return method_3604(new URL(var0));
   }

   public static String method_3604(URL var0) {
      String var3 = var0.getProtocol();
      int var4 = var0.getPort();
      if (var4 == -1) {
         if (!field_4351.matcher(var3).matches()) {
            if (field_4352.matcher(var3).matches()) {
               var4 = 443;
            }
         } else {
            var4 = 80;
         }
      }

      return var3 + "://" + var0.getHost() + ":" + var4;
   }
}
