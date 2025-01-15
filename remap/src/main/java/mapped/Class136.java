// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.google.common.collect.Iterables;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class Class136 extends Class126
{
    private static String[] field409;
    private final Map<Class5328, Class5772> field410;
    
    private Class136(final Class122[] array, final Map<Class5328, Class5772> map) {
        super(array);
        this.field410 = (Map<Class5328, Class5772>)ImmutableMap.copyOf((Map)map);
    }
    
    @Override
    public ItemStack method639(final ItemStack class8321, final Class7529 class8322) {
        if (class8321.method27622() == Class7739.field31612 && !this.field410.isEmpty()) {
            final Random method23586 = class8322.method23586();
            final Map.Entry entry = (Map.Entry)Iterables.get((Iterable)this.field410.entrySet(), method23586.nextInt(this.field410.size()));
            final Class5328 class8323 = (Class5328)entry.getKey();
            int method23587 = ((Class5772)entry.getValue()).method17159(method23586);
            if (!class8323.method16453()) {
                method23587 *= 20;
            }
            Class4035.method12228(class8321, class8323, method23587);
            return class8321;
        }
        return class8321;
    }
    
    public static Class4953 method673() {
        return new Class4953();
    }
}
