// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Stream;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public abstract class Class7139<DC extends Class6926> extends Class7133<DC>
{
    public Class7139(final Function<Dynamic<?>, ? extends DC> function) {
        super(function);
    }
    
    @Override
    public final Stream<Class354> method21885(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final DC dc, final Class354 class1853) {
        return this.method21898(random, dc, class1853);
    }
    
    public abstract Stream<Class354> method21898(final Random p0, final DC p1, final Class354 p2);
}
