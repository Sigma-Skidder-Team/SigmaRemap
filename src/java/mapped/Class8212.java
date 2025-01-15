// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Sets$SetView;
import java.util.Iterator;
import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import java.util.Collection;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class Class8212
{
    private final Set<Class7915<?>> field33751;
    private final Set<Class7915<?>> field33752;
    
    private Class8212(final Set<Class7915<?>> set, final Set<Class7915<?>> set2) {
        this.field33751 = (Set<Class7915<?>>)ImmutableSet.copyOf((Collection)set);
        this.field33752 = (Set<Class7915<?>>)ImmutableSet.copyOf((Collection)Sets.union((Set)set, (Set)set2));
    }
    
    public Set<Class7915<?>> method27203() {
        return this.field33751;
    }
    
    public Set<Class7915<?>> method27204() {
        return this.field33752;
    }
    
    @Override
    public String toString() {
        return "[" + Joiner.on(", ").join((Iterator)this.field33752.stream().map(class7915 -> (this.field33751.contains(class7915) ? "!" : "") + class7915.method25633()).iterator()) + "]";
    }
    
    public void method27205(final Class7790 class7790, final Class124 class7791) {
        final Sets$SetView difference = Sets.difference((Set)class7791.method635(), (Set)this.field33752);
        if (!((Set)difference).isEmpty()) {
            class7790.method25014("Parameters " + difference + " are not provided in this context");
        }
    }
}
