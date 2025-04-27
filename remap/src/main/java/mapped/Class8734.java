// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.longs.LongList;
import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.io.IOException;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import java.util.Locale;
import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.List;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.dimension.DimensionType;

import java.util.Map;

public class Class8734
{
    private static final Map<String, String> field36696;
    private static final Map<String, String> field36697;
    private final boolean field36698;
    private final Map<String, Long2ObjectMap<CompoundNBT>> field36699;
    private final Map<String, Class6360> field36700;
    private final List<String> field36701;
    private final List<String> field36702;
    
    public Class8734(final Class8213 class8213, final List<String> field36701, final List<String> field36702) {
        this.field36699 = Maps.newHashMap();
        this.field36700 = Maps.newHashMap();
        this.field36701 = field36701;
        this.field36702 = field36702;
        this.method30175(class8213);
        boolean field36703 = false;
        final Iterator<String> iterator = this.field36702.iterator();
        while (iterator.hasNext()) {
            field36703 |= (this.field36699.get(iterator.next()) != null);
        }
        this.field36698 = field36703;
    }
    
    public void method30170(final long n) {
        final Iterator<String> iterator = this.field36701.iterator();
        while (iterator.hasNext()) {
            final Class6360 class6360 = this.field36700.get(iterator.next());
            if (class6360 == null) {
                continue;
            }
            if (!class6360.method18945(n)) {
                continue;
            }
            class6360.method18946(n);
            class6360.method18903();
        }
    }
    
    public CompoundNBT method30171(CompoundNBT method30174) {
        final CompoundNBT method30175 = method30174.getCompound("Level");
        final ChunkPos class7859 = new ChunkPos(method30175.getInt("xPos"), method30175.getInt("zPos"));
        if (this.method30173(class7859.field32290, class7859.field32291)) {
            method30174 = this.method30174(method30174, class7859);
        }
        final CompoundNBT method30176 = method30175.getCompound("Structures");
        final CompoundNBT method30177 = method30176.getCompound("References");
        for (final String s : this.field36702) {
            final Class4574 class7860 = Class4535.field20023.get(s.toLowerCase(Locale.ROOT));
            if (method30177.contains(s, 12)) {
                continue;
            }
            if (class7860 == null) {
                continue;
            }
            final int method30178 = class7860.method13597();
            final LongArrayList list = new LongArrayList();
            for (int i = class7859.field32290 - method30178; i <= class7859.field32290 + method30178; ++i) {
                for (int j = class7859.field32291 - method30178; j <= class7859.field32291 + method30178; ++j) {
                    if (this.method30172(i, j, s)) {
                        list.add(ChunkPos.method25423(i, j));
                    }
                }
            }
            method30177.putLongArray(s, list);
        }
        method30176.put("References", method30177);
        method30175.put("Structures", method30176);
        method30174.put("Level", method30175);
        return method30174;
    }
    
    private boolean method30172(final int n, final int n2, final String s) {
        return this.field36698 && this.field36699.get(s) != null && this.field36700.get(Class8734.field36696.get(s)).method18944(ChunkPos.method25423(n, n2));
    }
    
    private boolean method30173(final int n, final int n2) {
        if (this.field36698) {
            for (final String s : this.field36702) {
                if (this.field36699.get(s) != null && this.field36700.get(Class8734.field36696.get(s)).method18945(ChunkPos.method25423(n, n2))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    private CompoundNBT method30174(final CompoundNBT class51, final ChunkPos class52) {
        final CompoundNBT method327 = class51.getCompound("Level");
        final CompoundNBT method328 = method327.getCompound("Structures");
        final CompoundNBT method329 = method328.getCompound("Starts");
        for (final String s : this.field36702) {
            final Long2ObjectMap long2ObjectMap = this.field36699.get(s);
            if (long2ObjectMap == null) {
                continue;
            }
            final long method330 = class52.method25422();
            if (!this.field36700.get(Class8734.field36696.get(s)).method18945(method330)) {
                continue;
            }
            final CompoundNBT class53 = (CompoundNBT)long2ObjectMap.get(method330);
            if (class53 == null) {
                continue;
            }
            method329.put(s, class53);
        }
        method328.put("Starts", method329);
        method327.put("Structures", method328);
        class51.put("Level", method327);
        return class51;
    }
    
    private void method30175(final Class8213 class8213) {
        if (class8213 != null) {
            for (final String str : this.field36701) {
                CompoundNBT method327 = new CompoundNBT();
                try {
                    method327 = class8213.method27212(str, 1493).getCompound("data").getCompound("Features");
                    if (method327.method331()) {
                        continue;
                    }
                }
                catch (final IOException ex) {}
                final Iterator<String> iterator2 = method327.keySet().iterator();
                while (iterator2.hasNext()) {
                    final CompoundNBT method328 = method327.getCompound(iterator2.next());
                    final long method329 = ChunkPos.method25423(method328.getInt("ChunkX"), method328.getInt("ChunkZ"));
                    final ListNBT method330 = method328.getList("Children", 10);
                    if (!method330.isEmpty()) {
                        final String s = Class8734.field36697.get(method330.method346(0).getString("id"));
                        if (s != null) {
                            method328.putString("id", s);
                        }
                    }
                    this.field36699.computeIfAbsent(method328.getString("id"), p0 -> new Long2ObjectOpenHashMap()).put(method329, (Object)method328);
                }
                final String string = str + "_index";
                final Class6360 class8214 = class8213.method27208(() -> new Class6360(s2), string);
                if (!class8214.method18947().isEmpty()) {
                    this.field36700.put(str, class8214);
                }
                else {
                    final Class6360 class8215 = new Class6360(string);
                    this.field36700.put(str, class8215);
                    final Iterator<String> iterator3 = method327.keySet().iterator();
                    while (iterator3.hasNext()) {
                        final CompoundNBT method331 = method327.getCompound(iterator3.next());
                        class8215.method18943(ChunkPos.method25423(method331.getInt("ChunkX"), method331.getInt("ChunkZ")));
                    }
                    class8215.method18903();
                }
            }
        }
    }
    
    public static Class8734 method30176(final DimensionType class383, final Class8213 class384) {
        if (class383 == DimensionType.field2223) {
            return new Class8734(class384, (List<String>)ImmutableList.of("Monument", "Stronghold", "Village", "Mineshaft", "Temple", (Object)"Mansion"), (List<String>)ImmutableList.of("Village", "Mineshaft", "Mansion", "Igloo", "Desert_Pyramid", "Jungle_Pyramid", "Swamp_Hut", "Stronghold", (Object)"Monument"));
        }
        if (class383 == DimensionType.field2224) {
            final ImmutableList of = ImmutableList.of((Object)"Fortress");
            return new Class8734(class384, (List<String>)of, (List<String>)of);
        }
        if (class383 != DimensionType.field2225) {
            throw new RuntimeException(String.format("Unknown dimension type : %s", class383));
        }
        final ImmutableList of2 = ImmutableList.of((Object)"EndCity");
        return new Class8734(class384, (List<String>)of2, (List<String>)of2);
    }
    
    static {
        field36696 = Util.method27851(Maps.newHashMap(), hashMap -> {
            hashMap.put("Village", "Village");
            hashMap.put("Mineshaft", "Mineshaft");
            hashMap.put("Mansion", "Mansion");
            hashMap.put("Igloo", "Temple");
            hashMap.put("Desert_Pyramid", "Temple");
            hashMap.put("Jungle_Pyramid", "Temple");
            hashMap.put("Swamp_Hut", "Temple");
            hashMap.put("Stronghold", "Stronghold");
            hashMap.put("Monument", "Monument");
            hashMap.put("Fortress", "Fortress");
            hashMap.put("EndCity", "EndCity");
        });
        field36697 = Util.method27851(Maps.newHashMap(), hashMap2 -> {
            hashMap2.put("Iglu", "Igloo");
            hashMap2.put("TeDP", "Desert_Pyramid");
            hashMap2.put("TeJP", "Jungle_Pyramid");
            hashMap2.put("TeSH", "Swamp_Hut");
        });
    }
}
