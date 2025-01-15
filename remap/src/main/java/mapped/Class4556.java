// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.Direction;

import java.util.function.Function;

public abstract class Class4556 extends Class4535<Class5137>
{
    public Class4556(final Function<Dynamic<?>, ? extends Class5137> function) {
        super(function);
    }
    
    public void method13565(final Class1851 class1851, final Random random, final BlockPos class1852, final Class5137 class1853, final int n, final Mutable class1854) {
        for (int i = 0; i < n; ++i) {
            class1854.method1287(class1852).method1291(Direction.UP, i);
            if (!class1851.method6701(class1854).method21722(class1851, class1854)) {
                this.method13529(class1851, class1854, class1853.field22117.method1164(random, class1852));
            }
        }
    }
    
    public int method13566(final Random random) {
        int n = random.nextInt(3) + 4;
        if (random.nextInt(12) == 0) {
            n *= 2;
        }
        return n;
    }
    
    public boolean method13567(final Class1851 class1851, final BlockPos class1852, final int n, final Mutable class1853, final Class5137 class1854) {
        final int method1075 = class1852.getY();
        if (method1075 < 1 || method1075 + n + 1 >= 256) {
            return false;
        }
        if (Class4535.method13533(class1851.method6701(class1852.method1139()).method21696())) {
            for (int i = 0; i <= n; ++i) {
                for (int method1076 = this.method13569(-1, -1, class1854.field22118, i), j = -method1076; j <= method1076; ++j) {
                    for (int k = -method1076; k <= method1076; ++k) {
                        final BlockState method1077 = class1851.method6701(class1853.method1287(class1852).method1292(j, i, k));
                        if (!method1077.method21706() && !method1077.method21755(Class7188.field27907)) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public boolean method13568(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5137 class1854) {
        final int method13566 = this.method13566(random);
        final Mutable class1855 = new Mutable();
        if (this.method13567(class1851, class1853, method13566, class1855, class1854)) {
            this.method13570(class1851, random, class1853, method13566, class1855, class1854);
            this.method13565(class1851, random, class1853, class1854, method13566, class1855);
            return true;
        }
        return false;
    }
    
    public abstract int method13569(final int p0, final int p1, final int p2, final int p3);
    
    public abstract void method13570(final Class1851 p0, final Random p1, final BlockPos p2, final int p3, final Mutable p4, final Class5137 p5);
}
