package net.minecraft.util.datafix.versions;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;
import net.minecraft.util.datafix.NamespacedSchema;

public class V1486 extends NamespacedSchema
{
    public V1486(int p_i3202_1_, Schema p_i3202_2_)
    {
        super(p_i3202_1_, p_i3202_2_);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema p_registerEntities_1_)
    {
        Map<String, Supplier<TypeTemplate>> map = super.registerEntities(p_registerEntities_1_);
        map.put("minecraft:cod", map.remove("minecraft:cod_mob"));
        map.put("minecraft:salmon", map.remove("minecraft:salmon_mob"));
        return map;
    }
}
