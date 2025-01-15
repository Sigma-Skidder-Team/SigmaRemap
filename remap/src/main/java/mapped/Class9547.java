// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

public class Class9547
{
    private static String[] field41112;
    
    private Class9547() {
    }
    
    public static Object[] method35710(final Object[] array) {
        final ArrayList list = new ArrayList();
        if (array != null) {
            for (final Object o : array) {
                if (!(o instanceof Object[])) {
                    list.add(o);
                }
                else {
                    final Object[] method35710 = method35710((Object[])o);
                    for (int length2 = method35710.length, j = 0; j < length2; ++j) {
                        list.add(method35710[j]);
                    }
                }
            }
        }
        return list.toArray();
    }
}
