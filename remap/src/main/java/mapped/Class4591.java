// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;

import java.util.function.Function;

public class Class4591 extends Class4535<Class5121>
{
    public Class4591(final Function<Dynamic<?>, ? extends Class5121> function) {
        super(function);
    }
    
    public boolean method13607(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5121 class1854) {
        for (int n = random.nextInt(5) - 3 + class1854.field22071, i = 0; i < n; ++i) {
            class1854.field22070.get(random.nextInt(class1854.field22070.size())).method28613(class1851, class1852, random, class1853);
        }
        return true;
    }
}
