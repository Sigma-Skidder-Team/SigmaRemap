package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import net.minecraft.util.datafix.TypeReferences;

import java.util.Map;
import java.util.function.Supplier;

public class Class9674 extends Schema {
   public Class9674(int var1, Schema var2) {
      super(var1, var2);
   }

   public static TypeTemplate method37738(Schema var0) {
      return DSL.optionalFields("ArmorItems", DSL.list(TypeReferences.ITEM_STACK.in(var0)), "HandItems", DSL.list(TypeReferences.ITEM_STACK.in(var0)));
   }

   public static void method37739(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> method37738(var0));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var4 = super.registerEntities(var1);
      method37739(var1, var4, "ArmorStand");
      method37739(var1, var4, "Creeper");
      method37739(var1, var4, "Skeleton");
      method37739(var1, var4, "Spider");
      method37739(var1, var4, "Giant");
      method37739(var1, var4, "Zombie");
      method37739(var1, var4, "Slime");
      method37739(var1, var4, "Ghast");
      method37739(var1, var4, "PigZombie");
      var1.register(var4, "Enderman", var1x -> DSL.optionalFields("carried", TypeReferences.BLOCK_NAME.in(var1), method37738(var1)));
      method37739(var1, var4, "CaveSpider");
      method37739(var1, var4, "Silverfish");
      method37739(var1, var4, "Blaze");
      method37739(var1, var4, "LavaSlime");
      method37739(var1, var4, "EnderDragon");
      method37739(var1, var4, "WitherBoss");
      method37739(var1, var4, "Bat");
      method37739(var1, var4, "Witch");
      method37739(var1, var4, "Endermite");
      method37739(var1, var4, "Guardian");
      method37739(var1, var4, "Pig");
      method37739(var1, var4, "Sheep");
      method37739(var1, var4, "Cow");
      method37739(var1, var4, "Chicken");
      method37739(var1, var4, "Squid");
      method37739(var1, var4, "Wolf");
      method37739(var1, var4, "MushroomCow");
      method37739(var1, var4, "SnowMan");
      method37739(var1, var4, "Ozelot");
      method37739(var1, var4, "VillagerGolem");
      var1.register(
         var4,
         "EntityHorse",
         var1x -> DSL.optionalFields(
               "Items",
               DSL.list(TypeReferences.ITEM_STACK.in(var1)),
               "ArmorItem",
               TypeReferences.ITEM_STACK.in(var1),
               "SaddleItem",
               TypeReferences.ITEM_STACK.in(var1),
               method37738(var1)
            )
      );
      method37739(var1, var4, "Rabbit");
      var1.register(
         var4,
         "Villager",
         var1x -> DSL.optionalFields(
               "Inventory",
               DSL.list(TypeReferences.ITEM_STACK.in(var1)),
               "Offers",
               DSL.optionalFields(
                  "Recipes",
                  DSL.list(
                     DSL.optionalFields("buy", TypeReferences.ITEM_STACK.in(var1), "buyB", TypeReferences.ITEM_STACK.in(var1), "sell", TypeReferences.ITEM_STACK.in(var1))
                  )
               ),
               method37738(var1)
            )
      );
      method37739(var1, var4, "Shulker");
      var1.registerSimple(var4, "AreaEffectCloud");
      var1.registerSimple(var4, "ShulkerBullet");
      return var4;
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         false,
         TypeReferences.STRUCTURE,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(DSL.optionalFields("nbt", TypeReferences.ENTITY_TREE.in(var1))),
               "blocks",
               DSL.list(DSL.optionalFields("nbt", TypeReferences.BLOCK_ENTITY.in(var1))),
               "palette",
               DSL.list(TypeReferences.BLOCK_STATE.in(var1))
            )
      );
      var1.registerType(false, TypeReferences.BLOCK_STATE, DSL::remainder);
   }
}
