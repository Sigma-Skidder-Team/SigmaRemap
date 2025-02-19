package net.minecraft.item;

import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.Fluids;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.registry.Registry;

public class Items {
   public static final Item AIR = register(Blocks.AIR, new AirItem(Blocks.AIR, new Item.Properties()));
   public static final Item STONE = register(Blocks.STONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item GRANITE = register(Blocks.GRANITE, ItemGroup.BUILDING_BLOCKS);
   public static final Item POLISHED_GRANITE = register(Blocks.POLISHED_GRANITE, ItemGroup.BUILDING_BLOCKS);
   public static final Item DIORITE = register(Blocks.DIORITE, ItemGroup.BUILDING_BLOCKS);
   public static final Item POLISHED_DIORITE = register(Blocks.POLISHED_DIORITE, ItemGroup.BUILDING_BLOCKS);
   public static final Item ANDESITE = register(Blocks.ANDESITE, ItemGroup.BUILDING_BLOCKS);
   public static final Item POLISHED_ANDESITE = register(Blocks.POLISHED_ANDESITE, ItemGroup.BUILDING_BLOCKS);
   public static final Item GRASS_BLOCK = register(Blocks.GRASS_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item DIRT = register(Blocks.DIRT, ItemGroup.BUILDING_BLOCKS);
   public static final Item COARSE_DIRT = register(Blocks.COARSE_DIRT, ItemGroup.BUILDING_BLOCKS);
   public static final Item PODZOL = register(Blocks.PODZOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item CRIMSON_NYLIUM = register(Blocks.CRIMSON_NYLIUM, ItemGroup.BUILDING_BLOCKS);
   public static final Item WARPED_NYLIUM = register(Blocks.WARPED_NYLIUM, ItemGroup.BUILDING_BLOCKS);
   public static final Item COBBLESTONE = register(Blocks.COBBLESTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item OAK_PLANKS = register(Blocks.OAK_PLANKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item SPRUCE_PLANKS = register(Blocks.SPRUCE_PLANKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item BIRCH_PLANKS = register(Blocks.BIRCH_PLANKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item JUNGLE_PLANKS = register(Blocks.JUNGLE_PLANKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item ACACIA_PLANKS = register(Blocks.ACACIA_PLANKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item DARK_OAK_PLANKS = register(Blocks.DARK_OAK_PLANKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item CRIMSON_PLANKS = register(Blocks.CRIMSON_PLANKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item WARPED_PLANKS = register(Blocks.WARPED_PLANKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item OAK_SAPLING = register(Blocks.OAK_SAPLING, ItemGroup.DECORATIONS);
   public static final Item SPRUCE_SAPLING = register(Blocks.SPRUCE_SAPLING, ItemGroup.DECORATIONS);
   public static final Item BIRCH_SAPLING = register(Blocks.BIRCH_SAPLING, ItemGroup.DECORATIONS);
   public static final Item JUNGLE_SAPLING = register(Blocks.JUNGLE_SAPLING, ItemGroup.DECORATIONS);
   public static final Item ACACIA_SAPLING = register(Blocks.ACACIA_SAPLING, ItemGroup.DECORATIONS);
   public static final Item DARK_OAK_SAPLING = register(Blocks.DARK_OAK_SAPLING, ItemGroup.DECORATIONS);
   public static final Item BEDROCK = register(Blocks.BEDROCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item SAND = register(Blocks.SAND, ItemGroup.BUILDING_BLOCKS);
   public static final Item RED_SAND = register(Blocks.RED_SAND, ItemGroup.BUILDING_BLOCKS);
   public static final Item GRAVEL = register(Blocks.GRAVEL, ItemGroup.BUILDING_BLOCKS);
   public static final Item GOLD_ORE = register(Blocks.GOLD_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item IRON_ORE = register(Blocks.IRON_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item COAL_ORE = register(Blocks.COAL_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item NETHER_GOLD_ORE = register(Blocks.NETHER_GOLD_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item OAK_LOG = register(Blocks.OAK_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item SPRUCE_LOG = register(Blocks.SPRUCE_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item BIRCH_LOG = register(Blocks.BIRCH_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item JUNGLE_LOG = register(Blocks.JUNGLE_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item ACACIA_LOG = register(Blocks.ACACIA_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item DARK_OAK_LOG = register(Blocks.DARK_OAK_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item CRIMSON_STEM = register(Blocks.CRIMSON_STEM, ItemGroup.BUILDING_BLOCKS);
   public static final Item WARPED_STEM = register(Blocks.WARPED_STEM, ItemGroup.BUILDING_BLOCKS);
   public static final Item STRIPPED_OAK_LOG = register(Blocks.STRIPPED_OAK_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item STRIPPED_SPRUCE_LOG = register(Blocks.STRIPPED_SPRUCE_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item STRIPPED_BIRCH_LOG = register(Blocks.STRIPPED_BIRCH_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item STRIPPED_JUNGLE_LOG = register(Blocks.STRIPPED_JUNGLE_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item STRIPPED_ACACIA_LOG = register(Blocks.STRIPPED_ACACIA_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item STRIPPED_DARK_OAK_LOG = register(Blocks.STRIPPED_DARK_OAK_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item STRIPPED_CRIMSON_STEM = register(Blocks.STRIPPED_CRIMSON_STEM, ItemGroup.BUILDING_BLOCKS);
   public static final Item STRIPPED_WARPED_STEM = register(Blocks.STRIPPED_WARPED_STEM, ItemGroup.BUILDING_BLOCKS);
   public static final Item STRIPPED_OAK_WOOD = register(Blocks.STRIPPED_OAK_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item STRIPPED_SPRUCE_WOOD = register(Blocks.STRIPPED_SPRUCE_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item STRIPPED_BIRCH_WOOD = register(Blocks.STRIPPED_BIRCH_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item STRIPPED_JUNGLE_WOOD = register(Blocks.STRIPPED_JUNGLE_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item STRIPPED_ACACIA_WOOD = register(Blocks.STRIPPED_ACACIA_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item STRIPPED_DARK_OAK_WOOD = register(Blocks.STRIPPED_DARK_OAK_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item STRIPPED_CRIMSON_HYPHAE = register(Blocks.STRIPPED_CRIMSON_HYPHAE, ItemGroup.BUILDING_BLOCKS);
   public static final Item STRIPPED_WARPED_HYPHAE = register(Blocks.STRIPPED_WARPED_HYPHAE, ItemGroup.BUILDING_BLOCKS);
   public static final Item OAK_WOOD = register(Blocks.OAK_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item SPRUCE_WOOD = register(Blocks.SPRUCE_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item BIRCH_WOOD = register(Blocks.BIRCH_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item JUNGLE_WOOD = register(Blocks.JUNGLE_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item ACACIA_WOOD = register(Blocks.ACACIA_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item DARK_OAK_WOOD = register(Blocks.DARK_OAK_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item CRIMSON_HYPHAE = register(Blocks.CRIMSON_HYPHAE, ItemGroup.BUILDING_BLOCKS);
   public static final Item WARPED_HYPHAE = register(Blocks.WARPED_HYPHAE, ItemGroup.BUILDING_BLOCKS);
   public static final Item OAK_LEAVES = register(Blocks.OAK_LEAVES, ItemGroup.DECORATIONS);
   public static final Item SPRUCE_LEAVES = register(Blocks.SPRUCE_LEAVES, ItemGroup.DECORATIONS);
   public static final Item BIRCH_LEAVES = register(Blocks.BIRCH_LEAVES, ItemGroup.DECORATIONS);
   public static final Item JUNGLE_LEAVES = register(Blocks.JUNGLE_LEAVES, ItemGroup.DECORATIONS);
   public static final Item ACACIA_LEAVES = register(Blocks.ACACIA_LEAVES, ItemGroup.DECORATIONS);
   public static final Item DARK_OAK_LEAVES = register(Blocks.DARK_OAK_LEAVES, ItemGroup.DECORATIONS);
   public static final Item SPONGE = register(Blocks.SPONGE, ItemGroup.BUILDING_BLOCKS);
   public static final Item WET_SPONGE = register(Blocks.WET_SPONGE, ItemGroup.BUILDING_BLOCKS);
   public static final Item GLASS = register(Blocks.GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item LAPIS_ORE = register(Blocks.LAPIS_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item LAPIS_BLOCK = register(Blocks.LAPIS_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item DISPENSER = register(Blocks.DISPENSER, ItemGroup.REDSTONE);
   public static final Item SANDSTONE = register(Blocks.SANDSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item CHISELED_SANDSTONE = register(Blocks.CHISELED_SANDSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item CUT_SANDSTONE = register(Blocks.CUT_SANDSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item NOTE_BLOCK = register(Blocks.NOTE_BLOCK, ItemGroup.REDSTONE);
   public static final Item POWERED_RAIL = register(Blocks.POWERED_RAIL, ItemGroup.TRANSPORTATION);
   public static final Item DETECTOR_RAIL = register(Blocks.DETECTOR_RAIL, ItemGroup.TRANSPORTATION);
   public static final Item STICKY_PISTON = register(Blocks.STICKY_PISTON, ItemGroup.REDSTONE);
   public static final Item COBWEB = register(Blocks.COBWEB, ItemGroup.DECORATIONS);
   public static final Item GRASS = register(Blocks.GRASS, ItemGroup.DECORATIONS);
   public static final Item FERN = register(Blocks.FERN, ItemGroup.DECORATIONS);
   public static final Item DEAD_BUSH = register(Blocks.DEAD_BUSH, ItemGroup.DECORATIONS);
   public static final Item SEAGRASS = register(Blocks.SEAGRASS, ItemGroup.DECORATIONS);
   public static final Item SEA_PICKLE = register(Blocks.SEA_PICKLE, ItemGroup.DECORATIONS);
   public static final Item PISTON = register(Blocks.PISTON, ItemGroup.REDSTONE);
   public static final Item WHITE_WOOL = register(Blocks.WHITE_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item ORANGE_WOOL = register(Blocks.ORANGE_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item MAGENTA_WOOL = register(Blocks.MAGENTA_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item LIGHT_BLUE_WOOL = register(Blocks.LIGHT_BLUE_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item YELLOW_WOOL = register(Blocks.YELLOW_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item LIME_WOOL = register(Blocks.LIME_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item PINK_WOOL = register(Blocks.PINK_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item GRAY_WOOL = register(Blocks.GRAY_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item LIGHT_GRAY_WOOL = register(Blocks.LIGHT_GRAY_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item CYAN_WOOL = register(Blocks.CYAN_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item PURPLE_WOOL = register(Blocks.PURPLE_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item BLUE_WOOL = register(Blocks.BLUE_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item BROWN_WOOL = register(Blocks.BROWN_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item GREEN_WOOL = register(Blocks.GREEN_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item RED_WOOL = register(Blocks.RED_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item BLACK_WOOL = register(Blocks.BLACK_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item DANDELION = register(Blocks.DANDELION, ItemGroup.DECORATIONS);
   public static final Item POPPY = register(Blocks.POPPY, ItemGroup.DECORATIONS);
   public static final Item BLUE_ORCHID = register(Blocks.BLUE_ORCHID, ItemGroup.DECORATIONS);
   public static final Item ALLIUM = register(Blocks.ALLIUM, ItemGroup.DECORATIONS);
   public static final Item AZURE_BLUET = register(Blocks.AZURE_BLUET, ItemGroup.DECORATIONS);
   public static final Item RED_TULIP = register(Blocks.RED_TULIP, ItemGroup.DECORATIONS);
   public static final Item ORANGE_TULIP = register(Blocks.ORANGE_TULIP, ItemGroup.DECORATIONS);
   public static final Item WHITE_TULIP = register(Blocks.WHITE_TULIP, ItemGroup.DECORATIONS);
   public static final Item PINK_TULIP = register(Blocks.PINK_TULIP, ItemGroup.DECORATIONS);
   public static final Item OXEYE_DAISY = register(Blocks.OXEYE_DAISY, ItemGroup.DECORATIONS);
   public static final Item CORNFLOWER = register(Blocks.CORNFLOWER, ItemGroup.DECORATIONS);
   public static final Item LILY_OF_THE_VALLEY = register(Blocks.LILY_OF_THE_VALLEY, ItemGroup.DECORATIONS);
   public static final Item WITHER_ROSE = register(Blocks.WITHER_ROSE, ItemGroup.DECORATIONS);
   public static final Item BROWN_MUSHROOM = register(Blocks.BROWN_MUSHROOM, ItemGroup.DECORATIONS);
   public static final Item RED_MUSHROOM = register(Blocks.RED_MUSHROOM, ItemGroup.DECORATIONS);
   public static final Item CRIMSON_FUNGUS = register(Blocks.CRIMSON_FUNGUS, ItemGroup.DECORATIONS);
   public static final Item WARPED_FUNGUS = register(Blocks.WARPED_FUNGUS, ItemGroup.DECORATIONS);
   public static final Item CRIMSON_ROOTS = register(Blocks.CRIMSON_ROOTS, ItemGroup.DECORATIONS);
   public static final Item WARPED_ROOTS = register(Blocks.WARPED_ROOTS, ItemGroup.DECORATIONS);
   public static final Item NETHER_SPROUTS = register(Blocks.NETHER_SPROUTS, ItemGroup.DECORATIONS);
   public static final Item WEEPING_VINES = register(Blocks.WEEPING_VINES, ItemGroup.DECORATIONS);
   public static final Item TWISTING_VINES = register(Blocks.TWISTING_VINES, ItemGroup.DECORATIONS);
   public static final Item SUGAR_CANE = register(Blocks.SUGAR_CANE, ItemGroup.DECORATIONS);
   public static final Item KELP = register(Blocks.KELP, ItemGroup.DECORATIONS);
   public static final Item BAMBOO = register(Blocks.BAMBOO, ItemGroup.DECORATIONS);
   public static final Item GOLD_BLOCK = register(Blocks.GOLD_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item IRON_BLOCK = register(Blocks.IRON_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item OAK_SLAB = register(Blocks.OAK_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item SPRUCE_SLAB = register(Blocks.SPRUCE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item BIRCH_SLAB = register(Blocks.BIRCH_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item JUNGLE_SLAB = register(Blocks.JUNGLE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item ACACIA_SLAB = register(Blocks.ACACIA_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item DARK_OAK_SLAB = register(Blocks.DARK_OAK_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item CRIMSON_SLAB = register(Blocks.CRIMSON_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item WARPED_SLAB = register(Blocks.WARPED_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item STONE_SLAB = register(Blocks.STONE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item SMOOTH_STONE_SLAB = register(Blocks.SMOOTH_STONE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item SANDSTONE_SLAB = register(Blocks.SANDSTONE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item CUT_SANDSTONE_SLAB = register(Blocks.CUT_SANDSTONE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item PETRIFIED_OAK_SLAB = register(Blocks.PETRIFIED_OAK_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item COBBLESTONE_SLAB = register(Blocks.COBBLESTONE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item BRICK_SLAB = register(Blocks.BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item STONE_BRICK_SLAB = register(Blocks.STONE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item NETHER_BRICK_SLAB = register(Blocks.NETHER_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item QUARTZ_SLAB = register(Blocks.QUARTZ_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item RED_SANDSTONE_SLAB = register(Blocks.RED_SANDSTONE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item CUT_RED_SANDSTONE_SLAB = register(Blocks.CUT_RED_SANDSTONE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item PURPUR_SLAB = register(Blocks.PURPUR_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item PRISMARINE_SLAB = register(Blocks.PRISMARINE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item PRISMARINE_BRICK_SLAB = register(Blocks.PRISMARINE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item DARK_PRISMARINE_SLAB = register(Blocks.DARK_PRISMARINE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item SMOOTH_QUARTZ = register(Blocks.SMOOTH_QUARTZ, ItemGroup.BUILDING_BLOCKS);
   public static final Item SMOOTH_RED_SANDSTONE = register(Blocks.SMOOTH_RED_SANDSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item SMOOTH_SANDSTONE = register(Blocks.SMOOTH_SANDSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item SMOOTH_STONE = register(Blocks.SMOOTH_STONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item BRICKS = register(Blocks.BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item TNT = register(Blocks.TNT, ItemGroup.REDSTONE);
   public static final Item BOOKSHELF = register(Blocks.BOOKSHELF, ItemGroup.BUILDING_BLOCKS);
   public static final Item MOSSY_COBBLESTONE = register(Blocks.MOSSY_COBBLESTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item OBSIDIAN = register(Blocks.OBSIDIAN, ItemGroup.BUILDING_BLOCKS);
   public static final Item TORCH = register(
      new WallOrFloorItem(Blocks.TORCH, Blocks.WALL_TORCH, new Item.Properties().group(ItemGroup.DECORATIONS))
   );
   public static final Item field37394 = register(Blocks.END_ROD, ItemGroup.DECORATIONS);
   public static final Item field37395 = register(Blocks.CHORUS_PLANT, ItemGroup.DECORATIONS);
   public static final Item field37396 = register(Blocks.CHORUS_FLOWER, ItemGroup.DECORATIONS);
   public static final Item field37397 = register(Blocks.PURPUR_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37398 = register(Blocks.PURPUR_PILLAR, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37399 = register(Blocks.PURPUR_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37400 = register(Blocks.SPAWNER);
   public static final Item field37401 = register(Blocks.OAK_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37402 = register(Blocks.CHEST, ItemGroup.DECORATIONS);
   public static final Item field37403 = register(Blocks.DIAMOND_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37404 = register(Blocks.DIAMOND_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37405 = register(Blocks.CRAFTING_TABLE, ItemGroup.DECORATIONS);
   public static final Item field37406 = register(Blocks.FARMLAND, ItemGroup.DECORATIONS);
   public static final Item field37407 = register(Blocks.FURNACE, ItemGroup.DECORATIONS);
   public static final Item field37408 = register(Blocks.LADDER, ItemGroup.DECORATIONS);
   public static final Item field37409 = register(Blocks.RAIL, ItemGroup.TRANSPORTATION);
   public static final Item field37410 = register(Blocks.COBBLESTONE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37411 = register(Blocks.LEVER, ItemGroup.REDSTONE);
   public static final Item field37412 = register(Blocks.STONE_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37413 = register(Blocks.OAK_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37414 = register(Blocks.SPRUCE_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37415 = register(Blocks.BIRCH_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37416 = register(Blocks.JUNGLE_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37417 = register(Blocks.ACACIA_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37418 = register(Blocks.DARK_OAK_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37419 = register(Blocks.CRIMSON_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37420 = register(Blocks.WARPED_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37421 = register(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37422 = register(Blocks.REDSTONE_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37423 = register(
      new WallOrFloorItem(Blocks.REDSTONE_TORCH, Blocks.REDSTONE_WALL_TORCH, new Item.Properties().group(ItemGroup.REDSTONE))
   );
   public static final Item field37424 = register(Blocks.SNOW, ItemGroup.DECORATIONS);
   public static final Item field37425 = register(Blocks.ICE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37426 = register(Blocks.SNOW_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37427 = register(Blocks.CACTUS, ItemGroup.DECORATIONS);
   public static final Item field37428 = register(Blocks.CLAY, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37429 = register(Blocks.JUKEBOX, ItemGroup.DECORATIONS);
   public static final Item field37430 = register(Blocks.OAK_FENCE, ItemGroup.DECORATIONS);
   public static final Item field37431 = register(Blocks.SPRUCE_FENCE, ItemGroup.DECORATIONS);
   public static final Item field37432 = register(Blocks.BIRCH_FENCE, ItemGroup.DECORATIONS);
   public static final Item field37433 = register(Blocks.JUNGLE_FENCE, ItemGroup.DECORATIONS);
   public static final Item field37434 = register(Blocks.ACACIA_FENCE, ItemGroup.DECORATIONS);
   public static final Item field37435 = register(Blocks.DARK_OAK_FENCE, ItemGroup.DECORATIONS);
   public static final Item field37436 = register(Blocks.CRIMSON_FENCE, ItemGroup.DECORATIONS);
   public static final Item field37437 = register(Blocks.WARPED_FENCE, ItemGroup.DECORATIONS);
   public static final Item field37438 = register(Blocks.PUMPKIN, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37439 = register(Blocks.CARVED_PUMPKIN, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37440 = register(Blocks.NETHERRACK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37441 = register(Blocks.SOUL_SAND, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37442 = register(Blocks.SOUL_SOIL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37443 = register(Blocks.BASALT, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37444 = register(Blocks.POLISHED_BASALT, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37445 = register(
      new WallOrFloorItem(Blocks.SOUL_TORCH, Blocks.SOUL_WALL_TORCH, new Item.Properties().group(ItemGroup.DECORATIONS))
   );
   public static final Item field37446 = register(Blocks.GLOWSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37447 = register(Blocks.JACK_O_LANTERN, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37448 = register(Blocks.OAK_TRAPDOOR, ItemGroup.REDSTONE);
   public static final Item field37449 = register(Blocks.SPRUCE_TRAPDOOR, ItemGroup.REDSTONE);
   public static final Item field37450 = register(Blocks.BIRCH_TRAPDOOR, ItemGroup.REDSTONE);
   public static final Item field37451 = register(Blocks.JUNGLE_TRAPDOOR, ItemGroup.REDSTONE);
   public static final Item field37452 = register(Blocks.ACACIA_TRAPDOOR, ItemGroup.REDSTONE);
   public static final Item field37453 = register(Blocks.DARK_OAK_TRAPDOOR, ItemGroup.REDSTONE);
   public static final Item field37454 = register(Blocks.CRIMSON_TRAPDOOR, ItemGroup.REDSTONE);
   public static final Item field37455 = register(Blocks.WARPED_TRAPDOOR, ItemGroup.REDSTONE);
   public static final Item field37456 = register(Blocks.INFESTED_STONE, ItemGroup.DECORATIONS);
   public static final Item field37457 = register(Blocks.INFESTED_COBBLESTONE, ItemGroup.DECORATIONS);
   public static final Item field37458 = register(Blocks.INFESTED_STONE_BRICKS, ItemGroup.DECORATIONS);
   public static final Item field37459 = register(Blocks.INFESTED_MOSSY_STONE_BRICKS, ItemGroup.DECORATIONS);
   public static final Item field37460 = register(Blocks.INFESTED_CRACKED_STONE_BRICKS, ItemGroup.DECORATIONS);
   public static final Item field37461 = register(Blocks.INFESTED_CHISELED_STONE_BRICKS, ItemGroup.DECORATIONS);
   public static final Item field37462 = register(Blocks.STONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37463 = register(Blocks.MOSSY_STONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37464 = register(Blocks.CRACKED_STONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item CHISELED_STONE_BRICKS = register(Blocks.CHISELED_STONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37466 = register(Blocks.BROWN_MUSHROOM_BLOCK, ItemGroup.DECORATIONS);
   public static final Item field37467 = register(Blocks.RED_MUSHROOM_BLOCK, ItemGroup.DECORATIONS);
   public static final Item field37468 = register(Blocks.MUSHROOM_STEM, ItemGroup.DECORATIONS);
   public static final Item field37469 = register(Blocks.IRON_BARS, ItemGroup.DECORATIONS);
   public static final Item field37470 = register(Blocks.CHAIN, ItemGroup.DECORATIONS);
   public static final Item field37471 = register(Blocks.GLASS_PANE, ItemGroup.DECORATIONS);
   public static final Item field37472 = register(Blocks.MELON, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37473 = register(Blocks.VINE, ItemGroup.DECORATIONS);
   public static final Item field37474 = register(Blocks.OAK_FENCE_GATE, ItemGroup.REDSTONE);
   public static final Item field37475 = register(Blocks.SPRUCE_FENCE_GATE, ItemGroup.REDSTONE);
   public static final Item field37476 = register(Blocks.BIRCH_FENCE_GATE, ItemGroup.REDSTONE);
   public static final Item field37477 = register(Blocks.JUNGLE_FENCE_GATE, ItemGroup.REDSTONE);
   public static final Item field37478 = register(Blocks.ACACIA_FENCE_GATE, ItemGroup.REDSTONE);
   public static final Item field37479 = register(Blocks.DARK_OAK_FENCE_GATE, ItemGroup.REDSTONE);
   public static final Item field37480 = register(Blocks.CRIMSON_FENCE_GATE, ItemGroup.REDSTONE);
   public static final Item field37481 = register(Blocks.WARPED_FENCE_GATE, ItemGroup.REDSTONE);
   public static final Item field37482 = register(Blocks.BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37483 = register(Blocks.STONE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37484 = register(Blocks.MYCELIUM, ItemGroup.BUILDING_BLOCKS);
   public static final Item LILY_PAD = register(new LilyPadItem(Blocks.LILY_PAD, new Item.Properties().group(ItemGroup.DECORATIONS)));
   public static final Item field37486 = register(Blocks.NETHER_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37487 = register(Blocks.CRACKED_NETHER_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37488 = register(Blocks.CHISELED_NETHER_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37489 = register(Blocks.NETHER_BRICK_FENCE, ItemGroup.DECORATIONS);
   public static final Item field37490 = register(Blocks.NETHER_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37491 = register(Blocks.ENCHANTING_TABLE, ItemGroup.DECORATIONS);
   public static final Item field37492 = register(Blocks.END_PORTAL_FRAME, ItemGroup.DECORATIONS);
   public static final Item field37493 = register(Blocks.END_STONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37494 = register(Blocks.END_STONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item DRAGON_EGG = register(new BlockItem(Blocks.DRAGON_EGG, new Item.Properties().rarity(Rarity.EPIC)));
   public static final Item field37496 = register(Blocks.REDSTONE_LAMP, ItemGroup.REDSTONE);
   public static final Item field37497 = register(Blocks.SANDSTONE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37498 = register(Blocks.EMERALD_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37499 = register(Blocks.ENDER_CHEST, ItemGroup.DECORATIONS);
   public static final Item field37500 = register(Blocks.TRIPWIRE_HOOK, ItemGroup.REDSTONE);
   public static final Item field37501 = register(Blocks.EMERALD_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37502 = register(Blocks.SPRUCE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37503 = register(Blocks.BIRCH_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37504 = register(Blocks.JUNGLE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37505 = register(Blocks.CRIMSON_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37506 = register(Blocks.WARPED_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37507 = register(new Class3293(Blocks.COMMAND_BLOCK, new Item.Properties().rarity(Rarity.EPIC)));
   public static final Item field37508 = register(
      new BlockItem(Blocks.BEACON, new Item.Properties().group(ItemGroup.MISC).rarity(Rarity.RARE))
   );
   public static final Item field37509 = register(Blocks.COBBLESTONE_WALL, ItemGroup.DECORATIONS);
   public static final Item field37510 = register(Blocks.MOSSY_COBBLESTONE_WALL, ItemGroup.DECORATIONS);
   public static final Item field37511 = register(Blocks.BRICK_WALL, ItemGroup.DECORATIONS);
   public static final Item field37512 = register(Blocks.PRISMARINE_WALL, ItemGroup.DECORATIONS);
   public static final Item field37513 = register(Blocks.RED_SANDSTONE_WALL, ItemGroup.DECORATIONS);
   public static final Item field37514 = register(Blocks.MOSSY_STONE_BRICK_WALL, ItemGroup.DECORATIONS);
   public static final Item field37515 = register(Blocks.GRANITE_WALL, ItemGroup.DECORATIONS);
   public static final Item field37516 = register(Blocks.STONE_BRICK_WALL, ItemGroup.DECORATIONS);
   public static final Item field37517 = register(Blocks.NETHER_BRICK_WALL, ItemGroup.DECORATIONS);
   public static final Item field37518 = register(Blocks.ANDESITE_WALL, ItemGroup.DECORATIONS);
   public static final Item field37519 = register(Blocks.RED_NETHER_BRICK_WALL, ItemGroup.DECORATIONS);
   public static final Item field37520 = register(Blocks.SANDSTONE_WALL, ItemGroup.DECORATIONS);
   public static final Item field37521 = register(Blocks.END_STONE_BRICK_WALL, ItemGroup.DECORATIONS);
   public static final Item field37522 = register(Blocks.DIORITE_WALL, ItemGroup.DECORATIONS);
   public static final Item field37523 = register(Blocks.BLACKSTONE_WALL, ItemGroup.DECORATIONS);
   public static final Item field37524 = register(Blocks.POLISHED_BLACKSTONE_WALL, ItemGroup.DECORATIONS);
   public static final Item field37525 = register(Blocks.POLISHED_BLACKSTONE_BRICK_WALL, ItemGroup.DECORATIONS);
   public static final Item field37526 = register(Blocks.STONE_BUTTON, ItemGroup.REDSTONE);
   public static final Item field37527 = register(Blocks.OAK_BUTTON, ItemGroup.REDSTONE);
   public static final Item field37528 = register(Blocks.SPRUCE_BUTTON, ItemGroup.REDSTONE);
   public static final Item field37529 = register(Blocks.BIRCH_BUTTON, ItemGroup.REDSTONE);
   public static final Item field37530 = register(Blocks.JUNGLE_BUTTON, ItemGroup.REDSTONE);
   public static final Item field37531 = register(Blocks.ACACIA_BUTTON, ItemGroup.REDSTONE);
   public static final Item field37532 = register(Blocks.DARK_OAK_BUTTON, ItemGroup.REDSTONE);
   public static final Item field37533 = register(Blocks.CRIMSON_BUTTON, ItemGroup.REDSTONE);
   public static final Item field37534 = register(Blocks.WARPED_BUTTON, ItemGroup.REDSTONE);
   public static final Item field37535 = register(Blocks.POLISHED_BLACKSTONE_BUTTON, ItemGroup.REDSTONE);
   public static final Item field37536 = register(Blocks.ANVIL, ItemGroup.DECORATIONS);
   public static final Item field37537 = register(Blocks.CHIPPED_ANVIL, ItemGroup.DECORATIONS);
   public static final Item field37538 = register(Blocks.DAMAGED_ANVIL, ItemGroup.DECORATIONS);
   public static final Item field37539 = register(Blocks.TRAPPED_CHEST, ItemGroup.REDSTONE);
   public static final Item field37540 = register(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37541 = register(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37542 = register(Blocks.DAYLIGHT_DETECTOR, ItemGroup.REDSTONE);
   public static final Item field37543 = register(Blocks.REDSTONE_BLOCK, ItemGroup.REDSTONE);
   public static final Item field37544 = register(Blocks.NETHER_QUARTZ_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37545 = register(Blocks.HOPPER, ItemGroup.REDSTONE);
   public static final Item field37546 = register(Blocks.CHISELED_QUARTZ_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37547 = register(Blocks.QUARTZ_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37548 = register(Blocks.QUARTZ_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37549 = register(Blocks.QUARTZ_PILLAR, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37550 = register(Blocks.QUARTZ_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37551 = register(Blocks.ACTIVATOR_RAIL, ItemGroup.TRANSPORTATION);
   public static final Item field37552 = register(Blocks.DROPPER, ItemGroup.REDSTONE);
   public static final Item field37553 = register(Blocks.WHITE_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37554 = register(Blocks.ORANGE_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37555 = register(Blocks.MAGENTA_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37556 = register(Blocks.LIGHT_BLUE_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37557 = register(Blocks.YELLOW_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37558 = register(Blocks.LIME_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37559 = register(Blocks.PINK_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37560 = register(Blocks.GRAY_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37561 = register(Blocks.LIGHT_GRAY_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37562 = register(Blocks.CYAN_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37563 = register(Blocks.PURPLE_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37564 = register(Blocks.BLUE_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37565 = register(Blocks.BROWN_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37566 = register(Blocks.GREEN_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37567 = register(Blocks.RED_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37568 = register(Blocks.BLACK_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item BARRIER = register(Blocks.BARRIER);
   public static final Item field37570 = register(Blocks.IRON_TRAPDOOR, ItemGroup.REDSTONE);
   public static final Item field37571 = register(Blocks.HAY_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37572 = register(Blocks.WHITE_CARPET, ItemGroup.DECORATIONS);
   public static final Item field37573 = register(Blocks.ORANGE_CARPET, ItemGroup.DECORATIONS);
   public static final Item field37574 = register(Blocks.MAGENTA_CARPET, ItemGroup.DECORATIONS);
   public static final Item field37575 = register(Blocks.LIGHT_BLUE_CARPET, ItemGroup.DECORATIONS);
   public static final Item field37576 = register(Blocks.YELLOW_CARPET, ItemGroup.DECORATIONS);
   public static final Item field37577 = register(Blocks.LIME_CARPET, ItemGroup.DECORATIONS);
   public static final Item field37578 = register(Blocks.PINK_CARPET, ItemGroup.DECORATIONS);
   public static final Item field37579 = register(Blocks.GRAY_CARPET, ItemGroup.DECORATIONS);
   public static final Item field37580 = register(Blocks.LIGHT_GRAY_CARPET, ItemGroup.DECORATIONS);
   public static final Item field37581 = register(Blocks.CYAN_CARPET, ItemGroup.DECORATIONS);
   public static final Item field37582 = register(Blocks.PURPLE_CARPET, ItemGroup.DECORATIONS);
   public static final Item field37583 = register(Blocks.BLUE_CARPET, ItemGroup.DECORATIONS);
   public static final Item field37584 = register(Blocks.BROWN_CARPET, ItemGroup.DECORATIONS);
   public static final Item field37585 = register(Blocks.GREEN_CARPET, ItemGroup.DECORATIONS);
   public static final Item field37586 = register(Blocks.RED_CARPET, ItemGroup.DECORATIONS);
   public static final Item field37587 = register(Blocks.BLACK_CARPET, ItemGroup.DECORATIONS);
   public static final Item field37588 = register(Blocks.TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37589 = register(Blocks.COAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37590 = register(Blocks.PACKED_ICE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37591 = register(Blocks.ACACIA_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37592 = register(Blocks.DARK_OAK_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37593 = register(Blocks.SLIME_BLOCK, ItemGroup.DECORATIONS);
   public static final Item field37594 = register(Blocks.GRASS_PATH, ItemGroup.DECORATIONS);
   public static final Item field37595 = register(new Class3295(Blocks.SUNFLOWER, new Item.Properties().group(ItemGroup.DECORATIONS)));
   public static final Item field37596 = register(new Class3295(Blocks.LILAC, new Item.Properties().group(ItemGroup.DECORATIONS)));
   public static final Item field37597 = register(new Class3295(Blocks.ROSE_BUSH, new Item.Properties().group(ItemGroup.DECORATIONS)));
   public static final Item field37598 = register(new Class3295(Blocks.PEONY, new Item.Properties().group(ItemGroup.DECORATIONS)));
   public static final Item field37599 = register(new Class3295(Blocks.TALL_GRASS, new Item.Properties().group(ItemGroup.DECORATIONS)));
   public static final Item field37600 = register(new Class3295(Blocks.LARGE_FERN, new Item.Properties().group(ItemGroup.DECORATIONS)));
   public static final Item field37601 = register(Blocks.WHITE_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37602 = register(Blocks.ORANGE_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37603 = register(Blocks.MAGENTA_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37604 = register(Blocks.LIGHT_BLUE_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37605 = register(Blocks.YELLOW_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37606 = register(Blocks.LIME_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37607 = register(Blocks.PINK_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37608 = register(Blocks.GRAY_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37609 = register(Blocks.LIGHT_GRAY_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37610 = register(Blocks.CYAN_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37611 = register(Blocks.PURPLE_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37612 = register(Blocks.BLUE_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37613 = register(Blocks.BROWN_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37614 = register(Blocks.GREEN_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37615 = register(Blocks.RED_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37616 = register(Blocks.BLACK_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37617 = register(Blocks.WHITE_STAINED_GLASS_PANE, ItemGroup.DECORATIONS);
   public static final Item field37618 = register(Blocks.ORANGE_STAINED_GLASS_PANE, ItemGroup.DECORATIONS);
   public static final Item field37619 = register(Blocks.MAGENTA_STAINED_GLASS_PANE, ItemGroup.DECORATIONS);
   public static final Item field37620 = register(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE, ItemGroup.DECORATIONS);
   public static final Item field37621 = register(Blocks.YELLOW_STAINED_GLASS_PANE, ItemGroup.DECORATIONS);
   public static final Item field37622 = register(Blocks.LIME_STAINED_GLASS_PANE, ItemGroup.DECORATIONS);
   public static final Item field37623 = register(Blocks.PINK_STAINED_GLASS_PANE, ItemGroup.DECORATIONS);
   public static final Item field37624 = register(Blocks.GRAY_STAINED_GLASS_PANE, ItemGroup.DECORATIONS);
   public static final Item field37625 = register(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE, ItemGroup.DECORATIONS);
   public static final Item field37626 = register(Blocks.CYAN_STAINED_GLASS_PANE, ItemGroup.DECORATIONS);
   public static final Item field37627 = register(Blocks.PURPLE_STAINED_GLASS_PANE, ItemGroup.DECORATIONS);
   public static final Item field37628 = register(Blocks.BLUE_STAINED_GLASS_PANE, ItemGroup.DECORATIONS);
   public static final Item field37629 = register(Blocks.BROWN_STAINED_GLASS_PANE, ItemGroup.DECORATIONS);
   public static final Item field37630 = register(Blocks.GREEN_STAINED_GLASS_PANE, ItemGroup.DECORATIONS);
   public static final Item field37631 = register(Blocks.RED_STAINED_GLASS_PANE, ItemGroup.DECORATIONS);
   public static final Item field37632 = register(Blocks.BLACK_STAINED_GLASS_PANE, ItemGroup.DECORATIONS);
   public static final Item field37633 = register(Blocks.PRISMARINE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37634 = register(Blocks.PRISMARINE_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37635 = register(Blocks.DARK_PRISMARINE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37636 = register(Blocks.PRISMARINE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37637 = register(Blocks.PRISMARINE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37638 = register(Blocks.DARK_PRISMARINE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37639 = register(Blocks.SEA_LANTERN, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37640 = register(Blocks.RED_SANDSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37641 = register(Blocks.CHISELED_RED_SANDSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37642 = register(Blocks.CUT_RED_SANDSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37643 = register(Blocks.RED_SANDSTONE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37644 = register(new Class3293(Blocks.REPEATING_COMMAND_BLOCK, new Item.Properties().rarity(Rarity.EPIC)));
   public static final Item field37645 = register(new Class3293(Blocks.CHAIN_COMMAND_BLOCK, new Item.Properties().rarity(Rarity.EPIC)));
   public static final Item field37646 = register(Blocks.MAGMA_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37647 = register(Blocks.NETHER_WART_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37648 = register(Blocks.WARPED_WART_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37649 = register(Blocks.RED_NETHER_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37650 = register(Blocks.BONE_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37651 = register(Blocks.STRUCTURE_VOID);
   public static final Item field37652 = register(Blocks.OBSERVER, ItemGroup.REDSTONE);
   public static final Item field37653 = register(new BlockItem(Blocks.SHULKER_BOX, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37654 = register(new BlockItem(Blocks.WHITE_SHULKER_BOX, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37655 = register(new BlockItem(Blocks.ORANGE_SHULKER_BOX, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37656 = register(new BlockItem(Blocks.MAGENTA_SHULKER_BOX, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37657 = register(new BlockItem(Blocks.LIGHT_BLUE_SHULKER_BOX, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37658 = register(new BlockItem(Blocks.YELLOW_SHULKER_BOX, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37659 = register(new BlockItem(Blocks.LIME_SHULKER_BOX, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37660 = register(new BlockItem(Blocks.PINK_SHULKER_BOX, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37661 = register(new BlockItem(Blocks.GRAY_SHULKER_BOX, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37662 = register(new BlockItem(Blocks.LIGHT_GRAY_SHULKER_BOX, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37663 = register(new BlockItem(Blocks.CYAN_SHULKER_BOX, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37664 = register(new BlockItem(Blocks.PURPLE_SHULKER_BOX, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37665 = register(new BlockItem(Blocks.BLUE_SHULKER_BOX, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37666 = register(new BlockItem(Blocks.BROWN_SHULKER_BOX, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37667 = register(new BlockItem(Blocks.GREEN_SHULKER_BOX, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37668 = register(new BlockItem(Blocks.RED_SHULKER_BOX, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37669 = register(new BlockItem(Blocks.BLACK_SHULKER_BOX, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37670 = register(Blocks.WHITE_GLAZED_TERRACOTTA, ItemGroup.DECORATIONS);
   public static final Item field37671 = register(Blocks.ORANGE_GLAZED_TERRACOTTA, ItemGroup.DECORATIONS);
   public static final Item field37672 = register(Blocks.MAGENTA_GLAZED_TERRACOTTA, ItemGroup.DECORATIONS);
   public static final Item field37673 = register(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, ItemGroup.DECORATIONS);
   public static final Item field37674 = register(Blocks.YELLOW_GLAZED_TERRACOTTA, ItemGroup.DECORATIONS);
   public static final Item field37675 = register(Blocks.LIME_GLAZED_TERRACOTTA, ItemGroup.DECORATIONS);
   public static final Item field37676 = register(Blocks.PINK_GLAZED_TERRACOTTA, ItemGroup.DECORATIONS);
   public static final Item field37677 = register(Blocks.GRAY_GLAZED_TERRACOTTA, ItemGroup.DECORATIONS);
   public static final Item field37678 = register(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, ItemGroup.DECORATIONS);
   public static final Item field37679 = register(Blocks.CYAN_GLAZED_TERRACOTTA, ItemGroup.DECORATIONS);
   public static final Item field37680 = register(Blocks.PURPLE_GLAZED_TERRACOTTA, ItemGroup.DECORATIONS);
   public static final Item field37681 = register(Blocks.BLUE_GLAZED_TERRACOTTA, ItemGroup.DECORATIONS);
   public static final Item field37682 = register(Blocks.BROWN_GLAZED_TERRACOTTA, ItemGroup.DECORATIONS);
   public static final Item field37683 = register(Blocks.GREEN_GLAZED_TERRACOTTA, ItemGroup.DECORATIONS);
   public static final Item field37684 = register(Blocks.RED_GLAZED_TERRACOTTA, ItemGroup.DECORATIONS);
   public static final Item field37685 = register(Blocks.BLACK_GLAZED_TERRACOTTA, ItemGroup.DECORATIONS);
   public static final Item field37686 = register(Blocks.WHITE_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37687 = register(Blocks.ORANGE_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37688 = register(Blocks.MAGENTA_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37689 = register(Blocks.LIGHT_BLUE_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37690 = register(Blocks.YELLOW_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37691 = register(Blocks.LIME_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37692 = register(Blocks.PINK_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37693 = register(Blocks.GRAY_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37694 = register(Blocks.LIGHT_GRAY_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37695 = register(Blocks.CYAN_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37696 = register(Blocks.PURPLE_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37697 = register(Blocks.BLUE_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37698 = register(Blocks.BROWN_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37699 = register(Blocks.GREEN_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37700 = register(Blocks.RED_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37701 = register(Blocks.BLACK_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37702 = register(Blocks.WHITE_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37703 = register(Blocks.ORANGE_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37704 = register(Blocks.MAGENTA_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37705 = register(Blocks.LIGHT_BLUE_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37706 = register(Blocks.YELLOW_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37707 = register(Blocks.LIME_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37708 = register(Blocks.PINK_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37709 = register(Blocks.GRAY_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37710 = register(Blocks.LIGHT_GRAY_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37711 = register(Blocks.CYAN_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37712 = register(Blocks.PURPLE_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37713 = register(Blocks.BLUE_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37714 = register(Blocks.BROWN_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37715 = register(Blocks.GREEN_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37716 = register(Blocks.RED_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37717 = register(Blocks.BLACK_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37718 = register(Blocks.TURTLE_EGG, ItemGroup.MISC);
   public static final Item field37719 = register(Blocks.DEAD_TUBE_CORAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37720 = register(Blocks.DEAD_BRAIN_CORAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37721 = register(Blocks.DEAD_BUBBLE_CORAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37722 = register(Blocks.DEAD_FIRE_CORAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37723 = register(Blocks.DEAD_HORN_CORAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37724 = register(Blocks.TUBE_CORAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37725 = register(Blocks.BRAIN_CORAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37726 = register(Blocks.BUBBLE_CORAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37727 = register(Blocks.FIRE_CORAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37728 = register(Blocks.HORN_CORAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37729 = register(Blocks.TUBE_CORAL, ItemGroup.DECORATIONS);
   public static final Item field37730 = register(Blocks.BRAIN_CORAL, ItemGroup.DECORATIONS);
   public static final Item field37731 = register(Blocks.BUBBLE_CORAL, ItemGroup.DECORATIONS);
   public static final Item field37732 = register(Blocks.FIRE_CORAL, ItemGroup.DECORATIONS);
   public static final Item field37733 = register(Blocks.HORN_CORAL, ItemGroup.DECORATIONS);
   public static final Item field37734 = register(Blocks.DEAD_BRAIN_CORAL, ItemGroup.DECORATIONS);
   public static final Item field37735 = register(Blocks.DEAD_BUBBLE_CORAL, ItemGroup.DECORATIONS);
   public static final Item field37736 = register(Blocks.DEAD_FIRE_CORAL, ItemGroup.DECORATIONS);
   public static final Item field37737 = register(Blocks.DEAD_HORN_CORAL, ItemGroup.DECORATIONS);
   public static final Item field37738 = register(Blocks.DEAD_TUBE_CORAL, ItemGroup.DECORATIONS);
   public static final Item field37739 = register(
      new WallOrFloorItem(Blocks.TUBE_CORAL_FAN, Blocks.TUBE_CORAL_WALL_FAN, new Item.Properties().group(ItemGroup.DECORATIONS))
   );
   public static final Item field37740 = register(
      new WallOrFloorItem(Blocks.BRAIN_CORAL_FAN, Blocks.BRAIN_CORAL_WALL_FAN, new Item.Properties().group(ItemGroup.DECORATIONS))
   );
   public static final Item field37741 = register(
      new WallOrFloorItem(Blocks.BUBBLE_CORAL_FAN, Blocks.BUBBLE_CORAL_WALL_FAN, new Item.Properties().group(ItemGroup.DECORATIONS))
   );
   public static final Item field37742 = register(
      new WallOrFloorItem(Blocks.FIRE_CORAL_FAN, Blocks.FIRE_CORAL_WALL_FAN, new Item.Properties().group(ItemGroup.DECORATIONS))
   );
   public static final Item field37743 = register(
      new WallOrFloorItem(Blocks.HORN_CORAL_FAN, Blocks.HORN_CORAL_WALL_FAN, new Item.Properties().group(ItemGroup.DECORATIONS))
   );
   public static final Item field37744 = register(
      new WallOrFloorItem(Blocks.DEAD_TUBE_CORAL_FAN, Blocks.DEAD_TUBE_CORAL_WALL_FAN, new Item.Properties().group(ItemGroup.DECORATIONS))
   );
   public static final Item field37745 = register(
      new WallOrFloorItem(Blocks.DEAD_BRAIN_CORAL_FAN, Blocks.DEAD_BRAIN_CORAL_WALL_FAN, new Item.Properties().group(ItemGroup.DECORATIONS))
   );
   public static final Item field37746 = register(
      new WallOrFloorItem(Blocks.DEAD_BUBBLE_CORAL_FAN, Blocks.DEAD_BUBBLE_CORAL_WALL_FAN, new Item.Properties().group(ItemGroup.DECORATIONS))
   );
   public static final Item field37747 = register(
      new WallOrFloorItem(Blocks.DEAD_FIRE_CORAL_FAN, Blocks.DEAD_FIRE_CORAL_WALL_FAN, new Item.Properties().group(ItemGroup.DECORATIONS))
   );
   public static final Item field37748 = register(
      new WallOrFloorItem(Blocks.DEAD_HORN_CORAL_FAN, Blocks.DEAD_HORN_CORAL_WALL_FAN, new Item.Properties().group(ItemGroup.DECORATIONS))
   );
   public static final Item field37749 = register(Blocks.BLUE_ICE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37750 = register(
      new BlockItem(Blocks.CONDUIT, new Item.Properties().group(ItemGroup.MISC).rarity(Rarity.RARE))
   );
   public static final Item field37751 = register(Blocks.POLISHED_GRANITE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37752 = register(Blocks.SMOOTH_RED_SANDSTONE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37753 = register(Blocks.MOSSY_STONE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37754 = register(Blocks.POLISHED_DIORITE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37755 = register(Blocks.MOSSY_COBBLESTONE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37756 = register(Blocks.END_STONE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37757 = register(Blocks.STONE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37758 = register(Blocks.SMOOTH_SANDSTONE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37759 = register(Blocks.SMOOTH_QUARTZ_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37760 = register(Blocks.GRANITE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37761 = register(Blocks.ANDESITE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37762 = register(Blocks.RED_NETHER_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37763 = register(Blocks.POLISHED_ANDESITE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37764 = register(Blocks.DIORITE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37765 = register(Blocks.POLISHED_GRANITE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37766 = register(Blocks.SMOOTH_RED_SANDSTONE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37767 = register(Blocks.MOSSY_STONE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37768 = register(Blocks.POLISHED_DIORITE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37769 = register(Blocks.MOSSY_COBBLESTONE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37770 = register(Blocks.END_STONE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37771 = register(Blocks.SMOOTH_SANDSTONE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37772 = register(Blocks.SMOOTH_QUARTZ_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37773 = register(Blocks.GRANITE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37774 = register(Blocks.ANDESITE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37775 = register(Blocks.RED_NETHER_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37776 = register(Blocks.POLISHED_ANDESITE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37777 = register(Blocks.DIORITE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37778 = register(new Class3294(Blocks.SCAFFOLDING, new Item.Properties().group(ItemGroup.DECORATIONS)));
   public static final Item field37779 = register(new Class3295(Blocks.IRON_DOOR, new Item.Properties().group(ItemGroup.REDSTONE)));
   public static final Item field37780 = register(new Class3295(Blocks.OAK_DOOR, new Item.Properties().group(ItemGroup.REDSTONE)));
   public static final Item field37781 = register(new Class3295(Blocks.SPRUCE_DOOR, new Item.Properties().group(ItemGroup.REDSTONE)));
   public static final Item field37782 = register(new Class3295(Blocks.BIRCH_DOOR, new Item.Properties().group(ItemGroup.REDSTONE)));
   public static final Item field37783 = register(new Class3295(Blocks.JUNGLE_DOOR, new Item.Properties().group(ItemGroup.REDSTONE)));
   public static final Item field37784 = register(new Class3295(Blocks.ACACIA_DOOR, new Item.Properties().group(ItemGroup.REDSTONE)));
   public static final Item field37785 = register(new Class3295(Blocks.DARK_OAK_DOOR, new Item.Properties().group(ItemGroup.REDSTONE)));
   public static final Item field37786 = register(new Class3295(Blocks.CRIMSON_DOOR, new Item.Properties().group(ItemGroup.REDSTONE)));
   public static final Item field37787 = register(new Class3295(Blocks.WARPED_DOOR, new Item.Properties().group(ItemGroup.REDSTONE)));
   public static final Item field37788 = register(Blocks.REPEATER, ItemGroup.REDSTONE);
   public static final Item field37789 = register(Blocks.COMPARATOR, ItemGroup.REDSTONE);
   public static final Item STRUCTURE = register(new Class3293(Blocks.STRUCTURE_BLOCK, new Item.Properties().rarity(Rarity.EPIC)));
   public static final Item JIGSAW = register(new Class3293(Blocks.JIGSAW, new Item.Properties().rarity(Rarity.EPIC)));
   public static final Item TURTLE_HELMET = register(
      "turtle_helmet", new ArmorItem(Class2114.field13778, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item SCUTE = register("scute", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item FLINT_AND_STEEL = register("flint_and_steel", new Class3281(new Item.Properties().method17777(64).group(ItemGroup.TOOLS)));
   public static final Item APPLE = register(
      "apple", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39058))
   );
   public static final Item BOW = register("bow", new BowItem(new Item.Properties().method17777(384).group(ItemGroup.COMBAT)));
   public static final Item ARROW = register("arrow", new ArrowItem(new Item.Properties().group(ItemGroup.COMBAT)));
   public static final Item COAL = register("coal", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item CHARCOAL = register("charcoal", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item DIAMOND = register("diamond", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item IRON_INGOT = register("iron_ingot", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item GOLD_INGOT = register("gold_ingot", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item NETHERITE_INGOT = register("netherite_ingot", new Item(new Item.Properties().group(ItemGroup.MATERIALS).isImmunteToFire()));
   public static final Item NETHERITE_SCRAP = register("netherite_scrap", new Item(new Item.Properties().group(ItemGroup.MATERIALS).isImmunteToFire()));
   public static final Item WOODEN_SWORD = register(
      "wooden_sword", new SwordItem(ItemTier.WOOD, 3, -2.4F, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item WOODEN_SHOVEL = register(
      "wooden_shovel", new ShovelItem(ItemTier.WOOD, 1.5F, -3.0F, new Item.Properties().group(ItemGroup.TOOLS))
   );
   public static final Item WOODEN_PICKAXE = register(
      "wooden_pickaxe", new PickaxeItem(ItemTier.WOOD, 1, -2.8F, new Item.Properties().group(ItemGroup.TOOLS))
   );
   public static final Item WOODEN_AXE = register(
      "wooden_axe", new AxeItem(ItemTier.WOOD, 6.0F, -3.2F, new Item.Properties().group(ItemGroup.TOOLS))
   );
   public static final Item WOODEN_HOE = register(
      "wooden_hoe", new HoeItem(ItemTier.WOOD, 0, -3.0F, new Item.Properties().group(ItemGroup.TOOLS))
   );
   public static final Item STONE_SWORD = register(
      "stone_sword", new SwordItem(ItemTier.STONE, 3, -2.4F, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item STONE_SHOVEL = register(
      "stone_shovel", new ShovelItem(ItemTier.STONE, 1.5F, -3.0F, new Item.Properties().group(ItemGroup.TOOLS))
   );
   public static final Item STONE_PICKAXE = register(
      "stone_pickaxe", new PickaxeItem(ItemTier.STONE, 1, -2.8F, new Item.Properties().group(ItemGroup.TOOLS))
   );
   public static final Item field37813 = register(
      "stone_axe", new AxeItem(ItemTier.STONE, 7.0F, -3.2F, new Item.Properties().group(ItemGroup.TOOLS))
   );
   public static final Item field37814 = register(
      "stone_hoe", new HoeItem(ItemTier.STONE, -1, -2.0F, new Item.Properties().group(ItemGroup.TOOLS))
   );
   public static final Item GOLDEN_SWORD = register(
      "golden_sword", new SwordItem(ItemTier.GOLD, 3, -2.4F, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item field37816 = register(
      "golden_shovel", new ShovelItem(ItemTier.GOLD, 1.5F, -3.0F, new Item.Properties().group(ItemGroup.TOOLS))
   );
   public static final Item field37817 = register(
      "golden_pickaxe", new PickaxeItem(ItemTier.GOLD, 1, -2.8F, new Item.Properties().group(ItemGroup.TOOLS))
   );
   public static final Item field37818 = register(
      "golden_axe", new AxeItem(ItemTier.GOLD, 6.0F, -3.0F, new Item.Properties().group(ItemGroup.TOOLS))
   );
   public static final Item field37819 = register(
      "golden_hoe", new HoeItem(ItemTier.GOLD, 0, -3.0F, new Item.Properties().group(ItemGroup.TOOLS))
   );
   public static final Item field37820 = register(
      "iron_sword", new SwordItem(ItemTier.IRON, 3, -2.4F, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item IRON_SHOVEL = register(
      "iron_shovel", new ShovelItem(ItemTier.IRON, 1.5F, -3.0F, new Item.Properties().group(ItemGroup.TOOLS))
   );
   public static final Item field37822 = register(
      "iron_pickaxe", new PickaxeItem(ItemTier.IRON, 1, -2.8F, new Item.Properties().group(ItemGroup.TOOLS))
   );
   public static final Item IRON_AXE = register(
      "iron_axe", new AxeItem(ItemTier.IRON, 6.0F, -3.1F, new Item.Properties().group(ItemGroup.TOOLS))
   );
   public static final Item field37824 = register(
      "iron_hoe", new HoeItem(ItemTier.IRON, -2, -1.0F, new Item.Properties().group(ItemGroup.TOOLS))
   );
   public static final Item field37825 = register(
      "diamond_sword", new SwordItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item field37826 = register(
      "diamond_shovel", new ShovelItem(ItemTier.DIAMOND, 1.5F, -3.0F, new Item.Properties().group(ItemGroup.TOOLS))
   );
   public static final Item field37827 = register(
      "diamond_pickaxe", new PickaxeItem(ItemTier.DIAMOND, 1, -2.8F, new Item.Properties().group(ItemGroup.TOOLS))
   );
   public static final Item field37828 = register(
      "diamond_axe", new AxeItem(ItemTier.DIAMOND, 5.0F, -3.0F, new Item.Properties().group(ItemGroup.TOOLS))
   );
   public static final Item field37829 = register(
      "diamond_hoe", new HoeItem(ItemTier.DIAMOND, -3, 0.0F, new Item.Properties().group(ItemGroup.TOOLS))
   );
   public static final Item field37830 = register(
      "netherite_sword", new SwordItem(ItemTier.NETHERITE, 3, -2.4F, new Item.Properties().group(ItemGroup.COMBAT).isImmunteToFire())
   );
   public static final Item field37831 = register(
      "netherite_shovel", new ShovelItem(ItemTier.NETHERITE, 1.5F, -3.0F, new Item.Properties().group(ItemGroup.TOOLS).isImmunteToFire())
   );
   public static final Item field37832 = register(
      "netherite_pickaxe", new PickaxeItem(ItemTier.NETHERITE, 1, -2.8F, new Item.Properties().group(ItemGroup.TOOLS).isImmunteToFire())
   );
   public static final Item field37833 = register(
      "netherite_axe", new AxeItem(ItemTier.NETHERITE, 5.0F, -3.0F, new Item.Properties().group(ItemGroup.TOOLS).isImmunteToFire())
   );
   public static final Item field37834 = register(
      "netherite_hoe", new HoeItem(ItemTier.NETHERITE, -4, 0.0F, new Item.Properties().group(ItemGroup.TOOLS).isImmunteToFire())
   );
   public static final Item field37835 = register("stick", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37836 = register("bowl", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37837 = register(
      "mushroom_stew", new Class3306(new Item.Properties().method17775(1).group(ItemGroup.FOOD).method17774(Foods.field39082))
   );
   public static final Item field37838 = register("string", new Class3296(Blocks.TRIPWIRE, new Item.Properties().group(ItemGroup.MISC)));
   public static final Item field37839 = register("feather", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37840 = register("gunpowder", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37841 = register("wheat_seeds", new Class3296(Blocks.WHEAT, new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37842 = register("wheat", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37843 = register(
      "bread", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39063))
   );
   public static final Item field37844 = register(
      "leather_helmet", new Class3278(Class2114.field13773, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item field37845 = register(
      "leather_chestplate", new Class3278(Class2114.field13773, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item field37846 = register(
      "leather_leggings", new Class3278(Class2114.field13773, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item field37847 = register(
      "leather_boots", new Class3278(Class2114.field13773, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item field37848 = register(
      "chainmail_helmet", new ArmorItem(Class2114.field13774, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item field37849 = register(
      "chainmail_chestplate", new ArmorItem(Class2114.field13774, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item field37850 = register(
      "chainmail_leggings", new ArmorItem(Class2114.field13774, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item field37851 = register(
      "chainmail_boots", new ArmorItem(Class2114.field13774, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item field37852 = register(
      "iron_helmet", new ArmorItem(Class2114.field13775, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item field37853 = register(
      "iron_chestplate", new ArmorItem(Class2114.field13775, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item field37854 = register(
      "iron_leggings", new ArmorItem(Class2114.field13775, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item field37855 = register(
      "iron_boots", new ArmorItem(Class2114.field13775, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item field37856 = register(
      "diamond_helmet", new ArmorItem(Class2114.field13777, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item field37857 = register(
      "diamond_chestplate", new ArmorItem(Class2114.field13777, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item field37858 = register(
      "diamond_leggings", new ArmorItem(Class2114.field13777, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item field37859 = register(
      "diamond_boots", new ArmorItem(Class2114.field13777, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item field37860 = register(
      "golden_helmet", new ArmorItem(Class2114.field13776, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item field37861 = register(
      "golden_chestplate", new ArmorItem(Class2114.field13776, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item GOLDEN_LEGGINGS = register(
      "golden_leggings", new ArmorItem(Class2114.field13776, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item field37863 = register(
      "golden_boots", new ArmorItem(Class2114.field13776, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT))
   );
   public static final Item field37864 = register(
      "netherite_helmet", new ArmorItem(Class2114.field13779, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).isImmunteToFire())
   );
   public static final Item NETHERITE_CHESTPLATE = register(
      "netherite_chestplate", new ArmorItem(Class2114.field13779, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).isImmunteToFire())
   );
   public static final Item field37866 = register(
      "netherite_leggings", new ArmorItem(Class2114.field13779, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).isImmunteToFire())
   );
   public static final Item field37867 = register(
      "netherite_boots", new ArmorItem(Class2114.field13779, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).isImmunteToFire())
   );
   public static final Item field37868 = register("flint", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item PORKCHOP = register(
      "porkchop", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39085))
   );
   public static final Item field37870 = register(
      "cooked_porkchop", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39072))
   );
   public static final Item PAINTING = register("painting", new Class3312(EntityType.PAINTING, new Item.Properties().group(ItemGroup.DECORATIONS)));
   public static final Item GOLDEN_APPLE = register(
      "golden_apple", new Item(new Item.Properties().group(ItemGroup.FOOD).rarity(Rarity.RARE).method17774(Foods.GOLDEN_APPLE))
   );
   public static final Item ENCHANTED_GOLDEN_APPLE = register(
      "enchanted_golden_apple",
      new Class3322(new Item.Properties().group(ItemGroup.FOOD).rarity(Rarity.EPIC).method17774(Foods.ENCHANTED_GOLDEN_APPLE))
   );
   public static final Item OAK_SIGN = register(
      "oak_sign", new Class3300(new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS), Blocks.OAK_SIGN, Blocks.OAK_WALL_SIGN)
   );
   public static final Item SPRUCE_SIGN = register(
      "spruce_sign", new Class3300(new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS), Blocks.SPRUCE_SIGN, Blocks.SPRUCE_WALL_SIGN)
   );
   public static final Item field37876 = register(
      "birch_sign", new Class3300(new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS), Blocks.BIRCH_SIGN, Blocks.BIRCH_WALL_SIGN)
   );
   public static final Item field37877 = register(
      "jungle_sign", new Class3300(new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS), Blocks.JUNGLE_SIGN, Blocks.JUNGLE_WALL_SIGN)
   );
   public static final Item field37878 = register(
      "acacia_sign", new Class3300(new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS), Blocks.ACACIA_SIGN, Blocks.ACACIA_WALL_SIGN)
   );
   public static final Item field37879 = register(
      "dark_oak_sign", new Class3300(new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS), Blocks.DARK_OAK_SIGN, Blocks.DARK_OAK_WALL_SIGN)
   );
   public static final Item field37880 = register(
      "crimson_sign", new Class3300(new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS), Blocks.CRIMSON_SIGN, Blocks.CRIMSON_WALL_SIGN)
   );
   public static final Item field37881 = register(
      "warped_sign", new Class3300(new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS), Blocks.WARPED_SIGN, Blocks.WARPED_WALL_SIGN)
   );
   public static final Item BUCKET = register(
      "bucket", new BucketItem(Fluids.EMPTY, new Item.Properties().method17775(16).group(ItemGroup.MISC))
   );
   public static final Item WATER_BUCKET = register(
      "water_bucket", new BucketItem(Fluids.WATER, new Item.Properties().method17778(BUCKET).method17775(1).group(ItemGroup.MISC))
   );
   public static final Item LAVA_BUCKET = register(
      "lava_bucket", new BucketItem(Fluids.LAVA, new Item.Properties().method17778(BUCKET).method17775(1).group(ItemGroup.MISC))
   );
   public static final Item MINECART = register(
      "minecart", new Class3282(MinecartType.MINECART, new Item.Properties().method17775(1).group(ItemGroup.TRANSPORTATION))
   );
   public static final Item field37886 = register("saddle", new Class3330(new Item.Properties().method17775(1).group(ItemGroup.TRANSPORTATION)));
   public static final Item REDSTONE_DUST = register("redstone", new Class3296(Blocks.REDSTONE_WIRE, new Item.Properties().group(ItemGroup.REDSTONE)));
   public static final Item SNOWBALL = register("snowball", new SnowballItem(new Item.Properties().method17775(16).group(ItemGroup.MISC)));
   public static final Item OAK_BOAT = register(
      "oak_boat", new Class3305(Class2099.field13680, new Item.Properties().method17775(1).group(ItemGroup.TRANSPORTATION))
   );
   public static final Item LEATHER = register("leather", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item MILK_BUCKET = register(
      "milk_bucket", new Class3274(new Item.Properties().method17778(BUCKET).method17775(1).group(ItemGroup.MISC))
   );
   public static final Item field37892 = register(
      "pufferfish_bucket", new Class3288(EntityType.PUFFERFISH, Fluids.WATER, new Item.Properties().method17775(1).group(ItemGroup.MISC))
   );
   public static final Item SALMON_BUCKET = register(
      "salmon_bucket", new Class3288(EntityType.SALMON, Fluids.WATER, new Item.Properties().method17775(1).group(ItemGroup.MISC))
   );
   public static final Item field37894 = register(
      "cod_bucket", new Class3288(EntityType.COD, Fluids.WATER, new Item.Properties().method17775(1).group(ItemGroup.MISC))
   );
   public static final Item field37895 = register(
      "tropical_fish_bucket", new Class3288(EntityType.TROPICAL_FISH, Fluids.WATER, new Item.Properties().method17775(1).group(ItemGroup.MISC))
   );
   public static final Item field37896 = register("brick", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37897 = register("clay_ball", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37898 = register(Blocks.DRIED_KELP_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37899 = register("paper", new Item(new Item.Properties().group(ItemGroup.MISC)));
   public static final Item field37900 = register("book", new Class3337(new Item.Properties().group(ItemGroup.MISC)));
   public static final Item field37901 = register("slime_ball", new Item(new Item.Properties().group(ItemGroup.MISC)));
   public static final Item CHEST_MINECART = register(
      "chest_minecart", new Class3282(MinecartType.CHEST, new Item.Properties().method17775(1).group(ItemGroup.TRANSPORTATION))
   );
   public static final Item FURNACE_MINECART = register(
      "furnace_minecart", new Class3282(MinecartType.FURNACE, new Item.Properties().method17775(1).group(ItemGroup.TRANSPORTATION))
   );
   public static final Item EGG = register("egg", new EggItem(new Item.Properties().method17775(16).group(ItemGroup.MATERIALS)));
   public static final Item COMPASS = register("compass", new CompassItem(new Item.Properties().group(ItemGroup.TOOLS)));
   public static final Item field37906 = register("fishing_rod", new Class3259(new Item.Properties().method17777(64).group(ItemGroup.TOOLS)));
   public static final Item field37907 = register("clock", new Item(new Item.Properties().group(ItemGroup.TOOLS)));
   public static final Item field37908 = register("glowstone_dust", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37909 = register(
      "cod", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39067))
   );
   public static final Item field37910 = register(
      "salmon", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39092))
   );
   public static final Item field37911 = register(
      "tropical_fish", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39096))
   );
   public static final Item field37912 = register(
      "pufferfish", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39087))
   );
   public static final Item field37913 = register(
      "cooked_cod", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39070))
   );
   public static final Item field37914 = register(
      "cooked_salmon", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39074))
   );
   public static final Item field37915 = register("ink_sac", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37916 = register("cocoa_beans", new Class3296(Blocks.COCOA, new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37917 = register("lapis_lazuli", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37918 = register("white_dye", new Class3321(DyeColor.field386, new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37919 = register("orange_dye", new Class3321(DyeColor.field387, new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37920 = register("magenta_dye", new Class3321(DyeColor.field388, new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37921 = register("light_blue_dye", new Class3321(DyeColor.field389, new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37922 = register("yellow_dye", new Class3321(DyeColor.field390, new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37923 = register("lime_dye", new Class3321(DyeColor.field391, new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37924 = register("pink_dye", new Class3321(DyeColor.field392, new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37925 = register("gray_dye", new Class3321(DyeColor.field393, new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37926 = register("light_gray_dye", new Class3321(DyeColor.field394, new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37927 = register("cyan_dye", new Class3321(DyeColor.field395, new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37928 = register("purple_dye", new Class3321(DyeColor.field396, new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37929 = register("blue_dye", new Class3321(DyeColor.field397, new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37930 = register("brown_dye", new Class3321(DyeColor.field398, new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37931 = register("green_dye", new Class3321(DyeColor.field399, new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37932 = register("red_dye", new Class3321(DyeColor.field400, new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37933 = register("black_dye", new Class3321(DyeColor.field401, new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37934 = register("bone_meal", new Class3336(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37935 = register("bone", new Item(new Item.Properties().group(ItemGroup.MISC)));
   public static final Item field37936 = register("sugar", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37937 = register(new BlockItem(Blocks.CAKE, new Item.Properties().method17775(1).group(ItemGroup.FOOD)));
   public static final Item field37938 = register(new Class3297(Blocks.WHITE_BED, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37939 = register(new Class3297(Blocks.ORANGE_BED, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37940 = register(new Class3297(Blocks.MAGENTA_BED, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37941 = register(new Class3297(Blocks.LIGHT_BLUE_BED, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37942 = register(new Class3297(Blocks.YELLOW_BED, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37943 = register(new Class3297(Blocks.LIME_BED, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37944 = register(new Class3297(Blocks.PINK_BED, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37945 = register(new Class3297(Blocks.GRAY_BED, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37946 = register(new Class3297(Blocks.LIGHT_GRAY_BED, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37947 = register(new Class3297(Blocks.CYAN_BED, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37948 = register(new Class3297(Blocks.PURPLE_BED, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37949 = register(new Class3297(Blocks.BLUE_BED, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37950 = register(new Class3297(Blocks.BROWN_RED, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37951 = register(new Class3297(Blocks.GREEN_BED, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37952 = register(new Class3297(Blocks.RED_BED, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37953 = register(new Class3297(Blocks.BLACK_BED, new Item.Properties().method17775(1).group(ItemGroup.DECORATIONS)));
   public static final Item field37954 = register(
      "cookie", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39075))
   );
   public static final Item field37955 = register("filled_map", new Class3316(new Item.Properties()));
   public static final Item field37956 = register("shears", new Class3331(new Item.Properties().method17777(238).group(ItemGroup.TOOLS)));
   public static final Item field37957 = register(
      "melon_slice", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39081))
   );
   public static final Item field37958 = register(
      "dried_kelp", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39076))
   );
   public static final Item field37959 = register(
      "pumpkin_seeds", new Class3296(Blocks.PUMPKIN_STEM, new Item.Properties().group(ItemGroup.MATERIALS))
   );
   public static final Item field37960 = register("melon_seeds", new Class3296(Blocks.MELON_STEM, new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37961 = register(
      "beef", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39060))
   );
   public static final Item field37962 = register(
      "cooked_beef", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39068))
   );
   public static final Item field37963 = register(
      "chicken", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39065))
   );
   public static final Item field37964 = register(
      "cooked_chicken", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39069))
   );
   public static final Item field37965 = register(
      "rotten_flesh", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39091))
   );
   public static final Item ENDER_PEARL = register("ender_pearl", new EnderPearlItem(new Item.Properties().method17775(16).group(ItemGroup.MISC)));
   public static final Item field37967 = register("blaze_rod", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37968 = register("ghast_tear", new Item(new Item.Properties().group(ItemGroup.BREWING)));
   public static final Item field37969 = register("gold_nugget", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37970 = register("nether_wart", new Class3296(Blocks.NETHER_WART, new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field37971 = register("potion", new PotionItem(new Item.Properties().method17775(1).group(ItemGroup.BREWING)));
   public static final Item field37972 = register("glass_bottle", new Class3328(new Item.Properties().group(ItemGroup.BREWING)));
   public static final Item field37973 = register(
      "spider_eye", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39093))
   );
   public static final Item field37974 = register("fermented_spider_eye", new Item(new Item.Properties().group(ItemGroup.BREWING)));
   public static final Item field37975 = register("blaze_powder", new Item(new Item.Properties().group(ItemGroup.BREWING)));
   public static final Item field37976 = register("magma_cream", new Item(new Item.Properties().group(ItemGroup.BREWING)));
   public static final Item field37977 = register(Blocks.BREWING_STAND, ItemGroup.BREWING);
   public static final Item field37978 = register(Blocks.CAULDRON, ItemGroup.BREWING);
   public static final Item field37979 = register("ender_eye", new Class3341(new Item.Properties().group(ItemGroup.MISC)));
   public static final Item field37980 = register("glistering_melon_slice", new Item(new Item.Properties().group(ItemGroup.BREWING)));
   public static final Item field37981 = register(
      "bat_spawn_egg", new SpawnEggItem(EntityType.BAT, 4996656, 986895, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field37982 = register(
      "bee_spawn_egg", new SpawnEggItem(EntityType.BEE, 15582019, 4400155, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field37983 = register(
      "blaze_spawn_egg", new SpawnEggItem(EntityType.BLAZE, 16167425, 16775294, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field37984 = register(
      "cat_spawn_egg", new SpawnEggItem(EntityType.CAT, 15714446, 9794134, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field37985 = register(
      "cave_spider_spawn_egg", new SpawnEggItem(EntityType.CAVE_SPIDER, 803406, 11013646, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field37986 = register(
      "chicken_spawn_egg", new SpawnEggItem(EntityType.CHICKEN, 10592673, 16711680, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field37987 = register(
      "cod_spawn_egg", new SpawnEggItem(EntityType.COD, 12691306, 15058059, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field37988 = register(
      "cow_spawn_egg", new SpawnEggItem(EntityType.COW, 4470310, 10592673, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field37989 = register(
      "creeper_spawn_egg", new SpawnEggItem(EntityType.CREEPER, 894731, 0, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field37990 = register(
      "dolphin_spawn_egg", new SpawnEggItem(EntityType.DOLPHIN, 2243405, 16382457, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field37991 = register(
      "donkey_spawn_egg", new SpawnEggItem(EntityType.DONKEY, 5457209, 8811878, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field37992 = register(
      "drowned_spawn_egg", new SpawnEggItem(EntityType.DROWNED, 9433559, 7969893, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field37993 = register(
      "elder_guardian_spawn_egg", new SpawnEggItem(EntityType.ELDER_GUARDIAN, 13552826, 7632531, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field37994 = register(
      "enderman_spawn_egg", new SpawnEggItem(EntityType.ENDERMAN, 1447446, 0, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field37995 = register(
      "endermite_spawn_egg", new SpawnEggItem(EntityType.ENDERMITE, 1447446, 7237230, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field37996 = register(
      "evoker_spawn_egg", new SpawnEggItem(EntityType.EVOKER, 9804699, 1973274, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field37997 = register(
      "fox_spawn_egg", new SpawnEggItem(EntityType.FOX, 14005919, 13396256, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field37998 = register(
      "ghast_spawn_egg", new SpawnEggItem(EntityType.GHAST, 16382457, 12369084, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field37999 = register(
      "guardian_spawn_egg", new SpawnEggItem(EntityType.GUARDIAN, 5931634, 15826224, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38000 = register(
      "hoglin_spawn_egg", new SpawnEggItem(EntityType.HOGLIN, 13004373, 6251620, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38001 = register(
      "horse_spawn_egg", new SpawnEggItem(EntityType.HORSE, 12623485, 15656192, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38002 = register(
      "husk_spawn_egg", new SpawnEggItem(EntityType.HUSK, 7958625, 15125652, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38003 = register(
      "llama_spawn_egg", new SpawnEggItem(EntityType.LLAMA, 12623485, 10051392, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38004 = register(
      "magma_cube_spawn_egg", new SpawnEggItem(EntityType.MAGMA_CUBE, 3407872, 16579584, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38005 = register(
      "mooshroom_spawn_egg", new SpawnEggItem(EntityType.MOOSHROOM, 10489616, 12040119, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38006 = register(
      "mule_spawn_egg", new SpawnEggItem(EntityType.MULE, 1769984, 5321501, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38007 = register(
      "ocelot_spawn_egg", new SpawnEggItem(EntityType.OCELOT, 15720061, 5653556, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38008 = register(
      "panda_spawn_egg", new SpawnEggItem(EntityType.PANDA, 15198183, 1776418, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38009 = register(
      "parrot_spawn_egg", new SpawnEggItem(EntityType.PARROT, 894731, 16711680, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38010 = register(
      "phantom_spawn_egg", new SpawnEggItem(EntityType.PHANTOM, 4411786, 8978176, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38011 = register(
      "pig_spawn_egg", new SpawnEggItem(EntityType.PIG, 15771042, 14377823, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38012 = register(
      "piglin_spawn_egg", new SpawnEggItem(EntityType.PIGLIN, 10051392, 16380836, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38013 = register(
      "piglin_brute_spawn_egg", new SpawnEggItem(EntityType.PIGLIN_BRUTE, 5843472, 16380836, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38014 = register(
      "pillager_spawn_egg", new SpawnEggItem(EntityType.PILLAGER, 5451574, 9804699, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38015 = register(
      "polar_bear_spawn_egg", new SpawnEggItem(EntityType.POLAR_BEAR, 15921906, 9803152, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38016 = register(
      "pufferfish_spawn_egg", new SpawnEggItem(EntityType.PUFFERFISH, 16167425, 3654642, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38017 = register(
      "rabbit_spawn_egg", new SpawnEggItem(EntityType.RABBIT, 10051392, 7555121, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38018 = register(
      "ravager_spawn_egg", new SpawnEggItem(EntityType.RAVAGER, 7697520, 5984329, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38019 = register(
      "salmon_spawn_egg", new SpawnEggItem(EntityType.SALMON, 10489616, 951412, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38020 = register(
      "sheep_spawn_egg", new SpawnEggItem(EntityType.SHEEP, 15198183, 16758197, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38021 = register(
      "shulker_spawn_egg", new SpawnEggItem(EntityType.SHULKER, 9725844, 5060690, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38022 = register(
      "silverfish_spawn_egg", new SpawnEggItem(EntityType.SILVERFISH, 7237230, 3158064, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38023 = register(
      "skeleton_spawn_egg", new SpawnEggItem(EntityType.SKELETON, 12698049, 4802889, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38024 = register(
      "skeleton_horse_spawn_egg", new SpawnEggItem(EntityType.SKELETON_HORSE, 6842447, 15066584, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38025 = register(
      "slime_spawn_egg", new SpawnEggItem(EntityType.SLIME, 5349438, 8306542, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38026 = register(
      "spider_spawn_egg", new SpawnEggItem(EntityType.SPIDER, 3419431, 11013646, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38027 = register(
      "squid_spawn_egg", new SpawnEggItem(EntityType.SQUID, 2243405, 7375001, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38028 = register(
      "stray_spawn_egg", new SpawnEggItem(EntityType.STRAY, 6387319, 14543594, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38029 = register(
      "strider_spawn_egg", new SpawnEggItem(EntityType.STRIDER, 10236982, 5065037, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38030 = register(
      "trader_llama_spawn_egg", new SpawnEggItem(EntityType.TRADER_LLAMA, 15377456, 4547222, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38031 = register(
      "tropical_fish_spawn_egg", new SpawnEggItem(EntityType.TROPICAL_FISH, 15690005, 16775663, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38032 = register(
      "turtle_spawn_egg", new SpawnEggItem(EntityType.TURTLE, 15198183, 44975, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38033 = register(
      "vex_spawn_egg", new SpawnEggItem(EntityType.VEX, 8032420, 15265265, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38034 = register(
      "villager_spawn_egg", new SpawnEggItem(EntityType.VILLAGER, 5651507, 12422002, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38035 = register(
      "vindicator_spawn_egg", new SpawnEggItem(EntityType.VINDICATOR, 9804699, 2580065, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38036 = register(
      "wandering_trader_spawn_egg", new SpawnEggItem(EntityType.WANDERING_TRADER, 4547222, 15377456, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38037 = register(
      "witch_spawn_egg", new SpawnEggItem(EntityType.WITCH, 3407872, 5349438, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38038 = register(
      "wither_skeleton_spawn_egg", new SpawnEggItem(EntityType.WITHER_SKELETON, 1315860, 4672845, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38039 = register(
      "wolf_spawn_egg", new SpawnEggItem(EntityType.WOLF, 14144467, 13545366, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38040 = register(
      "zoglin_spawn_egg", new SpawnEggItem(EntityType.ZOGLIN, 13004373, 15132390, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38041 = register(
      "zombie_spawn_egg", new SpawnEggItem(EntityType.ZOMBIE, 44975, 7969893, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38042 = register(
      "zombie_horse_spawn_egg", new SpawnEggItem(EntityType.ZOMBIE_HORSE, 3232308, 9945732, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38043 = register(
      "zombie_villager_spawn_egg", new SpawnEggItem(EntityType.ZOMBIE_VILLAGER, 5651507, 7969893, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item field38044 = register(
      "zombified_piglin_spawn_egg", new SpawnEggItem(EntityType.ZOMBIFIED_PIGLIN, 15373203, 5009705, new Item.Properties().group(ItemGroup.MISC))
   );
   public static final Item EXPERIENCE_BOTTLE = register(
      "experience_bottle", new Class3304(new Item.Properties().group(ItemGroup.MISC).rarity(Rarity.UNCOMMON))
   );
   public static final Item field38046 = register("fire_charge", new Class3273(new Item.Properties().group(ItemGroup.MISC)));
   public static final Item field38047 = register("writable_book", new Class3291(new Item.Properties().method17775(1).group(ItemGroup.MISC)));
   public static final Item field38048 = register("written_book", new Class3285(new Item.Properties().method17775(16)));
   public static final Item EMERALD = register("emerald", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item ITEM_FRAME = register("item_frame", new Class3313(new Item.Properties().group(ItemGroup.DECORATIONS)));
   public static final Item field38051 = register(Blocks.FLOWER_POT, ItemGroup.DECORATIONS);
   public static final Item field38052 = register(
      "carrot", new Class3296(Blocks.CARROTS, new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39064))
   );
   public static final Item field38053 = register(
      "potato", new Class3296(Blocks.POTATOES, new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39086))
   );
   public static final Item field38054 = register(
      "baked_potato", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39059))
   );
   public static final Item field38055 = register(
      "poisonous_potato", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39084))
   );
   public static final Item field38056 = register("map", new Class3315(new Item.Properties().group(ItemGroup.MISC)));
   public static final Item field38057 = register(
      "golden_carrot", new Item(new Item.Properties().group(ItemGroup.BREWING).method17774(Foods.field39079))
   );
   public static final Item field38058 = register(
      new WallOrFloorItem(Blocks.SKELETON_SKULL, Blocks.SKELETON_WALL_SKULL, new Item.Properties().group(ItemGroup.DECORATIONS).rarity(Rarity.UNCOMMON))
   );
   public static final Item field38059 = register(
      new WallOrFloorItem(Blocks.WITHER_SKELETON_SKULL, Blocks.WITHER_SKELETON_WALL_SKULL, new Item.Properties().group(ItemGroup.DECORATIONS).rarity(Rarity.UNCOMMON))
   );
   public static final Item field38060 = register(
      new SkullItem(Blocks.PLAYER_HEAD, Blocks.PLAYER_WALL_HEAD, new Item.Properties().group(ItemGroup.DECORATIONS).rarity(Rarity.UNCOMMON))
   );
   public static final Item field38061 = register(
      new WallOrFloorItem(Blocks.ZOMBIE_HEAD, Blocks.ZOMBIE_WALL_HEAD, new Item.Properties().group(ItemGroup.DECORATIONS).rarity(Rarity.UNCOMMON))
   );
   public static final Item field38062 = register(
      new WallOrFloorItem(Blocks.CREEPER_HEAD, Blocks.CREEPER_WALL_HEAD, new Item.Properties().group(ItemGroup.DECORATIONS).rarity(Rarity.UNCOMMON))
   );
   public static final Item field38063 = register(
      new WallOrFloorItem(Blocks.HEAD, Blocks.DRAGON_WALL_HEAD, new Item.Properties().group(ItemGroup.DECORATIONS).rarity(Rarity.UNCOMMON))
   );
   public static final Item field38064 = register(
      "carrot_on_a_stick", new Class3317<PigEntity>(new Item.Properties().method17777(25).group(ItemGroup.TRANSPORTATION), EntityType.PIG, 7)
   );
   public static final Item field38065 = register(
      "warped_fungus_on_a_stick", new Class3317<StriderEntity>(new Item.Properties().method17777(100).group(ItemGroup.TRANSPORTATION), EntityType.STRIDER, 1)
   );
   public static final Item field38066 = register(
      "nether_star", new Class3332(new Item.Properties().group(ItemGroup.MATERIALS).rarity(Rarity.UNCOMMON))
   );
   public static final Item field38067 = register(
      "pumpkin_pie", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39088))
   );
   public static final Item field38068 = register("firework_rocket", new Class3318(new Item.Properties().group(ItemGroup.MISC)));
   public static final Item field38069 = register("firework_star", new Class3320(new Item.Properties().group(ItemGroup.MISC)));
   public static final Item field38070 = register("enchanted_book", new Class3290(new Item.Properties().method17775(1).rarity(Rarity.UNCOMMON)));
   public static final Item field38071 = register("nether_brick", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field38072 = register("quartz", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item TNT_MINECART = register(
      "tnt_minecart", new Class3282(MinecartType.TNT, new Item.Properties().method17775(1).group(ItemGroup.TRANSPORTATION))
   );
   public static final Item HOPPER_MINECART = register(
      "hopper_minecart", new Class3282(MinecartType.HOPPER, new Item.Properties().method17775(1).group(ItemGroup.TRANSPORTATION))
   );
   public static final Item field38075 = register("prismarine_shard", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field38076 = register("prismarine_crystals", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field38077 = register(
      "rabbit", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39089))
   );
   public static final Item field38078 = register(
      "cooked_rabbit", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39073))
   );
   public static final Item field38079 = register(
      "rabbit_stew", new Class3306(new Item.Properties().method17775(1).group(ItemGroup.FOOD).method17774(Foods.field39090))
   );
   public static final Item field38080 = register("rabbit_foot", new Item(new Item.Properties().group(ItemGroup.BREWING)));
   public static final Item field38081 = register("rabbit_hide", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item ARMOR_STAND = register("armor_stand", new Class3289(new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS)));
   public static final Item field38083 = register(
      "iron_horse_armor", new Class3275(5, "iron", new Item.Properties().method17775(1).group(ItemGroup.MISC))
   );
   public static final Item field38084 = register(
      "golden_horse_armor", new Class3275(7, "gold", new Item.Properties().method17775(1).group(ItemGroup.MISC))
   );
   public static final Item field38085 = register(
      "diamond_horse_armor", new Class3275(11, "diamond", new Item.Properties().method17775(1).group(ItemGroup.MISC))
   );
   public static final Item field38086 = register(
      "leather_horse_armor", new Class3276(3, "leather", new Item.Properties().method17775(1).group(ItemGroup.MISC))
   );
   public static final Item LEAD = register("lead", new Class3329(new Item.Properties().group(ItemGroup.TOOLS)));
   public static final Item field38088 = register("name_tag", new Class3327(new Item.Properties().group(ItemGroup.TOOLS)));
   public static final Item COMMAND_BLOCK_MINECART = register("command_block_minecart", new Class3282(MinecartType.COMMAND_BLOCK, new Item.Properties().method17775(1)));
   public static final Item field38090 = register(
      "mutton", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39083))
   );
   public static final Item field38091 = register(
      "cooked_mutton", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39071))
   );
   public static final Item field38092 = register(
      "white_banner", new Class3301(Blocks.WHITE_BANNER, Blocks.WHITE_WALL_BANNER, new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS))
   );
   public static final Item field38093 = register(
      "orange_banner", new Class3301(Blocks.ORANGE_BANNER, Blocks.ORANGE_WALL_BANNER, new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS))
   );
   public static final Item field38094 = register(
      "magenta_banner", new Class3301(Blocks.MAGENTA_BANNER, Blocks.MAGENTA_WALL_BANNER, new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS))
   );
   public static final Item field38095 = register(
      "light_blue_banner", new Class3301(Blocks.LIGHT_BLUE_BANNER, Blocks.LIGHT_BLUE_WALL_BANNER, new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS))
   );
   public static final Item field38096 = register(
      "yellow_banner", new Class3301(Blocks.YELLOW_BANNER, Blocks.YELLOW_WALL_BANNER, new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS))
   );
   public static final Item field38097 = register(
      "lime_banner", new Class3301(Blocks.LIME_BANNER, Blocks.LIME_WALL_BANNER, new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS))
   );
   public static final Item field38098 = register(
      "pink_banner", new Class3301(Blocks.PINK_BANNER, Blocks.PINK_WALL_BANNER, new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS))
   );
   public static final Item field38099 = register(
      "gray_banner", new Class3301(Blocks.GRAY_BANNER, Blocks.GRAY_WALL_BANNER, new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS))
   );
   public static final Item field38100 = register(
      "light_gray_banner", new Class3301(Blocks.LIGHT_GRAY_BANNER, Blocks.LIGHT_GRAY_WALL_BANNER, new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS))
   );
   public static final Item field38101 = register(
      "cyan_banner", new Class3301(Blocks.CYAN_BANNER, Blocks.CYAN_WALL_BANNER, new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS))
   );
   public static final Item field38102 = register(
      "purple_banner", new Class3301(Blocks.PURPLE_BANNER, Blocks.PURPLE_WALL_BANNER, new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS))
   );
   public static final Item field38103 = register(
      "blue_banner", new Class3301(Blocks.BLUE_BANNER, Blocks.BLUE_WALL_BANNER, new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS))
   );
   public static final Item field38104 = register(
      "brown_banner", new Class3301(Blocks.BROWN_BANNER, Blocks.BROWN_WALL_BANNER, new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS))
   );
   public static final Item field38105 = register(
      "green_banner", new Class3301(Blocks.GREEN_BANNER, Blocks.GREEN_WALL_BANNER, new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS))
   );
   public static final Item field38106 = register(
      "red_banner", new Class3301(Blocks.RED_BANNER, Blocks.RED_WALL_BANNER, new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS))
   );
   public static final Item field38107 = register(
      "black_banner", new Class3301(Blocks.BLACK_BANNER, Blocks.BLACK_WALL_BANNER, new Item.Properties().method17775(16).group(ItemGroup.DECORATIONS))
   );
   public static final Item END_CRYSTAL = register(
      "end_crystal", new Class3340(new Item.Properties().group(ItemGroup.DECORATIONS).rarity(Rarity.RARE))
   );
   public static final Item field38109 = register(
      "chorus_fruit", new Class3338(new Item.Properties().group(ItemGroup.MATERIALS).method17774(Foods.field39066))
   );
   public static final Item field38110 = register("popped_chorus_fruit", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field38111 = register(
      "beetroot", new Item(new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39061))
   );
   public static final Item field38112 = register(
      "beetroot_seeds", new Class3296(Blocks.BEETROOTS, new Item.Properties().group(ItemGroup.MATERIALS))
   );
   public static final Item field38113 = register(
      "beetroot_soup", new Class3306(new Item.Properties().method17775(1).group(ItemGroup.FOOD).method17774(Foods.field39062))
   );
   public static final Item field38114 = register(
      "dragon_breath", new Item(new Item.Properties().method17778(field37972).group(ItemGroup.BREWING).rarity(Rarity.UNCOMMON))
   );
   public static final Item SPLASH_POTION = register("splash_potion", new Class3326(new Item.Properties().method17775(1).group(ItemGroup.BREWING)));
   public static final Item field38116 = register("spectral_arrow", new Class3310(new Item.Properties().group(ItemGroup.COMBAT)));
   public static final Item field38117 = register("tipped_arrow", new Class3309(new Item.Properties().group(ItemGroup.COMBAT)));
   public static final Item field38118 = register("lingering_potion", new Class3325(new Item.Properties().method17775(1).group(ItemGroup.BREWING)));
   public static final Item field38119 = register("shield", new ShieldItem(new Item.Properties().method17777(336).group(ItemGroup.COMBAT)));
   public static final Item ELYTRA = register(
      "elytra", new Class3256(new Item.Properties().method17777(432).group(ItemGroup.TRANSPORTATION).rarity(Rarity.UNCOMMON))
   );
   public static final Item field38121 = register(
      "spruce_boat", new Class3305(Class2099.field13681, new Item.Properties().method17775(1).group(ItemGroup.TRANSPORTATION))
   );
   public static final Item field38122 = register(
      "birch_boat", new Class3305(Class2099.field13682, new Item.Properties().method17775(1).group(ItemGroup.TRANSPORTATION))
   );
   public static final Item field38123 = register(
      "jungle_boat", new Class3305(Class2099.field13683, new Item.Properties().method17775(1).group(ItemGroup.TRANSPORTATION))
   );
   public static final Item field38124 = register(
      "acacia_boat", new Class3305(Class2099.field13684, new Item.Properties().method17775(1).group(ItemGroup.TRANSPORTATION))
   );
   public static final Item field38125 = register(
      "dark_oak_boat", new Class3305(Class2099.field13685, new Item.Properties().method17775(1).group(ItemGroup.TRANSPORTATION))
   );
   public static final Item TOTEM_OF_UNDYING = register(
      "totem_of_undying", new Item(new Item.Properties().method17775(1).group(ItemGroup.COMBAT).rarity(Rarity.UNCOMMON))
   );
   public static final Item field38127 = register("shulker_shell", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field38128 = register("iron_nugget", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field38129 = register("knowledge_book", new Class3258(new Item.Properties().method17775(1)));
   public static final Item field38130 = register("debug_stick", new Class3339(new Item.Properties().method17775(1)));
   public static final Item field38131 = register(
      "music_disc_13",
      new Class3283(1, SoundEvents.field26779, new Item.Properties().method17775(1).group(ItemGroup.MISC).rarity(Rarity.RARE))
   );
   public static final Item field38132 = register(
      "music_disc_cat",
      new Class3283(2, SoundEvents.field26781, new Item.Properties().method17775(1).group(ItemGroup.MISC).rarity(Rarity.RARE))
   );
   public static final Item field38133 = register(
      "music_disc_blocks",
      new Class3283(3, SoundEvents.field26780, new Item.Properties().method17775(1).group(ItemGroup.MISC).rarity(Rarity.RARE))
   );
   public static final Item field38134 = register(
      "music_disc_chirp",
      new Class3283(4, SoundEvents.field26782, new Item.Properties().method17775(1).group(ItemGroup.MISC).rarity(Rarity.RARE))
   );
   public static final Item field38135 = register(
      "music_disc_far",
      new Class3283(5, SoundEvents.field26783, new Item.Properties().method17775(1).group(ItemGroup.MISC).rarity(Rarity.RARE))
   );
   public static final Item field38136 = register(
      "music_disc_mall",
      new Class3283(6, SoundEvents.field26784, new Item.Properties().method17775(1).group(ItemGroup.MISC).rarity(Rarity.RARE))
   );
   public static final Item field38137 = register(
      "music_disc_mellohi",
      new Class3283(7, SoundEvents.field26785, new Item.Properties().method17775(1).group(ItemGroup.MISC).rarity(Rarity.RARE))
   );
   public static final Item field38138 = register(
      "music_disc_stal",
      new Class3283(8, SoundEvents.field26787, new Item.Properties().method17775(1).group(ItemGroup.MISC).rarity(Rarity.RARE))
   );
   public static final Item field38139 = register(
      "music_disc_strad",
      new Class3283(9, SoundEvents.field26788, new Item.Properties().method17775(1).group(ItemGroup.MISC).rarity(Rarity.RARE))
   );
   public static final Item field38140 = register(
      "music_disc_ward",
      new Class3283(10, SoundEvents.field26790, new Item.Properties().method17775(1).group(ItemGroup.MISC).rarity(Rarity.RARE))
   );
   public static final Item field38141 = register(
      "music_disc_11",
      new Class3283(11, SoundEvents.field26778, new Item.Properties().method17775(1).group(ItemGroup.MISC).rarity(Rarity.RARE))
   );
   public static final Item field38142 = register(
      "music_disc_wait",
      new Class3283(12, SoundEvents.field26789, new Item.Properties().method17775(1).group(ItemGroup.MISC).rarity(Rarity.RARE))
   );
   public static final Item field38143 = register(
      "music_disc_pigstep",
      new Class3283(13, SoundEvents.field26786, new Item.Properties().method17775(1).group(ItemGroup.MISC).rarity(Rarity.RARE))
   );
   public static final Item TRIDENT = register("trident", new Class3272(new Item.Properties().method17777(250).group(ItemGroup.COMBAT)));
   public static final Item field38145 = register("phantom_membrane", new Item(new Item.Properties().group(ItemGroup.BREWING)));
   public static final Item field38146 = register("nautilus_shell", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field38147 = register(
      "heart_of_the_sea", new Item(new Item.Properties().group(ItemGroup.MATERIALS).rarity(Rarity.UNCOMMON))
   );
   public static final Item CROSSBOW = register(
      "crossbow", new CrossbowItem(new Item.Properties().method17775(1).group(ItemGroup.COMBAT).method17777(326))
   );
   public static final Item field38149 = register("suspicious_stew", new Class3284(new Item.Properties().method17775(1).method17774(Foods.field39094)));
   public static final Item field38150 = register(Blocks.LOOM, ItemGroup.DECORATIONS);
   public static final Item field38151 = register(
      "flower_banner_pattern", new Class3286(Class2154.field14120, new Item.Properties().method17775(1).group(ItemGroup.MISC))
   );
   public static final Item field38152 = register(
      "creeper_banner_pattern",
      new Class3286(Class2154.field14118, new Item.Properties().method17775(1).group(ItemGroup.MISC).rarity(Rarity.UNCOMMON))
   );
   public static final Item field38153 = register(
      "skull_banner_pattern",
      new Class3286(Class2154.field14119, new Item.Properties().method17775(1).group(ItemGroup.MISC).rarity(Rarity.UNCOMMON))
   );
   public static final Item field38154 = register(
      "mojang_banner_pattern",
      new Class3286(Class2154.field14121, new Item.Properties().method17775(1).group(ItemGroup.MISC).rarity(Rarity.EPIC))
   );
   public static final Item field38155 = register(
      "globe_banner_pattern", new Class3286(Class2154.field14117, new Item.Properties().method17775(1).group(ItemGroup.MISC))
   );
   public static final Item field38156 = register(
      "piglin_banner_pattern", new Class3286(Class2154.field14122, new Item.Properties().method17775(1).group(ItemGroup.MISC))
   );
   public static final Item field38157 = register(Blocks.COMPOSTER, ItemGroup.DECORATIONS);
   public static final Item field38158 = register(Blocks.BARREL, ItemGroup.DECORATIONS);
   public static final Item field38159 = register(Blocks.SMOKER, ItemGroup.DECORATIONS);
   public static final Item field38160 = register(Blocks.BLAST_FURNACE, ItemGroup.DECORATIONS);
   public static final Item field38161 = register(Blocks.CARTOGRAPHY_TABLE, ItemGroup.DECORATIONS);
   public static final Item field38162 = register(Blocks.FLETCHING_TABLE, ItemGroup.DECORATIONS);
   public static final Item field38163 = register(Blocks.GRINDSTONE, ItemGroup.DECORATIONS);
   public static final Item field38164 = register(Blocks.LECTERN, ItemGroup.REDSTONE);
   public static final Item field38165 = register(Blocks.SMITHING_TABLE, ItemGroup.DECORATIONS);
   public static final Item field38166 = register(Blocks.STONECUTTER, ItemGroup.DECORATIONS);
   public static final Item field38167 = register(Blocks.BELL, ItemGroup.DECORATIONS);
   public static final Item field38168 = register(Blocks.LANTERN, ItemGroup.DECORATIONS);
   public static final Item field38169 = register(Blocks.SOUL_LANTERN, ItemGroup.DECORATIONS);
   public static final Item field38170 = register(
      "sweet_berries", new Class3296(Blocks.SWEET_BERRY_BUSH, new Item.Properties().group(ItemGroup.FOOD).method17774(Foods.field39095))
   );
   public static final Item field38171 = register(Blocks.CAMPFIRE, ItemGroup.DECORATIONS);
   public static final Item field38172 = register(Blocks.SOUL_CAMPFIRE, ItemGroup.DECORATIONS);
   public static final Item field38173 = register(Blocks.SHROOMLIGHT, ItemGroup.DECORATIONS);
   public static final Item field38174 = register("honeycomb", new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
   public static final Item field38175 = register(Blocks.BEE_NEST, ItemGroup.DECORATIONS);
   public static final Item field38176 = register(Blocks.BEEHIVE, ItemGroup.DECORATIONS);
   public static final Item field38177 = register(
      "honey_bottle",
      new Class3307(new Item.Properties().method17778(field37972).method17774(Foods.field39080).group(ItemGroup.FOOD).method17775(16))
   );
   public static final Item field38178 = register(Blocks.HONEY_BLOCK, ItemGroup.DECORATIONS);
   public static final Item field38179 = register(Blocks.HONEYCOMB_BLOCK, ItemGroup.DECORATIONS);
   public static final Item field38180 = register(Blocks.LODESTONE, ItemGroup.DECORATIONS);
   public static final Item field38181 = register(new BlockItem(Blocks.NETHERITE_BLOCK, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).isImmunteToFire()));
   public static final Item field38182 = register(new BlockItem(Blocks.ANCIENT_DEBRIS, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).isImmunteToFire()));
   public static final Item field38183 = register(Blocks.TARGET, ItemGroup.REDSTONE);
   public static final Item field38184 = register(Blocks.CRYING_OBSIDIAN, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38185 = register(Blocks.BLACKSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38186 = register(Blocks.BLACKSTONE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38187 = register(Blocks.BLACKSTONE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38188 = register(Blocks.GILDED_BLACKSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38189 = register(Blocks.POLISHED_BLACKSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38190 = register(Blocks.POLISHED_BLACKSTONE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38191 = register(Blocks.POLISHED_BLACKSTONE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38192 = register(Blocks.CHISELED_POLISHED_BLACKSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38193 = register(Blocks.POLISHED_BLACKSTONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38194 = register(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38195 = register(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38196 = register(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38197 = register(Blocks.RESPAWN_ANCHOR, ItemGroup.DECORATIONS);

   private static Item register(Block blockIn) {
      return register(new BlockItem(blockIn, new Item.Properties()));
   }

   private static Item register(Block blockIn, ItemGroup itemGroupIn) {
      return register(new BlockItem(blockIn, new Item.Properties().group(itemGroupIn)));
   }

   private static Item register(BlockItem blockItemIn) {
      return register(blockItemIn.method11845(), blockItemIn);
   }

   public static Item register(Block blockIn, Item itemIn) {
      return register(Registry.BLOCK.getKey(blockIn), itemIn);
   }

   private static Item register(String key, Item itemIn) {
      return register(new ResourceLocation(key), itemIn);
   }

   private static Item register(ResourceLocation key, Item itemIn) {
      if (itemIn instanceof BlockItem) {
         ((BlockItem)itemIn).method11846(Item.field18732, itemIn);
      }

      return Registry.register(Registry.ITEM, key, itemIn);
   }
}
