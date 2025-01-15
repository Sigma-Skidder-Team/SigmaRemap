// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.function.Supplier;
import java.util.Map;
import com.mojang.datafixers.schemas.Schema;

public class Class5178 extends Class5174
{
    public Class5178(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public Map<String, Supplier<TypeTemplate>> registerEntities(final Schema schema) {
        final Map registerEntities = super.registerEntities(schema);
        registerEntities.put("minecraft:command_block_minecart", registerEntities.remove("minecraft:commandblock_minecart"));
        registerEntities.put("minecraft:end_crystal", registerEntities.remove("minecraft:ender_crystal"));
        registerEntities.put("minecraft:snow_golem", registerEntities.remove("minecraft:snowman"));
        registerEntities.put("minecraft:evoker", registerEntities.remove("minecraft:evocation_illager"));
        registerEntities.put("minecraft:evoker_fangs", registerEntities.remove("minecraft:evocation_fangs"));
        registerEntities.put("minecraft:illusioner", registerEntities.remove("minecraft:illusion_illager"));
        registerEntities.put("minecraft:vindicator", registerEntities.remove("minecraft:vindication_illager"));
        registerEntities.put("minecraft:iron_golem", registerEntities.remove("minecraft:villager_golem"));
        registerEntities.put("minecraft:experience_orb", registerEntities.remove("minecraft:xp_orb"));
        registerEntities.put("minecraft:experience_bottle", registerEntities.remove("minecraft:xp_bottle"));
        registerEntities.put("minecraft:eye_of_ender", registerEntities.remove("minecraft:eye_of_ender_signal"));
        registerEntities.put("minecraft:firework_rocket", registerEntities.remove("minecraft:fireworks_rocket"));
        return registerEntities;
    }
}
