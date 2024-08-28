package mapped;

import totalcross.json.JSONArray;
import totalcross.json.JSONException;
import totalcross.json.JSONObject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;

public class Class8452 {
   public static URL method29724(String var0, String var1) {
      System.out.println("Name: " + Class9275.method34964(var0));
      System.out.println("Artist: " + Class9275.method34965(var0));
      return method29725(Class9275.method34964(var0), Class9275.method34965(var0), var1);
   }

   public static URL method29725(String var0, String var1, String var2) {
      try {
         URL var5 = new URL(var2);
         JSONObject var6 = method29726(var0, var1);
         if (!var6.has("releases")) {
            return var5;
         } else {
            JSONArray var7 = var6.getJSONArray("releases");
            if (var7.isNull(0)) {
               return var5;
            } else {
               JSONObject var8 = var7.getJSONObject(0).method21769("release-group");
               if (!var8.has("id")) {
                  return var5;
               } else {
                  JSONObject var9 = Class9275.method34958(Class9275.method34959("http://coverartarchive.org/release-group/" + var8.method21773("id"), true));
                  System.out.println(var9);
                  return !var9.has("images") ? var5 : new URL(var9.getJSONArray("images").getJSONObject(0).method21769("thumbnails").method21773("small"));
               }
            }
         }
      } catch (IOException var10) {
         var10.printStackTrace();
         return null;
      }
   }

   public static JSONObject method29726(String var0, String var1) throws JSONException, IOException {
      StringBuffer var4 = new StringBuffer();
      var4.append("http://musicbrainz.org/ws/2/");
      var4.append("release/?query=");
      var4.append(method29727(Class9275.method34963(var0)));
      var4.append("%20AND%20artist:%20");
      var4.append(method29727(Class9275.method34963(var1)));
      var4.append("&fmt=json");
      return Class9275.method34957(var4.toString());
   }

   public static String method29727(String var0) {
      try {
         return URLEncoder.encode(var0.replace("\"", "'"), "UTF-8");
      } catch (UnsupportedEncodingException var4) {
         var4.printStackTrace();
         return var0;
      }
   }
}
