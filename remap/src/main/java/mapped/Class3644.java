// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;

public class Class3644 extends Class3643
{
    private static Map<Integer, Integer> field16914;
    
    public static Class7220 method11207() {
        final HashSet set = new HashSet();
        set.add("minecraft:rose_bush");
        set.add("minecraft:sunflower");
        set.add("minecraft:peony");
        set.add("minecraft:tall_grass");
        set.add("minecraft:large_fern");
        set.add("minecraft:lilac");
        return new Class7224(set, new Class3644());
    }
    
    @Override
    public int method11202(final Class6108 class6108, final Class8322 class6109, final int n) {
        final int method11205 = this.method11205(class6108, class6109.method27702(Class222.field776));
        if (Class3644.field16914.containsKey(method11205)) {
            final int method11206 = this.method11205(class6108, class6109.method27702(Class222.field775));
            if (!Class8563.method28792().method23302()) {
                if (!Class3644.field16914.containsKey(method11206)) {
                    return Class3644.field16914.get(method11205);
                }
            }
            else if (method11206 == 0) {
                return Class3644.field16914.get(method11205);
            }
        }
        return n;
    }
    
    static {
        Class3644.field16914 = new HashMap<Integer, Integer>();
    }
}
