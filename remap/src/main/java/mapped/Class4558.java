// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4558 extends Class4556
{
    public Class4558(final Function<Dynamic<?>, ? extends Class5137> function) {
        super(function);
    }
    
    @Override
    public void method13570(final Class1851 class1851, final Random random, final BlockPos class1852, final int n, final Mutable class1853, final Class5137 class1854) {
        for (int field22118 = class1854.field22118, i = -field22118; i <= field22118; ++i) {
            for (int j = -field22118; j <= field22118; ++j) {
                final boolean b = i == -field22118;
                final boolean b2 = i == field22118;
                final boolean b3 = j == -field22118;
                final boolean b4 = j == field22118;
                final boolean b5 = b || b2;
                final boolean b6 = b3 || b4;
                if (!b5 || !b6) {
                    class1853.method1287(class1852).method1292(i, n, j);
                    if (!class1851.getBlockState(class1853).isOpaqueCube(class1851, class1853)) {
                        this.method13529(class1851, class1853, (BlockState)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)((StateHolder<Object, Object>)class1854.field22116.method1164(random, class1852)).with((IProperty<Comparable>)Class4003.field18044, b || (b6 && i == 1 - field22118))).with((IProperty<Comparable>)Class4003.field18042, b2 || (b6 && i == field22118 - 1))).with((IProperty<Comparable>)Class4003.field18041, b3 || (b5 && j == 1 - field22118))).with((IProperty<Comparable>)Class4003.field18043, b4 || (b5 && j == field22118 - 1)));
                    }
                }
            }
        }
    }
    
    @Override
    public int method13569(final int n, final int n2, final int n3, final int n4) {
        return (n4 > 3) ? n3 : 0;
    }
}
