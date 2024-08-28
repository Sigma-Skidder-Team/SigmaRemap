package mapped;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public final class Class7598 extends Class7596 {
   public final Method field32619;
   public final Method field32620;

   public Class7598(Method var1, Method var2) {
      this.field32619 = var1;
      this.field32620 = var2;
   }

   @Override
   public void method24871(SSLSocket var1, String var2, List<Class2201> var3) {
      try {
         SSLParameters var6 = var1.getSSLParameters();
         List var7 = method24882(var3);
         this.field32619.invoke(var6, (Object)var7.<String>toArray(new String[var7.size()]));
         var1.setSSLParameters(var6);
      } catch (InvocationTargetException | IllegalAccessException var8) {
         throw new AssertionError();
      }
   }

   @Override
   public String method24872(SSLSocket var1) {
      try {
         String var4 = (String)this.field32620.invoke(var1);
         return var4 != null && !var4.equals("") ? var4 : null;
      } catch (InvocationTargetException | IllegalAccessException var5) {
         throw new AssertionError();
      }
   }

   @Override
   public X509TrustManager method24870(SSLSocketFactory var1) {
      throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
   }

   public static Class7598 method24887() {
      try {
         Method var2 = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
         Method var3 = SSLSocket.class.getMethod("getApplicationProtocol");
         return new Class7598(var2, var3);
      } catch (NoSuchMethodException var4) {
         return null;
      }
   }
}
