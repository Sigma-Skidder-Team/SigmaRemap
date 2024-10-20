package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortList;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.crash.ReportedException;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.boss.dragon.EnderDragonPartEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.palette.UpgradeData;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.ITickList;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeContainer;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.chunk.ChunkSection;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.lighting.WorldLightManager;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Chunk implements IChunk {
   private static final Logger field9110 = LogManager.getLogger();
   public static final ChunkSection field9111 = null;
   private final ChunkSection[] field9112 = new ChunkSection[16];
   private BiomeContainer field9113;
   private final Map<BlockPos, CompoundNBT> field9114 = Maps.newHashMap();
   public boolean field9115;
   private final World field9116;
   private final Map<Heightmap.Type, Heightmap> heightMap = Maps.newEnumMap(Heightmap.Type.class);
   private final UpgradeData field9118;
   private final Map<BlockPos, TileEntity> field9119 = Maps.newHashMap();
   private final Class51<Entity>[] field9120;
   private final Map<Structure<?>, StructureStart<?>> field9121 = Maps.newHashMap();
   private final Map<Structure<?>, LongSet> field9122 = Maps.newHashMap();
   private final ShortList[] field9123 = new ShortList[16];
   private ITickList<Block> field9124;
   private ITickList<Fluid> field9125;
   private boolean field9126;
   private long field9127;
   private volatile boolean field9128;
   private long field9129;
   private Supplier<ChunkHolderLocationType> field9130;
   private Consumer<Chunk> field9131;
   private final ChunkPos field9132;
   private volatile boolean field9133;

   public Chunk(World var1, ChunkPos var2, BiomeContainer var3) {
      this(
         var1,
         var2,
         var3,
         UpgradeData.field40388,
         Class6804.<Block>method20727(),
         Class6804.<Fluid>method20727(),
         0L,
         (ChunkSection[])null,
         (Consumer<Chunk>)null
      );
   }

   public Chunk(
      World var1,
      ChunkPos var2,
      BiomeContainer var3,
      UpgradeData var4,
      ITickList<Block> var5,
      ITickList<Fluid> var6,
      long var7,
      ChunkSection[] var9,
      Consumer<Chunk> var10
   ) {
      this.field9120 = new Class51[16];
      this.field9116 = var1;
      this.field9132 = var2;
      this.field9118 = var4;

      for (Heightmap.Type var16 : Heightmap.Type.values()) {
         if (ChunkStatus.FULL.method34305().contains(var16)) {
            this.heightMap.put(var16, new Heightmap(this, var16));
         }
      }

      for (int var17 = 0; var17 < this.field9120.length; var17++) {
         this.field9120[var17] = new Class51<Entity>(Entity.class);
      }

      this.field9113 = var3;
      this.field9124 = var5;
      this.field9125 = var6;
      this.field9129 = var7;
      this.field9131 = var10;
      if (var9 != null) {
         if (this.field9112.length != var9.length) {
            field9110.warn("Could not set level chunk sections, array length is {} instead of {}", var9.length, this.field9112.length);
         } else {
            System.arraycopy(var9, 0, this.field9112, 0, this.field9112.length);
         }
      }
   }

   public Chunk(World var1, ChunkPrimer var2) {
      this(
         var1,
         var2.getPos(),
         var2.getBiomes(),
         var2.getUpgradeData(),
         var2.getBlocksToBeTicked(),
         var2.getFluidsToBeTicked(),
         var2.getInhabitedTime(),
         var2.getSections(),
         (Consumer<Chunk>)null
      );

      for (CompoundNBT var6 : var2.method7109()) {
         EntityType.method33223(var6, var1, var1x -> {
            this.addEntity(var1x);
            return var1x;
         });
      }

      for (TileEntity var10 : var2.method7107().values()) {
         this.method7135(var10);
      }

      this.field9114.putAll(var2.method7115());

      for (int var8 = 0; var8 < var2.getPackedPositions().length; var8++) {
         this.field9123[var8] = var2.getPackedPositions()[var8];
      }

      this.setStructureStarts(var2.getStructureStarts());
      this.method7102(var2.method7101());

      for (Entry var11 : var2.getHeightmaps()) {
         if (ChunkStatus.FULL.method34305().contains(var11.getKey())) {
            this.getHeightmap((Heightmap.Type)var11.getKey()).method24582(((Heightmap)var11.getValue()).method24583());
         }
      }

      this.setLight(var2.hasLight());
      this.field9128 = true;
   }

   @Override
   public Heightmap getHeightmap(Heightmap.Type var1) {
      return this.heightMap.computeIfAbsent(var1, var1x -> new Heightmap(this, var1x));
   }

   @Override
   public Set<BlockPos> getTileEntitiesPos() {
      HashSet var3 = Sets.newHashSet(this.field9114.keySet());
      var3.addAll(this.field9119.keySet());
      return var3;
   }

   @Override
   public ChunkSection[] getSections() {
      return this.field9112;
   }

   @Override
   public BlockState getBlockState(BlockPos var1) {
      int var4 = var1.getX();
      int var5 = var1.getY();
      int var6 = var1.getZ();
      if (this.field9116.isDebug()) {
         BlockState var11 = null;
         if (var5 == 60) {
            var11 = Blocks.BARRIER.getDefaultState();
         }

         if (var5 == 70) {
            var11 = DebugChunkGenerator.method17835(var4, var6);
         }

         return var11 == null ? Blocks.AIR.getDefaultState() : var11;
      } else {
         try {
            if (var5 >= 0 && var5 >> 4 < this.field9112.length) {
               ChunkSection var7 = this.field9112[var5 >> 4];
               if (!ChunkSection.isEmpty(var7)) {
                  return var7.method21852(var4 & 15, var5 & 15, var6 & 15);
               }
            }

            return Blocks.AIR.getDefaultState();
         } catch (Throwable var10) {
            CrashReport var8 = CrashReport.makeCrashReport(var10, "Getting block state");
            CrashReportCategory var9 = var8.makeCategory("Block being got");
            var9.addDetail("Location", () -> CrashReportCategory.method32805(var4, var5, var6));
            throw new ReportedException(var8);
         }
      }
   }

   @Override
   public FluidState getFluidState(BlockPos var1) {
      return this.method7130(var1.getX(), var1.getY(), var1.getZ());
   }

   public FluidState method7130(int var1, int var2, int var3) {
      try {
         if (var2 >= 0 && var2 >> 4 < this.field9112.length) {
            ChunkSection var6 = this.field9112[var2 >> 4];
            if (!ChunkSection.isEmpty(var6)) {
               return var6.method21853(var1 & 15, var2 & 15, var3 & 15);
            }
         }

         return Fluids.EMPTY.method25049();
      } catch (Throwable var9) {
         CrashReport var7 = CrashReport.makeCrashReport(var9, "Getting fluid state");
         CrashReportCategory var8 = var7.makeCategory("Block being got");
         var8.addDetail("Location", () -> CrashReportCategory.method32805(var1, var2, var3));
         throw new ReportedException(var7);
      }
   }

   @Nullable
   @Override
   public BlockState setBlockState(BlockPos var1, BlockState var2, boolean var3) {
      int var6 = var1.getX() & 15;
      int var7 = var1.getY();
      int var8 = var1.getZ() & 15;
      ChunkSection var9 = this.field9112[var7 >> 4];
      if (var9 == field9111) {
         if (var2.isAir()) {
            return null;
         }

         var9 = new ChunkSection(var7 >> 4 << 4);
         this.field9112[var7 >> 4] = var9;
      }

      boolean var10 = var9.method21858();
      BlockState var11 = var9.method21856(var6, var7 & 15, var8, var2);
      if (var11 != var2) {
         Block var12 = var2.getBlock();
         Block var13 = var11.getBlock();
         this.heightMap.get(Heightmap.Type.MOTION_BLOCKING).method24578(var6, var7, var8, var2);
         this.heightMap.get(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES).method24578(var6, var7, var8, var2);
         this.heightMap.get(Heightmap.Type.OCEAN_FLOOR).method24578(var6, var7, var8, var2);
         this.heightMap.get(Heightmap.Type.WORLD_SURFACE).method24578(var6, var7, var8, var2);
         boolean var14 = var9.method21858();
         if (var10 != var14) {
            this.field9116.getChunkProvider().getLightManager().method641(var1, var14);
         }

         if (this.field9116.isRemote) {
            if (var13 != var12 && var13 instanceof Class3245) {
               this.field9116.method6762(var1);
            }
         } else {
            var11.onReplaced(this.field9116, var1, var2, var3);
         }

         if (var9.method21852(var6, var7 & 15, var8).isIn(var12)) {
            if (var13 instanceof Class3245) {
               TileEntity var15 = this.method7029(var1, Class2206.field14423);
               if (var15 != null) {
                  var15.method3780();
               }
            }

            if (!this.field9116.isRemote) {
               var2.method23428(this.field9116, var1, var11, var3);
            }

            if (var12 instanceof Class3245) {
               TileEntity var16 = this.method7029(var1, Class2206.field14423);
               if (var16 != null) {
                  var16.method3780();
               } else {
                  var16 = ((Class3245)var12).method11646(this.field9116);
                  this.field9116.method6761(var1, var16);
               }
            }

            this.field9128 = true;
            return var11;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   @Nullable
   public WorldLightManager method7131() {
      return this.field9116.getChunkProvider().getLightManager();
   }

   @Override
   public void addEntity(Entity var1) {
      this.field9126 = true;
      int var4 = MathHelper.floor(var1.getPosX() / 16.0);
      int var5 = MathHelper.floor(var1.getPosZ() / 16.0);
      if (var4 != this.field9132.x || var5 != this.field9132.z) {
         field9110.warn("Wrong location! ({}, {}) should be ({}, {}), {}", var4, var5, this.field9132.x, this.field9132.z, var1);
         var1.removed = true;
      }

      int var6 = MathHelper.floor(var1.getPosY() / 16.0);
      if (var6 < 0) {
         var6 = 0;
      }

      if (var6 >= this.field9120.length) {
         var6 = this.field9120.length - 1;
      }

      var1.addedToChunk = true;
      var1.chunkCoordX = this.field9132.x;
      var1.chunkCoordY = var6;
      var1.chunkCoordZ = this.field9132.z;
      this.field9120[var6].add(var1);
   }

   @Override
   public void setHeightmap(Heightmap.Type var1, long[] var2) {
      this.heightMap.get(var1).method24582(var2);
   }

   public void removeEntity(Entity var1) {
      this.removeEntityAtIndex(var1, var1.chunkCoordY);
   }

   public void removeEntityAtIndex(Entity var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var2 >= this.field9120.length) {
         var2 = this.field9120.length - 1;
      }

      this.field9120[var2].remove(var1);
   }

   public int getTopBlockY(Heightmap.Type var1, int var2, int var3) {
      return this.heightMap.get(var1).getHeight(var2 & 15, var3 & 15) - 1;
   }

   @Nullable
   private TileEntity method7134(BlockPos var1) {
      BlockState var4 = this.getBlockState(var1);
      Block var5 = var4.getBlock();
      return var5.isTileEntityProvider() ? ((Class3245)var5).method11646(this.field9116) : null;
   }

   @Nullable
   @Override
   public TileEntity getTileEntity(BlockPos var1) {
      return this.method7029(var1, Class2206.field14423);
   }

   @Nullable
   public TileEntity method7029(BlockPos var1, Class2206 var2) {
      TileEntity var5 = this.field9119.get(var1);
      if (var5 == null) {
         CompoundNBT var6 = this.field9114.remove(var1);
         if (var6 != null) {
            TileEntity var7 = this.method7149(var1, var6);
            if (var7 != null) {
               return var7;
            }
         }
      }

      if (var5 != null) {
         if (var5.method3778()) {
            this.field9119.remove(var1);
            return null;
         }
      } else if (var2 == Class2206.field14421) {
         var5 = this.method7134(var1);
         this.field9116.method6761(var1, var5);
      }

      return var5;
   }

   public void method7135(TileEntity var1) {
      this.addTileEntity(var1.getPos(), var1);
      if (this.field9115 || this.field9116.isRemote()) {
         this.field9116.method6761(var1.getPos(), var1);
      }
   }

   @Override
   public void addTileEntity(BlockPos var1, TileEntity var2) {
      if (this.getBlockState(var1).getBlock() instanceof Class3245) {
         var2.method3769(this.field9116, var1);
         var2.method3779();
         TileEntity var5 = this.field9119.put(var1.toImmutable(), var2);
         if (var5 != null && var5 != var2) {
            var5.method3765();
         }
      }
   }

   @Override
   public void addTileEntity(CompoundNBT var1) {
      this.field9114.put(new BlockPos(var1.getInt("x"), var1.getInt("y"), var1.getInt("z")), var1);
   }

   @Nullable
   @Override
   public CompoundNBT getTileEntityNBT(BlockPos var1) {
      TileEntity var4 = this.getTileEntity(var1);
      if (var4 != null && !var4.method3778()) {
         CompoundNBT var6 = var4.write(new CompoundNBT());
         var6.putBoolean("keepPacked", false);
         return var6;
      } else {
         CompoundNBT var5 = this.field9114.get(var1);
         if (var5 != null) {
            var5 = var5.copy();
            var5.putBoolean("keepPacked", true);
         }

         return var5;
      }
   }

   @Override
   public void removeTileEntity(BlockPos var1) {
      if (this.field9115 || this.field9116.isRemote()) {
         TileEntity var4 = this.field9119.remove(var1);
         if (var4 != null) {
            var4.method3765();
         }
      }
   }

   public void method7136() {
      if (this.field9131 != null) {
         this.field9131.accept(this);
         this.field9131 = null;
      }
   }

   public void method7137() {
      this.field9128 = true;
   }

   public void method7138(Entity var1, AxisAlignedBB var2, List<Entity> var3, Predicate<? super Entity> var4) {
      int var7 = MathHelper.floor((var2.minY - 2.0) / 16.0);
      int var8 = MathHelper.floor((var2.maxY + 2.0) / 16.0);
      var7 = MathHelper.clamp(var7, 0, this.field9120.length - 1);
      var8 = MathHelper.clamp(var8, 0, this.field9120.length - 1);

      for (int var9 = var7; var9 <= var8; var9++) {
         Class51 var10 = this.field9120[var9];
         List var11 = var10.method177();
         int var12 = var11.size();

         for (int var13 = 0; var13 < var12; var13++) {
            Entity var14 = (Entity)var11.get(var13);
            if (var14.getBoundingBox().method19670(var2) && var14 != var1) {
               if (var4 == null || var4.test(var14)) {
                  var3.add(var14);
               }

               if (var14 instanceof Class1007) {
                  for (EnderDragonPartEntity var18 : ((Class1007)var14).method4332()) {
                     if (var18 != var1 && var18.getBoundingBox().method19670(var2) && (var4 == null || var4.test(var18))) {
                        var3.add(var18);
                     }
                  }
               }
            }
         }
      }
   }

   public <T extends Entity> void method7139(EntityType<?> var1, AxisAlignedBB var2, List<? super T> var3, Predicate<? super T> var4) {
      int var7 = MathHelper.floor((var2.minY - 2.0) / 16.0);
      int var8 = MathHelper.floor((var2.maxY + 2.0) / 16.0);
      var7 = MathHelper.clamp(var7, 0, this.field9120.length - 1);
      var8 = MathHelper.clamp(var8, 0, this.field9120.length - 1);

      for (int var9 = var7; var9 <= var8; var9++) {
         for (Entity var11 : this.field9120[var9].method176(Entity.class)) {
            if ((var1 == null || var11.getType() == var1) && var11.getBoundingBox().method19670(var2) && var4.test((T)var11)) {
               var3.add((T)var11);
            }
         }
      }
   }

   public <T extends Entity> void method7140(Class<? extends T> var1, AxisAlignedBB var2, List<T> var3, Predicate<? super T> var4) {
      int var7 = MathHelper.floor((var2.minY - 2.0) / 16.0);
      int var8 = MathHelper.floor((var2.maxY + 2.0) / 16.0);
      var7 = MathHelper.clamp(var7, 0, this.field9120.length - 1);
      var8 = MathHelper.clamp(var8, 0, this.field9120.length - 1);

      for (int var9 = var7; var9 <= var8; var9++) {
         for (Entity var11 : this.field9120[var9].method176(var1)) {
            if (var11.getBoundingBox().method19670(var2) && (var4 == null || var4.test((T)var11))) {
               var3.add((T)var11);
            }
         }
      }
   }

   public boolean isEmpty() {
      return false;
   }

   @Override
   public ChunkPos getPos() {
      return this.field9132;
   }

   public void read(BiomeContainer var1, PacketBuffer var2, CompoundNBT var3, int var4) {
      boolean var7 = var1 != null;
      Predicate<BlockPos> var8 = !var7 ? var1x -> (var4 & 1 << (var1x.getY() >> 4)) != 0 : var0 -> true;
      Sets.newHashSet(this.field9119.keySet()).stream().filter(var8).forEach(this.field9116::method6762);

      for (int var9 = 0; var9 < this.field9112.length; var9++) {
         ChunkSection var10 = this.field9112[var9];
         if ((var4 & 1 << var9) != 0) {
            if (var10 == field9111) {
               var10 = new ChunkSection(var9 << 4);
               this.field9112[var9] = var10;
            }

            var10.method21866(var2);
         } else if (var7 && var10 != field9111) {
            this.field9112[var9] = field9111;
         }
      }

      if (var1 != null) {
         this.field9113 = var1;
      }

      for (Heightmap.Type var12 : Heightmap.Type.values()) {
         String var13 = var12.method283();
         if (var3.contains(var13, 12)) {
            this.setHeightmap(var12, var3.getLongArray(var13));
         }
      }

      for (TileEntity var17 : this.field9119.values()) {
         var17.method3780();
      }
   }

   @Override
   public BiomeContainer getBiomes() {
      return this.field9113;
   }

   public void setLoaded(boolean var1) {
      this.field9115 = var1;
   }

   public World method7144() {
      return this.field9116;
   }

   @Override
   public Collection<Entry<Heightmap.Type, Heightmap>> getHeightmaps() {
      return Collections.<Entry<Heightmap.Type, Heightmap>>unmodifiableSet(this.heightMap.entrySet());
   }

   public Map<BlockPos, TileEntity> getTileEntityMap() {
      return this.field9119;
   }

   public Class51<Entity>[] method7146() {
      return this.field9120;
   }

   @Override
   public CompoundNBT getDeferredTileEntity(BlockPos var1) {
      return this.field9114.get(var1);
   }

   @Override
   public Stream<BlockPos> getLightSources() {
      return StreamSupport.<BlockPos>stream(
            BlockPos.method8364(this.field9132.getX(), 0, this.field9132.getZ(), this.field9132.getXEnd(), 255, this.field9132.getZEnd())
               .spliterator(),
            false
         )
         .filter(var1 -> this.getBlockState(var1).getLightValue() != 0);
   }

   @Override
   public ITickList<Block> getBlocksToBeTicked() {
      return this.field9124;
   }

   @Override
   public ITickList<Fluid> getFluidsToBeTicked() {
      return this.field9125;
   }

   @Override
   public void setModified(boolean var1) {
      this.field9128 = var1;
   }

   @Override
   public boolean isModified() {
      return this.field9128 || this.field9126 && this.field9116.getGameTime() != this.field9127;
   }

   public void method7147(boolean var1) {
      this.field9126 = var1;
   }

   @Override
   public void setLastSaveTime(long var1) {
      this.field9127 = var1;
   }

   @Nullable
   @Override
   public StructureStart<?> method7097(Structure<?> var1) {
      return this.field9121.get(var1);
   }

   @Override
   public void method7098(Structure<?> var1, StructureStart<?> var2) {
      this.field9121.put(var1, var2);
   }

   @Override
   public Map<Structure<?>, StructureStart<?>> getStructureStarts() {
      return this.field9121;
   }

   @Override
   public void setStructureStarts(Map<Structure<?>, StructureStart<?>> var1) {
      this.field9121.clear();
      this.field9121.putAll(var1);
   }

   @Override
   public LongSet method7099(Structure<?> var1) {
      return this.field9122.computeIfAbsent(var1, var0 -> new LongOpenHashSet());
   }

   @Override
   public void method7100(Structure<?> var1, long var2) {
      this.field9122.computeIfAbsent(var1, var0 -> new LongOpenHashSet()).add(var2);
   }

   @Override
   public Map<Structure<?>, LongSet> method7101() {
      return this.field9122;
   }

   @Override
   public void method7102(Map<Structure<?>, LongSet> var1) {
      this.field9122.clear();
      this.field9122.putAll(var1);
   }

   @Override
   public long getInhabitedTime() {
      return this.field9129;
   }

   @Override
   public void setInhabitedTime(long var1) {
      this.field9129 = var1;
   }

   public void postProcess() {
      ChunkPos var3 = this.getPos();

      for (int var4 = 0; var4 < this.field9123.length; var4++) {
         if (this.field9123[var4] != null) {
            ShortListIterator var5 = this.field9123[var4].iterator();

            while (var5.hasNext()) {
               Short var6 = (Short)var5.next();
               BlockPos var7 = ChunkPrimer.method7114(var6, var4, var3);
               BlockState var8 = this.getBlockState(var7);
               BlockState var9 = Block.method11542(var8, this.field9116, var7);
               this.field9116.setBlockState(var7, var9, 20);
            }

            this.field9123[var4].clear();
         }
      }

      this.method7150();

      for (BlockPos var11 : Sets.newHashSet(this.field9114.keySet())) {
         this.getTileEntity(var11);
      }

      this.field9114.clear();
      this.field9118.method32603(this);
   }

   @Nullable
   private TileEntity method7149(BlockPos var1, CompoundNBT var2) {
      BlockState var5 = this.getBlockState(var1);
      TileEntity var6;
      if (!"DUMMY".equals(var2.getString("id"))) {
         var6 = TileEntity.method3772(var5, var2);
      } else {
         Block var7 = var5.getBlock();
         if (!(var7 instanceof Class3245)) {
            var6 = null;
            field9110.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", var1, var5);
         } else {
            var6 = ((Class3245)var7).method11646(this.field9116);
         }
      }

      if (var6 == null) {
         field9110.warn("Tried to load a block entity for block {} but failed at location {}", var5, var1);
      } else {
         var6.method3769(this.field9116, var1);
         this.method7135(var6);
      }

      return var6;
   }

   @Override
   public UpgradeData getUpgradeData() {
      return this.field9118;
   }

   @Override
   public ShortList[] getPackedPositions() {
      return this.field9123;
   }

   public void method7150() {
      if (!(this.field9124 instanceof Class6806)) {
         if (this.field9124 instanceof Class6801) {
            ((Class6801)this.field9124).method20723(this.field9116.method6860());
            this.field9124 = Class6804.method20727();
         }
      } else {
         ((Class6806<Block>)this.field9124).method20738(this.field9116.method6860(), var1 -> this.getBlockState(var1).getBlock());
         this.field9124 = Class6804.method20727();
      }

      if (!(this.field9125 instanceof Class6806)) {
         if (this.field9125 instanceof Class6801) {
            ((Class6801)this.field9125).method20723(this.field9116.getPendingFluidTicks());
            this.field9125 = Class6804.method20727();
         }
      } else {
         ((Class6806<Fluid>)this.field9125).method20738(this.field9116.getPendingFluidTicks(), var1 -> this.getFluidState(var1).getFluid());
         this.field9125 = Class6804.method20727();
      }
   }

   public void method7151(ServerWorld var1) {
      if (this.field9124 == Class6804.<Block>method20727()) {
         this.field9124 = new Class6801<>(
                 Registry.BLOCK::getKey, var1.method6860().method20729(this.field9132, true, false), var1.getGameTime()
         );
         this.setModified(true);
      }

      if (this.field9125 == Class6804.<Fluid>method20727()) {
         this.field9125 = new Class6801<>(
                 Registry.FLUID::getKey, var1.getPendingFluidTicks().method20729(this.field9132, true, false), var1.getGameTime()
         );
         this.setModified(true);
      }
   }

   @Override
   public ChunkStatus getStatus() {
      return ChunkStatus.FULL;
   }

   public ChunkHolderLocationType getLocationType() {
      return this.field9130 != null ? this.field9130.get() : ChunkHolderLocationType.field167;
   }

   public void method7153(Supplier<ChunkHolderLocationType> var1) {
      this.field9130 = var1;
   }

   @Override
   public boolean hasLight() {
      return this.field9133;
   }

   @Override
   public void setLight(boolean var1) {
      this.field9133 = var1;
      this.setModified(true);
   }
}
