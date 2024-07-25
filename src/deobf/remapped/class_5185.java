package remapped;

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

public class class_5185 extends Schema {
   private static final Logger field_26680 = LogManager.getLogger();
   private static final Map<String, String> field_26679 = (Map<String, String>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
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
   public static final HookFunction field_26682 = new class_445();

   public class_5185(int var1, Schema var2) {
      super(var1, var2);
   }

   public static TypeTemplate method_23815(Schema var0) {
      return DSL.optionalFields("Equipment", DSL.list(class_4002.field_19433.in(var0)));
   }

   public static void method_23818(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> method_23815(var0));
   }

   public static void method_23813(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> DSL.optionalFields("inTile", class_4002.field_19432.in(var0)));
   }

   public static void method_23817(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> DSL.optionalFields("DisplayTile", class_4002.field_19432.in(var0)));
   }

   public static void method_23812(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> DSL.optionalFields("Items", DSL.list(class_4002.field_19433.in(var0))));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      HashMap var4 = Maps.newHashMap();
      var1.register(var4, "Item", var1x -> DSL.optionalFields("Item", class_4002.field_19433.in(var1)));
      var1.registerSimple(var4, "XPOrb");
      method_23813(var1, var4, "ThrownEgg");
      var1.registerSimple(var4, "LeashKnot");
      var1.registerSimple(var4, "Painting");
      var1.register(var4, "Arrow", var1x -> DSL.optionalFields("inTile", class_4002.field_19432.in(var1)));
      var1.register(var4, "TippedArrow", var1x -> DSL.optionalFields("inTile", class_4002.field_19432.in(var1)));
      var1.register(var4, "SpectralArrow", var1x -> DSL.optionalFields("inTile", class_4002.field_19432.in(var1)));
      method_23813(var1, var4, "Snowball");
      method_23813(var1, var4, "Fireball");
      method_23813(var1, var4, "SmallFireball");
      method_23813(var1, var4, "ThrownEnderpearl");
      var1.registerSimple(var4, "EyeOfEnderSignal");
      var1.register(var4, "ThrownPotion", var1x -> DSL.optionalFields("inTile", class_4002.field_19432.in(var1), "Potion", class_4002.field_19433.in(var1)));
      method_23813(var1, var4, "ThrownExpBottle");
      var1.register(var4, "ItemFrame", var1x -> DSL.optionalFields("Item", class_4002.field_19433.in(var1)));
      method_23813(var1, var4, "WitherSkull");
      var1.registerSimple(var4, "PrimedTnt");
      var1.register(
         var4, "FallingSand", var1x -> DSL.optionalFields("Block", class_4002.field_19432.in(var1), "TileEntityData", class_4002.field_19434.in(var1))
      );
      var1.register(var4, "FireworksRocketEntity", var1x -> DSL.optionalFields("FireworksItem", class_4002.field_19433.in(var1)));
      var1.registerSimple(var4, "Boat");
      var1.register(
         var4, "Minecart", () -> DSL.optionalFields("DisplayTile", class_4002.field_19432.in(var1), "Items", DSL.list(class_4002.field_19433.in(var1)))
      );
      method_23817(var1, var4, "MinecartRideable");
      var1.register(
         var4, "MinecartChest", var1x -> DSL.optionalFields("DisplayTile", class_4002.field_19432.in(var1), "Items", DSL.list(class_4002.field_19433.in(var1)))
      );
      method_23817(var1, var4, "MinecartFurnace");
      method_23817(var1, var4, "MinecartTNT");
      var1.register(var4, "MinecartSpawner", () -> DSL.optionalFields("DisplayTile", class_4002.field_19432.in(var1), class_4002.field_19453.in(var1)));
      var1.register(
         var4,
         "MinecartHopper",
         var1x -> DSL.optionalFields("DisplayTile", class_4002.field_19432.in(var1), "Items", DSL.list(class_4002.field_19433.in(var1)))
      );
      method_23817(var1, var4, "MinecartCommandBlock");
      method_23818(var1, var4, "ArmorStand");
      method_23818(var1, var4, "Creeper");
      method_23818(var1, var4, "Skeleton");
      method_23818(var1, var4, "Spider");
      method_23818(var1, var4, "Giant");
      method_23818(var1, var4, "Zombie");
      method_23818(var1, var4, "Slime");
      method_23818(var1, var4, "Ghast");
      method_23818(var1, var4, "PigZombie");
      var1.register(var4, "Enderman", var1x -> DSL.optionalFields("carried", class_4002.field_19432.in(var1), method_23815(var1)));
      method_23818(var1, var4, "CaveSpider");
      method_23818(var1, var4, "Silverfish");
      method_23818(var1, var4, "Blaze");
      method_23818(var1, var4, "LavaSlime");
      method_23818(var1, var4, "EnderDragon");
      method_23818(var1, var4, "WitherBoss");
      method_23818(var1, var4, "Bat");
      method_23818(var1, var4, "Witch");
      method_23818(var1, var4, "Endermite");
      method_23818(var1, var4, "Guardian");
      method_23818(var1, var4, "Pig");
      method_23818(var1, var4, "Sheep");
      method_23818(var1, var4, "Cow");
      method_23818(var1, var4, "Chicken");
      method_23818(var1, var4, "Squid");
      method_23818(var1, var4, "Wolf");
      method_23818(var1, var4, "MushroomCow");
      method_23818(var1, var4, "SnowMan");
      method_23818(var1, var4, "Ozelot");
      method_23818(var1, var4, "VillagerGolem");
      var1.register(
         var4,
         "EntityHorse",
         var1x -> DSL.optionalFields(
               "Items",
               DSL.list(class_4002.field_19433.in(var1)),
               "ArmorItem",
               class_4002.field_19433.in(var1),
               "SaddleItem",
               class_4002.field_19433.in(var1),
               method_23815(var1)
            )
      );
      method_23818(var1, var4, "Rabbit");
      var1.register(
         var4,
         "Villager",
         var1x -> DSL.optionalFields(
               "Inventory",
               DSL.list(class_4002.field_19433.in(var1)),
               "Offers",
               DSL.optionalFields(
                  "Recipes",
                  DSL.list(
                     DSL.optionalFields(
                        "buy", class_4002.field_19433.in(var1), "buyB", class_4002.field_19433.in(var1), "sell", class_4002.field_19433.in(var1)
                     )
                  )
               ),
               method_23815(var1)
            )
      );
      var1.registerSimple(var4, "EnderCrystal");
      var1.registerSimple(var4, "AreaEffectCloud");
      var1.registerSimple(var4, "ShulkerBullet");
      method_23818(var1, var4, "Shulker");
      return var4;
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      HashMap var4 = Maps.newHashMap();
      method_23812(var1, var4, "Furnace");
      method_23812(var1, var4, "Chest");
      var1.registerSimple(var4, "EnderChest");
      var1.register(var4, "RecordPlayer", var1x -> DSL.optionalFields("RecordItem", class_4002.field_19433.in(var1)));
      method_23812(var1, var4, "Trap");
      method_23812(var1, var4, "Dropper");
      var1.registerSimple(var4, "Sign");
      var1.register(var4, "MobSpawner", var1x -> class_4002.field_19453.in(var1));
      var1.registerSimple(var4, "Music");
      var1.registerSimple(var4, "Piston");
      method_23812(var1, var4, "Cauldron");
      var1.registerSimple(var4, "EnchantTable");
      var1.registerSimple(var4, "Airportal");
      var1.registerSimple(var4, "Control");
      var1.registerSimple(var4, "Beacon");
      var1.registerSimple(var4, "Skull");
      var1.registerSimple(var4, "DLDetector");
      method_23812(var1, var4, "Hopper");
      var1.registerSimple(var4, "Comparator");
      var1.register(var4, "FlowerPot", var1x -> DSL.optionalFields("Item", DSL.or(DSL.constType(DSL.intType()), class_4002.field_19439.in(var1))));
      var1.registerSimple(var4, "Banner");
      var1.registerSimple(var4, "Structure");
      var1.registerSimple(var4, "EndGateway");
      return var4;
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      var1.registerType(false, class_4002.field_19455, DSL::remainder);
      var1.registerType(
         false,
         class_4002.field_19436,
         () -> DSL.optionalFields("Inventory", DSL.list(class_4002.field_19433.in(var1)), "EnderItems", DSL.list(class_4002.field_19433.in(var1)))
      );
      var1.registerType(
         false,
         class_4002.field_19449,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(class_4002.field_19451.in(var1)),
                  "TileEntities",
                  DSL.list(class_4002.field_19434.in(var1)),
                  "TileTicks",
                  DSL.list(DSL.fields("i", class_4002.field_19432.in(var1)))
               )
            )
      );
      var1.registerType(true, class_4002.field_19434, () -> DSL.taggedChoiceLazy("id", DSL.string(), var3));
      var1.registerType(true, class_4002.field_19451, () -> DSL.optionalFields("Riding", class_4002.field_19451.in(var1), class_4002.field_19444.in(var1)));
      var1.registerType(false, class_4002.field_19446, () -> DSL.constType(class_5178.method_23741()));
      var1.registerType(true, class_4002.field_19444, () -> DSL.taggedChoiceLazy("id", DSL.string(), var2));
      var1.registerType(
         true,
         class_4002.field_19433,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  DSL.or(DSL.constType(DSL.intType()), class_4002.field_19439.in(var1)),
                  "tag",
                  DSL.optionalFields(
                     "EntityTag",
                     class_4002.field_19451.in(var1),
                     "BlockEntityTag",
                     class_4002.field_19434.in(var1),
                     "CanDestroy",
                     DSL.list(class_4002.field_19432.in(var1)),
                     "CanPlaceOn",
                     DSL.list(class_4002.field_19432.in(var1))
                  )
               ),
               field_26682,
               HookFunction.IDENTITY
            )
      );
      var1.registerType(false, class_4002.field_19442, DSL::remainder);
      var1.registerType(false, class_4002.field_19432, () -> DSL.or(DSL.constType(DSL.intType()), DSL.constType(class_5178.method_23741())));
      var1.registerType(false, class_4002.field_19439, () -> DSL.constType(class_5178.method_23741()));
      var1.registerType(false, class_4002.field_19452, DSL::remainder);
      var1.registerType(
         false,
         class_4002.field_19448,
         () -> DSL.optionalFields(
               "data",
               DSL.optionalFields(
                  "Features",
                  DSL.compoundList(class_4002.field_19431.in(var1)),
                  "Objectives",
                  DSL.list(class_4002.field_19443.in(var1)),
                  "Teams",
                  DSL.list(class_4002.field_19430.in(var1))
               )
            )
      );
      var1.registerType(false, class_4002.field_19431, DSL::remainder);
      var1.registerType(false, class_4002.field_19443, DSL::remainder);
      var1.registerType(false, class_4002.field_19430, DSL::remainder);
      var1.registerType(true, class_4002.field_19453, DSL::remainder);
      var1.registerType(false, class_4002.field_19447, DSL::remainder);
      var1.registerType(true, class_4002.field_19441, DSL::remainder);
   }

   public static <T> T method_23814(Dynamic<T> var0, Map<String, String> var1, String var2) {
      return (T)var0.update("tag", var3 -> var3.update("BlockEntityTag", var2xx -> {
            String var5 = var0.get("id").asString("");
            String var6 = (String)var1.get(class_5178.method_23742(var5));
            if (var6 != null) {
               return var2xx.set("id", var0.createString(var6));
            } else {
               field_26680.warn("Unable to resolve BlockEntity for ItemStack: {}", var5);
               return var2xx;
            }
         }).update("EntityTag", var2xx -> {
            String var5 = var0.get("id").asString("");
            return !Objects.equals(class_5178.method_23742(var5), "minecraft:armor_stand") ? var2xx : var2xx.set("id", var0.createString(var2));
         })).getValue();
   }
}
