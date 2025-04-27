// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Map;

public enum Class235
{
    field897("none"), 
    field898("partial"), 
    field899("full");
    
    private static final Map<String, Class235> field900;
    private final String field901;
    
    Class235(final String field901) {
        this.field901 = field901;
    }
    
    public String method874() {
        return this.field901;
    }
    
    public static Class235 method875(final String key) {
        return Class235.field900.getOrDefault(key, Class235.field897);
    }
    
    static {
        field900 = Arrays.stream(values()).collect(Collectors.toMap((Function<? super Class235, ? extends String>)Class235::method874, class235 -> class235));
    }
}
