// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;

public enum Class2191
{
    field13325(p0 -> false), 
    field13326(Class7099::method21780), 
    field13327(class7099 -> !class7099.method21781());
    
    private final Predicate<Class7099> field13328;
    
    private Class2191(final Predicate<Class7099> field13328) {
        this.field13328 = field13328;
    }
    
    public boolean method8359(final Class7099 class7099) {
        return this.field13328.test(class7099);
    }
}
