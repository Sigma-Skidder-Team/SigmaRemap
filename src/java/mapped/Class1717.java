// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.OutputStream;

public class Class1717 extends OutputStream
{
    public final /* synthetic */ Class1680 field9623;
    
    public Class1717(final Class1680 field9623) {
        this.field9623 = field9623;
    }
    
    @Override
    public void write(final int n) {
        this.field9623.method6004((byte)n);
    }
    
    @Override
    public void write(final byte[] array, final int n, final int n2) {
        this.field9623.method6003(array, n, n2);
    }
    
    @Override
    public void flush() {
    }
    
    @Override
    public void close() {
    }
    
    @Override
    public String toString() {
        return this.field9623 + ".outputStream()";
    }
}
