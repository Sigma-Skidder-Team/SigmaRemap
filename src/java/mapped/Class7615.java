package mapped;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Class7615 {
   private static Map<Object, Class9433> field32658 = new HashMap<Object, Class9433>();
   public static final String field32659 = "User-Agent";
   public static final String field32660 = "Host";
   public static final String field32661 = "Accept";
   public static final String field32662 = "Location";
   public static final String field32663 = "Keep-Alive";
   public static final String field32664 = "Connection";
   public static final String field32665 = "keep-alive";
   public static final String field32666 = "Transfer-Encoding";
   public static final String field32667 = "chunked";

   private Class7615() {
   }

   public static void method24941(String var0, Class7238 var1) throws IOException {
      method24942(var0, var1, Proxy.NO_PROXY);
   }

   public static void method24942(String var0, Class7238 var1, Proxy var2) throws IOException {
      Class7432 var5 = method24943(var0, var2);
      Class9638 var6 = new Class9638(var5, var1);
      method24944(var6);
   }

   public static Class7432 method24943(String var0, Proxy var1) throws IOException {
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
         return new Class7432(var6, var7, var1, var8, var5, var9, var10, var11);
      } else {
         throw new IOException("Only protocol http is supported: " + var4);
      }
   }

   public static void method24944(Class9638 var0) {
      Class7432 var3 = var0.method37562();

      for (Class9433 var4 = method24945(var3.method23995(), var3.method23996(), var3.method24004());
         !var4.method36208(var0);
         var4 = method24945(var3.method23995(), var3.method23996(), var3.method24004())
      ) {
         method24946(var3.method23995(), var3.method23996(), var3.method24004(), var4);
      }
   }

   private static synchronized Class9433 method24945(String var0, int var1, Proxy var2) {
      String var5 = method24947(var0, var1, var2);
      Class9433 var6 = field32658.get(var5);
      if (var6 == null) {
         var6 = new Class9433(var0, var1, var2);
         field32658.put(var5, var6);
      }

      return var6;
   }

   private static synchronized void method24946(String var0, int var1, Proxy var2, Class9433 var3) {
      String var6 = method24947(var0, var1, var2);
      Class9433 var7 = field32658.get(var6);
      if (var7 == var3) {
         field32658.remove(var6);
      }
   }

   private static String method24947(String var0, int var1, Proxy var2) {
      return var0 + ":" + var1 + "-" + var2;
   }

   public static byte[] method24948(String var0) throws IOException {
      return method24949(var0, Proxy.NO_PROXY);
   }

   public static byte[] method24949(String var0, Proxy var1) throws IOException {
      if (!var0.startsWith("file:")) {
         Class7432 var6 = method24943(var0, var1);
         Class8075 var7 = method24950(var6);
         if (var7.method27942() / 100 == 2) {
            return var7.method27946();
         } else {
            throw new IOException("HTTP response: " + var7.method27942());
         }
      } else {
         URL var4 = new URL(var0);
         InputStream var5 = var4.openStream();
         return Class7944.method26927(var5);
      }
   }

   public static Class8075 method24950(Class7432 var0) throws IOException {
      HashMap var3 = new HashMap();
      String var4 = "Response";
      String var5 = "Exception";
      Class7239 var6 = new Class7239(var3);
      synchronized (var3) {
         Class9638 var8 = new Class9638(var0, var6);
         method24944(var8);

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
            Class8075 var10 = (Class8075)var3.get("Response");
            if (var10 == null) {
               throw new IOException("Response is null");
            } else {
               return var10;
            }
         }
      }
   }

   public static boolean method24951() {
      for (Class9433 var3 : field32658.values()) {
         if (var3.method36229()) {
            return true;
         }
      }

      return false;
   }
}
