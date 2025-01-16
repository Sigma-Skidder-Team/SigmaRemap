// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.Map;

public enum Class2066
{
    field11827("natural_stone", class7096 -> {
        if (class7096 != null) {
            class7096.method21696();
            final Block class7097;
            final boolean b;
            if (class7097 != Class7521.field29148) {
                if (class7097 != Class7521.field29149) {
                    if (class7097 != Class7521.field29151) {
                        if (class7097 != Class7521.field29153) {
                            return b;
                        }
                    }
                }
            }
            return b;
        }
        else {
            return false;
        }
    }), 
    field11828("netherrack", (Predicate<Class7096>)new Class117(Class7521.field29338));
    
    private static final Map<String, Class2066> field11829;
    private final String field11830;
    private final Predicate<Class7096> field11831;
    
    private Class2066(final String field11830, final Predicate<Class7096> field11831) {
        this.field11830 = field11830;
        this.field11831 = field11831;
    }
    
    public String method8156() {
        return this.field11830;
    }
    
    public static Class2066 method8157(final String s) {
        return Class2066.field11829.get(s);
    }
    
    public Predicate<Class7096> method8158() {
        return this.field11831;
    }
    
    static {
        field11829 = Arrays.stream(values()).collect(Collectors.toMap((Function<? super Class2066, ? extends String>)Class2066::method8156, class7098 -> class7098));
    }
}
