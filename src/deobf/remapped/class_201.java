package remapped;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public class class_201 implements X509TrustManager {
   private X509TrustManager field_672;

   public class_201(X509TrustManager var1) {
      this.field_672 = var1;
   }

   @Override
   public void checkClientTrusted(X509Certificate[] var1, String var2) throws CertificateException {
      this.field_672.checkClientTrusted(var1, var2);
   }

   @Override
   public void checkServerTrusted(X509Certificate[] var1, String var2) throws CertificateException {
      for (int var5 = 0; var5 < var1.length; var5++) {
         if (var1[var5].getSubjectAlternativeNames() != null) {
            for (List var7 : var1[var5].getSubjectAlternativeNames()) {
               String var8 = (String)var7.get(1);
               if (var8.endsWith("sigmaclient.info")
                  && !var1[var5]
                     .getIssuerDN()
                     .toString()
                     .equals("CN=COMODO ECC Domain Validation Secure Server CA 2, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB")
                  && !var1[var5].getIssuerDN().toString().equals("CN=Cloudflare Inc ECC CA-3, O=\"Cloudflare, Inc.\", C=US")) {
                  throw new CertificateException();
               }
            }
         }
      }

      this.field_672.checkServerTrusted(var1, var2);
   }

   @Override
   public X509Certificate[] getAcceptedIssuers() {
      return this.field_672.getAcceptedIssuers();
   }

   public static class_201 method_866() {
      try {
         TrustManagerFactory var2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
         var2.init((KeyStore)null);
         X509TrustManager var3 = null;

         for (TrustManager var7 : var2.getTrustManagers()) {
            if (var7 instanceof X509TrustManager) {
               var3 = (X509TrustManager)var7;
               break;
            }
         }

         SSLContext var9 = SSLContext.getInstance("SSL");
         class_201 var10 = new class_201(var3);
         var9.init(null, new class_201[]{var10}, null);
         HttpsURLConnection.setDefaultSSLSocketFactory(var9.getSocketFactory());
         return var10;
      } catch (KeyManagementException | KeyStoreException | NoSuchAlgorithmException var8) {
         var8.printStackTrace();
         return null;
      }
   }
}
