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

public class Class7154 extends Class7133<Class6936>
{
    public Class7154(final Function<Dynamic<?>, ? extends Class6936> function) {
        super(function);
    }
    
    public Stream<BlockPos> method21913(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class6936 class1853, final BlockPos class1854) {
        return IntStream.range(0, random.nextInt(5)).mapToObj(p3 -> {
            final int n2 = random2.nextInt(16) + class1855.method1074();
            final int n3 = random2.nextInt(16) + class1855.method1076();
            class1856.method6699(HeightmapType.field11525, n2, n3);
            final int n4;
            if (n4 <= 0) {
                return null;
            }
            else {
                return new BlockPos(n2, n4 - 1, n3);
            }
        }).filter(Objects::nonNull);
    }
}
