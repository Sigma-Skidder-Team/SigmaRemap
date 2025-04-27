// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Collection;

public interface Class6526
{
    Class6526 field25975 = collection -> {
        final String[][] array = new String[collection.size()][];
        collection.iterator();
        final Iterator iterator;
        while (iterator.hasNext()) {
            final String s = iterator.next();
            int n = 0;
            n++;
            final Object o;
            final int n2;
            o[n2] = new String[] { s };
        }
        return array;
    };
    Class6526 field25976 = collection3 -> new String[][] { collection3.toArray(new String[0]) };
    
    String[][] method19745(final Collection<String> p0);
}
