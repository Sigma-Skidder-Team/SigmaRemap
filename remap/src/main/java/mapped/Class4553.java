// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4553 extends Class4535<Class5123>
{
    public Class4553(final Function<Dynamic<?>, ? extends Class5123> function) {
        super(function);
    }
    
    public boolean method13564(final Class1851 class1851, final Class6346<?> class1852, final Random random, final BlockPos class1853, final Class5123 class1854) {
        int n = 0;
        for (int i = 0; i < class1854.field22073; ++i) {
            final int n2 = random.nextInt(8) - random.nextInt(8);
            final int n3 = random.nextInt(8) - random.nextInt(8);
            final BlockPos class1855 = new BlockPos(class1853.getX() + n2, class1851.method6699(Class2020.field11524, class1853.getX() + n2, class1853.getZ() + n3), class1853.getZ() + n3);
            final BlockState class1856 = ((StateHolder<O, BlockState>)Class7521.field29757.getDefaultState()).with((IProperty<Comparable>)Class3889.field17551, random.nextInt(4) + 1);
            if (class1851.getBlockState(class1855).getBlock() == Class7521.field29173) {
                if (class1856.method21752(class1851, class1855)) {
                    class1851.setBlockState(class1855, class1856, 2);
                    ++n;
                }
            }
        }
        return n > 0;
    }
}
