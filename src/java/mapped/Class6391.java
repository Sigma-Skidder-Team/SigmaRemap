// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.floats.Float2FloatFunction;

public final class Class6391 implements Class6389<Class475, Float2FloatFunction>
{
    private static String[] field25505;
    public final /* synthetic */ Class476 field25506;
    
    public Class6391(final Class476 field25506) {
        this.field25506 = field25506;
    }
    
    public Float2FloatFunction method19081(final Class475 class475, final Class475 class476) {
        return n -> Math.max(class475.method2423(n), class476.method2423(n));
    }
    
    public Float2FloatFunction method19082(final Class475 class475) {
        return class475::method2423;
    }
    
    public Float2FloatFunction method19083() {
        return this.field25506::method2423;
    }
}
