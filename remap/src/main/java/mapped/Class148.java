// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class Class148 implements Class122
{
    private static String[] field436;
    private static final Class148 field437;
    
    private Class148() {
    }
    
    @Override
    public Set<Class7915<?>> method635() {
        return (Set<Class7915<?>>)ImmutableSet.of((Object)Class6683.field26371);
    }
    
    @Override
    public boolean test(final Class7529 class7529) {
        final Float n = class7529.method23579(Class6683.field26371);
        return n == null || class7529.method23586().nextFloat() <= 1.0f / n;
    }
    
    public static Class8775 method720() {
        return () -> Class148.field437;
    }
    
    static {
        field437 = new Class148();
    }
}
