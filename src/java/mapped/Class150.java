// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class Class150 implements Class122
{
    private static String[] field440;
    private final Class8172 field441;
    private final Class2065 field442;
    
    private Class150(final Class8172 field441, final Class2065 field442) {
        this.field441 = field441;
        this.field442 = field442;
    }
    
    @Override
    public Set<Class7915<?>> method635() {
        return (Set<Class7915<?>>)ImmutableSet.of((Object)Class6683.field26367, (Object)this.field442.method8153());
    }
    
    @Override
    public boolean test(final Class7529 class7529) {
        final Class399 class7530 = class7529.method23579(this.field442.method8153());
        final Class354 class7531 = class7529.method23579(Class6683.field26367);
        return this.field441.method27016(class7529.method23588(), (class7531 == null) ? null : new Class5487(class7531), class7530);
    }
    
    public static Class8775 method726(final Class2065 class2065) {
        return method727(class2065, Class5754.method17068());
    }
    
    public static Class8775 method727(final Class2065 class2065, final Class5754 class2066) {
        return () -> new Class150(class2066.method17082(), class2065);
    }
}
