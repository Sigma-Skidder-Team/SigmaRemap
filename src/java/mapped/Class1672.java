package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.shorts.ShortList;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class Class1672 implements IChunk {
   private static final Logger field9088 = LogManager.getLogger();
   private final Class7481 field9089;
   private volatile boolean field9090;
   private Class1684 field9091;
   private volatile Class196 field9092;
   private final Map<Class101, Class7527> field9093 = Maps.newEnumMap(Class101.class);
   private volatile ChunkStatus field9094 = ChunkStatus.field42133;
   private final Map<BlockPos, TileEntity> field9095 = Maps.newHashMap();
   private final Map<BlockPos, CompoundNBT> field9096 = Maps.newHashMap();
   private final Class7038[] field9097 = new Class7038[16];
   private final List<CompoundNBT> field9098 = Lists.newArrayList();
   private final List<BlockPos> field9099 = Lists.newArrayList();
   private final ShortList[] field9100 = new ShortList[16];
   private final Map<Structure<?>, Class5444<?>> field9101 = Maps.newHashMap();
   private final Map<Structure<?>, LongSet> field9102 = Maps.newHashMap();
   private final Class8922 field9103;
   private final Class6806<Block> field9104;
   private final Class6806<Fluid> field9105;
   private long field9106;
   private final Map<Class97, BitSet> field9107 = new Object2ObjectArrayMap();
   private volatile boolean field9108;

   public Class1672(Class7481 var1, Class8922 var2) {
      this(
         var1,
         var2,
         (Class7038[])null,
         new Class6806<Block>(var0 -> var0 == null || var0.method11579().isAir(), var1),
         new Class6806<Fluid>(var0 -> var0 == null || var0 == Class9479.field44064, var1)
      );
   }

   public Class1672(Class7481 var1, Class8922 var2, Class7038[] var3, Class6806<Block> var4, Class6806<Fluid> var5) {
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
         Class7038 var5 = this.method7067()[var4 >> 4];
         return !Class7038.method21859(var5) ? var5.method21852(var1.getX() & 15, var4 & 15, var1.getZ() & 15) : Blocks.AIR.method11579();
      } else {
         return Blocks.field37011.method11579();
      }
   }

   @Override
   public FluidState getFluidState(BlockPos var1) {
      int var4 = var1.getY();
      if (!World.isYOutOfBounds(var4)) {
         Class7038 var5 = this.method7067()[var4 >> 4];
         return !Class7038.method21859(var5) ? var5.method21853(var1.getX() & 15, var4 & 15, var1.getZ() & 15) : Class9479.field44064.method25049();
      } else {
         return Class9479.field44064.method25049();
      }
   }

   @Override
   public Stream<BlockPos> method7088() {
      return this.field9099.stream();
   }

   public ShortList[] method7103() {
      ShortList[] var3 = new ShortList[16];

      for (BlockPos var5 : this.field9099) {
         IChunk.method7094(var3, var5.getY() >> 4).add(method7113(var5));
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
         if (this.field9097[var7 >> 4] == Chunk.field9111 && var2.method23448(Blocks.AIR)) {
            return var2;
         } else {
            if (var2.getLightValue() > 0) {
               this.field9099.add(new BlockPos((var6 & 15) + this.method7072().method24356(), var7, (var8 & 15) + this.method7072().method24357()));
            }

            Class7038 var9 = this.method7106(var7 >> 4);
            BlockState var10 = var9.method21856(var6 & 15, var7 & 15, var8 & 15, var2);
            if (this.field9094.method34306(ChunkStatus.field42141)
               && var2 != var10
               && (
                  var2.getOpacity(this, var1) != var10.getOpacity(this, var1)
                     || var2.getLightValue() != var10.getLightValue()
                     || var2.isTransparent()
                     || var10.isTransparent()
               )) {
               Class196 var11 = this.method7112();
               var11.checkBlock(var1);
            }

            EnumSet<Class101> var16 = this.method7080().method34305();
            EnumSet var12 = null;

            for (Class101 var14 : var16) {
               Class7527 var15 = this.field9093.get(var14);
               if (var15 == null) {
                  if (var12 == null) {
                     var12 = EnumSet.<Class101>noneOf(Class101.class);
                  }

                  var12.add(var14);
               }
            }

            if (var12 != null) {
               Class7527.method24577(this, var12);
            }

            for (Class101 var18 : var16) {
               this.field9093.get(var18).method24578(var6 & 15, var7, var8 & 15, var2);
            }

            return var10;
         }
      } else {
         return Blocks.field37011.method11579();
      }
   }

   public Class7038 method7106(int var1) {
      if (this.field9097[var1] == Chunk.field9111) {
         this.field9097[var1] = new Class7038(var1 << 4);
      }

      return this.field9097[var1];
   }

   @Override
   public void method7062(BlockPos var1, TileEntity var2) {
      var2.method3782(var1);
      this.field9095.put(var1, var2);
   }

   @Override
   public Set<BlockPos> method7066() {
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
   public void method7063(Entity var1) {
      if (!var1.isPassenger()) {
         CompoundNBT var4 = new CompoundNBT();
         var1.method3293(var4);
         this.method7108(var4);
      }
   }

   public List<CompoundNBT> method7109() {
      return this.field9098;
   }

   public void method7110(Class1684 var1) {
      this.field9091 = var1;
   }

   @Nullable
   @Override
   public Class1684 method7077() {
      return this.field9091;
   }

   @Override
   public void method7078(boolean var1) {
      this.field9090 = var1;
   }

   @Override
   public boolean method7079() {
      return this.field9090;
   }

   @Override
   public ChunkStatus method7080() {
      return this.field9094;
   }

   public void method7111(ChunkStatus var1) {
      this.field9094 = var1;
      this.method7078(true);
   }

   @Override
   public Class7038[] method7067() {
      return this.field9097;
   }

   @Nullable
   public Class196 method7112() {
      return this.field9092;
   }

   @Override
   public Collection<Entry<Class101, Class7527>> method7068() {
      return Collections.<Entry<Class101, Class7527>>unmodifiableSet(this.field9093.entrySet());
   }

   @Override
   public void method7069(Class101 var1, long[] var2) {
      this.method7070(var1).method24582(var2);
   }

   @Override
   public Class7527 method7070(Class101 var1) {
      return this.field9093.computeIfAbsent(var1, var1x -> new Class7527(this, var1x));
   }

   @Override
   public int method7071(Class101 var1, int var2, int var3) {
      Class7527 var6 = this.field9093.get(var1);
      if (var6 == null) {
         Class7527.method24577(this, EnumSet.<Class101>of(var1));
         var6 = this.field9093.get(var1);
      }

      return var6.method24579(var2 & 15, var3 & 15) - 1;
   }

   @Override
   public Class7481 method7072() {
      return this.field9089;
   }

   @Override
   public void method7073(long var1) {
   }

   @Nullable
   @Override
   public Class5444<?> method7097(Structure<?> var1) {
      return this.field9101.get(var1);
   }

   @Override
   public void method7098(Structure<?> var1, Class5444<?> var2) {
      this.field9101.put(var1, var2);
      this.field9090 = true;
   }

   @Override
   public Map<Structure<?>, Class5444<?>> method7074() {
      return Collections.<Structure<?>, Class5444<?>>unmodifiableMap(this.field9101);
   }

   @Override
   public void method7075(Map<Structure<?>, Class5444<?>> var1) {
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

   public static BlockPos method7114(short var0, int var1, Class7481 var2) {
      int var5 = (var0 & 15) + (var2.field32174 << 4);
      int var6 = (var0 >>> 4 & 15) + (var1 << 4);
      int var7 = (var0 >>> 8 & 15) + (var2.field32175 << 4);
      return new BlockPos(var5, var6, var7);
   }

   @Override
   public void method7082(BlockPos var1) {
      if (!World.isOutsideBuildHeight(var1)) {
         IChunk.method7094(this.field9100, var1.getY() >> 4).add(method7113(var1));
      }
   }

   @Override
   public ShortList[] method7083() {
      return this.field9100;
   }

   @Override
   public void method7084(short var1, int var2) {
      IChunk.method7094(this.field9100, var2).add(var1);
   }

   public Class6806<Block> method7089() {
      return this.field9104;
   }

   public Class6806<Fluid> method7090() {
      return this.field9105;
   }

   @Override
   public Class8922 method7091() {
      return this.field9103;
   }

   @Override
   public void method7092(long var1) {
      this.field9106 = var1;
   }

   @Override
   public long method7093() {
      return this.field9106;
   }

   @Override
   public void method7085(CompoundNBT var1) {
      this.field9096.put(new BlockPos(var1.getInt("x"), var1.getInt("y"), var1.getInt("z")), var1);
   }

   public Map<BlockPos, CompoundNBT> method7115() {
      return Collections.<BlockPos, CompoundNBT>unmodifiableMap(this.field9096);
   }

   @Override
   public CompoundNBT method7086(BlockPos var1) {
      return this.field9096.get(var1);
   }

   @Nullable
   @Override
   public CompoundNBT method7087(BlockPos var1) {
      TileEntity var4 = this.getTileEntity(var1);
      return var4 == null ? this.field9096.get(var1) : var4.write(new CompoundNBT());
   }

   @Override
   public void method7081(BlockPos var1) {
      this.field9095.remove(var1);
      this.field9096.remove(var1);
   }

   @Nullable
   public BitSet method7116(Class97 var1) {
      return this.field9107.get(var1);
   }

   public BitSet method7117(Class97 var1) {
      return this.field9107.computeIfAbsent(var1, var0 -> new BitSet(65536));
   }

   public void method7118(Class97 var1, BitSet var2) {
      this.field9107.put(var1, var2);
   }

   public void method7119(Class196 var1) {
      this.field9092 = var1;
   }

   @Override
   public boolean method7095() {
      return this.field9108;
   }

   @Override
   public void method7096(boolean var1) {
      this.field9108 = var1;
      this.method7078(true);
   }
}
