package remapped;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class class_2316 {
   private static Map<Object, class_8356> field_11605 = new HashMap<Object, class_8356>();
   public static final String field_11604 = "User-Agent";
   public static final String field_11602 = "Host";
   public static final String field_11600 = "Accept";
   public static final String field_11603 = "Location";
   public static final String field_11598 = "Keep-Alive";
   public static final String field_11597 = "Connection";
   public static final String field_11599 = "keep-alive";
   public static final String field_11601 = "Transfer-Encoding";
   public static final String field_11595 = "chunked";

   private class_2316() {
   }

   public static void method_10639(String var0, class_1576 var1) throws IOException {
      method_10640(var0, var1, Proxy.NO_PROXY);
   }

   public static void method_10640(String var0, class_1576 var1, Proxy var2) throws IOException {
      class_1951 var5 = method_10646(var0, var2);
      class_9144 var6 = new class_9144(var5, var1);
      method_10641(var6);
   }

   public static class_1951 method_10646(String var0, Proxy var1) throws IOException {
      URL var4 = new URL(var0);
      if (var4.getProtocol().equals("http")) {
         String var5 = var4.getFile();
         String var6 = var4.getHost();
         int var7 = var4.getPort();
         if (var7 <= 0) {
            var7 = 80;
         }

         String var8 = "GET";
         String var9 = "HTTP/1.1";
         LinkedHashMap var10 = new LinkedHashMap();
         var10.put("User-Agent", "Java/" + System.getProperty("java.version"));
         var10.put("Host", var6);
         var10.put("Accept", "text/html, image/gif, image/png");
         var10.put("Connection", "keep-alive");
         byte[] var11 = new byte[0];
         return new class_1951(var6, var7, var1, var8, var5, var9, var10, var11);
      } else {
         throw new IOException("Only protocol http is supported: " + var4);
      }
   }

   public static void method_10641(class_9144 var0) {
      class_1951 var3 = var0.method_42078();

      for (class_8356 var4 = method_10647(var3.method_9020(), var3.method_9019(), var3.method_9018());
         !var4.method_38480(var0);
         var4 = method_10647(var3.method_9020(), var3.method_9019(), var3.method_9018())
      ) {
         method_10643(var3.method_9020(), var3.method_9019(), var3.method_9018(), var4);
      }
   }

   private static synchronized class_8356 method_10647(String var0, int var1, Proxy var2) {
      String var5 = method_10648(var0, var1, var2);
      class_8356 var6 = field_11605.get(var5);
      if (var6 == null) {
         var6 = new class_8356(var0, var1, var2);
         field_11605.put(var5, var6);
      }

      return var6;
   }

   private static synchronized void method_10643(String var0, int var1, Proxy var2, class_8356 var3) {
      String var6 = method_10648(var0, var1, var2);
      class_8356 var7 = field_11605.get(var6);
      if (var7 == var3) {
         field_11605.remove(var6);
      }
   }

   private static String method_10648(String var0, int var1, Proxy var2) {
      return var0 + ":" + var1 + "-" + var2;
   }

   public static byte[] method_10644(String var0) throws IOException {
      return method_10645(var0, Proxy.NO_PROXY);
   }

   public static byte[] method_10645(String var0, Proxy var1) throws IOException {
      if (!var0.startsWith("file:")) {
         class_1951 var6 = method_10646(var0, var1);
         class_3548 var7 = method_10649(var6);
         if (var7.method_16508() / 100 == 2) {
            return var7.method_16512();
         } else {
            throw new IOException("HTTP response: " + var7.method_16508());
         }
      } else {
         URL var4 = new URL(var0);
         InputStream var5 = var4.openStream();
         return Config.method_14250(var5);
      }
   }

   public static class_3548 method_10649(class_1951 var0) throws IOException {
      HashMap var3 = new HashMap();
      String var4 = "Response";
      String var5 = "Exception";
      class_3784 var6 = new class_3784(var3);
      synchronized (var3) {
         class_9144 var8 = new class_9144(var0, var6);
         method_10641(var8);

         try {
            var3.wait();
         } catch (InterruptedException var12) {
            throw new InterruptedIOException("Interrupted");
         }

         Exception var9 = (Exception)var3.get("Exception");
         if (var9 != null) {
            if (var9 instanceof IOException) {
               throw (IOException)var9;
            } else if (var9 instanceof RuntimeException) {
               throw (RuntimeException)var9;
            } else {
               throw new RuntimeException(var9.getMessage(), var9);
            }
         } else {
            class_3548 var10 = (class_3548)var3.get("Response");
            if (var10 == null) {
               throw new IOException("Response is null");
            } else {
               return var10;
            }
         }
      }
   }

   public static boolean method_10638() {
      for (class_8356 var3 : field_11605.values()) {
         if (var3.method_38488()) {
            return true;
         }
      }

      return false;
   }
}
