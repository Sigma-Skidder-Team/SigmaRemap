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
   @Nullable
   protected static BlockPos func_241092_a_(ServerWorld serverWorld, int x, int z, boolean whoKnows) {
      BlockPos.Mutable blockpos$mutable = new BlockPos.Mutable(x, 0, z);
      Biome biome = serverWorld.getBiome(blockpos$mutable);
      boolean flag = serverWorld.getDimensionType().getHasCeiling();
      BlockState blockstate = biome.getGenerationSettings().getSurfaceBuilderConfig().getTop();
      System.out.println(biome == null ? "biome is null" : "biome is not null");
      System.out.println(blockstate == null ? "blockstate is null" : "blockstate is not null");
      System.out.println(blockpos$mutable == null ? "blockpos$mutable is null" : "blockpos$mutable is not null");

      if (whoKnows && !blockstate.getBlock().isIn(BlockTags.VALID_SPAWN))
      {
         System.out.println("returning null");
         return null;
      }
      else
      {
     //    System.out.println("before getChunk");
         System.out.println("x >> 4: " + (x >> 4) + " - z >> 4: " + (z >> 4));
         Chunk chunk = serverWorld.getChunk(x >> 4, z >> 4);
         int i = flag ? serverWorld.getChunkProvider().getChunkGenerator().getGroundHeight() : chunk.getTopBlockY(Heightmap.Type.MOTION_BLOCKING, x & 15, z & 15);

         System.out.println(chunk == null ? "chunk is null" : "chunk is not null");
         if (i < 0)
         {
            return null;
         }
         else
         {
            int j = chunk.getTopBlockY(Heightmap.Type.WORLD_SURFACE, x & 15, z & 15);

            if (j <= i && j > chunk.getTopBlockY(Heightmap.Type.OCEAN_FLOOR, x & 15, z & 15))
            {
               return null;
            }
            else
            {
               for (int k = i + 1; k >= 0; --k)
               {
                  blockpos$mutable.setPos(x, k, z);
                  BlockState blockstate1 = serverWorld.getBlockState(blockpos$mutable);

                  if (!blockstate1.getFluidState().isEmpty())
                  {
                     break;
                  }

                  if (blockstate1.equals(blockstate))
                  {
                     return blockpos$mutable.up().toImmutable();
                  }
               }

               return null;
            }
         }
      }
   }

   @Nullable
   public static BlockPos findValidSpawnPosition(ServerWorld var0, ChunkPos var1, boolean var2) {
      System.out.println("called findValidSpawnPosition");
      for (int var5 = var1.getX(); var5 <= var1.getXEnd(); var5++) {
         System.out.println("thing x: " + var1.getX());
         System.out.println("thing end x: " + var1.getXEnd());
         System.out.println("thing var5: " + var5);
         for (int var6 = var1.getZ(); var6 <= var1.getZEnd(); var6++) {
            System.out.println("thing z: " + var1.getZ());
            System.out.println("thing end z: " + var1.getZEnd());
            System.out.println("thing var6: " + var6);
            BlockPos var7 = func_241092_a_(var0, var5, var6, var2);
            if (var7 != null) {
               System.out.println("Returning var7");
               return var7;
            } else {
               System.out.println("it nulled, such a bitch");
            }
         }
      }

      System.out.println("Returning null!");
      return null;
   }
}
