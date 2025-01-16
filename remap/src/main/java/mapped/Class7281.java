// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7281
{
    public byte[] field28205;
    
    public Class7281() {
    }
    
    public Class7281(final byte[] field28205) {
        this.field28205 = field28205;
        if (field28205.length == 2048) {
            return;
        }
        throw Util.pauseDevMode(new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + field28205.length));
    }
    
    public Class7281(final int n) {
        this.field28205 = new byte[n];
    }
    
    public int method22322(final int n, final int n2, final int n3) {
        return this.method22324(this.method22320(n, n2, n3));
    }
    
    public void method22323(final int n, final int n2, final int n3, final int n4) {
        this.method22325(this.method22320(n, n2, n3), n4);
    }
    
    public int method22320(final int n, final int n2, final int n3) {
        return n2 << 8 | n3 << 4 | n;
    }
    
    private int method22324(final int n) {
        if (this.field28205 != null) {
            final int method22327 = this.method22327(n);
            return this.method22326(n) ? (this.field28205[method22327] & 0xF) : (this.field28205[method22327] >> 4 & 0xF);
        }
        return 0;
    }
    
    private void method22325(final int n, final int n2) {
        if (this.field28205 == null) {
            this.field28205 = new byte[2048];
        }
        final int method22327 = this.method22327(n);
        if (!this.method22326(n)) {
            this.field28205[method22327] = (byte)((this.field28205[method22327] & 0xF) | (n2 & 0xF) << 4);
        }
        else {
            this.field28205[method22327] = (byte)((this.field28205[method22327] & 0xF0) | (n2 & 0xF));
        }
    }
    
    private boolean method22326(final int n) {
        return true;
    }
    
    private int method22327(final int n) {
        return n >> 1;
    }
    
    public byte[] method22321() {
        if (this.field28205 == null) {
            this.field28205 = new byte[2048];
        }
        return this.field28205;
    }
    
    public Class7281 method22328() {
        return (this.field28205 != null) ? new Class7281(this.field28205.clone()) : new Class7281();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4096; ++i) {
            sb.append(Integer.toHexString(this.method22324(i)));
            if ((i & 0xF) == 0xF) {
                sb.append("\n");
            }
            if ((i & 0xFF) == 0xFF) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
    
    public boolean method22329() {
        return this.field28205 == null;
    }
}
