package mapped;

import java.util.function.Consumer;

import net.minecraft.advancements.Advancement;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class Class2839 implements Consumer<Consumer<Advancement>> {
   public void accept(Consumer<Advancement> var1) {
      Advancement var4 = Class7999.method27304()
         .method27308(
            Blocks.GRASS_BLOCK,
            new TranslationTextComponent("advancements.story.root.title"),
            new TranslationTextComponent("advancements.story.root.description"),
            new ResourceLocation("textures/gui/advancements/backgrounds/stone.png"),
            Class1965.field12814,
            false,
            false,
            false
         )
         .method27312("crafting_table", Class4491.method14164(Blocks.CRAFTING_TABLE))
         .method27317(var1, "story/root");
      Advancement var5 = Class7999.method27304()
         .method27305(var4)
         .method27308(
            Items.WOODEN_PICKAXE,
            new TranslationTextComponent("advancements.story.mine_stone.title"),
            new TranslationTextComponent("advancements.story.mine_stone.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("get_stone", Class4491.method14163(Class9735.method38146().method38148(ItemTags.STONE_TOOL_MATERIALS).method38151()))
         .method27317(var1, "story/mine_stone");
      Advancement var6 = Class7999.method27304()
         .method27305(var5)
         .method27308(
            Items.STONE_PICKAXE,
            new TranslationTextComponent("advancements.story.upgrade_tools.title"),
            new TranslationTextComponent("advancements.story.upgrade_tools.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("stone_pickaxe", Class4491.method14164(Items.STONE_PICKAXE))
         .method27317(var1, "story/upgrade_tools");
      Advancement var7 = Class7999.method27304()
         .method27305(var6)
         .method27308(
            Items.IRON_INGOT,
            new TranslationTextComponent("advancements.story.smelt_iron.title"),
            new TranslationTextComponent("advancements.story.smelt_iron.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("iron", Class4491.method14164(Items.IRON_INGOT))
         .method27317(var1, "story/smelt_iron");
      Advancement var8 = Class7999.method27304()
         .method27305(var7)
         .method27308(
            Items.field37822,
            new TranslationTextComponent("advancements.story.iron_tools.title"),
            new TranslationTextComponent("advancements.story.iron_tools.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("iron_pickaxe", Class4491.method14164(Items.field37822))
         .method27317(var1, "story/iron_tools");
      Advancement var9 = Class7999.method27304()
         .method27305(var8)
         .method27308(
            Items.DIAMOND,
            new TranslationTextComponent("advancements.story.mine_diamond.title"),
            new TranslationTextComponent("advancements.story.mine_diamond.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("diamond", Class4491.method14164(Items.DIAMOND))
         .method27317(var1, "story/mine_diamond");
      Advancement var10 = Class7999.method27304()
         .method27305(var7)
         .method27308(
            Items.LAVA_BUCKET,
            new TranslationTextComponent("advancements.story.lava_bucket.title"),
            new TranslationTextComponent("advancements.story.lava_bucket.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("lava_bucket", Class4491.method14164(Items.LAVA_BUCKET))
         .method27317(var1, "story/lava_bucket");
      Advancement var11 = Class7999.method27304()
         .method27305(var7)
         .method27308(
            Items.field37853,
            new TranslationTextComponent("advancements.story.obtain_armor.title"),
            new TranslationTextComponent("advancements.story.obtain_armor.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27314(Class9014.field41221)
         .method27312("iron_helmet", Class4491.method14164(Items.field37852))
         .method27312("iron_chestplate", Class4491.method14164(Items.field37853))
         .method27312("iron_leggings", Class4491.method14164(Items.field37854))
         .method27312("iron_boots", Class4491.method14164(Items.field37855))
         .method27317(var1, "story/obtain_armor");
      Class7999.method27304()
         .method27305(var9)
         .method27308(
            Items.field38070,
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
      Advancement var12 = Class7999.method27304()
         .method27305(var10)
         .method27308(
            Blocks.OBSIDIAN,
            new TranslationTextComponent("advancements.story.form_obsidian.title"),
            new TranslationTextComponent("advancements.story.form_obsidian.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("obsidian", Class4491.method14164(Blocks.OBSIDIAN))
         .method27317(var1, "story/form_obsidian");
      Class7999.method27304()
         .method27305(var11)
         .method27308(
            Items.field38119,
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
            Items.field37857,
            new TranslationTextComponent("advancements.story.shiny_gear.title"),
            new TranslationTextComponent("advancements.story.shiny_gear.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27314(Class9014.field41221)
         .method27312("diamond_helmet", Class4491.method14164(Items.field37856))
         .method27312("diamond_chestplate", Class4491.method14164(Items.field37857))
         .method27312("diamond_leggings", Class4491.method14164(Items.field37858))
         .method27312("diamond_boots", Class4491.method14164(Items.field37859))
         .method27317(var1, "story/shiny_gear");
      Advancement var13 = Class7999.method27304()
         .method27305(var12)
         .method27308(
            Items.FLINT_AND_STEEL,
            new TranslationTextComponent("advancements.story.enter_the_nether.title"),
            new TranslationTextComponent("advancements.story.enter_the_nether.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("entered_nether", Class4488.method14156(World.THE_NETHER))
         .method27317(var1, "story/enter_the_nether");
      Class7999.method27304()
         .method27305(var13)
         .method27308(
            Items.GOLDEN_APPLE,
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
      Advancement var14 = Class7999.method27304()
         .method27305(var13)
         .method27308(
            Items.field37979,
            new TranslationTextComponent("advancements.story.follow_ender_eye.title"),
            new TranslationTextComponent("advancements.story.follow_ender_eye.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("in_stronghold", Class4474.method14130(Class8576.method30649(Structure.STRONGHOLD)))
         .method27317(var1, "story/follow_ender_eye");
      Class7999.method27304()
         .method27305(var14)
         .method27308(
            Blocks.END_STONE,
            new TranslationTextComponent("advancements.story.enter_the_end.title"),
            new TranslationTextComponent("advancements.story.enter_the_end.description"),
            (ResourceLocation)null,
            Class1965.field12814,
            true,
            true,
            false
         )
         .method27312("entered_end", Class4488.method14156(World.THE_END))
         .method27317(var1, "story/enter_the_end");
   }
}
