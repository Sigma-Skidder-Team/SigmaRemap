package mapped;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public class ClientX509TrustManager implements X509TrustManager {
   private X509TrustManager field22261;

   public ClientX509TrustManager(X509TrustManager var1) {
      this.field22261 = var1;
   }

   @Override
   public void checkClientTrusted(X509Certificate[] var1, String var2) throws CertificateException {

   }

   @Override
   public void checkServerTrusted(X509Certificate[] var1, String var2) throws CertificateException {

   }

   @Override
   public X509Certificate[] getAcceptedIssuers() {
      return this.field22261.getAcceptedIssuers();
   }
}
