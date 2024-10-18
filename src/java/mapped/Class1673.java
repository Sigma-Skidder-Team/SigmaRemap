package mapped;

import it.unimi.dsi.fastutil.longs.LongSet;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.Util;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.palette.UpgradeData;
import net.minecraft.world.biome.BiomeContainer;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.chunk.ChunkSection;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.lighting.WorldLightManager;

import javax.annotation.Nullable;
import java.util.BitSet;
import java.util.Map;
import java.util.stream.Stream;

public class Class1673 extends ChunkPrimer {
   private final Chunk field9109;

   public Class1673(Chunk var1) {
      super(var1.getPos(), UpgradeData.field40388);
      this.field9109 = var1;
   }

   @Nullable
   @Override
   public TileEntity getTileEntity(BlockPos var1) {
      return this.field9109.getTileEntity(var1);
   }

   @Nullable
   @Override
   public BlockState getBlockState(BlockPos var1) {
      return this.field9109.getBlockState(var1);
   }

   @Override
   public FluidState getFluidState(BlockPos var1) {
      return this.field9109.getFluidState(var1);
   }

   @Override
   public int getMaxLightLevel() {
      return this.field9109.getMaxLightLevel();
   }

   @Nullable
   @Override
   public BlockState setBlockState(BlockPos var1, BlockState var2, boolean var3) {
      return null;
   }

   @Override
   public void addTileEntity(BlockPos var1, TileEntity var2) {
   }

   @Override
   public void addEntity(Entity var1) {
   }

   @Override
   public void method7111(ChunkStatus var1) {
   }

   @Override
   public ChunkSection[] getSections() {
      return this.field9109.getSections();
   }

   @Nullable
   @Override
   public WorldLightManager method7112() {
      return this.field9109.method7131();
   }

   @Override
   public void setHeightmap(Heightmap.Type var1, long[] var2) {
   }

   private Heightmap.Type method7126(Heightmap.Type var1) {
      if (var1 != Heightmap.Type.WORLD_SURFACE_WG) {
         return var1 != Heightmap.Type.OCEAN_FLOOR_WG ? var1 : Heightmap.Type.OCEAN_FLOOR;
      } else {
         return Heightmap.Type.WORLD_SURFACE;
      }
   }

   @Override
   public int getTopBlockY(Heightmap.Type var1, int var2, int var3) {
      return this.field9109.getTopBlockY(this.method7126(var1), var2, var3);
   }

   @Override
   public ChunkPos getPos() {
      return this.field9109.getPos();
   }

   @Override
   public void setLastSaveTime(long var1) {
   }

   @Nullable
   @Override
   public StructureStart<?> method7097(Structure<?> var1) {
      return this.field9109.method7097(var1);
   }

   @Override
   public void method7098(Structure<?> var1, StructureStart<?> var2) {
   }

   @Override
   public Map<Structure<?>, StructureStart<?>> getStructureStarts() {
      return this.field9109.getStructureStarts();
   }

   @Override
   public void setStructureStarts(Map<Structure<?>, StructureStart<?>> var1) {
   }

   @Override
   public LongSet method7099(Structure<?> var1) {
      return this.field9109.method7099(var1);
   }

   @Override
   public void method7100(Structure<?> var1, long var2) {
   }

   @Override
   public Map<Structure<?>, LongSet> method7101() {
      return this.field9109.method7101();
   }

   @Override
   public void method7102(Map<Structure<?>, LongSet> var1) {
   }

   @Override
   public BiomeContainer getBiomes() {
      return this.field9109.getBiomes();
   }

   @Override
   public void setModified(boolean var1) {
   }

   @Override
   public boolean isModified() {
      return false;
   }

   @Override
   public ChunkStatus getStatus() {
      return this.field9109.getStatus();
   }

   @Override
   public void removeTileEntity(BlockPos var1) {
   }

   @Override
   public void markBlockForPostprocessing(BlockPos var1) {
   }

   @Override
   public void addTileEntity(CompoundNBT var1) {
   }

   @Nullable
   @Override
   public CompoundNBT getDeferredTileEntity(BlockPos var1) {
      return this.field9109.getDeferredTileEntity(var1);
   }

   @Nullable
   @Override
   public CompoundNBT getTileEntityNBT(BlockPos var1) {
      return this.field9109.getTileEntityNBT(var1);
   }

   @Override
   public void setBiomes(BiomeContainer var1) {
   }

   @Override
   public Stream<BlockPos> getLightSources() {
      return this.field9109.getLightSources();
   }

   @Override
   public Class6806<Block> getBlocksToBeTicked() {
      return new Class6806<Block>(var0 -> var0.getDefaultState().isAir(), this.getPos());
   }

   @Override
   public Class6806<Fluid> getFluidsToBeTicked() {
      return new Class6806<Fluid>(var0 -> var0 == Fluids.EMPTY, this.getPos());
   }

   @Override
   public BitSet method7116(GenerationStageCarving var1) {
      throw (UnsupportedOperationException) Util.pauseDevMode(new UnsupportedOperationException("Meaningless in this context"));
   }

   @Override
   public BitSet getOrAddCarvingMask(GenerationStageCarving var1) {
      throw (UnsupportedOperationException) Util.pauseDevMode(new UnsupportedOperationException("Meaningless in this context"));
   }

   public Chunk method7127() {
      return this.field9109;
   }

   @Override
   public boolean hasLight() {
      return this.field9109.hasLight();
   }

   @Override
   public void setLight(boolean var1) {
      this.field9109.setLight(var1);
   }
}
