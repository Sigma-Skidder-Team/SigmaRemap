// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.function.Function;
import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import com.mojang.datafixers.DataFix;

public class Class8790 extends DataFix
{
    public static final Map<String, String> field36945;
    
    public Class8790(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        final Type named = DSL.named(Class9451.field40634.typeName(), DSL.namespacedString());
        if (Objects.equals(named, this.getInputSchema().getType(Class9451.field40634))) {
            return this.fixTypeEverywhere("Biomes fix", named, p0 -> pair -> pair.mapSecond(s -> Class8790.field36945.getOrDefault(s, s)));
        }
        throw new IllegalStateException("Biome type is not what was expected.");
    }
    
    static {
        field36945 = (Map)ImmutableMap.builder().put((Object)"minecraft:extreme_hills", (Object)"minecraft:mountains").put((Object)"minecraft:swampland", (Object)"minecraft:swamp").put((Object)"minecraft:hell", (Object)"minecraft:nether").put((Object)"minecraft:sky", (Object)"minecraft:the_end").put((Object)"minecraft:ice_flats", (Object)"minecraft:snowy_tundra").put((Object)"minecraft:ice_mountains", (Object)"minecraft:snowy_mountains").put((Object)"minecraft:mushroom_island", (Object)"minecraft:mushroom_fields").put((Object)"minecraft:mushroom_island_shore", (Object)"minecraft:mushroom_field_shore").put((Object)"minecraft:beaches", (Object)"minecraft:beach").put((Object)"minecraft:forest_hills", (Object)"minecraft:wooded_hills").put((Object)"minecraft:smaller_extreme_hills", (Object)"minecraft:mountain_edge").put((Object)"minecraft:stone_beach", (Object)"minecraft:stone_shore").put((Object)"minecraft:cold_beach", (Object)"minecraft:snowy_beach").put((Object)"minecraft:roofed_forest", (Object)"minecraft:dark_forest").put((Object)"minecraft:taiga_cold", (Object)"minecraft:snowy_taiga").put((Object)"minecraft:taiga_cold_hills", (Object)"minecraft:snowy_taiga_hills").put((Object)"minecraft:redwood_taiga", (Object)"minecraft:giant_tree_taiga").put((Object)"minecraft:redwood_taiga_hills", (Object)"minecraft:giant_tree_taiga_hills").put((Object)"minecraft:extreme_hills_with_trees", (Object)"minecraft:wooded_mountains").put((Object)"minecraft:savanna_rock", (Object)"minecraft:savanna_plateau").put((Object)"minecraft:mesa", (Object)"minecraft:badlands").put((Object)"minecraft:mesa_rock", (Object)"minecraft:wooded_badlands_plateau").put((Object)"minecraft:mesa_clear_rock", (Object)"minecraft:badlands_plateau").put((Object)"minecraft:sky_island_low", (Object)"minecraft:small_end_islands").put((Object)"minecraft:sky_island_medium", (Object)"minecraft:end_midlands").put((Object)"minecraft:sky_island_high", (Object)"minecraft:end_highlands").put((Object)"minecraft:sky_island_barren", (Object)"minecraft:end_barrens").put((Object)"minecraft:void", (Object)"minecraft:the_void").put((Object)"minecraft:mutated_plains", (Object)"minecraft:sunflower_plains").put((Object)"minecraft:mutated_desert", (Object)"minecraft:desert_lakes").put((Object)"minecraft:mutated_extreme_hills", (Object)"minecraft:gravelly_mountains").put((Object)"minecraft:mutated_forest", (Object)"minecraft:flower_forest").put((Object)"minecraft:mutated_taiga", (Object)"minecraft:taiga_mountains").put((Object)"minecraft:mutated_swampland", (Object)"minecraft:swamp_hills").put((Object)"minecraft:mutated_ice_flats", (Object)"minecraft:ice_spikes").put((Object)"minecraft:mutated_jungle", (Object)"minecraft:modified_jungle").put((Object)"minecraft:mutated_jungle_edge", (Object)"minecraft:modified_jungle_edge").put((Object)"minecraft:mutated_birch_forest", (Object)"minecraft:tall_birch_forest").put((Object)"minecraft:mutated_birch_forest_hills", (Object)"minecraft:tall_birch_hills").put((Object)"minecraft:mutated_roofed_forest", (Object)"minecraft:dark_forest_hills").put((Object)"minecraft:mutated_taiga_cold", (Object)"minecraft:snowy_taiga_mountains").put((Object)"minecraft:mutated_redwood_taiga", (Object)"minecraft:giant_spruce_taiga").put((Object)"minecraft:mutated_redwood_taiga_hills", (Object)"minecraft:giant_spruce_taiga_hills").put((Object)"minecraft:mutated_extreme_hills_with_trees", (Object)"minecraft:modified_gravelly_mountains").put((Object)"minecraft:mutated_savanna", (Object)"minecraft:shattered_savanna").put((Object)"minecraft:mutated_savanna_rock", (Object)"minecraft:shattered_savanna_plateau").put((Object)"minecraft:mutated_mesa", (Object)"minecraft:eroded_badlands").put((Object)"minecraft:mutated_mesa_rock", (Object)"minecraft:modified_wooded_badlands_plateau").put((Object)"minecraft:mutated_mesa_clear_rock", (Object)"minecraft:modified_badlands_plateau").put((Object)"minecraft:warm_deep_ocean", (Object)"minecraft:deep_warm_ocean").put((Object)"minecraft:lukewarm_deep_ocean", (Object)"minecraft:deep_lukewarm_ocean").put((Object)"minecraft:cold_deep_ocean", (Object)"minecraft:deep_cold_ocean").put((Object)"minecraft:frozen_deep_ocean", (Object)"minecraft:deep_frozen_ocean").build();
    }
}
