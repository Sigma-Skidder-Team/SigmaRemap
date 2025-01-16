// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;

import java.util.function.Function;

public class Class4547 extends Class4535<Class5126>
{
    public Class4547(final Function<Dynamic<?>, ? extends Class5126> function) {
        super(function);
    }
    
    public boolean method13558(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5126 class1854) {
        if (class1851.getBlockState(class1853).getBlock() == class1854.field22077.getBlock()) {
            class1851.setBlockState(class1853, class1854.field22078, 2);
        }
        return true;
    }
}
