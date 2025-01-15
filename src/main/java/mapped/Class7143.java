// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class7143 extends Class7139<Class6936>
{
    public Class7143(final Function<Dynamic<?>, ? extends Class6936> function) {
        super(function);
    }
    
    public Stream<Class354> method21904(final Random random, final Class6936 class6936, final Class354 class6937) {
        return IntStream.range(0, 3 + random.nextInt(6)).mapToObj(p2 -> new Class354(random2.nextInt(16) + class6938.method1074(), random2.nextInt(28) + 4, random2.nextInt(16) + class6938.method1076()));
    }
}
