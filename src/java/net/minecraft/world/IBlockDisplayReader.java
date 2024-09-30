package net.minecraft.world;

import mapped.WorldLightManager;
import mapped.Class8980;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;

public interface IBlockDisplayReader extends IBlockReader {
   float method6877(Direction var1, boolean var2);

   WorldLightManager method6737();

   int method6878(BlockPos var1, Class8980 var2);

   default int getLightFor(LightType var1, BlockPos var2) {
      return this.method6737().getLightEngine(var1).method643(var2);
   }

   default int method7021(BlockPos var1, int var2) {
      return this.method6737().method640(var1, var2);
   }

   default boolean method7022(BlockPos var1) {
      return this.getLightFor(LightType.SKY, var1) >= this.getMaxLightLevel();
   }
}
