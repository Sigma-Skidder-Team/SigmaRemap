// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap;
import java.util.Objects;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;

public class Class4143 extends Class4139
{
    public static final Map<String, String> field18267;
    
    public Class4143(final Schema schema, final boolean b) {
        super("EntityPufferfishRenameFix", schema, b);
    }
    
    @Override
    public String method12372(final String b) {
        return Objects.equals("minecraft:puffer_fish", b) ? "minecraft:pufferfish" : b;
    }
    
    static {
        field18267 = (Map)ImmutableMap.builder().put("minecraft:puffer_fish_spawn_egg", "minecraft:pufferfish_spawn_egg").build();
    }
}
