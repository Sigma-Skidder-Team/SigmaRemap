// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import java.util.List;

public final class Class5816 implements Class5817
{
    @Override
    public void method17510() {
    }
    
    @Override
    public boolean method17511(final Class1795 class1795, final int n, final Class4517 class1796, final Class354 class1797, final List<Class4473> list, final Random random) {
        if (n <= 8) {
            final Class2052 method32856 = class1796.field19919.method32856();
            final Class4517 method32857 = Class7699.method24517(list, Class7699.method24516(class1795, class1796, class1797, "base_floor", method32856, true));
            final int nextInt = random.nextInt(3);
            if (nextInt != 0) {
                if (nextInt != 1) {
                    if (nextInt == 2) {
                        Class7699.method24519(class1795, Class7699.method24518(), n + 1, Class7699.method24517(list, Class7699.method24516(class1795, Class7699.method24517(list, Class7699.method24516(class1795, Class7699.method24517(list, Class7699.method24516(class1795, method32857, new Class354(-1, 0, -1), "second_floor_2", method32856, false)), new Class354(-1, 4, -1), "third_floor_2", method32856, false)), new Class354(-1, 8, -1), "third_roof", method32856, true)), null, list, random);
                    }
                }
                else {
                    Class7699.method24519(class1795, Class7699.method24518(), n + 1, Class7699.method24517(list, Class7699.method24516(class1795, Class7699.method24517(list, Class7699.method24516(class1795, method32857, new Class354(-1, 0, -1), "second_floor_2", method32856, false)), new Class354(-1, 8, -1), "second_roof", method32856, false)), null, list, random);
                }
            }
            else {
                Class7699.method24517(list, Class7699.method24516(class1795, method32857, new Class354(-1, 4, -1), "base_roof", method32856, true));
            }
            return true;
        }
        return false;
    }
}
