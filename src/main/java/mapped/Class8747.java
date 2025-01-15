// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.Map;

public class Class8747
{
    private static String[] field36730;
    private static final Map<Integer, Integer> field36731;
    
    public static int method30239(final int i) {
        final Integer n = Class8747.field36731.get(i);
        return (n == null) ? i : n;
    }
    
    public static boolean method30240(final int i) {
        return Class8747.field36731.containsKey(i);
    }
    
    private static void method30241(final int i, final int j) {
        Class8747.field36731.put(i, j);
    }
    
    static {
        field36731 = new HashMap<Integer, Integer>();
        method30241(1005, 1010);
        method30241(1003, 1005);
        method30241(1006, 1011);
        method30241(1004, 1009);
        method30241(1007, 1015);
        method30241(1008, 1016);
        method30241(1009, 1016);
        method30241(1010, 1019);
        method30241(1011, 1020);
        method30241(1012, 1021);
        method30241(1014, 1024);
        method30241(1015, 1025);
        method30241(1016, 1026);
        method30241(1017, 1027);
        method30241(1020, 1029);
        method30241(1021, 1030);
        method30241(1022, 1031);
    }
}
