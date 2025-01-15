// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DataFixUtils;
import java.util.HashMap;
import com.google.common.collect.Maps;
import java.util.Objects;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.DSL$TypeReference;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.function.Supplier;
import com.mojang.datafixers.types.templates.Hook$HookFunction;
import java.util.Map;
import com.mojang.datafixers.schemas.Schema;

public class Class9327 extends Schema
{
    public static final Map<String, String> field40036;
    public static final Hook$HookFunction field40037;
    
    public Class9327(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public static void method34552(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final String s) {
        schema.register((Map)map, s, () -> DSL.optionalFields("Items", DSL.list(Class9451.field40622.in(schema2))));
    }
    
    public Type<?> getChoiceType(final DSL$TypeReference dsl$TypeReference, final String s) {
        return (Type<?>)(Objects.equals(dsl$TypeReference.typeName(), Class9451.field40621.typeName()) ? super.getChoiceType(dsl$TypeReference, Class5174.method16141(s)) : super.getChoiceType(dsl$TypeReference, s));
    }
    
    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(final Schema schema) {
        final HashMap hashMap = Maps.newHashMap();
        method34552(schema, hashMap, "minecraft:furnace");
        method34552(schema, hashMap, "minecraft:chest");
        schema.registerSimple((Map)hashMap, "minecraft:ender_chest");
        schema.register((Map)hashMap, "minecraft:jukebox", p1 -> DSL.optionalFields("RecordItem", Class9451.field40622.in(schema2)));
        method34552(schema, hashMap, "minecraft:dispenser");
        method34552(schema, hashMap, "minecraft:dropper");
        schema.registerSimple((Map)hashMap, "minecraft:sign");
        schema.register((Map)hashMap, "minecraft:mob_spawner", p1 -> Class9451.field40629.in(schema3));
        schema.registerSimple((Map)hashMap, "minecraft:noteblock");
        schema.registerSimple((Map)hashMap, "minecraft:piston");
        method34552(schema, hashMap, "minecraft:brewing_stand");
        schema.registerSimple((Map)hashMap, "minecraft:enchanting_table");
        schema.registerSimple((Map)hashMap, "minecraft:end_portal");
        schema.registerSimple((Map)hashMap, "minecraft:beacon");
        schema.registerSimple((Map)hashMap, "minecraft:skull");
        schema.registerSimple((Map)hashMap, "minecraft:daylight_detector");
        method34552(schema, hashMap, "minecraft:hopper");
        schema.registerSimple((Map)hashMap, "minecraft:comparator");
        schema.register((Map)hashMap, "minecraft:flower_pot", p1 -> DSL.optionalFields("Item", DSL.or(DSL.constType(DSL.intType()), Class9451.field40628.in(schema4))));
        schema.registerSimple((Map)hashMap, "minecraft:banner");
        schema.registerSimple((Map)hashMap, "minecraft:structure_block");
        schema.registerSimple((Map)hashMap, "minecraft:end_gateway");
        schema.registerSimple((Map)hashMap, "minecraft:command_block");
        return hashMap;
    }
    
    public void registerTypes(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, (Map)map, (Map)map2);
        schema.registerType(false, Class9451.field40621, () -> DSL.taggedChoiceLazy("id", DSL.namespacedString(), map3));
        schema.registerType(true, Class9451.field40622, () -> DSL.hook(DSL.optionalFields("id", Class9451.field40628.in(schema2), "tag", DSL.optionalFields("EntityTag", Class9451.field40625.in(schema2), "BlockEntityTag", Class9451.field40621.in(schema2), "CanDestroy", DSL.list(Class9451.field40627.in(schema2)), "CanPlaceOn", DSL.list(Class9451.field40627.in(schema2)))), Class9327.field40037, Hook$HookFunction.IDENTITY));
    }
    
    static {
        field40036 = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap -> {
            hashMap.put("minecraft:furnace", "minecraft:furnace");
            hashMap.put("minecraft:lit_furnace", "minecraft:furnace");
            hashMap.put("minecraft:chest", "minecraft:chest");
            hashMap.put("minecraft:trapped_chest", "minecraft:chest");
            hashMap.put("minecraft:ender_chest", "minecraft:ender_chest");
            hashMap.put("minecraft:jukebox", "minecraft:jukebox");
            hashMap.put("minecraft:dispenser", "minecraft:dispenser");
            hashMap.put("minecraft:dropper", "minecraft:dropper");
            hashMap.put("minecraft:sign", "minecraft:sign");
            hashMap.put("minecraft:mob_spawner", "minecraft:mob_spawner");
            hashMap.put("minecraft:noteblock", "minecraft:noteblock");
            hashMap.put("minecraft:brewing_stand", "minecraft:brewing_stand");
            hashMap.put("minecraft:enhanting_table", "minecraft:enchanting_table");
            hashMap.put("minecraft:command_block", "minecraft:command_block");
            hashMap.put("minecraft:beacon", "minecraft:beacon");
            hashMap.put("minecraft:skull", "minecraft:skull");
            hashMap.put("minecraft:daylight_detector", "minecraft:daylight_detector");
            hashMap.put("minecraft:hopper", "minecraft:hopper");
            hashMap.put("minecraft:banner", "minecraft:banner");
            hashMap.put("minecraft:flower_pot", "minecraft:flower_pot");
            hashMap.put("minecraft:repeating_command_block", "minecraft:command_block");
            hashMap.put("minecraft:chain_command_block", "minecraft:command_block");
            hashMap.put("minecraft:shulker_box", "minecraft:shulker_box");
            hashMap.put("minecraft:white_shulker_box", "minecraft:shulker_box");
            hashMap.put("minecraft:orange_shulker_box", "minecraft:shulker_box");
            hashMap.put("minecraft:magenta_shulker_box", "minecraft:shulker_box");
            hashMap.put("minecraft:light_blue_shulker_box", "minecraft:shulker_box");
            hashMap.put("minecraft:yellow_shulker_box", "minecraft:shulker_box");
            hashMap.put("minecraft:lime_shulker_box", "minecraft:shulker_box");
            hashMap.put("minecraft:pink_shulker_box", "minecraft:shulker_box");
            hashMap.put("minecraft:gray_shulker_box", "minecraft:shulker_box");
            hashMap.put("minecraft:silver_shulker_box", "minecraft:shulker_box");
            hashMap.put("minecraft:cyan_shulker_box", "minecraft:shulker_box");
            hashMap.put("minecraft:purple_shulker_box", "minecraft:shulker_box");
            hashMap.put("minecraft:blue_shulker_box", "minecraft:shulker_box");
            hashMap.put("minecraft:brown_shulker_box", "minecraft:shulker_box");
            hashMap.put("minecraft:green_shulker_box", "minecraft:shulker_box");
            hashMap.put("minecraft:red_shulker_box", "minecraft:shulker_box");
            hashMap.put("minecraft:black_shulker_box", "minecraft:shulker_box");
            hashMap.put("minecraft:bed", "minecraft:bed");
            hashMap.put("minecraft:light_gray_shulker_box", "minecraft:shulker_box");
            hashMap.put("minecraft:banner", "minecraft:banner");
            hashMap.put("minecraft:white_banner", "minecraft:banner");
            hashMap.put("minecraft:orange_banner", "minecraft:banner");
            hashMap.put("minecraft:magenta_banner", "minecraft:banner");
            hashMap.put("minecraft:light_blue_banner", "minecraft:banner");
            hashMap.put("minecraft:yellow_banner", "minecraft:banner");
            hashMap.put("minecraft:lime_banner", "minecraft:banner");
            hashMap.put("minecraft:pink_banner", "minecraft:banner");
            hashMap.put("minecraft:gray_banner", "minecraft:banner");
            hashMap.put("minecraft:silver_banner", "minecraft:banner");
            hashMap.put("minecraft:cyan_banner", "minecraft:banner");
            hashMap.put("minecraft:purple_banner", "minecraft:banner");
            hashMap.put("minecraft:blue_banner", "minecraft:banner");
            hashMap.put("minecraft:brown_banner", "minecraft:banner");
            hashMap.put("minecraft:green_banner", "minecraft:banner");
            hashMap.put("minecraft:red_banner", "minecraft:banner");
            hashMap.put("minecraft:black_banner", "minecraft:banner");
            hashMap.put("minecraft:standing_sign", "minecraft:sign");
            hashMap.put("minecraft:wall_sign", "minecraft:sign");
            hashMap.put("minecraft:piston_head", "minecraft:piston");
            hashMap.put("minecraft:daylight_detector_inverted", "minecraft:daylight_detector");
            hashMap.put("minecraft:unpowered_comparator", "minecraft:comparator");
            hashMap.put("minecraft:powered_comparator", "minecraft:comparator");
            hashMap.put("minecraft:wall_banner", "minecraft:banner");
            hashMap.put("minecraft:standing_banner", "minecraft:banner");
            hashMap.put("minecraft:structure_block", "minecraft:structure_block");
            hashMap.put("minecraft:end_portal", "minecraft:end_portal");
            hashMap.put("minecraft:end_gateway", "minecraft:end_gateway");
            hashMap.put("minecraft:sign", "minecraft:sign");
            hashMap.put("minecraft:shield", "minecraft:banner");
            return;
        });
        field40037 = (Hook$HookFunction)new Class9235();
    }
}
