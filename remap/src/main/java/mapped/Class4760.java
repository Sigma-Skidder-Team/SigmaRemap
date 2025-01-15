// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class Class4760 extends Class4759<Class806, Class5928<Class806>>
{
    private static final Map<Class7499<?>, Class1932> field20384;
    
    public Class4760(final Class8551 class8551) {
        super(class8551, new Class5928(0.0f), 1.0f);
    }
    
    public Class1932 method14098(final Class806 class806) {
        return Class4760.field20384.get(class806.method1642());
    }
    
    static {
        field20384 = Maps.newHashMap((Map)ImmutableMap.of((Object)Class7499.field29053, (Object)new Class1932("textures/entity/horse/horse_zombie.png"), (Object)Class7499.field29024, (Object)new Class1932("textures/entity/horse/horse_skeleton.png")));
    }
}
