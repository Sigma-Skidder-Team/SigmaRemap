// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public final class Class2457 extends Class2449<List<Class7276>, List<Class7276>>
{
    private static String[] field14415;
    
    public Class2457(final Class5260 class5260) {
        super(class5260);
    }
    
    public List<Class7276> method9796(final Class8699 class8699, final List<Class7276> c) throws Exception {
        final CopyOnWriteArrayList list = new CopyOnWriteArrayList(c);
        for (final Class7276 class8700 : list) {
            if (class8700.method22294() < 5) {
                continue;
            }
            class8700.method22297(class8700.method22294() + 1);
        }
        return list;
    }
}
