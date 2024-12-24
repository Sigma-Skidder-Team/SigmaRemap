package net.minecraft.tags;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import java.util.List;

public final class ItemTags {
   public static final TagRegistry<Item> collections = TagRegistryManager.<Item>create(new ResourceLocation("item"), ITagCollectionSupplier::method32658);
   public static final ITag.INamedTag<Item> field26070 = method18560("wool");
   public static final ITag.INamedTag<Item> field26071 = method18560("planks");
   public static final ITag.INamedTag<Item> field26072 = method18560("stone_bricks");
   public static final ITag.INamedTag<Item> field26073 = method18560("wooden_buttons");
   public static final ITag.INamedTag<Item> field26074 = method18560("buttons");
   public static final ITag.INamedTag<Item> field26075 = method18560("carpets");
   public static final ITag.INamedTag<Item> field26076 = method18560("wooden_doors");
   public static final ITag.INamedTag<Item> field26077 = method18560("wooden_stairs");
   public static final ITag.INamedTag<Item> field26078 = method18560("wooden_slabs");
   public static final ITag.INamedTag<Item> field26079 = method18560("wooden_fences");
   public static final ITag.INamedTag<Item> field26080 = method18560("wooden_pressure_plates");
   public static final ITag.INamedTag<Item> field26081 = method18560("wooden_trapdoors");
   public static final ITag.INamedTag<Item> field26082 = method18560("doors");
   public static final ITag.INamedTag<Item> field26083 = method18560("saplings");
   public static final ITag.INamedTag<Item> field26084 = method18560("logs_that_burn");
   public static final ITag.INamedTag<Item> field26085 = method18560("logs");
   public static final ITag.INamedTag<Item> field26086 = method18560("dark_oak_logs");
   public static final ITag.INamedTag<Item> field26087 = method18560("oak_logs");
   public static final ITag.INamedTag<Item> field26088 = method18560("birch_logs");
   public static final ITag.INamedTag<Item> field26089 = method18560("acacia_logs");
   public static final ITag.INamedTag<Item> field26090 = method18560("jungle_logs");
   public static final ITag.INamedTag<Item> field26091 = method18560("spruce_logs");
   public static final ITag.INamedTag<Item> field26092 = method18560("crimson_stems");
   public static final ITag.INamedTag<Item> field26093 = method18560("warped_stems");
   public static final ITag.INamedTag<Item> field26094 = method18560("banners");
   public static final ITag.INamedTag<Item> field26095 = method18560("sand");
   public static final ITag.INamedTag<Item> field26096 = method18560("stairs");
   public static final ITag.INamedTag<Item> field26097 = method18560("slabs");
   public static final ITag.INamedTag<Item> field26098 = method18560("walls");
   public static final ITag.INamedTag<Item> field26099 = method18560("anvil");
   public static final ITag.INamedTag<Item> field26100 = method18560("rails");
   public static final ITag.INamedTag<Item> field26101 = method18560("leaves");
   public static final ITag.INamedTag<Item> field26102 = method18560("trapdoors");
   public static final ITag.INamedTag<Item> field26103 = method18560("small_flowers");
   public static final ITag.INamedTag<Item> field26104 = method18560("beds");
   public static final ITag.INamedTag<Item> field26105 = method18560("fences");
   public static final ITag.INamedTag<Item> field26106 = method18560("tall_flowers");
   public static final ITag.INamedTag<Item> field26107 = method18560("flowers");
   public static final ITag.INamedTag<Item> field26108 = method18560("piglin_repellents");
   public static final ITag.INamedTag<Item> field26109 = method18560("piglin_loved");
   public static final ITag.INamedTag<Item> field26110 = method18560("gold_ores");
   public static final ITag.INamedTag<Item> field26111 = method18560("non_flammable_wood");
   public static final ITag.INamedTag<Item> field26112 = method18560("soul_fire_base_blocks");
   public static final ITag.INamedTag<Item> field26113 = method18560("boats");
   public static final ITag.INamedTag<Item> field26114 = method18560("fishes");
   public static final ITag.INamedTag<Item> field26115 = method18560("signs");
   public static final ITag.INamedTag<Item> field26116 = method18560("music_discs");
   public static final ITag.INamedTag<Item> field26117 = method18560("creeper_drop_music_discs");
   public static final ITag.INamedTag<Item> field26118 = method18560("coals");
   public static final ITag.INamedTag<Item> field26119 = method18560("arrows");
   public static final ITag.INamedTag<Item> field26120 = method18560("lectern_books");
   public static final ITag.INamedTag<Item> field26121 = method18560("beacon_payment_items");
   public static final ITag.INamedTag<Item> field26122 = method18560("stone_tool_materials");
   public static final ITag.INamedTag<Item> field26123 = method18560("stone_crafting_materials");

   private static ITag.INamedTag<Item> method18560(String var0) {
      return collections.createTag(var0);
   }

   public static ITagCollection<Item> method18561() {
      return collections.getCollection();
   }

   public static List<? extends ITag.INamedTag<Item>> method18562() {
      return collections.getTags();
   }
}
