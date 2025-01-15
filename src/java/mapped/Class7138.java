// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class7138 extends Class7133<Class6928>
{
    public Class7138(final Function<Dynamic<?>, ? extends Class6928> function) {
        super(function);
    }
    
    public Stream<Class354> method21892(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class6928 class1853, final Class354 class1854) {
        return IntStream.range(0, class1853.field27147).mapToObj(p3 -> new Class354(random2.nextInt(16) + class1855.method1074(), random2.nextInt(class1856.method18867()), random2.nextInt(16) + class1855.method1076()));
    }
}
