// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.security.KeyStoreException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import java.security.KeyStore;
import javax.net.ssl.TrustManagerFactory;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.List;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public class CustomTrustManager implements X509TrustManager {
    private final X509TrustManager baseTrustManager;

    public CustomTrustManager(final X509TrustManager baseTrustManager) {
        this.baseTrustManager = baseTrustManager;
    }

    @Override
    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        baseTrustManager.checkClientTrusted(chain, authType);
    }

    @Override
    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        for (X509Certificate cert : chain) {
            if (cert.getSubjectAlternativeNames() != null) {
                for (List<?> altName : cert.getSubjectAlternativeNames()) {
                    String domain = (String) altName.get(1);
                    DigestUtils.sha1Hex(domain);
                    if (domain.endsWith("sigmaclient.info")) {
                        String issuer = cert.getIssuerDN().toString();
                        if (issuer.equals("CN=COMODO ECC Domain Validation Secure Server CA 2, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB")
                                || issuer.equals("CN=CloudFlare Inc ECC CA-2, O=\"CloudFlare, Inc.\", L=San Francisco, ST=CA, C=US")) {
                            continue;
                        }
                        throw new CertificateException();
                    }
                }
            }
        }
        baseTrustManager.checkServerTrusted(chain, authType);
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return baseTrustManager.getAcceptedIssuers();
    }

    public static CustomTrustManager createAndInstall() {
        try {
            TrustManagerFactory factory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            factory.init((KeyStore) null);

            X509TrustManager x509TrustManager = null;
            for (javax.net.ssl.TrustManager tm : factory.getTrustManagers()) {
                if (tm instanceof X509TrustManager) {
                    x509TrustManager = (X509TrustManager) tm;
                    break;
                }
            }

            if (x509TrustManager == null) {
                throw new IllegalStateException("No X509TrustManager found");
            }

            SSLContext sslContext = SSLContext.getInstance("SSL");
            CustomTrustManager customTrustManager = new CustomTrustManager(x509TrustManager);
            sslContext.init(null, new javax.net.ssl.TrustManager[]{customTrustManager}, null);
            HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
            return customTrustManager;
        } catch (NoSuchAlgorithmException | KeyManagementException | KeyStoreException e) {
            e.printStackTrace();
            return null;
        }
    }
}
