// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Stream;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class7140 extends Class7139<Class6928>
{
    public Class7140(final Function<Dynamic<?>, ? extends Class6928> function) {
        super(function);
    }
    
    public Stream<Class354> method21899(final Random random, final Class6928 class6928, final Class354 t) {
        return (random.nextFloat() >= 1.0f / class6928.field27147) ? Stream.empty() : Stream.of(t);
    }
}
