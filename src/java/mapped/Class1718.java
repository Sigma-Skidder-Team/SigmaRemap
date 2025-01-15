// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.OutputStream;
import java.io.FilterOutputStream;

public class Class1718 extends FilterOutputStream
{
    private boolean field9624;
    private int field9625;
    private byte[] field9626;
    private int field9627;
    private int field9628;
    private boolean field9629;
    private byte[] field9630;
    private boolean field9631;
    private int field9632;
    private byte[] field9633;
    
    public Class1718(final OutputStream outputStream) {
        this(outputStream, 1);
    }
    
    public Class1718(final OutputStream out, final int field9632) {
        super(out);
        this.field9629 = false;
        this.field9624 = false;
        this.field9627 = (this.field9624 ? 3 : 4);
        this.field9626 = new byte[this.field9627];
        this.field9625 = 0;
        this.field9628 = 0;
        this.field9631 = false;
        this.field9630 = new byte[4];
        this.field9632 = field9632;
        this.field9633 = Class7447.method22907(field9632);
    }
    
    @Override
    public void write(final int n) throws IOException {
        if (!this.field9631) {
            if (!this.field9624) {
                if (this.field9633[n & 0x7F] <= -5) {
                    if (this.field9633[n & 0x7F] != -5) {
                        throw new IOException("Invalid character in Base64 data.");
                    }
                }
                else {
                    this.field9626[this.field9625++] = (byte)n;
                    if (this.field9625 >= this.field9627) {
                        this.out.write(this.field9630, 0, Class7447.method22909(this.field9626, 0, this.field9630, 0, this.field9632));
                        this.field9625 = 0;
                    }
                }
            }
            else {
                this.field9626[this.field9625++] = (byte)n;
                if (this.field9625 >= this.field9627) {
                    this.out.write(Class7447.method22908(this.field9630, this.field9626, this.field9627, this.field9632));
                    this.field9628 += 4;
                    if (this.field9629) {
                        if (this.field9628 >= 76) {
                            this.out.write(10);
                            this.field9628 = 0;
                        }
                    }
                    this.field9625 = 0;
                }
            }
            return;
        }
        this.out.write(n);
    }
    
    @Override
    public void write(final byte[] b, final int off, final int len) throws IOException {
        if (!this.field9631) {
            for (int i = 0; i < len; ++i) {
                this.write(b[off + i]);
            }
            return;
        }
        this.out.write(b, off, len);
    }
    
    public void method6069() throws IOException {
        if (this.field9625 > 0) {
            if (!this.field9624) {
                throw new IOException("Base64 input not properly padded.");
            }
            this.out.write(Class7447.method22908(this.field9630, this.field9626, this.field9625, this.field9632));
            this.field9625 = 0;
        }
    }
    
    @Override
    public void close() throws IOException {
        this.method6069();
        super.close();
        this.field9626 = null;
        this.out = null;
    }
}
