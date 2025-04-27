// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;

public class Class4140 extends Class4139
{
    public static final Map<String, String> field18262;
    public static final Map<String, String> field18263;
    
    public Class4140(final Schema schema, final boolean b) {
        super("EntityCodSalmonFix", schema, b);
    }
    
    @Override
    public String method12372(final String s) {
        return Class4140.field18262.getOrDefault(s, s);
    }
    
    static {
        field18262 = (Map)ImmutableMap.builder().put("minecraft:salmon_mob", "minecraft:salmon").put("minecraft:cod_mob", "minecraft:cod").build();
        field18263 = (Map)ImmutableMap.builder().put("minecraft:salmon_mob_spawn_egg", "minecraft:salmon_spawn_egg").put("minecraft:cod_mob_spawn_egg", "minecraft:cod_spawn_egg").build();
    }
}
