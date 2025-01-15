// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class7168 extends Class7133<Class6931>
{
    public Class7168(final Function<Dynamic<?>, ? extends Class6931> function) {
        super(function);
    }
    
    public Stream<BlockPos> method21930(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class6931 class1853, final BlockPos class1854) {
        return IntStream.range(0, (int)Math.ceil((Class3090.field15442.method29027(class1854.getX() / class1853.field27155, class1854.getZ() / class1853.field27155, false) + class1853.field27156) * class1853.field27154)).mapToObj(p4 -> {
            final int n2 = random2.nextInt(16) + class1855.method1074();
            final int n3 = random2.nextInt(16) + class1855.method1076();
            return new BlockPos(n2, class1856.method6699(class1857.field27157, n2, n3), n3);
        });
    }
}
