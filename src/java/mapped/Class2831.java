package mapped;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

import net.minecraft.advancements.Advancement;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.TranslationTextComponent;

public class Class2831 implements Consumer<Consumer<Advancement>> {
   private static final List<RegistryKey<Biome>> field17610 = ImmutableList.of(
      Class9495.field44149,
      Class9495.field44128,
      Class9495.field44127,
      Class9495.field44123,
      Class9495.field44139,
      Class9495.field44154,
      Class9495.field44151,
      Class9495.field44158,
      Class9495.field44125,
      Class9495.field44146,
      Class9495.field44133,
      Class9495.field44140,
      new RegistryKey[]{
         Class9495.field44134,
         Class9495.field44159,
         Class9495.field44156,
         Class9495.field44122,
         Class9495.field44132,
         Class9495.field44153,
         Class9495.field44147,
         Class9495.field44143,
         Class9495.field44144,
         Class9495.field44136,
         Class9495.field44124,
         Class9495.field44138,
         Class9495.field44142,
         Class9495.field44137,
         Class9495.field44157,
         Class9495.field44152,
         Class9495.field44160,
         Class9495.field44150,
         Class9495.field44126,
         Class9495.field44148,
         Class9495.field44135,
         Class9495.field44155,
         Class9495.field44165,
         Class9495.field44166,
         Class9495.field44167,
         Class9495.field44169,
         Class9495.field44170,
         Class9495.field44171,
         Class9495.field44194,
         Class9495.field44195
      }
   );
   private static final EntityType<?>[] field17611 = new EntityType[]{
      EntityType.field41010,
      EntityType.field41013,
      EntityType.field41017,
      EntityType.field41021,
      EntityType.field41022,
      EntityType.field41024,
      EntityType.field41025,
      EntityType.field41026,
      EntityType.field41027,
      EntityType.field41034,
      EntityType.field41036,
      EntityType.field41037,
      EntityType.field41039,
      EntityType.field41049,
      EntityType.field41063,
      EntityType.field41065,
      EntityType.field41066,
      EntityType.field41067,
      EntityType.field41072,
      EntityType.field41075,
      EntityType.field41077,
      EntityType.field41078,
      EntityType.field41080,
      EntityType.field41085,
      EntityType.field41087,
      EntityType.field41097,
      EntityType.field41099,
      EntityType.field41101,
      EntityType.field41103,
      EntityType.field41102,
      EntityType.field41106,
      EntityType.field41109,
      EntityType.field41107,
      EntityType.field41110
   };

   public void accept(Consumer<Advancement> var1) {
      Advancement var4 = Class7999.method27304()
         .method27308(
            Items.field38056,
            new TranslationTextComponent("advancements.adventure.root.title"),
            new TranslationTextComponent("advancements.adventure.root.description"),
            new ResourceLocation("textures/gui/advancements/backgrounds/adventure.png"),
            Class1965.field12814,
            false,
            false,
            false
         )
         .method27314(Class9014.field41221)
         .method27312("killed_something", Class4476.method14135())
         .method27312("killed_by_something", Class4476.method14137())
         .method27317(var1, "adventure/root");
      Advancement var5 = Class7999.method27304()
         .method27305(var4)
         .method27308(
            Blocks.RED_BED,
            new TranslationTextComponent("advancements.adventure.sleep_in_bed.title"),
            new TranslationTextComponent("advancements.adventure.sleep_in_bed.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("slept_in_bed", Class4474.method14131())
         .method27317(var1, "adventure/sleep_in_bed");
      method11031(Class7999.method27304(), field17610)
         .method27305(var5)
         .method27308(
            Items.field37859,
            new TranslationTextComponent("advancements.adventure.adventuring_time.title"),
            new TranslationTextComponent("advancements.adventure.adventuring_time.description"),
            (ResourceLocation)null,
            Class1965.field12815,
            true,
            true,
            false
         )
         .method27310(Class9182.method34343(500))
         .method27317(var1, "adventure/adventuring_time");
      Advancement var6 = Class7999.method27304()
         .method27305(var4)
         .method27308(
            Items.field38049,
            new TranslationTextComponent("advancements.adventure.trade.title"),
            new TranslationTextComponent("advancements.adventure.trade.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("traded", Class4461.method14102())
         .method27317(var1, "adventure/trade");
      Advancement var7 = this.method11030(Class7999.method27304())
         .method27305(var4)
         .method27308(
            Items.field37820,
            new TranslationTextComponent("advancements.adventure.kill_a_mob.title"),
            new TranslationTextComponent("advancements.adventure.kill_a_mob.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27314(Class9014.field41221)
         .method27317(var1, "adventure/kill_a_mob");
      this.method11030(Class7999.method27304())
         .method27305(var7)
         .method27308(
            Items.field37825,
            new TranslationTextComponent("advancements.adventure.kill_all_mobs.title"),
            new TranslationTextComponent("advancements.adventure.kill_all_mobs.description"),
            (ResourceLocation)null,
            Class1965.field12815,
            true,
            true,
            false
         )
         .method27310(Class9182.method34343(100))
         .method27317(var1, "adventure/kill_all_mobs");
      Advancement var8 = Class7999.method27304()
         .method27305(var7)
         .method27308(
            Items.BOW,
            new TranslationTextComponent("advancements.adventure.shoot_arrow.title"),
            new TranslationTextComponent("advancements.adventure.shoot_arrow.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312(
            "shot_arrow",
            Class4469.method14120(
               Class9024.method33410()
                  .method33412(Class9714.method38056().method38057(true).method38059(Class7552.method24700().method24702(Class8613.field38737)))
            )
         )
         .method27317(var1, "adventure/shoot_arrow");
      Advancement var9 = Class7999.method27304()
         .method27305(var7)
         .method27308(
            Items.field38144,
            new TranslationTextComponent("advancements.adventure.throw_trident.title"),
            new TranslationTextComponent("advancements.adventure.throw_trident.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312(
            "shot_trident",
            Class4469.method14120(
               Class9024.method33410()
                  .method33412(Class9714.method38056().method38057(true).method38059(Class7552.method24700().method24701(EntityType.field41093)))
            )
         )
         .method27317(var1, "adventure/throw_trident");
      Class7999.method27304()
         .method27305(var9)
         .method27308(
            Items.field38144,
            new TranslationTextComponent("advancements.adventure.very_very_frightening.title"),
            new TranslationTextComponent("advancements.adventure.very_very_frightening.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("struck_villager", Class4493.method14169(Class7552.method24700().method24701(EntityType.field41098).method24717()))
         .method27317(var1, "adventure/very_very_frightening");
      Class7999.method27304()
         .method27305(var6)
         .method27308(
            Blocks.field36589,
            new TranslationTextComponent("advancements.adventure.summon_iron_golem.title"),
            new TranslationTextComponent("advancements.adventure.summon_iron_golem.description"),
            (ResourceLocation)null,
            Class1965.field12816,
            true,
            true,
            false
         )
         .method27312("summoned_golem", Class4456.method14090(Class7552.method24700().method24701(EntityType.field41041)))
         .method27317(var1, "adventure/summon_iron_golem");
      Class7999.method27304()
         .method27305(var8)
         .method27308(
            Items.field37797,
            new TranslationTextComponent("advancements.adventure.sniper_duel.title"),
            new TranslationTextComponent("advancements.adventure.sniper_duel.description"),
            (ResourceLocation)null,
            Class1965.field12815,
            true,
            true,
            false
         )
         .method27310(Class9182.method34343(50))
         .method27312(
            "killed_skeleton",
            Class4476.method14136(
               Class7552.method24700().method24701(EntityType.field41078).method24705(Class8884.method32326(Class8841.method32022(50.0F))),
               Class9714.method38056().method38057(true)
            )
         )
         .method27317(var1, "adventure/sniper_duel");
      Class7999.method27304()
         .method27305(var7)
         .method27308(
            Items.field38126,
            new TranslationTextComponent("advancements.adventure.totem_of_undying.title"),
            new TranslationTextComponent("advancements.adventure.totem_of_undying.description"),
            (ResourceLocation)null,
            Class1965.field12816,
            true,
            true,
            false
         )
         .method27312("used_totem", Class4472.method14126(Items.field38126))
         .method27317(var1, "adventure/totem_of_undying");
      Advancement var10 = Class7999.method27304()
         .method27305(var4)
         .method27308(
            Items.field38148,
            new TranslationTextComponent("advancements.adventure.ol_betsy.title"),
            new TranslationTextComponent("advancements.adventure.ol_betsy.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("shot_crossbow", Class4482.method14145(Items.field38148))
         .method27317(var1, "adventure/ol_betsy");
      Class7999.method27304()
         .method27305(var10)
         .method27308(
            Items.field38148,
            new TranslationTextComponent("advancements.adventure.whos_the_pillager_now.title"),
            new TranslationTextComponent("advancements.adventure.whos_the_pillager_now.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("kill_pillager", Class4467.method14115(Class7552.method24700().method24701(EntityType.field41067)))
         .method27317(var1, "adventure/whos_the_pillager_now");
      Class7999.method27304()
         .method27305(var10)
         .method27308(
            Items.field38148,
            new TranslationTextComponent("advancements.adventure.two_birds_one_arrow.title"),
            new TranslationTextComponent("advancements.adventure.two_birds_one_arrow.description"),
            (ResourceLocation)null,
            Class1965.field12815,
            true,
            true,
            false
         )
         .method27310(Class9182.method34343(65))
         .method27312(
            "two_birds",
            Class4467.method14115(Class7552.method24700().method24701(EntityType.field41063), Class7552.method24700().method24701(EntityType.field41063))
         )
         .method27317(var1, "adventure/two_birds_one_arrow");
      Class7999.method27304()
         .method27305(var10)
         .method27308(
            Items.field38148,
            new TranslationTextComponent("advancements.adventure.arbalistic.title"),
            new TranslationTextComponent("advancements.adventure.arbalistic.description"),
            (ResourceLocation)null,
            Class1965.field12815,
            true,
            true,
            true
         )
         .method27310(Class9182.method34343(85))
         .method27312("arbalistic", Class4467.method14116(Class8840.method32013(5)))
         .method27317(var1, "adventure/arbalistic");
      Advancement var11 = Class7999.method27304()
         .method27305(var4)
         .method27307(
            Class7699.method25421(),
            new TranslationTextComponent("advancements.adventure.voluntary_exile.title"),
            new TranslationTextComponent("advancements.adventure.voluntary_exile.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            true
         )
         .method27312("voluntary_exile", Class4476.method14134(Class7552.method24700().method24702(Class8613.field38735).method24710(Class6597.field29028)))
         .method27317(var1, "adventure/voluntary_exile");
      Class7999.method27304()
         .method27305(var11)
         .method27307(
            Class7699.method25421(),
            new TranslationTextComponent("advancements.adventure.hero_of_the_village.title"),
            new TranslationTextComponent("advancements.adventure.hero_of_the_village.description"),
            (ResourceLocation)null,
            Class1965.field12815,
            true,
            true,
            true
         )
         .method27310(Class9182.method34343(100))
         .method27312("hero_of_the_village", Class4474.method14132())
         .method27317(var1, "adventure/hero_of_the_village");
      Class7999.method27304()
         .method27305(var4)
         .method27308(
            Blocks.field37119.method11581(),
            new TranslationTextComponent("advancements.adventure.honey_block_slide.title"),
            new TranslationTextComponent("advancements.adventure.honey_block_slide.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("honey_block_slide", Class4468.method14118(Blocks.field37119))
         .method27317(var1, "adventure/honey_block_slide");
      Class7999.method27304()
         .method27305(var8)
         .method27308(
            Blocks.field37116.method11581(),
            new TranslationTextComponent("advancements.adventure.bullseye.title"),
            new TranslationTextComponent("advancements.adventure.bullseye.description"),
            (ResourceLocation)null,
            Class1965.field12815,
            true,
            true,
            false
         )
         .method27310(Class9182.method34343(50))
         .method27312(
            "bullseye",
            Class4473.method14128(
               Class8840.method32013(15),
               Class9587.method37226(Class7552.method24700().method24705(Class8884.method32326(Class8841.method32022(30.0F))).method24717())
            )
         )
         .method27317(var1, "adventure/bullseye");
   }

   private Class7999 method11030(Class7999 var1) {
      for (EntityType var7 : field17611) {
         var1.method27312(Registry.ENTITY_TYPE.getKey(var7).toString(), Class4476.method14134(Class7552.method24700().method24701(var7)));
      }

      return var1;
   }

   public static Class7999 method11031(Class7999 var0, List<RegistryKey<Biome>> var1) {
      for (RegistryKey var5 : var1) {
         var0.method27312(var5.getLocation().toString(), Class4474.method14130(Class8576.method30647(var5)));
      }

      return var0;
   }
}
