// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.item.ItemStack;
import net.minecraft.util.INameable;

import java.util.Set;

public class Class144 extends Class126
{
    private static String[] field426;
    private final Class284 field427;
    
    private Class144(final Class122[] array, final Class284 field427) {
        super(array);
        this.field427 = field427;
    }
    
    @Override
    public Set<Class7915<?>> method635() {
        return (Set<Class7915<?>>)ImmutableSet.of((Object)this.field427.field1570);
    }
    
    @Override
    public ItemStack method639(final ItemStack class8321, final Class7529 class8322) {
        final INameable method23579 = class8322.method23579(this.field427.field1570);
        if (method23579 instanceof INameable) {
            final INameable class8323 = method23579;
            if (class8323.hasCustomName()) {
                class8321.method27665(class8323.getDisplayName());
            }
        }
        return class8321;
    }
    
    public static Class4943<?> method699(final Class284 class284) {
        return Class126.method640(array2 -> new Class144(array2, class285));
    }
}
