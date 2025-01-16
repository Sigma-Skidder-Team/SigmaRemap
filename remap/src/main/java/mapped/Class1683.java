// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.InputStream;

public final class Class1683 implements Class1682
{
    public final /* synthetic */ Class8020 field9513;
    public final /* synthetic */ InputStream field9514;
    
    public Class1683(final Class8020 field9513, final InputStream field9514) {
        this.field9513 = field9513;
        this.field9514 = field9514;
    }
    
    @Override
    public long method6014(final Class1680 class1680, final long n) throws IOException {
        if (n < 0L) {
            throw new IllegalArgumentException("byteCount < 0: " + n);
        }
        if (n == 0L) {
            return 0L;
        }
        try {
            this.field9513.method26305();
            final Class9258 method6013 = class1680.method6013(1);
            final int read = this.field9514.read(method6013.field39713, method6013.field39715, (int)Math.min(n, 8192 - method6013.field39715));
            if (read == -1) {
                return -1L;
            }
            final Class9258 class1681 = method6013;
            class1681.field39715 += read;
            class1680.field9512 += read;
            return read;
        }
        catch (final AssertionError cause) {
            if (Class8753.method30290(cause)) {
                throw new IOException(cause);
            }
        }
        return n;
    }
    
    @Override
    public void close() throws IOException {
        this.field9514.close();
    }
    
    @Override
    public Class8020 method5921() {
        return this.field9513;
    }
    
    @Override
    public String toString() {
        return "source(" + this.field9514 + ")";
    }
}
