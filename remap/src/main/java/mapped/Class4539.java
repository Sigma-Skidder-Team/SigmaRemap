// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.Collections;
import com.google.common.collect.Lists;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.Direction;

import java.util.function.Function;

public class Class4539 extends Class4536
{
    public Class4539(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
    }
    
    @Override
    public boolean method13536(final Class1851 class1851, final Random rnd, final BlockPos class1852, final Class7096 class1853) {
        final Class385 class1854 = new Class385(class1852);
        for (int n = rnd.nextInt(3) + 1, i = 0; i < n; ++i) {
            if (!this.method13537(class1851, rnd, class1854, class1853)) {
                return true;
            }
            class1854.method1290(Direction.UP);
        }
        final BlockPos method1153 = class1854.method1153();
        final int n2 = rnd.nextInt(3) + 2;
        final ArrayList arrayList = Lists.newArrayList((Iterable) Plane.HORIZONTAL);
        Collections.shuffle(arrayList, rnd);
        for (final Direction class1855 : arrayList.subList(0, n2)) {
            class1854.method1287(method1153);
            class1854.method1290(class1855);
            final int n3 = rnd.nextInt(5) + 2;
            int n4 = 0;
            for (int n5 = 0; n5 < n3 && this.method13537(class1851, rnd, class1854, class1853); ++n5) {
                ++n4;
                class1854.method1290(Direction.UP);
                if (n5 != 0) {
                    if (n4 < 2) {
                        continue;
                    }
                    if (rnd.nextFloat() >= 0.25f) {
                        continue;
                    }
                }
                class1854.method1290(class1855);
                n4 = 0;
            }
        }
        return true;
    }
}
