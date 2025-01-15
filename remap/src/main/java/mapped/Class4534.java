// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4534 extends Class4535<Class5139>
{
    public Class4534(final Function<Dynamic<?>, ? extends Class5139> function) {
        super(function);
    }
    
    public boolean method13524(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, BlockPos class1853, final Class5139 class1854) {
        while (class1853.getY() > 3) {
            if (!class1851.method6961(class1853.method1139())) {
                final Class3833 method21696 = class1851.method6701(class1853.method1139()).method21696();
                if (Class4535.method13533(method21696)) {
                    break;
                }
                if (Class4535.method13532(method21696)) {
                    break;
                }
            }
            class1853 = class1853.method1139();
        }
        if (class1853.getY() > 3) {
            for (int field22124 = class1854.field22124, n = 0; field22124 >= 0 && n < 3; ++n) {
                final int n2 = field22124 + random.nextInt(2);
                final int n3 = field22124 + random.nextInt(2);
                final int n4 = field22124 + random.nextInt(2);
                final float n5 = (n2 + n3 + n4) * 0.333f + 0.5f;
                for (final BlockPos class1855 : BlockPos.method1154(class1853.method1134(-n2, -n3, -n4), class1853.method1134(n2, n3, n4))) {
                    if (class1855.distanceSq(class1853) > n5 * n5) {
                        continue;
                    }
                    class1851.method6688(class1855, class1854.field22123, 4);
                }
                class1853 = class1853.method1134(-(field22124 + 1) + random.nextInt(2 + field22124 * 2), 0 - random.nextInt(2), -(field22124 + 1) + random.nextInt(2 + field22124 * 2));
            }
            return true;
        }
        return false;
    }
}
