package mapped;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Class3647 extends Class3639 {
   public static final HookFunction field19682 = new Class8916();

   public Class3647(int var1, Schema var2) {
      super(var1, var2);
   }

   public static void method12376(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> Class9674.method37738(var0));
   }

   public static void method12377(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> DSL.optionalFields("inTile", Class8239.field35392.in(var0)));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      HashMap var4 = Maps.newHashMap();
      var1.registerSimple(var4, "minecraft:area_effect_cloud");
      method12376(var1, var4, "minecraft:armor_stand");
      var1.register(var4, "minecraft:arrow", var1x -> DSL.optionalFields("inTile", Class8239.field35392.in(var1)));
      method12376(var1, var4, "minecraft:bat");
      method12376(var1, var4, "minecraft:blaze");
      var1.registerSimple(var4, "minecraft:boat");
      method12376(var1, var4, "minecraft:cave_spider");
      var1.register(
         var4,
         "minecraft:chest_minecart",
         var1x -> DSL.optionalFields("DisplayTile", Class8239.field35392.in(var1), "Items", DSL.list(Class8239.field35387.in(var1)))
      );
      method12376(var1, var4, "minecraft:chicken");
      var1.register(var4, "minecraft:commandblock_minecart", var1x -> DSL.optionalFields("DisplayTile", Class8239.field35392.in(var1)));
      method12376(var1, var4, "minecraft:cow");
      method12376(var1, var4, "minecraft:creeper");
      var1.register(
         var4,
         "minecraft:donkey",
         var1x -> DSL.optionalFields("Items", DSL.list(Class8239.field35387.in(var1)), "SaddleItem", Class8239.field35387.in(var1), Class9674.method37738(var1))
      );
      var1.registerSimple(var4, "minecraft:dragon_fireball");
      method12377(var1, var4, "minecraft:egg");
      method12376(var1, var4, "minecraft:elder_guardian");
      var1.registerSimple(var4, "minecraft:ender_crystal");
      method12376(var1, var4, "minecraft:ender_dragon");
      var1.register(var4, "minecraft:enderman", var1x -> DSL.optionalFields("carried", Class8239.field35392.in(var1), Class9674.method37738(var1)));
      method12376(var1, var4, "minecraft:endermite");
      method12377(var1, var4, "minecraft:ender_pearl");
      var1.registerSimple(var4, "minecraft:eye_of_ender_signal");
      var1.register(
         var4, "minecraft:falling_block", var1x -> DSL.optionalFields("Block", Class8239.field35392.in(var1), "TileEntityData", Class8239.field35386.in(var1))
      );
      method12377(var1, var4, "minecraft:fireball");
      var1.register(var4, "minecraft:fireworks_rocket", var1x -> DSL.optionalFields("FireworksItem", Class8239.field35387.in(var1)));
      var1.register(var4, "minecraft:furnace_minecart", var1x -> DSL.optionalFields("DisplayTile", Class8239.field35392.in(var1)));
      method12376(var1, var4, "minecraft:ghast");
      method12376(var1, var4, "minecraft:giant");
      method12376(var1, var4, "minecraft:guardian");
      var1.register(
         var4,
         "minecraft:hopper_minecart",
         var1x -> DSL.optionalFields("DisplayTile", Class8239.field35392.in(var1), "Items", DSL.list(Class8239.field35387.in(var1)))
      );
      var1.register(
         var4,
         "minecraft:horse",
         var1x -> DSL.optionalFields("ArmorItem", Class8239.field35387.in(var1), "SaddleItem", Class8239.field35387.in(var1), Class9674.method37738(var1))
      );
      method12376(var1, var4, "minecraft:husk");
      var1.register(var4, "minecraft:item", var1x -> DSL.optionalFields("Item", Class8239.field35387.in(var1)));
      var1.register(var4, "minecraft:item_frame", var1x -> DSL.optionalFields("Item", Class8239.field35387.in(var1)));
      var1.registerSimple(var4, "minecraft:leash_knot");
      method12376(var1, var4, "minecraft:magma_cube");
      var1.register(var4, "minecraft:minecart", var1x -> DSL.optionalFields("DisplayTile", Class8239.field35392.in(var1)));
      method12376(var1, var4, "minecraft:mooshroom");
      var1.register(
         var4,
         "minecraft:mule",
         var1x -> DSL.optionalFields("Items", DSL.list(Class8239.field35387.in(var1)), "SaddleItem", Class8239.field35387.in(var1), Class9674.method37738(var1))
      );
      method12376(var1, var4, "minecraft:ocelot");
      var1.registerSimple(var4, "minecraft:painting");
      var1.registerSimple(var4, "minecraft:parrot");
      method12376(var1, var4, "minecraft:pig");
      method12376(var1, var4, "minecraft:polar_bear");
      var1.register(var4, "minecraft:potion", var1x -> DSL.optionalFields("Potion", Class8239.field35387.in(var1), "inTile", Class8239.field35392.in(var1)));
      method12376(var1, var4, "minecraft:rabbit");
      method12376(var1, var4, "minecraft:sheep");
      method12376(var1, var4, "minecraft:shulker");
      var1.registerSimple(var4, "minecraft:shulker_bullet");
      method12376(var1, var4, "minecraft:silverfish");
      method12376(var1, var4, "minecraft:skeleton");
      var1.register(var4, "minecraft:skeleton_horse", var1x -> DSL.optionalFields("SaddleItem", Class8239.field35387.in(var1), Class9674.method37738(var1)));
      method12376(var1, var4, "minecraft:slime");
      method12377(var1, var4, "minecraft:small_fireball");
      method12377(var1, var4, "minecraft:snowball");
      method12376(var1, var4, "minecraft:snowman");
      var1.register(
         var4, "minecraft:spawner_minecart", var1x -> DSL.optionalFields("DisplayTile", Class8239.field35392.in(var1), Class8239.field35394.in(var1))
      );
      var1.register(var4, "minecraft:spectral_arrow", var1x -> DSL.optionalFields("inTile", Class8239.field35392.in(var1)));
      method12376(var1, var4, "minecraft:spider");
      method12376(var1, var4, "minecraft:squid");
      method12376(var1, var4, "minecraft:stray");
      var1.registerSimple(var4, "minecraft:tnt");
      var1.register(var4, "minecraft:tnt_minecart", var1x -> DSL.optionalFields("DisplayTile", Class8239.field35392.in(var1)));
      var1.register(
         var4,
         "minecraft:villager",
         var1x -> DSL.optionalFields(
               "Inventory",
               DSL.list(Class8239.field35387.in(var1)),
               "Offers",
               DSL.optionalFields(
                  "Recipes",
                  DSL.list(
                     DSL.optionalFields("buy", Class8239.field35387.in(var1), "buyB", Class8239.field35387.in(var1), "sell", Class8239.field35387.in(var1))
                  )
               ),
               Class9674.method37738(var1)
            )
      );
      method12376(var1, var4, "minecraft:villager_golem");
      method12376(var1, var4, "minecraft:witch");
      method12376(var1, var4, "minecraft:wither");
      method12376(var1, var4, "minecraft:wither_skeleton");
      method12377(var1, var4, "minecraft:wither_skull");
      method12376(var1, var4, "minecraft:wolf");
      method12377(var1, var4, "minecraft:xp_bottle");
      var1.registerSimple(var4, "minecraft:xp_orb");
      method12376(var1, var4, "minecraft:zombie");
      var1.register(var4, "minecraft:zombie_horse", var1x -> DSL.optionalFields("SaddleItem", Class8239.field35387.in(var1), Class9674.method37738(var1)));
      method12376(var1, var4, "minecraft:zombie_pigman");
      method12376(var1, var4, "minecraft:zombie_villager");
      var1.registerSimple(var4, "minecraft:evocation_fangs");
      method12376(var1, var4, "minecraft:evocation_illager");
      var1.registerSimple(var4, "minecraft:illusion_illager");
      var1.register(
         var4,
         "minecraft:llama",
         var1x -> DSL.optionalFields(
               "Items",
               DSL.list(Class8239.field35387.in(var1)),
               "SaddleItem",
               Class8239.field35387.in(var1),
               "DecorItem",
               Class8239.field35387.in(var1),
               Class9674.method37738(var1)
            )
      );
      var1.registerSimple(var4, "minecraft:llama_spit");
      method12376(var1, var4, "minecraft:vex");
      method12376(var1, var4, "minecraft:vindication_illager");
      return var4;
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(true, Class8239.field35391, () -> DSL.taggedChoiceLazy("id", method12354(), var2));
      var1.registerType(
         true,
         Class8239.field35387,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  Class8239.field35393.in(var1),
                  "tag",
                  DSL.optionalFields(
                     "EntityTag",
                     Class8239.field35390.in(var1),
                     "BlockEntityTag",
                     Class8239.field35386.in(var1),
                     "CanDestroy",
                     DSL.list(Class8239.field35392.in(var1)),
                     "CanPlaceOn",
                     DSL.list(Class8239.field35392.in(var1))
                  )
               ),
               field19682,
               HookFunction.IDENTITY
            )
      );
   }
}
