// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DataFix;

public class Class7358 extends DataFix
{
    private static final ImmutableMap<String, Pair<String, ImmutableMap<String, String>>> field28392;
    
    public Class7358(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("ChunkStructuresTemplateRenameFix", this.getInputSchema().getType(Class9451.field40630), typed -> {
            final Type type;
            type.findField("Children");
            return typed.updateTyped(opticFinder, typed2 -> typed2.update(DSL.remainderFinder(), dynamic -> this.method22600((Dynamic<?>)typed3.get(DSL.remainderFinder()), dynamic)));
        });
    }
    
    private Dynamic<?> method22600(final Dynamic<?> dynamic, Dynamic<?> set) {
        final String string = dynamic.get("id").asString("");
        if (Class7358.field28392.containsKey(string)) {
            final Pair pair = Class7358.field28392.get(string);
            if (pair.getFirst().equals(set.get("id").asString(""))) {
                final String string2 = set.get("Template").asString("");
                set = set.set("Template", set.createString((String)((ImmutableMap)pair.getSecond()).getOrDefault(string2, string2)));
            }
        }
        return set;
    }
    
    static {
        field28392 = ImmutableMap.builder().put("EndCity", Pair.of((Object)"ECP", (Object)ImmutableMap.builder().put("second_floor", "second_floor_1").put("third_floor", "third_floor_1").put("third_floor_c", "third_floor_2").build())).put("Mansion", Pair.of((Object)"WMP", (Object)ImmutableMap.builder().put("carpet_south", "carpet_south_1").put("carpet_west", "carpet_west_1").put("indoors_door", "indoors_door_1").put("indoors_wall", "indoors_wall_1").build())).put("Igloo", Pair.of((Object)"Iglu", (Object)ImmutableMap.builder().put("minecraft:igloo/igloo_bottom", "minecraft:igloo/bottom").put("minecraft:igloo/igloo_middle", "minecraft:igloo/middle").put("minecraft:igloo/igloo_top", "minecraft:igloo/top").build())).put("Ocean_Ruin", Pair.of((Object)"ORP", (Object)ImmutableMap.builder().put("minecraft:ruin/big_ruin1_brick", "minecraft:underwater_ruin/big_brick_1").put("minecraft:ruin/big_ruin2_brick", "minecraft:underwater_ruin/big_brick_2").put("minecraft:ruin/big_ruin3_brick", "minecraft:underwater_ruin/big_brick_3").put("minecraft:ruin/big_ruin8_brick", "minecraft:underwater_ruin/big_brick_8").put("minecraft:ruin/big_ruin1_cracked", "minecraft:underwater_ruin/big_cracked_1").put("minecraft:ruin/big_ruin2_cracked", "minecraft:underwater_ruin/big_cracked_2").put("minecraft:ruin/big_ruin3_cracked", "minecraft:underwater_ruin/big_cracked_3").put("minecraft:ruin/big_ruin8_cracked", "minecraft:underwater_ruin/big_cracked_8").put("minecraft:ruin/big_ruin1_mossy", "minecraft:underwater_ruin/big_mossy_1").put("minecraft:ruin/big_ruin2_mossy", "minecraft:underwater_ruin/big_mossy_2").put("minecraft:ruin/big_ruin3_mossy", "minecraft:underwater_ruin/big_mossy_3").put("minecraft:ruin/big_ruin8_mossy", "minecraft:underwater_ruin/big_mossy_8").put("minecraft:ruin/big_ruin_warm4", "minecraft:underwater_ruin/big_warm_4").put("minecraft:ruin/big_ruin_warm5", "minecraft:underwater_ruin/big_warm_5").put("minecraft:ruin/big_ruin_warm6", "minecraft:underwater_ruin/big_warm_6").put("minecraft:ruin/big_ruin_warm7", "minecraft:underwater_ruin/big_warm_7").put("minecraft:ruin/ruin1_brick", "minecraft:underwater_ruin/brick_1").put("minecraft:ruin/ruin2_brick", "minecraft:underwater_ruin/brick_2").put("minecraft:ruin/ruin3_brick", "minecraft:underwater_ruin/brick_3").put("minecraft:ruin/ruin4_brick", "minecraft:underwater_ruin/brick_4").put("minecraft:ruin/ruin5_brick", "minecraft:underwater_ruin/brick_5").put("minecraft:ruin/ruin6_brick", "minecraft:underwater_ruin/brick_6").put("minecraft:ruin/ruin7_brick", "minecraft:underwater_ruin/brick_7").put("minecraft:ruin/ruin8_brick", "minecraft:underwater_ruin/brick_8").put("minecraft:ruin/ruin1_cracked", "minecraft:underwater_ruin/cracked_1").put("minecraft:ruin/ruin2_cracked", "minecraft:underwater_ruin/cracked_2").put("minecraft:ruin/ruin3_cracked", "minecraft:underwater_ruin/cracked_3").put("minecraft:ruin/ruin4_cracked", "minecraft:underwater_ruin/cracked_4").put("minecraft:ruin/ruin5_cracked", "minecraft:underwater_ruin/cracked_5").put("minecraft:ruin/ruin6_cracked", "minecraft:underwater_ruin/cracked_6").put("minecraft:ruin/ruin7_cracked", "minecraft:underwater_ruin/cracked_7").put("minecraft:ruin/ruin8_cracked", "minecraft:underwater_ruin/cracked_8").put("minecraft:ruin/ruin1_mossy", "minecraft:underwater_ruin/mossy_1").put("minecraft:ruin/ruin2_mossy", "minecraft:underwater_ruin/mossy_2").put("minecraft:ruin/ruin3_mossy", "minecraft:underwater_ruin/mossy_3").put("minecraft:ruin/ruin4_mossy", "minecraft:underwater_ruin/mossy_4").put("minecraft:ruin/ruin5_mossy", "minecraft:underwater_ruin/mossy_5").put("minecraft:ruin/ruin6_mossy", "minecraft:underwater_ruin/mossy_6").put("minecraft:ruin/ruin7_mossy", "minecraft:underwater_ruin/mossy_7").put("minecraft:ruin/ruin8_mossy", "minecraft:underwater_ruin/mossy_8").put("minecraft:ruin/ruin_warm1", "minecraft:underwater_ruin/warm_1").put("minecraft:ruin/ruin_warm2", "minecraft:underwater_ruin/warm_2").put("minecraft:ruin/ruin_warm3", "minecraft:underwater_ruin/warm_3").put("minecraft:ruin/ruin_warm4", "minecraft:underwater_ruin/warm_4").put("minecraft:ruin/ruin_warm5", "minecraft:underwater_ruin/warm_5").put("minecraft:ruin/ruin_warm6", "minecraft:underwater_ruin/warm_6").put("minecraft:ruin/ruin_warm7", "minecraft:underwater_ruin/warm_7").put("minecraft:ruin/ruin_warm8", "minecraft:underwater_ruin/warm_8").put("minecraft:ruin/big_brick_1", "minecraft:underwater_ruin/big_brick_1").put("minecraft:ruin/big_brick_2", "minecraft:underwater_ruin/big_brick_2").put("minecraft:ruin/big_brick_3", "minecraft:underwater_ruin/big_brick_3").put("minecraft:ruin/big_brick_8", "minecraft:underwater_ruin/big_brick_8").put("minecraft:ruin/big_mossy_1", "minecraft:underwater_ruin/big_mossy_1").put("minecraft:ruin/big_mossy_2", "minecraft:underwater_ruin/big_mossy_2").put("minecraft:ruin/big_mossy_3", "minecraft:underwater_ruin/big_mossy_3").put("minecraft:ruin/big_mossy_8", "minecraft:underwater_ruin/big_mossy_8").put("minecraft:ruin/big_cracked_1", "minecraft:underwater_ruin/big_cracked_1").put("minecraft:ruin/big_cracked_2", "minecraft:underwater_ruin/big_cracked_2").put("minecraft:ruin/big_cracked_3", "minecraft:underwater_ruin/big_cracked_3").put("minecraft:ruin/big_cracked_8", "minecraft:underwater_ruin/big_cracked_8").put("minecraft:ruin/big_warm_4", "minecraft:underwater_ruin/big_warm_4").put("minecraft:ruin/big_warm_5", "minecraft:underwater_ruin/big_warm_5").put("minecraft:ruin/big_warm_6", "minecraft:underwater_ruin/big_warm_6").put("minecraft:ruin/big_warm_7", "minecraft:underwater_ruin/big_warm_7").build())).build();
    }
}
