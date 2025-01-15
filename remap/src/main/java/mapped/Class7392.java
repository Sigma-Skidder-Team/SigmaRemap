// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7392
{
    private static String[] field28467;
    private final Class4148 field28468;
    private static final Class7392 field28469;
    
    public static Class7392 method22694() {
        Class8726.method29989(Class8726::method29988);
        return Class7392.field28469;
    }
    
    public Class7392(final int n) {
        this.field28468 = new Class4148(n);
    }
    
    public Class7392() {
        this(2097152);
    }
    
    public void method22695() {
        if (this.field28468.field18497 != null) {
            Class7663.method24286(this.field28468.field18497);
        }
        this.field28468.method12393();
        Class8475.method28282(this.field28468);
    }
    
    public Class4148 method22696() {
        return this.field28468;
    }
    
    static {
        field28469 = new Class7392();
    }
}
