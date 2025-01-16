// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public class Class4954 extends Class4943<Class4954>
{
    private static String[] field21251;
    private final Class2053 field21252;
    private final List<Class9254> field21253;
    
    private Class4954(final Class2053 field21252) {
        this.field21253 = Lists.newArrayList();
        this.field21252 = field21252;
    }
    
    public Class4954 method14923(final String s, final String s2, final Action action) {
        this.field21253.add(new Class9254(s, s2, action, null));
        return this;
    }
    
    public Class4954 method14924(final String s, final String s2) {
        return this.method14923(s, s2, Action.REPLACE);
    }
    
    public Class4954 method14925() {
        return this;
    }
    
    @Override
    public Class125 method14888() {
        return new Class147(this.method14892(), this.field21252, this.field21253, null);
    }
}
