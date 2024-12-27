package net.minecraft.block;

import com.google.common.collect.UnmodifiableIterator;
import mapped.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.Fluids;
import net.minecraft.state.properties.BedPart;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.gen.feature.Features;

import java.util.function.ToIntFunction;

public class Blocks {
   public static final Block AIR = register(
      "air", new AirBlock(AbstractBlock.Properties.method26609(Material.field38932).method26614().method26626().method26628())
   );
   public static final Block STONE = register(
      "stone", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.STONE).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block GRANITE = register(
      "granite", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30957).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block POLISHED_GRANITE = register(
      "polished_granite", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30957).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block DIORITE = register(
      "diorite", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30961).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block POLISHED_DIORITE = register(
      "polished_diorite", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30961).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block ANDESITE = register(
      "andesite", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.STONE).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block POLISHED_ANDESITE = register(
      "polished_andesite", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.STONE).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block GRASS_BLOCK = register(
      "grass_block", new Class3473(AbstractBlock.Properties.method26609(Material.field38951).method26624().method26623(0.6F).method26619(SoundType.GRASS))
   );
   public static final Block DIRT = register(
      "dirt", new Block(AbstractBlock.Properties.method26611(Material.field38950, MaterialColor.field30957).method26623(0.5F).method26619(SoundType.GRAVEL))
   );
   public static final Block COARSE_DIRT = register(
      "coarse_dirt", new Block(AbstractBlock.Properties.method26611(Material.field38950, MaterialColor.field30957).method26623(0.5F).method26619(SoundType.GRAVEL))
   );
   public static final Block PODZOL = register(
      "podzol", new Class3471(AbstractBlock.Properties.method26611(Material.field38950, MaterialColor.field30981).method26623(0.5F).method26619(SoundType.GRAVEL))
   );
   public static final Block field36399 = register(
      "cobblestone", new Block(AbstractBlock.Properties.method26609(Material.field38966).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block field36400 = register(
      "oak_planks", new Block(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30960).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block field36401 = register(
      "spruce_planks",
      new Block(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30981).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block field36402 = register(
      "birch_planks",
      new Block(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30949).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block field36403 = register(
      "jungle_planks",
      new Block(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30957).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block field36404 = register(
      "acacia_planks",
      new Block(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30962).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block field36405 = register(
      "dark_oak_planks",
      new Block(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30973).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block OAK_SAPLING = register(
      "oak_sapling",
      new SaplingBlock(new Class7667(), AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26624().method26622().method26619(SoundType.GRASS))
   );
   public static final Block SPRUCE_SAPLING = register(
      "spruce_sapling",
      new SaplingBlock(new Class7662(), AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26624().method26622().method26619(SoundType.GRASS))
   );
   public static final Block BIRCH_SAPLING = register(
      "birch_sapling",
      new SaplingBlock(new Class7666(), AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26624().method26622().method26619(SoundType.GRASS))
   );
   public static final Block JUNGLE_SAPLING = register(
      "jungle_sapling",
      new SaplingBlock(new Class7664(), AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26624().method26622().method26619(SoundType.GRASS))
   );
   public static final Block ACACIA_SAPLING = register(
      "acacia_sapling",
      new SaplingBlock(new Class7668(), AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26624().method26622().method26619(SoundType.GRASS))
   );
   public static final Block DARK_OAK_SAPLING = register(
      "dark_oak_sapling",
      new SaplingBlock(new Class7663(), AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26624().method26622().method26619(SoundType.GRASS))
   );
   public static final Block BEDROCK = register(
      "bedrock", new Block(AbstractBlock.Properties.method26609(Material.field38966).method26621(-1.0F, 3600000.0F).method26626().method26629(Blocks::method30012))
   );
   public static final Block WATER = register(
      "water", new FlowingFluidBlock(Fluids.WATER, AbstractBlock.Properties.method26609(Material.field38941).method26614().method26623(100.0F).method26626())
   );
   public static final Block LAVA = register(
      "lava",
      new FlowingFluidBlock(
         Fluids.LAVA,
         AbstractBlock.Properties.method26609(Material.field38943).method26614().method26624().method26623(100.0F).method26620(var0 -> 15).method26626()
      )
   );
   public static final Block SAND = register(
      "sand", new Class3216(14406560, AbstractBlock.Properties.method26611(Material.field38953, MaterialColor.field30949).method26623(0.5F).method26619(SoundType.SAND))
   );
   public static final Block RED_SAND = register(
      "red_sand",
      new Class3216(11098145, AbstractBlock.Properties.method26611(Material.field38953, MaterialColor.field30962).method26623(0.5F).method26619(SoundType.SAND))
   );
   public static final Block GRAVEL = register(
      "gravel", new Class3215(AbstractBlock.Properties.method26611(Material.field38953, MaterialColor.STONE).method26623(0.6F).method26619(SoundType.GRAVEL))
   );
   public static final Block GOLD_ORE = register(
      "gold_ore", new DiamondOreBlock(AbstractBlock.Properties.method26609(Material.field38966).method26635().method26621(3.0F, 3.0F))
   );
   public static final Block IRON_ORE = register(
      "iron_ore", new DiamondOreBlock(AbstractBlock.Properties.method26609(Material.field38966).method26635().method26621(3.0F, 3.0F))
   );
   public static final Block COAL_ORE = register(
      "coal_ore", new DiamondOreBlock(AbstractBlock.Properties.method26609(Material.field38966).method26635().method26621(3.0F, 3.0F))
   );
   public static final Block NETHER_GOLD_ORE = register(
      "nether_gold_ore",
      new DiamondOreBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30982).method26635().method26621(3.0F, 3.0F).method26619(SoundType.GILDED_BLACKSTONE))
   );
   public static final Block OAK_LOG = register("oak_log", makeLogBlock(MaterialColor.field30960, MaterialColor.field30981));
   public static final Block SPRUCE_LOG = register("spruce_log", makeLogBlock(MaterialColor.field30981, MaterialColor.field30973));
   public static final Block BIRCH_LOG = register("birch_log", makeLogBlock(MaterialColor.field30949, MaterialColor.field30961));
   public static final Block JUNGLE_LOG = register("jungle_log", makeLogBlock(MaterialColor.field30957, MaterialColor.field30981));
   public static final Block ACACIA_LOG = register("acacia_log", makeLogBlock(MaterialColor.field30962, MaterialColor.STONE));
   public static final Block DARK_OAK_LOG = register("dark_oak_log", makeLogBlock(MaterialColor.field30973, MaterialColor.field30973));
   public static final Block STRIPPED_SPRUCE_LOG = register("stripped_spruce_log", makeLogBlock(MaterialColor.field30981, MaterialColor.field30981));
   public static final Block STRIPPED_BIRCH_LOG = register("stripped_birch_log", makeLogBlock(MaterialColor.field30949, MaterialColor.field30949));
   public static final Block STRIPPED_JUNGLE_LOG = register("stripped_jungle_log", makeLogBlock(MaterialColor.field30957, MaterialColor.field30957));
   public static final Block STRIPPED_ACACIA_LOG = register("stripped_acacia_log", makeLogBlock(MaterialColor.field30962, MaterialColor.field30962));
   public static final Block STRIPPED_DARK_OAK_LOG = register("stripped_dark_oak_log", makeLogBlock(MaterialColor.field30973, MaterialColor.field30973));
   public static final Block STRIPPED_OAK_LOG = register("stripped_oak_log", makeLogBlock(MaterialColor.field30960, MaterialColor.field30960));
   public static final Block OAK_WOOD = register(
      "oak_wood", new StrippedCrimsonHyphaeBlock(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30960).method26623(2.0F).method26619(SoundType.WOOD))
   );
   public static final Block SPRUCE_WOOD = register(
      "spruce_wood", new StrippedCrimsonHyphaeBlock(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30981).method26623(2.0F).method26619(SoundType.WOOD))
   );
   public static final Block BIRCH_WOOD = register(
      "birch_wood", new StrippedCrimsonHyphaeBlock(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30949).method26623(2.0F).method26619(SoundType.WOOD))
   );
   public static final Block JUNGLE_WOOD = register(
      "jungle_wood", new StrippedCrimsonHyphaeBlock(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30957).method26623(2.0F).method26619(SoundType.WOOD))
   );
   public static final Block ACACIA_WOOD = register(
      "acacia_wood", new StrippedCrimsonHyphaeBlock(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30968).method26623(2.0F).method26619(SoundType.WOOD))
   );
   public static final Block DARK_OAK_WOOD = register(
      "dark_oak_wood", new StrippedCrimsonHyphaeBlock(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30973).method26623(2.0F).method26619(SoundType.WOOD))
   );
   public static final Block STRIPPED_OAK_WOOD = register(
      "stripped_oak_wood", new StrippedCrimsonHyphaeBlock(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30960).method26623(2.0F).method26619(SoundType.WOOD))
   );
   public static final Block STRIPPED_SPRUCE_WOOD = register(
      "stripped_spruce_wood",
      new StrippedCrimsonHyphaeBlock(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30981).method26623(2.0F).method26619(SoundType.WOOD))
   );
   public static final Block STRIPPED_BIRCH_WOOD = register(
      "stripped_birch_wood",
      new StrippedCrimsonHyphaeBlock(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30949).method26623(2.0F).method26619(SoundType.WOOD))
   );
   public static final Block STRIPPED_JUNGLE_WOOD = register(
      "stripped_jungle_wood",
      new StrippedCrimsonHyphaeBlock(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30957).method26623(2.0F).method26619(SoundType.WOOD))
   );
   public static final Block STRIPPED_ACACIA_WOOD = register(
      "stripped_acacia_wood",
      new StrippedCrimsonHyphaeBlock(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30962).method26623(2.0F).method26619(SoundType.WOOD))
   );
   public static final Block STRIPPED_DARK_OAK_WOOD = register(
      "stripped_dark_oak_wood",
      new StrippedCrimsonHyphaeBlock(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30973).method26623(2.0F).method26619(SoundType.WOOD))
   );
   public static final Block field36446 = register("oak_leaves", method30021());
   public static final Block field36447 = register("spruce_leaves", method30021());
   public static final Block field36448 = register("birch_leaves", method30021());
   public static final Block field36449 = register("jungle_leaves", method30021());
   public static final Block field36450 = register("acacia_leaves", method30021());
   public static final Block field36451 = register("dark_oak_leaves", method30021());
   public static final Block SPONGE = register(
      "sponge", new SpongeBlock(AbstractBlock.Properties.method26609(Material.field38954).method26623(0.6F).method26619(SoundType.GRASS))
   );
   public static final Block WET_SPONGE = register(
      "wet_sponge", new WetSpongeBlock(AbstractBlock.Properties.method26609(Material.field38954).method26623(0.6F).method26619(SoundType.GRASS))
   );
   public static final Block GLASS = register(
      "glass",
      new GlassBlock(
         AbstractBlock.Properties.method26609(Material.field38963)
            .method26623(0.3F)
            .method26619(SoundType.GLASS)
            .method26615()
            .method26629(Blocks::method30012)
            .method26630(Blocks::method30019)
            .method26631(Blocks::method30019)
            .method26632(Blocks::method30019)
      )
   );
   public static final Block LAPIS_ORE = register(
      "lapis_ore", new DiamondOreBlock(AbstractBlock.Properties.method26609(Material.field38966).method26635().method26621(3.0F, 3.0F))
   );
   public static final Block field36456 = register(
      "lapis_block", new Block(AbstractBlock.Properties.method26611(Material.field38967, MaterialColor.field30979).method26635().method26621(3.0F, 3.0F))
   );
   public static final Block DISPENSER = register(
      "dispenser", new Class3357(AbstractBlock.Properties.method26609(Material.field38966).method26635().method26623(3.5F))
   );
   public static final Block SANDSTONE = register(
      "sandstone", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30949).method26635().method26623(0.8F))
   );
   public static final Block CHISELED_SANDSTONE = register(
      "chiseled_sandstone", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30949).method26635().method26623(0.8F))
   );
   public static final Block CUT_SANDSTONE = register(
      "cut_sandstone", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30949).method26635().method26623(0.8F))
   );
   public static final Block NOTE_BLOCK = register(
      "note_block", new Class3426(AbstractBlock.Properties.method26609(Material.field38956).method26619(SoundType.WOOD).method26623(0.8F))
   );
   public static final Block WHITE_BED = register("white_bed", method30015(Class112.field386));
   public static final Block ORANGE_BED = register("orange_bed", method30015(Class112.field387));
   public static final Block MAGENTA_BED = register("magenta_bed", method30015(Class112.field388));
   public static final Block LIGHT_BLUE_BED = register("light_blue_bed", method30015(Class112.field389));
   public static final Block YELLOW_BED = register("yellow_bed", method30015(Class112.field390));
   public static final Block LIME_BED = register("lime_bed", method30015(Class112.field391));
   public static final Block PINK_BED = register("pink_bed", method30015(Class112.field392));
   public static final Block GRAY_BED = register("gray_bed", method30015(Class112.field393));
   public static final Block LIGHT_GRAY_BED = register("light_gray_bed", method30015(Class112.field394));
   public static final Block CYAN_BED = register("cyan_bed", method30015(Class112.field395));
   public static final Block PURPLE_BED = register("purple_bed", method30015(Class112.field396));
   public static final Block BLUE_BED = register("blue_bed", method30015(Class112.field397));
   public static final Block BROWN_RED = register("brown_bed", method30015(Class112.field398));
   public static final Block GREEN_BED = register("green_bed", method30015(Class112.field399));
   public static final Block RED_BED = register("red_bed", method30015(Class112.field400));
   public static final Block BLACK_BED = register("black_bed", method30015(Class112.field401));
   public static final Block POWERED_RAIL = register(
      "powered_rail", new ActivatorRailBlock(AbstractBlock.Properties.method26609(Material.field38946).method26614().method26623(0.7F).method26619(SoundType.METAL))
   );
   public static final Block DETECTOR_RAIL = register(
      "detector_rail", new Class3431(AbstractBlock.Properties.method26609(Material.field38946).method26614().method26623(0.7F).method26619(SoundType.METAL))
   );
   public static final Block STICKY_PISTON = register("sticky_piston", method30023(true));
   public static final Block COBWEB = register(
      "cobweb", new Class3212(AbstractBlock.Properties.method26609(Material.field38947).method26614().method26635().method26623(4.0F))
   );
   public static final Block GRASS = register(
      "grass", new Class3487(AbstractBlock.Properties.method26609(Material.TALL_PLANTS).method26614().method26622().method26619(SoundType.GRASS))
   );
   public static final Block FERN = register(
      "fern", new Class3487(AbstractBlock.Properties.method26609(Material.TALL_PLANTS).method26614().method26622().method26619(SoundType.GRASS))
   );
   public static final Block DEAD_BUSH = register(
      "dead_bush",
      new Class3492(AbstractBlock.Properties.method26611(Material.TALL_PLANTS, MaterialColor.field30960).method26614().method26622().method26619(SoundType.GRASS))
   );
   public static final Block SEAGRASS = register(
      "seagrass", new Class3450(AbstractBlock.Properties.method26609(Material.field38940).method26614().method26622().method26619(SoundType.WET_GRASS))
   );
   public static final Block TALL_SEAGRASS = register(
      "tall_seagrass", new Class3455(AbstractBlock.Properties.method26609(Material.field38940).method26614().method26622().method26619(SoundType.WET_GRASS))
   );
   public static final Block PISTON = register("piston", method30023(false));
   public static final Block PISTON_HEAD = register(
      "piston_head", new Class3436(AbstractBlock.Properties.method26609(Material.PISTON).method26623(1.5F).method26626())
   );
   public static final Block WHITE_WOOL = register(
      "white_wool", new Block(AbstractBlock.Properties.method26611(Material.field38960, MaterialColor.SNOW).method26623(0.8F).method26619(SoundType.WOOL))
   );
   public static final Block ORANGE_WOOL = register(
      "orange_wool", new Block(AbstractBlock.Properties.method26611(Material.field38960, MaterialColor.field30962).method26623(0.8F).method26619(SoundType.WOOL))
   );
   public static final Block MAGENTA_WOOL = register(
      "magenta_wool", new Block(AbstractBlock.Properties.method26611(Material.field38960, MaterialColor.field30963).method26623(0.8F).method26619(SoundType.WOOL))
   );
   public static final Block LIGHT_BLUE_WOOL = register(
      "light_blue_wool", new Block(AbstractBlock.Properties.method26611(Material.field38960, MaterialColor.field30964).method26623(0.8F).method26619(SoundType.WOOL))
   );
   public static final Block YELLOW_WOOL = register(
      "yellow_wool", new Block(AbstractBlock.Properties.method26611(Material.field38960, MaterialColor.field30965).method26623(0.8F).method26619(SoundType.WOOL))
   );
   public static final Block LIME_WOOL = register(
      "lime_wool", new Block(AbstractBlock.Properties.method26611(Material.field38960, MaterialColor.field30966).method26623(0.8F).method26619(SoundType.WOOL))
   );
   public static final Block PINK_WOOL = register(
      "pink_wool", new Block(AbstractBlock.Properties.method26611(Material.field38960, MaterialColor.field30967).method26623(0.8F).method26619(SoundType.WOOL))
   );
   public static final Block GRAY_WOOL = register(
      "gray_wool", new Block(AbstractBlock.Properties.method26611(Material.field38960, MaterialColor.field30968).method26623(0.8F).method26619(SoundType.WOOL))
   );
   public static final Block LIGHT_GRAY_WOOL = register(
      "light_gray_wool", new Block(AbstractBlock.Properties.method26611(Material.field38960, MaterialColor.field30969).method26623(0.8F).method26619(SoundType.WOOL))
   );
   public static final Block CYAN_WOOL = register(
      "cyan_wool", new Block(AbstractBlock.Properties.method26611(Material.field38960, MaterialColor.field30970).method26623(0.8F).method26619(SoundType.WOOL))
   );
   public static final Block PURPLE_WOOL = register(
      "purple_wool", new Block(AbstractBlock.Properties.method26611(Material.field38960, MaterialColor.field30971).method26623(0.8F).method26619(SoundType.WOOL))
   );
   public static final Block BLUE_WOOL = register(
      "blue_wool", new Block(AbstractBlock.Properties.method26611(Material.field38960, MaterialColor.field30972).method26623(0.8F).method26619(SoundType.WOOL))
   );
   public static final Block BROWN_WOOL = register(
      "brown_wool", new Block(AbstractBlock.Properties.method26611(Material.field38960, MaterialColor.field30973).method26623(0.8F).method26619(SoundType.WOOL))
   );
   public static final Block GREEN_WOOL = register(
      "green_wool", new Block(AbstractBlock.Properties.method26611(Material.field38960, MaterialColor.field30974).method26623(0.8F).method26619(SoundType.WOOL))
   );
   public static final Block RED_WOOL = register(
      "red_wool", new Block(AbstractBlock.Properties.method26611(Material.field38960, MaterialColor.field30975).method26623(0.8F).method26619(SoundType.WOOL))
   );
   public static final Block BLACK_WOOL = register(
      "black_wool", new Block(AbstractBlock.Properties.method26611(Material.field38960, MaterialColor.field30976).method26623(0.8F).method26619(SoundType.WOOL))
   );
   public static final Block MOVING_PISTON = register(
      "moving_piston",
      new Class3356(
         AbstractBlock.Properties.method26609(Material.PISTON)
            .method26623(-1.0F)
            .method26625()
            .method26626()
            .method26615()
            .method26630(Blocks::method30019)
            .method26631(Blocks::method30019)
            .method26632(Blocks::method30019)
      )
   );
   public static final Block DANDELION = register(
      "dandelion",
      new Class3490(Effects.SATURATION, 7, AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26622().method26619(SoundType.GRASS))
   );
   public static final Block POPPY = register(
      "poppy",
      new Class3490(Effects.NIGHT_VISION, 5, AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26622().method26619(SoundType.GRASS))
   );
   public static final Block BLUE_ORCHID = register(
      "blue_orchid",
      new Class3490(Effects.SATURATION, 7, AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26622().method26619(SoundType.GRASS))
   );
   public static final Block ALLIUM = register(
      "allium",
      new Class3490(Effects.FIRE_RESISTANCE, 4, AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26622().method26619(SoundType.GRASS))
   );
   public static final Block AZURE_BLUET = register(
      "azure_bluet",
      new Class3490(Effects.BLINDNESS, 8, AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26622().method26619(SoundType.GRASS))
   );
   public static final Block RED_TULIP = register(
      "red_tulip",
      new Class3490(Effects.WEAKNESS, 9, AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26622().method26619(SoundType.GRASS))
   );
   public static final Block ORANGE_TULIP = register(
      "orange_tulip",
      new Class3490(Effects.WEAKNESS, 9, AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26622().method26619(SoundType.GRASS))
   );
   public static final Block WHITE_TULIP = register(
      "white_tulip",
      new Class3490(Effects.WEAKNESS, 9, AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26622().method26619(SoundType.GRASS))
   );
   public static final Block PINK_TULIP = register(
      "pink_tulip",
      new Class3490(Effects.WEAKNESS, 9, AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26622().method26619(SoundType.GRASS))
   );
   public static final Block OXEYE_DAISY = register(
      "oxeye_daisy",
      new Class3490(Effects.REGENERATION, 8, AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26622().method26619(SoundType.GRASS))
   );
   public static final Block CORNFLOWER = register(
      "cornflower",
      new Class3490(Effects.JUMP_BOOST, 6, AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26622().method26619(SoundType.GRASS))
   );
   public static final Block WITHER_ROSE = register(
      "wither_rose",
      new Class3491(Effects.WITHER, AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26622().method26619(SoundType.GRASS))
   );
   public static final Block LILY_OF_THE_VALLEY = register(
      "lily_of_the_valley",
      new Class3490(Effects.POISON, 12, AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26622().method26619(SoundType.GRASS))
   );
   public static final Block BROWN_MUSHROOM = register(
      "brown_mushroom",
      new Class3479(
         AbstractBlock.Properties.method26611(Material.PLANTS, MaterialColor.field30973)
            .method26614()
            .method26624()
            .method26622()
            .method26619(SoundType.GRASS)
            .method26620(var0 -> 1)
            .method26633(Blocks::method30018)
      )
   );
   public static final Block RED_MUSHROOM = register(
      "red_mushroom",
      new Class3479(
         AbstractBlock.Properties.method26611(Material.PLANTS, MaterialColor.field30975)
            .method26614()
            .method26624()
            .method26622()
            .method26619(SoundType.GRASS)
            .method26633(Blocks::method30018)
      )
   );
   public static final Block field36521 = register(
      "gold_block",
      new Block(AbstractBlock.Properties.method26611(Material.field38967, MaterialColor.field30977).method26635().method26621(3.0F, 6.0F).method26619(SoundType.METAL))
   );
   public static final Block field36522 = register(
      "iron_block",
      new Block(AbstractBlock.Properties.method26611(Material.field38967, MaterialColor.IRON).method26635().method26621(5.0F, 6.0F).method26619(SoundType.METAL))
   );
   public static final Block BRICKS = register(
      "bricks", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30975).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block TNT = register(
      "tnt", new Class3458(AbstractBlock.Properties.method26609(Material.field38961).method26622().method26619(SoundType.GRASS))
   );
   public static final Block field36525 = register(
      "bookshelf", new Block(AbstractBlock.Properties.method26609(Material.field38956).method26623(1.5F).method26619(SoundType.WOOD))
   );
   public static final Block field36526 = register(
      "mossy_cobblestone", new Block(AbstractBlock.Properties.method26609(Material.field38966).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block field36527 = register(
      "obsidian", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30976).method26635().method26621(50.0F, 1200.0F))
   );
   public static final Block TORCH = register(
      "torch",
      new SoulTorchBlock(
         AbstractBlock.Properties.method26609(Material.field38946).method26614().method26622().method26620(var0 -> 14).method26619(SoundType.WOOD),
         ParticleTypes.field34074
      )
   );
   public static final Block WALL_TORCH = register(
      "wall_torch",
      new SoulWallTorchBlock(
         AbstractBlock.Properties.method26609(Material.field38946)
            .method26614()
            .method26622()
            .method26620(var0 -> 14)
            .method26619(SoundType.WOOD)
            .method26627(TORCH),
         ParticleTypes.field34074
      )
   );
   public static final Block FIRE = register(
      "fire",
      new Class3399(
         AbstractBlock.Properties.method26611(Material.field38945, MaterialColor.field30951)
            .method26614()
            .method26622()
            .method26620(var0 -> 15)
            .method26619(SoundType.WOOL)
      )
   );
   public static final Block SOUL_FIRE = register(
      "soul_fire",
      new SoulFireBlock(
         AbstractBlock.Properties.method26611(Material.field38945, MaterialColor.field30964)
            .method26614()
            .method26622()
            .method26620(var0 -> 10)
            .method26619(SoundType.WOOL)
      )
   );
   public static final Block SPAWNER = register(
      "spawner", new SpawnerBlock(AbstractBlock.Properties.method26609(Material.field38966).method26635().method26623(5.0F).method26619(SoundType.METAL).method26615())
   );
   public static final Block field36533 = register("oak_stairs", new StairsBlock(field36400.getDefaultState(), AbstractBlock.Properties.method26613(field36400)));
   public static final Block CHEST = register(
      "chest", new ChestBlock(AbstractBlock.Properties.method26609(Material.field38956).method26623(2.5F).method26619(SoundType.WOOD), () -> TileEntityType.CHEST)
   );
   public static final Block REDSTONE_WIRE = register(
      "redstone_wire", new Class3222(AbstractBlock.Properties.method26609(Material.field38946).method26614().method26622())
   );
   public static final Block DIAMOND_ORE = register(
      "diamond_ore", new DiamondOreBlock(AbstractBlock.Properties.method26609(Material.field38966).method26635().method26621(3.0F, 3.0F))
   );
   public static final Block field36537 = register(
      "diamond_block",
      new Block(AbstractBlock.Properties.method26611(Material.field38967, MaterialColor.field30978).method26635().method26621(5.0F, 6.0F).method26619(SoundType.METAL))
   );
   public static final Block CRAFTING_TABLE = register(
      "crafting_table", new Class3438(AbstractBlock.Properties.method26609(Material.field38956).method26623(2.5F).method26619(SoundType.WOOD))
   );
   public static final Block WHEAT = register(
      "wheat", new WheatBlock(AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26624().method26622().method26619(SoundType.CROP))
   );
   public static final Block FARMLAND = register(
      "farmland",
      new Class3221(
         AbstractBlock.Properties.method26609(Material.field38950)
            .method26624()
            .method26623(0.6F)
            .method26619(SoundType.GRAVEL)
            .method26632(Blocks::method30018)
            .method26631(Blocks::method30018)
      )
   );
   public static final Block FURNACE = register(
      "furnace", new Class3353(AbstractBlock.Properties.method26609(Material.field38966).method26635().method26623(3.5F).method26620(method30011(13)))
   );
   public static final Block OAK_SIGN = register(
      "oak_sign",
      new CrimsonSignBlock(AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD), Class9673.field45166)
   );
   public static final Block SPRUCE_SIGN = register(
      "spruce_sign",
      new CrimsonSignBlock(
         AbstractBlock.Properties.method26611(Material.field38956, SPRUCE_LOG.method12000()).method26614().method26623(1.0F).method26619(SoundType.WOOD),
         Class9673.field45167
      )
   );
   public static final Block BIRCH_SIGN = register(
      "birch_sign",
      new CrimsonSignBlock(
         AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30949).method26614().method26623(1.0F).method26619(SoundType.WOOD),
         Class9673.field45168
      )
   );
   public static final Block ACACIA_SIGN = register(
      "acacia_sign",
      new CrimsonSignBlock(
         AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30962).method26614().method26623(1.0F).method26619(SoundType.WOOD),
         Class9673.field45169
      )
   );
   public static final Block JUNGLE_SIGN = register(
      "jungle_sign",
      new CrimsonSignBlock(
         AbstractBlock.Properties.method26611(Material.field38956, JUNGLE_LOG.method12000()).method26614().method26623(1.0F).method26619(SoundType.WOOD),
         Class9673.field45170
      )
   );
   public static final Block DARK_OAK_SIGN = register(
      "dark_oak_sign",
      new CrimsonSignBlock(
         AbstractBlock.Properties.method26611(Material.field38956, DARK_OAK_LOG.method12000()).method26614().method26623(1.0F).method26619(SoundType.WOOD),
         Class9673.field45171
      )
   );
   public static final Block OAK_DOOR = register(
      "oak_door",
      new DoorBlock(AbstractBlock.Properties.method26611(Material.field38956, field36400.method12000()).method26623(3.0F).method26619(SoundType.WOOD).method26615())
   );
   public static final Block LADDER = register(
      "ladder", new Class3423(AbstractBlock.Properties.method26609(Material.field38946).method26623(0.4F).method26619(SoundType.LADDER).method26615())
   );
   public static final Block RAIL = register(
      "rail", new Class3430(AbstractBlock.Properties.method26609(Material.field38946).method26614().method26623(0.7F).method26619(SoundType.METAL))
   );
   public static final Block COBBLESTONE_STAIRS = register("cobblestone_stairs", new StairsBlock(field36399.getDefaultState(), AbstractBlock.Properties.method26613(field36399)));
   public static final Block OAK_WALL_SIGN = register(
      "oak_wall_sign",
      new WarpedWallSignBlock(
         AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD).method26627(OAK_SIGN),
         Class9673.field45166
      )
   );
   public static final Block SPRUCE_WALL_SIGN = register(
      "spruce_wall_sign",
      new WarpedWallSignBlock(
         AbstractBlock.Properties.method26611(Material.field38956, SPRUCE_LOG.method12000())
            .method26614()
            .method26623(1.0F)
            .method26619(SoundType.WOOD)
            .method26627(SPRUCE_SIGN),
         Class9673.field45167
      )
   );
   public static final Block BIRCH_WALL_SIGN = register(
      "birch_wall_sign",
      new WarpedWallSignBlock(
         AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30949)
            .method26614()
            .method26623(1.0F)
            .method26619(SoundType.WOOD)
            .method26627(BIRCH_SIGN),
         Class9673.field45168
      )
   );
   public static final Block ACACIA_WALL_SIGN = register(
      "acacia_wall_sign",
      new WarpedWallSignBlock(
         AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30962)
            .method26614()
            .method26623(1.0F)
            .method26619(SoundType.WOOD)
            .method26627(ACACIA_SIGN),
         Class9673.field45169
      )
   );
   public static final Block JUNGLE_WALL_SIGN = register(
      "jungle_wall_sign",
      new WarpedWallSignBlock(
         AbstractBlock.Properties.method26611(Material.field38956, JUNGLE_LOG.method12000())
            .method26614()
            .method26623(1.0F)
            .method26619(SoundType.WOOD)
            .method26627(JUNGLE_SIGN),
         Class9673.field45170
      )
   );
   public static final Block DARK_OAK_WALL_SIGN = register(
      "dark_oak_wall_sign",
      new WarpedWallSignBlock(
         AbstractBlock.Properties.method26611(Material.field38956, DARK_OAK_LOG.method12000())
            .method26614()
            .method26623(1.0F)
            .method26619(SoundType.WOOD)
            .method26627(DARK_OAK_SIGN),
         Class9673.field45171
      )
   );
   public static final Block LEVER = register(
      "lever", new Class3201(AbstractBlock.Properties.method26609(Material.field38946).method26614().method26623(0.5F).method26619(SoundType.WOOD))
   );
   public static final Block STONE_PRESSURE_PLATE = register(
      "stone_pressure_plate", new WarpedPressurePlateBlock(Class2275.field14824, AbstractBlock.Properties.method26609(Material.field38966).method26635().method26614().method26623(0.5F))
   );
   public static final Block IRON_DOOR = register(
      "iron_door",
      new DoorBlock(
         AbstractBlock.Properties.method26611(Material.field38967, MaterialColor.IRON).method26635().method26623(5.0F).method26619(SoundType.METAL).method26615()
      )
   );
   public static final Block OAK_PRESSURE_PLATE = register(
      "oak_pressure_plate",
      new WarpedPressurePlateBlock(
         Class2275.field14823,
         AbstractBlock.Properties.method26611(Material.field38956, field36400.method12000()).method26614().method26623(0.5F).method26619(SoundType.WOOD)
      )
   );
   public static final Block SPRUCE_PRESSURE_PLATE = register(
      "spruce_pressure_plate",
      new WarpedPressurePlateBlock(
         Class2275.field14823,
         AbstractBlock.Properties.method26611(Material.field38956, field36401.method12000()).method26614().method26623(0.5F).method26619(SoundType.WOOD)
      )
   );
   public static final Block BIRCH_PRESSURE_PLATE = register(
      "birch_pressure_plate",
      new WarpedPressurePlateBlock(
         Class2275.field14823,
         AbstractBlock.Properties.method26611(Material.field38956, field36402.method12000()).method26614().method26623(0.5F).method26619(SoundType.WOOD)
      )
   );
   public static final Block JUNGLE_PRESSURE_PLATE = register(
      "jungle_pressure_plate",
      new WarpedPressurePlateBlock(
         Class2275.field14823,
         AbstractBlock.Properties.method26611(Material.field38956, field36403.method12000()).method26614().method26623(0.5F).method26619(SoundType.WOOD)
      )
   );
   public static final Block ACACIA_PRESSURE_PLATE = register(
      "acacia_pressure_plate",
      new WarpedPressurePlateBlock(
         Class2275.field14823,
         AbstractBlock.Properties.method26611(Material.field38956, field36404.method12000()).method26614().method26623(0.5F).method26619(SoundType.WOOD)
      )
   );
   public static final Block DARK_OAK_PRESSURE_PLATE = register(
      "dark_oak_pressure_plate",
      new WarpedPressurePlateBlock(
         Class2275.field14823,
         AbstractBlock.Properties.method26611(Material.field38956, field36405.method12000()).method26614().method26623(0.5F).method26619(SoundType.WOOD)
      )
   );
   public static final Block REDSTONE_ORE = register(
      "redstone_ore",
      new Class3403(AbstractBlock.Properties.method26609(Material.field38966).method26635().method26624().method26620(method30011(9)).method26621(3.0F, 3.0F))
   );
   public static final Block REDSTONE_TORCH = register(
      "redstone_torch",
      new RedstoneTorchBlock(AbstractBlock.Properties.method26609(Material.field38946).method26614().method26622().method26620(method30011(7)).method26619(SoundType.WOOD))
   );
   public static final Block REDSTONE_WALL_TORCH = register(
      "redstone_wall_torch",
      new RedstoneWallTorchBlock(
         AbstractBlock.Properties.method26609(Material.field38946)
            .method26614()
            .method26622()
            .method26620(method30011(7))
            .method26619(SoundType.WOOD)
            .method26627(REDSTONE_TORCH)
      )
   );
   public static final Block STONE_BUTTON = register(
      "stone_button", new StoneButtonBlock(AbstractBlock.Properties.method26609(Material.field38946).method26614().method26623(0.5F))
   );
   public static final Block SNOW = register(
      "snow", new Class3410(AbstractBlock.Properties.method26609(Material.field38944).method26624().method26623(0.1F).method26635().method26619(SoundType.SNOW))
   );
   public static final Block ICE = register(
      "ice",
      new Class3377(
         AbstractBlock.Properties.method26609(Material.ICE)
            .method26616(0.98F)
            .method26624()
            .method26623(0.5F)
            .method26619(SoundType.GLASS)
            .method26615()
            .method26629((var0, var1, var2, var3) -> var3 == EntityType.POLAR_BEAR)
      )
   );
   public static final Block SNOW_BLOCK = register(
      "snow_block", new Block(AbstractBlock.Properties.method26609(Material.SNOW_BLOCK).method26635().method26623(0.2F).method26619(SoundType.SNOW))
   );
   public static final Block CACTUS = register(
      "cactus", new Class3220(AbstractBlock.Properties.method26609(Material.field38965).method26624().method26623(0.4F).method26619(SoundType.WOOL))
   );
   public static final Block CLAY = register(
      "clay", new Block(AbstractBlock.Properties.method26609(Material.field38949).method26623(0.6F).method26619(SoundType.GRAVEL))
   );
   public static final Block SUGAR_CANE = register(
      "sugar_cane", new Class3408(AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26624().method26622().method26619(SoundType.GRASS))
   );
   public static final Block JUKEBOX = register(
      "jukebox", new Class3364(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30957).method26621(2.0F, 6.0F))
   );
   public static final Block OAK_FENCE = register(
      "oak_fence",
      new WarpedFenceBlock(AbstractBlock.Properties.method26611(Material.field38956, field36400.method12000()).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block PUMPKIN = register(
      "pumpkin", new Class3464(AbstractBlock.Properties.method26611(Material.GOURD, MaterialColor.field30962).method26623(1.0F).method26619(SoundType.WOOD))
   );
   public static final Block NETHERRACK = register(
      "netherrack",
      new Class3385(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30982).method26635().method26623(0.4F).method26619(SoundType.NETHER_BRICKS))
   );
   public static final Block SOUL_SAND = register(
      "soul_sand",
      new Class3409(
         AbstractBlock.Properties.method26611(Material.field38953, MaterialColor.field30973)
            .method26623(0.5F)
            .method26617(0.4F)
            .method26619(SoundType.SOUL_SOIL)
            .method26629(Blocks::method30013)
            .method26630(Blocks::method30018)
            .method26632(Blocks::method30018)
            .method26631(Blocks::method30018)
      )
   );
   public static final Block SOUL_SOIL = register(
      "soul_soil", new Block(AbstractBlock.Properties.method26611(Material.field38950, MaterialColor.field30973).method26623(0.5F).method26619(SoundType.BASALT))
   );
   public static final Block BASALT = register(
      "basalt",
      new StrippedCrimsonHyphaeBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30976).method26635().method26621(1.25F, 4.2F).method26619(SoundType.WART_BLOCK))
   );
   public static final Block POLISHED_BASALT = register(
      "polished_basalt",
      new StrippedCrimsonHyphaeBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30976).method26635().method26621(1.25F, 4.2F).method26619(SoundType.WART_BLOCK))
   );
   public static final Block SOUL_TORCH = register(
      "soul_torch",
      new SoulTorchBlock(
         AbstractBlock.Properties.method26609(Material.field38946).method26614().method26622().method26620(var0 -> 10).method26619(SoundType.WOOD),
         ParticleTypes.field34075
      )
   );
   public static final Block SOUL_WALL_TORCH = register(
      "soul_wall_torch",
      new SoulWallTorchBlock(
         AbstractBlock.Properties.method26609(Material.field38946)
            .method26614()
            .method26622()
            .method26620(var0 -> 10)
            .method26619(SoundType.WOOD)
            .method26627(SOUL_TORCH),
         ParticleTypes.field34075
      )
   );
   public static final Block field36587 = register(
      "glowstone",
      new Block(
         AbstractBlock.Properties.method26611(Material.field38963, MaterialColor.field30949).method26623(0.3F).method26619(SoundType.GLASS).method26620(var0 -> 15)
      )
   );
   public static final Block NETHER_PORTAL = register(
      "nether_portal",
      new NetherPortalBlock(
         AbstractBlock.Properties.method26609(Material.field38934).method26614().method26624().method26623(-1.0F).method26619(SoundType.GLASS).method26620(var0 -> 11)
      )
   );
   public static final Block CARVED_PUMPKIN = register(
      "carved_pumpkin",
      new CarvedPumpkinBlock(
         AbstractBlock.Properties.method26611(Material.GOURD, MaterialColor.field30962)
            .method26623(1.0F)
            .method26619(SoundType.WOOD)
            .method26629(Blocks::method30013)
      )
   );
   public static final Block JACK_O_LANTERN = register(
      "jack_o_lantern",
      new CarvedPumpkinBlock(
         AbstractBlock.Properties.method26611(Material.GOURD, MaterialColor.field30962)
            .method26623(1.0F)
            .method26619(SoundType.WOOD)
            .method26620(var0 -> 15)
            .method26629(Blocks::method30013)
      )
   );
   public static final Block CAKE = register(
      "cake", new CakeBlock(AbstractBlock.Properties.method26609(Material.CAKE).method26623(0.5F).method26619(SoundType.WOOL))
   );
   public static final Block REPEATER = register(
      "repeater", new Class3248(AbstractBlock.Properties.method26609(Material.field38946).method26622().method26619(SoundType.WOOD))
   );
   public static final Block field36593 = register("white_stained_glass", method30020(Class112.field386));
   public static final Block field36594 = register("orange_stained_glass", method30020(Class112.field387));
   public static final Block field36595 = register("magenta_stained_glass", method30020(Class112.field388));
   public static final Block field36596 = register("light_blue_stained_glass", method30020(Class112.field389));
   public static final Block field36597 = register("yellow_stained_glass", method30020(Class112.field390));
   public static final Block field36598 = register("lime_stained_glass", method30020(Class112.field391));
   public static final Block field36599 = register("pink_stained_glass", method30020(Class112.field392));
   public static final Block field36600 = register("gray_stained_glass", method30020(Class112.field393));
   public static final Block field36601 = register("light_gray_stained_glass", method30020(Class112.field394));
   public static final Block field36602 = register("cyan_stained_glass", method30020(Class112.field395));
   public static final Block field36603 = register("purple_stained_glass", method30020(Class112.field396));
   public static final Block field36604 = register("blue_stained_glass", method30020(Class112.field397));
   public static final Block field36605 = register("brown_stained_glass", method30020(Class112.field398));
   public static final Block field36606 = register("green_stained_glass", method30020(Class112.field399));
   public static final Block field36607 = register("red_stained_glass", method30020(Class112.field400));
   public static final Block field36608 = register("black_stained_glass", method30020(Class112.field401));
   public static final Block OAK_TRAPDOOR = register(
      "oak_trapdoor",
      new WarpedTrapdoorBlock(
         AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30960)
            .method26623(3.0F)
            .method26619(SoundType.WOOD)
            .method26615()
            .method26629(Blocks::method30012)
      )
   );
   public static final Block SPRUCE_TRAPDOOR = register(
      "spruce_trapdoor",
      new WarpedTrapdoorBlock(
         AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30981)
            .method26623(3.0F)
            .method26619(SoundType.WOOD)
            .method26615()
            .method26629(Blocks::method30012)
      )
   );
   public static final Block BIRCH_TRAPDOOR = register(
      "birch_trapdoor",
      new WarpedTrapdoorBlock(
         AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30949)
            .method26623(3.0F)
            .method26619(SoundType.WOOD)
            .method26615()
            .method26629(Blocks::method30012)
      )
   );
   public static final Block JUNGLE_TRAPDOOR = register(
      "jungle_trapdoor",
      new WarpedTrapdoorBlock(
         AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30957)
            .method26623(3.0F)
            .method26619(SoundType.WOOD)
            .method26615()
            .method26629(Blocks::method30012)
      )
   );
   public static final Block ACACIA_TRAPDOOR = register(
      "acacia_trapdoor",
      new WarpedTrapdoorBlock(
         AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30962)
            .method26623(3.0F)
            .method26619(SoundType.WOOD)
            .method26615()
            .method26629(Blocks::method30012)
      )
   );
   public static final Block DARK_OAK_TRAPDOOR = register(
      "dark_oak_trapdoor",
      new WarpedTrapdoorBlock(
         AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30973)
            .method26623(3.0F)
            .method26619(SoundType.WOOD)
            .method26615()
            .method26629(Blocks::method30012)
      )
   );
   public static final Block field36615 = register(
      "stone_bricks", new Block(AbstractBlock.Properties.method26609(Material.field38966).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block field36616 = register(
      "mossy_stone_bricks", new Block(AbstractBlock.Properties.method26609(Material.field38966).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block field36617 = register(
      "cracked_stone_bricks", new Block(AbstractBlock.Properties.method26609(Material.field38966).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block field36618 = register(
      "chiseled_stone_bricks", new Block(AbstractBlock.Properties.method26609(Material.field38966).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block INFESTED_STONE = register(
      "infested_stone", new InfestedChiseledStoneBricksBlock(STONE, AbstractBlock.Properties.method26609(Material.field38949).method26621(0.0F, 0.75F))
   );
   public static final Block INFESTED_COBBLESTONE = register(
      "infested_cobblestone", new InfestedChiseledStoneBricksBlock(field36399, AbstractBlock.Properties.method26609(Material.field38949).method26621(0.0F, 0.75F))
   );
   public static final Block INFESTED_STONE_BRICKS = register(
      "infested_stone_bricks", new InfestedChiseledStoneBricksBlock(field36615, AbstractBlock.Properties.method26609(Material.field38949).method26621(0.0F, 0.75F))
   );
   public static final Block INFESTED_MOSSY_STONE_BRICKS = register(
      "infested_mossy_stone_bricks", new InfestedChiseledStoneBricksBlock(field36616, AbstractBlock.Properties.method26609(Material.field38949).method26621(0.0F, 0.75F))
   );
   public static final Block INFESTED_CRACKED_STONE_BRICKS = register(
      "infested_cracked_stone_bricks", new InfestedChiseledStoneBricksBlock(field36617, AbstractBlock.Properties.method26609(Material.field38949).method26621(0.0F, 0.75F))
   );
   public static final Block INFESTED_CHISELED_STONE_BRICKS = register(
      "infested_chiseled_stone_bricks", new InfestedChiseledStoneBricksBlock(field36618, AbstractBlock.Properties.method26609(Material.field38949).method26621(0.0F, 0.75F))
   );
   public static final Block BROWN_MUSHROOM_BLOCK = register(
      "brown_mushroom_block",
      new Class3443(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30957).method26623(0.2F).method26619(SoundType.WOOD))
   );
   public static final Block RED_MUSHROOM_BLOCK = register(
      "red_mushroom_block",
      new Class3443(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30975).method26623(0.2F).method26619(SoundType.WOOD))
   );
   public static final Block MUSHROOM_STEM = register(
      "mushroom_stem", new Class3443(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30950).method26623(0.2F).method26619(SoundType.WOOD))
   );
   public static final Block IRON_BARS = register(
      "iron_bars",
      new Class3237(
         AbstractBlock.Properties.method26611(Material.field38967, MaterialColor.AIR)
            .method26635()
            .method26621(5.0F, 6.0F)
            .method26619(SoundType.METAL)
            .method26615()
      )
   );
   public static final Block CHAIN = register(
      "chain",
      new Class3387(
         AbstractBlock.Properties.method26611(Material.field38967, MaterialColor.AIR)
            .method26635()
            .method26621(5.0F, 6.0F)
            .method26619(SoundType.NETHER_GOLD_ORE)
            .method26615()
      )
   );
   public static final Block GLASS_PANE = register(
      "glass_pane", new Class3237(AbstractBlock.Properties.method26609(Material.field38963).method26623(0.3F).method26619(SoundType.GLASS).method26615())
   );
   public static final Block MELON = register(
      "melon", new Class3463(AbstractBlock.Properties.method26611(Material.GOURD, MaterialColor.field30966).method26623(1.0F).method26619(SoundType.WOOD))
   );
   public static final Block ATTACHED_PUMPKIN_STEM = register(
      "attached_pumpkin_stem",
      new Class3493((Class3462) PUMPKIN, AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26622().method26619(SoundType.WOOD))
   );
   public static final Block ATTACHED_MELON_STEM = register(
      "attached_melon_stem",
      new Class3493((Class3462) MELON, AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26622().method26619(SoundType.WOOD))
   );
   public static final Block PUMPKIN_STEM = register(
      "pumpkin_stem",
      new Class3486(
         (Class3462) PUMPKIN, AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26624().method26622().method26619(SoundType.HARD_CROP)
      )
   );
   public static final Block MELON_STEM = register(
      "melon_stem",
      new Class3486(
         (Class3462) MELON, AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26624().method26622().method26619(SoundType.HARD_CROP)
      )
   );
   public static final Block VINE = register(
      "vine", new Class3402(AbstractBlock.Properties.method26609(Material.TALL_PLANTS).method26614().method26624().method26623(0.2F).method26619(SoundType.VINE))
   );
   public static final Block OAK_FENCE_GATE = register(
      "oak_fence_gate",
      new FenceGateBlock(AbstractBlock.Properties.method26611(Material.field38956, field36400.method12000()).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block BRICK_STAIRS = register("brick_stairs", new StairsBlock(BRICKS.getDefaultState(), AbstractBlock.Properties.method26613(BRICKS)));
   public static final Block STONE_BRICK_STAIRS = register("stone_brick_stairs", new StairsBlock(field36615.getDefaultState(), AbstractBlock.Properties.method26613(field36615)));
   public static final Block MYCELIUM = register(
      "mycelium",
      new Class3474(AbstractBlock.Properties.method26611(Material.field38951, MaterialColor.field30971).method26624().method26623(0.6F).method26619(SoundType.GRASS))
   );
   public static final Block LILY_PAD = register(
      "lily_pad", new LilyPadBlock(AbstractBlock.Properties.method26609(Material.PLANTS).method26622().method26619(SoundType.LILY_PAD).method26615())
   );
   public static final Block NETHER_BRICKS = register(
      "nether_bricks",
      new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30982).method26635().method26621(2.0F, 6.0F).method26619(SoundType.NETHER_SPROUTS))
   );
   public static final Block NETHER_BRICK_FENCE = register(
      "nether_brick_fence",
      new WarpedFenceBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30982).method26635().method26621(2.0F, 6.0F).method26619(SoundType.NETHER_SPROUTS))
   );
   public static final Block NETHER_BRICK_STAIRS = register("nether_brick_stairs", new StairsBlock(NETHER_BRICKS.getDefaultState(), AbstractBlock.Properties.method26613(NETHER_BRICKS)));
   public static final Block NETHER_WART = register(
      "nether_wart",
      new Class3489(AbstractBlock.Properties.method26611(Material.PLANTS, MaterialColor.field30975).method26614().method26624().method26619(SoundType.NETHER_WART))
   );
   public static final Block ENCHANTING_TABLE = register(
      "enchanting_table", new Class3363(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30975).method26635().method26621(5.0F, 1200.0F))
   );
   public static final Block BREWING_STAND = register(
      "brewing_stand", new BrewingStandBlock(AbstractBlock.Properties.method26609(Material.field38967).method26635().method26623(0.5F).method26620(var0 -> 1).method26615())
   );
   public static final Block CAULDRON = register(
      "cauldron", new CauldronBlock(AbstractBlock.Properties.method26611(Material.field38967, MaterialColor.STONE).method26635().method26623(2.0F).method26615())
   );
   public static final Block END_PORTAL = register(
      "end_portal",
      new EndPortalBlock(
         AbstractBlock.Properties.method26611(Material.field38934, MaterialColor.field30976).method26614().method26620(var0 -> 15).method26621(-1.0F, 3600000.0F).method26626()
      )
   );
   public static final Block END_PORTAL_FRAME = register(
      "end_portal_frame",
      new EndPortalFrameBlock(
         AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30974)
            .method26619(SoundType.GLASS)
            .method26620(var0 -> 1)
            .method26621(-1.0F, 3600000.0F)
            .method26626()
      )
   );
   public static final Block field36651 = register(
      "end_stone", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30949).method26635().method26621(3.0F, 9.0F))
   );
   public static final Block DRAGON_EGG = register(
      "dragon_egg",
      new DragonEggBlock(AbstractBlock.Properties.method26611(Material.DRAGON_EGG, MaterialColor.field30976).method26621(3.0F, 9.0F).method26620(var0 -> 1).method26615())
   );
   public static final Block REDSTONE_LAMP = register(
      "redstone_lamp",
      new RedstoneLampBlock(
         AbstractBlock.Properties.method26609(Material.field38948)
            .method26620(method30011(15))
            .method26623(0.3F)
            .method26619(SoundType.GLASS)
            .method26629(Blocks::method30013)
      )
   );
   public static final Block COCOA = register(
      "cocoa", new Class3197(AbstractBlock.Properties.method26609(Material.PLANTS).method26624().method26621(0.2F, 3.0F).method26619(SoundType.WOOD).method26615())
   );
   public static final Block SANDSTONE_STAIRS = register("sandstone_stairs", new StairsBlock(SANDSTONE.getDefaultState(), AbstractBlock.Properties.method26613(SANDSTONE)));
   public static final Block EMERALD_ORE = register(
      "emerald_ore", new DiamondOreBlock(AbstractBlock.Properties.method26609(Material.field38966).method26635().method26621(3.0F, 3.0F))
   );
   public static final Block ENDER_CHEST = register(
      "ender_chest", new Class3347(AbstractBlock.Properties.method26609(Material.field38966).method26635().method26621(22.5F, 600.0F).method26620(var0 -> 7))
   );
   public static final Block TRIPWIRE_HOOK = register("tripwire_hook", new Class3459(AbstractBlock.Properties.method26609(Material.field38946).method26614()));
   public static final Block TRIPWIRE = register(
      "tripwire", new Class3425((Class3459) TRIPWIRE_HOOK, AbstractBlock.Properties.method26609(Material.field38946).method26614())
   );
   public static final Block EMERALD_BLOCK = register(
      "emerald_block",
      new Block(AbstractBlock.Properties.method26611(Material.field38967, MaterialColor.field30980).method26635().method26621(5.0F, 6.0F).method26619(SoundType.METAL))
   );
   public static final Block SPRUCE_STAIRS = register("spruce_stairs", new StairsBlock(field36401.getDefaultState(), AbstractBlock.Properties.method26613(field36401)));
   public static final Block field36662 = register("birch_stairs", new StairsBlock(field36402.getDefaultState(), AbstractBlock.Properties.method26613(field36402)));
   public static final Block field36663 = register("jungle_stairs", new StairsBlock(field36403.getDefaultState(), AbstractBlock.Properties.method26613(field36403)));
   public static final Block COMMAND_BLOCK = register(
      "command_block",
      new CommandBlockBlock(AbstractBlock.Properties.method26611(Material.field38967, MaterialColor.field30973).method26635().method26621(-1.0F, 3600000.0F).method26626())
   );
   public static final Block BEACON = register(
      "beacon",
      new Class3240(
         AbstractBlock.Properties.method26611(Material.field38963, MaterialColor.field30978)
            .method26623(3.0F)
            .method26620(var0 -> 15)
            .method26615()
            .method26630(Blocks::method30019)
      )
   );
   public static final Block COBBLESTONE_WALL = register("cobblestone_wall", new PolishedBlackstoneWallBlock(AbstractBlock.Properties.method26613(field36399)));
   public static final Block MOSSY_COBBLESTONE_WALL = register("mossy_cobblestone_wall", new PolishedBlackstoneWallBlock(AbstractBlock.Properties.method26613(field36399)));
   public static final Block FLOWER_POT = register(
      "flower_pot", new PottedWarpedRootsBlock(AIR, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_OAK_SAPLING = register(
      "potted_oak_sapling", new PottedWarpedRootsBlock(OAK_SAPLING, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_SPRUCE_SAPLING = register(
      "potted_spruce_sapling", new PottedWarpedRootsBlock(SPRUCE_SAPLING, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_BIRCH_SAPLING = register(
      "potted_birch_sapling", new PottedWarpedRootsBlock(BIRCH_SAPLING, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_JUNGLE_SAPLING = register(
      "potted_jungle_sapling", new PottedWarpedRootsBlock(JUNGLE_SAPLING, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_ACACIA_SAPLING = register(
      "potted_acacia_sapling", new PottedWarpedRootsBlock(ACACIA_SAPLING, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_DARK_OAK_SAPLING = register(
      "potted_dark_oak_sapling", new PottedWarpedRootsBlock(DARK_OAK_SAPLING, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_FERN = register(
      "potted_fern", new PottedWarpedRootsBlock(FERN, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_DANDELION = register(
      "potted_dandelion", new PottedWarpedRootsBlock(DANDELION, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_POPPY = register(
      "potted_poppy", new PottedWarpedRootsBlock(POPPY, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_BLUE_ORCHID = register(
      "potted_blue_orchid", new PottedWarpedRootsBlock(BLUE_ORCHID, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_ALLIUM = register(
      "potted_allium", new PottedWarpedRootsBlock(ALLIUM, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_AZURE_BLUET = register(
      "potted_azure_bluet", new PottedWarpedRootsBlock(AZURE_BLUET, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_RED_TULIP = register(
      "potted_red_tulip", new PottedWarpedRootsBlock(RED_TULIP, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_ORANGE_TULIP = register(
      "potted_orange_tulip", new PottedWarpedRootsBlock(ORANGE_TULIP, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_WHITE_TULIP = register(
      "potted_white_tulip", new PottedWarpedRootsBlock(WHITE_TULIP, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_PINK_TULIP = register(
      "potted_pink_tulip", new PottedWarpedRootsBlock(PINK_TULIP, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_OXEYE_DAISY = register(
      "potted_oxeye_daisy", new PottedWarpedRootsBlock(OXEYE_DAISY, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_CORNFLOWER = register(
      "potted_cornflower", new PottedWarpedRootsBlock(CORNFLOWER, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_LILY_OF_THE_VALLEY = register(
      "potted_lily_of_the_valley", new PottedWarpedRootsBlock(LILY_OF_THE_VALLEY, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_WITHER_ROSE = register(
      "potted_wither_rose", new PottedWarpedRootsBlock(WITHER_ROSE, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_RED_MUSHROOM = register(
      "potted_red_mushroom", new PottedWarpedRootsBlock(RED_MUSHROOM, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_BROWN_MUSHROOM = register(
      "potted_brown_mushroom", new PottedWarpedRootsBlock(BROWN_MUSHROOM, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_DEAD_BUSH = register(
      "potted_dead_bush", new PottedWarpedRootsBlock(DEAD_BUSH, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_CACTUS = register(
      "potted_cactus", new PottedWarpedRootsBlock(CACTUS, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block CARROTS = register(
      "carrots", new CarrotsBlock(AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26624().method26622().method26619(SoundType.CROP))
   );
   public static final Block POTATOES = register(
      "potatoes", new PotatoesBlock(AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26624().method26622().method26619(SoundType.CROP))
   );
   public static final Block field36695 = register(
      "oak_button", new WoodButtonBlock(AbstractBlock.Properties.method26609(Material.field38946).method26614().method26623(0.5F).method26619(SoundType.WOOD))
   );
   public static final Block field36696 = register(
      "spruce_button", new WoodButtonBlock(AbstractBlock.Properties.method26609(Material.field38946).method26614().method26623(0.5F).method26619(SoundType.WOOD))
   );
   public static final Block field36697 = register(
      "birch_button", new WoodButtonBlock(AbstractBlock.Properties.method26609(Material.field38946).method26614().method26623(0.5F).method26619(SoundType.WOOD))
   );
   public static final Block field36698 = register(
      "jungle_button", new WoodButtonBlock(AbstractBlock.Properties.method26609(Material.field38946).method26614().method26623(0.5F).method26619(SoundType.WOOD))
   );
   public static final Block field36699 = register(
      "acacia_button", new WoodButtonBlock(AbstractBlock.Properties.method26609(Material.field38946).method26614().method26623(0.5F).method26619(SoundType.WOOD))
   );
   public static final Block field36700 = register(
      "dark_oak_button", new WoodButtonBlock(AbstractBlock.Properties.method26609(Material.field38946).method26614().method26623(0.5F).method26619(SoundType.WOOD))
   );
   public static final Block SKELETON_SKULL = register(
      "skeleton_skull", new CreeperHeadBlock(Class2136.field13989, AbstractBlock.Properties.method26609(Material.field38946).method26623(1.0F))
   );
   public static final Block SKELETON_WALL_SKULL = register(
      "skeleton_wall_skull", new CreeperWallHeadBlock(Class2136.field13989, AbstractBlock.Properties.method26609(Material.field38946).method26623(1.0F).method26627(SKELETON_SKULL))
   );
   public static final Block WITHER_SKELETON_SKULL = register("wither_skeleton_skull", new WitherSkeletonSkullBlock(AbstractBlock.Properties.method26609(Material.field38946).method26623(1.0F)));
   public static final Block WITHER_SKELETON_WALL_SKULL = register(
      "wither_skeleton_wall_skull", new WitherSkeletonWallSkullBlock(AbstractBlock.Properties.method26609(Material.field38946).method26623(1.0F).method26627(WITHER_SKELETON_SKULL))
   );
   public static final Block ZOMBIE_HEAD = register(
      "zombie_head", new CreeperHeadBlock(Class2136.field13992, AbstractBlock.Properties.method26609(Material.field38946).method26623(1.0F))
   );
   public static final Block ZOMBIE_WALL_HEAD = register(
      "zombie_wall_head", new CreeperWallHeadBlock(Class2136.field13992, AbstractBlock.Properties.method26609(Material.field38946).method26623(1.0F).method26627(ZOMBIE_HEAD))
   );
   public static final Block PLAYER_HEAD = register("player_head", new PlayerHeadBlock(AbstractBlock.Properties.method26609(Material.field38946).method26623(1.0F)));
   public static final Block PLAYER_WALL_HEAD = register(
      "player_wall_head", new PlayerWallHeadBlock(AbstractBlock.Properties.method26609(Material.field38946).method26623(1.0F).method26627(PLAYER_HEAD))
   );
   public static final Block CREEPER_HEAD = register(
      "creeper_head", new CreeperHeadBlock(Class2136.field13993, AbstractBlock.Properties.method26609(Material.field38946).method26623(1.0F))
   );
   public static final Block CREEPER_WALL_HEAD = register(
      "creeper_wall_head", new CreeperWallHeadBlock(Class2136.field13993, AbstractBlock.Properties.method26609(Material.field38946).method26623(1.0F).method26627(CREEPER_HEAD))
   );
   public static final Block DRAGON_HEAD = register(
      "dragon_head", new CreeperHeadBlock(Class2136.field13994, AbstractBlock.Properties.method26609(Material.field38946).method26623(1.0F))
   );
   public static final Block DRAGON_WALL_HEAD = register(
      "dragon_wall_head", new CreeperWallHeadBlock(Class2136.field13994, AbstractBlock.Properties.method26609(Material.field38946).method26623(1.0F).method26627(DRAGON_HEAD))
   );
   public static final Block ANVIL = register(
      "anvil",
      new Class3218(
         AbstractBlock.Properties.method26611(Material.ANVIL, MaterialColor.IRON).method26635().method26621(5.0F, 1200.0F).method26619(SoundType.ANVIL)
      )
   );
   public static final Block CHIPPED_ANVIL = register(
      "chipped_anvil",
      new Class3218(
         AbstractBlock.Properties.method26611(Material.ANVIL, MaterialColor.IRON).method26635().method26621(5.0F, 1200.0F).method26619(SoundType.ANVIL)
      )
   );
   public static final Block DAMAGED_ANVIL = register(
      "damaged_anvil",
      new Class3218(
         AbstractBlock.Properties.method26611(Material.ANVIL, MaterialColor.IRON).method26635().method26621(5.0F, 1200.0F).method26619(SoundType.ANVIL)
      )
   );
   public static final Block TRAPPED_CHEST = register(
      "trapped_chest", new Class3349(AbstractBlock.Properties.method26609(Material.field38956).method26623(2.5F).method26619(SoundType.WOOD))
   );
   public static final Block LIGHT_WEIGHTED_PRESSURE_PLATE = register(
      "light_weighted_pressure_plate",
      new Class3470(
         15, AbstractBlock.Properties.method26611(Material.field38967, MaterialColor.field30977).method26635().method26614().method26623(0.5F).method26619(SoundType.WOOD)
      )
   );
   public static final Block HEAVY_WEIGHTED_PRESSURE_PLATE = register(
      "heavy_weighted_pressure_plate",
      new Class3470(150, AbstractBlock.Properties.method26609(Material.field38967).method26635().method26614().method26623(0.5F).method26619(SoundType.WOOD))
   );
   public static final Block COMPARATOR = register(
      "comparator", new Class3246(AbstractBlock.Properties.method26609(Material.field38946).method26622().method26619(SoundType.WOOD))
   );
   public static final Block DAYLIGHT_DETECTOR = register(
      "daylight_detector", new DaylightDetectorBlock(AbstractBlock.Properties.method26609(Material.field38956).method26623(0.2F).method26619(SoundType.WOOD))
   );
   public static final Block REDSTONE_BLOCK = register(
      "redstone_block",
      new RedstoneBlock(
         AbstractBlock.Properties.method26611(Material.field38967, MaterialColor.field30951)
            .method26635()
            .method26621(5.0F, 6.0F)
            .method26619(SoundType.METAL)
            .method26630(Blocks::method30019)
      )
   );
   public static final Block NETHER_QUARTZ_ORE = register(
      "nether_quartz_ore",
      new DiamondOreBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30982).method26635().method26621(3.0F, 3.0F).method26619(SoundType.BONE))
   );
   public static final Block HOPPER = register(
      "hopper",
      new Class3362(
         AbstractBlock.Properties.method26611(Material.field38967, MaterialColor.STONE)
            .method26635()
            .method26621(3.0F, 4.8F)
            .method26619(SoundType.METAL)
            .method26615()
      )
   );
   public static final Block field36724 = register(
      "quartz_block", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30961).method26635().method26623(0.8F))
   );
   public static final Block field36725 = register(
      "chiseled_quartz_block", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30961).method26635().method26623(0.8F))
   );
   public static final Block QUARTZ_PILLAR = register(
      "quartz_pillar", new StrippedCrimsonHyphaeBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30961).method26635().method26623(0.8F))
   );
   public static final Block field36727 = register("quartz_stairs", new StairsBlock(field36724.getDefaultState(), AbstractBlock.Properties.method26613(field36724)));
   public static final Block ACTIVATOR_RAIL = register(
      "activator_rail", new ActivatorRailBlock(AbstractBlock.Properties.method26609(Material.field38946).method26614().method26623(0.7F).method26619(SoundType.METAL))
   );
   public static final Block DROPPER = register("dropper", new Class3358(AbstractBlock.Properties.method26609(Material.field38966).method26635().method26623(3.5F)));
   public static final Block field36730 = register(
      "white_terracotta", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30983).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block field36731 = register(
      "orange_terracotta", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30984).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block field36732 = register(
      "magenta_terracotta", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30985).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block field36733 = register(
      "light_blue_terracotta", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30986).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block field36734 = register(
      "yellow_terracotta", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30987).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block field36735 = register(
      "lime_terracotta", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30988).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block field36736 = register(
      "pink_terracotta", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30989).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block field36737 = register(
      "gray_terracotta", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30990).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block field36738 = register(
      "light_gray_terracotta", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30991).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block field36739 = register(
      "cyan_terracotta", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30992).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block field36740 = register(
      "purple_terracotta", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30993).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block field36741 = register(
      "blue_terracotta", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30994).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block field36742 = register(
      "brown_terracotta", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30995).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block field36743 = register(
      "green_terracotta", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30996).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block field36744 = register(
      "red_terracotta", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30997).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block field36745 = register(
      "black_terracotta", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30998).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block WHITE_STAINED_GLASS_PANE = register(
      "white_stained_glass_pane",
      new BlackStainedGlassPaneBlock(Class112.field386, AbstractBlock.Properties.method26609(Material.field38963).method26623(0.3F).method26619(SoundType.GLASS).method26615())
   );
   public static final Block ORANGE_STAINED_GLASS_PANE = register(
      "orange_stained_glass_pane",
      new BlackStainedGlassPaneBlock(Class112.field387, AbstractBlock.Properties.method26609(Material.field38963).method26623(0.3F).method26619(SoundType.GLASS).method26615())
   );
   public static final Block MAGENTA_STAINED_GLASS_PANE = register(
      "magenta_stained_glass_pane",
      new BlackStainedGlassPaneBlock(Class112.field388, AbstractBlock.Properties.method26609(Material.field38963).method26623(0.3F).method26619(SoundType.GLASS).method26615())
   );
   public static final Block LIGHT_BLUE_STAINED_GLASS_PANE = register(
      "light_blue_stained_glass_pane",
      new BlackStainedGlassPaneBlock(Class112.field389, AbstractBlock.Properties.method26609(Material.field38963).method26623(0.3F).method26619(SoundType.GLASS).method26615())
   );
   public static final Block YELLOW_STAINED_GLASS_PANE = register(
      "yellow_stained_glass_pane",
      new BlackStainedGlassPaneBlock(Class112.field390, AbstractBlock.Properties.method26609(Material.field38963).method26623(0.3F).method26619(SoundType.GLASS).method26615())
   );
   public static final Block LIME_STAINED_GLASS_PANE = register(
      "lime_stained_glass_pane",
      new BlackStainedGlassPaneBlock(Class112.field391, AbstractBlock.Properties.method26609(Material.field38963).method26623(0.3F).method26619(SoundType.GLASS).method26615())
   );
   public static final Block PINK_STAINED_GLASS_PANE = register(
      "pink_stained_glass_pane",
      new BlackStainedGlassPaneBlock(Class112.field392, AbstractBlock.Properties.method26609(Material.field38963).method26623(0.3F).method26619(SoundType.GLASS).method26615())
   );
   public static final Block GRAY_STAINED_GLASS_PANE = register(
      "gray_stained_glass_pane",
      new BlackStainedGlassPaneBlock(Class112.field393, AbstractBlock.Properties.method26609(Material.field38963).method26623(0.3F).method26619(SoundType.GLASS).method26615())
   );
   public static final Block LIGHT_GRAY_STAINED_GLASS_PANE = register(
      "light_gray_stained_glass_pane",
      new BlackStainedGlassPaneBlock(Class112.field394, AbstractBlock.Properties.method26609(Material.field38963).method26623(0.3F).method26619(SoundType.GLASS).method26615())
   );
   public static final Block CYAN_STAINED_GLASS_PANE = register(
      "cyan_stained_glass_pane",
      new BlackStainedGlassPaneBlock(Class112.field395, AbstractBlock.Properties.method26609(Material.field38963).method26623(0.3F).method26619(SoundType.GLASS).method26615())
   );
   public static final Block PURPLE_STAINED_GLASS_PANE = register(
      "purple_stained_glass_pane",
      new BlackStainedGlassPaneBlock(Class112.field396, AbstractBlock.Properties.method26609(Material.field38963).method26623(0.3F).method26619(SoundType.GLASS).method26615())
   );
   public static final Block BLUE_STAINED_GLASS_PANE = register(
      "blue_stained_glass_pane",
      new BlackStainedGlassPaneBlock(Class112.field397, AbstractBlock.Properties.method26609(Material.field38963).method26623(0.3F).method26619(SoundType.GLASS).method26615())
   );
   public static final Block BROWN_STAINED_GLASS_PANE = register(
      "brown_stained_glass_pane",
      new BlackStainedGlassPaneBlock(Class112.field398, AbstractBlock.Properties.method26609(Material.field38963).method26623(0.3F).method26619(SoundType.GLASS).method26615())
   );
   public static final Block GREEN_STAINED_GLASS_PANE = register(
      "green_stained_glass_pane",
      new BlackStainedGlassPaneBlock(Class112.field399, AbstractBlock.Properties.method26609(Material.field38963).method26623(0.3F).method26619(SoundType.GLASS).method26615())
   );
   public static final Block RED_STAINED_GLASS_PANE = register(
      "red_stained_glass_pane",
      new BlackStainedGlassPaneBlock(Class112.field400, AbstractBlock.Properties.method26609(Material.field38963).method26623(0.3F).method26619(SoundType.GLASS).method26615())
   );
   public static final Block BLACK_STAINED_GLASS_PANE = register(
      "black_stained_glass_pane",
      new BlackStainedGlassPaneBlock(Class112.field401, AbstractBlock.Properties.method26609(Material.field38963).method26623(0.3F).method26619(SoundType.GLASS).method26615())
   );
   public static final Block field36762 = register("acacia_stairs", new StairsBlock(field36404.getDefaultState(), AbstractBlock.Properties.method26613(field36404)));
   public static final Block field36763 = register("dark_oak_stairs", new StairsBlock(field36405.getDefaultState(), AbstractBlock.Properties.method26613(field36405)));
   public static final Block SLIME_BLOCK = register(
      "slime_block",
      new SlimeBlock(AbstractBlock.Properties.method26611(Material.field38949, MaterialColor.field30948).method26616(0.8F).method26619(SoundType.SLIME).method26615())
   );
   public static final Block BARRIER = register(
      "barrier",
      new Class3467(AbstractBlock.Properties.method26609(Material.BARRIER).method26621(-1.0F, 3600000.8F).method26626().method26615().method26629(Blocks::method30012))
   );
   public static final Block IRON_TRAPDOOR = register(
      "iron_trapdoor",
      new WarpedTrapdoorBlock(
         AbstractBlock.Properties.method26609(Material.field38967)
            .method26635()
            .method26623(5.0F)
            .method26619(SoundType.METAL)
            .method26615()
            .method26629(Blocks::method30012)
      )
   );
   public static final Block field36767 = register(
      "prismarine", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30970).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block field36768 = register(
      "prismarine_bricks", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30978).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block field36769 = register(
      "dark_prismarine", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30978).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block field36770 = register("prismarine_stairs", new StairsBlock(field36767.getDefaultState(), AbstractBlock.Properties.method26613(field36767)));
   public static final Block field36771 = register("prismarine_brick_stairs", new StairsBlock(field36768.getDefaultState(), AbstractBlock.Properties.method26613(field36768)));
   public static final Block field36772 = register("dark_prismarine_stairs", new StairsBlock(field36769.getDefaultState(), AbstractBlock.Properties.method26613(field36769)));
   public static final Block field36773 = register(
      "prismarine_slab", new SlabBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30970).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block field36774 = register(
      "prismarine_brick_slab", new SlabBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30978).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block field36775 = register(
      "dark_prismarine_slab", new SlabBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30978).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block field36776 = register(
      "sea_lantern",
      new Block(
         AbstractBlock.Properties.method26611(Material.field38963, MaterialColor.field30961).method26623(0.3F).method26619(SoundType.GLASS).method26620(var0 -> 15)
      )
   );
   public static final Block HAY_BLOCK = register(
      "hay_block", new HayBlock(AbstractBlock.Properties.method26611(Material.field38951, MaterialColor.field30965).method26623(0.5F).method26619(SoundType.GRASS))
   );
   public static final Block WHITE_CARPET = register(
      "white_carpet",
      new Class3422(Class112.field386, AbstractBlock.Properties.method26611(Material.field38935, MaterialColor.SNOW).method26623(0.1F).method26619(SoundType.WOOL))
   );
   public static final Block ORANGE_CARPET = register(
      "orange_carpet",
      new Class3422(Class112.field387, AbstractBlock.Properties.method26611(Material.field38935, MaterialColor.field30962).method26623(0.1F).method26619(SoundType.WOOL))
   );
   public static final Block MAGENTA_CARPET = register(
      "magenta_carpet",
      new Class3422(Class112.field388, AbstractBlock.Properties.method26611(Material.field38935, MaterialColor.field30963).method26623(0.1F).method26619(SoundType.WOOL))
   );
   public static final Block LIGHT_BLUE_CARPET = register(
      "light_blue_carpet",
      new Class3422(Class112.field389, AbstractBlock.Properties.method26611(Material.field38935, MaterialColor.field30964).method26623(0.1F).method26619(SoundType.WOOL))
   );
   public static final Block YELLOW_CARPET = register(
      "yellow_carpet",
      new Class3422(Class112.field390, AbstractBlock.Properties.method26611(Material.field38935, MaterialColor.field30965).method26623(0.1F).method26619(SoundType.WOOL))
   );
   public static final Block LIME_CARPET = register(
      "lime_carpet",
      new Class3422(Class112.field391, AbstractBlock.Properties.method26611(Material.field38935, MaterialColor.field30966).method26623(0.1F).method26619(SoundType.WOOL))
   );
   public static final Block PINK_CARPET = register(
      "pink_carpet",
      new Class3422(Class112.field392, AbstractBlock.Properties.method26611(Material.field38935, MaterialColor.field30967).method26623(0.1F).method26619(SoundType.WOOL))
   );
   public static final Block GRAY_CARPET = register(
      "gray_carpet",
      new Class3422(Class112.field393, AbstractBlock.Properties.method26611(Material.field38935, MaterialColor.field30968).method26623(0.1F).method26619(SoundType.WOOL))
   );
   public static final Block LIGHT_GRAY_CARPET = register(
      "light_gray_carpet",
      new Class3422(Class112.field394, AbstractBlock.Properties.method26611(Material.field38935, MaterialColor.field30969).method26623(0.1F).method26619(SoundType.WOOL))
   );
   public static final Block CYAN_CARPET = register(
      "cyan_carpet",
      new Class3422(Class112.field395, AbstractBlock.Properties.method26611(Material.field38935, MaterialColor.field30970).method26623(0.1F).method26619(SoundType.WOOL))
   );
   public static final Block PURPLE_CARPET = register(
      "purple_carpet",
      new Class3422(Class112.field396, AbstractBlock.Properties.method26611(Material.field38935, MaterialColor.field30971).method26623(0.1F).method26619(SoundType.WOOL))
   );
   public static final Block BLUE_CARPET = register(
      "blue_carpet",
      new Class3422(Class112.field397, AbstractBlock.Properties.method26611(Material.field38935, MaterialColor.field30972).method26623(0.1F).method26619(SoundType.WOOL))
   );
   public static final Block BROWN_CARPET = register(
      "brown_carpet",
      new Class3422(Class112.field398, AbstractBlock.Properties.method26611(Material.field38935, MaterialColor.field30973).method26623(0.1F).method26619(SoundType.WOOL))
   );
   public static final Block GREEN_CARPET = register(
      "green_carpet",
      new Class3422(Class112.field399, AbstractBlock.Properties.method26611(Material.field38935, MaterialColor.field30974).method26623(0.1F).method26619(SoundType.WOOL))
   );
   public static final Block RED_CARPET = register(
      "red_carpet",
      new Class3422(Class112.field400, AbstractBlock.Properties.method26611(Material.field38935, MaterialColor.field30975).method26623(0.1F).method26619(SoundType.WOOL))
   );
   public static final Block BLACK_CARPET = register(
      "black_carpet",
      new Class3422(Class112.field401, AbstractBlock.Properties.method26611(Material.field38935, MaterialColor.field30976).method26623(0.1F).method26619(SoundType.WOOL))
   );
   public static final Block field36794 = register(
      "terracotta", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30962).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block field36795 = register(
      "coal_block", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30976).method26635().method26621(5.0F, 6.0F))
   );
   public static final Block PACKED_ICE = register(
      "packed_ice", new Block(AbstractBlock.Properties.method26609(Material.field38952).method26616(0.98F).method26623(0.5F).method26619(SoundType.GLASS))
   );
   public static final Block SUNFLOWER = register(
      "sunflower", new PeonyBlock(AbstractBlock.Properties.method26609(Material.TALL_PLANTS).method26614().method26622().method26619(SoundType.GRASS))
   );
   public static final Block LILAC = register(
      "lilac", new PeonyBlock(AbstractBlock.Properties.method26609(Material.TALL_PLANTS).method26614().method26622().method26619(SoundType.GRASS))
   );
   public static final Block ROSE_BUSH = register(
      "rose_bush", new PeonyBlock(AbstractBlock.Properties.method26609(Material.TALL_PLANTS).method26614().method26622().method26619(SoundType.GRASS))
   );
   public static final Block PEONY = register(
      "peony", new PeonyBlock(AbstractBlock.Properties.method26609(Material.TALL_PLANTS).method26614().method26622().method26619(SoundType.GRASS))
   );
   public static final Block TALL_GRASS = register(
      "tall_grass", new LargeFernBlock(AbstractBlock.Properties.method26609(Material.TALL_PLANTS).method26614().method26622().method26619(SoundType.GRASS))
   );
   public static final Block LARGE_FERN = register(
      "large_fern", new LargeFernBlock(AbstractBlock.Properties.method26609(Material.TALL_PLANTS).method26614().method26622().method26619(SoundType.GRASS))
   );
   public static final Block WHITE_BANNER = register(
      "white_banner",
      new BlackBannerBlock(Class112.field386, AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD))
   );
   public static final Block ORANGE_BANNER = register(
      "orange_banner",
      new BlackBannerBlock(Class112.field387, AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD))
   );
   public static final Block MAGENTA_BANNER = register(
      "magenta_banner",
      new BlackBannerBlock(Class112.field388, AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD))
   );
   public static final Block LIGHT_BLUE_BANNER = register(
      "light_blue_banner",
      new BlackBannerBlock(Class112.field389, AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD))
   );
   public static final Block YELLOW_BANNER = register(
      "yellow_banner",
      new BlackBannerBlock(Class112.field390, AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD))
   );
   public static final Block LIME_BANNER = register(
      "lime_banner",
      new BlackBannerBlock(Class112.field391, AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD))
   );
   public static final Block PINK_BANNER = register(
      "pink_banner",
      new BlackBannerBlock(Class112.field392, AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD))
   );
   public static final Block GRAY_BANNER = register(
      "gray_banner",
      new BlackBannerBlock(Class112.field393, AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD))
   );
   public static final Block LIGHT_GRAY_BANNER = register(
      "light_gray_banner",
      new BlackBannerBlock(Class112.field394, AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD))
   );
   public static final Block CYAN_BANNER = register(
      "cyan_banner",
      new BlackBannerBlock(Class112.field395, AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD))
   );
   public static final Block PURPLE_BANNER = register(
      "purple_banner",
      new BlackBannerBlock(Class112.field396, AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD))
   );
   public static final Block BLUE_BANNER = register(
      "blue_banner",
      new BlackBannerBlock(Class112.field397, AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD))
   );
   public static final Block BROWN_BANNER = register(
      "brown_banner",
      new BlackBannerBlock(Class112.field398, AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD))
   );
   public static final Block GREEN_BANNER = register(
      "green_banner",
      new BlackBannerBlock(Class112.field399, AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD))
   );
   public static final Block RED_BANNER = register(
      "red_banner",
      new BlackBannerBlock(Class112.field400, AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD))
   );
   public static final Block BLACK_BANNER = register(
      "black_banner",
      new BlackBannerBlock(Class112.field401, AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD))
   );
   public static final Block WHITE_WALL_BANNER = register(
      "white_wall_banner",
      new BlackWallBannerBlock(
         Class112.field386,
         AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD).method26627(WHITE_BANNER)
      )
   );
   public static final Block ORANGE_WALL_BANNER = register(
      "orange_wall_banner",
      new BlackWallBannerBlock(
         Class112.field387,
         AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD).method26627(ORANGE_BANNER)
      )
   );
   public static final Block MAGENTA_WALL_BANNER = register(
      "magenta_wall_banner",
      new BlackWallBannerBlock(
         Class112.field388,
         AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD).method26627(MAGENTA_BANNER)
      )
   );
   public static final Block LIGHT_BLUE_WALL_BANNER = register(
      "light_blue_wall_banner",
      new BlackWallBannerBlock(
         Class112.field389,
         AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD).method26627(LIGHT_BLUE_BANNER)
      )
   );
   public static final Block YELLOW_WALL_BANNER = register(
      "yellow_wall_banner",
      new BlackWallBannerBlock(
         Class112.field390,
         AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD).method26627(YELLOW_BANNER)
      )
   );
   public static final Block LIME_WALL_BANNER = register(
      "lime_wall_banner",
      new BlackWallBannerBlock(
         Class112.field391,
         AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD).method26627(LIME_BANNER)
      )
   );
   public static final Block PINK_WALL_BANNER = register(
      "pink_wall_banner",
      new BlackWallBannerBlock(
         Class112.field392,
         AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD).method26627(PINK_BANNER)
      )
   );
   public static final Block GRAY_WALL_BANNER = register(
      "gray_wall_banner",
      new BlackWallBannerBlock(
         Class112.field393,
         AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD).method26627(GRAY_BANNER)
      )
   );
   public static final Block LIGHT_GRAY_WALL_BANNER = register(
      "light_gray_wall_banner",
      new BlackWallBannerBlock(
         Class112.field394,
         AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD).method26627(LIGHT_GRAY_BANNER)
      )
   );
   public static final Block CYAN_WALL_BANNER = register(
      "cyan_wall_banner",
      new BlackWallBannerBlock(
         Class112.field395,
         AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD).method26627(CYAN_BANNER)
      )
   );
   public static final Block PURPLE_WALL_BANNER = register(
      "purple_wall_banner",
      new BlackWallBannerBlock(
         Class112.field396,
         AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD).method26627(PURPLE_BANNER)
      )
   );
   public static final Block BLUE_WALL_BANNER = register(
      "blue_wall_banner",
      new BlackWallBannerBlock(
         Class112.field397,
         AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD).method26627(BLUE_BANNER)
      )
   );
   public static final Block BROWN_WALL_BANNER = register(
      "brown_wall_banner",
      new BlackWallBannerBlock(
         Class112.field398,
         AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD).method26627(BROWN_BANNER)
      )
   );
   public static final Block GREEN_WALL_BANNER = register(
      "green_wall_banner",
      new BlackWallBannerBlock(
         Class112.field399,
         AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD).method26627(GREEN_BANNER)
      )
   );
   public static final Block RED_WALL_BANNER = register(
      "red_wall_banner",
      new BlackWallBannerBlock(
         Class112.field400,
         AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD).method26627(RED_BANNER)
      )
   );
   public static final Block BLACK_WALL_BANNER = register(
      "black_wall_banner",
      new BlackWallBannerBlock(
         Class112.field401,
         AbstractBlock.Properties.method26609(Material.field38956).method26614().method26623(1.0F).method26619(SoundType.WOOD).method26627(BLACK_BANNER)
      )
   );
   public static final Block field36835 = register(
      "red_sandstone", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30962).method26635().method26623(0.8F))
   );
   public static final Block field36836 = register(
      "chiseled_red_sandstone", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30962).method26635().method26623(0.8F))
   );
   public static final Block field36837 = register(
      "cut_red_sandstone", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30962).method26635().method26623(0.8F))
   );
   public static final Block field36838 = register("red_sandstone_stairs", new StairsBlock(field36835.getDefaultState(), AbstractBlock.Properties.method26613(field36835)));
   public static final Block field36839 = register(
      "oak_slab", new SlabBlock(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30960).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block field36840 = register(
      "spruce_slab", new SlabBlock(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30981).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block field36841 = register(
      "birch_slab", new SlabBlock(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30949).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block field36842 = register(
      "jungle_slab", new SlabBlock(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30957).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block field36843 = register(
      "acacia_slab", new SlabBlock(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30962).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block field36844 = register(
      "dark_oak_slab",
      new SlabBlock(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30973).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block field36845 = register(
      "stone_slab", new SlabBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.STONE).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block field36846 = register(
      "smooth_stone_slab", new SlabBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.STONE).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block field36847 = register(
      "sandstone_slab", new SlabBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30949).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block field36848 = register(
      "cut_sandstone_slab", new SlabBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30949).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block field36849 = register(
      "petrified_oak_slab", new SlabBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30960).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block field36850 = register(
      "cobblestone_slab", new SlabBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.STONE).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block field36851 = register(
      "brick_slab", new SlabBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30975).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block field36852 = register(
      "stone_brick_slab", new SlabBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.STONE).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block field36853 = register(
      "nether_brick_slab",
      new SlabBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30982).method26635().method26621(2.0F, 6.0F).method26619(SoundType.NETHER_SPROUTS))
   );
   public static final Block field36854 = register(
      "quartz_slab", new SlabBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30961).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block field36855 = register(
      "red_sandstone_slab", new SlabBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30962).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block field36856 = register(
      "cut_red_sandstone_slab", new SlabBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30962).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block field36857 = register(
      "purpur_slab", new SlabBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30963).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block field36858 = register(
      "smooth_stone", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.STONE).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block field36859 = register(
      "smooth_sandstone", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30949).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block field36860 = register(
      "smooth_quartz", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30961).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block field36861 = register(
      "smooth_red_sandstone", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30962).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block field36862 = register(
      "spruce_fence_gate",
      new FenceGateBlock(AbstractBlock.Properties.method26611(Material.field38956, field36401.method12000()).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block field36863 = register(
      "birch_fence_gate",
      new FenceGateBlock(AbstractBlock.Properties.method26611(Material.field38956, field36402.method12000()).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block field36864 = register(
      "jungle_fence_gate",
      new FenceGateBlock(AbstractBlock.Properties.method26611(Material.field38956, field36403.method12000()).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block field36865 = register(
      "acacia_fence_gate",
      new FenceGateBlock(AbstractBlock.Properties.method26611(Material.field38956, field36404.method12000()).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block field36866 = register(
      "dark_oak_fence_gate",
      new FenceGateBlock(AbstractBlock.Properties.method26611(Material.field38956, field36405.method12000()).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block SPRUCE_FENCE = register(
      "spruce_fence",
      new WarpedFenceBlock(AbstractBlock.Properties.method26611(Material.field38956, field36401.method12000()).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block BIRCH_FENCE = register(
      "birch_fence",
      new WarpedFenceBlock(AbstractBlock.Properties.method26611(Material.field38956, field36402.method12000()).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block JUNGLE_FENCE = register(
      "jungle_fence",
      new WarpedFenceBlock(AbstractBlock.Properties.method26611(Material.field38956, field36403.method12000()).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block ACACIA_FENCE = register(
      "acacia_fence",
      new WarpedFenceBlock(AbstractBlock.Properties.method26611(Material.field38956, field36404.method12000()).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block DARK_OAK_FENCE = register(
      "dark_oak_fence",
      new WarpedFenceBlock(AbstractBlock.Properties.method26611(Material.field38956, field36405.method12000()).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block field36872 = register(
      "spruce_door",
      new DoorBlock(AbstractBlock.Properties.method26611(Material.field38956, field36401.method12000()).method26623(3.0F).method26619(SoundType.WOOD).method26615())
   );
   public static final Block field36873 = register(
      "birch_door",
      new DoorBlock(AbstractBlock.Properties.method26611(Material.field38956, field36402.method12000()).method26623(3.0F).method26619(SoundType.WOOD).method26615())
   );
   public static final Block field36874 = register(
      "jungle_door",
      new DoorBlock(AbstractBlock.Properties.method26611(Material.field38956, field36403.method12000()).method26623(3.0F).method26619(SoundType.WOOD).method26615())
   );
   public static final Block field36875 = register(
      "acacia_door",
      new DoorBlock(AbstractBlock.Properties.method26611(Material.field38956, field36404.method12000()).method26623(3.0F).method26619(SoundType.WOOD).method26615())
   );
   public static final Block field36876 = register(
      "dark_oak_door",
      new DoorBlock(AbstractBlock.Properties.method26611(Material.field38956, field36405.method12000()).method26623(3.0F).method26619(SoundType.WOOD).method26615())
   );
   public static final Block END_ROD = register(
      "end_rod",
      new EndRodBlock(AbstractBlock.Properties.method26609(Material.field38946).method26622().method26620(var0 -> 14).method26619(SoundType.WOOD).method26615())
   );
   public static final Block CHORUS_PLANT = register(
      "chorus_plant",
      new ChorusPlantBlock(AbstractBlock.Properties.method26611(Material.PLANTS, MaterialColor.field30971).method26623(0.4F).method26619(SoundType.WOOD).method26615())
   );
   public static final Block CHORUS_FLOWER = register(
      "chorus_flower",
      new ChorusFlowerBlock(
         (ChorusPlantBlock) CHORUS_PLANT,
         AbstractBlock.Properties.method26611(Material.PLANTS, MaterialColor.field30971).method26624().method26623(0.4F).method26619(SoundType.WOOD).method26615()
      )
   );
   public static final Block field36880 = register(
      "purpur_block", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30963).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block PURPUR_PILLAR = register(
      "purpur_pillar", new StrippedCrimsonHyphaeBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30963).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block field36882 = register("purpur_stairs", new StairsBlock(field36880.getDefaultState(), AbstractBlock.Properties.method26613(field36880)));
   public static final Block field36883 = register(
      "end_stone_bricks", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30949).method26635().method26621(3.0F, 9.0F))
   );
   public static final Block BEETROOTS = register(
      "beetroots", new BeetrootsBlock(AbstractBlock.Properties.method26609(Material.PLANTS).method26614().method26624().method26622().method26619(SoundType.CROP))
   );
   public static final Block GRASS_PATH = register(
      "grass_path",
      new GrassPathBlock(
         AbstractBlock.Properties.method26609(Material.field38950)
            .method26623(0.65F)
            .method26619(SoundType.GRASS)
            .method26632(Blocks::method30018)
            .method26631(Blocks::method30018)
      )
   );
   public static final Block END_GATEWAY = register(
      "end_gateway",
      new EndGatewayBlock(
         AbstractBlock.Properties.method26611(Material.field38934, MaterialColor.field30976).method26614().method26620(var0 -> 15).method26621(-1.0F, 3600000.0F).method26626()
      )
   );
   public static final Block field36887 = register(
      "repeating_command_block",
      new CommandBlockBlock(AbstractBlock.Properties.method26611(Material.field38967, MaterialColor.field30971).method26635().method26621(-1.0F, 3600000.0F).method26626())
   );
   public static final Block field36888 = register(
      "chain_command_block",
      new CommandBlockBlock(AbstractBlock.Properties.method26611(Material.field38967, MaterialColor.field30974).method26635().method26621(-1.0F, 3600000.0F).method26626())
   );
   public static final Block FROSTED_ICE = register(
      "frosted_ice",
      new FrostedIceBlock(
         AbstractBlock.Properties.method26609(Material.ICE)
            .method26616(0.98F)
            .method26624()
            .method26623(0.5F)
            .method26619(SoundType.GLASS)
            .method26615()
            .method26629((var0, var1, var2, var3) -> var3 == EntityType.POLAR_BEAR)
      )
   );
   public static final Block MAGMA_BLOCK = register(
      "magma_block",
      new MagmaBlock(
         AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30982)
            .method26635()
            .method26620(var0 -> 3)
            .method26624()
            .method26623(0.5F)
            .method26629((var0, var1, var2, var3) -> var3.method33207())
            .method26633(Blocks::method30018)
            .method26634(Blocks::method30018)
      )
   );
   public static final Block field36891 = register(
      "nether_wart_block", new Block(AbstractBlock.Properties.method26611(Material.field38951, MaterialColor.field30975).method26623(1.0F).method26619(SoundType.NETHERRACK))
   );
   public static final Block field36892 = register(
      "red_nether_bricks",
      new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30982).method26635().method26621(2.0F, 6.0F).method26619(SoundType.NETHER_SPROUTS))
   );
   public static final Block BONE_BLOCK = register(
      "bone_block",
      new StrippedCrimsonHyphaeBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30949).method26635().method26623(2.0F).method26619(SoundType.NETHERITE))
   );
   public static final Block STRUCTURE_VOID = register(
      "structure_void", new StructureVoidBlock(AbstractBlock.Properties.method26609(Material.field38933).method26614().method26626())
   );
   public static final Block OBSERVER = register(
      "observer", new ObserverBlock(AbstractBlock.Properties.method26609(Material.field38966).method26623(3.0F).method26635().method26630(Blocks::method30019))
   );
   public static final Block field36896 = register("shulker_box", method30022((Class112)null, AbstractBlock.Properties.method26609(Material.field38955)));
   public static final Block field36897 = register(
      "white_shulker_box", method30022(Class112.field386, AbstractBlock.Properties.method26611(Material.field38955, MaterialColor.SNOW))
   );
   public static final Block field36898 = register(
      "orange_shulker_box", method30022(Class112.field387, AbstractBlock.Properties.method26611(Material.field38955, MaterialColor.field30962))
   );
   public static final Block field36899 = register(
      "magenta_shulker_box", method30022(Class112.field388, AbstractBlock.Properties.method26611(Material.field38955, MaterialColor.field30963))
   );
   public static final Block field36900 = register(
      "light_blue_shulker_box", method30022(Class112.field389, AbstractBlock.Properties.method26611(Material.field38955, MaterialColor.field30964))
   );
   public static final Block field36901 = register(
      "yellow_shulker_box", method30022(Class112.field390, AbstractBlock.Properties.method26611(Material.field38955, MaterialColor.field30965))
   );
   public static final Block field36902 = register(
      "lime_shulker_box", method30022(Class112.field391, AbstractBlock.Properties.method26611(Material.field38955, MaterialColor.field30966))
   );
   public static final Block field36903 = register(
      "pink_shulker_box", method30022(Class112.field392, AbstractBlock.Properties.method26611(Material.field38955, MaterialColor.field30967))
   );
   public static final Block field36904 = register(
      "gray_shulker_box", method30022(Class112.field393, AbstractBlock.Properties.method26611(Material.field38955, MaterialColor.field30968))
   );
   public static final Block field36905 = register(
      "light_gray_shulker_box", method30022(Class112.field394, AbstractBlock.Properties.method26611(Material.field38955, MaterialColor.field30969))
   );
   public static final Block field36906 = register(
      "cyan_shulker_box", method30022(Class112.field395, AbstractBlock.Properties.method26611(Material.field38955, MaterialColor.field30970))
   );
   public static final Block field36907 = register(
      "purple_shulker_box", method30022(Class112.field396, AbstractBlock.Properties.method26611(Material.field38955, MaterialColor.field30993))
   );
   public static final Block field36908 = register(
      "blue_shulker_box", method30022(Class112.field397, AbstractBlock.Properties.method26611(Material.field38955, MaterialColor.field30972))
   );
   public static final Block field36909 = register(
      "brown_shulker_box", method30022(Class112.field398, AbstractBlock.Properties.method26611(Material.field38955, MaterialColor.field30973))
   );
   public static final Block field36910 = register(
      "green_shulker_box", method30022(Class112.field399, AbstractBlock.Properties.method26611(Material.field38955, MaterialColor.field30974))
   );
   public static final Block field36911 = register(
      "red_shulker_box", method30022(Class112.field400, AbstractBlock.Properties.method26611(Material.field38955, MaterialColor.field30975))
   );
   public static final Block field36912 = register(
      "black_shulker_box", method30022(Class112.field401, AbstractBlock.Properties.method26611(Material.field38955, MaterialColor.field30976))
   );
   public static final Block WHITE_GLAZED_TERRACOTTA = register(
      "white_glazed_terracotta", new BlackGlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.field38966, Class112.field386).method26635().method26623(1.4F))
   );
   public static final Block ORANGE_GLAZED_TERRACOTTA = register(
      "orange_glazed_terracotta", new BlackGlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.field38966, Class112.field387).method26635().method26623(1.4F))
   );
   public static final Block MAGENTA_GLAZED_TERRACOTTA = register(
      "magenta_glazed_terracotta", new BlackGlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.field38966, Class112.field388).method26635().method26623(1.4F))
   );
   public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA = register(
      "light_blue_glazed_terracotta", new BlackGlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.field38966, Class112.field389).method26635().method26623(1.4F))
   );
   public static final Block YELLOW_GLAZED_TERRACOTTA = register(
      "yellow_glazed_terracotta", new BlackGlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.field38966, Class112.field390).method26635().method26623(1.4F))
   );
   public static final Block LIME_GLAZED_TERRACOTTA = register(
      "lime_glazed_terracotta", new BlackGlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.field38966, Class112.field391).method26635().method26623(1.4F))
   );
   public static final Block PINK_GLAZED_TERRACOTTA = register(
      "pink_glazed_terracotta", new BlackGlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.field38966, Class112.field392).method26635().method26623(1.4F))
   );
   public static final Block GRAY_GLAZED_TERRACOTTA = register(
      "gray_glazed_terracotta", new BlackGlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.field38966, Class112.field393).method26635().method26623(1.4F))
   );
   public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA = register(
      "light_gray_glazed_terracotta", new BlackGlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.field38966, Class112.field394).method26635().method26623(1.4F))
   );
   public static final Block CYAN_GLAZED_TERRACOTTA = register(
      "cyan_glazed_terracotta", new BlackGlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.field38966, Class112.field395).method26635().method26623(1.4F))
   );
   public static final Block PURPLE_GLAZED_TERRACOTTA = register(
      "purple_glazed_terracotta", new BlackGlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.field38966, Class112.field396).method26635().method26623(1.4F))
   );
   public static final Block BLUE_GLAZED_TERRACOTTA = register(
      "blue_glazed_terracotta", new BlackGlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.field38966, Class112.field397).method26635().method26623(1.4F))
   );
   public static final Block BROWN_GLAZED_TERRACOTTA = register(
      "brown_glazed_terracotta", new BlackGlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.field38966, Class112.field398).method26635().method26623(1.4F))
   );
   public static final Block GREEN_GLAZED_TERRACOTTA = register(
      "green_glazed_terracotta", new BlackGlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.field38966, Class112.field399).method26635().method26623(1.4F))
   );
   public static final Block RED_GLAZED_TERRACOTTA = register(
      "red_glazed_terracotta", new BlackGlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.field38966, Class112.field400).method26635().method26623(1.4F))
   );
   public static final Block BLACK_GLAZED_TERRACOTTA = register(
      "black_glazed_terracotta", new BlackGlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.field38966, Class112.field401).method26635().method26623(1.4F))
   );
   public static final Block field36929 = register(
      "white_concrete", new Block(AbstractBlock.Properties.method26610(Material.field38966, Class112.field386).method26635().method26623(1.8F))
   );
   public static final Block field36930 = register(
      "orange_concrete", new Block(AbstractBlock.Properties.method26610(Material.field38966, Class112.field387).method26635().method26623(1.8F))
   );
   public static final Block field36931 = register(
      "magenta_concrete", new Block(AbstractBlock.Properties.method26610(Material.field38966, Class112.field388).method26635().method26623(1.8F))
   );
   public static final Block field36932 = register(
      "light_blue_concrete", new Block(AbstractBlock.Properties.method26610(Material.field38966, Class112.field389).method26635().method26623(1.8F))
   );
   public static final Block field36933 = register(
      "yellow_concrete", new Block(AbstractBlock.Properties.method26610(Material.field38966, Class112.field390).method26635().method26623(1.8F))
   );
   public static final Block field36934 = register(
      "lime_concrete", new Block(AbstractBlock.Properties.method26610(Material.field38966, Class112.field391).method26635().method26623(1.8F))
   );
   public static final Block field36935 = register(
      "pink_concrete", new Block(AbstractBlock.Properties.method26610(Material.field38966, Class112.field392).method26635().method26623(1.8F))
   );
   public static final Block field36936 = register(
      "gray_concrete", new Block(AbstractBlock.Properties.method26610(Material.field38966, Class112.field393).method26635().method26623(1.8F))
   );
   public static final Block field36937 = register(
      "light_gray_concrete", new Block(AbstractBlock.Properties.method26610(Material.field38966, Class112.field394).method26635().method26623(1.8F))
   );
   public static final Block field36938 = register(
      "cyan_concrete", new Block(AbstractBlock.Properties.method26610(Material.field38966, Class112.field395).method26635().method26623(1.8F))
   );
   public static final Block field36939 = register(
      "purple_concrete", new Block(AbstractBlock.Properties.method26610(Material.field38966, Class112.field396).method26635().method26623(1.8F))
   );
   public static final Block field36940 = register(
      "blue_concrete", new Block(AbstractBlock.Properties.method26610(Material.field38966, Class112.field397).method26635().method26623(1.8F))
   );
   public static final Block field36941 = register(
      "brown_concrete", new Block(AbstractBlock.Properties.method26610(Material.field38966, Class112.field398).method26635().method26623(1.8F))
   );
   public static final Block field36942 = register(
      "green_concrete", new Block(AbstractBlock.Properties.method26610(Material.field38966, Class112.field399).method26635().method26623(1.8F))
   );
   public static final Block field36943 = register(
      "red_concrete", new Block(AbstractBlock.Properties.method26610(Material.field38966, Class112.field400).method26635().method26623(1.8F))
   );
   public static final Block field36944 = register(
      "black_concrete", new Block(AbstractBlock.Properties.method26610(Material.field38966, Class112.field401).method26635().method26623(1.8F))
   );
   public static final Block WHITE_CONCRETE_POWDER = register(
      "white_concrete_powder",
      new BlackConcretePowderBlock(field36929, AbstractBlock.Properties.method26610(Material.field38953, Class112.field386).method26623(0.5F).method26619(SoundType.SAND))
   );
   public static final Block ORANGE_CONCRETE_POWDER = register(
      "orange_concrete_powder",
      new BlackConcretePowderBlock(field36930, AbstractBlock.Properties.method26610(Material.field38953, Class112.field387).method26623(0.5F).method26619(SoundType.SAND))
   );
   public static final Block MAGENTA_CONCRETE_POWDER = register(
      "magenta_concrete_powder",
      new BlackConcretePowderBlock(field36931, AbstractBlock.Properties.method26610(Material.field38953, Class112.field388).method26623(0.5F).method26619(SoundType.SAND))
   );
   public static final Block LIGHT_BLUE_CONCRETE_POWDER = register(
      "light_blue_concrete_powder",
      new BlackConcretePowderBlock(field36932, AbstractBlock.Properties.method26610(Material.field38953, Class112.field389).method26623(0.5F).method26619(SoundType.SAND))
   );
   public static final Block YELLOW_CONCRETE_POWDER = register(
      "yellow_concrete_powder",
      new BlackConcretePowderBlock(field36933, AbstractBlock.Properties.method26610(Material.field38953, Class112.field390).method26623(0.5F).method26619(SoundType.SAND))
   );
   public static final Block LIME_CONCRETE_POWDER = register(
      "lime_concrete_powder",
      new BlackConcretePowderBlock(field36934, AbstractBlock.Properties.method26610(Material.field38953, Class112.field391).method26623(0.5F).method26619(SoundType.SAND))
   );
   public static final Block PINK_CONCRETE_POWDER = register(
      "pink_concrete_powder",
      new BlackConcretePowderBlock(field36935, AbstractBlock.Properties.method26610(Material.field38953, Class112.field392).method26623(0.5F).method26619(SoundType.SAND))
   );
   public static final Block GRAY_CONCRETE_POWDER = register(
      "gray_concrete_powder",
      new BlackConcretePowderBlock(field36936, AbstractBlock.Properties.method26610(Material.field38953, Class112.field393).method26623(0.5F).method26619(SoundType.SAND))
   );
   public static final Block LIGHT_GRAY_CONCRETE_POWDER = register(
      "light_gray_concrete_powder",
      new BlackConcretePowderBlock(field36937, AbstractBlock.Properties.method26610(Material.field38953, Class112.field394).method26623(0.5F).method26619(SoundType.SAND))
   );
   public static final Block CYAN_CONCRETE_POWDER = register(
      "cyan_concrete_powder",
      new BlackConcretePowderBlock(field36938, AbstractBlock.Properties.method26610(Material.field38953, Class112.field395).method26623(0.5F).method26619(SoundType.SAND))
   );
   public static final Block PURPLE_CONCRETE_POWDER = register(
      "purple_concrete_powder",
      new BlackConcretePowderBlock(field36939, AbstractBlock.Properties.method26610(Material.field38953, Class112.field396).method26623(0.5F).method26619(SoundType.SAND))
   );
   public static final Block BLUE_CONCRETE_POWDER = register(
      "blue_concrete_powder",
      new BlackConcretePowderBlock(field36940, AbstractBlock.Properties.method26610(Material.field38953, Class112.field397).method26623(0.5F).method26619(SoundType.SAND))
   );
   public static final Block BROWN_CONCRETE_POWDER = register(
      "brown_concrete_powder",
      new BlackConcretePowderBlock(field36941, AbstractBlock.Properties.method26610(Material.field38953, Class112.field398).method26623(0.5F).method26619(SoundType.SAND))
   );
   public static final Block GREEN_CONCRETE_POWDER = register(
      "green_concrete_powder",
      new BlackConcretePowderBlock(field36942, AbstractBlock.Properties.method26610(Material.field38953, Class112.field399).method26623(0.5F).method26619(SoundType.SAND))
   );
   public static final Block RED_CONCRETE_POWDER = register(
      "red_concrete_powder",
      new BlackConcretePowderBlock(field36943, AbstractBlock.Properties.method26610(Material.field38953, Class112.field400).method26623(0.5F).method26619(SoundType.SAND))
   );
   public static final Block BLACK_CONCRETE_POWDER = register(
      "black_concrete_powder",
      new BlackConcretePowderBlock(field36944, AbstractBlock.Properties.method26610(Material.field38953, Class112.field401).method26623(0.5F).method26619(SoundType.SAND))
   );
   public static final Block KELP = register(
      "kelp", new KelpBlock(AbstractBlock.Properties.method26609(Material.field38937).method26614().method26624().method26622().method26619(SoundType.WET_GRASS))
   );
   public static final Block KELP_PLANT = register(
      "kelp_plant", new KelpPlantBlock(AbstractBlock.Properties.method26609(Material.field38937).method26614().method26622().method26619(SoundType.WET_GRASS))
   );
   public static final Block field36963 = register(
      "dried_kelp_block",
      new Block(AbstractBlock.Properties.method26611(Material.field38951, MaterialColor.field30974).method26621(0.5F, 2.5F).method26619(SoundType.GRASS))
   );
   public static final Block TURTLE_EGG = register(
      "turtle_egg",
      new TurtleEggBlock(
         AbstractBlock.Properties.method26611(Material.DRAGON_EGG, MaterialColor.field30949).method26623(0.5F).method26619(SoundType.METAL).method26624().method26615()
      )
   );
   public static final Block field36965 = register(
      "dead_tube_coral_block", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30968).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block field36966 = register(
      "dead_brain_coral_block", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30968).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block field36967 = register(
      "dead_bubble_coral_block", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30968).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block field36968 = register(
      "dead_fire_coral_block", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30968).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block field36969 = register(
      "dead_horn_coral_block", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30968).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block TUBE_CORAL_BLOCK = register(
      "tube_coral_block",
      new HornCoralBlock(
         field36965, AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30972).method26635().method26621(1.5F, 6.0F).method26619(SoundType.CORAL)
      )
   );
   public static final Block BRAIN_CORAL_BLOCK = register(
      "brain_coral_block",
      new HornCoralBlock(
         field36966, AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30967).method26635().method26621(1.5F, 6.0F).method26619(SoundType.CORAL)
      )
   );
   public static final Block BUBBLE_CORAL_BLOCK = register(
      "bubble_coral_block",
      new HornCoralBlock(
         field36967, AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30971).method26635().method26621(1.5F, 6.0F).method26619(SoundType.CORAL)
      )
   );
   public static final Block FIRE_CORAL_BLOCK = register(
      "fire_coral_block",
      new HornCoralBlock(
         field36968, AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30975).method26635().method26621(1.5F, 6.0F).method26619(SoundType.CORAL)
      )
   );
   public static final Block HORN_CORAL_BLOCK = register(
      "horn_coral_block",
      new HornCoralBlock(
         field36969, AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30965).method26635().method26621(1.5F, 6.0F).method26619(SoundType.CORAL)
      )
   );
   public static final Block DEAD_TUBE_CORAL = register(
      "dead_tube_coral", new DeadHornCoralBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30968).method26635().method26614().method26622())
   );
   public static final Block DEAD_BRAIN_CORAL = register(
      "dead_brain_coral", new DeadHornCoralBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30968).method26635().method26614().method26622())
   );
   public static final Block DEAD_BUBBLE_CORAL = register(
      "dead_bubble_coral", new DeadHornCoralBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30968).method26635().method26614().method26622())
   );
   public static final Block DEAD_FIRE_CORAL = register(
      "dead_fire_coral", new DeadHornCoralBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30968).method26635().method26614().method26622())
   );
   public static final Block DEAD_HORN_CORAL = register(
      "dead_horn_coral", new DeadHornCoralBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30968).method26635().method26614().method26622())
   );
   public static final Block TUBE_CORAL = register(
      "tube_coral",
      new FireCoralBlock(DEAD_TUBE_CORAL, AbstractBlock.Properties.method26611(Material.field38937, MaterialColor.field30972).method26614().method26622().method26619(SoundType.WET_GRASS))
   );
   public static final Block BRAIN_CORAL = register(
      "brain_coral",
      new FireCoralBlock(DEAD_BRAIN_CORAL, AbstractBlock.Properties.method26611(Material.field38937, MaterialColor.field30967).method26614().method26622().method26619(SoundType.WET_GRASS))
   );
   public static final Block BUBBLE_CORAL = register(
      "bubble_coral",
      new FireCoralBlock(DEAD_BUBBLE_CORAL, AbstractBlock.Properties.method26611(Material.field38937, MaterialColor.field30971).method26614().method26622().method26619(SoundType.WET_GRASS))
   );
   public static final Block FIRE_CORAL = register(
      "fire_coral",
      new FireCoralBlock(DEAD_FIRE_CORAL, AbstractBlock.Properties.method26611(Material.field38937, MaterialColor.field30975).method26614().method26622().method26619(SoundType.WET_GRASS))
   );
   public static final Block HORN_CORAL = register(
      "horn_coral",
      new FireCoralBlock(DEAD_HORN_CORAL, AbstractBlock.Properties.method26611(Material.field38937, MaterialColor.field30965).method26614().method26622().method26619(SoundType.WET_GRASS))
   );
   public static final Block DEAD_TUBE_CORAL_FAN = register(
      "dead_tube_coral_fan", new DeadHornCoralFanBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30968).method26635().method26614().method26622())
   );
   public static final Block DEAD_BRAIN_CORAL_FAN = register(
      "dead_brain_coral_fan", new DeadHornCoralFanBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30968).method26635().method26614().method26622())
   );
   public static final Block DEAD_BUBBLE_CORAL_FAN = register(
      "dead_bubble_coral_fan", new DeadHornCoralFanBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30968).method26635().method26614().method26622())
   );
   public static final Block DEAD_FIRE_CORAL_FAN = register(
      "dead_fire_coral_fan", new DeadHornCoralFanBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30968).method26635().method26614().method26622())
   );
   public static final Block DEAD_HORN_CORAL_FAN = register(
      "dead_horn_coral_fan", new DeadHornCoralFanBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30968).method26635().method26614().method26622())
   );
   public static final Block TUBE_CORAL_FAN = register(
      "tube_coral_fan",
      new HornCoralFanBlock(DEAD_TUBE_CORAL_FAN, AbstractBlock.Properties.method26611(Material.field38937, MaterialColor.field30972).method26614().method26622().method26619(SoundType.WET_GRASS))
   );
   public static final Block BRAIN_CORAL_FAN = register(
      "brain_coral_fan",
      new HornCoralFanBlock(DEAD_BRAIN_CORAL_FAN, AbstractBlock.Properties.method26611(Material.field38937, MaterialColor.field30967).method26614().method26622().method26619(SoundType.WET_GRASS))
   );
   public static final Block BUBBLE_CORAL_FAN = register(
      "bubble_coral_fan",
      new HornCoralFanBlock(DEAD_BUBBLE_CORAL_FAN, AbstractBlock.Properties.method26611(Material.field38937, MaterialColor.field30971).method26614().method26622().method26619(SoundType.WET_GRASS))
   );
   public static final Block FIRE_CORAL_FAN = register(
      "fire_coral_fan",
      new HornCoralFanBlock(DEAD_FIRE_CORAL_FAN, AbstractBlock.Properties.method26611(Material.field38937, MaterialColor.field30975).method26614().method26622().method26619(SoundType.WET_GRASS))
   );
   public static final Block HORN_CORAL_FAN = register(
      "horn_coral_fan",
      new HornCoralFanBlock(DEAD_HORN_CORAL_FAN, AbstractBlock.Properties.method26611(Material.field38937, MaterialColor.field30965).method26614().method26622().method26619(SoundType.WET_GRASS))
   );
   public static final Block DEAD_TUBE_CORAL_WALL_FAN = register(
      "dead_tube_coral_wall_fan",
      new DeadHornCoralWallFanBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30968).method26635().method26614().method26622().method26627(DEAD_TUBE_CORAL_FAN))
   );
   public static final Block DEAD_BRAIN_CORAL_WALL_FAN = register(
      "dead_brain_coral_wall_fan",
      new DeadHornCoralWallFanBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30968).method26635().method26614().method26622().method26627(DEAD_BRAIN_CORAL_FAN))
   );
   public static final Block DEAD_BUBBLE_CORAL_WALL_FAN = register(
      "dead_bubble_coral_wall_fan",
      new DeadHornCoralWallFanBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30968).method26635().method26614().method26622().method26627(DEAD_BUBBLE_CORAL_FAN))
   );
   public static final Block DEAD_FIRE_CORAL_WALL_FAN = register(
      "dead_fire_coral_wall_fan",
      new DeadHornCoralWallFanBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30968).method26635().method26614().method26622().method26627(DEAD_FIRE_CORAL_FAN))
   );
   public static final Block DEAD_HORN_CORAL_WALL_FAN = register(
      "dead_horn_coral_wall_fan",
      new DeadHornCoralWallFanBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30968).method26635().method26614().method26622().method26627(DEAD_HORN_CORAL_FAN))
   );
   public static final Block TUBE_CORAL_WALL_FAN = register(
      "tube_coral_wall_fan",
      new HornCoralWallFanBlock(
              DEAD_TUBE_CORAL_WALL_FAN,
         AbstractBlock.Properties.method26611(Material.field38937, MaterialColor.field30972)
            .method26614()
            .method26622()
            .method26619(SoundType.WET_GRASS)
            .method26627(TUBE_CORAL_FAN)
      )
   );
   public static final Block BRAIN_CORAL_WALL_FAN = register(
      "brain_coral_wall_fan",
      new HornCoralWallFanBlock(
              DEAD_BRAIN_CORAL_WALL_FAN,
         AbstractBlock.Properties.method26611(Material.field38937, MaterialColor.field30967)
            .method26614()
            .method26622()
            .method26619(SoundType.WET_GRASS)
            .method26627(BRAIN_CORAL_FAN)
      )
   );
   public static final Block BUBBLE_CORAL_WALL_FAN = register(
      "bubble_coral_wall_fan",
      new HornCoralWallFanBlock(
              DEAD_BUBBLE_CORAL_WALL_FAN,
         AbstractBlock.Properties.method26611(Material.field38937, MaterialColor.field30971)
            .method26614()
            .method26622()
            .method26619(SoundType.WET_GRASS)
            .method26627(BUBBLE_CORAL_FAN)
      )
   );
   public static final Block FIRE_CORAL_WALL_FAN = register(
      "fire_coral_wall_fan",
      new HornCoralWallFanBlock(
              DEAD_FIRE_CORAL_WALL_FAN,
         AbstractBlock.Properties.method26611(Material.field38937, MaterialColor.field30975)
            .method26614()
            .method26622()
            .method26619(SoundType.WET_GRASS)
            .method26627(FIRE_CORAL_FAN)
      )
   );
   public static final Block HORN_CORAL_WALL_FAN = register(
      "horn_coral_wall_fan",
      new HornCoralWallFanBlock(
              DEAD_HORN_CORAL_WALL_FAN,
         AbstractBlock.Properties.method26611(Material.field38937, MaterialColor.field30965)
            .method26614()
            .method26622()
            .method26619(SoundType.WET_GRASS)
            .method26627(HORN_CORAL_FAN)
      )
   );
   public static final Block SEA_PICKLE = register(
      "sea_pickle",
      new SeaPickleBlock(
         AbstractBlock.Properties.method26611(Material.field38937, MaterialColor.field30974)
            .method26620(var0 -> !SeaPickleBlock.method11496(var0) ? 3 + 3 * var0.<Integer>get(SeaPickleBlock.field18472) : 0)
            .method26619(SoundType.SLIME)
            .method26615()
      )
   );
   public static final Block BLUE_ICE = register(
      "blue_ice", new BlueIceBlock(AbstractBlock.Properties.method26609(Material.field38952).method26623(2.8F).method26616(0.989F).method26619(SoundType.GLASS))
   );
   public static final Block CONDUIT = register(
      "conduit", new ConduitBlock(AbstractBlock.Properties.method26611(Material.field38963, MaterialColor.field30978).method26623(3.0F).method26620(var0 -> 15).method26615())
   );
   public static final Block BAMBOO_SAPLING = register(
      "bamboo_sapling",
      new BambooSaplingBlock(AbstractBlock.Properties.method26609(Material.field38958).method26624().method26622().method26614().method26623(1.0F).method26619(SoundType.BAMBOO_SAPLING))
   );
   public static final Block BAMBOO = register(
      "bamboo",
      new BambooBlock(
         AbstractBlock.Properties.method26611(Material.field38959, MaterialColor.FOLIAGE)
            .method26624()
            .method26622()
            .method26623(1.0F)
            .method26619(SoundType.BAMBOO)
            .method26615()
      )
   );
   public static final Block POTTED_BAMBOO = register(
      "potted_bamboo", new PottedWarpedRootsBlock(BAMBOO, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block VOID_AIR = register(
      "void_air", new AirBlock(AbstractBlock.Properties.method26609(Material.field38932).method26614().method26626().method26628())
   );
   public static final Block field37012 = register(
      "cave_air", new AirBlock(AbstractBlock.Properties.method26609(Material.field38932).method26614().method26626().method26628())
   );
   public static final Block BUBBLE_COLUMN = register(
      "bubble_column", new BubbleColumnBlock(AbstractBlock.Properties.method26609(Material.field38942).method26614().method26626())
   );
   public static final Block field37014 = register("polished_granite_stairs", new StairsBlock(POLISHED_GRANITE.getDefaultState(), AbstractBlock.Properties.method26613(POLISHED_GRANITE)));
   public static final Block field37015 = register(
      "smooth_red_sandstone_stairs", new StairsBlock(field36861.getDefaultState(), AbstractBlock.Properties.method26613(field36861))
   );
   public static final Block field37016 = register(
      "mossy_stone_brick_stairs", new StairsBlock(field36616.getDefaultState(), AbstractBlock.Properties.method26613(field36616))
   );
   public static final Block field37017 = register("polished_diorite_stairs", new StairsBlock(POLISHED_DIORITE.getDefaultState(), AbstractBlock.Properties.method26613(POLISHED_DIORITE)));
   public static final Block field37018 = register(
      "mossy_cobblestone_stairs", new StairsBlock(field36526.getDefaultState(), AbstractBlock.Properties.method26613(field36526))
   );
   public static final Block field37019 = register("end_stone_brick_stairs", new StairsBlock(field36883.getDefaultState(), AbstractBlock.Properties.method26613(field36883)));
   public static final Block field37020 = register("stone_stairs", new StairsBlock(STONE.getDefaultState(), AbstractBlock.Properties.method26613(STONE)));
   public static final Block field37021 = register("smooth_sandstone_stairs", new StairsBlock(field36859.getDefaultState(), AbstractBlock.Properties.method26613(field36859)));
   public static final Block field37022 = register("smooth_quartz_stairs", new StairsBlock(field36860.getDefaultState(), AbstractBlock.Properties.method26613(field36860)));
   public static final Block field37023 = register("granite_stairs", new StairsBlock(GRANITE.getDefaultState(), AbstractBlock.Properties.method26613(GRANITE)));
   public static final Block field37024 = register("andesite_stairs", new StairsBlock(ANDESITE.getDefaultState(), AbstractBlock.Properties.method26613(ANDESITE)));
   public static final Block field37025 = register("red_nether_brick_stairs", new StairsBlock(field36892.getDefaultState(), AbstractBlock.Properties.method26613(field36892)));
   public static final Block field37026 = register(
      "polished_andesite_stairs", new StairsBlock(POLISHED_ANDESITE.getDefaultState(), AbstractBlock.Properties.method26613(POLISHED_ANDESITE))
   );
   public static final Block field37027 = register("diorite_stairs", new StairsBlock(DIORITE.getDefaultState(), AbstractBlock.Properties.method26613(DIORITE)));
   public static final Block field37028 = register("polished_granite_slab", new SlabBlock(AbstractBlock.Properties.method26613(POLISHED_GRANITE)));
   public static final Block field37029 = register("smooth_red_sandstone_slab", new SlabBlock(AbstractBlock.Properties.method26613(field36861)));
   public static final Block field37030 = register("mossy_stone_brick_slab", new SlabBlock(AbstractBlock.Properties.method26613(field36616)));
   public static final Block field37031 = register("polished_diorite_slab", new SlabBlock(AbstractBlock.Properties.method26613(POLISHED_DIORITE)));
   public static final Block field37032 = register("mossy_cobblestone_slab", new SlabBlock(AbstractBlock.Properties.method26613(field36526)));
   public static final Block field37033 = register("end_stone_brick_slab", new SlabBlock(AbstractBlock.Properties.method26613(field36883)));
   public static final Block field37034 = register("smooth_sandstone_slab", new SlabBlock(AbstractBlock.Properties.method26613(field36859)));
   public static final Block field37035 = register("smooth_quartz_slab", new SlabBlock(AbstractBlock.Properties.method26613(field36860)));
   public static final Block field37036 = register("granite_slab", new SlabBlock(AbstractBlock.Properties.method26613(GRANITE)));
   public static final Block field37037 = register("andesite_slab", new SlabBlock(AbstractBlock.Properties.method26613(ANDESITE)));
   public static final Block field37038 = register("red_nether_brick_slab", new SlabBlock(AbstractBlock.Properties.method26613(field36892)));
   public static final Block field37039 = register("polished_andesite_slab", new SlabBlock(AbstractBlock.Properties.method26613(POLISHED_ANDESITE)));
   public static final Block field37040 = register("diorite_slab", new SlabBlock(AbstractBlock.Properties.method26613(DIORITE)));
   public static final Block BRICK_WALL = register("brick_wall", new PolishedBlackstoneWallBlock(AbstractBlock.Properties.method26613(BRICKS)));
   public static final Block PRISMARINE_WALL = register("prismarine_wall", new PolishedBlackstoneWallBlock(AbstractBlock.Properties.method26613(field36767)));
   public static final Block RED_SANDSTONE_WALL = register("red_sandstone_wall", new PolishedBlackstoneWallBlock(AbstractBlock.Properties.method26613(field36835)));
   public static final Block MOSSY_STONE_BRICK_WALL = register("mossy_stone_brick_wall", new PolishedBlackstoneWallBlock(AbstractBlock.Properties.method26613(field36616)));
   public static final Block GRANITE_WALL = register("granite_wall", new PolishedBlackstoneWallBlock(AbstractBlock.Properties.method26613(GRANITE)));
   public static final Block STONE_BRICK_WALL = register("stone_brick_wall", new PolishedBlackstoneWallBlock(AbstractBlock.Properties.method26613(field36615)));
   public static final Block NETHER_BRICK_WALL = register("nether_brick_wall", new PolishedBlackstoneWallBlock(AbstractBlock.Properties.method26613(NETHER_BRICKS)));
   public static final Block ANDESITE_WALL = register("andesite_wall", new PolishedBlackstoneWallBlock(AbstractBlock.Properties.method26613(ANDESITE)));
   public static final Block RED_NETHER_BRICK_WALL = register("red_nether_brick_wall", new PolishedBlackstoneWallBlock(AbstractBlock.Properties.method26613(field36892)));
   public static final Block SANDSTONE_WALL = register("sandstone_wall", new PolishedBlackstoneWallBlock(AbstractBlock.Properties.method26613(SANDSTONE)));
   public static final Block END_STONE_BRICK_WALL = register("end_stone_brick_wall", new PolishedBlackstoneWallBlock(AbstractBlock.Properties.method26613(field36883)));
   public static final Block DIORITE_WALL = register("diorite_wall", new PolishedBlackstoneWallBlock(AbstractBlock.Properties.method26613(DIORITE)));
   public static final Block SCAFFOLDING = register(
      "scaffolding",
      new ScaffoldingBlock(AbstractBlock.Properties.method26611(Material.field38946, MaterialColor.field30949).method26614().method26619(SoundType.SCAFFOLDING).method26625())
   );
   public static final Block LOOM = register(
      "loom", new Class3478(AbstractBlock.Properties.method26609(Material.field38956).method26623(2.5F).method26619(SoundType.WOOD))
   );
   public static final Block BARREL = register(
      "barrel", new Class3242(AbstractBlock.Properties.method26609(Material.field38956).method26623(2.5F).method26619(SoundType.WOOD))
   );
   public static final Block SMOKER = register(
      "smoker", new Class3352(AbstractBlock.Properties.method26609(Material.field38966).method26635().method26623(3.5F).method26620(method30011(13)))
   );
   public static final Block BLAST_FURNACE = register(
      "blast_furnace", new Class3351(AbstractBlock.Properties.method26609(Material.field38966).method26635().method26623(3.5F).method26620(method30011(13)))
   );
   public static final Block CARTOGRAPHY_TABLE = register(
      "cartography_table", new Class3416(AbstractBlock.Properties.method26609(Material.field38956).method26623(2.5F).method26619(SoundType.WOOD))
   );
   public static final Block FLETCHING_TABLE = register(
      "fletching_table", new Class3439(AbstractBlock.Properties.method26609(Material.field38956).method26623(2.5F).method26619(SoundType.WOOD))
   );
   public static final Block GRINDSTONE = register(
      "grindstone",
      new Class3205(AbstractBlock.Properties.method26611(Material.ANVIL, MaterialColor.IRON).method26635().method26621(2.0F, 6.0F).method26619(SoundType.STONE))
   );
   public static final Block LECTERN = register(
      "lectern", new Class3354(AbstractBlock.Properties.method26609(Material.field38956).method26623(2.5F).method26619(SoundType.WOOD))
   );
   public static final Block SMITHING_TABLE = register(
      "smithing_table", new Class3440(AbstractBlock.Properties.method26609(Material.field38956).method26623(2.5F).method26619(SoundType.WOOD))
   );
   public static final Block STONECUTTER = register(
      "stonecutter", new Class3412(AbstractBlock.Properties.method26609(Material.field38966).method26635().method26623(3.5F))
   );
   public static final Block BELL = register(
      "bell",
      new Class3369(AbstractBlock.Properties.method26611(Material.field38967, MaterialColor.field30977).method26635().method26623(5.0F).method26619(SoundType.ANVIL))
   );
   public static final Block LANTERN = register(
      "lantern",
      new Class3466(
         AbstractBlock.Properties.method26609(Material.field38967).method26635().method26623(3.5F).method26619(SoundType.LANTERN).method26620(var0 -> 15).method26615()
      )
   );
   public static final Block SOUL_LANTERN = register(
      "soul_lantern",
      new Class3466(
         AbstractBlock.Properties.method26609(Material.field38967).method26635().method26623(3.5F).method26619(SoundType.LANTERN).method26620(var0 -> 10).method26615()
      )
   );
   public static final Block CAMPFIRE = register(
      "campfire",
      new Class3244(
         true,
         1,
         AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30981)
            .method26623(2.0F)
            .method26619(SoundType.WOOD)
            .method26620(method30011(15))
            .method26615()
      )
   );
   public static final Block SOUL_CAMPFIRE = register(
      "soul_campfire",
      new Class3244(
         false,
         2,
         AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30981)
            .method26623(2.0F)
            .method26619(SoundType.WOOD)
            .method26620(method30011(10))
            .method26615()
      )
   );
   public static final Block SWEET_BERRY_BUSH = register(
      "sweet_berry_bush", new Class3484(AbstractBlock.Properties.method26609(Material.PLANTS).method26624().method26614().method26619(SoundType.SWEET_BERRY_BUSH))
   );
   public static final Block WARPED_STEM = register("warped_stem", method30017(MaterialColor.field31003));
   public static final Block STRIPPED_WARPED_STEM = register("stripped_warped_stem", method30017(MaterialColor.field31003));
   public static final Block WARPED_HYPHAE = register(
      "warped_hyphae", new StrippedCrimsonHyphaeBlock(AbstractBlock.Properties.method26611(Material.field38957, MaterialColor.field31004).method26623(2.0F).method26619(SoundType.STEM))
   );
   public static final Block STRIPPED_WARPED_HYPHAE = register(
      "stripped_warped_hyphae",
      new StrippedCrimsonHyphaeBlock(AbstractBlock.Properties.method26611(Material.field38957, MaterialColor.field31004).method26623(2.0F).method26619(SoundType.STEM))
   );
   public static final Block WARPED_NYLIUM = register(
      "warped_nylium",
      new CrimsonNyliumBlock(
         AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field31002).method26635().method26623(0.4F).method26619(SoundType.NYLIUM).method26624()
      )
   );
   public static final Block WARPED_FUNGUS = register(
      "warped_fungus",
      new CrimsonFungusBlock(
         AbstractBlock.Properties.method26611(Material.PLANTS, MaterialColor.field30970).method26622().method26614().method26619(SoundType.FUNGUS),
         () -> Features.field41767
      )
   );
   public static final Block field37076 = register(
      "warped_wart_block", new Block(AbstractBlock.Properties.method26611(Material.field38951, MaterialColor.field31005).method26623(1.0F).method26619(SoundType.NETHERRACK))
   );
   public static final Block WARPED_ROOTS = register(
      "warped_roots",
      new CrimsonRootsBlock(AbstractBlock.Properties.method26611(Material.field38939, MaterialColor.field30970).method26614().method26622().method26619(SoundType.ROOTS))
   );
   public static final Block NETHER_SPROUTS = register(
      "nether_sprouts",
      new NetherSproutsBlock(AbstractBlock.Properties.method26611(Material.field38939, MaterialColor.field30970).method26614().method26622().method26619(SoundType.NETHER_ORE))
   );
   public static final Block field37079 = register("crimson_stem", method30017(MaterialColor.field31000));
   public static final Block field37080 = register("stripped_crimson_stem", method30017(MaterialColor.field31000));
   public static final Block CRIMSON_HYPHAE = register(
      "crimson_hyphae", new StrippedCrimsonHyphaeBlock(AbstractBlock.Properties.method26611(Material.field38957, MaterialColor.field31001).method26623(2.0F).method26619(SoundType.STEM))
   );
   public static final Block STRIPPED_CRIMSON_HYPHAE = register(
      "stripped_crimson_hyphae",
      new StrippedCrimsonHyphaeBlock(AbstractBlock.Properties.method26611(Material.field38957, MaterialColor.field31001).method26623(2.0F).method26619(SoundType.STEM))
   );
   public static final Block CRIMSON_NYLIUM = register(
      "crimson_nylium",
      new CrimsonNyliumBlock(
         AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30999).method26635().method26623(0.4F).method26619(SoundType.NYLIUM).method26624()
      )
   );
   public static final Block CRIMSON_FUNGUS = register(
      "crimson_fungus",
      new CrimsonFungusBlock(
         AbstractBlock.Properties.method26611(Material.PLANTS, MaterialColor.field30982).method26622().method26614().method26619(SoundType.FUNGUS),
         () -> Features.field41765
      )
   );
   public static final Block field37085 = register(
      "shroomlight",
      new Block(
         AbstractBlock.Properties.method26611(Material.field38951, MaterialColor.field30975).method26623(1.0F).method26619(SoundType.WEEPING_VINES).method26620(var0 -> 15)
      )
   );
   public static final Block WEEPING_VINES = register(
      "weeping_vines",
      new WeepingVinesBlock(
         AbstractBlock.Properties.method26611(Material.PLANTS, MaterialColor.field30982).method26624().method26614().method26622().method26619(SoundType.TWISTING_VINES)
      )
   );
   public static final Block WEEPING_VINES_PLANT = register(
      "weeping_vines_plant",
      new WeepingVinesPlantBlock(AbstractBlock.Properties.method26611(Material.PLANTS, MaterialColor.field30982).method26614().method26622().method26619(SoundType.TWISTING_VINES))
   );
   public static final Block TWISTING_VINES = register(
      "twisting_vines",
      new TwistingVinesBlock(
         AbstractBlock.Properties.method26611(Material.PLANTS, MaterialColor.field30970).method26624().method26614().method26622().method26619(SoundType.TWISTING_VINES)
      )
   );
   public static final Block TWISTING_VINES_PLANT = register(
      "twisting_vines_plant",
      new TwistingVinesPlantBlock(AbstractBlock.Properties.method26611(Material.PLANTS, MaterialColor.field30970).method26614().method26622().method26619(SoundType.TWISTING_VINES))
   );
   public static final Block CRIMSON_ROOTS = register(
      "crimson_roots",
      new CrimsonRootsBlock(AbstractBlock.Properties.method26611(Material.field38939, MaterialColor.field30982).method26614().method26622().method26619(SoundType.ROOTS))
   );
   public static final Block field37091 = register(
      "crimson_planks",
      new Block(AbstractBlock.Properties.method26611(Material.field38957, MaterialColor.field31000).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block field37092 = register(
      "warped_planks",
      new Block(AbstractBlock.Properties.method26611(Material.field38957, MaterialColor.field31003).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block field37093 = register(
      "crimson_slab",
      new SlabBlock(AbstractBlock.Properties.method26611(Material.field38957, field37091.method12000()).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block field37094 = register(
      "warped_slab",
      new SlabBlock(AbstractBlock.Properties.method26611(Material.field38957, field37092.method12000()).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block CRIMSON_PRESSURE_PLATE = register(
      "crimson_pressure_plate",
      new WarpedPressurePlateBlock(
         Class2275.field14823,
         AbstractBlock.Properties.method26611(Material.field38957, field37091.method12000()).method26614().method26623(0.5F).method26619(SoundType.WOOD)
      )
   );
   public static final Block WARPED_PRESSURE_PLATE = register(
      "warped_pressure_plate",
      new WarpedPressurePlateBlock(
         Class2275.field14823,
         AbstractBlock.Properties.method26611(Material.field38957, field37092.method12000()).method26614().method26623(0.5F).method26619(SoundType.WOOD)
      )
   );
   public static final Block CRIMSON_FENCE = register(
      "crimson_fence",
      new WarpedFenceBlock(AbstractBlock.Properties.method26611(Material.field38957, field37091.method12000()).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block WARPED_FENCE = register(
      "warped_fence",
      new WarpedFenceBlock(AbstractBlock.Properties.method26611(Material.field38957, field37092.method12000()).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block CRIMSON_TRAPDOOR = register(
      "crimson_trapdoor",
      new WarpedTrapdoorBlock(
         AbstractBlock.Properties.method26611(Material.field38957, field37091.method12000())
            .method26623(3.0F)
            .method26619(SoundType.WOOD)
            .method26615()
            .method26629(Blocks::method30012)
      )
   );
   public static final Block WARPED_TRAPDOOR = register(
      "warped_trapdoor",
      new WarpedTrapdoorBlock(
         AbstractBlock.Properties.method26611(Material.field38957, field37092.method12000())
            .method26623(3.0F)
            .method26619(SoundType.WOOD)
            .method26615()
            .method26629(Blocks::method30012)
      )
   );
   public static final Block field37101 = register(
      "crimson_fence_gate",
      new FenceGateBlock(AbstractBlock.Properties.method26611(Material.field38957, field37091.method12000()).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block field37102 = register(
      "warped_fence_gate",
      new FenceGateBlock(AbstractBlock.Properties.method26611(Material.field38957, field37092.method12000()).method26621(2.0F, 3.0F).method26619(SoundType.WOOD))
   );
   public static final Block field37103 = register("crimson_stairs", new StairsBlock(field37091.getDefaultState(), AbstractBlock.Properties.method26613(field37091)));
   public static final Block field37104 = register("warped_stairs", new StairsBlock(field37092.getDefaultState(), AbstractBlock.Properties.method26613(field37092)));
   public static final Block field37105 = register(
      "crimson_button", new WoodButtonBlock(AbstractBlock.Properties.method26609(Material.field38946).method26614().method26623(0.5F).method26619(SoundType.WOOD))
   );
   public static final Block field37106 = register(
      "warped_button", new WoodButtonBlock(AbstractBlock.Properties.method26609(Material.field38946).method26614().method26623(0.5F).method26619(SoundType.WOOD))
   );
   public static final Block field37107 = register(
      "crimson_door",
      new DoorBlock(AbstractBlock.Properties.method26611(Material.field38957, field37091.method12000()).method26623(3.0F).method26619(SoundType.WOOD).method26615())
   );
   public static final Block field37108 = register(
      "warped_door",
      new DoorBlock(AbstractBlock.Properties.method26611(Material.field38957, field37092.method12000()).method26623(3.0F).method26619(SoundType.WOOD).method26615())
   );
   public static final Block CRIMSON_SIGN = register(
      "crimson_sign",
      new CrimsonSignBlock(
         AbstractBlock.Properties.method26611(Material.field38957, field37091.method12000()).method26614().method26623(1.0F).method26619(SoundType.WOOD),
         Class9673.field45172
      )
   );
   public static final Block WARPED_SIGN = register(
      "warped_sign",
      new CrimsonSignBlock(
         AbstractBlock.Properties.method26611(Material.field38957, field37092.method12000()).method26614().method26623(1.0F).method26619(SoundType.WOOD),
         Class9673.field45173
      )
   );
   public static final Block CRIMSON_WALL_SIGN = register(
      "crimson_wall_sign",
      new WarpedWallSignBlock(
         AbstractBlock.Properties.method26611(Material.field38957, field37091.method12000())
            .method26614()
            .method26623(1.0F)
            .method26619(SoundType.WOOD)
            .method26627(CRIMSON_SIGN),
         Class9673.field45172
      )
   );
   public static final Block WARPED_WALL_SIGN = register(
      "warped_wall_sign",
      new WarpedWallSignBlock(
         AbstractBlock.Properties.method26611(Material.field38957, field37092.method12000())
            .method26614()
            .method26623(1.0F)
            .method26619(SoundType.WOOD)
            .method26627(WARPED_SIGN),
         Class9673.field45173
      )
   );
   public static final Block field37113 = register(
      "structure_block",
      new StructureBlock(AbstractBlock.Properties.method26611(Material.field38967, MaterialColor.field30969).method26635().method26621(-1.0F, 3600000.0F).method26626())
   );
   public static final Block field37114 = register(
      "jigsaw", new JigsawBlock(AbstractBlock.Properties.method26611(Material.field38967, MaterialColor.field30969).method26635().method26621(-1.0F, 3600000.0F).method26626())
   );
   public static final Block COMPOSTER = register(
      "composter", new ComposterBlock(AbstractBlock.Properties.method26609(Material.field38956).method26623(0.6F).method26619(SoundType.WOOD))
   );
   public static final Block TARGET = register(
      "target", new TargetBlock(AbstractBlock.Properties.method26611(Material.field38951, MaterialColor.field30961).method26623(0.5F).method26619(SoundType.GRASS))
   );
   public static final Block BEE_NEST = register(
      "bee_nest", new BeehiveBlock(AbstractBlock.Properties.method26611(Material.field38956, MaterialColor.field30965).method26623(0.3F).method26619(SoundType.WOOD))
   );
   public static final Block BEEHIVE = register(
      "beehive", new BeehiveBlock(AbstractBlock.Properties.method26609(Material.field38956).method26623(0.6F).method26619(SoundType.WOOD))
   );
   public static final Block field37119 = register(
      "honey_block",
      new HoneyBlock(
         AbstractBlock.Properties.method26611(Material.field38949, MaterialColor.field30962).method26617(0.4F).method26618(0.5F).method26615().method26619(SoundType.HONEY)
      )
   );
   public static final Block field37120 = register(
      "honeycomb_block", new Block(AbstractBlock.Properties.method26611(Material.field38949, MaterialColor.field30962).method26623(0.6F).method26619(SoundType.CORAL))
   );
   public static final Block field37121 = register(
      "netherite_block",
      new Block(
         AbstractBlock.Properties.method26611(Material.field38967, MaterialColor.field30976).method26635().method26621(50.0F, 1200.0F).method26619(SoundType.ANCIENT_DEBRIS)
      )
   );
   public static final Block field37122 = register(
      "ancient_debris",
      new Block(
         AbstractBlock.Properties.method26611(Material.field38967, MaterialColor.field30976).method26635().method26621(30.0F, 1200.0F).method26619(SoundType.LODESTONE)
      )
   );
   public static final Block CRYING_OBSIDIAN = register(
      "crying_obsidian",
      new CryingObsidianBlock(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30976).method26635().method26621(50.0F, 1200.0F).method26620(var0 -> 10))
   );
   public static final Block RESPAWN_ANCHOR = register(
      "respawn_anchor",
      new RespawnAnchorBlock(
         AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30976)
            .method26635()
            .method26621(50.0F, 1200.0F)
            .method26620(var0 -> RespawnAnchorBlock.method11990(var0, 15))
      )
   );
   public static final Block POTTED_CRIMSON_FUNGUS = register(
      "potted_crimson_fungus", new PottedWarpedRootsBlock(CRIMSON_FUNGUS, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_WARPED_FUNGUS = register(
      "potted_warped_fungus", new PottedWarpedRootsBlock(WARPED_FUNGUS, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_CRIMSON_ROOTS = register(
      "potted_crimson_roots", new PottedWarpedRootsBlock(CRIMSON_ROOTS, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block POTTED_WARPED_ROOTS = register(
      "potted_warped_roots", new PottedWarpedRootsBlock(WARPED_ROOTS, AbstractBlock.Properties.method26609(Material.field38946).method26622().method26615())
   );
   public static final Block field37129 = register(
      "lodestone", new Block(AbstractBlock.Properties.method26609(Material.ANVIL).method26635().method26623(3.5F).method26619(SoundType.CHAIN))
   );
   public static final Block field37130 = register(
      "blackstone", new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30976).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block field37131 = register("blackstone_stairs", new StairsBlock(field37130.getDefaultState(), AbstractBlock.Properties.method26613(field37130)));
   public static final Block BLACKSTONE_WALL = register("blackstone_wall", new PolishedBlackstoneWallBlock(AbstractBlock.Properties.method26613(field37130)));
   public static final Block field37133 = register("blackstone_slab", new SlabBlock(AbstractBlock.Properties.method26613(field37130).method26621(2.0F, 6.0F)));
   public static final Block field37134 = register("polished_blackstone", new Block(AbstractBlock.Properties.method26613(field37130).method26621(2.0F, 6.0F)));
   public static final Block field37135 = register(
      "polished_blackstone_bricks", new Block(AbstractBlock.Properties.method26613(field37134).method26621(1.5F, 6.0F))
   );
   public static final Block field37136 = register("cracked_polished_blackstone_bricks", new Block(AbstractBlock.Properties.method26613(field37135)));
   public static final Block field37137 = register(
      "chiseled_polished_blackstone", new Block(AbstractBlock.Properties.method26613(field37134).method26621(1.5F, 6.0F))
   );
   public static final Block field37138 = register(
      "polished_blackstone_brick_slab", new SlabBlock(AbstractBlock.Properties.method26613(field37135).method26621(2.0F, 6.0F))
   );
   public static final Block field37139 = register(
      "polished_blackstone_brick_stairs", new StairsBlock(field37135.getDefaultState(), AbstractBlock.Properties.method26613(field37135))
   );
   public static final Block POLISHED_BLACKSTONE_BRICK_WALL = register("polished_blackstone_brick_wall", new PolishedBlackstoneWallBlock(AbstractBlock.Properties.method26613(field37135)));
   public static final Block field37141 = register(
      "gilded_blackstone", new Block(AbstractBlock.Properties.method26613(field37130).method26619(SoundType.field36246))
   );
   public static final Block field37142 = register(
      "polished_blackstone_stairs", new StairsBlock(field37134.getDefaultState(), AbstractBlock.Properties.method26613(field37134))
   );
   public static final Block field37143 = register("polished_blackstone_slab", new SlabBlock(AbstractBlock.Properties.method26613(field37134)));
   public static final Block POLISHED_BLACKSTONE_PRESSURE_PLATE = register(
      "polished_blackstone_pressure_plate",
      new WarpedPressurePlateBlock(Class2275.field14824, AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30976).method26635().method26614().method26623(0.5F))
   );
   public static final Block field37145 = register(
      "polished_blackstone_button", new StoneButtonBlock(AbstractBlock.Properties.method26609(Material.field38946).method26614().method26623(0.5F))
   );
   public static final Block POLISHED_BLACKSTONE_WALL = register("polished_blackstone_wall", new PolishedBlackstoneWallBlock(AbstractBlock.Properties.method26613(field37134)));
   public static final Block field37147 = register(
      "chiseled_nether_bricks",
      new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30982).method26635().method26621(2.0F, 6.0F).method26619(SoundType.NETHER_SPROUTS))
   );
   public static final Block field37148 = register(
      "cracked_nether_bricks",
      new Block(AbstractBlock.Properties.method26611(Material.field38966, MaterialColor.field30982).method26635().method26621(2.0F, 6.0F).method26619(SoundType.NETHER_SPROUTS))
   );
   public static final Block field37149 = register("quartz_bricks", new Block(AbstractBlock.Properties.method26613(field36724)));

   private static ToIntFunction<BlockState> method30011(int var0) {
      return var1 -> !var1.<Boolean>get(BlockStateProperties.field39699) ? 0 : var0;
   }

   private static Boolean method30012(BlockState var0, IBlockReader var1, BlockPos var2, EntityType<?> var3) {
      return false;
   }

   private static Boolean method30013(BlockState var0, IBlockReader var1, BlockPos var2, EntityType<?> var3) {
      return true;
   }

   private static Boolean method30014(BlockState var0, IBlockReader var1, BlockPos var2, EntityType<?> var3) {
      return var3 == EntityType.OCELOT || var3 == EntityType.PARROT;
   }

   private static Class3250 method30015(Class112 var0) {
      return new Class3250(
         var0,
         AbstractBlock.Properties.method26612(
               Material.field38960, var1 -> var1.get(Class3250.field18713) != BedPart.FOOT ? MaterialColor.field30950 : var0.method312()
            )
            .method26619(SoundType.WOOD)
            .method26623(0.2F)
            .method26615()
      );
   }

   private static StrippedCrimsonHyphaeBlock makeLogBlock(MaterialColor var0, MaterialColor var1) {
      return new StrippedCrimsonHyphaeBlock(
         AbstractBlock.Properties.method26612(Material.field38956, var2 -> var2.get(StrippedCrimsonHyphaeBlock.field18994) != Direction.Axis.Y ? var1 : var0)
            .method26623(2.0F)
            .method26619(SoundType.WOOD)
      );
   }

   private static Block method30017(MaterialColor var0) {
      return new StrippedCrimsonHyphaeBlock(AbstractBlock.Properties.method26612(Material.field38957, var1 -> var0).method26623(2.0F).method26619(SoundType.STEM));
   }

   private static boolean method30018(BlockState var0, IBlockReader var1, BlockPos var2) {
      return true;
   }

   private static boolean method30019(BlockState var0, IBlockReader var1, BlockPos var2) {
      return false;
   }

   private static Class3234 method30020(Class112 var0) {
      return new Class3234(
         var0,
         AbstractBlock.Properties.method26610(Material.field38963, var0)
            .method26623(0.3F)
            .method26619(SoundType.GLASS)
            .method26615()
            .method26629(Blocks::method30012)
            .method26630(Blocks::method30019)
            .method26631(Blocks::method30019)
            .method26632(Blocks::method30019)
      );
   }

   private static Class3465 method30021() {
      return new Class3465(
         AbstractBlock.Properties.method26609(Material.field38962)
            .method26623(0.2F)
            .method26624()
            .method26619(SoundType.GRASS)
            .method26615()
            .method26629(Blocks::method30014)
            .method26631(Blocks::method30019)
            .method26632(Blocks::method30019)
      );
   }

   private static Class3368 method30022(Class112 var0, AbstractBlock.Properties var1) {
      Class8609 var4 = (var0x, var1x, var2) -> {
         TileEntity var5 = var1x.getTileEntity(var2);
         if (var5 instanceof Class940) {
            Class940 var6 = (Class940)var5;
            return var6.method3757();
         } else {
            return true;
         }
      };
      return new Class3368(var0, var1.method26623(2.0F).method26625().method26615().method26631(var4).method26632(var4));
   }

   private static Class3435 method30023(boolean var0) {
      Class8609 var3 = (var0x, var1, var2) -> !var0x.<Boolean>get(Class3435.field19202);
      return new Class3435(
         var0, AbstractBlock.Properties.method26609(Material.PISTON).method26623(1.5F).method26630(Blocks::method30019).method26631(var3).method26632(var3)
      );
   }

   private static Block register(String var0, Block var1) {
      return Registry.<Block>register(Registry.BLOCK, var0, var1);
   }

   public static void method30025() {
      Block.BLOCK_STATE_IDS.forEach(AbstractBlock.AbstractBlockState::method23382);
   }

   static {
      for (Block var7 : Registry.BLOCK) {
         UnmodifiableIterator var8 = var7.getStateContainer().getValidStates().iterator();

         while (var8.hasNext()) {
            BlockState var9 = (BlockState)var8.next();
            Block.BLOCK_STATE_IDS.add(var9);
         }

         var7.method11999();
      }
   }
}
