// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.function.Predicate;
import java.util.function.BiFunction;
import java.util.Set;
import java.util.Collections;
import java.util.Arrays;
import com.google.common.collect.Sets;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Collection;
import java.util.Random;
import java.util.stream.Stream;
import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.UUID;
import java.util.Map;

public class Class9470
{
    private static String[] field40725;
    private final Map<UUID, Class8585> field40726;
    
    public Class9470() {
        this.field40726 = Maps.newHashMap();
    }
    
    public void method35236() {
        final Iterator<Class8585> iterator = this.field40726.values().iterator();
        while (iterator.hasNext()) {
            final Class8585 class8585 = iterator.next();
            class8585.method29065();
            if (!class8585.method29066()) {
                continue;
            }
            iterator.remove();
        }
    }
    
    private Stream<Class6556> method35237() {
        return this.field40726.entrySet().stream().flatMap(entry -> entry.getValue().method29064((UUID)entry.getKey()));
    }
    
    private Collection<Class6556> method35238(final Random random, final int n) {
        final List<? super Class6556> list = this.method35237().collect((Collector<? super Class6556, ?, List<? super Class6556>>)Collectors.toList());
        if (!list.isEmpty()) {
            final int[] a = new int[list.size()];
            int bound = 0;
            for (int i = 0; i < list.size(); ++i) {
                bound += Math.abs(((Class6556)list.get(i)).method19871());
                a[i] = bound - 1;
            }
            final Set identityHashSet = Sets.newIdentityHashSet();
            for (int j = 0; j < n; ++j) {
                final int binarySearch = Arrays.binarySearch(a, random.nextInt(bound));
                identityHashSet.add(list.get((binarySearch >= 0) ? binarySearch : (-binarySearch - 1)));
            }
            return identityHashSet;
        }
        return (Collection<Class6556>)Collections.emptyList();
    }
    
    private Class8585 method35239(final UUID key) {
        return this.field40726.computeIfAbsent(key, p0 -> new Class8585(null));
    }
    
    public void method35240(final Class9470 class9470, final Random random, final int n) {
        class9470.method35238(random, n).forEach(class9471 -> {
            final int n2 = class9471.field26046 - class9471.field26045.field294;
            if (n2 >= 2) {
                Class8585.method29072(this.method35239(class9471.field26044)).mergeInt((Object)class9471.field26045, n2, (BiFunction)Class9470::method35245);
            }
        });
    }
    
    public int method35241(final UUID uuid, final Predicate<Class100> predicate) {
        final Class8585 class8585 = this.field40726.get(uuid);
        return (class8585 == null) ? 0 : class8585.method29063(predicate);
    }
    
    public void method35242(final UUID uuid, final Class100 class100, final int n) {
        final Class8585 method35239 = this.method35239(uuid);
        Class8585.method29072(method35239).mergeInt((Object)class100, n, (n2, n3) -> this.method35246(class101, n2, n3));
        method35239.method29067(class100);
        if (method35239.method29066()) {
            this.field40726.remove(uuid);
        }
    }
    
    public <T> Dynamic<T> method35243(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createList((Stream)this.method35237().map(class6556 -> class6556.method19872((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps2)).map((Function<? super Object, ?>)Dynamic::getValue)));
    }
    
    public void method35244(final Dynamic<?> dynamic) {
        dynamic.asStream().map(Class6556::method19873).flatMap(Util::method27854).forEach(class6556 -> Class8585.method29072(this.method35239(class6556.field26044)).put((Object)class6556.field26045, class6556.field26046));
    }
    
    private static int method35245(final int a, final int b) {
        return Math.max(a, b);
    }
    
    private int method35246(final Class100 class100, final int b, final int n) {
        final int n2 = b + n;
        return (n2 <= class100.field292) ? n2 : Math.max(class100.field292, b);
    }
}
