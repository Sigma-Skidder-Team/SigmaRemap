package remapped;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class class_4765 {
   private static final int field_23074 = 15000;
   private static final int field_23070 = 80;
   public static final String field_23069 = "8744d8c7bb5e811a40b6119d63811040";
   public static final String field_23073 = "http://ws.audioscrobbler.com/2.0/";
   private static final int field_23072 = 30;
   public static final String field_23071 = "http://musicbrainz.org/ws/2/";
   private static final int field_23068 = 15000;
   private static final String field_23076 = class_4765.class.getName();

   public static class_1293 method_21980(String var0, String var1) throws IOException {
      URL var4 = new URL(var0);
      HttpURLConnection var5 = (HttpURLConnection)var4.openConnection();
      String var6 = "Set-Cookie";
      var5.setRequestMethod("GET");
      var5.setRequestProperty(
         "User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_2) AppleWebKit/604.4.7 (KHTML, like Gecko) Version/11.0.2 Safari/604.4.7"
      );
      var5.setRequestProperty("Accept-Language", "en-us");
      var5.setRequestProperty("Accept", "application/json");
      var5.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      var5.setRequestProperty("Connexion", "keep-alive");
      var5.setRequestProperty("DNT", "1");
      var5.setRequestProperty("Upgrade-Insecure-Requests", "1");
      var5.setDoOutput(true);
      DataOutputStream var7 = new DataOutputStream(var5.getOutputStream());
      var7.writeBytes(var1);
      var7.flush();
      var7.close();
      int var8 = var5.getResponseCode();
      BufferedReader var9 = new BufferedReader(new InputStreamReader(var5.getInputStream()));
      StringBuffer var10 = new StringBuffer();

      String var11;
      while ((var11 = var9.readLine()) != null) {
         var10.append(var11);
      }

      var9.close();
      return class_7763.method_35221(var10.toString());
   }
}
