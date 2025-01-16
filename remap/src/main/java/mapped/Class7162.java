// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class7162 extends Class7133<Class6933>
{
    public Class7162(final Function<Dynamic<?>, ? extends Class6933> function) {
        super(function);
    }
    
    public Stream<BlockPos> method21923(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class6933 class1853, final BlockPos class1854) {
        final IChunk method6965 = class1851.method6965(class1854);
        method6965.method7019();
        return (Stream<BlockPos>)IntStream.range(0, method6965.method7038(class1853.field27160).length()).filter(bitIndex -> set.get(bitIndex) && random2.nextFloat() < class1855.field27161).mapToObj(n3 -> new BlockPos(class1856.method25426() + (n3 & 0xF), n3 >> 8, class1856.method25427() + (n3 >> 4 & 0xF)));
    }
}
