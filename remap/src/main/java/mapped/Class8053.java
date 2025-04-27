// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8053 implements Class8054
{
    private static String[] field33140;
    private final int field33141;
    
    public Class8053(final int field33141) {
        this.field33141 = field33141;
    }
    
    @Override
    public float method26428(final Class7449 class7449, final Class7916 class7450, final int n, final int n2, final int n3, final int n4) {
        return (float)(this.field33141 * (Math.abs(n - n3) + Math.abs(n2 - n4)));
    }
}
