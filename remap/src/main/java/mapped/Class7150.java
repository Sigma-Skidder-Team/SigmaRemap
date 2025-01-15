// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Stream;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class7150 extends Class7139<Class6925>
{
    public Class7150(final Function<Dynamic<?>, ? extends Class6925> function) {
        super(function);
    }
    
    public Stream<BlockPos> method21911(final Random random, final Class6925 class6925, final BlockPos class6926) {
        if (random.nextFloat() >= class6925.field27141) {
            return Stream.empty();
        }
        return Stream.of(new BlockPos(random.nextInt(16) + class6926.getX(), random.nextInt(class6925.field27144 - class6925.field27143) + class6925.field27142, random.nextInt(16) + class6926.getZ()));
    }
}
