// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.Comparator;
import javax.annotation.Nullable;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import com.google.common.collect.Sets;
import java.util.Set;

public class Class7914
{
    private static String[] field32494;
    private final Class8380 field32495;
    private final Set<Class6772> field32496;
    private final Class6772[] field32497;
    private final int field32498;
    private final Class4654 field32499;
    
    public Class7914(final Class4654 field32499, final int field32500) {
        this.field32495 = new Class8380();
        this.field32496 = Sets.newHashSet();
        this.field32497 = new Class6772[32];
        this.field32499 = field32499;
        this.field32498 = field32500;
    }
    
    @Nullable
    public Class9468 method25625(final Class1854 class1854, final Class759 class1855, final Set<Class354> set, final float n, final int n2, final float n3) {
        this.field32495.method27924();
        this.field32499.method13900(class1854, class1855);
        final Class9468 method25626 = this.method25626(this.field32499.method13902(), (Map<Class6773, Class354>)set.stream().collect(Collectors.toMap(class1856 -> this.field32499.method13903(class1856.method1074(), class1856.method1075(), class1856.method1076()), (Function<? super Object, ?>)Function.identity())), n, n2, n3);
        this.field32499.method13901();
        return method25626;
    }
    
    @Nullable
    private Class9468 method25626(final Class6772 class6772, final Map<Class6773, Class354> map, final float n, final int n2, final float n3) {
        final Set<Class6773> keySet = map.keySet();
        class6772.field26594 = 0.0f;
        class6772.field26595 = this.method25627(class6772, keySet);
        class6772.field26596 = class6772.field26595;
        this.field32495.method27924();
        this.field32496.clear();
        this.field32495.method27923(class6772);
        int n4 = 0;
        final int n5 = (int)(this.field32498 * n3);
        while (!this.field32495.method27929()) {
            if (++n4 >= n5) {
                break;
            }
            final Class6772 method27925 = this.field32495.method27925();
            method27925.field26598 = true;
            keySet.stream().filter(class6775 -> class6774.method20669(class6775) <= n6).forEach(Class6773::method20676);
            if (keySet.stream().anyMatch(Class6773::method20677)) {
                break;
            }
            if (method27925.method20667(class6772) >= n) {
                continue;
            }
            for (int method27926 = this.field32499.method13904(this.field32497, method27925), i = 0; i < method27926; ++i) {
                final Class6772 class6773 = this.field32497[i];
                final float method27927 = method27925.method20667(class6773);
                class6773.field26599 = method27925.field26599 + method27927;
                final float field26594 = method27925.field26594 + method27927 + class6773.field26600;
                if (class6773.field26599 < n) {
                    if (!class6773.method20672() || field26594 < class6773.field26594) {
                        class6773.field26597 = method27925;
                        class6773.field26594 = field26594;
                        class6773.field26595 = this.method25627(class6773, keySet) * 1.5f;
                        if (!class6773.method20672()) {
                            class6773.field26596 = class6773.field26594 + class6773.field26595;
                            this.field32495.method27923(class6773);
                        }
                        else {
                            this.field32495.method27926(class6773, class6773.field26594 + class6773.field26595);
                        }
                    }
                }
            }
        }
        Stream<Class9468> stream;
        if (!keySet.stream().anyMatch(Class6773::method20677)) {
            stream = keySet.stream().map(class6776 -> this.method25628(class6776.method20675(), map2.get(class6776), false)).sorted(Comparator.comparingDouble(Class9468::method35233).thenComparingInt(Class9468::method35221));
        }
        else {
            stream = keySet.stream().filter(Class6773::method20677).map(class6777 -> this.method25628(class6777.method20675(), map3.get(class6777), true)).sorted(Comparator.comparingInt(Class9468::method35221));
        }
        final Optional<Class9468> first = stream.findFirst();
        if (first.isPresent()) {
            return first.get();
        }
        return null;
    }
    
    private float method25627(final Class6772 class6772, final Set<Class6773> set) {
        float min = Float.MAX_VALUE;
        for (final Class6773 class6773 : set) {
            final float method20667 = class6772.method20667(class6773);
            class6773.method20674(method20667, class6772);
            min = Math.min(method20667, min);
        }
        return min;
    }
    
    private Class9468 method25628(final Class6772 class6772, final Class354 class6773, final boolean b) {
        final ArrayList arrayList = Lists.newArrayList();
        Class6772 field26597 = class6772;
        arrayList.add(0, class6772);
        while (field26597.field26597 != null) {
            field26597 = field26597.field26597;
            arrayList.add(0, field26597);
        }
        return new Class9468(arrayList, class6773, b);
    }
}
