// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.InvocationTargetException;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.lang.reflect.Method;
import javax.net.ssl.X509TrustManager;

public final class Class7196 extends Class7195
{
    private static String[] field27964;
    private final X509TrustManager field27965;
    private final Method field27966;
    
    public Class7196(final X509TrustManager field27965, final Method field27966) {
        this.field27966 = field27966;
        this.field27965 = field27965;
    }
    
    @Override
    public X509Certificate method22081(final X509Certificate x509Certificate) {
        try {
            final TrustAnchor trustAnchor = (TrustAnchor)this.field27966.invoke(this.field27965, x509Certificate);
            return (trustAnchor != null) ? trustAnchor.getTrustedCert() : null;
        }
        catch (final IllegalAccessException ex) {
            throw new AssertionError();
        }
        catch (final InvocationTargetException ex2) {
            return null;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Class7196) {
            final Class7196 class7196 = (Class7196)o;
            return this.field27965.equals(class7196.field27965) && this.field27966.equals(class7196.field27966);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.field27965.hashCode() + 31 * this.field27966.hashCode();
    }
}
