// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractCollection;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.lighting.WorldLightManager;
import org.apache.logging.log4j.LogManager;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Collection;
import com.google.common.collect.Sets;
import javax.annotation.Nullable;
import java.util.Set;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.stream.Stream;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.BitSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class Class1865 implements IChunk
{
    private static final Logger field10168;
    private final ChunkPos field10169;
    private volatile boolean field10170;
    private Class1873 field10171;
    private volatile WorldLightManager field10172;
    private final Map<HeightmapType, Class9548> field10173;
    private volatile ChunkStatus field10174;
    private final Map<BlockPos, TileEntity> field10175;
    private final Map<BlockPos, CompoundNBT> field10176;
    private final Class8199[] field10177;
    private final List<CompoundNBT> field10178;
    private final List<BlockPos> field10179;
    private final ShortList[] field10180;
    private final Map<String, Class5936> field10181;
    private final Map<String, LongSet> field10182;
    private final Class8288 field10183;
    private final Class6951<Block> field10184;
    private final Class6951<Fluid> field10185;
    private long field10186;
    private final Map<Class2126, BitSet> field10187;
    private volatile boolean field10188;
    
    public Class1865(final ChunkPos class7859, final Class8288 class7860) {
        this(class7859, class7860, null, new Class6951<Block>(class7861 -> class7861 == null || class7861.getDefaultState().method21706(), class7859), new Class6951<Fluid>(class7862 -> class7862 == null || class7862 == Class7558.field29974, class7859));
    }
    
    public Class1865(final ChunkPos field10169, final Class8288 field10170, final Class8199[] array, final Class6951<Block> field10171, final Class6951<Fluid> field10172) {
        this.field10173 = Maps.newEnumMap((Class) HeightmapType.class);
        this.field10174 = ChunkStatus.EMPTY;
        this.field10175 = Maps.newHashMap();
        this.field10176 = Maps.newHashMap();
        this.field10177 = new Class8199[16];
        this.field10178 = Lists.newArrayList();
        this.field10179 = Lists.newArrayList();
        this.field10180 = new ShortList[16];
        this.field10181 = Maps.newHashMap();
        this.field10182 = Maps.newHashMap();
        this.field10187 = Maps.newHashMap();
        this.field10169 = field10169;
        this.field10183 = field10170;
        this.field10184 = field10171;
        this.field10185 = field10172;
        if (array != null) {
            if (this.field10177.length != array.length) {
                Class1865.field10168.warn("Could not set level chunk sections, array length is {} instead of {}", array.length, this.field10177.length);
            }
            else {
                System.arraycopy(array, 0, this.field10177, 0, this.field10177.length);
            }
        }
    }
    
    @Override
    public BlockState getBlockState(final BlockPos class354) {
        final int method1075 = class354.getY();
        if (!World.method6684(method1075)) {
            final Class8199 class355 = this.method7014()[method1075 >> 4];
            return Class8199.method27155(class355) ? Blocks.AIR.getDefaultState() : class355.method27148(class354.getX() & 0xF, method1075 & 0xF, class354.getZ() & 0xF);
        }
        return Blocks.VOID_AIR.getDefaultState();
    }
    
    @Override
    public IFluidState getFluidState(final BlockPos class354) {
        final int method1075 = class354.getY();
        if (!World.method6684(method1075)) {
            final Class8199 class355 = this.method7014()[method1075 >> 4];
            return Class8199.method27155(class355) ? Class7558.field29974.getDefaultState() : class355.method27149(class354.getX() & 0xF, method1075 & 0xF, class354.getZ() & 0xF);
        }
        return Class7558.field29974.getDefaultState();
    }
    
    @Override
    public Stream<BlockPos> method7035() {
        return this.field10179.stream();
    }
    
    public ShortList[] method7090() {
        final ShortList[] array = new ShortList[16];
        for (final BlockPos class354 : this.field10179) {
            IChunk.method7042(array, class354.getY() >> 4).add(method7100(class354));
        }
        return array;
    }
    
    public void method7091(final short n, final int n2) {
        this.method7092(method7101(n, n2, this.field10169));
    }
    
    public void method7092(final BlockPos class354) {
        this.field10179.add(class354.toImmutable());
    }
    
    @Nullable
    @Override
    public BlockState method7008(final BlockPos class354, final BlockState class355, final boolean b) {
        final int method1074 = class354.getX();
        final int method1075 = class354.getY();
        final int method1076 = class354.getZ();
        if (method1075 < 0 || method1075 >= 256) {
            return Blocks.VOID_AIR.getDefaultState();
        }
        if (this.field10177[method1075 >> 4] == Chunk.field10141 && class355.getBlock() == Blocks.AIR) {
            return class355;
        }
        if (class355.getLightValue() > 0) {
            this.field10179.add(new BlockPos((method1074 & 0xF) + this.method7019().method25426(), method1075, (method1076 & 0xF) + this.method7019().method25427()));
        }
        final BlockState method1077 = this.method7093(method1075 >> 4).method27152(method1074 & 0xF, method1075 & 0xF, method1076 & 0xF, class355);
        Label_0111: {
            if (this.field10174.isAtLeast(ChunkStatus.FEATURES)) {
                if (class355 != method1077) {
                    if (class355.getOpacity(this, class354) == method1077.getOpacity(this, class354)) {
                        if (class355.getLightValue() == method1077.getLightValue()) {
                            if (!class355.method21703()) {
                                if (!method1077.method21703()) {
                                    break Label_0111;
                                }
                            }
                        }
                    }
                    this.method7099().checkBlock(class354);
                }
            }
        }
        final EnumSet<HeightmapType> method1078 = this.method7027().getHeightMaps();
        Set<HeightmapType> none = null;
        for (final HeightmapType e : method1078) {
            if (this.field10173.get(e) != null) {
                continue;
            }
            if (none == null) {
                none = EnumSet.noneOf(HeightmapType.class);
            }
            ((AbstractCollection<HeightmapType>)none).add(e);
        }
        if (none != null) {
            Class9548.method35711(this, none);
        }
        final Iterator<Object> iterator2 = method1078.iterator();
        while (iterator2.hasNext()) {
            this.field10173.get(iterator2.next()).method35712(method1074 & 0xF, method1075, method1076 & 0xF, class355);
        }
        return method1077;
    }
    
    public Class8199 method7093(final int n) {
        if (this.field10177[n] == Chunk.field10141) {
            this.field10177[n] = new Class8199(n << 4);
        }
        return this.field10177[n];
    }
    
    @Override
    public void method7009(final BlockPos class354, final TileEntity class355) {
        class355.method2203(class354);
        this.field10175.put(class354, class355);
    }
    
    @Override
    public Set<BlockPos> method7013() {
        final HashSet hashSet = Sets.newHashSet((Iterable)this.field10176.keySet());
        hashSet.addAll(this.field10175.keySet());
        return hashSet;
    }
    
    @Nullable
    @Override
    public TileEntity getTileEntity(final BlockPos class354) {
        return this.field10175.get(class354);
    }
    
    public Map<BlockPos, TileEntity> method7094() {
        return this.field10175;
    }
    
    public void method7095(final CompoundNBT class51) {
        this.field10178.add(class51);
    }
    
    @Override
    public void method7010(final Entity class399) {
        final CompoundNBT class400 = new CompoundNBT();
        class399.method1755(class400);
        this.method7095(class400);
    }
    
    public List<CompoundNBT> method7096() {
        return this.field10178;
    }
    
    public void method7097(final Class1873 field10171) {
        this.field10171 = field10171;
    }
    
    @Nullable
    @Override
    public Class1873 method7024() {
        return this.field10171;
    }
    
    @Override
    public void method7025(final boolean field10170) {
        this.field10170 = field10170;
    }
    
    @Override
    public boolean method7026() {
        return this.field10170;
    }
    
    @Override
    public ChunkStatus method7027() {
        return this.field10174;
    }
    
    public void method7098(final ChunkStatus field10174) {
        this.field10174 = field10174;
        this.method7025(true);
    }
    
    @Override
    public Class8199[] method7014() {
        return this.field10177;
    }
    
    @Nullable
    public WorldLightManager method7099() {
        return this.field10172;
    }
    
    @Override
    public Collection<Map.Entry<HeightmapType, Class9548>> method7015() {
        return (Collection<Map.Entry<HeightmapType, Class9548>>)Collections.unmodifiableSet((Set<?>)this.field10173.entrySet());
    }
    
    @Override
    public void method7016(final HeightmapType class2020, final long[] array) {
        this.method7017(class2020).method35716(array);
    }
    
    @Override
    public Class9548 method7017(final HeightmapType key) {
        return this.field10173.computeIfAbsent(key, class2020 -> new Class9548(this, class2020));
    }
    
    @Override
    public int method7018(final HeightmapType e, final int n, final int n2) {
        Class9548 class9548 = this.field10173.get(e);
        if (class9548 == null) {
            Class9548.method35711(this, EnumSet.of(e));
            class9548 = this.field10173.get(e);
        }
        return class9548.method35713(n & 0xF, n2 & 0xF) - 1;
    }
    
    @Override
    public ChunkPos method7019() {
        return this.field10169;
    }
    
    @Override
    public void method7020(final long n) {
    }
    
    @Nullable
    @Override
    public Class5936 method7045(final String s) {
        return this.field10181.get(s);
    }
    
    @Override
    public void method7046(final String s, final Class5936 class5936) {
        this.field10181.put(s, class5936);
        this.field10170 = true;
    }
    
    @Override
    public Map<String, Class5936> method7021() {
        return Collections.unmodifiableMap(this.field10181);
    }
    
    @Override
    public void method7022(final Map<String, Class5936> map) {
        this.field10181.clear();
        this.field10181.putAll(map);
        this.field10170 = true;
    }
    
    @Override
    public LongSet method7047(final String key) {
        return this.field10182.computeIfAbsent(key, p0 -> new LongOpenHashSet());
    }
    
    @Override
    public void method7048(final String key, final long n) {
        this.field10182.computeIfAbsent(key, p0 -> new LongOpenHashSet()).add(n);
        this.field10170 = true;
    }
    
    @Override
    public Map<String, LongSet> method7049() {
        return Collections.unmodifiableMap(this.field10182);
    }
    
    @Override
    public void method7050(final Map<String, LongSet> map) {
        this.field10182.clear();
        this.field10182.putAll(map);
        this.field10170 = true;
    }
    
    public static short method7100(final BlockPos class354) {
        return (short)((class354.getX() & 0xF) | (class354.getY() & 0xF) << 4 | (class354.getZ() & 0xF) << 8);
    }
    
    public static BlockPos method7101(final short n, final int n2, final ChunkPos class7859) {
        return new BlockPos((n & 0xF) + (class7859.field32290 << 4), (n >>> 4 & 0xF) + (n2 << 4), (n >>> 8 & 0xF) + (class7859.field32291 << 4));
    }
    
    @Override
    public void method7029(final BlockPos class354) {
        if (!World.isOutsideBuildHeight(class354)) {
            IChunk.method7042(this.field10180, class354.getY() >> 4).add(method7100(class354));
        }
    }
    
    @Override
    public ShortList[] method7030() {
        return this.field10180;
    }
    
    @Override
    public void method7031(final short n, final int n2) {
        IChunk.method7042(this.field10180, n2).add(n);
    }
    
    public Class6951<Block> method7102() {
        return this.field10184;
    }
    
    public Class6951<Fluid> method7103() {
        return this.field10185;
    }
    
    @Override
    public Class8288 method7039() {
        return this.field10183;
    }
    
    @Override
    public void method7040(final long field10186) {
        this.field10186 = field10186;
    }
    
    @Override
    public long method7041() {
        return this.field10186;
    }
    
    @Override
    public void method7032(final CompoundNBT class51) {
        this.field10176.put(new BlockPos(class51.getInt("x"), class51.getInt("y"), class51.getInt("z")), class51);
    }
    
    public Map<BlockPos, CompoundNBT> method7104() {
        return Collections.unmodifiableMap(this.field10176);
    }
    
    @Override
    public CompoundNBT method7033(final BlockPos class354) {
        return this.field10176.get(class354);
    }
    
    @Nullable
    @Override
    public CompoundNBT method7034(final BlockPos class354) {
        final TileEntity method6727 = this.getTileEntity(class354);
        return (method6727 == null) ? this.field10176.get(class354) : method6727.method2180(new CompoundNBT());
    }
    
    @Override
    public void method7028(final BlockPos class354) {
        this.field10175.remove(class354);
        this.field10176.remove(class354);
    }
    
    @Override
    public BitSet method7038(final Class2126 key) {
        return this.field10187.computeIfAbsent(key, p0 -> new BitSet(65536));
    }
    
    public void method7105(final Class2126 class2126, final BitSet set) {
        this.field10187.put(class2126, set);
    }
    
    public void method7106(final WorldLightManager field10172) {
        this.field10172 = field10172;
    }
    
    @Override
    public boolean method7043() {
        return this.field10188;
    }
    
    @Override
    public void method7044(final boolean field10188) {
        this.field10188 = field10188;
        this.method7025(true);
    }
    
    static {
        field10168 = LogManager.getLogger();
    }
}
