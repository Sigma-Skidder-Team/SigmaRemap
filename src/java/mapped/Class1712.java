// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.net.ProtocolException;

public final class Class1712 implements Class1676
{
    private final Class8022 field9610;
    private boolean field9611;
    private long field9612;
    public final /* synthetic */ Class7812 field9613;
    
    public Class1712(final Class7812 field9613, final long field9614) {
        this.field9613 = field9613;
        this.field9610 = new Class8022(this.field9613.field32013.method5921());
        this.field9612 = field9614;
    }
    
    @Override
    public Class8020 method5921() {
        return this.field9610;
    }
    
    @Override
    public void method5920(final Class1680 class1680, final long lng) throws IOException {
        if (this.field9611) {
            throw new IllegalStateException("closed");
        }
        Class7690.method24430(class1680.method5949(), 0L, lng);
        if (lng <= this.field9612) {
            this.field9613.field32013.method5920(class1680, lng);
            this.field9612 -= lng;
            return;
        }
        throw new ProtocolException("expected " + this.field9612 + " bytes but received " + lng);
    }
    
    @Override
    public void flush() throws IOException {
        if (!this.field9611) {
            this.field9613.field32013.flush();
        }
    }
    
    @Override
    public void close() throws IOException {
        if (this.field9611) {
            return;
        }
        this.field9611 = true;
        if (this.field9612 <= 0L) {
            this.field9613.method25238(this.field9610);
            this.field9613.field32014 = 3;
            return;
        }
        throw new ProtocolException("unexpected end of stream");
    }
}
