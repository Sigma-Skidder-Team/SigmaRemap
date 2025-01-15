// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.Map;

public enum Class2183
{
    field12925(0), 
    field12926(-1), 
    field12927(1);
    
    private final int field12928;
    private static final Map<Integer, Class2183> field12929;
    
    private Class2183(final int field12928) {
        this.field12928 = field12928;
    }
    
    public int method8346() {
        return this.field12928;
    }
    
    public static Class2183 method8347(final int i) {
        return Class2183.field12929.get(i);
    }
    
    static {
        field12929 = new HashMap<Integer, Class2183>();
        for (final Class2183 class2183 : values()) {
            Class2183.field12929.put(class2183.method8346(), class2183);
        }
    }
}
