package mapped;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

public abstract class Class7658 {
   public abstract List<Certificate> method25176(List<Certificate> var1, String var2) throws SSLPeerUnverifiedException;

   public static Class7658 method25178(X509TrustManager var0) {
      return Class7596.method24879().method24877(var0);
   }

   public static Class7658 method25179(X509Certificate... var0) {
      return new Class7657(Class7006.method21722(var0));
   }
}
