package remapped;

import java.util.function.Consumer;
import net.minecraft.util.text.TranslationTextComponent;

public class class_9516 implements Consumer<Consumer<class_3139>> {
   public void accept(Consumer<class_3139> var1) {
      class_3139 var4 = class_3321.method_15269()
         .method_15263(
            class_4783.field_23259,
            new TranslationTextComponent("advancements.story.root.title"),
            new TranslationTextComponent("advancements.story.root.description"),
            new class_4639("textures/gui/advancements/backgrounds/stone.png"),
            class_3361.field_16556,
            false,
            false,
            false
         )
         .method_15272("crafting_table", class_6459.method_29434(class_4783.field_23794))
         .method_15270(var1, "story/root");
      class_3139 var5 = class_3321.method_15269()
         .method_15274(var4)
         .method_15263(
            class_4897.field_24595,
            new TranslationTextComponent("advancements.story.mine_stone.title"),
            new TranslationTextComponent("advancements.story.mine_stone.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("get_stone", class_6459.method_29433(class_9518.method_43918().method_43919(class_391.field_1623).method_43921()))
         .method_15270(var1, "story/mine_stone");
      class_3139 var6 = class_3321.method_15269()
         .method_15274(var5)
         .method_15263(
            class_4897.field_25119,
            new TranslationTextComponent("advancements.story.upgrade_tools.title"),
            new TranslationTextComponent("advancements.story.upgrade_tools.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("stone_pickaxe", class_6459.method_29434(class_4897.field_25119))
         .method_15270(var1, "story/upgrade_tools");
      class_3139 var7 = class_3321.method_15269()
         .method_15274(var6)
         .method_15263(
            class_4897.field_25021,
            new TranslationTextComponent("advancements.story.smelt_iron.title"),
            new TranslationTextComponent("advancements.story.smelt_iron.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("iron", class_6459.method_29434(class_4897.field_25021))
         .method_15270(var1, "story/smelt_iron");
      class_3139 var8 = class_3321.method_15269()
         .method_15274(var7)
         .method_15263(
            class_4897.field_25011,
            new TranslationTextComponent("advancements.story.iron_tools.title"),
            new TranslationTextComponent("advancements.story.iron_tools.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("iron_pickaxe", class_6459.method_29434(class_4897.field_25011))
         .method_15270(var1, "story/iron_tools");
      class_3139 var9 = class_3321.method_15269()
         .method_15274(var8)
         .method_15263(
            class_4897.field_24481,
            new TranslationTextComponent("advancements.story.mine_diamond.title"),
            new TranslationTextComponent("advancements.story.mine_diamond.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("diamond", class_6459.method_29434(class_4897.field_24481))
         .method_15270(var1, "story/mine_diamond");
      class_3139 var10 = class_3321.method_15269()
         .method_15274(var7)
         .method_15263(
            class_4897.field_24938,
            new TranslationTextComponent("advancements.story.lava_bucket.title"),
            new TranslationTextComponent("advancements.story.lava_bucket.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("lava_bucket", class_6459.method_29434(class_4897.field_24938))
         .method_15270(var1, "story/lava_bucket");
      class_3139 var11 = class_3321.method_15269()
         .method_15274(var7)
         .method_15263(
            class_4897.field_24708,
            new TranslationTextComponent("advancements.story.obtain_armor.title"),
            new TranslationTextComponent("advancements.story.obtain_armor.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15271(class_6701.field_34598)
         .method_15272("iron_helmet", class_6459.method_29434(class_4897.field_24701))
         .method_15272("iron_chestplate", class_6459.method_29434(class_4897.field_24708))
         .method_15272("iron_leggings", class_6459.method_29434(class_4897.field_25042))
         .method_15272("iron_boots", class_6459.method_29434(class_4897.field_24576))
         .method_15270(var1, "story/obtain_armor");
      class_3321.method_15269()
         .method_15274(var9)
         .method_15263(
            class_4897.field_24879,
            new TranslationTextComponent("advancements.story.enchant_item.title"),
            new TranslationTextComponent("advancements.story.enchant_item.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("enchanted_item", class_9853.method_45374())
         .method_15270(var1, "story/enchant_item");
      class_3139 var12 = class_3321.method_15269()
         .method_15274(var10)
         .method_15263(
            class_4783.field_23881,
            new TranslationTextComponent("advancements.story.form_obsidian.title"),
            new TranslationTextComponent("advancements.story.form_obsidian.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("obsidian", class_6459.method_29434(class_4783.field_23881))
         .method_15270(var1, "story/form_obsidian");
      class_3321.method_15269()
         .method_15274(var11)
         .method_15263(
            class_4897.field_24840,
            new TranslationTextComponent("advancements.story.deflect_arrow.title"),
            new TranslationTextComponent("advancements.story.deflect_arrow.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272(
            "deflected_projectile",
            class_7695.method_34864(class_6724.method_30857().method_30855(class_9447.method_43695().method_43694(true)).method_30858(true))
         )
         .method_15270(var1, "story/deflect_arrow");
      class_3321.method_15269()
         .method_15274(var9)
         .method_15263(
            class_4897.field_24806,
            new TranslationTextComponent("advancements.story.shiny_gear.title"),
            new TranslationTextComponent("advancements.story.shiny_gear.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15271(class_6701.field_34598)
         .method_15272("diamond_helmet", class_6459.method_29434(class_4897.field_24912))
         .method_15272("diamond_chestplate", class_6459.method_29434(class_4897.field_24806))
         .method_15272("diamond_leggings", class_6459.method_29434(class_4897.field_25051))
         .method_15272("diamond_boots", class_6459.method_29434(class_4897.field_24588))
         .method_15270(var1, "story/shiny_gear");
      class_3139 var13 = class_3321.method_15269()
         .method_15274(var12)
         .method_15263(
            class_4897.field_25188,
            new TranslationTextComponent("advancements.story.enter_the_nether.title"),
            new TranslationTextComponent("advancements.story.enter_the_nether.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("entered_nether", class_7888.method_35667(class_6486.field_33029))
         .method_15270(var1, "story/enter_the_nether");
      class_3321.method_15269()
         .method_15274(var13)
         .method_15263(
            class_4897.field_25037,
            new TranslationTextComponent("advancements.story.cure_zombie_villager.title"),
            new TranslationTextComponent("advancements.story.cure_zombie_villager.description"),
            (class_4639)null,
            class_3361.field_16561,
            true,
            true,
            false
         )
         .method_15272("cured_zombie", class_4558.method_21126())
         .method_15270(var1, "story/cure_zombie_villager");
      class_3139 var14 = class_3321.method_15269()
         .method_15274(var13)
         .method_15263(
            class_4897.field_24519,
            new TranslationTextComponent("advancements.story.follow_ender_eye.title"),
            new TranslationTextComponent("advancements.story.follow_ender_eye.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("in_stronghold", class_2270.method_10475(class_5093.method_23397(class_5390.field_27511)))
         .method_15270(var1, "story/follow_ender_eye");
      class_3321.method_15269()
         .method_15274(var14)
         .method_15263(
            class_4783.field_23894,
            new TranslationTextComponent("advancements.story.enter_the_end.title"),
            new TranslationTextComponent("advancements.story.enter_the_end.description"),
            (class_4639)null,
            class_3361.field_16556,
            true,
            true,
            false
         )
         .method_15272("entered_end", class_7888.method_35667(class_6486.field_33038))
         .method_15270(var1, "story/enter_the_end");
   }
}
