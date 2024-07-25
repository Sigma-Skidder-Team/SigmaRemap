package remapped;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public class class_3307 {
   private static final class_3307 field_16357 = method_15175();
   public static final int field_16359 = 4;
   public static final int field_16355 = 5;
   private static final Logger field_16358 = Logger.getLogger(class_8075.class.getName());

   public static class_3307 method_15163() {
      return field_16357;
   }

   public String method_15171() {
      return "OkHttp";
   }

   public X509TrustManager method_15169(SSLSocketFactory var1) {
      try {
         Class var4 = Class.forName("sun.security.ssl.SSLContextImpl");
         Object var5 = method_15165(var1, var4, "context");
         return var5 == null ? null : method_15165(var5, X509TrustManager.class, "trustManager");
      } catch (ClassNotFoundException var6) {
         return null;
      }
   }

   public void method_15166(SSLSocket var1, String var2, List<class_7976> var3) {
   }

   public void method_15168(SSLSocket var1) {
   }

   public String method_15174(SSLSocket var1) {
      return null;
   }

   public void method_15164(Socket var1, InetSocketAddress var2, int var3) throws IOException {
      var1.connect(var2, var3);
   }

   public void method_15167(int var1, String var2, Throwable var3) {
      Level var6 = var1 != 5 ? Level.INFO : Level.WARNING;
      field_16358.log(var6, var2, var3);
   }

   public boolean method_15161(String var1) {
      return true;
   }

   public Object method_15176(String var1) {
      return !field_16358.isLoggable(Level.FINE) ? null : new Throwable(var1);
   }

   public void method_15170(String var1, Object var2) {
      if (var2 == null) {
         var1 = var1
            + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
      }

      this.method_15167(5, var1, (Throwable)var2);
   }

   public static List<String> method_15162(List<class_7976> var0) {
      ArrayList var3 = new ArrayList(var0.size());
      int var4 = 0;

      for (int var5 = var0.size(); var4 < var5; var4++) {
         class_7976 var6 = (class_7976)var0.get(var4);
         if (var6 != class_7976.field_40848) {
            var3.add(var6.toString());
         }
      }

      return var3;
   }

   public class_8290 method_15173(X509TrustManager var1) {
      return new class_2369(class_1950.method_9008(var1));
   }

   private static class_3307 method_15175() {
      class_3307 var2 = class_2292.method_10553();
      if (var2 == null) {
         class_6684 var3 = class_6684.method_30656();
         if (var3 == null) {
            class_3307 var4 = class_3014.method_13783();
            return var4 == null ? new class_3307() : var4;
         } else {
            return var3;
         }
      } else {
         return var2;
      }
   }

   public static byte[] method_15160(List<class_7976> var0) {
      class_7059 var3 = new class_7059();
      int var4 = 0;

      for (int var5 = var0.size(); var4 < var5; var4++) {
         class_7976 var6 = (class_7976)var0.get(var4);
         if (var6 != class_7976.field_40848) {
            var3.method_32494(var6.toString().length());
            var3.method_32491(var6.toString());
         }
      }

      return var3.method_36599();
   }

   public static <T> T method_15165(Object var0, Class<T> var1, String var2) {
      Class var5 = var0.getClass();

      while (var5 != Object.class) {
         try {
            Field var6 = var5.getDeclaredField(var2);
            var6.setAccessible(true);
            Object var7 = var6.get(var0);
            if (var7 != null && var1.isInstance(var7)) {
               return (T)var1.cast(var7);
            }

            return null;
         } catch (NoSuchFieldException var8) {
            var5 = var5.getSuperclass();
         } catch (IllegalAccessException var9) {
            throw new AssertionError();
         }
      }

      if (!var2.equals("delegate")) {
         Object var10 = method_15165(var0, Object.class, "delegate");
         if (var10 != null) {
            return method_15165(var10, var1, var2);
         }
      }

      return null;
   }
}
