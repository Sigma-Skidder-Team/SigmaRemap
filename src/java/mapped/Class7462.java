// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class7462
{
    private static String[] field28814;
    private static final List<Class7359> field28815;
    private static boolean field28816;
    
    public static void method22986(final Class7359 class7359) {
        if (Class7462.field28816) {
            class7359.method22603();
        }
        else {
            Class7462.field28815.add(class7359);
        }
    }
    
    public static void method22987() {
        if (!Class7462.field28816) {
            final Iterator<Class7359> iterator = Class7462.field28815.iterator();
            while (iterator.hasNext()) {
                iterator.next().method22603();
            }
            Class7462.field28816 = true;
        }
    }
    
    static {
        field28815 = Collections.synchronizedList(new ArrayList<Class7359>());
        Class7462.field28816 = false;
    }
}
