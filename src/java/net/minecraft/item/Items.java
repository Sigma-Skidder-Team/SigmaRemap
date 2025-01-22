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
   public static final Item STONE = method30154(Blocks.STONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item GRANITE = method30154(Blocks.GRANITE, ItemGroup.BUILDING_BLOCKS);
   public static final Item POLISHED_GRANITE = method30154(Blocks.POLISHED_GRANITE, ItemGroup.BUILDING_BLOCKS);
   public static final Item DIORITE = method30154(Blocks.DIORITE, ItemGroup.BUILDING_BLOCKS);
   public static final Item POLISHED_DIORITE = method30154(Blocks.POLISHED_DIORITE, ItemGroup.BUILDING_BLOCKS);
   public static final Item ANDESITE = method30154(Blocks.ANDESITE, ItemGroup.BUILDING_BLOCKS);
   public static final Item POLISHED_ANDESITE = method30154(Blocks.POLISHED_ANDESITE, ItemGroup.BUILDING_BLOCKS);
   public static final Item GRASS = method30154(Blocks.GRASS_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item DIRT = method30154(Blocks.DIRT, ItemGroup.BUILDING_BLOCKS);
   public static final Item COARSE_DIRT = method30154(Blocks.COARSE_DIRT, ItemGroup.BUILDING_BLOCKS);
   public static final Item PODZOL = method30154(Blocks.PODZOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37234 = method30154(Blocks.CRIMSON_NYLIUM, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37235 = method30154(Blocks.WARPED_NYLIUM, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37236 = method30154(Blocks.COBBLESTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37237 = method30154(Blocks.OAK_PLANKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37238 = method30154(Blocks.SPRUCE_PLANKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37239 = method30154(Blocks.BIRCH_PLANKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37240 = method30154(Blocks.JUNGLE_PLANKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37241 = method30154(Blocks.ACACIA_PLANKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37242 = method30154(Blocks.DARK_OAK_PLANKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37243 = method30154(Blocks.CRIMSON_PLANKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37244 = method30154(Blocks.WARPED_PLANKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37245 = method30154(Blocks.OAK_SAPLING, ItemGroup.field31666);
   public static final Item field37246 = method30154(Blocks.SPRUCE_SAPLING, ItemGroup.field31666);
   public static final Item field37247 = method30154(Blocks.BIRCH_SAPLING, ItemGroup.field31666);
   public static final Item field37248 = method30154(Blocks.JUNGLE_SAPLING, ItemGroup.field31666);
   public static final Item field37249 = method30154(Blocks.ACACIA_SAPLING, ItemGroup.field31666);
   public static final Item field37250 = method30154(Blocks.DARK_OAK_SAPLING, ItemGroup.field31666);
   public static final Item field37251 = method30154(Blocks.BEDROCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37252 = method30154(Blocks.SAND, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37253 = method30154(Blocks.RED_SAND, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37254 = method30154(Blocks.GRAVEL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37255 = method30154(Blocks.GOLD_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37256 = method30154(Blocks.IRON_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37257 = method30154(Blocks.COAL_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37258 = method30154(Blocks.NETHER_GOLD_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37259 = method30154(Blocks.OAK_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37260 = method30154(Blocks.SPRUCE_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37261 = method30154(Blocks.BIRCH_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37262 = method30154(Blocks.JUNGLE_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37263 = method30154(Blocks.ACACIA_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37264 = method30154(Blocks.DARK_OAK_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37265 = method30154(Blocks.CRIMSON_STEM, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37266 = method30154(Blocks.WARPED_STEM, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37267 = method30154(Blocks.STRIPPED_OAK_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37268 = method30154(Blocks.STRIPPED_SPRUCE_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37269 = method30154(Blocks.STRIPPED_BIRCH_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37270 = method30154(Blocks.STRIPPED_JUNGLE_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37271 = method30154(Blocks.STRIPPED_ACACIA_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37272 = method30154(Blocks.STRIPPED_DARK_OAK_LOG, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37273 = method30154(Blocks.STRIPPED_CRIMSON_STEM, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37274 = method30154(Blocks.STRIPPED_WARPED_STEM, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37275 = method30154(Blocks.STRIPPED_OAK_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37276 = method30154(Blocks.STRIPPED_SPRUCE_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37277 = method30154(Blocks.STRIPPED_BIRCH_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37278 = method30154(Blocks.STRIPPED_JUNGLE_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37279 = method30154(Blocks.STRIPPED_ACACIA_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37280 = method30154(Blocks.STRIPPED_DARK_OAK_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37281 = method30154(Blocks.STRIPPED_CRIMSON_HYPHAE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37282 = method30154(Blocks.STRIPPED_WARPED_HYPHAE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37283 = method30154(Blocks.OAK_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37284 = method30154(Blocks.SPRUCE_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37285 = method30154(Blocks.BIRCH_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37286 = method30154(Blocks.JUNGLE_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37287 = method30154(Blocks.ACACIA_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37288 = method30154(Blocks.DARK_OAK_WOOD, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37289 = method30154(Blocks.CRIMSON_HYPHAE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37290 = method30154(Blocks.WARPED_HYPHAE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37291 = method30154(Blocks.OAK_LEAVES, ItemGroup.field31666);
   public static final Item field37292 = method30154(Blocks.SPRUCE_LEAVES, ItemGroup.field31666);
   public static final Item field37293 = method30154(Blocks.BIRCH_LEAVES, ItemGroup.field31666);
   public static final Item field37294 = method30154(Blocks.JUNGLE_LEAVES, ItemGroup.field31666);
   public static final Item field37295 = method30154(Blocks.ACACIA_LEAVES, ItemGroup.field31666);
   public static final Item field37296 = method30154(Blocks.DARK_OAK_LEAVES, ItemGroup.field31666);
   public static final Item field37297 = method30154(Blocks.SPONGE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37298 = method30154(Blocks.WET_SPONGE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37299 = method30154(Blocks.GLASS_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37300 = method30154(Blocks.LAPIS_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37301 = method30154(Blocks.LAPIS_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37302 = method30154(Blocks.DISPENSER, ItemGroup.REDSTONE);
   public static final Item field37303 = method30154(Blocks.SANDSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37304 = method30154(Blocks.CHISELED_SANDSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37305 = method30154(Blocks.CUT_SANDSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37306 = method30154(Blocks.NOTE_BLOCK, ItemGroup.REDSTONE);
   public static final Item field37307 = method30154(Blocks.POWERED_RAIL, ItemGroup.field31668);
   public static final Item field37308 = method30154(Blocks.DETECTOR_RAIL, ItemGroup.field31668);
   public static final Item field37309 = method30154(Blocks.STICKY_PISTON, ItemGroup.REDSTONE);
   public static final Item field37310 = method30154(Blocks.COBWEB, ItemGroup.field31666);
   public static final Item field37311 = method30154(Blocks.GRASS, ItemGroup.field31666);
   public static final Item field37312 = method30154(Blocks.FERN, ItemGroup.field31666);
   public static final Item field37313 = method30154(Blocks.DEAD_BUSH, ItemGroup.field31666);
   public static final Item field37314 = method30154(Blocks.SEAGRASS, ItemGroup.field31666);
   public static final Item field37315 = method30154(Blocks.field37005, ItemGroup.field31666);
   public static final Item field37316 = method30154(Blocks.PISTON, ItemGroup.REDSTONE);
   public static final Item field37317 = method30154(Blocks.WHITE_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37318 = method30154(Blocks.ORANGE_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37319 = method30154(Blocks.MAGENTA_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37320 = method30154(Blocks.LIGHT_BLUE_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37321 = method30154(Blocks.YELLOW_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37322 = method30154(Blocks.LIME_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37323 = method30154(Blocks.PINK_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37324 = method30154(Blocks.GRAY_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37325 = method30154(Blocks.LIGHT_GRAY_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37326 = method30154(Blocks.CYAN_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37327 = method30154(Blocks.PURPLE_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37328 = method30154(Blocks.BLUE_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37329 = method30154(Blocks.BROWN_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37330 = method30154(Blocks.GREEN_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37331 = method30154(Blocks.RED_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37332 = method30154(Blocks.BLACK_WOOL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37333 = method30154(Blocks.DANDELION, ItemGroup.field31666);
   public static final Item field37334 = method30154(Blocks.POPPY, ItemGroup.field31666);
   public static final Item field37335 = method30154(Blocks.BLUE_ORCHID, ItemGroup.field31666);
   public static final Item field37336 = method30154(Blocks.ALLIUM, ItemGroup.field31666);
   public static final Item field37337 = method30154(Blocks.AZURE_BLUET, ItemGroup.field31666);
   public static final Item field37338 = method30154(Blocks.RED_TULIP, ItemGroup.field31666);
   public static final Item field37339 = method30154(Blocks.ORANGE_TULIP, ItemGroup.field31666);
   public static final Item field37340 = method30154(Blocks.WHITE_TULIP, ItemGroup.field31666);
   public static final Item field37341 = method30154(Blocks.PINK_TULIP, ItemGroup.field31666);
   public static final Item field37342 = method30154(Blocks.OXEYE_DAISY, ItemGroup.field31666);
   public static final Item field37343 = method30154(Blocks.CORNFLOWER, ItemGroup.field31666);
   public static final Item field37344 = method30154(Blocks.LILY_OF_THE_VALLEY, ItemGroup.field31666);
   public static final Item field37345 = method30154(Blocks.WITHER_ROSE, ItemGroup.field31666);
   public static final Item field37346 = method30154(Blocks.BROWN_MUSHROOM, ItemGroup.field31666);
   public static final Item field37347 = method30154(Blocks.RED_MUSHROOM, ItemGroup.field31666);
   public static final Item field37348 = method30154(Blocks.CRIMSON_FUNGUS, ItemGroup.field31666);
   public static final Item field37349 = method30154(Blocks.WARPED_FUNGUS, ItemGroup.field31666);
   public static final Item field37350 = method30154(Blocks.CRIMSON_ROOTS, ItemGroup.field31666);
   public static final Item field37351 = method30154(Blocks.WARPED_ROOTS, ItemGroup.field31666);
   public static final Item field37352 = method30154(Blocks.NETHER_SPROUTS, ItemGroup.field31666);
   public static final Item field37353 = method30154(Blocks.WEEPING_VINES, ItemGroup.field31666);
   public static final Item field37354 = method30154(Blocks.TWISTING_VINES, ItemGroup.field31666);
   public static final Item field37355 = method30154(Blocks.SUGAR_CANE, ItemGroup.field31666);
   public static final Item field37356 = method30154(Blocks.field36961, ItemGroup.field31666);
   public static final Item field37357 = method30154(Blocks.field37009, ItemGroup.field31666);
   public static final Item field37358 = method30154(Blocks.GOLD_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37359 = method30154(Blocks.IRON_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37360 = method30154(Blocks.field36839, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37361 = method30154(Blocks.field36840, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37362 = method30154(Blocks.field36841, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37363 = method30154(Blocks.field36842, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37364 = method30154(Blocks.field36843, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37365 = method30154(Blocks.field36844, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37366 = method30154(Blocks.CRIMSON_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37367 = method30154(Blocks.WARPED_SLAB, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37368 = method30154(Blocks.field36845, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37369 = method30154(Blocks.field36846, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37370 = method30154(Blocks.field36847, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37371 = method30154(Blocks.field36848, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37372 = method30154(Blocks.field36849, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37373 = method30154(Blocks.field36850, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37374 = method30154(Blocks.field36851, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37375 = method30154(Blocks.field36852, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37376 = method30154(Blocks.field36853, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37377 = method30154(Blocks.field36854, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37378 = method30154(Blocks.field36855, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37379 = method30154(Blocks.field36856, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37380 = method30154(Blocks.field36857, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37381 = method30154(Blocks.field36773, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37382 = method30154(Blocks.field36774, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37383 = method30154(Blocks.field36775, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37384 = method30154(Blocks.field36860, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37385 = method30154(Blocks.field36861, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37386 = method30154(Blocks.field36859, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37387 = method30154(Blocks.field36858, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37388 = method30154(Blocks.BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37389 = method30154(Blocks.TNT, ItemGroup.REDSTONE);
   public static final Item field37390 = method30154(Blocks.BOOKSHELF, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37391 = method30154(Blocks.MOSSY_COBBLESTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37392 = method30154(Blocks.OBSIDIAN, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37393 = method30155(
      new Class3298(Blocks.TORCH, Blocks.WALL_TORCH, new Item.Properties().method17779(ItemGroup.field31666))
   );
   public static final Item field37394 = method30154(Blocks.field36877, ItemGroup.field31666);
   public static final Item field37395 = method30154(Blocks.field36878, ItemGroup.field31666);
   public static final Item field37396 = method30154(Blocks.field36879, ItemGroup.field31666);
   public static final Item field37397 = method30154(Blocks.field36880, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37398 = method30154(Blocks.field36881, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37399 = method30154(Blocks.field36882, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37400 = method30153(Blocks.SPAWNER);
   public static final Item field37401 = method30154(Blocks.OAK_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37402 = method30154(Blocks.CHEST, ItemGroup.field31666);
   public static final Item field37403 = method30154(Blocks.DIAMOND_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37404 = method30154(Blocks.DIAMOND_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37405 = method30154(Blocks.CRAFTING_TABLE, ItemGroup.field31666);
   public static final Item field37406 = method30154(Blocks.FARMLAND, ItemGroup.field31666);
   public static final Item field37407 = method30154(Blocks.FURNACE, ItemGroup.field31666);
   public static final Item field37408 = method30154(Blocks.LADDER, ItemGroup.field31666);
   public static final Item field37409 = method30154(Blocks.RAIL, ItemGroup.field31668);
   public static final Item field37410 = method30154(Blocks.COBBLESTONE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37411 = method30154(Blocks.LEVER, ItemGroup.REDSTONE);
   public static final Item field37412 = method30154(Blocks.STONE_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37413 = method30154(Blocks.OAK_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37414 = method30154(Blocks.SPRUCE_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37415 = method30154(Blocks.BIRCH_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37416 = method30154(Blocks.JUNGLE_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37417 = method30154(Blocks.ACACIA_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37418 = method30154(Blocks.DARK_OAK_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37419 = method30154(Blocks.CRIMSON_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37420 = method30154(Blocks.WARPED_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37421 = method30154(Blocks.field37144, ItemGroup.REDSTONE);
   public static final Item field37422 = method30154(Blocks.REDSTONE_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37423 = method30155(
      new Class3298(Blocks.REDSTONE_TORCH, Blocks.REDSTONE_WALL_TORCH, new Item.Properties().method17779(ItemGroup.REDSTONE))
   );
   public static final Item field37424 = method30154(Blocks.SNOW, ItemGroup.field31666);
   public static final Item field37425 = method30154(Blocks.ICE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37426 = method30154(Blocks.SNOW_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37427 = method30154(Blocks.CACTUS, ItemGroup.field31666);
   public static final Item field37428 = method30154(Blocks.CLAY, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37429 = method30154(Blocks.JUKEBOX, ItemGroup.field31666);
   public static final Item field37430 = method30154(Blocks.OAK_FENCE, ItemGroup.field31666);
   public static final Item field37431 = method30154(Blocks.field36867, ItemGroup.field31666);
   public static final Item field37432 = method30154(Blocks.field36868, ItemGroup.field31666);
   public static final Item field37433 = method30154(Blocks.field36869, ItemGroup.field31666);
   public static final Item field37434 = method30154(Blocks.field36870, ItemGroup.field31666);
   public static final Item field37435 = method30154(Blocks.field36871, ItemGroup.field31666);
   public static final Item field37436 = method30154(Blocks.CRIMSON_FENCE, ItemGroup.field31666);
   public static final Item field37437 = method30154(Blocks.WARPED_FENCE, ItemGroup.field31666);
   public static final Item field37438 = method30154(Blocks.PUMPKIN, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37439 = method30154(Blocks.CARVED_PUMPKIN, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37440 = method30154(Blocks.NETHERRACK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37441 = method30154(Blocks.SOUL_SAND, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37442 = method30154(Blocks.SOUL_SOIL, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37443 = method30154(Blocks.BASALT, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37444 = method30154(Blocks.POLISHED_BASALT, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37445 = method30155(
      new Class3298(Blocks.SOUL_TORCH, Blocks.SOUL_WALL_TORCH, new Item.Properties().method17779(ItemGroup.field31666))
   );
   public static final Item field37446 = method30154(Blocks.GLOWSTONE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37447 = method30154(Blocks.JACK_O_LANTERN, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37448 = method30154(Blocks.OAK_TRAPDOOR, ItemGroup.REDSTONE);
   public static final Item field37449 = method30154(Blocks.field36610, ItemGroup.REDSTONE);
   public static final Item field37450 = method30154(Blocks.field36611, ItemGroup.REDSTONE);
   public static final Item field37451 = method30154(Blocks.field36612, ItemGroup.REDSTONE);
   public static final Item field37452 = method30154(Blocks.ACACIA_TRAPDOOR, ItemGroup.REDSTONE);
   public static final Item field37453 = method30154(Blocks.field36614, ItemGroup.REDSTONE);
   public static final Item field37454 = method30154(Blocks.CRIMSON_TRAPDOOR, ItemGroup.REDSTONE);
   public static final Item field37455 = method30154(Blocks.WARPED_TRAPDOOR, ItemGroup.REDSTONE);
   public static final Item field37456 = method30154(Blocks.field36619, ItemGroup.field31666);
   public static final Item field37457 = method30154(Blocks.field36620, ItemGroup.field31666);
   public static final Item field37458 = method30154(Blocks.field36621, ItemGroup.field31666);
   public static final Item field37459 = method30154(Blocks.field36622, ItemGroup.field31666);
   public static final Item field37460 = method30154(Blocks.field36623, ItemGroup.field31666);
   public static final Item field37461 = method30154(Blocks.field36624, ItemGroup.field31666);
   public static final Item field37462 = method30154(Blocks.field36615, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37463 = method30154(Blocks.field36616, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37464 = method30154(Blocks.field36617, ItemGroup.BUILDING_BLOCKS);
   public static final Item CHISELED_STONE_BRICKS = method30154(Blocks.field36618, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37466 = method30154(Blocks.BROWN_MUSHROOM_BLOCK, ItemGroup.field31666);
   public static final Item field37467 = method30154(Blocks.RED_MUSHROOM_BLOCK, ItemGroup.field31666);
   public static final Item field37468 = method30154(Blocks.MUSHROOM_STEM, ItemGroup.field31666);
   public static final Item field37469 = method30154(Blocks.IRON_BARS, ItemGroup.field31666);
   public static final Item field37470 = method30154(Blocks.CHAIN, ItemGroup.field31666);
   public static final Item field37471 = method30154(Blocks.GLASS_PANE, ItemGroup.field31666);
   public static final Item field37472 = method30154(Blocks.MELON, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37473 = method30154(Blocks.VINE, ItemGroup.field31666);
   public static final Item field37474 = method30154(Blocks.OAK_FENCE_GATE, ItemGroup.REDSTONE);
   public static final Item field37475 = method30154(Blocks.field36862, ItemGroup.REDSTONE);
   public static final Item field37476 = method30154(Blocks.field36863, ItemGroup.REDSTONE);
   public static final Item field37477 = method30154(Blocks.field36864, ItemGroup.REDSTONE);
   public static final Item field37478 = method30154(Blocks.field36865, ItemGroup.REDSTONE);
   public static final Item field37479 = method30154(Blocks.field36866, ItemGroup.REDSTONE);
   public static final Item field37480 = method30154(Blocks.CRIMSON_FENCE_GATE, ItemGroup.REDSTONE);
   public static final Item field37481 = method30154(Blocks.WARPED_FENCE_GATE, ItemGroup.REDSTONE);
   public static final Item field37482 = method30154(Blocks.BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37483 = method30154(Blocks.STONE_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37484 = method30154(Blocks.MYCELIUM, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37485 = method30155(new Class3302(Blocks.LILY_PAD, new Item.Properties().method17779(ItemGroup.field31666)));
   public static final Item field37486 = method30154(Blocks.NETHER_BRICKS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37487 = method30154(Blocks.field37148, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37488 = method30154(Blocks.field37147, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37489 = method30154(Blocks.NETHER_BRICK_FENCE, ItemGroup.field31666);
   public static final Item field37490 = method30154(Blocks.NETHER_BRICK_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37491 = method30154(Blocks.ENCHANTING_TABLE, ItemGroup.field31666);
   public static final Item field37492 = method30154(Blocks.field36650, ItemGroup.field31666);
   public static final Item field37493 = method30154(Blocks.field36651, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37494 = method30154(Blocks.field36883, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37495 = method30155(new BlockItem(Blocks.field36652, new Item.Properties().method17780(Class1978.field12888)));
   public static final Item field37496 = method30154(Blocks.field36653, ItemGroup.REDSTONE);
   public static final Item field37497 = method30154(Blocks.SANDSTONE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37498 = method30154(Blocks.EMERALD_ORE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37499 = method30154(Blocks.ENDER_CHEST, ItemGroup.field31666);
   public static final Item field37500 = method30154(Blocks.TRIPWIRE_HOOK, ItemGroup.REDSTONE);
   public static final Item field37501 = method30154(Blocks.EMERALD_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37502 = method30154(Blocks.SPRUCE_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37503 = method30154(Blocks.field36662, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37504 = method30154(Blocks.field36663, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37505 = method30154(Blocks.CRIMSON_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37506 = method30154(Blocks.WARPED_STAIRS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37507 = method30155(new Class3293(Blocks.COMMAND_BLOCK, new Item.Properties().method17780(Class1978.field12888)));
   public static final Item field37508 = method30155(
      new BlockItem(Blocks.BEACON, new Item.Properties().method17779(ItemGroup.field31669).method17780(Class1978.field12887))
   );
   public static final Item field37509 = method30154(Blocks.COBBLESTONE_WALL, ItemGroup.field31666);
   public static final Item field37510 = method30154(Blocks.MOSSY_COBBLESTONE_WALL, ItemGroup.field31666);
   public static final Item field37511 = method30154(Blocks.field37041, ItemGroup.field31666);
   public static final Item field37512 = method30154(Blocks.field37042, ItemGroup.field31666);
   public static final Item field37513 = method30154(Blocks.field37043, ItemGroup.field31666);
   public static final Item field37514 = method30154(Blocks.field37044, ItemGroup.field31666);
   public static final Item field37515 = method30154(Blocks.field37045, ItemGroup.field31666);
   public static final Item field37516 = method30154(Blocks.field37046, ItemGroup.field31666);
   public static final Item field37517 = method30154(Blocks.field37047, ItemGroup.field31666);
   public static final Item field37518 = method30154(Blocks.field37048, ItemGroup.field31666);
   public static final Item field37519 = method30154(Blocks.field37049, ItemGroup.field31666);
   public static final Item field37520 = method30154(Blocks.field37050, ItemGroup.field31666);
   public static final Item field37521 = method30154(Blocks.field37051, ItemGroup.field31666);
   public static final Item field37522 = method30154(Blocks.field37052, ItemGroup.field31666);
   public static final Item field37523 = method30154(Blocks.field37132, ItemGroup.field31666);
   public static final Item field37524 = method30154(Blocks.field37146, ItemGroup.field31666);
   public static final Item field37525 = method30154(Blocks.field37140, ItemGroup.field31666);
   public static final Item field37526 = method30154(Blocks.STONE_BUTTON, ItemGroup.REDSTONE);
   public static final Item field37527 = method30154(Blocks.field36695, ItemGroup.REDSTONE);
   public static final Item field37528 = method30154(Blocks.field36696, ItemGroup.REDSTONE);
   public static final Item field37529 = method30154(Blocks.field36697, ItemGroup.REDSTONE);
   public static final Item field37530 = method30154(Blocks.field36698, ItemGroup.REDSTONE);
   public static final Item field37531 = method30154(Blocks.field36699, ItemGroup.REDSTONE);
   public static final Item field37532 = method30154(Blocks.field36700, ItemGroup.REDSTONE);
   public static final Item field37533 = method30154(Blocks.CRIMSON_BUTTON, ItemGroup.REDSTONE);
   public static final Item field37534 = method30154(Blocks.WARPED_BUTTON, ItemGroup.REDSTONE);
   public static final Item field37535 = method30154(Blocks.field37145, ItemGroup.REDSTONE);
   public static final Item field37536 = method30154(Blocks.ANVIL, ItemGroup.field31666);
   public static final Item field37537 = method30154(Blocks.CHIPPED_ANVIL, ItemGroup.field31666);
   public static final Item field37538 = method30154(Blocks.DAMAGED_ANVIL, ItemGroup.field31666);
   public static final Item field37539 = method30154(Blocks.TRAPPED_CHEST, ItemGroup.REDSTONE);
   public static final Item field37540 = method30154(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37541 = method30154(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE, ItemGroup.REDSTONE);
   public static final Item field37542 = method30154(Blocks.field36720, ItemGroup.REDSTONE);
   public static final Item field37543 = method30154(Blocks.field36721, ItemGroup.REDSTONE);
   public static final Item field37544 = method30154(Blocks.field36722, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37545 = method30154(Blocks.HOPPER, ItemGroup.REDSTONE);
   public static final Item field37546 = method30154(Blocks.field36725, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37547 = method30154(Blocks.field36724, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37548 = method30154(Blocks.field37149, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37549 = method30154(Blocks.field36726, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37550 = method30154(Blocks.field36727, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37551 = method30154(Blocks.field36728, ItemGroup.field31668);
   public static final Item field37552 = method30154(Blocks.DROPPER, ItemGroup.REDSTONE);
   public static final Item field37553 = method30154(Blocks.field36730, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37554 = method30154(Blocks.field36731, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37555 = method30154(Blocks.field36732, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37556 = method30154(Blocks.field36733, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37557 = method30154(Blocks.field36734, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37558 = method30154(Blocks.field36735, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37559 = method30154(Blocks.field36736, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37560 = method30154(Blocks.field36737, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37561 = method30154(Blocks.field36738, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37562 = method30154(Blocks.field36739, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37563 = method30154(Blocks.field36740, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37564 = method30154(Blocks.field36741, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37565 = method30154(Blocks.field36742, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37566 = method30154(Blocks.field36743, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37567 = method30154(Blocks.field36744, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37568 = method30154(Blocks.field36745, ItemGroup.BUILDING_BLOCKS);
   public static final Item BARRIER = method30153(Blocks.BARRIER);
   public static final Item field37570 = method30154(Blocks.field36766, ItemGroup.REDSTONE);
   public static final Item field37571 = method30154(Blocks.field36777, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37572 = method30154(Blocks.WHITE_CARPET, ItemGroup.field31666);
   public static final Item field37573 = method30154(Blocks.ORANGE_CARPET, ItemGroup.field31666);
   public static final Item field37574 = method30154(Blocks.MAGENTA_CARPET, ItemGroup.field31666);
   public static final Item field37575 = method30154(Blocks.LIGHT_BLUE_CARPET, ItemGroup.field31666);
   public static final Item field37576 = method30154(Blocks.YELLOW_CARPET, ItemGroup.field31666);
   public static final Item field37577 = method30154(Blocks.LIME_CARPET, ItemGroup.field31666);
   public static final Item field37578 = method30154(Blocks.PINK_CARPET, ItemGroup.field31666);
   public static final Item field37579 = method30154(Blocks.GRAY_CARPET, ItemGroup.field31666);
   public static final Item field37580 = method30154(Blocks.LIGHT_GRAY_CARPET, ItemGroup.field31666);
   public static final Item field37581 = method30154(Blocks.CYAN_CARPET, ItemGroup.field31666);
   public static final Item field37582 = method30154(Blocks.PURPLE_CARPET, ItemGroup.field31666);
   public static final Item field37583 = method30154(Blocks.BLUE_CARPET, ItemGroup.field31666);
   public static final Item field37584 = method30154(Blocks.BROWN_CARPET, ItemGroup.field31666);
   public static final Item field37585 = method30154(Blocks.GREEN_CARPET, ItemGroup.field31666);
   public static final Item field37586 = method30154(Blocks.RED_CARPET, ItemGroup.field31666);
   public static final Item field37587 = method30154(Blocks.BLACK_CARPET, ItemGroup.field31666);
   public static final Item field37588 = method30154(Blocks.field36794, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37589 = method30154(Blocks.field36795, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37590 = method30154(Blocks.PACKED_ICE, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37591 = method30154(Blocks.field36762, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37592 = method30154(Blocks.field36763, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37593 = method30154(Blocks.field36764, ItemGroup.field31666);
   public static final Item field37594 = method30154(Blocks.field36885, ItemGroup.field31666);
   public static final Item field37595 = method30155(new Class3295(Blocks.SUNFLOWER, new Item.Properties().method17779(ItemGroup.field31666)));
   public static final Item field37596 = method30155(new Class3295(Blocks.LILAC, new Item.Properties().method17779(ItemGroup.field31666)));
   public static final Item field37597 = method30155(new Class3295(Blocks.ROSE_BUSH, new Item.Properties().method17779(ItemGroup.field31666)));
   public static final Item field37598 = method30155(new Class3295(Blocks.field36800, new Item.Properties().method17779(ItemGroup.field31666)));
   public static final Item field37599 = method30155(new Class3295(Blocks.TALL_GRASS, new Item.Properties().method17779(ItemGroup.field31666)));
   public static final Item field37600 = method30155(new Class3295(Blocks.field36802, new Item.Properties().method17779(ItemGroup.field31666)));
   public static final Item field37601 = method30154(Blocks.WHITE_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37602 = method30154(Blocks.ORANGE_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37603 = method30154(Blocks.MAGENTA_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37604 = method30154(Blocks.LIGHT_BLUE_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37605 = method30154(Blocks.YELLOW_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37606 = method30154(Blocks.LIME_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37607 = method30154(Blocks.PINK_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37608 = method30154(Blocks.GRAY_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37609 = method30154(Blocks.LIGHT_GRAY_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37610 = method30154(Blocks.CYAN_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37611 = method30154(Blocks.PURPLE_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37612 = method30154(Blocks.BLUE_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37613 = method30154(Blocks.BROWN_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37614 = method30154(Blocks.GREEN_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37615 = method30154(Blocks.RED_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37616 = method30154(Blocks.BLACK_STAINED_GLASS, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37617 = method30154(Blocks.field36746, ItemGroup.field31666);
   public static final Item field37618 = method30154(Blocks.field36747, ItemGroup.field31666);
   public static final Item field37619 = method30154(Blocks.field36748, ItemGroup.field31666);
   public static final Item field37620 = method30154(Blocks.field36749, ItemGroup.field31666);
   public static final Item field37621 = method30154(Blocks.field36750, ItemGroup.field31666);
   public static final Item field37622 = method30154(Blocks.field36751, ItemGroup.field31666);
   public static final Item field37623 = method30154(Blocks.field36752, ItemGroup.field31666);
   public static final Item field37624 = method30154(Blocks.field36753, ItemGroup.field31666);
   public static final Item field37625 = method30154(Blocks.field36754, ItemGroup.field31666);
   public static final Item field37626 = method30154(Blocks.field36755, ItemGroup.field31666);
   public static final Item field37627 = method30154(Blocks.field36756, ItemGroup.field31666);
   public static final Item field37628 = method30154(Blocks.field36757, ItemGroup.field31666);
   public static final Item field37629 = method30154(Blocks.field36758, ItemGroup.field31666);
   public static final Item field37630 = method30154(Blocks.field36759, ItemGroup.field31666);
   public static final Item field37631 = method30154(Blocks.field36760, ItemGroup.field31666);
   public static final Item field37632 = method30154(Blocks.field36761, ItemGroup.field31666);
   public static final Item field37633 = method30154(Blocks.field36767, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37634 = method30154(Blocks.field36768, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37635 = method30154(Blocks.field36769, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37636 = method30154(Blocks.field36770, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37637 = method30154(Blocks.field36771, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37638 = method30154(Blocks.field36772, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37639 = method30154(Blocks.field36776, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37640 = method30154(Blocks.field36835, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37641 = method30154(Blocks.field36836, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37642 = method30154(Blocks.field36837, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37643 = method30154(Blocks.field36838, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37644 = method30155(new Class3293(Blocks.field36887, new Item.Properties().method17780(Class1978.field12888)));
   public static final Item field37645 = method30155(new Class3293(Blocks.field36888, new Item.Properties().method17780(Class1978.field12888)));
   public static final Item field37646 = method30154(Blocks.field36890, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37647 = method30154(Blocks.field36891, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37648 = method30154(Blocks.WARPED_WART_BLOCK, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37649 = method30154(Blocks.field36892, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37650 = method30154(Blocks.field36893, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37651 = method30153(Blocks.field36894);
   public static final Item field37652 = method30154(Blocks.field36895, ItemGroup.REDSTONE);
   public static final Item field37653 = method30155(new BlockItem(Blocks.field36896, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37654 = method30155(new BlockItem(Blocks.field36897, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37655 = method30155(new BlockItem(Blocks.field36898, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37656 = method30155(new BlockItem(Blocks.field36899, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37657 = method30155(new BlockItem(Blocks.field36900, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37658 = method30155(new BlockItem(Blocks.field36901, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37659 = method30155(new BlockItem(Blocks.field36902, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37660 = method30155(new BlockItem(Blocks.field36903, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37661 = method30155(new BlockItem(Blocks.field36904, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37662 = method30155(new BlockItem(Blocks.field36905, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37663 = method30155(new BlockItem(Blocks.field36906, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37664 = method30155(new BlockItem(Blocks.field36907, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37665 = method30155(new BlockItem(Blocks.field36908, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37666 = method30155(new BlockItem(Blocks.field36909, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37667 = method30155(new BlockItem(Blocks.field36910, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37668 = method30155(new BlockItem(Blocks.field36911, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37669 = method30155(new BlockItem(Blocks.field36912, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37670 = method30154(Blocks.field36913, ItemGroup.field31666);
   public static final Item field37671 = method30154(Blocks.field36914, ItemGroup.field31666);
   public static final Item field37672 = method30154(Blocks.field36915, ItemGroup.field31666);
   public static final Item field37673 = method30154(Blocks.field36916, ItemGroup.field31666);
   public static final Item field37674 = method30154(Blocks.field36917, ItemGroup.field31666);
   public static final Item field37675 = method30154(Blocks.field36918, ItemGroup.field31666);
   public static final Item field37676 = method30154(Blocks.field36919, ItemGroup.field31666);
   public static final Item field37677 = method30154(Blocks.field36920, ItemGroup.field31666);
   public static final Item field37678 = method30154(Blocks.field36921, ItemGroup.field31666);
   public static final Item field37679 = method30154(Blocks.field36922, ItemGroup.field31666);
   public static final Item field37680 = method30154(Blocks.field36923, ItemGroup.field31666);
   public static final Item field37681 = method30154(Blocks.field36924, ItemGroup.field31666);
   public static final Item field37682 = method30154(Blocks.field36925, ItemGroup.field31666);
   public static final Item field37683 = method30154(Blocks.field36926, ItemGroup.field31666);
   public static final Item field37684 = method30154(Blocks.field36927, ItemGroup.field31666);
   public static final Item field37685 = method30154(Blocks.field36928, ItemGroup.field31666);
   public static final Item field37686 = method30154(Blocks.field36929, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37687 = method30154(Blocks.field36930, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37688 = method30154(Blocks.field36931, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37689 = method30154(Blocks.field36932, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37690 = method30154(Blocks.field36933, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37691 = method30154(Blocks.field36934, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37692 = method30154(Blocks.field36935, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37693 = method30154(Blocks.field36936, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37694 = method30154(Blocks.field36937, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37695 = method30154(Blocks.field36938, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37696 = method30154(Blocks.field36939, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37697 = method30154(Blocks.field36940, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37698 = method30154(Blocks.field36941, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37699 = method30154(Blocks.field36942, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37700 = method30154(Blocks.field36943, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37701 = method30154(Blocks.field36944, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37702 = method30154(Blocks.field36945, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37703 = method30154(Blocks.field36946, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37704 = method30154(Blocks.field36947, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37705 = method30154(Blocks.field36948, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37706 = method30154(Blocks.field36949, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37707 = method30154(Blocks.field36950, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37708 = method30154(Blocks.field36951, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37709 = method30154(Blocks.field36952, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37710 = method30154(Blocks.field36953, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37711 = method30154(Blocks.field36954, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37712 = method30154(Blocks.field36955, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37713 = method30154(Blocks.field36956, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37714 = method30154(Blocks.field36957, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37715 = method30154(Blocks.field36958, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37716 = method30154(Blocks.field36959, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37717 = method30154(Blocks.field36960, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37718 = method30154(Blocks.field36964, ItemGroup.field31669);
   public static final Item field37719 = method30154(Blocks.field36965, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37720 = method30154(Blocks.field36966, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37721 = method30154(Blocks.field36967, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37722 = method30154(Blocks.field36968, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37723 = method30154(Blocks.field36969, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37724 = method30154(Blocks.field36970, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37725 = method30154(Blocks.field36971, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37726 = method30154(Blocks.field36972, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37727 = method30154(Blocks.field36973, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37728 = method30154(Blocks.field36974, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37729 = method30154(Blocks.field36980, ItemGroup.field31666);
   public static final Item field37730 = method30154(Blocks.field36981, ItemGroup.field31666);
   public static final Item field37731 = method30154(Blocks.field36982, ItemGroup.field31666);
   public static final Item field37732 = method30154(Blocks.field36983, ItemGroup.field31666);
   public static final Item field37733 = method30154(Blocks.field36984, ItemGroup.field31666);
   public static final Item field37734 = method30154(Blocks.field36976, ItemGroup.field31666);
   public static final Item field37735 = method30154(Blocks.field36977, ItemGroup.field31666);
   public static final Item field37736 = method30154(Blocks.field36978, ItemGroup.field31666);
   public static final Item field37737 = method30154(Blocks.field36979, ItemGroup.field31666);
   public static final Item field37738 = method30154(Blocks.field36975, ItemGroup.field31666);
   public static final Item field37739 = method30155(
      new Class3298(Blocks.field36990, Blocks.field37000, new Item.Properties().method17779(ItemGroup.field31666))
   );
   public static final Item field37740 = method30155(
      new Class3298(Blocks.field36991, Blocks.field37001, new Item.Properties().method17779(ItemGroup.field31666))
   );
   public static final Item field37741 = method30155(
      new Class3298(Blocks.field36992, Blocks.field37002, new Item.Properties().method17779(ItemGroup.field31666))
   );
   public static final Item field37742 = method30155(
      new Class3298(Blocks.field36993, Blocks.field37003, new Item.Properties().method17779(ItemGroup.field31666))
   );
   public static final Item field37743 = method30155(
      new Class3298(Blocks.field36994, Blocks.field37004, new Item.Properties().method17779(ItemGroup.field31666))
   );
   public static final Item field37744 = method30155(
      new Class3298(Blocks.field36985, Blocks.field36995, new Item.Properties().method17779(ItemGroup.field31666))
   );
   public static final Item field37745 = method30155(
      new Class3298(Blocks.field36986, Blocks.field36996, new Item.Properties().method17779(ItemGroup.field31666))
   );
   public static final Item field37746 = method30155(
      new Class3298(Blocks.field36987, Blocks.field36997, new Item.Properties().method17779(ItemGroup.field31666))
   );
   public static final Item field37747 = method30155(
      new Class3298(Blocks.field36988, Blocks.field36998, new Item.Properties().method17779(ItemGroup.field31666))
   );
   public static final Item field37748 = method30155(
      new Class3298(Blocks.field36989, Blocks.field36999, new Item.Properties().method17779(ItemGroup.field31666))
   );
   public static final Item field37749 = method30154(Blocks.field37006, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37750 = method30155(
      new BlockItem(Blocks.field37007, new Item.Properties().method17779(ItemGroup.field31669).method17780(Class1978.field12887))
   );
   public static final Item field37751 = method30154(Blocks.field37014, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37752 = method30154(Blocks.field37015, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37753 = method30154(Blocks.field37016, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37754 = method30154(Blocks.field37017, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37755 = method30154(Blocks.field37018, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37756 = method30154(Blocks.field37019, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37757 = method30154(Blocks.field37020, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37758 = method30154(Blocks.field37021, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37759 = method30154(Blocks.field37022, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37760 = method30154(Blocks.field37023, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37761 = method30154(Blocks.field37024, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37762 = method30154(Blocks.field37025, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37763 = method30154(Blocks.field37026, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37764 = method30154(Blocks.field37027, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37765 = method30154(Blocks.field37028, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37766 = method30154(Blocks.field37029, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37767 = method30154(Blocks.field37030, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37768 = method30154(Blocks.field37031, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37769 = method30154(Blocks.field37032, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37770 = method30154(Blocks.field37033, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37771 = method30154(Blocks.field37034, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37772 = method30154(Blocks.field37035, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37773 = method30154(Blocks.field37036, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37774 = method30154(Blocks.field37037, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37775 = method30154(Blocks.field37038, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37776 = method30154(Blocks.field37039, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37777 = method30154(Blocks.field37040, ItemGroup.BUILDING_BLOCKS);
   public static final Item field37778 = method30155(new Class3294(Blocks.field37053, new Item.Properties().method17779(ItemGroup.field31666)));
   public static final Item field37779 = method30155(new Class3295(Blocks.IRON_DOOR, new Item.Properties().method17779(ItemGroup.REDSTONE)));
   public static final Item field37780 = method30155(new Class3295(Blocks.OAK_DOOR, new Item.Properties().method17779(ItemGroup.REDSTONE)));
   public static final Item field37781 = method30155(new Class3295(Blocks.field36872, new Item.Properties().method17779(ItemGroup.REDSTONE)));
   public static final Item field37782 = method30155(new Class3295(Blocks.field36873, new Item.Properties().method17779(ItemGroup.REDSTONE)));
   public static final Item field37783 = method30155(new Class3295(Blocks.field36874, new Item.Properties().method17779(ItemGroup.REDSTONE)));
   public static final Item field37784 = method30155(new Class3295(Blocks.field36875, new Item.Properties().method17779(ItemGroup.REDSTONE)));
   public static final Item field37785 = method30155(new Class3295(Blocks.field36876, new Item.Properties().method17779(ItemGroup.REDSTONE)));
   public static final Item field37786 = method30155(new Class3295(Blocks.CRIMSON_DOOR, new Item.Properties().method17779(ItemGroup.REDSTONE)));
   public static final Item field37787 = method30155(new Class3295(Blocks.WARPED_DOOR, new Item.Properties().method17779(ItemGroup.REDSTONE)));
   public static final Item field37788 = method30154(Blocks.REPEATER, ItemGroup.REDSTONE);
   public static final Item field37789 = method30154(Blocks.COMPARATOR, ItemGroup.REDSTONE);
   public static final Item field37790 = method30155(new Class3293(Blocks.STRUCTURE_BLOCK, new Item.Properties().method17780(Class1978.field12888)));
   public static final Item field37791 = method30155(new Class3293(Blocks.JIGSAW, new Item.Properties().method17780(Class1978.field12888)));
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
   public static final Item field37898 = method30154(Blocks.field36963, ItemGroup.BUILDING_BLOCKS);
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
   public static final Item field37918 = method30157("white_dye", new Class3321(Class112.field386, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37919 = method30157("orange_dye", new Class3321(Class112.field387, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37920 = method30157("magenta_dye", new Class3321(Class112.field388, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37921 = method30157("light_blue_dye", new Class3321(Class112.field389, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37922 = method30157("yellow_dye", new Class3321(Class112.field390, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37923 = method30157("lime_dye", new Class3321(Class112.field391, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37924 = method30157("pink_dye", new Class3321(Class112.field392, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37925 = method30157("gray_dye", new Class3321(Class112.field393, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37926 = method30157("light_gray_dye", new Class3321(Class112.field394, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37927 = method30157("cyan_dye", new Class3321(Class112.field395, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37928 = method30157("purple_dye", new Class3321(Class112.field396, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37929 = method30157("blue_dye", new Class3321(Class112.field397, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37930 = method30157("brown_dye", new Class3321(Class112.field398, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37931 = method30157("green_dye", new Class3321(Class112.field399, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37932 = method30157("red_dye", new Class3321(Class112.field400, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37933 = method30157("black_dye", new Class3321(Class112.field401, new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37934 = method30157("bone_meal", new Class3336(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37935 = method30157("bone", new Item(new Item.Properties().method17779(ItemGroup.field31669)));
   public static final Item field37936 = method30157("sugar", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field37937 = method30155(new BlockItem(Blocks.CAKE, new Item.Properties().method17775(1).method17779(ItemGroup.field31671)));
   public static final Item field37938 = method30155(new Class3297(Blocks.WHITE_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37939 = method30155(new Class3297(Blocks.ORANGE_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37940 = method30155(new Class3297(Blocks.MAGENTA_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37941 = method30155(new Class3297(Blocks.LIGHT_BLUE_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37942 = method30155(new Class3297(Blocks.YELLOW_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37943 = method30155(new Class3297(Blocks.LIME_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37944 = method30155(new Class3297(Blocks.PINK_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37945 = method30155(new Class3297(Blocks.GRAY_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37946 = method30155(new Class3297(Blocks.LIGHT_GRAY_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37947 = method30155(new Class3297(Blocks.CYAN_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37948 = method30155(new Class3297(Blocks.PURPLE_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37949 = method30155(new Class3297(Blocks.BLUE_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37950 = method30155(new Class3297(Blocks.BROWN_RED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37951 = method30155(new Class3297(Blocks.GREEN_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37952 = method30155(new Class3297(Blocks.RED_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
   public static final Item field37953 = method30155(new Class3297(Blocks.BLACK_BED, new Item.Properties().method17775(1).method17779(ItemGroup.field31666)));
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
   public static final Item field37977 = method30154(Blocks.field36647, ItemGroup.field31674);
   public static final Item field37978 = method30154(Blocks.field36648, ItemGroup.field31674);
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
   public static final Item field38051 = method30154(Blocks.FLOWER_POT, ItemGroup.field31666);
   public static final Item field38052 = method30157(
      "carrot", new Class3296(Blocks.field36693, new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39064))
   );
   public static final Item field38053 = method30157(
      "potato", new Class3296(Blocks.field36694, new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39086))
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
   public static final Item field38058 = method30155(
      new Class3298(Blocks.field36701, Blocks.field36702, new Item.Properties().method17779(ItemGroup.field31666).method17780(Class1978.field12886))
   );
   public static final Item field38059 = method30155(
      new Class3298(Blocks.field36703, Blocks.field36704, new Item.Properties().method17779(ItemGroup.field31666).method17780(Class1978.field12886))
   );
   public static final Item field38060 = method30155(
      new SkullItem(Blocks.field36707, Blocks.field36708, new Item.Properties().method17779(ItemGroup.field31666).method17780(Class1978.field12886))
   );
   public static final Item field38061 = method30155(
      new Class3298(Blocks.field36705, Blocks.field36706, new Item.Properties().method17779(ItemGroup.field31666).method17780(Class1978.field12886))
   );
   public static final Item field38062 = method30155(
      new Class3298(Blocks.field36709, Blocks.field36710, new Item.Properties().method17779(ItemGroup.field31666).method17780(Class1978.field12886))
   );
   public static final Item field38063 = method30155(
      new Class3298(Blocks.DRAGON_HEAD, Blocks.DRAGON_WALL_HEAD, new Item.Properties().method17779(ItemGroup.field31666).method17780(Class1978.field12886))
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
      "white_banner", new Class3301(Blocks.field36803, Blocks.field36819, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38093 = method30157(
      "orange_banner", new Class3301(Blocks.field36804, Blocks.field36820, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38094 = method30157(
      "magenta_banner", new Class3301(Blocks.field36805, Blocks.field36821, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38095 = method30157(
      "light_blue_banner", new Class3301(Blocks.field36806, Blocks.field36822, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38096 = method30157(
      "yellow_banner", new Class3301(Blocks.field36807, Blocks.field36823, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38097 = method30157(
      "lime_banner", new Class3301(Blocks.field36808, Blocks.field36824, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38098 = method30157(
      "pink_banner", new Class3301(Blocks.field36809, Blocks.field36825, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38099 = method30157(
      "gray_banner", new Class3301(Blocks.field36810, Blocks.field36826, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38100 = method30157(
      "light_gray_banner", new Class3301(Blocks.field36811, Blocks.field36827, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38101 = method30157(
      "cyan_banner", new Class3301(Blocks.field36812, Blocks.field36828, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38102 = method30157(
      "purple_banner", new Class3301(Blocks.field36813, Blocks.field36829, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38103 = method30157(
      "blue_banner", new Class3301(Blocks.field36814, Blocks.field36830, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38104 = method30157(
      "brown_banner", new Class3301(Blocks.field36815, Blocks.field36831, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38105 = method30157(
      "green_banner", new Class3301(Blocks.field36816, Blocks.field36832, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38106 = method30157(
      "red_banner", new Class3301(Blocks.field36817, Blocks.field36833, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
   );
   public static final Item field38107 = method30157(
      "black_banner", new Class3301(Blocks.field36818, Blocks.field36834, new Item.Properties().method17775(16).method17779(ItemGroup.field31666))
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
      "beetroot_seeds", new Class3296(Blocks.field36884, new Item.Properties().method17779(ItemGroup.field31675))
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
   public static final Item field38150 = method30154(Blocks.LOOM, ItemGroup.field31666);
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
   public static final Item field38157 = method30154(Blocks.COMPOSTER, ItemGroup.field31666);
   public static final Item field38158 = method30154(Blocks.BARREL, ItemGroup.field31666);
   public static final Item field38159 = method30154(Blocks.SMOKER, ItemGroup.field31666);
   public static final Item field38160 = method30154(Blocks.BLAST_FURNACE, ItemGroup.field31666);
   public static final Item field38161 = method30154(Blocks.CARTOGRAPHY_TABLE, ItemGroup.field31666);
   public static final Item field38162 = method30154(Blocks.FLETCHING_TABLE, ItemGroup.field31666);
   public static final Item field38163 = method30154(Blocks.GRINDSTONE, ItemGroup.field31666);
   public static final Item field38164 = method30154(Blocks.LECTERN, ItemGroup.REDSTONE);
   public static final Item field38165 = method30154(Blocks.SMITHING_TABLE, ItemGroup.field31666);
   public static final Item field38166 = method30154(Blocks.STONECUTTER, ItemGroup.field31666);
   public static final Item field38167 = method30154(Blocks.BELL, ItemGroup.field31666);
   public static final Item field38168 = method30154(Blocks.LANTERN, ItemGroup.field31666);
   public static final Item field38169 = method30154(Blocks.SOUL_LANTERN, ItemGroup.field31666);
   public static final Item field38170 = method30157(
      "sweet_berries", new Class3296(Blocks.SWEET_BERRY_BUSH, new Item.Properties().method17779(ItemGroup.field31671).method17774(Class8672.field39095))
   );
   public static final Item field38171 = method30154(Blocks.CAMPFIRE, ItemGroup.field31666);
   public static final Item field38172 = method30154(Blocks.SOUL_CAMPFIRE, ItemGroup.field31666);
   public static final Item field38173 = method30154(Blocks.SHROOMLIGHT, ItemGroup.field31666);
   public static final Item field38174 = method30157("honeycomb", new Item(new Item.Properties().method17779(ItemGroup.field31675)));
   public static final Item field38175 = method30154(Blocks.BEE_NEST, ItemGroup.field31666);
   public static final Item field38176 = method30154(Blocks.BEEHIVE, ItemGroup.field31666);
   public static final Item field38177 = method30157(
      "honey_bottle",
      new Class3307(new Item.Properties().method17778(field37972).method17774(Class8672.field39080).method17779(ItemGroup.field31671).method17775(16))
   );
   public static final Item field38178 = method30154(Blocks.HONEY_BLOCK, ItemGroup.field31666);
   public static final Item field38179 = method30154(Blocks.HONEYCOMB_BLOCK, ItemGroup.field31666);
   public static final Item field38180 = method30154(Blocks.field37129, ItemGroup.field31666);
   public static final Item field38181 = method30155(new BlockItem(Blocks.NETHERITE_BLOCK, new Item.Properties().method17779(ItemGroup.BUILDING_BLOCKS).method17781()));
   public static final Item field38182 = method30155(new BlockItem(Blocks.ANCIENT_DEBRIS, new Item.Properties().method17779(ItemGroup.BUILDING_BLOCKS).method17781()));
   public static final Item field38183 = method30154(Blocks.TARGET, ItemGroup.REDSTONE);
   public static final Item field38184 = method30154(Blocks.CRYING_OBSIDIAN, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38185 = method30154(Blocks.field37130, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38186 = method30154(Blocks.field37133, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38187 = method30154(Blocks.field37131, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38188 = method30154(Blocks.field37141, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38189 = method30154(Blocks.field37134, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38190 = method30154(Blocks.field37143, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38191 = method30154(Blocks.field37142, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38192 = method30154(Blocks.field37137, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38193 = method30154(Blocks.field37135, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38194 = method30154(Blocks.field37138, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38195 = method30154(Blocks.field37139, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38196 = method30154(Blocks.field37136, ItemGroup.BUILDING_BLOCKS);
   public static final Item field38197 = method30154(Blocks.RESPAWN_ANCHOR, ItemGroup.field31666);

   private static Item method30153(Block var0) {
      return method30155(new BlockItem(var0, new Item.Properties()));
   }

   private static Item method30154(Block var0, ItemGroup var1) {
      return method30155(new BlockItem(var0, new Item.Properties().method17779(var1)));
   }

   private static Item method30155(BlockItem var0) {
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
