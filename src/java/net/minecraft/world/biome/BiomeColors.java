package net.minecraft.world.biome;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.world.level.ColorResolver;

public class BiomeColors {
   public static final ColorResolver GRASS_COLOR = Biome::getGrassColor;
   public static final ColorResolver FOLIAGE_COLOR = (biome, x, z) -> biome.getFoliageColor();
   public static final ColorResolver WATER_COLOR = (biome, x, z) -> biome.getWaterColor();

   private static int getBlockColor(IBlockDisplayReader var0, BlockPos var1, ColorResolver var2) {
      return var0.getBlockColor(var1, var2);
   }

   public static int getGrassColor(IBlockDisplayReader var0, BlockPos var1) {
      return getBlockColor(var0, var1, GRASS_COLOR);
   }

   public static int getFoliageColor(IBlockDisplayReader var0, BlockPos var1) {
      return getBlockColor(var0, var1, FOLIAGE_COLOR);
   }

   public static int getWaterColor(IBlockDisplayReader var0, BlockPos var1) {
      return getBlockColor(var0, var1, WATER_COLOR);
   }
}
