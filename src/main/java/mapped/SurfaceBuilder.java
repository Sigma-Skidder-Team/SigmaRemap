package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;

import java.util.Random;

public abstract class SurfaceBuilder<C extends ISurfaceBuilderConfig> {
   private static final BlockState field29487 = Blocks.DIRT.getDefaultState();
   private static final BlockState field29488 = Blocks.GRASS_BLOCK.getDefaultState();
   private static final BlockState field29489 = Blocks.PODZOL.getDefaultState();
   private static final BlockState field29490 = Blocks.GRAVEL.getDefaultState();
   private static final BlockState field29491 = Blocks.STONE.getDefaultState();
   private static final BlockState field29492 = Blocks.COARSE_DIRT.getDefaultState();
   private static final BlockState field29493 = Blocks.SAND.getDefaultState();
   private static final BlockState field29494 = Blocks.RED_SAND.getDefaultState();
   private static final BlockState field29495 = Blocks.WHITE_TERRACOTTA.getDefaultState();
   private static final BlockState field29496 = Blocks.MYCELIUM.getDefaultState();
   private static final BlockState field29497 = Blocks.SOUL_SAND.getDefaultState();
   private static final BlockState field29498 = Blocks.NETHERRACK.getDefaultState();
   private static final BlockState field29499 = Blocks.END_STONE.getDefaultState();
   private static final BlockState field29500 = Blocks.CRIMSON_NYLIUM.getDefaultState();
   private static final BlockState field29501 = Blocks.WARPED_NYLIUM.getDefaultState();
   private static final BlockState field29502 = Blocks.NETHER_WART_BLOCK.getDefaultState();
   private static final BlockState field29503 = Blocks.WARPED_WART_BLOCK.getDefaultState();
   private static final BlockState field29504 = Blocks.BLACKSTONE.getDefaultState();
   private static final BlockState field29505 = Blocks.BASALT.getDefaultState();
   private static final BlockState field29506 = Blocks.MAGMA_BLOCK.getDefaultState();
   public static final Class8278 field29507 = new Class8278(field29489, field29487, field29490);
   public static final Class8278 field29508 = new Class8278(field29490, field29490, field29490);
   public static final Class8278 field29509 = new Class8278(field29488, field29487, field29490);
   public static final Class8278 field29510 = new Class8278(field29491, field29491, field29490);
   public static final Class8278 field29511 = new Class8278(field29492, field29487, field29490);
   public static final Class8278 field29512 = new Class8278(field29493, field29493, field29490);
   public static final Class8278 field29513 = new Class8278(field29488, field29487, field29493);
   public static final Class8278 field29514 = new Class8278(field29493, field29493, field29493);
   public static final Class8278 field29515 = new Class8278(field29494, field29495, field29490);
   public static final Class8278 field29516 = new Class8278(field29496, field29487, field29490);
   public static final Class8278 field29517 = new Class8278(field29498, field29498, field29498);
   public static final Class8278 field29518 = new Class8278(field29497, field29497, field29497);
   public static final Class8278 field29519 = new Class8278(field29499, field29499, field29499);
   public static final Class8278 field29520 = new Class8278(field29500, field29498, field29502);
   public static final Class8278 field29521 = new Class8278(field29501, field29498, field29503);
   public static final Class8278 field29522 = new Class8278(field29504, field29505, field29506);
   public static final SurfaceBuilder<Class8278> field29523 = method20655("default", new Class6783(Class8278.field35569));
   public static final SurfaceBuilder<Class8278> field29524 = method20655("mountain", new Class6780(Class8278.field35569));
   public static final SurfaceBuilder<Class8278> field29525 = method20655("shattered_savanna", new Class6767(Class8278.field35569));
   public static final SurfaceBuilder<Class8278> field29526 = method20655("gravelly_mountain", new Class6776(Class8278.field35569));
   public static final SurfaceBuilder<Class8278> field29527 = method20655("giant_tree_taiga", new Class6769(Class8278.field35569));
   public static final SurfaceBuilder<Class8278> field29528 = method20655("swamp", new Class6770(Class8278.field35569));
   public static final SurfaceBuilder<Class8278> field29529 = method20655("badlands", new Class6773(Class8278.field35569));
   public static final SurfaceBuilder<Class8278> field29530 = method20655("wooded_badlands", new Class6775(Class8278.field35569));
   public static final SurfaceBuilder<Class8278> field29531 = method20655("eroded_badlands", new Class6774(Class8278.field35569));
   public static final SurfaceBuilder<Class8278> field29532 = method20655("frozen_ocean", new Class6771(Class8278.field35569));
   public static final SurfaceBuilder<Class8278> field29533 = method20655("nether", new Class6781(Class8278.field35569));
   public static final SurfaceBuilder<Class8278> field29534 = method20655("nether_forest", new Class6772(Class8278.field35569));
   public static final SurfaceBuilder<Class8278> field29535 = method20655("soul_sand_valley", new Class6778(Class8278.field35569));
   public static final SurfaceBuilder<Class8278> field29536 = method20655("basalt_deltas", new Class6779(Class8278.field35569));
   public static final SurfaceBuilder<Class8278> field29537 = method20655("nope", new Class6782(Class8278.field35569));
   private final Codec<ConfiguredSurfaceBuilder<C>> field29538;

   private static <C extends ISurfaceBuilderConfig, F extends SurfaceBuilder<C>> F method20655(String var0, F var1) {
      return Registry.<F>register(Registry.SURFACE_BUILDER, var0, (F)var1);
   }

   public SurfaceBuilder(Codec<C> var1) {
      this.field29538 = var1.fieldOf("config").xmap(this::method20657, ConfiguredSurfaceBuilder::getConfig).codec();
   }

   public Codec<ConfiguredSurfaceBuilder<C>> func_237202_d_() {
      return this.field29538;
   }

   public ConfiguredSurfaceBuilder<C> method20657(C var1) {
      return new ConfiguredSurfaceBuilder<C>(this, var1);
   }

   public abstract void buildSurface(
           Random var1, IChunk var2, Biome var3, int var4, int var5, int var6, double var7, BlockState var9, BlockState var10, int var11, long var12, C var14
   );

   public void method20658(long var1) {
   }
}
