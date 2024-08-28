package mapped;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.regex.Pattern;

public class Class6638 {
   private static Pattern field29184 = Pattern.compile("^http|ws$");
   private static Pattern field29185 = Pattern.compile("^(http|ws)s$");

   private Class6638() {
   }

   public static URL method20252(String var0) throws URISyntaxException {
      return method20253(new URI(var0));
   }

   public static URL method20253(URI var0) {
      String var3 = var0.getScheme();
      if (var3 == null || !var3.matches("^https?|wss?$")) {
         var3 = "https";
      }

      int var4 = var0.getPort();
      if (var4 == -1) {
         if (field29184.matcher(var3).matches()) {
            var4 = 80;
         } else if (field29185.matcher(var3).matches()) {
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

   public static String method20254(String var0) throws MalformedURLException {
      return method20255(new URL(var0));
   }

   public static String method20255(URL var0) {
      String var3 = var0.getProtocol();
      int var4 = var0.getPort();
      if (var4 == -1) {
         if (!field29184.matcher(var3).matches()) {
            if (field29185.matcher(var3).matches()) {
               var4 = 443;
            }
         } else {
            var4 = 80;
         }
      }

      return var3 + "://" + var0.getHost() + ":" + var4;
   }
}
