package net.minecraft.tags;

import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;

import java.util.List;

public final class BlockTags {
   public static final TagRegistry<Block> collection = TagRegistryManager.<Block>create(new ResourceLocation("block"), ITagCollectionSupplier::method32657);
   public static final ITag.INamedTag<Block> field32734 = method25114("wool");
   public static final ITag.INamedTag<Block> field32735 = method25114("planks");
   public static final ITag.INamedTag<Block> field32736 = method25114("stone_bricks");
   public static final ITag.INamedTag<Block> field32737 = method25114("wooden_buttons");
   public static final ITag.INamedTag<Block> field32738 = method25114("buttons");
   public static final ITag.INamedTag<Block> field32739 = method25114("carpets");
   public static final ITag.INamedTag<Block> field32740 = method25114("wooden_doors");
   public static final ITag.INamedTag<Block> field32741 = method25114("wooden_stairs");
   public static final ITag.INamedTag<Block> field32742 = method25114("wooden_slabs");
   public static final ITag.INamedTag<Block> field32743 = method25114("wooden_fences");
   public static final ITag.INamedTag<Block> field32744 = method25114("pressure_plates");
   public static final ITag.INamedTag<Block> field32745 = method25114("wooden_pressure_plates");
   public static final ITag.INamedTag<Block> field32746 = method25114("stone_pressure_plates");
   public static final ITag.INamedTag<Block> field32747 = method25114("wooden_trapdoors");
   public static final ITag.INamedTag<Block> field32748 = method25114("doors");
   public static final ITag.INamedTag<Block> field32749 = method25114("saplings");
   public static final ITag.INamedTag<Block> field32750 = method25114("logs_that_burn");
   public static final ITag.INamedTag<Block> field32751 = method25114("logs");
   public static final ITag.INamedTag<Block> field32752 = method25114("dark_oak_logs");
   public static final ITag.INamedTag<Block> field32753 = method25114("oak_logs");
   public static final ITag.INamedTag<Block> field32754 = method25114("birch_logs");
   public static final ITag.INamedTag<Block> field32755 = method25114("acacia_logs");
   public static final ITag.INamedTag<Block> field32756 = method25114("jungle_logs");
   public static final ITag.INamedTag<Block> field32757 = method25114("spruce_logs");
   public static final ITag.INamedTag<Block> field32758 = method25114("crimson_stems");
   public static final ITag.INamedTag<Block> field32759 = method25114("warped_stems");
   public static final ITag.INamedTag<Block> field32760 = method25114("banners");
   public static final ITag.INamedTag<Block> field32761 = method25114("sand");
   public static final ITag.INamedTag<Block> field32762 = method25114("stairs");
   public static final ITag.INamedTag<Block> field32763 = method25114("slabs");
   public static final ITag.INamedTag<Block> field32764 = method25114("walls");
   public static final ITag.INamedTag<Block> field32765 = method25114("anvil");
   public static final ITag.INamedTag<Block> field32766 = method25114("rails");
   public static final ITag.INamedTag<Block> LEAVES = method25114("leaves");
   public static final ITag.INamedTag<Block> field32768 = method25114("trapdoors");
   public static final ITag.INamedTag<Block> field32769 = method25114("small_flowers");
   public static final ITag.INamedTag<Block> field32770 = method25114("beds");
   public static final ITag.INamedTag<Block> field32771 = method25114("fences");
   public static final ITag.INamedTag<Block> field32772 = method25114("tall_flowers");
   public static final ITag.INamedTag<Block> field32773 = method25114("flowers");
   public static final ITag.INamedTag<Block> field32774 = method25114("piglin_repellents");
   public static final ITag.INamedTag<Block> field32775 = method25114("gold_ores");
   public static final ITag.INamedTag<Block> field32776 = method25114("non_flammable_wood");
   public static final ITag.INamedTag<Block> field32777 = method25114("flower_pots");
   public static final ITag.INamedTag<Block> field32778 = method25114("enderman_holdable");
   public static final ITag.INamedTag<Block> field32779 = method25114("ice");
   public static final ITag.INamedTag<Block> VALID_SPAWN = method25114("valid_spawn");
   public static final ITag.INamedTag<Block> field32781 = method25114("impermeable");
   public static final ITag.INamedTag<Block> field32782 = method25114("underwater_bonemeals");
   public static final ITag.INamedTag<Block> field32783 = method25114("coral_blocks");
   public static final ITag.INamedTag<Block> field32784 = method25114("wall_corals");
   public static final ITag.INamedTag<Block> field32785 = method25114("coral_plants");
   public static final ITag.INamedTag<Block> field32786 = method25114("corals");
   public static final ITag.INamedTag<Block> field32787 = method25114("bamboo_plantable_on");
   public static final ITag.INamedTag<Block> field32788 = method25114("standing_signs");
   public static final ITag.INamedTag<Block> field32789 = method25114("wall_signs");
   public static final ITag.INamedTag<Block> field32790 = method25114("signs");
   public static final ITag.INamedTag<Block> field32791 = method25114("dragon_immune");
   public static final ITag.INamedTag<Block> field32792 = method25114("wither_immune");
   public static final ITag.INamedTag<Block> field32793 = method25114("wither_summon_base_blocks");
   public static final ITag.INamedTag<Block> field32794 = method25114("beehives");
   public static final ITag.INamedTag<Block> field32795 = method25114("crops");
   public static final ITag.INamedTag<Block> field32796 = method25114("bee_growables");
   public static final ITag.INamedTag<Block> field32797 = method25114("portals");
   public static final ITag.INamedTag<Block> field32798 = method25114("fire");
   public static final ITag.INamedTag<Block> field32799 = method25114("nylium");
   public static final ITag.INamedTag<Block> field32800 = method25114("wart_blocks");
   public static final ITag.INamedTag<Block> field32801 = method25114("beacon_base_blocks");
   public static final ITag.INamedTag<Block> field32802 = method25114("soul_speed_blocks");
   public static final ITag.INamedTag<Block> field32803 = method25114("wall_post_override");
   public static final ITag.INamedTag<Block> field32804 = method25114("climbable");
   public static final ITag.INamedTag<Block> field32805 = method25114("shulker_boxes");
   public static final ITag.INamedTag<Block> field32806 = method25114("hoglin_repellents");
   public static final ITag.INamedTag<Block> field32807 = method25114("soul_fire_base_blocks");
   public static final ITag.INamedTag<Block> field32808 = method25114("strider_warm_blocks");
   public static final ITag.INamedTag<Block> field32809 = method25114("campfires");
   public static final ITag.INamedTag<Block> field32810 = method25114("guarded_by_piglins");
   public static final ITag.INamedTag<Block> field32811 = method25114("prevent_mob_spawning_inside");
   public static final ITag.INamedTag<Block> field32812 = method25114("fence_gates");
   public static final ITag.INamedTag<Block> field32813 = method25114("unstable_bottom_center");
   public static final ITag.INamedTag<Block> field32814 = method25114("mushroom_grow_block");
   public static final ITag.INamedTag<Block> INFINIBURN_OVERWORLD = method25114("infiniburn_overworld");
   public static final ITag.INamedTag<Block> INFINIBURN_NETHER = method25114("infiniburn_nether");
   public static final ITag.INamedTag<Block> INFINIBURN_END = method25114("infiniburn_end");
   public static final ITag.INamedTag<Block> field32818 = method25114("base_stone_overworld");
   public static final ITag.INamedTag<Block> field32819 = method25114("base_stone_nether");

   private static ITag.INamedTag<Block> method25114(String var0) {
      return collection.createTag(var0);
   }

   public static ITagCollection<Block> getCollection() {
      return collection.getCollection();
   }

   public static List<? extends ITag.INamedTag<Block>> method25116() {
      return collection.getTags();
   }
}
