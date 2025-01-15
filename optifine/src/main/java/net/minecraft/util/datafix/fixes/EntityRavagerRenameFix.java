package net.minecraft.util.datafix.fixes;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import java.util.Objects;

public class EntityRavagerRenameFix extends TypedEntityRenameHelper
{
    public static final Map<String, String> field_219829_a = ImmutableMap.<String, String>builder().put("minecraft:illager_beast_spawn_egg", "minecraft:ravager_spawn_egg").build();

    public EntityRavagerRenameFix(Schema resourcePackFileIn, boolean p_i1287_2_)
    {
        super("EntityRavagerRenameFix", resourcePackFileIn, p_i1287_2_);
    }

    protected String rename(String name)
    {
        return Objects.equals("minecraft:illager_beast", name) ? "minecraft:ravager" : name;
    }
}
