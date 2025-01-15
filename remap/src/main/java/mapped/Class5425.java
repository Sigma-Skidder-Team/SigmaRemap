// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

import com.google.common.collect.Sets;

import java.util.function.Function;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;
import com.google.common.collect.ImmutableMap;

public class Class5425 extends Class5419<Class511>
{
    private static String[] field22612;
    
    public Class5425() {
        super((Map)ImmutableMap.of((Object)Class8233.field33813, (Object)Class1952.field10628, (Object)Class8233.field33814, (Object)Class1952.field10628, (Object)Class8233.field33815, (Object)Class1952.field10630));
    }
    
    @Override
    public void method16539(final Class1849 class1849, final Class511 class1850, final long n) {
        final Class365<?> method2618 = class1850.method2618();
        final Class9468 class1851 = method2618.method1198(Class8233.field33813).get();
        final List list = method2618.method1198(Class8233.field33814).get();
        final List<? super Object> list2 = class1851.method35218().stream().map(class1852 -> new BlockPos(class1852.field26589, class1852.field26590, class1852.field26591)).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList());
        this.method16573(class1849, (List<BlockPos>)list2, this.method16572(class1849, list, (List<BlockPos>)list2), class1851.method35222() - 1, class1850, method2618);
    }
    
    private Set<BlockPos> method16572(final Class1849 class1849, final List<Class363> list, final List<BlockPos> list2) {
        return list.stream().filter(class1851 -> class1851.method1169() == class1850.method6789().method20487()).map((Function<? super Object, ?>)Class363::method1170).filter(list2::contains).collect((Collector<? super Object, ?, Set<BlockPos>>)Collectors.toSet());
    }
    
    private void method16573(final Class1849 class1849, final List<BlockPos> list, final Set<BlockPos> set, final int n, final Class511 class1850, final Class365<?> class1851) {
        set.forEach(class1854 -> {
            list2.indexOf(class1854);
            class1852.method6701(class1854).method21696();
            final Class3969 class1855;
            if (!(!Class7188.field27885.method25618(class1855))) {
                if (!(!(class1855 instanceof Class3969))) {
                    final int n3;
                    final boolean b = n3 >= n2;
                    class1855.method12110(class1852, class1854, b);
                    Class363.method1167(class1852.method6789().method20487(), class1854);
                    if (!class1853.method1198(Class8233.field33815).isPresent() && b) {
                        final Class363 class1856;
                        class1853.method1196(Class8233.field33815, Sets.newHashSet((Object[])new Class363[] { class1856 }));
                    }
                    else {
                        class1853.method1198(Class8233.field33815).ifPresent(set2 -> {
                            if (!b2) {
                                set2.remove(class1857);
                            }
                            else {
                                set2.add(class1857);
                            }
                        });
                    }
                }
            }
            return;
        });
        method16574(class1849, list, n, class1850, class1851);
    }
    
    public static void method16574(final Class1849 class1849, final List<BlockPos> list, final int n, final Class511 class1850, final Class365<?> class1851) {
        class1851.method1198(Class8233.field33815).ifPresent(set -> {
            set.iterator();
            final Iterator iterator;
            while (iterator.hasNext()) {
                final Class363 class1854 = iterator.next();
                class1854.method1170();
                final BlockPos class1855;
                list2.indexOf(class1855);
                if (class1852.method6789().method20487() == class1854.method1169()) {
                    class1852.method6701(class1855).method21696();
                    final Class3969 class1856;
                    if (!Class7188.field27885.method25618(class1856)) {
                        continue;
                    }
                    else if (!(class1856 instanceof Class3969)) {
                        continue;
                    }
                    else {
                        final int n3;
                        if (n3 >= n2) {
                            continue;
                        }
                        else if (!class1855.withinDistance(class1853.method1934(), 4.0)) {
                            continue;
                        }
                        else {
                            class1856.method12110(class1852, class1855, false);
                            iterator.remove();
                        }
                    }
                }
                else {
                    iterator.remove();
                }
            }
        });
    }
}
