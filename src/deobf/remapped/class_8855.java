package remapped;

import java.util.function.Consumer;
import net.minecraft.util.text.TranslationTextComponent;

public class class_8855 implements Consumer<Consumer<class_3139>> {
   private static final class_6629<?>[] field_45271 = new class_6629[]{
      class_6629.field_34286,
      class_6629.field_34248,
      class_6629.field_34218,
      class_6629.field_34321,
      class_6629.field_34325,
      class_6629.field_34269,
      class_6629.field_34252,
      class_6629.field_34263,
      class_6629.field_34225,
      class_6629.field_34214,
      class_6629.field_34251,
      class_6629.field_34327,
      class_6629.field_34249,
      class_6629.field_34232,
      class_6629.field_34250,
      class_6629.field_34238,
      class_6629.field_34306,
      class_6629.field_34233
   };
   private static final class_2451[] field_45272 = new class_2451[]{
      class_4897.field_24814, class_4897.field_25284, class_4897.field_24728, class_4897.field_25201
   };
   private static final class_2451[] field_45273 = new class_2451[]{
      class_4897.field_24757, class_4897.field_25286, class_4897.field_25174, class_4897.field_25221
   };
   private static final class_2451[] field_45274 = new class_2451[]{
      class_4897.field_24753,
      class_4897.field_24719,
      class_4897.field_24456,
      class_4897.field_25297,
      class_4897.field_24897,
      class_4897.field_25037,
      class_4897.field_24966,
      class_4897.field_24814,
      class_4897.field_25201,
      class_4897.field_25284,
      class_4897.field_24728,
      class_4897.field_24715,
      class_4897.field_24731,
      class_4897.field_24763,
      class_4897.field_24341,
      class_4897.field_25017,
      class_4897.field_24913,
      class_4897.field_24707,
      class_4897.field_24491,
      class_4897.field_25238,
      class_4897.field_24764,
      class_4897.field_25136,
      class_4897.field_25273,
      class_4897.field_24397,
      class_4897.field_25082,
      class_4897.field_25070,
      class_4897.field_25148,
      class_4897.field_24555,
      class_4897.field_25117,
      class_4897.field_24907,
      class_4897.field_24390,
      class_4897.field_24661,
      class_4897.field_24517,
      class_4897.field_24362,
      class_4897.field_24890,
      class_4897.field_24494,
      class_4897.field_24846,
      class_4897.field_25205,
      class_4897.field_24773
   };

   public void accept(Consumer<class_3139> var1) {
      class_3139 var4 = class_3321.method_15269()
         .method_15263(
            class_4783.field_23429,
            new TranslationTextComponent("advancements.husbandry.root.title"),
            new TranslationTextComponent("advancements.husbandry.root.description"),
            new Identifier("textures/gui/advancements/backgrounds/husbandry.png"),
            class_3361.field_16556,
            false,
            false,
            false
         )
         .method_15272("consumed_item", class_2125.method_9927())
         .method_15270(var1, "husbandry/root");
      class_3139 var5 = class_3321.method_15269()
         .method_15274(var4)
         .method_15263(
            class_4897.field_24813,
            new TranslationTextComponent("advancements.husbandry.plant_seed.title"),
            new TranslationTextComponent("advancements.husbandry.plant_seed.description"),
            (Identifier)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15271(class_6701.field_34598)
         .method_15272("wheat", class_5972.method_27270(class_4783.field_23362))
         .method_15272("pumpkin_stem", class_5972.method_27270(class_4783.field_23301))
         .method_15272("melon_stem", class_5972.method_27270(class_4783.field_23212))
         .method_15272("beetroots", class_5972.method_27270(class_4783.field_23310))
         .method_15272("nether_wart", class_5972.method_27270(class_4783.field_23522))
         .method_15270(var1, "husbandry/plant_seed");
      class_3139 var6 = class_3321.method_15269()
         .method_15274(var4)
         .method_15263(
            class_4897.field_24813,
            new TranslationTextComponent("advancements.husbandry.breed_an_animal.title"),
            new TranslationTextComponent("advancements.husbandry.breed_an_animal.description"),
            (Identifier)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15271(class_6701.field_34598)
         .method_15272("bred", class_8553.method_39345())
         .method_15270(var1, "husbandry/breed_an_animal");
      this.method_40729(class_3321.method_15269())
         .method_15274(var5)
         .method_15263(
            class_4897.field_24753,
            new TranslationTextComponent("advancements.husbandry.balanced_diet.title"),
            new TranslationTextComponent("advancements.husbandry.balanced_diet.description"),
            (Identifier)null,
            class_3361.field_16559,
            true,
            true,
            false
         )
         .method_15258(class_7365.method_33541(100))
         .method_15270(var1, "husbandry/balanced_diet");
      class_3321.method_15269()
         .method_15274(var5)
         .method_15263(
            class_4897.field_25279,
            new TranslationTextComponent("advancements.husbandry.netherite_hoe.title"),
            new TranslationTextComponent("advancements.husbandry.netherite_hoe.description"),
            (Identifier)null,
            class_3361.field_16559,
            true,
            true,
            false
         )
         .method_15258(class_7365.method_33541(100))
         .method_15272("netherite_hoe", class_6459.method_29434(class_4897.field_25279))
         .method_15270(var1, "husbandry/obtain_netherite_hoe");
      class_3139 var7 = class_3321.method_15269()
         .method_15274(var4)
         .method_15263(
            class_4897.field_25274,
            new TranslationTextComponent("advancements.husbandry.tame_an_animal.title"),
            new TranslationTextComponent("advancements.husbandry.tame_an_animal.description"),
            (Identifier)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("tamed_animal", class_7032.method_32074())
         .method_15270(var1, "husbandry/tame_an_animal");
      this.method_40725(class_3321.method_15269())
         .method_15274(var6)
         .method_15263(
            class_4897.field_25070,
            new TranslationTextComponent("advancements.husbandry.breed_all_animals.title"),
            new TranslationTextComponent("advancements.husbandry.breed_all_animals.description"),
            (Identifier)null,
            class_3361.field_16559,
            true,
            true,
            false
         )
         .method_15258(class_7365.method_33541(100))
         .method_15270(var1, "husbandry/bred_all_animals");
      class_3139 var8 = this.method_40724(class_3321.method_15269())
         .method_15274(var4)
         .method_15271(class_6701.field_34598)
         .method_15263(
            class_4897.field_24505,
            new TranslationTextComponent("advancements.husbandry.fishy_business.title"),
            new TranslationTextComponent("advancements.husbandry.fishy_business.description"),
            (Identifier)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15270(var1, "husbandry/fishy_business");
      this.method_40726(class_3321.method_15269())
         .method_15274(var8)
         .method_15271(class_6701.field_34598)
         .method_15263(
            class_4897.field_25174,
            new TranslationTextComponent("advancements.husbandry.tactical_fishing.title"),
            new TranslationTextComponent("advancements.husbandry.tactical_fishing.description"),
            (Identifier)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15270(var1, "husbandry/tactical_fishing");
      this.method_40727(class_3321.method_15269())
         .method_15274(var7)
         .method_15263(
            class_4897.field_24814,
            new TranslationTextComponent("advancements.husbandry.complete_catalogue.title"),
            new TranslationTextComponent("advancements.husbandry.complete_catalogue.description"),
            (Identifier)null,
            class_3361.field_16559,
            true,
            true,
            false
         )
         .method_15258(class_7365.method_33541(50))
         .method_15270(var1, "husbandry/complete_catalogue");
      class_3321.method_15269()
         .method_15274(var4)
         .method_15272(
            "safely_harvest_honey",
            class_6398.method_29212(
               class_6352.method_29094().method_29095(class_6051.method_27633().method_27629(class_2351.field_11727).method_27632()).method_29096(true),
               class_9518.method_43918().method_43915(class_4897.field_24812)
            )
         )
         .method_15263(
            class_4897.field_24773,
            new TranslationTextComponent("advancements.husbandry.safely_harvest_honey.title"),
            new TranslationTextComponent("advancements.husbandry.safely_harvest_honey.description"),
            (Identifier)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15270(var1, "husbandry/safely_harvest_honey");
      class_3321.method_15269()
         .method_15274(var4)
         .method_15272(
            "silk_touch_nest",
            class_5130.method_23529(
               class_4783.field_23611,
               class_9518.method_43918().method_43920(new class_5187(class_3668.field_17870, class_7781.method_35305(1))),
               class_7781.method_35312(3)
            )
         )
         .method_15263(
            class_4783.field_23611,
            new TranslationTextComponent("advancements.husbandry.silk_touch_nest.title"),
            new TranslationTextComponent("advancements.husbandry.silk_touch_nest.description"),
            (Identifier)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15270(var1, "husbandry/silk_touch_nest");
   }

   private class_3321 method_40729(class_3321 var1) {
      for (class_2451 var7 : field_45274) {
         var1.method_15272(class_8669.field_44382.method_39797(var7).method_21456(), class_2125.method_9928(var7));
      }

      return var1;
   }

   private class_3321 method_40725(class_3321 var1) {
      for (class_6629 var7 : field_45271) {
         var1.method_15272(class_6629.method_30472(var7).toString(), class_8553.method_39344(class_2184.method_10127().method_10134(var7)));
      }

      var1.method_15272(
         class_6629.method_30472(class_6629.field_34283).toString(),
         class_8553.method_39347(
            class_2184.method_10127().method_10134(class_6629.field_34283).method_10139(),
            class_2184.method_10127().method_10134(class_6629.field_34283).method_10139(),
            class_865.field_4485
         )
      );
      return var1;
   }

   private class_3321 method_40726(class_3321 var1) {
      for (class_2451 var7 : field_45273) {
         var1.method_15272(
            class_8669.field_44382.method_39797(var7).method_21456(), class_5755.method_26042(class_9518.method_43918().method_43915(var7).method_43921())
         );
      }

      return var1;
   }

   private class_3321 method_40724(class_3321 var1) {
      for (class_2451 var7 : field_45272) {
         var1.method_15272(
            class_8669.field_44382.method_39797(var7).method_21456(),
            class_1691.method_7615(class_5319.field_27132, class_865.field_4485, class_9518.method_43918().method_43915(var7).method_43921())
         );
      }

      return var1;
   }

   private class_3321 method_40727(class_3321 var1) {
      class_5583.field_28352
         .forEach((var1x, var2) -> var1.method_15272(var2.method_21456(), class_7032.method_32072(class_2184.method_10127().method_10138(var2).method_10139())));
      return var1;
   }
}
