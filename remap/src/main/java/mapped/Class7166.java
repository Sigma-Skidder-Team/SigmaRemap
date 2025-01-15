// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Stream;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class7166 extends Class7133<Class6928>
{
    public Class7166(final Function<Dynamic<?>, ? extends Class6928> function) {
        super(function);
    }
    
    public Stream<BlockPos> method21892(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class6928 class1853, final BlockPos class1854) {
        if (random.nextInt(class1853.field27147 / 10) == 0) {
            final int n = random.nextInt(16) + class1854.getX();
            final int n2 = random.nextInt(16) + class1854.getZ();
            final int nextInt = random.nextInt(random.nextInt(class1852.method18867() - 8) + 8);
            if (nextInt < class1851.method6743() || random.nextInt(class1853.field27147 / 8) == 0) {
                return Stream.of(new BlockPos(n, nextInt, n2));
            }
        }
        return Stream.empty();
    }
}
