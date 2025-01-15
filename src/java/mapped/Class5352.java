// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5352 implements Class5350<Class6908>
{
    private static String[] field22427;
    private final Class7805 field22428;
    
    public Class5352(final Class7805 field22428) {
        this.field22428 = field22428;
    }
    
    public Class6173 method16515(final Class6908 class6908, final Class1847 class6909, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        final Class6165 class6910 = new Class6165(class6909, n, n2, n3, n4, n5, n6, null);
        class6910.method18428(this.field22428);
        class6910.method18435(1.0f, 1.0f, 1.0f);
        class6910.method18437(3 + class6909.method6790().nextInt(5));
        return class6910;
    }
}
