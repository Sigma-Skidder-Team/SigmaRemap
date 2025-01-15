// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class7164 extends Class7133<Class6927>
{
    public Class7164(final Function<Dynamic<?>, ? extends Class6927> function) {
        super(function);
    }
    
    public Stream<BlockPos> method21884(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class6927 class1853, final BlockPos class1854) {
        return IntStream.range(0, class1853.field27146).mapToObj(p3 -> {
            final Object o = class1855.method6743() / 2 + 1;
            return new BlockPos(random2.nextInt(16) + class1856.method1074(), n2 - 5 + random2.nextInt(10), random2.nextInt(16) + class1856.method1076());
        });
    }
}
