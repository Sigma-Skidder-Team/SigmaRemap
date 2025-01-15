// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5360 implements Class5350<Class6908>
{
    private static String[] field22443;
    private final Class7805 field22444;
    
    public Class5360(final Class7805 field22444) {
        this.field22444 = field22444;
    }
    
    public Class6173 method16515(final Class6908 class6908, final Class1847 class6909, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        final Class6164 class6910 = new Class6164(class6909, n, n2, n3, n4, n5, n6, this.field22444, null);
        final float n7 = class6909.field10062.nextFloat() * 0.5f + 0.35f;
        class6910.method18435(1.0f * n7, 0.0f * n7, 1.0f * n7);
        return class6910;
    }
}
