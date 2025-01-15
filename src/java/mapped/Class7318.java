// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.BiConsumer;
import java.util.Optional;
import java.util.function.BiFunction;

public interface Class7318
{
    public static final Class7318 field28308 = new Class7319();
    
    default Class7318 method22434(final Class1847 class1847, final Class354 class1848) {
        return new Class7320(class1847, class1848);
    }
    
     <T> Optional<T> method22435(final BiFunction<Class1847, Class354, T> p0);
    
    default <T> T method22436(final BiFunction<Class1847, Class354, T> biFunction, final T other) {
        return this.method22435(biFunction).orElse(other);
    }
    
    default void method22437(final BiConsumer<Class1847, Class354> biConsumer) {
        this.method22435((class1848, class1850) -> {
            biConsumer2.accept(class1848, class1850);
            return Optional.empty();
        });
    }
}
