// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;
import java.util.function.BiFunction;

public interface Class125 extends Class124, BiFunction<ItemStack, Class7529, ItemStack>
{
    default Consumer<ItemStack> method637(final BiFunction<ItemStack, Class7529, ItemStack> biFunction, final Consumer<ItemStack> consumer, final Class7529 class7529) {
        return class7531 -> consumer2.accept(biFunction2.apply(class7531, class7530));
    }
}
