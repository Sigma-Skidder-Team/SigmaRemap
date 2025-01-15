// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.LinkedHashMap;

public class Class3400 implements Class3398
{
    private static String[] field16120;
    public final /* synthetic */ Class7353 field16121;
    
    public Class3400(final Class7353 field16121) {
        this.field16121 = field16121;
    }
    
    @Override
    public Class7576 method10839(final Object o) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final Iterator iterator = ((Set)o).iterator();
        while (iterator.hasNext()) {
            linkedHashMap.put(iterator.next(), null);
        }
        return this.field16121.method22577(this.field16121.method22585(o.getClass(), Class8542.field35866), linkedHashMap, Class227.field802);
    }
}
