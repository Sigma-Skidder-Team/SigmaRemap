// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

public class Class2558 extends Class2466
{
    private static String[] field14592;
    public final /* synthetic */ Class2877 field14593;
    
    public Class2558(final Class2877 field14593) {
        this.field14593 = field14593;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final int intValue = class8699.method29818(Class5260.field22312, 0);
        final Class1989 method25541 = Class7889.method25541(Class8456.method28223(class8699.method29818(Class5260.field22312, 1)));
        class8699.method29841().method18207(Class6643.class).method20173(intValue, method25541);
        class8699.method29821(Class5260.field22312, 1, method25541.method8008());
        final List<Class7276> list = class8699.method29822(Class8761.field36784);
        Class7636.method24009(intValue, method25541, list, class8699.method29841());
        final Class8699 method25542 = class8699.method29836(68);
        method25542.method29823(Class5260.field22312, intValue);
        method25542.method29823(Class8761.field36784, list);
        method25542.method29833(Class5209.class);
    }
}
