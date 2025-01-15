// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.security.cert.X509Certificate;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Set;

public final class Class8645
{
    public static final Class8645 field36293;
    private final Set<Class7917> field36294;
    private final Class7744 field36295;
    
    public Class8645(final Set<Class7917> field36294, final Class7744 field36295) {
        this.field36294 = field36294;
        this.field36295 = field36295;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o != this) {
            if (o instanceof Class8645) {
                if (Class7690.method24431(this.field36295, ((Class8645)o).field36295)) {
                    if (this.field36294.equals(((Class8645)o).field36294)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return 31 * ((this.field36295 == null) ? 0 : this.field36295.hashCode()) + this.field36294.hashCode();
    }
    
    public void method29402(final String str, List<Certificate> method24708) throws SSLPeerUnverifiedException {
        final List<Class7917> method24709 = this.method29404(str);
        if (!method24709.isEmpty()) {
            if (this.field36295 != null) {
                method24708 = this.field36295.method24708(method24708, str);
            }
            for (int i = 0; i < method24708.size(); ++i) {
                final X509Certificate x509Certificate = method24708.get(i);
                Object method24710 = null;
                Object method24711 = null;
                for (int j = 0; j < method24709.size(); ++j) {
                    final Class7917 class7917 = method24709.get(j);
                    if (!class7917.field32504.equals("sha256/")) {
                        if (!class7917.field32504.equals("sha1/")) {
                            throw new AssertionError();
                        }
                        if (method24710 == null) {
                            method24710 = method29407(x509Certificate);
                        }
                        if (class7917.field32505.equals(method24710)) {
                            return;
                        }
                    }
                    else {
                        if (method24711 == null) {
                            method24711 = method29408(x509Certificate);
                        }
                        if (class7917.field32505.equals(method24711)) {
                            return;
                        }
                    }
                }
            }
            final StringBuilder append = new StringBuilder().append("Certificate pinning failure!").append("\n  Peer certificate chain:");
            for (int k = 0; k < method24708.size(); ++k) {
                final X509Certificate x509Certificate2 = method24708.get(k);
                append.append("\n    ").append(method29406(x509Certificate2)).append(": ").append(x509Certificate2.getSubjectDN().getName());
            }
            append.append("\n  Pinned certificates for ").append(str).append(":");
            for (int l = 0; l < method24709.size(); ++l) {
                append.append("\n    ").append(method24709.get(l));
            }
            throw new SSLPeerUnverifiedException(append.toString());
        }
    }
    
    @Deprecated
    public void method29403(final String s, final Certificate... a) throws SSLPeerUnverifiedException {
        this.method29402(s, Arrays.asList(a));
    }
    
    public List<Class7917> method29404(final String s) {
        List<Object> emptyList = Collections.emptyList();
        for (final Class7917 class7917 : this.field36294) {
            if (!class7917.method25634(s)) {
                continue;
            }
            if (emptyList.isEmpty()) {
                emptyList = new ArrayList<Object>();
            }
            emptyList.add(class7917);
        }
        return (List<Class7917>)emptyList;
    }
    
    public Class8645 method29405(final Class7744 class7744) {
        return Class7690.method24431(this.field36295, class7744) ? this : new Class8645(this.field36294, class7744);
    }
    
    public static String method29406(final Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + method29408((X509Certificate)certificate).method7745();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }
    
    public static Class1929 method29407(final X509Certificate x509Certificate) {
        return Class1929.method7738(x509Certificate.getPublicKey().getEncoded()).method7747();
    }
    
    public static Class1929 method29408(final X509Certificate x509Certificate) {
        return Class1929.method7738(x509Certificate.getPublicKey().getEncoded()).method7748();
    }
    
    static {
        field36293 = new Class8580().method29037();
    }
}
