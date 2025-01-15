// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class Class3642 extends Class3643
{
    private static Map<Class7803<Integer, Boolean>, Integer> field16912;
    private static Set<Integer> field16913;
    
    public static Class7220 method11201() {
        final HashSet set = new HashSet();
        set.add("minecraft:grass_block");
        set.add("minecraft:podzol");
        set.add("minecraft:mycelium");
        return new Class7228(set, new Class3642());
    }
    
    @Override
    public int method11202(final Class6108 class6108, final Class8322 class6109, final int i) {
        final Integer n = Class3642.field16912.get(new Class7803(i, Class3642.field16913.contains(this.method11205(class6108, class6109.method27702(Class222.field775)))));
        if (n == null) {
            return i;
        }
        return n;
    }
    
    static {
        Class3642.field16912 = new HashMap<Class7803<Integer, Boolean>, Integer>();
        Class3642.field16913 = new HashSet<Integer>();
    }
}
