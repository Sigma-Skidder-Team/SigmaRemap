// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class Class9461
{
    private static String[] field40671;
    private static final Map<Long, String> field40672;
    
    public static String method35164(final long l) {
        return Class9461.field40672.get(l);
    }
    
    public static void method35165(final long l) {
        Class9461.field40672.remove(l);
    }
    
    public static void method35166(final long l, final String s) {
        Class9461.field40672.put(l, s);
    }
    
    static {
        field40672 = Maps.newHashMap();
    }
}
