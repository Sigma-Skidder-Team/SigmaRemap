package net.minecraft.util.datafix.fixes;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import java.util.Objects;

public class PufferfishRename extends TypedEntityRenameHelper
{
    public static final Map<String, String> field_207461_a = ImmutableMap.<String, String>builder().put("minecraft:puffer_fish_spawn_egg", "minecraft:pufferfish_spawn_egg").build();

    public PufferfishRename(Schema p_i3920_1_, boolean p_i3920_2_)
    {
        super("EntityPufferfishRenameFix", p_i3920_1_, p_i3920_2_);
    }

    protected String rename(String name)
    {
        return Objects.equals("minecraft:puffer_fish", name) ? "minecraft:pufferfish" : name;
    }
}
