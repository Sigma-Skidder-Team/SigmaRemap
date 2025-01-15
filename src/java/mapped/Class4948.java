// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public abstract class Class4948<T extends Class4948<T>> extends Class4950<T> implements Class4946<T>
{
    public int field21238;
    public int field21239;
    private final List<Class125> field21240;
    
    public Class4948() {
        this.field21238 = 1;
        this.field21239 = 0;
        this.field21240 = Lists.newArrayList();
    }
    
    public T method14907(final Class4942 class4942) {
        this.field21240.add(class4942.method14888());
        return this.method14913();
    }
    
    public Class125[] method14908() {
        return this.field21240.toArray(new Class125[0]);
    }
    
    public T method14909(final int field21238) {
        this.field21238 = field21238;
        return this.method14913();
    }
    
    public T method14910(final int field21239) {
        this.field21239 = field21239;
        return this.method14913();
    }
}
