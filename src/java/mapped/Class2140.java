// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Map;

public enum Class2140
{
    field12585("none"), 
    field12586("taiga"), 
    field12587("extreme_hills"), 
    field12588("jungle"), 
    field12589("mesa"), 
    field12590("plains"), 
    field12591("savanna"), 
    field12592("icy"), 
    field12593("the_end"), 
    field12594("beach"), 
    field12595("forest"), 
    field12596("ocean"), 
    field12597("desert"), 
    field12598("river"), 
    field12599("swamp"), 
    field12600("mushroom"), 
    field12601("nether");
    
    private static final Map<String, Class2140> field12602;
    private final String field12603;
    
    private Class2140(final String field12603) {
        this.field12603 = field12603;
    }
    
    public String method8298() {
        return this.field12603;
    }
    
    static {
        field12602 = Arrays.stream(values()).collect(Collectors.toMap((Function<? super Class2140, ? extends String>)Class2140::method8298, class2140 -> class2140));
    }
}
