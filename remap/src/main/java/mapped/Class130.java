// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.Map;

public class Class130 extends Class126
{
    private static String[] field395;
    private static final Map<Class1932, Class9256> field396;
    private final Class6257 field397;
    private final Class5020 field398;
    
    private Class130(final Class122[] array, final Class6257 field397, final Class5020 field398) {
        super(array);
        this.field397 = field397;
        this.field398 = field398;
    }
    
    @Override
    public Set<Class7915<?>> method635() {
        return (Set<Class7915<?>>)ImmutableSet.of((Object)Class6683.field26370);
    }
    
    @Override
    public Class8321 method639(final Class8321 class8321, final Class7529 class8322) {
        final Class8321 class8323 = class8322.method23579(Class6683.field26370);
        if (class8323 != null) {
            class8321.method27691(this.field398.method15235(class8322.method23586(), class8321.method27690(), Class8742.method30195(this.field397, class8323)));
        }
        return class8321;
    }
    
    public static Class4943<?> method650(final Class6257 class6257, final float n, final int n2) {
        return Class126.method640(array2 -> {
            new Class130(array2, class6258, new Class5021(n3, n4));
            return;
        });
    }
    
    public static Class4943<?> method651(final Class6257 class6257) {
        return Class126.method640(array2 -> {
            new Class130(array2, class6258, new Class5022(null));
            return;
        });
    }
    
    public static Class4943<?> method652(final Class6257 class6257) {
        return Class126.method640(array2 -> {
            new Class130(array2, class6258, new Class5019(1));
            return;
        });
    }
    
    public static Class4943<?> method653(final Class6257 class6257, final int n) {
        return Class126.method640(array2 -> {
            new Class130(array2, class6258, new Class5019(n2));
            return;
        });
    }
    
    static {
        (field396 = Maps.newHashMap()).put(Class5021.field21527, Class5021::method15239);
        Class130.field396.put(Class5022.field21530, Class5022::method15240);
        Class130.field396.put(Class5019.field21525, Class5019::method15237);
    }
}
