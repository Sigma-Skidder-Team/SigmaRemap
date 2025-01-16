// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import java.util.Map;

public final class Class4762 extends Class4759<Class808, Class5928<Class808>>
{
    private static String[] field20386;
    private static final Map<String, ResourceLocation> field20387;
    
    public Class4762(final Class8551 class8551) {
        super(class8551, new Class5928(0.0f), 1.1f);
        this.method13978(new Class1829(this));
    }
    
    public ResourceLocation method14100(final Class808 class808) {
        final String method4775 = class808.method4775();
        ResourceLocation class809 = Class4762.field20387.get(method4775);
        if (class809 == null) {
            class809 = new ResourceLocation(method4775);
            Minecraft.method5277().method5290().method5851(class809, new Class1772(class808.method4776()));
            Class4762.field20387.put(method4775, class809);
        }
        return class809;
    }
    
    static {
        field20387 = Maps.newHashMap();
    }
}
