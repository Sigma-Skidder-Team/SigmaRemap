// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.InvocationTargetException;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.security.cert.X509Certificate;
import java.security.cert.Certificate;
import java.util.List;
import java.lang.reflect.Method;

public final class Class7743 extends Class7744
{
    private final Object field31653;
    private final Method field31654;
    
    public Class7743(final Object field31653, final Method field31654) {
        this.field31653 = field31653;
        this.field31654 = field31654;
    }
    
    @Override
    public List<Certificate> method24708(final List<Certificate> list, final String s) throws SSLPeerUnverifiedException {
        try {
            return (List)this.field31654.invoke(this.field31653, list.toArray(new X509Certificate[list.size()]), "RSA", s);
        }
        catch (final InvocationTargetException cause) {
            final SSLPeerUnverifiedException ex = new SSLPeerUnverifiedException(cause.getMessage());
            ex.initCause(cause);
            throw ex;
        }
        catch (final IllegalAccessException detailMessage) {
            throw new AssertionError(detailMessage);
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Class7743;
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
}
