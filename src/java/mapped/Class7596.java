package mapped;

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

public class Class7596 {
   private static final Class7596 field32610 = method24883();
   public static final int field32611 = 4;
   public static final int field32612 = 5;
   private static final Logger field32613 = Logger.getLogger(Class2391.class.getName());

   public static Class7596 method24879() {
      return field32610;
   }

   public String method24880() {
      return "OkHttp";
   }

   public X509TrustManager method24870(SSLSocketFactory var1) {
      try {
         Class var4 = Class.forName("sun.security.ssl.SSLContextImpl");
         Object var5 = method24885(var1, var4, "context");
         return var5 == null ? null : method24885(var5, X509TrustManager.class, "trustManager");
      } catch (ClassNotFoundException var6) {
         return null;
      }
   }

   public void method24871(SSLSocket var1, String var2, List<Class2201> var3) {
   }

   public void method24881(SSLSocket var1) {
   }

   public String method24872(SSLSocket var1) {
      return null;
   }

   public void method24869(Socket var1, InetSocketAddress var2, int var3) throws IOException {
      var1.connect(var2, var3);
   }

   public void method24873(int var1, String var2, Throwable var3) {
      Level var6 = var1 != 5 ? Level.INFO : Level.WARNING;
      field32613.log(var6, var2, var3);
   }

   public boolean method24876(String var1) {
      return true;
   }

   public Object method24874(String var1) {
      return !field32613.isLoggable(Level.FINE) ? null : new Throwable(var1);
   }

   public void method24875(String var1, Object var2) {
      if (var2 == null) {
         var1 = var1
            + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
      }

      this.method24873(5, var1, (Throwable)var2);
   }

   public static List<String> method24882(List<Class2201> var0) {
      ArrayList var3 = new ArrayList(var0.size());
      int var4 = 0;

      for (int var5 = var0.size(); var4 < var5; var4++) {
         Class2201 var6 = (Class2201)var0.get(var4);
         if (var6 != Class2201.field14385) {
            var3.add(var6.toString());
         }
      }

      return var3;
   }

   public Class7658 method24877(X509TrustManager var1) {
      return new Class7657(Class7006.method21721(var1));
   }

   private static Class7596 method24883() {
      Class7596 var2 = Class7595.method24878();
      if (var2 == null) {
         Class7598 var3 = Class7598.method24887();
         if (var3 == null) {
            Class7596 var4 = Class7597.method24886();
            return var4 == null ? new Class7596() : var4;
         } else {
            return var3;
         }
      } else {
         return var2;
      }
   }

   public static byte[] method24884(List<Class2201> var0) {
      Class1734 var3 = new Class1734();
      int var4 = 0;

      for (int var5 = var0.size(); var4 < var5; var4++) {
         Class2201 var6 = (Class2201)var0.get(var4);
         if (var6 != Class2201.field14385) {
            var3.method7570(var6.toString().length());
            var3.method7566(var6.toString());
         }
      }

      return var3.method7621();
   }

   public static <T> T method24885(Object var0, Class<T> var1, String var2) {
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
         Object var10 = method24885(var0, Object.class, "delegate");
         if (var10 != null) {
            return method24885(var10, var1, var2);
         }
      }

      return null;
   }
}
