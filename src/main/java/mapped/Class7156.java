// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class7156 extends Class7133<Class6927>
{
    public Class7156(final Function<Dynamic<?>, ? extends Class6927> function) {
        super(function);
    }
    
    public Stream<Class354> method21884(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class6927 class1853, final Class354 class1854) {
        return IntStream.range(0, class1853.field27146).mapToObj(p2 -> new Class354(random2.nextInt(16) + class1855.method1074(), 64, random2.nextInt(16) + class1855.method1076()));
    }
}
