// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.net.ProtocolException;

public class Class1687 extends Class1685
{
    private static final long field9532 = -1L;
    private final Class8846 field9533;
    private long field9534;
    private boolean field9535;
    public final /* synthetic */ Class7812 field9530;
    
    public Class1687(final Class7812 field9530, final Class8846 field9531) {
        this.field9530 = field9530;
        super(field9530, null);
        this.field9534 = -1L;
        this.field9535 = true;
        this.field9533 = field9531;
    }
    
    @Override
    public long method6014(final Class1680 class1680, final long n) throws IOException {
        if (n < 0L) {
            throw new IllegalArgumentException("byteCount < 0: " + n);
        }
        if (this.field9529) {
            throw new IllegalStateException("closed");
        }
        if (!this.field9535) {
            return -1L;
        }
        if (this.field9534 == 0L || this.field9534 == -1L) {
            this.method6042();
            if (!this.field9535) {
                return -1L;
            }
        }
        final long method6014 = this.field9530.field32012.method6014(class1680, Math.min(n, this.field9534));
        if (method6014 != -1L) {
            this.field9534 -= method6014;
            return method6014;
        }
        this.method6041(false);
        throw new ProtocolException("unexpected end of stream");
    }
    
    private void method6042() throws IOException {
        if (this.field9534 != -1L) {
            this.field9530.field32012.method5985();
        }
        try {
            this.field9534 = this.field9530.field32012.method5973();
            final String trim = this.field9530.field32012.method5985().trim();
            if (this.field9534 < 0L || (!trim.isEmpty() && !trim.startsWith(";"))) {
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.field9534 + trim + "\"");
            }
        }
        catch (final NumberFormatException ex) {
            throw new ProtocolException(ex.getMessage());
        }
        if (this.field9534 == 0L) {
            this.field9535 = false;
            Class9558.method35762(this.field9530.field32010.cookieJar(), this.field9533, this.field9530.method25232());
            this.method6041(true);
        }
    }
    
    @Override
    public void close() throws IOException {
        if (!this.field9529) {
            if (this.field9535) {
                if (!Class7690.method24435(this, 100, TimeUnit.MILLISECONDS)) {
                    this.method6041(false);
                }
            }
            this.field9529 = true;
        }
    }
}
