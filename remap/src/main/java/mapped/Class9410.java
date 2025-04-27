// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class9410
{
    private static String[] field40383;
    private static short field40384;
    private short field40385;
    
    public Class9410() {
        this.field40385 = -1;
    }
    
    public void method35005(final int n, final int n2) {
        int n3 = 1 << n2 - 1;
        do {
            if (((this.field40385 & 0x8000) == 0x0) == ((n & n3) == 0x0)) {
                this.field40385 <<= 1;
            }
            else {
                this.field40385 <<= 1;
                this.field40385 ^= Class9410.field40384;
            }
        } while ((n3 >>>= 1) != 0);
    }
    
    public short method35006() {
        final short field40385 = this.field40385;
        this.field40385 = -1;
        return field40385;
    }
    
    static {
        Class9410.field40384 = -32763;
    }
}
