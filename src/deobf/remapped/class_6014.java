package remapped;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class class_6014 {
   private static String field_30636 = null;
   public static final String field_30638 = "http://s.optifine.net";
   public static final String field_30637 = "http://optifine.net";

   public static byte[] method_27451(String var0) throws IOException {
      HttpURLConnection var3 = null;

      byte[] var9;
      try {
         URL var4 = new URL(var0);
         var3 = (HttpURLConnection)var4.openConnection(MinecraftClient.method_8510().method_8607());
         var3.setDoInput(true);
         var3.setDoOutput(false);
         var3.connect();
         if (var3.getResponseCode() / 100 != 2) {
            if (var3.getErrorStream() != null) {
               class_3111.method_14250(var3.getErrorStream());
            }

            throw new IOException("HTTP response: " + var3.getResponseCode());
         }

         InputStream var5 = var3.getInputStream();
         byte[] var6 = new byte[var3.getContentLength()];
         int var7 = 0;

         do {
            int var8 = var5.read(var6, var7, var6.length - var7);
            if (var8 < 0) {
               throw new IOException("Input stream closed: " + var0);
            }

            var7 += var8;
         } while (var7 < var6.length);

         var9 = var6;
      } finally {
         if (var3 != null) {
            var3.disconnect();
         }
      }

      return var9;
   }

   public static String method_27452(String var0, Map var1, byte[] var2) throws IOException {
      HttpURLConnection var5 = null;

      String var13;
      try {
         URL var6 = new URL(var0);
         var5 = (HttpURLConnection)var6.openConnection(MinecraftClient.method_8510().method_8607());
         var5.setRequestMethod("POST");
         if (var1 != null) {
            for (String var8 : var1.keySet()) {
               String var9 = "" + var1.get(var8);
               var5.setRequestProperty(var8, var9);
            }
         }

         var5.setRequestProperty("Content-Type", "text/plain");
         var5.setRequestProperty("Content-Length", "" + var2.length);
         var5.setRequestProperty("Content-Language", "en-US");
         var5.setUseCaches(false);
         var5.setDoInput(true);
         var5.setDoOutput(true);
         OutputStream var17 = var5.getOutputStream();
         var17.write(var2);
         var17.flush();
         var17.close();
         InputStream var18 = var5.getInputStream();
         InputStreamReader var19 = new InputStreamReader(var18, "ASCII");
         BufferedReader var10 = new BufferedReader(var19);
         StringBuffer var11 = new StringBuffer();

         String var12;
         while ((var12 = var10.readLine()) != null) {
            var11.append(var12);
            var11.append('\r');
         }

         var10.close();
         var13 = var11.toString();
      } finally {
         if (var5 != null) {
            var5.disconnect();
         }
      }

      return var13;
   }

   public static synchronized String method_27454() {
      if (field_30636 == null) {
         try {
            boolean var2 = class_3111.method_14257(System.getProperty("player.models.local"), false);
            if (var2) {
               File var3 = MinecraftClient.method_8510().runDirectory;
               File var4 = new File(var3, "playermodels");
               field_30636 = var4.toURI().toURL().toExternalForm();
            }
         } catch (Exception var5) {
            class_3111.method_14317("" + var5.getClass().getName() + ": " + var5.getMessage());
         }

         if (field_30636 == null) {
            field_30636 = "http://s.optifine.net";
         }
      }

      return field_30636;
   }
}
