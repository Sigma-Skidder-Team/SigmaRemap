// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Method;
import javax.net.ssl.X509TrustManager;
import java.security.cert.X509Certificate;

public abstract class Class7195
{
    public abstract X509Certificate method22081(final X509Certificate p0);
    
    public static Class7195 method22082(final X509TrustManager x509TrustManager) {
        try {
            final Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new Class7196(x509TrustManager, declaredMethod);
        }
        catch (final NoSuchMethodException ex) {
            return method22083(x509TrustManager.getAcceptedIssuers());
        }
    }
    
    public static Class7195 method22083(final X509Certificate... array) {
        return new Class7194(array);
    }
}
