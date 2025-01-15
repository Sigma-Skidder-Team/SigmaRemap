// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;
import java.util.List;

public final class Class8838
{
    private final List<Class8248> field37145;
    private int field37146;
    private boolean field37147;
    private boolean field37148;
    
    public Class8838(final List<Class8248> field37145) {
        this.field37146 = 0;
        this.field37145 = field37145;
    }
    
    public Class8248 method30864(final SSLSocket sslSocket) throws IOException {
        Class8248 class8248 = null;
        for (int i = this.field37146; i < this.field37145.size(); ++i) {
            final Class8248 class8249 = this.field37145.get(i);
            if (class8249.method27350(sslSocket)) {
                class8248 = class8249;
                this.field37146 = i + 1;
                break;
            }
        }
        if (class8248 != null) {
            this.field37147 = this.method30866(sslSocket);
            Class9013.field38043.method32274(class8248, sslSocket, this.field37148);
            return class8248;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.field37148 + ", modes=" + this.field37145 + ", supported protocols=" + Arrays.toString(sslSocket.getEnabledProtocols()));
    }
    
    public boolean method30865(final IOException ex) {
        this.field37148 = true;
        return this.field37147 && !(ex instanceof ProtocolException) && !(ex instanceof InterruptedIOException) && (!(ex instanceof SSLHandshakeException) || !(ex.getCause() instanceof CertificateException)) && !(ex instanceof SSLPeerUnverifiedException) && (ex instanceof SSLHandshakeException || ex instanceof SSLProtocolException);
    }
    
    private boolean method30866(final SSLSocket sslSocket) {
        for (int i = this.field37146; i < this.field37145.size(); ++i) {
            if (this.field37145.get(i).method27350(sslSocket)) {
                return true;
            }
        }
        return false;
    }
}
