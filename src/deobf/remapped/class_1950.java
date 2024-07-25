package remapped;

import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public abstract class class_1950 {
   public abstract X509Certificate method_9010(X509Certificate var1);

   public static class_1950 method_9008(X509TrustManager var0) {
      try {
         Method var3 = var0.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
         var3.setAccessible(true);
         return new class_6403(var0, var3);
      } catch (NoSuchMethodException var4) {
         return method_9009(var0.getAcceptedIssuers());
      }
   }

   public static class_1950 method_9009(X509Certificate... var0) {
      return new class_1264(var0);
   }
}
