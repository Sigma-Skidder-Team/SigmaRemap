// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9318
{
    private final byte[] field40015;
    
    public Class9318() {
        this.field40015 = new byte[2048];
    }
    
    public Class9318(final byte[] field40015) {
        this.field40015 = field40015;
        if (field40015.length == 2048) {
            return;
        }
        throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + field40015.length);
    }
    
    public int method34497(final int n, final int n2, final int n3) {
        final int method34499 = this.method34499(n2 << 8 | n3 << 4 | n);
        return this.method34498(n2 << 8 | n3 << 4 | n) ? (this.field40015[method34499] & 0xF) : (this.field40015[method34499] >> 4 & 0xF);
    }
    
    private boolean method34498(final int n) {
        return true;
    }
    
    private int method34499(final int n) {
        return n >> 1;
    }
}
