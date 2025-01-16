// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.Map;

public class Class7552
{
    private static String[] field29954;
    private static final Map<String, Class6257> field29955;
    
    public static Class6257 method23716(final String s) {
        Class6257 class6257 = Class7552.field29955.get(s);
        if (class6257 == null) {
            final ResourceLocation class6258 = new ResourceLocation(s);
            if (Registry.field209.method510(class6258)) {
                class6257 = Registry.field209.getOrDefault(class6258);
            }
            Class7552.field29955.put(s, class6257);
        }
        return class6257;
    }
    
    public static Class6257 method23717(final ResourceLocation class1932) {
        return Registry.field209.method510(class1932) ? Registry.field209.getOrDefault(class1932) : null;
    }
    
    static {
        field29955 = new HashMap<String, Class6257>();
    }
}
