package net.minecraft.world.gen.feature;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import mapped.*;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockplacer.ColumnPlacer;
import net.minecraft.world.gen.blockplacer.DoublePlantPlacer;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.server.ServerWorld;

import java.util.OptionalInt;
import java.util.function.Supplier;

public class Features {
   public static final ConfiguredFeature<?, ?> field41633 = method33941(
      "end_spike", Class2898.field17962.method11216(new Class4707(false, ImmutableList.of(), (BlockPos)null))
   );
   public static final ConfiguredFeature<?, ?> field41634 = method33941(
      "end_gateway",
      Class2898.field17964.method11216(Class4701.method14745(ServerWorld.field9038, true)).method26510(Class6272.field27775.method19244(Class4716.field22361))
   );
   public static final ConfiguredFeature<?, ?> field41635 = method33941("end_gateway_delayed", Class2898.field17964.method11216(Class4701.method14746()));
   public static final ConfiguredFeature<?, ?> field41636 = method33941(
      "chorus_plant", Class2898.field17943.method11216(Class4698.field22290).method26510(Class9006.field41182).method26515(4)
   );
   public static final ConfiguredFeature<?, ?> field41637 = method33941("end_island", Class2898.field17963.method11216(Class4698.field22290));
   public static final ConfiguredFeature<?, ?> field41638 = method33941(
      "end_island_decorated", field41637.method26510(Class6272.field27778.method19244(Class4716.field22361))
   );
   public static final ConfiguredFeature<?, ?> field41639 = method33941(
      "delta",
      Class2898.field17978
         .method11216(new Class4738(Class7700.field33048, Class7700.field33067, Class8045.method27632(3, 4), Class8045.method27632(0, 2)))
         .method26510(Class6272.field27780.method19244(new Class4715(40)))
   );
   public static final ConfiguredFeature<?, ?> field41640 = method33941(
      "small_basalt_columns",
      Class2898.field17977
         .method11216(new Class4708(Class8045.method27631(1), Class8045.method27632(1, 3)))
         .method26510(Class6272.field27780.method19244(new Class4715(4)))
   );
   public static final ConfiguredFeature<?, ?> field41641 = method33941(
      "large_basalt_columns",
      Class2898.field17977
         .method11216(new Class4708(Class8045.method27632(2, 1), Class8045.method27632(5, 5)))
         .method26510(Class6272.field27780.method19244(new Class4715(2)))
   );
   public static final ConfiguredFeature<?, ?> field41642 = method33941(
      "basalt_blobs",
      Class2898.field17979
         .method11216(new Class4704(Class7700.field33033, Class7700.field33073, Class8045.method27632(3, 4)))
         .method26516(128)
         .method26517()
         .method26514(75)
   );
   public static final ConfiguredFeature<?, ?> field41643 = method33941(
      "blackstone_blobs",
      Class2898.field17979
         .method11216(new Class4704(Class7700.field33033, Class7700.field33071, Class8045.method27632(3, 4)))
         .method26516(128)
         .method26517()
         .method26514(25)
   );
   public static final ConfiguredFeature<?, ?> field41644 = method33941(
      "glowstone_extra", Class2898.field17951.method11216(Class4698.field22290).method26510(Class6272.field27774.method19244(new Class4715(10)))
   );
   public static final ConfiguredFeature<?, ?> field41645 = method33941(
      "glowstone", Class2898.field17951.method11216(Class4698.field22290).method26516(128).method26517().method26514(10)
   );
   public static final ConfiguredFeature<?, ?> field41646 = method33941(
      "crimson_forest_vegetation", Class2898.field17974.method11216(Class8529.field38322).method26510(Class6272.field27780.method19244(new Class4715(6)))
   );
   public static final ConfiguredFeature<?, ?> field41647 = method33941(
      "warped_forest_vegetation", Class2898.field17974.method11216(Class8529.field38323).method26510(Class6272.field27780.method19244(new Class4715(5)))
   );
   public static final ConfiguredFeature<?, ?> field41648 = method33941(
      "nether_sprouts", Class2898.field17974.method11216(Class8529.field38324).method26510(Class6272.field27780.method19244(new Class4715(4)))
   );
   public static final ConfiguredFeature<?, ?> field41649 = method33941(
      "twisting_vines", Class2898.field17976.method11216(Class4698.field22290).method26516(128).method26517().method26514(10)
   );
   public static final ConfiguredFeature<?, ?> field41650 = method33941(
      "weeping_vines", Class2898.field17975.method11216(Class4698.field22290).method26516(128).method26517().method26514(10)
   );
   public static final ConfiguredFeature<?, ?> field41651 = method33941(
      "basalt_pillar", Class2898.field17982.method11216(Class4698.field22290).method26516(128).method26517().method26514(10)
   );
   public static final ConfiguredFeature<?, ?> field41652 = method33941(
      "seagrass_cold", Class2898.field17965.method11216(new Class4728(0.3F)).method26514(32).method26510(Class9006.field41184)
   );
   public static final ConfiguredFeature<?, ?> field41653 = method33941(
      "seagrass_deep_cold", Class2898.field17965.method11216(new Class4728(0.8F)).method26514(40).method26510(Class9006.field41184)
   );
   public static final ConfiguredFeature<?, ?> field41654 = method33941(
      "seagrass_normal", Class2898.field17965.method11216(new Class4728(0.3F)).method26514(48).method26510(Class9006.field41184)
   );
   public static final ConfiguredFeature<?, ?> field41655 = method33941(
      "seagrass_river", Class2898.field17965.method11216(new Class4728(0.4F)).method26514(48).method26510(Class9006.field41184)
   );
   public static final ConfiguredFeature<?, ?> field41656 = method33941(
      "seagrass_deep", Class2898.field17965.method11216(new Class4728(0.8F)).method26514(48).method26510(Class9006.field41184)
   );
   public static final ConfiguredFeature<?, ?> field41657 = method33941(
      "seagrass_swamp", Class2898.field17965.method11216(new Class4728(0.6F)).method26514(64).method26510(Class9006.field41184)
   );
   public static final ConfiguredFeature<?, ?> field41658 = method33941(
      "seagrass_warm", Class2898.field17965.method11216(new Class4728(0.3F)).method26514(80).method26510(Class9006.field41184)
   );
   public static final ConfiguredFeature<?, ?> field41659 = method33941(
      "seagrass_deep_warm", Class2898.field17965.method11216(new Class4728(0.8F)).method26514(80).method26510(Class9006.field41184)
   );
   public static final ConfiguredFeature<?, ?> field41660 = method33941(
      "sea_pickle", Class2898.field17970.method11216(new Class4715(20)).method26510(Class9006.field41184).method26512(16)
   );
   public static final ConfiguredFeature<?, ?> field41661 = method33941(
      "ice_spike", Class2898.field17950.method11216(Class4698.field22290).method26510(Class9006.field41182).method26514(3)
   );
   public static final ConfiguredFeature<?, ?> field41662 = method33941(
      "ice_patch",
      Class2898.field17959
         .method11216(
            new Class4699(
               Class7700.field33021,
               Class8045.method27632(2, 1),
               1,
               ImmutableList.of(
                  Class7700.field33049,
                  Class7700.field33013,
                  Class7700.field32996,
                  Class7700.field32997,
                  Class7700.field32998,
                  Class7700.field32999,
                  Class7700.field33000
               )
            )
         )
         .method26510(Class9006.field41182)
         .method26514(2)
   );
   public static final ConfiguredFeature<?, ?> field41663 = method33941(
      "forest_rock", Class2898.field17957.method11216(new Class4705(Class7700.field33065)).method26510(Class9006.field41182).method26515(2)
   );
   public static final ConfiguredFeature<?, ?> field41664 = method33941(
      "seagrass_simple",
      Class2898.field17971
         .method11216(
            new Class4714(
               Class7700.field33066, ImmutableList.of(Class7700.field33060), ImmutableList.of(Class7700.field33047), ImmutableList.of(Class7700.field33047)
            )
         )
         .method26510(Class6272.field27768.method19244(new Class4724(GenerationStageCarving.field260, 0.1F)))
   );
   public static final ConfiguredFeature<?, ?> field41665 = method33941(
      "iceberg_packed",
      Class2898.field17956.method11216(new Class4705(Class7700.field33021)).method26510(Class6272.field27777.method19244(Class4718.field22368)).method26512(16)
   );
   public static final ConfiguredFeature<?, ?> field41666 = method33941(
      "iceberg_blue",
      Class2898.field17956
         .method11216(new Class4705(Class7700.field33022))
         .method26510(Class6272.field27777.method19244(Class4718.field22368))
         .method26512(200)
   );
   public static final ConfiguredFeature<?, ?> field41667 = method33941(
      "kelp_cold",
      Class2898.field17966
         .method11216(Class4698.field22290)
         .method26510(Class9006.field41176)
         .method26517()
         .method26510(Class6272.field27756.method19244(new Class4717(120, 80.0, 0.0)))
   );
   public static final ConfiguredFeature<?, ?> field41668 = method33941(
      "kelp_warm",
      Class2898.field17966
         .method11216(Class4698.field22290)
         .method26510(Class9006.field41176)
         .method26517()
         .method26510(Class6272.field27756.method19244(new Class4717(80, 80.0, 0.0)))
   );
   public static final ConfiguredFeature<?, ?> field41669 = method33941(
      "blue_ice",
      Class2898.field17955
         .method11216(Class4698.field22290)
         .method26510(Class6272.field27763.method19244(new Class4725(30, 32, 64)))
         .method26517()
         .method26515(19)
   );
   public static final ConfiguredFeature<?, ?> field41670 = method33941(
      "bamboo_light", Class2898.field17972.method11216(new Class4728(0.0F)).method26510(Class9006.field41183).method26514(16)
   );
   public static final ConfiguredFeature<?, ?> field41671 = method33941(
      "bamboo",
      Class2898.field17972
         .method11216(new Class4728(0.2F))
         .method26510(Class9006.field41177)
         .method26517()
         .method26510(Class6272.field27756.method19244(new Class4717(160, 80.0, 0.3)))
   );
   public static final ConfiguredFeature<?, ?> field41672 = method33941("vines", Class2898.field17953.method11216(Class4698.field22290).method26517().method26514(50));
   public static final ConfiguredFeature<?, ?> field41673 = method33941(
      "lake_water", Class2898.field17960.method11216(new Class4705(Class7700.field33047)).method26510(Class6272.field27773.method19244(new Class4722(4)))
   );
   public static final ConfiguredFeature<?, ?> field41674 = method33941(
      "lake_lava", Class2898.field17960.method11216(new Class4705(Class7700.field33048)).method26510(Class6272.field27772.method19244(new Class4722(80)))
   );
   public static final ConfiguredFeature<?, ?> field41675 = method33941(
      "disk_clay",
      Class2898.field17958
         .method11216(new Class4699(Class7700.field33064, Class8045.method27632(2, 1), 1, ImmutableList.of(Class7700.field33049, Class7700.field33064)))
         .method26510(Class9006.field41184)
   );
   public static final ConfiguredFeature<?, ?> field41676 = method33941(
      "disk_gravel",
      Class2898.field17958
         .method11216(new Class4699(Class7700.field33050, Class8045.method27632(2, 3), 2, ImmutableList.of(Class7700.field33049, Class7700.field33013)))
         .method26510(Class9006.field41184)
   );
   public static final ConfiguredFeature<?, ?> field41677 = method33941(
      "disk_sand",
      Class2898.field17958
         .method11216(new Class4699(Class7700.field33063, Class8045.method27632(2, 4), 2, ImmutableList.of(Class7700.field33049, Class7700.field33013)))
         .method26510(Class9006.field41184)
         .method26514(3)
   );
   public static final ConfiguredFeature<?, ?> field41678 = method33941("freeze_top_layer", Class2898.field17952.method11216(Class4698.field22290));
   public static final ConfiguredFeature<?, ?> BONUS_CHEST = method33941("bonus_chest", Class2898.field17981.method11216(Class4698.field22290));
   public static final ConfiguredFeature<?, ?> field41680 = method33941("void_start_platform", Class2898.field17945.method11216(Class4698.field22290));
   public static final ConfiguredFeature<?, ?> field41681 = method33941(
      "monster_room", Class2898.field17954.method11216(Class4698.field22290).method26516(256).method26517().method26514(8)
   );
   public static final ConfiguredFeature<?, ?> field41682 = method33941(
      "desert_well", Class2898.field17946.method11216(Class4698.field22290).method26510(Class9006.field41182).method26512(1000)
   );
   public static final ConfiguredFeature<?, ?> field41683 = method33941("fossil", Class2898.field17947.method11216(Class4698.field22290).method26512(64));
   public static final ConfiguredFeature<?, ?> field41684 = method33941(
      "spring_lava_double",
      Class2898.field17942
         .method11216(Class8529.field38320)
         .method26510(Class6272.field27765.method19244(new Class4725(8, 16, 256)))
         .method26517()
         .method26514(40)
   );
   public static final ConfiguredFeature<?, ?> field41685 = method33941(
      "spring_lava",
      Class2898.field17942
         .method11216(Class8529.field38320)
         .method26510(Class6272.field27765.method19244(new Class4725(8, 16, 256)))
         .method26517()
         .method26514(20)
   );
   public static final ConfiguredFeature<?, ?> field41686 = method33941(
      "spring_delta",
      Class2898.field17942
         .method11216(
            new Class4697(
               Class7700.field33046,
               true,
               4,
               1,
               ImmutableSet.of(Blocks.NETHERRACK, Blocks.SOUL_SAND, Blocks.GRAVEL, Blocks.MAGMA_BLOCK, Blocks.field37130)
            )
         )
         .method26510(Class9006.field41180)
         .method26517()
         .method26514(16)
   );
   public static final ConfiguredFeature<?, ?> field41687 = method33941(
      "spring_closed", Class2898.field17942.method11216(Class8529.field38321).method26510(Class9006.field41179).method26517().method26514(16)
   );
   public static final ConfiguredFeature<?, ?> field41688 = method33941(
      "spring_closed_double", Class2898.field17942.method11216(Class8529.field38321).method26510(Class9006.field41179).method26517().method26514(32)
   );
   public static final ConfiguredFeature<?, ?> field41689 = method33941(
      "spring_open",
      Class2898.field17942
         .method11216(new Class4697(Class7700.field33046, false, 4, 1, ImmutableSet.of(Blocks.NETHERRACK)))
         .method26510(Class9006.field41180)
         .method26517()
         .method26514(8)
   );
   public static final ConfiguredFeature<?, ?> field41690 = method33941(
      "spring_water",
      Class2898.field17942
         .method11216(
            new Class4697(
               Class7700.field33045, true, 4, 1, ImmutableSet.of(Blocks.STONE, Blocks.GRANITE, Blocks.DIORITE, Blocks.ANDESITE)
            )
         )
         .method26510(Class6272.field27764.method19244(new Class4725(8, 8, 256)))
         .method26517()
         .method26514(50)
   );
   public static final ConfiguredFeature<?, ?> field41691 = method33941(
      "pile_hay", Class2898.field17941.method11216(new Class4710(new Class6701(Blocks.HAY_BLOCK)))
   );
   public static final ConfiguredFeature<?, ?> field41692 = method33941(
      "pile_melon", Class2898.field17941.method11216(new Class4710(new Class6700(Class7700.field33028)))
   );
   public static final ConfiguredFeature<?, ?> field41693 = method33941(
      "pile_snow", Class2898.field17941.method11216(new Class4710(new Class6700(Class7700.field33037)))
   );
   public static final ConfiguredFeature<?, ?> field41694 = method33941(
      "pile_ice", Class2898.field17941.method11216(new Class4710(new Class6699().method20427(Class7700.field33022, 1).method20427(Class7700.field33021, 5)))
   );
   public static final ConfiguredFeature<?, ?> field41695 = method33941(
      "pile_pumpkin",
      Class2898.field17941.method11216(new Class4710(new Class6699().method20427(Class7700.field33029, 19).method20427(Class7700.field33038, 1)))
   );
   public static final ConfiguredFeature<?, ?> field41696 = method33941(
      "patch_fire",
      Class2898.field17940
         .method11216(
            new Class8326(new Class6700(Class7700.field33031), SimpleBlockPlacer.field27597)
               .method29191(64)
               .method29189(ImmutableSet.of(Class7700.field33033.getBlock()))
               .method29196()
               .method29198()
         )
         .method26510(Class9006.field41174)
   );
   public static final ConfiguredFeature<?, ?> field41697 = method33941(
      "patch_soul_fire",
      Class2898.field17940
         .method11216(
            new Class8326(new Class6700(Class7700.field33032), new SimpleBlockPlacer())
               .method29191(64)
               .method29189(ImmutableSet.of(Class7700.field33034.getBlock()))
               .method29196()
               .method29198()
         )
         .method26510(Class9006.field41174)
   );
   public static final ConfiguredFeature<?, ?> field41698 = method33941(
      "patch_brown_mushroom",
      Class2898.field17940.method11216(new Class8326(new Class6700(Class7700.field33019), SimpleBlockPlacer.field27597).method29191(64).method29196().method29198())
   );
   public static final ConfiguredFeature<?, ?> field41699 = method33941(
      "patch_red_mushroom",
      Class2898.field17940.method11216(new Class8326(new Class6700(Class7700.field33020), SimpleBlockPlacer.field27597).method29191(64).method29196().method29198())
   );
   public static final ConfiguredFeature<?, ?> field41700 = method33941(
      "patch_crimson_roots",
      Class2898.field17940
         .method11216(new Class8326(new Class6700(Class7700.field33035), new SimpleBlockPlacer()).method29191(64).method29196().method29198())
         .method26516(128)
   );
   public static final ConfiguredFeature<?, ?> field41701 = method33941(
      "patch_sunflower",
      Class2898.field17940
         .method11216(new Class8326(new Class6700(Class7700.field33039), new DoublePlantPlacer()).method29191(64).method29196().method29198())
         .method26510(Class9006.field41181)
         .method26510(Class9006.field41182)
         .method26514(10)
   );
   public static final ConfiguredFeature<?, ?> field41702 = method33941(
      "patch_pumpkin",
      Class2898.field17940
         .method11216(
            new Class8326(new Class6700(Class7700.field33029), SimpleBlockPlacer.field27597)
               .method29191(64)
               .method29189(ImmutableSet.of(Class7700.field33013.getBlock()))
               .method29196()
               .method29198()
         )
         .method26510(Class9006.field41183)
         .method26512(32)
   );
   public static final ConfiguredFeature<?, ?> field41703 = method33941("patch_taiga_grass", Class2898.field17940.method11216(Class8529.field38313));
   public static final ConfiguredFeature<?, ?> field41704 = method33941("patch_berry_bush", Class2898.field17940.method11216(Class8529.field38317));
   public static final ConfiguredFeature<?, ?> field41705 = method33941(
      "patch_grass_plain",
      Class2898.field17940
         .method11216(Class8529.field38312)
         .method26510(Class9006.field41183)
         .method26510(Class6272.field27755.method19244(new Class4719(-0.8, 5, 10)))
   );
   public static final ConfiguredFeature<?, ?> field41706 = method33941(
      "patch_grass_forest", Class2898.field17940.method11216(Class8529.field38312).method26510(Class9006.field41183).method26514(2)
   );
   public static final ConfiguredFeature<?, ?> field41707 = method33941(
      "patch_grass_badlands", Class2898.field17940.method11216(Class8529.field38312).method26510(Class9006.field41183)
   );
   public static final ConfiguredFeature<?, ?> field41708 = method33941(
      "patch_grass_savanna", Class2898.field17940.method11216(Class8529.field38312).method26510(Class9006.field41183).method26514(20)
   );
   public static final ConfiguredFeature<?, ?> field41709 = method33941(
      "patch_grass_normal", Class2898.field17940.method11216(Class8529.field38312).method26510(Class9006.field41183).method26514(5)
   );
   public static final ConfiguredFeature<?, ?> field41710 = method33941(
      "patch_grass_taiga_2", Class2898.field17940.method11216(Class8529.field38313).method26510(Class9006.field41183)
   );
   public static final ConfiguredFeature<?, ?> field41711 = method33941(
      "patch_grass_taiga", Class2898.field17940.method11216(Class8529.field38313).method26510(Class9006.field41183).method26514(7)
   );
   public static final ConfiguredFeature<?, ?> field41712 = method33941(
      "patch_grass_jungle", Class2898.field17940.method11216(Class8529.field38314).method26510(Class9006.field41183).method26514(25)
   );
   public static final ConfiguredFeature<?, ?> field41713 = method33941(
      "patch_dead_bush_2", Class2898.field17940.method11216(Class8529.field38316).method26510(Class9006.field41183).method26514(2)
   );
   public static final ConfiguredFeature<?, ?> field41714 = method33941(
      "patch_dead_bush", Class2898.field17940.method11216(Class8529.field38316).method26510(Class9006.field41183)
   );
   public static final ConfiguredFeature<?, ?> field41715 = method33941(
      "patch_dead_bush_badlands", Class2898.field17940.method11216(Class8529.field38316).method26510(Class9006.field41183).method26514(20)
   );
   public static final ConfiguredFeature<?, ?> field41716 = method33941(
      "patch_melon",
      Class2898.field17940
         .method11216(
            new Class8326(new Class6700(Class7700.field33028), SimpleBlockPlacer.field27597)
               .method29191(64)
               .method29189(ImmutableSet.of(Class7700.field33013.getBlock()))
               .method29195()
               .method29196()
               .method29198()
         )
         .method26510(Class9006.field41183)
   );
   public static final ConfiguredFeature<?, ?> field41717 = method33941("patch_berry_sparse", field41704.method26510(Class9006.field41183));
   public static final ConfiguredFeature<?, ?> field41718 = method33941("patch_berry_decorated", field41704.method26510(Class9006.field41183).method26512(12));
   public static final ConfiguredFeature<?, ?> field41719 = method33941(
      "patch_waterlilly",
      Class2898.field17940
         .method11216(new Class8326(new Class6700(Class7700.field33036), SimpleBlockPlacer.field27597).method29191(10).method29198())
         .method26510(Class9006.field41183)
         .method26514(4)
   );
   public static final ConfiguredFeature<?, ?> field41720 = method33941(
      "patch_tall_grass_2",
      Class2898.field17940
         .method11216(Class8529.field38318)
         .method26510(Class9006.field41181)
         .method26510(Class9006.field41175)
         .method26517()
         .method26510(Class6272.field27755.method19244(new Class4719(-0.8, 0, 7)))
   );
   public static final ConfiguredFeature<?, ?> field41721 = method33941(
      "patch_tall_grass",
      Class2898.field17940.method11216(Class8529.field38318).method26510(Class9006.field41181).method26510(Class9006.field41182).method26514(7)
   );
   public static final ConfiguredFeature<?, ?> field41722 = method33941(
      "patch_large_fern",
      Class2898.field17940
         .method11216(new Class8326(new Class6700(Class7700.field33014), new DoublePlantPlacer()).method29191(64).method29196().method29198())
         .method26510(Class9006.field41181)
         .method26510(Class9006.field41182)
         .method26514(7)
   );
   public static final ConfiguredFeature<?, ?> field41723 = method33941(
      "patch_cactus",
      Class2898.field17940.method11216(new Class8326(new Class6700(Class7700.field33040), new ColumnPlacer(1, 2)).method29191(10).method29196().method29198())
   );
   public static final ConfiguredFeature<?, ?> field41724 = method33941("patch_cactus_desert", field41723.method26510(Class9006.field41183).method26514(10));
   public static final ConfiguredFeature<?, ?> field41725 = method33941("patch_cactus_decorated", field41723.method26510(Class9006.field41183).method26514(5));
   public static final ConfiguredFeature<?, ?> field41726 = method33941(
      "patch_sugar_cane_swamp", Class2898.field17940.method11216(Class8529.field38319).method26510(Class9006.field41183).method26514(20)
   );
   public static final ConfiguredFeature<?, ?> field41727 = method33941(
      "patch_sugar_cane_desert", Class2898.field17940.method11216(Class8529.field38319).method26510(Class9006.field41183).method26514(60)
   );
   public static final ConfiguredFeature<?, ?> field41728 = method33941(
      "patch_sugar_cane_badlands", Class2898.field17940.method11216(Class8529.field38319).method26510(Class9006.field41183).method26514(13)
   );
   public static final ConfiguredFeature<?, ?> field41729 = method33941(
      "patch_sugar_cane", Class2898.field17940.method11216(Class8529.field38319).method26510(Class9006.field41183).method26514(10)
   );
   public static final ConfiguredFeature<?, ?> field41730 = method33941("brown_mushroom_nether", field41698.method26516(128).method26512(2));
   public static final ConfiguredFeature<?, ?> field41731 = method33941("red_mushroom_nether", field41699.method26516(128).method26512(2));
   public static final ConfiguredFeature<?, ?> field41732 = method33941("brown_mushroom_normal", field41698.method26510(Class9006.field41183).method26512(4));
   public static final ConfiguredFeature<?, ?> field41733 = method33941("red_mushroom_normal", field41699.method26510(Class9006.field41183).method26512(8));
   public static final ConfiguredFeature<?, ?> field41734 = method33941("brown_mushroom_taiga", field41698.method26512(4).method26510(Class9006.field41182));
   public static final ConfiguredFeature<?, ?> field41735 = method33941("red_mushroom_taiga", field41699.method26512(8).method26510(Class9006.field41183));
   public static final ConfiguredFeature<?, ?> field41736 = method33941("brown_mushroom_giant", field41734.method26514(3));
   public static final ConfiguredFeature<?, ?> field41737 = method33941("red_mushroom_giant", field41735.method26514(3));
   public static final ConfiguredFeature<?, ?> field41738 = method33941("brown_mushroom_swamp", field41734.method26514(8));
   public static final ConfiguredFeature<?, ?> field41739 = method33941("red_mushroom_swamp", field41735.method26514(8));
   public static final ConfiguredFeature<?, ?> field41740 = method33941(
      "ore_magma",
      Class2898.field17961
         .method11216(new Class4734(Class9622.field45001, Class7700.field33067, 33))
         .method26510(Class6272.field27770.method19244(Class4718.field22368))
         .method26517()
         .method26514(4)
   );
   public static final ConfiguredFeature<?, ?> field41741 = method33941(
      "ore_soul_sand",
      Class2898.field17961.method11216(new Class4734(Class9622.field45001, Class7700.field33068, 12)).method26516(32).method26517().method26514(12)
   );
   public static final ConfiguredFeature<?, ?> field41742 = method33941(
      "ore_gold_deltas",
      Class2898.field17961
         .method11216(new Class4734(Class9622.field45001, Class7700.field33069, 10))
         .method26510(Class9006.field41179)
         .method26517()
         .method26514(20)
   );
   public static final ConfiguredFeature<?, ?> field41743 = method33941(
      "ore_quartz_deltas",
      Class2898.field17961
         .method11216(new Class4734(Class9622.field45001, Class7700.field33070, 14))
         .method26510(Class9006.field41179)
         .method26517()
         .method26514(32)
   );
   public static final ConfiguredFeature<?, ?> field41744 = method33941(
      "ore_gold_nether",
      Class2898.field17961
         .method11216(new Class4734(Class9622.field45001, Class7700.field33069, 10))
         .method26510(Class9006.field41179)
         .method26517()
         .method26514(10)
   );
   public static final ConfiguredFeature<?, ?> field41745 = method33941(
      "ore_quartz_nether",
      Class2898.field17961
         .method11216(new Class4734(Class9622.field45001, Class7700.field33070, 14))
         .method26510(Class9006.field41179)
         .method26517()
         .method26514(16)
   );
   public static final ConfiguredFeature<?, ?> field41746 = method33941(
      "ore_gravel_nether",
      Class2898.field17961
         .method11216(new Class4734(Class9622.field45001, Class7700.field33050, 33))
         .method26510(Class6272.field27763.method19244(new Class4725(5, 0, 37)))
         .method26517()
         .method26514(2)
   );
   public static final ConfiguredFeature<?, ?> field41747 = method33941(
      "ore_blackstone",
      Class2898.field17961
         .method11216(new Class4734(Class9622.field45001, Class7700.field33071, 33))
         .method26510(Class6272.field27763.method19244(new Class4725(5, 10, 37)))
         .method26517()
         .method26514(2)
   );
   public static final ConfiguredFeature<?, ?> field41748 = method33941(
      "ore_dirt",
      Class2898.field17961.method11216(new Class4734(Class9622.field45000, Class7700.field33049, 33)).method26516(256).method26517().method26514(10)
   );
   public static final ConfiguredFeature<?, ?> field41749 = method33941(
      "ore_gravel",
      Class2898.field17961.method11216(new Class4734(Class9622.field45000, Class7700.field33050, 33)).method26516(256).method26517().method26514(8)
   );
   public static final ConfiguredFeature<?, ?> field41750 = method33941(
      "ore_granite",
      Class2898.field17961.method11216(new Class4734(Class9622.field45000, Class7700.field33051, 33)).method26516(80).method26517().method26514(10)
   );
   public static final ConfiguredFeature<?, ?> field41751 = method33941(
      "ore_diorite",
      Class2898.field17961.method11216(new Class4734(Class9622.field45000, Class7700.field33052, 33)).method26516(80).method26517().method26514(10)
   );
   public static final ConfiguredFeature<?, ?> field41752 = method33941(
      "ore_andesite",
      Class2898.field17961.method11216(new Class4734(Class9622.field45000, Class7700.field33053, 33)).method26516(80).method26517().method26514(10)
   );
   public static final ConfiguredFeature<?, ?> field41753 = method33941(
      "ore_coal",
      Class2898.field17961.method11216(new Class4734(Class9622.field45000, Class7700.field33054, 17)).method26516(128).method26517().method26514(20)
   );
   public static final ConfiguredFeature<?, ?> field41754 = method33941(
      "ore_iron", Class2898.field17961.method11216(new Class4734(Class9622.field45000, Class7700.field33055, 9)).method26516(64).method26517().method26514(20)
   );
   public static final ConfiguredFeature<?, ?> field41755 = method33941(
      "ore_gold_extra",
      Class2898.field17961
         .method11216(new Class4734(Class9622.field45000, Class7700.field33056, 9))
         .method26510(Class6272.field27763.method19244(new Class4725(32, 32, 80)))
         .method26517()
         .method26514(20)
   );
   public static final ConfiguredFeature<?, ?> field41756 = method33941(
      "ore_gold", Class2898.field17961.method11216(new Class4734(Class9622.field45000, Class7700.field33056, 9)).method26516(32).method26517().method26514(2)
   );
   public static final ConfiguredFeature<?, ?> field41757 = method33941(
      "ore_redstone",
      Class2898.field17961.method11216(new Class4734(Class9622.field45000, Class7700.field33057, 8)).method26516(16).method26517().method26514(8)
   );
   public static final ConfiguredFeature<?, ?> field41758 = method33941(
      "ore_diamond", Class2898.field17961.method11216(new Class4734(Class9622.field45000, Class7700.field33058, 8)).method26516(16).method26517()
   );
   public static final ConfiguredFeature<?, ?> field41759 = method33941(
      "ore_lapis",
      Class2898.field17961
         .method11216(new Class4734(Class9622.field45000, Class7700.field33059, 7))
         .method26510(Class6272.field27766.method19244(new Class4723(16, 16)))
         .method26517()
   );
   public static final ConfiguredFeature<?, ?> field41760 = method33941(
      "ore_infested",
      Class2898.field17961.method11216(new Class4734(Class9622.field45000, Class7700.field33062, 9)).method26516(64).method26517().method26514(7)
   );
   public static final ConfiguredFeature<?, ?> field41761 = method33941(
      "ore_emerald",
      Class2898.field17944
         .method11216(new Class4731(Class7700.field33060, Class7700.field33061))
         .method26510(Class6272.field27771.method19244(Class4716.field22361))
   );
   public static final ConfiguredFeature<?, ?> field41762 = method33941(
      "ore_debris_large",
      Class2898.field17983
         .method11216(new Class4734(Class9622.field45002, Class7700.field33072, 3))
         .method26510(Class6272.field27766.method19244(new Class4723(16, 8)))
         .method26517()
   );
   public static final ConfiguredFeature<?, ?> field41763 = method33941(
      "ore_debris_small",
      Class2898.field17983
         .method11216(new Class4734(Class9622.field45002, Class7700.field33072, 2))
         .method26510(Class6272.field27763.method19244(new Class4725(8, 16, 128)))
         .method26517()
   );
   public static final ConfiguredFeature<?, ?> field41764 = method33941(
      "crimson_fungi", Class2898.field17973.method11216(Class4709.field22334).method26510(Class6272.field27780.method19244(new Class4715(8)))
   );
   public static final ConfiguredFeature<Class4709, ?> field41765 = method33941("crimson_fungi_planted", Class2898.field17973.method11216(Class4709.field22333));
   public static final ConfiguredFeature<?, ?> field41766 = method33941(
      "warped_fungi", Class2898.field17973.method11216(Class4709.field22336).method26510(Class6272.field27780.method19244(new Class4715(8)))
   );
   public static final ConfiguredFeature<Class4709, ?> field41767 = method33941("warped_fungi_planted", Class2898.field17973.method11216(Class4709.field22335));
   public static final ConfiguredFeature<?, ?> field41768 = method33941(
      "huge_brown_mushroom", Class2898.field17949.method11216(new Class4727(new Class6700(Class7700.field33043), new Class6700(Class7700.field33044), 3))
   );
   public static final ConfiguredFeature<?, ?> field41769 = method33941(
      "huge_red_mushroom", Class2898.field17948.method11216(new Class4727(new Class6700(Class7700.field33042), new Class6700(Class7700.field33044), 2))
   );
   public static final ConfiguredFeature<Class4733, ?> field41770 = method33941(
      "oak",
      Class2898.field17937
         .method11216(
            new Class8443(
                  new Class6700(Class7700.field33001),
                  new Class6700(Class7700.field33002),
                  new Class6824(Class8045.method27631(2), Class8045.method27631(0), 3),
                  new Class6897(4, 2, 0),
                  new Class7616(1, 0, 1)
               )
               .method29692()
               .method29694()
         )
   );
   public static final ConfiguredFeature<Class4733, ?> field41771 = method33941(
      "dark_oak",
      Class2898.field17937
         .method11216(
            new Class8443(
                  new Class6700(Class7700.field33011),
                  new Class6700(Class7700.field33012),
                  new Class6823(Class8045.method27631(0), Class8045.method27631(0)),
                  new Class6901(6, 2, 1),
                  new Class7618(1, 1, 0, 1, 2, OptionalInt.empty())
               )
               .method29691(Integer.MAX_VALUE)
               .method29693(Heightmap.Type.MOTION_BLOCKING)
               .method29692()
               .method29694()
         )
   );
   public static final ConfiguredFeature<Class4733, ?> field41772 = method33941(
      "birch",
      Class2898.field17937
         .method11216(
            new Class8443(
                  new Class6700(Class7700.field33009),
                  new Class6700(Class7700.field33010),
                  new Class6824(Class8045.method27631(2), Class8045.method27631(0), 3),
                  new Class6897(5, 2, 0),
                  new Class7616(1, 0, 1)
               )
               .method29692()
               .method29694()
         )
   );
   public static final ConfiguredFeature<Class4733, ?> field41773 = method33941(
      "acacia",
      Class2898.field17937
         .method11216(
            new Class8443(
                  new Class6700(Class7700.field33007),
                  new Class6700(Class7700.field33008),
                  new Class6821(Class8045.method27631(2), Class8045.method27631(0)),
                  new Class6902(5, 2, 2),
                  new Class7616(1, 0, 2)
               )
               .method29692()
               .method29694()
         )
   );
   public static final ConfiguredFeature<Class4733, ?> field41774 = method33941(
      "spruce",
      Class2898.field17937
         .method11216(
            new Class8443(
                  new Class6700(Class7700.field33005),
                  new Class6700(Class7700.field33006),
                  new Class6820(Class8045.method27632(2, 1), Class8045.method27632(0, 2), Class8045.method27632(1, 1)),
                  new Class6897(5, 2, 1),
                  new Class7616(2, 0, 2)
               )
               .method29692()
               .method29694()
         )
   );
   public static final ConfiguredFeature<Class4733, ?> field41775 = method33941(
      "pine",
      Class2898.field17937
         .method11216(
            new Class8443(
                  new Class6700(Class7700.field33005),
                  new Class6700(Class7700.field33006),
                  new Class6818(Class8045.method27631(1), Class8045.method27631(1), Class8045.method27632(3, 1)),
                  new Class6897(6, 4, 0),
                  new Class7616(2, 0, 2)
               )
               .method29692()
               .method29694()
         )
   );
   public static final ConfiguredFeature<Class4733, ?> field41776 = method33941(
      "jungle_tree",
      Class2898.field17937
         .method11216(
            new Class8443(
                  new Class6700(Class7700.field33003),
                  new Class6700(Class7700.field33004),
                  new Class6824(Class8045.method27631(2), Class8045.method27631(0), 3),
                  new Class6897(4, 8, 0),
                  new Class7616(1, 0, 1)
               )
               .method29690(ImmutableList.of(new Class7138(0.2F), Class7143.field30706, Class7140.field30699))
               .method29692()
               .method29694()
         )
   );
   public static final ConfiguredFeature<Class4733, ?> field41777 = method33941(
      "fancy_oak",
      Class2898.field17937
         .method11216(
            new Class8443(
                  new Class6700(Class7700.field33001),
                  new Class6700(Class7700.field33002),
                  new Class6825(Class8045.method27631(2), Class8045.method27631(4), 4),
                  new Class6898(3, 11, 0),
                  new Class7616(0, 0, 0, OptionalInt.of(4))
               )
               .method29692()
               .method29693(Heightmap.Type.MOTION_BLOCKING)
               .method29694()
         )
   );
   public static final ConfiguredFeature<Class4733, ?> field41778 = method33941(
      "jungle_tree_no_vine",
      Class2898.field17937
         .method11216(
            new Class8443(
                  new Class6700(Class7700.field33003),
                  new Class6700(Class7700.field33004),
                  new Class6824(Class8045.method27631(2), Class8045.method27631(0), 3),
                  new Class6897(4, 8, 0),
                  new Class7616(1, 0, 1)
               )
               .method29692()
               .method29694()
         )
   );
   public static final ConfiguredFeature<Class4733, ?> field41779 = method33941(
      "mega_jungle_tree",
      Class2898.field17937
         .method11216(
            new Class8443(
                  new Class6700(Class7700.field33003),
                  new Class6700(Class7700.field33004),
                  new Class6827(Class8045.method27631(2), Class8045.method27631(0), 2),
                  new Class6900(10, 2, 19),
                  new Class7616(1, 1, 2)
               )
               .method29690(ImmutableList.of(Class7143.field30706, Class7140.field30699))
               .method29694()
         )
   );
   public static final ConfiguredFeature<Class4733, ?> field41780 = method33941(
      "mega_spruce",
      Class2898.field17937
         .method11216(
            new Class8443(
                  new Class6700(Class7700.field33005),
                  new Class6700(Class7700.field33006),
                  new Class6822(Class8045.method27631(0), Class8045.method27631(0), Class8045.method27632(13, 4)),
                  new Class6899(13, 2, 14),
                  new Class7616(1, 1, 2)
               )
               .method29690(ImmutableList.of(new Class7142(new Class6700(Class7700.field32996))))
               .method29694()
         )
   );
   public static final ConfiguredFeature<Class4733, ?> field41781 = method33941(
      "mega_pine",
      Class2898.field17937
         .method11216(
            new Class8443(
                  new Class6700(Class7700.field33005),
                  new Class6700(Class7700.field33006),
                  new Class6822(Class8045.method27631(0), Class8045.method27631(0), Class8045.method27632(3, 4)),
                  new Class6899(13, 2, 14),
                  new Class7616(1, 1, 2)
               )
               .method29690(ImmutableList.of(new Class7142(new Class6700(Class7700.field32996))))
               .method29694()
         )
   );
   public static final ConfiguredFeature<Class4733, ?> field41782 = method33941(
      "super_birch_bees_0002",
      Class2898.field17937
         .method11216(
            new Class8443(
                  new Class6700(Class7700.field33009),
                  new Class6700(Class7700.field33010),
                  new Class6824(Class8045.method27631(2), Class8045.method27631(0), 3),
                  new Class6897(5, 2, 6),
                  new Class7616(1, 0, 1)
               )
               .method29692()
               .method29690(ImmutableList.of(Class9006.field41171))
               .method29694()
         )
   );
   public static final ConfiguredFeature<?, ?> field41783 = method33941(
      "swamp_tree",
      Class2898.field17937
         .method11216(
            new Class8443(
                  new Class6700(Class7700.field33001),
                  new Class6700(Class7700.field33002),
                  new Class6824(Class8045.method27631(3), Class8045.method27631(0), 3),
                  new Class6897(5, 3, 0),
                  new Class7616(1, 0, 1)
               )
               .method29691(1)
               .method29690(ImmutableList.of(Class7140.field30699))
               .method29694()
         )
         .method26510(Class9006.field41182)
         .method26510(Class6272.field27757.method19244(new Class4721(2, 0.1F, 1)))
   );
   public static final ConfiguredFeature<?, ?> field41784 = method33941(
      "jungle_bush",
      Class2898.field17937
         .method11216(
            new Class8443(
                  new Class6700(Class7700.field33003),
                  new Class6700(Class7700.field33002),
                  new Class6826(Class8045.method27631(2), Class8045.method27631(1), 2),
                  new Class6897(1, 0, 0),
                  new Class7616(0, 0, 0)
               )
               .method29693(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES)
               .method29694()
         )
   );
   public static final ConfiguredFeature<Class4733, ?> field41785 = method33941(
      "oak_bees_0002", Class2898.field17937.method11216(field41770.method26519().method14850(ImmutableList.of(Class9006.field41171)))
   );
   public static final ConfiguredFeature<Class4733, ?> field41786 = method33941(
      "oak_bees_002", Class2898.field17937.method11216(field41770.method26519().method14850(ImmutableList.of(Class9006.field41172)))
   );
   public static final ConfiguredFeature<Class4733, ?> field41787 = method33941(
      "oak_bees_005", Class2898.field17937.method11216(field41770.method26519().method14850(ImmutableList.of(Class9006.field41173)))
   );
   public static final ConfiguredFeature<Class4733, ?> field41788 = method33941(
      "birch_bees_0002", Class2898.field17937.method11216(field41772.method26519().method14850(ImmutableList.of(Class9006.field41171)))
   );
   public static final ConfiguredFeature<Class4733, ?> field41789 = method33941(
      "birch_bees_002", Class2898.field17937.method11216(field41772.method26519().method14850(ImmutableList.of(Class9006.field41172)))
   );
   public static final ConfiguredFeature<Class4733, ?> field41790 = method33941(
      "birch_bees_005", Class2898.field17937.method11216(field41772.method26519().method14850(ImmutableList.of(Class9006.field41173)))
   );
   public static final ConfiguredFeature<Class4733, ?> field41791 = method33941(
      "fancy_oak_bees_0002", Class2898.field17937.method11216(field41777.method26519().method14850(ImmutableList.of(Class9006.field41171)))
   );
   public static final ConfiguredFeature<Class4733, ?> field41792 = method33941(
      "fancy_oak_bees_002", Class2898.field17937.method11216(field41777.method26519().method14850(ImmutableList.of(Class9006.field41172)))
   );
   public static final ConfiguredFeature<Class4733, ?> field41793 = method33941(
      "fancy_oak_bees_005", Class2898.field17937.method11216(field41777.method26519().method14850(ImmutableList.of(Class9006.field41173)))
   );
   public static final ConfiguredFeature<?, ?> field41794 = method33941(
      "oak_badlands", field41770.method26510(Class9006.field41182).method26510(Class6272.field27757.method19244(new Class4721(5, 0.1F, 1)))
   );
   public static final ConfiguredFeature<?, ?> field41795 = method33941(
      "spruce_snowy", field41774.method26510(Class9006.field41182).method26510(Class6272.field27757.method19244(new Class4721(0, 0.1F, 1)))
   );
   public static final ConfiguredFeature<?, ?> field41796 = method33941(
      "flower_warm", Class2898.field17938.method11216(Class8529.field38315).method26510(Class9006.field41181).method26510(Class9006.field41182).method26514(4)
   );
   public static final ConfiguredFeature<?, ?> field41797 = method33941(
      "flower_default",
      Class2898.field17938.method11216(Class8529.field38315).method26510(Class9006.field41181).method26510(Class9006.field41182).method26514(2)
   );
   public static final ConfiguredFeature<?, ?> field41798 = method33941(
      "flower_forest",
      Class2898.field17938
         .method11216(new Class8326(Class6702.field29340, SimpleBlockPlacer.field27597).method29191(64).method29198())
         .method26510(Class9006.field41181)
         .method26510(Class9006.field41182)
         .method26514(100)
   );
   public static final ConfiguredFeature<?, ?> field41799 = method33941(
      "flower_swamp",
      Class2898.field17938
         .method11216(new Class8326(new Class6700(Class7700.field33024), SimpleBlockPlacer.field27597).method29191(64).method29198())
         .method26510(Class9006.field41181)
         .method26510(Class9006.field41182)
   );
   public static final ConfiguredFeature<?, ?> field41800 = method33941(
      "flower_plain", Class2898.field17938.method11216(new Class8326(Class6697.field29327, SimpleBlockPlacer.field27597).method29191(64).method29198())
   );
   public static final ConfiguredFeature<?, ?> field41801 = method33941(
      "flower_plain_decorated",
      field41800.method26510(Class9006.field41181)
         .method26510(Class9006.field41175)
         .method26517()
         .method26510(Class6272.field27755.method19244(new Class4719(-0.8, 15, 4)))
   );
   private static final ImmutableList<Supplier<ConfiguredFeature<?, ?>>> field41802 = ImmutableList.of(
      (Supplier<ConfiguredFeature<?, ?>>)() -> Class2898.field17940
            .method11216(new Class8326(new Class6700(Class7700.field33016), new DoublePlantPlacer()).method29191(64).method29196().method29198()),
      (Supplier<ConfiguredFeature<?, ?>>)() -> Class2898.field17940
            .method11216(new Class8326(new Class6700(Class7700.field33017), new DoublePlantPlacer()).method29191(64).method29196().method29198()),
      (Supplier<ConfiguredFeature<?, ?>>)() -> Class2898.field17940
            .method11216(new Class8326(new Class6700(Class7700.field33018), new DoublePlantPlacer()).method29191(64).method29196().method29198()),
      (Supplier<ConfiguredFeature<?, ?>>)() -> Class2898.field17939
            .method11216(new Class8326(new Class6700(Class7700.field33023), SimpleBlockPlacer.field27597).method29191(64).method29198())
   );
   public static final ConfiguredFeature<?, ?> field41803 = method33941(
      "forest_flower_vegetation_common",
      Class2898.field17985
         .method11216(new Class4706(field41802))
         .method26513(Class8045.method27632(-1, 4))
         .method26510(Class9006.field41181)
         .method26510(Class9006.field41182)
         .method26514(5)
   );
   public static final ConfiguredFeature<?, ?> field41804 = method33941(
      "forest_flower_vegetation",
      Class2898.field17985
         .method11216(new Class4706(field41802))
         .method26513(Class8045.method27632(-3, 4))
         .method26510(Class9006.field41181)
         .method26510(Class9006.field41182)
         .method26514(5)
   );
   public static final ConfiguredFeature<?, ?> field41805 = method33941(
      "dark_forest_vegetation_brown",
      Class2898.field17984
         .method11216(
            new Class4736(
               ImmutableList.of(
                  field41768.method26520(0.025F),
                  field41769.method26520(0.05F),
                  field41771.method26520(0.6666667F),
                  field41772.method26520(0.2F),
                  field41777.method26520(0.1F)
               ),
               field41770
            )
         )
         .method26510(Class6272.field27776.method19244(Class4716.field22361))
   );
   public static final ConfiguredFeature<?, ?> field41806 = method33941(
      "dark_forest_vegetation_red",
      Class2898.field17984
         .method11216(
            new Class4736(
               ImmutableList.of(
                  field41769.method26520(0.025F),
                  field41768.method26520(0.05F),
                  field41771.method26520(0.6666667F),
                  field41772.method26520(0.2F),
                  field41777.method26520(0.1F)
               ),
               field41770
            )
         )
         .method26510(Class6272.field27776.method19244(Class4716.field22361))
   );
   public static final ConfiguredFeature<?, ?> field41807 = method33941(
      "warm_ocean_vegetation",
      Class2898.field17985
         .method11216(
            new Class4706(
               ImmutableList.of(
                  (Supplier<ConfiguredFeature<?, ?>>)() -> Class2898.field17967.method11216(Class4698.field22290),
                  (Supplier<ConfiguredFeature<?, ?>>)() -> Class2898.field17969.method11216(Class4698.field22290),
                  (Supplier<ConfiguredFeature<?, ?>>)() -> Class2898.field17968.method11216(Class4698.field22290)
               )
            )
         )
         .method26510(Class9006.field41176)
         .method26517()
         .method26510(Class6272.field27756.method19244(new Class4717(20, 400.0, 0.0)))
   );
   public static final ConfiguredFeature<?, ?> field41808 = method33941(
      "forest_flower_trees",
      Class2898.field17984
         .method11216(new Class4736(ImmutableList.of(field41789.method26520(0.2F), field41792.method26520(0.1F)), field41786))
         .method26510(Class9006.field41182)
         .method26510(Class6272.field27757.method19244(new Class4721(6, 0.1F, 1)))
   );
   public static final ConfiguredFeature<?, ?> field41809 = method33941(
      "taiga_vegetation",
      Class2898.field17984
         .method11216(new Class4736(ImmutableList.of(field41775.method26520(0.33333334F)), field41774))
         .method26510(Class9006.field41182)
         .method26510(Class6272.field27757.method19244(new Class4721(10, 0.1F, 1)))
   );
   public static final ConfiguredFeature<?, ?> field41810 = method33941(
      "trees_shattered_savanna",
      Class2898.field17984
         .method11216(new Class4736(ImmutableList.of(field41773.method26520(0.8F)), field41770))
         .method26510(Class9006.field41182)
         .method26510(Class6272.field27757.method19244(new Class4721(2, 0.1F, 1)))
   );
   public static final ConfiguredFeature<?, ?> field41811 = method33941(
      "trees_savanna",
      Class2898.field17984
         .method11216(new Class4736(ImmutableList.of(field41773.method26520(0.8F)), field41770))
         .method26510(Class9006.field41182)
         .method26510(Class6272.field27757.method19244(new Class4721(1, 0.1F, 1)))
   );
   public static final ConfiguredFeature<?, ?> field41812 = method33941(
      "birch_tall",
      Class2898.field17984
         .method11216(new Class4736(ImmutableList.of(field41782.method26520(0.5F)), field41788))
         .method26510(Class9006.field41182)
         .method26510(Class6272.field27757.method19244(new Class4721(10, 0.1F, 1)))
   );
   public static final ConfiguredFeature<?, ?> field41813 = method33941(
      "trees_birch", field41788.method26510(Class9006.field41182).method26510(Class6272.field27757.method19244(new Class4721(10, 0.1F, 1)))
   );
   public static final ConfiguredFeature<?, ?> field41814 = method33941(
      "trees_mountain_edge",
      Class2898.field17984
         .method11216(new Class4736(ImmutableList.of(field41774.method26520(0.666F), field41777.method26520(0.1F)), field41770))
         .method26510(Class9006.field41182)
         .method26510(Class6272.field27757.method19244(new Class4721(3, 0.1F, 1)))
   );
   public static final ConfiguredFeature<?, ?> field41815 = method33941(
      "trees_mountain",
      Class2898.field17984
         .method11216(new Class4736(ImmutableList.of(field41774.method26520(0.666F), field41777.method26520(0.1F)), field41770))
         .method26510(Class9006.field41182)
         .method26510(Class6272.field27757.method19244(new Class4721(0, 0.1F, 1)))
   );
   public static final ConfiguredFeature<?, ?> field41816 = method33941(
      "trees_water",
      Class2898.field17984
         .method11216(new Class4736(ImmutableList.of(field41777.method26520(0.1F)), field41770))
         .method26510(Class9006.field41182)
         .method26510(Class6272.field27757.method19244(new Class4721(0, 0.1F, 1)))
   );
   public static final ConfiguredFeature<?, ?> field41817 = method33941(
      "birch_other",
      Class2898.field17984
         .method11216(new Class4736(ImmutableList.of(field41788.method26520(0.2F), field41791.method26520(0.1F)), field41785))
         .method26510(Class9006.field41182)
         .method26510(Class6272.field27757.method19244(new Class4721(10, 0.1F, 1)))
   );
   public static final ConfiguredFeature<?, ?> field41818 = method33941(
      "plain_vegetation",
      Class2898.field17984
         .method11216(new Class4736(ImmutableList.of(field41793.method26520(0.33333334F)), field41787))
         .method26510(Class9006.field41182)
         .method26510(Class6272.field27757.method19244(new Class4721(0, 0.05F, 1)))
   );
   public static final ConfiguredFeature<?, ?> field41819 = method33941(
      "trees_jungle_edge",
      Class2898.field17984
         .method11216(new Class4736(ImmutableList.of(field41777.method26520(0.1F), field41784.method26520(0.5F)), field41776))
         .method26510(Class9006.field41182)
         .method26510(Class6272.field27757.method19244(new Class4721(2, 0.1F, 1)))
   );
   public static final ConfiguredFeature<?, ?> field41820 = method33941(
      "trees_giant_spruce",
      Class2898.field17984
         .method11216(new Class4736(ImmutableList.of(field41780.method26520(0.33333334F), field41775.method26520(0.33333334F)), field41774))
         .method26510(Class9006.field41182)
         .method26510(Class6272.field27757.method19244(new Class4721(10, 0.1F, 1)))
   );
   public static final ConfiguredFeature<?, ?> field41821 = method33941(
      "trees_giant",
      Class2898.field17984
         .method11216(
            new Class4736(
               ImmutableList.of(field41780.method26520(0.025641026F), field41781.method26520(0.30769232F), field41775.method26520(0.33333334F)), field41774
            )
         )
         .method26510(Class9006.field41182)
         .method26510(Class6272.field27757.method19244(new Class4721(10, 0.1F, 1)))
   );
   public static final ConfiguredFeature<?, ?> field41822 = method33941(
      "trees_jungle",
      Class2898.field17984
         .method11216(
            new Class4736(ImmutableList.of(field41777.method26520(0.1F), field41784.method26520(0.5F), field41779.method26520(0.33333334F)), field41776)
         )
         .method26510(Class9006.field41182)
         .method26510(Class6272.field27757.method19244(new Class4721(50, 0.1F, 1)))
   );
   public static final ConfiguredFeature<?, ?> field41823 = method33941(
      "bamboo_vegetation",
      Class2898.field17984
         .method11216(
            new Class4736(
               ImmutableList.of(field41777.method26520(0.05F), field41784.method26520(0.15F), field41779.method26520(0.7F)),
               Class2898.field17940.method11216(Class8529.field38314)
            )
         )
         .method26510(Class9006.field41182)
         .method26510(Class6272.field27757.method19244(new Class4721(30, 0.1F, 1)))
   );
   public static final ConfiguredFeature<?, ?> field41824 = method33941(
      "mushroom_field_vegetation", Class2898.field17986.method11216(new Class4702(() -> field41769, () -> field41768)).method26510(Class9006.field41182)
   );

   private static <FC extends Class4698> ConfiguredFeature<FC, ?> method33941(String var0, ConfiguredFeature<FC, ?> var1) {
      return Registry.<ConfiguredFeature<FC, ?>>register(WorldGenRegistries.field29426, var0, var1);
   }
}
