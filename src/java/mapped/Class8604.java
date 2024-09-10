package mapped;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.serialization.Dynamic;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8604 extends Schema {
    private static final Logger field38712 = LogManager.getLogger();
    private static final Map<String, String> field38713 = DataFixUtils.make(Maps.newHashMap(), var0 -> {
        var0.put("minecraft:furnace", "Furnace");
        var0.put("minecraft:lit_furnace", "Furnace");
        var0.put("minecraft:chest", "Chest");
        var0.put("minecraft:trapped_chest", "Chest");
        var0.put("minecraft:ender_chest", "EnderChest");
        var0.put("minecraft:jukebox", "RecordPlayer");
        var0.put("minecraft:dispenser", "Trap");
        var0.put("minecraft:dropper", "Dropper");
        var0.put("minecraft:sign", "Sign");
        var0.put("minecraft:mob_spawner", "MobSpawner");
        var0.put("minecraft:noteblock", "Music");
        var0.put("minecraft:brewing_stand", "Cauldron");
        var0.put("minecraft:enhanting_table", "EnchantTable");
        var0.put("minecraft:command_block", "CommandBlock");
        var0.put("minecraft:beacon", "Beacon");
        var0.put("minecraft:skull", "Skull");
        var0.put("minecraft:daylight_detector", "DLDetector");
        var0.put("minecraft:hopper", "Hopper");
        var0.put("minecraft:banner", "Banner");
        var0.put("minecraft:flower_pot", "FlowerPot");
        var0.put("minecraft:repeating_command_block", "CommandBlock");
        var0.put("minecraft:chain_command_block", "CommandBlock");
        var0.put("minecraft:standing_sign", "Sign");
        var0.put("minecraft:wall_sign", "Sign");
        var0.put("minecraft:piston_head", "Piston");
        var0.put("minecraft:daylight_detector_inverted", "DLDetector");
        var0.put("minecraft:unpowered_comparator", "Comparator");
        var0.put("minecraft:powered_comparator", "Comparator");
        var0.put("minecraft:wall_banner", "Banner");
        var0.put("minecraft:standing_banner", "Banner");
        var0.put("minecraft:structure_block", "Structure");
        var0.put("minecraft:end_portal", "Airportal");
        var0.put("minecraft:end_gateway", "EndGateway");
        var0.put("minecraft:shield", "Banner");
    });
    public static final HookFunction field38714 = new Class6029();

    public Class8604(int var1, Schema var2) {
        super(var1, var2);
    }

    public static TypeTemplate method30792(Schema var0) {
        return DSL.optionalFields("Equipment", DSL.list(TypeReferences.field35387.in(var0)));
    }

    public static void method30793(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
        var0.register(var1, var2, () -> method30792(var0));
    }

    public static void method30794(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
        var0.register(var1, var2, () -> DSL.optionalFields("inTile", TypeReferences.field35392.in(var0)));
    }

    public static void method30795(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
        var0.register(var1, var2, () -> DSL.optionalFields("DisplayTile", TypeReferences.field35392.in(var0)));
    }

    public static void method30796(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
        var0.register(var1, var2, () -> DSL.optionalFields("Items", DSL.list(TypeReferences.field35387.in(var0))));
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
        HashMap var4 = Maps.newHashMap();
        var1.register(var4, "Item", var1x -> DSL.optionalFields("Item", TypeReferences.field35387.in(var1)));
        var1.registerSimple(var4, "XPOrb");
        method30794(var1, var4, "ThrownEgg");
        var1.registerSimple(var4, "LeashKnot");
        var1.registerSimple(var4, "Painting");
        var1.register(var4, "Arrow", var1x -> DSL.optionalFields("inTile", TypeReferences.field35392.in(var1)));
        var1.register(var4, "TippedArrow", var1x -> DSL.optionalFields("inTile", TypeReferences.field35392.in(var1)));
        var1.register(var4, "SpectralArrow", var1x -> DSL.optionalFields("inTile", TypeReferences.field35392.in(var1)));
        method30794(var1, var4, "Snowball");
        method30794(var1, var4, "Fireball");
        method30794(var1, var4, "SmallFireball");
        method30794(var1, var4, "ThrownEnderpearl");
        var1.registerSimple(var4, "EyeOfEnderSignal");
        var1.register(var4, "ThrownPotion", var1x -> DSL.optionalFields("inTile", TypeReferences.field35392.in(var1), "Potion", TypeReferences.field35387.in(var1)));
        method30794(var1, var4, "ThrownExpBottle");
        var1.register(var4, "ItemFrame", var1x -> DSL.optionalFields("Item", TypeReferences.field35387.in(var1)));
        method30794(var1, var4, "WitherSkull");
        var1.registerSimple(var4, "PrimedTnt");
        var1.register(var4, "FallingSand", var1x -> DSL.optionalFields("Block", TypeReferences.field35392.in(var1), "TileEntityData", TypeReferences.field35386.in(var1)));
        var1.register(var4, "FireworksRocketEntity", var1x -> DSL.optionalFields("FireworksItem", TypeReferences.field35387.in(var1)));
        var1.registerSimple(var4, "Boat");
        var1.register(var4, "Minecart", () -> DSL.optionalFields("DisplayTile", TypeReferences.field35392.in(var1), "Items", DSL.list(TypeReferences.field35387.in(var1))));
        method30795(var1, var4, "MinecartRideable");
        var1.register(
                var4, "MinecartChest", var1x -> DSL.optionalFields("DisplayTile", TypeReferences.field35392.in(var1), "Items", DSL.list(TypeReferences.field35387.in(var1)))
        );
        method30795(var1, var4, "MinecartFurnace");
        method30795(var1, var4, "MinecartTNT");
        var1.register(var4, "MinecartSpawner", () -> DSL.optionalFields("DisplayTile", TypeReferences.field35392.in(var1), TypeReferences.field35394.in(var1)));
        var1.register(
                var4, "MinecartHopper", var1x -> DSL.optionalFields("DisplayTile", TypeReferences.field35392.in(var1), "Items", DSL.list(TypeReferences.field35387.in(var1)))
        );
        method30795(var1, var4, "MinecartCommandBlock");
        method30793(var1, var4, "ArmorStand");
        method30793(var1, var4, "Creeper");
        method30793(var1, var4, "Skeleton");
        method30793(var1, var4, "Spider");
        method30793(var1, var4, "Giant");
        method30793(var1, var4, "Zombie");
        method30793(var1, var4, "Slime");
        method30793(var1, var4, "Ghast");
        method30793(var1, var4, "PigZombie");
        var1.register(var4, "Enderman", var1x -> DSL.optionalFields("carried", TypeReferences.field35392.in(var1), method30792(var1)));
        method30793(var1, var4, "CaveSpider");
        method30793(var1, var4, "Silverfish");
        method30793(var1, var4, "Blaze");
        method30793(var1, var4, "LavaSlime");
        method30793(var1, var4, "EnderDragon");
        method30793(var1, var4, "WitherBoss");
        method30793(var1, var4, "Bat");
        method30793(var1, var4, "Witch");
        method30793(var1, var4, "Endermite");
        method30793(var1, var4, "Guardian");
        method30793(var1, var4, "Pig");
        method30793(var1, var4, "Sheep");
        method30793(var1, var4, "Cow");
        method30793(var1, var4, "Chicken");
        method30793(var1, var4, "Squid");
        method30793(var1, var4, "Wolf");
        method30793(var1, var4, "MushroomCow");
        method30793(var1, var4, "SnowMan");
        method30793(var1, var4, "Ozelot");
        method30793(var1, var4, "VillagerGolem");
        var1.register(
                var4,
                "EntityHorse",
                var1x -> DSL.optionalFields(
                        "Items",
                        DSL.list(TypeReferences.field35387.in(var1)),
                        "ArmorItem",
                        TypeReferences.field35387.in(var1),
                        "SaddleItem",
                        TypeReferences.field35387.in(var1),
                        method30792(var1)
                )
        );
        method30793(var1, var4, "Rabbit");
        var1.register(
                var4,
                "Villager",
                var1x -> DSL.optionalFields(
                        "Inventory",
                        DSL.list(TypeReferences.field35387.in(var1)),
                        "Offers",
                        DSL.optionalFields(
                                "Recipes",
                                DSL.list(
                                        DSL.optionalFields("buy", TypeReferences.field35387.in(var1), "buyB", TypeReferences.field35387.in(var1), "sell", TypeReferences.field35387.in(var1))
                                )
                        ),
                        method30792(var1)
                )
        );
        var1.registerSimple(var4, "EnderCrystal");
        var1.registerSimple(var4, "AreaEffectCloud");
        var1.registerSimple(var4, "ShulkerBullet");
        method30793(var1, var4, "Shulker");
        return var4;
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
        HashMap var4 = Maps.newHashMap();
        method30796(var1, var4, "Furnace");
        method30796(var1, var4, "Chest");
        var1.registerSimple(var4, "EnderChest");
        var1.register(var4, "RecordPlayer", var1x -> DSL.optionalFields("RecordItem", TypeReferences.field35387.in(var1)));
        method30796(var1, var4, "Trap");
        method30796(var1, var4, "Dropper");
        var1.registerSimple(var4, "Sign");
        var1.register(var4, "MobSpawner", var1x -> TypeReferences.field35394.in(var1));
        var1.registerSimple(var4, "Music");
        var1.registerSimple(var4, "Piston");
        method30796(var1, var4, "Cauldron");
        var1.registerSimple(var4, "EnchantTable");
        var1.registerSimple(var4, "Airportal");
        var1.registerSimple(var4, "Control");
        var1.registerSimple(var4, "Beacon");
        var1.registerSimple(var4, "Skull");
        var1.registerSimple(var4, "DLDetector");
        method30796(var1, var4, "Hopper");
        var1.registerSimple(var4, "Comparator");
        var1.register(var4, "FlowerPot", var1x -> DSL.optionalFields("Item", DSL.or(DSL.constType(DSL.intType()), TypeReferences.field35393.in(var1))));
        var1.registerSimple(var4, "Banner");
        var1.registerSimple(var4, "Structure");
        var1.registerSimple(var4, "EndGateway");
        return var4;
    }

    public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
        var1.registerType(false, TypeReferences.field35376, DSL::remainder);
        var1.registerType(
                false,
                TypeReferences.field35377,
                () -> DSL.optionalFields("Inventory", DSL.list(TypeReferences.field35387.in(var1)), "EnderItems", DSL.list(TypeReferences.field35387.in(var1)))
        );
        var1.registerType(
                false,
                TypeReferences.field35378,
                () -> DSL.fields(
                        "Level",
                        DSL.optionalFields(
                                "Entities",
                                DSL.list(TypeReferences.field35390.in(var1)),
                                "TileEntities",
                                DSL.list(TypeReferences.field35386.in(var1)),
                                "TileTicks",
                                DSL.list(DSL.fields("i", TypeReferences.field35392.in(var1)))
                        )
                )
        );
        var1.registerType(true, TypeReferences.field35386, () -> DSL.taggedChoiceLazy("id", DSL.string(), var3));
        var1.registerType(true, TypeReferences.field35390, () -> DSL.optionalFields("Riding", TypeReferences.field35390.in(var1), TypeReferences.ENTITY.in(var1)));
        var1.registerType(false, TypeReferences.field35389, () -> DSL.constType(Class3639.method12354()));
        var1.registerType(true, TypeReferences.ENTITY, () -> DSL.taggedChoiceLazy("id", DSL.string(), var2));
        var1.registerType(
                true,
                TypeReferences.field35387,
                () -> DSL.hook(
                        DSL.optionalFields(
                                "id",
                                DSL.or(DSL.constType(DSL.intType()), TypeReferences.field35393.in(var1)),
                                "tag",
                                DSL.optionalFields(
                                        "EntityTag",
                                        TypeReferences.field35390.in(var1),
                                        "BlockEntityTag",
                                        TypeReferences.field35386.in(var1),
                                        "CanDestroy",
                                        DSL.list(TypeReferences.field35392.in(var1)),
                                        "CanPlaceOn",
                                        DSL.list(TypeReferences.field35392.in(var1))
                                )
                        ),
                        field38714,
                        HookFunction.IDENTITY
                )
        );
        var1.registerType(false, TypeReferences.field35380, DSL::remainder);
        var1.registerType(false, TypeReferences.field35392, () -> DSL.or(DSL.constType(DSL.intType()), DSL.constType(Class3639.method12354())));
        var1.registerType(false, TypeReferences.field35393, () -> DSL.constType(Class3639.method12354()));
        var1.registerType(false, TypeReferences.field35382, DSL::remainder);
        var1.registerType(
                false,
                TypeReferences.field35383,
                () -> DSL.optionalFields(
                        "data",
                        DSL.optionalFields(
                                "Features",
                                DSL.compoundList(TypeReferences.field35395.in(var1)),
                                "Objectives",
                                DSL.list(TypeReferences.field35396.in(var1)),
                                "Teams",
                                DSL.list(TypeReferences.field35397.in(var1))
                        )
                )
        );
        var1.registerType(false, TypeReferences.field35395, DSL::remainder);
        var1.registerType(false, TypeReferences.field35396, DSL::remainder);
        var1.registerType(false, TypeReferences.field35397, DSL::remainder);
        var1.registerType(true, TypeReferences.field35394, DSL::remainder);
        var1.registerType(false, TypeReferences.field35385, DSL::remainder);
        var1.registerType(true, TypeReferences.field35400, DSL::remainder);
    }

    public static <T> T method30797(Dynamic<T> var0, Map<String, String> var1, String var2) {
        return (T) var0.update("tag", var3 -> var3.update("BlockEntityTag", var2xx -> {
            String var5 = var0.get("id").asString("");
            String var6 = (String) var1.get(Class3639.method12353(var5));
            if (var6 != null) {
                return var2xx.set("id", var0.createString(var6));
            } else {
                field38712.warn("Unable to resolve BlockEntity for ItemStack: {}", var5);
                return var2xx;
            }
        }).update("EntityTag", var2xx -> {
            String var5 = var0.get("id").asString("");
            return !Objects.equals(Class3639.method12353(var5), "minecraft:armor_stand") ? var2xx : var2xx.set("id", var0.createString(var2));
        })).getValue();
    }

    // $VF: synthetic method
    public static Map method30834() {
        return field38713;
    }
}
