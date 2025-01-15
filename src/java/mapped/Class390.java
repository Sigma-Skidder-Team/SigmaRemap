// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class390 implements AutoCloseable
{
    private static String[] field2274;
    private final Class869 field2275;
    private final Class8282 field2276;
    
    public Class390(final Class869 field2275) {
        this.field2275 = field2275;
        this.field2276 = new Class8282(Class7646::new);
    }
    
    public Class1925 method1413(final Class9154 class9154, final String s, final String s2) {
        return new Class1925(this.field2275, this.field2276, class9154, s, s2);
    }
    
    @Override
    public void close() {
        this.field2276.method27523();
    }
}
