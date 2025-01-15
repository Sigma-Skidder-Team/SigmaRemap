// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class8523
{
    private static String[] field35787;
    public final Class8523[] field35788;
    public final int field35789;
    public final int field35790;
    
    public Class8523() {
        this.field35788 = new Class8523[256];
        this.field35789 = 0;
        this.field35790 = 0;
    }
    
    public Class8523(final int field35789, final int n) {
        this.field35788 = null;
        this.field35789 = field35789;
        final int n2 = n & 0x7;
        this.field35790 = ((n2 != 0) ? n2 : 8);
    }
}
