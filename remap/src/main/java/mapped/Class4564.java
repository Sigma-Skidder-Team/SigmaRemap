// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;

import java.util.function.Function;

public class Class4564 extends Class4535<Class5122>
{
    public Class4564(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
    }
    
    public boolean method13535(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5122 class1854) {
        if (class1851.method6961(class1853.method1137()) && class1851.getBlockState(class1853).getBlock() == Blocks.field29403) {
            Class4031.method12223(class1851, class1853.method1137(), random, 8);
            return true;
        }
        return false;
    }
}
