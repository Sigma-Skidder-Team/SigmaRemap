// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.OutputStream;

public class Class1716 extends OutputStream
{
    public final /* synthetic */ Class1701 field9622;
    
    public Class1716(final Class1701 field9622) {
        this.field9622 = field9622;
    }
    
    @Override
    public void write(final int n) throws IOException {
        if (!this.field9622.field9581) {
            this.field9622.field9579.method6004((byte)n);
            this.field9622.method5947();
            return;
        }
        throw new IOException("closed");
    }
    
    @Override
    public void write(final byte[] array, final int n, final int n2) throws IOException {
        if (!this.field9622.field9581) {
            this.field9622.field9579.method6003(array, n, n2);
            this.field9622.method5947();
            return;
        }
        throw new IOException("closed");
    }
    
    @Override
    public void flush() throws IOException {
        if (!this.field9622.field9581) {
            this.field9622.flush();
        }
    }
    
    @Override
    public void close() throws IOException {
        this.field9622.close();
    }
    
    @Override
    public String toString() {
        return this.field9622 + ".outputStream()";
    }
}
