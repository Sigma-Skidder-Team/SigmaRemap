// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.function.Supplier;
import java.util.Map;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.Hook$HookFunction;

public class Class5189 extends Class5174
{
    public static final Hook$HookFunction field22199;
    
    public Class5189(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public static void method16177(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final String s) {
        schema.register((Map)map, s, () -> Class9478.method35286(schema2));
    }
    
    public static void method16178(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final String s) {
        schema.register((Map)map, s, () -> DSL.optionalFields("inTile", Class9451.field40627.in(schema2)));
    }
    
    public Map<String, Supplier<TypeTemplate>> registerEntities(final Schema schema) {
        final HashMap hashMap = Maps.newHashMap();
        schema.registerSimple((Map)hashMap, "minecraft:area_effect_cloud");
        method16177(schema, hashMap, "minecraft:armor_stand");
        schema.register((Map)hashMap, "minecraft:arrow", p1 -> DSL.optionalFields("inTile", Class9451.field40627.in(schema2)));
        method16177(schema, hashMap, "minecraft:bat");
        method16177(schema, hashMap, "minecraft:blaze");
        schema.registerSimple((Map)hashMap, "minecraft:boat");
        method16177(schema, hashMap, "minecraft:cave_spider");
        schema.register((Map)hashMap, "minecraft:chest_minecart", p1 -> DSL.optionalFields("DisplayTile", Class9451.field40627.in(schema3), "Items", DSL.list(Class9451.field40622.in(schema3))));
        method16177(schema, hashMap, "minecraft:chicken");
        schema.register((Map)hashMap, "minecraft:commandblock_minecart", p1 -> DSL.optionalFields("DisplayTile", Class9451.field40627.in(schema4)));
        method16177(schema, hashMap, "minecraft:cow");
        method16177(schema, hashMap, "minecraft:creeper");
        schema.register((Map)hashMap, "minecraft:donkey", p1 -> DSL.optionalFields("Items", DSL.list(Class9451.field40622.in(schema5)), "SaddleItem", Class9451.field40622.in(schema5), Class9478.method35286(schema5)));
        schema.registerSimple((Map)hashMap, "minecraft:dragon_fireball");
        method16178(schema, hashMap, "minecraft:egg");
        method16177(schema, hashMap, "minecraft:elder_guardian");
        schema.registerSimple((Map)hashMap, "minecraft:ender_crystal");
        method16177(schema, hashMap, "minecraft:ender_dragon");
        schema.register((Map)hashMap, "minecraft:enderman", p1 -> DSL.optionalFields("carried", Class9451.field40627.in(schema6), Class9478.method35286(schema6)));
        method16177(schema, hashMap, "minecraft:endermite");
        method16178(schema, hashMap, "minecraft:ender_pearl");
        schema.registerSimple((Map)hashMap, "minecraft:eye_of_ender_signal");
        schema.register((Map)hashMap, "minecraft:falling_block", p1 -> DSL.optionalFields("Block", Class9451.field40627.in(schema7), "TileEntityData", Class9451.field40621.in(schema7)));
        method16178(schema, hashMap, "minecraft:fireball");
        schema.register((Map)hashMap, "minecraft:fireworks_rocket", p1 -> DSL.optionalFields("FireworksItem", Class9451.field40622.in(schema8)));
        schema.register((Map)hashMap, "minecraft:furnace_minecart", p1 -> DSL.optionalFields("DisplayTile", Class9451.field40627.in(schema9)));
        method16177(schema, hashMap, "minecraft:ghast");
        method16177(schema, hashMap, "minecraft:giant");
        method16177(schema, hashMap, "minecraft:guardian");
        schema.register((Map)hashMap, "minecraft:hopper_minecart", p1 -> DSL.optionalFields("DisplayTile", Class9451.field40627.in(schema10), "Items", DSL.list(Class9451.field40622.in(schema10))));
        schema.register((Map)hashMap, "minecraft:horse", p1 -> DSL.optionalFields("ArmorItem", Class9451.field40622.in(schema11), "SaddleItem", Class9451.field40622.in(schema11), Class9478.method35286(schema11)));
        method16177(schema, hashMap, "minecraft:husk");
        schema.register((Map)hashMap, "minecraft:item", p1 -> DSL.optionalFields("Item", Class9451.field40622.in(schema12)));
        schema.register((Map)hashMap, "minecraft:item_frame", p1 -> DSL.optionalFields("Item", Class9451.field40622.in(schema13)));
        schema.registerSimple((Map)hashMap, "minecraft:leash_knot");
        method16177(schema, hashMap, "minecraft:magma_cube");
        schema.register((Map)hashMap, "minecraft:minecart", p1 -> DSL.optionalFields("DisplayTile", Class9451.field40627.in(schema14)));
        method16177(schema, hashMap, "minecraft:mooshroom");
        schema.register((Map)hashMap, "minecraft:mule", p1 -> DSL.optionalFields("Items", DSL.list(Class9451.field40622.in(schema15)), "SaddleItem", Class9451.field40622.in(schema15), Class9478.method35286(schema15)));
        method16177(schema, hashMap, "minecraft:ocelot");
        schema.registerSimple((Map)hashMap, "minecraft:painting");
        schema.registerSimple((Map)hashMap, "minecraft:parrot");
        method16177(schema, hashMap, "minecraft:pig");
        method16177(schema, hashMap, "minecraft:polar_bear");
        schema.register((Map)hashMap, "minecraft:potion", p1 -> DSL.optionalFields("Potion", Class9451.field40622.in(schema16), "inTile", Class9451.field40627.in(schema16)));
        method16177(schema, hashMap, "minecraft:rabbit");
        method16177(schema, hashMap, "minecraft:sheep");
        method16177(schema, hashMap, "minecraft:shulker");
        schema.registerSimple((Map)hashMap, "minecraft:shulker_bullet");
        method16177(schema, hashMap, "minecraft:silverfish");
        method16177(schema, hashMap, "minecraft:skeleton");
        schema.register((Map)hashMap, "minecraft:skeleton_horse", p1 -> DSL.optionalFields("SaddleItem", Class9451.field40622.in(schema17), Class9478.method35286(schema17)));
        method16177(schema, hashMap, "minecraft:slime");
        method16178(schema, hashMap, "minecraft:small_fireball");
        method16178(schema, hashMap, "minecraft:snowball");
        method16177(schema, hashMap, "minecraft:snowman");
        schema.register((Map)hashMap, "minecraft:spawner_minecart", p1 -> DSL.optionalFields("DisplayTile", Class9451.field40627.in(schema18), Class9451.field40629.in(schema18)));
        schema.register((Map)hashMap, "minecraft:spectral_arrow", p1 -> DSL.optionalFields("inTile", Class9451.field40627.in(schema19)));
        method16177(schema, hashMap, "minecraft:spider");
        method16177(schema, hashMap, "minecraft:squid");
        method16177(schema, hashMap, "minecraft:stray");
        schema.registerSimple((Map)hashMap, "minecraft:tnt");
        schema.register((Map)hashMap, "minecraft:tnt_minecart", p1 -> DSL.optionalFields("DisplayTile", Class9451.field40627.in(schema20)));
        schema.register((Map)hashMap, "minecraft:villager", p1 -> DSL.optionalFields("Inventory", DSL.list(Class9451.field40622.in(schema21)), "Offers", DSL.optionalFields("Recipes", DSL.list(DSL.optionalFields("buy", Class9451.field40622.in(schema21), "buyB", Class9451.field40622.in(schema21), "sell", Class9451.field40622.in(schema21)))), Class9478.method35286(schema21)));
        method16177(schema, hashMap, "minecraft:villager_golem");
        method16177(schema, hashMap, "minecraft:witch");
        method16177(schema, hashMap, "minecraft:wither");
        method16177(schema, hashMap, "minecraft:wither_skeleton");
        method16178(schema, hashMap, "minecraft:wither_skull");
        method16177(schema, hashMap, "minecraft:wolf");
        method16178(schema, hashMap, "minecraft:xp_bottle");
        schema.registerSimple((Map)hashMap, "minecraft:xp_orb");
        method16177(schema, hashMap, "minecraft:zombie");
        schema.register((Map)hashMap, "minecraft:zombie_horse", p1 -> DSL.optionalFields("SaddleItem", Class9451.field40622.in(schema22), Class9478.method35286(schema22)));
        method16177(schema, hashMap, "minecraft:zombie_pigman");
        method16177(schema, hashMap, "minecraft:zombie_villager");
        schema.registerSimple((Map)hashMap, "minecraft:evocation_fangs");
        method16177(schema, hashMap, "minecraft:evocation_illager");
        schema.registerSimple((Map)hashMap, "minecraft:illusion_illager");
        schema.register((Map)hashMap, "minecraft:llama", p1 -> DSL.optionalFields("Items", DSL.list(Class9451.field40622.in(schema23)), "SaddleItem", Class9451.field40622.in(schema23), "DecorItem", Class9451.field40622.in(schema23), Class9478.method35286(schema23)));
        schema.registerSimple((Map)hashMap, "minecraft:llama_spit");
        method16177(schema, hashMap, "minecraft:vex");
        method16177(schema, hashMap, "minecraft:vindication_illager");
        return hashMap;
    }
    
    public void registerTypes(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, (Map)map, (Map)map2);
        schema.registerType(true, Class9451.field40626, () -> DSL.taggedChoiceLazy("id", DSL.namespacedString(), map3));
        schema.registerType(true, Class9451.field40622, () -> DSL.hook(DSL.optionalFields("id", Class9451.field40628.in(schema2), "tag", DSL.optionalFields("EntityTag", Class9451.field40625.in(schema2), "BlockEntityTag", Class9451.field40621.in(schema2), "CanDestroy", DSL.list(Class9451.field40627.in(schema2)), "CanPlaceOn", DSL.list(Class9451.field40627.in(schema2)))), Class5189.field22199, Hook$HookFunction.IDENTITY));
    }
    
    static {
        field22199 = (Hook$HookFunction)new Class9224();
    }
}
