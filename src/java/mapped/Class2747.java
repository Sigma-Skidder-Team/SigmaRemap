// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

public class Class2747 extends Class2466
{
    private static String[] field14938;
    public final /* synthetic */ Class2839 field14939;
    
    public Class2747(final Class2839 field14939) {
        this.field14939 = field14939;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final int intValue = class8699.method29818(Class5260.field22312, 0);
        final Class1989 field11014 = Class1989.field11014;
        class8699.method29841().method18207(Class6643.class).method20173(intValue, field11014);
        final List<Class7276> list = class8699.method29822(Class8761.field36784);
        Class7636.method24009(intValue, field11014, list, class8699.method29841());
        final Class8699 method29836 = class8699.method29836(68);
        method29836.method29823(Class5260.field22312, intValue);
        method29836.method29823(Class8761.field36784, list);
        method29836.method29833(Class5209.class);
    }
}
