package mapped;

import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public abstract class Class7006 {
   public abstract X509Certificate method21720(X509Certificate var1);

   public static Class7006 method21721(X509TrustManager var0) {
      try {
         Method var3 = var0.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
         var3.setAccessible(true);
         return new Class7007(var0, var3);
      } catch (NoSuchMethodException var4) {
         return method21722(var0.getAcceptedIssuers());
      }
   }

   public static Class7006 method21722(X509Certificate... var0) {
      return new Class7005(var0);
   }
}
