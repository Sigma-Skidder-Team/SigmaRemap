// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.Set;
import java.util.Iterator;
import java.util.Locale;
import com.google.common.collect.Maps;
import java.util.Map;

public class Class26<V> implements Map<String, V>
{
    private static String[] field72;
    private final Map<String, V> field73;
    
    public Class26() {
        this.field73 = Maps.newLinkedHashMap();
    }
    
    @Override
    public int size() {
        return this.field73.size();
    }
    
    @Override
    public boolean isEmpty() {
        return this.field73.isEmpty();
    }
    
    @Override
    public boolean containsKey(final Object o) {
        return this.field73.containsKey(o.toString().toLowerCase(Locale.ROOT));
    }
    
    @Override
    public boolean containsValue(final Object o) {
        return this.field73.containsValue(o);
    }
    
    @Override
    public V get(final Object o) {
        return this.field73.get(o.toString().toLowerCase(Locale.ROOT));
    }
    
    @Override
    public V put(final String s, final V v) {
        return this.field73.put(s.toLowerCase(Locale.ROOT), v);
    }
    
    @Override
    public V remove(final Object o) {
        return this.field73.remove(o.toString().toLowerCase(Locale.ROOT));
    }
    
    @Override
    public void putAll(final Map<? extends String, ? extends V> map) {
        for (final Entry<String, V> entry : map.entrySet()) {
            this.put(entry.getKey(), entry.getValue());
        }
    }
    
    @Override
    public void clear() {
        this.field73.clear();
    }
    
    @Override
    public Set<String> keySet() {
        return this.field73.keySet();
    }
    
    @Override
    public Collection<V> values() {
        return this.field73.values();
    }
    
    @Override
    public Set<Entry<String, V>> entrySet() {
        return this.field73.entrySet();
    }
}
