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
   public static final Item AIR = method30156(Blocks.AIR, new AirItem(Blocks.AIR, new Item.Properties()));
   public static final Item STONE = registerBlockItem(Blocks.STONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item GRANITE = registerBlockItem(Blocks.GRANITE, ItemGroup.BUILDING_BLOCKS);
   public static final Item POLISHED_GRANITE = registerBlockItem(Blocks.POLISHED_GRANITE, ItemGroup.BUILDING_BLOCKS);
   public static final Item DIORITE = registerBlockItem(Blocks.DIORITE, ItemGroup.BUILDING_BLOCKS);
   public static final Item POLISHED_DIORITE = registerBlockItem(Blocks.POLISHED_DIORITE, ItemGroup.BUILDING_BLOCKS);
   public static final Item ANDESITE = registerBlockItem(Blocks.ANDESITE, ItemGroup.BUILDING_BLOCKS);
   public static final Item POLISHED_ANDESITE = registerBlockItem(Blocks.POLISHED_ANDESITE, ItemGroup.BUILDING_BLOCKS);
   public static final Item GRASS = registerBlockItem(Blocks.GRASS_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item DIRT = registerBlockItem(Blocks.DIRT, ItemGroup.BUILDING_BLOCKS);
   public static final Item COARSE_DIRT = registerBlockItem(Blocks.COARSE_DIRT, ItemGroup.BUILDING_BLOCKS);
   public static final Item PODZOL = registerBlockItem(Blocks.PODZOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37234 = registerBlockItem(Blocks.CRIMSON_NYLIUM, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37235 = registerBlockItem(Blocks.WARPED_NYLIUM, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37236 = registerBlockItem(Blocks.COBBLESTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37237 = registerBlockItem(Blocks.OAK_PLANKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37238 = registerBlockItem(Blocks.SPRUCE_PLANKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37239 = registerBlockItem(Blocks.BIRCH_PLANKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37240 = registerBlockItem(Blocks.JUNGLE_PLANKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37241 = registerBlockItem(Blocks.ACACIA_PLANKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37242 = registerBlockItem(Blocks.DARK_OAK_PLANKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37243 = registerBlockItem(Blocks.CRIMSON_PLANKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37244 = registerBlockItem(Blocks.WARPED_PLANKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37245 = registerBlockItem(Blocks.OAK_SAPLING, ItemGroup.field31666);
   public static final Item field37246 = registerBlockItem(Blocks.SPRUCE_SAPLING, ItemGroup.field31666);
   public static final Item field37247 = registerBlockItem(Blocks.BIRCH_SAPLING, ItemGroup.field31666);
   public static final Item field37248 = registerBlockItem(Blocks.JUNGLE_SAPLING, ItemGroup.field31666);
   public static final Item field37249 = registerBlockItem(Blocks.ACACIA_SAPLING, ItemGroup.field31666);
   public static final Item field37250 = registerBlockItem(Blocks.DARK_OAK_SAPLING, ItemGroup.field31666);
   public static final Item field37251 = registerBlockItem(Blocks.BEDROCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37252 = registerBlockItem(Blocks.SAND, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37253 = registerBlockItem(Blocks.RED_SAND, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37254 = registerBlockItem(Blocks.GRAVEL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37255 = registerBlockItem(Blocks.GOLD_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37256 = registerBlockItem(Blocks.IRON_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37257 = registerBlockItem(Blocks.COAL_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37258 = registerBlockItem(Blocks.NETHER_GOLD_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37259 = registerBlockItem(Blocks.OAK_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37260 = registerBlockItem(Blocks.SPRUCE_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37261 = registerBlockItem(Blocks.BIRCH_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37262 = registerBlockItem(Blocks.JUNGLE_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37263 = registerBlockItem(Blocks.ACACIA_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37264 = registerBlockItem(Blocks.DARK_OAK_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37265 = registerBlockItem(Blocks.CRIMSON_STEM, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37266 = registerBlockItem(Blocks.WARPED_STEM, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37267 = registerBlockItem(Blocks.STRIPPED_OAK_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37268 = registerBlockItem(Blocks.STRIPPED_SPRUCE_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37269 = registerBlockItem(Blocks.STRIPPED_BIRCH_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37270 = registerBlockItem(Blocks.STRIPPED_JUNGLE_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37271 = registerBlockItem(Blocks.STRIPPED_ACACIA_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37272 = registerBlockItem(Blocks.STRIPPED_DARK_OAK_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37273 = registerBlockItem(Blocks.STRIPPED_CRIMSON_STEM, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37274 = registerBlockItem(Blocks.STRIPPED_WARPED_STEM, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37275 = registerBlockItem(Blocks.STRIPPED_OAK_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37276 = registerBlockItem(Blocks.STRIPPED_SPRUCE_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37277 = registerBlockItem(Blocks.STRIPPED_BIRCH_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37278 = registerBlockItem(Blocks.STRIPPED_JUNGLE_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37279 = registerBlockItem(Blocks.STRIPPED_ACACIA_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37280 = registerBlockItem(Blocks.STRIPPED_DARK_OAK_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37281 = registerBlockItem(Blocks.STRIPPED_CRIMSON_HYPHAE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37282 = registerBlockItem(Blocks.STRIPPED_WARPED_HYPHAE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37283 = registerBlockItem(Blocks.OAK_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37284 = registerBlockItem(Blocks.SPRUCE_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37285 = registerBlockItem(Blocks.BIRCH_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37286 = registerBlockItem(Blocks.JUNGLE_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37287 = registerBlockItem(Blocks.ACACIA_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37288 = registerBlockItem(Blocks.DARK_OAK_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37289 = registerBlockItem(Blocks.CRIMSON_HYPHAE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37290 = registerBlockItem(Blocks.WARPED_HYPHAE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37291 = registerBlockItem(Blocks.OAK_LEAVES, ItemGroup.field31666);
   public static final Item field37292 = registerBlockItem(Blocks.SPRUCE_LEAVES, ItemGroup.field31666);
   public static final Item field37293 = registerBlockItem(Blocks.BIRCH_LEAVES, ItemGroup.field31666);
   public static final Item field37294 = registerBlockItem(Blocks.JUNGLE_LEAVES, ItemGroup.field31666);
   public static final Item field37295 = registerBlockItem(Blocks.ACACIA_LEAVES, ItemGroup.field31666);
   public static final Item field37296 = registerBlockItem(Blocks.DARK_OAK_LEAVES, ItemGroup.field31666);
   public static final Item field37297 = registerBlockItem(Blocks.SPONGE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37298 = registerBlockItem(Blocks.WET_SPONGE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37299 = registerBlockItem(Blocks.GLASS_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37300 = registerBlockItem(Blocks.LAPIS_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37301 = registerBlockItem(Blocks.LAPIS_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37302 = registerBlockItem(Blocks.DISPENSER, ItemGroup.REDSTONE);
   public static final Item field37303 = registerBlockItem(Blocks.SANDSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37304 = registerBlockItem(Blocks.CHISELED_SANDSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37305 = registerBlockItem(Blocks.CUT_SANDSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37306 = registerBlockItem(Blocks.NOTE_BLOCK, ItemGroup.REDSTONE);
   public static final Item field37307 = registerBlockItem(Blocks.POWERED_RAIL, ItemGroup.field31668);
   public static final Item field37308 = registerBlockItem(Blocks.DETECTOR_RAIL, ItemGroup.field31668);
   public static final Item field37309 = registerBlockItem(Blocks.STICKY_PISTON, ItemGroup.REDSTONE);
   public static final Item field37310 = registerBlockItem(Blocks.COBWEB, ItemGroup.field31666);
   public static final Item field37311 = registerBlockItem(Blocks.GRASS, ItemGroup.field31666);
   public static final Item field37312 = registerBlockItem(Blocks.FERN, ItemGroup.field31666);
   public static final Item field37313 = registerBlockItem(Blocks.DEAD_BUSH, ItemGroup.field31666);
   public static final Item field37314 = registerBlockItem(Blocks.SEAGRASS, ItemGroup.field31666);
   public static final Item field37315 = registerBlockItem(Blocks.SEA_PICKLE, ItemGroup.field31666);
   public static final Item field37316 = registerBlockItem(Blocks.PISTON, ItemGroup.REDSTONE);
   public static final Item field37317 = registerBlockItem(Blocks.WHITE_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37318 = registerBlockItem(Blocks.ORANGE_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37319 = registerBlockItem(Blocks.MAGENTA_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37320 = registerBlockItem(Blocks.LIGHT_BLUE_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37321 = registerBlockItem(Blocks.YELLOW_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37322 = registerBlockItem(Blocks.LIME_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37323 = registerBlockItem(Blocks.PINK_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37324 = registerBlockItem(Blocks.GRAY_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37325 = registerBlockItem(Blocks.LIGHT_GRAY_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37326 = registerBlockItem(Blocks.CYAN_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37327 = registerBlockItem(Blocks.PURPLE_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37328 = registerBlockItem(Blocks.BLUE_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37329 = registerBlockItem(Blocks.BROWN_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37330 = registerBlockItem(Blocks.GREEN_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37331 = registerBlockItem(Blocks.RED_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37332 = registerBlockItem(Blocks.BLACK_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37333 = registerBlockItem(Blocks.DANDELION, ItemGroup.field31666);
   public static final Item field37334 = registerBlockItem(Blocks.POPPY, ItemGroup.field31666);
   public static final Item field37335 = registerBlockItem(Blocks.BLUE_ORCHID, ItemGroup.field31666);
   public static final Item field37336 = registerBlockItem(Blocks.ALLIUM, ItemGroup.field31666);
   public static final Item field37337 = registerBlockItem(Blocks.AZURE_BLUET, ItemGroup.field31666);
   public static final Item field37338 = registerBlockItem(Blocks.RED_TULIP, ItemGroup.field31666);
   public static final Item field37339 = registerBlockItem(Blocks.ORANGE_TULIP, ItemGroup.field31666);
   public static final Item field37340 = registerBlockItem(Blocks.WHITE_TULIP, ItemGroup.field31666);
   public static final Item field37341 = registerBlockItem(Blocks.PINK_TULIP, ItemGroup.field31666);
   public static final Item field37342 = registerBlockItem(Blocks.OXEYE_DAISY, ItemGroup.field31666);
   public static final Item field37343 = registerBlockItem(Blocks.CORNFLOWER, ItemGroup.field31666);
   public static final Item field37344 = registerBlockItem(Blocks.LILY_OF_THE_VALLEY, ItemGroup.field31666);
   public static final Item field37345 = registerBlockItem(Blocks.WITHER_ROSE, ItemGroup.field31666);
   public static final Item field37346 = registerBlockItem(Blocks.BROWN_MUSHROOM, ItemGroup.field31666);
   public static final Item field37347 = registerBlockItem(Blocks.RED_MUSHROOM, ItemGroup.field31666);
   public static final Item field37348 = registerBlockItem(Blocks.CRIMSON_FUNGUS, ItemGroup.field31666);
   public static final Item field37349 = registerBlockItem(Blocks.WARPED_FUNGUS, ItemGroup.field31666);
   public static final Item field37350 = registerBlockItem(Blocks.CRIMSON_ROOTS, ItemGroup.field31666);
   public static final Item field37351 = registerBlockItem(Blocks.WARPED_ROOTS, ItemGroup.field31666);
   public static final Item field37352 = registerBlockItem(Blocks.NETHER_SPROUTS, ItemGroup.field31666);
   public static final Item field37353 = registerBlockItem(Blocks.WEEPING_VINES, ItemGroup.field31666);
   public static final Item field37354 = registerBlockItem(Blocks.TWISTING_VINES, ItemGroup.field31666);
   public static final Item field37355 = registerBlockItem(Blocks.SUGAR_CANE, ItemGroup.field31666);
   public static final Item field37356 = registerBlockItem(Blocks.KELP, ItemGroup.field31666);
   public static final Item field37357 = registerBlockItem(Blocks.BAMBOO, ItemGroup.field31666);
   public static final Item field37358 = registerBlockItem(Blocks.GOLD_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37359 = registerBlockItem(Blocks.IRON_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37360 = registerBlockItem(Blocks.OAK_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37361 = registerBlockItem(Blocks.SPRUCE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37362 = registerBlockItem(Blocks.BIRCH_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37363 = registerBlockItem(Blocks.JUNGLE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37364 = registerBlockItem(Blocks.ACACIA_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37365 = registerBlockItem(Blocks.DARK_OAK_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37366 = registerBlockItem(Blocks.CRIMSON_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37367 = registerBlockItem(Blocks.WARPED_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37368 = registerBlockItem(Blocks.STONE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37369 = registerBlockItem(Blocks.SMOOTH_STONE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37370 = registerBlockItem(Blocks.SANDSTONE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37371 = registerBlockItem(Blocks.CUT_SANDSTONE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37372 = registerBlockItem(Blocks.PETRIFIED_OAK_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37373 = registerBlockItem(Blocks.COBBLESTONE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37374 = registerBlockItem(Blocks.BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37375 = registerBlockItem(Blocks.STONE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37376 = registerBlockItem(Blocks.NETHER_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37377 = registerBlockItem(Blocks.QUARTZ_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37378 = registerBlockItem(Blocks.RED_SANDSTONE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37379 = registerBlockItem(Blocks.CUT_RED_SANDSTONE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37380 = registerBlockItem(Blocks.PURPUR_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37381 = registerBlockItem(Blocks.PRISMARINE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37382 = registerBlockItem(Blocks.PRISMARINE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37383 = registerBlockItem(Blocks.DARK_PRISMARINE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37384 = registerBlockItem(Blocks.SMOOTH_QUARTZ, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37385 = registerBlockItem(Blocks.SMOOTH_RED_SANDSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37386 = registerBlockItem(Blocks.SMOOTH_SANDSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37387 = registerBlockItem(Blocks.SMOOTH_STONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37388 = registerBlockItem(Blocks.BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37389 = registerBlockItem(Blocks.TNT, ItemGroup.REDSTONE);
   public static final Item field37390 = registerBlockItem(Blocks.BOOKSHELF, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37391 = registerBlockItem(Blocks.MOSSY_COBBLESTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37392 = registerBlockItem(Blocks.OBSIDIAN, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37393 = register(
      new Class3298(Blocks.TORCH, Blocks.WALL_TORCH, new Item.Properties().method17779(ItemGroup.field31666))
   );
   public static final Item field37394 = registerBlockItem(Blocks.END_ROD, ItemGroup.field31666);
   public static final Item field37395 = registerBlockItem(Blocks.CHORUS_PLANT, ItemGroup.field31666);
   public static final Item field37396 = registerBlockItem(Blocks.CHORUS_FLOWER, ItemGroup.field31666);
   public static final Item field37397 = registerBlockItem(Blocks.PURPUR_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37398 = registerBlockItem(Blocks.PURPUR_PILLAR, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37399 = registerBlockItem(Blocks.PURPUR_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37400 = method30153(Blocks.SPAWNER);
   public static final Item field37401 = registerBlockItem(Blocks.OAK_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37402 = registerBlockItem(Blocks.CHEST, ItemGroup.field31666);
   public static final Item field37403 = registerBlockItem(Blocks.DIAMOND_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37404 = registerBlockItem(Blocks.DIAMOND_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37405 = registerBlockItem(Blocks.CRAFTING_TABLE, ItemGroup.field31666);
   public static final Item field37406 = registerBlockItem(Blocks.FARMLAND, ItemGroup.field31666);
   public static final Item field37407 = registerBlockItem(Blocks.FURNACE, ItemGroup.field31666);
   public static final Item field37408 = registerBlockItem(Blocks.LADDER, ItemGroup.field31666);
   public static final Item field37409 = registerBlockItem(Blocks.RAIL, ItemGroup.field31668);
   public static final Item field37410 = registerBlockItem(Blocks.COBBLESTONE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37411 = registerBlockItem(Blocks.LEVER, ItemGroup.REDSTONE);
   public static final Item field37412 = registerBlockItem(Blocks.STONE_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37413 = registerBlockItem(Blocks.OAK_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37414 = registerBlockItem(Blocks.SPRUCE_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37415 = registerBlockItem(Blocks.BIRCH_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37416 = registerBlockItem(Blocks.JUNGLE_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37417 = registerBlockItem(Blocks.ACACIA_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37418 = registerBlockItem(Blocks.DARK_OAK_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37419 = registerBlockItem(Blocks.CRIMSON_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37420 = registerBlockItem(Blocks.WARPED_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37421 = registerBlockItem(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37422 = registerBlockItem(Blocks.REDSTONE_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37423 = register(
      new Class3298(Blocks.REDSTONE_TORCH, Blocks.REDSTONE_WALL_TORCH, new Item.Properties().method17779(ItemGroup.REDSTONE))
   );
   public static final Item field37424 = registerBlockItem(Blocks.SNOW, ItemGroup.field31666);
   public static final Item field37425 = registerBlockItem(Blocks.ICE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37426 = registerBlockItem(Blocks.SNOW_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37427 = registerBlockItem(Blocks.CACTUS, ItemGroup.field31666);
   public static final Item field37428 = registerBlockItem(Blocks.CLAY, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37429 = registerBlockItem(Blocks.JUKEBOX, ItemGroup.field31666);
   public static final Item field37430 = registerBlockItem(Blocks.OAK_FENCE, ItemGroup.field31666);
   public static final Item field37431 = registerBlockItem(Blocks.SPRUCE_FENCE, ItemGroup.field31666);
   public static final Item field37432 = registerBlockItem(Blocks.BIRCH_FENCE, ItemGroup.field31666);
   public static final Item field37433 = registerBlockItem(Blocks.JUNGLE_FENCE, ItemGroup.field31666);
   public static final Item field37434 = registerBlockItem(Blocks.ACACIA_FENCE, ItemGroup.field31666);
   public static final Item field37435 = registerBlockItem(Blocks.DARK_OAK_FENCE, ItemGroup.field31666);
   public static final Item field37436 = registerBlockItem(Blocks.CRIMSON_FENCE, ItemGroup.field31666);
   public static final Item field37437 = registerBlockItem(Blocks.WARPED_FENCE, ItemGroup.field31666);
   public static final Item field37438 = registerBlockItem(Blocks.PUMPKIN, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37439 = registerBlockItem(Blocks.CARVED_PUMPKIN, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37440 = registerBlockItem(Blocks.NETHERRACK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37441 = registerBlockItem(Blocks.SOUL_SAND, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37442 = registerBlockItem(Blocks.SOUL_SOIL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37443 = registerBlockItem(Blocks.BASALT, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37444 = registerBlockItem(Blocks.POLISHED_BASALT, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37445 = register(
      new Class3298(Blocks.SOUL_TORCH, Blocks.SOUL_WALL_TORCH, new Item.Properties().method17779(ItemGroup.field31666))
   );
   public static final Item field37446 = registerBlockItem(Blocks.GLOWSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37447 = registerBlockItem(Blocks.JACK_O_LANTERN, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37448 = registerBlockItem(Blocks.OAK_TRAPDOOR, ItemGroup.REDSTONE);
   public static final Item field37449 = registerBlockItem(Blocks.SPRUCE_TRAPDOOR, ItemGroup.REDSTONE);
   public static final Item field37450 = registerBlockItem(Blocks.BIRCH_TRAPDOOR, ItemGroup.REDSTONE);
   public static final Item field37451 = registerBlockItem(Blocks.JUNGLE_TRAPDOOR, ItemGroup.REDSTONE);
   public static final Item field37452 = registerBlockItem(Blocks.ACACIA_TRAPDOOR, ItemGroup.REDSTONE);
   public static final Item field37453 = registerBlockItem(Blocks.DARK_OAK_TRAPDOOR, ItemGroup.REDSTONE);
   public static final Item field37454 = registerBlockItem(Blocks.CRIMSON_TRAPDOOR, ItemGroup.REDSTONE);
   public static final Item field37455 = registerBlockItem(Blocks.WARPED_TRAPDOOR, ItemGroup.REDSTONE);
   public static final Item field37456 = registerBlockItem(Blocks.INFESTED_STONE, ItemGroup.field31666);
   public static final Item field37457 = registerBlockItem(Blocks.INFESTED_COBBLESTONE, ItemGroup.field31666);
   public static final Item field37458 = registerBlockItem(Blocks.INFESTED_STONE_BRICKS, ItemGroup.field31666);
   public static final Item field37459 = registerBlockItem(Blocks.INFESTED_MOSSY_STONE_BRICKS, ItemGroup.field31666);
   public static final Item field37460 = registerBlockItem(Blocks.INFESTED_CRACKED_STONE_BRICKS, ItemGroup.field31666);
   public static final Item field37461 = registerBlockItem(Blocks.INFESTED_CHISELED_STONE_BRICKS, ItemGroup.field31666);
   public static final Item field37462 = registerBlockItem(Blocks.STONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37463 = registerBlockItem(Blocks.MOSSY_STONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37464 = registerBlockItem(Blocks.CRACKED_STONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item CHISELED_STONE_BRICKS = registerBlockItem(Blocks.CHISELED_STONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37466 = registerBlockItem(Blocks.BROWN_MUSHROOM_BLOCK, ItemGroup.field31666);
   public static final Item field37467 = registerBlockItem(Blocks.RED_MUSHROOM_BLOCK, ItemGroup.field31666);
   public static final Item field37468 = registerBlockItem(Blocks.MUSHROOM_STEM, ItemGroup.field31666);
   public static final Item field37469 = registerBlockItem(Blocks.IRON_BARS, ItemGroup.field31666);
   public static final Item field37470 = registerBlockItem(Blocks.CHAIN, ItemGroup.field31666);
   public static final Item field37471 = registerBlockItem(Blocks.GLASS_PANE, ItemGroup.field31666);
   public static final Item field37472 = registerBlockItem(Blocks.MELON, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37473 = registerBlockItem(Blocks.VINE, ItemGroup.field31666);
   public static final Item field37474 = registerBlockItem(Blocks.OAK_FENCE_GATE, ItemGroup.REDSTONE);
   public static final Item field37475 = registerBlockItem(Blocks.SPRUCE_FENCE_GATE, ItemGroup.REDSTONE);
   public static final Item field37476 = registerBlockItem(Blocks.BIRCH_FENCE_GATE, ItemGroup.REDSTONE);
   public static final Item field37477 = registerBlockItem(Blocks.JUNGLE_FENCE_GATE, ItemGroup.REDSTONE);
   public static final Item field37478 = registerBlockItem(Blocks.ACACIA_FENCE_GATE, ItemGroup.REDSTONE);
   public static final Item field37479 = registerBlockItem(Blocks.DARK_OAK_FENCE_GATE, ItemGroup.REDSTONE);
   public static final Item field37480 = registerBlockItem(Blocks.CRIMSON_FENCE_GATE, ItemGroup.REDSTONE);
   public static final Item field37481 = registerBlockItem(Blocks.WARPED_FENCE_GATE, ItemGroup.REDSTONE);
   public static final Item field37482 = registerBlockItem(Blocks.BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37483 = registerBlockItem(Blocks.STONE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37484 = registerBlockItem(Blocks.MYCELIUM, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37485 = register(new Class3302(Blocks.LILY_PAD, new Item.Properties().method17779(ItemGroup.field31666)));
   public static final Item field37486 = registerBlockItem(Blocks.NETHER_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37487 = registerBlockItem(Blocks.CRACKED_NETHER_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37488 = registerBlockItem(Blocks.CHISELED_NETHER_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37489 = registerBlockItem(Blocks.NETHER_BRICK_FENCE, ItemGroup.field31666);
   public static final Item field37490 = registerBlockItem(Blocks.NETHER_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37491 = registerBlockItem(Blocks.ENCHANTING_TABLE, ItemGroup.field31666);
   public static final Item field37492 = registerBlockItem(Blocks.END_PORTAL_FRAME, ItemGroup.field31666);
   public static final Item field37493 = registerBlockItem(Blocks.END_STONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37494 = registerBlockItem(Blocks.END_STONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37495 = register(new BlockItem(Blocks.DRAGON_EGG, new Item.Properties().method17780(Class1978.field12888)));
   public static final Item field37496 = registerBlockItem(Blocks.REDSTONE_LAMP, ItemGroup.REDSTONE);
   public static final Item field37497 = registerBlockItem(Blocks.SANDSTONE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37498 = registerBlockItem(Blocks.EMERALD_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37499 = registerBlockItem(Blocks.ENDER_CHEST, ItemGroup.field31666);
   public static final Item field37500 = registerBlockItem(Blocks.TRIPWIRE_HOOK, ItemGroup.REDSTONE);
   public static final Item field37501 = registerBlockItem(Blocks.EMERALD_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37502 = registerBlockItem(Blocks.SPRUCE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37503 = registerBlockItem(Blocks.BIRCH_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37504 = registerBlockItem(Blocks.JUNGLE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37505 = registerBlockItem(Blocks.CRIMSON_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37506 = registerBlockItem(Blocks.WARPED_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37507 = register(new Class3293(Blocks.COMMAND_BLOCK, new Item.Properties().method17780(Class1978.field12888)));
   public static final Item field37508 = register(
      new BlockItem(Blocks.BEACON, new Item.Properties().method17779(ItemGroup.field31669).method17780(Class1978.field12887))
   );
   public static final Item field37509 = registerBlockItem(Blocks.COBBLESTONE_WALL, ItemGroup.field31666);
   public static final Item field37510 = registerBlockItem(Blocks.MOSSY_COBBLESTONE_WALL, ItemGroup.field31666);
   public static final Item field37511 = registerBlockItem(Blocks.BRICK_WALL, ItemGroup.field31666);
   public static final Item field37512 = registerBlockItem(Blocks.PRISMARINE_WALL, ItemGroup.field31666);
   public static final Item field37513 = registerBlockItem(Blocks.RED_SANDSTONE_WALL, ItemGroup.field31666);
   public static final Item field37514 = registerBlockItem(Blocks.MOSSY_STONE_BRICK_WALL, ItemGroup.field31666);
   public static final Item field37515 = registerBlockItem(Blocks.GRANITE_WALL, ItemGroup.field31666);
   public static final Item field37516 = registerBlockItem(Blocks.STONE_BRICK_WALL, ItemGroup.field31666);
   public static final Item field37517 = registerBlockItem(Blocks.NETHER_BRICK_WALL, ItemGroup.field31666);
   public static final Item field37518 = registerBlockItem(Blocks.ANDESITE_WALL, ItemGroup.field31666);
   public static final Item field37519 = registerBlockItem(Blocks.RED_NETHER_BRICK_WALL, ItemGroup.field31666);
   public static final Item field37520 = registerBlockItem(Blocks.SANDSTONE_WALL, ItemGroup.field31666);
   public static final Item field37521 = registerBlockItem(Blocks.END_STONE_BRICK_WALL, ItemGroup.field31666);
   public static final Item field37522 = registerBlockItem(Blocks.DIORITE_WALL, ItemGroup.field31666);
   public static final Item field37523 = registerBlockItem(Blocks.BLACKSTONE_WALL, ItemGroup.field31666);
   public static final Item field37524 = registerBlockItem(Blocks.POLISHED_BLACKSTONE_WALL, ItemGroup.field31666);
   public static final Item field37525 = registerBlockItem(Blocks.POLISHED_BLACKSTONE_BRICK_WALL, ItemGroup.field31666);
   public static final Item field37526 = registerBlockItem(Blocks.STONE_BUTTON, ItemGroup.REDSTONE);
   public static final Item field37527 = registerBlockItem(Blocks.OAK_BUTTON, ItemGroup.REDSTONE);
   public static final Item field37528 = registerBlockItem(Blocks.SPRUCE_BUTTON, ItemGroup.REDSTONE);
   public static final Item field37529 = registerBlockItem(Blocks.BIRCH_BUTTON, ItemGroup.REDSTONE);
   public static final Item field37530 = registerBlockItem(Blocks.JUNGLE_BUTTON, ItemGroup.REDSTONE);
   public static final Item field37531 = registerBlockItem(Blocks.ACACIA_BUTTON, ItemGroup.REDSTONE);
   public static final Item field37532 = registerBlockItem(Blocks.DARK_OAK_BUTTON, ItemGroup.REDSTONE);
   public static final Item field37533 = registerBlockItem(Blocks.CRIMSON_BUTTON, ItemGroup.REDSTONE);
   public static final Item field37534 = registerBlockItem(Blocks.WARPED_BUTTON, ItemGroup.REDSTONE);
   public static final Item field37535 = registerBlockItem(Blocks.POLISHED_BLACKSTONE_BUTTON, ItemGroup.REDSTONE);
   public static final Item field37536 = registerBlockItem(Blocks.ANVIL, ItemGroup.field31666);
   public static final Item field37537 = registerBlockItem(Blocks.CHIPPED_ANVIL, ItemGroup.field31666);
   public static final Item field37538 = registerBlockItem(Blocks.DAMAGED_ANVIL, ItemGroup.field31666);
   public static final Item field37539 = registerBlockItem(Blocks.TRAPPED_CHEST, ItemGroup.REDSTONE);
   public static final Item field37540 = registerBlockItem(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37541 = registerBlockItem(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37542 = registerBlockItem(Blocks.DAYLIGHT_DETECTOR, ItemGroup.REDSTONE);
   public static final Item field37543 = registerBlockItem(Blocks.REDSTONE_BLOCK, ItemGroup.REDSTONE);
   public static final Item field37544 = registerBlockItem(Blocks.NETHER_QUARTZ_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37545 = registerBlockItem(Blocks.HOPPER, ItemGroup.REDSTONE);
   public static final Item field37546 = registerBlockItem(Blocks.CHISELED_QUARTZ_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37547 = registerBlockItem(Blocks.QUARTZ_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37548 = registerBlockItem(Blocks.QUARTZ_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37549 = registerBlockItem(Blocks.QUARTZ_PILLAR, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37550 = registerBlockItem(Blocks.QUARTZ_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37551 = registerBlockItem(Blocks.ACTIVATOR_RAIL, ItemGroup.field31668);
   public static final Item field37552 = registerBlockItem(Blocks.DROPPER, ItemGroup.REDSTONE);
   public static final Item field37553 = registerBlockItem(Blocks.WHITE_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37554 = registerBlockItem(Blocks.ORANGE_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37555 = registerBlockItem(Blocks.MAGENTA_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37556 = registerBlockItem(Blocks.LIGHT_BLUE_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37557 = registerBlockItem(Blocks.YELLOW_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37558 = registerBlockItem(Blocks.LIME_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37559 = registerBlockItem(Blocks.PINK_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37560 = registerBlockItem(Blocks.GRAY_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37561 = registerBlockItem(Blocks.LIGHT_GRAY_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37562 = registerBlockItem(Blocks.CYAN_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37563 = registerBlockItem(Blocks.PURPLE_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37564 = registerBlockItem(Blocks.BLUE_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37565 = registerBlockItem(Blocks.BROWN_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37566 = registerBlockItem(Blocks.GREEN_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37567 = registerBlockItem(Blocks.RED_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37568 = registerBlockItem(Blocks.BLACK_TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item BARRIER = method30153(Blocks.BARRIER);
   public static final Item field37570 = registerBlockItem(Blocks.IRON_TRAPDOOR, ItemGroup.REDSTONE);
   public static final Item field37571 = registerBlockItem(Blocks.HAY_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37572 = registerBlockItem(Blocks.WHITE_CARPET, ItemGroup.field31666);
   public static final Item field37573 = registerBlockItem(Blocks.ORANGE_CARPET, ItemGroup.field31666);
   public static final Item field37574 = registerBlockItem(Blocks.MAGENTA_CARPET, ItemGroup.field31666);
   public static final Item field37575 = registerBlockItem(Blocks.LIGHT_BLUE_CARPET, ItemGroup.field31666);
   public static final Item field37576 = registerBlockItem(Blocks.YELLOW_CARPET, ItemGroup.field31666);
   public static final Item field37577 = registerBlockItem(Blocks.LIME_CARPET, ItemGroup.field31666);
   public static final Item field37578 = registerBlockItem(Blocks.PINK_CARPET, ItemGroup.field31666);
   public static final Item field37579 = registerBlockItem(Blocks.GRAY_CARPET, ItemGroup.field31666);
   public static final Item field37580 = registerBlockItem(Blocks.LIGHT_GRAY_CARPET, ItemGroup.field31666);
   public static final Item field37581 = registerBlockItem(Blocks.CYAN_CARPET, ItemGroup.field31666);
   public static final Item field37582 = registerBlockItem(Blocks.PURPLE_CARPET, ItemGroup.field31666);
   public static final Item field37583 = registerBlockItem(Blocks.BLUE_CARPET, ItemGroup.field31666);
   public static final Item field37584 = registerBlockItem(Blocks.BROWN_CARPET, ItemGroup.field31666);
   public static final Item field37585 = registerBlockItem(Blocks.GREEN_CARPET, ItemGroup.field31666);
   public static final Item field37586 = registerBlockItem(Blocks.RED_CARPET, ItemGroup.field31666);
   public static final Item field37587 = registerBlockItem(Blocks.BLACK_CARPET, ItemGroup.field31666);
   public static final Item field37588 = registerBlockItem(Blocks.TERRACOTTA, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37589 = registerBlockItem(Blocks.COAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37590 = registerBlockItem(Blocks.PACKED_ICE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37591 = registerBlockItem(Blocks.ACACIA_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37592 = registerBlockItem(Blocks.DARK_OAK_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37593 = registerBlockItem(Blocks.SLIME_BLOCK, ItemGroup.field31666);
   public static final Item field37594 = registerBlockItem(Blocks.GRASS_PATH, ItemGroup.field31666);
   public static final Item field37595 = register(new Class3295(Blocks.SUNFLOWER, new Item.Properties().method17779(ItemGroup.field31666)));
   public static final Item field37596 = register(new Class3295(Blocks.LILAC, new Item.Properties().method17779(ItemGroup.field31666)));
   public static final Item field37597 = register(new Class3295(Blocks.ROSE_BUSH, new Item.Properties().method17779(ItemGroup.field31666)));
   public static final Item field37598 = register(new Class3295(Blocks.PEONY, new Item.Properties().method17779(ItemGroup.field31666)));
   public static final Item field37599 = register(new Class3295(Blocks.TALL_GRASS, new Item.Properties().method17779(ItemGroup.field31666)));
   public static final Item field37600 = register(new Class3295(Blocks.LARGE_FERN, new Item.Properties().method17779(ItemGroup.field31666)));
   public static final Item field37601 = registerBlockItem(Blocks.WHITE_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37602 = registerBlockItem(Blocks.ORANGE_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37603 = registerBlockItem(Blocks.MAGENTA_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37604 = registerBlockItem(Blocks.LIGHT_BLUE_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37605 = registerBlockItem(Blocks.YELLOW_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37606 = registerBlockItem(Blocks.LIME_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37607 = registerBlockItem(Blocks.PINK_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37608 = registerBlockItem(Blocks.GRAY_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37609 = registerBlockItem(Blocks.LIGHT_GRAY_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37610 = registerBlockItem(Blocks.CYAN_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37611 = registerBlockItem(Blocks.PURPLE_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37612 = registerBlockItem(Blocks.BLUE_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37613 = registerBlockItem(Blocks.BROWN_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37614 = registerBlockItem(Blocks.GREEN_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37615 = registerBlockItem(Blocks.RED_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37616 = registerBlockItem(Blocks.BLACK_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37617 = registerBlockItem(Blocks.WHITE_STAINED_GLASS_PANE, ItemGroup.field31666);
   public static final Item field37618 = registerBlockItem(Blocks.ORANGE_STAINED_GLASS_PANE, ItemGroup.field31666);
   public static final Item field37619 = registerBlockItem(Blocks.MAGENTA_STAINED_GLASS_PANE, ItemGroup.field31666);
   public static final Item field37620 = registerBlockItem(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE, ItemGroup.field31666);
   public static final Item field37621 = registerBlockItem(Blocks.YELLOW_STAINED_GLASS_PANE, ItemGroup.field31666);
   public static final Item field37622 = registerBlockItem(Blocks.LIME_STAINED_GLASS_PANE, ItemGroup.field31666);
   public static final Item field37623 = registerBlockItem(Blocks.PINK_STAINED_GLASS_PANE, ItemGroup.field31666);
   public static final Item field37624 = registerBlockItem(Blocks.GRAY_STAINED_GLASS_PANE, ItemGroup.field31666);
   public static final Item field37625 = registerBlockItem(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE, ItemGroup.field31666);
   public static final Item field37626 = registerBlockItem(Blocks.CYAN_STAINED_GLASS_PANE, ItemGroup.field31666);
   public static final Item field37627 = registerBlockItem(Blocks.PURPLE_STAINED_GLASS_PANE, ItemGroup.field31666);
   public static final Item field37628 = registerBlockItem(Blocks.BLUE_STAINED_GLASS_PANE, ItemGroup.field31666);
   public static final Item field37629 = registerBlockItem(Blocks.BROWN_STAINED_GLASS_PANE, ItemGroup.field31666);
   public static final Item field37630 = registerBlockItem(Blocks.GREEN_STAINED_GLASS_PANE, ItemGroup.field31666);
   public static final Item field37631 = registerBlockItem(Blocks.RED_STAINED_GLASS_PANE, ItemGroup.field31666);
   public static final Item field37632 = registerBlockItem(Blocks.BLACK_STAINED_GLASS_PANE, ItemGroup.field31666);
   public static final Item field37633 = registerBlockItem(Blocks.PRISMARINE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37634 = registerBlockItem(Blocks.PRISMARINE_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37635 = registerBlockItem(Blocks.DARK_PRISMARINE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37636 = registerBlockItem(Blocks.PRISMARINE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37637 = registerBlockItem(Blocks.PRISMARINE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37638 = registerBlockItem(Blocks.DARK_PRISMARINE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37639 = registerBlockItem(Blocks.SEA_LANTERN, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37640 = registerBlockItem(Blocks.RED_SANDSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37641 = registerBlockItem(Blocks.CHISELED_RED_SANDSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37642 = registerBlockItem(Blocks.CUT_RED_SANDSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37643 = registerBlockItem(Blocks.RED_SANDSTONE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37644 = register(new Class3293(Blocks.REPEATING_COMMAND_BLOCK, new Item.Properties().method17780(Class1978.field12888)));
   public static final Item field37645 = register(new Class3293(Blocks.CHAIN_COMMAND_BLOCK, new Item.Properties().method17780(Class1978.field12888)));
   public static final Item field37646 = registerBlockItem(Blocks.MAGMA_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37647 = registerBlockItem(Blocks.NETHER_WART_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37648 = registerBlockItem(Blocks.WARPED_WART_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37649 = registerBlockItem(Blocks.RED_NETHER_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37650 = registerBlockItem(Blocks.BONE_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37651 = method30153(Blocks.STRUCTURE_VOID);
   public static final Item field37652 = registerBlockItem(Blocks.OBSERVER, ItemGroup.REDSTONE);
   public static final Item field37653 = register(new BlockItem(Blocks.SHULKER_BOX, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37654 = register(new BlockItem(Blocks.WHITE_SHULKER_BOX, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37655 = register(new BlockItem(Blocks.ORANGE_SHULKER_BOX, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37656 = register(new BlockItem(Blocks.MAGENTA_SHULKER_BOX, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37657 = register(new BlockItem(Blocks.LIGHT_BLUE_SHULKER_BOX, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37658 = register(new BlockItem(Blocks.YELLOW_SHULKER_BOX, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37659 = register(new BlockItem(Blocks.LIME_SHULKER_BOX, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37660 = register(new BlockItem(Blocks.PINK_SHULKER_BOX, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37661 = register(new BlockItem(Blocks.GRAY_SHULKER_BOX, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37662 = register(new BlockItem(Blocks.LIGHT_GRAY_SHULKER_BOX, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37663 = register(new BlockItem(Blocks.CYAN_SHULKER_BOX, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37664 = register(new BlockItem(Blocks.PURPLE_SHULKER_BOX, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37665 = register(new BlockItem(Blocks.BLUE_SHULKER_BOX, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37666 = register(new BlockItem(Blocks.BROWN_SHULKER_BOX, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37667 = register(new BlockItem(Blocks.GREEN_SHULKER_BOX, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37668 = register(new BlockItem(Blocks.RED_SHULKER_BOX, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37669 = register(new BlockItem(Blocks.BLACK_SHULKER_BOX, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37670 = registerBlockItem(Blocks.WHITE_GLAZED_TERRACOTTA, ItemGroup.field31666);
   public static final Item field37671 = registerBlockItem(Blocks.ORANGE_GLAZED_TERRACOTTA, ItemGroup.field31666);
   public static final Item field37672 = registerBlockItem(Blocks.MAGENTA_GLAZED_TERRACOTTA, ItemGroup.field31666);
   public static final Item field37673 = registerBlockItem(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, ItemGroup.field31666);
   public static final Item field37674 = registerBlockItem(Blocks.YELLOW_GLAZED_TERRACOTTA, ItemGroup.field31666);
   public static final Item field37675 = registerBlockItem(Blocks.LIME_GLAZED_TERRACOTTA, ItemGroup.field31666);
   public static final Item field37676 = registerBlockItem(Blocks.PINK_GLAZED_TERRACOTTA, ItemGroup.field31666);
   public static final Item field37677 = registerBlockItem(Blocks.GRAY_GLAZED_TERRACOTTA, ItemGroup.field31666);
   public static final Item field37678 = registerBlockItem(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, ItemGroup.field31666);
   public static final Item field37679 = registerBlockItem(Blocks.CYAN_GLAZED_TERRACOTTA, ItemGroup.field31666);
   public static final Item field37680 = registerBlockItem(Blocks.PURPLE_GLAZED_TERRACOTTA, ItemGroup.field31666);
   public static final Item field37681 = registerBlockItem(Blocks.BLUE_GLAZED_TERRACOTTA, ItemGroup.field31666);
   public static final Item field37682 = registerBlockItem(Blocks.BROWN_GLAZED_TERRACOTTA, ItemGroup.field31666);
   public static final Item field37683 = registerBlockItem(Blocks.GREEN_GLAZED_TERRACOTTA, ItemGroup.field31666);
   public static final Item field37684 = registerBlockItem(Blocks.RED_GLAZED_TERRACOTTA, ItemGroup.field31666);
   public static final Item field37685 = registerBlockItem(Blocks.BLACK_GLAZED_TERRACOTTA, ItemGroup.field31666);
   public static final Item field37686 = registerBlockItem(Blocks.WHITE_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37687 = registerBlockItem(Blocks.ORANGE_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37688 = registerBlockItem(Blocks.MAGENTA_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37689 = registerBlockItem(Blocks.LIGHT_BLUE_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37690 = registerBlockItem(Blocks.YELLOW_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37691 = registerBlockItem(Blocks.LIME_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37692 = registerBlockItem(Blocks.PINK_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37693 = registerBlockItem(Blocks.GRAY_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37694 = registerBlockItem(Blocks.LIGHT_GRAY_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37695 = registerBlockItem(Blocks.CYAN_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37696 = registerBlockItem(Blocks.PURPLE_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37697 = registerBlockItem(Blocks.BLUE_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37698 = registerBlockItem(Blocks.BROWN_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37699 = registerBlockItem(Blocks.GREEN_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37700 = registerBlockItem(Blocks.RED_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37701 = registerBlockItem(Blocks.BLACK_CONCRETE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37702 = registerBlockItem(Blocks.WHITE_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37703 = registerBlockItem(Blocks.ORANGE_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37704 = registerBlockItem(Blocks.MAGENTA_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37705 = registerBlockItem(Blocks.LIGHT_BLUE_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37706 = registerBlockItem(Blocks.YELLOW_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37707 = registerBlockItem(Blocks.LIME_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37708 = registerBlockItem(Blocks.PINK_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37709 = registerBlockItem(Blocks.GRAY_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37710 = registerBlockItem(Blocks.LIGHT_GRAY_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37711 = registerBlockItem(Blocks.CYAN_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37712 = registerBlockItem(Blocks.PURPLE_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37713 = registerBlockItem(Blocks.BLUE_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37714 = registerBlockItem(Blocks.BROWN_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37715 = registerBlockItem(Blocks.GREEN_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37716 = registerBlockItem(Blocks.RED_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37717 = registerBlockItem(Blocks.BLACK_CONCRETE_POWDER, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37718 = registerBlockItem(Blocks.TURTLE_EGG, ItemGroup.field31669);
   public static final Item field37719 = registerBlockItem(Blocks.DEAD_TUBE_CORAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37720 = registerBlockItem(Blocks.DEAD_BRAIN_CORAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37721 = registerBlockItem(Blocks.DEAD_BUBBLE_CORAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37722 = registerBlockItem(Blocks.DEAD_FIRE_CORAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37723 = registerBlockItem(Blocks.DEAD_HORN_CORAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37724 = registerBlockItem(Blocks.TUBE_CORAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37725 = registerBlockItem(Blocks.BRAIN_CORAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37726 = registerBlockItem(Blocks.BUBBLE_CORAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37727 = registerBlockItem(Blocks.FIRE_CORAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37728 = registerBlockItem(Blocks.HORN_CORAL_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37729 = registerBlockItem(Blocks.TUBE_CORAL, ItemGroup.field31666);
   public static final Item field37730 = registerBlockItem(Blocks.BRAIN_CORAL, ItemGroup.field31666);
   public static final Item field37731 = registerBlockItem(Blocks.BUBBLE_CORAL, ItemGroup.field31666);
   public static final Item field37732 = registerBlockItem(Blocks.FIRE_CORAL, ItemGroup.field31666);
   public static final Item field37733 = registerBlockItem(Blocks.HORN_CORAL, ItemGroup.field31666);
   public static final Item field37734 = registerBlockItem(Blocks.DEAD_BRAIN_CORAL, ItemGroup.field31666);
   public static final Item field37735 = registerBlockItem(Blocks.DEAD_BUBBLE_CORAL, ItemGroup.field31666);
   public static final Item field37736 = registerBlockItem(Blocks.DEAD_FIRE_CORAL, ItemGroup.field31666);
   public static final Item field37737 = registerBlockItem(Blocks.DEAD_HORN_CORAL, ItemGroup.field31666);
   public static final Item field37738 = registerBlockItem(Blocks.DEAD_TUBE_CORAL, ItemGroup.field31666);
   public static final Item field37739 = register(
      new Class3298(Blocks.TUBE_CORAL_FAN, Blocks.TUBE_CORAL_WALL_FAN, new Item.Properties().method17779(ItemGroup.field31666))
   );
   public static final Item field37740 = register(
      new Class3298(Blocks.BRAIN_CORAL_FAN, Blocks.BRAIN_CORAL_WALL_FAN, new Item.Properties().method17779(ItemGroup.field31666))
   );
   public static final Item field37741 = register(
      new Class3298(Blocks.BUBBLE_CORAL_FAN, Blocks.BUBBLE_CORAL_WALL_FAN, new Item.Properties().method17779(ItemGroup.field31666))
   );
   public static final Item field37742 = register(
      new Class3298(Blocks.FIRE_CORAL_FAN, Blocks.FIRE_CORAL_WALL_FAN, new Item.Properties().method17779(ItemGroup.field31666))
   );
   public static final Item field37743 = register(
      new Class3298(Blocks.HORN_CORAL_FAN, Blocks.HORN_CORAL_WALL_FAN, new Item.Properties().method17779(ItemGroup.field31666))
   );
   public static final Item field37744 = register(
      new Class3298(Blocks.DEAD_TUBE_CORAL_FAN, Blocks.DEAD_TUBE_CORAL_WALL_FAN, new Item.Properties().method17779(ItemGroup.field31666))
   );
   public static final Item field37745 = register(
      new Class3298(Blocks.DEAD_BRAIN_CORAL_FAN, Blocks.DEAD_BRAIN_CORAL_WALL_FAN, new Item.Properties().method17779(ItemGroup.field31666))
   );
   public static final Item field37746 = register(
      new Class3298(Blocks.DEAD_BUBBLE_CORAL_FAN, Blocks.DEAD_BUBBLE_CORAL_WALL_FAN, new Item.Properties().method17779(ItemGroup.field31666))
   );
   public static final Item field37747 = register(
      new Class3298(Blocks.DEAD_FIRE_CORAL_FAN, Blocks.DEAD_FIRE_CORAL_WALL_FAN, new Item.Properties().method17779(ItemGroup.field31666))
   );
   public static final Item field37748 = register(
      new Class3298(Blocks.DEAD_HORN_CORAL_FAN, Blocks.DEAD_HORN_CORAL_WALL_FAN, new Item.Properties().method17779(ItemGroup.field31666))
   );
   public static final Item field37749 = registerBlockItem(Blocks.BLUE_ICE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37750 = register(
      new BlockItem(Blocks.CONDUIT, new Item.Properties().method17779(ItemGroup.field31669).method17780(Class1978.field12887))
   );
   public static final Item field37751 = registerBlockItem(Blocks.POLISHED_GRANITE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37752 = registerBlockItem(Blocks.SMOOTH_RED_SANDSTONE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37753 = registerBlockItem(Blocks.MOSSY_STONE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37754 = registerBlockItem(Blocks.POLISHED_DIORITE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37755 = registerBlockItem(Blocks.MOSSY_COBBLESTONE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37756 = registerBlockItem(Blocks.END_STONE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37757 = registerBlockItem(Blocks.STONE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37758 = registerBlockItem(Blocks.SMOOTH_SANDSTONE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37759 = registerBlockItem(Blocks.SMOOTH_QUARTZ_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37760 = registerBlockItem(Blocks.GRANITE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37761 = registerBlockItem(Blocks.ANDESITE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37762 = registerBlockItem(Blocks.RED_NETHER_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37763 = registerBlockItem(Blocks.POLISHED_ANDESITE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37764 = registerBlockItem(Blocks.DIORITE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37765 = registerBlockItem(Blocks.POLISHED_GRANITE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37766 = registerBlockItem(Blocks.SMOOTH_RED_SANDSTONE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37767 = registerBlockItem(Blocks.MOSSY_STONE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37768 = registerBlockItem(Blocks.POLISHED_DIORITE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37769 = registerBlockItem(Blocks.MOSSY_COBBLESTONE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37770 = registerBlockItem(Blocks.END_STONE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37771 = registerBlockItem(Blocks.SMOOTH_SANDSTONE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37772 = registerBlockItem(Blocks.SMOOTH_QUARTZ_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37773 = registerBlockItem(Blocks.GRANITE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37774 = registerBlockItem(Blocks.ANDESITE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37775 = registerBlockItem(Blocks.RED_NETHER_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37776 = registerBlockItem(Blocks.POLISHED_ANDESITE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37777 = registerBlockItem(Blocks.DIORITE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37778 = register(new Class3294(Blocks.SCAFFOLDING, new Item.Properties().method17779(ItemGroup.field31666)));
   public static final Item field37779 = register(new Class3295(Blocks.IRON_DOOR, new Item.Properties().method17779(ItemGroup.REDSTONE)));
   public static final Item field37780 = register(new Class3295(Blocks.OAK_DOOR, new Item.Properties().method17779(ItemGroup.REDSTONE)));
   public static final Item field37781 = register(new Class3295(Blocks.SPRUCE_DOOR, new Item.Properties().method17779(ItemGroup.REDSTONE)));
   public static final Item field37782 = register(new Class3295(Blocks.BIRCH_DOOR, new Item.Properties().method17779(ItemGroup.REDSTONE)));
   public static final Item field37783 = register(new Class3295(Blocks.JUNGLE_DOOR, new Item.Properties().method17779(ItemGroup.REDSTONE)));
   public static final Item field37784 = register(new Class3295(Blocks.ACACIA_DOOR, new Item.Properties().method17779(ItemGroup.REDSTONE)));
   public static final Item field37785 = register(new Class3295(Blocks.DARK_OAK_DOOR, new Item.Properties().method17779(ItemGroup.REDSTONE)));
   public static final Item field37786 = register(new Class3295(Blocks.CRIMSON_DOOR, new Item.Properties().method17779(ItemGroup.REDSTONE)));
   public static final Item field37787 = register(new Class3295(Blocks.WARPED_DOOR, new Item.Properties().method17779(ItemGroup.REDSTONE)));
   public static final Item field37788 = registerBlockItem(Blocks.REPEATER, ItemGroup.REDSTONE);
   public static final Item field37789 = registerBlockItem(Blocks.COMPARATOR, ItemGroup.REDSTONE);
   public static final Item field37790 = register(new Class3293(Blocks.STRUCTURE_BLOCK, new Item.Properties().method17780(Class1978.field12888)));
   public static final Item field37791 = register(new Class3293(Blocks.JIGSAW, new Item.Properties().method17780(Class1978.field12888)));
   public static final Item field37792 = method30157(
      "turtle_helmet", new ArmorItem(Class2114.field13778, EquipmentSlotType.HEAD, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item field37793 = method30157("scute", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37794 = method30157("flint_and_steel", new Class3281(new Item.Properties().method17777(64).method17779(ItemGroup.TOOLS)));
   public static final Item APPLE = method30157(
      "apple", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39058))
   );
   public static final Item BOW = method30157("bow", new BowItem(new Item.Properties().method17777(384).method17779(ItemGroup.COMBAT)));
   public static final Item field37797 = method30157("arrow", new Class3308(new Item.Properties().method17779(ItemGroup.COMBAT)));
   public static final Item field37798 = method30157("coal", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37799 = method30157("charcoal", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37800 = method30157("diamond", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37801 = method30157("iron_ingot", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37802 = method30157("gold_ingot", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37803 = method30157("netherite_ingot", new Item(new Item.Properties().method17779(ItemGroup.field31675).method17781()));
   public static final Item field37804 = method30157("netherite_scrap", new Item(new Item.Properties().method17779(ItemGroup.field31675).method17781()));
   public static final Item field37805 = method30157(
      "wooden_sword", new SwordItem(Class2282.field15104, 3, -2.4F, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item field37806 = method30157(
      "wooden_shovel", new HoeItem(Class2282.field15104, 1.5F, -3.0F, new Item.Properties().method17779(ItemGroup.TOOLS))
   );
   public static final Item field37807 = method30157(
      "wooden_pickaxe", new Class3268(Class2282.field15104, 1, -2.8F, new Item.Properties().method17779(ItemGroup.TOOLS))
   );
   public static final Item field37808 = method30157(
      "wooden_axe", new Class3265(Class2282.field15104, 6.0F, -3.2F, new Item.Properties().method17779(ItemGroup.TOOLS))
   );
   public static final Item field37809 = method30157(
      "wooden_hoe", new Class3269(Class2282.field15104, 0, -3.0F, new Item.Properties().method17779(ItemGroup.TOOLS))
   );
   public static final Item field37810 = method30157(
      "stone_sword", new SwordItem(Class2282.field15105, 3, -2.4F, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item field37811 = method30157(
      "stone_shovel", new HoeItem(Class2282.field15105, 1.5F, -3.0F, new Item.Properties().method17779(ItemGroup.TOOLS))
   );
   public static final Item field37812 = method30157(
      "stone_pickaxe", new Class3268(Class2282.field15105, 1, -2.8F, new Item.Properties().method17779(ItemGroup.TOOLS))
   );
   public static final Item field37813 = method30157(
      "stone_axe", new Class3265(Class2282.field15105, 7.0F, -3.2F, new Item.Properties().method17779(ItemGroup.TOOLS))
   );
   public static final Item field37814 = method30157(
      "stone_hoe", new Class3269(Class2282.field15105, -1, -2.0F, new Item.Properties().method17779(ItemGroup.TOOLS))
   );
   public static final Item GOLDEN_SWORD = method30157(
      "golden_sword", new SwordItem(Class2282.field15108, 3, -2.4F, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item field37816 = method30157(
      "golden_shovel", new HoeItem(Class2282.field15108, 1.5F, -3.0F, new Item.Properties().method17779(ItemGroup.TOOLS))
   );
   public static final Item field37817 = method30157(
      "golden_pickaxe", new Class3268(Class2282.field15108, 1, -2.8F, new Item.Properties().method17779(ItemGroup.TOOLS))
   );
   public static final Item field37818 = method30157(
      "golden_axe", new Class3265(Class2282.field15108, 6.0F, -3.0F, new Item.Properties().method17779(ItemGroup.TOOLS))
   );
   public static final Item field37819 = method30157(
      "golden_hoe", new Class3269(Class2282.field15108, 0, -3.0F, new Item.Properties().method17779(ItemGroup.TOOLS))
   );
   public static final Item field37820 = method30157(
      "iron_sword", new SwordItem(Class2282.field15106, 3, -2.4F, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item IRON_SHOVEL = method30157(
      "iron_shovel", new HoeItem(Class2282.field15106, 1.5F, -3.0F, new Item.Properties().method17779(ItemGroup.TOOLS))
   );
   public static final Item field37822 = method30157(
      "iron_pickaxe", new Class3268(Class2282.field15106, 1, -2.8F, new Item.Properties().method17779(ItemGroup.TOOLS))
   );
   public static final Item IRON_AXE = method30157(
      "iron_axe", new Class3265(Class2282.field15106, 6.0F, -3.1F, new Item.Properties().method17779(ItemGroup.TOOLS))
   );
   public static final Item field37824 = method30157(
      "iron_hoe", new Class3269(Class2282.field15106, -2, -1.0F, new Item.Properties().method17779(ItemGroup.TOOLS))
   );
   public static final Item field37825 = method30157(
      "diamond_sword", new SwordItem(Class2282.field15107, 3, -2.4F, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item field37826 = method30157(
      "diamond_shovel", new HoeItem(Class2282.field15107, 1.5F, -3.0F, new Item.Properties().method17779(ItemGroup.TOOLS))
   );
   public static final Item field37827 = method30157(
      "diamond_pickaxe", new Class3268(Class2282.field15107, 1, -2.8F, new Item.Properties().method17779(ItemGroup.TOOLS))
   );
   public static final Item field37828 = method30157(
      "diamond_axe", new Class3265(Class2282.field15107, 5.0F, -3.0F, new Item.Properties().method17779(ItemGroup.TOOLS))
   );
   public static final Item field37829 = method30157(
      "diamond_hoe", new Class3269(Class2282.field15107, -3, 0.0F, new Item.Properties().method17779(ItemGroup.TOOLS))
   );
   public static final Item field37830 = method30157(
      "netherite_sword", new SwordItem(Class2282.field15109, 3, -2.4F, new Item.Properties().method17779(ItemGroup.COMBAT).method17781())
   );
   public static final Item field37831 = method30157(
      "netherite_shovel", new HoeItem(Class2282.field15109, 1.5F, -3.0F, new Item.Properties().method17779(ItemGroup.TOOLS).method17781())
   );
   public static final Item field37832 = method30157(
      "netherite_pickaxe", new Class3268(Class2282.field15109, 1, -2.8F, new Item.Properties().method17779(ItemGroup.TOOLS).method17781())
   );
   public static final Item field37833 = method30157(
      "netherite_axe", new Class3265(Class2282.field15109, 5.0F, -3.0F, new Item.Properties().method17779(ItemGroup.TOOLS).method17781())
   );
   public static final Item field37834 = method30157(
      "netherite_hoe", new Class3269(Class2282.field15109, -4, 0.0F, new Item.Properties().method17779(ItemGroup.TOOLS).method17781())
   );
   public static final Item field37835 = method30157("stick", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37836 = method30157("bowl", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37837 = method30157(
      "mushroom_stew", new Class3306(new Item.Properties().method17775(1).method17779(ItemGroup.field31671).method17774(Class8672.field39082))
   );
   public static final Item field37838 = method30157("string", new Class3296(Blocks.TRIPWIRE, new Item.Properties().method17779(ItemGroup.field31669)));
   public static final Item field37839 = method30157("feather", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37840 = method30157("gunpowder", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37841 = method30157("wheat_seeds", new Class3296(Blocks.WHEAT, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37842 = method30157("wheat", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37843 = method30157(
      "bread", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39063))
   );
   public static final Item field37844 = method30157(
      "leather_helmet", new Class3278(Class2114.field13773, EquipmentSlotType.HEAD, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item field37845 = method30157(
      "leather_chestplate", new Class3278(Class2114.field13773, EquipmentSlotType.CHEST, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item field37846 = method30157(
      "leather_leggings", new Class3278(Class2114.field13773, EquipmentSlotType.LEGS, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item field37847 = method30157(
      "leather_boots", new Class3278(Class2114.field13773, EquipmentSlotType.FEET, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item field37848 = method30157(
      "chainmail_helmet", new ArmorItem(Class2114.field13774, EquipmentSlotType.HEAD, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item field37849 = method30157(
      "chainmail_chestplate", new ArmorItem(Class2114.field13774, EquipmentSlotType.CHEST, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item field37850 = method30157(
      "chainmail_leggings", new ArmorItem(Class2114.field13774, EquipmentSlotType.LEGS, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item field37851 = method30157(
      "chainmail_boots", new ArmorItem(Class2114.field13774, EquipmentSlotType.FEET, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item field37852 = method30157(
      "iron_helmet", new ArmorItem(Class2114.field13775, EquipmentSlotType.HEAD, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item field37853 = method30157(
      "iron_chestplate", new ArmorItem(Class2114.field13775, EquipmentSlotType.CHEST, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item field37854 = method30157(
      "iron_leggings", new ArmorItem(Class2114.field13775, EquipmentSlotType.LEGS, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item field37855 = method30157(
      "iron_boots", new ArmorItem(Class2114.field13775, EquipmentSlotType.FEET, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item field37856 = method30157(
      "diamond_helmet", new ArmorItem(Class2114.field13777, EquipmentSlotType.HEAD, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item field37857 = method30157(
      "diamond_chestplate", new ArmorItem(Class2114.field13777, EquipmentSlotType.CHEST, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item field37858 = method30157(
      "diamond_leggings", new ArmorItem(Class2114.field13777, EquipmentSlotType.LEGS, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item field37859 = method30157(
      "diamond_boots", new ArmorItem(Class2114.field13777, EquipmentSlotType.FEET, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item field37860 = method30157(
      "golden_helmet", new ArmorItem(Class2114.field13776, EquipmentSlotType.HEAD, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item field37861 = method30157(
      "golden_chestplate", new ArmorItem(Class2114.field13776, EquipmentSlotType.CHEST, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item GOLDEN_LEGGINGS = method30157(
      "golden_leggings", new ArmorItem(Class2114.field13776, EquipmentSlotType.LEGS, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item field37863 = method30157(
      "golden_boots", new ArmorItem(Class2114.field13776, EquipmentSlotType.FEET, new Item.Properties().method17779(ItemGroup.COMBAT))
   );
   public static final Item field37864 = method30157(
      "netherite_helmet", new ArmorItem(Class2114.field13779, EquipmentSlotType.HEAD, new Item.Properties().method17779(ItemGroup.COMBAT).method17781())
   );
   public static final Item NETHERITE_CHESTPLATE = method30157(
      "netherite_chestplate", new ArmorItem(Class2114.field13779, EquipmentSlotType.CHEST, new Item.Properties().method17779(ItemGroup.COMBAT).method17781())
   );
   public static final Item field37866 = method30157(
      "netherite_leggings", new ArmorItem(Class2114.field13779, EquipmentSlotType.LEGS, new Item.Properties().method17779(ItemGroup.COMBAT).method17781())
   );
   public static final Item field37867 = method30157(
      "netherite_boots", new ArmorItem(Class2114.field13779, EquipmentSlotType.FEET, new Item.Properties().method17779(ItemGroup.COMBAT).method17781())
   );
   public static final Item field37868 = method30157("flint", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item PORKCHOP = method30157(
      "porkchop", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39085))
   );
   public static final Item field37870 = method30157(
      "cooked_porkchop", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39072))
   );
   public static final Item PAINTING = method30157("painting", new Class3312(EntityType.PAINTING, new Item.Properties().method17779(ItemGroup.field31666)));
   public static final Item GOLDEN_APPLE = method30157(
      "golden_apple", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17780(Class1978.field12887).method17774(Class8672.field39078))
   );
   public static final Item ENCHANTED_GOLDEN_APPLE = method30157(
      "enchanted_golden_apple",
      new Class3322(new Item.Properties().method17779(ItemGroup.field31671).method17780(Class1978.field12888).method17774(Class8672.field39077))
   );
   public static final Item OAK_SIGN = method30157(
      "oak_sign", new Class3300(new Item.Properties().method17775(16).method17779(ItemGroup.field31666), Blocks.OAK_SIGN, Blocks.OAK_WALL_SIGN)
   );
   public static final Item SPRUCE_SIGN = method30157(
      "spruce_sign", new Class3300(new Item.Properties().method17775(16).method17779(ItemGroup.field31666), Blocks.SPRUCE_SIGN, Blocks.SPRUCE_WALL_SIGN)
   );
   public static final Item field37876 = method30157(
      "birch_sign", new Class3300(new Item.Properties().method17775(16).method17779(ItemGroup.field31666), Blocks.BIRCH_SIGN, Blocks.BIRCH_WALL_SIGN)
   );
   public static final Item field37877 = method30157(
      "jungle_sign", new Class3300(new Item.Properties().method17775(16).method17779(ItemGroup.field31666), Blocks.JUNGLE_SIGN, Blocks.JUNGLE_WALL_SIGN)
   );
   public static final Item field37878 = method30157(
      "acacia_sign", new Class3300(new Item.Properties().method17775(16).method17779(ItemGroup.field31666), Blocks.ACACIA_SIGN, Blocks.ACACIA_WALL_SIGN)
   );
   public static final Item field37879 = method30157(
      "dark_oak_sign", new Class3300(new Item.Properties().method17775(16).method17779(ItemGroup.field31666), Blocks.DARK_OAK_SIGN, Blocks.DARK_OAK_WALL_SIGN)
   );
   public static final Item field37880 = method30157(
      "crimson_sign", new Class3300(new Item.Properties().method17775(16).method17779(ItemGroup.field31666), Blocks.CRIMSON_SIGN, Blocks.CRIMSON_WALL_SIGN)
   );
   public static final Item field37881 = method30157(
      "warped_sign", new Class3300(new Item.Properties().method17775(16).method17779(ItemGroup.field31666), Blocks.WARPED_SIGN, Blocks.WARPED_WALL_SIGN)
   );
   public static final Item BUCKET = method30157(
      "bucket", new Class3287(Fluids.EMPTY, new Item.Properties().method17775(16).method17779(ItemGroup.field31669))
   );
   public static final Item WATER_BUCKET = method30157(
      "water_bucket", new Class3287(Fluids.WATER, new Item.Properties().method17778(BUCKET).method17775(1).method17779(ItemGroup.field31669))
   );
   public static final Item LAVA_BUCKET = method30157(
      "lava_bucket", new Class3287(Fluids.LAVA, new Item.Properties().method17778(BUCKET).method17775(1).method17779(ItemGroup.field31669))
   );
   public static final Item MINECART = method30157(
      "minecart", new Class3282(MinecartType.MINECART, new Item.Properties().method17775(1).method17779(ItemGroup.field31668))
   );
   public static final Item field37886 = method30157("saddle", new Class3330(new Item.Properties().method17775(1).method17779(ItemGroup.field31668)));
   public static final Item REDSTONE_DUST = method30157("redstone", new Class3296(Blocks.REDSTONE_WIRE, new Item.Properties().method17779(ItemGroup.REDSTONE)));
   public static final Item SNOWBALL = method30157("snowball", new Class3333(new Item.Properties().method17775(16).method17779(ItemGroup.field31669)));
   public static final Item OAK_BOAT = method30157(
      "oak_boat", new Class3305(Class2099.field13680, new Item.Properties().method17775(1).method17779(ItemGroup.field31668))
   );
   public static final Item LEATHER = method30157("leather", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item MILK_BUCKET = method30157(
      "milk_bucket", new Class3274(new Item.Properties().method17778(BUCKET).method17775(1).method17779(ItemGroup.field31669))
   );
   public static final Item field37892 = method30157(
      "pufferfish_bucket", new Class3288(EntityType.PUFFERFISH, Fluids.WATER, new Item.Properties().method17775(1).method17779(ItemGroup.field31669))
   );
   public static final Item SALMON_BUCKET = method30157(
      "salmon_bucket", new Class3288(EntityType.SALMON, Fluids.WATER, new Item.Properties().method17775(1).method17779(ItemGroup.field31669))
   );
   public static final Item field37894 = method30157(
      "cod_bucket", new Class3288(EntityType.COD, Fluids.WATER, new Item.Properties().method17775(1).method17779(ItemGroup.field31669))
   );
   public static final Item field37895 = method30157(
      "tropical_fish_bucket", new Class3288(EntityType.TROPICAL_FISH, Fluids.WATER, new Item.Properties().method17775(1).method17779(ItemGroup.field31669))
   );
   public static final Item field37896 = method30157("brick", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37897 = method30157("clay_ball", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37898 = registerBlockItem(Blocks.DRIED_KELP_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37899 = method30157("paper", new Item(new Item.Properties().method17779(ItemGroup.field31669)));
   public static final Item field37900 = method30157("book", new Class3337(new Item.Properties().method17779(ItemGroup.field31669)));
   public static final Item field37901 = method30157("slime_ball", new Item(new Item.Properties().method17779(ItemGroup.field31669)));
   public static final Item CHEST_MINECART = method30157(
      "chest_minecart", new Class3282(MinecartType.CHEST, new Item.Properties().method17775(1).method17779(ItemGroup.field31668))
   );
   public static final Item FURNACE_MINECART = method30157(
      "furnace_minecart", new Class3282(MinecartType.FURNACE, new Item.Properties().method17775(1).method17779(ItemGroup.field31668))
   );
   public static final Item EGG = method30157("egg", new Class3319(new Item.Properties().method17775(16).method17779(ItemGroup.field31675)));
   public static final Item COMPASS = method30157("compass", new Class3271(new Item.Properties().method17779(ItemGroup.TOOLS)));
   public static final Item field37906 = method30157("fishing_rod", new Class3259(new Item.Properties().method17777(64).method17779(ItemGroup.TOOLS)));
   public static final Item field37907 = method30157("clock", new Item(new Item.Properties().method17779(ItemGroup.TOOLS)));
   public static final Item field37908 = method30157("glowstone_dust", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37909 = method30157(
      "cod", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39067))
   );
   public static final Item field37910 = method30157(
      "salmon", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39092))
   );
   public static final Item field37911 = method30157(
      "tropical_fish", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39096))
   );
   public static final Item field37912 = method30157(
      "pufferfish", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39087))
   );
   public static final Item field37913 = method30157(
      "cooked_cod", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39070))
   );
   public static final Item field37914 = method30157(
      "cooked_salmon", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39074))
   );
   public static final Item field37915 = method30157("ink_sac", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37916 = method30157("cocoa_beans", new Class3296(Blocks.COCOA, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37917 = method30157("lapis_lazuli", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37918 = method30157("white_dye", new Class3321(DyeColor.field386, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37919 = method30157("orange_dye", new Class3321(DyeColor.field387, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37920 = method30157("magenta_dye", new Class3321(DyeColor.field388, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37921 = method30157("light_blue_dye", new Class3321(DyeColor.field389, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37922 = method30157("yellow_dye", new Class3321(DyeColor.field390, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37923 = method30157("lime_dye", new Class3321(DyeColor.field391, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37924 = method30157("pink_dye", new Class3321(DyeColor.field392, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37925 = method30157("gray_dye", new Class3321(DyeColor.field393, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37926 = method30157("light_gray_dye", new Class3321(DyeColor.field394, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37927 = method30157("cyan_dye", new Class3321(DyeColor.field395, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37928 = method30157("purple_dye", new Class3321(DyeColor.field396, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37929 = method30157("blue_dye", new Class3321(DyeColor.field397, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37930 = method30157("brown_dye", new Class3321(DyeColor.field398, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37931 = method30157("green_dye", new Class3321(DyeColor.field399, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37932 = method30157("red_dye", new Class3321(DyeColor.field400, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37933 = method30157("black_dye", new Class3321(DyeColor.field401, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37934 = method30157("bone_meal", new Class3336(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37935 = method30157("bone", new Item(new Item.Properties().method17779(ItemGroup.field31669)));
   public static final Item field37936 = method30157("sugar", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37937 = register(new BlockItem(Blocks.CAKE, new Item.Properties().method17775(1).method17779(ItemGroup.field31671)));
   public static final Item field37938 = register(new Class3297(Blocks.WHITE_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37939 = register(new Class3297(Blocks.ORANGE_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37940 = register(new Class3297(Blocks.MAGENTA_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37941 = register(new Class3297(Blocks.LIGHT_BLUE_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37942 = register(new Class3297(Blocks.YELLOW_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37943 = register(new Class3297(Blocks.LIME_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37944 = register(new Class3297(Blocks.PINK_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37945 = register(new Class3297(Blocks.GRAY_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37946 = register(new Class3297(Blocks.LIGHT_GRAY_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37947 = register(new Class3297(Blocks.CYAN_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37948 = register(new Class3297(Blocks.PURPLE_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37949 = register(new Class3297(Blocks.BLUE_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37950 = register(new Class3297(Blocks.BROWN_RED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37951 = register(new Class3297(Blocks.GREEN_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37952 = register(new Class3297(Blocks.RED_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37953 = register(new Class3297(Blocks.BLACK_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37954 = method30157(
      "cookie", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39075))
   );
   public static final Item field37955 = method30157("filled_map", new Class3316(new Item.Properties()));
   public static final Item field37956 = method30157("shears", new Class3331(new Item.Properties().method17777(238).method17779(ItemGroup.TOOLS)));
   public static final Item field37957 = method30157(
      "melon_slice", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39081))
   );
   public static final Item field37958 = method30157(
      "dried_kelp", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39076))
   );
   public static final Item field37959 = method30157(
      "pumpkin_seeds", new Class3296(Blocks.PUMPKIN_STEM, new Item.Properties().method17779(ItemGroup.field31675))
   );
   public static final Item field37960 = method30157("melon_seeds", new Class3296(Blocks.MELON_STEM, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37961 = method30157(
      "beef", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39060))
   );
   public static final Item field37962 = method30157(
      "cooked_beef", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39068))
   );
   public static final Item field37963 = method30157(
      "chicken", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39065))
   );
   public static final Item field37964 = method30157(
      "cooked_chicken", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39069))
   );
   public static final Item field37965 = method30157(
      "rotten_flesh", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39091))
   );
   public static final Item ENDER_PEARL = method30157("ender_pearl", new Class3335(new Item.Properties().method17775(16).method17779(ItemGroup.field31669)));
   public static final Item field37967 = method30157("blaze_rod", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37968 = method30157("ghast_tear", new Item(new Item.Properties().method17779(ItemGroup.field31674)));
   public static final Item field37969 = method30157("gold_nugget", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37970 = method30157("nether_wart", new Class3296(Blocks.NETHER_WART, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37971 = method30157("potion", new Class3323(new Item.Properties().method17775(1).method17779(ItemGroup.field31674)));
   public static final Item field37972 = method30157("glass_bottle", new Class3328(new Item.Properties().method17779(ItemGroup.field31674)));
   public static final Item field37973 = method30157(
      "spider_eye", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39093))
   );
   public static final Item field37974 = method30157("fermented_spider_eye", new Item(new Item.Properties().method17779(ItemGroup.field31674)));
   public static final Item field37975 = method30157("blaze_powder", new Item(new Item.Properties().method17779(ItemGroup.field31674)));
   public static final Item field37976 = method30157("magma_cream", new Item(new Item.Properties().method17779(ItemGroup.field31674)));
   public static final Item field37977 = registerBlockItem(Blocks.BREWING_STAND, ItemGroup.field31674);
   public static final Item field37978 = registerBlockItem(Blocks.CAULDRON, ItemGroup.field31674);
   public static final Item field37979 = method30157("ender_eye", new Class3341(new Item.Properties().method17779(ItemGroup.field31669)));
   public static final Item field37980 = method30157("glistering_melon_slice", new Item(new Item.Properties().method17779(ItemGroup.field31674)));
   public static final Item field37981 = method30157(
      "bat_spawn_egg", new SpawnEggItem(EntityType.BAT, 4996656, 986895, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field37982 = method30157(
      "bee_spawn_egg", new SpawnEggItem(EntityType.BEE, 15582019, 4400155, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field37983 = method30157(
      "blaze_spawn_egg", new SpawnEggItem(EntityType.BLAZE, 16167425, 16775294, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field37984 = method30157(
      "cat_spawn_egg", new SpawnEggItem(EntityType.CAT, 15714446, 9794134, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field37985 = method30157(
      "cave_spider_spawn_egg", new SpawnEggItem(EntityType.CAVE_SPIDER, 803406, 11013646, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field37986 = method30157(
      "chicken_spawn_egg", new SpawnEggItem(EntityType.CHICKEN, 10592673, 16711680, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field37987 = method30157(
      "cod_spawn_egg", new SpawnEggItem(EntityType.COD, 12691306, 15058059, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field37988 = method30157(
      "cow_spawn_egg", new SpawnEggItem(EntityType.COW, 4470310, 10592673, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field37989 = method30157(
      "creeper_spawn_egg", new SpawnEggItem(EntityType.CREEPER, 894731, 0, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field37990 = method30157(
      "dolphin_spawn_egg", new SpawnEggItem(EntityType.DOLPHIN, 2243405, 16382457, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field37991 = method30157(
      "donkey_spawn_egg", new SpawnEggItem(EntityType.DONKEY, 5457209, 8811878, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field37992 = method30157(
      "drowned_spawn_egg", new SpawnEggItem(EntityType.DROWNED, 9433559, 7969893, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field37993 = method30157(
      "elder_guardian_spawn_egg", new SpawnEggItem(EntityType.ELDER_GUARDIAN, 13552826, 7632531, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field37994 = method30157(
      "enderman_spawn_egg", new SpawnEggItem(EntityType.ENDERMAN, 1447446, 0, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field37995 = method30157(
      "endermite_spawn_egg", new SpawnEggItem(EntityType.ENDERMITE, 1447446, 7237230, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field37996 = method30157(
      "evoker_spawn_egg", new SpawnEggItem(EntityType.EVOKER, 9804699, 1973274, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field37997 = method30157(
      "fox_spawn_egg", new SpawnEggItem(EntityType.FOX, 14005919, 13396256, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field37998 = method30157(
      "ghast_spawn_egg", new SpawnEggItem(EntityType.GHAST, 16382457, 12369084, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field37999 = method30157(
      "guardian_spawn_egg", new SpawnEggItem(EntityType.GUARDIAN, 5931634, 15826224, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38000 = method30157(
      "hoglin_spawn_egg", new SpawnEggItem(EntityType.HOGLIN, 13004373, 6251620, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38001 = method30157(
      "horse_spawn_egg", new SpawnEggItem(EntityType.HORSE, 12623485, 15656192, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38002 = method30157(
      "husk_spawn_egg", new SpawnEggItem(EntityType.HUSK, 7958625, 15125652, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38003 = method30157(
      "llama_spawn_egg", new SpawnEggItem(EntityType.LLAMA, 12623485, 10051392, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38004 = method30157(
      "magma_cube_spawn_egg", new SpawnEggItem(EntityType.MAGMA_CUBE, 3407872, 16579584, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38005 = method30157(
      "mooshroom_spawn_egg", new SpawnEggItem(EntityType.MOOSHROOM, 10489616, 12040119, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38006 = method30157(
      "mule_spawn_egg", new SpawnEggItem(EntityType.MULE, 1769984, 5321501, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38007 = method30157(
      "ocelot_spawn_egg", new SpawnEggItem(EntityType.OCELOT, 15720061, 5653556, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38008 = method30157(
      "panda_spawn_egg", new SpawnEggItem(EntityType.PANDA, 15198183, 1776418, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38009 = method30157(
      "parrot_spawn_egg", new SpawnEggItem(EntityType.PARROT, 894731, 16711680, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38010 = method30157(
      "phantom_spawn_egg", new SpawnEggItem(EntityType.PHANTOM, 4411786, 8978176, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38011 = method30157(
      "pig_spawn_egg", new SpawnEggItem(EntityType.PIG, 15771042, 14377823, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38012 = method30157(
      "piglin_spawn_egg", new SpawnEggItem(EntityType.PIGLIN, 10051392, 16380836, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38013 = method30157(
      "piglin_brute_spawn_egg", new SpawnEggItem(EntityType.PIGLIN_BRUTE, 5843472, 16380836, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38014 = method30157(
      "pillager_spawn_egg", new SpawnEggItem(EntityType.PILLAGER, 5451574, 9804699, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38015 = method30157(
      "polar_bear_spawn_egg", new SpawnEggItem(EntityType.POLAR_BEAR, 15921906, 9803152, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38016 = method30157(
      "pufferfish_spawn_egg", new SpawnEggItem(EntityType.PUFFERFISH, 16167425, 3654642, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38017 = method30157(
      "rabbit_spawn_egg", new SpawnEggItem(EntityType.RABBIT, 10051392, 7555121, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38018 = method30157(
      "ravager_spawn_egg", new SpawnEggItem(EntityType.RAVAGER, 7697520, 5984329, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38019 = method30157(
      "salmon_spawn_egg", new SpawnEggItem(EntityType.SALMON, 10489616, 951412, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38020 = method30157(
      "sheep_spawn_egg", new SpawnEggItem(EntityType.SHEEP, 15198183, 16758197, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38021 = method30157(
      "shulker_spawn_egg", new SpawnEggItem(EntityType.SHULKER, 9725844, 5060690, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38022 = method30157(
      "silverfish_spawn_egg", new SpawnEggItem(EntityType.SILVERFISH, 7237230, 3158064, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38023 = method30157(
      "skeleton_spawn_egg", new SpawnEggItem(EntityType.SKELETON, 12698049, 4802889, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38024 = method30157(
      "skeleton_horse_spawn_egg", new SpawnEggItem(EntityType.SKELETON_HORSE, 6842447, 15066584, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38025 = method30157(
      "slime_spawn_egg", new SpawnEggItem(EntityType.SLIME, 5349438, 8306542, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38026 = method30157(
      "spider_spawn_egg", new SpawnEggItem(EntityType.SPIDER, 3419431, 11013646, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38027 = method30157(
      "squid_spawn_egg", new SpawnEggItem(EntityType.SQUID, 2243405, 7375001, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38028 = method30157(
      "stray_spawn_egg", new SpawnEggItem(EntityType.STRAY, 6387319, 14543594, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38029 = method30157(
      "strider_spawn_egg", new SpawnEggItem(EntityType.STRIDER, 10236982, 5065037, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38030 = method30157(
      "trader_llama_spawn_egg", new SpawnEggItem(EntityType.TRADER_LLAMA, 15377456, 4547222, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38031 = method30157(
      "tropical_fish_spawn_egg", new SpawnEggItem(EntityType.TROPICAL_FISH, 15690005, 16775663, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38032 = method30157(
      "turtle_spawn_egg", new SpawnEggItem(EntityType.TURTLE, 15198183, 44975, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38033 = method30157(
      "vex_spawn_egg", new SpawnEggItem(EntityType.VEX, 8032420, 15265265, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38034 = method30157(
      "villager_spawn_egg", new SpawnEggItem(EntityType.VILLAGER, 5651507, 12422002, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38035 = method30157(
      "vindicator_spawn_egg", new SpawnEggItem(EntityType.VINDICATOR, 9804699, 2580065, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38036 = method30157(
      "wandering_trader_spawn_egg", new SpawnEggItem(EntityType.WANDERING_TRADER, 4547222, 15377456, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38037 = method30157(
      "witch_spawn_egg", new SpawnEggItem(EntityType.WITCH, 3407872, 5349438, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38038 = method30157(
      "wither_skeleton_spawn_egg", new SpawnEggItem(EntityType.WITHER_SKELETON, 1315860, 4672845, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38039 = method30157(
      "wolf_spawn_egg", new SpawnEggItem(EntityType.WOLF, 14144467, 13545366, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38040 = method30157(
      "zoglin_spawn_egg", new SpawnEggItem(EntityType.ZOGLIN, 13004373, 15132390, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38041 = method30157(
      "zombie_spawn_egg", new SpawnEggItem(EntityType.ZOMBIE, 44975, 7969893, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38042 = method30157(
      "zombie_horse_spawn_egg", new SpawnEggItem(EntityType.ZOMBIE_HORSE, 3232308, 9945732, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38043 = method30157(
      "zombie_villager_spawn_egg", new SpawnEggItem(EntityType.ZOMBIE_VILLAGER, 5651507, 7969893, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item field38044 = method30157(
      "zombified_piglin_spawn_egg", new SpawnEggItem(EntityType.ZOMBIFIED_PIGLIN, 15373203, 5009705, new Item.Properties().method17779(ItemGroup.field31669))
   );
   public static final Item EXPERIENCE_BOTTLE = method30157(
      "experience_bottle", new Class3304(new Item.Properties().method17779(ItemGroup.field31669).method17780(Class1978.field12886))
   );
   public static final Item field38046 = method30157("fire_charge", new Class3273(new Item.Properties().method17779(ItemGroup.field31669)));
   public static final Item field38047 = method30157("writable_book", new Class3291(new Item.Properties().method17775(1).method17779(ItemGroup.field31669)));
   public static final Item field38048 = method30157("written_book", new Class3285(new Item.Properties().method17775(16)));
   public static final Item EMERALD = method30157("emerald", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item ITEM_FRAME = method30157("item_frame", new Class3313(new Item.Properties().method17779(ItemGroup.field31666)));
   public static final Item field38051 = registerBlockItem(Blocks.FLOWER_POT, ItemGroup.field31666);
   public static final Item field38052 = method30157(
      "carrot", new Class3296(Blocks.CARROTS, new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39064))
   );
   public static final Item field38053 = method30157(
      "potato", new Class3296(Blocks.POTATOES, new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39086))
   );
   public static final Item field38054 = method30157(
      "baked_potato", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39059))
   );
   public static final Item field38055 = method30157(
      "poisonous_potato", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39084))
   );
   public static final Item field38056 = method30157("map", new Class3315(new Item.Properties().method17779(ItemGroup.field31669)));
   public static final Item field38057 = method30157(
      "golden_carrot", new Item(new Item.Properties().method17779(ItemGroup.field31674).method17774(Class8672.field39079))
   );
   public static final Item field38058 = register(
      new Class3298(Blocks.SKELETON_SKULL, Blocks.SKELETON_WALL_SKULL, new Item.Properties().method17779(ItemGroup.field31666).method17780(Class1978.field12886))
   );
   public static final Item field38059 = register(
      new Class3298(Blocks.WITHER_SKELETON_SKULL, Blocks.WITHER_SKELETON_WALL_SKULL, new Item.Properties().method17779(ItemGroup.field31666).method17780(Class1978.field12886))
   );
   public static final Item field38060 = register(
      new SkullItem(Blocks.PLAYER_HEAD, Blocks.PLAYER_WALL_HEAD, new Item.Properties().method17779(ItemGroup.field31666).method17780(Class1978.field12886))
   );
   public static final Item field38061 = register(
      new Class3298(Blocks.ZOMBIE_HEAD, Blocks.ZOMBIE_WALL_HEAD, new Item.Properties().method17779(ItemGroup.field31666).method17780(Class1978.field12886))
   );
   public static final Item field38062 = register(
      new Class3298(Blocks.CREEPER_HEAD, Blocks.CREEPER_WALL_HEAD, new Item.Properties().method17779(ItemGroup.field31666).method17780(Class1978.field12886))
   );
   public static final Item field38063 = register(
      new Class3298(Blocks.HEAD, Blocks.DRAGON_WALL_HEAD, new Item.Properties().method17779(ItemGroup.field31666).method17780(Class1978.field12886))
   );
   public static final Item field38064 = method30157(
      "carrot_on_a_stick", new Class3317<PigEntity>(new Item.Properties().method17777(25).method17779(ItemGroup.field31668), EntityType.PIG, 7)
   );
   public static final Item field38065 = method30157(
      "warped_fungus_on_a_stick", new Class3317<StriderEntity>(new Item.Properties().method17777(100).method17779(ItemGroup.field31668), EntityType.STRIDER, 1)
   );
   public static final Item field38066 = method30157(
      "nether_star", new Class3332(new Item.Properties().method17779(ItemGroup.field31675).method17780(Class1978.field12886))
   );
   public static final Item field38067 = method30157(
      "pumpkin_pie", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39088))
   );
   public static final Item field38068 = method30157("firework_rocket", new Class3318(new Item.Properties().method17779(ItemGroup.field31669)));
   public static final Item field38069 = method30157("firework_star", new Class3320(new Item.Properties().method17779(ItemGroup.field31669)));
   public static final Item field38070 = method30157("enchanted_book", new Class3290(new Item.Properties().method17775(1).method17780(Class1978.field12886)));
   public static final Item field38071 = method30157("nether_brick", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field38072 = method30157("quartz", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item TNT_MINECART = method30157(
      "tnt_minecart", new Class3282(MinecartType.TNT, new Item.Properties().method17775(1).method17779(ItemGroup.field31668))
   );
   public static final Item HOPPER_MINECART = method30157(
      "hopper_minecart", new Class3282(MinecartType.HOPPER, new Item.Properties().method17775(1).method17779(ItemGroup.field31668))
   );
   public static final Item field38075 = method30157("prismarine_shard", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field38076 = method30157("prismarine_crystals", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field38077 = method30157(
      "rabbit", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39089))
   );
   public static final Item field38078 = method30157(
      "cooked_rabbit", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39073))
   );
   public static final Item field38079 = method30157(
      "rabbit_stew", new Class3306(new Item.Properties().method17775(1).method17779(ItemGroup.field31671).method17774(Class8672.field39090))
   );
   public static final Item field38080 = method30157("rabbit_foot", new Item(new Item.Properties().method17779(ItemGroup.field31674)));
   public static final Item field38081 = method30157("rabbit_hide", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item ARMOR_STAND = method30157("armor_stand", new Class3289(new Item.Properties().method17775(16).method17779(ItemGroup.field31666)));
   public static final Item field38083 = method30157(
      "iron_horse_armor", new Class3275(5, "iron", new Item.Properties().method17775(1).method17779(ItemGroup.field31669))
   );
   public static final Item field38084 = method30157(
      "golden_horse_armor", new Class3275(7, "gold", new Item.Properties().method17775(1).method17779(ItemGroup.field31669))
   );
   public static final Item field38085 = method30157(
      "diamond_horse_armor", new Class3275(11, "diamond", new Item.Properties().method17775(1).method17779(ItemGroup.field31669))
   );
   public static final Item field38086 = method30157(
      "leather_horse_armor", new Class3276(3, "leather", new Item.Properties().method17775(1).method17779(ItemGroup.field31669))
   );
   public static final Item LEAD = method30157("lead", new Class3329(new Item.Properties().method17779(ItemGroup.TOOLS)));
   public static final Item field38088 = method30157("name_tag", new Class3327(new Item.Properties().method17779(ItemGroup.TOOLS)));
   public static final Item COMMAND_BLOCK_MINECART = method30157("command_block_minecart", new Class3282(MinecartType.COMMAND_BLOCK, new Item.Properties().method17775(1)));
   public static final Item field38090 = method30157(
      "mutton", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39083))
   );
   public static final Item field38091 = method30157(
      "cooked_mutton", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39071))
   );
   public static final Item field38092 = method30157(
      "white_banner", new Class3301(Blocks.WHITE_BANNER, Blocks.WHITE_WALL_BANNER, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38093 = method30157(
      "orange_banner", new Class3301(Blocks.ORANGE_BANNER, Blocks.ORANGE_WALL_BANNER, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38094 = method30157(
      "magenta_banner", new Class3301(Blocks.MAGENTA_BANNER, Blocks.MAGENTA_WALL_BANNER, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38095 = method30157(
      "light_blue_banner", new Class3301(Blocks.LIGHT_BLUE_BANNER, Blocks.LIGHT_BLUE_WALL_BANNER, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38096 = method30157(
      "yellow_banner", new Class3301(Blocks.YELLOW_BANNER, Blocks.YELLOW_WALL_BANNER, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38097 = method30157(
      "lime_banner", new Class3301(Blocks.LIME_BANNER, Blocks.LIME_WALL_BANNER, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38098 = method30157(
      "pink_banner", new Class3301(Blocks.PINK_BANNER, Blocks.PINK_WALL_BANNER, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38099 = method30157(
      "gray_banner", new Class3301(Blocks.GRAY_BANNER, Blocks.GRAY_WALL_BANNER, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38100 = method30157(
      "light_gray_banner", new Class3301(Blocks.LIGHT_GRAY_BANNER, Blocks.LIGHT_GRAY_WALL_BANNER, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38101 = method30157(
      "cyan_banner", new Class3301(Blocks.CYAN_BANNER, Blocks.CYAN_WALL_BANNER, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38102 = method30157(
      "purple_banner", new Class3301(Blocks.PURPLE_BANNER, Blocks.PURPLE_WALL_BANNER, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38103 = method30157(
      "blue_banner", new Class3301(Blocks.BLUE_BANNER, Blocks.BLUE_WALL_BANNER, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38104 = method30157(
      "brown_banner", new Class3301(Blocks.BROWN_BANNER, Blocks.BROWN_WALL_BANNER, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38105 = method30157(
      "green_banner", new Class3301(Blocks.GREEN_BANNER, Blocks.GREEN_WALL_BANNER, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38106 = method30157(
      "red_banner", new Class3301(Blocks.RED_BANNER, Blocks.RED_WALL_BANNER, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38107 = method30157(
      "black_banner", new Class3301(Blocks.BLACK_BANNER, Blocks.BLACK_WALL_BANNER, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item END_CRYSTAL = method30157(
      "end_crystal", new Class3340(new Item.Properties().method17779(ItemGroup.field31666).method17780(Class1978.field12887))
   );
   public static final Item field38109 = method30157(
      "chorus_fruit", new Class3338(new Item.Properties().method17779(ItemGroup.field31675).method17774(Class8672.field39066))
   );
   public static final Item field38110 = method30157("popped_chorus_fruit", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field38111 = method30157(
      "beetroot", new Item(new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39061))
   );
   public static final Item field38112 = method30157(
      "beetroot_seeds", new Class3296(Blocks.BEETROOTS, new Item.Properties().method17779(ItemGroup.field31675))
   );
   public static final Item field38113 = method30157(
      "beetroot_soup", new Class3306(new Item.Properties().method17775(1).method17779(ItemGroup.field31671).method17774(Class8672.field39062))
   );
   public static final Item field38114 = method30157(
      "dragon_breath", new Item(new Item.Properties().method17778(field37972).method17779(ItemGroup.field31674).method17780(Class1978.field12886))
   );
   public static final Item SPLASH_POTION = method30157("splash_potion", new Class3326(new Item.Properties().method17775(1).method17779(ItemGroup.field31674)));
   public static final Item field38116 = method30157("spectral_arrow", new Class3310(new Item.Properties().method17779(ItemGroup.COMBAT)));
   public static final Item field38117 = method30157("tipped_arrow", new Class3309(new Item.Properties().method17779(ItemGroup.COMBAT)));
   public static final Item field38118 = method30157("lingering_potion", new Class3325(new Item.Properties().method17775(1).method17779(ItemGroup.field31674)));
   public static final Item field38119 = method30157("shield", new ShieldItem(new Item.Properties().method17777(336).method17779(ItemGroup.COMBAT)));
   public static final Item ELYTRA = method30157(
      "elytra", new Class3256(new Item.Properties().method17777(432).method17779(ItemGroup.field31668).method17780(Class1978.field12886))
   );
   public static final Item field38121 = method30157(
      "spruce_boat", new Class3305(Class2099.field13681, new Item.Properties().method17775(1).method17779(ItemGroup.field31668))
   );
   public static final Item field38122 = method30157(
      "birch_boat", new Class3305(Class2099.field13682, new Item.Properties().method17775(1).method17779(ItemGroup.field31668))
   );
   public static final Item field38123 = method30157(
      "jungle_boat", new Class3305(Class2099.field13683, new Item.Properties().method17775(1).method17779(ItemGroup.field31668))
   );
   public static final Item field38124 = method30157(
      "acacia_boat", new Class3305(Class2099.field13684, new Item.Properties().method17775(1).method17779(ItemGroup.field31668))
   );
   public static final Item field38125 = method30157(
      "dark_oak_boat", new Class3305(Class2099.field13685, new Item.Properties().method17775(1).method17779(ItemGroup.field31668))
   );
   public static final Item TOTEM_OF_UNDYING = method30157(
      "totem_of_undying", new Item(new Item.Properties().method17775(1).method17779(ItemGroup.COMBAT).method17780(Class1978.field12886))
   );
   public static final Item field38127 = method30157("shulker_shell", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field38128 = method30157("iron_nugget", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field38129 = method30157("knowledge_book", new Class3258(new Item.Properties().method17775(1)));
   public static final Item field38130 = method30157("debug_stick", new Class3339(new Item.Properties().method17775(1)));
   public static final Item field38131 = method30157(
      "music_disc_13",
      new Class3283(1, SoundEvents.field26779, new Item.Properties().method17775(1).method17779(ItemGroup.field31669).method17780(Class1978.field12887))
   );
   public static final Item field38132 = method30157(
      "music_disc_cat",
      new Class3283(2, SoundEvents.field26781, new Item.Properties().method17775(1).method17779(ItemGroup.field31669).method17780(Class1978.field12887))
   );
   public static final Item field38133 = method30157(
      "music_disc_blocks",
      new Class3283(3, SoundEvents.field26780, new Item.Properties().method17775(1).method17779(ItemGroup.field31669).method17780(Class1978.field12887))
   );
   public static final Item field38134 = method30157(
      "music_disc_chirp",
      new Class3283(4, SoundEvents.field26782, new Item.Properties().method17775(1).method17779(ItemGroup.field31669).method17780(Class1978.field12887))
   );
   public static final Item field38135 = method30157(
      "music_disc_far",
      new Class3283(5, SoundEvents.field26783, new Item.Properties().method17775(1).method17779(ItemGroup.field31669).method17780(Class1978.field12887))
   );
   public static final Item field38136 = method30157(
      "music_disc_mall",
      new Class3283(6, SoundEvents.field26784, new Item.Properties().method17775(1).method17779(ItemGroup.field31669).method17780(Class1978.field12887))
   );
   public static final Item field38137 = method30157(
      "music_disc_mellohi",
      new Class3283(7, SoundEvents.field26785, new Item.Properties().method17775(1).method17779(ItemGroup.field31669).method17780(Class1978.field12887))
   );
   public static final Item field38138 = method30157(
      "music_disc_stal",
      new Class3283(8, SoundEvents.field26787, new Item.Properties().method17775(1).method17779(ItemGroup.field31669).method17780(Class1978.field12887))
   );
   public static final Item field38139 = method30157(
      "music_disc_strad",
      new Class3283(9, SoundEvents.field26788, new Item.Properties().method17775(1).method17779(ItemGroup.field31669).method17780(Class1978.field12887))
   );
   public static final Item field38140 = method30157(
      "music_disc_ward",
      new Class3283(10, SoundEvents.field26790, new Item.Properties().method17775(1).method17779(ItemGroup.field31669).method17780(Class1978.field12887))
   );
   public static final Item field38141 = method30157(
      "music_disc_11",
      new Class3283(11, SoundEvents.field26778, new Item.Properties().method17775(1).method17779(ItemGroup.field31669).method17780(Class1978.field12887))
   );
   public static final Item field38142 = method30157(
      "music_disc_wait",
      new Class3283(12, SoundEvents.field26789, new Item.Properties().method17775(1).method17779(ItemGroup.field31669).method17780(Class1978.field12887))
   );
   public static final Item field38143 = method30157(
      "music_disc_pigstep",
      new Class3283(13, SoundEvents.field26786, new Item.Properties().method17775(1).method17779(ItemGroup.field31669).method17780(Class1978.field12887))
   );
   public static final Item TRIDENT = method30157("trident", new Class3272(new Item.Properties().method17777(250).method17779(ItemGroup.COMBAT)));
   public static final Item field38145 = method30157("phantom_membrane", new Item(new Item.Properties().method17779(ItemGroup.field31674)));
   public static final Item field38146 = method30157("nautilus_shell", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field38147 = method30157(
      "heart_of_the_sea", new Item(new Item.Properties().method17779(ItemGroup.field31675).method17780(Class1978.field12886))
   );
   public static final Item CROSSBOW = method30157(
      "crossbow", new CrossbowItem(new Item.Properties().method17775(1).method17779(ItemGroup.COMBAT).method17777(326))
   );
   public static final Item field38149 = method30157("suspicious_stew", new Class3284(new Item.Properties().method17775(1).method17774(Class8672.field39094)));
   public static final Item field38150 = registerBlockItem(Blocks.LOOM, ItemGroup.field31666);
   public static final Item field38151 = method30157(
      "flower_banner_pattern", new Class3286(Class2154.field14120, new Item.Properties().method17775(1).method17779(ItemGroup.field31669))
   );
   public static final Item field38152 = method30157(
      "creeper_banner_pattern",
      new Class3286(Class2154.field14118, new Item.Properties().method17775(1).method17779(ItemGroup.field31669).method17780(Class1978.field12886))
   );
   public static final Item field38153 = method30157(
      "skull_banner_pattern",
      new Class3286(Class2154.field14119, new Item.Properties().method17775(1).method17779(ItemGroup.field31669).method17780(Class1978.field12886))
   );
   public static final Item field38154 = method30157(
      "mojang_banner_pattern",
      new Class3286(Class2154.field14121, new Item.Properties().method17775(1).method17779(ItemGroup.field31669).method17780(Class1978.field12888))
   );
   public static final Item field38155 = method30157(
      "globe_banner_pattern", new Class3286(Class2154.field14117, new Item.Properties().method17775(1).method17779(ItemGroup.field31669))
   );
   public static final Item field38156 = method30157(
      "piglin_banner_pattern", new Class3286(Class2154.field14122, new Item.Properties().method17775(1).method17779(ItemGroup.field31669))
   );
   public static final Item field38157 = registerBlockItem(Blocks.COMPOSTER, ItemGroup.field31666);
   public static final Item field38158 = registerBlockItem(Blocks.BARREL, ItemGroup.field31666);
   public static final Item field38159 = registerBlockItem(Blocks.SMOKER, ItemGroup.field31666);
   public static final Item field38160 = registerBlockItem(Blocks.BLAST_FURNACE, ItemGroup.field31666);
   public static final Item field38161 = registerBlockItem(Blocks.CARTOGRAPHY_TABLE, ItemGroup.field31666);
   public static final Item field38162 = registerBlockItem(Blocks.FLETCHING_TABLE, ItemGroup.field31666);
   public static final Item field38163 = registerBlockItem(Blocks.GRINDSTONE, ItemGroup.field31666);
   public static final Item field38164 = registerBlockItem(Blocks.LECTERN, ItemGroup.REDSTONE);
   public static final Item field38165 = registerBlockItem(Blocks.SMITHING_TABLE, ItemGroup.field31666);
   public static final Item field38166 = registerBlockItem(Blocks.STONECUTTER, ItemGroup.field31666);
   public static final Item field38167 = registerBlockItem(Blocks.BELL, ItemGroup.field31666);
   public static final Item field38168 = registerBlockItem(Blocks.LANTERN, ItemGroup.field31666);
   public static final Item field38169 = registerBlockItem(Blocks.SOUL_LANTERN, ItemGroup.field31666);
   public static final Item field38170 = method30157(
      "sweet_berries", new Class3296(Blocks.SWEET_BERRY_BUSH, new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39095))
   );
   public static final Item field38171 = registerBlockItem(Blocks.CAMPFIRE, ItemGroup.field31666);
   public static final Item field38172 = registerBlockItem(Blocks.SOUL_CAMPFIRE, ItemGroup.field31666);
   public static final Item field38173 = registerBlockItem(Blocks.SHROOMLIGHT, ItemGroup.field31666);
   public static final Item field38174 = method30157("honeycomb", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field38175 = registerBlockItem(Blocks.BEE_NEST, ItemGroup.field31666);
   public static final Item field38176 = registerBlockItem(Blocks.BEEHIVE, ItemGroup.field31666);
   public static final Item field38177 = method30157(
      "honey_bottle",
      new Class3307(new Item.Properties().method17778(field37972).method17774(Class8672.field39080).method17779(ItemGroup.field31671).method17775(16))
   );
   public static final Item field38178 = registerBlockItem(Blocks.HONEY_BLOCK, ItemGroup.field31666);
   public static final Item field38179 = registerBlockItem(Blocks.HONEYCOMB_BLOCK, ItemGroup.field31666);
   public static final Item field38180 = registerBlockItem(Blocks.LODESTONE, ItemGroup.field31666);
   public static final Item field38181 = register(new BlockItem(Blocks.NETHERITE_BLOCK, new Item.Properties().method17779(ItemGroup.BUILDING_BLOCKS).method17781()));
   public static final Item field38182 = register(new BlockItem(Blocks.ANCIENT_DEBRIS, new Item.Properties().method17779(ItemGroup.BUILDING_BLOCKS).method17781()));
   public static final Item field38183 = registerBlockItem(Blocks.TARGET, ItemGroup.REDSTONE);
   public static final Item field38184 = registerBlockItem(Blocks.CRYING_OBSIDIAN, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38185 = registerBlockItem(Blocks.BLACKSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38186 = registerBlockItem(Blocks.BLACKSTONE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38187 = registerBlockItem(Blocks.BLACKSTONE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38188 = registerBlockItem(Blocks.GILDED_BLACKSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38189 = registerBlockItem(Blocks.POLISHED_BLACKSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38190 = registerBlockItem(Blocks.POLISHED_BLACKSTONE_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38191 = registerBlockItem(Blocks.POLISHED_BLACKSTONE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38192 = registerBlockItem(Blocks.CHISELED_POLISHED_BLACKSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38193 = registerBlockItem(Blocks.POLISHED_BLACKSTONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38194 = registerBlockItem(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38195 = registerBlockItem(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38196 = registerBlockItem(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38197 = registerBlockItem(Blocks.RESPAWN_ANCHOR, ItemGroup.field31666);

   private static Item method30153(Block var0) {
      return register(new BlockItem(var0, new Item.Properties()));
   }

   private static Item registerBlockItem(Block var0, ItemGroup var1) {
      return register(new BlockItem(var0, new Item.Properties().method17779(var1)));
   }

   private static Item register(BlockItem var0) {
      return method30156(var0.method11845(), var0);
   }

   public static Item method30156(Block var0, Item var1) {
      return method30158(Registry.BLOCK.getKey(var0), var1);
   }

   private static Item method30157(String var0, Item var1) {
      return method30158(new ResourceLocation(var0), var1);
   }

   private static Item method30158(ResourceLocation var0, Item var1) {
      if (var1 instanceof BlockItem) {
         ((BlockItem)var1).method11846(Item.field18732, var1);
      }

      return Registry.<Item, Item>register(Registry.ITEM, var0, var1);
   }
}
