// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap;
import java.util.Objects;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;

public class Class4138 extends Class4139
{
    public static final Map<String, String> field18260;
    
    public Class4138(final Schema schema, final boolean b) {
        super("EntityRavagerRenameFix", schema, b);
    }
    
    @Override
    public String method12372(final String b) {
        return Objects.equals("minecraft:illager_beast", b) ? "minecraft:ravager" : b;
    }
    
    static {
        field18260 = (Map)ImmutableMap.builder().put((Object)"minecraft:illager_beast_spawn_egg", (Object)"minecraft:ravager_spawn_egg").build();
    }
}
