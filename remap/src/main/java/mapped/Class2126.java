// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Map;

public enum Class2126
{
    field12400("air"), 
    field12401("liquid");
    
    private static final Map<String, Class2126> field12402;
    private final String field12403;
    
    Class2126(final String field12403) {
        this.field12403 = field12403;
    }
    
    public String method8281() {
        return this.field12403;
    }
    
    static {
        field12402 = Arrays.stream(values()).collect(Collectors.toMap((Function<? super Class2126, ? extends String>)Class2126::method8281, class2126 -> class2126));
    }
}
