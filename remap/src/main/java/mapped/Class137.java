// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class Class137 extends Class126
{
    private final Class3833 field411;
    private final Set<Class7111<?>> field412;
    
    private Class137(final Class122[] array, final Class3833 field411, final Set<Class7111<?>> field412) {
        super(array);
        this.field411 = field411;
        this.field412 = field412;
    }
    
    @Override
    public Set<Class7915<?>> method635() {
        return (Set<Class7915<?>>)ImmutableSet.of((Object)Class6683.field26368);
    }
    
    @Override
    public ItemStack method639(final ItemStack class8321, final Class7529 class8322) {
        final Class7096 class8323 = class8322.method23579(Class6683.field26368);
        if (class8323 != null) {
            final Class51 method27658 = class8321.method27658();
            if (!method27658.method316("BlockStateTag", 10)) {
                final Class51 method27659 = new Class51();
                method27658.method295("BlockStateTag", method27659);
            }
            else {
                final Class51 method27659 = method27658.method327("BlockStateTag");
            }
            this.field412.stream().filter((Predicate<? super Object>)class8323::method21771).forEach(class8326 -> class8324.method306(class8326.method21826(), method676(class8325, (Class7111<Comparable>)class8326)));
        }
        return class8321;
    }
    
    public static Class4957 method675(final Class3833 class3833) {
        return new Class4957(class3833, null);
    }
    
    private static <T extends Comparable<T>> String method676(final Class7096 class7096, final Class7111<T> class7097) {
        return class7097.method21831(class7096.method21772(class7097));
    }
}
