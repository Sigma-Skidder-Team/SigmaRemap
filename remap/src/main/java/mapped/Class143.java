// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class143 extends Class126
{
    private static String[] field424;
    private final Class9299 field425;
    
    private Class143(final Class122[] array, final Class9299 field425) {
        super(array);
        this.field425 = field425;
    }
    
    @Override
    public ItemStack method639(final ItemStack class8321, final Class7529 class8322) {
        class8321.method27691(this.field425.applyAsInt(class8321.method27690()));
        return class8321;
    }
    
    public static Class4943<?> method696(final Class9299 class9299) {
        return Class126.method640(array2 -> new Class143(array2, class9300));
    }
}
