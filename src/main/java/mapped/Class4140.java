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
        field18262 = (Map)ImmutableMap.builder().put((Object)"minecraft:salmon_mob", (Object)"minecraft:salmon").put((Object)"minecraft:cod_mob", (Object)"minecraft:cod").build();
        field18263 = (Map)ImmutableMap.builder().put((Object)"minecraft:salmon_mob_spawn_egg", (Object)"minecraft:salmon_spawn_egg").put((Object)"minecraft:cod_mob_spawn_egg", (Object)"minecraft:cod_spawn_egg").build();
    }
}
