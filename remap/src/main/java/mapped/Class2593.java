// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.LinkedList;

public class Class2593 extends Class2466
{
    private static String[] field14657;
    public final /* synthetic */ Class2959 field14658;
    
    public Class2593(final Class2959 field14658) {
        this.field14658 = field14658;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        if (class8699.method29824(Class5260.field22292) == 2) {
            final Class6639 class8700 = class8699.method29841().method18207(Class6639.class);
            final int intValue = class8699.method29818(Class5260.field22312, 0);
            class8700.method20144(intValue, false);
            final Class8699 method29836 = class8699.method29836(67);
            method29836.method29823(Class5260.field22312, intValue);
            final LinkedList list = new LinkedList();
            if (class8700.method20153() != intValue) {
                list.add(new Class7276(6, Class1966.field10753, Class7380.method22659(intValue, class8700)));
            }
            list.add(new Class7276(12, Class1966.field10745, null));
            method29836.method29823(Class8761.field36784, list);
            method29836.method29833(Class5213.class);
        }
    }
}
