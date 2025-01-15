// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Stream;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class7169 extends Class7133<Class6936>
{
    public Class7169(final Function<Dynamic<?>, ? extends Class6936> function) {
        super(function);
    }
    
    public Stream<Class354> method21913(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class6936 class1853, final Class354 class1854) {
        final int n = random.nextInt(16) + class1854.method1074();
        final int n2 = random.nextInt(16) + class1854.method1076();
        return Stream.of(new Class354(n, class1851.method6699(Class2020.field11523, n, n2), n2));
    }
}
