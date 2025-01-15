// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2654 extends Class2466
{
    private static String[] field14768;
    public final /* synthetic */ Class2869 field14769;
    
    public Class2654(final Class2869 field14769) {
        this.field14769 = field14769;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final int intValue = class8699.method29822(Class5260.field22312);
        final int intValue2 = class8699.method29822(Class5260.field22312);
        class8699.method29839();
        if (intValue != 383) {
            for (int i = 0; i < 16; ++i) {
                final Integer n = (Integer)Class9526.field41005.get((Object)(intValue << 4 | i));
                if (n == null) {
                    break;
                }
                final Class8699 method29836 = class8699.method29836(24);
                method29836.method29823(Class5260.field22312, n);
                method29836.method29823(Class5260.field22312, intValue2);
                method29836.method29833(Class5215.class);
            }
        }
        else {
            for (int j = 0; j < 44; ++j) {
                final Integer n2 = (Integer)Class9526.field41005.get((Object)(intValue << 16 | j));
                if (n2 == null) {
                    break;
                }
                final Class8699 method29837 = class8699.method29836(24);
                method29837.method29823(Class5260.field22312, n2);
                method29837.method29823(Class5260.field22312, intValue2);
                method29837.method29833(Class5215.class);
            }
        }
    }
}
