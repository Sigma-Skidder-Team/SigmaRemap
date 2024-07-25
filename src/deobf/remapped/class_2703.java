package remapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class class_2703 extends DataFix {
   private static final Map<String, String> field_13240 = (Map<String, String>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      var0.put("minecraft:stone.0", "minecraft:stone");
      var0.put("minecraft:stone.1", "minecraft:granite");
      var0.put("minecraft:stone.2", "minecraft:polished_granite");
      var0.put("minecraft:stone.3", "minecraft:diorite");
      var0.put("minecraft:stone.4", "minecraft:polished_diorite");
      var0.put("minecraft:stone.5", "minecraft:andesite");
      var0.put("minecraft:stone.6", "minecraft:polished_andesite");
      var0.put("minecraft:dirt.0", "minecraft:dirt");
      var0.put("minecraft:dirt.1", "minecraft:coarse_dirt");
      var0.put("minecraft:dirt.2", "minecraft:podzol");
      var0.put("minecraft:leaves.0", "minecraft:oak_leaves");
      var0.put("minecraft:leaves.1", "minecraft:spruce_leaves");
      var0.put("minecraft:leaves.2", "minecraft:birch_leaves");
      var0.put("minecraft:leaves.3", "minecraft:jungle_leaves");
      var0.put("minecraft:leaves2.0", "minecraft:acacia_leaves");
      var0.put("minecraft:leaves2.1", "minecraft:dark_oak_leaves");
      var0.put("minecraft:log.0", "minecraft:oak_log");
      var0.put("minecraft:log.1", "minecraft:spruce_log");
      var0.put("minecraft:log.2", "minecraft:birch_log");
      var0.put("minecraft:log.3", "minecraft:jungle_log");
      var0.put("minecraft:log2.0", "minecraft:acacia_log");
      var0.put("minecraft:log2.1", "minecraft:dark_oak_log");
      var0.put("minecraft:sapling.0", "minecraft:oak_sapling");
      var0.put("minecraft:sapling.1", "minecraft:spruce_sapling");
      var0.put("minecraft:sapling.2", "minecraft:birch_sapling");
      var0.put("minecraft:sapling.3", "minecraft:jungle_sapling");
      var0.put("minecraft:sapling.4", "minecraft:acacia_sapling");
      var0.put("minecraft:sapling.5", "minecraft:dark_oak_sapling");
      var0.put("minecraft:planks.0", "minecraft:oak_planks");
      var0.put("minecraft:planks.1", "minecraft:spruce_planks");
      var0.put("minecraft:planks.2", "minecraft:birch_planks");
      var0.put("minecraft:planks.3", "minecraft:jungle_planks");
      var0.put("minecraft:planks.4", "minecraft:acacia_planks");
      var0.put("minecraft:planks.5", "minecraft:dark_oak_planks");
      var0.put("minecraft:sand.0", "minecraft:sand");
      var0.put("minecraft:sand.1", "minecraft:red_sand");
      var0.put("minecraft:quartz_block.0", "minecraft:quartz_block");
      var0.put("minecraft:quartz_block.1", "minecraft:chiseled_quartz_block");
      var0.put("minecraft:quartz_block.2", "minecraft:quartz_pillar");
      var0.put("minecraft:anvil.0", "minecraft:anvil");
      var0.put("minecraft:anvil.1", "minecraft:chipped_anvil");
      var0.put("minecraft:anvil.2", "minecraft:damaged_anvil");
      var0.put("minecraft:wool.0", "minecraft:white_wool");
      var0.put("minecraft:wool.1", "minecraft:orange_wool");
      var0.put("minecraft:wool.2", "minecraft:magenta_wool");
      var0.put("minecraft:wool.3", "minecraft:light_blue_wool");
      var0.put("minecraft:wool.4", "minecraft:yellow_wool");
      var0.put("minecraft:wool.5", "minecraft:lime_wool");
      var0.put("minecraft:wool.6", "minecraft:pink_wool");
      var0.put("minecraft:wool.7", "minecraft:gray_wool");
      var0.put("minecraft:wool.8", "minecraft:light_gray_wool");
      var0.put("minecraft:wool.9", "minecraft:cyan_wool");
      var0.put("minecraft:wool.10", "minecraft:purple_wool");
      var0.put("minecraft:wool.11", "minecraft:blue_wool");
      var0.put("minecraft:wool.12", "minecraft:brown_wool");
      var0.put("minecraft:wool.13", "minecraft:green_wool");
      var0.put("minecraft:wool.14", "minecraft:red_wool");
      var0.put("minecraft:wool.15", "minecraft:black_wool");
      var0.put("minecraft:carpet.0", "minecraft:white_carpet");
      var0.put("minecraft:carpet.1", "minecraft:orange_carpet");
      var0.put("minecraft:carpet.2", "minecraft:magenta_carpet");
      var0.put("minecraft:carpet.3", "minecraft:light_blue_carpet");
      var0.put("minecraft:carpet.4", "minecraft:yellow_carpet");
      var0.put("minecraft:carpet.5", "minecraft:lime_carpet");
      var0.put("minecraft:carpet.6", "minecraft:pink_carpet");
      var0.put("minecraft:carpet.7", "minecraft:gray_carpet");
      var0.put("minecraft:carpet.8", "minecraft:light_gray_carpet");
      var0.put("minecraft:carpet.9", "minecraft:cyan_carpet");
      var0.put("minecraft:carpet.10", "minecraft:purple_carpet");
      var0.put("minecraft:carpet.11", "minecraft:blue_carpet");
      var0.put("minecraft:carpet.12", "minecraft:brown_carpet");
      var0.put("minecraft:carpet.13", "minecraft:green_carpet");
      var0.put("minecraft:carpet.14", "minecraft:red_carpet");
      var0.put("minecraft:carpet.15", "minecraft:black_carpet");
      var0.put("minecraft:hardened_clay.0", "minecraft:terracotta");
      var0.put("minecraft:stained_hardened_clay.0", "minecraft:white_terracotta");
      var0.put("minecraft:stained_hardened_clay.1", "minecraft:orange_terracotta");
      var0.put("minecraft:stained_hardened_clay.2", "minecraft:magenta_terracotta");
      var0.put("minecraft:stained_hardened_clay.3", "minecraft:light_blue_terracotta");
      var0.put("minecraft:stained_hardened_clay.4", "minecraft:yellow_terracotta");
      var0.put("minecraft:stained_hardened_clay.5", "minecraft:lime_terracotta");
      var0.put("minecraft:stained_hardened_clay.6", "minecraft:pink_terracotta");
      var0.put("minecraft:stained_hardened_clay.7", "minecraft:gray_terracotta");
      var0.put("minecraft:stained_hardened_clay.8", "minecraft:light_gray_terracotta");
      var0.put("minecraft:stained_hardened_clay.9", "minecraft:cyan_terracotta");
      var0.put("minecraft:stained_hardened_clay.10", "minecraft:purple_terracotta");
      var0.put("minecraft:stained_hardened_clay.11", "minecraft:blue_terracotta");
      var0.put("minecraft:stained_hardened_clay.12", "minecraft:brown_terracotta");
      var0.put("minecraft:stained_hardened_clay.13", "minecraft:green_terracotta");
      var0.put("minecraft:stained_hardened_clay.14", "minecraft:red_terracotta");
      var0.put("minecraft:stained_hardened_clay.15", "minecraft:black_terracotta");
      var0.put("minecraft:silver_glazed_terracotta.0", "minecraft:light_gray_glazed_terracotta");
      var0.put("minecraft:stained_glass.0", "minecraft:white_stained_glass");
      var0.put("minecraft:stained_glass.1", "minecraft:orange_stained_glass");
      var0.put("minecraft:stained_glass.2", "minecraft:magenta_stained_glass");
      var0.put("minecraft:stained_glass.3", "minecraft:light_blue_stained_glass");
      var0.put("minecraft:stained_glass.4", "minecraft:yellow_stained_glass");
      var0.put("minecraft:stained_glass.5", "minecraft:lime_stained_glass");
      var0.put("minecraft:stained_glass.6", "minecraft:pink_stained_glass");
      var0.put("minecraft:stained_glass.7", "minecraft:gray_stained_glass");
      var0.put("minecraft:stained_glass.8", "minecraft:light_gray_stained_glass");
      var0.put("minecraft:stained_glass.9", "minecraft:cyan_stained_glass");
      var0.put("minecraft:stained_glass.10", "minecraft:purple_stained_glass");
      var0.put("minecraft:stained_glass.11", "minecraft:blue_stained_glass");
      var0.put("minecraft:stained_glass.12", "minecraft:brown_stained_glass");
      var0.put("minecraft:stained_glass.13", "minecraft:green_stained_glass");
      var0.put("minecraft:stained_glass.14", "minecraft:red_stained_glass");
      var0.put("minecraft:stained_glass.15", "minecraft:black_stained_glass");
      var0.put("minecraft:stained_glass_pane.0", "minecraft:white_stained_glass_pane");
      var0.put("minecraft:stained_glass_pane.1", "minecraft:orange_stained_glass_pane");
      var0.put("minecraft:stained_glass_pane.2", "minecraft:magenta_stained_glass_pane");
      var0.put("minecraft:stained_glass_pane.3", "minecraft:light_blue_stained_glass_pane");
      var0.put("minecraft:stained_glass_pane.4", "minecraft:yellow_stained_glass_pane");
      var0.put("minecraft:stained_glass_pane.5", "minecraft:lime_stained_glass_pane");
      var0.put("minecraft:stained_glass_pane.6", "minecraft:pink_stained_glass_pane");
      var0.put("minecraft:stained_glass_pane.7", "minecraft:gray_stained_glass_pane");
      var0.put("minecraft:stained_glass_pane.8", "minecraft:light_gray_stained_glass_pane");
      var0.put("minecraft:stained_glass_pane.9", "minecraft:cyan_stained_glass_pane");
      var0.put("minecraft:stained_glass_pane.10", "minecraft:purple_stained_glass_pane");
      var0.put("minecraft:stained_glass_pane.11", "minecraft:blue_stained_glass_pane");
      var0.put("minecraft:stained_glass_pane.12", "minecraft:brown_stained_glass_pane");
      var0.put("minecraft:stained_glass_pane.13", "minecraft:green_stained_glass_pane");
      var0.put("minecraft:stained_glass_pane.14", "minecraft:red_stained_glass_pane");
      var0.put("minecraft:stained_glass_pane.15", "minecraft:black_stained_glass_pane");
      var0.put("minecraft:prismarine.0", "minecraft:prismarine");
      var0.put("minecraft:prismarine.1", "minecraft:prismarine_bricks");
      var0.put("minecraft:prismarine.2", "minecraft:dark_prismarine");
      var0.put("minecraft:concrete.0", "minecraft:white_concrete");
      var0.put("minecraft:concrete.1", "minecraft:orange_concrete");
      var0.put("minecraft:concrete.2", "minecraft:magenta_concrete");
      var0.put("minecraft:concrete.3", "minecraft:light_blue_concrete");
      var0.put("minecraft:concrete.4", "minecraft:yellow_concrete");
      var0.put("minecraft:concrete.5", "minecraft:lime_concrete");
      var0.put("minecraft:concrete.6", "minecraft:pink_concrete");
      var0.put("minecraft:concrete.7", "minecraft:gray_concrete");
      var0.put("minecraft:concrete.8", "minecraft:light_gray_concrete");
      var0.put("minecraft:concrete.9", "minecraft:cyan_concrete");
      var0.put("minecraft:concrete.10", "minecraft:purple_concrete");
      var0.put("minecraft:concrete.11", "minecraft:blue_concrete");
      var0.put("minecraft:concrete.12", "minecraft:brown_concrete");
      var0.put("minecraft:concrete.13", "minecraft:green_concrete");
      var0.put("minecraft:concrete.14", "minecraft:red_concrete");
      var0.put("minecraft:concrete.15", "minecraft:black_concrete");
      var0.put("minecraft:concrete_powder.0", "minecraft:white_concrete_powder");
      var0.put("minecraft:concrete_powder.1", "minecraft:orange_concrete_powder");
      var0.put("minecraft:concrete_powder.2", "minecraft:magenta_concrete_powder");
      var0.put("minecraft:concrete_powder.3", "minecraft:light_blue_concrete_powder");
      var0.put("minecraft:concrete_powder.4", "minecraft:yellow_concrete_powder");
      var0.put("minecraft:concrete_powder.5", "minecraft:lime_concrete_powder");
      var0.put("minecraft:concrete_powder.6", "minecraft:pink_concrete_powder");
      var0.put("minecraft:concrete_powder.7", "minecraft:gray_concrete_powder");
      var0.put("minecraft:concrete_powder.8", "minecraft:light_gray_concrete_powder");
      var0.put("minecraft:concrete_powder.9", "minecraft:cyan_concrete_powder");
      var0.put("minecraft:concrete_powder.10", "minecraft:purple_concrete_powder");
      var0.put("minecraft:concrete_powder.11", "minecraft:blue_concrete_powder");
      var0.put("minecraft:concrete_powder.12", "minecraft:brown_concrete_powder");
      var0.put("minecraft:concrete_powder.13", "minecraft:green_concrete_powder");
      var0.put("minecraft:concrete_powder.14", "minecraft:red_concrete_powder");
      var0.put("minecraft:concrete_powder.15", "minecraft:black_concrete_powder");
      var0.put("minecraft:cobblestone_wall.0", "minecraft:cobblestone_wall");
      var0.put("minecraft:cobblestone_wall.1", "minecraft:mossy_cobblestone_wall");
      var0.put("minecraft:sandstone.0", "minecraft:sandstone");
      var0.put("minecraft:sandstone.1", "minecraft:chiseled_sandstone");
      var0.put("minecraft:sandstone.2", "minecraft:cut_sandstone");
      var0.put("minecraft:red_sandstone.0", "minecraft:red_sandstone");
      var0.put("minecraft:red_sandstone.1", "minecraft:chiseled_red_sandstone");
      var0.put("minecraft:red_sandstone.2", "minecraft:cut_red_sandstone");
      var0.put("minecraft:stonebrick.0", "minecraft:stone_bricks");
      var0.put("minecraft:stonebrick.1", "minecraft:mossy_stone_bricks");
      var0.put("minecraft:stonebrick.2", "minecraft:cracked_stone_bricks");
      var0.put("minecraft:stonebrick.3", "minecraft:chiseled_stone_bricks");
      var0.put("minecraft:monster_egg.0", "minecraft:infested_stone");
      var0.put("minecraft:monster_egg.1", "minecraft:infested_cobblestone");
      var0.put("minecraft:monster_egg.2", "minecraft:infested_stone_bricks");
      var0.put("minecraft:monster_egg.3", "minecraft:infested_mossy_stone_bricks");
      var0.put("minecraft:monster_egg.4", "minecraft:infested_cracked_stone_bricks");
      var0.put("minecraft:monster_egg.5", "minecraft:infested_chiseled_stone_bricks");
      var0.put("minecraft:yellow_flower.0", "minecraft:dandelion");
      var0.put("minecraft:red_flower.0", "minecraft:poppy");
      var0.put("minecraft:red_flower.1", "minecraft:blue_orchid");
      var0.put("minecraft:red_flower.2", "minecraft:allium");
      var0.put("minecraft:red_flower.3", "minecraft:azure_bluet");
      var0.put("minecraft:red_flower.4", "minecraft:red_tulip");
      var0.put("minecraft:red_flower.5", "minecraft:orange_tulip");
      var0.put("minecraft:red_flower.6", "minecraft:white_tulip");
      var0.put("minecraft:red_flower.7", "minecraft:pink_tulip");
      var0.put("minecraft:red_flower.8", "minecraft:oxeye_daisy");
      var0.put("minecraft:double_plant.0", "minecraft:sunflower");
      var0.put("minecraft:double_plant.1", "minecraft:lilac");
      var0.put("minecraft:double_plant.2", "minecraft:tall_grass");
      var0.put("minecraft:double_plant.3", "minecraft:large_fern");
      var0.put("minecraft:double_plant.4", "minecraft:rose_bush");
      var0.put("minecraft:double_plant.5", "minecraft:peony");
      var0.put("minecraft:deadbush.0", "minecraft:dead_bush");
      var0.put("minecraft:tallgrass.0", "minecraft:dead_bush");
      var0.put("minecraft:tallgrass.1", "minecraft:grass");
      var0.put("minecraft:tallgrass.2", "minecraft:fern");
      var0.put("minecraft:sponge.0", "minecraft:sponge");
      var0.put("minecraft:sponge.1", "minecraft:wet_sponge");
      var0.put("minecraft:purpur_slab.0", "minecraft:purpur_slab");
      var0.put("minecraft:stone_slab.0", "minecraft:stone_slab");
      var0.put("minecraft:stone_slab.1", "minecraft:sandstone_slab");
      var0.put("minecraft:stone_slab.2", "minecraft:petrified_oak_slab");
      var0.put("minecraft:stone_slab.3", "minecraft:cobblestone_slab");
      var0.put("minecraft:stone_slab.4", "minecraft:brick_slab");
      var0.put("minecraft:stone_slab.5", "minecraft:stone_brick_slab");
      var0.put("minecraft:stone_slab.6", "minecraft:nether_brick_slab");
      var0.put("minecraft:stone_slab.7", "minecraft:quartz_slab");
      var0.put("minecraft:stone_slab2.0", "minecraft:red_sandstone_slab");
      var0.put("minecraft:wooden_slab.0", "minecraft:oak_slab");
      var0.put("minecraft:wooden_slab.1", "minecraft:spruce_slab");
      var0.put("minecraft:wooden_slab.2", "minecraft:birch_slab");
      var0.put("minecraft:wooden_slab.3", "minecraft:jungle_slab");
      var0.put("minecraft:wooden_slab.4", "minecraft:acacia_slab");
      var0.put("minecraft:wooden_slab.5", "minecraft:dark_oak_slab");
      var0.put("minecraft:coal.0", "minecraft:coal");
      var0.put("minecraft:coal.1", "minecraft:charcoal");
      var0.put("minecraft:fish.0", "minecraft:cod");
      var0.put("minecraft:fish.1", "minecraft:salmon");
      var0.put("minecraft:fish.2", "minecraft:clownfish");
      var0.put("minecraft:fish.3", "minecraft:pufferfish");
      var0.put("minecraft:cooked_fish.0", "minecraft:cooked_cod");
      var0.put("minecraft:cooked_fish.1", "minecraft:cooked_salmon");
      var0.put("minecraft:skull.0", "minecraft:skeleton_skull");
      var0.put("minecraft:skull.1", "minecraft:wither_skeleton_skull");
      var0.put("minecraft:skull.2", "minecraft:zombie_head");
      var0.put("minecraft:skull.3", "minecraft:player_head");
      var0.put("minecraft:skull.4", "minecraft:creeper_head");
      var0.put("minecraft:skull.5", "minecraft:dragon_head");
      var0.put("minecraft:golden_apple.0", "minecraft:golden_apple");
      var0.put("minecraft:golden_apple.1", "minecraft:enchanted_golden_apple");
      var0.put("minecraft:fireworks.0", "minecraft:firework_rocket");
      var0.put("minecraft:firework_charge.0", "minecraft:firework_star");
      var0.put("minecraft:dye.0", "minecraft:ink_sac");
      var0.put("minecraft:dye.1", "minecraft:rose_red");
      var0.put("minecraft:dye.2", "minecraft:cactus_green");
      var0.put("minecraft:dye.3", "minecraft:cocoa_beans");
      var0.put("minecraft:dye.4", "minecraft:lapis_lazuli");
      var0.put("minecraft:dye.5", "minecraft:purple_dye");
      var0.put("minecraft:dye.6", "minecraft:cyan_dye");
      var0.put("minecraft:dye.7", "minecraft:light_gray_dye");
      var0.put("minecraft:dye.8", "minecraft:gray_dye");
      var0.put("minecraft:dye.9", "minecraft:pink_dye");
      var0.put("minecraft:dye.10", "minecraft:lime_dye");
      var0.put("minecraft:dye.11", "minecraft:dandelion_yellow");
      var0.put("minecraft:dye.12", "minecraft:light_blue_dye");
      var0.put("minecraft:dye.13", "minecraft:magenta_dye");
      var0.put("minecraft:dye.14", "minecraft:orange_dye");
      var0.put("minecraft:dye.15", "minecraft:bone_meal");
      var0.put("minecraft:silver_shulker_box.0", "minecraft:light_gray_shulker_box");
      var0.put("minecraft:fence.0", "minecraft:oak_fence");
      var0.put("minecraft:fence_gate.0", "minecraft:oak_fence_gate");
      var0.put("minecraft:wooden_door.0", "minecraft:oak_door");
      var0.put("minecraft:boat.0", "minecraft:oak_boat");
      var0.put("minecraft:lit_pumpkin.0", "minecraft:jack_o_lantern");
      var0.put("minecraft:pumpkin.0", "minecraft:carved_pumpkin");
      var0.put("minecraft:trapdoor.0", "minecraft:oak_trapdoor");
      var0.put("minecraft:nether_brick.0", "minecraft:nether_bricks");
      var0.put("minecraft:red_nether_brick.0", "minecraft:red_nether_bricks");
      var0.put("minecraft:netherbrick.0", "minecraft:nether_brick");
      var0.put("minecraft:wooden_button.0", "minecraft:oak_button");
      var0.put("minecraft:wooden_pressure_plate.0", "minecraft:oak_pressure_plate");
      var0.put("minecraft:noteblock.0", "minecraft:note_block");
      var0.put("minecraft:bed.0", "minecraft:white_bed");
      var0.put("minecraft:bed.1", "minecraft:orange_bed");
      var0.put("minecraft:bed.2", "minecraft:magenta_bed");
      var0.put("minecraft:bed.3", "minecraft:light_blue_bed");
      var0.put("minecraft:bed.4", "minecraft:yellow_bed");
      var0.put("minecraft:bed.5", "minecraft:lime_bed");
      var0.put("minecraft:bed.6", "minecraft:pink_bed");
      var0.put("minecraft:bed.7", "minecraft:gray_bed");
      var0.put("minecraft:bed.8", "minecraft:light_gray_bed");
      var0.put("minecraft:bed.9", "minecraft:cyan_bed");
      var0.put("minecraft:bed.10", "minecraft:purple_bed");
      var0.put("minecraft:bed.11", "minecraft:blue_bed");
      var0.put("minecraft:bed.12", "minecraft:brown_bed");
      var0.put("minecraft:bed.13", "minecraft:green_bed");
      var0.put("minecraft:bed.14", "minecraft:red_bed");
      var0.put("minecraft:bed.15", "minecraft:black_bed");
      var0.put("minecraft:banner.15", "minecraft:white_banner");
      var0.put("minecraft:banner.14", "minecraft:orange_banner");
      var0.put("minecraft:banner.13", "minecraft:magenta_banner");
      var0.put("minecraft:banner.12", "minecraft:light_blue_banner");
      var0.put("minecraft:banner.11", "minecraft:yellow_banner");
      var0.put("minecraft:banner.10", "minecraft:lime_banner");
      var0.put("minecraft:banner.9", "minecraft:pink_banner");
      var0.put("minecraft:banner.8", "minecraft:gray_banner");
      var0.put("minecraft:banner.7", "minecraft:light_gray_banner");
      var0.put("minecraft:banner.6", "minecraft:cyan_banner");
      var0.put("minecraft:banner.5", "minecraft:purple_banner");
      var0.put("minecraft:banner.4", "minecraft:blue_banner");
      var0.put("minecraft:banner.3", "minecraft:brown_banner");
      var0.put("minecraft:banner.2", "minecraft:green_banner");
      var0.put("minecraft:banner.1", "minecraft:red_banner");
      var0.put("minecraft:banner.0", "minecraft:black_banner");
      var0.put("minecraft:grass.0", "minecraft:grass_block");
      var0.put("minecraft:brick_block.0", "minecraft:bricks");
      var0.put("minecraft:end_bricks.0", "minecraft:end_stone_bricks");
      var0.put("minecraft:golden_rail.0", "minecraft:powered_rail");
      var0.put("minecraft:magma.0", "minecraft:magma_block");
      var0.put("minecraft:quartz_ore.0", "minecraft:nether_quartz_ore");
      var0.put("minecraft:reeds.0", "minecraft:sugar_cane");
      var0.put("minecraft:slime.0", "minecraft:slime_block");
      var0.put("minecraft:stone_stairs.0", "minecraft:cobblestone_stairs");
      var0.put("minecraft:waterlily.0", "minecraft:lily_pad");
      var0.put("minecraft:web.0", "minecraft:cobweb");
      var0.put("minecraft:snow.0", "minecraft:snow_block");
      var0.put("minecraft:snow_layer.0", "minecraft:snow");
      var0.put("minecraft:record_11.0", "minecraft:music_disc_11");
      var0.put("minecraft:record_13.0", "minecraft:music_disc_13");
      var0.put("minecraft:record_blocks.0", "minecraft:music_disc_blocks");
      var0.put("minecraft:record_cat.0", "minecraft:music_disc_cat");
      var0.put("minecraft:record_chirp.0", "minecraft:music_disc_chirp");
      var0.put("minecraft:record_far.0", "minecraft:music_disc_far");
      var0.put("minecraft:record_mall.0", "minecraft:music_disc_mall");
      var0.put("minecraft:record_mellohi.0", "minecraft:music_disc_mellohi");
      var0.put("minecraft:record_stal.0", "minecraft:music_disc_stal");
      var0.put("minecraft:record_strad.0", "minecraft:music_disc_strad");
      var0.put("minecraft:record_wait.0", "minecraft:music_disc_wait");
      var0.put("minecraft:record_ward.0", "minecraft:music_disc_ward");
   });
   private static final Set<String> field_13242 = field_13240.keySet()
      .stream()
      .<String>map(var0 -> var0.substring(0, var0.indexOf(46)))
      .collect(Collectors.<String>toSet());
   private static final Set<String> field_13241 = Sets.newHashSet(
      new String[]{
         "minecraft:bow",
         "minecraft:carrot_on_a_stick",
         "minecraft:chainmail_boots",
         "minecraft:chainmail_chestplate",
         "minecraft:chainmail_helmet",
         "minecraft:chainmail_leggings",
         "minecraft:diamond_axe",
         "minecraft:diamond_boots",
         "minecraft:diamond_chestplate",
         "minecraft:diamond_helmet",
         "minecraft:diamond_hoe",
         "minecraft:diamond_leggings",
         "minecraft:diamond_pickaxe",
         "minecraft:diamond_shovel",
         "minecraft:diamond_sword",
         "minecraft:elytra",
         "minecraft:fishing_rod",
         "minecraft:flint_and_steel",
         "minecraft:golden_axe",
         "minecraft:golden_boots",
         "minecraft:golden_chestplate",
         "minecraft:golden_helmet",
         "minecraft:golden_hoe",
         "minecraft:golden_leggings",
         "minecraft:golden_pickaxe",
         "minecraft:golden_shovel",
         "minecraft:golden_sword",
         "minecraft:iron_axe",
         "minecraft:iron_boots",
         "minecraft:iron_chestplate",
         "minecraft:iron_helmet",
         "minecraft:iron_hoe",
         "minecraft:iron_leggings",
         "minecraft:iron_pickaxe",
         "minecraft:iron_shovel",
         "minecraft:iron_sword",
         "minecraft:leather_boots",
         "minecraft:leather_chestplate",
         "minecraft:leather_helmet",
         "minecraft:leather_leggings",
         "minecraft:shears",
         "minecraft:shield",
         "minecraft:stone_axe",
         "minecraft:stone_hoe",
         "minecraft:stone_pickaxe",
         "minecraft:stone_shovel",
         "minecraft:stone_sword",
         "minecraft:wooden_axe",
         "minecraft:wooden_hoe",
         "minecraft:wooden_pickaxe",
         "minecraft:wooden_shovel",
         "minecraft:wooden_sword"
      }
   );

   public class_2703(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(class_4002.field_19433);
      OpticFinder var4 = DSL.fieldFinder("id", DSL.named(class_4002.field_19439.typeName(), class_5178.method_23741()));
      OpticFinder var5 = var3.findField("tag");
      return this.fixTypeEverywhereTyped("ItemInstanceTheFlatteningFix", var3, var2 -> {
         Optional var5x = var2.getOptional(var4);
         if (var5x.isPresent()) {
            Typed var6 = var2;
            Dynamic var7 = (Dynamic)var2.get(DSL.remainderFinder());
            int var8 = var7.get("Damage").asInt(0);
            String var9 = method_12195((String)((Pair)var5x.get()).getSecond(), var8);
            if (var9 != null) {
               var6 = var2.set(var4, Pair.of(class_4002.field_19439.typeName(), var9));
            }

            if (field_13241.contains(((Pair)var5x.get()).getSecond())) {
               Typed var10 = var2.getOrCreateTyped(var5);
               Dynamic var11 = (Dynamic)var10.get(DSL.remainderFinder());
               var11 = var11.set("Damage", var11.createInt(var8));
               var6 = var6.set(var5, var10.set(DSL.remainderFinder(), var11));
            }

            return var6.set(DSL.remainderFinder(), var7.remove("Damage"));
         } else {
            return var2;
         }
      });
   }

   @Nullable
   public static String method_12195(String var0, int var1) {
      if (!field_13242.contains(var0)) {
         return null;
      } else {
         String var4 = field_13240.get(var0 + '.' + var1);
         return var4 != null ? var4 : field_13240.get(var0 + ".0");
      }
   }
}
