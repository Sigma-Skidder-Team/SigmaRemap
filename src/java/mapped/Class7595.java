package mapped;


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

public class Class7595 extends Class7596 {
   private static final int field32603 = 4000;
   private final Class<?> field32604;
   private final Class7739<Socket> field32605;
   private final Class7739<Socket> field32606;
   private final Class7739<Socket> field32607;
   private final Class7739<Socket> field32608;
   private final Class9692 field32609 = Class9692.method37946();

   public Class7595(Class<?> var1, Class7739<Socket> var2, Class7739<Socket> var3, Class7739<Socket> var4, Class7739<Socket> var5) {
      this.field32604 = var1;
      this.field32605 = var2;
      this.field32606 = var3;
      this.field32607 = var4;
      this.field32608 = var5;
   }

   @Override
   public void method24869(Socket var1, InetSocketAddress var2, int var3) throws IOException {
      try {
         var1.connect(var2, var3);
      } catch (AssertionError var8) {
         if (Class9474.method36547(var8)) {
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
   public X509TrustManager method24870(SSLSocketFactory var1) {
      Object var4 = method24885(var1, this.field32604, "sslParameters");
      if (var4 == null) {
         try {
            Class var5 = Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, var1.getClass().getClassLoader());
            var4 = method24885(var1, var5, "sslParameters");
         } catch (ClassNotFoundException var6) {
            return super.method24870(var1);
         }
      }

      X509TrustManager var7 = method24885(var4, X509TrustManager.class, "x509TrustManager");
      return var7 != null ? var7 : method24885(var4, X509TrustManager.class, "trustManager");
   }

   @Override
   public void method24871(SSLSocket var1, String var2, List<Class2201> var3) {
      if (var2 != null) {
         this.field32605.method25621(var1, true);
         this.field32606.method25621(var1, var2);
      }

      if (this.field32608 != null && this.field32608.method25619(var1)) {
         Object[] var6 = new Object[]{method24884(var3)};
         this.field32608.method25623(var1, var6);
      }
   }

   @Override
   public String method24872(SSLSocket var1) {
      if (this.field32607 != null) {
         if (this.field32607.method25619(var1)) {
            byte[] var4 = (byte[])this.field32607.method25623(var1);
            return var4 == null ? null : new String(var4, Class9474.field44024);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   @Override
   public void method24873(int var1, String var2, Throwable var3) {
      int var6 = var1 != 5 ? 3 : 5;
      if (var3 != null) {
      //   var2 = var2 + '\n' + Log.getStackTraceString(var3);
      }

      int var7 = 0;
      int var8 = var2.length();

      while (var7 < var8) {
         int var9 = var2.indexOf(10, var7);
         var9 = var9 == -1 ? var8 : var9;

         int var10;
         do {
            var10 = Math.min(var9, var7 + 4000);
            //Log.println(var6, "OkHttp", var2.substring(var7, var10));
            var7 = var10;
         } while (var10 < var9);

         var7 = var10 + 1;
      }
   }

   @Override
   public Object method24874(String var1) {
      return this.field32609.method37944(var1);
   }

   @Override
   public void method24875(String var1, Object var2) {
      boolean var5 = this.field32609.method37945(var2);
      if (!var5) {
         this.method24873(5, var1, null);
      }
   }

   @Override
   public boolean method24876(String var1) {
      try {
         Class var4 = Class.forName("android.security.NetworkSecurityPolicy");
         Method var5 = var4.getMethod("getInstance");
         Object var6 = var5.invoke(null);
         Method var7 = var4.getMethod("isCleartextTrafficPermitted", String.class);
         return (Boolean)var7.invoke(var6, var1);
      } catch (NoSuchMethodException | ClassNotFoundException var8) {
         return super.method24876(var1);
      } catch (IllegalArgumentException | InvocationTargetException | IllegalAccessException var9) {
         throw new AssertionError();
      }
   }

   @Override
   public Class7658 method24877(X509TrustManager var1) {
      try {
         Class var4 = Class.forName("android.net.http.X509TrustManagerExtensions");
         Constructor var5 = var4.getConstructor(X509TrustManager.class);
         Object var6 = var5.newInstance(var1);
         Method var7 = var4.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class);
         return new Class7659(var6, var7);
      } catch (Exception var8) {
         return super.method24877(var1);
      }
   }

   public static Class7596 method24878() {
      try {
         Class var2;
         try {
            var2 = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
         } catch (ClassNotFoundException var9) {
            var2 = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
         }

         Class7739 var3 = new Class7739(null, "setUseSessionTickets", boolean.class);
         Class7739 var4 = new Class7739(null, "setHostname", String.class);
         Class7739 var5 = null;
         Class7739 var6 = null;

         try {
            Class.forName("android.net.Network");
            var5 = new Class7739(byte[].class, "getAlpnSelectedProtocol");
            var6 = new Class7739(null, "setAlpnProtocols", byte[].class);
         } catch (ClassNotFoundException var8) {
         }

         return new Class7595(var2, var3, var4, var5, var6);
      } catch (ClassNotFoundException var10) {
         return null;
      }
   }
}
