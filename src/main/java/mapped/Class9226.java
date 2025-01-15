// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collectors;
import java.util.Map;

public class Class9226
{
    private static String[] field39570;
    private final Map<Class6332, Class4148> field39571;
    
    public Class9226() {
        this.field39571 = Class6332.method18795().stream().collect(Collectors.toMap(class6332 -> class6332, class6333 -> new Class4148(class6333.method18796())));
    }
    
    public Class4148 method34024(final Class6332 class6332) {
        return this.field39571.get(class6332);
    }
    
    public void method34025() {
        this.field39571.values().forEach(Class4148::method12402);
    }
    
    public void method34026() {
        this.field39571.values().forEach(Class4148::method12403);
    }
}
