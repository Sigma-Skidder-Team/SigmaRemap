// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;

import java.util.function.Function;

public class Class4543 extends Class4535<Class5145>
{
    public Class4543(final Function<Dynamic<?>, ? extends Class5145> function) {
        super(function);
    }
    
    public boolean method13541(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5145 class1854) {
        for (final Class9337 class1855 : class1854.field22144) {
            if (random.nextFloat() >= class1855.field40095) {
                continue;
            }
            return class1855.method34605(class1851, class1852, random, class1853);
        }
        return class1854.field22145.method28613(class1851, class1852, random, class1853);
    }
}
