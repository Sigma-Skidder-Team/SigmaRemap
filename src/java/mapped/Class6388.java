// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class Class6388<S extends Class436> implements Class6389<S, Int2IntFunction>
{
    private static String[] field25503;
    
    public Int2IntFunction method19069(final S n, final S n2) {
        return n -> {
            final int method5776 = Class1656.method5776(n.method2186(), n.method2193());
            final int method5777 = Class1656.method5776(n2.method2186(), n2.method2193());
            return Class392.method1422(Math.max(Class392.method1423(method5776), Class392.method1423(method5777)), Math.max(Class392.method1424(method5776), Class392.method1424(method5777)));
        };
    }
    
    public Int2IntFunction method19070(final S n) {
        return n -> n;
    }
    
    public Int2IntFunction method19071() {
        return n -> n;
    }
}
