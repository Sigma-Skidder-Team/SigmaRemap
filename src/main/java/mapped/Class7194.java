// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.security.PublicKey;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import java.security.cert.X509Certificate;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import java.util.Map;

public final class Class7194 extends Class7195
{
    private static String[] field27962;
    private final Map<X500Principal, Set<X509Certificate>> field27963;
    
    public Class7194(final X509Certificate... array) {
        this.field27963 = new LinkedHashMap<X500Principal, Set<X509Certificate>>();
        for (final X509Certificate x509Certificate : array) {
            final X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = this.field27963.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.field27963.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }
    
    @Override
    public X509Certificate method22081(final X509Certificate x509Certificate) {
        final Set set = this.field27963.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (final X509Certificate x509Certificate2 : set) {
            final PublicKey publicKey = x509Certificate2.getPublicKey();
            try {
                x509Certificate.verify(publicKey);
                return x509Certificate2;
            }
            catch (final Exception ex) {
                continue;
            }
            break;
        }
        return null;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof Class7194 && ((Class7194)o).field27963.equals(this.field27963));
    }
    
    @Override
    public int hashCode() {
        return this.field27963.hashCode();
    }
}
