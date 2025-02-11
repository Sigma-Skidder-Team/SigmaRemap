package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockDisplayReader;

public class Class4049 {
   private static String[] field20385;

   public static final float method12820(BlockState var0, IBlockDisplayReader var1, BlockPos var2) {
      float var5 = var0.method23399(var1, var2);
      return Class7551.method24694(var5);
   }

   public static final int method12821(BlockState var0, IBlockDisplayReader var1, BlockPos var2) {
      if (!(var1 instanceof ChunkCacheOF)) {
         return WorldRenderer.method945(var1, var0, var2);
      } else {
         ChunkCacheOF var5 = (ChunkCacheOF)var1;
         int[] var6 = var5.method7027();
         int var7 = var5.method7023(var2);
         if (var7 >= 0 && var7 < var6.length && var6 != null) {
            int var8 = var6[var7];
            if (var8 == -1) {
               var8 = WorldRenderer.method945(var1, var0, var2);
               var6[var7] = var8;
            }

            return var8;
         } else {
            return WorldRenderer.method945(var1, var0, var2);
         }
      }
   }
}
