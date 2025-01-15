// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.List;

public class Class8508
{
    public static Class8321 method28422(final List<Class8321> list, final int n, final int n2) {
        if (n >= 0) {
            if (n < list.size()) {
                if (!list.get(n).method27620()) {
                    if (n2 > 0) {
                        return list.get(n).method27621(n2);
                    }
                }
            }
        }
        return Class8321.field34174;
    }
    
    public static Class8321 method28423(final List<Class8321> list, final int n) {
        return (n >= 0 && n < list.size()) ? list.set(n, Class8321.field34174) : Class8321.field34174;
    }
    
    public static Class51 method28424(final Class51 class51, final Class2265<Class8321> class52) {
        return method28425(class51, class52, true);
    }
    
    public static Class51 method28425(final Class51 class51, final Class2265<Class8321> class52, final boolean b) {
        final Class52 class53 = new Class52();
        for (int i = 0; i < class52.size(); ++i) {
            final Class8321 class54 = class52.get(i);
            if (!class54.method27620()) {
                final Class51 e = new Class51();
                e.method296("Slot", (byte)i);
                class54.method27627(e);
                ((AbstractList<Class51>)class53).add(e);
            }
        }
        if (!class53.isEmpty() || b) {
            class51.method295("Items", class53);
        }
        return class51;
    }
    
    public static void method28426(final Class51 class51, final Class2265<Class8321> class52) {
        final Class52 method328 = class51.method328("Items", 10);
        for (int i = 0; i < method328.size(); ++i) {
            final Class51 method329 = method328.method346(i);
            final int n = method329.method317("Slot") & 0xFF;
            if (n >= 0) {
                if (n < class52.size()) {
                    class52.set(n, Class8321.method27619(method329));
                }
            }
        }
    }
}
