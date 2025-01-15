// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.Direction;

import java.util.function.Function;

public class Class4607 extends Class4535<Class5122>
{
    public Class4607(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
    }
    
    public boolean method13535(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5122 class1854) {
        if (!class1851.method6961(class1853)) {
            return false;
        }
        if (class1851.method6701(class1853.method1137()).method21696() == Class7521.field29338) {
            class1851.method6688(class1853, Class7521.field29340.method11878(), 2);
            for (int i = 0; i < 1500; ++i) {
                final BlockPos method1134 = class1853.method1134(random.nextInt(8) - random.nextInt(8), -random.nextInt(12), random.nextInt(8) - random.nextInt(8));
                if (class1851.method6701(method1134).method21706()) {
                    int n = 0;
                    final Direction[] values = Direction.values();
                    for (int length = values.length, j = 0; j < length; ++j) {
                        if (class1851.method6701(method1134.method1149(values[j])).method21696() == Class7521.field29340) {
                            ++n;
                        }
                        if (n > 1) {
                            break;
                        }
                    }
                    if (n == 1) {
                        class1851.method6688(method1134, Class7521.field29340.method11878(), 2);
                    }
                }
            }
            return true;
        }
        return false;
    }
}
