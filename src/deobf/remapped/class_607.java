package remapped;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class class_607 extends class_5178 {
   public class_607(int var1, Schema var2) {
      super(var1, var2);
   }

   public static void method_2868(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> class_9276.method_42737(var0));
   }

   public static void method_2869(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> DSL.optionalFields("Items", DSL.list(class_4002.field_19433.in(var0))));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      HashMap var4 = Maps.newHashMap();
      var1.registerSimple(var4, "minecraft:area_effect_cloud");
      method_2868(var1, var4, "minecraft:armor_stand");
      var1.register(var4, "minecraft:arrow", var1x -> DSL.optionalFields("inBlockState", class_4002.field_19435.in(var1)));
      method_2868(var1, var4, "minecraft:bat");
      method_2868(var1, var4, "minecraft:blaze");
      var1.registerSimple(var4, "minecraft:boat");
      method_2868(var1, var4, "minecraft:cave_spider");
      var1.register(
         var4,
         "minecraft:chest_minecart",
         var1x -> DSL.optionalFields("DisplayState", class_4002.field_19435.in(var1), "Items", DSL.list(class_4002.field_19433.in(var1)))
      );
      method_2868(var1, var4, "minecraft:chicken");
      var1.register(var4, "minecraft:commandblock_minecart", var1x -> DSL.optionalFields("DisplayState", class_4002.field_19435.in(var1)));
      method_2868(var1, var4, "minecraft:cow");
      method_2868(var1, var4, "minecraft:creeper");
      var1.register(
         var4,
         "minecraft:donkey",
         var1x -> DSL.optionalFields(
               "Items", DSL.list(class_4002.field_19433.in(var1)), "SaddleItem", class_4002.field_19433.in(var1), class_9276.method_42737(var1)
            )
      );
      var1.registerSimple(var4, "minecraft:dragon_fireball");
      var1.registerSimple(var4, "minecraft:egg");
      method_2868(var1, var4, "minecraft:elder_guardian");
      var1.registerSimple(var4, "minecraft:ender_crystal");
      method_2868(var1, var4, "minecraft:ender_dragon");
      var1.register(
         var4, "minecraft:enderman", var1x -> DSL.optionalFields("carriedBlockState", class_4002.field_19435.in(var1), class_9276.method_42737(var1))
      );
      method_2868(var1, var4, "minecraft:endermite");
      var1.registerSimple(var4, "minecraft:ender_pearl");
      var1.registerSimple(var4, "minecraft:evocation_fangs");
      method_2868(var1, var4, "minecraft:evocation_illager");
      var1.registerSimple(var4, "minecraft:eye_of_ender_signal");
      var1.register(
         var4,
         "minecraft:falling_block",
         var1x -> DSL.optionalFields("BlockState", class_4002.field_19435.in(var1), "TileEntityData", class_4002.field_19434.in(var1))
      );
      var1.registerSimple(var4, "minecraft:fireball");
      var1.register(var4, "minecraft:fireworks_rocket", var1x -> DSL.optionalFields("FireworksItem", class_4002.field_19433.in(var1)));
      var1.register(var4, "minecraft:furnace_minecart", var1x -> DSL.optionalFields("DisplayState", class_4002.field_19435.in(var1)));
      method_2868(var1, var4, "minecraft:ghast");
      method_2868(var1, var4, "minecraft:giant");
      method_2868(var1, var4, "minecraft:guardian");
      var1.register(
         var4,
         "minecraft:hopper_minecart",
         var1x -> DSL.optionalFields("DisplayState", class_4002.field_19435.in(var1), "Items", DSL.list(class_4002.field_19433.in(var1)))
      );
      var1.register(
         var4,
         "minecraft:horse",
         var1x -> DSL.optionalFields("ArmorItem", class_4002.field_19433.in(var1), "SaddleItem", class_4002.field_19433.in(var1), class_9276.method_42737(var1))
      );
      method_2868(var1, var4, "minecraft:husk");
      var1.registerSimple(var4, "minecraft:illusion_illager");
      var1.register(var4, "minecraft:item", var1x -> DSL.optionalFields("Item", class_4002.field_19433.in(var1)));
      var1.register(var4, "minecraft:item_frame", var1x -> DSL.optionalFields("Item", class_4002.field_19433.in(var1)));
      var1.registerSimple(var4, "minecraft:leash_knot");
      var1.register(
         var4,
         "minecraft:llama",
         var1x -> DSL.optionalFields(
               "Items",
               DSL.list(class_4002.field_19433.in(var1)),
               "SaddleItem",
               class_4002.field_19433.in(var1),
               "DecorItem",
               class_4002.field_19433.in(var1),
               class_9276.method_42737(var1)
            )
      );
      var1.registerSimple(var4, "minecraft:llama_spit");
      method_2868(var1, var4, "minecraft:magma_cube");
      var1.register(var4, "minecraft:minecart", var1x -> DSL.optionalFields("DisplayState", class_4002.field_19435.in(var1)));
      method_2868(var1, var4, "minecraft:mooshroom");
      var1.register(
         var4,
         "minecraft:mule",
         var1x -> DSL.optionalFields(
               "Items", DSL.list(class_4002.field_19433.in(var1)), "SaddleItem", class_4002.field_19433.in(var1), class_9276.method_42737(var1)
            )
      );
      method_2868(var1, var4, "minecraft:ocelot");
      var1.registerSimple(var4, "minecraft:painting");
      var1.registerSimple(var4, "minecraft:parrot");
      method_2868(var1, var4, "minecraft:pig");
      method_2868(var1, var4, "minecraft:polar_bear");
      var1.register(var4, "minecraft:potion", var1x -> DSL.optionalFields("Potion", class_4002.field_19433.in(var1)));
      method_2868(var1, var4, "minecraft:rabbit");
      method_2868(var1, var4, "minecraft:sheep");
      method_2868(var1, var4, "minecraft:shulker");
      var1.registerSimple(var4, "minecraft:shulker_bullet");
      method_2868(var1, var4, "minecraft:silverfish");
      method_2868(var1, var4, "minecraft:skeleton");
      var1.register(var4, "minecraft:skeleton_horse", var1x -> DSL.optionalFields("SaddleItem", class_4002.field_19433.in(var1), class_9276.method_42737(var1)));
      method_2868(var1, var4, "minecraft:slime");
      var1.registerSimple(var4, "minecraft:small_fireball");
      var1.registerSimple(var4, "minecraft:snowball");
      method_2868(var1, var4, "minecraft:snowman");
      var1.register(
         var4, "minecraft:spawner_minecart", var1x -> DSL.optionalFields("DisplayState", class_4002.field_19435.in(var1), class_4002.field_19453.in(var1))
      );
      var1.register(var4, "minecraft:spectral_arrow", var1x -> DSL.optionalFields("inBlockState", class_4002.field_19435.in(var1)));
      method_2868(var1, var4, "minecraft:spider");
      method_2868(var1, var4, "minecraft:squid");
      method_2868(var1, var4, "minecraft:stray");
      var1.registerSimple(var4, "minecraft:tnt");
      var1.register(var4, "minecraft:tnt_minecart", var1x -> DSL.optionalFields("DisplayState", class_4002.field_19435.in(var1)));
      method_2868(var1, var4, "minecraft:vex");
      var1.register(
         var4,
         "minecraft:villager",
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
               class_9276.method_42737(var1)
            )
      );
      method_2868(var1, var4, "minecraft:villager_golem");
      method_2868(var1, var4, "minecraft:vindication_illager");
      method_2868(var1, var4, "minecraft:witch");
      method_2868(var1, var4, "minecraft:wither");
      method_2868(var1, var4, "minecraft:wither_skeleton");
      var1.registerSimple(var4, "minecraft:wither_skull");
      method_2868(var1, var4, "minecraft:wolf");
      var1.registerSimple(var4, "minecraft:xp_bottle");
      var1.registerSimple(var4, "minecraft:xp_orb");
      method_2868(var1, var4, "minecraft:zombie");
      var1.register(var4, "minecraft:zombie_horse", var1x -> DSL.optionalFields("SaddleItem", class_4002.field_19433.in(var1), class_9276.method_42737(var1)));
      method_2868(var1, var4, "minecraft:zombie_pigman");
      method_2868(var1, var4, "minecraft:zombie_villager");
      return var4;
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      HashMap var4 = Maps.newHashMap();
      method_2869(var1, var4, "minecraft:furnace");
      method_2869(var1, var4, "minecraft:chest");
      method_2869(var1, var4, "minecraft:trapped_chest");
      var1.registerSimple(var4, "minecraft:ender_chest");
      var1.register(var4, "minecraft:jukebox", var1x -> DSL.optionalFields("RecordItem", class_4002.field_19433.in(var1)));
      method_2869(var1, var4, "minecraft:dispenser");
      method_2869(var1, var4, "minecraft:dropper");
      var1.registerSimple(var4, "minecraft:sign");
      var1.register(var4, "minecraft:mob_spawner", var1x -> class_4002.field_19453.in(var1));
      var1.register(var4, "minecraft:piston", var1x -> DSL.optionalFields("blockState", class_4002.field_19435.in(var1)));
      method_2869(var1, var4, "minecraft:brewing_stand");
      var1.registerSimple(var4, "minecraft:enchanting_table");
      var1.registerSimple(var4, "minecraft:end_portal");
      var1.registerSimple(var4, "minecraft:beacon");
      var1.registerSimple(var4, "minecraft:skull");
      var1.registerSimple(var4, "minecraft:daylight_detector");
      method_2869(var1, var4, "minecraft:hopper");
      var1.registerSimple(var4, "minecraft:comparator");
      var1.registerSimple(var4, "minecraft:banner");
      var1.registerSimple(var4, "minecraft:structure_block");
      var1.registerSimple(var4, "minecraft:end_gateway");
      var1.registerSimple(var4, "minecraft:command_block");
      method_2869(var1, var4, "minecraft:shulker_box");
      var1.registerSimple(var4, "minecraft:bed");
      return var4;
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      var1.registerType(false, class_4002.field_19455, DSL::remainder);
      var1.registerType(false, class_4002.field_19437, () -> DSL.constType(method_23741()));
      var1.registerType(
         false,
         class_4002.field_19436,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", class_4002.field_19451.in(var1)),
               "Inventory",
               DSL.list(class_4002.field_19433.in(var1)),
               "EnderItems",
               DSL.list(class_4002.field_19433.in(var1)),
               DSL.optionalFields(
                  "ShoulderEntityLeft",
                  class_4002.field_19451.in(var1),
                  "ShoulderEntityRight",
                  class_4002.field_19451.in(var1),
                  "recipeBook",
                  DSL.optionalFields("recipes", DSL.list(class_4002.field_19437.in(var1)), "toBeDisplayed", DSL.list(class_4002.field_19437.in(var1)))
               )
            )
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
                  DSL.list(DSL.fields("i", class_4002.field_19432.in(var1))),
                  "Sections",
                  DSL.list(DSL.optionalFields("Palette", DSL.list(class_4002.field_19435.in(var1))))
               )
            )
      );
      var1.registerType(true, class_4002.field_19434, () -> DSL.taggedChoiceLazy("id", method_23741(), var3));
      var1.registerType(
         true, class_4002.field_19451, () -> DSL.optionalFields("Passengers", DSL.list(class_4002.field_19451.in(var1)), class_4002.field_19444.in(var1))
      );
      var1.registerType(true, class_4002.field_19444, () -> DSL.taggedChoiceLazy("id", method_23741(), var2));
      var1.registerType(
         true,
         class_4002.field_19433,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  class_4002.field_19439.in(var1),
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
               class_253.field_897,
               HookFunction.IDENTITY
            )
      );
      var1.registerType(false, class_4002.field_19454, () -> DSL.compoundList(DSL.list(class_4002.field_19433.in(var1))));
      var1.registerType(false, class_4002.field_19442, DSL::remainder);
      var1.registerType(
         false,
         class_4002.field_19445,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(DSL.optionalFields("nbt", class_4002.field_19451.in(var1))),
               "blocks",
               DSL.list(DSL.optionalFields("nbt", class_4002.field_19434.in(var1))),
               "palette",
               DSL.list(class_4002.field_19435.in(var1))
            )
      );
      var1.registerType(false, class_4002.field_19432, () -> DSL.constType(method_23741()));
      var1.registerType(false, class_4002.field_19439, () -> DSL.constType(method_23741()));
      var1.registerType(false, class_4002.field_19435, DSL::remainder);
      Supplier var6 = () -> DSL.compoundList(class_4002.field_19439.in(var1), DSL.constType(DSL.intType()));
      var1.registerType(
         false,
         class_4002.field_19452,
         () -> DSL.optionalFields(
               "stats",
               DSL.optionalFields(
                  "minecraft:mined",
                  DSL.compoundList(class_4002.field_19432.in(var1), DSL.constType(DSL.intType())),
                  "minecraft:crafted",
                  (TypeTemplate)var6.get(),
                  "minecraft:used",
                  (TypeTemplate)var6.get(),
                  "minecraft:broken",
                  (TypeTemplate)var6.get(),
                  "minecraft:picked_up",
                  (TypeTemplate)var6.get(),
                  DSL.optionalFields(
                     "minecraft:dropped",
                     (TypeTemplate)var6.get(),
                     "minecraft:killed",
                     DSL.compoundList(class_4002.field_19446.in(var1), DSL.constType(DSL.intType())),
                     "minecraft:killed_by",
                     DSL.compoundList(class_4002.field_19446.in(var1), DSL.constType(DSL.intType())),
                     "minecraft:custom",
                     DSL.compoundList(DSL.constType(method_23741()), DSL.constType(DSL.intType()))
                  )
               )
            )
      );
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
      var1.registerType(
         false,
         class_4002.field_19431,
         () -> DSL.optionalFields(
               "Children",
               DSL.list(
                  DSL.optionalFields(
                     "CA",
                     class_4002.field_19435.in(var1),
                     "CB",
                     class_4002.field_19435.in(var1),
                     "CC",
                     class_4002.field_19435.in(var1),
                     "CD",
                     class_4002.field_19435.in(var1)
                  )
               )
            )
      );
      var1.registerType(false, class_4002.field_19443, DSL::remainder);
      var1.registerType(false, class_4002.field_19430, DSL::remainder);
      var1.registerType(
         true,
         class_4002.field_19453,
         () -> DSL.optionalFields(
               "SpawnPotentials", DSL.list(DSL.fields("Entity", class_4002.field_19451.in(var1))), "SpawnData", class_4002.field_19451.in(var1)
            )
      );
      var1.registerType(
         false,
         class_4002.field_19438,
         () -> DSL.optionalFields(
               "minecraft:adventure/adventuring_time",
               DSL.optionalFields("criteria", DSL.compoundList(class_4002.field_19440.in(var1), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_a_mob",
               DSL.optionalFields("criteria", DSL.compoundList(class_4002.field_19446.in(var1), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_all_mobs",
               DSL.optionalFields("criteria", DSL.compoundList(class_4002.field_19446.in(var1), DSL.constType(DSL.string()))),
               "minecraft:husbandry/bred_all_animals",
               DSL.optionalFields("criteria", DSL.compoundList(class_4002.field_19446.in(var1), DSL.constType(DSL.string())))
            )
      );
      var1.registerType(false, class_4002.field_19440, () -> DSL.constType(method_23741()));
      var1.registerType(false, class_4002.field_19446, () -> DSL.constType(method_23741()));
      var1.registerType(false, class_4002.field_19447, DSL::remainder);
      var1.registerType(true, class_4002.field_19441, DSL::remainder);
   }
}
