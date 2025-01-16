// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;

import java.util.function.Function;

public class Class7144 extends Class7139<Class6937>
{
    public Class7144(final Function<Dynamic<?>, ? extends Class6937> function) {
        super(function);
    }
    
    public Stream<BlockPos> method21906(final Random random, final Class6937 class6937, final BlockPos class6938) {
        return IntStream.range(0, class6937.field27168).mapToObj(p3 -> new BlockPos(random2.nextInt(16) + class6939.method1074(), random2.nextInt(class6940.field27171 - class6940.field27170) + class6940.field27169, random2.nextInt(16) + class6939.method1076()));
    }
}
