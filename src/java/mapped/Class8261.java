// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class8261 extends Class8260
{
    private static String[] field33922;
    private final Class8260 field33923;
    private final int field33924;
    private final int field33925;
    private final int field33926;
    private final int field33927;
    private final int field33928;
    private final int field33929;
    
    public Class8261(final Class8260 field33923, final int field33924, final int field33925, final int field33926, final int field33927, final int field33928, final int field33929) {
        super(field33927 - field33924, field33928 - field33925, field33929 - field33926);
        this.field33923 = field33923;
        this.field33924 = field33924;
        this.field33925 = field33925;
        this.field33926 = field33926;
        this.field33927 = field33927;
        this.field33928 = field33928;
        this.field33929 = field33929;
    }
    
    @Override
    public boolean method27414(final int n, final int n2, final int n3) {
        return this.field33923.method27414(this.field33924 + n, this.field33925 + n2, this.field33926 + n3);
    }
    
    @Override
    public void method27415(final int n, final int n2, final int n3, final boolean b, final boolean b2) {
        this.field33923.method27415(this.field33924 + n, this.field33925 + n2, this.field33926 + n3, b, b2);
    }
    
    @Override
    public int method27417(final Class111 class111) {
        return Math.max(0, this.field33923.method27417(class111) - class111.method604(this.field33924, this.field33925, this.field33926));
    }
    
    @Override
    public int method27418(final Class111 class111) {
        return Math.min(class111.method604(this.field33927, this.field33928, this.field33929), this.field33923.method27418(class111) - class111.method604(this.field33924, this.field33925, this.field33926));
    }
}
