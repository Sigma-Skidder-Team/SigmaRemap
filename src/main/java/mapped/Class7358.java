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
            return typed.updateTyped(opticFinder, typed2 -> typed2.update(DSL.remainderFinder(), dynamic -> this.method22600((Dynamic<?>)typed3.get(DSL.remainderFinder()), (Dynamic<?>)dynamic)));
        });
    }
    
    private Dynamic<?> method22600(final Dynamic<?> dynamic, Dynamic<?> set) {
        final String string = dynamic.get("id").asString("");
        if (Class7358.field28392.containsKey((Object)string)) {
            final Pair pair = (Pair)Class7358.field28392.get((Object)string);
            if (((String)pair.getFirst()).equals(set.get("id").asString(""))) {
                final String string2 = set.get("Template").asString("");
                set = set.set("Template", set.createString((String)((ImmutableMap)pair.getSecond()).getOrDefault((Object)string2, (Object)string2)));
            }
        }
        return (Dynamic<?>)set;
    }
    
    static {
        field28392 = ImmutableMap.builder().put((Object)"EndCity", (Object)Pair.of((Object)"ECP", (Object)ImmutableMap.builder().put((Object)"second_floor", (Object)"second_floor_1").put((Object)"third_floor", (Object)"third_floor_1").put((Object)"third_floor_c", (Object)"third_floor_2").build())).put((Object)"Mansion", (Object)Pair.of((Object)"WMP", (Object)ImmutableMap.builder().put((Object)"carpet_south", (Object)"carpet_south_1").put((Object)"carpet_west", (Object)"carpet_west_1").put((Object)"indoors_door", (Object)"indoors_door_1").put((Object)"indoors_wall", (Object)"indoors_wall_1").build())).put((Object)"Igloo", (Object)Pair.of((Object)"Iglu", (Object)ImmutableMap.builder().put((Object)"minecraft:igloo/igloo_bottom", (Object)"minecraft:igloo/bottom").put((Object)"minecraft:igloo/igloo_middle", (Object)"minecraft:igloo/middle").put((Object)"minecraft:igloo/igloo_top", (Object)"minecraft:igloo/top").build())).put((Object)"Ocean_Ruin", (Object)Pair.of((Object)"ORP", (Object)ImmutableMap.builder().put((Object)"minecraft:ruin/big_ruin1_brick", (Object)"minecraft:underwater_ruin/big_brick_1").put((Object)"minecraft:ruin/big_ruin2_brick", (Object)"minecraft:underwater_ruin/big_brick_2").put((Object)"minecraft:ruin/big_ruin3_brick", (Object)"minecraft:underwater_ruin/big_brick_3").put((Object)"minecraft:ruin/big_ruin8_brick", (Object)"minecraft:underwater_ruin/big_brick_8").put((Object)"minecraft:ruin/big_ruin1_cracked", (Object)"minecraft:underwater_ruin/big_cracked_1").put((Object)"minecraft:ruin/big_ruin2_cracked", (Object)"minecraft:underwater_ruin/big_cracked_2").put((Object)"minecraft:ruin/big_ruin3_cracked", (Object)"minecraft:underwater_ruin/big_cracked_3").put((Object)"minecraft:ruin/big_ruin8_cracked", (Object)"minecraft:underwater_ruin/big_cracked_8").put((Object)"minecraft:ruin/big_ruin1_mossy", (Object)"minecraft:underwater_ruin/big_mossy_1").put((Object)"minecraft:ruin/big_ruin2_mossy", (Object)"minecraft:underwater_ruin/big_mossy_2").put((Object)"minecraft:ruin/big_ruin3_mossy", (Object)"minecraft:underwater_ruin/big_mossy_3").put((Object)"minecraft:ruin/big_ruin8_mossy", (Object)"minecraft:underwater_ruin/big_mossy_8").put((Object)"minecraft:ruin/big_ruin_warm4", (Object)"minecraft:underwater_ruin/big_warm_4").put((Object)"minecraft:ruin/big_ruin_warm5", (Object)"minecraft:underwater_ruin/big_warm_5").put((Object)"minecraft:ruin/big_ruin_warm6", (Object)"minecraft:underwater_ruin/big_warm_6").put((Object)"minecraft:ruin/big_ruin_warm7", (Object)"minecraft:underwater_ruin/big_warm_7").put((Object)"minecraft:ruin/ruin1_brick", (Object)"minecraft:underwater_ruin/brick_1").put((Object)"minecraft:ruin/ruin2_brick", (Object)"minecraft:underwater_ruin/brick_2").put((Object)"minecraft:ruin/ruin3_brick", (Object)"minecraft:underwater_ruin/brick_3").put((Object)"minecraft:ruin/ruin4_brick", (Object)"minecraft:underwater_ruin/brick_4").put((Object)"minecraft:ruin/ruin5_brick", (Object)"minecraft:underwater_ruin/brick_5").put((Object)"minecraft:ruin/ruin6_brick", (Object)"minecraft:underwater_ruin/brick_6").put((Object)"minecraft:ruin/ruin7_brick", (Object)"minecraft:underwater_ruin/brick_7").put((Object)"minecraft:ruin/ruin8_brick", (Object)"minecraft:underwater_ruin/brick_8").put((Object)"minecraft:ruin/ruin1_cracked", (Object)"minecraft:underwater_ruin/cracked_1").put((Object)"minecraft:ruin/ruin2_cracked", (Object)"minecraft:underwater_ruin/cracked_2").put((Object)"minecraft:ruin/ruin3_cracked", (Object)"minecraft:underwater_ruin/cracked_3").put((Object)"minecraft:ruin/ruin4_cracked", (Object)"minecraft:underwater_ruin/cracked_4").put((Object)"minecraft:ruin/ruin5_cracked", (Object)"minecraft:underwater_ruin/cracked_5").put((Object)"minecraft:ruin/ruin6_cracked", (Object)"minecraft:underwater_ruin/cracked_6").put((Object)"minecraft:ruin/ruin7_cracked", (Object)"minecraft:underwater_ruin/cracked_7").put((Object)"minecraft:ruin/ruin8_cracked", (Object)"minecraft:underwater_ruin/cracked_8").put((Object)"minecraft:ruin/ruin1_mossy", (Object)"minecraft:underwater_ruin/mossy_1").put((Object)"minecraft:ruin/ruin2_mossy", (Object)"minecraft:underwater_ruin/mossy_2").put((Object)"minecraft:ruin/ruin3_mossy", (Object)"minecraft:underwater_ruin/mossy_3").put((Object)"minecraft:ruin/ruin4_mossy", (Object)"minecraft:underwater_ruin/mossy_4").put((Object)"minecraft:ruin/ruin5_mossy", (Object)"minecraft:underwater_ruin/mossy_5").put((Object)"minecraft:ruin/ruin6_mossy", (Object)"minecraft:underwater_ruin/mossy_6").put((Object)"minecraft:ruin/ruin7_mossy", (Object)"minecraft:underwater_ruin/mossy_7").put((Object)"minecraft:ruin/ruin8_mossy", (Object)"minecraft:underwater_ruin/mossy_8").put((Object)"minecraft:ruin/ruin_warm1", (Object)"minecraft:underwater_ruin/warm_1").put((Object)"minecraft:ruin/ruin_warm2", (Object)"minecraft:underwater_ruin/warm_2").put((Object)"minecraft:ruin/ruin_warm3", (Object)"minecraft:underwater_ruin/warm_3").put((Object)"minecraft:ruin/ruin_warm4", (Object)"minecraft:underwater_ruin/warm_4").put((Object)"minecraft:ruin/ruin_warm5", (Object)"minecraft:underwater_ruin/warm_5").put((Object)"minecraft:ruin/ruin_warm6", (Object)"minecraft:underwater_ruin/warm_6").put((Object)"minecraft:ruin/ruin_warm7", (Object)"minecraft:underwater_ruin/warm_7").put((Object)"minecraft:ruin/ruin_warm8", (Object)"minecraft:underwater_ruin/warm_8").put((Object)"minecraft:ruin/big_brick_1", (Object)"minecraft:underwater_ruin/big_brick_1").put((Object)"minecraft:ruin/big_brick_2", (Object)"minecraft:underwater_ruin/big_brick_2").put((Object)"minecraft:ruin/big_brick_3", (Object)"minecraft:underwater_ruin/big_brick_3").put((Object)"minecraft:ruin/big_brick_8", (Object)"minecraft:underwater_ruin/big_brick_8").put((Object)"minecraft:ruin/big_mossy_1", (Object)"minecraft:underwater_ruin/big_mossy_1").put((Object)"minecraft:ruin/big_mossy_2", (Object)"minecraft:underwater_ruin/big_mossy_2").put((Object)"minecraft:ruin/big_mossy_3", (Object)"minecraft:underwater_ruin/big_mossy_3").put((Object)"minecraft:ruin/big_mossy_8", (Object)"minecraft:underwater_ruin/big_mossy_8").put((Object)"minecraft:ruin/big_cracked_1", (Object)"minecraft:underwater_ruin/big_cracked_1").put((Object)"minecraft:ruin/big_cracked_2", (Object)"minecraft:underwater_ruin/big_cracked_2").put((Object)"minecraft:ruin/big_cracked_3", (Object)"minecraft:underwater_ruin/big_cracked_3").put((Object)"minecraft:ruin/big_cracked_8", (Object)"minecraft:underwater_ruin/big_cracked_8").put((Object)"minecraft:ruin/big_warm_4", (Object)"minecraft:underwater_ruin/big_warm_4").put((Object)"minecraft:ruin/big_warm_5", (Object)"minecraft:underwater_ruin/big_warm_5").put((Object)"minecraft:ruin/big_warm_6", (Object)"minecraft:underwater_ruin/big_warm_6").put((Object)"minecraft:ruin/big_warm_7", (Object)"minecraft:underwater_ruin/big_warm_7").build())).build();
    }
}
