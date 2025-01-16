// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;

import java.util.function.Function;

public class Class4548 extends Class4535<Class5140>
{
    public Class4548(final Function<Dynamic<?>, ? extends Class5140> function) {
        super(function);
    }
    
    public boolean method13559(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5140 class1854) {
        final Mutable class1855 = new Mutable();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                class1855.setPos(class1853.getX() + i, class1854.field22125, class1853.getZ() + j);
                if (class1851.getBlockState(class1855).method21706()) {
                    class1851.setBlockState(class1855, class1854.field22126, 2);
                }
            }
        }
        return true;
    }
}
