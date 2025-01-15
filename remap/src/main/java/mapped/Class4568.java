// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4568 extends Class4535<Class5134>
{
    public Class4568(final Function<Dynamic<?>, ? extends Class5134> function) {
        super(function);
    }
    
    public boolean method13576(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5134 class1854) {
        return class1854.field22110.get(random.nextInt(class1854.field22110.size())).method28613(class1851, class1852, random, class1853);
    }
}
