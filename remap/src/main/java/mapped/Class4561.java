// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4561 extends Class4535<Class5142>
{
    public Class4561(final Function<Dynamic<?>, ? extends Class5142> function) {
        super(function);
    }
    
    public boolean method13573(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5142 class1854) {
        return random.nextBoolean() ? class1854.field22128.method28613(class1851, class1852, random, class1853) : class1854.field22129.method28613(class1851, class1852, random, class1853);
    }
}
