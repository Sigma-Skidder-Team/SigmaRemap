// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Comparator;
import java.util.TreeMap;

public class Class5010 extends Class5009
{
    @Override
    public String method15225() {
        return "list";
    }
    
    @Override
    public String method15226() {
        return "Shows lists of the versions from logged in players";
    }
    
    @Override
    public String method15230() {
        return "list";
    }
    
    @Override
    public boolean method15227(final Class7671 class7671, final String[] array) {
        final TreeMap treeMap = new TreeMap(new Class4457(this));
        for (final Class7671 class7672 : Class8563.method28793().method34751()) {
            final Class7906 method34752 = Class7906.method25609(Class8563.method28791().method31739(class7672.method24352()));
            if (!treeMap.containsKey(method34752)) {
                treeMap.put(method34752, new HashSet());
            }
            ((Set)treeMap.get(method34752)).add(class7672.method24353());
        }
        for (final Map.Entry<Class7906, V> entry : treeMap.entrySet()) {
            this.method15234(class7671, "&8[&6%s&8] (&7%d&8): &b%s", entry.getKey().method25614(), ((Set)entry.getValue()).size(), entry.getValue());
        }
        treeMap.clear();
        return true;
    }
}
