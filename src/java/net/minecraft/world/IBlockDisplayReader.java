package net.minecraft.world;

import net.minecraft.world.lighting.WorldLightManager;
import net.minecraft.world.level.ColorResolver;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;

public interface IBlockDisplayReader extends IBlockReader {
   float method6877(Direction var1, boolean var2);

   WorldLightManager getLightManager();

   int getBlockColor(BlockPos var1, ColorResolver var2);

   default int getLightFor(LightType var1, BlockPos var2) {
      return this.getLightManager().getLightEngine(var1).method643(var2);
   }

   default int method7021(BlockPos var1, int var2) {
      return this.getLightManager().method640(var1, var2);
   }

   default boolean method7022(BlockPos var1) {
      return this.getLightFor(LightType.SKY, var1) >= this.getMaxLightLevel();
   }
}
