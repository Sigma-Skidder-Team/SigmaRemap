// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.security.cert.Certificate;
import java.util.List;

public abstract class Class7744
{
    public abstract List<Certificate> method24708(final List<Certificate> p0, final String p1) throws SSLPeerUnverifiedException;
    
    public static Class7744 method24709(final X509TrustManager x509TrustManager) {
        return Class6550.method19842().method19851(x509TrustManager);
    }
    
    public static Class7744 method24710(final X509Certificate... array) {
        return new Class7745(Class7195.method22083(array));
    }
}
