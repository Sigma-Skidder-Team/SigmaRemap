// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Stream;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;

import java.util.function.Function;

public class Class7146 extends Class7139<Class6936>
{
    public Class7146(final Function<Dynamic<?>, ? extends Class6936> function) {
        super(function);
    }
    
    public Stream<BlockPos> method21904(final Random random, final Class6936 class6936, final BlockPos t) {
        return Stream.of(t);
    }
}
