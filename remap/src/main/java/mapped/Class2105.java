// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Arrays;
import javax.annotation.Nullable;
import java.util.Locale;
import java.util.Map;

public enum Class2105
{
    field12204("legacy"), 
    field12205("mojang");
    
    private static final Map<String, Class2105> field12206;
    private final String field12207;
    
    Class2105(final String field12207) {
        this.field12207 = field12207;
    }
    
    @Nullable
    public static Class2105 method8225(final String s) {
        return Class2105.field12206.get(s.toLowerCase(Locale.ROOT));
    }
    
    static {
        field12206 = Arrays.stream(values()).collect(Collectors.toMap(class2105 -> class2105.field12207, Function.identity()));
    }
}
