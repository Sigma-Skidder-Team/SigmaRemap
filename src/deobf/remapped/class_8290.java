package remapped;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

public abstract class class_8290 {
   public abstract List<Certificate> method_38246(List<Certificate> var1, String var2) throws SSLPeerUnverifiedException;

   public static class_8290 method_38248(X509TrustManager var0) {
      return class_3307.method_15163().method_15173(var0);
   }

   public static class_8290 method_38249(X509Certificate... var0) {
      return new class_2369(class_1950.method_9009(var0));
   }
}
