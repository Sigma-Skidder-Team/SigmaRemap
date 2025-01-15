package net.minecraft.world;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.block.pattern.BlockMaterialMatcher;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.crash.ReportedException;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.RecipeManager;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.particles.IParticleData;
import net.minecraft.profiler.IProfiler;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tags.NetworkTagManager;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeManager;
import net.minecraft.world.border.WorldBorder;
import net.minecraft.world.chunk.AbstractChunkProvider;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.lighting.WorldLightManager;
import net.minecraft.world.server.ChunkHolder;
import net.minecraft.world.storage.MapData;
import net.minecraft.world.storage.WorldInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class World implements IWorld, AutoCloseable
{
    protected static final Logger LOGGER = LogManager.getLogger();
    private static final Direction[] FACING_VALUES = Direction.values();
    public final List<TileEntity> loadedTileEntityList = Lists.newArrayList();
    public final List<TileEntity> tickableTileEntities = Lists.newArrayList();
    protected final List<TileEntity> addedTileEntityList = Lists.newArrayList();
    protected final List<TileEntity> tileEntitiesToBeRemoved = Lists.newArrayList();
    private final Thread mainThread;
    private int skylightSubtracted;
    protected int updateLCG = (new Random()).nextInt();
    protected final int DIST_HASH_MAGIC = 1013904223;
    protected float prevRainingStrength;
    protected float rainingStrength;
    protected float prevThunderingStrength;
    protected float thunderingStrength;
    public final Random rand = new Random();
    public final Dimension dimension;
    protected final AbstractChunkProvider chunkProvider;
    protected final WorldInfo worldInfo;
    private final IProfiler profiler;
    public final boolean isRemote;
    protected boolean processingLoadedTiles;
    private final WorldBorder worldBorder;
    private final BiomeManager biomeManager;

    protected World(WorldInfo p_i1676_1_, DimensionType p_i1676_2_, BiFunction<World, Dimension, AbstractChunkProvider> p_i1676_3_, IProfiler p_i1676_4_, boolean p_i1676_5_)
    {
        this.profiler = p_i1676_4_;
        this.worldInfo = p_i1676_1_;
        this.dimension = p_i1676_2_.create(this);
        this.chunkProvider = p_i1676_3_.apply(this, this.dimension);
        this.isRemote = p_i1676_5_;
        this.worldBorder = this.dimension.createWorldBorder();
        this.mainThread = Thread.currentThread();
        this.biomeManager = new BiomeManager(this, p_i1676_5_ ? p_i1676_1_.getSeed() : WorldInfo.byHashing(p_i1676_1_.getSeed()), p_i1676_2_.getMagnifier());
    }

    public boolean isRemote()
    {
        return this.isRemote;
    }

    @Nullable
    public MinecraftServer getServer()
    {
        return null;
    }

    public void setInitialSpawnLocation()
    {
        this.setSpawnPoint(new BlockPos(8, 64, 8));
    }

    public BlockState getGroundAboveSeaLevel(BlockPos pos)
    {
        BlockPos blockpos;

        for (blockpos = new BlockPos(pos.getX(), this.getSeaLevel(), pos.getZ()); !this.isAirBlock(blockpos.up()); blockpos = blockpos.up())
        {
            ;
        }

        return this.getBlockState(blockpos);
    }

    public static boolean isValid(BlockPos pos)
    {
        return !isOutsideBuildHeight(pos) && pos.getX() >= -30000000 && pos.getZ() >= -30000000 && pos.getX() < 30000000 && pos.getZ() < 30000000;
    }

    public static boolean isOutsideBuildHeight(BlockPos pos)
    {
        return isYOutOfBounds(pos.getY());
    }

    public static boolean isYOutOfBounds(int y)
    {
        return y < 0 || y >= 256;
    }

    public Chunk getChunkAt(BlockPos pos)
    {
        return this.getChunk(pos.getX() >> 4, pos.getZ() >> 4);
    }

    public Chunk getChunk(int chunkX, int chunkZ)
    {
        return (Chunk)this.getChunk(chunkX, chunkZ, ChunkStatus.FULL);
    }

    public IChunk getChunk(int x, int z, ChunkStatus requiredStatus, boolean nonnull)
    {
        IChunk ichunk = this.chunkProvider.getChunk(x, z, requiredStatus, nonnull);

        if (ichunk == null && nonnull)
        {
            throw new IllegalStateException("Should always be able to create a chunk!");
        }
        else
        {
            return ichunk;
        }
    }

    public boolean setBlockState(BlockPos pos, BlockState newState, int flags)
    {
        if (isOutsideBuildHeight(pos))
        {
            return false;
        }
        else if (!this.isRemote && this.worldInfo.getGenerator() == WorldType.DEBUG_ALL_BLOCK_STATES)
        {
            return false;
        }
        else
        {
            Chunk chunk = this.getChunkAt(pos);
            Block block = newState.getBlock();
            BlockState blockstate = chunk.setBlockState(pos, newState, (flags & 64) != 0);

            if (blockstate == null)
            {
                return false;
            }
            else
            {
                BlockState blockstate1 = this.getBlockState(pos);

                if (blockstate1 != blockstate && (blockstate1.getOpacity(this, pos) != blockstate.getOpacity(this, pos) || blockstate1.getLightValue() != blockstate.getLightValue() || blockstate1.isTransparent() || blockstate.isTransparent()))
                {
                    this.profiler.startSection("queueCheckLight");
                    this.getChunkProvider().getLightManager().checkBlock(pos);
                    this.profiler.endSection();
                }

                if (blockstate1 == newState)
                {
                    if (blockstate != blockstate1)
                    {
                        this.markBlockRangeForRenderUpdate(pos, blockstate, blockstate1);
                    }

                    if ((flags & 2) != 0 && (!this.isRemote || (flags & 4) == 0) && (this.isRemote || chunk.getLocationType() != null && chunk.getLocationType().isAtLeast(ChunkHolder.LocationType.TICKING)))
                    {
                        this.notifyBlockUpdate(pos, blockstate, newState, flags);
                    }

                    if (!this.isRemote && (flags & 1) != 0)
                    {
                        this.notifyNeighbors(pos, blockstate.getBlock());

                        if (newState.hasComparatorInputOverride())
                        {
                            this.updateComparatorOutputLevel(pos, block);
                        }
                    }

                    if ((flags & 16) == 0)
                    {
                        int i = flags & -2;
                        blockstate.updateDiagonalNeighbors(this, pos, i);
                        newState.updateNeighbors(this, pos, i);
                        newState.updateDiagonalNeighbors(this, pos, i);
                    }

                    this.onBlockStateChange(pos, blockstate, blockstate1);
                }

                return true;
            }
        }
    }

    public void onBlockStateChange(BlockPos pos, BlockState blockStateIn, BlockState newState)
    {
    }

    public boolean removeBlock(BlockPos pos, boolean isMoving)
    {
        IFluidState ifluidstate = this.getFluidState(pos);
        return this.setBlockState(pos, ifluidstate.getBlockState(), 3 | (isMoving ? 64 : 0));
    }

    public boolean destroyBlock(BlockPos p_225521_1_, boolean p_225521_2_, @Nullable Entity p_225521_3_)
    {
        BlockState blockstate = this.getBlockState(p_225521_1_);

        if (blockstate.isAir())
        {
            return false;
        }
        else
        {
            IFluidState ifluidstate = this.getFluidState(p_225521_1_);
            this.playEvent(2001, p_225521_1_, Block.getStateId(blockstate));

            if (p_225521_2_)
            {
                TileEntity tileentity = blockstate.getBlock().hasTileEntity() ? this.getTileEntity(p_225521_1_) : null;
                Block.spawnDrops(blockstate, this, p_225521_1_, tileentity, p_225521_3_, ItemStack.EMPTY);
            }

            return this.setBlockState(p_225521_1_, ifluidstate.getBlockState(), 3);
        }
    }

    public boolean setBlockState(BlockPos pos, BlockState state)
    {
        return this.setBlockState(pos, state, 3);
    }

    public abstract void notifyBlockUpdate(BlockPos pos, BlockState oldState, BlockState newState, int flags);

    public void notifyNeighbors(BlockPos pos, Block blockIn)
    {
        if (this.worldInfo.getGenerator() != WorldType.DEBUG_ALL_BLOCK_STATES)
        {
            this.notifyNeighborsOfStateChange(pos, blockIn);
        }
    }

    public void markBlockRangeForRenderUpdate(BlockPos blockPosIn, BlockState oldState, BlockState newState)
    {
    }

    public void notifyNeighborsOfStateChange(BlockPos pos, Block blockIn)
    {
        this.neighborChanged(pos.west(), blockIn, pos);
        this.neighborChanged(pos.east(), blockIn, pos);
        this.neighborChanged(pos.down(), blockIn, pos);
        this.neighborChanged(pos.up(), blockIn, pos);
        this.neighborChanged(pos.north(), blockIn, pos);
        this.neighborChanged(pos.south(), blockIn, pos);
    }

    public void notifyNeighborsOfStateExcept(BlockPos pos, Block blockType, Direction skipSide)
    {
        if (skipSide != Direction.WEST)
        {
            this.neighborChanged(pos.west(), blockType, pos);
        }

        if (skipSide != Direction.EAST)
        {
            this.neighborChanged(pos.east(), blockType, pos);
        }

        if (skipSide != Direction.DOWN)
        {
            this.neighborChanged(pos.down(), blockType, pos);
        }

        if (skipSide != Direction.UP)
        {
            this.neighborChanged(pos.up(), blockType, pos);
        }

        if (skipSide != Direction.NORTH)
        {
            this.neighborChanged(pos.north(), blockType, pos);
        }

        if (skipSide != Direction.SOUTH)
        {
            this.neighborChanged(pos.south(), blockType, pos);
        }
    }

    public void neighborChanged(BlockPos pos, Block blockIn, BlockPos fromPos)
    {
        if (!this.isRemote)
        {
            BlockState blockstate = this.getBlockState(pos);

            try
            {
                blockstate.neighborChanged(this, pos, blockIn, fromPos, false);
            }
            catch (Throwable throwable)
            {
                CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Exception while updating neighbours");
                CrashReportCategory crashreportcategory = crashreport.makeCategory("Block being updated");
                crashreportcategory.addDetail("Source block type", () ->
                {
                    try {
                        return String.format("ID #%s (%s // %s)", Registry.BLOCK.getKey(blockIn), blockIn.getTranslationKey(), blockIn.getClass().getCanonicalName());
                    }
                    catch (Throwable var2)
                    {
                        return "ID #" + Registry.BLOCK.getKey(blockIn);
                    }
                });
                CrashReportCategory.addBlockInfo(crashreportcategory, pos, blockstate);
                throw new ReportedException(crashreport);
            }
        }
    }

    public int getHeight(Heightmap.Type heightmapType, int x, int z)
    {
        int i;

        if (x >= -30000000 && z >= -30000000 && x < 30000000 && z < 30000000)
        {
            if (this.chunkExists(x >> 4, z >> 4))
            {
                i = this.getChunk(x >> 4, z >> 4).getTopBlockY(heightmapType, x & 15, z & 15) + 1;
            }
            else
            {
                i = 0;
            }
        }
        else
        {
            i = this.getSeaLevel() + 1;
        }

        return i;
    }

    public WorldLightManager getLightManager()
    {
        return this.getChunkProvider().getLightManager();
    }

    public BlockState getBlockState(BlockPos pos)
    {
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

    public IFluidState getFluidState(BlockPos pos)
    {
        if (isOutsideBuildHeight(pos))
        {
            return Fluids.EMPTY.getDefaultState();
        }
        else
        {
            Chunk chunk = this.getChunkAt(pos);
            return chunk.getFluidState(pos);
        }
    }

    public boolean isDaytime()
    {
        return this.dimension.getType() == DimensionType.OVERWORLD && this.skylightSubtracted < 4;
    }

    public boolean isNightTime()
    {
        return this.dimension.getType() == DimensionType.OVERWORLD && !this.isDaytime();
    }

    public void playSound(@Nullable PlayerEntity player, BlockPos pos, SoundEvent soundIn, SoundCategory category, float volume, float pitch)
    {
        this.playSound(player, (double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, soundIn, category, volume, pitch);
    }

    public abstract void playSound(@Nullable PlayerEntity player, double x, double y, double z, SoundEvent soundIn, SoundCategory category, float volume, float pitch);

    public abstract void playMovingSound(@Nullable PlayerEntity playerIn, Entity entityIn, SoundEvent eventIn, SoundCategory categoryIn, float volume, float pitch);

    public void playSound(double x, double y, double z, SoundEvent soundIn, SoundCategory category, float volume, float pitch, boolean distanceDelay)
    {
    }

    public void addParticle(IParticleData particleData, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
    {
    }

    public void addParticle(IParticleData particleData, boolean forceAlwaysRender, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
    {
    }

    public void addOptionalParticle(IParticleData particleData, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
    {
    }

    public void addOptionalParticle(IParticleData particleData, boolean ignoreRange, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed)
    {
    }

    public float getCelestialAngleRadians(float partialTicks)
    {
        float f = this.getCelestialAngle(partialTicks);
        return f * ((float)Math.PI * 2F);
    }

    public boolean addTileEntity(TileEntity tile)
    {
        if (this.processingLoadedTiles)
        {
            LOGGER.error("Adding block entity while ticking: {} @ {}", () ->
            {
                return Registry.BLOCK_ENTITY_TYPE.getKey(tile.getType());
            }, tile::getPos);
        }

        boolean flag = this.loadedTileEntityList.add(tile);

        if (flag && tile instanceof ITickableTileEntity)
        {
            this.tickableTileEntities.add(tile);
        }

        if (this.isRemote)
        {
            BlockPos blockpos = tile.getPos();
            BlockState blockstate = this.getBlockState(blockpos);
            this.notifyBlockUpdate(blockpos, blockstate, blockstate, 2);
        }

        return flag;
    }

    public void addTileEntities(Collection<TileEntity> tileEntityCollection)
    {
        if (this.processingLoadedTiles)
        {
            this.addedTileEntityList.addAll(tileEntityCollection);
        }
        else
        {
            for (TileEntity tileentity : tileEntityCollection)
            {
                this.addTileEntity(tileentity);
            }
        }
    }

    public void tickBlockEntities()
    {
        IProfiler iprofiler = this.getProfiler();
        iprofiler.startSection("blockEntities");

        if (!this.tileEntitiesToBeRemoved.isEmpty())
        {
            this.tickableTileEntities.removeAll(this.tileEntitiesToBeRemoved);
            this.loadedTileEntityList.removeAll(this.tileEntitiesToBeRemoved);
            this.tileEntitiesToBeRemoved.clear();
        }

        this.processingLoadedTiles = true;
        Iterator<TileEntity> iterator = this.tickableTileEntities.iterator();

        while (iterator.hasNext())
        {
            TileEntity tileentity = iterator.next();

            if (!tileentity.isRemoved() && tileentity.hasWorld())
            {
                BlockPos blockpos = tileentity.getPos();

                if (this.chunkProvider.canTick(blockpos) && this.getWorldBorder().contains(blockpos))
                {
                    try
                    {
                        iprofiler.startSection(() ->
                        {
                            return String.valueOf((Object)TileEntityType.getId(tileentity.getType()));
                        });

                        if (tileentity.getType().isValidBlock(this.getBlockState(blockpos).getBlock()))
                        {
                            ((ITickableTileEntity)tileentity).tick();
                        }
                        else
                        {
                            tileentity.warnInvalidBlock();
                        }

                        iprofiler.endSection();
                    }
                    catch (Throwable throwable)
                    {
                        CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Ticking block entity");
                        CrashReportCategory crashreportcategory = crashreport.makeCategory("Block entity being ticked");
                        tileentity.addInfoToCrashReport(crashreportcategory);
                        throw new ReportedException(crashreport);
                    }
                }
            }

            if (tileentity.isRemoved())
            {
                iterator.remove();
                this.loadedTileEntityList.remove(tileentity);

                if (this.isBlockLoaded(tileentity.getPos()))
                {
                    this.getChunkAt(tileentity.getPos()).removeTileEntity(tileentity.getPos());
                }
            }
        }

        this.processingLoadedTiles = false;
        iprofiler.endStartSection("pendingBlockEntities");

        if (!this.addedTileEntityList.isEmpty())
        {
            for (int i = 0; i < this.addedTileEntityList.size(); ++i)
            {
                TileEntity tileentity1 = this.addedTileEntityList.get(i);

                if (!tileentity1.isRemoved())
                {
                    if (!this.loadedTileEntityList.contains(tileentity1))
                    {
                        this.addTileEntity(tileentity1);
                    }

                    if (this.isBlockLoaded(tileentity1.getPos()))
                    {
                        Chunk chunk = this.getChunkAt(tileentity1.getPos());
                        BlockState blockstate = chunk.getBlockState(tileentity1.getPos());
                        chunk.addTileEntity(tileentity1.getPos(), tileentity1);
                        this.notifyBlockUpdate(tileentity1.getPos(), blockstate, blockstate, 3);
                    }
                }
            }

            this.addedTileEntityList.clear();
        }

        iprofiler.endSection();
    }

    public void guardEntityTick(Consumer<Entity> consumerEntity, Entity entityIn)
    {
        try
        {
            consumerEntity.accept(entityIn);
        }
        catch (Throwable throwable)
        {
            CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Ticking entity");
            CrashReportCategory crashreportcategory = crashreport.makeCategory("Entity being ticked");
            entityIn.fillCrashReport(crashreportcategory);
            throw new ReportedException(crashreport);
        }
    }

    public boolean checkBlockCollision(AxisAlignedBB bb)
    {
        int i = MathHelper.floor(bb.minX);
        int j = MathHelper.ceil(bb.maxX);
        int k = MathHelper.floor(bb.minY);
        int l = MathHelper.ceil(bb.maxY);
        int i1 = MathHelper.floor(bb.minZ);
        int j1 = MathHelper.ceil(bb.maxZ);

        try (BlockPos.PooledMutable blockpos$pooledmutable = BlockPos.PooledMutable.retain())
        {
            for (int k1 = i; k1 < j; ++k1)
            {
                for (int l1 = k; l1 < l; ++l1)
                {
                    for (int i2 = i1; i2 < j1; ++i2)
                    {
                        BlockState blockstate = this.getBlockState(blockpos$pooledmutable.setPos(k1, l1, i2));

                        if (!blockstate.isAir())
                        {
                            boolean flag = true;
                            return flag;
                        }
                    }
                }
            }

            return false;
        }
    }

    public boolean isFlammableWithin(AxisAlignedBB bb)
    {
        int i = MathHelper.floor(bb.minX);
        int j = MathHelper.ceil(bb.maxX);
        int k = MathHelper.floor(bb.minY);
        int l = MathHelper.ceil(bb.maxY);
        int i1 = MathHelper.floor(bb.minZ);
        int j1 = MathHelper.ceil(bb.maxZ);

        if (this.isAreaLoaded(i, k, i1, j, l, j1))
        {
            try (BlockPos.PooledMutable blockpos$pooledmutable = BlockPos.PooledMutable.retain())
            {
                for (int k1 = i; k1 < j; ++k1)
                {
                    for (int l1 = k; l1 < l; ++l1)
                    {
                        for (int i2 = i1; i2 < j1; ++i2)
                        {
                            Block block = this.getBlockState(blockpos$pooledmutable.setPos(k1, l1, i2)).getBlock();

                            if (block == Blocks.FIRE || block == Blocks.LAVA)
                            {
                                boolean flag = true;
                                return flag;
                            }
                        }
                    }
                }

                return false;
            }
        }
        else
        {
            return false;
        }
    }

    @Nullable
    public BlockState findBlockstateInArea(AxisAlignedBB area, Block blockIn)
    {
        int i = MathHelper.floor(area.minX);
        int j = MathHelper.ceil(area.maxX);
        int k = MathHelper.floor(area.minY);
        int l = MathHelper.ceil(area.maxY);
        int i1 = MathHelper.floor(area.minZ);
        int j1 = MathHelper.ceil(area.maxZ);

        if (this.isAreaLoaded(i, k, i1, j, l, j1))
        {
            try (BlockPos.PooledMutable blockpos$pooledmutable = BlockPos.PooledMutable.retain())
            {
                for (int k1 = i; k1 < j; ++k1)
                {
                    for (int l1 = k; l1 < l; ++l1)
                    {
                        for (int i2 = i1; i2 < j1; ++i2)
                        {
                            BlockState blockstate = this.getBlockState(blockpos$pooledmutable.setPos(k1, l1, i2));

                            if (blockstate.getBlock() == blockIn)
                            {
                                return blockstate;
                            }
                        }
                    }
                }

                return null;
            }
        }
        else
        {
            return null;
        }
    }

    public boolean isMaterialInBB(AxisAlignedBB bb, Material materialIn)
    {
        int i = MathHelper.floor(bb.minX);
        int j = MathHelper.ceil(bb.maxX);
        int k = MathHelper.floor(bb.minY);
        int l = MathHelper.ceil(bb.maxY);
        int i1 = MathHelper.floor(bb.minZ);
        int j1 = MathHelper.ceil(bb.maxZ);
        BlockMaterialMatcher blockmaterialmatcher = BlockMaterialMatcher.forMaterial(materialIn);
        return BlockPos.getAllInBox(i, k, i1, j - 1, l - 1, j1 - 1).anyMatch((p_217397_2_) ->
        {
            return blockmaterialmatcher.test(this.getBlockState(p_217397_2_));
        });
    }

    public Explosion createExplosion(@Nullable Entity entityIn, double xIn, double yIn, double zIn, float explosionRadius, Explosion.Mode modeIn)
    {
        return this.createExplosion(entityIn, (DamageSource)null, xIn, yIn, zIn, explosionRadius, false, modeIn);
    }

    public Explosion createExplosion(@Nullable Entity entityIn, double xIn, double yIn, double zIn, float explosionRadius, boolean causesFire, Explosion.Mode modeIn)
    {
        return this.createExplosion(entityIn, (DamageSource)null, xIn, yIn, zIn, explosionRadius, causesFire, modeIn);
    }

    public Explosion createExplosion(@Nullable Entity entityIn, @Nullable DamageSource damageSourceIn, double xIn, double yIn, double zIn, float explosionRadius, boolean causesFire, Explosion.Mode modeIn)
    {
        Explosion explosion = new Explosion(this, entityIn, xIn, yIn, zIn, explosionRadius, causesFire, modeIn);

        if (damageSourceIn != null)
        {
            explosion.setDamageSource(damageSourceIn);
        }

        explosion.doExplosionA();
        explosion.doExplosionB(true);
        return explosion;
    }

    public boolean extinguishFire(@Nullable PlayerEntity player, BlockPos pos, Direction side)
    {
        pos = pos.offset(side);

        if (this.getBlockState(pos).getBlock() == Blocks.FIRE)
        {
            this.playEvent(player, 1009, pos, 0);
            this.removeBlock(pos, false);
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getProviderName()
    {
        return this.chunkProvider.makeString();
    }

    @Nullable
    public TileEntity getTileEntity(BlockPos pos)
    {
        if (isOutsideBuildHeight(pos))
        {
            return null;
        }
        else if (!this.isRemote && Thread.currentThread() != this.mainThread)
        {
            return null;
        }
        else
        {
            TileEntity tileentity = null;

            if (this.processingLoadedTiles)
            {
                tileentity = this.getPendingTileEntityAt(pos);
            }

            if (tileentity == null)
            {
                tileentity = this.getChunkAt(pos).getTileEntity(pos, Chunk.CreateEntityType.IMMEDIATE);
            }

            if (tileentity == null)
            {
                tileentity = this.getPendingTileEntityAt(pos);
            }

            return tileentity;
        }
    }

    @Nullable
    private TileEntity getPendingTileEntityAt(BlockPos pos)
    {
        for (int i = 0; i < this.addedTileEntityList.size(); ++i)
        {
            TileEntity tileentity = this.addedTileEntityList.get(i);

            if (!tileentity.isRemoved() && tileentity.getPos().equals(pos))
            {
                return tileentity;
            }
        }

        return null;
    }

    public void setTileEntity(BlockPos pos, @Nullable TileEntity tileEntityIn)
    {
        if (!isOutsideBuildHeight(pos))
        {
            if (tileEntityIn != null && !tileEntityIn.isRemoved())
            {
                if (this.processingLoadedTiles)
                {
                    tileEntityIn.setWorldAndPos(this, pos);
                    Iterator<TileEntity> iterator = this.addedTileEntityList.iterator();

                    while (iterator.hasNext())
                    {
                        TileEntity tileentity = iterator.next();

                        if (tileentity.getPos().equals(pos))
                        {
                            tileentity.remove();
                            iterator.remove();
                        }
                    }

                    this.addedTileEntityList.add(tileEntityIn);
                }
                else
                {
                    this.getChunkAt(pos).addTileEntity(pos, tileEntityIn);
                    this.addTileEntity(tileEntityIn);
                }
            }
        }
    }

    public void removeTileEntity(BlockPos pos)
    {
        TileEntity tileentity = this.getTileEntity(pos);

        if (tileentity != null && this.processingLoadedTiles)
        {
            tileentity.remove();
            this.addedTileEntityList.remove(tileentity);
        }
        else
        {
            if (tileentity != null)
            {
                this.addedTileEntityList.remove(tileentity);
                this.loadedTileEntityList.remove(tileentity);
                this.tickableTileEntities.remove(tileentity);
            }

            this.getChunkAt(pos).removeTileEntity(pos);
        }
    }

    public boolean isBlockPresent(BlockPos pos)
    {
        return isOutsideBuildHeight(pos) ? false : this.chunkProvider.chunkExists(pos.getX() >> 4, pos.getZ() >> 4);
    }

    public boolean isTopSolid(BlockPos pos, Entity entityIn)
    {
        if (isOutsideBuildHeight(pos))
        {
            return false;
        }
        else
        {
            IChunk ichunk = this.getChunk(pos.getX() >> 4, pos.getZ() >> 4, ChunkStatus.FULL, false);
            return ichunk == null ? false : ichunk.getBlockState(pos).isTopSolid(this, pos, entityIn);
        }
    }

    public void calculateInitialSkylight()
    {
        double d0 = 1.0D - (double)(this.getRainStrength(1.0F) * 5.0F) / 16.0D;
        double d1 = 1.0D - (double)(this.getThunderStrength(1.0F) * 5.0F) / 16.0D;
        double d2 = 0.5D + 2.0D * MathHelper.clamp((double)MathHelper.cos(this.getCelestialAngle(1.0F) * ((float)Math.PI * 2F)), -0.25D, 0.25D);
        this.skylightSubtracted = (int)((1.0D - d2 * d0 * d1) * 11.0D);
    }

    public void setAllowedSpawnTypes(boolean hostile, boolean peaceful)
    {
        this.getChunkProvider().setAllowedSpawnTypes(hostile, peaceful);
    }

    protected void calculateInitialWeather()
    {
        if (this.worldInfo.isRaining())
        {
            this.rainingStrength = 1.0F;

            if (this.worldInfo.isThundering())
            {
                this.thunderingStrength = 1.0F;
            }
        }
    }

    public void close() throws IOException
    {
        this.chunkProvider.close();
    }

    @Nullable
    public IBlockReader getBlockReader(int chunkX, int chunkZ)
    {
        return this.getChunk(chunkX, chunkZ, ChunkStatus.FULL, false);
    }

    public List<Entity> getEntitiesInAABBexcluding(@Nullable Entity entityIn, AxisAlignedBB boundingBox, @Nullable Predicate <? super Entity > predicate)
    {
        this.getProfiler().func_230035_c_("getEntities");
        List<Entity> list = Lists.newArrayList();
        int i = MathHelper.floor((boundingBox.minX - 2.0D) / 16.0D);
        int j = MathHelper.floor((boundingBox.maxX + 2.0D) / 16.0D);
        int k = MathHelper.floor((boundingBox.minZ - 2.0D) / 16.0D);
        int l = MathHelper.floor((boundingBox.maxZ + 2.0D) / 16.0D);

        for (int i1 = i; i1 <= j; ++i1)
        {
            for (int j1 = k; j1 <= l; ++j1)
            {
                Chunk chunk = this.getChunkProvider().getChunk(i1, j1, false);

                if (chunk != null)
                {
                    chunk.getEntitiesWithinAABBForEntity(entityIn, boundingBox, list, predicate);
                }
            }
        }

        return list;
    }

    public <T extends Entity> List<T> getEntitiesWithinAABB(@Nullable EntityType<T> type, AxisAlignedBB boundingBox, Predicate <? super T > predicate)
    {
        this.getProfiler().func_230035_c_("getEntities");
        int i = MathHelper.floor((boundingBox.minX - 2.0D) / 16.0D);
        int j = MathHelper.ceil((boundingBox.maxX + 2.0D) / 16.0D);
        int k = MathHelper.floor((boundingBox.minZ - 2.0D) / 16.0D);
        int l = MathHelper.ceil((boundingBox.maxZ + 2.0D) / 16.0D);
        List<T> list = Lists.newArrayList();

        for (int i1 = i; i1 < j; ++i1)
        {
            for (int j1 = k; j1 < l; ++j1)
            {
                Chunk chunk = this.getChunkProvider().getChunk(i1, j1, false);

                if (chunk != null)
                {
                    chunk.getEntitiesWithinAABBForList(type, boundingBox, list, predicate);
                }
            }
        }

        return list;
    }

    public <T extends Entity> List<T> getEntitiesWithinAABB(Class <? extends T > clazz, AxisAlignedBB aabb, @Nullable Predicate <? super T > filter)
    {
        this.getProfiler().func_230035_c_("getEntities");
        int i = MathHelper.floor((aabb.minX - 2.0D) / 16.0D);
        int j = MathHelper.ceil((aabb.maxX + 2.0D) / 16.0D);
        int k = MathHelper.floor((aabb.minZ - 2.0D) / 16.0D);
        int l = MathHelper.ceil((aabb.maxZ + 2.0D) / 16.0D);
        List<T> list = Lists.newArrayList();
        AbstractChunkProvider abstractchunkprovider = this.getChunkProvider();

        for (int i1 = i; i1 < j; ++i1)
        {
            for (int j1 = k; j1 < l; ++j1)
            {
                Chunk chunk = abstractchunkprovider.getChunk(i1, j1, false);

                if (chunk != null)
                {
                    chunk.getEntitiesOfTypeWithinAABB(clazz, aabb, list, filter);
                }
            }
        }

        return list;
    }

    public <T extends Entity> List<T> getLoadedEntitiesWithinAABB(Class <? extends T > p_225316_1_, AxisAlignedBB p_225316_2_, @Nullable Predicate <? super T > p_225316_3_)
    {
        this.getProfiler().func_230035_c_("getLoadedEntities");
        int i = MathHelper.floor((p_225316_2_.minX - 2.0D) / 16.0D);
        int j = MathHelper.ceil((p_225316_2_.maxX + 2.0D) / 16.0D);
        int k = MathHelper.floor((p_225316_2_.minZ - 2.0D) / 16.0D);
        int l = MathHelper.ceil((p_225316_2_.maxZ + 2.0D) / 16.0D);
        List<T> list = Lists.newArrayList();
        AbstractChunkProvider abstractchunkprovider = this.getChunkProvider();

        for (int i1 = i; i1 < j; ++i1)
        {
            for (int j1 = k; j1 < l; ++j1)
            {
                Chunk chunk = abstractchunkprovider.func_225313_a(i1, j1);

                if (chunk != null)
                {
                    chunk.getEntitiesOfTypeWithinAABB(p_225316_1_, p_225316_2_, list, p_225316_3_);
                }
            }
        }

        return list;
    }

    @Nullable
    public abstract Entity getEntityByID(int id);

    public void markChunkDirty(BlockPos pos, TileEntity unusedTileEntity)
    {
        if (this.isBlockLoaded(pos))
        {
            this.getChunkAt(pos).markDirty();
        }
    }

    public int getSeaLevel()
    {
        return 63;
    }

    public World getWorld()
    {
        return this;
    }

    public WorldType getWorldType()
    {
        return this.worldInfo.getGenerator();
    }

    public int getStrongPower(BlockPos pos)
    {
        int i = 0;
        i = Math.max(i, this.getStrongPower(pos.down(), Direction.DOWN));

        if (i >= 15)
        {
            return i;
        }
        else
        {
            i = Math.max(i, this.getStrongPower(pos.up(), Direction.UP));

            if (i >= 15)
            {
                return i;
            }
            else
            {
                i = Math.max(i, this.getStrongPower(pos.north(), Direction.NORTH));

                if (i >= 15)
                {
                    return i;
                }
                else
                {
                    i = Math.max(i, this.getStrongPower(pos.south(), Direction.SOUTH));

                    if (i >= 15)
                    {
                        return i;
                    }
                    else
                    {
                        i = Math.max(i, this.getStrongPower(pos.west(), Direction.WEST));

                        if (i >= 15)
                        {
                            return i;
                        }
                        else
                        {
                            i = Math.max(i, this.getStrongPower(pos.east(), Direction.EAST));
                            return i >= 15 ? i : i;
                        }
                    }
                }
            }
        }
    }

    public boolean isSidePowered(BlockPos pos, Direction side)
    {
        return this.getRedstonePower(pos, side) > 0;
    }

    public int getRedstonePower(BlockPos pos, Direction facing)
    {
        BlockState blockstate = this.getBlockState(pos);
        return blockstate.isNormalCube(this, pos) ? this.getStrongPower(pos) : blockstate.getWeakPower(this, pos, facing);
    }

    public boolean isBlockPowered(BlockPos pos)
    {
        if (this.getRedstonePower(pos.down(), Direction.DOWN) > 0)
        {
            return true;
        }
        else if (this.getRedstonePower(pos.up(), Direction.UP) > 0)
        {
            return true;
        }
        else if (this.getRedstonePower(pos.north(), Direction.NORTH) > 0)
        {
            return true;
        }
        else if (this.getRedstonePower(pos.south(), Direction.SOUTH) > 0)
        {
            return true;
        }
        else if (this.getRedstonePower(pos.west(), Direction.WEST) > 0)
        {
            return true;
        }
        else
        {
            return this.getRedstonePower(pos.east(), Direction.EAST) > 0;
        }
    }

    public int getRedstonePowerFromNeighbors(BlockPos pos)
    {
        int i = 0;

        for (Direction direction : FACING_VALUES)
        {
            int j = this.getRedstonePower(pos.offset(direction), direction);

            if (j >= 15)
            {
                return 15;
            }

            if (j > i)
            {
                i = j;
            }
        }

        return i;
    }

    public void sendQuittingDisconnectingPacket()
    {
    }

    public void setGameTime(long worldTime)
    {
        this.worldInfo.setGameTime(worldTime);
    }

    public long getSeed()
    {
        return this.worldInfo.getSeed();
    }

    public long getGameTime()
    {
        return this.worldInfo.getGameTime();
    }

    public long getDayTime()
    {
        return this.worldInfo.getDayTime();
    }

    public void setDayTime(long time)
    {
        this.worldInfo.setDayTime(time);
    }

    protected void advanceTime()
    {
        this.setGameTime(this.worldInfo.getGameTime() + 1L);

        if (this.worldInfo.getGameRulesInstance().getBoolean(GameRules.DO_DAYLIGHT_CYCLE))
        {
            this.setDayTime(this.worldInfo.getDayTime() + 1L);
        }
    }

    public BlockPos getSpawnPoint()
    {
        BlockPos blockpos = new BlockPos(this.worldInfo.getSpawnX(), this.worldInfo.getSpawnY(), this.worldInfo.getSpawnZ());

        if (!this.getWorldBorder().contains(blockpos))
        {
            blockpos = this.getHeight(Heightmap.Type.MOTION_BLOCKING, new BlockPos(this.getWorldBorder().getCenterX(), 0.0D, this.getWorldBorder().getCenterZ()));
        }

        return blockpos;
    }

    public void setSpawnPoint(BlockPos pos)
    {
        this.worldInfo.setSpawn(pos);
    }

    public boolean isBlockModifiable(PlayerEntity player, BlockPos pos)
    {
        return true;
    }

    public void setEntityState(Entity entityIn, byte state)
    {
    }

    public AbstractChunkProvider getChunkProvider()
    {
        return this.chunkProvider;
    }

    public void addBlockEvent(BlockPos pos, Block blockIn, int eventID, int eventParam)
    {
        this.getBlockState(pos).onBlockEventReceived(this, pos, eventID, eventParam);
    }

    public WorldInfo getWorldInfo()
    {
        return this.worldInfo;
    }

    public GameRules getGameRules()
    {
        return this.worldInfo.getGameRulesInstance();
    }

    public float getThunderStrength(float delta)
    {
        return MathHelper.lerp(delta, this.prevThunderingStrength, this.thunderingStrength) * this.getRainStrength(delta);
    }

    public void setThunderStrength(float strength)
    {
        this.prevThunderingStrength = strength;
        this.thunderingStrength = strength;
    }

    public float getRainStrength(float delta)
    {
        return MathHelper.lerp(delta, this.prevRainingStrength, this.rainingStrength);
    }

    public void setRainStrength(float strength)
    {
        this.prevRainingStrength = strength;
        this.rainingStrength = strength;
    }

    public boolean isThundering()
    {
        if (this.dimension.hasSkyLight() && !this.dimension.isNether())
        {
            return (double)this.getThunderStrength(1.0F) > 0.9D;
        }
        else
        {
            return false;
        }
    }

    public boolean isRaining()
    {
        return (double)this.getRainStrength(1.0F) > 0.2D;
    }

    public boolean isRainingAt(BlockPos position)
    {
        if (!this.isRaining())
        {
            return false;
        }
        else if (!this.canSeeSky(position))
        {
            return false;
        }
        else if (this.getHeight(Heightmap.Type.MOTION_BLOCKING, position).getY() > position.getY())
        {
            return false;
        }
        else
        {
            return this.getBiome(position).getPrecipitation() == Biome.RainType.RAIN;
        }
    }

    public boolean isBlockinHighHumidity(BlockPos pos)
    {
        Biome biome = this.getBiome(pos);
        return biome.isHighHumidity();
    }

    @Nullable
    public abstract MapData getMapData(String mapName);

    public abstract void registerMapData(MapData mapDataIn);

    public abstract int getNextMapId();

    public void playBroadcastSound(int id, BlockPos pos, int data)
    {
    }

    public int getActualHeight()
    {
        return this.dimension.isNether() ? 128 : 256;
    }

    public CrashReportCategory fillCrashReport(CrashReport report)
    {
        CrashReportCategory crashreportcategory = report.makeCategoryDepth("Affected level", 1);
        crashreportcategory.addDetail("All players", () ->
        {
            return this.getPlayers().size() + " total; " + this.getPlayers();
        });
        crashreportcategory.addDetail("Chunk stats", this.chunkProvider::makeString);
        crashreportcategory.addDetail("Level dimension", () ->
        {
            return this.dimension.getType().toString();
        });

        try
        {
            this.worldInfo.addToCrashReport(crashreportcategory);
        }
        catch (Throwable throwable)
        {
            crashreportcategory.addCrashSectionThrowable("Level Data Unobtainable", throwable);
        }

        return crashreportcategory;
    }

    public abstract void sendBlockBreakProgress(int breakerId, BlockPos pos, int progress);

    public void makeFireworks(double x, double y, double z, double motionX, double motionY, double motionZ, @Nullable CompoundNBT compound)
    {
    }

    public abstract Scoreboard getScoreboard();

    public void updateComparatorOutputLevel(BlockPos pos, Block blockIn)
    {
        for (Direction direction : Direction.Plane.HORIZONTAL)
        {
            BlockPos blockpos = pos.offset(direction);

            if (this.isBlockLoaded(blockpos))
            {
                BlockState blockstate = this.getBlockState(blockpos);

                if (blockstate.getBlock() == Blocks.COMPARATOR)
                {
                    blockstate.neighborChanged(this, blockpos, blockIn, pos, false);
                }
                else if (blockstate.isNormalCube(this, blockpos))
                {
                    blockpos = blockpos.offset(direction);
                    blockstate = this.getBlockState(blockpos);

                    if (blockstate.getBlock() == Blocks.COMPARATOR)
                    {
                        blockstate.neighborChanged(this, blockpos, blockIn, pos, false);
                    }
                }
            }
        }
    }

    public DifficultyInstance getDifficultyForLocation(BlockPos pos)
    {
        long i = 0L;
        float f = 0.0F;

        if (this.isBlockLoaded(pos))
        {
            f = this.getCurrentMoonPhaseFactor();
            i = this.getChunkAt(pos).getInhabitedTime();
        }

        return new DifficultyInstance(this.getDifficulty(), this.getDayTime(), i, f);
    }

    public int getSkylightSubtracted()
    {
        return this.skylightSubtracted;
    }

    public void setTimeLightningFlash(int timeFlashIn)
    {
    }

    public WorldBorder getWorldBorder()
    {
        return this.worldBorder;
    }

    public void sendPacketToServer(IPacket<?> packetIn)
    {
        throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
    }

    public Dimension getDimension()
    {
        return this.dimension;
    }

    public Random getRandom()
    {
        return this.rand;
    }

    public boolean hasBlockState(BlockPos p_217375_1_, Predicate<BlockState> p_217375_2_)
    {
        return p_217375_2_.test(this.getBlockState(p_217375_1_));
    }

    public abstract RecipeManager getRecipeManager();

    public abstract NetworkTagManager getTags();

    public BlockPos getBlockRandomPos(int p_217383_1_, int p_217383_2_, int p_217383_3_, int p_217383_4_)
    {
        this.updateLCG = this.updateLCG * 3 + 1013904223;
        int i = this.updateLCG >> 2;
        return new BlockPos(p_217383_1_ + (i & 15), p_217383_2_ + (i >> 16 & p_217383_4_), p_217383_3_ + (i >> 8 & 15));
    }

    public boolean isSaveDisabled()
    {
        return false;
    }

    public IProfiler getProfiler()
    {
        return this.profiler;
    }

    public BiomeManager getBiomeManager()
    {
        return this.biomeManager;
    }
}
