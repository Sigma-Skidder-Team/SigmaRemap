package net.minecraft.world.gen;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Util;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.particles.IParticleData;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.*;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.ITickList;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeManager;
import net.minecraft.world.chunk.AbstractChunkProvider;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.lighting.WorldLightManager;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WorldGenRegion implements ISeedReader {
   private static final Logger field9200 = LogManager.getLogger();
   private final List<IChunk> field9201;
   private final int field9202;
   private final int field9203;
   private final int field9204;
   private final ServerWorld field9205;
   private final long field9206;
   private final Class6612 field9207;
   private final Random field9208;
   private final DimensionType field9209;
   private final ITickList<Block> field9210 = new Class6803<Block>(var1x -> this.getChunk(var1x).getBlocksToBeTicked());
   private final ITickList<Fluid> field9211 = new Class6803<Fluid>(var1x -> this.getChunk(var1x).getFluidsToBeTicked());
   private final BiomeManager field9212;
   private final ChunkPos field9213;
   private final ChunkPos field9214;
   private final StructureManager field9215;

   public WorldGenRegion(ServerWorld var1, List<IChunk> var2) {
      int var5 = MathHelper.floor(Math.sqrt((double)var2.size()));
      if (var5 * var5 == var2.size()) {
         ChunkPos var6 = ((IChunk)var2.get(var2.size() / 2)).getPos();
         this.field9201 = var2;
         this.field9202 = var6.x;
         this.field9203 = var6.z;
         this.field9204 = var5;
         this.field9205 = var1;
         this.field9206 = var1.getSeed();
         this.field9207 = var1.getWorldInfo();
         this.field9208 = var1.method6814();
         this.field9209 = var1.getDimensionType();
         this.field9212 = new BiomeManager(this, BiomeManager.getHashedSeed(this.field9206), var1.getDimensionType().getMagnifier());
         this.field9213 = ((IChunk)var2.get(0)).getPos();
         this.field9214 = ((IChunk)var2.get(var2.size() - 1)).getPos();
         this.field9215 = var1.func_241112_a_().method24339(this);
      } else {
         throw (IllegalStateException) Util.pauseDevMode(new IllegalStateException("Cache size is not a square."));
      }
   }

   public int getMainChunkX() {
      return this.field9202;
   }

   public int getMainChunkZ() {
      return this.field9203;
   }

   @Override
   public IChunk getChunk(int var1, int var2) {
      return this.getChunk(var1, var2, ChunkStatus.EMPTY);
   }

   @Nullable
   @Override
   public IChunk getChunk(int var1, int var2, ChunkStatus var3, boolean var4) {
      IChunk var7;
      if (!this.chunkExists(var1, var2)) {
         var7 = null;
      } else {
         int var8 = var1 - this.field9213.x;
         int var9 = var2 - this.field9213.z;
         var7 = this.field9201.get(var8 + var9 * this.field9204);
         if (var7.getStatus().isAtLeast(var3)) {
            return var7;
         }
      }

      if (var4) {
         field9200.error("Requested chunk : {} {}", var1, var2);
         field9200.error(
            "Region bounds : {} {} | {} {}", this.field9213.x, this.field9213.z, this.field9214.x, this.field9214.z
         );
         if (var7 == null) {
            throw (RuntimeException) Util.pauseDevMode(
               new RuntimeException(String.format("We are asking a region for a chunk out of bound | %s %s", var1, var2))
            );
         } else {
            throw (RuntimeException) Util.pauseDevMode(
               new RuntimeException(String.format("Chunk is not of correct status. Expecting %s, got %s | %s %s", var3, var7.getStatus(), var1, var2))
            );
         }
      } else {
         return null;
      }
   }

   @Override
   public boolean chunkExists(int var1, int var2) {
      return var1 >= this.field9213.x && var1 <= this.field9214.x && var2 >= this.field9213.z && var2 <= this.field9214.z;
   }

   @Override
   public BlockState getBlockState(BlockPos var1) {
      return this.getChunk(var1.getX() >> 4, var1.getZ() >> 4).getBlockState(var1);
   }

   @Override
   public FluidState getFluidState(BlockPos var1) {
      return this.getChunk(var1).getFluidState(var1);
   }

   @Nullable
   @Override
   public PlayerEntity method7184(double var1, double var3, double var5, double var7, Predicate<Entity> var9) {
      return null;
   }

   @Override
   public int method6808() {
      return 0;
   }

   @Override
   public BiomeManager getBiomeManager() {
      return this.field9212;
   }

   @Override
   public Biome method6871(int var1, int var2, int var3) {
      return this.field9205.method6871(var1, var2, var3);
   }

   @Override
   public float method6877(Direction var1, boolean var2) {
      return 1.0F;
   }

   @Override
   public WorldLightManager getLightManager() {
      return this.field9205.getLightManager();
   }

   @Override
   public boolean destroyBlock(BlockPos var1, boolean var2, Entity var3, int var4) {
      BlockState var7 = this.getBlockState(var1);
      if (!var7.isAir()) {
         if (var2) {
            TileEntity var8 = !var7.getBlock().isTileEntityProvider() ? null : this.getTileEntity(var1);
            Block.spawnDrops(var7, this.field9205, var1, var8, var3, ItemStack.EMPTY);
         }

         return this.setBlockState(var1, Blocks.AIR.getDefaultState(), 3, var4);
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public TileEntity getTileEntity(BlockPos var1) {
      IChunk var4 = this.getChunk(var1);
      TileEntity var5 = var4.getTileEntity(var1);
      if (var5 == null) {
         CompoundNBT var6 = var4.getDeferredTileEntity(var1);
         BlockState var7 = var4.getBlockState(var1);
         if (var6 != null) {
            if (!"DUMMY".equals(var6.getString("id"))) {
               var5 = TileEntity.method3772(var7, var6);
            } else {
               Block var8 = var7.getBlock();
               if (!(var8 instanceof Class3245)) {
                  return null;
               }

               var5 = ((Class3245)var8).method11646(this.field9205);
            }

            if (var5 != null) {
               var4.addTileEntity(var1, var5);
               return var5;
            }
         }

         if (var7.getBlock() instanceof Class3245) {
            field9200.warn("Tried to access a block entity before it was created. {}", var1);
         }

         return null;
      } else {
         return var5;
      }
   }

   @Override
   public boolean setBlockState(BlockPos var1, BlockState var2, int var3, int var4) {
      IChunk var7 = this.getChunk(var1);
      BlockState var8 = var7.setBlockState(var1, var2, false);
      if (var8 != null) {
         this.field9205.onBlockStateChange(var1, var8, var2);
      }

      Block var9 = var2.getBlock();
      if (!var9.isTileEntityProvider()) {
         if (var8 != null && var8.getBlock().isTileEntityProvider()) {
            var7.removeTileEntity(var1);
         }
      } else if (var7.getStatus().method34303() != Class2076.field13525) {
         CompoundNBT var10 = new CompoundNBT();
         var10.putInt("x", var1.getX());
         var10.putInt("y", var1.getY());
         var10.putInt("z", var1.getZ());
         var10.putString("id", "DUMMY");
         var7.addTileEntity(var10);
      } else {
         var7.addTileEntity(var1, ((Class3245)var9).method11646(this));
      }

      if (var2.method23444(this, var1)) {
         this.method7243(var1);
      }

      return true;
   }

   private void method7243(BlockPos var1) {
      this.getChunk(var1).markBlockForPostprocessing(var1);
   }

   @Override
   public boolean addEntity(Entity var1) {
      int var4 = MathHelper.floor(var1.getPosX() / 16.0);
      int var5 = MathHelper.floor(var1.getPosZ() / 16.0);
      this.getChunk(var4, var5).addEntity(var1);
      return true;
   }

   @Override
   public boolean removeBlock(BlockPos var1, boolean var2) {
      return this.setBlockState(var1, Blocks.AIR.getDefaultState(), 3);
   }

   @Override
   public WorldBorder getWorldBorder() {
      return this.field9205.getWorldBorder();
   }

   @Override
   public boolean isRemote() {
      return false;
   }

   @Deprecated
   @Override
   public ServerWorld method6970() {
      return this.field9205;
   }

   @Override
   public DynamicRegistries func_241828_r() {
      return this.field9205.func_241828_r();
   }

   @Override
   public Class6612 getWorldInfo() {
      return this.field9207;
   }

   @Override
   public Class9755 method6807(BlockPos var1) {
      if (this.chunkExists(var1.getX() >> 4, var1.getZ() >> 4)) {
         return new Class9755(this.field9205.method6997(), this.field9205.method6784(), 0L, this.field9205.method7000());
      } else {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      }
   }

   @Override
   public AbstractChunkProvider getChunkProvider() {
      return this.field9205.getChunkProvider();
   }

   @Override
   public long getSeed() {
      return this.field9206;
   }

   @Override
   public ITickList<Block> getBlockTickScheduler() {
      return this.field9210;
   }

   @Override
   public ITickList<Fluid> getPendingFluidTicks() {
      return this.field9211;
   }

   @Override
   public int getSeaLevel() {
      return this.field9205.getSeaLevel();
   }

   @Override
   public Random method6814() {
      return this.field9208;
   }

   @Override
   public int method6736(Heightmap.Type var1, int var2, int var3) {
      return this.getChunk(var2 >> 4, var3 >> 4).getTopBlockY(var1, var2 & 15, var3 & 15) + 1;
   }

   @Override
   public void playSound(PlayerEntity var1, BlockPos var2, SoundEvent var3, SoundCategory var4, float var5, float var6) {
   }

   @Override
   public void addParticle(IParticleData var1, double var2, double var4, double var6, double var8, double var10, double var12) {
   }

   @Override
   public void method6869(PlayerEntity var1, int var2, BlockPos var3, int var4) {
   }

   @Override
   public DimensionType getDimensionType() {
      return this.field9209;
   }

   @Override
   public boolean method6815(BlockPos var1, Predicate<BlockState> var2) {
      return var2.test(this.getBlockState(var1));
   }

   @Override
   public <T extends Entity> List<T> getEntitiesInAABBexcluding(Class<? extends T> var1, AxisAlignedBB var2, Predicate<? super T> var3) {
      return Collections.<T>emptyList();
   }

   @Override
   public List<Entity> getEntitiesInAABBexcluding(Entity var1, AxisAlignedBB var2, Predicate<? super Entity> var3) {
      return Collections.<Entity>emptyList();
   }

   @Override
   public List<PlayerEntity> method6870() {
      return Collections.<PlayerEntity>emptyList();
   }

   @Override
   public Stream<? extends StructureStart<?>> method6969(SectionPos var1, Structure<?> var2) {
      return this.field9215.func_235011_a_(var1, var2);
   }
}
