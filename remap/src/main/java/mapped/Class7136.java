// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class7136 extends Class7133<Class6927>
{
    public Class7136(final Function<Dynamic<?>, ? extends Class6927> function) {
        super(function);
    }
    
    public Stream<BlockPos> method21884(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class6927 class1853, final BlockPos class1854) {
        return IntStream.range(0, class1853.field27146).mapToObj(p3 -> {
            final int n2 = random2.nextInt(16) + class1855.method1074();
            final int n3 = random2.nextInt(16) + class1855.method1076();
            final int bound = class1856.method6699(Class2020.field11525, n2, n3) + 32;
            Object o2 = null;
            if (bound > 0) {
                new(BlockPos.class)();
                new BlockPos(n2, random2.nextInt(bound), n3);
            }
            else {
                o2 = null;
            }
            return o2;
        }).filter(Objects::nonNull);
    }
}
