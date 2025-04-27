// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractCollection;
import java.util.AbstractList;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.lighting.WorldLightManager;
import org.apache.logging.log4j.LogManager;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import it.unimi.dsi.fastutil.shorts.ShortList;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.HashMap;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.Arrays;
import java.util.Iterator;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Objects;
import org.apache.logging.log4j.Logger;

public class Class7532
{
    private static final Logger field29910;
    
    public static Class1865 method23592(final Class1849 class1849, final Class1795 class1850, final Class1883 class1851, final ChunkPos a, final CompoundNBT class1852) {
        final Class6346<?> method7438 = class1849.method6904().method7438();
        final Class1868 method7439 = method7438.method18879();
        final CompoundNBT method7440 = class1852.getCompound("Level");
        final ChunkPos b = new ChunkPos(method7440.getInt("xPos"), method7440.getInt("zPos"));
        if (!Objects.equals(a, b)) {
            Class7532.field29910.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", a, a, b);
        }
        final Class1873 class1853 = new Class1873(a, method7439, method7440.contains("Biomes", 11) ? method7440.getIntArray("Biomes") : null);
        final Class8288 class1854 = method7440.contains("UpgradeData", 10) ? new Class8288(method7440.getCompound("UpgradeData")) : Class8288.field34078;
        final Class6951 class1855 = new Class6951<Block>(class1862 -> class1862 == null || class1862.getDefaultState().method21706(), a, method7440.getList("ToBeTicked", 9));
        final Class6951 class1856 = new Class6951<Fluid>(class1863 -> class1863 == null || class1863 == Class7558.field29974, a, method7440.getList("LiquidsToBeTicked", 9));
        final boolean method7441 = method7440.getBoolean("isLightOn");
        final ListNBT method7442 = method7440.getList("Sections", 10);
        final Class8199[] array = new Class8199[16];
        final boolean method7443 = class1849.method6789().method20503();
        final WorldLightManager method7444 = class1849.method6904().getLightManager();
        if (method7441) {
            method7444.method7259(a, true);
        }
        for (int i = 0; i < method7442.size(); ++i) {
            final CompoundNBT method7445 = method7442.method346(i);
            final byte method7446 = method7445.getByte("Y");
            if (method7445.contains("Palette", 9)) {
                if (method7445.contains("BlockStates", 12)) {
                    final Class8199 class1857 = new Class8199(method7446 << 4);
                    class1857.method27161().method25511(method7445.getList("Palette", 10), method7445.method326("BlockStates"));
                    class1857.method27160();
                    if (!class1857.method27154()) {
                        array[method7446] = class1857;
                    }
                    class1851.method7213(a, class1857);
                }
            }
            if (method7441) {
                if (method7445.contains("BlockLight", 7)) {
                    method7444.method7256(Class237.field912, Class353.method1090(a, method7446), new Class7281(method7445.getByteArray("BlockLight")));
                }
                if (method7443) {
                    if (method7445.contains("SkyLight", 7)) {
                        method7444.method7256(Class237.field911, Class353.method1090(a, method7446), new Class7281(method7445.getByteArray("SkyLight")));
                    }
                }
            }
        }
        final long method7447 = method7440.getLong("InhabitedTime");
        final ChunkStatus.Type method7448 = method23594(class1852);
        IChunk class1859;
        if (method7448 != ChunkStatus.Type.LEVELCHUNK) {
            final Class1865 class1858 = new Class1865(a, class1854, array, (Class6951<Block>)class1855, (Class6951<Fluid>)class1856);
            class1858.method7097(class1853);
            class1859 = class1858;
            class1858.method7040(method7447);
            class1858.method7098(ChunkStatus.byName(method7440.getString("Status")));
            if (class1858.method7027().isAtLeast(ChunkStatus.FEATURES)) {
                class1858.method7106(method7444);
            }
            if (!method7441) {
                if (class1858.method7027().isAtLeast(ChunkStatus.LIGHT)) {
                    for (final BlockPos class1860 : BlockPos.getAllInBoxMutable(a.method25426(), 0, a.method25427(), a.method25428(), 255, a.method25429())) {
                        if (class1859.getBlockState(class1860).getLightValue() == 0) {
                            continue;
                        }
                        class1858.method7092(class1860);
                    }
                }
            }
        }
        else {
            Object method7449;
            if (!method7440.contains("TileTicks", 9)) {
                method7449 = class1855;
            }
            else {
                method7449 = Class6956.method21359(method7440.getList("TileTicks", 10), Registry.BLOCK::getKey, Registry.BLOCK::getOrDefault);
            }
            Object method7450;
            if (!method7440.contains("LiquidTicks", 9)) {
                method7450 = class1856;
            }
            else {
                method7450 = Class6956.method21359(method7440.getList("LiquidTicks", 10), Registry.FLUID::getKey, Registry.FLUID::getOrDefault);
            }
            class1859 = new Chunk(class1849.method6744(), a, class1853, class1854, (Class6952<Block>)method7449, (Class6952<Fluid>)method7450, method7447, array, class1865 -> method23595(class1864, class1865));
        }
        class1859.method7044(method7441);
        final CompoundNBT method7451 = method7440.getCompound("Heightmaps");
        final EnumSet<HeightmapType> none = EnumSet.noneOf(HeightmapType.class);
        for (final HeightmapType e : class1859.method7027().getHeightMaps()) {
            final String method7452 = e.method8060();
            if (!method7451.contains(method7452, 12)) {
                none.add(e);
            }
            else {
                class1859.method7016(e, method7451.method326(method7452));
            }
        }
        Class9548.method35711(class1859, none);
        final CompoundNBT method7453 = method7440.getCompound("Structures");
        class1859.method7022(method23597(method7438, class1850, method7453));
        class1859.method7050(method23598(a, method7453));
        if (method7440.getBoolean("shouldSave")) {
            class1859.method7025(true);
        }
        final ListNBT method7454 = method7440.getList("PostProcessing", 9);
        for (int j = 0; j < method7454.size(); ++j) {
            final ListNBT method7455 = method7454.method347(j);
            for (int k = 0; k < method7455.size(); ++k) {
                class1859.method7031(method7455.method348(k), j);
            }
        }
        if (method7448 != ChunkStatus.Type.LEVELCHUNK) {
            final Class1865 class1861 = (Class1865)class1859;
            final ListNBT method7456 = method7440.getList("Entities", 10);
            for (int l = 0; l < method7456.size(); ++l) {
                class1861.method7095(method7456.method346(l));
            }
            final ListNBT method7457 = method7440.getList("TileEntities", 10);
            for (int n = 0; n < method7457.size(); ++n) {
                class1859.method7032(method7457.method346(n));
            }
            final ListNBT method7458 = method7440.getList("Lights", 9);
            for (int n2 = 0; n2 < method7458.size(); ++n2) {
                final ListNBT method7459 = method7458.method347(n2);
                for (int n3 = 0; n3 < method7459.size(); ++n3) {
                    class1861.method7091(method7459.method348(n3), n2);
                }
            }
            final CompoundNBT method7460 = method7440.getCompound("CarvingMasks");
            for (final String s : method7460.keySet()) {
                class1861.method7105(Class2126.valueOf(s), BitSet.valueOf(method7460.getByteArray(s)));
            }
            return class1861;
        }
        return new Class1866((Chunk)class1859);
    }
    
    public static CompoundNBT method23593(final Class1849 class1849, final IChunk class1850) {
        final ChunkPos method7019 = class1850.method7019();
        final CompoundNBT class1851 = new CompoundNBT();
        final CompoundNBT class1852 = new CompoundNBT();
        class1851.putInt("DataVersion", Class9528.method35579().getWorldVersion());
        class1851.put("Level", class1852);
        class1852.putInt("xPos", method7019.field32290);
        class1852.putInt("zPos", method7019.field32291);
        class1852.putLong("LastUpdate", class1849.method6754());
        class1852.putLong("InhabitedTime", class1850.method7041());
        class1852.putString("Status", class1850.method7027().getName());
        final Class8288 method7020 = class1850.method7039();
        if (!method7020.method27550()) {
            class1852.put("UpgradeData", method7020.method27551());
        }
        final Class8199[] method7021 = class1850.method7014();
        final ListNBT class1853 = new ListNBT();
        final Class1885 method7022 = class1849.method6904().method7422();
        final boolean method7023 = class1850.method7043();
        for (int i = -1; i < 17; ++i) {
            final int n = i;
            final Class8199 class1854 = Arrays.stream(method7021).filter(class1863 -> class1863 != null && class1863.method27159() >> 4 == n2).findFirst().orElse(Chunk.field10141);
            final Class7281 method7024 = method7022.method7288(Class237.field912).method7292(Class353.method1090(method7019, n));
            final Class7281 method7025 = method7022.method7288(Class237.field911).method7292(Class353.method1090(method7019, n));
            if (class1854 == Chunk.field10141) {
                if (method7024 == null) {
                    if (method7025 == null) {
                        continue;
                    }
                }
            }
            final CompoundNBT e = new CompoundNBT();
            e.putByte("Y", (byte)(n & 0xFF));
            if (class1854 != Chunk.field10141) {
                class1854.method27161().method25512(e, "Palette", "BlockStates");
            }
            if (method7024 != null) {
                if (!method7024.method22329()) {
                    e.putByteArray("BlockLight", method7024.method22321());
                }
            }
            if (method7025 != null) {
                if (!method7025.method22329()) {
                    e.putByteArray("SkyLight", method7025.method22321());
                }
            }
            class1853.add(e);
        }
        class1852.put("Sections", class1853);
        if (method7023) {
            class1852.putBoolean("isLightOn", true);
        }
        final Class1873 method7026 = class1850.method7024();
        if (method7026 != null) {
            class1852.putIntArray("Biomes", method7026.method7125());
        }
        final ListNBT class1855 = new ListNBT();
        final Iterator<BlockPos> iterator = class1850.method7013().iterator();
        while (iterator.hasNext()) {
            final CompoundNBT method7027 = class1850.method7034(iterator.next());
            if (method7027 == null) {
                continue;
            }
            class1855.add(method7027);
        }
        class1852.put("TileEntities", class1855);
        final ListNBT class1856 = new ListNBT();
        if (class1850.method7027().getType() != ChunkStatus.Type.LEVELCHUNK) {
            final Class1865 class1857 = (Class1865)class1850;
            class1856.addAll(class1857.method7096());
            class1852.put("Lights", method23599(class1857.method7090()));
            final CompoundNBT class1858 = new CompoundNBT();
            for (final Class2126 class1859 : Class2126.values()) {
                class1858.putByteArray(class1859.toString(), class1850.method7038(class1859).toByteArray());
            }
            class1852.put("CarvingMasks", class1858);
        }
        else {
            final Chunk class1860 = (Chunk)class1850;
            class1860.method7068(false);
            for (int k = 0; k < class1860.method7067().length; ++k) {
                for (final Entity class1861 : class1860.method7067()[k]) {
                    final CompoundNBT e2 = new CompoundNBT();
                    if (!class1861.method1755(e2)) {
                        continue;
                    }
                    class1860.method7068(true);
                    class1856.add(e2);
                }
            }
        }
        class1852.put("Entities", class1856);
        final Class6952<Block> method7028 = class1850.method7036();
        if (!(method7028 instanceof Class6951)) {
            if (!(method7028 instanceof Class6956)) {
                class1852.put("TileTicks", class1849.method6907().method21351(method7019));
            }
            else {
                class1852.put("TileTicks", ((Class6956)method7028).method21358(class1849.method6754()));
            }
        }
        else {
            class1852.put("ToBeTicked", ((Class6951)method7028).method21338());
        }
        final Class6952<Fluid> method7029 = class1850.method7037();
        if (!(method7029 instanceof Class6951)) {
            if (!(method7029 instanceof Class6956)) {
                class1852.put("LiquidTicks", class1849.method6908().method21351(method7019));
            }
            else {
                class1852.put("LiquidTicks", ((Class6956)method7029).method21358(class1849.method6754()));
            }
        }
        else {
            class1852.put("LiquidsToBeTicked", ((Class6951)method7029).method21338());
        }
        class1852.put("PostProcessing", method23599(class1850.method7030()));
        final CompoundNBT class1862 = new CompoundNBT();
        for (final Map.Entry<Object, V> entry : class1850.method7015()) {
            if (!class1850.method7027().getHeightMaps().contains(entry.getKey())) {
                continue;
            }
            class1862.put(entry.getKey().method8060(), new LongArrayNBT(((Class9548)entry.getValue()).method35717()));
        }
        class1852.put("Heightmaps", class1862);
        class1852.put("Structures", method23596(method7019, class1850.method7021(), class1850.method7049()));
        return class1851;
    }
    
    public static ChunkStatus.Type method23594(final CompoundNBT class51) {
        if (class51 != null) {
            final ChunkStatus method34449 = ChunkStatus.byName(class51.getCompound("Level").getString("Status"));
            if (method34449 != null) {
                return method34449.getType();
            }
        }
        return ChunkStatus.Type.PROTOCHUNK;
    }
    
    private static void method23595(final CompoundNBT class51, final Chunk class52) {
        final ListNBT method328 = class51.getList("Entities", 10);
        final World method329 = class52.method7065();
        for (int i = 0; i < method328.size(); ++i) {
            EntityType.method23378(method328.method346(i), method329, class55 -> {
                class53.method7010(class55);
                return class55;
            });
            class52.method7068(true);
        }
        final ListNBT method330 = class51.getList("TileEntities", 10);
        for (int j = 0; j < method330.size(); ++j) {
            final CompoundNBT method331 = method330.method346(j);
            if (!method331.getBoolean("keepPacked")) {
                final TileEntity method332 = TileEntity.method2190(method331);
                if (method332 != null) {
                    class52.method7056(method332);
                }
            }
            else {
                class52.method7032(method331);
            }
        }
    }
    
    private static CompoundNBT method23596(final ChunkPos class7859, final Map<String, Class5936> map, final Map<String, LongSet> map2) {
        final CompoundNBT class7860 = new CompoundNBT();
        final CompoundNBT class7861 = new CompoundNBT();
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            class7861.put(entry.getKey(), ((Class5936)entry.getValue()).method17855(class7859.field32290, class7859.field32291));
        }
        class7860.put("Starts", class7861);
        final CompoundNBT class7862 = new CompoundNBT();
        for (final Map.Entry<String, V> entry2 : map2.entrySet()) {
            class7862.put(entry2.getKey(), new LongArrayNBT((LongSet)entry2.getValue()));
        }
        class7860.put("References", class7862);
        return class7860;
    }
    
    private static Map<String, Class5936> method23597(final Class6346<?> class6346, final Class1795 class6347, final CompoundNBT class6348) {
        final HashMap hashMap = Maps.newHashMap();
        final CompoundNBT method327 = class6348.getCompound("Starts");
        for (final String s : method327.keySet()) {
            hashMap.put(s, Class9380.method34831(class6346, class6347, method327.getCompound(s)));
        }
        return hashMap;
    }
    
    private static Map<String, LongSet> method23598(final ChunkPos class7859, final CompoundNBT class7860) {
        final HashMap hashMap = Maps.newHashMap();
        final CompoundNBT method327 = class7860.getCompound("References");
        for (final String s : method327.keySet()) {
            hashMap.put(s, new LongOpenHashSet(Arrays.stream(method327.method326(s)).filter(n2 -> {
                final ChunkPos class7862 = new ChunkPos(n2);
                if (class7862.method25436(class7861) <= 8) {
                    return true;
                }
                else {
                    Class7532.field29910.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", (Object)s2, class7862, (Object)class7861);
                    return false;
                }
            }).toArray()));
        }
        return hashMap;
    }
    
    public static ListNBT method23599(final ShortList[] array) {
        final ListNBT class52 = new ListNBT();
        for (final ShortList list : array) {
            final ListNBT e = new ListNBT();
            if (list != null) {
                final ShortListIterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    e.add(ShortNBT.method286((short)((Iterator)iterator).next()));
                }
            }
            class52.add(e);
        }
        return class52;
    }
    
    static {
        field29910 = LogManager.getLogger();
    }
}
