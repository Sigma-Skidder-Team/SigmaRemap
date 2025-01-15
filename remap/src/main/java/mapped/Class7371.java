// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DataFixUtils;
import com.google.common.collect.Maps;
import java.util.HashMap;
import com.mojang.datafixers.util.Pair;
import java.util.function.Function;
import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import com.mojang.datafixers.DataFix;

public class Class7371 extends DataFix
{
    private static final Map<String, String> field28419;
    
    public Class7371(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return TypeRewriteRule.seq(this.convertUnchecked("item stack block entity name hook converter", this.getInputSchema().getType(Class9451.field40622), this.getOutputSchema().getType(Class9451.field40622)), this.fixTypeEverywhere("BlockEntityIdFix", (Type)this.getInputSchema().findChoiceType(Class9451.field40621), (Type)this.getOutputSchema().findChoiceType(Class9451.field40621), p0 -> pair -> pair.mapFirst(s -> Class7371.field28419.getOrDefault(s, s))));
    }
    
    static {
        field28419 = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap -> {
            hashMap.put("Airportal", "minecraft:end_portal");
            hashMap.put("Banner", "minecraft:banner");
            hashMap.put("Beacon", "minecraft:beacon");
            hashMap.put("Cauldron", "minecraft:brewing_stand");
            hashMap.put("Chest", "minecraft:chest");
            hashMap.put("Comparator", "minecraft:comparator");
            hashMap.put("Control", "minecraft:command_block");
            hashMap.put("DLDetector", "minecraft:daylight_detector");
            hashMap.put("Dropper", "minecraft:dropper");
            hashMap.put("EnchantTable", "minecraft:enchanting_table");
            hashMap.put("EndGateway", "minecraft:end_gateway");
            hashMap.put("EnderChest", "minecraft:ender_chest");
            hashMap.put("FlowerPot", "minecraft:flower_pot");
            hashMap.put("Furnace", "minecraft:furnace");
            hashMap.put("Hopper", "minecraft:hopper");
            hashMap.put("MobSpawner", "minecraft:mob_spawner");
            hashMap.put("Music", "minecraft:noteblock");
            hashMap.put("Piston", "minecraft:piston");
            hashMap.put("RecordPlayer", "minecraft:jukebox");
            hashMap.put("Sign", "minecraft:sign");
            hashMap.put("Skull", "minecraft:skull");
            hashMap.put("Structure", "minecraft:structure_block");
            hashMap.put("Trap", "minecraft:dispenser");
        });
    }
}
