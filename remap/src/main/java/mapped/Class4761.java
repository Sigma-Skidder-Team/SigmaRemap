// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.EntityType;

import java.util.Map;

public class Class4761<T extends Class812> extends Class4759<T, Class5929<T>>
{
    private static final Map<EntityType<?>, ResourceLocation> field20385;
    
    public Class4761(final Class8551 class8551, final float n) {
        super(class8551, new Class5929(0.0f), n);
    }
    
    public ResourceLocation method14099(final T t) {
        return Class4761.field20385.get(t.getType());
    }
    
    static {
        field20385 = Maps.newHashMap((Map)ImmutableMap.of(EntityType.field28970, new ResourceLocation("textures/entity/horse/donkey.png"), (Object) EntityType.field29006, (Object)new ResourceLocation("textures/entity/horse/mule.png")));
    }
}
