// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collector;
import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.stream.Stream;
import java.util.Iterator;
import java.util.List;

public enum Class2195
{
    field13358(1.0f), 
    field13359(0.75f), 
    field13360(0.5f), 
    field13361(0.25f);
    
    private static final List<Class2195> field13362;
    private final float field13363;
    
    Class2195(final float field13363) {
        this.field13363 = field13363;
    }
    
    public static Class2195 method8369(final float n) {
        for (final Class2195 class2195 : Class2195.field13362) {
            if (n >= class2195.field13363) {
                continue;
            }
            return class2195;
        }
        return Class2195.field13358;
    }
    
    static {
        field13362 = Stream.of(values()).sorted(Comparator.comparingDouble(class2195 -> class2195.field13363)).collect((Collector<? super Class2195, Object, List<Class2195>>)ImmutableList.toImmutableList());
    }
}
