// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Set;

public class Class9279
{
    private static String[] field39813;
    
    public static boolean method34252(final Set set, final Set set2) {
        return !method34253(set, set2);
    }
    
    public static boolean method34253(Set set, Set set2) {
        if (!set.isEmpty() && !set2.isEmpty()) {
            if (set2.size() < set.size()) {
                final Set set3 = set;
                set = set2;
                set2 = set3;
            }
            final Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                if (!set2.contains(iterator.next())) {
                    continue;
                }
                return true;
            }
            return false;
        }
        return false;
    }
}
