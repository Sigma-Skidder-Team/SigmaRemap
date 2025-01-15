// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Map;

public enum Class1961
{
    field10697("show_text", true), 
    field10698("show_item", true), 
    field10699("show_entity", true);
    
    private static final Map<String, Class1961> field10700;
    private final boolean field10701;
    private final String field10702;
    
    private Class1961(final String field10702, final boolean field10703) {
        this.field10702 = field10702;
        this.field10701 = field10703;
    }
    
    public boolean method7947() {
        return this.field10701;
    }
    
    public String method7948() {
        return this.field10702;
    }
    
    public static Class1961 method7949(final String s) {
        return Class1961.field10700.get(s);
    }
    
    static {
        field10700 = Arrays.stream(values()).collect(Collectors.toMap((Function<? super Class1961, ? extends String>)Class1961::method7948, class1961 -> class1961));
    }
}
