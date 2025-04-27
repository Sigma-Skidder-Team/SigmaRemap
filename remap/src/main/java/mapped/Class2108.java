// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Map;

public enum Class2108
{
    field12222("raw_generation"), 
    field12223("local_modifications"), 
    field12224("underground_structures"), 
    field12225("surface_structures"), 
    field12226("underground_ores"), 
    field12227("underground_decoration"), 
    field12228("vegetal_decoration"), 
    field12229("top_layer_modification");
    
    private static final Map<String, Class2108> field12230;
    private final String field12231;
    
    Class2108(final String field12231) {
        this.field12231 = field12231;
    }
    
    public String method8230() {
        return this.field12231;
    }
    
    static {
        field12230 = Arrays.stream(values()).collect(Collectors.toMap((Function<? super Class2108, ? extends String>)Class2108::method8230, class2108 -> class2108));
    }
}
