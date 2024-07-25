package remapped;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;

public class class_7763 {
   public static String method_35222(int var0) {
      if (var0 < 0) {
         var0 = 0;
      }

      return var0 <= 3600
         ? var0 / 60 + ":" + (var0 % 60 >= 10 ? "" : "0") + var0 % 60
         : var0 / 3600 + ":" + (var0 / 60 % 60 >= 10 ? "" : "0") + var0 / 60 % 60 + ":" + (var0 % 60 >= 10 ? "" : "0") + var0 % 60;
   }

   public static String method_35215(Reader var0) throws IOException {
      StringBuilder var3 = new StringBuilder();

      int var4;
      while ((var4 = var0.read()) != -1) {
         var3.append((char)var4);
      }

      return var3.toString();
   }

   public static JSONObjectImpl method_35219(String var0) throws IOException, JSONException {
      InputStream var3 = new URL(var0).openStream();

      JSONObjectImpl var7;
      try {
         BufferedReader var4 = new BufferedReader(new InputStreamReader(var3, Charset.forName("UTF-8")));
         String var5 = method_35215(var4);
         JSONObjectImpl var6 = new JSONObjectImpl(var5);
         var7 = var6;
      } finally {
         var3.close();
      }

      return var7;
   }

   public static JSONObjectImpl method_35221(String var0) {
      return new JSONObjectImpl(var0);
   }

   public static String method_35224(String var0, boolean var1) throws IOException {
      URLConnection var4 = new URL(var0).openConnection();
      var4.setRequestProperty(
         "User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/604.1.38 (KHTML, like Gecko) Version/11.0 Safari/604.1.38"
      );
      if (var1) {
         var4.setRequestProperty("Accept", "application/json");
      }

      String var7;
      try (BufferedReader var5 = new BufferedReader(new InputStreamReader(var4.getInputStream(), StandardCharsets.UTF_8))) {
         var7 = var5.lines().collect(Collectors.joining("\n"));
      }

      return var7;
   }

   public static URL method_35220(String var0) {
      try {
         return new URL("https://www.youtube.com/watch?v=" + var0);
      } catch (IOException var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static URL method_35223(String var0) {
      try {
         return new URL("https://i.ytimg.com/vi/" + var0 + "/mqdefault.jpg");
      } catch (IOException var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static String method_35225(URL var0) {
      return var0.toString().replace("https://www.youtube.com/watch?v=", "");
   }

   public static String method_35217(String var0) {
      var0 = var0.replaceAll("\\(.*\\)", "");
      var0 = var0.replaceAll("\\[.*\\]", "");
      var0 = Normalizer.normalize(var0, Form.NFD);
      return var0.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
   }

   public static String method_35216(String var0) {
      String[] var3 = var0.split(" - ");
      return var3.length <= 1 ? method_35217(StringUtils.substringBefore(var3[0], ",")) : method_35217(StringUtils.substringBefore(var3[1], "ft."));
   }

   public static String method_35226(String var0) {
      String[] var3 = var0.split(" - ");
      return var3.length <= 1 ? "" : method_35217(StringUtils.substringBefore(StringUtils.substringBefore(var3[0], " & "), ","));
   }
}
