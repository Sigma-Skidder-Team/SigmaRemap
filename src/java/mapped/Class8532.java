// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;
import java.util.Objects;
import org.apache.logging.log4j.Logger;

public final class Class8532
{
    private static final Logger field35811;
    
    public static void method28616(final Class1976 class1976, final Class1849 class1977, final Class1862 class1978, final Class354 class1979) {
        final Class6346<?> method7438 = class1977.method6904().method7438();
        int n = 0;
        final Class354 method7439 = method28619(class1977, class1978);
        final int method7440 = method7439.method1074();
        final int method7441 = method7439.method1075();
        final int method7442 = method7439.method1076();
        if (method7441 >= 1 && !class1978.method6701(method7439).method21713(class1978, method7439)) {
            final Class385 class1980 = new Class385();
            for (int i = 0; i < 3; ++i) {
                int n2 = method7440;
                int n3 = method7442;
                Class6828 method7443 = null;
                Class5496 method7444 = null;
                int method7445 = Class9546.method35650(Math.random() * 4.0);
                int n4 = 0;
                for (int j = 0; j < method7445; ++j) {
                    n2 += class1977.field10062.nextInt(6) - class1977.field10062.nextInt(6);
                    n3 += class1977.field10062.nextInt(6) - class1977.field10062.nextInt(6);
                    class1980.method1284(n2, method7441, n3);
                    final float n5 = n2 + 0.5f;
                    final float n6 = n3 + 0.5f;
                    final Class512 method7446 = class1977.method7133(n5, n6, -1.0);
                    if (method7446 != null) {
                        final double method7447 = method7446.method1733(n5, method7441, n6);
                        if (method7447 > 576.0) {
                            if (!class1979.method1082(new Class5487(n5, method7441, n6), 24.0)) {
                                final Class7859 a = new Class7859(class1980);
                                if (Objects.equals(a, class1978.method7019()) || class1977.method6904().method7409(a)) {
                                    if (method7443 == null) {
                                        method7443 = method28617(method7438, class1976, class1977.field10062, class1980);
                                        if (method7443 == null) {
                                            break;
                                        }
                                        method7445 = method7443.field26821 + class1977.field10062.nextInt(1 + method7443.field26822 - method7443.field26821);
                                    }
                                    if (method7443.field26820.method23365() != Class1976.field10952) {
                                        if (method7443.field26820.method23364() || method7447 <= 16384.0) {
                                            final Class7499<?> field26820 = method7443.field26820;
                                            if (field26820.method23362()) {
                                                if (method28618(method7438, class1976, method7443, class1980)) {
                                                    if (method28621(Class8897.method31328(field26820), class1977, class1980, field26820) && Class8897.method31330(field26820, class1977, Class2101.field12174, class1980, class1977.field10062)) {
                                                        if (class1977.method6976(field26820.method23375(n5, method7441, n6))) {
                                                            Class759 class1981;
                                                            try {
                                                                final Class399 method7448 = field26820.method23371(class1977);
                                                                if (!(method7448 instanceof Class759)) {
                                                                    throw new IllegalStateException("Trying to spawn a non-mob: " + Class90.field210.method503(field26820));
                                                                }
                                                                class1981 = (Class759)method7448;
                                                            }
                                                            catch (final Exception ex) {
                                                                Class8532.field35811.warn("Failed to create mob", (Throwable)ex);
                                                                return;
                                                            }
                                                            class1981.method1730(n5, method7441, n6, class1977.field10062.nextFloat() * 360.0f, 0.0f);
                                                            if ((method7447 <= 16384.0 || !class1981.method4168(method7447)) && class1981.method4179(class1977, Class2101.field12174)) {
                                                                if (class1981.method4180(class1977)) {
                                                                    method7444 = class1981.method4188(class1977, class1977.method6784(new Class354(class1981)), Class2101.field12174, method7444, null);
                                                                    ++n;
                                                                    ++n4;
                                                                    class1977.method6886(class1981);
                                                                    if (n >= class1981.method4181()) {
                                                                        return;
                                                                    }
                                                                    if (class1981.method4182(n4)) {
                                                                        break;
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
        }
    }
    
    @Nullable
    private static Class6828 method28617(final Class6346<?> class6346, final Class1976 class6347, final Random random, final Class354 class6348) {
        final List<Class6828> method18866 = class6346.method18866(class6347, class6348);
        return method18866.isEmpty() ? null : Class8223.method27251(random, method18866);
    }
    
    private static boolean method28618(final Class6346<?> class6346, final Class1976 class6347, final Class6828 class6348, final Class354 class6349) {
        final List<Class6828> method18866 = class6346.method18866(class6347, class6349);
        return !method18866.isEmpty() && method18866.contains(class6348);
    }
    
    private static Class354 method28619(final Class1847 class1847, final Class1862 class1848) {
        final Class7859 method7019 = class1848.method7019();
        final int n = method7019.method25426() + class1847.field10062.nextInt(16);
        final int n2 = method7019.method25427() + class1847.field10062.nextInt(16);
        return new Class354(n, class1847.field10062.nextInt(class1848.method7018(Class2020.field11522, n, n2) + 1 + 1), n2);
    }
    
    public static boolean method28620(final Class1855 class1855, final Class354 class1856, final Class7096 class1857, final Class7099 class1858) {
        return !class1857.method21762(class1855, class1856) && !class1857.method21714() && class1858.method21781() && !class1857.method21755(Class7188.field27906);
    }
    
    public static boolean method28621(final Class2194 class2194, final Class1852 class2195, final Class354 class2196, final Class7499<?> class2197) {
        if (class2194 == Class2194.field13356) {
            return true;
        }
        if (class2197 == null || !class2195.method6787().method34779(class2196)) {
            return false;
        }
        final Class7096 method6701 = class2195.method6701(class2196);
        final Class7099 method6702 = class2195.method6702(class2196);
        final Class354 method6703 = class2196.method1137();
        final Class354 method6704 = class2196.method1139();
        switch (Class8621.field36186[class2194.ordinal()]) {
            case 1: {
                return method6702.method21793(Class7324.field28319) && class2195.method6702(method6704).method21793(Class7324.field28319) && !class2195.method6701(method6703).method21713(class2195, method6703);
            }
            default: {
                return class2195.method6701(method6704).method21698(class2195, method6704, class2197) && method28620(class2195, class2196, method6701, method6702) && method28620(class2195, method6703, class2195.method6701(method6703), class2195.method6702(method6703));
            }
        }
    }
    
    public static void method28622(final Class1851 class1851, final Class3090 class1852, final int n, final int n2, final Random random) {
        final List<Class6828> method9840 = class1852.method9840(Class1976.field10949);
        if (!method9840.isEmpty()) {
            final int n3 = n << 4;
            final int n4 = n2 << 4;
            while (random.nextFloat() < class1852.method9843()) {
                final Class6828 class1853 = Class8223.method27251(random, method9840);
                final int n5 = class1853.field26821 + random.nextInt(1 + class1853.field26822 - class1853.field26821);
                Class5496 method9841 = null;
                int n6 = n3 + random.nextInt(16);
                int n7 = n4 + random.nextInt(16);
                final int n8 = n6;
                final int n9 = n7;
                for (int i = 0; i < n5; ++i) {
                    for (int n10 = 0, n11 = 0; n10 == 0 && n11 < 4; ++n11) {
                        final Class354 method9842 = method28623(class1851, class1853.field26820, n6, n7);
                        if (class1853.field26820.method23362() && method28621(Class2194.field13354, class1851, method9842, class1853.field26820)) {
                            final float method9843 = class1853.field26820.method23369();
                            final double method9844 = Class9546.method35654(n6, n3 + (double)method9843, n3 + 16.0 - method9843);
                            final double method9845 = Class9546.method35654(n7, n4 + (double)method9843, n4 + 16.0 - method9843);
                            if (!class1851.method6976(class1853.field26820.method23375(method9844, method9842.method1075(), method9845))) {
                                continue;
                            }
                            if (!Class8897.method31330(class1853.field26820, class1851, Class2101.field12175, new Class354(method9844, method9842.method1075(), method9845), class1851.method6790())) {
                                continue;
                            }
                            Object method9846;
                            try {
                                method9846 = class1853.field26820.method23371(class1851.method6744());
                            }
                            catch (final Exception ex) {
                                Class8532.field35811.warn("Failed to create mob", (Throwable)ex);
                                continue;
                            }
                            ((Class399)method9846).method1730(method9844, method9842.method1075(), method9845, random.nextFloat() * 360.0f, 0.0f);
                            if (method9846 instanceof Class759) {
                                final Class759 class1854 = (Class759)method9846;
                                if (class1854.method4179(class1851, Class2101.field12175) && class1854.method4180(class1851)) {
                                    method9841 = class1854.method4188(class1851, class1851.method6784(new Class354(class1854)), Class2101.field12175, method9841, null);
                                    class1851.method6886(class1854);
                                    n10 = 1;
                                }
                            }
                        }
                        for (n6 += random.nextInt(5) - random.nextInt(5), n7 += random.nextInt(5) - random.nextInt(5); n6 < n3 || n6 >= n3 + 16 || n7 < n4 || n7 >= n4 + 16; n6 = n8 + random.nextInt(5) - random.nextInt(5), n7 = n9 + random.nextInt(5) - random.nextInt(5)) {}
                    }
                }
            }
        }
    }
    
    private static Class354 method28623(final Class1852 class1852, final Class7499<?> class1853, final int n, final int n2) {
        final Class354 class1854 = new Class354(n, class1852.method6699(Class8897.method31329(class1853), n, n2), n2);
        final Class354 method1139 = class1854.method1139();
        return class1852.method6701(method1139).method21749(class1852, method1139, Class2084.field12051) ? method1139 : class1854;
    }
    
    static {
        field35811 = LogManager.getLogger();
    }
}
