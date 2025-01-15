// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class Class4761<T extends Class812> extends Class4759<T, Class5929<T>>
{
    private static final Map<EntityType<?>, Class1932> field20385;
    
    public Class4761(final Class8551 class8551, final float n) {
        super(class8551, new Class5929(0.0f), n);
    }
    
    public Class1932 method14099(final T t) {
        return Class4761.field20385.get(t.method1642());
    }
    
    static {
        field20385 = Maps.newHashMap((Map)ImmutableMap.of((Object) EntityType.field28970, (Object)new Class1932("textures/entity/horse/donkey.png"), (Object) EntityType.field29006, (Object)new Class1932("textures/entity/horse/mule.png")));
    }
}
