// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public abstract class Class4572<U extends Class5113> extends Class4535<U>
{
    public Class4572(final Function<Dynamic<?>, ? extends U> function) {
        super(function);
    }
    
    @Override
    public boolean method13525(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final U u) {
        final BlockState method13583 = this.method13583(random, class1853, u);
        int n = 0;
        for (int i = 0; i < this.method13581(u); ++i) {
            final BlockPos method13584 = this.method13582(random, class1853, u);
            if (class1851.method6961(method13584)) {
                if (method13584.getY() < 255) {
                    if (method13583.method21752(class1851, method13584)) {
                        if (this.method13580(class1851, method13584, u)) {
                            class1851.method6688(method13584, method13583, 2);
                            ++n;
                        }
                    }
                }
            }
        }
        return n > 0;
    }
    
    public abstract boolean method13580(final Class1851 p0, final BlockPos p1, final U p2);
    
    public abstract int method13581(final U p0);
    
    public abstract BlockPos method13582(final Random p0, final BlockPos p1, final U p2);
    
    public abstract BlockState method13583(final Random p0, final BlockPos p1, final U p2);
}
