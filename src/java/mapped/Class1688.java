// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.TimeUnit;
import java.net.ProtocolException;
import java.io.IOException;

public class Class1688 extends Class1685
{
    private long field9536;
    public final /* synthetic */ Class7812 field9530;
    
    public Class1688(final Class7812 field9530, final long field9531) throws IOException {
        this.field9530 = field9530;
        super(field9530, null);
        this.field9536 = field9531;
        if (this.field9536 == 0L) {
            this.method6041(true);
        }
    }
    
    @Override
    public long method6014(final Class1680 class1680, final long n) throws IOException {
        if (n < 0L) {
            throw new IllegalArgumentException("byteCount < 0: " + n);
        }
        if (this.field9529) {
            throw new IllegalStateException("closed");
        }
        if (this.field9536 == 0L) {
            return -1L;
        }
        final long method6014 = this.field9530.field32012.method6014(class1680, Math.min(this.field9536, n));
        if (method6014 != -1L) {
            this.field9536 -= method6014;
            if (this.field9536 == 0L) {
                this.method6041(true);
            }
            return method6014;
        }
        this.method6041(false);
        throw new ProtocolException("unexpected end of stream");
    }
    
    @Override
    public void close() throws IOException {
        if (!this.field9529) {
            if (this.field9536 != 0L) {
                if (!Class7690.method24435(this, 100, TimeUnit.MILLISECONDS)) {
                    this.method6041(false);
                }
            }
            this.field9529 = true;
        }
    }
}
