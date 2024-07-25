package remapped;

import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public class class_2292 extends class_3307 {
   private static final int field_11453 = 4000;
   private final Class<?> field_11451;
   private final class_2572<Socket> field_11454;
   private final class_2572<Socket> field_11455;
   private final class_2572<Socket> field_11456;
   private final class_2572<Socket> field_11457;
   private final class_9361 field_11452 = class_9361.method_43294();

   public class_2292(Class<?> var1, class_2572<Socket> var2, class_2572<Socket> var3, class_2572<Socket> var4, class_2572<Socket> var5) {
      this.field_11451 = var1;
      this.field_11454 = var2;
      this.field_11455 = var3;
      this.field_11456 = var4;
      this.field_11457 = var5;
   }

   @Override
   public void method_15164(Socket var1, InetSocketAddress var2, int var3) throws IOException {
      try {
         var1.connect(var2, var3);
      } catch (AssertionError var8) {
         if (class_8515.method_39213(var8)) {
            throw new IOException(var8);
         } else {
            throw var8;
         }
      } catch (SecurityException var9) {
         IOException var7 = new IOException("Exception in connect");
         var7.initCause(var9);
         throw var7;
      }
   }

   @Override
   public X509TrustManager method_15169(SSLSocketFactory var1) {
      Object var4 = method_15165(var1, this.field_11451, "sslParameters");
      if (var4 == null) {
         try {
            Class var5 = Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, var1.getClass().getClassLoader());
            var4 = method_15165(var1, var5, "sslParameters");
         } catch (ClassNotFoundException var6) {
            return super.method_15169(var1);
         }
      }

      X509TrustManager var7 = method_15165(var4, X509TrustManager.class, "x509TrustManager");
      return var7 != null ? var7 : method_15165(var4, X509TrustManager.class, "trustManager");
   }

   @Override
   public void method_15166(SSLSocket var1, String var2, List<class_7976> var3) {
      if (var2 != null) {
         this.field_11454.method_11693(var1, true);
         this.field_11455.method_11693(var1, var2);
      }

      if (this.field_11457 != null && this.field_11457.method_11692(var1)) {
         Object[] var6 = new Object[]{method_15160(var3)};
         this.field_11457.method_11694(var1, var6);
      }
   }

   @Override
   public String method_15174(SSLSocket var1) {
      if (this.field_11456 != null) {
         if (this.field_11456.method_11692(var1)) {
            byte[] var4 = (byte[])this.field_11456.method_11694(var1);
            return var4 == null ? null : new String(var4, class_8515.field_43592);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   @Override
   public void method_15167(int var1, String var2, Throwable var3) {
      int var6 = var1 != 5 ? 3 : 5;
      if (var3 != null) {
         var2 = var2 + '\n' + Log.getStackTraceString(var3);
      }

      int var7 = 0;
      int var8 = var2.length();

      while (var7 < var8) {
         int var9 = var2.indexOf(10, var7);
         var9 = var9 == -1 ? var8 : var9;

         int var10;
         do {
            var10 = Math.min(var9, var7 + 4000);
            Log.println(var6, "OkHttp", var2.substring(var7, var10));
            var7 = var10;
         } while (var10 < var9);

         var7 = var10 + 1;
      }
   }

   @Override
   public Object method_15176(String var1) {
      return this.field_11452.method_43295(var1);
   }

   @Override
   public void method_15170(String var1, Object var2) {
      boolean var5 = this.field_11452.method_43293(var2);
      if (!var5) {
         this.method_15167(5, var1, null);
      }
   }

   @Override
   public boolean method_15161(String var1) {
      try {
         Class var4 = Class.forName("android.security.NetworkSecurityPolicy");
         Method var5 = var4.getMethod("getInstance");
         Object var6 = var5.invoke(null);
         Method var7 = var4.getMethod("isCleartextTrafficPermitted", String.class);
         return (Boolean)var7.invoke(var6, var1);
      } catch (NoSuchMethodException | ClassNotFoundException var8) {
         return super.method_15161(var1);
      } catch (IllegalArgumentException | InvocationTargetException | IllegalAccessException var9) {
         throw new AssertionError();
      }
   }

   @Override
   public class_8290 method_15173(X509TrustManager var1) {
      try {
         Class var4 = Class.forName("android.net.http.X509TrustManagerExtensions");
         Constructor var5 = var4.getConstructor(X509TrustManager.class);
         Object var6 = var5.newInstance(var1);
         Method var7 = var4.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class);
         return new class_7559(var6, var7);
      } catch (Exception var8) {
         return super.method_15173(var1);
      }
   }

   public static class_3307 method_10553() {
      try {
         Class var2;
         try {
            var2 = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
         } catch (ClassNotFoundException var9) {
            var2 = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
         }

         class_2572 var3 = new class_2572(null, "setUseSessionTickets", boolean.class);
         class_2572 var4 = new class_2572(null, "setHostname", String.class);
         class_2572 var5 = null;
         class_2572 var6 = null;

         try {
            Class.forName("android.net.Network");
            var5 = new class_2572(byte[].class, "getAlpnSelectedProtocol");
            var6 = new class_2572(null, "setAlpnProtocols", byte[].class);
         } catch (ClassNotFoundException var8) {
         }

         return new class_2292(var2, var3, var4, var5, var6);
      } catch (ClassNotFoundException var10) {
         return null;
      }
   }
}
