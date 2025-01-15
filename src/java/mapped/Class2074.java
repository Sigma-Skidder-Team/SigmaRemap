// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public enum Class2074
{
    field11963(0, "red", new Class3090[] { Class7102.field27637, Class7102.field27651, Class7102.field27688, Class7102.field27664, Class7102.field27697, Class7102.field27665, Class7102.field27698 }), 
    field11964(1, "snow", new Class3090[] { Class7102.field27662, Class7102.field27663, Class7102.field27696 });
    
    private static final Class2074[] field11965;
    private static final Map<String, Class2074> field11966;
    private final int field11967;
    private final String field11968;
    private final List<Class3090> field11969;
    
    private Class2074(final int field11967, final String field11968, final Class3090[] a) {
        this.field11967 = field11967;
        this.field11968 = field11968;
        this.field11969 = Arrays.asList(a);
    }
    
    public String method8168() {
        return this.field11968;
    }
    
    public List<Class3090> method8169() {
        return this.field11969;
    }
    
    public int method8170() {
        return this.field11967;
    }
    
    public static Class2074 method8171(final String key) {
        return Class2074.field11966.getOrDefault(key, Class2074.field11963);
    }
    
    public static Class2074 method8172(int n) {
        if (n < 0 || n > Class2074.field11965.length) {
            n = 0;
        }
        return Class2074.field11965[n];
    }
    
    public static Class2074 method8173(final Class3090 class3090) {
        return Class2074.field11964.method8169().contains(class3090) ? Class2074.field11964 : Class2074.field11963;
    }
    
    static {
        field11965 = Arrays.stream(values()).sorted(Comparator.comparingInt(Class2074::method8170)).toArray(Class2074[]::new);
        field11966 = Arrays.stream(values()).collect(Collectors.toMap((Function<? super Class2074, ? extends String>)Class2074::method8168, class2074 -> class2074));
    }
}
