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
import net.minecraft.world.dimension.DimensionType;

import java.util.Map;

public class Class8734
{
    private static final Map<String, String> field36696;
    private static final Map<String, String> field36697;
    private final boolean field36698;
    private final Map<String, Long2ObjectMap<Class51>> field36699;
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
    
    public Class51 method30171(Class51 method30174) {
        final Class51 method30175 = method30174.method327("Level");
        final Class7859 class7859 = new Class7859(method30175.method319("xPos"), method30175.method319("zPos"));
        if (this.method30173(class7859.field32290, class7859.field32291)) {
            method30174 = this.method30174(method30174, class7859);
        }
        final Class51 method30176 = method30175.method327("Structures");
        final Class51 method30177 = method30176.method327("References");
        for (final String s : this.field36702) {
            final Class4574 class7860 = (Class4574)Class4535.field20023.get((Object)s.toLowerCase(Locale.ROOT));
            if (method30177.method316(s, 12)) {
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
                        ((LongList)list).add(Class7859.method25423(i, j));
                    }
                }
            }
            method30177.method311(s, (List<Long>)list);
        }
        method30176.method295("References", method30177);
        method30175.method295("Structures", method30176);
        method30174.method295("Level", method30175);
        return method30174;
    }
    
    private boolean method30172(final int n, final int n2, final String s) {
        return this.field36698 && this.field36699.get(s) != null && this.field36700.get(Class8734.field36696.get(s)).method18944(Class7859.method25423(n, n2));
    }
    
    private boolean method30173(final int n, final int n2) {
        if (this.field36698) {
            for (final String s : this.field36702) {
                if (this.field36699.get(s) != null && this.field36700.get(Class8734.field36696.get(s)).method18945(Class7859.method25423(n, n2))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    private Class51 method30174(final Class51 class51, final Class7859 class52) {
        final Class51 method327 = class51.method327("Level");
        final Class51 method328 = method327.method327("Structures");
        final Class51 method329 = method328.method327("Starts");
        for (final String s : this.field36702) {
            final Long2ObjectMap long2ObjectMap = this.field36699.get(s);
            if (long2ObjectMap == null) {
                continue;
            }
            final long method330 = class52.method25422();
            if (!this.field36700.get(Class8734.field36696.get(s)).method18945(method330)) {
                continue;
            }
            final Class51 class53 = (Class51)long2ObjectMap.get(method330);
            if (class53 == null) {
                continue;
            }
            method329.method295(s, class53);
        }
        method328.method295("Starts", method329);
        method327.method295("Structures", method328);
        class51.method295("Level", method327);
        return class51;
    }
    
    private void method30175(final Class8213 class8213) {
        if (class8213 != null) {
            for (final String str : this.field36701) {
                Class51 method327 = new Class51();
                try {
                    method327 = class8213.method27212(str, 1493).method327("data").method327("Features");
                    if (method327.method331()) {
                        continue;
                    }
                }
                catch (final IOException ex) {}
                final Iterator<String> iterator2 = method327.method293().iterator();
                while (iterator2.hasNext()) {
                    final Class51 method328 = method327.method327(iterator2.next());
                    final long method329 = Class7859.method25423(method328.method319("ChunkX"), method328.method319("ChunkZ"));
                    final Class52 method330 = method328.method328("Children", 10);
                    if (!method330.isEmpty()) {
                        final String s = Class8734.field36697.get(method330.method346(0).method323("id"));
                        if (s != null) {
                            method328.method306("id", s);
                        }
                    }
                    this.field36699.computeIfAbsent(method328.method323("id"), p0 -> new Long2ObjectOpenHashMap()).put(method329, (Object)method328);
                }
                final String string = str + "_index";
                final Class6360 class8214 = class8213.method27208(() -> new Class6360(s2), string);
                if (!class8214.method18947().isEmpty()) {
                    this.field36700.put(str, class8214);
                }
                else {
                    final Class6360 class8215 = new Class6360(string);
                    this.field36700.put(str, class8215);
                    final Iterator<String> iterator3 = method327.method293().iterator();
                    while (iterator3.hasNext()) {
                        final Class51 method331 = method327.method327(iterator3.next());
                        class8215.method18943(Class7859.method25423(method331.method319("ChunkX"), method331.method319("ChunkZ")));
                    }
                    class8215.method18903();
                }
            }
        }
    }
    
    public static Class8734 method30176(final DimensionType class383, final Class8213 class384) {
        if (class383 == DimensionType.field2223) {
            return new Class8734(class384, (List<String>)ImmutableList.of((Object)"Monument", (Object)"Stronghold", (Object)"Village", (Object)"Mineshaft", (Object)"Temple", (Object)"Mansion"), (List<String>)ImmutableList.of((Object)"Village", (Object)"Mineshaft", (Object)"Mansion", (Object)"Igloo", (Object)"Desert_Pyramid", (Object)"Jungle_Pyramid", (Object)"Swamp_Hut", (Object)"Stronghold", (Object)"Monument"));
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
            return;
        });
        field36697 = Util.method27851(Maps.newHashMap(), hashMap2 -> {
            hashMap2.put("Iglu", "Igloo");
            hashMap2.put("TeDP", "Desert_Pyramid");
            hashMap2.put("TeJP", "Jungle_Pyramid");
            hashMap2.put("TeSH", "Swamp_Hut");
        });
    }
}
