// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.LinkedHashMultiset;
import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;

import javax.annotation.Nullable;

public class Class4094 extends Class4093
{
    public Class4094(final Class8959 class8959) {
        super(class8959);
    }
    
    public static Class8321 method12326(final Class1847 class1847, final int n, final int n2, final byte b, final boolean b2, final boolean b3) {
        final Class8321 class1848 = new Class8321(Class7739.field31425);
        method12330(class1848, class1847, n, n2, b, b2, b3, class1847.field10063.method20487());
        return class1848;
    }
    
    @Nullable
    public static Class6356 method12327(final Class8321 class8321, final Class1847 class8322) {
        return class8322.method6774(method12331(method12329(class8321)));
    }
    
    @Nullable
    public static Class6356 method12328(final Class8321 class8321, final Class1847 class8322) {
        Class6356 class8323 = method12327(class8321, class8322);
        if (class8323 == null) {
            if (!class8322.field10067) {
                class8323 = method12330(class8321, class8322, class8322.method6764().method29536(), class8322.method6764().method29538(), 3, false, false, class8322.field10063.method20487());
            }
        }
        return class8323;
    }
    
    public static int method12329(final Class8321 class8321) {
        final Class51 method27657 = class8321.method27657();
        return (method27657 != null && method27657.method316("map", 99)) ? method27657.method319("map") : 0;
    }
    
    private static Class6356 method12330(final Class8321 class8321, final Class1847 class8322, final int n, final int n2, final int n3, final boolean b, final boolean b2, final Class383 class8323) {
        final int method6776 = class8322.method6776();
        final Class6356 class8324 = new Class6356(method12331(method6776));
        class8324.method18913(n, n2, n3, b, b2, class8323);
        class8322.method6775(class8324);
        class8321.method27658().method298("map", method6776);
        return class8324;
    }
    
    public static String method12331(final int i) {
        return "map_" + i;
    }
    
    public void method12332(final Class1847 class1847, final Entity class1848, final Class6356 class1849) {
        if (class1847.field10063.method20487() == class1849.field25422) {
            if (class1848 instanceof Class512) {
                final int n = 1 << class1849.field25425;
                final int field25420 = class1849.field25420;
                final int field25421 = class1849.field25421;
                final int n2 = MathHelper.floor(class1848.getPosX() - field25420) / n + 64;
                final int n3 = MathHelper.floor(class1848.getPosZ() - field25421) / n + 64;
                int n4 = 128 / n;
                if (class1847.field10063.method20504()) {
                    n4 /= 2;
                }
                final Class9244 method18921;
                final Class9244 class1850 = method18921 = class1849.method18921((Class512)class1848);
                ++method18921.field39650;
                int n5 = 0;
                for (int i = n2 - n4 + 1; i < n2 + n4; ++i) {
                    if ((i & 0xF) == (class1850.field39650 & 0xF) || n5 != 0) {
                        n5 = 0;
                        double n6 = 0.0;
                        for (int j = n3 - n4 - 1; j < n3 + n4; ++j) {
                            if (i >= 0) {
                                if (j >= -1) {
                                    if (i < 128) {
                                        if (j < 128) {
                                            final int n7 = i - n2;
                                            final int n8 = j - n3;
                                            final boolean b = n7 * n7 + n8 * n8 > (n4 - 2) * (n4 - 2);
                                            final int n9 = (field25420 / n + i - 64) * n;
                                            final int n10 = (field25421 / n + j - 64) * n;
                                            final LinkedHashMultiset create = LinkedHashMultiset.create();
                                            final Class1862 method18922 = class1847.method6685(new BlockPos(n9, 0, n10));
                                            if (!method18922.method7062()) {
                                                final Class7859 method18923 = method18922.method7019();
                                                final int n11 = n9 & 0xF;
                                                final int n12 = n10 & 0xF;
                                                int n13 = 0;
                                                double n14 = 0.0;
                                                if (!class1847.field10063.method20504()) {
                                                    final Class385 class1851 = new Class385();
                                                    final Class385 class1852 = new Class385();
                                                    for (int k = 0; k < n; ++k) {
                                                        for (int l = 0; l < n; ++l) {
                                                            int n15 = method18922.method7018(Class2020.field11522, k + n11, l + n12) + 1;
                                                            Class7096 class1853;
                                                            if (n15 > 1) {
                                                                do {
                                                                    --n15;
                                                                    class1851.method1284(method18923.method25426() + k + n11, n15, method18923.method25427() + l + n12);
                                                                    class1853 = method18922.method6701(class1851);
                                                                } while (class1853.method21707(class1847, class1851) == Class8819.field37032 && n15 > 0);
                                                                if (n15 > 0) {
                                                                    if (!class1853.method21756().method21781()) {
                                                                        int n16 = n15 - 1;
                                                                        class1852.method1287(class1851);
                                                                        Class7096 method18924;
                                                                        do {
                                                                            class1852.method1294(n16--);
                                                                            method18924 = method18922.method6701(class1852);
                                                                            ++n13;
                                                                        } while (n16 > 0 && !method18924.method21756().method21781());
                                                                        class1853 = this.method12333(class1847, class1853, class1851);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                class1853 = Class7521.field29172.method11878();
                                                            }
                                                            class1849.method18923(class1847, method18923.method25426() + k + n11, method18923.method25427() + l + n12);
                                                            n14 += n15 / (double)(n * n);
                                                            ((Multiset)create).add((Object)class1853.method21707(class1847, class1851));
                                                        }
                                                    }
                                                }
                                                else {
                                                    final int n17 = n9 + n10 * 231871;
                                                    if ((n17 * n17 * 31287121 + n17 * 11 >> 20 & 0x1) != 0x0) {
                                                        ((Multiset)create).add((Object)Class7521.field29148.method11878().method21707(class1847, BlockPos.ZERO), 100);
                                                    }
                                                    else {
                                                        ((Multiset)create).add((Object)Class7521.field29156.method11878().method21707(class1847, BlockPos.ZERO), 10);
                                                    }
                                                    n14 = 100.0;
                                                }
                                                final int n18 = n13 / (n * n);
                                                final double n19 = (n14 - n6) * 4.0 / (n + 4) + ((i + j & 0x1) - 0.5) * 0.4;
                                                int n20 = 1;
                                                if (n19 > 0.6) {
                                                    n20 = 2;
                                                }
                                                if (n19 < -0.6) {
                                                    n20 = 0;
                                                }
                                                final Class8819 class1854 = (Class8819)Iterables.getFirst((Iterable)Multisets.copyHighestCountFirst((Multiset)create), (Object)Class8819.field37032);
                                                if (class1854 == Class8819.field37044) {
                                                    final double n21 = n18 * 0.1 + (i + j & 0x1) * 0.2;
                                                    n20 = 1;
                                                    if (n21 < 0.5) {
                                                        n20 = 2;
                                                    }
                                                    if (n21 > 0.9) {
                                                        n20 = 0;
                                                    }
                                                }
                                                n6 = n14;
                                                if (j >= 0) {
                                                    if (n7 * n7 + n8 * n8 < n4 * n4) {
                                                        if (!b || (i + j & 0x1) != 0x0) {
                                                            final byte b2 = class1849.field25426[i + j * 128];
                                                            final byte b3 = (byte)(class1854.field37085 * 4 + n20);
                                                            if (b2 != b3) {
                                                                class1849.field25426[i + j * 128] = b3;
                                                                class1849.method18920(i, j);
                                                                n5 = 1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private Class7096 method12333(final Class1847 class1847, final Class7096 class1848, final BlockPos class1849) {
        final Class7099 method21756 = class1848.method21756();
        return (!method21756.method21781() && !class1848.method21761(class1847, class1849, Direction.UP)) ? method21756.method21791() : class1848;
    }
    
    private static boolean method12334(final Class3090[] array, final int n, final int n2, final int n3) {
        return array[n2 * n + n3 * n * 128 * n].method9862() >= 0.0f;
    }
    
    public static void method12335(final Class1849 class1849, final Class8321 class1850) {
        final Class6356 method12328 = method12328(class1850, class1849);
        if (method12328 != null) {
            if (class1849.field10063.method20487() == method12328.field25422) {
                final int n = 1 << method12328.field25425;
                final int field25420 = method12328.field25420;
                final int field25421 = method12328.field25421;
                final Class3090[] array = new Class3090[128 * n * 128 * n];
                for (int i = 0; i < 128 * n; ++i) {
                    for (int j = 0; j < 128 * n; ++j) {
                        array[i * 128 * n + j] = class1849.method6959(new BlockPos((field25420 / n - 64) * n + j, 0, (field25421 / n - 64) * n + i));
                    }
                }
                for (int k = 0; k < 128; ++k) {
                    for (int l = 0; l < 128; ++l) {
                        if (k > 0) {
                            if (l > 0) {
                                if (k < 127) {
                                    if (l < 127) {
                                        final Class3090 class1851 = array[k * n + l * n * 128 * n];
                                        int n2 = 8;
                                        if (method12334(array, n, k - 1, l - 1)) {
                                            --n2;
                                        }
                                        if (method12334(array, n, k - 1, l + 1)) {
                                            --n2;
                                        }
                                        if (method12334(array, n, k - 1, l)) {
                                            --n2;
                                        }
                                        if (method12334(array, n, k + 1, l - 1)) {
                                            --n2;
                                        }
                                        if (method12334(array, n, k + 1, l + 1)) {
                                            --n2;
                                        }
                                        if (method12334(array, n, k + 1, l)) {
                                            --n2;
                                        }
                                        if (method12334(array, n, k, l - 1)) {
                                            --n2;
                                        }
                                        if (method12334(array, n, k, l + 1)) {
                                            --n2;
                                        }
                                        int n3 = 3;
                                        Class8819 class1852 = Class8819.field37032;
                                        if (class1851.method9862() >= 0.0f) {
                                            if (n2 > 0) {
                                                class1852 = Class8819.field37058;
                                                if (n2 <= 3) {
                                                    n3 = 3;
                                                }
                                                else {
                                                    n3 = 1;
                                                }
                                            }
                                        }
                                        else {
                                            class1852 = Class8819.field37047;
                                            if (n2 > 7 && l % 2 == 0) {
                                                n3 = (k + (int)(MathHelper.sin(l + 0.0f) * 7.0f)) / 8 % 5;
                                                if (n3 != 3) {
                                                    if (n3 == 4) {
                                                        n3 = 0;
                                                    }
                                                }
                                                else {
                                                    n3 = 1;
                                                }
                                            }
                                            else if (n2 <= 7) {
                                                if (n2 <= 5) {
                                                    if (n2 <= 3) {
                                                        if (n2 > 1) {
                                                            n3 = 0;
                                                        }
                                                    }
                                                    else {
                                                        n3 = 0;
                                                    }
                                                }
                                                else {
                                                    n3 = 1;
                                                }
                                            }
                                            else {
                                                class1852 = Class8819.field37032;
                                            }
                                        }
                                        if (class1852 != Class8819.field37032) {
                                            method12328.field25426[k + l * 128] = (byte)(class1852.field37085 * 4 + n3);
                                            method12328.method18920(k, l);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void method11722(final Class8321 class8321, final Class1847 class8322, final Entity class8323, final int n, final boolean b) {
        if (!class8322.field10067) {
            final Class6356 method12328 = method12328(class8321, class8322);
            if (method12328 != null) {
                if (class8323 instanceof Class512) {
                    method12328.method18916((Class512)class8323, class8321);
                }
                if (!method12328.field25427) {
                    if (!b) {
                        if (!(class8323 instanceof Class512)) {
                            return;
                        }
                        if (((Class512)class8323).method2714() != class8321) {
                            return;
                        }
                    }
                    this.method12332(class8322, class8323, method12328);
                }
            }
        }
    }
    
    @Nullable
    @Override
    public Class4252<?> method12325(final Class8321 class8321, final Class1847 class8322, final Class512 class8323) {
        return method12328(class8321, class8322).method18919(class8321, class8322, class8323);
    }
    
    @Override
    public void method11723(final Class8321 class8321, final Class1847 class8322, final Class512 class8323) {
        final Class51 method27657 = class8321.method27657();
        if (method27657 != null) {
            if (method27657.method316("map_scale_direction", 99)) {
                method12336(class8321, class8322, method27657.method319("map_scale_direction"));
                method27657.method330("map_scale_direction");
            }
        }
    }
    
    public static void method12336(final Class8321 class8321, final Class1847 class8322, final int n) {
        final Class6356 method12328 = method12328(class8321, class8322);
        if (method12328 != null) {
            method12330(class8321, class8322, method12328.field25420, method12328.field25421, MathHelper.method35651(method12328.field25425 + n, 0, 4), method12328.field25423, method12328.field25424, method12328.field25422);
        }
    }
    
    @Nullable
    public static Class8321 method12337(final Class1847 class1847, final Class8321 class1848) {
        final Class6356 method12328 = method12328(class1848, class1847);
        if (method12328 == null) {
            return null;
        }
        final Class8321 method12329 = class1848.method27641();
        method12330(method12329, class1847, 0, 0, method12328.field25425, method12328.field25423, method12328.field25424, method12328.field25422).method18915(method12328);
        return method12329;
    }
    
    @Override
    public void method11728(final Class8321 class8321, final Class1847 class8322, final List<Class2250> list, final Class1981 class8323) {
        final Class6356 class8324 = (class8322 != null) ? method12328(class8321, class8322) : null;
        if (class8324 != null) {
            if (class8324.field25427) {
                list.add(new Class2259("filled_map.locked", new Object[] { method12329(class8321) }).method8469(Class2116.field12316));
            }
        }
        if (class8323.method7991()) {
            if (class8324 == null) {
                list.add(new Class2259("filled_map.unknown", new Object[0]).method8469(Class2116.field12316));
            }
            else {
                list.add(new Class2259("filled_map.id", new Object[] { method12329(class8321) }).method8469(Class2116.field12316));
                list.add(new Class2259("filled_map.scale", new Object[] { 1 << class8324.field25425 }).method8469(Class2116.field12316));
                list.add(new Class2259("filled_map.level", new Object[] { class8324.field25425, 4 }).method8469(Class2116.field12316));
            }
        }
    }
    
    public static int method12338(final Class8321 class8321) {
        final Class51 method27660 = class8321.method27660("display");
        if (method27660 != null && method27660.method316("MapColor", 99)) {
            return 0xFF000000 | (method27660.method319("MapColor") & 0xFFFFFF);
        }
        return -12173266;
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        if (!class7075.method21654().method6701(class7075.method21639()).method21755(Class7188.field27900)) {
            return super.method11694(class7075);
        }
        if (!class7075.field27554.field10067) {
            method12328(class7075.method21651(), class7075.method21654()).method18922(class7075.method21654(), class7075.method21639());
        }
        return Class2201.field13400;
    }
}
