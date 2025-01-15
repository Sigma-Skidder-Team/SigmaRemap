// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public class Class5156 implements Class5157<Class74, Map>
{
    private static String[] field22179;
    
    public Map method16105(final Class74 class74) {
        final HashMap hashMap = new HashMap();
        final Map<String, Class61> method415 = class74.method415();
        final Iterator<String> iterator = method415.keySet().iterator();
        while (iterator.hasNext()) {
            final Class61 class75 = method415.get(iterator.next());
            hashMap.put(class75.method375(), Class7185.method22026(class75));
        }
        return hashMap;
    }
    
    public Class74 method16106(final String s, final Map map) {
        final HashMap hashMap = new HashMap();
        for (final String s2 : map.keySet()) {
            hashMap.put(s2, Class7185.method22027(s2, map.get(s2)));
        }
        return new Class74(s, hashMap);
    }
}
