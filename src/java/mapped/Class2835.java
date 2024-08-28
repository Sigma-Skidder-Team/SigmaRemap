package mapped;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;
import net.minecraft.util.text.TranslationTextComponent;

public class Class2835 implements Consumer<Consumer<Class7952>> {
   private static final List<Class8705<Class8907>> field17626 = ImmutableList.of(
      Class9495.field44129, Class9495.field44196, Class9495.field44198, Class9495.field44197, Class9495.field44199
   );
   private static final Class9587 field17627 = Class9587.method37222(
      Class123.method357(
            Class2063.field13447,
            Class7552.method24700()
               .method24710(Class8330.method29204().method29205(Class9735.method38146().method38147(Class8514.field37860).method38151()).method29209())
         )
         .method24518()
         .method24517(),
      Class123.method357(
            Class2063.field13447,
            Class7552.method24700()
               .method24710(Class8330.method29204().method29206(Class9735.method38146().method38147(Class8514.field37861).method38151()).method29209())
         )
         .method24518()
         .method24517(),
      Class123.method357(
            Class2063.field13447,
            Class7552.method24700()
               .method24710(Class8330.method29204().method29207(Class9735.method38146().method38147(Class8514.field37862).method38151()).method29209())
         )
         .method24518()
         .method24517(),
      Class123.method357(
            Class2063.field13447,
            Class7552.method24700()
               .method24710(Class8330.method29204().method29208(Class9735.method38146().method38147(Class8514.field37863).method38151()).method29209())
         )
         .method24518()
         .method24517()
   );

   public void accept(Consumer<Class7952> var1) {
      Class7952 var4 = Class7999.method27304()
         .method27308(
            Blocks.field36892,
            new TranslationTextComponent("advancements.nether.root.title"),
            new TranslationTextComponent("advancements.nether.root.description"),
            new ResourceLocation("textures/gui/advancements/backgrounds/nether.png"),
            Class1965.field12814,
            false,
            false,
            false
         )
         .method27312("entered_nether", Class4488.method14156(World.field9000))
         .method27317(var1, "nether/root");
      Class7952 var5 = Class7999.method27304()
         .method27305(var4)
         .method27308(
            Class8514.field38046,
            new TranslationTextComponent("advancements.nether.return_to_sender.title"),
            new TranslationTextComponent("advancements.nether.return_to_sender.description"),
            (ResourceLocation)null,
            Class1965.field12815,
            true,
            true,
            false
         )
         .method27310(Class9182.method34343(50))
         .method27312(
            "killed_ghast",
            Class4476.method14136(
               Class7552.method24700().method24701(Class8992.field41034),
               Class9714.method38056().method38057(true).method38059(Class7552.method24700().method24701(Class8992.field41044))
            )
         )
         .method27317(var1, "nether/return_to_sender");
      Class7952 var6 = Class7999.method27304()
         .method27305(var4)
         .method27308(
            Blocks.NETHER_BRICKS,
            new TranslationTextComponent("advancements.nether.find_fortress.title"),
            new TranslationTextComponent("advancements.nether.find_fortress.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("fortress", Class4474.method14130(Class8576.method30649(Class2961.field18070)))
         .method27317(var1, "nether/find_fortress");
      Class7999.method27304()
         .method27305(var4)
         .method27308(
            Class8514.field38056,
            new TranslationTextComponent("advancements.nether.fast_travel.title"),
            new TranslationTextComponent("advancements.nether.fast_travel.description"),
            (ResourceLocation)null,
            Class1965.field12815,
            true,
            true,
            false
         )
         .method27310(Class9182.method34343(100))
         .method27312("travelled", Class4481.method14143(Class8884.method32326(Class8841.method32022(7000.0F))))
         .method27317(var1, "nether/fast_travel");
      Class7999.method27304()
         .method27305(var5)
         .method27308(
            Class8514.field37968,
            new TranslationTextComponent("advancements.nether.uneasy_alliance.title"),
            new TranslationTextComponent("advancements.nether.uneasy_alliance.description"),
            (ResourceLocation)null,
            Class1965.field12815,
            true,
            true,
            false
         )
         .method27310(Class9182.method34343(100))
         .method27312(
            "killed_ghast",
            Class4476.method14134(Class7552.method24700().method24701(Class8992.field41034).method24706(Class8576.method30648(World.field8999)))
         )
         .method27317(var1, "nether/uneasy_alliance");
      Class7952 var7 = Class7999.method27304()
         .method27305(var6)
         .method27308(
            Blocks.field36703,
            new TranslationTextComponent("advancements.nether.get_wither_skull.title"),
            new TranslationTextComponent("advancements.nether.get_wither_skull.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("wither_skull", Class4491.method14164(Blocks.field36703))
         .method27317(var1, "nether/get_wither_skull");
      Class7952 var8 = Class7999.method27304()
         .method27305(var7)
         .method27308(
            Class8514.field38066,
            new TranslationTextComponent("advancements.nether.summon_wither.title"),
            new TranslationTextComponent("advancements.nether.summon_wither.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("summoned", Class4456.method14090(Class7552.method24700().method24701(Class8992.field41102)))
         .method27317(var1, "nether/summon_wither");
      Class7952 var9 = Class7999.method27304()
         .method27305(var6)
         .method27308(
            Class8514.field37967,
            new TranslationTextComponent("advancements.nether.obtain_blaze_rod.title"),
            new TranslationTextComponent("advancements.nether.obtain_blaze_rod.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("blaze_rod", Class4491.method14164(Class8514.field37967))
         .method27317(var1, "nether/obtain_blaze_rod");
      Class7952 var10 = Class7999.method27304()
         .method27305(var8)
         .method27308(
            Blocks.BEACON,
            new TranslationTextComponent("advancements.nether.create_beacon.title"),
            new TranslationTextComponent("advancements.nether.create_beacon.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("beacon", Class4471.method14124(Class8840.method32014(1)))
         .method27317(var1, "nether/create_beacon");
      Class7999.method27304()
         .method27305(var10)
         .method27308(
            Blocks.BEACON,
            new TranslationTextComponent("advancements.nether.create_full_beacon.title"),
            new TranslationTextComponent("advancements.nether.create_full_beacon.description"),
            (ResourceLocation)null,
            Class1965.field12816,
            true,
            true,
            false
         )
         .method27312("beacon", Class4471.method14124(Class8840.method32013(4)))
         .method27317(var1, "nether/create_full_beacon");
      Class7952 var11 = Class7999.method27304()
         .method27305(var9)
         .method27308(
            Class8514.field37971,
            new TranslationTextComponent("advancements.nether.brew_potion.title"),
            new TranslationTextComponent("advancements.nether.brew_potion.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("potion", Class4470.method14122())
         .method27317(var1, "nether/brew_potion");
      Class7952 var12 = Class7999.method27304()
         .method27305(var11)
         .method27308(
            Class8514.field37891,
            new TranslationTextComponent("advancements.nether.all_potions.title"),
            new TranslationTextComponent("advancements.nether.all_potions.description"),
            (ResourceLocation)null,
            Class1965.field12815,
            true,
            true,
            false
         )
         .method27310(Class9182.method34343(100))
         .method27312(
            "all_effects",
            Class4459.method14097(
               Class9415.method36119()
                  .method36120(Class8254.field35467)
                  .method36120(Class8254.field35468)
                  .method36120(Class8254.field35471)
                  .method36120(Class8254.field35474)
                  .method36120(Class8254.field35476)
                  .method36120(Class8254.field35478)
                  .method36120(Class8254.field35479)
                  .method36120(Class8254.field35480)
                  .method36120(Class8254.field35482)
                  .method36120(Class8254.field35484)
                  .method36120(Class8254.field35485)
                  .method36120(Class8254.field35494)
                  .method36120(Class8254.field35477)
            )
         )
         .method27317(var1, "nether/all_potions");
      Class7999.method27304()
         .method27305(var12)
         .method27308(
            Class8514.field37882,
            new TranslationTextComponent("advancements.nether.all_effects.title"),
            new TranslationTextComponent("advancements.nether.all_effects.description"),
            (ResourceLocation)null,
            Class1965.field12815,
            true,
            true,
            true
         )
         .method27310(Class9182.method34343(1000))
         .method27312(
            "all_effects",
            Class4459.method14097(
               Class9415.method36119()
                  .method36120(Class8254.field35467)
                  .method36120(Class8254.field35468)
                  .method36120(Class8254.field35471)
                  .method36120(Class8254.field35474)
                  .method36120(Class8254.field35476)
                  .method36120(Class8254.field35478)
                  .method36120(Class8254.field35479)
                  .method36120(Class8254.field35480)
                  .method36120(Class8254.field35482)
                  .method36120(Class8254.field35484)
                  .method36120(Class8254.field35485)
                  .method36120(Class8254.field35486)
                  .method36120(Class8254.field35469)
                  .method36120(Class8254.field35470)
                  .method36120(Class8254.field35491)
                  .method36120(Class8254.field35490)
                  .method36120(Class8254.field35488)
                  .method36120(Class8254.field35483)
                  .method36120(Class8254.field35475)
                  .method36120(Class8254.field35477)
                  .method36120(Class8254.field35494)
                  .method36120(Class8254.field35495)
                  .method36120(Class8254.field35496)
                  .method36120(Class8254.field35481)
                  .method36120(Class8254.field35497)
                  .method36120(Class8254.field35498)
            )
         )
         .method27317(var1, "nether/all_effects");
      Class7952 var13 = Class7999.method27304()
         .method27305(var4)
         .method27308(
            Class8514.field38182,
            new TranslationTextComponent("advancements.nether.obtain_ancient_debris.title"),
            new TranslationTextComponent("advancements.nether.obtain_ancient_debris.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("ancient_debris", Class4491.method14164(Class8514.field38182))
         .method27317(var1, "nether/obtain_ancient_debris");
      Class7999.method27304()
         .method27305(var13)
         .method27308(
            Class8514.field37865,
            new TranslationTextComponent("advancements.nether.netherite_armor.title"),
            new TranslationTextComponent("advancements.nether.netherite_armor.description"),
            (ResourceLocation)null,
            Class1965.field12815,
            true,
            true,
            false
         )
         .method27310(Class9182.method34343(100))
         .method27312("netherite_armor", Class4491.method14164(Class8514.field37864, Class8514.field37865, Class8514.field37866, Class8514.field37867))
         .method27317(var1, "nether/netherite_armor");
      Class7999.method27304()
         .method27305(var13)
         .method27308(
            Class8514.field38180,
            new TranslationTextComponent("advancements.nether.use_lodestone.title"),
            new TranslationTextComponent("advancements.nether.use_lodestone.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312(
            "use_lodestone",
            Class4458.method14095(
               Class8912.method32576().method32578(Class8831.method31929().method31930(Blocks.field37129).method31933()),
               Class9735.method38146().method38147(Class8514.field37905)
            )
         )
         .method27317(var1, "nether/use_lodestone");
      Class7952 var14 = Class7999.method27304()
         .method27305(var4)
         .method27308(
            Class8514.field38184,
            new TranslationTextComponent("advancements.nether.obtain_crying_obsidian.title"),
            new TranslationTextComponent("advancements.nether.obtain_crying_obsidian.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("crying_obsidian", Class4491.method14164(Class8514.field38184))
         .method27317(var1, "nether/obtain_crying_obsidian");
      Class7999.method27304()
         .method27305(var14)
         .method27308(
            Class8514.field38197,
            new TranslationTextComponent("advancements.nether.charge_respawn_anchor.title"),
            new TranslationTextComponent("advancements.nether.charge_respawn_anchor.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312(
            "charge_respawn_anchor",
            Class4458.method14095(
               Class8912.method32576()
                  .method32578(
                     Class8831.method31929()
                        .method31930(Blocks.field37124)
                        .method31932(Class9178.method34325().method34327(Class3389.field19000, 4).method34330())
                        .method31933()
                  ),
               Class9735.method38146().method38147(Blocks.field36587)
            )
         )
         .method27317(var1, "nether/charge_respawn_anchor");
      Class7952 var15 = Class7999.method27304()
         .method27305(var4)
         .method27308(
            Class8514.field38065,
            new TranslationTextComponent("advancements.nether.ride_strider.title"),
            new TranslationTextComponent("advancements.nether.ride_strider.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312(
            "used_warped_fungus_on_a_stick",
            Class4484.method14149(
               Class9587.method37226(Class7552.method24700().method24713(Class7552.method24700().method24701(Class8992.field41088).method24717()).method24717()),
               Class9735.method38146().method38147(Class8514.field38065).method38151(),
               Class8840.field39936
            )
         )
         .method27317(var1, "nether/ride_strider");
      Class2831.method11031(Class7999.method27304(), field17626)
         .method27305(var15)
         .method27308(
            Class8514.field37867,
            new TranslationTextComponent("advancements.nether.explore_nether.title"),
            new TranslationTextComponent("advancements.nether.explore_nether.description"),
            (ResourceLocation)null,
            Class1965.field12815,
            true,
            true,
            false
         )
         .method27310(Class9182.method34343(500))
         .method27317(var1, "nether/explore_nether");
      Class7952 var16 = Class7999.method27304()
         .method27305(var4)
         .method27308(
            Class8514.field38193,
            new TranslationTextComponent("advancements.nether.find_bastion.title"),
            new TranslationTextComponent("advancements.nether.find_bastion.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("bastion", Class4474.method14130(Class8576.method30649(Class2961.field18075)))
         .method27317(var1, "nether/find_bastion");
      Class7999.method27304()
         .method27305(var16)
         .method27308(
            Blocks.CHEST,
            new TranslationTextComponent("advancements.nether.loot_bastion.title"),
            new TranslationTextComponent("advancements.nether.loot_bastion.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27314(Class9014.field41221)
         .method27312("loot_bastion_other", Class4483.method14147(new ResourceLocation("minecraft:chests/bastion_other")))
         .method27312("loot_bastion_treasure", Class4483.method14147(new ResourceLocation("minecraft:chests/bastion_treasure")))
         .method27312("loot_bastion_hoglin_stable", Class4483.method14147(new ResourceLocation("minecraft:chests/bastion_hoglin_stable")))
         .method27312("loot_bastion_bridge", Class4483.method14147(new ResourceLocation("minecraft:chests/bastion_bridge")))
         .method27317(var1, "nether/loot_bastion");
      Class7999.method27304()
         .method27305(var4)
         .method27314(Class9014.field41221)
         .method27308(
            Class8514.field37802,
            new TranslationTextComponent("advancements.nether.distract_piglin.title"),
            new TranslationTextComponent("advancements.nether.distract_piglin.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312(
            "distract_piglin",
            Class4492.method14167(
               field17627,
               Class9735.method38146().method38148(Class5985.field26109),
               Class9587.method37226(
                  Class7552.method24700().method24701(Class8992.field41065).method24709(Class8265.method28830().method28832(false).method28833()).method24717()
               )
            )
         )
         .method27312(
            "distract_piglin_directly",
            Class4494.method14172(
               field17627,
               Class9735.method38146().method38147(Class4388.field21458),
               Class9587.method37226(
                  Class7552.method24700().method24701(Class8992.field41065).method24709(Class8265.method28830().method28832(false).method28833()).method24717()
               )
            )
         )
         .method27317(var1, "nether/distract_piglin");
   }
}