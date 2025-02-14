package net.minecraft.world.chunk;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.shorts.ShortList;
import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.palette.UpgradeData;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeContainer;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.lighting.WorldLightManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class ChunkPrimer implements IChunk {
   private static final Logger field9088 = LogManager.getLogger();
   private final ChunkPos field9089;
   private volatile boolean field9090;
   private BiomeContainer field9091;
   private volatile WorldLightManager field9092;
   private final Map<Heightmap.Type, Heightmap> field9093 = Maps.newEnumMap(Heightmap.Type.class);
   private volatile ChunkStatus field9094 = ChunkStatus.EMPTY;
   private final Map<BlockPos, TileEntity> field9095 = Maps.newHashMap();
   private final Map<BlockPos, CompoundNBT> field9096 = Maps.newHashMap();
   private final ChunkSection[] field9097 = new ChunkSection[16];
   private final List<CompoundNBT> field9098 = Lists.newArrayList();
   private final List<BlockPos> field9099 = Lists.newArrayList();
   private final ShortList[] field9100 = new ShortList[16];
   private final Map<Structure<?>, StructureStart<?>> field9101 = Maps.newHashMap();
   private final Map<Structure<?>, LongSet> field9102 = Maps.newHashMap();
   private final UpgradeData field9103;
   private final Class6806<Block> field9104;
   private final Class6806<Fluid> field9105;
   private long field9106;
   private final Map<GenerationStageCarving, BitSet> field9107 = new Object2ObjectArrayMap();
   private volatile boolean field9108;

   public ChunkPrimer(ChunkPos var1, UpgradeData var2) {
      this(
         var1,
         var2,
         (ChunkSection[])null,
         new Class6806<Block>(var0 -> var0 == null || var0.getDefaultState().isAir(), var1),
         new Class6806<Fluid>(var0 -> var0 == null || var0 == Fluids.EMPTY, var1)
      );
   }

   public ChunkPrimer(ChunkPos var1, UpgradeData var2, ChunkSection[] var3, Class6806<Block> var4, Class6806<Fluid> var5) {
      this.field9089 = var1;
      this.field9103 = var2;
      this.field9104 = var4;
      this.field9105 = var5;
      if (var3 != null) {
         if (this.field9097.length != var3.length) {
            field9088.warn("Could not set level chunk sections, array length is {} instead of {}", var3.length, this.field9097.length);
         } else {
            System.arraycopy(var3, 0, this.field9097, 0, this.field9097.length);
         }
      }
   }

   @Override
   public BlockState getBlockState(BlockPos var1) {
      int var4 = var1.getY();
      if (!World.isYOutOfBounds(var4)) {
         ChunkSection var5 = this.getSections()[var4 >> 4];
         return !ChunkSection.isEmpty(var5) ? var5.getBlockState(var1.getX() & 15, var4 & 15, var1.getZ() & 15) : Blocks.AIR.getDefaultState();
      } else {
         return Blocks.VOID_AIR.getDefaultState();
      }
   }

   @Override
   public FluidState getFluidState(BlockPos var1) {
      int var4 = var1.getY();
      if (!World.isYOutOfBounds(var4)) {
         ChunkSection var5 = this.getSections()[var4 >> 4];
         return !ChunkSection.isEmpty(var5) ? var5.getFluidState(var1.getX() & 15, var4 & 15, var1.getZ() & 15) : Fluids.EMPTY.method25049();
      } else {
         return Fluids.EMPTY.method25049();
      }
   }

   @Override
   public Stream<BlockPos> getLightSources() {
      return this.field9099.stream();
   }

   public ShortList[] method7103() {
      ShortList[] var3 = new ShortList[16];

      for (BlockPos var5 : this.field9099) {
         IChunk.getList(var3, var5.getY() >> 4).add(method7113(var5));
      }

      return var3;
   }

   public void method7104(short var1, int var2) {
      this.method7105(method7114(var1, var2, this.field9089));
   }

   public void method7105(BlockPos var1) {
      this.field9099.add(var1.toImmutable());
   }

   @Nullable
   @Override
   public BlockState setBlockState(BlockPos var1, BlockState var2, boolean var3) {
      int var6 = var1.getX();
      int var7 = var1.getY();
      int var8 = var1.getZ();
      if (var7 >= 0 && var7 < 256) {
         if (this.field9097[var7 >> 4] == Chunk.field9111 && var2.isIn(Blocks.AIR)) {
            return var2;
         } else {
            if (var2.getLightValue() > 0) {
               this.field9099.add(new BlockPos((var6 & 15) + this.getPos().getX(), var7, (var8 & 15) + this.getPos().getZ()));
            }

            ChunkSection var9 = this.method7106(var7 >> 4);
            BlockState var10 = var9.setBlockState(var6 & 15, var7 & 15, var8 & 15, var2);
            if (this.field9094.isAtLeast(ChunkStatus.FEATURES)
               && var2 != var10
               && (
                  var2.getOpacity(this, var1) != var10.getOpacity(this, var1)
                     || var2.getLightValue() != var10.getLightValue()
                     || var2.isTransparent()
                     || var10.isTransparent()
               )) {
               WorldLightManager var11 = this.method7112();
               var11.checkBlock(var1);
            }

            EnumSet<Heightmap.Type> var16 = this.getStatus().method34305();
            EnumSet var12 = null;

            for (Heightmap.Type var14 : var16) {
               Heightmap var15 = this.field9093.get(var14);
               if (var15 == null) {
                  if (var12 == null) {
                     var12 = EnumSet.<Heightmap.Type>noneOf(Heightmap.Type.class);
                  }

                  var12.add(var14);
               }
            }

            if (var12 != null) {
               Heightmap.method24577(this, var12);
            }

            for (Heightmap.Type var18 : var16) {
               this.field9093.get(var18).method24578(var6 & 15, var7, var8 & 15, var2);
            }

            return var10;
         }
      } else {
         return Blocks.VOID_AIR.getDefaultState();
      }
   }

   public ChunkSection method7106(int var1) {
      if (this.field9097[var1] == Chunk.field9111) {
         this.field9097[var1] = new ChunkSection(var1 << 4);
      }

      return this.field9097[var1];
   }

   @Override
   public void addTileEntity(BlockPos var1, TileEntity var2) {
      var2.method3782(var1);
      this.field9095.put(var1, var2);
   }

   @Override
   public Set<BlockPos> getTileEntitiesPos() {
      HashSet var3 = Sets.newHashSet(this.field9096.keySet());
      var3.addAll(this.field9095.keySet());
      return var3;
   }

   @Nullable
   @Override
   public TileEntity getTileEntity(BlockPos var1) {
      return this.field9095.get(var1);
   }

   public Map<BlockPos, TileEntity> method7107() {
      return this.field9095;
   }

   public void method7108(CompoundNBT var1) {
      this.field9098.add(var1);
   }

   @Override
   public void addEntity(Entity var1) {
      if (!var1.isPassenger()) {
         CompoundNBT var4 = new CompoundNBT();
         var1.writeUnlessPassenger(var4);
         this.method7108(var4);
      }
   }

   public List<CompoundNBT> method7109() {
      return this.field9098;
   }

   public void setBiomes(BiomeContainer var1) {
      this.field9091 = var1;
   }

   @Nullable
   @Override
   public BiomeContainer getBiomes() {
      return this.field9091;
   }

   @Override
   public void setModified(boolean var1) {
      this.field9090 = var1;
   }

   @Override
   public boolean isModified() {
      return this.field9090;
   }

   @Override
   public ChunkStatus getStatus() {
      return this.field9094;
   }

   public void method7111(ChunkStatus var1) {
      this.field9094 = var1;
      this.setModified(true);
   }

   @Override
   public ChunkSection[] getSections() {
      return this.field9097;
   }

   @Nullable
   public WorldLightManager method7112() {
      return this.field9092;
   }

   @Override
   public Collection<Entry<Heightmap.Type, Heightmap>> getHeightmaps() {
      return Collections.<Entry<Heightmap.Type, Heightmap>>unmodifiableSet(this.field9093.entrySet());
   }

   @Override
   public void setHeightmap(Heightmap.Type var1, long[] var2) {
      this.getHeightmap(var1).method24582(var2);
   }

   @Override
   public Heightmap getHeightmap(Heightmap.Type var1) {
      return this.field9093.computeIfAbsent(var1, var1x -> new Heightmap(this, var1x));
   }

   @Override
   public int getTopBlockY(Heightmap.Type var1, int var2, int var3) {
      Heightmap var6 = this.field9093.get(var1);
      if (var6 == null) {
         Heightmap.method24577(this, EnumSet.<Heightmap.Type>of(var1));
         var6 = this.field9093.get(var1);
      }

      return var6.getHeight(var2 & 15, var3 & 15) - 1;
   }

   @Override
   public ChunkPos getPos() {
      return this.field9089;
   }

   @Override
   public void setLastSaveTime(long var1) {
   }

   @Nullable
   @Override
   public StructureStart<?> method7097(Structure<?> var1) {
      return this.field9101.get(var1);
   }

   @Override
   public void method7098(Structure<?> var1, StructureStart<?> var2) {
      this.field9101.put(var1, var2);
      this.field9090 = true;
   }

   @Override
   public Map<Structure<?>, StructureStart<?>> getStructureStarts() {
      return Collections.<Structure<?>, StructureStart<?>>unmodifiableMap(this.field9101);
   }

   @Override
   public void setStructureStarts(Map<Structure<?>, StructureStart<?>> var1) {
      this.field9101.clear();
      this.field9101.putAll(var1);
      this.field9090 = true;
   }

   @Override
   public LongSet method7099(Structure<?> var1) {
      return this.field9102.computeIfAbsent(var1, var0 -> new LongOpenHashSet());
   }

   @Override
   public void method7100(Structure<?> var1, long var2) {
      this.field9102.computeIfAbsent(var1, var0 -> new LongOpenHashSet()).add(var2);
      this.field9090 = true;
   }

   @Override
   public Map<Structure<?>, LongSet> method7101() {
      return Collections.<Structure<?>, LongSet>unmodifiableMap(this.field9102);
   }

   @Override
   public void method7102(Map<Structure<?>, LongSet> var1) {
      this.field9102.clear();
      this.field9102.putAll(var1);
      this.field9090 = true;
   }

   public static short method7113(BlockPos var0) {
      int var3 = var0.getX();
      int var4 = var0.getY();
      int var5 = var0.getZ();
      int var6 = var3 & 15;
      int var7 = var4 & 15;
      int var8 = var5 & 15;
      return (short)(var6 | var7 << 4 | var8 << 8);
   }

   public static BlockPos method7114(short var0, int var1, ChunkPos var2) {
      int var5 = (var0 & 15) + (var2.x << 4);
      int var6 = (var0 >>> 4 & 15) + (var1 << 4);
      int var7 = (var0 >>> 8 & 15) + (var2.z << 4);
      return new BlockPos(var5, var6, var7);
   }

   @Override
   public void markBlockForPostprocessing(BlockPos var1) {
      if (!World.isOutsideBuildHeight(var1)) {
         IChunk.getList(this.field9100, var1.getY() >> 4).add(method7113(var1));
      }
   }

   @Override
   public ShortList[] getPackedPositions() {
      return this.field9100;
   }

   @Override
   public void addPackedPosition(short var1, int var2) {
      IChunk.getList(this.field9100, var2).add(var1);
   }

   public Class6806<Block> getBlocksToBeTicked() {
      return this.field9104;
   }

   public Class6806<Fluid> getFluidsToBeTicked() {
      return this.field9105;
   }

   @Override
   public UpgradeData getUpgradeData() {
      return this.field9103;
   }

   @Override
   public void setInhabitedTime(long var1) {
      this.field9106 = var1;
   }

   @Override
   public long getInhabitedTime() {
      return this.field9106;
   }

   @Override
   public void addTileEntity(CompoundNBT var1) {
      this.field9096.put(new BlockPos(var1.getInt("x"), var1.getInt("y"), var1.getInt("z")), var1);
   }

   public Map<BlockPos, CompoundNBT> method7115() {
      return Collections.<BlockPos, CompoundNBT>unmodifiableMap(this.field9096);
   }

   @Override
   public CompoundNBT getDeferredTileEntity(BlockPos var1) {
      return this.field9096.get(var1);
   }

   @Nullable
   @Override
   public CompoundNBT getTileEntityNBT(BlockPos var1) {
      TileEntity var4 = this.getTileEntity(var1);
      return var4 == null ? this.field9096.get(var1) : var4.write(new CompoundNBT());
   }

   @Override
   public void removeTileEntity(BlockPos var1) {
      this.field9095.remove(var1);
      this.field9096.remove(var1);
   }

   @Nullable
   public BitSet method7116(GenerationStageCarving var1) {
      return this.field9107.get(var1);
   }

   public BitSet getOrAddCarvingMask(GenerationStageCarving var1) {
      return this.field9107.computeIfAbsent(var1, var0 -> new BitSet(65536));
   }

   public void method7118(GenerationStageCarving var1, BitSet var2) {
      this.field9107.put(var1, var2);
   }

   public void method7119(WorldLightManager var1) {
      this.field9092 = var1;
   }

   @Override
   public boolean hasLight() {
      return this.field9108;
   }

   @Override
   public void setLight(boolean var1) {
      this.field9108 = var1;
      this.setModified(true);
   }
}
