package remapped;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import org.json.JSONException;

public class class_4646 {
   public static URL method_21488(String var0, String var1) {
      System.out.println("Name: " + class_7763.method_35216(var0));
      System.out.println("Artist: " + class_7763.method_35226(var0));
      return method_21489(class_7763.method_35216(var0), class_7763.method_35226(var0), var1);
   }

   public static URL method_21489(String var0, String var1, String var2) {
      try {
         URL var5 = new URL(var2);
         class_1293 var6 = method_21492(var0, var1);
         if (!var6.method_5850("releases")) {
            return var5;
         } else {
            class_1336 var7 = var6.method_5849("releases");
            if (var7.method_6163(0)) {
               return var5;
            } else {
               class_1293 var8 = var7.method_6143(0).method_5848("release-group");
               if (!var8.method_5850("id")) {
                  return var5;
               } else {
                  class_1293 var9 = class_7763.method_35221(class_7763.method_35224("http://coverartarchive.org/release-group/" + var8.method_5861("id"), true));
                  System.out.println(var9);
                  return !var9.method_5850("images") ? var5 : new URL(var9.method_5849("images").method_6143(0).method_5848("thumbnails").method_5861("small"));
               }
            }
         }
      } catch (IOException var10) {
         var10.printStackTrace();
         return null;
      }
   }

   public static class_1293 method_21492(String var0, String var1) throws JSONException, IOException {
      StringBuffer var4 = new StringBuffer();
      var4.append("http://musicbrainz.org/ws/2/");
      var4.append("release/?query=");
      var4.append(method_21491(class_7763.method_35217(var0)));
      var4.append("%20AND%20artist:%20");
      var4.append(method_21491(class_7763.method_35217(var1)));
      var4.append("&fmt=json");
      return class_7763.method_35219(var4.toString());
   }

   public static String method_21491(String var0) {
      try {
         return URLEncoder.encode(var0.replace("\"", "'"), "UTF-8");
      } catch (UnsupportedEncodingException var4) {
         var4.printStackTrace();
         return var0;
      }
   }
}
