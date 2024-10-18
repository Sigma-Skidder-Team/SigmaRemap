package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.world.biome.Biome;
import net.optifine.util.BiomeUtils;

public final class Class7447 implements Class7443 {
   private static String[] field32021;

   @Override
   public int method24053(BlockState var1, IBlockDisplayReader var2, BlockPos var3) {
      Biome var6 = Class9680.method37851(var2, var3);
      return Class9680.method37901() != null && var6 == BiomeUtils.SWAMP
         ? Class9680.method37901().method24070(var6, var3)
         : var6.getGrassColor((double)var3.getX(), (double)var3.getZ());
   }

   @Override
   public boolean method24054() {
      return false;
   }
}
