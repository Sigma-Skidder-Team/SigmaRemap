// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.types.templates.Hook$HookFunction;
import java.util.HashMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.function.Supplier;
import java.util.Map;
import com.mojang.datafixers.schemas.Schema;

public class Class5192 extends Class5174
{
    public Class5192(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public static void method16208(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final String s) {
        schema.register((Map)map, s, () -> Class9478.method35286(schema2));
    }
    
    public static void method16209(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final String s) {
        schema.register((Map)map, s, () -> DSL.optionalFields("Items", DSL.list(Class9451.field40622.in(schema2))));
    }
    
    public Map<String, Supplier<TypeTemplate>> registerEntities(final Schema schema) {
        final HashMap hashMap = Maps.newHashMap();
        schema.registerSimple((Map)hashMap, "minecraft:area_effect_cloud");
        method16208(schema, hashMap, "minecraft:armor_stand");
        schema.register((Map)hashMap, "minecraft:arrow", p1 -> DSL.optionalFields("inBlockState", Class9451.field40623.in(schema2)));
        method16208(schema, hashMap, "minecraft:bat");
        method16208(schema, hashMap, "minecraft:blaze");
        schema.registerSimple((Map)hashMap, "minecraft:boat");
        method16208(schema, hashMap, "minecraft:cave_spider");
        schema.register((Map)hashMap, "minecraft:chest_minecart", p1 -> DSL.optionalFields("DisplayState", Class9451.field40623.in(schema3), "Items", DSL.list(Class9451.field40622.in(schema3))));
        method16208(schema, hashMap, "minecraft:chicken");
        schema.register((Map)hashMap, "minecraft:commandblock_minecart", p1 -> DSL.optionalFields("DisplayState", Class9451.field40623.in(schema4)));
        method16208(schema, hashMap, "minecraft:cow");
        method16208(schema, hashMap, "minecraft:creeper");
        schema.register((Map)hashMap, "minecraft:donkey", p1 -> DSL.optionalFields("Items", DSL.list(Class9451.field40622.in(schema5)), "SaddleItem", Class9451.field40622.in(schema5), Class9478.method35286(schema5)));
        schema.registerSimple((Map)hashMap, "minecraft:dragon_fireball");
        schema.registerSimple((Map)hashMap, "minecraft:egg");
        method16208(schema, hashMap, "minecraft:elder_guardian");
        schema.registerSimple((Map)hashMap, "minecraft:ender_crystal");
        method16208(schema, hashMap, "minecraft:ender_dragon");
        schema.register((Map)hashMap, "minecraft:enderman", p1 -> DSL.optionalFields("carriedBlockState", Class9451.field40623.in(schema6), Class9478.method35286(schema6)));
        method16208(schema, hashMap, "minecraft:endermite");
        schema.registerSimple((Map)hashMap, "minecraft:ender_pearl");
        schema.registerSimple((Map)hashMap, "minecraft:evocation_fangs");
        method16208(schema, hashMap, "minecraft:evocation_illager");
        schema.registerSimple((Map)hashMap, "minecraft:eye_of_ender_signal");
        schema.register((Map)hashMap, "minecraft:falling_block", p1 -> DSL.optionalFields("BlockState", Class9451.field40623.in(schema7), "TileEntityData", Class9451.field40621.in(schema7)));
        schema.registerSimple((Map)hashMap, "minecraft:fireball");
        schema.register((Map)hashMap, "minecraft:fireworks_rocket", p1 -> DSL.optionalFields("FireworksItem", Class9451.field40622.in(schema8)));
        schema.register((Map)hashMap, "minecraft:furnace_minecart", p1 -> DSL.optionalFields("DisplayState", Class9451.field40623.in(schema9)));
        method16208(schema, hashMap, "minecraft:ghast");
        method16208(schema, hashMap, "minecraft:giant");
        method16208(schema, hashMap, "minecraft:guardian");
        schema.register((Map)hashMap, "minecraft:hopper_minecart", p1 -> DSL.optionalFields("DisplayState", Class9451.field40623.in(schema10), "Items", DSL.list(Class9451.field40622.in(schema10))));
        schema.register((Map)hashMap, "minecraft:horse", p1 -> DSL.optionalFields("ArmorItem", Class9451.field40622.in(schema11), "SaddleItem", Class9451.field40622.in(schema11), Class9478.method35286(schema11)));
        method16208(schema, hashMap, "minecraft:husk");
        schema.registerSimple((Map)hashMap, "minecraft:illusion_illager");
        schema.register((Map)hashMap, "minecraft:item", p1 -> DSL.optionalFields("Item", Class9451.field40622.in(schema12)));
        schema.register((Map)hashMap, "minecraft:item_frame", p1 -> DSL.optionalFields("Item", Class9451.field40622.in(schema13)));
        schema.registerSimple((Map)hashMap, "minecraft:leash_knot");
        schema.register((Map)hashMap, "minecraft:llama", p1 -> DSL.optionalFields("Items", DSL.list(Class9451.field40622.in(schema14)), "SaddleItem", Class9451.field40622.in(schema14), "DecorItem", Class9451.field40622.in(schema14), Class9478.method35286(schema14)));
        schema.registerSimple((Map)hashMap, "minecraft:llama_spit");
        method16208(schema, hashMap, "minecraft:magma_cube");
        schema.register((Map)hashMap, "minecraft:minecart", p1 -> DSL.optionalFields("DisplayState", Class9451.field40623.in(schema15)));
        method16208(schema, hashMap, "minecraft:mooshroom");
        schema.register((Map)hashMap, "minecraft:mule", p1 -> DSL.optionalFields("Items", DSL.list(Class9451.field40622.in(schema16)), "SaddleItem", Class9451.field40622.in(schema16), Class9478.method35286(schema16)));
        method16208(schema, hashMap, "minecraft:ocelot");
        schema.registerSimple((Map)hashMap, "minecraft:painting");
        schema.registerSimple((Map)hashMap, "minecraft:parrot");
        method16208(schema, hashMap, "minecraft:pig");
        method16208(schema, hashMap, "minecraft:polar_bear");
        schema.register((Map)hashMap, "minecraft:potion", p1 -> DSL.optionalFields("Potion", Class9451.field40622.in(schema17)));
        method16208(schema, hashMap, "minecraft:rabbit");
        method16208(schema, hashMap, "minecraft:sheep");
        method16208(schema, hashMap, "minecraft:shulker");
        schema.registerSimple((Map)hashMap, "minecraft:shulker_bullet");
        method16208(schema, hashMap, "minecraft:silverfish");
        method16208(schema, hashMap, "minecraft:skeleton");
        schema.register((Map)hashMap, "minecraft:skeleton_horse", p1 -> DSL.optionalFields("SaddleItem", Class9451.field40622.in(schema18), Class9478.method35286(schema18)));
        method16208(schema, hashMap, "minecraft:slime");
        schema.registerSimple((Map)hashMap, "minecraft:small_fireball");
        schema.registerSimple((Map)hashMap, "minecraft:snowball");
        method16208(schema, hashMap, "minecraft:snowman");
        schema.register((Map)hashMap, "minecraft:spawner_minecart", p1 -> DSL.optionalFields("DisplayState", Class9451.field40623.in(schema19), Class9451.field40629.in(schema19)));
        schema.register((Map)hashMap, "minecraft:spectral_arrow", p1 -> DSL.optionalFields("inBlockState", Class9451.field40623.in(schema20)));
        method16208(schema, hashMap, "minecraft:spider");
        method16208(schema, hashMap, "minecraft:squid");
        method16208(schema, hashMap, "minecraft:stray");
        schema.registerSimple((Map)hashMap, "minecraft:tnt");
        schema.register((Map)hashMap, "minecraft:tnt_minecart", p1 -> DSL.optionalFields("DisplayState", Class9451.field40623.in(schema21)));
        method16208(schema, hashMap, "minecraft:vex");
        schema.register((Map)hashMap, "minecraft:villager", p1 -> DSL.optionalFields("Inventory", DSL.list(Class9451.field40622.in(schema22)), "Offers", DSL.optionalFields("Recipes", DSL.list(DSL.optionalFields("buy", Class9451.field40622.in(schema22), "buyB", Class9451.field40622.in(schema22), "sell", Class9451.field40622.in(schema22)))), Class9478.method35286(schema22)));
        method16208(schema, hashMap, "minecraft:villager_golem");
        method16208(schema, hashMap, "minecraft:vindication_illager");
        method16208(schema, hashMap, "minecraft:witch");
        method16208(schema, hashMap, "minecraft:wither");
        method16208(schema, hashMap, "minecraft:wither_skeleton");
        schema.registerSimple((Map)hashMap, "minecraft:wither_skull");
        method16208(schema, hashMap, "minecraft:wolf");
        schema.registerSimple((Map)hashMap, "minecraft:xp_bottle");
        schema.registerSimple((Map)hashMap, "minecraft:xp_orb");
        method16208(schema, hashMap, "minecraft:zombie");
        schema.register((Map)hashMap, "minecraft:zombie_horse", p1 -> DSL.optionalFields("SaddleItem", Class9451.field40622.in(schema23), Class9478.method35286(schema23)));
        method16208(schema, hashMap, "minecraft:zombie_pigman");
        method16208(schema, hashMap, "minecraft:zombie_villager");
        return hashMap;
    }
    
    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(final Schema schema) {
        final HashMap hashMap = Maps.newHashMap();
        method16209(schema, hashMap, "minecraft:furnace");
        method16209(schema, hashMap, "minecraft:chest");
        method16209(schema, hashMap, "minecraft:trapped_chest");
        schema.registerSimple((Map)hashMap, "minecraft:ender_chest");
        schema.register((Map)hashMap, "minecraft:jukebox", p1 -> DSL.optionalFields("RecordItem", Class9451.field40622.in(schema2)));
        method16209(schema, hashMap, "minecraft:dispenser");
        method16209(schema, hashMap, "minecraft:dropper");
        schema.registerSimple((Map)hashMap, "minecraft:sign");
        schema.register((Map)hashMap, "minecraft:mob_spawner", p1 -> Class9451.field40629.in(schema3));
        schema.register((Map)hashMap, "minecraft:piston", p1 -> DSL.optionalFields("blockState", Class9451.field40623.in(schema4)));
        method16209(schema, hashMap, "minecraft:brewing_stand");
        schema.registerSimple((Map)hashMap, "minecraft:enchanting_table");
        schema.registerSimple((Map)hashMap, "minecraft:end_portal");
        schema.registerSimple((Map)hashMap, "minecraft:beacon");
        schema.registerSimple((Map)hashMap, "minecraft:skull");
        schema.registerSimple((Map)hashMap, "minecraft:daylight_detector");
        method16209(schema, hashMap, "minecraft:hopper");
        schema.registerSimple((Map)hashMap, "minecraft:comparator");
        schema.registerSimple((Map)hashMap, "minecraft:banner");
        schema.registerSimple((Map)hashMap, "minecraft:structure_block");
        schema.registerSimple((Map)hashMap, "minecraft:end_gateway");
        schema.registerSimple((Map)hashMap, "minecraft:command_block");
        method16209(schema, hashMap, "minecraft:shulker_box");
        schema.registerSimple((Map)hashMap, "minecraft:bed");
        return hashMap;
    }
    
    public void registerTypes(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final Map<String, Supplier<TypeTemplate>> map2) {
        schema.registerType(false, Class9451.field40611, (Supplier)DSL::remainder);
        schema.registerType(false, Class9451.field40633, () -> DSL.constType(DSL.namespacedString()));
        schema.registerType(false, Class9451.field40612, () -> DSL.optionalFields("RootVehicle", DSL.optionalFields("Entity", Class9451.field40625.in(schema2)), "Inventory", DSL.list(Class9451.field40622.in(schema2)), "EnderItems", DSL.list(Class9451.field40622.in(schema2)), DSL.optionalFields("ShoulderEntityLeft", Class9451.field40625.in(schema2), "ShoulderEntityRight", Class9451.field40625.in(schema2), "recipeBook", DSL.optionalFields("recipes", DSL.list(Class9451.field40633.in(schema2)), "toBeDisplayed", DSL.list(Class9451.field40633.in(schema2))))));
        schema.registerType(false, Class9451.field40613, () -> DSL.fields("Level", DSL.optionalFields("Entities", DSL.list(Class9451.field40625.in(schema3)), "TileEntities", DSL.list(Class9451.field40621.in(schema3)), "TileTicks", DSL.list(DSL.fields("i", Class9451.field40627.in(schema3))), "Sections", DSL.list(DSL.optionalFields("Palette", DSL.list(Class9451.field40623.in(schema3)))))));
        schema.registerType(true, Class9451.field40621, () -> DSL.taggedChoiceLazy("id", DSL.namespacedString(), map3));
        schema.registerType(true, Class9451.field40625, () -> DSL.optionalFields("Passengers", DSL.list(Class9451.field40625.in(schema4)), Class9451.field40626.in(schema4)));
        schema.registerType(true, Class9451.field40626, () -> DSL.taggedChoiceLazy("id", DSL.namespacedString(), map4));
        schema.registerType(true, Class9451.field40622, () -> DSL.hook(DSL.optionalFields("id", Class9451.field40628.in(schema5), "tag", DSL.optionalFields("EntityTag", Class9451.field40625.in(schema5), "BlockEntityTag", Class9451.field40621.in(schema5), "CanDestroy", DSL.list(Class9451.field40627.in(schema5)), "CanPlaceOn", DSL.list(Class9451.field40627.in(schema5)))), Class5189.field22199, Hook$HookFunction.IDENTITY));
        schema.registerType(false, Class9451.field40614, () -> DSL.compoundList(DSL.list(Class9451.field40622.in(schema6))));
        schema.registerType(false, Class9451.field40615, (Supplier)DSL::remainder);
        schema.registerType(false, Class9451.field40616, () -> DSL.optionalFields("entities", DSL.list(DSL.optionalFields("nbt", Class9451.field40625.in(schema7))), "blocks", DSL.list(DSL.optionalFields("nbt", Class9451.field40621.in(schema7))), "palette", DSL.list(Class9451.field40623.in(schema7))));
        schema.registerType(false, Class9451.field40627, () -> DSL.constType(DSL.namespacedString()));
        schema.registerType(false, Class9451.field40628, () -> DSL.constType(DSL.namespacedString()));
        schema.registerType(false, Class9451.field40623, (Supplier)DSL::remainder);
        schema.registerType(false, Class9451.field40617, () -> {
            final Object o = () -> {};
            return DSL.optionalFields("stats", DSL.optionalFields("minecraft:mined", DSL.compoundList(Class9451.field40627.in(schema8), DSL.constType(DSL.intType())), "minecraft:crafted", (TypeTemplate)supplier.get(), "minecraft:used", (TypeTemplate)supplier.get(), "minecraft:broken", (TypeTemplate)supplier.get(), "minecraft:picked_up", (TypeTemplate)supplier.get(), DSL.optionalFields("minecraft:dropped", (TypeTemplate)supplier.get(), "minecraft:killed", DSL.compoundList(Class9451.field40624.in(schema8), DSL.constType(DSL.intType())), "minecraft:killed_by", DSL.compoundList(Class9451.field40624.in(schema8), DSL.constType(DSL.intType())), "minecraft:custom", DSL.compoundList(DSL.constType(DSL.namespacedString()), DSL.constType(DSL.intType())))));
        });
        schema.registerType(false, Class9451.field40618, () -> DSL.optionalFields("data", DSL.optionalFields("Features", DSL.compoundList(Class9451.field40630.in(schema9)), "Objectives", DSL.list(Class9451.field40631.in(schema9)), "Teams", DSL.list(Class9451.field40632.in(schema9)))));
        schema.registerType(false, Class9451.field40630, () -> DSL.optionalFields("Children", DSL.list(DSL.optionalFields("CA", Class9451.field40623.in(schema10), "CB", Class9451.field40623.in(schema10), "CC", Class9451.field40623.in(schema10), "CD", Class9451.field40623.in(schema10)))));
        schema.registerType(false, Class9451.field40631, (Supplier)DSL::remainder);
        schema.registerType(false, Class9451.field40632, (Supplier)DSL::remainder);
        schema.registerType(true, Class9451.field40629, () -> DSL.optionalFields("SpawnPotentials", DSL.list(DSL.fields("Entity", Class9451.field40625.in(schema11))), "SpawnData", Class9451.field40625.in(schema11)));
        schema.registerType(false, Class9451.field40619, () -> DSL.optionalFields("minecraft:adventure/adventuring_time", DSL.optionalFields("criteria", DSL.compoundList(Class9451.field40634.in(schema12), DSL.constType(DSL.string()))), "minecraft:adventure/kill_a_mob", DSL.optionalFields("criteria", DSL.compoundList(Class9451.field40624.in(schema12), DSL.constType(DSL.string()))), "minecraft:adventure/kill_all_mobs", DSL.optionalFields("criteria", DSL.compoundList(Class9451.field40624.in(schema12), DSL.constType(DSL.string()))), "minecraft:husbandry/bred_all_animals", DSL.optionalFields("criteria", DSL.compoundList(Class9451.field40624.in(schema12), DSL.constType(DSL.string())))));
        schema.registerType(false, Class9451.field40634, () -> DSL.constType(DSL.namespacedString()));
        schema.registerType(false, Class9451.field40624, () -> DSL.constType(DSL.namespacedString()));
        schema.registerType(false, Class9451.field40620, (Supplier)DSL::remainder);
    }
}
