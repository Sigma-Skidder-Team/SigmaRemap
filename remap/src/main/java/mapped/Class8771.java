// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.List;
import com.google.common.collect.Maps;
import java.util.Map;

public class Class8771
{
    public static final Class8771 field36872;
    public static final Class8771 field36873;
    public static final Class8771 field36874;
    public static final Class8771 field36875;
    private final Map<Class7635, Class8512> field36876;
    
    public Class8771() {
        this.field36876 = Maps.newHashMap();
    }
    
    public static Class9263 method30455(final String s) {
        return new Class9263(Registry.register(Registry.field244, s, new Class8771()));
    }
    
    public void method30456(final Class7635 class7635) {
        if (!this.field36876.containsKey(class7635)) {
            this.field36876.put(class7635, new Class8512());
        }
    }
    
    public Class8512 method30457(final Class7635 class7635) {
        return this.field36876.get(class7635);
    }
    
    public List<Class8512> method30458(final Class7635 class7635) {
        return this.field36876.entrySet().stream().filter(entry -> entry.getKey() != class7636).map((Function<? super Object, ?>)Map.Entry::getValue).collect((Collector<? super Object, ?, List<Class8512>>)Collectors.toList());
    }
    
    public Class7635 method30459(final int n) {
        return this.field36876.entrySet().stream().max(Comparator.comparingDouble(entry -> entry.getValue().method28444(n2))).map((Function<? super Object, ? extends Class7635>)Map.Entry::getKey).orElse(Class7635.field30227);
    }
    
    static {
        field36872 = method30455("empty").method34170(0, Class7635.field30227).method34171();
        field36873 = method30455("simple").method34170(5000, Class7635.field30228).method34170(11000, Class7635.field30230).method34171();
        field36874 = method30455("villager_baby").method34170(10, Class7635.field30227).method34170(3000, Class7635.field30229).method34170(6000, Class7635.field30227).method34170(10000, Class7635.field30229).method34170(12000, Class7635.field30230).method34171();
        field36875 = method30455("villager_default").method34170(10, Class7635.field30227).method34170(2000, Class7635.field30228).method34170(9000, Class7635.field30231).method34170(11000, Class7635.field30227).method34170(12000, Class7635.field30230).method34171();
    }
}
