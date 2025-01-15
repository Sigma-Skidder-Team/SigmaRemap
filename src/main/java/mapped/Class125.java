// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;
import java.util.function.BiFunction;

public interface Class125 extends Class124, BiFunction<Class8321, Class7529, Class8321>
{
    default Consumer<Class8321> method637(final BiFunction<Class8321, Class7529, Class8321> biFunction, final Consumer<Class8321> consumer, final Class7529 class7529) {
        return class7531 -> consumer2.accept(biFunction2.apply(class7531, class7530));
    }
}
