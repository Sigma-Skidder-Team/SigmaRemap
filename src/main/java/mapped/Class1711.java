// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public final class Class1711 implements Class1676
{
    private final Class8022 field9607;
    private boolean field9608;
    public final /* synthetic */ Class7812 field9609;
    
    public Class1711(final Class7812 field9609) {
        this.field9609 = field9609;
        this.field9607 = new Class8022(this.field9609.field32013.method5921());
    }
    
    @Override
    public Class8020 method5921() {
        return this.field9607;
    }
    
    @Override
    public void method5920(final Class1680 class1680, final long n) throws IOException {
        if (this.field9608) {
            throw new IllegalStateException("closed");
        }
        if (n != 0L) {
            this.field9609.field32013.method5945(n);
            this.field9609.field32013.method5932("\r\n");
            this.field9609.field32013.method5920(class1680, n);
            this.field9609.field32013.method5932("\r\n");
        }
    }
    
    @Override
    public synchronized void flush() throws IOException {
        if (!this.field9608) {
            this.field9609.field32013.flush();
        }
    }
    
    @Override
    public synchronized void close() throws IOException {
        if (!this.field9608) {
            this.field9608 = true;
            this.field9609.field32013.method5932("0\r\n\r\n");
            this.field9609.method25238(this.field9607);
            this.field9609.field32014 = 3;
        }
    }
}
