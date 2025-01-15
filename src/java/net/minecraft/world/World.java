package net.minecraft.world;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import mapped.*;
import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.crash.ReportedException;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.RecipeManager;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.particles.IParticleData;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.tags.ITagCollectionSupplier;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeManager;
import net.minecraft.world.chunk.AbstractChunkProvider;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.lighting.WorldLightManager;
import net.minecraft.world.storage.MapData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public abstract class World implements IWorld, AutoCloseable {
   public static final Logger LOGGER = LogManager.getLogger();
   public static final Codec<RegistryKey<World>> CODEC = ResourceLocation.CODEC
      .xmap(RegistryKey.method31400(Registry.WORLD_KEY), RegistryKey::getLocation);
   public static final RegistryKey<World> OVERWORLD = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("overworld"));
   public static final RegistryKey<World> THE_NETHER = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("the_nether"));
   public static final RegistryKey<World> THE_END = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("the_end"));
   private static final Direction[] FACING_VALUES = Direction.values();
   public final List<TileEntity> loadedTileEntityList = Lists.newArrayList();
   public final List<TileEntity> tickableTileEntities = Lists.newArrayList();
   public final List<TileEntity> addedTileEntityList = Lists.newArrayList();
   public final List<TileEntity> tileEntitiesToBeRemoved = Lists.newArrayList();
   private final Thread mainThread;
   private final boolean isDebug;
   private int skylightSubtracted;
   public int updateLCG = new Random().nextInt();
   public final int DIST_HASH_MAGIC = 1013904223;
   public float prevRainingStrength;
   public float rainingStrength;
   public float prevThunderingStrength;
   public float thunderingStrength;
   public final Random rand = new Random();
   private final DimensionType dimensionType;
   public final ISpawnWorldInfo worldInfo;
   private final Supplier<IProfiler> profiler;
   public final boolean isRemote;
   public boolean processingLoadedTiles;
   private final WorldBorder worldBorder;
   private final BiomeManager biomeManager;
   private final RegistryKey<World> dimension;

   public World(ISpawnWorldInfo worldInfo, RegistryKey<World> dimension, DimensionType dimensionType, Supplier<IProfiler> profiler, boolean isRemote, boolean isDebug, long seed) {
      this.profiler = profiler;
      this.worldInfo = worldInfo;
      this.dimensionType = dimensionType;
      this.dimension = dimension;
      this.isRemote = isRemote;
      if (dimensionType.getCoordinateScale() == 1.0) {
         this.worldBorder = new WorldBorder();
      } else {
         this.worldBorder = new WorldBorder()
         {
            public double getCenterX()
            {
               return super.getCenterX() / dimensionType.getCoordinateScale();
            }
            public double getCenterZ()
            {
               return super.getCenterZ() / dimensionType.getCoordinateScale();
            }
         };
      }

      this.mainThread = Thread.currentThread();
      this.biomeManager = new BiomeManager(this, seed, dimensionType.getMagnifier());
      this.isDebug = isDebug;
   }

   @Override
   public boolean isRemote() {
      return this.isRemote;
   }

   @Nullable
   public MinecraftServer getServer() {
      return null;
   }

   public static boolean isValid(BlockPos pos) {
      return !isOutsideBuildHeight(pos) && isValidXZPosition(pos);
   }

   public static boolean isInvalidPosition(BlockPos pos) {
      return !isInvalidYPosition(pos.getY()) && isValidXZPosition(pos);
   }

   private static boolean isValidXZPosition(BlockPos pos) {
      return pos.getX() >= -30000000 && pos.getZ() >= -30000000 && pos.getX() < 30000000 && pos.getZ() < 30000000;
   }

   private static boolean isInvalidYPosition(int y) {
      return y < -20000000 || y >= 20000000;
   }

   public static boolean isOutsideBuildHeight(BlockPos pos) {
      return isYOutOfBounds(pos.getY());
   }

   public static boolean isYOutOfBounds(int y) {
      return y < 0 || y >= 256;
   }

   public Chunk getChunkAt(BlockPos pos) {
      return this.getChunk(pos.getX() >> 4, pos.getZ() >> 4);
   }

   public Chunk getChunk(int chunkX, int chunkZ) {
   //   System.out.println("before getChunk");
      return (Chunk)this.getChunk(chunkX, chunkZ, ChunkStatus.FULL);
   }

   @Override
   public IChunk getChunk(int x, int z, ChunkStatus requiredStatus, boolean nonnull) {
      IChunk var7 = this.getChunkProvider().getChunk(x, z, requiredStatus, nonnull);
      if (var7 == null && nonnull) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return var7;
      }
   }

   @Override
   public boolean setBlockState(BlockPos pos, BlockState newState, int flags) {
      return this.setBlockState(pos, newState, flags, 512);
   }

   @Override
   public boolean setBlockState(BlockPos pos, BlockState state, int flags, int recursionLeft) {
      if (isOutsideBuildHeight(pos)) {
         return false;
      } else if (!this.isRemote && this.isDebug()) {
         return false;
      } else {
         Chunk chunk = this.getChunkAt(pos);
         Block block = state.getBlock();
         BlockState blockstate = chunk.setBlockState(pos, state, (flags & 64) != 0);
         if (blockstate == null) {
            return false;
         } else {
            BlockState blockstate1 = this.getBlockState(pos);
            if ((flags & 128) == 0
               && blockstate1 != blockstate
               && (
                  blockstate1.getOpacity(this, pos) != blockstate.getOpacity(this, pos)
                     || blockstate1.getLightValue() != blockstate.getLightValue()
                     || blockstate1.isTransparent()
                     || blockstate.isTransparent()
               )) {
               this.getProfiler().startSection("queueCheckLight");
               this.getChunkProvider().getLightManager().checkBlock(pos);
               this.getProfiler().endSection();
            }

            if (blockstate1 == state) {
               if (blockstate != blockstate1) {
                  this.markBlockRangeForRenderUpdate(pos, blockstate, blockstate1);
               }

               if ((flags & 2) != 0
                  && (!this.isRemote || (flags & 4) == 0)
                  && (this.isRemote || chunk.getLocationType() != null && chunk.getLocationType().isAtLeast(ChunkHolderLocationType.TICKING))) {
                  this.notifyBlockUpdate(pos, blockstate, state, flags);
               }

               if ((flags & 1) != 0) {
                  this.func_230547_a_(pos, blockstate.getBlock());
                  if (!this.isRemote && state.hasComparatorInputOverride()) {
                     this.updateComparatorOutputLevel(pos, block);
                  }
               }

               if ((flags & 16) == 0 && recursionLeft > 0) {
                  int i = flags & -34;
                  blockstate.updateDiagonalNeighbors(this, pos, i, recursionLeft - 1);
                  state.updateNeighbours(this, pos, i, recursionLeft - 1);
                  state.updateDiagonalNeighbors(this, pos, i, recursionLeft - 1);
               }

               this.onBlockStateChange(pos, blockstate, blockstate1);
            }

            return true;
         }
      }
   }

   public void onBlockStateChange(BlockPos var1, BlockState var2, BlockState var3) {
   }

   @Override
   public boolean removeBlock(BlockPos var1, boolean isMoving) {
      FluidState var5 = this.getFluidState(var1);
      return this.setBlockState(var1, var5.getBlockState(), 3 | (!isMoving ? 0 : 64));
   }

   @Override
   public boolean destroyBlock(BlockPos pos, boolean dropBlock, Entity entity, int recursionLeft) {
      BlockState blockstate = this.getBlockState(pos);
      if (!blockstate.isAir()) {
         FluidState var8 = this.getFluidState(pos);
         if (!(blockstate.getBlock() instanceof AbstractFireBlock)) {
            this.playEvent(2001, pos, Block.getStateId(blockstate));
         }

         if (dropBlock) {
            TileEntity tileentity = !blockstate.getBlock().isTileEntityProvider() ? null : this.getTileEntity(pos);
            Block.spawnDrops(blockstate, this, pos, tileentity, entity, ItemStack.EMPTY);
         }

         return this.setBlockState(pos, var8.getBlockState(), 3, recursionLeft);
      } else {
         return false;
      }
   }

   public boolean setBlockState(BlockPos var1, BlockState var2) {
      return this.setBlockState(var1, var2, 3);
   }

   public abstract void notifyBlockUpdate(BlockPos var1, BlockState var2, BlockState var3, int var4);

   public void markBlockRangeForRenderUpdate(BlockPos var1, BlockState var2, BlockState var3) {
   }

   public void notifyNeighborsOfStateChange(BlockPos at, Block here) {
      this.neighborChanged(at.west(), here, at);
      this.neighborChanged(at.east(), here, at);
      this.neighborChanged(at.down(), here, at);
      this.neighborChanged(at.up(), here, at);
      this.neighborChanged(at.north(), here, at);
      this.neighborChanged(at.south(), here, at);
   }

   public void notifyNeighborsOfStateExcept(BlockPos neighborsAt, Block here, Direction skipSide) {
      if (skipSide != Direction.WEST) {
         this.neighborChanged(neighborsAt.west(), here, neighborsAt);
      }

      if (skipSide != Direction.EAST) {
         this.neighborChanged(neighborsAt.east(), here, neighborsAt);
      }

      if (skipSide != Direction.DOWN) {
         this.neighborChanged(neighborsAt.down(), here, neighborsAt);
      }

      if (skipSide != Direction.UP) {
         this.neighborChanged(neighborsAt.up(), here, neighborsAt);
      }

      if (skipSide != Direction.NORTH) {
         this.neighborChanged(neighborsAt.north(), here, neighborsAt);
      }

      if (skipSide != Direction.SOUTH) {
         this.neighborChanged(neighborsAt.south(), here, neighborsAt);
      }
   }

   public void neighborChanged(BlockPos at, Block block, BlockPos pos) {
      if (!this.isRemote) {
         BlockState state = this.getBlockState(at);

         try {
            state.neighborChanged(this, at, block, pos, false);
         } catch (Throwable var10) {
            CrashReport var8 = CrashReport.makeCrashReport(var10, "Exception while updating neighbours");
            CrashReportCategory var9 = var8.makeCategory("Block being updated");
            var9.addDetail("Source block type", () -> {
               try {
                  return String.format("ID #%s (%s // %s)", Registry.BLOCK.getKey(block), block.getTranslationKey(), block.getClass().getCanonicalName());
               } catch (Throwable var4) {
                  return "ID #" + Registry.BLOCK.getKey(block);
               }
            });
            CrashReportCategory.addBlockInfo(var9, at, state);
            throw new ReportedException(var8);
         }
      }
   }

   @Override
   public int method6736(Heightmap.Type var1, int var2, int var3) {
      int var6;
      if (var2 >= -30000000 && var3 >= -30000000 && var2 < 30000000 && var3 < 30000000) {
         if (!this.chunkExists(var2 >> 4, var3 >> 4)) {
            var6 = 0;
         } else {
            var6 = this.getChunk(var2 >> 4, var3 >> 4).getTopBlockY(var1, var2 & 15, var3 & 15) + 1;
         }
      } else {
         var6 = this.getSeaLevel() + 1;
      }

      return var6;
   }

   @Override
   public WorldLightManager getLightManager() {
      return this.getChunkProvider().getLightManager();
   }

   public BlockState getBlockState(BlockPos pos) {
      if (isOutsideBuildHeight(pos))
      {
         return Blocks.VOID_AIR.getDefaultState();
      }
      else
      {
         Chunk chunk = this.getChunk(pos.getX() >> 4, pos.getZ() >> 4);
         return chunk.getBlockState(pos);
      }
   }

   @Override
   public FluidState getFluidState(BlockPos var1) {
      if (!isOutsideBuildHeight(var1)) {
         Chunk var4 = this.getChunkAt(var1);
         return var4.getFluidState(var1);
      } else {
         return Fluids.EMPTY.method25049();
      }
   }

   public boolean method6740() {
      return !this.getDimensionType().doesFixedTimeExist() && this.skylightSubtracted < 4;
   }

   public boolean method6741() {
      return !this.getDimensionType().doesFixedTimeExist() && !this.method6740();
   }

   @Override
   public void playSound(PlayerEntity player, BlockPos at, SoundEvent sound, SoundCategory category, float volume, float pitch) {
      this.playSound(player, (double)at.getX() + 0.5, (double)at.getY() + 0.5, (double)at.getZ() + 0.5, sound, category, volume, pitch);
   }

   public abstract void playSound(PlayerEntity var1, double var2, double var4, double var6, SoundEvent var8, SoundCategory var9, float var10, float var11);

   public abstract void playSoundFromEntity(PlayerEntity var1, Entity var2, SoundEvent var3, SoundCategory var4, float var5, float var6);

   public void method6745(double var1, double var3, double var5, SoundEvent var7, SoundCategory var8, float var9, float var10, boolean var11) {
   }

   @Override
   public void addParticle(IParticleData var1, double var2, double var4, double var6, double var8, double var10, double var12) {
   }

   public void method6747(IParticleData var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
   }

   public void method6748(IParticleData var1, double var2, double var4, double var6, double var8, double var10, double var12) {
   }

   public void method6749(IParticleData var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
   }

   public float method6750(float var1) {
      float var4 = this.method7001(var1);
      return var4 * (float) (Math.PI * 2);
   }

   public boolean method6751(TileEntity var1) {
      if (this.processingLoadedTiles) {
         LOGGER.error(
            "Adding block entity while ticking: {} @ {}",
            new org.apache.logging.log4j.util.Supplier[]{() -> Registry.field16078.getKey(var1.method3786()), var1::getPos}
         );
      }

      boolean var4 = this.loadedTileEntityList.add(var1);
      if (var4 && var1 instanceof ITickableTileEntity) {
         this.tickableTileEntities.add(var1);
      }

      if (this.isRemote) {
         BlockPos var5 = var1.getPos();
         BlockState var6 = this.getBlockState(var5);
         this.notifyBlockUpdate(var5, var6, var6, 2);
      }

      return var4;
   }

   public void method6752(Collection<TileEntity> var1) {
      if (!this.processingLoadedTiles) {
         for (TileEntity var5 : var1) {
            this.method6751(var5);
         }
      } else {
         this.addedTileEntityList.addAll(var1);
      }
   }

   public void tickBlockEntities() {
      IProfiler var3 = this.getProfiler();
      var3.startSection("blockEntities");
      if (!this.tileEntitiesToBeRemoved.isEmpty()) {
         this.tickableTileEntities.removeAll(this.tileEntitiesToBeRemoved);
         this.loadedTileEntityList.removeAll(this.tileEntitiesToBeRemoved);
         this.tileEntitiesToBeRemoved.clear();
      }

      this.processingLoadedTiles = true;
      Iterator var4 = this.tickableTileEntities.iterator();

      while (var4.hasNext()) {
         TileEntity var5 = (TileEntity)var4.next();
         if (!var5.method3778() && var5.method3770()) {
            BlockPos var6 = var5.getPos();
            if (this.getChunkProvider().canTick(var6) && this.getWorldBorder().contains(var6)) {
               try {
                  var3.startSection(() -> String.valueOf(TileEntityType.method13793(var5.method3786())));
                  if (var5.method3786().method13796(this.getBlockState(var6).getBlock())) {
                     ((ITickableTileEntity)var5).tick();
                  } else {
                     var5.method3787();
                  }

                  var3.endSection();
               } catch (Throwable var10) {
                  CrashReport var8 = CrashReport.makeCrashReport(var10, "Ticking block entity");
                  CrashReportCategory var9 = var8.makeCategory("Block entity being ticked");
                  var5.method3781(var9);
                  throw new ReportedException(var8);
               }
            }
         }

         if (var5.method3778()) {
            var4.remove();
            this.loadedTileEntityList.remove(var5);
            if (this.isBlockLoaded(var5.getPos())) {
               this.getChunkAt(var5.getPos()).removeTileEntity(var5.getPos());
            }
         }
      }

      this.processingLoadedTiles = false;
      var3.endStartSection("pendingBlockEntities");
      if (!this.addedTileEntityList.isEmpty()) {
         for (int var11 = 0; var11 < this.addedTileEntityList.size(); var11++) {
            TileEntity var12 = this.addedTileEntityList.get(var11);
            if (!var12.method3778()) {
               if (!this.loadedTileEntityList.contains(var12)) {
                  this.method6751(var12);
               }

               if (this.isBlockLoaded(var12.getPos())) {
                  Chunk var7 = this.getChunkAt(var12.getPos());
                  BlockState var13 = var7.getBlockState(var12.getPos());
                  var7.addTileEntity(var12.getPos(), var12);
                  this.notifyBlockUpdate(var12.getPos(), var13, var13, 3);
               }
            }
         }

         this.addedTileEntityList.clear();
      }

      var3.endSection();
   }

   public void guardEntityTick(Consumer<Entity> var1, Entity var2) {
      try {
         var1.accept(var2);
      } catch (Throwable var8) {
         CrashReport var6 = CrashReport.makeCrashReport(var8, "Ticking entity");
         CrashReportCategory var7 = var6.makeCategory("Entity being ticked");
         var2.fillCrashReport(var7);
         throw new ReportedException(var6);
      }
   }

   public Explosion method6755(Entity var1, double var2, double var4, double var6, float var8, Class2141 var9) {
      return this.method6757(var1, (DamageSource)null, (Class5924)null, var2, var4, var6, var8, false, var9);
   }

   public Explosion method6756(Entity var1, double var2, double var4, double var6, float var8, boolean var9, Class2141 var10) {
      return this.method6757(var1, (DamageSource)null, (Class5924)null, var2, var4, var6, var8, var9, var10);
   }

   public Explosion method6757(
           Entity var1, DamageSource var2, Class5924 var3, double var4, double var6, double var8, float var10, boolean var11, Class2141 var12
   ) {
      Explosion var15 = new Explosion(this, var1, var2, var3, var4, var6, var8, var10, var11, var12);
      var15.method25784();
      var15.method25785(true);
      return var15;
   }

   public String getProviderName() {
      return this.getChunkProvider().makeString();
   }

   @Nullable
   @Override
   public TileEntity getTileEntity(BlockPos var1) {
      if (!isOutsideBuildHeight(var1)) {
         if (!this.isRemote && Thread.currentThread() != this.mainThread) {
            return null;
         } else {
            TileEntity var4 = null;
            if (this.processingLoadedTiles) {
               var4 = this.method6760(var1);
            }

            if (var4 == null) {
               var4 = this.getChunkAt(var1).method7029(var1, Class2206.field14421);
            }

            if (var4 == null) {
               var4 = this.method6760(var1);
            }

            return var4;
         }
      } else {
         return null;
      }
   }

   @Nullable
   private TileEntity method6760(BlockPos var1) {
      for (int var4 = 0; var4 < this.addedTileEntityList.size(); var4++) {
         TileEntity var5 = this.addedTileEntityList.get(var4);
         if (!var5.method3778() && var5.getPos().equals(var1)) {
            return var5;
         }
      }

      return null;
   }

   public void method6761(BlockPos var1, TileEntity var2) {
      if (!isOutsideBuildHeight(var1) && var2 != null && !var2.method3778()) {
         if (!this.processingLoadedTiles) {
            this.getChunkAt(var1).addTileEntity(var1, var2);
            this.method6751(var2);
         } else {
            var2.method3769(this, var1);
            Iterator var5 = this.addedTileEntityList.iterator();

            while (var5.hasNext()) {
               TileEntity var6 = (TileEntity)var5.next();
               if (var6.getPos().equals(var1)) {
                  var6.method3765();
                  var5.remove();
               }
            }

            this.addedTileEntityList.add(var2);
         }
      }
   }

   public void method6762(BlockPos var1) {
      TileEntity var4 = this.getTileEntity(var1);
      if (var4 != null && this.processingLoadedTiles) {
         var4.method3765();
         this.addedTileEntityList.remove(var4);
      } else {
         if (var4 != null) {
            this.addedTileEntityList.remove(var4);
            this.loadedTileEntityList.remove(var4);
            this.tickableTileEntities.remove(var4);
         }

         this.getChunkAt(var1).removeTileEntity(var1);
      }
   }

   public boolean method6763(BlockPos var1) {
      return !isOutsideBuildHeight(var1) ? this.getChunkProvider().chunkExists(var1.getX() >> 4, var1.getZ() >> 4) : false;
   }

   public boolean method6764(BlockPos var1, Entity var2, Direction var3) {
      if (!isOutsideBuildHeight(var1)) {
         IChunk var6 = this.getChunk(var1.getX() >> 4, var1.getZ() >> 4, ChunkStatus.FULL, false);
         return var6 != null ? var6.getBlockState(var1).method23420(this, var1, var2, var3) : false;
      } else {
         return false;
      }
   }

   public boolean method6765(BlockPos var1, Entity var2) {
      return this.method6764(var1, var2, Direction.UP);
   }

   public void calculateInitialSkylight() {
      double var3 = 1.0 - (double)(this.method6792(1.0F) * 5.0F) / 16.0;
      double var5 = 1.0 - (double)(this.method6790(1.0F) * 5.0F) / 16.0;
      double var7 = 0.5 + 2.0 * MathHelper.clamp((double) MathHelper.cos(this.method7001(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.skylightSubtracted = (int)((1.0 - var7 * var3 * var5) * 11.0);
   }

   public void method6767(boolean var1, boolean var2) {
      this.getChunkProvider().setAllowedSpawnTypes(var1, var2);
   }

   public void calculateInitialWeather() {
      if (this.worldInfo.method20043()) {
         this.rainingStrength = 1.0F;
         if (this.worldInfo.method20042()) {
            this.thunderingStrength = 1.0F;
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.getChunkProvider().close();
   }

   @Nullable
   @Override
   public IBlockReader getBlockReader(int var1, int var2) {
      return this.getChunk(var1, var2, ChunkStatus.FULL, false);
   }

   @Override
   public List<Entity> getEntitiesInAABBexcluding(Entity var1, AxisAlignedBB var2, Predicate<? super Entity> var3) {
      this.getProfiler().func_230035_c_("getEntities");
      ArrayList var6 = Lists.newArrayList();
      int var7 = MathHelper.floor((var2.minX - 2.0) / 16.0);
      int var8 = MathHelper.floor((var2.maxX + 2.0) / 16.0);
      int var9 = MathHelper.floor((var2.minZ - 2.0) / 16.0);
      int var10 = MathHelper.floor((var2.maxZ + 2.0) / 16.0);
      AbstractChunkProvider var11 = this.getChunkProvider();

      for (int var12 = var7; var12 <= var8; var12++) {
         for (int var13 = var9; var13 <= var10; var13++) {
            Chunk var14 = var11.getChunk(var12, var13, false);
            if (var14 != null) {
               var14.method7138(var1, var2, var6, var3);
            }
         }
      }

      return var6;
   }

   public <T extends Entity> List<T> method6771(EntityType<T> var1, AxisAlignedBB var2, Predicate<? super T> var3) {
      this.getProfiler().func_230035_c_("getEntities");
      int var6 = MathHelper.floor((var2.minX - 2.0) / 16.0);
      int var7 = MathHelper.method37774((var2.maxX + 2.0) / 16.0);
      int var8 = MathHelper.floor((var2.minZ - 2.0) / 16.0);
      int var9 = MathHelper.method37774((var2.maxZ + 2.0) / 16.0);
      ArrayList var10 = Lists.newArrayList();

      for (int var11 = var6; var11 < var7; var11++) {
         for (int var12 = var8; var12 < var9; var12++) {
            Chunk var13 = this.getChunkProvider().getChunk(var11, var12, false);
            if (var13 != null) {
               var13.method7139(var1, var2, var10, var3);
            }
         }
      }

      return var10;
   }

   @Override
   public <T extends Entity> List<T> getEntitiesInAABBexcluding(Class<? extends T> var1, AxisAlignedBB var2, Predicate<? super T> var3) {
      this.getProfiler().func_230035_c_("getEntities");
      int var6 = MathHelper.floor((var2.minX - 2.0) / 16.0);
      int var7 = MathHelper.method37774((var2.maxX + 2.0) / 16.0);
      int var8 = MathHelper.floor((var2.minZ - 2.0) / 16.0);
      int var9 = MathHelper.method37774((var2.maxZ + 2.0) / 16.0);
      ArrayList var10 = Lists.newArrayList();
      AbstractChunkProvider var11 = this.getChunkProvider();

      for (int var12 = var6; var12 < var7; var12++) {
         for (int var13 = var8; var13 < var9; var13++) {
            Chunk var14 = var11.getChunk(var12, var13, false);
            if (var14 != null) {
               var14.method7140(var1, var2, var10, var3);
            }
         }
      }

      return var10;
   }

   @Override
   public <T extends Entity> List<T> method6773(Class<? extends T> var1, AxisAlignedBB var2, Predicate<? super T> var3) {
      this.getProfiler().func_230035_c_("getLoadedEntities");
      int var6 = MathHelper.floor((var2.minX - 2.0) / 16.0);
      int var7 = MathHelper.method37774((var2.maxX + 2.0) / 16.0);
      int var8 = MathHelper.floor((var2.minZ - 2.0) / 16.0);
      int var9 = MathHelper.method37774((var2.maxZ + 2.0) / 16.0);
      ArrayList var10 = Lists.newArrayList();
      AbstractChunkProvider var11 = this.getChunkProvider();

      for (int var12 = var6; var12 < var7; var12++) {
         for (int var13 = var8; var13 < var9; var13++) {
            Chunk var14 = var11.getChunkNow(var12, var13);
            if (var14 != null) {
               var14.method7140(var1, var2, var10, var3);
            }
         }
      }

      return var10;
   }

   @Nullable
   public abstract Entity getEntityByID(int var1);

   public void method6775(BlockPos var1, TileEntity var2) {
      if (this.isBlockLoaded(var1)) {
         this.getChunkAt(var1).method7137();
      }
   }

   @Override
   public int getSeaLevel() {
      return 63;
   }

   public int method6777(BlockPos var1) {
      int var4 = 0;
      var4 = Math.max(var4, this.method7010(var1.down(), Direction.DOWN));
      if (var4 < 15) {
         var4 = Math.max(var4, this.method7010(var1.up(), Direction.UP));
         if (var4 < 15) {
            var4 = Math.max(var4, this.method7010(var1.north(), Direction.NORTH));
            if (var4 < 15) {
               var4 = Math.max(var4, this.method7010(var1.south(), Direction.SOUTH));
               if (var4 < 15) {
                  var4 = Math.max(var4, this.method7010(var1.west(), Direction.WEST));
                  if (var4 < 15) {
                     var4 = Math.max(var4, this.method7010(var1.east(), Direction.EAST));
                     return var4 < 15 ? var4 : var4;
                  } else {
                     return var4;
                  }
               } else {
                  return var4;
               }
            } else {
               return var4;
            }
         } else {
            return var4;
         }
      } else {
         return var4;
      }
   }

   public boolean method6778(BlockPos var1, Direction var2) {
      return this.method6779(var1, var2) > 0;
   }

   public int method6779(BlockPos var1, Direction var2) {
      BlockState var5 = this.getBlockState(var1);
      int var6 = var5.method23402(this, var1, var2);
      return !var5.method23400(this, var1) ? var6 : Math.max(var6, this.method6777(var1));
   }

   public boolean method6780(BlockPos var1) {
      if (this.method6779(var1.down(), Direction.DOWN) <= 0) {
         if (this.method6779(var1.up(), Direction.UP) <= 0) {
            if (this.method6779(var1.north(), Direction.NORTH) <= 0) {
               if (this.method6779(var1.south(), Direction.SOUTH) <= 0) {
                  return this.method6779(var1.west(), Direction.WEST) <= 0 ? this.method6779(var1.east(), Direction.EAST) > 0 : true;
               } else {
                  return true;
               }
            } else {
               return true;
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public int method6781(BlockPos var1) {
      int var4 = 0;

      for (Direction var8 : FACING_VALUES) {
         int var9 = this.method6779(var1.offset(var8), var8);
         if (var9 >= 15) {
            return 15;
         }

         if (var9 > var4) {
            var4 = var9;
         }
      }

      return var4;
   }

   public void sendQuittingDisconnectingPacket() {
   }

   public long getGameTime() {
      return this.worldInfo.getGameTime();
   }

   public long method6784() {
      return this.worldInfo.getDayTime();
   }

   public boolean method6785(PlayerEntity var1, BlockPos var2) {
      return true;
   }

   public void setEntityState(Entity var1, byte var2) {
   }

   public void addBlockEvent(BlockPos var1, Block var2, int var3, int var4) {
      this.getBlockState(var1).method23422(this, var1, var3, var4);
   }

   @Override
   public Class6612 getWorldInfo() {
      return this.worldInfo;
   }

   public GameRules getGameRules() {
      return this.worldInfo.getGameRulesInstance();
   }

   public float method6790(float var1) {
      return MathHelper.lerp(var1, this.prevThunderingStrength, this.thunderingStrength) * this.method6792(var1);
   }

   public void method6791(float var1) {
      this.prevThunderingStrength = var1;
      this.thunderingStrength = var1;
   }

   public float method6792(float var1) {
      return MathHelper.lerp(var1, this.prevRainingStrength, this.rainingStrength);
   }

   public void method6793(float var1) {
      this.prevRainingStrength = var1;
      this.rainingStrength = var1;
   }

   public boolean method6794() {
      return this.getDimensionType().hasSkyLight() && !this.getDimensionType().getHasCeiling() ? (double)this.method6790(1.0F) > 0.9 : false;
   }

   public boolean method6795() {
      return (double)this.method6792(1.0F) > 0.2;
   }

   public boolean isRainingAt(BlockPos var1) {
      if (!this.method6795()) {
         return false;
      } else if (this.method7022(var1)) {
         if (this.getTopPosition(Heightmap.Type.MOTION_BLOCKING, var1).getY() > var1.getY()) {
            return false;
         } else {
            Biome var4 = this.getBiome(var1);
            return var4.getPrecipitation() == Biome.RainType.RAIN && var4.getTemperature(var1) >= 0.15F;
         }
      } else {
         return false;
      }
   }

   public boolean method6797(BlockPos var1) {
      Biome var4 = this.getBiome(var1);
      return var4.isHighHumidity();
   }

   @Nullable
   public abstract MapData method6798(String var1);

   public abstract void method6799(MapData var1);

   public abstract int method6800();

   public void method6801(int var1, BlockPos var2, int var3) {
   }

   public CrashReportCategory fillCrashReport(CrashReport var1) {
      CrashReportCategory var4 = var1.makeCategoryDepth("Affected level", 1);
      var4.addDetail("All players", () -> this.method6870().size() + " total; " + this.method6870());
      var4.addDetail("Chunk stats", this.getChunkProvider()::makeString);
      var4.addDetail("Level dimension", () -> this.getDimensionKey().getLocation().toString());

      try {
         this.worldInfo.method20049(var4);
      } catch (Throwable var6) {
         var4.method32808("Level Data Unobtainable", var6);
      }

      return var4;
   }

   public abstract void sendBlockBreakProgress(int var1, BlockPos var2, int var3);

   public void method6804(double var1, double var3, double var5, double var7, double var9, double var11, CompoundNBT var13) {
   }

   public abstract Scoreboard method6805();

   public void updateComparatorOutputLevel(BlockPos var1, Block var2) {
      for (Direction var6 : Direction.Plane.HORIZONTAL) {
         BlockPos var7 = var1.offset(var6);
         if (this.isBlockLoaded(var7)) {
            BlockState var8 = this.getBlockState(var7);
            if (!var8.isIn(Blocks.COMPARATOR)) {
               if (var8.method23400(this, var7)) {
                  var7 = var7.offset(var6);
                  var8 = this.getBlockState(var7);
                  if (var8.isIn(Blocks.COMPARATOR)) {
                     var8.neighborChanged(this, var7, var2, var1, false);
                  }
               }
            } else {
               var8.neighborChanged(this, var7, var2, var1, false);
            }
         }
      }
   }

   @Override
   public Class9755 method6807(BlockPos var1) {
      long var4 = 0L;
      float var6 = 0.0F;
      if (this.isBlockLoaded(var1)) {
         var6 = this.method7000();
         var4 = this.getChunkAt(var1).getInhabitedTime();
      }

      return new Class9755(this.method6997(), this.method6784(), var4, var6);
   }

   @Override
   public int method6808() {
      return this.skylightSubtracted;
   }

   public void setTimeLightningFlash(int var1) {
   }

   @Override
   public WorldBorder getWorldBorder() {
      return this.worldBorder;
   }

   public void sendPacketToServer(IPacket<?> var1) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public DimensionType getDimensionType() {
      return this.dimensionType;
   }

   public RegistryKey<World> getDimensionKey() {
      return this.dimension;
   }

   @Override
   public Random method6814() {
      return this.rand;
   }

   @Override
   public boolean method6815(BlockPos var1, Predicate<BlockState> var2) {
      return var2.test(this.getBlockState(var1));
   }

   public abstract RecipeManager getRecipeManager();

   public abstract ITagCollectionSupplier method6817();

   public BlockPos method6818(int var1, int var2, int var3, int var4) {
      this.updateLCG = this.updateLCG * 3 + 1013904223;
      int var7 = this.updateLCG >> 2;
      return new BlockPos(var1 + (var7 & 15), var2 + (var7 >> 16 & var4), var3 + (var7 >> 8 & 15));
   }

   public boolean method6819() {
      return false;
   }

   public IProfiler getProfiler() {
      return this.profiler.get();
   }

   public Supplier<IProfiler> method6821() {
      return this.profiler;
   }

   @Override
   public BiomeManager getBiomeManager() {
      return this.biomeManager;
   }

   public final boolean isDebug() {
      return this.isDebug;
   }
}
