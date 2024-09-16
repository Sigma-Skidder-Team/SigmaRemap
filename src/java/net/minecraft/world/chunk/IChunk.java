package net.minecraft.world.chunk;

import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.Fluid;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.palette.UpgradeData;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IStructureReader;
import net.minecraft.world.ITickList;
import net.minecraft.world.biome.BiomeContainer;
import net.minecraft.world.gen.feature.structure.StructureStart;
import org.apache.logging.log4j.LogManager;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

public interface IChunk extends IBlockReader, IStructureReader {
   @Nullable
   BlockState setBlockState(BlockPos var1, BlockState var2, boolean var3);

   void addTileEntity(BlockPos var1, TileEntity var2);

   void addEntity(Entity var1);

   @Nullable
   default ChunkSection getLastExtendedBlockStorage() {
      ChunkSection[] var3 = this.getSections();

      for (int var4 = var3.length - 1; var4 >= 0; var4--) {
         ChunkSection var5 = var3[var4];
         if (!ChunkSection.method21859(var5)) {
            return var5;
         }
      }

      return null;
   }

   default int getTopFilledSegment() {
      ChunkSection var3 = this.getLastExtendedBlockStorage();
      return var3 != null ? var3.getYLocation() : 0;
   }

   Set<BlockPos> getTileEntitiesPos();

   ChunkSection[] getSections();

   Collection<Entry<Heightmap.Type, Heightmap>> getHeightmaps();

   void setHeightmap(Heightmap.Type var1, long[] var2);

   Heightmap getHeightmap(Heightmap.Type var1);

   int getTopBlockY(Heightmap.Type var1, int var2, int var3);

   ChunkPos getPos();

   void setLastSaveTime(long var1);

   Map<Structure<?>, StructureStart<?>> getStructureStarts();

   void setStructureStarts(Map<Structure<?>, StructureStart<?>> var1);

   default boolean isEmptyBetween(int var1, int var2) {
      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 >= 256) {
         var2 = 255;
      }

      for (int var5 = var1; var5 <= var2; var5 += 16) {
         if (!ChunkSection.method21859(this.getSections()[var5 >> 4])) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   BiomeContainer getBiomes();

   void setModified(boolean var1);

   boolean isModified();

   ChunkStatus getStatus();

   void removeTileEntity(BlockPos var1);

   default void markBlockForPostprocessing(BlockPos var1) {
      LogManager.getLogger().warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", var1);
   }

   ShortList[] getPackedPositions();

   default void addPackedPosition(short var1, int var2) {
      getList(this.getPackedPositions(), var2).add(var1);
   }

   default void addTileEntity(CompoundNBT var1) {
      LogManager.getLogger().warn("Trying to set a BlockEntity, but this operation is not supported.");
   }

   @Nullable
   CompoundNBT getDeferredTileEntity(BlockPos var1);

   @Nullable
   CompoundNBT getTileEntityNBT(BlockPos var1);

   Stream<BlockPos> getLightSources();

   ITickList<Block> getBlocksToBeTicked();

   ITickList<Fluid> getFluidsToBeTicked();

   UpgradeData getUpgradeData();

   void setInhabitedTime(long var1);

   long getInhabitedTime();

   static ShortList getList(ShortList[] var0, int var1) {
      if (var0[var1] == null) {
         var0[var1] = new ShortArrayList();
      }

      return var0[var1];
   }

   boolean hasLight();

   void setLight(boolean var1);
}
