// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Class5170 implements Class5157<Class60, List>
{
    public List method16133(final Class60 class60) {
        final ArrayList list = new ArrayList();
        final Iterator<Class61> iterator = class60.method365().iterator();
        while (iterator.hasNext()) {
            list.add(Class7185.method22026((Class61)iterator.next()));
        }
        return list;
    }
    
    public Class60 method16134(final String s, final List list) {
        final ArrayList list2 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(Class7185.method22027("", iterator.next()));
        }
        return new Class60(s, list2);
    }
}
