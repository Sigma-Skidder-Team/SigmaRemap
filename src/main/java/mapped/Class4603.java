// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4603 extends Class4535<Class5114>
{
    public Class4603(final Function<Dynamic<?>, ? extends Class5114> function) {
        super(function);
    }
    
    public boolean method13661(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class354 class1853, final Class5114 class1854) {
        return class1854.field22061.method33461(class1851, class1852, random, class1853, class1854.field22060);
    }
    
    @Override
    public String toString() {
        return String.format("< %s [%s] >", this.getClass().getSimpleName(), Class90.field215.method503(this));
    }
}
