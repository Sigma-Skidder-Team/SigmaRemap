// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class158 implements Class122
{
    private static String[] field461;
    private final Class8697 field462;
    private final Class354 field463;
    
    public Class158(final Class8697 field462, final Class354 field463) {
        this.field462 = field462;
        this.field463 = field463;
    }
    
    @Override
    public boolean test(final Class7529 class7529) {
        final Class354 class7530 = class7529.method23579(Class6683.field26367);
        return class7530 != null && this.field462.method29812(class7529.method23588(), (float)(class7530.method1074() + this.field463.method1074()), (float)(class7530.method1075() + this.field463.method1075()), (float)(class7530.method1076() + this.field463.method1076()));
    }
    
    public static Class8775 method750(final Class7600 class7600) {
        return () -> new Class158(class7600.method23900(), Class354.field2173);
    }
}
