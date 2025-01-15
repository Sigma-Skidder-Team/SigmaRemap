// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Stream;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class7147 extends Class7139<Class6936>
{
    public Class7147(final Function<Dynamic<?>, ? extends Class6936> function) {
        super(function);
    }
    
    public Stream<Class354> method21904(final Random random, final Class6936 class6936, final Class354 class6937) {
        final Stream<Object> empty = (Stream<Object>)Stream.empty();
        if (random.nextInt(14) != 0) {
            return Stream.empty();
        }
        Stream<Object> a = Stream.concat((Stream<?>)empty, (Stream<?>)Stream.of(class6937.method1134(random.nextInt(16), 55 + random.nextInt(16), random.nextInt(16))));
        if (random.nextInt(4) == 0) {
            a = Stream.concat((Stream<?>)a, (Stream<?>)Stream.of(class6937.method1134(random.nextInt(16), 55 + random.nextInt(16), random.nextInt(16))));
        }
        return (Stream<Class354>)a;
    }
}
