// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public abstract class Class4943<T extends Class4943<T>> implements Class4942, Class4944<T>
{
    private final List<Class122> field21228;
    
    public Class4943() {
        this.field21228 = Lists.newArrayList();
    }
    
    public T method14889(final Class8775 class8775) {
        this.field21228.add(class8775.method30479());
        return this.method14891();
    }
    
    public final T method14890() {
        return this.method14891();
    }
    
    public abstract T method14891();
    
    public Class122[] method14892() {
        return this.field21228.toArray(new Class122[0]);
    }
}
