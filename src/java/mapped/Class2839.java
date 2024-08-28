package mapped;

import java.util.function.Consumer;
import net.minecraft.util.text.TranslationTextComponent;

public class Class2839 implements Consumer<Consumer<Class7952>> {
   public void accept(Consumer<Class7952> var1) {
      Class7952 var4 = Class7999.method27304()
         .method27308(
            Class8487.field36395,
            new TranslationTextComponent("advancements.story.root.title"),
            new TranslationTextComponent("advancements.story.root.description"),
            new ResourceLocation("textures/gui/advancements/backgrounds/stone.png"),
            Class1965.field12814,
            false,
            false,
            false
         )
         .method27312("crafting_table", Class4491.method14164(Class8487.field36538))
         .method27317(var1, "story/root");
      Class7952 var5 = Class7999.method27304()
         .method27305(var4)
         .method27308(
            Class8514.field37807,
            new TranslationTextComponent("advancements.story.mine_stone.title"),
            new TranslationTextComponent("advancements.story.mine_stone.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("get_stone", Class4491.method14163(Class9735.method38146().method38148(Class5985.field26122).method38151()))
         .method27317(var1, "story/mine_stone");
      Class7952 var6 = Class7999.method27304()
         .method27305(var5)
         .method27308(
            Class8514.field37812,
            new TranslationTextComponent("advancements.story.upgrade_tools.title"),
            new TranslationTextComponent("advancements.story.upgrade_tools.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("stone_pickaxe", Class4491.method14164(Class8514.field37812))
         .method27317(var1, "story/upgrade_tools");
      Class7952 var7 = Class7999.method27304()
         .method27305(var6)
         .method27308(
            Class8514.field37801,
            new TranslationTextComponent("advancements.story.smelt_iron.title"),
            new TranslationTextComponent("advancements.story.smelt_iron.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("iron", Class4491.method14164(Class8514.field37801))
         .method27317(var1, "story/smelt_iron");
      Class7952 var8 = Class7999.method27304()
         .method27305(var7)
         .method27308(
            Class8514.field37822,
            new TranslationTextComponent("advancements.story.iron_tools.title"),
            new TranslationTextComponent("advancements.story.iron_tools.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("iron_pickaxe", Class4491.method14164(Class8514.field37822))
         .method27317(var1, "story/iron_tools");
      Class7952 var9 = Class7999.method27304()
         .method27305(var8)
         .method27308(
            Class8514.field37800,
            new TranslationTextComponent("advancements.story.mine_diamond.title"),
            new TranslationTextComponent("advancements.story.mine_diamond.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("diamond", Class4491.method14164(Class8514.field37800))
         .method27317(var1, "story/mine_diamond");
      Class7952 var10 = Class7999.method27304()
         .method27305(var7)
         .method27308(
            Class8514.field37884,
            new TranslationTextComponent("advancements.story.lava_bucket.title"),
            new TranslationTextComponent("advancements.story.lava_bucket.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("lava_bucket", Class4491.method14164(Class8514.field37884))
         .method27317(var1, "story/lava_bucket");
      Class7952 var11 = Class7999.method27304()
         .method27305(var7)
         .method27308(
            Class8514.field37853,
            new TranslationTextComponent("advancements.story.obtain_armor.title"),
            new TranslationTextComponent("advancements.story.obtain_armor.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27314(Class9014.field41221)
         .method27312("iron_helmet", Class4491.method14164(Class8514.field37852))
         .method27312("iron_chestplate", Class4491.method14164(Class8514.field37853))
         .method27312("iron_leggings", Class4491.method14164(Class8514.field37854))
         .method27312("iron_boots", Class4491.method14164(Class8514.field37855))
         .method27317(var1, "story/obtain_armor");
      Class7999.method27304()
         .method27305(var9)
         .method27308(
            Class8514.field38070,
            new TranslationTextComponent("advancements.story.enchant_item.title"),
            new TranslationTextComponent("advancements.story.enchant_item.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("enchanted_item", Class4465.method14111())
         .method27317(var1, "story/enchant_item");
      Class7952 var12 = Class7999.method27304()
         .method27305(var10)
         .method27308(
            Class8487.field36527,
            new TranslationTextComponent("advancements.story.form_obsidian.title"),
            new TranslationTextComponent("advancements.story.form_obsidian.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("obsidian", Class4491.method14164(Class8487.field36527))
         .method27317(var1, "story/form_obsidian");
      Class7999.method27304()
         .method27305(var11)
         .method27308(
            Class8514.field38119,
            new TranslationTextComponent("advancements.story.deflect_arrow.title"),
            new TranslationTextComponent("advancements.story.deflect_arrow.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312(
            "deflected_projectile", Class4480.method14141(Class9024.method33410().method33412(Class9714.method38056().method38057(true)).method33411(true))
         )
         .method27317(var1, "story/deflect_arrow");
      Class7999.method27304()
         .method27305(var9)
         .method27308(
            Class8514.field37857,
            new TranslationTextComponent("advancements.story.shiny_gear.title"),
            new TranslationTextComponent("advancements.story.shiny_gear.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27314(Class9014.field41221)
         .method27312("diamond_helmet", Class4491.method14164(Class8514.field37856))
         .method27312("diamond_chestplate", Class4491.method14164(Class8514.field37857))
         .method27312("diamond_leggings", Class4491.method14164(Class8514.field37858))
         .method27312("diamond_boots", Class4491.method14164(Class8514.field37859))
         .method27317(var1, "story/shiny_gear");
      Class7952 var13 = Class7999.method27304()
         .method27305(var12)
         .method27308(
            Class8514.field37794,
            new TranslationTextComponent("advancements.story.enter_the_nether.title"),
            new TranslationTextComponent("advancements.story.enter_the_nether.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("entered_nether", Class4488.method14156(Class1655.field9000))
         .method27317(var1, "story/enter_the_nether");
      Class7999.method27304()
         .method27305(var13)
         .method27308(
            Class8514.field37872,
            new TranslationTextComponent("advancements.story.cure_zombie_villager.title"),
            new TranslationTextComponent("advancements.story.cure_zombie_villager.description"),
            (ResourceLocation)null,
            Class1965.field12816,
            true,
            true,
            false
         )
         .method27312("cured_zombie", Class4495.method14174())
         .method27317(var1, "story/cure_zombie_villager");
      Class7952 var14 = Class7999.method27304()
         .method27305(var13)
         .method27308(
            Class8514.field37979,
            new TranslationTextComponent("advancements.story.follow_ender_eye.title"),
            new TranslationTextComponent("advancements.story.follow_ender_eye.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("in_stronghold", Class4474.method14130(Class8576.method30649(Class2961.field18067)))
         .method27317(var1, "story/follow_ender_eye");
      Class7999.method27304()
         .method27305(var14)
         .method27308(
            Class8487.field36651,
            new TranslationTextComponent("advancements.story.enter_the_end.title"),
            new TranslationTextComponent("advancements.story.enter_the_end.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("entered_end", Class4488.method14156(Class1655.field9001))
         .method27317(var1, "story/enter_the_end");
   }
}
