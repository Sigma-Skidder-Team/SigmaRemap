// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
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

public abstract class Class7097<O, S> implements Class7098<S>
{
    private static final Function<Map.Entry<Class7111<?>, Comparable<?>>, String> field27623;
    public final O field27624;
    private final ImmutableMap<Class7111<?>, Comparable<?>> field27625;
    private Table<Class7111<?>, Comparable<?>, S> field27626;
    
    public Class7097(final O field27624, final ImmutableMap<Class7111<?>, Comparable<?>> field27625) {
        this.field27624 = field27624;
        this.field27625 = field27625;
    }
    
    public <T extends Comparable<T>> S method21768(final Class7111<T> class7111) {
        return this.method21773(class7111, (Comparable)method21769((Collection<V>)class7111.method21829(), (V)this.method21772((Class7111<T>)class7111)));
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
        sb.append(this.field27624);
        if (!this.method21776().isEmpty()) {
            sb.append('[');
            sb.append(this.method21776().entrySet().stream().map(Class7097.field27623).collect((Collector<? super Object, ?, String>)Collectors.joining(",")));
            sb.append(']');
        }
        return sb.toString();
    }
    
    public Collection<Class7111<?>> method21770() {
        return Collections.unmodifiableCollection((Collection<? extends Class7111<?>>)this.field27625.keySet());
    }
    
    public <T extends Comparable<T>> boolean method21771(final Class7111<T> class7111) {
        return this.field27625.containsKey((Object)class7111);
    }
    
    @Override
    public <T extends Comparable<T>> T method21772(final Class7111<T> obj) {
        final Comparable obj2 = (Comparable)this.field27625.get((Object)obj);
        if (obj2 != null) {
            return obj.method21827().cast(obj2);
        }
        throw new IllegalArgumentException("Cannot get property " + obj + " as it does not exist in " + this.field27624);
    }
    
    @Override
    public <T extends Comparable<T>, V extends T> S method21773(final Class7111<T> class7111, final V obj) {
        final Comparable comparable = (Comparable)this.field27625.get((Object)class7111);
        if (comparable == null) {
            throw new IllegalArgumentException("Cannot set property " + class7111 + " as it does not exist in " + this.field27624);
        }
        if (comparable == obj) {
            return (S)this;
        }
        final Object value = this.field27626.get((Object)class7111, (Object)obj);
        if (value != null) {
            return (S)value;
        }
        throw new IllegalArgumentException("Cannot set property " + class7111 + " to " + obj + " on " + this.field27624 + ", it is not an allowed value");
    }
    
    public void method21774(final Map<Map<Class7111<?>, Comparable<?>>, S> map) {
        if (this.field27626 == null) {
            final HashBasedTable create = HashBasedTable.create();
            for (final Map.Entry<Class7111, V> entry : this.field27625.entrySet()) {
                final Class7111 class7111 = entry.getKey();
                for (final Comparable comparable : class7111.method21829()) {
                    if (comparable == entry.getValue()) {
                        continue;
                    }
                    ((Table)create).put((Object)class7111, (Object)comparable, (Object)map.get(this.method21775(class7111, comparable)));
                }
            }
            this.field27626 = (Table<Class7111<?>, Comparable<?>, S>)(((Table)create).isEmpty() ? create : ArrayTable.create((Table)create));
            return;
        }
        throw new IllegalStateException();
    }
    
    private Map<Class7111<?>, Comparable<?>> method21775(final Class7111<?> class7111, final Comparable<?> comparable) {
        final HashMap hashMap = Maps.newHashMap((Map)this.field27625);
        hashMap.put(class7111, comparable);
        return hashMap;
    }
    
    @Override
    public ImmutableMap<Class7111<?>, Comparable<?>> method21776() {
        return this.field27625;
    }
    
    static {
        field27623 = new Class25();
    }
}
