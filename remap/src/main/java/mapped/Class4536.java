// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.Direction;

import java.util.function.Function;

public abstract class Class4536 extends Class4535<Class5122>
{
    public Class4536(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
    }
    
    public boolean method13535(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5122 class1854) {
        return this.method13536(class1851, random, class1853, Class7188.field27921.method25620(random).method11878());
    }
    
    public abstract boolean method13536(final Class1851 p0, final Random p1, final BlockPos p2, final Class7096 p3);
    
    public boolean method13537(final Class1851 class1851, final Random random, final BlockPos class1852, final Class7096 class1853) {
        final BlockPos method1137 = class1852.method1137();
        final Class7096 method1138 = class1851.method6701(class1852);
        if (method1138.method21696() == Class7521.field29173 || method1138.method21755(Class7188.field27924)) {
            if (class1851.method6701(method1137).method21696() == Class7521.field29173) {
                class1851.method6688(class1852, class1853, 3);
                if (random.nextFloat() >= 0.25f) {
                    if (random.nextFloat() < 0.05f) {
                        class1851.method6688(method1137, ((Class7097<O, Class7096>)Class7521.field29757.method11878()).method21773((Class7111<Comparable>)Class3889.field17551, random.nextInt(4) + 1), 2);
                    }
                }
                else {
                    class1851.method6688(method1137, Class7188.field27924.method25620(random).method11878(), 2);
                }
                for (final Direction class1854 : Plane.HORIZONTAL) {
                    if (random.nextFloat() >= 0.2f) {
                        continue;
                    }
                    final BlockPos method1139 = class1852.method1149(class1854);
                    if (class1851.method6701(method1139).method21696() != Class7521.field29173) {
                        continue;
                    }
                    class1851.method6688(method1139, ((Class7097<O, Class7096>)Class7188.field27922.method25620(random).method11878()).method21773((Class7111<Comparable>)Class3926.field17791, class1854), 2);
                }
                return true;
            }
        }
        return false;
    }
}
