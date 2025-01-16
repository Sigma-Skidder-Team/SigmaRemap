// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;

import java.util.function.Function;

public class Class7165 extends Class7133<Class6930>
{
    public Class7165(final Function<Dynamic<?>, ? extends Class6930> function) {
        super(function);
    }
    
    public Stream<BlockPos> method21920(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class6930 class1853, final BlockPos class1854) {
        return IntStream.range(0, (Class3090.field15442.method29027(class1854.getX() / 200.0, class1854.getZ() / 200.0, false) >= class1853.field27151) ? class1853.field27153 : class1853.field27152).mapToObj(p3 -> {
            final int n2 = random2.nextInt(16) + class1855.method1074();
            final int n3 = random2.nextInt(16) + class1855.method1076();
            final int bound = class1856.method6699(HeightmapType.field11525, n2, n3) * 2;
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
