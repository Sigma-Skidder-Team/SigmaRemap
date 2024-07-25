package remapped;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class class_253 extends class_5178 {
   public static final HookFunction field_897 = new class_6381();

   public class_253(int var1, Schema var2) {
      super(var1, var2);
   }

   public static void method_1122(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> class_9276.method_42737(var0));
   }

   public static void method_1121(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> DSL.optionalFields("inTile", class_4002.field_19432.in(var0)));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      HashMap var4 = Maps.newHashMap();
      var1.registerSimple(var4, "minecraft:area_effect_cloud");
      method_1122(var1, var4, "minecraft:armor_stand");
      var1.register(var4, "minecraft:arrow", var1x -> DSL.optionalFields("inTile", class_4002.field_19432.in(var1)));
      method_1122(var1, var4, "minecraft:bat");
      method_1122(var1, var4, "minecraft:blaze");
      var1.registerSimple(var4, "minecraft:boat");
      method_1122(var1, var4, "minecraft:cave_spider");
      var1.register(
         var4,
         "minecraft:chest_minecart",
         var1x -> DSL.optionalFields("DisplayTile", class_4002.field_19432.in(var1), "Items", DSL.list(class_4002.field_19433.in(var1)))
      );
      method_1122(var1, var4, "minecraft:chicken");
      var1.register(var4, "minecraft:commandblock_minecart", var1x -> DSL.optionalFields("DisplayTile", class_4002.field_19432.in(var1)));
      method_1122(var1, var4, "minecraft:cow");
      method_1122(var1, var4, "minecraft:creeper");
      var1.register(
         var4,
         "minecraft:donkey",
         var1x -> DSL.optionalFields(
               "Items", DSL.list(class_4002.field_19433.in(var1)), "SaddleItem", class_4002.field_19433.in(var1), class_9276.method_42737(var1)
            )
      );
      var1.registerSimple(var4, "minecraft:dragon_fireball");
      method_1121(var1, var4, "minecraft:egg");
      method_1122(var1, var4, "minecraft:elder_guardian");
      var1.registerSimple(var4, "minecraft:ender_crystal");
      method_1122(var1, var4, "minecraft:ender_dragon");
      var1.register(var4, "minecraft:enderman", var1x -> DSL.optionalFields("carried", class_4002.field_19432.in(var1), class_9276.method_42737(var1)));
      method_1122(var1, var4, "minecraft:endermite");
      method_1121(var1, var4, "minecraft:ender_pearl");
      var1.registerSimple(var4, "minecraft:eye_of_ender_signal");
      var1.register(
         var4,
         "minecraft:falling_block",
         var1x -> DSL.optionalFields("Block", class_4002.field_19432.in(var1), "TileEntityData", class_4002.field_19434.in(var1))
      );
      method_1121(var1, var4, "minecraft:fireball");
      var1.register(var4, "minecraft:fireworks_rocket", var1x -> DSL.optionalFields("FireworksItem", class_4002.field_19433.in(var1)));
      var1.register(var4, "minecraft:furnace_minecart", var1x -> DSL.optionalFields("DisplayTile", class_4002.field_19432.in(var1)));
      method_1122(var1, var4, "minecraft:ghast");
      method_1122(var1, var4, "minecraft:giant");
      method_1122(var1, var4, "minecraft:guardian");
      var1.register(
         var4,
         "minecraft:hopper_minecart",
         var1x -> DSL.optionalFields("DisplayTile", class_4002.field_19432.in(var1), "Items", DSL.list(class_4002.field_19433.in(var1)))
      );
      var1.register(
         var4,
         "minecraft:horse",
         var1x -> DSL.optionalFields("ArmorItem", class_4002.field_19433.in(var1), "SaddleItem", class_4002.field_19433.in(var1), class_9276.method_42737(var1))
      );
      method_1122(var1, var4, "minecraft:husk");
      var1.register(var4, "minecraft:item", var1x -> DSL.optionalFields("Item", class_4002.field_19433.in(var1)));
      var1.register(var4, "minecraft:item_frame", var1x -> DSL.optionalFields("Item", class_4002.field_19433.in(var1)));
      var1.registerSimple(var4, "minecraft:leash_knot");
      method_1122(var1, var4, "minecraft:magma_cube");
      var1.register(var4, "minecraft:minecart", var1x -> DSL.optionalFields("DisplayTile", class_4002.field_19432.in(var1)));
      method_1122(var1, var4, "minecraft:mooshroom");
      var1.register(
         var4,
         "minecraft:mule",
         var1x -> DSL.optionalFields(
               "Items", DSL.list(class_4002.field_19433.in(var1)), "SaddleItem", class_4002.field_19433.in(var1), class_9276.method_42737(var1)
            )
      );
      method_1122(var1, var4, "minecraft:ocelot");
      var1.registerSimple(var4, "minecraft:painting");
      var1.registerSimple(var4, "minecraft:parrot");
      method_1122(var1, var4, "minecraft:pig");
      method_1122(var1, var4, "minecraft:polar_bear");
      var1.register(var4, "minecraft:potion", var1x -> DSL.optionalFields("Potion", class_4002.field_19433.in(var1), "inTile", class_4002.field_19432.in(var1)));
      method_1122(var1, var4, "minecraft:rabbit");
      method_1122(var1, var4, "minecraft:sheep");
      method_1122(var1, var4, "minecraft:shulker");
      var1.registerSimple(var4, "minecraft:shulker_bullet");
      method_1122(var1, var4, "minecraft:silverfish");
      method_1122(var1, var4, "minecraft:skeleton");
      var1.register(var4, "minecraft:skeleton_horse", var1x -> DSL.optionalFields("SaddleItem", class_4002.field_19433.in(var1), class_9276.method_42737(var1)));
      method_1122(var1, var4, "minecraft:slime");
      method_1121(var1, var4, "minecraft:small_fireball");
      method_1121(var1, var4, "minecraft:snowball");
      method_1122(var1, var4, "minecraft:snowman");
      var1.register(
         var4, "minecraft:spawner_minecart", var1x -> DSL.optionalFields("DisplayTile", class_4002.field_19432.in(var1), class_4002.field_19453.in(var1))
      );
      var1.register(var4, "minecraft:spectral_arrow", var1x -> DSL.optionalFields("inTile", class_4002.field_19432.in(var1)));
      method_1122(var1, var4, "minecraft:spider");
      method_1122(var1, var4, "minecraft:squid");
      method_1122(var1, var4, "minecraft:stray");
      var1.registerSimple(var4, "minecraft:tnt");
      var1.register(var4, "minecraft:tnt_minecart", var1x -> DSL.optionalFields("DisplayTile", class_4002.field_19432.in(var1)));
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
      method_1122(var1, var4, "minecraft:villager_golem");
      method_1122(var1, var4, "minecraft:witch");
      method_1122(var1, var4, "minecraft:wither");
      method_1122(var1, var4, "minecraft:wither_skeleton");
      method_1121(var1, var4, "minecraft:wither_skull");
      method_1122(var1, var4, "minecraft:wolf");
      method_1121(var1, var4, "minecraft:xp_bottle");
      var1.registerSimple(var4, "minecraft:xp_orb");
      method_1122(var1, var4, "minecraft:zombie");
      var1.register(var4, "minecraft:zombie_horse", var1x -> DSL.optionalFields("SaddleItem", class_4002.field_19433.in(var1), class_9276.method_42737(var1)));
      method_1122(var1, var4, "minecraft:zombie_pigman");
      method_1122(var1, var4, "minecraft:zombie_villager");
      var1.registerSimple(var4, "minecraft:evocation_fangs");
      method_1122(var1, var4, "minecraft:evocation_illager");
      var1.registerSimple(var4, "minecraft:illusion_illager");
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
      method_1122(var1, var4, "minecraft:vex");
      method_1122(var1, var4, "minecraft:vindication_illager");
      return var4;
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
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
               field_897,
               HookFunction.IDENTITY
            )
      );
   }
}
