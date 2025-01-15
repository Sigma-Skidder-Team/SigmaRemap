// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class Class128 extends Class126
{
    private final Class2065 field387;
    
    public Class128(final Class122[] array, final Class2065 field387) {
        super(array);
        this.field387 = field387;
    }
    
    @Override
    public Set<Class7915<?>> method635() {
        return (Set<Class7915<?>>)ImmutableSet.of((Object)this.field387.method8153());
    }
    
    @Override
    public Class8321 method639(final Class8321 class8321, final Class7529 class8322) {
        if (class8321.method27622() == Class7739.field31525) {
            final Class399 class8323 = class8322.method23579(this.field387.method8153());
            if (class8323 instanceof Class512) {
                class8321.method27658().method295("SkullOwner", Class9346.method34641(new Class51(), ((Class512)class8323).method2844()));
            }
        }
        return class8321;
    }
}
