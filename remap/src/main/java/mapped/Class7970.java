// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

import java.util.HashSet;
import java.util.ArrayList;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.EnumMap;
import java.util.IdentityHashMap;
import java.util.Random;
import java.util.Map;

public class Class7970
{
    private static Map[] field32750;
    private static Map[] field32751;
    private static Map[][] field32752;
    private static Class6779[][] field32753;
    private static Class6779[][] field32754;
    private static boolean field32755;
    public static final int field32756 = -1;
    public static final int field32757 = 0;
    public static final int field32758 = 1;
    public static final int field32759 = 2;
    public static final int field32760 = 3;
    public static final int field32761 = 4;
    public static final int field32762 = 5;
    private static final int field32763 = 0;
    private static final int field32764 = 1;
    private static final int field32765 = 2;
    public static final Class7096 field32766;
    private static Class1912 field32767;
    private static ResourceLocation field32768;
    private static final Class2192[] field32769;
    private static final Class2192[] field32770;
    private static final Class2192[] field32771;
    private static final Class2192[] field32772;
    private static final Class2192[] field32773;
    private static final Class2192[] field32774;
    private static final Class2192[] field32775;
    private static final Class2192[] field32776;
    private static final Class2192[] field32777;
    private static final Class2192[] field32778;
    private static final Class2192[] field32779;
    private static final Class2192[] field32780;
    private static final Class2192[] field32781;
    private static final Class2192[] field32782;
    private static final Class2192[] field32783;
    private static final Class2192[] field32784;
    public static final Class1912 field32785;
    private static final Random field32786;
    
    public static Class8754[] method25831(final Class1856 class1856, final Class7096 class1857, final BlockPos class1858, Class8754 method25834, final Class9145 class1859) {
        if (method25834.method30295() == null) {
            return class1859.method33391(method25834);
        }
        class1857.method21696();
        if (method25832(class1856, class1857, class1858, method25834, class1859)) {
            method25834 = method25834(Class7970.field32767, method25834);
            return class1859.method33391(method25834);
        }
        return method25838(class1856, class1857, class1858, method25834.method30294(), method25834, class1859);
    }
    
    private static boolean method25832(final IBlockReader class1855, final Class7096 class1856, final BlockPos class1857, final Class8754 class1858, final Class9145 class1859) {
        final Block method21696 = class1856.method21696();
        if (method21696 instanceof Class3853) {
            final Direction method21697 = class1858.method30294();
            if (method21697 != Direction.UP && method21697 != Direction.DOWN) {
                return false;
            }
            if (!class1858.method30309()) {
                return false;
            }
            final Class7096 method21698 = class1855.getBlockState(class1857.method1149(class1858.method30294()));
            if (method21698.method21696() != method21696) {
                return false;
            }
            final Block method21699 = method21698.method21696();
            if (method21696 instanceof Class3852 && method21699 instanceof Class3852 && ((Class3852)method21696).method11900() != ((Class3852)method21699).method11900()) {
                return false;
            }
            final double n = class1858.method30306();
            if (n < 0.4) {
                if (method21698.method21772((IProperty<Boolean>)Class3854.field17468)) {
                    return true;
                }
            }
            else if (n > 0.6) {
                if (method21698.method21772((IProperty<Boolean>)Class3854.field17466)) {
                    return true;
                }
            }
            else {
                final double method21700 = class1858.method30308();
                if (method21700 < 0.4) {
                    if (method21698.method21772((IProperty<Boolean>)Class3854.field17465)) {
                        return true;
                    }
                }
                else {
                    if (method21700 <= 0.6) {
                        return true;
                    }
                    if (method21698.method21772((IProperty<Boolean>)Class3854.field17467)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static Class8754[] method25833(final Class1912 class1912, final Class8754 class1913, final Class9145 class1914) {
        if (class1912 == null) {
            return null;
        }
        if (class1912 == Class7970.field32785) {
            return class1914.method33391(class1913);
        }
        return class1914.method33391(method25834(class1912, class1913));
    }
    
    private static synchronized Class8754 method25834(final Class1912 class1912, final Class8754 class1913) {
        if (Class7970.field32750 == null) {
            return class1913;
        }
        final int method7513 = class1912.method7513();
        if (method7513 >= 0 && method7513 < Class7970.field32750.length) {
            Map map = Class7970.field32750[method7513];
            if (map == null) {
                map = new IdentityHashMap(1);
                Class7970.field32750[method7513] = map;
            }
            Class8754 method7514 = map.get(class1913);
            if (method7514 == null) {
                method7514 = method25836(class1913, class1912);
                map.put(class1913, method7514);
            }
            return method7514;
        }
        return class1913;
    }
    
    private static synchronized Class8754 method25835(final Class1912 class1912, final Class8754 class1913, final int n) {
        if (Class7970.field32751 == null) {
            return null;
        }
        if (class1912 == null) {
            return null;
        }
        final int method7513 = class1912.method7513();
        if (method7513 >= 0 && method7513 < Class7970.field32751.length) {
            Map map = Class7970.field32751[method7513];
            if (map == null) {
                map = new EnumMap(Direction.class);
                Class7970.field32751[method7513] = map;
            }
            final Direction method7514 = class1913.method30294();
            Class8754 method7515 = map.get(method7514);
            if (method7515 == null) {
                method7515 = Class6778.method20688(method7514, class1912, n);
                map.put(method7514, method7515);
            }
            return method7515;
        }
        return null;
    }
    
    private static Class8754 method25836(final Class8754 class8754, final Class1912 class8755) {
        final int[] array = class8754.method30291().clone();
        final Class1912 method30295 = class8754.method30295();
        for (int i = 0; i < 4; ++i) {
            method25837(array, i, method30295, class8755);
        }
        return new Class8754(array, class8754.method30293(), class8754.method30294(), class8755);
    }
    
    private static void method25837(final int[] array, final int n, final Class1912 class1912, final Class1912 class1913) {
        final int n2 = array.length / 4 * n;
        final float intBitsToFloat = Float.intBitsToFloat(array[n2 + 4]);
        final float intBitsToFloat2 = Float.intBitsToFloat(array[n2 + 4 + 1]);
        final double method7520 = class1912.method7520(intBitsToFloat);
        final double method7521 = class1912.method7521(intBitsToFloat2);
        array[n2 + 4] = Float.floatToRawIntBits(class1913.method7499(method7520));
        array[n2 + 4 + 1] = Float.floatToRawIntBits(class1913.method7502(method7521));
    }
    
    private static Class8754[] method25838(final Class1856 class1856, final Class7096 class1857, final BlockPos class1858, final Direction class1859, final Class8754 class1860, final Class9145 class1861) {
        final Class8754[] method25839 = method25839(class1856, class1857, class1858, class1859, class1860, true, 0, class1861);
        if (!Class7970.field32755) {
            return method25839;
        }
        if (method25839.length == 1 && method25839[0] == class1860) {
            return method25839;
        }
        final List<Class8754> method25840 = class1861.method33395(method25839);
        for (int i = 0; i < method25840.size(); ++i) {
            Class8754 class1862 = method25840.get(i);
            for (int j = 0; j < 3; ++j) {
                final Class8754[] method25841 = method25839(class1856, class1857, class1858, class1859, class1862, false, j + 1, class1861);
                if (method25841.length != 1) {
                    break;
                }
                if (method25841[0] == class1862) {
                    break;
                }
                class1862 = method25841[0];
            }
            method25840.set(i, class1862);
        }
        for (int k = 0; k < method25839.length; ++k) {
            method25839[k] = (Class8754)method25840.get(k);
        }
        return method25839;
    }
    
    public static Class8754[] method25839(final Class1856 class1856, final Class7096 class1857, final BlockPos class1858, final Direction class1859, final Class8754 class1860, final boolean b, final int n, final Class9145 class1861) {
        class1857.method21696();
        final Class1912 method30295 = class1860.method30295();
        if (Class7970.field32754 != null) {
            final int method30296 = method30295.method7513();
            if (method30296 >= 0 && method30296 < Class7970.field32754.length) {
                final Class6779[] array = Class7970.field32754[method30296];
                if (array != null) {
                    final int method30297 = method25840(class1859);
                    for (int i = 0; i < array.length; ++i) {
                        final Class6779 class1862 = array[i];
                        if (class1862 != null && class1862.method20732(class1857.method21691())) {
                            final Class8754[] method30298 = method25842(class1862, class1856, class1857, class1858, method30297, class1860, n, class1861);
                            if (method30298 != null) {
                                return method30298;
                            }
                        }
                    }
                }
            }
        }
        if (Class7970.field32753 != null && b) {
            final int method30299 = class1861.method33374();
            if (method30299 >= 0 && method30299 < Class7970.field32753.length) {
                final Class6779[] array2 = Class7970.field32753[method30299];
                if (array2 != null) {
                    final int method30300 = method25840(class1859);
                    for (int j = 0; j < array2.length; ++j) {
                        final Class6779 class1863 = array2[j];
                        if (class1863 != null && class1863.method20734(method30295)) {
                            final Class8754[] method30301 = method25842(class1863, class1856, class1857, class1858, method30300, class1860, n, class1861);
                            if (method30301 != null) {
                                return method30301;
                            }
                        }
                    }
                }
            }
        }
        return class1861.method33391(class1860);
    }
    
    public static int method25840(final Direction class179) {
        if (class179 == null) {
            return -1;
        }
        switch (Class9542.field41077[class179.ordinal()]) {
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
            case 3: {
                return 5;
            }
            case 4: {
                return 4;
            }
            case 5: {
                return 2;
            }
            case 6: {
                return 3;
            }
            default: {
                return -1;
            }
        }
    }
    
    private static Direction method25841(final int n) {
        switch (n) {
            case 0: {
                return Direction.DOWN;
            }
            case 1: {
                return Direction.UP;
            }
            case 2: {
                return Direction.NORTH;
            }
            case 3: {
                return Direction.SOUTH;
            }
            case 4: {
                return Direction.WEST;
            }
            case 5: {
                return Direction.EAST;
            }
            default: {
                return Direction.UP;
            }
        }
    }
    
    private static Class8754[] method25842(final Class6779 class6779, final Class1856 class6780, final Class7096 class6781, final BlockPos class6782, final int n, final Class8754 class6783, final int n2, final Class9145 class6784) {
        int method25844 = 0;
        final int method25845 = class6781.method21692();
        if (class6781.method21696() instanceof Class4027) {
            method25844 = method25844(class6781);
        }
        if (!class6779.method20733(class6781.method21691(), method25845)) {
            return null;
        }
        if (n >= 0 && class6779.field26619 != 63) {
            int method25846 = n;
            if (method25844 != 0) {
                method25846 = method25843(n, method25844);
            }
            if ((1 << method25846 & class6779.field26619) == 0x0) {
                return null;
            }
        }
        final int method25847 = class6782.getY();
        if (class6779.field26621 != null && !class6779.field26621.method24697(method25847)) {
            return null;
        }
        if (class6779.field26620 != null && !class6779.method20735(Class7984.method26045(class6780, class6782))) {
            return null;
        }
        if (class6779.field26631 != null && !class6779.field26631.method32122(Class8477.method28301(class6780, class6782))) {
            return null;
        }
        final Class1912 method25848 = class6783.method30295();
        switch (class6779.field26616) {
            case 1: {
                return method25833(method25848(class6779, class6780, class6781, class6782, method25844, n, method25848, method25845, class6784), class6783, class6784);
            }
            case 2: {
                return method25833(method25866(class6779, class6780, class6781, class6782, method25844, n, method25848, method25845), class6783, class6784);
            }
            case 3: {
                return method25833(method25870(class6779, class6780, class6781, class6782, method25844, n, method25848, method25845), class6783, class6784);
            }
            case 4: {
                return method25833(method25845(class6779, class6780, class6781, class6782, n), class6783, class6784);
            }
            case 5: {
                return method25833(method25847(class6779, class6782, n), class6783, class6784);
            }
            case 6: {
                return method25833(method25867(class6779, class6780, class6781, class6782, method25844, n, method25848, method25845), class6783, class6784);
            }
            case 7: {
                return method25833(method25846(class6779), class6783, class6784);
            }
            case 8: {
                return method25833(method25868(class6779, class6780, class6781, class6782, method25844, n, method25848, method25845), class6783, class6784);
            }
            case 9: {
                return method25833(method25869(class6779, class6780, class6781, class6782, method25844, n, method25848, method25845), class6783, class6784);
            }
            case 10: {
                if (n2 == 0) {
                    return method25849(class6779, class6780, class6781, class6782, method25844, n, class6783, method25845, class6784);
                }
                break;
            }
            case 11: {
                return method25850(class6779, class6780, class6781, class6782, method25844, n, class6783, method25845, class6784);
            }
            case 12: {
                return method25851(class6779, class6783, class6784);
            }
            case 13: {
                return method25852(class6779, class6780, class6781, class6782, n, class6783, class6784);
            }
            case 14: {
                return method25853(class6779, class6782, n, class6783, class6784);
            }
            case 15: {
                return method25854(class6779, class6780, class6781, class6782, method25844, n, class6783, method25845, class6784);
            }
        }
        return null;
    }
    
    private static int method25843(final int n, final int n2) {
        switch (n2) {
            case 0: {
                return n;
            }
            case 1: {
                switch (n) {
                    case 0: {
                        return 2;
                    }
                    case 1: {
                        return 3;
                    }
                    case 2: {
                        return 1;
                    }
                    case 3: {
                        return 0;
                    }
                    default: {
                        return n;
                    }
                }
                break;
            }
            case 2: {
                switch (n) {
                    case 0: {
                        return 4;
                    }
                    case 1: {
                        return 5;
                    }
                    default: {
                        return n;
                    }
                    case 4: {
                        return 1;
                    }
                    case 5: {
                        return 0;
                    }
                }
                break;
            }
            default: {
                return n;
            }
        }
    }
    
    private static int method25844(final Class7096 class7096) {
        switch (Class9542.field41078[class7096.method21772(Class4027.field18120).ordinal()]) {
            case 1: {
                return 2;
            }
            case 2: {
                return 1;
            }
            default: {
                return 0;
            }
        }
    }
    
    private static Class1912 method25845(final Class6779 class6779, final IBlockReader class6780, final Class7096 class6781, BlockPos class6782, final int n) {
        if (class6779.field26635.length == 1) {
            return class6779.field26635[0];
        }
        final int n2 = n / class6779.field26629 * class6779.field26629;
        if (class6779.field26630) {
            BlockPos class6783 = class6782.method1139();
            for (Class7096 class6784 = class6780.getBlockState(class6783); class6784.method21696() == class6781.method21696(); class6784 = class6780.getBlockState(class6783)) {
                class6782 = class6783;
                class6783 = class6783.method1139();
                if (class6783.getY() < 0) {
                    break;
                }
            }
        }
        int method28967 = Config.method28968(class6782, n2) & Integer.MAX_VALUE;
        for (int i = 0; i < class6779.field26628; ++i) {
            method28967 = Config.method28967(method28967);
        }
        int n3 = 0;
        if (class6779.field26627 == null) {
            n3 = method28967 % class6779.field26635.length;
        }
        else {
            final int n4 = method28967 % class6779.field26633;
            final int[] field26632 = class6779.field26632;
            for (int j = 0; j < field26632.length; ++j) {
                if (n4 < field26632[j]) {
                    n3 = j;
                    break;
                }
            }
        }
        return class6779.field26635[n3];
    }
    
    private static Class1912 method25846(final Class6779 class6779) {
        return class6779.field26635[0];
    }
    
    private static Class1912 method25847(final Class6779 class6779, final BlockPos class6780, final int n) {
        if (class6779.field26635.length == 1) {
            return class6779.field26635[0];
        }
        final int method1074 = class6780.getX();
        final int method1075 = class6780.getY();
        final int method1076 = class6780.getZ();
        int n2 = 0;
        int n3 = 0;
        switch (n) {
            case 0: {
                n2 = method1074;
                n3 = -method1076 - 1;
                break;
            }
            case 1: {
                n2 = method1074;
                n3 = method1076;
                break;
            }
            case 2: {
                n2 = -method1074 - 1;
                n3 = -method1075;
                break;
            }
            case 3: {
                n2 = method1074;
                n3 = -method1075;
                break;
            }
            case 4: {
                n2 = method1076;
                n3 = -method1075;
                break;
            }
            case 5: {
                n2 = -method1076 - 1;
                n3 = -method1075;
                break;
            }
        }
        int n4 = n2 % class6779.field26625;
        int n5 = n3 % class6779.field26626;
        if (n4 < 0) {
            n4 += class6779.field26625;
        }
        if (n5 < 0) {
            n5 += class6779.field26626;
        }
        return class6779.field26635[n5 * class6779.field26625 + n4];
    }
    
    private static Class1912 method25848(final Class6779 class6779, final IBlockReader class6780, final Class7096 class6781, final BlockPos class6782, final int n, final int n2, final Class1912 class6783, final int n3, final Class9145 class6784) {
        return class6779.field26635[method25858(class6779, class6780, class6781, class6782, n, n2, class6783, n3, class6784)];
    }
    
    private static synchronized Class8754[] method25849(final Class6779 class6779, final IBlockReader class6780, final Class7096 class6781, final BlockPos class6782, final int n, final int n2, final Class8754 class6783, final int n3, final Class9145 class6784) {
        return Class8424.method28127(method25858(class6779, class6780, class6781, class6782, n, n2, class6783.method30295(), n3, class6784), class6779, n2, class6783, class6784);
    }
    
    private static Class8754[] method25850(final Class6779 class6779, final IBlockReader class6780, final Class7096 class6781, final BlockPos class6782, final int n, final int n2, final Class8754 class6783, final int n3, final Class9145 class6784) {
        if (!class6783.method30310()) {
            return null;
        }
        final Class1912 method30295 = class6783.method30295();
        final Class2192[] method30296 = method25855(n2, n);
        final boolean[] method30297 = class6784.method33384();
        for (int i = 0; i < 4; ++i) {
            method30297[i] = method25860(class6779, class6780, class6781, method30296[i].method8364(class6782), n2, method30295, n3);
        }
        final Class8040 method30298 = class6784.method33398(class6779.field26641);
        Class8754[] array;
        try {
            if (!method30297[0] || !method30297[1] || !method30297[2] || !method30297[3]) {
                if (method30297[0] && method30297[1] && method30297[2]) {
                    method30298.method26376(method25835(class6779.field26635[5], class6783, class6779.field26639), class6779.field26640);
                    array = null;
                    return array;
                }
                if (method30297[0] && method30297[2] && method30297[3]) {
                    method30298.method26376(method25835(class6779.field26635[6], class6783, class6779.field26639), class6779.field26640);
                    array = null;
                    return array;
                }
                if (method30297[1] && method30297[2] && method30297[3]) {
                    method30298.method26376(method25835(class6779.field26635[12], class6783, class6779.field26639), class6779.field26640);
                    array = null;
                    return array;
                }
                if (method30297[0] && method30297[1] && method30297[3]) {
                    method30298.method26376(method25835(class6779.field26635[13], class6783, class6779.field26639), class6779.field26640);
                    array = null;
                    return array;
                }
                final Class2192[] method30299 = method25856(n2, n);
                final boolean[] method30300 = class6784.method33385();
                for (int j = 0; j < 4; ++j) {
                    method30300[j] = method25860(class6779, class6780, class6781, method30299[j].method8364(class6782), n2, method30295, n3);
                }
                if (method30297[1] && method30297[2]) {
                    method30298.method26376(method25835(class6779.field26635[3], class6783, class6779.field26639), class6779.field26640);
                    if (method30300[3]) {
                        method30298.method26376(method25835(class6779.field26635[16], class6783, class6779.field26639), class6779.field26640);
                    }
                    return null;
                }
                if (method30297[0] && method30297[2]) {
                    method30298.method26376(method25835(class6779.field26635[4], class6783, class6779.field26639), class6779.field26640);
                    if (method30300[2]) {
                        method30298.method26376(method25835(class6779.field26635[14], class6783, class6779.field26639), class6779.field26640);
                    }
                    return null;
                }
                if (method30297[1] && method30297[3]) {
                    method30298.method26376(method25835(class6779.field26635[10], class6783, class6779.field26639), class6779.field26640);
                    if (method30300[1]) {
                        method30298.method26376(method25835(class6779.field26635[2], class6783, class6779.field26639), class6779.field26640);
                    }
                    return null;
                }
                if (method30297[0] && method30297[3]) {
                    method30298.method26376(method25835(class6779.field26635[11], class6783, class6779.field26639), class6779.field26640);
                    if (method30300[0]) {
                        method30298.method26376(method25835(class6779.field26635[0], class6783, class6779.field26639), class6779.field26640);
                    }
                    return null;
                }
                final boolean[] method30301 = class6784.method33386();
                for (int k = 0; k < 4; ++k) {
                    method30301[k] = method25862(class6779, class6780, class6781, method30296[k].method8364(class6782), n2, method30295, n3);
                }
                if (method30297[0]) {
                    method30298.method26376(method25835(class6779.field26635[9], class6783, class6779.field26639), class6779.field26640);
                }
                if (method30297[1]) {
                    method30298.method26376(method25835(class6779.field26635[7], class6783, class6779.field26639), class6779.field26640);
                }
                if (method30297[2]) {
                    method30298.method26376(method25835(class6779.field26635[1], class6783, class6779.field26639), class6779.field26640);
                }
                if (method30297[3]) {
                    method30298.method26376(method25835(class6779.field26635[15], class6783, class6779.field26639), class6779.field26640);
                }
                if (method30300[0] && (method30301[1] || method30301[2]) && !method30297[1] && !method30297[2]) {
                    method30298.method26376(method25835(class6779.field26635[0], class6783, class6779.field26639), class6779.field26640);
                }
                if (method30300[1] && (method30301[0] || method30301[2]) && !method30297[0] && !method30297[2]) {
                    method30298.method26376(method25835(class6779.field26635[2], class6783, class6779.field26639), class6779.field26640);
                }
                if (method30300[2] && (method30301[1] || method30301[3]) && !method30297[1] && !method30297[3]) {
                    method30298.method26376(method25835(class6779.field26635[14], class6783, class6779.field26639), class6779.field26640);
                }
                if (method30300[3] && (method30301[0] || method30301[3]) && !method30297[0] && !method30297[3]) {
                    method30298.method26376(method25835(class6779.field26635[16], class6783, class6779.field26639), class6779.field26640);
                }
                return null;
            }
            else {
                method30298.method26376(method25835(class6779.field26635[8], class6783, class6779.field26639), class6779.field26640);
                array = null;
            }
        }
        finally {
            if (method30298.method26377() > 0) {
                class6784.method33400(true);
            }
        }
        return array;
    }
    
    private static Class8754[] method25851(final Class6779 class6779, final Class8754 class6780, final Class9145 class6781) {
        if (!class6780.method30310()) {
            return null;
        }
        final Class8040 method33398 = class6781.method33398(class6779.field26641);
        Class8754[] array;
        try {
            final Class1912 method33399 = method25846(class6779);
            if (method33399 != null) {
                method33398.method26376(method25835(method33399, class6780, class6779.field26639), class6779.field26640);
            }
            array = null;
        }
        finally {
            if (method33398.method26377() > 0) {
                class6781.method33400(true);
            }
        }
        return array;
    }
    
    private static Class8754[] method25852(final Class6779 class6779, final IBlockReader class6780, final Class7096 class6781, final BlockPos class6782, final int n, final Class8754 class6783, final Class9145 class6784) {
        if (!class6783.method30310()) {
            return null;
        }
        final Class8040 method33398 = class6784.method33398(class6779.field26641);
        Class8754[] array;
        try {
            final Class1912 method33399 = method25845(class6779, class6780, class6781, class6782, n);
            if (method33399 != null) {
                method33398.method26376(method25835(method33399, class6783, class6779.field26639), class6779.field26640);
            }
            array = null;
        }
        finally {
            if (method33398.method26377() > 0) {
                class6784.method33400(true);
            }
        }
        return array;
    }
    
    private static Class8754[] method25853(final Class6779 class6779, final BlockPos class6780, final int n, final Class8754 class6781, final Class9145 class6782) {
        if (!class6781.method30310()) {
            return null;
        }
        final Class8040 method33398 = class6782.method33398(class6779.field26641);
        Class8754[] array;
        try {
            final Class1912 method33399 = method25847(class6779, class6780, n);
            if (method33399 != null) {
                method33398.method26376(method25835(method33399, class6781, class6779.field26639), class6779.field26640);
            }
            array = null;
        }
        finally {
            if (method33398.method26377() > 0) {
                class6782.method33400(true);
            }
        }
        return array;
    }
    
    private static Class8754[] method25854(final Class6779 class6779, final IBlockReader class6780, final Class7096 class6781, final BlockPos class6782, final int n, final int n2, final Class8754 class6783, final int n3, final Class9145 class6784) {
        if (!class6783.method30310()) {
            return null;
        }
        final Class8040 method33398 = class6784.method33398(class6779.field26641);
        Class8754[] array;
        try {
            final Class1912 method33399 = method25848(class6779, class6780, class6781, class6782, n, n2, class6783.method30295(), n3, class6784);
            if (method33399 != null) {
                method33398.method26376(method25835(method33399, class6783, class6779.field26639), class6779.field26640);
            }
            array = null;
        }
        finally {
            if (method33398.method26377() > 0) {
                class6784.method33400(true);
            }
        }
        return array;
    }
    
    private static Class2192[] method25855(final int i, final int n) {
        switch (i) {
            case 0: {
                return Class7970.field32769;
            }
            case 1: {
                return Class7970.field32770;
            }
            case 2: {
                if (n == 1) {
                    return Class7970.field32775;
                }
                return Class7970.field32771;
            }
            case 3: {
                return Class7970.field32772;
            }
            case 4: {
                return Class7970.field32773;
            }
            case 5: {
                if (n == 2) {
                    return Class7970.field32776;
                }
                return Class7970.field32774;
            }
            default: {
                throw new IllegalArgumentException("Unknown side: " + i);
            }
        }
    }
    
    private static Class2192[] method25856(final int i, final int n) {
        switch (i) {
            case 0: {
                return Class7970.field32777;
            }
            case 1: {
                return Class7970.field32778;
            }
            case 2: {
                if (n == 1) {
                    return Class7970.field32783;
                }
                return Class7970.field32779;
            }
            case 3: {
                return Class7970.field32780;
            }
            case 4: {
                return Class7970.field32781;
            }
            case 5: {
                if (n == 2) {
                    return Class7970.field32784;
                }
                return Class7970.field32782;
            }
            default: {
                throw new IllegalArgumentException("Unknown side: " + i);
            }
        }
    }
    
    public static Map[][] method25857() {
        return Class7970.field32752;
    }
    
    private static int method25858(final Class6779 class6779, final IBlockReader class6780, final Class7096 class6781, final BlockPos class6782, final int n, final int n2, final Class1912 class6783, final int n3, final Class9145 class6784) {
        final boolean[] method33384 = class6784.method33384();
        switch (n2) {
            case 0: {
                method33384[0] = method25863(class6779, class6780, class6781, class6782.method1145(), n2, class6783, n3);
                method33384[1] = method25863(class6779, class6780, class6781, class6782.method1147(), n2, class6783, n3);
                method33384[2] = method25863(class6779, class6780, class6781, class6782.method1141(), n2, class6783, n3);
                method33384[3] = method25863(class6779, class6780, class6781, class6782.method1143(), n2, class6783, n3);
                if (class6779.field26623) {
                    final BlockPos method33385 = class6782.method1139();
                    method33384[0] = (method33384[0] && !method25863(class6779, class6780, class6781, method33385.method1145(), n2, class6783, n3));
                    method33384[1] = (method33384[1] && !method25863(class6779, class6780, class6781, method33385.method1147(), n2, class6783, n3));
                    method33384[2] = (method33384[2] && !method25863(class6779, class6780, class6781, method33385.method1141(), n2, class6783, n3));
                    method33384[3] = (method33384[3] && !method25863(class6779, class6780, class6781, method33385.method1143(), n2, class6783, n3));
                    break;
                }
                break;
            }
            case 1: {
                method33384[0] = method25863(class6779, class6780, class6781, class6782.method1145(), n2, class6783, n3);
                method33384[1] = method25863(class6779, class6780, class6781, class6782.method1147(), n2, class6783, n3);
                method33384[2] = method25863(class6779, class6780, class6781, class6782.method1143(), n2, class6783, n3);
                method33384[3] = method25863(class6779, class6780, class6781, class6782.method1141(), n2, class6783, n3);
                if (class6779.field26623) {
                    final BlockPos method33386 = class6782.method1137();
                    method33384[0] = (method33384[0] && !method25863(class6779, class6780, class6781, method33386.method1145(), n2, class6783, n3));
                    method33384[1] = (method33384[1] && !method25863(class6779, class6780, class6781, method33386.method1147(), n2, class6783, n3));
                    method33384[2] = (method33384[2] && !method25863(class6779, class6780, class6781, method33386.method1143(), n2, class6783, n3));
                    method33384[3] = (method33384[3] && !method25863(class6779, class6780, class6781, method33386.method1141(), n2, class6783, n3));
                    break;
                }
                break;
            }
            case 2: {
                method33384[0] = method25863(class6779, class6780, class6781, class6782.method1147(), n2, class6783, n3);
                method33384[1] = method25863(class6779, class6780, class6781, class6782.method1145(), n2, class6783, n3);
                method33384[2] = method25863(class6779, class6780, class6781, class6782.method1139(), n2, class6783, n3);
                method33384[3] = method25863(class6779, class6780, class6781, class6782.method1137(), n2, class6783, n3);
                if (class6779.field26623) {
                    final BlockPos method33387 = class6782.method1141();
                    method33384[0] = (method33384[0] && !method25863(class6779, class6780, class6781, method33387.method1147(), n2, class6783, n3));
                    method33384[1] = (method33384[1] && !method25863(class6779, class6780, class6781, method33387.method1145(), n2, class6783, n3));
                    method33384[2] = (method33384[2] && !method25863(class6779, class6780, class6781, method33387.method1139(), n2, class6783, n3));
                    method33384[3] = (method33384[3] && !method25863(class6779, class6780, class6781, method33387.method1137(), n2, class6783, n3));
                }
                if (n == 1) {
                    method25859(0, 1, method33384);
                    method25859(2, 3, method33384);
                    break;
                }
                break;
            }
            case 3: {
                method33384[0] = method25863(class6779, class6780, class6781, class6782.method1145(), n2, class6783, n3);
                method33384[1] = method25863(class6779, class6780, class6781, class6782.method1147(), n2, class6783, n3);
                method33384[2] = method25863(class6779, class6780, class6781, class6782.method1139(), n2, class6783, n3);
                method33384[3] = method25863(class6779, class6780, class6781, class6782.method1137(), n2, class6783, n3);
                if (class6779.field26623) {
                    final BlockPos method33388 = class6782.method1143();
                    method33384[0] = (method33384[0] && !method25863(class6779, class6780, class6781, method33388.method1145(), n2, class6783, n3));
                    method33384[1] = (method33384[1] && !method25863(class6779, class6780, class6781, method33388.method1147(), n2, class6783, n3));
                    method33384[2] = (method33384[2] && !method25863(class6779, class6780, class6781, method33388.method1139(), n2, class6783, n3));
                    method33384[3] = (method33384[3] && !method25863(class6779, class6780, class6781, method33388.method1137(), n2, class6783, n3));
                    break;
                }
                break;
            }
            case 4: {
                method33384[0] = method25863(class6779, class6780, class6781, class6782.method1141(), n2, class6783, n3);
                method33384[1] = method25863(class6779, class6780, class6781, class6782.method1143(), n2, class6783, n3);
                method33384[2] = method25863(class6779, class6780, class6781, class6782.method1139(), n2, class6783, n3);
                method33384[3] = method25863(class6779, class6780, class6781, class6782.method1137(), n2, class6783, n3);
                if (class6779.field26623) {
                    final BlockPos method33389 = class6782.method1145();
                    method33384[0] = (method33384[0] && !method25863(class6779, class6780, class6781, method33389.method1141(), n2, class6783, n3));
                    method33384[1] = (method33384[1] && !method25863(class6779, class6780, class6781, method33389.method1143(), n2, class6783, n3));
                    method33384[2] = (method33384[2] && !method25863(class6779, class6780, class6781, method33389.method1139(), n2, class6783, n3));
                    method33384[3] = (method33384[3] && !method25863(class6779, class6780, class6781, method33389.method1137(), n2, class6783, n3));
                    break;
                }
                break;
            }
            case 5: {
                method33384[0] = method25863(class6779, class6780, class6781, class6782.method1143(), n2, class6783, n3);
                method33384[1] = method25863(class6779, class6780, class6781, class6782.method1141(), n2, class6783, n3);
                method33384[2] = method25863(class6779, class6780, class6781, class6782.method1139(), n2, class6783, n3);
                method33384[3] = method25863(class6779, class6780, class6781, class6782.method1137(), n2, class6783, n3);
                if (class6779.field26623) {
                    final BlockPos method33390 = class6782.method1147();
                    method33384[0] = (method33384[0] && !method25863(class6779, class6780, class6781, method33390.method1143(), n2, class6783, n3));
                    method33384[1] = (method33384[1] && !method25863(class6779, class6780, class6781, method33390.method1141(), n2, class6783, n3));
                    method33384[2] = (method33384[2] && !method25863(class6779, class6780, class6781, method33390.method1139(), n2, class6783, n3));
                    method33384[3] = (method33384[3] && !method25863(class6779, class6780, class6781, method33390.method1137(), n2, class6783, n3));
                }
                if (n == 2) {
                    method25859(0, 1, method33384);
                    method25859(2, 3, method33384);
                    break;
                }
                break;
            }
        }
        int n4 = 0;
        if (method33384[0] & !method33384[1] & !method33384[2] & !method33384[3]) {
            n4 = 3;
        }
        else if (!method33384[0] & method33384[1] & !method33384[2] & !method33384[3]) {
            n4 = 1;
        }
        else if (!method33384[0] & !method33384[1] & method33384[2] & !method33384[3]) {
            n4 = 12;
        }
        else if (!method33384[0] & !method33384[1] & !method33384[2] & method33384[3]) {
            n4 = 36;
        }
        else if (method33384[0] & method33384[1] & !method33384[2] & !method33384[3]) {
            n4 = 2;
        }
        else if (!method33384[0] & !method33384[1] & method33384[2] & method33384[3]) {
            n4 = 24;
        }
        else if (method33384[0] & !method33384[1] & method33384[2] & !method33384[3]) {
            n4 = 15;
        }
        else if (method33384[0] & !method33384[1] & !method33384[2] & method33384[3]) {
            n4 = 39;
        }
        else if (!method33384[0] & method33384[1] & method33384[2] & !method33384[3]) {
            n4 = 13;
        }
        else if (!method33384[0] & method33384[1] & !method33384[2] & method33384[3]) {
            n4 = 37;
        }
        else if (!method33384[0] & method33384[1] & method33384[2] & method33384[3]) {
            n4 = 25;
        }
        else if (method33384[0] & !method33384[1] & method33384[2] & method33384[3]) {
            n4 = 27;
        }
        else if (method33384[0] & method33384[1] & !method33384[2] & method33384[3]) {
            n4 = 38;
        }
        else if (method33384[0] & method33384[1] & method33384[2] & !method33384[3]) {
            n4 = 14;
        }
        else if (method33384[0] & method33384[1] & method33384[2] & method33384[3]) {
            n4 = 26;
        }
        if (n4 == 0) {
            return n4;
        }
        if (!Config.method28952()) {
            return n4;
        }
        switch (n2) {
            case 0: {
                method33384[0] = !method25863(class6779, class6780, class6781, class6782.method1147().method1141(), n2, class6783, n3);
                method33384[1] = !method25863(class6779, class6780, class6781, class6782.method1145().method1141(), n2, class6783, n3);
                method33384[2] = !method25863(class6779, class6780, class6781, class6782.method1147().method1143(), n2, class6783, n3);
                method33384[3] = !method25863(class6779, class6780, class6781, class6782.method1145().method1143(), n2, class6783, n3);
                if (class6779.field26623) {
                    final BlockPos method33391 = class6782.method1139();
                    method33384[0] = (method33384[0] || method25863(class6779, class6780, class6781, method33391.method1147().method1141(), n2, class6783, n3));
                    method33384[1] = (method33384[1] || method25863(class6779, class6780, class6781, method33391.method1145().method1141(), n2, class6783, n3));
                    method33384[2] = (method33384[2] || method25863(class6779, class6780, class6781, method33391.method1147().method1143(), n2, class6783, n3));
                    method33384[3] = (method33384[3] || method25863(class6779, class6780, class6781, method33391.method1145().method1143(), n2, class6783, n3));
                    break;
                }
                break;
            }
            case 1: {
                method33384[0] = !method25863(class6779, class6780, class6781, class6782.method1147().method1143(), n2, class6783, n3);
                method33384[1] = !method25863(class6779, class6780, class6781, class6782.method1145().method1143(), n2, class6783, n3);
                method33384[2] = !method25863(class6779, class6780, class6781, class6782.method1147().method1141(), n2, class6783, n3);
                method33384[3] = !method25863(class6779, class6780, class6781, class6782.method1145().method1141(), n2, class6783, n3);
                if (class6779.field26623) {
                    final BlockPos method33392 = class6782.method1137();
                    method33384[0] = (method33384[0] || method25863(class6779, class6780, class6781, method33392.method1147().method1143(), n2, class6783, n3));
                    method33384[1] = (method33384[1] || method25863(class6779, class6780, class6781, method33392.method1145().method1143(), n2, class6783, n3));
                    method33384[2] = (method33384[2] || method25863(class6779, class6780, class6781, method33392.method1147().method1141(), n2, class6783, n3));
                    method33384[3] = (method33384[3] || method25863(class6779, class6780, class6781, method33392.method1145().method1141(), n2, class6783, n3));
                    break;
                }
                break;
            }
            case 2: {
                method33384[0] = !method25863(class6779, class6780, class6781, class6782.method1145().method1139(), n2, class6783, n3);
                method33384[1] = !method25863(class6779, class6780, class6781, class6782.method1147().method1139(), n2, class6783, n3);
                method33384[2] = !method25863(class6779, class6780, class6781, class6782.method1145().method1137(), n2, class6783, n3);
                method33384[3] = !method25863(class6779, class6780, class6781, class6782.method1147().method1137(), n2, class6783, n3);
                if (class6779.field26623) {
                    final BlockPos method33393 = class6782.method1141();
                    method33384[0] = (method33384[0] || method25863(class6779, class6780, class6781, method33393.method1145().method1139(), n2, class6783, n3));
                    method33384[1] = (method33384[1] || method25863(class6779, class6780, class6781, method33393.method1147().method1139(), n2, class6783, n3));
                    method33384[2] = (method33384[2] || method25863(class6779, class6780, class6781, method33393.method1145().method1137(), n2, class6783, n3));
                    method33384[3] = (method33384[3] || method25863(class6779, class6780, class6781, method33393.method1147().method1137(), n2, class6783, n3));
                }
                if (n == 1) {
                    method25859(0, 3, method33384);
                    method25859(1, 2, method33384);
                    break;
                }
                break;
            }
            case 3: {
                method33384[0] = !method25863(class6779, class6780, class6781, class6782.method1147().method1139(), n2, class6783, n3);
                method33384[1] = !method25863(class6779, class6780, class6781, class6782.method1145().method1139(), n2, class6783, n3);
                method33384[2] = !method25863(class6779, class6780, class6781, class6782.method1147().method1137(), n2, class6783, n3);
                method33384[3] = !method25863(class6779, class6780, class6781, class6782.method1145().method1137(), n2, class6783, n3);
                if (class6779.field26623) {
                    final BlockPos method33394 = class6782.method1143();
                    method33384[0] = (method33384[0] || method25863(class6779, class6780, class6781, method33394.method1147().method1139(), n2, class6783, n3));
                    method33384[1] = (method33384[1] || method25863(class6779, class6780, class6781, method33394.method1145().method1139(), n2, class6783, n3));
                    method33384[2] = (method33384[2] || method25863(class6779, class6780, class6781, method33394.method1147().method1137(), n2, class6783, n3));
                    method33384[3] = (method33384[3] || method25863(class6779, class6780, class6781, method33394.method1145().method1137(), n2, class6783, n3));
                    break;
                }
                break;
            }
            case 4: {
                method33384[0] = !method25863(class6779, class6780, class6781, class6782.method1139().method1143(), n2, class6783, n3);
                method33384[1] = !method25863(class6779, class6780, class6781, class6782.method1139().method1141(), n2, class6783, n3);
                method33384[2] = !method25863(class6779, class6780, class6781, class6782.method1137().method1143(), n2, class6783, n3);
                method33384[3] = !method25863(class6779, class6780, class6781, class6782.method1137().method1141(), n2, class6783, n3);
                if (class6779.field26623) {
                    final BlockPos method33395 = class6782.method1145();
                    method33384[0] = (method33384[0] || method25863(class6779, class6780, class6781, method33395.method1139().method1143(), n2, class6783, n3));
                    method33384[1] = (method33384[1] || method25863(class6779, class6780, class6781, method33395.method1139().method1141(), n2, class6783, n3));
                    method33384[2] = (method33384[2] || method25863(class6779, class6780, class6781, method33395.method1137().method1143(), n2, class6783, n3));
                    method33384[3] = (method33384[3] || method25863(class6779, class6780, class6781, method33395.method1137().method1141(), n2, class6783, n3));
                    break;
                }
                break;
            }
            case 5: {
                method33384[0] = !method25863(class6779, class6780, class6781, class6782.method1139().method1141(), n2, class6783, n3);
                method33384[1] = !method25863(class6779, class6780, class6781, class6782.method1139().method1143(), n2, class6783, n3);
                method33384[2] = !method25863(class6779, class6780, class6781, class6782.method1137().method1141(), n2, class6783, n3);
                method33384[3] = !method25863(class6779, class6780, class6781, class6782.method1137().method1143(), n2, class6783, n3);
                if (class6779.field26623) {
                    final BlockPos method33396 = class6782.method1147();
                    method33384[0] = (method33384[0] || method25863(class6779, class6780, class6781, method33396.method1139().method1141(), n2, class6783, n3));
                    method33384[1] = (method33384[1] || method25863(class6779, class6780, class6781, method33396.method1139().method1143(), n2, class6783, n3));
                    method33384[2] = (method33384[2] || method25863(class6779, class6780, class6781, method33396.method1137().method1141(), n2, class6783, n3));
                    method33384[3] = (method33384[3] || method25863(class6779, class6780, class6781, method33396.method1137().method1143(), n2, class6783, n3));
                }
                if (n == 2) {
                    method25859(0, 3, method33384);
                    method25859(1, 2, method33384);
                    break;
                }
                break;
            }
        }
        if (n4 == 13 && method33384[0]) {
            n4 = 4;
        }
        else if (n4 == 15 && method33384[1]) {
            n4 = 5;
        }
        else if (n4 == 37 && method33384[2]) {
            n4 = 16;
        }
        else if (n4 == 39 && method33384[3]) {
            n4 = 17;
        }
        else if (n4 == 14 && method33384[0] && method33384[1]) {
            n4 = 7;
        }
        else if (n4 == 25 && method33384[0] && method33384[2]) {
            n4 = 6;
        }
        else if (n4 == 27 && method33384[3] && method33384[1]) {
            n4 = 19;
        }
        else if (n4 == 38 && method33384[3] && method33384[2]) {
            n4 = 18;
        }
        else if (n4 == 14 && !method33384[0] && method33384[1]) {
            n4 = 31;
        }
        else if (n4 == 25 && method33384[0] && !method33384[2]) {
            n4 = 30;
        }
        else if (n4 == 27 && !method33384[3] && method33384[1]) {
            n4 = 41;
        }
        else if (n4 == 38 && method33384[3] && !method33384[2]) {
            n4 = 40;
        }
        else if (n4 == 14 && method33384[0] && !method33384[1]) {
            n4 = 29;
        }
        else if (n4 == 25 && !method33384[0] && method33384[2]) {
            n4 = 28;
        }
        else if (n4 == 27 && method33384[3] && !method33384[1]) {
            n4 = 43;
        }
        else if (n4 == 38 && !method33384[3] && method33384[2]) {
            n4 = 42;
        }
        else if (n4 == 26 && method33384[0] && method33384[1] && method33384[2] && method33384[3]) {
            n4 = 46;
        }
        else if (n4 == 26 && !method33384[0] && method33384[1] && method33384[2] && method33384[3]) {
            n4 = 9;
        }
        else if (n4 == 26 && method33384[0] && !method33384[1] && method33384[2] && method33384[3]) {
            n4 = 21;
        }
        else if (n4 == 26 && method33384[0] && method33384[1] && !method33384[2] && method33384[3]) {
            n4 = 8;
        }
        else if (n4 == 26 && method33384[0] && method33384[1] && method33384[2] && !method33384[3]) {
            n4 = 20;
        }
        else if (n4 == 26 && method33384[0] && method33384[1] && !method33384[2] && !method33384[3]) {
            n4 = 11;
        }
        else if (n4 == 26 && !method33384[0] && !method33384[1] && method33384[2] && method33384[3]) {
            n4 = 22;
        }
        else if (n4 == 26 && !method33384[0] && method33384[1] && !method33384[2] && method33384[3]) {
            n4 = 23;
        }
        else if (n4 == 26 && method33384[0] && !method33384[1] && method33384[2] && !method33384[3]) {
            n4 = 10;
        }
        else if (n4 == 26 && method33384[0] && !method33384[1] && !method33384[2] && method33384[3]) {
            n4 = 34;
        }
        else if (n4 == 26 && !method33384[0] && method33384[1] && method33384[2] && !method33384[3]) {
            n4 = 35;
        }
        else if (n4 == 26 && method33384[0] && !method33384[1] && !method33384[2] && !method33384[3]) {
            n4 = 32;
        }
        else if (n4 == 26 && !method33384[0] && method33384[1] && !method33384[2] && !method33384[3]) {
            n4 = 33;
        }
        else if (n4 == 26 && !method33384[0] && !method33384[1] && method33384[2] && !method33384[3]) {
            n4 = 44;
        }
        else if (n4 == 26 && !method33384[0] && !method33384[1] && !method33384[2] && method33384[3]) {
            n4 = 45;
        }
        return n4;
    }
    
    private static void method25859(final int n, final int n2, final boolean[] array) {
        final boolean b = array[n];
        array[n] = array[n2];
        array[n2] = b;
    }
    
    private static boolean method25860(final Class6779 class6779, final IBlockReader class6780, final Class7096 class6781, final BlockPos class6782, final int n, final Class1912 class6783, final int n2) {
        final Class7096 method6701 = class6780.getBlockState(class6782);
        if (!method25861(method6701, class6780, class6782)) {
            return false;
        }
        if (class6779.field26636 != null && !Class7980.method26015(method6701.method21691(), method6701.method21692(), class6779.field26636)) {
            return false;
        }
        if (class6779.field26638 != null && !Config.method28979(method25865(class6780, class6781, class6782, method6701, n), class6779.field26638)) {
            return false;
        }
        final BlockPos method6702 = class6782.method1149(method25841(n));
        final Class7096 method6703 = class6780.getBlockState(method6702);
        return !method6703.method21722(class6780, method6702) && (n != 1 || method6703.method21696() != Class7521.field29329) && !method25864(class6779, class6780, class6781, class6782, method6701, n, class6783, n2);
    }
    
    private static boolean method25861(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098) {
        if (BlockUtils.method20655(class7096, class7097, class7098)) {
            return true;
        }
        final Block method21696 = class7096.method21696();
        return method21696 instanceof Class3851 || method21696 instanceof Class3844;
    }
    
    private static boolean method25862(final Class6779 class6779, final IBlockReader class6780, final Class7096 class6781, final BlockPos class6782, final int n, final Class1912 class6783, final int n2) {
        final Class7096 method6701 = class6780.getBlockState(class6782);
        if (method6701 == Class7970.field32766) {
            return false;
        }
        if (class6779.field26613 != null && !class6779.method20733(method6701.method21691(), method6701.method21692())) {
            return false;
        }
        if (class6779.field26634 != null && method25865(class6780, class6781, class6782, method6701, n) != class6783) {
            return false;
        }
        final BlockPos method6702 = class6782.method1149(method25841(n));
        final Class7096 method6703 = class6780.getBlockState(method6702);
        return !method6703.method21722(class6780, method6702) && (n != 1 || method6703.method21696() != Class7521.field29329);
    }
    
    private static boolean method25863(final Class6779 class6779, final IBlockReader class6780, final Class7096 class6781, final BlockPos class6782, final int n, final Class1912 class6783, final int n2) {
        return method25864(class6779, class6780, class6781, class6782, class6780.getBlockState(class6782), n, class6783, n2);
    }
    
    private static boolean method25864(final Class6779 class6779, final IBlockReader class6780, final Class7096 class6781, final BlockPos class6782, final Class7096 class6783, final int n, final Class1912 class6784, final int n2) {
        if (class6781 == class6783) {
            return true;
        }
        if (class6779.field26618 == 2) {
            return class6783 != null && class6783 != Class7970.field32766 && method25865(class6780, class6781, class6782, class6783, n) == class6784;
        }
        if (class6779.field26618 == 3) {
            return class6783 != null && class6783 != Class7970.field32766 && class6783.method21697() == class6781.method21697();
        }
        return class6779.field26618 == 1 && class6783.method21696() == class6781.method21696();
    }
    
    private static Class1912 method25865(final IBlockReader class1855, final Class7096 class1856, final BlockPos class1857, Class7096 class1858, final int n) {
        final Class6313 method35428 = Minecraft.method5277().method5305().method5787().method35428(class1858);
        if (method35428 == null) {
            return null;
        }
        if (Class9570.field41234.method22605()) {
            class1858 = (Class7096)Class9570.method35826(class1858.method21696(), Class9570.field41234, class1858, class1855, class1857);
        }
        final Direction method35429 = method25841(n);
        List<Class8754> list = method35428.method18691(class1858, method35429, Class7970.field32786);
        if (list == null) {
            return null;
        }
        if (Config.method28910()) {
            list = Class6110.method18260(class1855, class1858, class1857, method35429, list);
        }
        if (list.size() > 0) {
            return list.get(0).method30295();
        }
        final List<Class8754> method35430 = method35428.method18691(class1858, null, Class7970.field32786);
        if (method35430 == null) {
            return null;
        }
        for (int i = 0; i < method35430.size(); ++i) {
            final Class8754 class1859 = method35430.get(i);
            if (class1859.method30294() == method35429) {
                return class1859.method30295();
            }
        }
        return null;
    }
    
    private static Class1912 method25866(final Class6779 class6779, final IBlockReader class6780, final Class7096 class6781, final BlockPos class6782, final int n, final int n2, final Class1912 class6783, final int n3) {
        boolean b = false;
        boolean b2 = false;
        Label_0859: {
            switch (n) {
                case 0: {
                    switch (n2) {
                        case 0: {
                            b = method25863(class6779, class6780, class6781, class6782.method1145(), n2, class6783, n3);
                            b2 = method25863(class6779, class6780, class6781, class6782.method1147(), n2, class6783, n3);
                            break;
                        }
                        case 1: {
                            b = method25863(class6779, class6780, class6781, class6782.method1145(), n2, class6783, n3);
                            b2 = method25863(class6779, class6780, class6781, class6782.method1147(), n2, class6783, n3);
                            break;
                        }
                        case 2: {
                            b = method25863(class6779, class6780, class6781, class6782.method1147(), n2, class6783, n3);
                            b2 = method25863(class6779, class6780, class6781, class6782.method1145(), n2, class6783, n3);
                            break;
                        }
                        case 3: {
                            b = method25863(class6779, class6780, class6781, class6782.method1145(), n2, class6783, n3);
                            b2 = method25863(class6779, class6780, class6781, class6782.method1147(), n2, class6783, n3);
                            break;
                        }
                        case 4: {
                            b = method25863(class6779, class6780, class6781, class6782.method1141(), n2, class6783, n3);
                            b2 = method25863(class6779, class6780, class6781, class6782.method1143(), n2, class6783, n3);
                            break;
                        }
                        case 5: {
                            b = method25863(class6779, class6780, class6781, class6782.method1143(), n2, class6783, n3);
                            b2 = method25863(class6779, class6780, class6781, class6782.method1141(), n2, class6783, n3);
                            break;
                        }
                    }
                    break;
                }
                case 1: {
                    switch (n2) {
                        case 0: {
                            b = method25863(class6779, class6780, class6781, class6782.method1147(), n2, class6783, n3);
                            b2 = method25863(class6779, class6780, class6781, class6782.method1145(), n2, class6783, n3);
                            break;
                        }
                        case 1: {
                            b = method25863(class6779, class6780, class6781, class6782.method1145(), n2, class6783, n3);
                            b2 = method25863(class6779, class6780, class6781, class6782.method1147(), n2, class6783, n3);
                            break;
                        }
                        case 2: {
                            b = method25863(class6779, class6780, class6781, class6782.method1145(), n2, class6783, n3);
                            b2 = method25863(class6779, class6780, class6781, class6782.method1147(), n2, class6783, n3);
                            break;
                        }
                        case 3: {
                            b = method25863(class6779, class6780, class6781, class6782.method1145(), n2, class6783, n3);
                            b2 = method25863(class6779, class6780, class6781, class6782.method1147(), n2, class6783, n3);
                            break;
                        }
                        case 4: {
                            b = method25863(class6779, class6780, class6781, class6782.method1139(), n2, class6783, n3);
                            b2 = method25863(class6779, class6780, class6781, class6782.method1137(), n2, class6783, n3);
                            break;
                        }
                        case 5: {
                            b = method25863(class6779, class6780, class6781, class6782.method1137(), n2, class6783, n3);
                            b2 = method25863(class6779, class6780, class6781, class6782.method1139(), n2, class6783, n3);
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    switch (n2) {
                        case 0: {
                            b = method25863(class6779, class6780, class6781, class6782.method1143(), n2, class6783, n3);
                            b2 = method25863(class6779, class6780, class6781, class6782.method1141(), n2, class6783, n3);
                            break Label_0859;
                        }
                        case 1: {
                            b = method25863(class6779, class6780, class6781, class6782.method1141(), n2, class6783, n3);
                            b2 = method25863(class6779, class6780, class6781, class6782.method1143(), n2, class6783, n3);
                            break Label_0859;
                        }
                        case 2: {
                            b = method25863(class6779, class6780, class6781, class6782.method1139(), n2, class6783, n3);
                            b2 = method25863(class6779, class6780, class6781, class6782.method1137(), n2, class6783, n3);
                            break Label_0859;
                        }
                        case 3: {
                            b = method25863(class6779, class6780, class6781, class6782.method1137(), n2, class6783, n3);
                            b2 = method25863(class6779, class6780, class6781, class6782.method1139(), n2, class6783, n3);
                            break Label_0859;
                        }
                        case 4: {
                            b = method25863(class6779, class6780, class6781, class6782.method1141(), n2, class6783, n3);
                            b2 = method25863(class6779, class6780, class6781, class6782.method1143(), n2, class6783, n3);
                            break Label_0859;
                        }
                        case 5: {
                            b = method25863(class6779, class6780, class6781, class6782.method1141(), n2, class6783, n3);
                            b2 = method25863(class6779, class6780, class6781, class6782.method1143(), n2, class6783, n3);
                            break Label_0859;
                        }
                    }
                    break;
                }
            }
        }
        int n4;
        if (b) {
            if (b2) {
                n4 = 1;
            }
            else {
                n4 = 2;
            }
        }
        else if (b2) {
            n4 = 0;
        }
        else {
            n4 = 3;
        }
        return class6779.field26635[n4];
    }
    
    private static Class1912 method25867(final Class6779 class6779, final IBlockReader class6780, final Class7096 class6781, final BlockPos class6782, final int n, final int n2, final Class1912 class6783, final int n3) {
        boolean b = false;
        boolean b2 = false;
        switch (n) {
            case 0: {
                if (n2 == 1) {
                    b = method25863(class6779, class6780, class6781, class6782.method1143(), n2, class6783, n3);
                    b2 = method25863(class6779, class6780, class6781, class6782.method1141(), n2, class6783, n3);
                    break;
                }
                if (n2 == 0) {
                    b = method25863(class6779, class6780, class6781, class6782.method1141(), n2, class6783, n3);
                    b2 = method25863(class6779, class6780, class6781, class6782.method1143(), n2, class6783, n3);
                    break;
                }
                b = method25863(class6779, class6780, class6781, class6782.method1139(), n2, class6783, n3);
                b2 = method25863(class6779, class6780, class6781, class6782.method1137(), n2, class6783, n3);
                break;
            }
            case 1: {
                if (n2 == 3) {
                    b = method25863(class6779, class6780, class6781, class6782.method1139(), n2, class6783, n3);
                    b2 = method25863(class6779, class6780, class6781, class6782.method1137(), n2, class6783, n3);
                    break;
                }
                if (n2 == 2) {
                    b = method25863(class6779, class6780, class6781, class6782.method1137(), n2, class6783, n3);
                    b2 = method25863(class6779, class6780, class6781, class6782.method1139(), n2, class6783, n3);
                    break;
                }
                b = method25863(class6779, class6780, class6781, class6782.method1143(), n2, class6783, n3);
                b2 = method25863(class6779, class6780, class6781, class6782.method1141(), n2, class6783, n3);
                break;
            }
            case 2: {
                if (n2 == 5) {
                    b = method25863(class6779, class6780, class6781, class6782.method1137(), n2, class6783, n3);
                    b2 = method25863(class6779, class6780, class6781, class6782.method1139(), n2, class6783, n3);
                    break;
                }
                if (n2 == 4) {
                    b = method25863(class6779, class6780, class6781, class6782.method1139(), n2, class6783, n3);
                    b2 = method25863(class6779, class6780, class6781, class6782.method1137(), n2, class6783, n3);
                    break;
                }
                b = method25863(class6779, class6780, class6781, class6782.method1145(), n2, class6783, n3);
                b2 = method25863(class6779, class6780, class6781, class6782.method1147(), n2, class6783, n3);
                break;
            }
        }
        int n4;
        if (b) {
            if (b2) {
                n4 = 1;
            }
            else {
                n4 = 2;
            }
        }
        else if (b2) {
            n4 = 0;
        }
        else {
            n4 = 3;
        }
        return class6779.field26635[n4];
    }
    
    private static Class1912 method25868(final Class6779 class6779, final IBlockReader class6780, final Class7096 class6781, final BlockPos class6782, final int n, final int n2, final Class1912 class6783, final int n3) {
        final Class1912[] field26635 = class6779.field26635;
        final Class1912 method25866 = method25866(class6779, class6780, class6781, class6782, n, n2, class6783, n3);
        if (method25866 != null && method25866 != class6783 && method25866 != field26635[3]) {
            return method25866;
        }
        final Class1912 method25867 = method25867(class6779, class6780, class6781, class6782, n, n2, class6783, n3);
        if (method25867 == field26635[0]) {
            return field26635[4];
        }
        if (method25867 == field26635[1]) {
            return field26635[5];
        }
        return (method25867 == field26635[2]) ? field26635[6] : method25867;
    }
    
    private static Class1912 method25869(final Class6779 class6779, final IBlockReader class6780, final Class7096 class6781, final BlockPos class6782, final int n, final int n2, final Class1912 class6783, final int n3) {
        final Class1912[] field26635 = class6779.field26635;
        final Class1912 method25867 = method25867(class6779, class6780, class6781, class6782, n, n2, class6783, n3);
        if (method25867 != null && method25867 != class6783 && method25867 != field26635[3]) {
            return method25867;
        }
        final Class1912 method25868 = method25866(class6779, class6780, class6781, class6782, n, n2, class6783, n3);
        if (method25868 == field26635[0]) {
            return field26635[4];
        }
        if (method25868 == field26635[1]) {
            return field26635[5];
        }
        return (method25868 == field26635[2]) ? field26635[6] : method25868;
    }
    
    private static Class1912 method25870(final Class6779 class6779, final IBlockReader class6780, final Class7096 class6781, final BlockPos class6782, final int n, final int n2, final Class1912 class6783, final int n3) {
        boolean b = false;
        switch (n) {
            case 0: {
                if (n2 == 1 || n2 == 0) {
                    return null;
                }
                b = method25863(class6779, class6780, class6781, class6782.method1137(), n2, class6783, n3);
                break;
            }
            case 1: {
                if (n2 == 3 || n2 == 2) {
                    return null;
                }
                b = method25863(class6779, class6780, class6781, class6782.method1143(), n2, class6783, n3);
                break;
            }
            case 2: {
                if (n2 == 5 || n2 == 4) {
                    return null;
                }
                b = method25863(class6779, class6780, class6781, class6782.method1147(), n2, class6783, n3);
                break;
            }
        }
        return b ? class6779.field26635[0] : null;
    }
    
    public static void method25871(final Class1774 class1774) {
        Class7970.field32753 = null;
        Class7970.field32754 = null;
        Class7970.field32750 = null;
        Class7970.field32752 = null;
        if (Config.method28949()) {
            final Class1727[] method28903 = Config.method28903();
            for (int i = method28903.length - 1; i >= 0; --i) {
                method25872(class1774, method28903[i]);
            }
            method25872(class1774, Config.method28905());
            Class7970.field32767 = class1774.method6359(Class7970.field32768);
            Class7970.field32750 = new Map[class1774.method6349() + 1];
            Class7970.field32751 = new Map[class1774.method6349() + 1];
            Class7970.field32752 = new Map[class1774.method6349() + 1][];
            if (Class7970.field32753.length <= 0) {
                Class7970.field32753 = null;
            }
            if (Class7970.field32754.length <= 0) {
                Class7970.field32754 = null;
            }
        }
    }
    
    public static void method25872(final Class1774 class1774, final Class1727 class1775) {
        final String[] method32777 = Class9084.method32777(class1775, "optifine/ctm/", ".properties", method25882());
        Arrays.sort(method32777);
        final List method32778 = method25876(Class7970.field32754);
        final List method32779 = method25876(Class7970.field32753);
        for (int i = 0; i < method32777.length; ++i) {
            final String str = method32777[i];
            Config.method28847("ConnectedTextures: " + str);
            try {
                final InputStream method32780 = class1775.method6097(Class346.field2137, new ResourceLocation(str));
                if (method32780 == null) {
                    Config.warn("ConnectedTextures file not found: " + str);
                }
                else {
                    final Class27 class1776 = new Class27();
                    class1776.load(method32780);
                    final Class6779 class1777 = new Class6779(class1776, str);
                    if (class1777.method20706(str)) {
                        class1777.method20727(class1774);
                        method25879(class1777, method32778);
                        method25880(class1777, method32779);
                    }
                }
            }
            catch (final FileNotFoundException ex) {
                Config.warn("ConnectedTextures file not found: " + str);
            }
            catch (final Exception ex2) {
                ex2.printStackTrace();
            }
        }
        Class7970.field32753 = method25878(method32779);
        Class7970.field32754 = method25878(method32778);
        Class7970.field32755 = method25877();
        Config.method28847("Multipass connected textures: " + Class7970.field32755);
    }
    
    public static void method25873(final Class1774 class1774) {
        method25875(Class7970.field32753, class1774);
        method25875(Class7970.field32754, class1774);
        Class7970.field32767 = method25874(class1774, Class7970.field32768);
    }
    
    private static Class1912 method25874(final Class1774 class1774, final ResourceLocation obj) {
        final Class1912 method6338 = class1774.method6338(obj);
        if (method6338 == null || method6338 instanceof Class1913) {
            Config.warn("Missing CTM sprite: " + obj);
        }
        return method6338;
    }
    
    private static void method25875(final Class6779[][] array, final Class1774 class1774) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                final Class6779[] array2 = array[i];
                if (array2 != null) {
                    for (int j = 0; j < array2.length; ++j) {
                        final Class6779 class1775 = array2[j];
                        if (class1775 != null) {
                            class1775.method20728(class1774);
                        }
                    }
                }
            }
        }
    }
    
    private static List method25876(final Class6779[][] array) {
        final ArrayList list = new ArrayList();
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                final Class6779[] a = array[i];
                Object o = null;
                if (a != null) {
                    o = new ArrayList(Arrays.asList(a));
                }
                list.add(o);
            }
        }
        return list;
    }
    
    private static boolean method25877() {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < Class7970.field32754.length; ++i) {
            final Class6779[] a = Class7970.field32754[i];
            if (a != null) {
                list.addAll(Arrays.asList(a));
            }
        }
        for (int j = 0; j < Class7970.field32753.length; ++j) {
            final Class6779[] a2 = Class7970.field32753[j];
            if (a2 != null) {
                list.addAll(Arrays.asList(a2));
            }
        }
        final Class6779[] array = (Class6779[])list.toArray(new Class6779[list.size()]);
        final HashSet set = new HashSet();
        final HashSet set2 = new HashSet();
        for (int k = 0; k < array.length; ++k) {
            final Class6779 class6779 = array[k];
            if (class6779.field26634 != null) {
                set.addAll(Arrays.asList(class6779.field26634));
            }
            if (class6779.field26635 != null) {
                set2.addAll(Arrays.asList(class6779.field26635));
            }
        }
        set.retainAll(set2);
        return !set.isEmpty();
    }
    
    private static Class6779[][] method25878(final List list) {
        final Class6779[][] array = new Class6779[list.size()][];
        for (int i = 0; i < list.size(); ++i) {
            final List list2 = list.get(i);
            if (list2 != null) {
                array[i] = (Class6779[])list2.toArray(new Class6779[list2.size()]);
            }
        }
        return array;
    }
    
    private static void method25879(final Class6779 class6779, final List list) {
        if (class6779.field26634 != null) {
            for (int i = 0; i < class6779.field26634.length; ++i) {
                final Class1912 obj = class6779.field26634[i];
                if (!(obj instanceof Class1912)) {
                    Config.warn("TextureAtlasSprite is not TextureAtlasSprite: " + obj + ", name: " + obj.method7503());
                }
                else {
                    final int method7513 = obj.method7513();
                    if (method7513 < 0) {
                        Config.warn("Invalid tile ID: " + method7513 + ", icon: " + obj.method7503());
                    }
                    else {
                        method25881(class6779, list, method7513);
                    }
                }
            }
        }
    }
    
    private static void method25880(final Class6779 class6779, final List list) {
        if (class6779.field26613 != null) {
            for (int i = 0; i < class6779.field26613.length; ++i) {
                final int method30709 = class6779.field26613[i].method30709();
                if (method30709 < 0) {
                    Config.warn("Invalid block ID: " + method30709);
                }
                else {
                    method25881(class6779, list, method30709);
                }
            }
        }
    }
    
    private static void method25881(final Class6779 class6779, final List list, final int i) {
        while (i >= list.size()) {
            list.add(null);
        }
        List list2 = list.get(i);
        if (list2 == null) {
            list2 = new ArrayList();
            list.set(i, list2);
        }
        list2.add(class6779);
    }
    
    private static String[] method25882() {
        final ArrayList list = new ArrayList();
        method25883(list, "textures/block/glass.png", "20_glass/glass.properties");
        method25883(list, "textures/block/glass.png", "20_glass/glass_pane.properties");
        method25883(list, "textures/block/bookshelf.png", "30_bookshelf/bookshelf.properties");
        method25883(list, "textures/block/sandstone.png", "40_sandstone/sandstone.properties");
        method25883(list, "textures/block/red_sandstone.png", "41_red_sandstone/red_sandstone.properties");
        final String[] array = { "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black" };
        for (int i = 0; i < array.length; ++i) {
            final String s = array[i];
            final String method35513 = Class9518.method35513("" + i, 2, '0');
            method25883(list, "textures/block/" + s + "_stained_glass.png", method35513 + "_glass_" + s + "/glass_" + s + ".properties");
            method25883(list, "textures/block/" + s + "_stained_glass.png", method35513 + "_glass_" + s + "/glass_pane_" + s + ".properties");
        }
        return (String[])list.toArray(new String[list.size()]);
    }
    
    private static void method25883(final List list, final String s, final String s2) {
        final String s3 = "optifine/ctm/default/";
        final Class1727 method28907 = Config.method28907(new ResourceLocation(s));
        if (method28907 != null) {
            if (method28907.method6102().equals("Programmer Art")) {
                list.add(s3 + "programmer_art/" + s2);
            }
            else if (method28907 == Config.method28905()) {
                list.add(s3 + s2);
            }
        }
    }
    
    static {
        Class7970.field32750 = null;
        Class7970.field32751 = null;
        Class7970.field32752 = null;
        Class7970.field32753 = null;
        Class7970.field32754 = null;
        Class7970.field32755 = false;
        field32766 = Class7521.field29147.getDefaultState();
        Class7970.field32767 = null;
        Class7970.field32768 = new ResourceLocation("optifine/ctm/default/empty");
        field32769 = new Class2192[] { Class2192.field13334, Class2192.field13335, Class2192.field13332, Class2192.field13333 };
        field32770 = new Class2192[] { Class2192.field13334, Class2192.field13335, Class2192.field13333, Class2192.field13332 };
        field32771 = new Class2192[] { Class2192.field13335, Class2192.field13334, Class2192.field13330, Class2192.field13331 };
        field32772 = new Class2192[] { Class2192.field13334, Class2192.field13335, Class2192.field13330, Class2192.field13331 };
        field32773 = new Class2192[] { Class2192.field13332, Class2192.field13333, Class2192.field13330, Class2192.field13331 };
        field32774 = new Class2192[] { Class2192.field13333, Class2192.field13332, Class2192.field13330, Class2192.field13331 };
        field32775 = new Class2192[] { Class2192.field13334, Class2192.field13335, Class2192.field13331, Class2192.field13330 };
        field32776 = new Class2192[] { Class2192.field13332, Class2192.field13333, Class2192.field13331, Class2192.field13330 };
        field32777 = new Class2192[] { Class2192.field13337, Class2192.field13336, Class2192.field13339, Class2192.field13338 };
        field32778 = new Class2192[] { Class2192.field13339, Class2192.field13338, Class2192.field13337, Class2192.field13336 };
        field32779 = new Class2192[] { Class2192.field13344, Class2192.field13345, Class2192.field13346, Class2192.field13347 };
        field32780 = new Class2192[] { Class2192.field13345, Class2192.field13344, Class2192.field13347, Class2192.field13346 };
        field32781 = new Class2192[] { Class2192.field13341, Class2192.field13340, Class2192.field13343, Class2192.field13342 };
        field32782 = new Class2192[] { Class2192.field13340, Class2192.field13341, Class2192.field13342, Class2192.field13343 };
        field32783 = new Class2192[] { Class2192.field13347, Class2192.field13346, Class2192.field13345, Class2192.field13344 };
        field32784 = new Class2192[] { Class2192.field13343, Class2192.field13342, Class2192.field13341, Class2192.field13340 };
        field32785 = new Class1912(new ResourceLocation("default"));
        field32786 = new Random(0L);
    }
}
