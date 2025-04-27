// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Map;

public enum Class1957
{
    field10666("warm"), 
    field10667("cold");
    
    private static final Map<String, Class1957> field10668;
    private final String field10669;
    
    Class1957(final String field10669) {
        this.field10669 = field10669;
    }
    
    public String method7943() {
        return this.field10669;
    }
    
    public static Class1957 method7944(final String s) {
        return Class1957.field10668.get(s);
    }
    
    static {
        field10668 = Arrays.stream(values()).collect(Collectors.toMap((Function<? super Class1957, ? extends String>)Class1957::method7943, class1957 -> class1957));
    }
}
