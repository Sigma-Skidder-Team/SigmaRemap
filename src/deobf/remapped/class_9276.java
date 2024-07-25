package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class_9276 extends Schema {
   public class_9276(int var1, Schema var2) {
      super(var1, var2);
   }

   public static TypeTemplate method_42737(Schema var0) {
      return DSL.optionalFields("ArmorItems", DSL.list(class_4002.field_19433.in(var0)), "HandItems", DSL.list(class_4002.field_19433.in(var0)));
   }

   public static void method_42739(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> method_42737(var0));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var4 = super.registerEntities(var1);
      method_42739(var1, var4, "ArmorStand");
      method_42739(var1, var4, "Creeper");
      method_42739(var1, var4, "Skeleton");
      method_42739(var1, var4, "Spider");
      method_42739(var1, var4, "Giant");
      method_42739(var1, var4, "Zombie");
      method_42739(var1, var4, "Slime");
      method_42739(var1, var4, "Ghast");
      method_42739(var1, var4, "PigZombie");
      var1.register(var4, "Enderman", var1x -> DSL.optionalFields("carried", class_4002.field_19432.in(var1), method_42737(var1)));
      method_42739(var1, var4, "CaveSpider");
      method_42739(var1, var4, "Silverfish");
      method_42739(var1, var4, "Blaze");
      method_42739(var1, var4, "LavaSlime");
      method_42739(var1, var4, "EnderDragon");
      method_42739(var1, var4, "WitherBoss");
      method_42739(var1, var4, "Bat");
      method_42739(var1, var4, "Witch");
      method_42739(var1, var4, "Endermite");
      method_42739(var1, var4, "Guardian");
      method_42739(var1, var4, "Pig");
      method_42739(var1, var4, "Sheep");
      method_42739(var1, var4, "Cow");
      method_42739(var1, var4, "Chicken");
      method_42739(var1, var4, "Squid");
      method_42739(var1, var4, "Wolf");
      method_42739(var1, var4, "MushroomCow");
      method_42739(var1, var4, "SnowMan");
      method_42739(var1, var4, "Ozelot");
      method_42739(var1, var4, "VillagerGolem");
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
               method_42737(var1)
            )
      );
      method_42739(var1, var4, "Rabbit");
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
               method_42737(var1)
            )
      );
      method_42739(var1, var4, "Shulker");
      var1.registerSimple(var4, "AreaEffectCloud");
      var1.registerSimple(var4, "ShulkerBullet");
      return var4;
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
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
      var1.registerType(false, class_4002.field_19435, DSL::remainder);
   }
}
