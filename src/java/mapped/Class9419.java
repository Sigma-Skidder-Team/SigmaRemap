// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.Map;

public class Class9419
{
    private static String[] field40408;
    private static Map<String, Long> field40409;
    
    public static boolean method35020(final String s, final long n) {
        synchronized (Class9419.field40409) {
            final long currentTimeMillis = System.currentTimeMillis();
            Long n2 = Class9419.field40409.get(s);
            if (n2 == null) {
                n2 = new Long(currentTimeMillis);
                Class9419.field40409.put(s, n2);
            }
            if (currentTimeMillis < n2 + n) {
                return false;
            }
            Class9419.field40409.put(s, new Long(currentTimeMillis));
            return true;
        }
    }
    
    static {
        Class9419.field40409 = new HashMap<String, Long>();
    }
}
