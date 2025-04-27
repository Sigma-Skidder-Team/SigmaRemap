// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.logging.Level;
import java.io.IOException;

public final class Class1697 implements Class1682
{
    private final Class1681 field9564;
    public int field9565;
    public byte field9566;
    public int field9567;
    public int field9568;
    public short field9569;
    
    public Class1697(final Class1681 field9564) {
        this.field9564 = field9564;
    }
    
    @Override
    public long method6014(final Class1680 class1680, final long a) throws IOException {
        while (this.field9568 == 0) {
            this.field9564.method5995(this.field9569);
            this.field9569 = 0;
            if ((this.field9566 & 0x4) != 0x0) {
                return -1L;
            }
            this.method6055();
        }
        final long method6014 = this.field9564.method6014(class1680, Math.min(a, this.field9568));
        if (method6014 != -1L) {
            this.field9568 -= (int)method6014;
            return method6014;
        }
        return -1L;
    }
    
    @Override
    public Class8020 method5921() {
        return this.field9564.method5921();
    }
    
    @Override
    public void close() throws IOException {
    }
    
    private void method6055() throws IOException {
        final int field9567 = this.field9567;
        final int method6148 = Class1736.method6148(this.field9564);
        this.field9568 = method6148;
        this.field9565 = method6148;
        final byte b = (byte)(this.field9564.method5964() & 0xFF);
        this.field9566 = (byte)(this.field9564.method5964() & 0xFF);
        if (Class1736.field9686.isLoggable(Level.FINE)) {
            Class1736.field9686.fine(Class6885.method21141(true, this.field9567, this.field9565, b, this.field9566));
        }
        this.field9567 = (this.field9564.method5967() & Integer.MAX_VALUE);
        if (b != 9) {
            throw Class6885.method21140("%s != TYPE_CONTINUATION", b);
        }
        if (this.field9567 == field9567) {
            return;
        }
        throw Class6885.method21140("TYPE_CONTINUATION streamId changed");
    }
}
