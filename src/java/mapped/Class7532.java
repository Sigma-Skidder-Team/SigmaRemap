// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractCollection;
import java.util.AbstractList;
import org.apache.logging.log4j.LogManager;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import it.unimi.dsi.fastutil.shorts.ShortList;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.HashMap;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Map;
import java.util.Collection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.BitSet;
import java.util.Set;
import java.util.EnumSet;
import java.util.Objects;
import org.apache.logging.log4j.Logger;

public class Class7532
{
    private static final Logger field29910;
    
    public static Class1865 method23592(final Class1849 class1849, final Class1795 class1850, final Class1883 class1851, final Class7859 a, final Class51 class1852) {
        final Class6346<?> method7438 = class1849.method6904().method7438();
        final Class1868 method7439 = method7438.method18879();
        final Class51 method7440 = class1852.method327("Level");
        final Class7859 b = new Class7859(method7440.method319("xPos"), method7440.method319("zPos"));
        if (!Objects.equals(a, b)) {
            Class7532.field29910.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", (Object)a, (Object)a, (Object)b);
        }
        final Class1873 class1853 = new Class1873(a, method7439, (int[])(method7440.method316("Biomes", 11) ? method7440.method325("Biomes") : null));
        final Class8288 class1854 = method7440.method316("UpgradeData", 10) ? new Class8288(method7440.method327("UpgradeData")) : Class8288.field34078;
        final Class6951 class1855 = new Class6951<Class3833>(class1862 -> class1862 == null || class1862.method11878().method21706(), a, method7440.method328("ToBeTicked", 9));
        final Class6951 class1856 = new Class6951<Class7255>(class1863 -> class1863 == null || class1863 == Class7558.field29974, a, method7440.method328("LiquidsToBeTicked", 9));
        final boolean method7441 = method7440.method329("isLightOn");
        final Class52 method7442 = method7440.method328("Sections", 10);
        final Class8199[] array = new Class8199[16];
        final boolean method7443 = class1849.method6789().method20503();
        final Class1886 method7444 = class1849.method6904().method7405();
        if (method7441) {
            method7444.method7259(a, true);
        }
        for (int i = 0; i < method7442.size(); ++i) {
            final Class51 method7445 = method7442.method346(i);
            final byte method7446 = method7445.method317("Y");
            if (method7445.method316("Palette", 9)) {
                if (method7445.method316("BlockStates", 12)) {
                    final Class8199 class1857 = new Class8199(method7446 << 4);
                    class1857.method27161().method25511(method7445.method328("Palette", 10), method7445.method326("BlockStates"));
                    class1857.method27160();
                    if (!class1857.method27154()) {
                        array[method7446] = class1857;
                    }
                    class1851.method7213(a, class1857);
                }
            }
            if (method7441) {
                if (method7445.method316("BlockLight", 7)) {
                    method7444.method7256(Class237.field912, Class353.method1090(a, method7446), new Class7281(method7445.method324("BlockLight")));
                }
                if (method7443) {
                    if (method7445.method316("SkyLight", 7)) {
                        method7444.method7256(Class237.field911, Class353.method1090(a, method7446), new Class7281(method7445.method324("SkyLight")));
                    }
                }
            }
        }
        final long method7447 = method7440.method320("InhabitedTime");
        final Class260 method7448 = method23594(class1852);
        Class1860 class1859;
        if (method7448 != Class260.field1244) {
            final Class1865 class1858 = new Class1865(a, class1854, array, (Class6951<Class3833>)class1855, (Class6951<Class7255>)class1856);
            class1858.method7097(class1853);
            class1859 = class1858;
            class1858.method7040(method7447);
            class1858.method7098(Class9312.method34449(method7440.method323("Status")));
            if (class1858.method7027().method34451(Class9312.field39985)) {
                class1858.method7106(method7444);
            }
            if (!method7441) {
                if (class1858.method7027().method34451(Class9312.field39986)) {
                    for (final Class354 class1860 : Class354.method1158(a.method25426(), 0, a.method25427(), a.method25428(), 255, a.method25429())) {
                        if (class1859.method6701(class1860).method21704() == 0) {
                            continue;
                        }
                        class1858.method7092(class1860);
                    }
                }
            }
        }
        else {
            Object method7449;
            if (!method7440.method316("TileTicks", 9)) {
                method7449 = class1855;
            }
            else {
                method7449 = Class6956.method21359(method7440.method328("TileTicks", 10), Class90.field208::method503, Class90.field208::method505);
            }
            Object method7450;
            if (!method7440.method316("LiquidTicks", 9)) {
                method7450 = class1856;
            }
            else {
                method7450 = Class6956.method21359(method7440.method328("LiquidTicks", 10), Class90.field206::method503, Class90.field206::method505);
            }
            class1859 = new Class1862(class1849.method6744(), a, class1853, class1854, (Class6952<Class3833>)method7449, (Class6952<Class7255>)method7450, method7447, array, class1865 -> method23595(class1864, class1865));
        }
        class1859.method7044(method7441);
        final Class51 method7451 = method7440.method327("Heightmaps");
        final EnumSet<Class2020> none = EnumSet.noneOf(Class2020.class);
        for (final Class2020 e : class1859.method7027().method34450()) {
            final String method7452 = e.method8060();
            if (!method7451.method316(method7452, 12)) {
                none.add(e);
            }
            else {
                class1859.method7016(e, method7451.method326(method7452));
            }
        }
        Class9548.method35711(class1859, none);
        final Class51 method7453 = method7440.method327("Structures");
        class1859.method7022(method23597(method7438, class1850, method7453));
        class1859.method7050(method23598(a, method7453));
        if (method7440.method329("shouldSave")) {
            class1859.method7025(true);
        }
        final Class52 method7454 = method7440.method328("PostProcessing", 9);
        for (int j = 0; j < method7454.size(); ++j) {
            final Class52 method7455 = method7454.method347(j);
            for (int k = 0; k < method7455.size(); ++k) {
                class1859.method7031(method7455.method348(k), j);
            }
        }
        if (method7448 != Class260.field1244) {
            final Class1865 class1861 = (Class1865)class1859;
            final Class52 method7456 = method7440.method328("Entities", 10);
            for (int l = 0; l < method7456.size(); ++l) {
                class1861.method7095(method7456.method346(l));
            }
            final Class52 method7457 = method7440.method328("TileEntities", 10);
            for (int n = 0; n < method7457.size(); ++n) {
                class1859.method7032(method7457.method346(n));
            }
            final Class52 method7458 = method7440.method328("Lights", 9);
            for (int n2 = 0; n2 < method7458.size(); ++n2) {
                final Class52 method7459 = method7458.method347(n2);
                for (int n3 = 0; n3 < method7459.size(); ++n3) {
                    class1861.method7091(method7459.method348(n3), n2);
                }
            }
            final Class51 method7460 = method7440.method327("CarvingMasks");
            for (final String s : method7460.method293()) {
                class1861.method7105(Class2126.valueOf(s), BitSet.valueOf(method7460.method324(s)));
            }
            return class1861;
        }
        return new Class1866((Class1862)class1859);
    }
    
    public static Class51 method23593(final Class1849 class1849, final Class1860 class1850) {
        final Class7859 method7019 = class1850.method7019();
        final Class51 class1851 = new Class51();
        final Class51 class1852 = new Class51();
        class1851.method298("DataVersion", Class9528.method35579().getWorldVersion());
        class1851.method295("Level", class1852);
        class1852.method298("xPos", method7019.field32290);
        class1852.method298("zPos", method7019.field32291);
        class1852.method299("LastUpdate", class1849.method6754());
        class1852.method299("InhabitedTime", class1850.method7041());
        class1852.method306("Status", class1850.method7027().method34443());
        final Class8288 method7020 = class1850.method7039();
        if (!method7020.method27550()) {
            class1852.method295("UpgradeData", method7020.method27551());
        }
        final Class8199[] method7021 = class1850.method7014();
        final Class52 class1853 = new Class52();
        final Class1885 method7022 = class1849.method6904().method7422();
        final boolean method7023 = class1850.method7043();
        for (int i = -1; i < 17; ++i) {
            final int n = i;
            final Class8199 class1854 = Arrays.stream(method7021).filter(class1863 -> class1863 != null && class1863.method27159() >> 4 == n2).findFirst().orElse(Class1862.field10141);
            final Class7281 method7024 = method7022.method7288(Class237.field912).method7292(Class353.method1090(method7019, n));
            final Class7281 method7025 = method7022.method7288(Class237.field911).method7292(Class353.method1090(method7019, n));
            if (class1854 == Class1862.field10141) {
                if (method7024 == null) {
                    if (method7025 == null) {
                        continue;
                    }
                }
            }
            final Class51 e = new Class51();
            e.method296("Y", (byte)(n & 0xFF));
            if (class1854 != Class1862.field10141) {
                class1854.method27161().method25512(e, "Palette", "BlockStates");
            }
            if (method7024 != null) {
                if (!method7024.method22329()) {
                    e.method307("BlockLight", method7024.method22321());
                }
            }
            if (method7025 != null) {
                if (!method7025.method22329()) {
                    e.method307("SkyLight", method7025.method22321());
                }
            }
            ((AbstractList<Class51>)class1853).add(e);
        }
        class1852.method295("Sections", class1853);
        if (method7023) {
            class1852.method312("isLightOn", true);
        }
        final Class1873 method7026 = class1850.method7024();
        if (method7026 != null) {
            class1852.method308("Biomes", method7026.method7125());
        }
        final Class52 class1855 = new Class52();
        final Iterator<Class354> iterator = class1850.method7013().iterator();
        while (iterator.hasNext()) {
            final Class51 method7027 = class1850.method7034(iterator.next());
            if (method7027 == null) {
                continue;
            }
            ((AbstractList<Class51>)class1855).add(method7027);
        }
        class1852.method295("TileEntities", class1855);
        final Class52 class1856 = new Class52();
        if (class1850.method7027().method34448() != Class260.field1244) {
            final Class1865 class1857 = (Class1865)class1850;
            ((AbstractCollection<Object>)class1856).addAll(class1857.method7096());
            class1852.method295("Lights", method23599(class1857.method7090()));
            final Class51 class1858 = new Class51();
            for (final Class2126 class1859 : Class2126.values()) {
                class1858.method307(class1859.toString(), class1850.method7038(class1859).toByteArray());
            }
            class1852.method295("CarvingMasks", class1858);
        }
        else {
            final Class1862 class1860 = (Class1862)class1850;
            class1860.method7068(false);
            for (int k = 0; k < class1860.method7067().length; ++k) {
                for (final Class399 class1861 : class1860.method7067()[k]) {
                    final Class51 e2 = new Class51();
                    if (!class1861.method1755(e2)) {
                        continue;
                    }
                    class1860.method7068(true);
                    ((AbstractList<Class51>)class1856).add(e2);
                }
            }
        }
        class1852.method295("Entities", class1856);
        final Class6952<Class3833> method7028 = class1850.method7036();
        if (!(method7028 instanceof Class6951)) {
            if (!(method7028 instanceof Class6956)) {
                class1852.method295("TileTicks", class1849.method6907().method21351(method7019));
            }
            else {
                class1852.method295("TileTicks", ((Class6956)method7028).method21358(class1849.method6754()));
            }
        }
        else {
            class1852.method295("ToBeTicked", ((Class6951)method7028).method21338());
        }
        final Class6952<Class7255> method7029 = class1850.method7037();
        if (!(method7029 instanceof Class6951)) {
            if (!(method7029 instanceof Class6956)) {
                class1852.method295("LiquidTicks", class1849.method6908().method21351(method7019));
            }
            else {
                class1852.method295("LiquidTicks", ((Class6956)method7029).method21358(class1849.method6754()));
            }
        }
        else {
            class1852.method295("LiquidsToBeTicked", ((Class6951)method7029).method21338());
        }
        class1852.method295("PostProcessing", method23599(class1850.method7030()));
        final Class51 class1862 = new Class51();
        for (final Map.Entry<Object, V> entry : class1850.method7015()) {
            if (!class1850.method7027().method34450().contains(entry.getKey())) {
                continue;
            }
            class1862.method295(entry.getKey().method8060(), new Class39(((Class9548)entry.getValue()).method35717()));
        }
        class1852.method295("Heightmaps", class1862);
        class1852.method295("Structures", method23596(method7019, class1850.method7021(), class1850.method7049()));
        return class1851;
    }
    
    public static Class260 method23594(final Class51 class51) {
        if (class51 != null) {
            final Class9312 method34449 = Class9312.method34449(class51.method327("Level").method323("Status"));
            if (method34449 != null) {
                return method34449.method34448();
            }
        }
        return Class260.field1243;
    }
    
    private static void method23595(final Class51 class51, final Class1862 class52) {
        final Class52 method328 = class51.method328("Entities", 10);
        final Class1847 method329 = class52.method7065();
        for (int i = 0; i < method328.size(); ++i) {
            Class7499.method23378(method328.method346(i), method329, class55 -> {
                class53.method7010(class55);
                return class55;
            });
            class52.method7068(true);
        }
        final Class52 method330 = class51.method328("TileEntities", 10);
        for (int j = 0; j < method330.size(); ++j) {
            final Class51 method331 = method330.method346(j);
            if (!method331.method329("keepPacked")) {
                final Class436 method332 = Class436.method2190(method331);
                if (method332 != null) {
                    class52.method7056(method332);
                }
            }
            else {
                class52.method7032(method331);
            }
        }
    }
    
    private static Class51 method23596(final Class7859 class7859, final Map<String, Class5936> map, final Map<String, LongSet> map2) {
        final Class51 class7860 = new Class51();
        final Class51 class7861 = new Class51();
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            class7861.method295(entry.getKey(), ((Class5936)entry.getValue()).method17855(class7859.field32290, class7859.field32291));
        }
        class7860.method295("Starts", class7861);
        final Class51 class7862 = new Class51();
        for (final Map.Entry<String, V> entry2 : map2.entrySet()) {
            class7862.method295(entry2.getKey(), new Class39((LongSet)entry2.getValue()));
        }
        class7860.method295("References", class7862);
        return class7860;
    }
    
    private static Map<String, Class5936> method23597(final Class6346<?> class6346, final Class1795 class6347, final Class51 class6348) {
        final HashMap hashMap = Maps.newHashMap();
        final Class51 method327 = class6348.method327("Starts");
        for (final String s : method327.method293()) {
            hashMap.put(s, Class9380.method34831(class6346, class6347, method327.method327(s)));
        }
        return hashMap;
    }
    
    private static Map<String, LongSet> method23598(final Class7859 class7859, final Class51 class7860) {
        final HashMap hashMap = Maps.newHashMap();
        final Class51 method327 = class7860.method327("References");
        for (final String s : method327.method293()) {
            hashMap.put(s, new LongOpenHashSet(Arrays.stream(method327.method326(s)).filter(n2 -> {
                final Class7859 class7862 = new Class7859(n2);
                if (class7862.method25436(class7861) <= 8) {
                    return true;
                }
                else {
                    Class7532.field29910.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", (Object)s2, (Object)class7862, (Object)class7861);
                    return false;
                }
            }).toArray()));
        }
        return hashMap;
    }
    
    public static Class52 method23599(final ShortList[] array) {
        final Class52 class52 = new Class52();
        for (final ShortList list : array) {
            final Class52 e = new Class52();
            if (list != null) {
                final ShortListIterator iterator = list.iterator();
                while (((Iterator)iterator).hasNext()) {
                    ((AbstractList<Class48>)e).add(Class48.method286((short)((Iterator)iterator).next()));
                }
            }
            ((AbstractList<Class52>)class52).add(e);
        }
        return class52;
    }
    
    static {
        field29910 = LogManager.getLogger();
    }
}
