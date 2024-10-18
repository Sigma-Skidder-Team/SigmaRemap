package net.minecraft.entity.player;

import mapped.Chunk;
import mapped.Heightmap;
import net.minecraft.block.BlockState;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public class SpawnLocationHelper {
   private static String[] field29818;

   @Nullable
   public static BlockPos method20940(ServerWorld var0, int var1, int var2, boolean var3) {
      BlockPos.Mutable var6 = new BlockPos.Mutable(var1, 0, var2);
      Biome var7 = var0.getBiome(var6);
      boolean var8 = var0.getDimensionType().getHasCeiling();
      BlockState var9 = var7.getGenerationSettings().getSurfaceBuilderConfig().getTop();
      if (var3 && !var9.getBlock().isIn(BlockTags.VALID_SPAWN)) {
         return null;
      } else {
         Chunk var10 = var0.getChunk(var1 >> 4, var2 >> 4);
         int var11 = !var8 ? var10.getTopBlockY(Heightmap.Type.MOTION_BLOCKING, var1 & 15, var2 & 15) : var0.getChunkProvider().getChunkGenerator().getGroundHeight();
         if (var11 < 0) {
            return null;
         } else {
            int var12 = var10.getTopBlockY(Heightmap.Type.WORLD_SURFACE, var1 & 15, var2 & 15);
            if (var12 <= var11 && var12 > var10.getTopBlockY(Heightmap.Type.OCEAN_FLOOR, var1 & 15, var2 & 15)) {
               return null;
            } else {
               for (int var13 = var11 + 1; var13 >= 0; var13--) {
                  var6.setPos(var1, var13, var2);
                  BlockState var14 = var0.getBlockState(var6);
                  if (!var14.method23449().isEmpty()) {
                     break;
                  }

                  if (var14.equals(var9)) {
                     return var6.up().toImmutable();
                  }
               }

               return null;
            }
         }
      }
   }

   @Nullable
   public static BlockPos func_241094_a_(ServerWorld var0, ChunkPos var1, boolean var2) {
      for (int var5 = var1.getX(); var5 <= var1.getXEnd(); var5++) {
         for (int var6 = var1.getZ(); var6 <= var1.getZEnd(); var6++) {
            BlockPos var7 = method20940(var0, var5, var6, var2);
            if (var7 != null) {
               return var7;
            }
         }
      }

      return null;
   }
}
