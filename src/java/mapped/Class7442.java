package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.world.biome.Biome;

public final class Class7442 implements Class7443 {
   private static String[] field32017;

   @Override
   public int method24053(BlockState var1, IBlockDisplayReader var2, BlockPos var3) {
      Biome var6 = Class9680.method37851(var2, var3);
      return Class9680.method37905() == null ? var6.getWaterColor() : Class9680.method37905().method24070(var6, var3);
   }

   @Override
   public boolean method24054() {
      return false;
   }
}
