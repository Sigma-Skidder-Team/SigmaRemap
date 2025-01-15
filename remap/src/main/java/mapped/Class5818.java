// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import java.util.List;

public final class Class5818 implements Class5817
{
    public boolean field23902;
    
    @Override
    public void method17510() {
        this.field23902 = false;
    }
    
    @Override
    public boolean method17511(final Class1795 class1795, final int n, final Class4517 class1796, final BlockPos class1797, final List<Class4473> list, final Random random) {
        final Class2052 method32856 = class1796.field19919.method32856();
        final int n2 = random.nextInt(4) + 1;
        Class4517 class1798 = Class7699.method24517(list, Class7699.method24516(class1795, class1796, new BlockPos(0, 0, -4), "bridge_piece", method32856, true));
        class1798.field19853 = -1;
        int n3 = 0;
        for (int i = 0; i < n2; ++i) {
            if (!random.nextBoolean()) {
                if (!random.nextBoolean()) {
                    class1798 = Class7699.method24517(list, Class7699.method24516(class1795, class1798, new BlockPos(0, n3, -8), "bridge_gentle_stairs", method32856, true));
                }
                else {
                    class1798 = Class7699.method24517(list, Class7699.method24516(class1795, class1798, new BlockPos(0, n3, -4), "bridge_steep_stairs", method32856, true));
                }
                n3 = 4;
            }
            else {
                class1798 = Class7699.method24517(list, Class7699.method24516(class1795, class1798, new BlockPos(0, n3, -4), "bridge_piece", method32856, true));
                n3 = 0;
            }
        }
        if (!this.field23902 && random.nextInt(10 - n) == 0) {
            Class7699.method24517(list, Class7699.method24516(class1795, class1798, new BlockPos(-8 + random.nextInt(8), n3, -70 + random.nextInt(10)), "ship", method32856, true));
            this.field23902 = true;
        }
        else if (!Class7699.method24519(class1795, Class7699.method24523(), n + 1, class1798, new BlockPos(-3, n3 + 1, -11), list, random)) {
            return false;
        }
        Class7699.method24517(list, Class7699.method24516(class1795, class1798, new BlockPos(4, n3, 0), "bridge_end", method32856.method8141(Class2052.field11709), true)).field19853 = -1;
        return true;
    }
}
