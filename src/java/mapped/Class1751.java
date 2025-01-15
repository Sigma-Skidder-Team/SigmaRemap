// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.InputStream;

public class Class1751 extends InputStream
{
    public final /* synthetic */ Class1680 field9738;
    
    public Class1751(final Class1680 field9738) {
        this.field9738 = field9738;
    }
    
    @Override
    public int read() {
        if (this.field9738.field9512 <= 0L) {
            return -1;
        }
        return this.field9738.method5964() & 0xFF;
    }
    
    @Override
    public int read(final byte[] array, final int n, final int n2) {
        return this.field9738.method5993(array, n, n2);
    }
    
    @Override
    public int available() {
        return (int)Math.min(this.field9738.field9512, 2147483647L);
    }
    
    @Override
    public void close() {
    }
    
    @Override
    public String toString() {
        return this.field9738 + ".inputStream()";
    }
}
