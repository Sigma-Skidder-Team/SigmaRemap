// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.InputStream;
import java.io.DataInputStream;
import java.io.PushbackInputStream;

public class Class8847
{
    private static final int field37198 = 6144;
    private PushbackInputStream field37199;
    private DataInputStream field37200;
    private boolean field37201;
    private Class9124 field37202;
    
    public Class8847(final InputStream in) throws IOException {
        this.field37199 = new PushbackInputStream(in);
        this.field37200 = new DataInputStream(this.field37199);
        this.field37201 = true;
        if (this.method30976()) {
            return;
        }
        throw new IOException("no ADTS header found");
    }
    
    public byte[] method30974() {
        return this.field37202.method33082();
    }
    
    public byte[] method30975() throws IOException {
        if (!this.field37201) {
            this.method30976();
        }
        else {
            this.field37201 = false;
        }
        final byte[] b = new byte[this.field37202.method33081()];
        this.field37200.readFully(b);
        return b;
    }
    
    private boolean method30976() throws IOException {
        boolean b = false;
        int n = 6144;
        while (!b && n > 0) {
            final int read = this.field37199.read();
            --n;
            if (read != 255) {
                continue;
            }
            final int read2 = this.field37199.read();
            if ((read2 >> 4 & 0xF) == 0xF) {
                b = true;
            }
            this.field37199.unread(read2);
        }
        if (b) {
            this.field37202 = new Class9124(this.field37200);
        }
        return b;
    }
    
    public int method30977() {
        return this.field37202.method33083();
    }
    
    public int method30978() {
        return this.field37202.method33084();
    }
}
