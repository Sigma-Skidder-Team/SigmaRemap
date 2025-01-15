// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

public class Class5017 extends Class5009
{
    @Override
    public String method15225() {
        return "pps";
    }
    
    @Override
    public String method15226() {
        return "Shows the packets per second of online players";
    }
    
    @Override
    public String method15230() {
        return "pps";
    }
    
    @Override
    public boolean method15227(final Class7671 class7671, final String[] array) {
        final HashMap m = new HashMap();
        int n = 0;
        int n2 = 0;
        long method18229 = 0L;
        for (final Class7671 class7672 : Class8563.method28793().method34751()) {
            final int method18231 = Class8563.method28791().method31739(class7672.method24352());
            if (!m.containsKey(method18231)) {
                m.put(method18231, new HashSet());
            }
            final Class6108 method18232 = Class8563.method28794().method33555(class7672.method24352());
            if (method18232 != null) {
                if (method18232.method18229() > -1L) {
                    ((Set)m.get(method18231)).add(class7672.method24353() + " (" + method18232.method18229() + " PPS)");
                    n += (int)method18232.method18229();
                    if (method18232.method18229() > method18229) {
                        method18229 = method18232.method18229();
                    }
                    ++n2;
                }
            }
        }
        final TreeMap treeMap = new TreeMap(m);
        this.method15234(class7671, "&4Live Packets Per Second", new Object[0]);
        if (n2 > 1) {
            this.method15234(class7671, "&cAverage: &f" + n / n2, new Object[0]);
            this.method15234(class7671, "&cHighest: &f" + method18229, new Object[0]);
        }
        if (n2 == 0) {
            this.method15234(class7671, "&cNo clients to display.", new Object[0]);
        }
        for (final Map.Entry<Integer, V> entry : treeMap.entrySet()) {
            this.method15234(class7671, "&8[&6%s&8]: &b%s", Class7906.method25609(entry.getKey()).method25614(), entry.getValue());
        }
        treeMap.clear();
        return true;
    }
}
