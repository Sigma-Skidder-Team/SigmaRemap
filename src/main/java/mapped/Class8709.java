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
        field36596 = (Map)ImmutableMap.builder().put((Object)"minecraft:acacia_bark", (Object)"minecraft:acacia_wood").put((Object)"minecraft:birch_bark", (Object)"minecraft:birch_wood").put((Object)"minecraft:dark_oak_bark", (Object)"minecraft:dark_oak_wood").put((Object)"minecraft:jungle_bark", (Object)"minecraft:jungle_wood").put((Object)"minecraft:oak_bark", (Object)"minecraft:oak_wood").put((Object)"minecraft:spruce_bark", (Object)"minecraft:spruce_wood").build();
    }
}
