// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class Class4953 extends Class4943<Class4953>
{
    private static String[] field21249;
    private final Map<Class5328, Class5772> field21250;
    
    public Class4953() {
        this.field21250 = Maps.newHashMap();
    }
    
    public Class4953 method14921() {
        return this;
    }
    
    public Class4953 method14922(final Class5328 class5328, final Class5772 class5329) {
        this.field21250.put(class5328, class5329);
        return this;
    }
    
    @Override
    public Class125 method14888() {
        return new Class136(this.method14892(), this.field21250, null);
    }
}
