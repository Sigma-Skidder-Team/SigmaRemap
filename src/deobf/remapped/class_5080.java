package remapped;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5080 implements Consumer<Consumer<class_3139>> {
   private static final List<class_5621<class_6325>> field_26234 = ImmutableList.of(
      class_8606.field_44109, class_8606.field_44096, class_8606.field_44112, class_8606.field_44146, class_8606.field_44129
   );
   private static final class_8938 field_26233 = class_8938.method_41068(
      class_2338.method_10701(
            class_5848.field_29714,
            class_2184.method_10127()
               .method_10137(
                  class_4295.method_19947().method_19945(class_9518.method_43918().method_43915(class_4897.field_24338).method_43921()).method_19943()
               )
         )
         .method_25792()
         .method_25791(),
      class_2338.method_10701(
            class_5848.field_29714,
            class_2184.method_10127()
               .method_10137(
                  class_4295.method_19947().method_19942(class_9518.method_43918().method_43915(class_4897.field_24849).method_43921()).method_19943()
               )
         )
         .method_25792()
         .method_25791(),
      class_2338.method_10701(
            class_5848.field_29714,
            class_2184.method_10127()
               .method_10137(
                  class_4295.method_19947().method_19946(class_9518.method_43918().method_43915(class_4897.field_25088).method_43921()).method_19943()
               )
         )
         .method_25792()
         .method_25791(),
      class_2338.method_10701(
            class_5848.field_29714,
            class_2184.method_10127()
               .method_10137(
                  class_4295.method_19947().method_19944(class_9518.method_43918().method_43915(class_4897.field_25132).method_43921()).method_19943()
               )
         )
         .method_25792()
         .method_25791()
   );

   public void accept(Consumer<class_3139> var1) {
      class_3139 var4 = class_3321.method_15269()
         .method_15263(
            class_4783.field_23419,
            new TranslationTextComponent("advancements.nether.root.title"),
            new TranslationTextComponent("advancements.nether.root.description"),
            new Identifier("textures/gui/advancements/backgrounds/nether.png"),
            class_3361.field_16556,
            false,
            false,
            false
         )
         .method_15272("entered_nether", class_7888.method_35667(World.field_33029))
         .method_15270(var1, "nether/root");
      class_3139 var5 = class_3321.method_15269()
         .method_15274(var4)
         .method_15263(
            class_4897.field_24352,
            new TranslationTextComponent("advancements.nether.return_to_sender.title"),
            new TranslationTextComponent("advancements.nether.return_to_sender.description"),
            (Identifier)null,
            class_3361.field_16559,
            true,
            true,
            false
         )
         .method_15258(class_7365.method_33541(50))
         .method_15272(
            "killed_ghast",
            class_3780.method_17505(
               class_2184.method_10127().method_10134(class_6629.field_34281),
               class_9447.method_43695().method_43694(true).method_43696(class_2184.method_10127().method_10134(class_6629.field_34216))
            )
         )
         .method_15270(var1, "nether/return_to_sender");
      class_3139 var6 = class_3321.method_15269()
         .method_15274(var4)
         .method_15263(
            class_4783.field_23484,
            new TranslationTextComponent("advancements.nether.find_fortress.title"),
            new TranslationTextComponent("advancements.nether.find_fortress.description"),
            (Identifier)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("fortress", class_2270.method_10475(class_5093.method_23397(class_5390.field_27510)))
         .method_15270(var1, "nether/find_fortress");
      class_3321.method_15269()
         .method_15274(var4)
         .method_15263(
            class_4897.field_25113,
            new TranslationTextComponent("advancements.nether.fast_travel.title"),
            new TranslationTextComponent("advancements.nether.fast_travel.description"),
            (Identifier)null,
            class_3361.field_16559,
            true,
            true,
            false
         )
         .method_15258(class_7365.method_33541(100))
         .method_15272("travelled", class_2230.method_10275(class_6254.method_28550(class_6115.method_28094(7000.0F))))
         .method_15270(var1, "nether/fast_travel");
      class_3321.method_15269()
         .method_15274(var5)
         .method_15263(
            class_4897.field_24831,
            new TranslationTextComponent("advancements.nether.uneasy_alliance.title"),
            new TranslationTextComponent("advancements.nether.uneasy_alliance.description"),
            (Identifier)null,
            class_3361.field_16559,
            true,
            true,
            false
         )
         .method_15258(class_7365.method_33541(100))
         .method_15272(
            "killed_ghast",
            class_3780.method_17504(
               class_2184.method_10127().method_10134(class_6629.field_34281).method_10141(class_5093.method_23399(World.field_33048))
            )
         )
         .method_15270(var1, "nether/uneasy_alliance");
      class_3139 var7 = class_3321.method_15269()
         .method_15274(var6)
         .method_15263(
            class_4783.field_23444,
            new TranslationTextComponent("advancements.nether.get_wither_skull.title"),
            new TranslationTextComponent("advancements.nether.get_wither_skull.description"),
            (Identifier)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("wither_skull", class_6459.method_29434(class_4783.field_23444))
         .method_15270(var1, "nether/get_wither_skull");
      class_3139 var8 = class_3321.method_15269()
         .method_15274(var7)
         .method_15263(
            class_4897.field_24381,
            new TranslationTextComponent("advancements.nether.summon_wither.title"),
            new TranslationTextComponent("advancements.nether.summon_wither.description"),
            (Identifier)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("summoned", class_146.method_566(class_2184.method_10127().method_10134(class_6629.field_34212)))
         .method_15270(var1, "nether/summon_wither");
      class_3139 var9 = class_3321.method_15269()
         .method_15274(var6)
         .method_15263(
            class_4897.field_25294,
            new TranslationTextComponent("advancements.nether.obtain_blaze_rod.title"),
            new TranslationTextComponent("advancements.nether.obtain_blaze_rod.description"),
            (Identifier)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("blaze_rod", class_6459.method_29434(class_4897.field_25294))
         .method_15270(var1, "nether/obtain_blaze_rod");
      class_3139 var10 = class_3321.method_15269()
         .method_15274(var8)
         .method_15263(
            class_4783.field_23862,
            new TranslationTextComponent("advancements.nether.create_beacon.title"),
            new TranslationTextComponent("advancements.nether.create_beacon.description"),
            (Identifier)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("beacon", class_677.method_3087(class_7781.method_35305(1)))
         .method_15270(var1, "nether/create_beacon");
      class_3321.method_15269()
         .method_15274(var10)
         .method_15263(
            class_4783.field_23862,
            new TranslationTextComponent("advancements.nether.create_full_beacon.title"),
            new TranslationTextComponent("advancements.nether.create_full_beacon.description"),
            (Identifier)null,
            class_3361.field_16561,
            true,
            true,
            false
         )
         .method_15272("beacon", class_677.method_3087(class_7781.method_35312(4)))
         .method_15270(var1, "nether/create_full_beacon");
      class_3139 var11 = class_3321.method_15269()
         .method_15274(var9)
         .method_15263(
            class_4897.field_25157,
            new TranslationTextComponent("advancements.nether.brew_potion.title"),
            new TranslationTextComponent("advancements.nether.brew_potion.description"),
            (Identifier)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("potion", class_1434.method_6585())
         .method_15270(var1, "nether/brew_potion");
      class_3139 var12 = class_3321.method_15269()
         .method_15274(var11)
         .method_15263(
            class_4897.field_24579,
            new TranslationTextComponent("advancements.nether.all_potions.title"),
            new TranslationTextComponent("advancements.nether.all_potions.description"),
            (Identifier)null,
            class_3361.field_16559,
            true,
            true,
            false
         )
         .method_15258(class_7365.method_33541(100))
         .method_15272(
            "all_effects",
            class_2162.method_10059(
               class_8286.method_38242()
                  .method_38238(Effects.field_19739)
                  .method_38238(Effects.field_19743)
                  .method_38238(Effects.field_19733)
                  .method_38238(Effects.field_19730)
                  .method_38238(Effects.field_19742)
                  .method_38238(Effects.field_19745)
                  .method_38238(Effects.field_19720)
                  .method_38238(Effects.field_19740)
                  .method_38238(Effects.field_19746)
                  .method_38238(Effects.field_19737)
                  .method_38238(Effects.field_19718)
                  .method_38238(Effects.field_19750)
                  .method_38238(Effects.field_19727)
            )
         )
         .method_15270(var1, "nether/all_potions");
      class_3321.method_15269()
         .method_15274(var12)
         .method_15263(
            class_4897.field_24548,
            new TranslationTextComponent("advancements.nether.all_effects.title"),
            new TranslationTextComponent("advancements.nether.all_effects.description"),
            (Identifier)null,
            class_3361.field_16559,
            true,
            true,
            true
         )
         .method_15258(class_7365.method_33541(1000))
         .method_15272(
            "all_effects",
            class_2162.method_10059(
               class_8286.method_38242()
                  .method_38238(Effects.field_19739)
                  .method_38238(Effects.field_19743)
                  .method_38238(Effects.field_19733)
                  .method_38238(Effects.field_19730)
                  .method_38238(Effects.field_19742)
                  .method_38238(Effects.field_19745)
                  .method_38238(Effects.field_19720)
                  .method_38238(Effects.field_19740)
                  .method_38238(Effects.field_19746)
                  .method_38238(Effects.field_19737)
                  .method_38238(Effects.field_19718)
                  .method_38238(Effects.field_19725)
                  .method_38238(Effects.field_19735)
                  .method_38238(Effects.field_19748)
                  .method_38238(Effects.LevitationEffect)
                  .method_38238(Effects.field_19722)
                  .method_38238(Effects.field_19731)
                  .method_38238(Effects.field_19747)
                  .method_38238(Effects.NAUSEA)
                  .method_38238(Effects.field_19727)
                  .method_38238(Effects.field_19750)
                  .method_38238(Effects.field_19744)
                  .method_38238(Effects.field_19724)
                  .method_38238(Effects.field_19736)
                  .method_38238(Effects.field_19721)
                  .method_38238(Effects.field_19741)
            )
         )
         .method_15270(var1, "nether/all_effects");
      class_3139 var13 = class_3321.method_15269()
         .method_15274(var4)
         .method_15263(
            class_4897.field_24487,
            new TranslationTextComponent("advancements.nether.obtain_ancient_debris.title"),
            new TranslationTextComponent("advancements.nether.obtain_ancient_debris.description"),
            (Identifier)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("ancient_debris", class_6459.method_29434(class_4897.field_24487))
         .method_15270(var1, "nether/obtain_ancient_debris");
      class_3321.method_15269()
         .method_15274(var13)
         .method_15263(
            class_4897.field_24956,
            new TranslationTextComponent("advancements.nether.netherite_armor.title"),
            new TranslationTextComponent("advancements.nether.netherite_armor.description"),
            (Identifier)null,
            class_3361.field_16559,
            true,
            true,
            false
         )
         .method_15258(class_7365.method_33541(100))
         .method_15272(
            "netherite_armor", class_6459.method_29434(class_4897.field_24564, class_4897.field_24956, class_4897.field_24570, class_4897.field_24860)
         )
         .method_15270(var1, "nether/netherite_armor");
      class_3321.method_15269()
         .method_15274(var13)
         .method_15263(
            class_4897.field_25256,
            new TranslationTextComponent("advancements.nether.use_lodestone.title"),
            new TranslationTextComponent("advancements.nether.use_lodestone.description"),
            (Identifier)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272(
            "use_lodestone",
            class_6398.method_29212(
               class_6352.method_29094().method_29095(class_6051.method_27633().method_27630(class_4783.field_23852).method_27632()),
               class_9518.method_43918().method_43915(class_4897.field_24830)
            )
         )
         .method_15270(var1, "nether/use_lodestone");
      class_3139 var14 = class_3321.method_15269()
         .method_15274(var4)
         .method_15263(
            class_4897.field_25116,
            new TranslationTextComponent("advancements.nether.obtain_crying_obsidian.title"),
            new TranslationTextComponent("advancements.nether.obtain_crying_obsidian.description"),
            (Identifier)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("crying_obsidian", class_6459.method_29434(class_4897.field_25116))
         .method_15270(var1, "nether/obtain_crying_obsidian");
      class_3321.method_15269()
         .method_15274(var14)
         .method_15263(
            class_4897.field_24371,
            new TranslationTextComponent("advancements.nether.charge_respawn_anchor.title"),
            new TranslationTextComponent("advancements.nether.charge_respawn_anchor.description"),
            (Identifier)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272(
            "charge_respawn_anchor",
            class_6398.method_29212(
               class_6352.method_29094()
                  .method_29095(
                     class_6051.method_27633()
                        .method_27630(class_4783.field_23807)
                        .method_27631(class_7344.method_33475().method_33480(class_545.field_3268, 4).method_33476())
                        .method_27632()
                  ),
               class_9518.method_43918().method_43915(class_4783.field_23368)
            )
         )
         .method_15270(var1, "nether/charge_respawn_anchor");
      class_3139 var15 = class_3321.method_15269()
         .method_15274(var4)
         .method_15263(
            class_4897.field_24651,
            new TranslationTextComponent("advancements.nether.ride_strider.title"),
            new TranslationTextComponent("advancements.nether.ride_strider.description"),
            (Identifier)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272(
            "used_warped_fungus_on_a_stick",
            class_9683.method_44772(
               class_8938.method_41064(
                  class_2184.method_10127().method_10131(class_2184.method_10127().method_10134(class_6629.field_34233).method_10139()).method_10139()
               ),
               class_9518.method_43918().method_43915(class_4897.field_24651).method_43921(),
               class_7781.field_39439
            )
         )
         .method_15270(var1, "nether/ride_strider");
      class_2699.method_12161(class_3321.method_15269(), field_26234)
         .method_15274(var15)
         .method_15263(
            class_4897.field_24860,
            new TranslationTextComponent("advancements.nether.explore_nether.title"),
            new TranslationTextComponent("advancements.nether.explore_nether.description"),
            (Identifier)null,
            class_3361.field_16559,
            true,
            true,
            false
         )
         .method_15258(class_7365.method_33541(500))
         .method_15270(var1, "nether/explore_nether");
      class_3139 var16 = class_3321.method_15269()
         .method_15274(var4)
         .method_15263(
            class_4897.field_24646,
            new TranslationTextComponent("advancements.nether.find_bastion.title"),
            new TranslationTextComponent("advancements.nether.find_bastion.description"),
            (Identifier)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("bastion", class_2270.method_10475(class_5093.method_23397(class_5390.field_27514)))
         .method_15270(var1, "nether/find_bastion");
      class_3321.method_15269()
         .method_15274(var16)
         .method_15263(
            class_4783.field_23471,
            new TranslationTextComponent("advancements.nether.loot_bastion.title"),
            new TranslationTextComponent("advancements.nether.loot_bastion.description"),
            (Identifier)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15271(class_6701.field_34598)
         .method_15272("loot_bastion_other", class_1492.method_6886(new Identifier("minecraft:chests/bastion_other")))
         .method_15272("loot_bastion_treasure", class_1492.method_6886(new Identifier("minecraft:chests/bastion_treasure")))
         .method_15272("loot_bastion_hoglin_stable", class_1492.method_6886(new Identifier("minecraft:chests/bastion_hoglin_stable")))
         .method_15272("loot_bastion_bridge", class_1492.method_6886(new Identifier("minecraft:chests/bastion_bridge")))
         .method_15270(var1, "nether/loot_bastion");
      class_3321.method_15269()
         .method_15274(var4)
         .method_15271(class_6701.field_34598)
         .method_15263(
            class_4897.field_25108,
            new TranslationTextComponent("advancements.nether.distract_piglin.title"),
            new TranslationTextComponent("advancements.nether.distract_piglin.description"),
            (Identifier)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272(
            "distract_piglin",
            class_4447.method_20623(
               field_26233,
               class_9518.method_43918().method_43919(class_391.field_1643),
               class_8938.method_41064(
                  class_2184.method_10127()
                     .method_10134(class_6629.field_34240)
                     .method_10126(class_4097.method_18938().method_18937(false).method_18939())
                     .method_10139()
               )
            )
         )
         .method_15272(
            "distract_piglin_directly",
            class_6367.method_29144(
               field_26233,
               class_9518.method_43918().method_43915(class_134.field_388),
               class_8938.method_41064(
                  class_2184.method_10127()
                     .method_10134(class_6629.field_34240)
                     .method_10126(class_4097.method_18938().method_18937(false).method_18939())
                     .method_10139()
               )
            )
         )
         .method_15270(var1, "nether/distract_piglin");
   }
}
