// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class142 extends Class126
{
    private static String[] field422;
    private final Class51 field423;
    
    private Class142(final Class122[] array, final Class51 field423) {
        super(array);
        this.field423 = field423;
    }
    
    @Override
    public ItemStack method639(final ItemStack class8321, final Class7529 class8322) {
        class8321.method27658().method338(this.field423);
        return class8321;
    }
    
    public static Class4943<?> method693(final Class51 class51) {
        return Class126.method640(array2 -> new Class142(array2, class52));
    }
}
