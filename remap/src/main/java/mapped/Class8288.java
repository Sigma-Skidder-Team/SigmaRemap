// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Sets;
import java.util.IdentityHashMap;

import net.minecraft.util.Direction;
import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.EnumSet;
import org.apache.logging.log4j.Logger;

public class Class8288
{
    private static final Logger field34077;
    public static final Class8288 field34078;
    private static final Class322[] field34079;
    private final EnumSet<Class322> field34080;
    private final int[][] field34081;
    private static final Map<Class3833, Class2168> field34082;
    private static final Set<Class2168> field34083;
    
    private Class8288() {
        this.field34080 = EnumSet.noneOf(Class322.class);
        this.field34081 = new int[16][];
    }
    
    public Class8288(final Class51 class51) {
        this();
        if (class51.method316("Indices", 10)) {
            final Class51 method327 = class51.method327("Indices");
            for (int i = 0; i < this.field34081.length; ++i) {
                final String value = String.valueOf(i);
                if (method327.method316(value, 11)) {
                    this.field34081[i] = method327.method325(value);
                }
            }
        }
        final int method328 = class51.method319("Sides");
        for (final Class322 e : Class322.values()) {
            if ((method328 & 1 << e.ordinal()) != 0x0) {
                this.field34080.add(e);
            }
        }
    }
    
    public void method27546(final Class1862 class1864) {
        this.method27549(class1864);
        final Class322[] field34079 = Class8288.field34079;
        for (int length = field34079.length, i = 0; i < length; ++i) {
            method27547(class1864, field34079[i]);
        }
        Class8288.field34083.forEach(class1865 -> {
            class1864.method7065();
            class1865.method8336(class1863);
        });
    }
    
    private static void method27547(final Class1862 class1862, final Class322 o) {
        final Class1847 method7065 = class1862.method7065();
        if (class1862.method7039().field34080.remove(o)) {
            final Set<Direction> method7066 = o.method993();
            final boolean contains = method7066.contains(Direction.EAST);
            final boolean contains2 = method7066.contains(Direction.WEST);
            final boolean contains3 = method7066.contains(Direction.SOUTH);
            final boolean contains4 = method7066.contains(Direction.NORTH);
            final boolean b = method7066.size() == 1;
            final Class7859 method7067 = class1862.method7019();
            final int n = method7067.method25426() + ((b && (contains4 || contains3)) ? 1 : (contains2 ? 0 : 15));
            final int n2 = method7067.method25426() + ((b && (contains4 || contains3)) ? 14 : (contains2 ? 0 : 15));
            final int n3 = method7067.method25427() + ((b && (contains || contains2)) ? 1 : (contains4 ? 0 : 15));
            final int n4 = method7067.method25427() + ((b && (contains || contains2)) ? 14 : (contains4 ? 0 : 15));
            final Direction[] values = Direction.values();
            final Class385 class1863 = new Class385();
            for (final BlockPos class1864 : BlockPos.method1158(n, 0, n3, n2, method7065.method6986() - 1, n4)) {
                Class7096 class1866;
                final Class7096 class1865 = class1866 = method7065.method6701(class1864);
                for (final Direction class1867 : values) {
                    class1863.method1287(class1864).method1290(class1867);
                    class1866 = method27548(class1866, class1867, method7065, class1864, class1863);
                }
                Class3833.method11787(class1865, class1866, method7065, class1864, 18);
            }
        }
    }
    
    private static Class7096 method27548(final Class7096 class7096, final Direction class7097, final Class1851 class7098, final BlockPos class7099, final BlockPos class7100) {
        return Class8288.field34082.getOrDefault(class7096.method21696(), Class2167.field12889).method8335(class7096, class7097, class7098.method6701(class7100), class7098, class7099, class7100);
    }
    
    private void method27549(final Class1862 class1862) {
        try (final Class386 method1296 = Class386.method1296();
             final Class386 method1297 = Class386.method1296()) {
            final Class7859 method1298 = class1862.method7019();
            final Class1847 method1299 = class1862.method7065();
            for (int i = 0; i < 16; ++i) {
                final Class8199 class1863 = class1862.method7014()[i];
                final int[] array = this.field34081[i];
                this.field34081[i] = null;
                if (class1863 != null && array != null && array.length > 0) {
                    final Direction[] values = Direction.values();
                    final Class7875<Class7096> method1300 = class1863.method27161();
                    for (final int n : array) {
                        method1296.method1300(method1298.method25426() + (n & 0xF), (i << 4) + (n >> 8 & 0xF), method1298.method25427() + (n >> 4 & 0xF));
                        Class7096 method1301;
                        final Class7096 class1864 = method1301 = method1300.method25508(n);
                        for (final Direction class1865 : values) {
                            method1297.method1303(method1296).method1304(class1865);
                            if (method1296.getX() >> 4 == method1298.field32290 && method1296.getZ() >> 4 == method1298.field32291) {
                                method1301 = method27548(method1301, class1865, method1299, method1296, method1297);
                            }
                        }
                        Class3833.method11787(class1864, method1301, method1299, method1296, 18);
                    }
                }
            }
            for (int l = 0; l < this.field34081.length; ++l) {
                if (this.field34081[l] != null) {
                    Class8288.field34077.warn("Discarding update data for section {} for chunk ({} {})", (Object)l, (Object)method1298.field32290, (Object)method1298.field32291);
                }
                this.field34081[l] = null;
            }
        }
    }
    
    public boolean method27550() {
        final int[][] field34081 = this.field34081;
        for (int length = field34081.length, i = 0; i < length; ++i) {
            if (field34081[i] != null) {
                return false;
            }
        }
        return this.field34080.isEmpty();
    }
    
    public Class51 method27551() {
        final Class51 class51 = new Class51();
        final Class51 class52 = new Class51();
        for (int i = 0; i < this.field34081.length; ++i) {
            final String value = String.valueOf(i);
            if (this.field34081[i] != null) {
                if (this.field34081[i].length != 0) {
                    class52.method308(value, this.field34081[i]);
                }
            }
        }
        if (!class52.method331()) {
            class51.method295("Indices", class52);
        }
        int n = 0;
        final Iterator<Object> iterator = this.field34080.iterator();
        while (iterator.hasNext()) {
            n |= 1 << iterator.next().ordinal();
        }
        class51.method296("Sides", (byte)n);
        return class51;
    }
    
    static {
        field34077 = LogManager.getLogger();
        field34078 = new Class8288();
        field34079 = Class322.values();
        field34082 = new IdentityHashMap<Class3833, Class2168>();
        field34083 = Sets.newHashSet();
    }
}
