package net.minecraft.world;

import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeManager;
import net.minecraft.world.chunk.IChunk;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public interface IWorldReader extends IBlockDisplayReader, ICollisionReader, BiomeManager.IBiomeReader {
   @Nullable
   IChunk getChunk(int var1, int var2, ChunkStatus var3, boolean var4);

   @Deprecated
   boolean method6843(int var1, int var2);

   int method6736(Heightmap.Type var1, int var2, int var3);

   int method6808();

   BiomeManager getBiomeManager();

   default Biome getBiome(BlockPos var1) {
      return this.getBiomeManager().getBiome(var1);
   }

   default Stream<BlockState> method7004(AxisAlignedBB var1) {
      int var4 = MathHelper.floor(var1.minX);
      int var5 = MathHelper.floor(var1.maxX);
      int var6 = MathHelper.floor(var1.minY);
      int var7 = MathHelper.floor(var1.maxY);
      int var8 = MathHelper.floor(var1.minZ);
      int var9 = MathHelper.floor(var1.maxZ);
      return !this.method7019(var4, var6, var8, var5, var7, var9) ? Stream.<BlockState>empty() : this.method7035(var1);
   }

   @Override
   default int method6878(BlockPos var1, Class8980 var2) {
      return var2.method32943(this.getBiome(var1), (double)var1.getX(), (double)var1.getZ());
   }

   @Override
   default Biome getNoiseBiome(int var1, int var2, int var3) {
      IChunk var6 = this.getChunk(var1 >> 2, var3 >> 2, ChunkStatus.field42136, false);
      return var6 != null && var6.getBiomes() != null ? var6.getBiomes().getNoiseBiome(var1, var2, var3) : this.method6871(var1, var2, var3);
   }

   Biome method6871(int var1, int var2, int var3);

   boolean isRemote();

   @Deprecated
   int method6776();

   DimensionType method6812();

   default BlockPos method7006(Heightmap.Type var1, BlockPos var2) {
      return new BlockPos(var2.getX(), this.method6736(var1, var2.getX(), var2.getZ()), var2.getZ());
   }

   default boolean method7007(BlockPos var1) {
      return this.getBlockState(var1).isAir();
   }

   default boolean method7008(BlockPos var1) {
      if (var1.getY() < this.method6776()) {
         BlockPos var4 = new BlockPos(var1.getX(), this.method6776(), var1.getZ());
         if (this.method7022(var4)) {
            for (BlockPos var5 = var4.down(); var5.getY() > var1.getY(); var5 = var5.down()) {
               BlockState var6 = this.getBlockState(var5);
               if (var6.getOpacity(this, var5) > 0 && !var6.getMaterial().isLiquid()) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      } else {
         return this.method7022(var1);
      }
   }

   @Deprecated
   default float method7009(BlockPos var1) {
      return this.method6812().getAmbientLight(this.method7015(var1));
   }

   default int method7010(BlockPos var1, Direction var2) {
      return this.getBlockState(var1).method23407(this, var1, var2);
   }

   default IChunk method7011(BlockPos var1) {
      return this.getChunk(var1.getX() >> 4, var1.getZ() >> 4);
   }

   default IChunk getChunk(int var1, int var2) {
      return this.getChunk(var1, var2, ChunkStatus.FULL, true);
   }

   default IChunk getChunk(int var1, int var2, ChunkStatus var3) {
      return this.getChunk(var1, var2, var3, true);
   }

   @Nullable
   @Override
   default IBlockReader getBlockReader(int var1, int var2) {
      return this.getChunk(var1, var2, ChunkStatus.field42133, false);
   }

   default boolean method7013(BlockPos var1) {
      return this.getFluidState(var1).method23486(FluidTags.field40469);
   }

   default boolean method7014(AxisAlignedBB var1) {
      int var4 = MathHelper.floor(var1.minX);
      int var5 = MathHelper.method37774(var1.maxX);
      int var6 = MathHelper.floor(var1.minY);
      int var7 = MathHelper.method37774(var1.maxY);
      int var8 = MathHelper.floor(var1.minZ);
      int var9 = MathHelper.method37774(var1.maxZ);
      BlockPos.Mutable var10 = new BlockPos.Mutable();

      for (int var11 = var4; var11 < var5; var11++) {
         for (int var12 = var6; var12 < var7; var12++) {
            for (int var13 = var8; var13 < var9; var13++) {
               BlockState var14 = this.getBlockState(var10.method8372(var11, var12, var13));
               if (!var14.method23449().method23474()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int method7015(BlockPos var1) {
      return this.method7016(var1, this.method6808());
   }

   default int method7016(BlockPos var1, int var2) {
      return var1.getX() >= -30000000 && var1.getZ() >= -30000000 && var1.getX() < 30000000 && var1.getZ() < 30000000
         ? this.method7021(var1, var2)
         : 15;
   }

   @Deprecated
   default boolean method7017(BlockPos var1) {
      return this.method6843(var1.getX() >> 4, var1.getZ() >> 4);
   }

   @Deprecated
   default boolean isAreaLoaded(BlockPos var1, BlockPos var2) {
      return this.method7019(var1.getX(), var1.getY(), var1.getZ(), var2.getX(), var2.getY(), var2.getZ());
   }

   @Deprecated
   default boolean method7019(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var5 >= 0 && var2 < 256) {
         var1 >>= 4;
         var3 >>= 4;
         var4 >>= 4;
         var6 >>= 4;

         for (int var9 = var1; var9 <= var4; var9++) {
            for (int var10 = var3; var10 <= var6; var10++) {
               if (!this.method6843(var9, var10)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
