// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Map;

public enum Class2145
{
    field12628("none"), 
    field12629("rain"), 
    field12630("snow");
    
    private static final Map<String, Class2145> field12631;
    private final String field12632;
    
    private Class2145(final String field12632) {
        this.field12632 = field12632;
    }
    
    public String method8309() {
        return this.field12632;
    }
    
    static {
        field12631 = Arrays.stream(values()).collect(Collectors.toMap((Function<? super Class2145, ? extends String>)Class2145::method8309, class2145 -> class2145));
    }
}
