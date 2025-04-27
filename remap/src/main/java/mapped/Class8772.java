// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.security.cert.X509Certificate;
import java.security.Principal;
import java.util.Collections;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import java.security.cert.Certificate;
import java.util.List;

public final class Class8772
{
    private final Class272 field36877;
    private final Class9578 field36878;
    private final List<Certificate> field36879;
    private final List<Certificate> field36880;
    
    private Class8772(final Class272 field36877, final Class9578 field36878, final List<Certificate> field36879, final List<Certificate> field36880) {
        this.field36877 = field36877;
        this.field36878 = field36878;
        this.field36879 = field36879;
        this.field36880 = field36880;
    }
    
    public static Class8772 method30462(final SSLSession sslSession) {
        final String cipherSuite = sslSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        final Class9578 method35877 = Class9578.method35877(cipherSuite);
        final String protocol = sslSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        final Class272 method35878 = Class272.method919(protocol);
        Certificate[] peerCertificates;
        try {
            peerCertificates = sslSession.getPeerCertificates();
        }
        catch (final SSLPeerUnverifiedException ex) {
            peerCertificates = null;
        }
        final List<Certificate> list = (peerCertificates != null) ? Class7690.method24438(peerCertificates) : Collections.emptyList();
        final Certificate[] localCertificates = sslSession.getLocalCertificates();
        return new Class8772(method35878, method35877, list, (localCertificates != null) ? Class7690.method24438(localCertificates) : Collections.emptyList());
    }
    
    public static Class8772 method30463(final Class272 class272, final Class9578 class273, final List<Certificate> list, final List<Certificate> list2) {
        if (class272 == null) {
            throw new NullPointerException("tlsVersion == null");
        }
        if (class273 != null) {
            return new Class8772(class272, class273, Class7690.method24437(list), Class7690.method24437(list2));
        }
        throw new NullPointerException("cipherSuite == null");
    }
    
    public Class272 method30464() {
        return this.field36877;
    }
    
    public Class9578 method30465() {
        return this.field36878;
    }
    
    public List<Certificate> method30466() {
        return this.field36879;
    }
    
    @Nullable
    public Principal method30467() {
        return this.field36879.isEmpty() ? null : this.field36879.get(0).getSubjectX500Principal();
    }
    
    public List<Certificate> method30468() {
        return this.field36880;
    }
    
    @Nullable
    public Principal method30469() {
        return this.field36880.isEmpty() ? null : this.field36880.get(0).getSubjectX500Principal();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof Class8772) {
            final Class8772 class8772 = (Class8772)o;
            if (this.field36877.equals(class8772.field36877)) {
                if (this.field36878.equals(class8772.field36878)) {
                    if (this.field36879.equals(class8772.field36879)) {
                        return this.field36880.equals(class8772.field36880);
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * 17 + this.field36877.hashCode()) + this.field36878.hashCode()) + this.field36879.hashCode()) + this.field36880.hashCode();
    }
}
