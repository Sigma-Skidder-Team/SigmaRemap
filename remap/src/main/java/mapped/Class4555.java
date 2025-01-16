// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;

import java.util.function.Function;

public class Class4555 extends Class4535<Class5122>
{
    public Class4555(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
    }
    
    public boolean method13535(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5122 class1854) {
        final Mutable class1855 = new Mutable();
        final Mutable class1856 = new Mutable();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                final int n = class1853.getX() + i;
                final int n2 = class1853.getZ() + j;
                class1855.setPos(n, class1851.method6699(HeightmapType.field11525, n, n2), n2);
                class1856.method1287(class1855).method1291(Direction.DOWN, 1);
                final Class3090 method6959 = class1851.method6959(class1855);
                if (method6959.method9847(class1851, class1856, false)) {
                    class1851.setBlockState(class1856, Blocks.field29330.getDefaultState(), 2);
                }
                if (method6959.method9848(class1851, class1855)) {
                    class1851.setBlockState(class1855, Blocks.field29329.getDefaultState(), 2);
                    final BlockState method6960 = class1851.getBlockState(class1856);
                    if (((StateHolder<Object, Object>)method6960).method21771((IProperty<Comparable>)Class3911.field17717)) {
                        class1851.setBlockState(class1856, ((StateHolder<Object, BlockState>)method6960).with((IProperty<Comparable>)Class3911.field17717, true), 2);
                    }
                }
            }
        }
        return true;
    }
}
