// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ArrayTable;
import com.google.common.collect.HashBasedTable;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Iterator;
import java.util.Collection;
import com.google.common.collect.Table;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Function;

public abstract class StateHolder<O, S> implements IStateHolder<S>
{
    private static final Function<Map.Entry<IProperty<?>, Comparable<?>>, String> field27623;
    public final O object;
    private final ImmutableMap<IProperty<?>, Comparable<?>> field27625;
    private Table<IProperty<?>, Comparable<?>, S> field27626;
    
    public StateHolder(final O field27624, final ImmutableMap<IProperty<?>, Comparable<?>> field27625) {
        this.object = field27624;
        this.field27625 = field27625;
    }
    
    public <T extends Comparable<T>> S method21768(final IProperty<T> class7111) {
        return this.with(class7111, (Comparable)method21769((Collection<V>)class7111.getAllowedValues(), (V)this.get(class7111)));
    }
    
    public static <T> T method21769(final Collection<T> collection, final T obj) {
        final Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().equals(obj)) {
                continue;
            }
            if (!iterator.hasNext()) {
                return collection.iterator().next();
            }
            return iterator.next();
        }
        return iterator.next();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.object);
        if (!this.getValues().isEmpty()) {
            sb.append('[');
            sb.append(this.getValues().entrySet().stream().map(StateHolder.field27623).collect((Collector<? super Object, ?, String>)Collectors.joining(",")));
            sb.append(']');
        }
        return sb.toString();
    }
    
    public Collection<IProperty<?>> method21770() {
        return Collections.unmodifiableCollection(this.field27625.keySet());
    }
    
    public <T extends Comparable<T>> boolean method21771(final IProperty<T> class7111) {
        return this.field27625.containsKey(class7111);
    }
    
    @Override
    public <T extends Comparable<T>> T get(final IProperty<T> obj) {
        final Comparable obj2 = this.field27625.get(obj);
        if (obj2 != null) {
            return obj.getValueClass().cast(obj2);
        }
        throw new IllegalArgumentException("Cannot get property " + obj + " as it does not exist in " + this.object);
    }
    
    @Override
    public <T extends Comparable<T>, V extends T> S with(final IProperty<T> class7111, final V obj) {
        final Comparable comparable = this.field27625.get(class7111);
        if (comparable == null) {
            throw new IllegalArgumentException("Cannot set property " + class7111 + " as it does not exist in " + this.object);
        }
        if (comparable == obj) {
            return (S)this;
        }
        final Object value = this.field27626.get(class7111, (Object)obj);
        if (value != null) {
            return (S)value;
        }
        throw new IllegalArgumentException("Cannot set property " + class7111 + " to " + obj + " on " + this.object + ", it is not an allowed value");
    }
    
    public void method21774(final Map<Map<IProperty<?>, Comparable<?>>, S> map) {
        if (this.field27626 == null) {
            final HashBasedTable create = HashBasedTable.create();
            for (final Map.Entry<IProperty, V> entry : this.field27625.entrySet()) {
                final IProperty class7111 = entry.getKey();
                for (final Comparable comparable : class7111.getAllowedValues()) {
                    if (comparable == entry.getValue()) {
                        continue;
                    }
                    create.put(class7111, comparable, map.get(this.method21775(class7111, comparable)));
                }
            }
            this.field27626 = create.isEmpty() ? create : ArrayTable.create(create);
            return;
        }
        throw new IllegalStateException();
    }
    
    private Map<IProperty<?>, Comparable<?>> method21775(final IProperty<?> class7111, final Comparable<?> comparable) {
        final HashMap hashMap = Maps.newHashMap((Map)this.field27625);
        hashMap.put(class7111, comparable);
        return hashMap;
    }
    
    @Override
    public ImmutableMap<IProperty<?>, Comparable<?>> getValues() {
        return this.field27625;
    }
    
    static {
        field27623 = new Class25();
    }
}
