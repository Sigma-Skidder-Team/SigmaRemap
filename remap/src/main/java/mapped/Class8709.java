// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;

public class Class8709 extends Class8708
{
    private static final Map<String, String> field36596;
    
    public Class8709(final Schema schema, final boolean b) {
        super(schema, b, "Recipes renamening fix", s -> Class8709.field36596.getOrDefault(s, s));
    }
    
    static {
        field36596 = (Map)ImmutableMap.builder().put("minecraft:acacia_bark", "minecraft:acacia_wood").put("minecraft:birch_bark", "minecraft:birch_wood").put("minecraft:dark_oak_bark", "minecraft:dark_oak_wood").put("minecraft:jungle_bark", "minecraft:jungle_wood").put("minecraft:oak_bark", "minecraft:oak_wood").put("minecraft:spruce_bark", "minecraft:spruce_wood").build();
    }
}
