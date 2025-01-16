// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;

import java.util.function.Function;

public class Class4569 extends Class4535<Class5112>
{
    public Class4569(final Function<Dynamic<?>, ? extends Class5112> function) {
        super(function);
    }
    
    public boolean method13577(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5112 class1854) {
        if (class1853.getY() >= 5) {
            final int n = 2 + random.nextInt(2);
            final int n2 = 2 + random.nextInt(2);
            for (final BlockPos class1855 : BlockPos.getAllInBoxMutable(class1853.add(-n, 0, -n2), class1853.add(n, 1, n2))) {
                final int n3 = class1853.getX() - class1855.getX();
                final int n4 = class1853.getZ() - class1855.getZ();
                if (n3 * n3 + n4 * n4 > random.nextFloat() * 10.0f - random.nextFloat() * 6.0f) {
                    if (random.nextFloat() >= 0.031) {
                        continue;
                    }
                    this.method13579(class1851, class1855, random, class1854);
                }
                else {
                    this.method13579(class1851, class1855, random, class1854);
                }
            }
            return true;
        }
        return false;
    }
    
    private boolean method13578(final Class1851 class1851, final BlockPos class1852, final Random random) {
        final BlockPos method1139 = class1852.method1139();
        final BlockState method1140 = class1851.getBlockState(method1139);
        return (method1140.getBlock() != Blocks.GRASS_PATH) ? method1140.isSolidSide(class1851, method1139, Direction.UP) : random.nextBoolean();
    }
    
    private void method13579(final Class1851 class1851, final BlockPos class1852, final Random random, final Class5112 class1853) {
        if (class1851.method6961(class1852)) {
            if (this.method13578(class1851, class1852, random)) {
                class1851.setBlockState(class1852, class1853.field22058.method1164(random, class1852), 4);
            }
        }
    }
}
