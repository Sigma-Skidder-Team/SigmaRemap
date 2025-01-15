// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;

public abstract class Class1744 extends AudioInputStream implements Class1746
{
    private byte[] field9716;
    public final Class7773 field9717;
    
    public Class1744(final InputStream stream, final AudioFormat format, final long length) throws IOException {
        super(stream, format, length);
        this.field9717 = new Class7773(this);
    }
    
    @Override
    public int read() throws IOException {
        if (this.field9716 == null) {
            this.field9716 = new byte[1];
        }
        int n;
        if (this.field9717.method24895(this.field9716, 0, 1) != -1) {
            n = (this.field9716[0] & 0xFF);
        }
        else {
            n = -1;
        }
        return n;
    }
    
    @Override
    public int read(final byte[] array) throws IOException {
        return this.field9717.method24895(array, 0, array.length);
    }
    
    @Override
    public int read(final byte[] array, final int n, final int n2) throws IOException {
        return this.field9717.method24895(array, n, n2);
    }
    
    @Override
    public long skip(final long n) throws IOException {
        int i = (int)n;
        for (byte[] array = new byte[i]; i > 0; i -= this.field9717.method24895(array, 0, i)) {}
        return n;
    }
    
    @Override
    public int available() throws IOException {
        return this.field9717.method24890();
    }
    
    @Override
    public void close() throws IOException {
        this.field9717.method24888();
    }
    
    @Override
    public boolean markSupported() {
        return false;
    }
    
    @Override
    public void mark(final int n) {
    }
    
    @Override
    public void reset() throws IOException {
        throw new IOException("mark not supported");
    }
}
