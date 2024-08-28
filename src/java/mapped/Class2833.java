package mapped;

import java.util.function.Consumer;
import net.minecraft.util.text.TranslationTextComponent;

public class Class2833 implements Consumer<Consumer<Class7952>> {
   private static final Class8992<?>[] field17615 = new Class8992[]{
      Class8992.field41038,
      Class8992.field41019,
      Class8992.field41057,
      Class8992.field41074,
      Class8992.field41016,
      Class8992.field41058,
      Class8992.field41064,
      Class8992.field41014,
      Class8992.field41105,
      Class8992.field41059,
      Class8992.field41071,
      Class8992.field41047,
      Class8992.field41012,
      Class8992.field41061,
      Class8992.field41033,
      Class8992.field41009,
      Class8992.field41037,
      Class8992.field41088
   };
   private static final Class3257[] field17616 = new Class3257[]{Class8514.field37909, Class8514.field37911, Class8514.field37912, Class8514.field37910};
   private static final Class3257[] field17617 = new Class3257[]{Class8514.field37894, Class8514.field37895, Class8514.field37892, Class8514.field37893};
   private static final Class3257[] field17618 = new Class3257[]{
      Class8514.field37795,
      Class8514.field37837,
      Class8514.field37843,
      Class8514.field37869,
      Class8514.field37870,
      Class8514.field37872,
      Class8514.field37873,
      Class8514.field37909,
      Class8514.field37910,
      Class8514.field37911,
      Class8514.field37912,
      Class8514.field37913,
      Class8514.field37914,
      Class8514.field37954,
      Class8514.field37957,
      Class8514.field37961,
      Class8514.field37962,
      Class8514.field37963,
      Class8514.field37964,
      Class8514.field37965,
      Class8514.field37973,
      Class8514.field38052,
      Class8514.field38053,
      Class8514.field38054,
      Class8514.field38055,
      Class8514.field38057,
      Class8514.field38067,
      Class8514.field38077,
      Class8514.field38078,
      Class8514.field38079,
      Class8514.field38090,
      Class8514.field38091,
      Class8514.field38109,
      Class8514.field38111,
      Class8514.field38113,
      Class8514.field37958,
      Class8514.field38149,
      Class8514.field38170,
      Class8514.field38177
   };

   public void accept(Consumer<Class7952> var1) {
      Class7952 var4 = Class7999.method27304()
         .method27308(
            Blocks.field36777,
            new TranslationTextComponent("advancements.husbandry.root.title"),
            new TranslationTextComponent("advancements.husbandry.root.description"),
            new ResourceLocation("textures/gui/advancements/backgrounds/husbandry.png"),
            Class1965.field12814,
            false,
            false,
            false
         )
         .method27312("consumed_item", Class4489.method14158())
         .method27317(var1, "husbandry/root");
      Class7952 var5 = Class7999.method27304()
         .method27305(var4)
         .method27308(
            Class8514.field37842,
            new TranslationTextComponent("advancements.husbandry.plant_seed.title"),
            new TranslationTextComponent("advancements.husbandry.plant_seed.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27314(Class9014.field41221)
         .method27312("wheat", Class4486.method14152(Blocks.field36539))
         .method27312("pumpkin_stem", Class4486.method14152(Blocks.PUMPKIN_STEM))
         .method27312("melon_stem", Class4486.method14152(Blocks.MELON_STEM))
         .method27312("beetroots", Class4486.method14152(Blocks.field36884))
         .method27312("nether_wart", Class4486.method14152(Blocks.NETHER_WART))
         .method27317(var1, "husbandry/plant_seed");
      Class7952 var6 = Class7999.method27304()
         .method27305(var4)
         .method27308(
            Class8514.field37842,
            new TranslationTextComponent("advancements.husbandry.breed_an_animal.title"),
            new TranslationTextComponent("advancements.husbandry.breed_an_animal.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27314(Class9014.field41221)
         .method27312("bred", Class4462.method14104())
         .method27317(var1, "husbandry/breed_an_animal");
      this.method11036(Class7999.method27304())
         .method27305(var5)
         .method27308(
            Class8514.field37795,
            new TranslationTextComponent("advancements.husbandry.balanced_diet.title"),
            new TranslationTextComponent("advancements.husbandry.balanced_diet.description"),
            (ResourceLocation)null,
            Class1965.field12815,
            true,
            true,
            false
         )
         .method27310(Class9182.method34343(100))
         .method27317(var1, "husbandry/balanced_diet");
      Class7999.method27304()
         .method27305(var5)
         .method27308(
            Class8514.field37834,
            new TranslationTextComponent("advancements.husbandry.netherite_hoe.title"),
            new TranslationTextComponent("advancements.husbandry.netherite_hoe.description"),
            (ResourceLocation)null,
            Class1965.field12815,
            true,
            true,
            false
         )
         .method27310(Class9182.method34343(100))
         .method27312("netherite_hoe", Class4491.method14164(Class8514.field37834))
         .method27317(var1, "husbandry/obtain_netherite_hoe");
      Class7952 var7 = Class7999.method27304()
         .method27305(var4)
         .method27308(
            Class8514.field38087,
            new TranslationTextComponent("advancements.husbandry.tame_an_animal.title"),
            new TranslationTextComponent("advancements.husbandry.tame_an_animal.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("tamed_animal", Class4460.method14099())
         .method27317(var1, "husbandry/tame_an_animal");
      this.method11037(Class7999.method27304())
         .method27305(var6)
         .method27308(
            Class8514.field38057,
            new TranslationTextComponent("advancements.husbandry.breed_all_animals.title"),
            new TranslationTextComponent("advancements.husbandry.breed_all_animals.description"),
            (ResourceLocation)null,
            Class1965.field12815,
            true,
            true,
            false
         )
         .method27310(Class9182.method34343(100))
         .method27317(var1, "husbandry/bred_all_animals");
      Class7952 var8 = this.method11039(Class7999.method27304())
         .method27305(var4)
         .method27314(Class9014.field41221)
         .method27308(
            Class8514.field37906,
            new TranslationTextComponent("advancements.husbandry.fishy_business.title"),
            new TranslationTextComponent("advancements.husbandry.fishy_business.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27317(var1, "husbandry/fishy_business");
      this.method11038(Class7999.method27304())
         .method27305(var8)
         .method27314(Class9014.field41221)
         .method27308(
            Class8514.field37892,
            new TranslationTextComponent("advancements.husbandry.tactical_fishing.title"),
            new TranslationTextComponent("advancements.husbandry.tactical_fishing.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27317(var1, "husbandry/tactical_fishing");
      this.method11040(Class7999.method27304())
         .method27305(var7)
         .method27308(
            Class8514.field37909,
            new TranslationTextComponent("advancements.husbandry.complete_catalogue.title"),
            new TranslationTextComponent("advancements.husbandry.complete_catalogue.description"),
            (ResourceLocation)null,
            Class1965.field12815,
            true,
            true,
            false
         )
         .method27310(Class9182.method34343(50))
         .method27317(var1, "husbandry/complete_catalogue");
      Class7999.method27304()
         .method27305(var4)
         .method27312(
            "safely_harvest_honey",
            Class4458.method14095(
               Class8912.method32576().method32578(Class8831.method31929().method31931(Class7645.field32794).method31933()).method32579(true),
               Class9735.method38146().method38147(Class8514.field37972)
            )
         )
         .method27308(
            Class8514.field38177,
            new TranslationTextComponent("advancements.husbandry.safely_harvest_honey.title"),
            new TranslationTextComponent("advancements.husbandry.safely_harvest_honey.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27317(var1, "husbandry/safely_harvest_honey");
      Class7999.method27304()
         .method27305(var4)
         .method27312(
            "silk_touch_nest",
            Class4479.method14139(
               Blocks.field37117,
               Class9735.method38146().method38150(new Class8605(Class8122.field34916, Class8840.method32014(1))),
               Class8840.method32013(3)
            )
         )
         .method27308(
            Blocks.field37117,
            new TranslationTextComponent("advancements.husbandry.silk_touch_nest.title"),
            new TranslationTextComponent("advancements.husbandry.silk_touch_nest.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27317(var1, "husbandry/silk_touch_nest");
   }

   private Class7999 method11036(Class7999 var1) {
      for (Class3257 var7 : field17618) {
         var1.method27312(Registry.field16075.method9181(var7).method8292(), Class4489.method14159(var7));
      }

      return var1;
   }

   private Class7999 method11037(Class7999 var1) {
      for (Class8992 var7 : field17615) {
         var1.method27312(Class8992.method33198(var7).toString(), Class4462.method14105(Class7552.method24700().method24701(var7)));
      }

      var1.method27312(
         Class8992.method33198(Class8992.field41096).toString(),
         Class4462.method14106(
            Class7552.method24700().method24701(Class8992.field41096).method24717(),
            Class7552.method24700().method24701(Class8992.field41096).method24717(),
            Class6671.field29242
         )
      );
      return var1;
   }

   private Class7999 method11038(Class7999 var1) {
      for (Class3257 var7 : field17617) {
         var1.method27312(Registry.field16075.method9181(var7).method8292(), Class4490.method14161(Class9735.method38146().method38147(var7).method38151()));
      }

      return var1;
   }

   private Class7999 method11039(Class7999 var1) {
      for (Class3257 var7 : field17616) {
         var1.method27312(
            Registry.field16075.method9181(var7).method8292(),
            Class4487.method14154(Class8634.field38839, Class6671.field29242, Class9735.method38146().method38147(var7).method38151())
         );
      }

      return var1;
   }

   private Class7999 method11040(Class7999 var1) {
      Class1098.field6041
         .forEach((var1x, var2) -> var1.method27312(var2.method8292(), Class4460.method14100(Class7552.method24700().method24703(var2).method24717())));
      return var1;
   }
}
