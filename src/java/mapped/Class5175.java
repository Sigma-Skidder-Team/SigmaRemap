// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.function.Supplier;
import java.util.Map;
import com.mojang.datafixers.schemas.Schema;

public class Class5175 extends Class5174
{
    public Class5175(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public Map<String, Supplier<TypeTemplate>> registerEntities(final Schema schema) {
        final Map registerEntities = super.registerEntities(schema);
        registerEntities.put("minecraft:cod", registerEntities.remove("minecraft:cod_mob"));
        registerEntities.put("minecraft:salmon", registerEntities.remove("minecraft:salmon_mob"));
        return registerEntities;
    }
}
