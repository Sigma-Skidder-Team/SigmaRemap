// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public abstract class Class3841 extends Class3833 implements Class3840
{
    public Class3841(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12305;
    }
    
    @Override
    public boolean method11857(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final int n, final int n2) {
        super.method11857(class7096, class7097, class7098, n, n2);
        final Class436 method6727 = class7097.method6727(class7098);
        return method6727 != null && method6727.method2200(n, n2);
    }
    
    @Nullable
    @Override
    public Class434 method11827(final Class7096 class7096, final Class1847 class7097, final Class354 class7098) {
        final Class436 method6727 = class7097.method6727(class7098);
        return (method6727 instanceof Class434) ? method6727 : null;
    }
}
