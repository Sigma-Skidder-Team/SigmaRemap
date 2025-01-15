// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1893 extends Class1892
{
    private static String[] field10287;
    public final /* synthetic */ Class8730 field10288;
    
    public Class1893(final Class8730 field10288) {
        this.field10288 = field10288;
        super(Class388.field2249 + 2, 16, 256);
    }
    
    @Override
    public int method7328(final long n) {
        final Class79 class79 = (Class79)Class8730.method30151(this.field10288).get(n);
        if (class79 != null) {
            return class79.isEmpty() ? Integer.MAX_VALUE : ((Class1949)class79.method439()).method7923();
        }
        return Integer.MAX_VALUE;
    }
    
    @Override
    public int method7302(final long n) {
        if (!this.field10288.method30124(n)) {
            final Class9298 method30125 = this.field10288.method30125(n);
            if (method30125 != null) {
                return method30125.method34358();
            }
        }
        return Class388.field2249 + 1;
    }
    
    @Override
    public void method7304(final long n, final int n2) {
        final Class9298 method30125 = this.field10288.method30125(n);
        final int n3 = (method30125 != null) ? method30125.method34358() : (Class388.field2249 + 1);
        if (n3 != n2) {
            final Class9298 method30126 = this.field10288.method30126(n, n2, method30125, n3);
            if (method30126 != null) {
                Class8730.method30152(this.field10288).add(method30126);
            }
        }
    }
    
    public int method7330(final int n) {
        return this.method7324(n);
    }
}
