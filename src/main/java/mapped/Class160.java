// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class Class160 implements Class122
{
    private static String[] field467;
    private static final Class160 field468;
    
    private Class160() {
    }
    
    @Override
    public Set<Class7915<?>> method635() {
        return (Set<Class7915<?>>)ImmutableSet.of((Object)Class6683.field26363);
    }
    
    @Override
    public boolean test(final Class7529 class7529) {
        return class7529.method23577(Class6683.field26363);
    }
    
    public static Class8775 method758() {
        return () -> Class160.field468;
    }
    
    static {
        field468 = new Class160();
    }
}
