// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class7141 extends Class7139<Class6929>
{
    public Class7141(final Function<Dynamic<?>, ? extends Class6929> function) {
        super(function);
    }
    
    public Stream<BlockPos> method21900(final Random random, final Class6929 class6932, final BlockPos class6930) {
        return IntStream.range(0, class6932.field27148).mapToObj(p4 -> {
            final Object field27150 = class6932.field27150;
            final Object field27151 = class6932.field27149;
            return new BlockPos(random2.nextInt(16) + class6931.method1074(), random2.nextInt(n2) + random2.nextInt(n2) - n2 + n3, random2.nextInt(16) + class6931.method1076());
        });
    }
}
