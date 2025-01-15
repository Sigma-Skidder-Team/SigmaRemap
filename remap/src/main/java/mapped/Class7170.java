// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class7170 extends Class7133<Class6934>
{
    public Class7170(final Function<Dynamic<?>, ? extends Class6934> function) {
        super(function);
    }
    
    public Stream<BlockPos> method21932(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class6934 class1853, final BlockPos class1854) {
        int field27162 = class1853.field27162;
        if (random.nextFloat() < class1853.field27163) {
            field27162 += class1853.field27164;
        }
        return (Stream<BlockPos>)IntStream.range(0, field27162).mapToObj(p3 -> {
            final int n2 = random2.nextInt(16) + class1855.method1074();
            final int n3 = random2.nextInt(16) + class1855.method1076();
            return new BlockPos(n2, class1856.method6699(Class2020.field11525, n2, n3), n3);
        });
    }
}
