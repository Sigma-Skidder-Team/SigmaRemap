// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4567 extends Class4535<Class5120>
{
    private final Class3833 field20041;
    
    public Class4567(final Function<Dynamic<?>, ? extends Class5120> function) {
        super(function);
        this.field20041 = Class7521.field29548;
    }
    
    public boolean method13575(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, BlockPos method1139, final Class5120 class1853) {
        while (class1851.method6961(method1139) && method1139.getY() > 2) {
            method1139 = method1139.method1139();
        }
        if (class1851.method6701(method1139).method21696() == Class7521.field29331) {
            for (int n = random.nextInt(class1853.field22069) + 2, i = method1139.getX() - n; i <= method1139.getX() + n; ++i) {
                for (int j = method1139.getZ() - n; j <= method1139.getZ() + n; ++j) {
                    final int n2 = i - method1139.getX();
                    final int n3 = j - method1139.getZ();
                    if (n2 * n2 + n3 * n3 <= n * n) {
                        for (int k = method1139.getY() - 1; k <= method1139.getY() + 1; ++k) {
                            final BlockPos class1854 = new BlockPos(i, k, j);
                            final Class3833 method1140 = class1851.method6701(class1854).method21696();
                            if (!Class4535.method13533(method1140)) {
                                if (method1140 != Class7521.field29331) {
                                    if (method1140 != Class7521.field29330) {
                                        continue;
                                    }
                                }
                            }
                            class1851.method6688(class1854, this.field20041.method11878(), 2);
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
