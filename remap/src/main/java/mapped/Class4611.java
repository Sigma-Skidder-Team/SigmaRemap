// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Collection;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;
import java.util.List;
import com.google.common.collect.Lists;
import java.util.function.Predicate;
import com.google.common.collect.Sets;
import com.google.common.collect.Maps;
import java.util.Set;
import java.util.Map;

public abstract class Class4611<T extends Class4220> implements Class4640<T>
{
    private final Map<Class7012, Set<Class8803<T>>> field20077;
    
    public Class4611() {
        this.field20077 = Maps.newIdentityHashMap();
    }
    
    @Override
    public final void method13723(final Class7012 key, final Class8803<T> class8803) {
        this.field20077.computeIfAbsent(key, p0 -> Sets.newHashSet()).add(class8803);
    }
    
    @Override
    public final void method13724(final Class7012 class7012, final Class8803<T> class7013) {
        final Set set = this.field20077.get(class7012);
        if (set != null) {
            set.remove(class7013);
            if (set.isEmpty()) {
                this.field20077.remove(class7012);
            }
        }
    }
    
    @Override
    public final void method13725(final Class7012 class7012) {
        this.field20077.remove(class7012);
    }
    
    public void method13726(final Class7012 class7012, final Predicate<T> predicate) {
        final Set set = this.field20077.get(class7012);
        if (set != null) {
            List arrayList = null;
            for (final Class8803 class7013 : set) {
                if (!predicate.test((T)class7013.method30715())) {
                    continue;
                }
                if (arrayList == null) {
                    arrayList = Lists.newArrayList();
                }
                arrayList.add(class7013);
            }
            if (arrayList != null) {
                final Iterator iterator2 = arrayList.iterator();
                while (iterator2.hasNext()) {
                    ((Class8803)iterator2.next()).method30716(class7012);
                }
            }
        }
    }
    
    public void method13727(final Class7012 class7012) {
        final Set set = this.field20077.get(class7012);
        if (set != null) {
            if (!set.isEmpty()) {
                final UnmodifiableIterator iterator = ImmutableSet.copyOf(set).iterator();
                while (iterator.hasNext()) {
                    ((Class8803) iterator.next()).method30716(class7012);
                }
            }
        }
    }
}
