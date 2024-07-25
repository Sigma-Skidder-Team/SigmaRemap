package remapped;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class class_1199 {
   public static class_2939[] method_5304(String var0) {
      return method_5308(method_5305("https://www.google.com/search?client=safari&num=21&gbv=1&tbm=vid&oq=&aqs=&q=site%3Ayoutube.com+" + method_5307(var0)));
   }

   public static class_2939[] method_5309(String var0) {
      return method_5310(method_5305("https://www.youtube.com/channel/" + var0 + "/videos?disable_polymer=1"));
   }

   public static class_2939[] method_5303(String var0) {
      return method_5310(method_5305("https://www.youtube.com/playlist?list=" + var0 + "&disable_polymer=1"));
   }

   public static class_2939[] method_5310(String var0) {
      if (var0.startsWith("[")) {
         try {
            class_1336 var3 = new class_1336(var0);
            var0 = var3.method_6143(1).method_5848("body").method_5861("content");
         } catch (Exception var9) {
         }
      }

      ArrayList var10 = new ArrayList();
      String var4 = "r\":\\{\"videoId\":\"(.{11})\"(.*?)\"text\":\"(.{1,100})\"\\}]";
      Pattern var5 = Pattern.compile("r\":\\{\"videoId\":\"(.{11})\"(.*?)\"text\":\"(.{1,100})\"\\}]", 8);
      Matcher var6 = var5.matcher(var0.replace("\n", "").replace("\r", ""));

      label36:
      while (var6.find()) {
         for (class_2939 var8 : var10) {
            if (var8.field_14295.equals(var6.group(1))) {
               continue label36;
            }
         }

         var10.add(new class_2939(var6.group(1), method_5306(StringEscapeUtils.unescapeJava(var6.group(3)))));
      }

      return var10.<class_2939>toArray(new class_2939[0]);
   }

   public static class_2939[] method_5308(String var0) {
      if (var0.startsWith("[")) {
         try {
            class_1336 var3 = new class_1336(var0);
            var0 = var3.method_6143(1).method_5848("body").method_5861("content");
         } catch (Exception var9) {
         }
      }

      ArrayList var10 = new ArrayList();
      String var4 = "<a(.*?)watch%3Fv%3D(.{11})[\\\"&](.*?)><div (.*?)>(.{1,100}) - YouTube<\\/div><\\/h3>";
      Pattern var5 = Pattern.compile("<a(.*?)watch%3Fv%3D(.{11})[\\\"&](.*?)><div (.*?)>(.{1,100}) - YouTube<\\/div><\\/h3>", 8);
      Matcher var6 = var5.matcher(var0.replace("\n", "").replace("\r", ""));

      label62:
      while (var6.find()) {
         if (!var6.group(5).contains("</") && !var6.group(5).equals(" ") && var6.group(5).length() != 0 && !var6.group(1).contains("play-all")) {
            for (class_2939 var8 : var10) {
               if (var8.field_14295.equals(var6.group(2))) {
                  continue label62;
               }
            }

            var10.add(new class_2939(var6.group(2), method_5306(var6.group(5).replaceAll("<(.*?)>", ""))));
         }
      }

      return var10.<class_2939>toArray(new class_2939[0]);
   }

   private static String method_5306(String var0) {
      String var3 = var0;

      try {
         var3 = StringEscapeUtils.unescapeHtml4(URLDecoder.decode(var0, StandardCharsets.UTF_8.toString())).trim();
      } catch (Exception var5) {
      }

      return var3;
   }

   private static String method_5307(String var0) {
      String var3 = "";

      try {
         var3 = URLEncoder.encode(var0, StandardCharsets.UTF_8.toString());
      } catch (UnsupportedEncodingException var5) {
      }

      return var3;
   }

   private static String method_5305(String var0) {
      System.out.println(":" + var0);
      CloseableHttpClient var3 = HttpClients.createDefault();
      HttpGet var4 = new HttpGet(var0);
      if (var0.contains("playlist")) {
         var4.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.70 Safari/537.36");
      } else {
         var4.addHeader("User-Agent", "Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)");
      }

      try {
         CloseableHttpResponse var5 = var3.execute(var4);
         Throwable var6 = null;

         String var9;
         try {
            HttpEntity var7 = var5.getEntity();
            if (var7 == null) {
               return "";
            }

            String var8 = EntityUtils.toString(var7);
            var9 = var8;
         } catch (Throwable var20) {
            var6 = var20;
            throw var20;
         } finally {
            if (var5 != null) {
               if (var6 != null) {
                  try {
                     var5.close();
                  } catch (Throwable var19) {
                     var6.addSuppressed(var19);
                  }
               } else {
                  var5.close();
               }
            }
         }

         return var9;
      } catch (IllegalStateException | IOException | ParseException var22) {
         var22.printStackTrace();
         return "";
      }
   }
}
