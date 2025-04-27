// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Map;

public class Class2764 extends Class2437
{
    private static String[] field14968;
    public final /* synthetic */ Class2615 field14969;
    
    public Class2764(final Class2615 field14969) {
        this.field14969 = field14969;
    }
    
    @Override
    public void method9788(final Class8699 class8699) throws Exception {
        class8699.method29823(Class5260.field22312, Class9526.field41006.size());
        for (final Map.Entry<T, V> entry : Class9526.field41006.entrySet()) {
            class8699.method29823(Class5260.field22308, entry.getKey());
            class8699.method29823(Class5260.field22313, ((Integer[])(Object)entry.getValue()).clone());
        }
        class8699.method29823(Class5260.field22312, Class9526.field41007.size());
        for (final Map.Entry<T, V> entry2 : Class9526.field41007.entrySet()) {
            class8699.method29823(Class5260.field22308, entry2.getKey());
            class8699.method29823(Class5260.field22313, ((Integer[])(Object)entry2.getValue()).clone());
        }
        class8699.method29823(Class5260.field22312, Class9526.field41008.size());
        for (final Map.Entry<T, V> entry3 : Class9526.field41008.entrySet()) {
            class8699.method29823(Class5260.field22308, entry3.getKey());
            class8699.method29823(Class5260.field22313, ((Integer[])(Object)entry3.getValue()).clone());
        }
    }
}
