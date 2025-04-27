// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9527
{
    private static String[] field41015;
    private final float field41016;
    private final float field41017;
    private final Class7862 field41018;
    
    public Class9527(final float field41016, final float field41017, final Class7862 field41018) {
        this.field41016 = field41016;
        this.field41017 = field41017;
        this.field41018 = field41018;
    }
    
    public float method35572(final float n, final float n2) {
        final float n3 = n - this.field41016;
        final float n4 = n2 - this.field41017;
        return n3 * n3 + n4 * n4;
    }
    
    public float method35573() {
        return this.field41016;
    }
    
    public float method35574() {
        return this.field41017;
    }
    
    public Class7862 method35575() {
        return this.field41018;
    }
}
