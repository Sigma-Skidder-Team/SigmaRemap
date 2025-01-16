// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap;
import java.util.stream.Collectors;
import com.mojang.datafixers.types.DynamicOps;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableList;
import java.util.stream.Stream;
import java.util.function.Supplier;
import java.util.Iterator;
import java.util.function.Function;
import com.google.common.collect.Sets;
import com.google.common.collect.Maps;
import com.mojang.datafixers.Dynamic;
import java.util.Collection;
import com.mojang.datafixers.util.Pair;
import net.minecraft.entity.LivingEntity;

import java.util.Set;
import java.util.Optional;
import java.util.Map;

public class Class365<E extends LivingEntity> implements IDynamicSerializable
{
    private final Map<Class8233<?>, Optional<?>> field2198;
    private final Map<Class8033<? extends Class6851<? super E>>, Class6851<? super E>> field2199;
    private final Map<Integer, Map<Class7635, Set<Class5419<? super E>>>> field2200;
    private Class8771 field2201;
    private final Map<Class7635, Set<Pair<Class8233<?>, Class1952>>> field2202;
    private Set<Class7635> field2203;
    private final Set<Class7635> field2204;
    private Class7635 field2205;
    private long field2206;
    
    public <T> Class365(final Collection<Class8233<?>> collection, final Collection<Class8033<? extends Class6851<? super E>>> collection2, final Dynamic<T> dynamic) {
        this.field2198 = Maps.newHashMap();
        this.field2199 = Maps.newLinkedHashMap();
        this.field2200 = Maps.newTreeMap();
        this.field2201 = Class8771.field36872;
        this.field2202 = Maps.newHashMap();
        this.field2203 = Sets.newHashSet();
        this.field2204 = Sets.newHashSet();
        this.field2205 = Class7635.field30227;
        this.field2206 = -9999L;
        collection.forEach(class8233 -> {
            final Optional<?> optional = this.field2198.put(class8233, Optional.empty());
            return;
        });
        collection2.forEach(class8234 -> {
            final Class6851<? super E> class8235 = this.field2199.put(class8234, class8234.method26348());
            return;
        });
        this.field2199.values().forEach(class8236 -> {
            class8236.method20953().iterator();
            final Iterator iterator2;
            while (iterator2.hasNext()) {
                this.field2198.put(iterator2.next(), Optional.empty());
            }
            return;
        });
        for (final Map.Entry<Dynamic, V> entry : dynamic.get("memories").asMap((Function)Function.identity(), (Function)Function.identity()).entrySet()) {
            this.method1194(Registry.field242.getOrDefault(new ResourceLocation(entry.getKey().asString(""))), (com.mojang.datafixers.Dynamic<Object>)entry.getValue());
        }
    }
    
    public boolean method1193(final Class8233<?> class8233) {
        return this.method1199(class8233, Class1952.field10628);
    }
    
    private <T, U> void method1194(final Class8233<U> class8233, final Dynamic<T> dynamic) {
        this.method1196((Class8233<Object>)class8233, class8233.method27285().orElseThrow((Supplier<? extends Throwable>)RuntimeException::new).apply((Object)dynamic));
    }
    
    public <U> void method1195(final Class8233<U> class8233) {
        this.method1197(class8233, Optional.empty());
    }
    
    public <U> void method1196(final Class8233<U> class8233, final U value) {
        this.method1197(class8233, (Optional<U>)Optional.ofNullable((U)value));
    }
    
    public <U> void method1197(final Class8233<U> class8233, final Optional<U> optional) {
        if (this.field2198.containsKey(class8233)) {
            if (optional.isPresent() && this.method1217(optional.get())) {
                this.method1195(class8233);
            }
            else {
                this.field2198.put(class8233, optional);
            }
        }
    }
    
    public <U> Optional<U> method1198(final Class8233<U> class8233) {
        return (Optional)this.field2198.get(class8233);
    }
    
    public boolean method1199(final Class8233<?> class8233, final Class1952 class8234) {
        final Optional optional = this.field2198.get(class8233);
        if (optional != null) {
            if (class8234 != Class1952.field10630) {
                if (class8234 != Class1952.field10628 || !optional.isPresent()) {
                    if (class8234 != Class1952.field10629 || optional.isPresent()) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public Class8771 method1200() {
        return this.field2201;
    }
    
    public void method1201(final Class8771 field2201) {
        this.field2201 = field2201;
    }
    
    public void method1202(final Set<Class7635> field2203) {
        this.field2203 = field2203;
    }
    
    @Deprecated
    public Stream<Class5419<? super E>> method1203() {
        return this.field2200.values().stream().flatMap(map -> map.values().stream()).flatMap((Function<? super Object, ? extends Stream<? extends Class5419<? super E>>>)Collection::stream).filter(class5419 -> class5419.method16543() == Class232.field868);
    }
    
    public void method1204(final Class7635 class7635) {
        this.field2204.clear();
        this.field2204.addAll(this.field2203);
        this.field2204.add((this.field2202.keySet().contains(class7635) && this.method1216(class7635)) ? class7635 : this.field2205);
    }
    
    public void method1205(final long n, final long field2206) {
        if (field2206 - this.field2206 > 20L) {
            this.field2206 = field2206;
            final Class7635 method30459 = this.method1200().method30459((int)(n % 24000L));
            if (!this.field2204.contains(method30459)) {
                this.method1204(method30459);
            }
        }
    }
    
    public void method1206(final Class7635 field2205) {
        this.field2205 = field2205;
    }
    
    public void method1207(final Class7635 class7635, final ImmutableList<Pair<Integer, ? extends Class5419<? super E>>> list) {
        this.method1208(class7635, list, (Set<Pair<Class8233<?>, Class1952>>)ImmutableSet.of());
    }
    
    public void method1208(final Class7635 class7635, final ImmutableList<Pair<Integer, ? extends Class5419<? super E>>> list, final Set<Pair<Class8233<?>, Class1952>> set) {
        this.field2202.put(class7635, set);
        list.forEach(pair -> ((Set)this.field2200.computeIfAbsent((Integer)pair.getFirst(), p0 -> Maps.newHashMap()).computeIfAbsent((Object)key, p0 -> Sets.newLinkedHashSet())).add(pair.getSecond()));
    }
    
    public boolean method1209(final Class7635 class7635) {
        return this.field2204.contains(class7635);
    }
    
    public Class365<E> method1210() {
        final Class365 class365 = new Class365(this.field2198.keySet(), this.field2199.keySet(), (Dynamic<T>)new Dynamic((DynamicOps)Class8453.field34721, (Object)new Class51()));
        this.field2198.forEach((p1, optional) -> optional.ifPresent(value -> {
            final Optional<?> optional2 = class366.field2198.put(class367, Optional.of(value));
        }));
        return class365;
    }
    
    public void method1211(final Class1849 class1849, final E e) {
        this.method1213(class1849, e);
        this.method1214(class1849, e);
        this.method1215(class1849, e);
    }
    
    public void method1212(final Class1849 class1849, final E e) {
        this.method1203().forEach(class1852 -> {
            e2.field2391.method6754();
            class1852.method16547(class1850, class1851, n);
        });
    }
    
    @Override
    public <T> T serialize(final DynamicOps<T> dynamicOps) {
        return (T)dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("memories"), dynamicOps.createMap((Map)this.field2198.entrySet().stream().filter(entry -> entry.getKey().method27285().isPresent() && ((Optional)entry.getValue()).isPresent()).map(entry2 -> Pair.of(dynamicOps2.createString(Registry.field242.getKey(entry2.getKey()).toString()), ((Optional)entry2.getValue()).get().method1123((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps2))).collect(Collectors.toMap((Function<? super Object, ?>)Pair::getFirst, (Function<? super Object, ?>)Pair::getSecond)))));
    }
    
    private void method1213(final Class1849 class1849, final E e) {
        this.field2199.values().forEach(class1852 -> class1852.method20958(class1850, class1851));
    }
    
    private void method1214(final Class1849 class1849, final E e) {
        this.field2200.values().stream().flatMap(map -> map.entrySet().stream()).filter(entry -> this.field2204.contains(entry.getKey())).map((Function<? super Object, ?>)Map.Entry::getValue).flatMap((Function<? super Object, ? extends Stream<?>>)Collection::stream).filter(class1850 -> class1850.method16543() == Class232.field867).forEach(class1854 -> {
            class1852.method6754();
            class1854.method16544(class1851, class1853, n);
        });
    }
    
    private void method1215(final Class1849 class1849, final E e) {
        this.method1203().forEach(class1853 -> {
            class1851.method6754();
            class1853.method16545(class1850, class1852, n);
        });
    }
    
    private boolean method1216(final Class7635 class7635) {
        return this.field2202.get(class7635).stream().allMatch(pair -> this.method1199((Class8233<?>)pair.getFirst(), (Class1952)pair.getSecond()));
    }
    
    private boolean method1217(final Object o) {
        return o instanceof Collection && ((Collection)o).isEmpty();
    }
}
