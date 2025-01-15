package net.minecraft.util.datafix.versions;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class V0702 extends Schema
{
    public V0702(int p_i3425_1_, Schema p_i3425_2_)
    {
        super(p_i3425_1_, p_i3425_2_);
    }

    protected static void registerEntity(Schema schema, Map<String, Supplier<TypeTemplate>> map, String name)
    {
        schema.register(map, name, () ->
        {
            return V0100.equipment(schema);
        });
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema p_registerEntities_1_)
    {
        Map<String, Supplier<TypeTemplate>> map = super.registerEntities(p_registerEntities_1_);
        registerEntity(p_registerEntities_1_, map, "ZombieVillager");
        registerEntity(p_registerEntities_1_, map, "Husk");
        return map;
    }
}
