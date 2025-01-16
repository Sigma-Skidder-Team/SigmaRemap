// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Stream;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;

import java.util.function.Function;

public class Class7161 extends Class7133<Class6928>
{
    public Class7161(final Function<Dynamic<?>, ? extends Class6928> function) {
        super(function);
    }
    
    public Stream<BlockPos> method21892(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class6928 class1853, final BlockPos class1854) {
        if (random.nextFloat() >= 1.0f / class1853.field27147) {
            return Stream.empty();
        }
        final int n = random.nextInt(16) + class1854.getX();
        final int n2 = random.nextInt(16) + class1854.getZ();
        final int bound = class1851.method6699(HeightmapType.field11525, n, n2) * 2;
        return (bound > 0) ? Stream.of(new BlockPos(n, random.nextInt(bound), n2)) : Stream.empty();
    }
}
