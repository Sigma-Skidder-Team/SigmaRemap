// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Random;
import java.util.List;

public final class Class5820 implements Class5817
{
    @Override
    public void method17510() {
    }
    
    @Override
    public boolean method17511(final Class1795 class1795, final int n, final Class4517 class1796, final Class354 class1797, final List<Class4473> list, final Random random) {
        final Class2052 method32856 = class1796.field19919.method32856();
        Class4517 class1798 = Class7699.method24517(list, Class7699.method24516(class1795, Class7699.method24517(list, Class7699.method24516(class1795, class1796, new Class354(3 + random.nextInt(2), -3, 3 + random.nextInt(2)), "tower_base", method32856, true)), new Class354(0, 7, 0), "tower_piece", method32856, true));
        Class4517 class1799 = (random.nextInt(3) != 0) ? null : class1798;
        for (int n2 = 1 + random.nextInt(3), i = 0; i < n2; ++i) {
            class1798 = Class7699.method24517(list, Class7699.method24516(class1795, class1798, new Class354(0, 4, 0), "tower_piece", method32856, true));
            if (i < n2 - 1) {
                if (random.nextBoolean()) {
                    class1799 = class1798;
                }
            }
        }
        if (class1799 == null) {
            if (n != 7) {
                return Class7699.method24519(class1795, Class7699.method24522(), n + 1, class1798, null, list, random);
            }
            Class7699.method24517(list, Class7699.method24516(class1795, class1798, new Class354(-1, 4, -1), "tower_top", method32856, true));
        }
        else {
            for (final Class8554 class1800 : Class7699.method24520()) {
                if (!random.nextBoolean()) {
                    continue;
                }
                Class7699.method24519(class1795, Class7699.method24521(), n + 1, Class7699.method24517(list, Class7699.method24516(class1795, class1799, (Class354)class1800.method28746(), "bridge_end", method32856.method8141((Class2052)class1800.method28745()), true)), null, list, random);
            }
            Class7699.method24517(list, Class7699.method24516(class1795, class1798, new Class354(-1, 4, -1), "tower_top", method32856, true));
        }
        return true;
    }
}
