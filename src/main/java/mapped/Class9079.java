// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Collection;
import java.util.Arrays;
import java.util.HashSet;

public class Class9079
{
    private static String[] field38436;
    
    public static void method32717(final Class350[] a, final Class350[] a2) {
        final HashSet set = new HashSet();
        for (int i = 0; i < a2.length; ++i) {
            set.add(a2[i].method1070());
        }
        final HashSet set2 = new HashSet(Arrays.asList(a));
        set2.removeAll(Arrays.asList(a2));
        for (final Class350 class350 : set2) {
            if (!set.contains(class350.method1070())) {
                continue;
            }
            class350.method1062(Class8341.field34248);
        }
    }
}
