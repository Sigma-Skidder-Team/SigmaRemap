package net.minecraft.util.datafix.versions;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class V0107 extends Schema
{
    public V0107(int p_i2126_1_, Schema p_i2126_2_)
    {
        super(p_i2126_1_, p_i2126_2_);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema p_registerEntities_1_)
    {
        Map<String, Supplier<TypeTemplate>> map = super.registerEntities(p_registerEntities_1_);
        map.remove("Minecart");
        return map;
    }
}
