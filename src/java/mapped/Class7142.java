// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class7142 extends Class7139<Class6927>
{
    public Class7142(final Function<Dynamic<?>, ? extends Class6927> function) {
        super(function);
    }
    
    public Stream<Class354> method21902(final Random random, final Class6927 class6927, final Class354 class6928) {
        return IntStream.range(0, random.nextInt(random.nextInt(class6927.field27146) + 1)).mapToObj(p2 -> new Class354(random2.nextInt(16) + class6929.method1074(), random2.nextInt(120) + 4, random2.nextInt(16) + class6929.method1076()));
    }
}
