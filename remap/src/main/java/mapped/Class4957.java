// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Sets;
import java.util.Set;

public class Class4957 extends Class4943<Class4957>
{
    private final Block field21261;
    private final Set<IProperty<?>> field21262;
    
    private Class4957(final Block field21261) {
        this.field21262 = Sets.newHashSet();
        this.field21261 = field21261;
    }
    
    public Class4957 method14932(final IProperty<?> obj) {
        if (this.field21261.getStateContainer().method32905().contains(obj)) {
            this.field21262.add(obj);
            return this;
        }
        throw new IllegalStateException("Property " + obj + " is not present on block " + this.field21261);
    }
    
    public Class4957 method14933() {
        return this;
    }
    
    @Override
    public Class125 method14888() {
        return new Class137(this.method14892(), this.field21261, this.field21262, null);
    }
}
