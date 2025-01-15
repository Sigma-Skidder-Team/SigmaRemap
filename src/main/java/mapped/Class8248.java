// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import java.util.Comparator;
import javax.net.ssl.SSLSocket;
import javax.annotation.Nullable;
import java.util.List;

public final class Class8248
{
    private static final Class9578[] field33881;
    public static final Class8248 field33882;
    public static final Class8248 field33883;
    public static final Class8248 field33884;
    public final boolean field33885;
    public final boolean field33886;
    public final String[] field33887;
    public final String[] field33888;
    
    public Class8248(final Class9192 class9192) {
        this.field33885 = class9192.field38961;
        this.field33887 = class9192.field38962;
        this.field33888 = class9192.field38963;
        this.field33886 = class9192.field38964;
    }
    
    public boolean method27344() {
        return this.field33885;
    }
    
    @Nullable
    public List<Class9578> method27345() {
        return (this.field33887 == null) ? null : Class9578.method35878(this.field33887);
    }
    
    @Nullable
    public List<Class272> method27346() {
        return (this.field33888 == null) ? null : Class272.method920(this.field33888);
    }
    
    public boolean method27347() {
        return this.field33886;
    }
    
    public void method27348(final SSLSocket sslSocket, final boolean b) {
        final Class8248 method27349 = this.method27349(sslSocket, b);
        if (method27349.field33888 != null) {
            sslSocket.setEnabledProtocols(method27349.field33888);
        }
        if (method27349.field33887 != null) {
            sslSocket.setEnabledCipherSuites(method27349.field33887);
        }
    }
    
    private Class8248 method27349(final SSLSocket sslSocket, final boolean b) {
        String[] method24446 = (this.field33887 == null) ? sslSocket.getEnabledCipherSuites() : Class7690.method24440(Class9578.field41624, sslSocket.getEnabledCipherSuites(), this.field33887);
        final String[] array = (this.field33888 == null) ? sslSocket.getEnabledProtocols() : Class7690.method24440(Class7690.field30555, sslSocket.getEnabledProtocols(), this.field33888);
        final String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        final int method24447 = Class7690.method24445(Class9578.field41624, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (b) {
            if (method24447 != -1) {
                method24446 = Class7690.method24446(method24446, supportedCipherSuites[method24447]);
            }
        }
        return new Class9192(this).method33632(method24446).method33635(array).method33637();
    }
    
    public boolean method27350(final SSLSocket sslSocket) {
        return this.field33885 && (this.field33888 == null || Class7690.method24441(Class7690.field30555, this.field33888, sslSocket.getEnabledProtocols())) && (this.field33887 == null || Class7690.method24441(Class9578.field41624, this.field33887, sslSocket.getEnabledCipherSuites()));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof Class8248)) {
            return false;
        }
        if (o == this) {
            return true;
        }
        final Class8248 class8248 = (Class8248)o;
        if (this.field33885 == class8248.field33885) {
            if (this.field33885) {
                if (!Arrays.equals(this.field33887, class8248.field33887)) {
                    return false;
                }
                if (!Arrays.equals(this.field33888, class8248.field33888)) {
                    return false;
                }
                if (this.field33886 != class8248.field33886) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        int n = 17;
        if (this.field33885) {
            n = 31 * (31 * (31 * n + Arrays.hashCode(this.field33887)) + Arrays.hashCode(this.field33888)) + (this.field33886 ? 0 : 1);
        }
        return n;
    }
    
    @Override
    public String toString() {
        if (this.field33885) {
            return "ConnectionSpec(cipherSuites=" + ((this.field33887 == null) ? "[all enabled]" : this.method27345().toString()) + ", tlsVersions=" + ((this.field33888 == null) ? "[all enabled]" : this.method27346().toString()) + ", supportsTlsExtensions=" + this.field33886 + ")";
        }
        return "ConnectionSpec()";
    }
    
    static {
        field33881 = new Class9578[] { Class9578.field41726, Class9578.field41730, Class9578.field41727, Class9578.field41731, Class9578.field41737, Class9578.field41736, Class9578.field41701, Class9578.field41711, Class9578.field41702, Class9578.field41712, Class9578.field41683, Class9578.field41684, Class9578.field41655, Class9578.field41659, Class9578.field41633 };
        field33882 = new Class9192(true).method33631(Class8248.field33881).method33634(Class272.field1477, Class272.field1478, Class272.field1479, Class272.field1480).method33636(true).method33637();
        field33883 = new Class9192(Class8248.field33882).method33634(Class272.field1480).method33636(true).method33637();
        field33884 = new Class9192(false).method33637();
    }
}
