// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.NoSuchElementException;
import com.google.common.collect.Maps;
import java.util.Map;

public class Class8739
{
    private static String[] field36716;
    
    public static <K, V> Map<K, V> method30188(final Iterable<K> iterable, final Iterable<V> iterable2) {
        return method30189(iterable, iterable2, Maps.newLinkedHashMap());
    }
    
    public static <K, V> Map<K, V> method30189(final Iterable<K> iterable, final Iterable<V> iterable2, final Map<K, V> map) {
        final Iterator<V> iterator = iterable2.iterator();
        final Iterator<K> iterator2 = iterable.iterator();
        while (iterator2.hasNext()) {
            map.put(iterator2.next(), iterator.next());
        }
        if (!iterator.hasNext()) {
            return map;
        }
        throw new NoSuchElementException();
    }
}
