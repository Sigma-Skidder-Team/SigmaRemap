// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Sets;
import java.util.Set;

public class Class7724
{
    private final Set<Class7915<?>> field30725;
    private final Set<Class7915<?>> field30726;
    
    public Class7724() {
        this.field30725 = Sets.newIdentityHashSet();
        this.field30726 = Sets.newIdentityHashSet();
    }
    
    public Class7724 method24659(final Class7915<?> class7915) {
        if (!this.field30726.contains(class7915)) {
            this.field30725.add(class7915);
            return this;
        }
        throw new IllegalArgumentException("Parameter " + class7915.method25633() + " is already optional");
    }
    
    public Class7724 method24660(final Class7915<?> class7915) {
        if (!this.field30725.contains(class7915)) {
            this.field30726.add(class7915);
            return this;
        }
        throw new IllegalArgumentException("Parameter " + class7915.method25633() + " is already required");
    }
    
    public Class8212 method24661() {
        return new Class8212(this.field30725, this.field30726, null);
    }
}
