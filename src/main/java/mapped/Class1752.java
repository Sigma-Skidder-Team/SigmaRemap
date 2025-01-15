// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.InputStream;

public class Class1752 extends InputStream
{
    public final /* synthetic */ Class1700 field9739;
    
    public Class1752(final Class1700 field9739) {
        this.field9739 = field9739;
    }
    
    @Override
    public int read() throws IOException {
        if (this.field9739.field9578) {
            throw new IOException("closed");
        }
        if (this.field9739.field9576.field9512 == 0L && this.field9739.field9577.method6014(this.field9739.field9576, 8192L) == -1L) {
            return -1;
        }
        return this.field9739.field9576.method5964() & 0xFF;
    }
    
    @Override
    public int read(final byte[] array, final int n, final int n2) throws IOException {
        if (this.field9739.field9578) {
            throw new IOException("closed");
        }
        Class9476.method35277(array.length, n, n2);
        if (this.field9739.field9576.field9512 == 0L && this.field9739.field9577.method6014(this.field9739.field9576, 8192L) == -1L) {
            return -1;
        }
        return this.field9739.field9576.method5993(array, n, n2);
    }
    
    @Override
    public int available() throws IOException {
        if (!this.field9739.field9578) {
            return (int)Math.min(this.field9739.field9576.field9512, 2147483647L);
        }
        throw new IOException("closed");
    }
    
    @Override
    public void close() throws IOException {
        this.field9739.close();
    }
    
    @Override
    public String toString() {
        return this.field9739 + ".inputStream()";
    }
}
