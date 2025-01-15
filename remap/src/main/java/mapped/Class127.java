// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import java.util.UUID;
import java.util.Collection;
import com.google.common.collect.ImmutableList;
import net.minecraft.item.ItemStack;

import java.util.List;

public class Class127 extends Class126
{
    private static String[] field385;
    private final List<Class7376> field386;
    
    private Class127(final Class122[] array, final List<Class7376> list) {
        super(array);
        this.field386 = (List<Class7376>)ImmutableList.copyOf((Collection)list);
    }
    
    @Override
    public ItemStack method639(final ItemStack class8321, final Class7529 class8322) {
        final Random method23586 = class8322.method23586();
        for (final Class7376 class8323 : this.field386) {
            UUID uuid = Class7376.method22646(class8323);
            if (uuid == null) {
                uuid = UUID.randomUUID();
            }
            class8321.method27683(Class7376.method22648(class8323), new Class7919(uuid, Class7376.method22649(class8323), Class7376.method22650(class8323).method17169(method23586), Class7376.method22651(class8323)), Class7376.method22647(class8323)[method23586.nextInt(Class7376.method22647(class8323).length)]);
        }
        return class8321;
    }
}
