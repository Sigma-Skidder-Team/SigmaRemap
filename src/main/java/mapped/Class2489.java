// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.LinkedList;

public class Class2489 extends Class2466
{
    private static String[] field14464;
    public final /* synthetic */ Class2956 field14465;
    
    public Class2489(final Class2956 field14465) {
        this.field14465 = field14465;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final Class6639 class8700 = class8699.method29841().method18207(Class6639.class);
        final int intValue = class8699.method29818(Class5260.field22312, 0);
        class8700.method20144(intValue, true);
        final Class8322 class8701 = class8699.method29822(Class5260.field22318);
        final LinkedList list = new LinkedList();
        list.add(new Class7276(12, Class1966.field10745, class8701));
        if (class8700.method20153() != intValue) {
            list.add(new Class7276(6, Class1966.field10753, Class7380.method22659(intValue, class8700)));
        }
        class8699.method29823(Class8761.field36784, list);
    }
}
