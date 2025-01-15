// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public class Class4958 extends Class4943<Class4958>
{
    private static String[] field21263;
    private final List<Class6368> field21264;
    
    public Class4958() {
        this.field21264 = Lists.newArrayList();
    }
    
    public Class4958 method14934() {
        return this;
    }
    
    public Class4958 method14935(final Class4950<?> class4950) {
        this.field21264.add(class4950.method14912());
        return this;
    }
    
    @Override
    public Class125 method14888() {
        return new Class145(this.method14892(), this.field21264, null);
    }
}
