// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class7160 extends Class7133<Class6927>
{
    public Class7160(final Function<Dynamic<?>, ? extends Class6927> function) {
        super(function);
    }
    
    public Stream<Class354> method21884(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class6927 class1853, final Class354 class1854) {
        return IntStream.range(0, class1853.field27146).mapToObj(p3 -> {
            final int n2 = random2.nextInt(16) + class1855.method1074();
            final int n3 = random2.nextInt(16) + class1855.method1076();
            return new Class354(n2, class1856.method6699(Class2020.field11525, n2, n3), n3);
        });
    }
}
