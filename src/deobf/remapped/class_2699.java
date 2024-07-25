package remapped;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2699 implements Consumer<Consumer<class_3139>> {
   private static final List<class_5621<class_6325>> field_13225 = ImmutableList.of(
      class_8606.field_44071,
      class_8606.field_44139,
      class_8606.field_44089,
      class_8606.field_44094,
      class_8606.field_44079,
      class_8606.field_44145,
      class_8606.field_44119,
      class_8606.field_44110,
      class_8606.field_44076,
      class_8606.field_44135,
      class_8606.field_44142,
      class_8606.field_44133,
      new class_5621[]{
         class_8606.field_44070,
         class_8606.field_44127,
         class_8606.field_44081,
         class_8606.field_44136,
         class_8606.field_44082,
         class_8606.field_44093,
         class_8606.field_44097,
         class_8606.field_44114,
         class_8606.field_44080,
         class_8606.field_44091,
         class_8606.field_44074,
         class_8606.field_44101,
         class_8606.field_44078,
         class_8606.field_44073,
         class_8606.field_44095,
         class_8606.field_44083,
         class_8606.field_44124,
         class_8606.field_44118,
         class_8606.field_44138,
         class_8606.field_44113,
         class_8606.field_44072,
         class_8606.field_44100,
         class_8606.field_44103,
         class_8606.field_44086,
         class_8606.field_44088,
         class_8606.field_44116,
         class_8606.field_44092,
         class_8606.field_44115,
         class_8606.field_44132,
         class_8606.field_44148
      }
   );
   private static final class_6629<?>[] field_13226 = new class_6629[]{
      class_6629.field_34301,
      class_6629.field_34272,
      class_6629.field_34210,
      class_6629.field_34211,
      class_6629.field_34324,
      class_6629.field_34310,
      class_6629.field_34308,
      class_6629.field_34264,
      class_6629.field_34296,
      class_6629.field_34281,
      class_6629.field_34307,
      class_6629.field_34306,
      class_6629.field_34266,
      class_6629.field_34295,
      class_6629.field_34246,
      class_6629.field_34240,
      class_6629.field_34257,
      class_6629.field_34265,
      class_6629.field_34318,
      class_6629.field_34231,
      class_6629.field_34314,
      class_6629.field_34241,
      class_6629.field_34222,
      class_6629.field_34223,
      class_6629.field_34322,
      class_6629.field_34277,
      class_6629.field_34255,
      class_6629.field_34220,
      class_6629.field_34317,
      class_6629.field_34212,
      class_6629.field_34244,
      class_6629.field_34227,
      class_6629.field_34297,
      class_6629.field_34234
   };

   public void accept(Consumer<class_3139> var1) {
      class_3139 var4 = class_3321.method_15269()
         .method_15263(
            class_4897.field_25113,
            new TranslationTextComponent("advancements.adventure.root.title"),
            new TranslationTextComponent("advancements.adventure.root.description"),
            new class_4639("textures/gui/advancements/backgrounds/adventure.png"),
            class_3361.field_16556,
            false,
            false,
            false
         )
         .method_15271(class_6701.field_34598)
         .method_15272("killed_something", class_3780.method_17503())
         .method_15272("killed_by_something", class_3780.method_17506())
         .method_15270(var1, "adventure/root");
      class_3139 var5 = class_3321.method_15269()
         .method_15274(var4)
         .method_15263(
            class_4783.field_23526,
            new TranslationTextComponent("advancements.adventure.sleep_in_bed.title"),
            new TranslationTextComponent("advancements.adventure.sleep_in_bed.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("slept_in_bed", class_2270.method_10474())
         .method_15270(var1, "adventure/sleep_in_bed");
      method_12161(class_3321.method_15269(), field_13225)
         .method_15274(var5)
         .method_15263(
            class_4897.field_24588,
            new TranslationTextComponent("advancements.adventure.adventuring_time.title"),
            new TranslationTextComponent("advancements.adventure.adventuring_time.description"),
            (class_4639)null,
            class_3361.field_16559,
            true,
            true,
            false
         )
         .method_15258(class_7365.method_33541(500))
         .method_15270(var1, "adventure/adventuring_time");
      class_3139 var6 = class_3321.method_15269()
         .method_15274(var4)
         .method_15263(
            class_4897.field_24997,
            new TranslationTextComponent("advancements.adventure.trade.title"),
            new TranslationTextComponent("advancements.adventure.trade.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("traded", class_9203.method_42463())
         .method_15270(var1, "adventure/trade");
      class_3139 var7 = this.method_12160(class_3321.method_15269())
         .method_15274(var4)
         .method_15263(
            class_4897.field_25277,
            new TranslationTextComponent("advancements.adventure.kill_a_mob.title"),
            new TranslationTextComponent("advancements.adventure.kill_a_mob.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15271(class_6701.field_34598)
         .method_15270(var1, "adventure/kill_a_mob");
      this.method_12160(class_3321.method_15269())
         .method_15274(var7)
         .method_15263(
            class_4897.field_24500,
            new TranslationTextComponent("advancements.adventure.kill_all_mobs.title"),
            new TranslationTextComponent("advancements.adventure.kill_all_mobs.description"),
            (class_4639)null,
            class_3361.field_16559,
            true,
            true,
            false
         )
         .method_15258(class_7365.method_33541(100))
         .method_15270(var1, "adventure/kill_all_mobs");
      class_3139 var8 = class_3321.method_15269()
         .method_15274(var7)
         .method_15263(
            class_4897.field_25206,
            new TranslationTextComponent("advancements.adventure.shoot_arrow.title"),
            new TranslationTextComponent("advancements.adventure.shoot_arrow.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272(
            "shot_arrow",
            class_3324.method_15278(
               class_6724.method_30857()
                  .method_30855(class_9447.method_43695().method_43694(true).method_43696(class_2184.method_10127().method_10132(class_5218.field_26794)))
            )
         )
         .method_15270(var1, "adventure/shoot_arrow");
      class_3139 var9 = class_3321.method_15269()
         .method_15274(var7)
         .method_15263(
            class_4897.field_25086,
            new TranslationTextComponent("advancements.adventure.throw_trident.title"),
            new TranslationTextComponent("advancements.adventure.throw_trident.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272(
            "shot_trident",
            class_3324.method_15278(
               class_6724.method_30857()
                  .method_30855(class_9447.method_43695().method_43694(true).method_43696(class_2184.method_10127().method_10134(class_6629.field_34284)))
            )
         )
         .method_15270(var1, "adventure/throw_trident");
      class_3321.method_15269()
         .method_15274(var9)
         .method_15263(
            class_4897.field_25086,
            new TranslationTextComponent("advancements.adventure.very_very_frightening.title"),
            new TranslationTextComponent("advancements.adventure.very_very_frightening.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("struck_villager", class_6047.method_27614(class_2184.method_10127().method_10134(class_6629.field_34276).method_10139()))
         .method_15270(var1, "adventure/very_very_frightening");
      class_3321.method_15269()
         .method_15274(var6)
         .method_15263(
            class_4783.field_23281,
            new TranslationTextComponent("advancements.adventure.summon_iron_golem.title"),
            new TranslationTextComponent("advancements.adventure.summon_iron_golem.description"),
            (class_4639)null,
            class_3361.field_16561,
            true,
            true,
            false
         )
         .method_15272("summoned_golem", class_146.method_566(class_2184.method_10127().method_10134(class_6629.field_34298)))
         .method_15270(var1, "adventure/summon_iron_golem");
      class_3321.method_15269()
         .method_15274(var8)
         .method_15263(
            class_4897.field_25024,
            new TranslationTextComponent("advancements.adventure.sniper_duel.title"),
            new TranslationTextComponent("advancements.adventure.sniper_duel.description"),
            (class_4639)null,
            class_3361.field_16559,
            true,
            true,
            false
         )
         .method_15258(class_7365.method_33541(50))
         .method_15272(
            "killed_skeleton",
            class_3780.method_17505(
               class_2184.method_10127().method_10134(class_6629.field_34241).method_10128(class_6254.method_28550(class_6115.method_28094(50.0F))),
               class_9447.method_43695().method_43694(true)
            )
         )
         .method_15270(var1, "adventure/sniper_duel");
      class_3321.method_15269()
         .method_15274(var7)
         .method_15263(
            class_4897.field_24472,
            new TranslationTextComponent("advancements.adventure.totem_of_undying.title"),
            new TranslationTextComponent("advancements.adventure.totem_of_undying.description"),
            (class_4639)null,
            class_3361.field_16561,
            true,
            true,
            false
         )
         .method_15272("used_totem", class_8367.method_38555(class_4897.field_24472))
         .method_15270(var1, "adventure/totem_of_undying");
      class_3139 var10 = class_3321.method_15269()
         .method_15274(var4)
         .method_15263(
            class_4897.field_25030,
            new TranslationTextComponent("advancements.adventure.ol_betsy.title"),
            new TranslationTextComponent("advancements.adventure.ol_betsy.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("shot_crossbow", class_9063.method_41612(class_4897.field_25030))
         .method_15270(var1, "adventure/ol_betsy");
      class_3321.method_15269()
         .method_15274(var10)
         .method_15263(
            class_4897.field_25030,
            new TranslationTextComponent("advancements.adventure.whos_the_pillager_now.title"),
            new TranslationTextComponent("advancements.adventure.whos_the_pillager_now.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("kill_pillager", class_9370.method_43337(class_2184.method_10127().method_10134(class_6629.field_34265)))
         .method_15270(var1, "adventure/whos_the_pillager_now");
      class_3321.method_15269()
         .method_15274(var10)
         .method_15263(
            class_4897.field_25030,
            new TranslationTextComponent("advancements.adventure.two_birds_one_arrow.title"),
            new TranslationTextComponent("advancements.adventure.two_birds_one_arrow.description"),
            (class_4639)null,
            class_3361.field_16559,
            true,
            true,
            false
         )
         .method_15258(class_7365.method_33541(65))
         .method_15272(
            "two_birds",
            class_9370.method_43337(
               class_2184.method_10127().method_10134(class_6629.field_34246), class_2184.method_10127().method_10134(class_6629.field_34246)
            )
         )
         .method_15270(var1, "adventure/two_birds_one_arrow");
      class_3321.method_15269()
         .method_15274(var10)
         .method_15263(
            class_4897.field_25030,
            new TranslationTextComponent("advancements.adventure.arbalistic.title"),
            new TranslationTextComponent("advancements.adventure.arbalistic.description"),
            (class_4639)null,
            class_3361.field_16559,
            true,
            true,
            true
         )
         .method_15258(class_7365.method_33541(85))
         .method_15272("arbalistic", class_9370.method_43336(class_7781.method_35312(5)))
         .method_15270(var1, "adventure/arbalistic");
      class_3139 var11 = class_3321.method_15269()
         .method_15274(var4)
         .method_15261(
            class_2452.method_11292(),
            new TranslationTextComponent("advancements.adventure.voluntary_exile.title"),
            new TranslationTextComponent("advancements.adventure.voluntary_exile.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            true
         )
         .method_15272(
            "voluntary_exile", class_3780.method_17504(class_2184.method_10127().method_10132(class_5218.field_26788).method_10137(class_766.field_4152))
         )
         .method_15270(var1, "adventure/voluntary_exile");
      class_3321.method_15269()
         .method_15274(var11)
         .method_15261(
            class_2452.method_11292(),
            new TranslationTextComponent("advancements.adventure.hero_of_the_village.title"),
            new TranslationTextComponent("advancements.adventure.hero_of_the_village.description"),
            (class_4639)null,
            class_3361.field_16559,
            true,
            true,
            true
         )
         .method_15258(class_7365.method_33541(100))
         .method_15272("hero_of_the_village", class_2270.method_10472())
         .method_15270(var1, "adventure/hero_of_the_village");
      class_3321.method_15269()
         .method_15274(var4)
         .method_15263(
            class_4783.field_23899.method_10803(),
            new TranslationTextComponent("advancements.adventure.honey_block_slide.title"),
            new TranslationTextComponent("advancements.adventure.honey_block_slide.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("honey_block_slide", class_9150.method_42115(class_4783.field_23899))
         .method_15270(var1, "adventure/honey_block_slide");
      class_3321.method_15269()
         .method_15274(var8)
         .method_15263(
            class_4783.field_23302.method_10803(),
            new TranslationTextComponent("advancements.adventure.bullseye.title"),
            new TranslationTextComponent("advancements.adventure.bullseye.description"),
            (class_4639)null,
            class_3361.field_16559,
            true,
            true,
            false
         )
         .method_15258(class_7365.method_33541(50))
         .method_15272(
            "bullseye",
            class_6716.method_30838(
               class_7781.method_35312(15),
               class_8938.method_41064(class_2184.method_10127().method_10128(class_6254.method_28550(class_6115.method_28094(30.0F))).method_10139())
            )
         )
         .method_15270(var1, "adventure/bullseye");
   }

   private class_3321 method_12160(class_3321 var1) {
      for (class_6629 var7 : field_13226) {
         var1.method_15272(class_8669.field_44400.method_39797(var7).toString(), class_3780.method_17504(class_2184.method_10127().method_10134(var7)));
      }

      return var1;
   }

   public static class_3321 method_12161(class_3321 var0, List<class_5621<class_6325>> var1) {
      for (class_5621 var5 : var1) {
         var0.method_15272(var5.method_25499().toString(), class_2270.method_10475(class_5093.method_23400(var5)));
      }

      return var0;
   }
}
