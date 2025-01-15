// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ArrayDeque;
import java.security.cert.Certificate;
import java.util.List;

public final class Class7745 extends Class7744
{
    private static final int field31655 = 9;
    private final Class7195 field31656;
    
    public Class7745(final Class7195 field31656) {
        this.field31656 = field31656;
    }
    
    @Override
    public List<Certificate> method24708(final List<Certificate> c, final String s) throws SSLPeerUnverifiedException {
        final ArrayDeque arrayDeque = new ArrayDeque((Collection<? extends E>)c);
        final ArrayList obj = new ArrayList();
        obj.add(arrayDeque.removeFirst());
        boolean b = false;
    Label_0283:
        for (int i = 0; i < 9; ++i) {
            final X509Certificate obj2 = (X509Certificate)obj.get(obj.size() - 1);
            final X509Certificate method22081 = this.field31656.method22081(obj2);
            if (method22081 == null) {
                final Iterator iterator = arrayDeque.iterator();
                while (iterator.hasNext()) {
                    final X509Certificate x509Certificate = (X509Certificate)iterator.next();
                    if (!this.method24711(obj2, x509Certificate)) {
                        continue;
                    }
                    iterator.remove();
                    obj.add(x509Certificate);
                    continue Label_0283;
                }
                if (!b) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + obj2);
                }
                return obj;
            }
            else {
                if (obj.size() > 1 || !obj2.equals(method22081)) {
                    obj.add(method22081);
                }
                if (this.method24711(method22081, method22081)) {
                    return obj;
                }
                b = true;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + obj);
    }
    
    private boolean method24711(final X509Certificate x509Certificate, final X509Certificate x509Certificate2) {
        if (!x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        }
        catch (final GeneralSecurityException ex) {
            return false;
        }
    }
    
    @Override
    public int hashCode() {
        return this.field31656.hashCode();
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof Class7745 && ((Class7745)o).field31656.equals(this.field31656));
    }
}
