package net.minecraft.util.datafix.versions;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class V0143 extends Schema
{
    public V0143(int p_i2449_1_, Schema p_i2449_2_)
    {
        super(p_i2449_1_, p_i2449_2_);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema p_registerEntities_1_)
    {
        Map<String, Supplier<TypeTemplate>> map = super.registerEntities(p_registerEntities_1_);
        map.remove("TippedArrow");
        return map;
    }
}
