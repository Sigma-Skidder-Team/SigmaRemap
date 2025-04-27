// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Map;

public enum Class1964
{
    field10718("normal"), 
    field10719("mesa");
    
    private static final Map<String, Class1964> field10720;
    private final String field10721;
    
    Class1964(final String field10721) {
        this.field10721 = field10721;
    }
    
    public String method7954() {
        return this.field10721;
    }
    
    public static Class1964 method7955(final String s) {
        return Class1964.field10720.get(s);
    }
    
    public static Class1964 method7956(final int n) {
        return (n >= 0 && n < values().length) ? values()[n] : Class1964.field10718;
    }
    
    static {
        field10720 = Arrays.stream(values()).collect(Collectors.toMap((Function<? super Class1964, ? extends String>)Class1964::method7954, class1964 -> class1964));
    }
}
