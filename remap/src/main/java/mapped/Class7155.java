// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class7155 extends Class7133<Class6935>
{
    public Class7155(final Function<Dynamic<?>, ? extends Class6935> function) {
        super(function);
    }
    
    public Stream<BlockPos> method21893(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class6935 class1853, final BlockPos class1854) {
        return IntStream.range(0, class1853.field27165).filter(p2 -> random2.nextFloat() < class1855.field27166).mapToObj(p3 -> {
            final int n3 = random3.nextInt(16) + class1856.method1074();
            final int n4 = random3.nextInt(16) + class1856.method1076();
            return new BlockPos(n3, class1857.method6699(Class2020.field11525, n3, n4), n4);
        });
    }
}