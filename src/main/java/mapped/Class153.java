// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class Class153 implements Class122
{
    private static String[] field449;
    private final Class9342 field450;
    
    public Class153(final Class9342 field450) {
        this.field450 = field450;
    }
    
    @Override
    public Set<Class7915<?>> method635() {
        return (Set<Class7915<?>>)ImmutableSet.of((Object)Class6683.field26370);
    }
    
    @Override
    public boolean test(final Class7529 class7529) {
        final Class8321 class7530 = class7529.method23579(Class6683.field26370);
        return class7530 != null && this.field450.method34627(class7530);
    }
    
    public static Class8775 method736(final Class9425 class9425) {
        return () -> new Class153(class9425.method35029());
    }
}
