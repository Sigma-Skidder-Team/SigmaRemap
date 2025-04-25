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
import java.util.Iterator;
import org.apache.commons.codec.digest.DigestUtils;
import java.util.List;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public class TrustManager implements X509TrustManager
{
    private X509TrustManager field36477;
    
    public TrustManager(final X509TrustManager field36477) {
        this.field36477 = field36477;
    }
    
    @Override
    public void checkClientTrusted(final X509Certificate[] array, final String s) throws CertificateException {
        this.field36477.checkClientTrusted(array, s);
    }
    
    @Override
    public void checkServerTrusted(final X509Certificate[] array, final String s) throws CertificateException {
        for (int i = 0; i < array.length; ++i) {
            if (array[i].getSubjectAlternativeNames() != null) {
                final Iterator<List<?>> iterator = array[i].getSubjectAlternativeNames().iterator();
                while (iterator.hasNext()) {
                    final String s2 = iterator.next().get(1);
                    DigestUtils.sha1Hex(s2);
                    if (!s2.endsWith("sigmaclient.info")) {
                        continue;
                    }
                    if (array[i].getIssuerDN().toString().equals("CN=COMODO ECC Domain Validation Secure Server CA 2, O=COMODO CA Limited, L=Salford, ST=Greater Manchester, C=GB")) {
                        continue;
                    }
                    if (array[i].getIssuerDN().toString().equals("CN=CloudFlare Inc ECC CA-2, O=\"CloudFlare, Inc.\", L=San Francisco, ST=CA, C=US")) {
                        continue;
                    }
                    throw new CertificateException();
                }
            }
        }
        this.field36477.checkServerTrusted(array, s);
    }
    
    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return this.field36477.getAcceptedIssuers();
    }
    
    public static TrustManager method29718() {
        try {
            final TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore)null);
            X509TrustManager x509TrustManager = null;
            for (final javax.net.ssl.TrustManager trustManager : instance.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    x509TrustManager = (X509TrustManager)trustManager;
                    break;
                }
            }
            final SSLContext instance2 = SSLContext.getInstance("SSL");
            final TrustManager trustManager = new TrustManager(x509TrustManager);
            instance2.init(null, new TrustManager[] {trustManager}, null);
            HttpsURLConnection.setDefaultSSLSocketFactory(instance2.getSocketFactory());
            return trustManager;
        }
        catch (final NoSuchAlgorithmException | KeyManagementException | KeyStoreException ex) {
            ((Throwable)ex).printStackTrace();
            return null;
        }
    }
}
