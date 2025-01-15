// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9364
{
    private static String[] field40159;
    public final byte[] field40160;
    private final int field40161;
    private final int field40162;
    
    public Class9364(final byte[] field40160, final int field40161) {
        this.field40160 = field40160;
        this.field40161 = field40161;
        this.field40162 = field40161 + 4;
    }
    
    public int method34741(final int n, final int n2, final int n3) {
        final int n4 = n << this.field40162 | n3 << this.field40161 | n2;
        final int n5 = n4 >> 1;
        return ((n4 & 0x1) != 0x0) ? (this.field40160[n5] >> 4 & 0xF) : (this.field40160[n5] & 0xF);
    }
}
