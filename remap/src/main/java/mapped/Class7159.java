// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Stream;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class7159 extends Class7133<Class6936>
{
    public Class7159(final Function<Dynamic<?>, ? extends Class6936> function) {
        super(function);
    }
    
    public Stream<BlockPos> method21913(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class6936 class1853, final BlockPos class1854) {
        if (random.nextInt(700) == 0) {
            final int n = random.nextInt(16) + class1854.getX();
            final int n2 = random.nextInt(16) + class1854.getZ();
            final int method6699 = class1851.method6699(Class2020.field11525, n, n2);
            if (method6699 > 0) {
                return Stream.of(new BlockPos(n, method6699 + 3 + random.nextInt(7), n2));
            }
        }
        return Stream.empty();
    }
}
