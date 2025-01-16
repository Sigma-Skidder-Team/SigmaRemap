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

public class Class7157 extends Class7133<Class6932>
{
    public Class7157(final Function<Dynamic<?>, ? extends Class6932> function) {
        super(function);
    }
    
    public Stream<BlockPos> method21918(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class6932 class1853, final BlockPos class1854) {
        return IntStream.range(0, random.nextInt(class1853.field27159 - class1853.field27158) + class1853.field27158).mapToObj(p3 -> {
            final int n2 = random2.nextInt(16) + class1855.method1074();
            final int n3 = random2.nextInt(16) + class1855.method1076();
            return new BlockPos(n2, class1856.method6699(HeightmapType.field11523, n2, n3), n3);
        });
    }
}
