// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Map;

public enum Class2081
{
    field12032("ocean"), 
    field12033("cold"), 
    field12034("medium"), 
    field12035("warm");
    
    private static final Map<String, Class2081> field12036;
    private final String field12037;
    
    Class2081(final String field12037) {
        this.field12037 = field12037;
    }
    
    public String method8202() {
        return this.field12037;
    }
    
    static {
        field12036 = Arrays.stream(values()).collect(Collectors.toMap((Function<? super Class2081, ? extends String>)Class2081::method8202, class2081 -> class2081));
    }
}
