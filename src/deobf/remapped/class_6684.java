package remapped;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public final class class_6684 extends class_3307 {
   public final Method field_34546;
   public final Method field_34548;

   public class_6684(Method var1, Method var2) {
      this.field_34546 = var1;
      this.field_34548 = var2;
   }

   @Override
   public void method_15166(SSLSocket var1, String var2, List<class_7976> var3) {
      try {
         SSLParameters var6 = var1.getSSLParameters();
         List var7 = method_15162(var3);
         this.field_34546.invoke(var6, (Object)var7.<String>toArray(new String[var7.size()]));
         var1.setSSLParameters(var6);
      } catch (InvocationTargetException | IllegalAccessException var8) {
         throw new AssertionError();
      }
   }

   @Override
   public String method_15174(SSLSocket var1) {
      try {
         String var4 = (String)this.field_34548.invoke(var1);
         return var4 != null && !var4.equals("") ? var4 : null;
      } catch (InvocationTargetException | IllegalAccessException var5) {
         throw new AssertionError();
      }
   }

   @Override
   public X509TrustManager method_15169(SSLSocketFactory var1) {
      throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
   }

   public static class_6684 method_30656() {
      try {
         Method var2 = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
         Method var3 = SSLSocket.class.getMethod("getApplicationProtocol");
         return new class_6684(var2, var3);
      } catch (NoSuchMethodException var4) {
         return null;
      }
   }
}
