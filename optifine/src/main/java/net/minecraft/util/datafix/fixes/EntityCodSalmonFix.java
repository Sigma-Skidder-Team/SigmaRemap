package net.minecraft.util.datafix.fixes;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;

public class EntityCodSalmonFix extends TypedEntityRenameHelper
{
    public static final Map<String, String> field_207460_a = ImmutableMap.<String, String>builder().put("minecraft:salmon_mob", "minecraft:salmon").put("minecraft:cod_mob", "minecraft:cod").build();
    public static final Map<String, String> field_209759_b = ImmutableMap.<String, String>builder().put("minecraft:salmon_mob_spawn_egg", "minecraft:salmon_spawn_egg").put("minecraft:cod_mob_spawn_egg", "minecraft:cod_spawn_egg").build();

    public EntityCodSalmonFix(Schema p_i3138_1_, boolean p_i3138_2_)
    {
        super("EntityCodSalmonFix", p_i3138_1_, p_i3138_2_);
    }

    protected String rename(String name)
    {
        return field_207460_a.getOrDefault(name, name);
    }
}
