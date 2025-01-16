// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.Direction;

import java.util.function.Function;

public class Class4549 extends Class4535<Class5122>
{
    public Class4549(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
    }
    
    public boolean method13535(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5122 class1854) {
        final Class7859 class1855 = new Class7859(class1853);
        final List<? super Integer> list = IntStream.rangeClosed(class1855.method25426(), class1855.method25428()).boxed().collect((Collector<? super Integer, ?, List<? super Integer>>)Collectors.toList());
        Collections.shuffle(list, random);
        final List<? super Integer> list2 = IntStream.rangeClosed(class1855.method25427(), class1855.method25429()).boxed().collect((Collector<? super Integer, ?, List<? super Integer>>)Collectors.toList());
        Collections.shuffle(list2, random);
        final Mutable class1856 = new Mutable();
        for (final Integer n : list) {
            final Iterator<? super Integer> iterator2 = list2.iterator();
            while (iterator2.hasNext()) {
                class1856.setPos(n, 0, iterator2.next());
                final BlockPos method6958 = class1851.method6958(Class2020.field11526, class1856);
                if (!class1851.method6961(method6958) && !class1851.getBlockState(method6958).getCollisionShape(class1851, method6958).method24540()) {
                    continue;
                }
                class1851.setBlockState(method6958, Class7521.field29292.getDefaultState(), 2);
                Class456.method2323(class1851, random, method6958, Class9020.field38064);
                final BlockState method6959 = Class7521.field29287.getDefaultState();
                final Iterator<Direction> iterator3 = Plane.HORIZONTAL.iterator();
                while (iterator3.hasNext()) {
                    final BlockPos method6960 = method6958.method1149(iterator3.next());
                    if (!method6959.method21752(class1851, method6960)) {
                        continue;
                    }
                    class1851.setBlockState(method6960, method6959, 2);
                }
                return true;
            }
        }
        return false;
    }
}
