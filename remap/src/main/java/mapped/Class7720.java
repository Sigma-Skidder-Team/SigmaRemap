// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class Class7720
{
    private static String[] field30709;
    private final Map<Class2060, Class7719<?>> field30710;
    
    private Class7720() {
        this.field30710 = Maps.newEnumMap((Class)Class2060.class);
    }
    
    public <T extends Class5801> Class7720 method24650(final Class2060 class2060, final Class7719<T> class2061) {
        this.field30710.put(class2060, class2061);
        return this;
    }
}
