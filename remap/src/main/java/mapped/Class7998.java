// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class7998
{
    public final long field32942;
    public final Class1680 field32943;
    public boolean field32944;
    public boolean field32945;
    private final Class1676 field32946;
    private final Class1682 field32947;
    
    public Class7998(final long n) {
        this.field32943 = new Class1680();
        this.field32946 = new Class1677(this);
        this.field32947 = new Class1698(this);
        if (n >= 1L) {
            this.field32942 = n;
            return;
        }
        throw new IllegalArgumentException("maxBufferSize < 1: " + n);
    }
    
    public Class1682 method26165() {
        return this.field32947;
    }
    
    public Class1676 method26166() {
        return this.field32946;
    }
}
