// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Iterators;
import com.google.common.base.Predicates;
import java.util.Iterator;
import javax.annotation.Nullable;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.IdentityHashMap;

public class Class94<T> implements Class89<T>
{
    private static String[] field253;
    private int field254;
    private final IdentityHashMap<T, Integer> field255;
    private final List<T> field256;
    
    public Class94() {
        this(512);
    }
    
    public Class94(final int expectedMaxSize) {
        this.field256 = Lists.newArrayListWithExpectedSize(expectedMaxSize);
        this.field255 = new IdentityHashMap<T, Integer>(expectedMaxSize);
    }
    
    public void method561(final T key, final int i) {
        this.field255.put(key, i);
        while (this.field256.size() <= i) {
            this.field256.add(null);
        }
        this.field256.set(i, key);
        if (this.field254 <= i) {
            this.field254 = i + 1;
        }
    }
    
    public void method562(final T t) {
        this.method561(t, this.field254);
    }
    
    public int method563(final T key) {
        final Integer n = this.field255.get(key);
        return (n != null) ? n : -1;
    }
    
    @Nullable
    @Override
    public final T method499(final int n) {
        return (n >= 0 && n < this.field256.size()) ? this.field256.get(n) : null;
    }
    
    @Override
    public Iterator<T> iterator() {
        return (Iterator<T>)Iterators.filter((Iterator)this.field256.iterator(), Predicates.notNull());
    }
    
    public int method564() {
        return this.field255.size();
    }
}
