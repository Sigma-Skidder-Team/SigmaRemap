// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Iterators;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Predicate;
import java.util.Collection;
import java.util.Iterator;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.AbstractCollection;

public class Class80<T> extends AbstractCollection<T>
{
    private final Map<Class<?>, List<T>> field178;
    private final Class<T> field179;
    private final List<T> field180;
    
    public Class80(final Class<T> field179) {
        this.field178 = Maps.newHashMap();
        this.field180 = Lists.newArrayList();
        this.field179 = field179;
        this.field178.put((Class<?>)field179, (List<?>)this.field180);
    }
    
    @Override
    public boolean add(final T t) {
        boolean b = false;
        for (final Map.Entry entry : this.field178.entrySet()) {
            if (!((Class)entry.getKey()).isInstance(t)) {
                continue;
            }
            b |= ((List<T>)entry.getValue()).add(t);
        }
        return b;
    }
    
    @Override
    public boolean remove(final Object o) {
        boolean b = false;
        for (final Map.Entry<Class, V> entry : this.field178.entrySet()) {
            if (!entry.getKey().isInstance(o)) {
                continue;
            }
            b |= ((List)entry.getValue()).remove(o);
        }
        return b;
    }
    
    @Override
    public boolean contains(final Object o) {
        return this.method443(o.getClass()).contains(o);
    }
    
    public <S> Collection<S> method443(final Class<S> clazz) {
        if (this.field179.isAssignableFrom(clazz)) {
            return Collections.unmodifiableCollection((Collection<? extends S>)this.field178.computeIfAbsent((Class<?>)clazz, clazz2 -> this.field180.stream().filter(clazz2::isInstance).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList())));
        }
        throw new IllegalArgumentException("Don't know how to search for " + clazz);
    }
    
    @Override
    public Iterator<T> iterator() {
        return (Iterator<T>)(this.field180.isEmpty() ? Collections.emptyIterator() : Iterators.unmodifiableIterator((Iterator)this.field180.iterator()));
    }
    
    @Override
    public int size() {
        return this.field180.size();
    }
}
