// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public abstract class Class4950<T extends Class4950<T>> implements Class4944<T>
{
    private final List<Class122> field21243;
    
    public Class4950() {
        this.field21243 = Lists.newArrayList();
    }
    
    public abstract T method14913();
    
    public T method14914(final Class8775 class8775) {
        this.field21243.add(class8775.method30479());
        return this.method14913();
    }
    
    public final T method14915() {
        return this.method14913();
    }
    
    public Class122[] method14916() {
        return this.field21243.toArray(new Class122[0]);
    }
    
    public Class4951 method14917(final Class4950<?> class4950) {
        return new Class4951(new Class4950[] { this, class4950 });
    }
    
    public abstract Class6368 method14912();
}
