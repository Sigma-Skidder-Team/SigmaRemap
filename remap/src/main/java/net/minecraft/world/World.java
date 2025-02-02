// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.world;

import mapped.*;
import net.minecraft.block.pattern.BlockMaterialMatcher;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.chunk.AbstractChunkProvider;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.lighting.WorldLightManager;
import org.apache.logging.log4j.LogManager;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.io.IOException;
import java.util.function.Consumer;
import java.util.Iterator;
import java.util.Collection;
import org.apache.logging.log4j.util.Supplier;
import javax.annotation.Nullable;
import com.google.common.collect.Lists;
import java.util.function.BiFunction;
import java.util.Random;
import java.util.List;
import org.apache.logging.log4j.Logger;

public abstract class World implements Class1851, AutoCloseable
{
    protected static final Logger LOGGER = LogManager.getLogger();
    private static final Direction[] FACING_VALUES = Direction.values();
    public final List<TileEntity> loadedTileEntityList = Lists.newArrayList();
    public final List<TileEntity> tickableTileEntities = Lists.newArrayList();
    protected final List<TileEntity> addedTileEntityList = Lists.newArrayList();
    protected final List<TileEntity> tileEntitiesToBeRemoved = Lists.newArrayList();
    private final Thread mainThread;
    private int skylightSubtracted;
    public int updateLCG = new Random().nextInt();
    public final int DIST_HASH_MAGIC = 1013904223;
    public float prevRainingStrength;
    public float rainingStrength;
    public float prevThunderingStrength;
    public float thunderingStrength;
    public final Random rand = new Random();
    public final Dimension dimension;
    public final AbstractChunkProvider chunkProvider;
    public final WorldInfo worldInfo;
    private final IProfiler profiler;
    public final boolean isRemote;
    public boolean processingLoadedTiles;
    private final WorldBorder worldBorder;
    private final BiomeManager biomeManager;
    
    public World(final WorldInfo p_i1676_1_, final DimensionType p_i1676_2_, final BiFunction<World, Dimension, AbstractChunkProvider> p_i1676_3_, final IProfiler p_i1676_4_, final boolean p_i1676_5_) {
        this.profiler = p_i1676_4_;
        this.worldInfo = p_i1676_1_;
        this.dimension = p_i1676_2_.create(this);
        this.chunkProvider = p_i1676_3_.apply(this, this.dimension);
        this.isRemote = p_i1676_5_;
        this.worldBorder = this.dimension.createWorldBorder();
        this.mainThread = Thread.currentThread();
        this.biomeManager = new BiomeManager(this, p_i1676_5_ ? p_i1676_1_.getSeed() : WorldInfo.byHashing(p_i1676_1_.getSeed()), p_i1676_2_.getMagnifier());
    }
    
    @Override
    public boolean isRemote() {
        return this.isRemote;
    }
    
    @Nullable
    public MinecraftServer getServer() {
        return null;
    }
    
    public void setInitialSpawnLocation() {
        this.setSpawnPoint(new BlockPos(8, 64, 8));
    }
    
    public BlockState getGroundAboveSeaLevel(final BlockPos class354) {
        BlockPos method1137;
        for (method1137 = new BlockPos(class354.getX(), this.method6743(), class354.getZ()); !this.method6961(method1137.method1137()); method1137 = method1137.method1137()) {}
        return this.getBlockState(method1137);
    }
    
    public static boolean method6682(final BlockPos class354) {
        if (!isOutsideBuildHeight(class354)) {
            if (class354.getX() >= -30000000) {
                if (class354.getZ() >= -30000000) {
                    if (class354.getX() < 30000000) {
                        if (class354.getZ() < 30000000) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean isOutsideBuildHeight(final BlockPos class354) {
        return method6684(class354.getY());
    }
    
    public static boolean method6684(final int n) {
        return n < 0 || n >= 256;
    }
    
    public Chunk method6685(final BlockPos class354) {
        return this.method6686(class354.getX() >> 4, class354.getZ() >> 4);
    }
    
    public Chunk method6686(final int n, final int n2) {
        return (Chunk)this.method6966(n, n2, ChunkStatus.FULL);
    }
    
    @Override
    public IChunk getChunk(final int n, final int n2, final ChunkStatus class9312, final boolean b) {
        final IChunk method7402 = this.chunkProvider.getChunk(n, n2, class9312, b);
        if (method7402 == null && b) {
            throw new IllegalStateException("Should always be able to create a chunk!");
        }
        return method7402;
    }
    
    @Override
    public boolean setBlockState(final BlockPos class354, final BlockState class355, final int n) {
        if (isOutsideBuildHeight(class354)) {
            return false;
        }
        if (!this.isRemote && this.worldInfo.method29570() == Class9505.field40898) {
            return false;
        }
        final Chunk method6685 = this.method6685(class354);
        final Block method6686 = class355.getBlock();
        final BlockState method6687 = method6685.method7008(class354, class355, (n & 0x40) != 0x0);
        if (method6687 != null) {
            final BlockState method6688 = this.getBlockState(class354);
            Label_0091: {
                if (method6688 != method6687) {
                    if (method6688.getOpacity(this, class354) == method6687.getOpacity(this, class354)) {
                        if (method6688.getLightValue() == method6687.getLightValue()) {
                            if (!method6688.method21703()) {
                                if (!method6687.method21703()) {
                                    break Label_0091;
                                }
                            }
                        }
                    }
                    this.profiler.startSection("queueCheckLight");
                    this.getChunkProvider().getLightManager().checkBlock(class354);
                    this.profiler.endSection();
                }
            }
            if (method6688 == class355) {
                if (method6687 != method6688) {
                    this.markBlockRangeForRenderUpdate(class354, method6687, method6688);
                }
                Label_0213: {
                    if ((n & 0x2) != 0x0) {
                        if (!this.isRemote || (n & 0x4) == 0x0) {
                            if (!this.isRemote) {
                                if (method6685.method7073() == null) {
                                    break Label_0213;
                                }
                                if (!method6685.method7073().method8321(Class2152.field12788)) {
                                    break Label_0213;
                                }
                            }
                            this.method6693(class354, method6687, class355, n);
                        }
                    }
                }
                if (!this.isRemote) {
                    if ((n & 0x1) != 0x0) {
                        this.method6694(class354, method6687.getBlock());
                        if (class355.method21716()) {
                            this.method6783(class354, method6686);
                        }
                    }
                }
                if ((n & 0x10) == 0x0) {
                    final int n2 = n & 0xFFFFFFFE;
                    method6687.method21736(this, class354, n2);
                    class355.method21735(this, class354, n2);
                    class355.method21736(this, class354, n2);
                }
                this.method6689(class354, method6687, method6688);
            }
            return true;
        }
        return false;
    }
    
    public void method6689(final BlockPos class354, final BlockState class355, final BlockState class356) {
    }
    
    @Override
    public boolean method6690(final BlockPos class354, final boolean b) {
        return this.setBlockState(class354, this.getFluidState(class354).getBlockState(), 0x3 | (b ? 64 : 0));
    }
    
    @Override
    public boolean method6691(final BlockPos class354, final boolean b, final Entity class355) {
        final BlockState method6701 = this.getBlockState(class354);
        if (!method6701.method21706()) {
            final IFluidState method6702 = this.getFluidState(class354);
            this.method6955(2001, class354, Block.method11774(method6701));
            if (b) {
                Block.spawnAsEntity(method6701, this, class354, method6701.getBlock().method11802() ? this.getTileEntity(class354) : null, class355, ItemStack.EMPTY);
            }
            return this.setBlockState(class354, method6702.getBlockState(), 3);
        }
        return false;
    }
    
    public boolean method6692(final BlockPos class354, final BlockState class355) {
        return this.setBlockState(class354, class355, 3);
    }
    
    public abstract void method6693(final BlockPos p0, final BlockState p1, final BlockState p2, final int p3);
    
    @Override
    public void method6694(final BlockPos class354, final Block class355) {
        if (this.worldInfo.method29570() != Class9505.field40898) {
            this.method6696(class354, class355);
        }
    }
    
    public void markBlockRangeForRenderUpdate(final BlockPos class354, final BlockState class355, final BlockState class356) {
    }
    
    public void method6696(final BlockPos class354, final Block class355) {
        this.method6698(class354.method1145(), class355, class354);
        this.method6698(class354.method1147(), class355, class354);
        this.method6698(class354.method1139(), class355, class354);
        this.method6698(class354.method1137(), class355, class354);
        this.method6698(class354.method1141(), class355, class354);
        this.method6698(class354.method1143(), class355, class354);
    }
    
    public void method6697(final BlockPos class354, final Block class355, final Direction class356) {
        if (class356 != Direction.WEST) {
            this.method6698(class354.method1145(), class355, class354);
        }
        if (class356 != Direction.EAST) {
            this.method6698(class354.method1147(), class355, class354);
        }
        if (class356 != Direction.DOWN) {
            this.method6698(class354.method1139(), class355, class354);
        }
        if (class356 != Direction.UP) {
            this.method6698(class354.method1137(), class355, class354);
        }
        if (class356 != Direction.NORTH) {
            this.method6698(class354.method1141(), class355, class354);
        }
        if (class356 != Direction.SOUTH) {
            this.method6698(class354.method1143(), class355, class354);
        }
    }
    
    public void method6698(final BlockPos class354, final Block blockIn, final BlockPos class356) {
        if (!this.isRemote) {
            final BlockState method6701 = this.getBlockState(class354);
            try {
                method6701.method21734(this, class354, blockIn, class356, false);
            }
            catch (final Throwable t) {
                final CrashReport method6702 = CrashReport.makeCrashReport(t, "Exception while updating neighbours");
                final CrashReportCategory method6703 = method6702.makeCategory("Block being updated");
                method6703.addDetail("Source block type", () -> {
                    try {
                        return String.format("ID #%s (%s // %s)", Registry.BLOCK.getKey(blockIn), blockIn.getTranslationKey(), blockIn.getClass().getCanonicalName());
                    }
                    catch (final Throwable t2) {
                        return "ID #" + Registry.BLOCK.getKey(blockIn);
                    }
                });
                CrashReportCategory.method16304(method6703, class354, method6701);
                throw new ReportedException(method6702);
            }
        }
    }
    
    @Override
    public int method6699(final HeightmapType class2020, final int n, final int n2) {
        if (n >= -30000000) {
            if (n2 >= -30000000) {
                if (n < 30000000) {
                    if (n2 < 30000000) {
                        if (!this.method6814(n >> 4, n2 >> 4)) {
                            return 0;
                        }
                        return this.method6686(n >> 4, n2 >> 4).method7018(class2020, n & 0xF, n2 & 0xF) + 1;
                    }
                }
            }
        }
        return this.method6743() + 1;
    }
    
    @Override
    public WorldLightManager method6700() {
        return this.getChunkProvider().getLightManager();
    }
    
    @Override
    public BlockState getBlockState(final BlockPos class354) {
        if (!isOutsideBuildHeight(class354)) {
            return this.method6686(class354.getX() >> 4, class354.getZ() >> 4).getBlockState(class354);
        }
        return Blocks.VOID_AIR.getDefaultState();
    }
    
    @Override
    public IFluidState getFluidState(final BlockPos class354) {
        if (!isOutsideBuildHeight(class354)) {
            return this.method6685(class354).getFluidState(class354);
        }
        return Class7558.field29974.getDefaultState();
    }
    
    public boolean method6703() {
        return this.dimension.getType() == DimensionType.field2223 && this.skylightSubtracted < 4;
    }
    
    public boolean method6704() {
        return this.dimension.getType() == DimensionType.field2223 && !this.method6703();
    }
    
    @Override
    public void method6705(final PlayerEntity playerEntity, final BlockPos class513, final Class7795 class514, final Class286 class515, final float n, final float n2) {
        this.method6706(playerEntity, class513.getX() + 0.5, class513.getY() + 0.5, class513.getZ() + 0.5, class514, class515, n, n2);
    }
    
    public abstract void method6706(final PlayerEntity p0, final double p1, final double p2, final double p3, final Class7795 p4, final Class286 p5, final float p6, final float p7);
    
    public abstract void method6707(final PlayerEntity p0, final Entity p1, final Class7795 p2, final Class286 p3, final float p4, final float p5);
    
    public void method6708(final double n, final double n2, final double n3, final Class7795 class7795, final Class286 class7796, final float n4, final float n5, final boolean b) {
    }
    
    @Override
    public void method6709(final IParticleData IParticleData, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
    }
    
    public void method6710(final IParticleData IParticleData, final boolean b, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
    }
    
    public void method6711(final IParticleData IParticleData, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
    }
    
    public void method6712(final IParticleData IParticleData, final boolean b, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
    }
    
    public float method6713(final float n) {
        return this.method6952(n) * 6.2831855f;
    }
    
    public boolean method6714(final TileEntity tileEntity) {
        if (this.processingLoadedTiles) {
            World.LOGGER.error("Adding block entity while ticking: {} @ {}", new Supplier[] { () -> Registry.field224.getKey(tileEntity.getType()), tileEntity::getPos});
        }
        final boolean add = this.loadedTileEntityList.add(tileEntity);
        if (add) {
            if (tileEntity instanceof Class439) {
                this.tickableTileEntities.add(tileEntity);
            }
        }
        if (this.isRemote) {
            final BlockPos method2193 = tileEntity.getPos();
            final BlockState method2194 = this.getBlockState(method2193);
            this.method6693(method2193, method2194, method2194, 2);
        }
        return add;
    }
    
    public void method6715(final Collection<TileEntity> collection) {
        if (!this.processingLoadedTiles) {
            final Iterator<TileEntity> iterator = collection.iterator();
            while (iterator.hasNext()) {
                this.method6714(iterator.next());
            }
        }
        else {
            this.addedTileEntityList.addAll(collection);
        }
    }
    
    public void tickBlockEntities() {
        final IProfiler method6796 = this.method6796();
        method6796.startSection("blockEntities");
        if (!this.tileEntitiesToBeRemoved.isEmpty()) {
            this.tickableTileEntities.removeAll(this.tileEntitiesToBeRemoved);
            this.loadedTileEntityList.removeAll(this.tileEntitiesToBeRemoved);
            this.tileEntitiesToBeRemoved.clear();
        }
        this.processingLoadedTiles = true;
        final Iterator<TileEntity> iterator = this.tickableTileEntities.iterator();
        while (iterator.hasNext()) {
            final TileEntity tileEntity = iterator.next();
            if (!tileEntity.isRemoved() && tileEntity.hasWorld()) {
                final BlockPos blockpos = tileEntity.getPos();
                if (this.chunkProvider.canTick(blockpos) && this.getWorldBorder().contains(blockpos)) {
                    try {
                        method6796.method15298(() -> String.valueOf(Class5412.method16520(tileEntity.getType())));
                        if (tileEntity.getType().method16523(this.getBlockState(blockpos).getBlock())) {
                            ((Class439) tileEntity).method2229();
                        }
                        else {
                            tileEntity.method2207();
                        }
                        method6796.endSection();
                    }
                    catch (final Throwable t) {
                        final CrashReport method6798 = CrashReport.makeCrashReport(t, "Ticking block entity");
                        tileEntity.method2202(method6798.makeCategory("Block entity being ticked"));
                        throw new ReportedException(method6798);
                    }
                }
            }
            if (tileEntity.isRemoved()) {
                iterator.remove();
                this.loadedTileEntityList.remove(tileEntity);
                if (!this.method6971(tileEntity.getPos())) {
                    continue;
                }
                this.method6685(tileEntity.getPos()).method7028(tileEntity.getPos());
            }
        }
        this.processingLoadedTiles = false;
        method6796.method15300("pendingBlockEntities");
        if (!this.addedTileEntityList.isEmpty()) {
            for (int i = 0; i < this.addedTileEntityList.size(); ++i) {
                final TileEntity class437 = this.addedTileEntityList.get(i);
                if (!class437.isRemoved()) {
                    if (!this.loadedTileEntityList.contains(class437)) {
                        this.method6714(class437);
                    }
                    if (this.method6971(class437.getPos())) {
                        final Chunk method6799 = this.method6685(class437.getPos());
                        final BlockState method6800 = method6799.getBlockState(class437.getPos());
                        method6799.method7009(class437.getPos(), class437);
                        this.method6693(class437.getPos(), method6800, method6800, 3);
                    }
                }
            }
            this.addedTileEntityList.clear();
        }
        method6796.endSection();
    }
    
    public void method6717(final Consumer<Entity> consumer, final Entity class399) {
        try {
            consumer.accept(class399);
        }
        catch (final Throwable t) {
            final CrashReport method24421 = CrashReport.makeCrashReport(t, "Ticking entity");
            class399.method1862(method24421.makeCategory("Entity being ticked"));
            throw new ReportedException(method24421);
        }
    }
    
    public boolean method6718(final AxisAlignedBB class6221) {
        final int method35644 = MathHelper.floor(class6221.minX);
        final int method35645 = MathHelper.ceil(class6221.maxX);
        final int method35646 = MathHelper.floor(class6221.minY);
        final int method35647 = MathHelper.ceil(class6221.maxY);
        final int method35648 = MathHelper.floor(class6221.minZ);
        final int method35649 = MathHelper.ceil(class6221.maxZ);
        try (final Class386 method35650 = Class386.method1296()) {
            for (int i = method35644; i < method35645; ++i) {
                for (int j = method35646; j < method35647; ++j) {
                    for (int k = method35648; k < method35649; ++k) {
                        if (!this.getBlockState(method35650.method1300(i, j, k)).method21706()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }
    
    public boolean method6719(final AxisAlignedBB class6221) {
        final int method35644 = MathHelper.floor(class6221.minX);
        final int method35645 = MathHelper.ceil(class6221.maxX);
        final int method35646 = MathHelper.floor(class6221.minY);
        final int method35647 = MathHelper.ceil(class6221.maxY);
        final int method35648 = MathHelper.floor(class6221.minZ);
        final int method35649 = MathHelper.ceil(class6221.maxZ);
        if (this.method6973(method35644, method35646, method35648, method35645, method35647, method35649)) {
            try (final Class386 method35650 = Class386.method1296()) {
                for (int i = method35644; i < method35645; ++i) {
                    for (int j = method35646; j < method35647; ++j) {
                        for (int k = method35648; k < method35649; ++k) {
                            final Block method35651 = this.getBlockState(method35650.method1300(i, j, k)).getBlock();
                            if (method35651 == Blocks.FIRE || method35651 == Blocks.field29174) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }
    
    @Nullable
    public BlockState method6720(final AxisAlignedBB class6221, final Block class6222) {
        final int method35644 = MathHelper.floor(class6221.minX);
        final int method35645 = MathHelper.ceil(class6221.maxX);
        final int method35646 = MathHelper.floor(class6221.minY);
        final int method35647 = MathHelper.ceil(class6221.maxY);
        final int method35648 = MathHelper.floor(class6221.minZ);
        final int method35649 = MathHelper.ceil(class6221.maxZ);
        if (this.method6973(method35644, method35646, method35648, method35645, method35647, method35649)) {
            try (final Class386 method35650 = Class386.method1296()) {
                for (int i = method35644; i < method35645; ++i) {
                    for (int j = method35646; j < method35647; ++j) {
                        for (int k = method35648; k < method35649; ++k) {
                            final BlockState method35651 = this.getBlockState(method35650.method1300(i, j, k));
                            if (method35651.getBlock() == class6222) {
                                return method35651;
                            }
                        }
                    }
                }
                return null;
            }
        }
        return null;
    }
    
    public boolean isMaterialInBB(final AxisAlignedBB bb, final Material materialIn) {
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
    
    public Explosion createExplosion(final Entity class399, final double n, final double n2, final double n3, final float n4, final Explosion.Mode class400) {
        return this.createExplosion(class399, null, n, n2, n3, n4, false, class400);
    }
    
    public Explosion method6723(final Entity class399, final double n, final double n2, final double n3, final float n4, final boolean b, final Explosion.Mode class400) {
        return this.createExplosion(class399, null, n, n2, n3, n4, b, class400);
    }
    
    public Explosion createExplosion(final Entity class399, final DamageSource class400, final double n, final double n2, final double n3, final float n4, final boolean b, final Explosion.Mode class401) {
        final Explosion class402 = new Explosion(this, class399, n, n2, n3, n4, b, class401);
        if (class400 != null) {
            class402.method18412(class400);
        }
        class402.doExplosionA();
        class402.method18409(true);
        return class402;
    }
    
    public boolean method6725(final PlayerEntity playerEntity, BlockPos method1149, final Direction class513) {
        method1149 = method1149.method1149(class513);
        if (this.getBlockState(method1149).getBlock() != Blocks.FIRE) {
            return false;
        }
        this.method6839(playerEntity, 1009, method1149, 0);
        this.method6690(method1149, false);
        return true;
    }
    
    public String method6726() {
        return this.chunkProvider.makeString();
    }
    
    @Nullable
    @Override
    public TileEntity getTileEntity(final BlockPos class354) {
        if (isOutsideBuildHeight(class354)) {
            return null;
        }
        if (!this.isRemote && Thread.currentThread() != this.mainThread) {
            return null;
        }
        TileEntity class355 = null;
        if (this.processingLoadedTiles) {
            class355 = this.method6728(class354);
        }
        if (class355 == null) {
            class355 = this.method6685(class354).method7000(class354, Class2079.field12020);
        }
        if (class355 == null) {
            class355 = this.method6728(class354);
        }
        return class355;
    }
    
    @Nullable
    private TileEntity method6728(final BlockPos class354) {
        for (int i = 0; i < this.addedTileEntityList.size(); ++i) {
            final TileEntity class355 = this.addedTileEntityList.get(i);
            if (!class355.isRemoved() && class355.getPos().equals(class354)) {
                return class355;
            }
        }
        return null;
    }
    
    public void method6729(final BlockPos class354, final TileEntity class355) {
        if (!isOutsideBuildHeight(class354)) {
            if (class355 != null) {
                if (!class355.isRemoved()) {
                    if (!this.processingLoadedTiles) {
                        this.method6685(class354).method7009(class354, class355);
                        this.method6714(class355);
                    }
                    else {
                        class355.method2187(this, class354);
                        final Iterator<TileEntity> iterator = this.addedTileEntityList.iterator();
                        while (iterator.hasNext()) {
                            final TileEntity class356 = iterator.next();
                            if (!class356.getPos().equals(class354)) {
                                continue;
                            }
                            class356.method2198();
                            iterator.remove();
                        }
                        this.addedTileEntityList.add(class355);
                    }
                }
            }
        }
    }
    
    public void method6730(final BlockPos class354) {
        final TileEntity method6727 = this.getTileEntity(class354);
        if (method6727 != null && this.processingLoadedTiles) {
            method6727.method2198();
            this.addedTileEntityList.remove(method6727);
        }
        else {
            if (method6727 != null) {
                this.addedTileEntityList.remove(method6727);
                this.loadedTileEntityList.remove(method6727);
                this.tickableTileEntities.remove(method6727);
            }
            this.method6685(class354).method7028(class354);
        }
    }
    
    public boolean method6731(final BlockPos class354) {
        return !isOutsideBuildHeight(class354) && this.chunkProvider.chunkExists(class354.getX() >> 4, class354.getZ() >> 4);
    }
    
    public boolean method6732(final BlockPos class354, final Entity class355) {
        if (!isOutsideBuildHeight(class354)) {
            final IChunk method6687 = this.getChunk(class354.getX() >> 4, class354.getZ() >> 4, ChunkStatus.FULL, false);
            return method6687 != null && method6687.getBlockState(class354).method21731(this, class354, class355);
        }
        return false;
    }
    
    public void method6733() {
        this.skylightSubtracted = (int)((1.0 - (0.5 + 2.0 * MathHelper.clamp(MathHelper.cos(this.method6952(1.0f) * 6.2831855f), -0.25, 0.25)) * (1.0 - this.method6768(1.0f) * 5.0f / 16.0) * (1.0 - this.method6766(1.0f) * 5.0f / 16.0)) * 11.0);
    }
    
    public void method6734(final boolean b, final boolean b2) {
        this.getChunkProvider().setAllowedSpawnTypes(b, b2);
    }
    
    public void method6735() {
        if (this.worldInfo.method29560()) {
            this.rainingStrength = 1.0f;
            if (this.worldInfo.method29556()) {
                this.thunderingStrength = 1.0f;
            }
        }
    }
    
    @Override
    public void close() throws IOException {
        this.chunkProvider.close();
    }
    
    @Nullable
    @Override
    public IBlockReader method6736(final int n, final int n2) {
        return this.getChunk(n, n2, ChunkStatus.FULL, false);
    }
    
    @Override
    public List<Entity> method6737(final Entity class399, final AxisAlignedBB class400, final Predicate<? super Entity> predicate) {
        this.method6796().method15302("getEntities");
        final ArrayList arrayList = Lists.newArrayList();
        final int method35644 = MathHelper.floor((class400.minX - 2.0) / 16.0);
        final int method35645 = MathHelper.floor((class400.maxX + 2.0) / 16.0);
        final int method35646 = MathHelper.floor((class400.minZ - 2.0) / 16.0);
        final int method35647 = MathHelper.floor((class400.maxZ + 2.0) / 16.0);
        for (int i = method35644; i <= method35645; ++i) {
            for (int j = method35646; j <= method35647; ++j) {
                final Chunk method35648 = this.getChunkProvider().getChunk(i, j, false);
                if (method35648 != null) {
                    method35648.method7059(class399, class400, arrayList, predicate);
                }
            }
        }
        return arrayList;
    }
    
    public <T extends Entity> List<T> method6738(final EntityType<T> class7499, final AxisAlignedBB class7500, final Predicate<? super T> predicate) {
        this.method6796().method15302("getEntities");
        final int method35644 = MathHelper.floor((class7500.minX - 2.0) / 16.0);
        final int method35645 = MathHelper.ceil((class7500.maxX + 2.0) / 16.0);
        final int method35646 = MathHelper.floor((class7500.minZ - 2.0) / 16.0);
        final int method35647 = MathHelper.ceil((class7500.maxZ + 2.0) / 16.0);
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = method35644; i < method35645; ++i) {
            for (int j = method35646; j < method35647; ++j) {
                final Chunk method35648 = this.getChunkProvider().getChunk(i, j, false);
                if (method35648 != null) {
                    method35648.method7060(class7499, class7500, arrayList, (Predicate<? super Entity>)predicate);
                }
            }
        }
        return arrayList;
    }
    
    @Override
    public <T extends Entity> List<T> method6739(final Class<? extends T> clazz, final AxisAlignedBB class6221, final Predicate<? super T> predicate) {
        this.method6796().method15302("getEntities");
        final int method35644 = MathHelper.floor((class6221.minX - 2.0) / 16.0);
        final int method35645 = MathHelper.ceil((class6221.maxX + 2.0) / 16.0);
        final int method35646 = MathHelper.floor((class6221.minZ - 2.0) / 16.0);
        final int method35647 = MathHelper.ceil((class6221.maxZ + 2.0) / 16.0);
        final ArrayList arrayList = Lists.newArrayList();
        final AbstractChunkProvider method35648 = this.getChunkProvider();
        for (int i = method35644; i < method35645; ++i) {
            for (int j = method35646; j < method35647; ++j) {
                final Chunk method35649 = method35648.getChunk(i, j, false);
                if (method35649 != null) {
                    method35649.method7061(clazz, class6221, (List<Entity>)arrayList, (Predicate<? super Entity>)predicate);
                }
            }
        }
        return arrayList;
    }
    
    @Override
    public <T extends Entity> List<T> method6740(final Class<? extends T> clazz, final AxisAlignedBB class6221, final Predicate<? super T> predicate) {
        this.method6796().method15302("getLoadedEntities");
        final int method35644 = MathHelper.floor((class6221.minX - 2.0) / 16.0);
        final int method35645 = MathHelper.ceil((class6221.maxX + 2.0) / 16.0);
        final int method35646 = MathHelper.floor((class6221.minZ - 2.0) / 16.0);
        final int method35647 = MathHelper.ceil((class6221.maxZ + 2.0) / 16.0);
        final ArrayList arrayList = Lists.newArrayList();
        final AbstractChunkProvider method35648 = this.getChunkProvider();
        for (int i = method35644; i < method35645; ++i) {
            for (int j = method35646; j < method35647; ++j) {
                final Chunk method35649 = method35648.func_225313_a(i, j);
                if (method35649 != null) {
                    method35649.method7061(clazz, class6221, (List<Entity>)arrayList, (Predicate<? super Entity>)predicate);
                }
            }
        }
        return arrayList;
    }
    
    @Nullable
    public abstract Entity getEntityByID(final int p0);
    
    public void method6742(final BlockPos class354, final TileEntity class355) {
        if (this.method6971(class354)) {
            this.method6685(class354).method7058();
        }
    }
    
    @Override
    public int method6743() {
        return 63;
    }
    
    @Override
    public World method6744() {
        return this;
    }
    
    public Class9505 method6745() {
        return this.worldInfo.method29570();
    }
    
    public int method6746(final BlockPos class354) {
        final int max = Math.max(0, this.method6964(class354.method1139(), Direction.DOWN));
        if (max >= 15) {
            return max;
        }
        final int max2 = Math.max(max, this.method6964(class354.method1137(), Direction.UP));
        if (max2 >= 15) {
            return max2;
        }
        final int max3 = Math.max(max2, this.method6964(class354.method1141(), Direction.NORTH));
        if (max3 >= 15) {
            return max3;
        }
        final int max4 = Math.max(max3, this.method6964(class354.method1143(), Direction.SOUTH));
        if (max4 >= 15) {
            return max4;
        }
        final int max5 = Math.max(max4, this.method6964(class354.method1145(), Direction.WEST));
        if (max5 < 15) {
            final int max6 = Math.max(max5, this.method6964(class354.method1147(), Direction.EAST));
            return (max6 < 15) ? max6 : max6;
        }
        return max5;
    }
    
    public boolean method6747(final BlockPos class354, final Direction class355) {
        return this.method6748(class354, class355) > 0;
    }
    
    public int method6748(final BlockPos class354, final Direction class355) {
        final BlockState method6701 = this.getBlockState(class354);
        return method6701.method21713(this, class354) ? this.method6746(class354) : method6701.method21715(this, class354, class355);
    }
    
    public boolean method6749(final BlockPos class354) {
        return this.method6748(class354.method1139(), Direction.DOWN) > 0 || this.method6748(class354.method1137(), Direction.UP) > 0 || this.method6748(class354.method1141(), Direction.NORTH) > 0 || this.method6748(class354.method1143(), Direction.SOUTH) > 0 || this.method6748(class354.method1145(), Direction.WEST) > 0 || this.method6748(class354.method1147(), Direction.EAST) > 0;
    }
    
    public int method6750(final BlockPos class354) {
        int n = 0;
        for (final Direction class355 : World.FACING_VALUES) {
            final int method6748 = this.method6748(class354.method1149(class355), class355);
            if (method6748 >= 15) {
                return 15;
            }
            if (method6748 > n) {
                n = method6748;
            }
        }
        return n;
    }
    
    public void method6751() {
    }
    
    public void method6752(final long n) {
        this.worldInfo.method29546(n);
    }
    
    @Override
    public long method6753() {
        return this.worldInfo.getSeed();
    }
    
    public long method6754() {
        return this.worldInfo.method29539();
    }
    
    public long method6755() {
        return this.worldInfo.method29540();
    }
    
    public void method6756(final long n) {
        this.worldInfo.method29547(n);
    }
    
    public void method6757() {
        this.method6752(this.worldInfo.method29539() + 1L);
        if (this.worldInfo.method29578().method31216(Class8878.field37324)) {
            this.method6756(this.worldInfo.method29540() + 1L);
        }
    }
    
    @Override
    public BlockPos method6758() {
        BlockPos method6958 = new BlockPos(this.worldInfo.method29536(), this.worldInfo.method29537(), this.worldInfo.method29538());
        if (!this.getWorldBorder().contains(method6958)) {
            method6958 = this.method6958(HeightmapType.field11525, new BlockPos(this.getWorldBorder().method34777(), 0.0, this.getWorldBorder().method34778()));
        }
        return method6958;
    }
    
    public void setSpawnPoint(final BlockPos class354) {
        this.worldInfo.method29548(class354);
    }
    
    public boolean method6760(final PlayerEntity playerEntity, final BlockPos class513) {
        return true;
    }
    
    public void method6761(final Entity class399, final byte b) {
    }
    
    @Override
    public AbstractChunkProvider getChunkProvider() {
        return this.chunkProvider;
    }
    
    public void method6763(final BlockPos class354, final Block class355, final int n, final int n2) {
        this.getBlockState(class354).method21733(this, class354, n, n2);
    }
    
    @Override
    public WorldInfo method6764() {
        return this.worldInfo;
    }
    
    public Class8878 method6765() {
        return this.worldInfo.method29578();
    }
    
    public float method6766(final float n) {
        return MathHelper.method35700(n, this.prevThunderingStrength, this.thunderingStrength) * this.method6768(n);
    }
    
    public void method6767(final float n) {
        this.prevThunderingStrength = n;
        this.thunderingStrength = n;
    }
    
    public float method6768(final float n) {
        return MathHelper.method35700(n, this.prevRainingStrength, this.rainingStrength);
    }
    
    public void method6769(final float n) {
        this.prevRainingStrength = n;
        this.rainingStrength = n;
    }
    
    public boolean method6770() {
        return this.dimension.method20503() && !this.dimension.method20504() && this.method6766(1.0f) > 0.9;
    }
    
    public boolean method6771() {
        return this.method6768(1.0f) > 0.2;
    }
    
    public boolean method6772(final BlockPos class354) {
        return this.method6771() && this.method6994(class354) && this.method6958(HeightmapType.field11525, class354).getY() <= class354.getY() && this.method6959(class354).method9841() == Class2145.field12629;
    }
    
    public boolean method6773(final BlockPos class354) {
        return this.method6959(class354).method9842();
    }
    
    @Nullable
    public abstract Class6356 method6774(final String p0);
    
    public abstract void method6775(final Class6356 p0);
    
    public abstract int method6776();
    
    public void method6777(final int n, final BlockPos class354, final int n2) {
    }
    
    public int method6778() {
        return this.dimension.method20504() ? 128 : 256;
    }
    
    public CrashReportCategory method6779(final CrashReport class7689) {
        final CrashReportCategory method24419 = class7689.makeCategoryDepth("Affected level", 1);
        method24419.addDetail("All players", () -> this.method6840().size() + " total; " + this.method6840());
        method24419.addDetail("Chunk stats", this.chunkProvider::makeString);
        method24419.addDetail("Level dimension", () -> this.dimension.getType().toString());
        try {
            this.worldInfo.method29602(method24419);
        }
        catch (final Throwable t) {
            method24419.method16298("Level Data Unobtainable", t);
        }
        return method24419;
    }
    
    public abstract void method6780(final int p0, final BlockPos p1, final int p2);
    
    public void method6781(final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final CompoundNBT class51) {
    }
    
    public abstract Class6516 method6782();
    
    public void method6783(final BlockPos class354, final Block class355) {
        for (final Direction class356 : Plane.HORIZONTAL) {
            final BlockPos method1149 = class354.method1149(class356);
            if (!this.method6971(method1149)) {
                continue;
            }
            final BlockState method1150 = this.getBlockState(method1149);
            if (method1150.getBlock() != Blocks.field29471) {
                if (!method1150.method21713(this, method1149)) {
                    continue;
                }
                final BlockPos method1151 = method1149.method1149(class356);
                final BlockState method1152 = this.getBlockState(method1151);
                if (method1152.getBlock() != Blocks.field29471) {
                    continue;
                }
                method1152.method21734(this, method1151, class355, class354, false);
            }
            else {
                method1150.method21734(this, method1149, class355, class354, false);
            }
        }
    }
    
    @Override
    public Class9592 method6784(final BlockPos class354) {
        long method7041 = 0L;
        float method7042 = 0.0f;
        if (this.method6971(class354)) {
            method7042 = this.method6951();
            method7041 = this.method6685(class354).method7041();
        }
        return new Class9592(this.method6954(), this.method6755(), method7041, method7042);
    }
    
    @Override
    public int method6785() {
        return this.skylightSubtracted;
    }
    
    public void method6786(final int n) {
    }
    
    @Override
    public WorldBorder getWorldBorder() {
        return this.worldBorder;
    }
    
    public void method6788(final IPacket<?> class4252) {
        throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
    }
    
    @Override
    public Dimension method6789() {
        return this.dimension;
    }
    
    @Override
    public Random method6790() {
        return this.rand;
    }
    
    @Override
    public boolean method6791(final BlockPos class354, final Predicate<BlockState> predicate) {
        return predicate.test(this.getBlockState(class354));
    }
    
    public abstract Class1780 method6792();
    
    public abstract Class1792 method6793();
    
    public BlockPos method6794(final int n, final int n2, final int n3, final int n4) {
        this.updateLCG = this.updateLCG * 3 + 1013904223;
        final int n5 = this.updateLCG >> 2;
        return new BlockPos(n + (n5 & 0xF), n2 + (n5 >> 16 & n4), n3 + (n5 >> 8 & 0xF));
    }
    
    public boolean method6795() {
        return false;
    }
    
    public IProfiler method6796() {
        return this.profiler;
    }
    
    @Override
    public BiomeManager method6797() {
        return this.biomeManager;
    }
    
    static {
        LOGGER = LogManager.getLogger();
        FACING_VALUES = Direction.values();
    }
}
