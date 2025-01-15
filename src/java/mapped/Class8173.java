// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DataFixUtils;
import org.apache.logging.log4j.LogManager;
import java.util.Objects;
import com.mojang.datafixers.Dynamic;
import java.util.HashMap;
import com.google.common.collect.Maps;
import java.util.function.Supplier;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook$HookFunction;
import java.util.Map;
import org.apache.logging.log4j.Logger;
import com.mojang.datafixers.schemas.Schema;

public class Class8173 extends Schema
{
    private static final Logger field33675;
    private static final Map<String, String> field33676;
    public static final Hook$HookFunction field33677;
    
    public Class8173(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public static TypeTemplate method27021(final Schema schema) {
        return DSL.optionalFields("Equipment", DSL.list(Class9451.field40622.in(schema)));
    }
    
    public static void method27022(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final String s) {
        schema.register((Map)map, s, () -> method27021(schema2));
    }
    
    public static void method27023(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final String s) {
        schema.register((Map)map, s, () -> DSL.optionalFields("inTile", Class9451.field40627.in(schema2)));
    }
    
    public static void method27024(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final String s) {
        schema.register((Map)map, s, () -> DSL.optionalFields("DisplayTile", Class9451.field40627.in(schema2)));
    }
    
    public static void method27025(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final String s) {
        schema.register((Map)map, s, () -> DSL.optionalFields("Items", DSL.list(Class9451.field40622.in(schema2))));
    }
    
    public Map<String, Supplier<TypeTemplate>> registerEntities(final Schema schema) {
        final HashMap hashMap = Maps.newHashMap();
        schema.register((Map)hashMap, "Item", p1 -> DSL.optionalFields("Item", Class9451.field40622.in(schema2)));
        schema.registerSimple((Map)hashMap, "XPOrb");
        method27023(schema, hashMap, "ThrownEgg");
        schema.registerSimple((Map)hashMap, "LeashKnot");
        schema.registerSimple((Map)hashMap, "Painting");
        schema.register((Map)hashMap, "Arrow", p1 -> DSL.optionalFields("inTile", Class9451.field40627.in(schema3)));
        schema.register((Map)hashMap, "TippedArrow", p1 -> DSL.optionalFields("inTile", Class9451.field40627.in(schema4)));
        schema.register((Map)hashMap, "SpectralArrow", p1 -> DSL.optionalFields("inTile", Class9451.field40627.in(schema5)));
        method27023(schema, hashMap, "Snowball");
        method27023(schema, hashMap, "Fireball");
        method27023(schema, hashMap, "SmallFireball");
        method27023(schema, hashMap, "ThrownEnderpearl");
        schema.registerSimple((Map)hashMap, "EyeOfEnderSignal");
        schema.register((Map)hashMap, "ThrownPotion", p1 -> DSL.optionalFields("inTile", Class9451.field40627.in(schema6), "Potion", Class9451.field40622.in(schema6)));
        method27023(schema, hashMap, "ThrownExpBottle");
        schema.register((Map)hashMap, "ItemFrame", p1 -> DSL.optionalFields("Item", Class9451.field40622.in(schema7)));
        method27023(schema, hashMap, "WitherSkull");
        schema.registerSimple((Map)hashMap, "PrimedTnt");
        schema.register((Map)hashMap, "FallingSand", p1 -> DSL.optionalFields("Block", Class9451.field40627.in(schema8), "TileEntityData", Class9451.field40621.in(schema8)));
        schema.register((Map)hashMap, "FireworksRocketEntity", p1 -> DSL.optionalFields("FireworksItem", Class9451.field40622.in(schema9)));
        schema.registerSimple((Map)hashMap, "Boat");
        schema.register((Map)hashMap, "Minecart", () -> DSL.optionalFields("DisplayTile", Class9451.field40627.in(schema10), "Items", DSL.list(Class9451.field40622.in(schema10))));
        method27024(schema, hashMap, "MinecartRideable");
        schema.register((Map)hashMap, "MinecartChest", p1 -> DSL.optionalFields("DisplayTile", Class9451.field40627.in(schema11), "Items", DSL.list(Class9451.field40622.in(schema11))));
        method27024(schema, hashMap, "MinecartFurnace");
        method27024(schema, hashMap, "MinecartTNT");
        schema.register((Map)hashMap, "MinecartSpawner", () -> DSL.optionalFields("DisplayTile", Class9451.field40627.in(schema12), Class9451.field40629.in(schema12)));
        schema.register((Map)hashMap, "MinecartHopper", p1 -> DSL.optionalFields("DisplayTile", Class9451.field40627.in(schema13), "Items", DSL.list(Class9451.field40622.in(schema13))));
        method27024(schema, hashMap, "MinecartCommandBlock");
        method27022(schema, hashMap, "ArmorStand");
        method27022(schema, hashMap, "Creeper");
        method27022(schema, hashMap, "Skeleton");
        method27022(schema, hashMap, "Spider");
        method27022(schema, hashMap, "Giant");
        method27022(schema, hashMap, "Zombie");
        method27022(schema, hashMap, "Slime");
        method27022(schema, hashMap, "Ghast");
        method27022(schema, hashMap, "PigZombie");
        schema.register((Map)hashMap, "Enderman", p1 -> DSL.optionalFields("carried", Class9451.field40627.in(schema14), method27021(schema14)));
        method27022(schema, hashMap, "CaveSpider");
        method27022(schema, hashMap, "Silverfish");
        method27022(schema, hashMap, "Blaze");
        method27022(schema, hashMap, "LavaSlime");
        method27022(schema, hashMap, "EnderDragon");
        method27022(schema, hashMap, "WitherBoss");
        method27022(schema, hashMap, "Bat");
        method27022(schema, hashMap, "Witch");
        method27022(schema, hashMap, "Endermite");
        method27022(schema, hashMap, "Guardian");
        method27022(schema, hashMap, "Pig");
        method27022(schema, hashMap, "Sheep");
        method27022(schema, hashMap, "Cow");
        method27022(schema, hashMap, "Chicken");
        method27022(schema, hashMap, "Squid");
        method27022(schema, hashMap, "Wolf");
        method27022(schema, hashMap, "MushroomCow");
        method27022(schema, hashMap, "SnowMan");
        method27022(schema, hashMap, "Ozelot");
        method27022(schema, hashMap, "VillagerGolem");
        schema.register((Map)hashMap, "EntityHorse", p1 -> DSL.optionalFields("Items", DSL.list(Class9451.field40622.in(schema15)), "ArmorItem", Class9451.field40622.in(schema15), "SaddleItem", Class9451.field40622.in(schema15), method27021(schema15)));
        method27022(schema, hashMap, "Rabbit");
        schema.register((Map)hashMap, "Villager", p1 -> DSL.optionalFields("Inventory", DSL.list(Class9451.field40622.in(schema16)), "Offers", DSL.optionalFields("Recipes", DSL.list(DSL.optionalFields("buy", Class9451.field40622.in(schema16), "buyB", Class9451.field40622.in(schema16), "sell", Class9451.field40622.in(schema16)))), method27021(schema16)));
        schema.registerSimple((Map)hashMap, "EnderCrystal");
        schema.registerSimple((Map)hashMap, "AreaEffectCloud");
        schema.registerSimple((Map)hashMap, "ShulkerBullet");
        method27022(schema, hashMap, "Shulker");
        return hashMap;
    }
    
    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(final Schema schema) {
        final HashMap hashMap = Maps.newHashMap();
        method27025(schema, hashMap, "Furnace");
        method27025(schema, hashMap, "Chest");
        schema.registerSimple((Map)hashMap, "EnderChest");
        schema.register((Map)hashMap, "RecordPlayer", p1 -> DSL.optionalFields("RecordItem", Class9451.field40622.in(schema2)));
        method27025(schema, hashMap, "Trap");
        method27025(schema, hashMap, "Dropper");
        schema.registerSimple((Map)hashMap, "Sign");
        schema.register((Map)hashMap, "MobSpawner", p1 -> Class9451.field40629.in(schema3));
        schema.registerSimple((Map)hashMap, "Music");
        schema.registerSimple((Map)hashMap, "Piston");
        method27025(schema, hashMap, "Cauldron");
        schema.registerSimple((Map)hashMap, "EnchantTable");
        schema.registerSimple((Map)hashMap, "Airportal");
        schema.registerSimple((Map)hashMap, "Control");
        schema.registerSimple((Map)hashMap, "Beacon");
        schema.registerSimple((Map)hashMap, "Skull");
        schema.registerSimple((Map)hashMap, "DLDetector");
        method27025(schema, hashMap, "Hopper");
        schema.registerSimple((Map)hashMap, "Comparator");
        schema.register((Map)hashMap, "FlowerPot", p1 -> DSL.optionalFields("Item", DSL.or(DSL.constType(DSL.intType()), Class9451.field40628.in(schema4))));
        schema.registerSimple((Map)hashMap, "Banner");
        schema.registerSimple((Map)hashMap, "Structure");
        schema.registerSimple((Map)hashMap, "EndGateway");
        return hashMap;
    }
    
    public void registerTypes(final Schema schema, final Map<String, Supplier<TypeTemplate>> map, final Map<String, Supplier<TypeTemplate>> map2) {
        schema.registerType(false, Class9451.field40611, (Supplier)DSL::remainder);
        schema.registerType(false, Class9451.field40612, () -> DSL.optionalFields("Inventory", DSL.list(Class9451.field40622.in(schema2)), "EnderItems", DSL.list(Class9451.field40622.in(schema2))));
        schema.registerType(false, Class9451.field40613, () -> DSL.fields("Level", DSL.optionalFields("Entities", DSL.list(Class9451.field40625.in(schema3)), "TileEntities", DSL.list(Class9451.field40621.in(schema3)), "TileTicks", DSL.list(DSL.fields("i", Class9451.field40627.in(schema3))))));
        schema.registerType(true, Class9451.field40621, () -> DSL.taggedChoiceLazy("id", DSL.string(), map3));
        schema.registerType(true, Class9451.field40625, () -> DSL.optionalFields("Riding", Class9451.field40625.in(schema4), Class9451.field40626.in(schema4)));
        schema.registerType(false, Class9451.field40624, () -> DSL.constType(DSL.namespacedString()));
        schema.registerType(true, Class9451.field40626, () -> DSL.taggedChoiceLazy("id", DSL.string(), map4));
        schema.registerType(true, Class9451.field40622, () -> DSL.hook(DSL.optionalFields("id", DSL.or(DSL.constType(DSL.intType()), Class9451.field40628.in(schema5)), "tag", DSL.optionalFields("EntityTag", Class9451.field40625.in(schema5), "BlockEntityTag", Class9451.field40621.in(schema5), "CanDestroy", DSL.list(Class9451.field40627.in(schema5)), "CanPlaceOn", DSL.list(Class9451.field40627.in(schema5)))), Class8173.field33677, Hook$HookFunction.IDENTITY));
        schema.registerType(false, Class9451.field40615, (Supplier)DSL::remainder);
        schema.registerType(false, Class9451.field40627, () -> DSL.or(DSL.constType(DSL.intType()), DSL.constType(DSL.namespacedString())));
        schema.registerType(false, Class9451.field40628, () -> DSL.constType(DSL.namespacedString()));
        schema.registerType(false, Class9451.field40617, (Supplier)DSL::remainder);
        schema.registerType(false, Class9451.field40618, () -> DSL.optionalFields("data", DSL.optionalFields("Features", DSL.compoundList(Class9451.field40630.in(schema6)), "Objectives", DSL.list(Class9451.field40631.in(schema6)), "Teams", DSL.list(Class9451.field40632.in(schema6)))));
        schema.registerType(false, Class9451.field40630, (Supplier)DSL::remainder);
        schema.registerType(false, Class9451.field40631, (Supplier)DSL::remainder);
        schema.registerType(false, Class9451.field40632, (Supplier)DSL::remainder);
        schema.registerType(true, Class9451.field40629, (Supplier)DSL::remainder);
        schema.registerType(false, Class9451.field40620, (Supplier)DSL::remainder);
    }
    
    public static <T> T method27026(final Dynamic<T> dynamic, final Map<String, String> map, final String s) {
        return (T)dynamic.update("tag", dynamic2 -> dynamic2.update("BlockEntityTag", dynamic4 -> {
            dynamic3.get("id").asString("");
            final String s3;
            final String s2 = map2.get(Class5174.method16141(s3));
            if (s2 != null) {
                return dynamic4.set("id", dynamic3.createString(s2));
            }
            else {
                Class8173.field33675.warn("Unable to resolve BlockEntity for ItemStack: {}", (Object)s3);
                return dynamic4;
            }
        }).update("EntityTag", dynamic6 -> Objects.equals(Class5174.method16141(dynamic5.get("id").asString("")), "minecraft:armor_stand") ? dynamic6.set("id", dynamic5.createString(s4)) : dynamic6)).getValue();
    }
    
    static {
        field33675 = LogManager.getLogger();
        field33676 = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap -> {
            hashMap.put("minecraft:furnace", "Furnace");
            hashMap.put("minecraft:lit_furnace", "Furnace");
            hashMap.put("minecraft:chest", "Chest");
            hashMap.put("minecraft:trapped_chest", "Chest");
            hashMap.put("minecraft:ender_chest", "EnderChest");
            hashMap.put("minecraft:jukebox", "RecordPlayer");
            hashMap.put("minecraft:dispenser", "Trap");
            hashMap.put("minecraft:dropper", "Dropper");
            hashMap.put("minecraft:sign", "Sign");
            hashMap.put("minecraft:mob_spawner", "MobSpawner");
            hashMap.put("minecraft:noteblock", "Music");
            hashMap.put("minecraft:brewing_stand", "Cauldron");
            hashMap.put("minecraft:enhanting_table", "EnchantTable");
            hashMap.put("minecraft:command_block", "CommandBlock");
            hashMap.put("minecraft:beacon", "Beacon");
            hashMap.put("minecraft:skull", "Skull");
            hashMap.put("minecraft:daylight_detector", "DLDetector");
            hashMap.put("minecraft:hopper", "Hopper");
            hashMap.put("minecraft:banner", "Banner");
            hashMap.put("minecraft:flower_pot", "FlowerPot");
            hashMap.put("minecraft:repeating_command_block", "CommandBlock");
            hashMap.put("minecraft:chain_command_block", "CommandBlock");
            hashMap.put("minecraft:standing_sign", "Sign");
            hashMap.put("minecraft:wall_sign", "Sign");
            hashMap.put("minecraft:piston_head", "Piston");
            hashMap.put("minecraft:daylight_detector_inverted", "DLDetector");
            hashMap.put("minecraft:unpowered_comparator", "Comparator");
            hashMap.put("minecraft:powered_comparator", "Comparator");
            hashMap.put("minecraft:wall_banner", "Banner");
            hashMap.put("minecraft:standing_banner", "Banner");
            hashMap.put("minecraft:structure_block", "Structure");
            hashMap.put("minecraft:end_portal", "Airportal");
            hashMap.put("minecraft:end_gateway", "EndGateway");
            hashMap.put("minecraft:shield", "Banner");
            return;
        });
        field33677 = (Hook$HookFunction)new Class7996();
    }
}
