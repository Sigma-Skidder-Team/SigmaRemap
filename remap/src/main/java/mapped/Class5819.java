// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.Random;
import java.util.List;

public final class Class5819 implements Class5817
{
    @Override
    public void method17510() {
    }
    
    @Override
    public boolean method17511(final Class1795 class1795, final int n, final Class4517 class1796, final BlockPos class1797, final List<Class4473> list, final Random random) {
        final Class2052 method32856 = class1796.field19919.method32856();
        Class4517 class1798 = Class7699.method24517(list, Class7699.method24516(class1795, Class7699.method24517(list, Class7699.method24516(class1795, class1796, new BlockPos(-3, 4, -3), "fat_tower_base", method32856, true)), new BlockPos(0, 4, 0), "fat_tower_middle", method32856, true));
        for (int n2 = 0; n2 < 2 && random.nextInt(3) != 0; ++n2) {
            class1798 = Class7699.method24517(list, Class7699.method24516(class1795, class1798, new BlockPos(0, 8, 0), "fat_tower_middle", method32856, true));
            for (final Class8554 class1799 : Class7699.method24524()) {
                if (!random.nextBoolean()) {
                    continue;
                }
                Class7699.method24519(class1795, Class7699.method24521(), n + 1, Class7699.method24517(list, Class7699.method24516(class1795, class1798, (BlockPos)class1799.method28746(), "bridge_end", method32856.method8141((Class2052)class1799.method28745()), true)), null, list, random);
            }
        }
        Class7699.method24517(list, Class7699.method24516(class1795, class1798, new BlockPos(-2, 8, -2), "fat_tower_top", method32856, true));
        return true;
    }
}
