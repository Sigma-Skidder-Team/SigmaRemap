// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Deque;

public class Class9562
{
    private static String[] field41149;
    private static Deque<Class7237<Object>> field41150;
    
    public static Iterator<Object> method35781(final List list) {
        synchronized (Class9562.field41150) {
            Class7237 class7237 = Class9562.field41150.pollFirst();
            if (class7237 == null) {
                class7237 = new Class7238();
            }
            class7237.method22141(list);
            return class7237;
        }
    }
    
    private static void method35782(final Class7237<Object> class7237) {
        synchronized (Class9562.field41150) {
            if (Class9562.field41150.size() <= 1000) {
                class7237.method22141(null);
                Class9562.field41150.addLast(class7237);
            }
        }
    }
    
    static {
        Class9562.field41150 = new ArrayDeque<Class7237<Object>>();
        for (int i = 0; i < 1000; ++i) {
            Class9562.field41150.add(new Class7238());
        }
    }
}
